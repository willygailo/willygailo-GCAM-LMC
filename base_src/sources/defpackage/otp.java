package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class otp extends otn {
    public final int c;
    private final int d;
    private final ojz e;
    private otn f;

    public otp(pfc pfcVar, int i) {
        super(pfcVar);
        this.e = obr.au(new oto(this));
        this.f = null;
        this.c = i;
        this.d = this.b.c;
    }

    @Override // defpackage.otn
    public final int a(pfc pfcVar, int i) {
        Math.abs(this.d - pfcVar.c);
        if (this.f != null) {
            return ((otn) this.e.a()).a(pfcVar, Integer.MAX_VALUE);
        }
        oty otyVar = new oty(this.b);
        this.f = otyVar;
        return otyVar.a(pfcVar, Integer.MAX_VALUE);
    }
}
