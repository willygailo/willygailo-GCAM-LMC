package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fow {
    private final boolean a;
    private final gog b;
    private final ely c;
    private final ely d;
    private final ely e;
    private final pyn f;
    private final ddf g;
    private final ghx h;

    public fow(ojc ojcVar, pyn pynVar, pyn pynVar2, pyn pynVar3, pyn pynVar4, ghx ghxVar, ddf ddfVar, gog gogVar) {
        this.a = ((Boolean) ojcVar.e(false)).booleanValue();
        this.c = ely.a(pynVar);
        this.d = ely.a(pynVar2);
        this.e = ely.a(pynVar3);
        this.f = pynVar4;
        this.b = gogVar;
        this.h = ghxVar;
        this.g = ddfVar;
    }

    private static gew d(hen henVar) {
        return new had(henVar, 1);
    }

    public final ojc a() {
        if (!this.c.c()) {
            return oih.a;
        }
        gog gogVar = this.b;
        return ojc.i(((fpm) this.c.b()).a(gogVar.b, brg.d(gogVar.a.a, this.h, this.g), false, plk.V(oih.a)));
    }

    public final void b() {
        if (this.a) {
            ((ges) this.d.b()).k(d((hen) this.f.get()), this.b);
            ((gez) this.e.b()).f(this.b.b.h());
        }
    }

    public final void c() {
        if (this.a) {
            ((ges) this.d.b()).i(d((hen) this.f.get()), this.b);
        }
    }
}
