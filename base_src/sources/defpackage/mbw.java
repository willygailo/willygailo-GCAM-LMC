package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mbw implements mch {
    public final ljf a;
    public final lis b;
    private final mip c;

    public mbw(mip mipVar, ljf ljfVar, lis lisVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = mipVar;
        this.a = ljfVar;
        this.b = lisVar.a("MediaFS-P");
    }

    @Override // defpackage.mch
    public final mce a(mcn mcnVar, mcc mccVar) {
        return new mcp(this.c, mcs.l(mcnVar, mccVar, this.b), this.b, null, null, null);
    }

    @Override // defpackage.mch
    public final mcg b(mcc mccVar) {
        return new mbv(this, mccVar);
    }
}
