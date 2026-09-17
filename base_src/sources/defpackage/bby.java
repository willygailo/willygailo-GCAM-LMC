package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bby {
    public final bci a;
    public final bbv b;
    public final bcp c;
    public final bbt d;
    public final bbb e;
    public final bdr f;
    private final bbw g;

    public bby(bdr bdrVar, bdo bdoVar, bec becVar, bec becVar2, bec becVar3) {
        this.f = bdrVar;
        bbw bbwVar = new bbw(bdoVar);
        this.g = bbwVar;
        bbb bbbVar = new bbb();
        this.e = bbbVar;
        synchronized (this) {
            synchronized (bbbVar) {
            }
        }
        this.a = new bci();
        this.b = new bbv(becVar, becVar2, becVar3, this, this);
        this.d = new bbt(bbwVar);
        this.c = new bcp();
        bdrVar.a = this;
    }

    public final synchronized void a(bcc bccVar, azp azpVar) {
        this.a.b(azpVar, bccVar);
    }

    public final synchronized void b(bcc bccVar, azp azpVar, bce bceVar) {
        if (bceVar != null) {
            if (bceVar.a) {
                this.e.b(azpVar, bceVar);
            }
        }
        this.a.b(azpVar, bccVar);
    }
}
