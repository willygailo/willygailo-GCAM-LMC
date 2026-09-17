package defpackage;

import com.google.googlex.gcam.InterleavedImageU16;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class ege implements ecn {
    public static final ouj b = ouj.h("com/google/android/apps/camera/hdrplus/portrait/PostProcessingPortraitImageSaverImpl");
    public final efy c;
    public final ddf e;
    public final boolean f;
    public final edu h;
    public final ghx i;
    private final ojc j;
    public final AtomicLong d = new AtomicLong(0);
    public final Map g = new HashMap();

    public ege(ojc ojcVar, ghx ghxVar, efy efyVar, ddf ddfVar, boolean z, edu eduVar) {
        this.j = ojcVar;
        this.i = ghxVar;
        this.c = efyVar;
        this.e = ddfVar;
        this.f = z;
        this.h = eduVar;
    }

    public static InterleavedImageU16 d(pht phtVar) {
        try {
            return (InterleavedImageU16) phtVar.get(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new InterleavedImageU16();
        } catch (CancellationException e2) {
            return new InterleavedImageU16();
        } catch (ExecutionException e3) {
            return new InterleavedImageU16();
        } catch (TimeoutException e4) {
            return new InterleavedImageU16();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.gmu
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final egd b(gog gogVar) {
        String strS = gogVar.b.s();
        egd egdVar = (egd) this.g.get(strS);
        if (egdVar != null) {
            return egdVar;
        }
        hsa hsaVar = gogVar.b;
        egd egdVar2 = new egd(this, hsaVar, gogVar.d, this.j, UUID.randomUUID(), ((hqq) hsaVar).c);
        this.g.put(strS, egdVar2);
        return egdVar2;
    }

    @Override // defpackage.gmu
    public final gmt a(gog gogVar) {
        return b(gogVar);
    }

    @Override // defpackage.ecm
    /* JADX INFO: renamed from: c */
    public final eco b(gog gogVar) {
        return b(gogVar);
    }
}
