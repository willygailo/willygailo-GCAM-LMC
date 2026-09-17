package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jo extends jw implements ku {
    public final kw a;
    public jv b;
    final /* synthetic */ jp c;
    private final Context f;
    private WeakReference g;

    public jo(jp jpVar, Context context, jv jvVar) {
        this.c = jpVar;
        this.f = context;
        this.b = jvVar;
        kw kwVar = new kw(context);
        kwVar.D();
        this.a = kwVar;
        kwVar.b = this;
    }

    @Override // defpackage.ku
    public final void C(kw kwVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.e.n();
    }

    @Override // defpackage.ku
    public final boolean E(kw kwVar, MenuItem menuItem) {
        jv jvVar = this.b;
        if (jvVar != null) {
            return jvVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.jw
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.jw
    public final MenuInflater b() {
        return new kc(this.f);
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
        return this.c.e.h;
    }

    @Override // defpackage.jw
    public final CharSequence e() {
        return this.c.e.g;
    }

    @Override // defpackage.jw
    public final void f() {
        jp jpVar = this.c;
        if (jpVar.g != this) {
            return;
        }
        if (jp.y(jpVar.l, false)) {
            this.b.a(this);
        } else {
            jp jpVar2 = this.c;
            jpVar2.h = this;
            jpVar2.i = this.b;
        }
        this.b = null;
        this.c.v(false);
        ActionBarContextView actionBarContextView = this.c.e;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        this.c.d.d().sendAccessibilityEvent(32);
        jp jpVar3 = this.c;
        jpVar3.b.l(jpVar3.n);
        this.c.g = null;
    }

    @Override // defpackage.jw
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.jw
    public final void h(View view) {
        this.c.e.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.jw
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.jw
    public final void j(CharSequence charSequence) {
        this.c.e.k(charSequence);
    }

    @Override // defpackage.jw
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.jw
    public final void l(CharSequence charSequence) {
        this.c.e.l(charSequence);
    }

    @Override // defpackage.jw
    public final void m(boolean z) {
        this.e = z;
        this.c.e.m(z);
    }

    @Override // defpackage.jw
    public final boolean n() {
        return this.c.e.j;
    }
}
