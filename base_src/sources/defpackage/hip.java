package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hip extends hif {
    public static final ouj e = ouj.h("com/google/android/apps/camera/processing/imagebackend/LuckyShotImageFilter");
    public final fjw f;
    private final ojc g;
    private hin h;
    private double i;

    public hip(hic hicVar, his hisVar, ojc ojcVar, fjw fjwVar) {
        super(hicVar, hisVar);
        this.h = null;
        this.i = 0.0d;
        this.g = ojcVar;
        this.f = fjwVar;
    }

    public final synchronized void c(Set set, hsa hsaVar) {
        gke gkeVar;
        iim iimVar;
        ArrayList arrayList;
        if (set.size() == 0) {
            ((oug) ((oug) e.c()).G(2489)).p("Filtered Image future failed to return a single image. There are %d images.  No Image produced.", set.size());
            return;
        }
        if (set.size() > 1) {
            ((oug) ((oug) e.b()).G(2488)).p("Filtered Image return multiple images. There are %d images.  No Image produced.", set.size());
            throw new IllegalStateException("Lucky Shot Filter returned multiple images.");
        }
        this.f.e = SystemClock.elapsedRealtimeNanos();
        iij iijVarK = hsaVar.k();
        if (iijVarK == null || (iimVar = ((iik) iijVarK).j) == null) {
            gkeVar = (gke) ((ojj) this.g).a;
            hin hinVar = (hin) set.iterator().next();
            ((iik) hsaVar.k()).i = this.f;
            gkeVar.b.a.a.g("finish lucky shot selection, pass to the piped image saver");
            try {
                gmt gmtVar = gkeVar.a;
                mad madVar = hinVar.a;
                pht phtVar = hinVar.c;
                phtVar.getClass();
                gmtVar.a(madVar, phtVar);
                gkeVar.a.close();
                return;
            } catch (Throwable th) {
                gkeVar.a.close();
                throw th;
            }
        }
        fjw fjwVar = this.f;
        iimVar.d = fjwVar.d;
        iimVar.e = fjwVar.e;
        synchronized (fjwVar.a) {
            List list = fjwVar.f;
            arrayList = list != null ? new ArrayList(list) : null;
        }
        iimVar.f = arrayList;
        gkeVar = (gke) ((ojj) this.g).a;
        hin hinVar2 = (hin) set.iterator().next();
        ((iik) hsaVar.k()).i = this.f;
        gkeVar.b.a.a.g("finish lucky shot selection, pass to the piped image saver");
        gmt gmtVar2 = gkeVar.a;
        mad madVar2 = hinVar2.a;
        pht phtVar2 = hinVar2.c;
        phtVar2.getClass();
        gmtVar2.a(madVar2, phtVar2);
        gkeVar.a.close();
        return;
        throw th;
    }

    @Override // defpackage.hif, defpackage.hid, defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        SystemClock.elapsedRealtimeNanos();
        super.close();
    }

    public final synchronized hin d(hin hinVar, double d) {
        hin hinVar2 = this.h;
        if (hinVar2 != null && d <= this.i) {
            return hinVar;
        }
        this.h = hinVar;
        this.i = d;
        return hinVar2;
    }
}
