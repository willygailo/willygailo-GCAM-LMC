package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oto implements ojz {
    final /* synthetic */ otp a;

    public oto(otp otpVar) {
        this.a = otpVar;
    }

    @Override // defpackage.ojz
    public final /* bridge */ /* synthetic */ Object a() {
        otp otpVar = this.a;
        pfc pfcVar = otpVar.b;
        int i = otpVar.c;
        int i2 = pfcVar.c;
        if (i2 == 0) {
            return otn.a;
        }
        if (i2 <= 32) {
            return new oub(pfcVar, i);
        }
        return i2 <= 64 ? new ouc(pfcVar, i) : new oua(pfcVar, i);
    }
}
