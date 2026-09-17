package defpackage;

import android.content.Context;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jhj {
    private final elw a;
    private final Map b;

    public jhj(Context context, elw elwVar, ddf ddfVar) {
        this.a = elwVar;
        boolean zK = ddfVar.k(ddl.ay);
        EnumMap enumMap = new EnumMap(jhi.class);
        for (jhi jhiVar : jhi.values()) {
            jgv jgvVar = new jgv();
            jgvVar.e = context.getString(jhiVar.i);
            jgvVar.f = context;
            jgvVar.i = 11;
            jgvVar.b = 5000;
            jgvVar.h = zK;
            enumMap.put(jhiVar, jgvVar.a());
        }
        this.b = enumMap;
    }

    public final void a(jhi jhiVar) {
        jgu jguVar = (jgu) this.b.get(jhiVar);
        if (jguVar != null) {
            this.a.d(jguVar);
        }
    }
}
