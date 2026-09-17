package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class hjd extends hjh {
    @Override // defpackage.hjh
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ByteBuffer.allocateDirect(((Integer) obj).intValue());
    }

    @Override // defpackage.hjh
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return byteBuffer;
    }
}
