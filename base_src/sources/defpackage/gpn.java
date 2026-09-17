package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gpn extends ldl {
    public final boolean a;
    public final boolean b;
    private final ead c;
    private final int d;

    public gpn(lco lcoVar, lco lcoVar2, ead eadVar, ddf ddfVar) {
        super(lcv.b(lcoVar, lcoVar2));
        this.c = eadVar;
        this.a = eadVar.c != eadVar.d;
        this.b = ddfVar.k(ddm.ap);
        this.d = eadVar.c;
    }

    @Override // defpackage.ldl
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        List list = (List) obj;
        Float f = (Float) list.get(0);
        Boolean bool = (Boolean) list.get(1);
        int i = this.d;
        if (this.a && f.floatValue() > 1.0f) {
            i = this.c.d;
        }
        if (this.b && bool.booleanValue()) {
            i /= 2;
        }
        return Integer.valueOf(i);
    }
}
