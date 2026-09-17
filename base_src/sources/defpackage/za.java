package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class za extends zg {
    public za(yk ykVar) {
        super(ykVar);
        ykVar.h.d();
        ykVar.i.d();
        this.g = ((yn) ykVar).aq;
    }

    private final void g(yx yxVar) {
        this.i.j.add(yxVar);
        yxVar.k.add(this.i);
    }

    @Override // defpackage.zg
    public final void b() {
        yk ykVar = this.d;
        yn ynVar = (yn) ykVar;
        int i = ynVar.b;
        int i2 = ynVar.c;
        float f = ynVar.a;
        if (ynVar.aq == 1) {
            if (i != -1) {
                this.i.k.add(ykVar.T.h.i);
                this.d.T.h.i.j.add(this.i);
                this.i.e = i;
            } else if (i2 != -1) {
                this.i.k.add(ykVar.T.h.j);
                this.d.T.h.j.j.add(this.i);
                this.i.e = -i2;
            } else {
                yx yxVar = this.i;
                yxVar.b = true;
                yxVar.k.add(ykVar.T.h.j);
                this.d.T.h.j.j.add(this.i);
            }
            g(this.d.h.i);
            g(this.d.h.j);
            return;
        }
        if (i != -1) {
            this.i.k.add(ykVar.T.i.i);
            this.d.T.i.i.j.add(this.i);
            this.i.e = i;
        } else if (i2 != -1) {
            this.i.k.add(ykVar.T.i.j);
            this.d.T.i.j.j.add(this.i);
            this.i.e = -i2;
        } else {
            yx yxVar2 = this.i;
            yxVar2.b = true;
            yxVar2.k.add(ykVar.T.i.j);
            this.d.T.i.j.j.add(this.i);
        }
        g(this.d.i.i);
        g(this.d.i.j);
    }

    @Override // defpackage.zg
    public final void c() {
        yk ykVar = this.d;
        if (((yn) ykVar).aq == 1) {
            ykVar.Y = this.i.f;
        } else {
            ykVar.Z = this.i.f;
        }
    }

    @Override // defpackage.zg
    public final void d() {
        this.i.b();
    }

    @Override // defpackage.zg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zg, defpackage.yv
    public final void f() {
        yx yxVar = this.i;
        if (yxVar.c && !yxVar.i) {
            yx yxVar2 = (yx) yxVar.k.get(0);
            yn ynVar = (yn) this.d;
            this.i.c((int) ((yxVar2.f * ynVar.a) + 0.5f));
        }
    }
}
