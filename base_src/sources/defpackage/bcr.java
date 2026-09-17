package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bcr implements bbh, bbg {
    public final bbi a;
    public final bbg b;
    public volatile Object c;
    public volatile bbe d;
    private volatile int e;
    private volatile bbd f;
    private volatile bff g;

    public bcr(bbi bbiVar, bbg bbgVar) {
        this.a = bbiVar;
        this.b = bbgVar;
    }

    @Override // defpackage.bbh
    public final void a() {
        bff bffVar = this.g;
        if (bffVar != null) {
            bffVar.c.fu();
        }
    }

    @Override // defpackage.bbg
    public final void b() {
        throw null;
    }

    @Override // defpackage.bbh
    public final boolean c() throws Throwable {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                blz.b();
                try {
                    bae baeVarA = this.a.c.c.a(obj);
                    Object objA = baeVarA.a();
                    aze azeVarN = this.a.c.c.g.n(objA.getClass());
                    if (azeVarN == null) {
                        throw new ayh(objA.getClass());
                    }
                    bbf bbfVar = new bbf(azeVarN, objA, this.a.h);
                    bbe bbeVar = new bbe(this.g.a, this.a.m);
                    bdk bdkVarD = this.a.d();
                    bdkVarD.b(bbeVar, bbfVar);
                    if (bdkVarD.a(bbeVar) == null) {
                        try {
                            this.b.e(this.g.a, baeVarA.a(), this.g.c, this.g.c.g(), this.g.a);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z) {
                                this.g.c.d();
                            }
                            throw th;
                        }
                    }
                    this.d = bbeVar;
                    this.f = new bbd(Collections.singletonList(this.g.a), this.a, this);
                    this.g.c.d();
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException e) {
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!z2 && this.e < this.a.f().size()) {
            List listF = this.a.f();
            int i = this.e;
            this.e = i + 1;
            this.g = (bff) listF.get(i);
            if (this.g != null && (this.a.o.c(this.g.c.g()) || this.a.h(this.g.c.a()))) {
                this.g.c.f(this.a.n, new bcq(this, this.g));
                z2 = true;
            }
        }
        return z2;
    }

    @Override // defpackage.bbg
    public final void d(azp azpVar, Exception exc, bac bacVar, int i) {
        this.b.d(azpVar, exc, bacVar, this.g.c.g());
    }

    @Override // defpackage.bbg
    public final void e(azp azpVar, Object obj, bac bacVar, int i, azp azpVar2) {
        this.b.e(azpVar, obj, bacVar, this.g.c.g(), azpVar);
    }

    final boolean f(bff bffVar) {
        bff bffVar2 = this.g;
        return bffVar2 != null && bffVar2 == bffVar;
    }
}
