package defpackage;

import android.database.sqlite.SQLiteException;

/* JADX INFO: loaded from: classes2.dex */
final class kei extends kep {
    final /* synthetic */ kel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kei(kel kelVar, kdx kdxVar) {
        super(kdxVar);
        this.a = kelVar;
    }

    @Override // defpackage.kep
    public final void a() {
        kel kelVar = this.a;
        try {
            kef kefVar = kelVar.c;
            kdo.a();
            kefVar.z();
            if (kefVar.d.c(86400000L)) {
                kefVar.d.b();
                kefVar.q("Deleting stale hits (if any)");
                kefVar.r("Deleted stale hits, count", Integer.valueOf(kefVar.b().delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
            }
            kelVar.F();
        } catch (SQLiteException e) {
            kelVar.u("Failed to delete stale hits", e);
        }
        kelVar.d.d(86400000L);
    }
}
