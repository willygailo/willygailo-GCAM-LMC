package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class frl implements mln {
    private final mln c;
    private final int d;
    private final List e = new ArrayList();
    public final pih a = pih.f();
    public final pih b = pih.f();
    private boolean f = false;
    private int g = 0;

    public frl(mln mlnVar, int i) {
        this.c = mlnVar;
        this.d = i;
    }

    @Override // defpackage.mln
    public final synchronized void a(final pht phtVar) {
        this.a.e(phtVar);
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "application/motionphoto-highres");
        final pih pihVarF = pih.f();
        phtVar.d(new Runnable() { // from class: frk
            @Override // java.lang.Runnable
            public final void run() {
                pht phtVar2 = phtVar;
                pih pihVar = pihVarF;
                MediaFormat mediaFormat2 = mediaFormat;
                if (phtVar2.isCancelled()) {
                    pihVar.cancel(false);
                } else {
                    pihVar.o(mediaFormat2);
                }
            }
        }, pgr.INSTANCE);
        this.c.a(pihVarF);
    }

    @Override // defpackage.msx
    public final synchronized void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            this.e.add(Integer.valueOf(this.g));
        }
        this.g++;
        this.c.b(byteBuffer, bufferInfo);
    }

    public final synchronized void c() {
        if (this.b.isDone()) {
            return;
        }
        if (this.a.isCancelled()) {
            this.b.o(oih.a);
        } else if (this.f) {
            if (this.g == 0) {
                this.b.o(oih.a);
                return;
            }
            if (this.a.isDone()) {
                try {
                    MediaFormat mediaFormat = (MediaFormat) plk.ad(this.a);
                    pih pihVar = this.b;
                    poy poyVarM = pst.i.m();
                    int integer = mediaFormat.getInteger("width");
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pst pstVar = (pst) poyVarM.b;
                    pstVar.a |= 1;
                    pstVar.b = integer;
                    int integer2 = mediaFormat.getInteger("height");
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pst pstVar2 = (pst) poyVarM.b;
                    pstVar2.a |= 2;
                    pstVar2.c = integer2;
                    String string = mediaFormat.getString("mime");
                    string.getClass();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pst pstVar3 = (pst) poyVarM.b;
                    pstVar3.a |= 32;
                    pstVar3.g = string;
                    List list = this.e;
                    ppk ppkVar = pstVar3.h;
                    if (!ppkVar.c()) {
                        pstVar3.h = ppd.x(ppkVar);
                    }
                    pnl.e(list, pstVar3.h);
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.getClass();
                    poc pocVarS = poc.s(byteBuffer);
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pst pstVar4 = (pst) poyVarM.b;
                    pstVar4.a |= 8;
                    pstVar4.e = pocVarS;
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.getClass();
                    poc pocVarS2 = poc.s(byteBuffer2);
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pst pstVar5 = (pst) poyVarM.b;
                    int i = pstVar5.a | 16;
                    pstVar5.a = i;
                    pstVar5.f = pocVarS2;
                    int i2 = this.d;
                    pstVar5.a = i | 4;
                    pstVar5.d = i2;
                    pihVar.o(ojc.i((pst) poyVarM.j()));
                } catch (ExecutionException e) {
                    throw new IllegalStateException("Format should be done by now", e);
                }
            }
        }
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
        this.f = true;
        c();
    }
}
