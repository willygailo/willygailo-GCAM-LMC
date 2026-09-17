package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.io.ByteStreams;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureFrame;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class pmv implements pmw {
    public List a = new ArrayList();
    public final AtomicBoolean b;
    public final Queue c;
    private Graph d;
    private AndroidPacketCreator e;
    private String f;
    private String g;

    public pmv(Context context, long j) {
        new ArrayList();
        this.b = new AtomicBoolean(false);
        this.c = new ArrayDeque();
        try {
            this.d = new Graph();
            if (new File("gca_postprocessing.binarypb").isAbsolute()) {
                this.d.h();
            } else {
                Graph graph = this.d;
                try {
                    InputStream inputStreamOpen = context.getAssets().open("gca_postprocessing.binarypb");
                    byte[] byteArray = ByteStreams.toByteArray(inputStreamOpen);
                    inputStreamOpen.close();
                    graph.d(byteArray);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            this.e = new AndroidPacketCreator(this.d);
            this.f = "input_video";
            this.g = "output_video";
            this.d.e(j);
            String str = this.g;
            if (str != null) {
                this.d.c(str, new pmu(this));
                this.d.g(this.g);
            }
        } catch (MediaPipeException e2) {
            Log.e("FrameProcessor", "MediaPipe error: ", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    @Override // defpackage.pmw
    public final void a(TextureFrame textureFrame) throws Throwable {
        long timestamp = textureFrame.getTimestamp();
        Packet packet = null;
        try {
            long timestamp2 = textureFrame.getTimestamp();
            if (!this.b.getAndSet(true)) {
                b();
            }
            synchronized (this) {
                if (this.c.size() >= 2) {
                    String.format("%d frames already in flight and max is %d; dropping new frame ts %d", Integer.valueOf(this.c.size()), 2, Long.valueOf(timestamp2));
                    if (textureFrame != null) {
                        textureFrame.release();
                        return;
                    }
                    return;
                }
                this.c.add(Long.valueOf(timestamp2));
                AndroidPacketCreator androidPacketCreator = this.e;
                Packet packetCreate = Packet.create(androidPacketCreator.nativeCreateGpuBuffer(androidPacketCreator.a.a(), textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame));
                try {
                    try {
                        this.d.b(this.f, packetCreate, timestamp);
                    } catch (MediaPipeException e) {
                        Log.e("FrameProcessor", "Mediapipe error: ", e);
                        packet = packetCreate;
                    }
                    if (packet != null) {
                        packet.release();
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    packet = packetCreate;
                    textureFrame = null;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (packet != null) {
                            packet.release();
                        }
                        if (textureFrame != null) {
                            textureFrame.release();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    packet = packetCreate;
                    textureFrame = null;
                    if (packet != null) {
                        packet.release();
                    }
                    if (textureFrame != null) {
                        textureFrame.release();
                    }
                    throw th;
                }
            }
        } catch (RuntimeException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void b() {
        this.d.f();
    }
}
