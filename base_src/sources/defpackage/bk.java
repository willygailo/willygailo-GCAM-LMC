package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bk extends bj {
    public final Object c;
    public final Object d;

    public bk(dp dpVar, aax aaxVar, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        super(dpVar, aaxVar);
        Object obj3 = null;
        if (dpVar.e == 2) {
            if (z) {
                bu buVar = dpVar.a;
                br brVar = buVar.P;
                if (brVar == null) {
                    obj2 = null;
                } else if (brVar.j == bu.e) {
                    buVar.Z();
                    obj2 = null;
                } else {
                    obj2 = buVar.P.j;
                }
            } else {
                dpVar.a.Y();
                obj2 = null;
            }
            this.c = obj2;
            if (z) {
                br brVar2 = dpVar.a.P;
            } else {
                br brVar3 = dpVar.a.P;
            }
        } else {
            if (z) {
                bu buVar2 = dpVar.a;
                br brVar4 = buVar2.P;
                if (brVar4 == null) {
                    obj = null;
                } else if (brVar4.i == bu.e) {
                    buVar2.Y();
                    obj = null;
                } else {
                    obj = buVar2.P.i;
                }
            } else {
                dpVar.a.Z();
                obj = null;
            }
            this.c = obj;
        }
        if (z2) {
            if (z) {
                bu buVar3 = dpVar.a;
                br brVar5 = buVar3.P;
                if (brVar5 != null) {
                    if (brVar5.k == bu.e) {
                        buVar3.ab();
                    } else {
                        obj3 = buVar3.P.k;
                    }
                }
                this.d = obj3;
                return;
            }
            dpVar.a.ab();
        }
        this.d = null;
    }

    public final void a(Object obj) {
        if (obj == null) {
            return;
        }
        int i = de.b;
        if (de.a != null) {
            de.a.a();
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }
}
