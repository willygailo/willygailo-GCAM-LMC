package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class eks {
    private static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/video/MultiTrackMuxer");
    private final MediaMuxer b;
    private final int c;
    private final CountDownLatch d = new CountDownLatch(1);
    private int e = 0;

    public eks(String str, int i) {
        this.c = i;
        try {
            this.b = new MediaMuxer(str, 0);
        } catch (IOException e) {
            throw new RuntimeException("MediaMuxer creation failed", e);
        }
    }

    public final synchronized int a(MediaFormat mediaFormat) {
        if (d()) {
            ((oug) ((oug) a.b()).G(1240)).p("addTrack called after muxer was started with %d tracks", this.e);
            return -1;
        }
        int iAddTrack = this.b.addTrack(mediaFormat);
        int i = this.e + 1;
        this.e = i;
        if (i == this.c) {
            this.b.start();
            this.d.countDown();
        }
        return iAddTrack;
    }

    public final synchronized void b() {
        if (this.e <= 0) {
            ((oug) ((oug) a.b()).G((char) 1244)).o("stopTrack called but no tracks were added!");
            return;
        }
        if (d()) {
            int i = this.e - 1;
            this.e = i;
            if (i <= 0) {
                try {
                    this.b.stop();
                } catch (IllegalStateException e) {
                    ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1242)).r("%s", e.getMessage());
                }
                try {
                    this.b.release();
                } catch (IllegalStateException e2) {
                    ((oug) ((oug) ((oug) a.b()).h(e2)).G((char) 1241)).r("%s", e2.getMessage());
                }
            }
        } else {
            ((oug) ((oug) a.b()).G((char) 1243)).o("stopTrack called but the muxer is not started!");
        }
    }

    public final void c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.d.await();
            try {
                this.b.writeSampleData(i, byteBuffer, bufferInfo);
            } catch (IllegalArgumentException e) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1245)).r("%s", e.getMessage());
            }
        } catch (InterruptedException e2) {
            ((oug) ((oug) a.b()).G((char) 1246)).o("writeSampleData called but muxer was not started!");
        }
    }

    public final boolean d() {
        return this.d.getCount() == 0;
    }
}
