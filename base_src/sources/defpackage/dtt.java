package defpackage;

import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import j$.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dtt implements buc, fii, fig, fie, fij {
    private final dtp b;
    private final FilmstripTransitionLayout c;
    private final bue d;
    public final Set a = new HashSet();
    private final AtomicBoolean e = new AtomicBoolean(false);

    public dtt(dtp dtpVar, FilmstripTransitionLayout filmstripTransitionLayout, bue bueVar) {
        this.b = dtpVar;
        this.c = filmstripTransitionLayout;
        this.d = bueVar;
    }

    @Override // defpackage.buc
    public final lie a(final bub bubVar) {
        this.a.add(bubVar);
        return new lie() { // from class: dts
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                dtt dttVar = this.a;
                dttVar.a.remove(bubVar);
            }
        };
    }

    @Override // defpackage.fij
    public final void e() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.c;
        if (filmstripTransitionLayout.b.isStarted()) {
            filmstripTransitionLayout.d = true;
            filmstripTransitionLayout.b.cancel();
        }
        if (filmstripTransitionLayout.a.isStarted()) {
            filmstripTransitionLayout.c = true;
            filmstripTransitionLayout.a.cancel();
        }
        this.c.setVisibility(4);
    }

    @Override // defpackage.buc
    public final void f() {
        Collection.EL.forEach(this.a, cez.g);
        this.c.setVisibility(4);
    }

    @Override // defpackage.fie
    public final void fU() {
        this.e.set(true);
        FilmstripTransitionLayout filmstripTransitionLayout = this.c;
        if (filmstripTransitionLayout.b.isStarted()) {
            filmstripTransitionLayout.b.pause();
        }
        if (filmstripTransitionLayout.a.isStarted()) {
            filmstripTransitionLayout.a.pause();
        }
    }

    @Override // defpackage.fig
    public final void fV() {
        this.e.set(false);
        this.b.c();
        FilmstripTransitionLayout filmstripTransitionLayout = this.c;
        if (filmstripTransitionLayout.b.isPaused()) {
            filmstripTransitionLayout.b.resume();
        }
        if (filmstripTransitionLayout.a.isPaused()) {
            filmstripTransitionLayout.a.resume();
        }
    }

    @Override // defpackage.fii
    public final void fW() {
        this.d.fO();
    }

    @Override // defpackage.fgl
    public final boolean fX() {
        return this.b.e();
    }

    @Override // defpackage.buc
    public final void g() {
        this.b.a();
    }

    @Override // defpackage.buc
    public final void h() {
        Collection.EL.forEach(this.a, cez.h);
        this.b.b();
    }

    @Override // defpackage.buc
    public final boolean i() {
        return this.b.e();
    }

    @Override // defpackage.buc
    public final void j(btt bttVar) {
        this.b.d(bttVar);
    }
}
