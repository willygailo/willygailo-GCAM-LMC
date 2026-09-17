package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yt {
    public final yl b;
    public final ArrayList a = new ArrayList();
    private final ys c = new ys();

    public yt(yl ylVar) {
        this.b = ylVar;
    }

    public final void a(yl ylVar) {
        this.a.clear();
        int size = ylVar.aH.size();
        for (int i = 0; i < size; i++) {
            yk ykVar = (yk) ylVar.aH.get(i);
            if (ykVar.N() == 3 || ykVar.O() == 3) {
                this.a.add(ykVar);
            }
        }
        ylVar.c();
    }

    public final void b(yl ylVar, int i, int i2, int i3) {
        int i4 = ylVar.ab;
        int i5 = ylVar.ac;
        ylVar.C(0);
        ylVar.B(0);
        ylVar.D(i2);
        ylVar.y(i3);
        ylVar.C(i4);
        ylVar.B(i5);
        yl ylVar2 = this.b;
        ylVar2.c = i;
        ylVar2.T();
    }

    public final boolean c(zl zlVar, yk ykVar, int i) {
        this.c.i = ykVar.N();
        this.c.j = ykVar.O();
        this.c.a = ykVar.j();
        this.c.b = ykVar.h();
        ys ysVar = this.c;
        ysVar.g = false;
        ysVar.h = i;
        int i2 = ysVar.i;
        int i3 = ysVar.j;
        boolean z = i2 == 3 && ykVar.W > 0.0f;
        boolean z2 = i3 == 3 && ykVar.W > 0.0f;
        if (z && ykVar.u[0] == 4) {
            ysVar.i = 1;
        }
        if (z2 && ykVar.u[1] == 4) {
            ysVar.j = 1;
        }
        zlVar.a(ykVar, ysVar);
        ykVar.D(this.c.c);
        ykVar.y(this.c.d);
        ys ysVar2 = this.c;
        ykVar.F = ysVar2.f;
        ykVar.v(ysVar2.e);
        ys ysVar3 = this.c;
        ysVar3.h = 0;
        return ysVar3.g;
    }
}
