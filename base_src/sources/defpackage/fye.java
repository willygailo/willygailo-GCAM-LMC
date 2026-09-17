package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes.dex */
final class fye implements Runnable {
    final /* synthetic */ pih a;
    final /* synthetic */ fyr b;

    public fye(fyr fyrVar, pih pihVar) {
        this.b = fyrVar;
        this.a = pihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fdm fdmVar = this.b.q;
        if (fdmVar != null) {
            fdmVar.m = false;
            fdr fdrVar = fdmVar.c;
            if (fdrVar != null) {
                for (int i = 0; i < fdrVar.g.size(); i++) {
                    kus kusVar = ((fdq) fdrVar.g.get(i)).i;
                    if (kusVar != null) {
                        kusVar.e();
                    }
                    kus kusVar2 = ((fdq) fdrVar.g.get(i)).j;
                    if (kusVar2 != null) {
                        kusVar2.e();
                    }
                }
                fdrVar.g.clear();
                fdrVar.f.b();
            }
            GLES20.glDeleteTextures(2, new int[]{fdmVar.p, fdmVar.o}, 0);
            fdp fdpVar = fdmVar.b;
            kus kusVar3 = fdpVar.d.size() > 0 ? (kus) fdpVar.d.get(0) : null;
            if (kusVar3 != null) {
                kusVar3.e();
            }
            fcr fcrVar = fdmVar.H;
            if (fcrVar != null) {
                fcrVar.d();
            }
            fcr fcrVar2 = fdmVar.I;
            if (fcrVar2 != null) {
                fcrVar2.d();
            }
            fej fejVar = fdmVar.i;
            if (fejVar != null) {
                fejVar.d();
            }
            fcs fcsVar = fdmVar.j;
            if (fcsVar != null) {
                fcsVar.d();
            }
            feh fehVar = fdmVar.k;
            if (fehVar != null) {
                fehVar.d();
            }
            fcp fcpVar = fdmVar.a;
            if (fcpVar != null) {
                ((fdn) fcpVar).f.d();
            }
            fdt fdtVar = fdmVar.h;
            if (fdtVar != null) {
                for (int i2 = 0; i2 < fdtVar.a.size(); i2++) {
                    if (fdtVar.a.get(i2) != null) {
                        ((fct) fdtVar.a.get(i2)).e();
                    }
                }
                feh fehVar2 = fdtVar.d;
                if (fehVar2 != null) {
                    fehVar2.d();
                }
            }
            fco fcoVar = fdmVar.f;
            if (fcoVar != null) {
                fcoVar.e();
            }
            if (fdmVar.g != null) {
                fdmVar.f.e();
            }
            fdv fdvVar = fdmVar.d;
            fei feiVar = fdvVar.g;
            if (feiVar != null) {
                feiVar.d();
            }
            feh fehVar3 = fdvVar.h;
            if (fehVar3 != null) {
                fehVar3.d();
            }
            fct fctVar = fdvVar.e;
            if (fctVar != null) {
                fctVar.e();
            }
            fct fctVar2 = fdvVar.f;
            if (fctVar2 != null) {
                fctVar2.e();
            }
            fdmVar.b.b();
            this.b.q = null;
            this.a.o(null);
        }
    }
}
