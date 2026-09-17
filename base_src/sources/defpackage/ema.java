package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ema implements emr {
    final /* synthetic */ HashMap a;
    final /* synthetic */ emr b;

    public ema(HashMap map, emr emrVar) {
        this.a = map;
        this.b = emrVar;
    }

    @Override // defpackage.emr
    public final Object a(emq emqVar) {
        Object objCast = emqVar.a.cast(this.a.get(emqVar.b));
        if (objCast != null) {
            return objCast;
        }
        Object objA = this.b.a(emqVar);
        this.a.put(emqVar.b, objA);
        return objA;
    }
}
