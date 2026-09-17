package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class mke implements mkd {
    private final mkv a;
    private final mkq b;

    public mke(mkv mkvVar, mkq mkqVar) {
        this.a = mkvVar;
        this.b = mkqVar;
    }

    @Override // defpackage.mkd
    public final synchronized mkc a(int i, MediaFormat mediaFormat) {
        mku mkuVar;
        mkv mkvVar = this.a;
        mkuVar = new mku(mkvVar, mediaFormat, i);
        mkvVar.a.add(mkuVar);
        Collections.sort(mkvVar.a, mvm.b);
        return mkuVar;
    }

    @Override // defpackage.mkd
    public final synchronized void b(String str, Object obj) {
        this.b.a(str, obj);
    }

    @Override // defpackage.mkd
    public final synchronized void c(float f) {
        this.b.b(f);
    }

    @Override // defpackage.mkd, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.mkd
    public final synchronized void d(float f, float f2) {
        this.b.c(f, f2);
    }

    @Override // defpackage.mkd
    public final synchronized void e(int i) {
        this.b.a = i;
    }

    @Override // defpackage.mkd
    public final synchronized void f(mkc mkcVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        obr.aQ(mkcVar instanceof mku);
        mku mkuVar = (mku) mkcVar;
        if ((bufferInfo.flags & 1) > 0) {
            mkuVar.g = true;
        }
        if ((mkuVar.g || !mip.aq(mkuVar.a)) && bufferInfo.size != 0) {
            mkuVar.f.addLast(Pair.create(bufferInfo, byteBuffer));
            mkv mkvVar = mkuVar.h;
            for (mku mkuVar2 : mkvVar.a) {
                if (mkuVar2.f.size() > 2 && ((MediaCodec.BufferInfo) ((Pair) mkuVar2.f.peekLast()).first).presentationTimeUs - ((MediaCodec.BufferInfo) ((Pair) mkuVar2.f.peekFirst()).first).presentationTimeUs > 1000000) {
                    mkvVar.a(mkuVar2);
                }
            }
        }
    }
}
