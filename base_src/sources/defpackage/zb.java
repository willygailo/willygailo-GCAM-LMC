package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zb extends zg {
    public zb(yk ykVar) {
        super(ykVar);
    }

    private final void g(yx yxVar) {
        this.i.j.add(yxVar);
        yxVar.k.add(this.i);
    }

    @Override // defpackage.zg
    public final void b() {
        yk ykVar = this.d;
        if (ykVar instanceof yh) {
            yx yxVar = this.i;
            yxVar.b = true;
            yh yhVar = (yh) ykVar;
            int i = yhVar.a;
            boolean z = yhVar.b;
            int i2 = 0;
            switch (i) {
                case 0:
                    yxVar.l = 4;
                    while (i2 < yhVar.ar) {
                        yk ykVar2 = yhVar.aq[i2];
                        if (z || ykVar2.ag != 8) {
                            yx yxVar2 = ykVar2.h.i;
                            yxVar2.j.add(this.i);
                            this.i.k.add(yxVar2);
                        }
                        i2++;
                    }
                    g(this.d.h.i);
                    g(this.d.h.j);
                    break;
                case 1:
                    yxVar.l = 5;
                    while (i2 < yhVar.ar) {
                        yk ykVar3 = yhVar.aq[i2];
                        if (z || ykVar3.ag != 8) {
                            yx yxVar3 = ykVar3.h.j;
                            yxVar3.j.add(this.i);
                            this.i.k.add(yxVar3);
                        }
                        i2++;
                    }
                    g(this.d.h.i);
                    g(this.d.h.j);
                    break;
                case 2:
                    yxVar.l = 6;
                    while (i2 < yhVar.ar) {
                        yk ykVar4 = yhVar.aq[i2];
                        if (z || ykVar4.ag != 8) {
                            yx yxVar4 = ykVar4.i.i;
                            yxVar4.j.add(this.i);
                            this.i.k.add(yxVar4);
                        }
                        i2++;
                    }
                    g(this.d.i.i);
                    g(this.d.i.j);
                    break;
                case 3:
                    yxVar.l = 7;
                    while (i2 < yhVar.ar) {
                        yk ykVar5 = yhVar.aq[i2];
                        if (z || ykVar5.ag != 8) {
                            yx yxVar5 = ykVar5.i.j;
                            yxVar5.j.add(this.i);
                            this.i.k.add(yxVar5);
                        }
                        i2++;
                    }
                    g(this.d.i.i);
                    g(this.d.i.j);
                    break;
            }
        }
    }

    @Override // defpackage.zg
    public final void c() {
        yk ykVar = this.d;
        if (ykVar instanceof yh) {
            int i = ((yh) ykVar).a;
            if (i == 0 || i == 1) {
                ykVar.Y = this.i.f;
            } else {
                ykVar.Z = this.i.f;
            }
        }
    }

    @Override // defpackage.zg
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override // defpackage.zg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zg, defpackage.yv
    public final void f() {
        yh yhVar = (yh) this.d;
        int i = yhVar.a;
        Iterator it = this.i.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((yx) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.i.c(i3 + yhVar.c);
        } else {
            this.i.c(i2 + yhVar.c);
        }
    }
}
