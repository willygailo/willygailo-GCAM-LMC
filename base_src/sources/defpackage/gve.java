package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class gve implements gvb, fik, fii, fij {
    public final ljf a;
    public final lzb b;
    private final Activity c;
    private final WindowManager d;
    private final boolean e;
    private final lis f;
    private final Executor g;
    private final List h = new ArrayList();
    private final lap i;

    public gve(Activity activity, lzb lzbVar, WindowManager windowManager, lir lirVar, bqg bqgVar, Executor executor, ljf ljfVar) {
        this.c = activity;
        this.i = bqgVar.i();
        lzbVar.getClass();
        this.b = lzbVar;
        this.d = windowManager;
        this.g = executor;
        this.a = ljfVar;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int rotation = defaultDisplay.getRotation();
        lig ligVarF = lig.f(point);
        ligVarF = (rotation == 1 || rotation == 3) ? ligVarF.j() : ligVarF;
        this.e = ligVarF.a <= ligVarF.b;
        this.f = lirVar.a("OrientMgrImpl");
    }

    @Override // defpackage.gva
    public final void a(Class cls) {
        if (!this.h.contains(cls)) {
            this.h.add(cls);
        }
        lis lisVar = this.f;
        int size = this.h.size();
        StringBuilder sb = new StringBuilder(38);
        sb.append("Lock orientation requests: ");
        sb.append(size);
        lisVar.b(sb.toString());
        this.c.setRequestedOrientation(14);
    }

    @Override // defpackage.gva
    public final void b(Class cls) {
        this.f.b("Try to unlock Orientation");
        this.h.remove(cls);
        if (this.h.isEmpty()) {
            this.f.b("Orientation unlocked");
            this.c.setRequestedOrientation(2);
            return;
        }
        lis lisVar = this.f;
        int size = this.h.size();
        StringBuilder sb = new StringBuilder(67);
        sb.append("Can't unlock orientation now. Lock is held by ");
        sb.append(size);
        sb.append(" requests.");
        lisVar.h(sb.toString());
    }

    @Override // defpackage.gvb
    public final lic c() {
        return this.b.a();
    }

    @Override // defpackage.fij
    public final void e() {
        this.a.d("orientation#disable", new gvd(this.b, 1));
    }

    @Override // defpackage.gvb
    public final lic f() {
        return lic.c(this.d.getDefaultDisplay());
    }

    @Override // defpackage.fii
    public final void fW() {
        aat.d(this.i, plk.aa(new pgj() { // from class: gvc
            @Override // defpackage.pgj
            public final pht a() {
                gve gveVar = this.a;
                gveVar.a.d("orientation#enable", new gvd(gveVar.b, 0));
                return plk.V(Boolean.TRUE);
            }
        }, this.g));
    }

    @Override // defpackage.gvb
    public final void g(lyy lyyVar) {
        this.b.b(lyyVar);
    }

    @Override // defpackage.gvb
    public final void h(lyy lyyVar) {
        this.b.c(lyyVar);
    }

    @Override // defpackage.gvb
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.gvb
    public final int j() {
        return fvq.E(c(), this.e);
    }

    @Override // defpackage.gvb
    public final void k(cub cubVar) {
        lzb lzbVar = this.b;
        synchronized (lzbVar.c) {
            if (lzbVar.b.contains(cubVar)) {
                return;
            }
            lzbVar.b.add(cubVar);
        }
    }

    @Override // defpackage.gvb
    public final void l(cub cubVar) {
        lzb lzbVar = this.b;
        synchronized (lzbVar.c) {
            if (!lzbVar.b.remove(cubVar)) {
                lzbVar.f.g("Removing non-existing raw listener.");
            }
        }
    }
}
