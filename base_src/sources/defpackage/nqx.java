package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes2.dex */
public final class nqx implements kvc {
    final /* synthetic */ nre a;
    final /* synthetic */ nrl b;
    final /* synthetic */ qfg c;

    public nqx(nre nreVar, nrl nrlVar, qfg qfgVar) {
        this.a = nreVar;
        this.b = nrlVar;
        this.c = qfgVar;
    }

    @Override // defpackage.kvc
    public final void a(kvk kvkVar) {
        qbz qbzVar;
        qks qksVar = null;
        if (!kvkVar.e()) {
            Exception excB = kvkVar.b();
            kig kigVar = excB instanceof kig ? (kig) excB : null;
            if (kigVar != null && kigVar.a() == 4) {
                nrm nrmVar = this.a.b;
                nrl nrlVar = this.b;
                Exception excB2 = kvkVar.b();
                nrmVar.a(nrlVar.c(16, excB2 != null ? excB2.getCause() : null, null, null));
                this.c.b();
                return;
            }
            this.a.b.a(this.b.c(17, kvkVar.b(), null, null));
            qfg qfgVar = this.c;
            Exception excB3 = kvkVar.b();
            if (excB3 == null) {
                excB3 = new IllegalStateException("Unknown F250Authenticator error");
            }
            qfgVar.c(excB3);
            return;
        }
        Object objC = kvkVar.c();
        qfg qfgVar2 = this.c;
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) objC;
        String str = googleSignInAccount.b;
        if (str != null) {
            nmn nmnVar = new nmn(str, googleSignInAccount.d, googleSignInAccount.e, googleSignInAccount.f);
            if (qfgVar2.get() != qcr.DISPOSED && (qbzVar = (qbz) qfgVar2.getAndSet(qcr.DISPOSED)) != qcr.DISPOSED) {
                try {
                    qfgVar2.a.d(nmnVar);
                    if (qbzVar != null) {
                        qbzVar.gT();
                    }
                } catch (Throwable th) {
                    if (qbzVar != null) {
                        qbzVar.gT();
                    }
                    throw th;
                }
            }
            qksVar = qks.a;
        }
        if (qksVar == null) {
            qdw qdwVar = new qdw(new nrc(this.a, this.b));
            qco qcoVar = qmd.n;
            final nqv nqvVar = new nqv(this.c);
            final nqw nqwVar = new nqw(this.a, this.b, this.c);
            if (nqvVar == qjv.a && nqwVar == qjv.b) {
                qdwVar.e(new qdq());
            } else if (nqvVar != qjv.a) {
                qdwVar.e(new qdp(new qcn() { // from class: qju
                    @Override // defpackage.qcn
                    public final /* synthetic */ void a(Object obj) {
                        nqvVar.a(obj);
                    }
                }, nqwVar == qjv.b ? qdd.c : new qcl() { // from class: qjt
                    @Override // defpackage.qcl
                    public final /* synthetic */ void a() {
                        nqwVar.invoke();
                    }
                }));
            } else {
                qdwVar.e(new qdp(new qcl() { // from class: qjt
                    @Override // defpackage.qcl
                    public final /* synthetic */ void a() {
                        nqwVar.invoke();
                    }
                }));
            }
        }
    }
}
