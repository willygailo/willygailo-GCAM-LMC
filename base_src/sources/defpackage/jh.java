package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jh extends hu {
    final oa a;
    boolean b;
    public final Window.Callback c;
    private boolean d;
    private boolean e;
    private final ArrayList f = new ArrayList();
    private final Runnable g = new jc(this);
    private final jd h;

    public jh(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        jd jdVar = new jd(this);
        this.h = jdVar;
        rx rxVar = new rx(toolbar, false);
        this.a = rxVar;
        jg jgVar = new jg(this, callback);
        this.c = jgVar;
        rxVar.d = jgVar;
        toolbar.z = jdVar;
        rxVar.p(charSequence);
    }

    @Override // defpackage.hu
    public final int a() {
        return ((rx) this.a).b;
    }

    @Override // defpackage.hu
    public final Context b() {
        return this.a.b();
    }

    @Override // defpackage.hu
    public final void d(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((ht) this.f.get(i)).a();
        }
    }

    @Override // defpackage.hu
    public final void e() {
        ((rx) this.a).a.removeCallbacks(this.g);
    }

    @Override // defpackage.hu
    public final void f(boolean z) {
    }

    @Override // defpackage.hu
    public final void g(boolean z) {
        w(4, 4);
    }

    @Override // defpackage.hu
    public final void h(boolean z) {
    }

    @Override // defpackage.hu
    public final void i(CharSequence charSequence) {
        this.a.m(charSequence);
    }

    @Override // defpackage.hu
    public final void j(CharSequence charSequence) {
        this.a.p(charSequence);
    }

    @Override // defpackage.hu
    public final boolean k() {
        return this.a.s();
    }

    @Override // defpackage.hu
    public final boolean l() {
        if (!this.a.r()) {
            return false;
        }
        this.a.e();
        return true;
    }

    @Override // defpackage.hu
    public final boolean m() {
        ((rx) this.a).a.removeCallbacks(this.g);
        gl.A(((rx) this.a).a, this.g);
        return true;
    }

    @Override // defpackage.hu
    public final boolean n(int i, KeyEvent keyEvent) {
        Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.hu
    public final boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // defpackage.hu
    public final boolean p() {
        return this.a.v();
    }

    @Override // defpackage.hu
    public final void q() {
    }

    @Override // defpackage.hu
    public final void r() {
        w(2, 2);
    }

    @Override // defpackage.hu
    public final void s() {
        w(8, 8);
    }

    @Override // defpackage.hu
    public final void t() {
        this.a.j(null);
    }

    @Override // defpackage.hu
    public final void u() {
        oa oaVar = this.a;
        oaVar.m(oaVar.b().getText(R.string.pref_camera_settings_category));
    }

    public final Menu v() {
        if (!this.d) {
            oa oaVar = this.a;
            je jeVar = new je(this);
            jf jfVar = new jf(this);
            Toolbar toolbar = ((rx) oaVar).a;
            toolbar.x = jeVar;
            toolbar.y = jfVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(jeVar, jfVar);
            }
            this.d = true;
        }
        return ((rx) this.a).a.g();
    }

    public final void w(int i, int i2) {
        oa oaVar = this.a;
        oaVar.i((i & i2) | ((i2 ^ (-1)) & ((rx) oaVar).b));
    }
}
