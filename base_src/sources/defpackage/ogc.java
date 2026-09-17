package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class ogc extends ofv implements ofx {
    static final ofw a = new ofw(null);
    private final ofw b;

    public ogc() {
        super("", ofy.a.b());
        this.b = a;
    }

    @Override // defpackage.ofx
    public final ogi d(String str, ogh oghVar, boolean z) {
        if (z) {
            WeakHashMap weakHashMap = ogq.a;
        }
        return new ogd(str, this, oghVar, z);
    }

    @Override // defpackage.ofx
    public final /* synthetic */ Exception e() {
        return this.b;
    }

    @Override // defpackage.ogi
    public final ogi f(String str, ogh oghVar) {
        WeakHashMap weakHashMap = ogq.a;
        return d(str, oghVar, true);
    }
}
