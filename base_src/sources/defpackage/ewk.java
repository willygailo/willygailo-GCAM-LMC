package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ewk implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public ewk(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public ewk(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public static ewk a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new ewk(qkgVar, qkgVar2, qkgVar3, 0);
    }

    public final ojc b() {
        switch (this.d) {
            case 0:
                Set set = ((pyw) this.a).get();
                mbg mbgVar = (mbg) this.b.get();
                ddf ddfVar = (ddf) this.c.get();
                if (ddfVar.k(ddl.bk)) {
                    return oih.a;
                }
                if (!set.isEmpty()) {
                    return ojc.i(mbgVar.a(set));
                }
                ddfVar.d();
                ddfVar.d();
                return oih.a;
            case 1:
                return (((Boolean) this.a.get()).booleanValue() && ((Boolean) this.b.get()).booleanValue()) ? (ojc) ((pyt) this.c).a : oih.a;
            case 2:
                Set set2 = ((pyw) this.a).get();
                return (set2.isEmpty() || ((ddf) this.c.get()).k(ddl.bl)) ? oih.a : ojc.i(((mbg) this.b.get()).a(set2));
            default:
                ojc ojcVar = (ojc) ((pyt) this.b).a;
                ojc ojcVar2 = (ojc) ((pyt) this.c).a;
                qkg qkgVar = this.a;
                if (!ojcVar.g() && !ojcVar2.g()) {
                    return oih.a;
                }
                qkgVar.getClass();
                return ojc.i(new mxk(qkgVar, 2));
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return b();
    }
}
