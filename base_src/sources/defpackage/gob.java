package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gob implements gof {
    public final gfs a;
    public final lar b;
    public final hsa d;
    private goe f;
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(true);

    public gob(gfs gfsVar, lar larVar, hsa hsaVar) {
        this.a = gfsVar;
        this.b = larVar;
        this.d = hsaVar;
    }

    @Override // defpackage.gof
    public final goe a() {
        obr.aQ(!this.e.getAndSet(true));
        gnw gnwVar = new gnw(this);
        this.f = gnwVar;
        return gnwVar;
    }

    @Override // defpackage.gof
    public final goe b() {
        obr.aQ(!this.e.getAndSet(true));
        gny gnyVar = new gny(this);
        this.f = gnyVar;
        return gnyVar;
    }

    @Override // defpackage.gof
    public final goe c() {
        obr.aQ(!this.e.getAndSet(true));
        goa goaVar = new goa(this);
        this.f = goaVar;
        return goaVar;
    }

    @Override // defpackage.gof
    public final goe d() {
        return this.f;
    }

    @Override // defpackage.gof
    public final goe e() {
        goe goeVar = this.f;
        return goeVar != null ? goeVar : c();
    }

    @Override // defpackage.gof
    public final void f() {
        this.b.execute(new Runnable() { // from class: gnu
            @Override // java.lang.Runnable
            public final void run() {
                gob gobVar = this.a;
                if (gobVar.c.getAndSet(false)) {
                    gobVar.a.b.A();
                }
            }
        });
    }

    @Override // defpackage.gof
    public final void g() {
        this.e.set(false);
    }
}
