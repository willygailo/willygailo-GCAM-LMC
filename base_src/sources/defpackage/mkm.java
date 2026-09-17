package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class mkm implements mah {
    private final mkd a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final List c = new ArrayList();

    public mkm(FileOutputStream fileOutputStream, mkg mkgVar) {
        try {
            this.a = mip.ar(fileOutputStream, mkgVar);
        } catch (Exception e) {
            Log.e("GcaMediaMuxer", "Error creating the GCA muxer", e);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                Log.e("GcaMediaMuxer", "... and close also threw", e2);
            }
            throw new mkn(e);
        }
    }

    @Override // defpackage.mah
    public final int a(MediaFormat mediaFormat) {
        List list = this.c;
        list.add(this.a.a(list.size(), mediaFormat));
        ojc ojcVarAo = mip.ao(mediaFormat);
        if (ojcVarAo.g()) {
            this.a.c(((Float) ojcVarAo.c()).floatValue());
        }
        return this.c.size() - 1;
    }

    @Override // defpackage.mah
    public final void b(String str, Object obj) {
        this.a.b(str, obj);
    }

    @Override // defpackage.mah
    public final void c() {
        j();
    }

    @Override // defpackage.mah
    public final void d(float f, float f2) {
        this.a.d(f, f2);
    }

    @Override // defpackage.mah
    public final void e(int i) {
        this.a.e(i);
    }

    @Override // defpackage.mah
    public final void f() {
    }

    @Override // defpackage.mah
    public final void g() {
        j();
    }

    @Override // defpackage.mah
    public final void h(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBufferAllocateDirect.put(byteBuffer);
        try {
            this.a.f((mkc) this.c.get(i), byteBufferAllocateDirect, bufferInfo);
        } catch (IOException e) {
            throw new mkn(e);
        }
    }

    @Override // defpackage.mah
    public final boolean i() {
        return true;
    }

    public final void j() {
        try {
            if (this.b.getAndSet(true)) {
                return;
            }
            this.a.close();
        } catch (IOException e) {
            throw new mkn(e);
        }
    }
}
