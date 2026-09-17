package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jx extends jw implements ku {
    public final kw a;
    private final Context b;
    private final ActionBarContextView c;
    private final jv f;
    private WeakReference g;
    private boolean h;

    public jx(Context context, ActionBarContextView actionBarContextView, jv jvVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = jvVar;
        kw kwVar = new kw(actionBarContextView.getContext());
        kwVar.D();
        this.a = kwVar;
        kwVar.b = this;
    }

    @Override // defpackage.ku
    public final void C(kw kwVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.ku
    public final boolean E(kw kwVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.jw
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.jw
    public final MenuInflater b() {
        return new kc(this.c.getContext());
    }

    @Override // defpackage.jw
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.jw
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.jw
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.jw
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.sendAccessibilityEvent(32);
        this.f.a(this);
    }

    @Override // defpackage.jw
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.jw
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.jw
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.jw
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.jw
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.jw
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.jw
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.jw
    public final boolean n() {
        return this.c.j;
    }
}
