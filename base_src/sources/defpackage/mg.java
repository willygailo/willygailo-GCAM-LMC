package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mg implements lj {
    final /* synthetic */ mh a;

    public mg(mh mhVar) {
        this.a = mhVar;
    }

    @Override // defpackage.lj
    public final void a(kw kwVar, boolean z) {
        if (kwVar instanceof ls) {
            kwVar.a().i(false);
        }
        lj ljVar = this.a.e;
        if (ljVar != null) {
            ljVar.a(kwVar, z);
        }
    }

    @Override // defpackage.lj
    public final boolean b(kw kwVar) {
        mh mhVar = this.a;
        if (kwVar == mhVar.c) {
            return false;
        }
        kz kzVar = ((ls) kwVar).k;
        lj ljVar = mhVar.e;
        if (ljVar != null) {
            return ljVar.b(kwVar);
        }
        return false;
    }
}
