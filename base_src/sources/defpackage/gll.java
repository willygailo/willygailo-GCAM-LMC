package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gll implements hih {
    final /* synthetic */ glm a;

    public gll(glm glmVar) {
        this.a = glmVar;
    }

    @Override // defpackage.hih
    public final void a(hiy hiyVar, hiz hizVar) {
        hih hihVar = this.a.c;
        if (hihVar != null) {
            hihVar.a(hiyVar, hizVar);
        }
        int i = hiyVar.c;
        if (i == 1) {
            this.a.a = true;
        } else if (i == 2) {
            this.a.b = true;
        }
        glm glmVar = this.a;
        if (glmVar.a && glmVar.b) {
            glmVar.c = null;
        }
    }

    @Override // defpackage.hih
    public final void b(hiy hiyVar, hsp hspVar) {
        hih hihVar = this.a.c;
        if (hihVar != null) {
            hihVar.b(hiyVar, hspVar);
        }
    }

    @Override // defpackage.hih
    public final void c(hiy hiyVar) {
    }

    @Override // defpackage.hih
    public final void d(hiy hiyVar, fcy fcyVar) {
        hih hihVar = this.a.c;
        if (hihVar != null) {
            hihVar.d(hiyVar, fcyVar);
        }
    }
}
