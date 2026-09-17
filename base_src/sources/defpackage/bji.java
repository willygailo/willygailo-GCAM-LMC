package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bji implements bjg {
    public static final bji a = new bji(0);
    private final /* synthetic */ int b;

    public bji(int i) {
        this.b = i;
    }

    @Override // defpackage.bjg
    public final bcl a(bcl bclVar, azt aztVar) {
        byte[] bArrArray;
        switch (this.b) {
            case 0:
                return bclVar;
            default:
                ByteBuffer byteBufferB = ((bis) bclVar.c()).b();
                int i = blr.a;
                blq blqVar = null;
                if (!byteBufferB.isReadOnly() && byteBufferB.hasArray()) {
                    blqVar = new blq(byteBufferB.array(), byteBufferB.arrayOffset(), byteBufferB.limit());
                }
                if (blqVar != null && blqVar.a == 0 && blqVar.b == blqVar.c.length) {
                    bArrArray = byteBufferB.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferB.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
                    blr.d(byteBufferAsReadOnlyBuffer);
                    byteBufferAsReadOnlyBuffer.get(bArr);
                    bArrArray = bArr;
                }
                return new bii(bArrArray);
        }
    }
}
