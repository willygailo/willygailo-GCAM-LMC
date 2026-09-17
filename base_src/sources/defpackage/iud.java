package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class iud {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(true);
    public final dmh e;
    public final ddf f;
    public final ojc g;
    public final int h;
    public final bqg i;
    private final bpl j;
    private final jhh k;

    public iud(bqg bqgVar, bpl bplVar, Context context, dmh dmhVar, ddf ddfVar, ojc ojcVar, lar larVar, jhh jhhVar) {
        int i = 1;
        this.i = bqgVar;
        this.j = bplVar;
        this.e = dmhVar;
        this.f = ddfVar;
        this.g = ojcVar;
        this.k = jhhVar;
        this.h = context.getResources().getInteger(R.integer.control_3a_visibility_timeout_ms);
        ArrayList arrayListAj = obr.aj(dmhVar.b());
        if (ojcVar.g()) {
            arrayListAj.add(((jzr) ojcVar.c()).a());
        }
        bqgVar.i().c(lcv.a(arrayListAj).a(new iuc(this, i), larVar));
    }

    public final bpn a() {
        boolean z;
        if (this.g.g()) {
            jzr jzrVar = (jzr) this.g.c();
            z = (this.f.k(ddl.br) && ((Boolean) ((lce) jzrVar.c()).d).booleanValue()) ? false : true;
            jzrVar.i(true, z);
            jzrVar.j(this.h);
        } else {
            z = true;
        }
        if (this.f.k(ddl.br) && ((Boolean) ((lce) this.e.c()).d).booleanValue()) {
            z = false;
        }
        e();
        bpl bplVar = this.j;
        bpr bprVar = bplVar.c;
        if (bprVar != null) {
            bprVar.close();
            bplVar.c = null;
        }
        if (z) {
            bplVar.a.m(false);
        }
        bplVar.a.o(true, z);
        bplVar.c = ((bps) bplVar.b).get();
        bpr bprVar2 = bplVar.c;
        this.e.p(this.h);
        return bprVar2;
    }

    public final void b(boolean z) {
        if (this.g.g()) {
            ((jzr) this.g.c()).d(z, false);
        }
        this.e.j(z);
        c();
    }

    public final void c() {
        jhh jhhVar = this.k;
        jhhVar.c.g(jhhVar.i);
    }

    public final void d(boolean z) {
        if (this.g.g()) {
            ((jzr) this.g.c()).h(z);
        }
    }

    public final void e() {
        if (this.f.k(ddl.br)) {
            return;
        }
        if (!((Boolean) ((lce) this.e.c()).d).booleanValue()) {
            c();
        } else {
            jhh jhhVar = this.k;
            jhhVar.c.d(jhhVar.i);
        }
    }

    public final boolean f() {
        return this.b.get() && !this.a.get() && this.d.get() && !this.c.get();
    }

    public final void g(boolean z) {
        if (this.g.g()) {
            ((jzr) this.g.c()).i(z, false);
        }
        this.e.o(z, false);
        e();
    }
}
