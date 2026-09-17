package defpackage;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ltv {
    public final lis c;
    public lsp d;
    private final luk e;
    private final Set f;
    private final Map g;
    private final Map h;
    private final ljf i;
    private boolean j = false;
    public final List b = new ArrayList();
    public final Set a = new HashSet();

    public ltv(luk lukVar, lap lapVar, Executor executor, lis lisVar, ljf ljfVar) {
        this.e = lukVar;
        this.i = ljfVar;
        this.f = new HashSet(lukVar.a.size());
        this.g = new HashMap(lukVar.a.size());
        this.h = new HashMap(lukVar.a.size());
        this.c = lisVar.a("SurfaceMap");
        for (lty ltyVar : lukVar.c) {
            lapVar.c(ltyVar.a.a(new ltu(this, ltyVar), executor));
        }
    }

    public final void a(lsp lspVar, Collection collection) {
        synchronized (this) {
            boolean zAddAll = false;
            obr.ar(this.d != null, "setActiveCaptureSession must be invoked first.", new Object[0]);
            if (lspVar != this.d) {
                return;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zAddAll |= this.a.addAll(((lzx) it.next()).a());
            }
            if (zAddAll) {
                c();
            }
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this.b) {
            this.b.add(runnable);
        }
    }

    public final void c() {
        this.i.e("SurfaceMap#invokeCallbacks");
        List listL = oom.l();
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                listL = new ArrayList(this.b);
            }
        }
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i.f();
    }

    public final void d(lsp lspVar) {
        boolean z;
        synchronized (this) {
            lsp lspVar2 = this.d;
            z = false;
            if (lspVar2 == null || lspVar2 != lspVar) {
                this.a.clear();
                this.d = lspVar;
                this.j = false;
                z = true;
            }
        }
        if (z) {
            e();
        }
    }

    public final void e() {
        boolean z;
        boolean z2;
        Surface surface;
        synchronized (this) {
            z = false;
            for (lui luiVar : this.e.a) {
                Surface surfaceG = luiVar.g();
                if (surfaceG == null || !surfaceG.isValid()) {
                    if (this.g.containsKey(luiVar) && (surface = (Surface) this.g.get(luiVar)) != surfaceG) {
                        this.f.remove(surface);
                        this.g.remove(luiVar);
                        this.h.put(luiVar, surface);
                        z = true;
                    }
                } else if (this.g.containsKey(luiVar)) {
                    Surface surface2 = (Surface) this.g.get(luiVar);
                    if (surface2 != surfaceG) {
                        this.j = true;
                        this.f.remove(surface2);
                        this.f.add(surfaceG);
                        this.g.put(luiVar, surfaceG);
                    }
                } else {
                    this.f.add(surfaceG);
                    this.g.put(luiVar, surfaceG);
                    Surface surface3 = (Surface) this.h.remove(luiVar);
                    if (surface3 != surfaceG && surface3 != null) {
                        this.j = true;
                    }
                    z = true;
                }
            }
            z2 = this.j;
        }
        if (z2 || z) {
            c();
        }
    }

    public final synchronized boolean f(Surface surface) {
        boolean zContains;
        boolean zContains2;
        zContains = this.f.contains(surface);
        zContains2 = this.a.contains(surface);
        if (zContains && !zContains2) {
            lis lisVar = this.c;
            String strValueOf = String.valueOf(surface);
            String strValueOf2 = String.valueOf(this.d);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length());
            sb.append(strValueOf);
            sb.append(" is valid but deferred streams are not yet available for ");
            sb.append(strValueOf2);
            lisVar.h(sb.toString());
        }
        return zContains && zContains2;
    }

    public final synchronized boolean g() {
        return this.j;
    }
}
