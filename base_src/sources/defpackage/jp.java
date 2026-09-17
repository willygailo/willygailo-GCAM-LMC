package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jp extends hu implements lz {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    oa d;
    ActionBarContextView e;
    View f;
    jo g;
    jw h;
    jv i;
    public int j;
    public boolean k;
    public boolean l;
    public ke m;
    boolean n;
    final gp o;
    final gp p;
    final jn q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public jp(Activity activity, boolean z) {
        new ArrayList();
        this.w = new ArrayList();
        this.j = 0;
        this.k = true;
        this.y = true;
        this.o = new jl(this);
        this.p = new jm(this);
        this.q = new jn(this);
        View decorView = activity.getWindow().getDecorView();
        z(decorView);
        if (z) {
            return;
        }
        this.f = decorView.findViewById(R.id.content);
    }

    public jp(Dialog dialog) {
        new ArrayList();
        this.w = new ArrayList();
        this.j = 0;
        this.k = true;
        this.y = true;
        this.o = new jl(this);
        this.p = new jm(this);
        this.q = new jn(this);
        z(dialog.getWindow().getDecorView());
    }

    private final void A(boolean z) {
        if (z) {
            this.d.x();
        } else {
            this.d.x();
        }
        this.d.w();
        this.d.z();
        this.b.e = false;
    }

    static boolean y(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void z(View view) {
        oa oaVarF;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((jp) actionBarOverlayLayout.h).j = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    gl.D(actionBarOverlayLayout);
                }
            }
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.action_bar);
        if (callbackFindViewById instanceof oa) {
            oaVarF = (oa) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't make a decor toolbar out of ");
                sb.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sb.toString());
            }
            oaVarF = ((Toolbar) callbackFindViewById).f();
        }
        this.d = oaVarF;
        this.e = (ActionBarContextView) view.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.action_bar_container);
        this.c = actionBarContainer;
        oa oaVar = this.d;
        if (oaVar == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = oaVar.b();
        if ((this.d.a() & 4) != 0) {
            this.u = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.d.y();
        A(ga.g(context));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, jq.a, com.google.android.GoogleCameraEngR18F1.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.n = true;
            actionBarOverlayLayout2.l(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            gl.K(this.c, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.hu
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.hu
    public final Context b() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.hu
    public final jw c(jv jvVar) {
        jo joVar = this.g;
        if (joVar != null) {
            joVar.f();
        }
        this.b.l(false);
        this.e.i();
        jo joVar2 = new jo(this, this.e.getContext(), jvVar);
        joVar2.a.s();
        try {
            boolean zC = joVar2.b.c(joVar2, joVar2.a);
            joVar2.a.r();
            if (!zC) {
                return null;
            }
            this.g = joVar2;
            joVar2.g();
            this.e.h(joVar2);
            v(true);
            this.e.sendAccessibilityEvent(32);
            return joVar2;
        } catch (Throwable th) {
            joVar2.a.r();
            throw th;
        }
    }

    @Override // defpackage.hu
    public final void d(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((ht) this.w.get(i)).a();
        }
    }

    @Override // defpackage.hu
    public final void f(boolean z) {
        if (this.u) {
            return;
        }
        g(z);
    }

    @Override // defpackage.hu
    public final void g(boolean z) {
        w(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.hu
    public final void h(boolean z) {
        ke keVar;
        this.z = z;
        if (z || (keVar = this.m) == null) {
            return;
        }
        keVar.a();
    }

    @Override // defpackage.hu
    public final void i(CharSequence charSequence) {
        this.d.m(charSequence);
    }

    @Override // defpackage.hu
    public final void j(CharSequence charSequence) {
        this.d.p(charSequence);
    }

    @Override // defpackage.hu
    public final boolean l() {
        oa oaVar = this.d;
        if (oaVar == null || !oaVar.r()) {
            return false;
        }
        this.d.e();
        return true;
    }

    @Override // defpackage.hu
    public final boolean n(int i, KeyEvent keyEvent) {
        jo joVar = this.g;
        if (joVar == null) {
            return false;
        }
        kw kwVar = joVar.a;
        kwVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return kwVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.hu
    public final void q() {
        A(ga.g(this.a));
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
        this.d.j(null);
    }

    @Override // defpackage.hu
    public final void u() {
        i(this.a.getString(com.google.android.GoogleCameraEngR18F1.R.string.pref_camera_settings_category));
    }

    public final void v(boolean z) {
        go goVarC;
        go goVarB;
        if (z) {
            if (!this.x) {
                this.x = true;
                x(false);
            }
        } else if (this.x) {
            this.x = false;
            x(false);
        }
        if (!gl.V(this.c)) {
            if (z) {
                this.d.n(4);
                this.e.setVisibility(0);
                return;
            } else {
                this.d.n(0);
                this.e.setVisibility(8);
                return;
            }
        }
        if (z) {
            goVarB = this.d.c(4, 100L);
            goVarC = this.e.b(0, 200L);
        } else {
            goVarC = this.d.c(0, 200L);
            goVarB = this.e.b(8, 100L);
        }
        ke keVar = new ke();
        keVar.a.add(goVarB);
        View view = (View) goVarB.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) goVarC.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        keVar.a.add(goVarC);
        keVar.b();
    }

    public final void w(int i, int i2) {
        int iA = this.d.a();
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        this.d.i((i & i2) | ((i2 ^ (-1)) & iA));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    public final void x(boolean z) {
        View view;
        View view2;
        View view3;
        if (!y(this.l, this.x)) {
            if (this.y) {
                this.y = false;
                ke keVar = this.m;
                if (keVar != null) {
                    keVar.a();
                }
                if (this.j == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    ke keVar2 = new ke();
                    float f = -this.c.getHeight();
                    if (z) {
                        int[] iArr = {0, 0};
                        this.c.getLocationInWindow(iArr);
                        f -= iArr[1];
                    }
                    go goVarP = gl.p(this.c);
                    goVarP.f(f);
                    goVarP.e(this.q);
                    keVar2.c(goVarP);
                    if (this.k && (view = this.f) != null) {
                        go goVarP2 = gl.p(view);
                        goVarP2.f(f);
                        keVar2.c(goVarP2);
                    }
                    keVar2.e(r);
                    keVar2.d();
                    keVar2.f(this.o);
                    this.m = keVar2;
                    keVar2.b();
                    return;
                }
                this.o.b();
                return;
            }
            return;
        }
        if (this.y) {
            return;
        }
        this.y = true;
        ke keVar3 = this.m;
        if (keVar3 != null) {
            keVar3.a();
        }
        this.c.setVisibility(0);
        if (this.j != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.k && (view2 = this.f) != null) {
                view2.setTranslationY(0.0f);
            }
            this.p.b();
        } else {
            if (!this.z) {
                if (z) {
                    z = true;
                } else {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.k) {
                        view2.setTranslationY(0.0f);
                    }
                    this.p.b();
                }
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.c.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.c.setTranslationY(f2);
            ke keVar4 = new ke();
            go goVarP3 = gl.p(this.c);
            goVarP3.f(0.0f);
            goVarP3.e(this.q);
            keVar4.c(goVarP3);
            if (this.k && (view3 = this.f) != null) {
                view3.setTranslationY(f2);
                go goVarP4 = gl.p(this.f);
                goVarP4.f(0.0f);
                keVar4.c(goVarP4);
            }
            keVar4.e(s);
            keVar4.d();
            keVar4.f(this.p);
            this.m = keVar4;
            keVar4.b();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            gl.D(actionBarOverlayLayout);
        }
    }
}
