package defpackage;

import com.google.android.apps.camera.ui.views.ViewfinderCover;

/* JADX INFO: loaded from: classes2.dex */
public final class jpa implements jfi {
    final /* synthetic */ ViewfinderCover a;

    public jpa(ViewfinderCover viewfinderCover) {
        this.a = viewfinderCover;
    }

    @Override // defpackage.jfi
    public final ojc b() {
        return this.a.b();
    }

    @Override // defpackage.jfi
    public final ojc c() {
        return this.a.c();
    }

    @Override // defpackage.jfi
    public final void d(boolean z) {
        ViewfinderCover viewfinderCover = this.a;
        viewfinderCover.e.setImageDrawable(viewfinderCover.f);
        this.a.i.m();
        this.a.f.start();
    }

    @Override // defpackage.jfi
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.jfi
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.jfi
    public final void g(jrl jrlVar) {
    }

    @Override // defpackage.jfi
    public final boolean h() {
        throw null;
    }

    @Override // defpackage.jfi
    public final boolean i() {
        return false;
    }
}
