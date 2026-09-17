package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mfl implements mfm {
    public final /* synthetic */ mfn a;
    public final /* synthetic */ mfm b;
    private final /* synthetic */ int c;

    public /* synthetic */ mfl(mfn mfnVar, mfm mfmVar, int i) {
        this.c = i;
        this.a = mfnVar;
        this.b = mfmVar;
    }

    @Override // defpackage.mfm
    public final void a(int i) {
        switch (this.c) {
            case 0:
                mfn mfnVar = this.a;
                mfm mfmVar = this.b;
                mip.F();
                int iG = 13;
                if (mfnVar.a.f()) {
                    kcr kcrVarA = mfnVar.a();
                    if ((kcrVarA.a & 1) != 0 && mfnVar.a.a() >= kcrVarA.b) {
                        iG = 2;
                    }
                } else {
                    iG = mfnVar.a.g();
                }
                mfmVar.a(iG);
                break;
            case 1:
                this.b.a(this.a.e());
                break;
            default:
                this.b.a(this.a.f());
                break;
        }
    }
}
