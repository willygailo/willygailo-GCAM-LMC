package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class lsx implements Comparator {
    public static final Comparator a = new lsx();
    private final orh b = new lsy(oom.o(loa.SURFACE_VIEW, loa.SURFACE_TEXTURE, loa.SURFACE_DEFERRED));
    private final orh c = new lsy(oom.n(0, 34));

    private lsx() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        lui luiVar = (lui) obj;
        lui luiVar2 = (lui) obj2;
        luiVar.getClass();
        luiVar2.getClass();
        int iCompare = this.b.compare(luiVar.h(), luiVar2.h());
        if (iCompare == 0 && (iCompare = this.c.compare(Integer.valueOf(luiVar.a()), Integer.valueOf(luiVar2.a()))) == 0) {
            return 0;
        }
        return iCompare;
    }
}
