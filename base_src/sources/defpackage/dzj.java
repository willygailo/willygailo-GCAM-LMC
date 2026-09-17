package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class dzj implements ebs {
    final /* synthetic */ gog a;
    final /* synthetic */ dzr b;

    public dzj(dzr dzrVar, gog gogVar) {
        this.b = dzrVar;
        this.a = gogVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // defpackage.ebs
    public final void a(ece eceVar) {
        byte[] bArr;
        this.b.i.e("JpegCallback");
        ecg ecgVar = this.b.a;
        gog gogVar = this.a;
        lap lapVar = gogVar.a.f;
        int i = eceVar.b;
        int i2 = eceVar.c;
        ByteBuffer byteBufferDuplicate = eceVar.a.duplicate();
        if (byteBufferDuplicate.hasArray() && byteBufferDuplicate.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferDuplicate.array();
            if (bArrArray.length == byteBufferDuplicate.limit()) {
                bArr = bArrArray;
            } else {
                ByteBuffer byteBufferDuplicate2 = byteBufferDuplicate.duplicate();
                byte[] bArr2 = new byte[byteBufferDuplicate.limit()];
                byteBufferDuplicate2.get(bArr2);
                bArr = bArr2;
            }
        } else {
            ByteBuffer byteBufferDuplicate3 = byteBufferDuplicate.duplicate();
            byte[] bArr3 = new byte[byteBufferDuplicate.limit()];
            byteBufferDuplicate3.get(bArr3);
            bArr = bArr3;
        }
        ecgVar.a(gogVar, lapVar, i, i2, bArr, oih.a);
        this.b.i.f();
    }
}
