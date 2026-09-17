package defpackage;

import agc.Agc;
import android.hardware.camera2.CaptureResult;
import com.AGC;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class bod extends mip {
    lzv b;
    private final lco c;
    private final lco d;
    private final bmv h;
    public volatile jrl a = jrl.UNINITIALIZED;
    private final Set g = new HashSet();

    public bod(bmv bmvVar, lda ldaVar, lda ldaVar2, ddf ddfVar) {
        this.c = ldaVar;
        this.d = ldaVar2;
        ddg ddgVar = dde.a;
        ddfVar.b();
        this.h = bmvVar;
        this.b = null;
    }

    public final synchronized void a(Runnable runnable) {
        this.g.add(runnable);
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        HashSet hashSet;
        synchronized (this) {
            this.b = lzvVar;
        }
        Integer captureResultKey = AGC.getCaptureResultKey(lzvVar);
        if (captureResultKey == null || captureResultKey.intValue() != 1 || this.h.a() || ((Boolean) this.c.fA()).booleanValue() || ((Boolean) this.d.fA()).booleanValue()) {
            return;
        }
        synchronized (this) {
            hashSet = new HashSet(this.g);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final synchronized void c(Runnable runnable) {
        this.g.remove(runnable);
    }

    public final synchronized boolean d(jth jthVar) {
        String str = Agc.noNeedFixLens() ? (String) this.b.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID) : null;
        if (str == null) {
            return true;
        }
        lvp lvpVarA = jthVar.a(str);
        if (lvpVarA == null) {
            return true;
        }
        return lvpVarA.E();
    }
}
