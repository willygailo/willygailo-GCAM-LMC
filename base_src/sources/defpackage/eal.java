package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class eal extends ldl {
    final /* synthetic */ eam a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eal(eam eamVar, lco lcoVar, lco lcoVar2) {
        super(lcv.b(eamVar.b, eamVar.d, lcoVar, lcoVar2));
        this.a = eamVar;
    }

    @Override // defpackage.ldl
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        List list = (List) obj;
        boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((Boolean) list.get(2)).booleanValue();
        float fFloatValue = ((Float) list.get(3)).floatValue();
        Float fValueOf = Float.valueOf(-2.0f);
        if (!zBooleanValue2) {
            return fValueOf;
        }
        if (!zBooleanValue) {
            return zBooleanValue3 ? Float.valueOf(-1.0f) : fValueOf;
        }
        dzc dzcVar = (dzc) this.a.c.get();
        float f = dzcVar.b;
        float f2 = dzcVar.c;
        return Float.valueOf(f2 >= f ? 1.0f : aao.e((f - fFloatValue) / Math.abs(f2 - f)));
    }
}
