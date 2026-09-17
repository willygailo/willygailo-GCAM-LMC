package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.Fix.Pref;
import com.google.lens.sdk.LensApi;
import java.lang.ref.WeakReference;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class iy extends ii implements LayoutInflater.Factory2, ku {
    private static final xf I = new xf();
    private static final int[] J = {R.attr.windowBackground};
    public static final boolean c = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean d = true;
    public boolean A;
    public boolean B;
    boolean C;
    public int D;
    boolean E;
    int F;
    public Rect G;
    public Rect H;
    private CharSequence K;
    private ix L;
    private TextView M;
    private boolean N;
    private boolean O;
    private boolean P;
    private iw[] Q;
    private boolean R;
    private boolean S;
    private int T;
    private boolean U;
    private boolean V;
    private it W;
    private it X;
    private boolean Z;
    private AppCompatViewInflater aa;
    private ix ab;
    public final Object e;
    final Context f;
    public Window g;
    public iq h;
    public hu i;
    public MenuInflater j;
    public nz k;
    jw l;
    ActionBarContextView m;
    public PopupWindow n;
    public Runnable o;
    public boolean r;
    ViewGroup s;
    public View t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    public iw z;
    go p = null;
    public boolean q = true;
    private final Runnable Y = new im(this, 1);

    public iy(Context context, Window window, Object obj) {
        ih ihVar = null;
        this.T = -100;
        this.f = context;
        this.e = obj;
        if (this.T == -100 && (obj instanceof Dialog)) {
            while (context != null) {
                if (!(context instanceof ih)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    ihVar = (ih) context;
                    break;
                }
            }
            if (ihVar != null) {
                this.T = ((iy) ihVar.g()).T;
            }
        }
        if (this.T == -100) {
            xf xfVar = I;
            Integer num = (Integer) xfVar.get(this.e.getClass().getName());
            if (num != null) {
                this.T = num.intValue();
                xfVar.remove(this.e.getClass().getName());
            }
        }
        if (window != null) {
            O(window);
        }
        mu.f();
    }

    private final it M(Context context) {
        if (this.X == null) {
            this.X = new ir(this, context);
        }
        return this.X;
    }

    private final it N(Context context) {
        if (this.W == null) {
            if (jk.a == null) {
                Context applicationContext = context.getApplicationContext();
                jk.a = new jk(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.W = new iu(this, jk.a);
        }
        return this.W;
    }

    private final void O(Window window) {
        if (this.g != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof iq) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        iq iqVar = new iq(this, callback);
        this.h = iqVar;
        window.setCallback(iqVar);
        rn rnVarK = rn.k(this.f, null, J);
        Drawable drawableI = rnVarK.i(0);
        if (drawableI != null) {
            window.setBackgroundDrawable(drawableI);
        }
        rnVarK.n();
        this.g = window;
    }

    private final void P() {
        if (this.g == null) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                O(((Activity) obj).getWindow());
            }
        }
        if (this.g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void Q(int i) {
        this.F = (1 << i) | this.F;
        if (this.E) {
            return;
        }
        gl.A(this.g.getDecorView(), this.Y);
        this.E = true;
    }

    private final void R(iw iwVar, KeyEvent keyEvent) {
        ExpandedMenuView expandedMenuView;
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (iwVar.m || this.C) {
            return;
        }
        if (iwVar.a == 0 && (this.f.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackT = t();
        if (callbackT != null && !callbackT.onMenuOpened(iwVar.a, iwVar.h)) {
            x(iwVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
        if (windowManager != null && F(iwVar, keyEvent)) {
            ViewGroup viewGroup = iwVar.e;
            if (viewGroup == null || iwVar.n) {
                if (viewGroup == null) {
                    Context contextQ = q();
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme themeNewTheme = contextQ.getResources().newTheme();
                    themeNewTheme.setTo(contextQ.getTheme());
                    themeNewTheme.resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.actionBarPopupTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                    }
                    themeNewTheme.resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.panelMenuListTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                    } else {
                        themeNewTheme.applyStyle(2132083531, true);
                    }
                    us usVar = new us(contextQ, 0);
                    usVar.getTheme().setTo(themeNewTheme);
                    iwVar.j = usVar;
                    TypedArray typedArrayObtainStyledAttributes = usVar.obtainStyledAttributes(jq.j);
                    iwVar.b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                    iwVar.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    iwVar.e = new iv(this, iwVar.j);
                    iwVar.c = 81;
                    if (iwVar.e == null) {
                        return;
                    }
                } else if (iwVar.n && viewGroup.getChildCount() > 0) {
                    iwVar.e.removeAllViews();
                }
                View view = iwVar.g;
                if (view == null) {
                    if (iwVar.h != null) {
                        if (this.L == null) {
                            this.L = new ix(this, 0);
                        }
                        ix ixVar = this.L;
                        if (iwVar.h == null) {
                            expandedMenuView = null;
                        } else {
                            if (iwVar.i == null) {
                                iwVar.i = new ks(iwVar.j);
                                ks ksVar = iwVar.i;
                                ksVar.e = ixVar;
                                iwVar.h.g(ksVar);
                            }
                            ks ksVar2 = iwVar.i;
                            ViewGroup viewGroup2 = iwVar.e;
                            if (ksVar2.d == null) {
                                ksVar2.d = (ExpandedMenuView) ksVar2.b.inflate(com.google.android.GoogleCameraEngR18F1.R.layout.abc_expanded_menu_layout, viewGroup2, false);
                                if (ksVar2.f == null) {
                                    ksVar2.f = new kr(ksVar2);
                                }
                                ksVar2.d.setAdapter((ListAdapter) ksVar2.f);
                                ksVar2.d.setOnItemClickListener(ksVar2);
                            }
                            expandedMenuView = ksVar2.d;
                        }
                        iwVar.f = expandedMenuView;
                        if (iwVar.f != null) {
                        }
                    }
                    iwVar.n = true;
                    return;
                }
                iwVar.f = view;
                if (iwVar.f != null && (iwVar.g != null || iwVar.i.a().getCount() > 0)) {
                    ViewGroup.LayoutParams layoutParams2 = iwVar.f.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    iwVar.e.setBackgroundResource(iwVar.b);
                    ViewParent parent = iwVar.f.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(iwVar.f);
                    }
                    iwVar.e.addView(iwVar.f, layoutParams2);
                    if (iwVar.f.hasFocus()) {
                        i = -2;
                    } else {
                        iwVar.f.requestFocus();
                        i = -2;
                    }
                }
                iwVar.n = true;
                return;
            }
            View view2 = iwVar.g;
            i = (view2 == null || (layoutParams = view2.getLayoutParams()) == null || layoutParams.width != -1) ? -2 : -1;
            iwVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = iwVar.c;
            layoutParams3.windowAnimations = iwVar.d;
            windowManager.addView(iwVar.e, layoutParams3);
            iwVar.m = true;
        }
    }

    private final void S() {
        if (this.r) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void A() {
        ViewGroup viewGroup;
        if (this.r) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.f.obtainStyledAttributes(jq.j);
        if (!typedArrayObtainStyledAttributes.hasValue(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowNoTitle, false)) {
            n(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowActionBar, false)) {
            n(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            n(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            n(10);
        }
        this.x = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        P();
        this.g.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f);
        if (this.y) {
            viewGroup = this.w ? (ViewGroup) layoutInflaterFrom.inflate(com.google.android.GoogleCameraEngR18F1.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.android.GoogleCameraEngR18F1.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.x) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.GoogleCameraEngR18F1.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.v = false;
            this.u = false;
        } else if (this.u) {
            TypedValue typedValue = new TypedValue();
            this.f.getTheme().resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new us(this.f, typedValue.resourceId) : this.f).inflate(com.google.android.GoogleCameraEngR18F1.R.layout.abc_screen_toolbar, (ViewGroup) null);
            nz nzVar = (nz) viewGroup.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.decor_content_parent);
            this.k = nzVar;
            nzVar.o(t());
            if (this.v) {
                this.k.i(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
            }
            if (this.N) {
                this.k.i(2);
            }
            if (this.O) {
                this.k.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.u + ", windowActionBarOverlay: " + this.v + ", android:windowIsFloating: " + this.x + ", windowActionModeOverlay: " + this.w + ", windowNoTitle: " + this.y + " }");
        }
        gl.N(viewGroup, new ij(this));
        if (this.k == null) {
            this.M = (TextView) viewGroup.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.title);
        }
        sd.a(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.g.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.g.setContentView(viewGroup);
        contentFrameLayout.i = new ik(this);
        this.s = viewGroup;
        CharSequence charSequenceU = u();
        if (!TextUtils.isEmpty(charSequenceU)) {
            nz nzVar2 = this.k;
            if (nzVar2 != null) {
                nzVar2.p(charSequenceU);
            } else {
                hu huVar = this.i;
                if (huVar != null) {
                    huVar.j(charSequenceU);
                } else {
                    TextView textView = this.M;
                    if (textView != null) {
                        textView.setText(charSequenceU);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.s.findViewById(R.id.content);
        View decorView = this.g.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (gl.V(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f.obtainStyledAttributes(jq.j);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.c);
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.e);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.f);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.r = true;
        iw iwVarJ = J(0);
        if (this.C || iwVarJ.h != null) {
            return;
        }
        Q(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
    }

    public final void B() {
        A();
        if (this.u && this.i == null) {
            Object obj = this.e;
            if (obj instanceof Activity) {
                this.i = new jp((Activity) obj, this.v);
            } else if (obj instanceof Dialog) {
                this.i = new jp((Dialog) obj);
            }
            hu huVar = this.i;
            if (huVar != null) {
                huVar.f(this.Z);
            }
        }
    }

    @Override // defpackage.ku
    public final void C(kw kwVar) {
        nz nzVar = this.k;
        if (nzVar == null || !nzVar.q() || (ViewConfiguration.get(this.f).hasPermanentMenuKey() && !this.k.s())) {
            iw iwVarJ = J(0);
            iwVarJ.n = true;
            x(iwVarJ, false);
            R(iwVarJ, null);
            return;
        }
        Window.Callback callbackT = t();
        if (this.k.t()) {
            this.k.r();
            if (this.C) {
                return;
            }
            callbackT.onPanelClosed(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, J(0).h);
            return;
        }
        if (callbackT == null || this.C) {
            return;
        }
        if (this.E && (1 & this.F) != 0) {
            this.g.getDecorView().removeCallbacks(this.Y);
            this.Y.run();
        }
        iw iwVarJ2 = J(0);
        kw kwVar2 = iwVarJ2.h;
        if (kwVar2 == null || iwVarJ2.o || !callbackT.onPreparePanel(0, iwVarJ2.g, kwVar2)) {
            return;
        }
        callbackT.onMenuOpened(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, iwVarJ2.h);
        this.k.u();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    final boolean D(KeyEvent keyEvent) {
        boolean zR;
        AudioManager audioManager;
        Object obj = this.e;
        if (((obj instanceof fm) || (obj instanceof ja)) && this.g.getDecorView() != null) {
            int[] iArr = gl.a;
        }
        if (keyEvent.getKeyCode() == 82 && this.h.b.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            switch (keyCode) {
                case 4:
                    this.R = (keyEvent.getFlags() & 128) != 0;
                    return false;
                case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    iw iwVarJ = J(0);
                    if (iwVarJ.m) {
                        return true;
                    }
                    F(iwVarJ, keyEvent);
                    return true;
                default:
                    return false;
            }
        }
        switch (keyCode) {
            case 4:
                boolean z = this.R;
                this.R = false;
                iw iwVarJ2 = J(0);
                if (iwVarJ2.m) {
                    if (z) {
                        return true;
                    }
                    x(iwVarJ2, true);
                    return true;
                }
                jw jwVar = this.l;
                if (jwVar != null) {
                    jwVar.f();
                    return true;
                }
                hu huVarA = a();
                return huVarA != null && huVarA.l();
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                if (this.l != null) {
                    return true;
                }
                iw iwVarJ3 = J(0);
                nz nzVar = this.k;
                if (nzVar == null || !nzVar.q() || ViewConfiguration.get(this.f).hasPermanentMenuKey()) {
                    boolean z2 = iwVarJ3.m;
                    if (z2 || iwVarJ3.l) {
                        x(iwVarJ3, true);
                        zR = z2;
                    } else {
                        if (!iwVarJ3.k) {
                            return true;
                        }
                        if (iwVarJ3.o) {
                            iwVarJ3.k = false;
                            if (!F(iwVarJ3, keyEvent)) {
                                return true;
                            }
                        }
                        R(iwVarJ3, keyEvent);
                    }
                    audioManager = (AudioManager) this.f.getApplicationContext().getSystemService("audio");
                    if (audioManager != null) {
                        audioManager.playSoundEffect(0);
                        return true;
                    }
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                    return true;
                }
                if (this.k.t()) {
                    zR = this.k.r();
                } else {
                    if (this.C || !F(iwVarJ3, keyEvent)) {
                        return true;
                    }
                    zR = this.k.u();
                }
                if (!zR) {
                    return true;
                }
                audioManager = (AudioManager) this.f.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.ku
    public final boolean E(kw kwVar, MenuItem menuItem) {
        iw iwVarS;
        Window.Callback callbackT = t();
        if (callbackT == null || this.C || (iwVarS = s(kwVar.a())) == null) {
            return false;
        }
        return callbackT.onMenuItemSelected(iwVarS.a, menuItem);
    }

    public final boolean F(iw iwVar, KeyEvent keyEvent) {
        nz nzVar;
        Resources.Theme themeNewTheme;
        nz nzVar2;
        nz nzVar3;
        if (this.C) {
            return false;
        }
        if (iwVar.k) {
            return true;
        }
        iw iwVar2 = this.z;
        if (iwVar2 != null && iwVar2 != iwVar) {
            x(iwVar2, false);
        }
        Window.Callback callbackT = t();
        if (callbackT != null) {
            iwVar.g = callbackT.onCreatePanelView(iwVar.a);
        }
        int i = iwVar.a;
        boolean z = i == 0 || i == 108;
        if (z && (nzVar3 = this.k) != null) {
            nzVar3.n();
        }
        if (iwVar.g == null && (!z || !(this.i instanceof jh))) {
            kw kwVar = iwVar.h;
            if (kwVar == null || iwVar.o) {
                if (kwVar == null) {
                    Context context = this.f;
                    int i2 = iwVar.a;
                    if ((i2 == 0 || i2 == 108) && this.k != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            us usVar = new us(context, 0);
                            usVar.getTheme().setTo(themeNewTheme);
                            context = usVar;
                        }
                    }
                    kw kwVar2 = new kw(context);
                    kwVar2.b = this;
                    iwVar.a(kwVar2);
                    if (iwVar.h == null) {
                        return false;
                    }
                }
                if (z && this.k != null) {
                    if (this.ab == null) {
                        this.ab = new ix(this, 1);
                    }
                    this.k.m(iwVar.h, this.ab);
                }
                iwVar.h.s();
                if (!callbackT.onCreatePanelMenu(iwVar.a, iwVar.h)) {
                    iwVar.a(null);
                    if (z && (nzVar = this.k) != null) {
                        nzVar.m(null, this.ab);
                    }
                    return false;
                }
                iwVar.o = false;
            }
            iwVar.h.s();
            Bundle bundle = iwVar.p;
            if (bundle != null) {
                iwVar.h.n(bundle);
                iwVar.p = null;
            }
            if (!callbackT.onPreparePanel(0, iwVar.g, iwVar.h)) {
                if (z && (nzVar2 = this.k) != null) {
                    nzVar2.m(null, this.ab);
                }
                iwVar.h.r();
                return false;
            }
            iwVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            iwVar.h.r();
        }
        iwVar.k = true;
        iwVar.l = false;
        this.z = iwVar;
        return true;
    }

    final boolean G() {
        ViewGroup viewGroup;
        return this.r && (viewGroup = this.s) != null && gl.V(viewGroup);
    }

    public final void H() {
        L(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final View I(String str, Context context, AttributeSet attributeSet) {
        View viewE;
        if (this.aa == null) {
            String string = this.f.obtainStyledAttributes(jq.j).getString(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.aa = new AppCompatViewInflater();
            } else {
                try {
                    this.aa = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    this.aa = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.aa;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jq.x, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        Context usVar = (resourceId == 0 || ((context instanceof us) && ((us) context).a == resourceId)) ? context : new us(context, resourceId);
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -938935918:
                if (!str.equals("TextView")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -339785223:
                if (!str.equals("Spinner")) {
                    b = -1;
                }
                break;
            case 776382189:
                if (!str.equals("RadioButton")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case 1125864064:
                if (!str.equals("ImageView")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1666676343:
                if (!str.equals("EditText")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 2001146706:
                if (!str.equals("Button")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        View view = null;
        switch (b) {
            case 0:
                viewE = appCompatViewInflater.e(usVar, attributeSet);
                break;
            case 1:
                viewE = new AppCompatImageView(usVar, attributeSet);
                break;
            case 2:
                viewE = appCompatViewInflater.b(usVar, attributeSet);
                break;
            case 3:
                viewE = new mv(usVar, attributeSet);
                break;
            case 4:
                viewE = new nq(usVar, attributeSet);
                break;
            case 5:
                viewE = new mw(usVar, attributeSet);
                break;
            case 6:
                viewE = appCompatViewInflater.c(usVar, attributeSet);
                break;
            case 7:
                viewE = appCompatViewInflater.d(usVar, attributeSet);
                break;
            case 8:
                viewE = new mr(usVar, attributeSet);
                break;
            case 9:
                viewE = appCompatViewInflater.a(usVar, attributeSet);
                break;
            case 10:
                viewE = new my(usVar, attributeSet);
                break;
            case 11:
                viewE = new nc(usVar, attributeSet);
                break;
            case 12:
                viewE = new ne(usVar, attributeSet);
                break;
            case 13:
                viewE = new nw(usVar, attributeSet);
                break;
            default:
                viewE = null;
                break;
        }
        if (viewE != null || context == usVar) {
            view = viewE;
        } else {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = appCompatViewInflater.c;
                objArr[0] = usVar;
                objArr[1] = attributeSet;
                if (str.indexOf(46) == -1) {
                    int i = 0;
                    while (true) {
                        if (i >= 3) {
                            Object[] objArr2 = appCompatViewInflater.c;
                            objArr2[0] = null;
                            objArr2[1] = null;
                        } else {
                            viewE = appCompatViewInflater.f(usVar, str, AppCompatViewInflater.b[i]);
                            if (viewE != null) {
                                Object[] objArr3 = appCompatViewInflater.c;
                                objArr3[0] = null;
                                objArr3[1] = null;
                                view = viewE;
                            } else {
                                i++;
                            }
                        }
                    }
                } else {
                    View viewF = appCompatViewInflater.f(usVar, str, null);
                    Object[] objArr4 = appCompatViewInflater.c;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    view = viewF;
                }
            } catch (Exception e) {
                Object[] objArr5 = appCompatViewInflater.c;
                objArr5[0] = null;
                objArr5[1] = null;
            } catch (Throwable th2) {
                Object[] objArr6 = appCompatViewInflater.c;
                objArr6[0] = null;
                objArr6[1] = null;
                throw th2;
            }
        }
        if (view != null) {
            Context context2 = view.getContext();
            if ((context2 instanceof ContextWrapper) && gl.S(view)) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, AppCompatViewInflater.a);
                String string2 = typedArrayObtainStyledAttributes2.getString(0);
                if (string2 != null) {
                    view.setOnClickListener(new jb(view, string2));
                }
                typedArrayObtainStyledAttributes2.recycle();
            }
        }
        return view;
    }

    public final iw J(int i) {
        iw[] iwVarArr = this.Q;
        if (iwVarArr == null || iwVarArr.length <= i) {
            iw[] iwVarArr2 = new iw[i + 1];
            if (iwVarArr != null) {
                System.arraycopy(iwVarArr, 0, iwVarArr2, 0, iwVarArr.length);
            }
            this.Q = iwVarArr2;
            iwVarArr = iwVarArr2;
        }
        iw iwVar = iwVarArr[i];
        if (iwVar != null) {
            return iwVar;
        }
        iw iwVar2 = new iw(i);
        iwVarArr[i] = iwVar2;
        return iwVar2;
    }

    public final boolean K(iw iwVar, int i, KeyEvent keyEvent) {
        kw kwVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iwVar.k || F(iwVar, keyEvent)) && (kwVar = iwVar.h) != null) {
            return kwVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L(boolean z) {
        Configuration configuration;
        int i;
        Object obj;
        Activity activity;
        Object obj2;
        if (this.C) {
            return;
        }
        int iO = o();
        Configuration configurationR = r(this.f, p(this.f, iO), null);
        boolean z2 = false;
        if (this.V || !(this.e instanceof Activity)) {
            this.V = true;
            z2 = this.U;
        } else {
            PackageManager packageManager = this.f.getPackageManager();
            if (packageManager != null) {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f, this.e.getClass()), 269221888);
                    this.U = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
                } catch (PackageManager.NameNotFoundException e) {
                    this.U = false;
                }
                this.V = true;
                z2 = this.U;
            }
        }
        int i2 = this.f.getResources().getConfiguration().uiMode & 48;
        int i3 = configurationR.uiMode & 48;
        if (i2 != i3 && z && !z2 && this.A && (c || this.S)) {
            Object obj3 = this.e;
            if ((obj3 instanceof Activity) && !((Activity) obj3).isChild()) {
                ((Activity) this.e).recreate();
            } else if (i2 != i3) {
                Resources resources = this.f.getResources();
                configuration = new Configuration(resources.getConfiguration());
                configuration.uiMode = i3 | (resources.getConfiguration().uiMode & (-49));
                resources.updateConfiguration(configuration, null);
                i = this.D;
                if (i != 0) {
                    this.f.setTheme(i);
                    this.f.getTheme().applyStyle(this.D, true);
                }
                if (z2) {
                    obj = this.e;
                    if (obj instanceof Activity) {
                        activity = (Activity) obj;
                        if (activity instanceof aee) {
                            if (((aee) activity).C().a.a(aea.STARTED)) {
                                activity.onConfigurationChanged(configuration);
                            }
                        } else if (this.B) {
                            activity.onConfigurationChanged(configuration);
                        }
                    }
                }
            }
            obj2 = this.e;
            if (obj2 instanceof ih) {
            }
        } else if (i2 != i3) {
            Resources resources2 = this.f.getResources();
            configuration = new Configuration(resources2.getConfiguration());
            configuration.uiMode = i3 | (resources2.getConfiguration().uiMode & (-49));
            resources2.updateConfiguration(configuration, null);
            i = this.D;
            if (i != 0) {
                this.f.setTheme(i);
                this.f.getTheme().applyStyle(this.D, true);
            }
            if (z2) {
                obj = this.e;
                if (obj instanceof Activity) {
                    activity = (Activity) obj;
                    if (activity instanceof aee) {
                        if (((aee) activity).C().a.a(aea.STARTED)) {
                            activity.onConfigurationChanged(configuration);
                        }
                    } else if (this.B) {
                        activity.onConfigurationChanged(configuration);
                    }
                }
            }
            obj2 = this.e;
            if (obj2 instanceof ih) {
            }
        }
        if (iO == 0) {
            N(this.f).d();
        } else {
            it itVar = this.W;
            if (itVar != null) {
                itVar.c();
            }
            if (iO == 3) {
                M(this.f).d();
                return;
            }
        }
        it itVar2 = this.X;
        if (itVar2 != null) {
            itVar2.c();
        }
    }

    @Override // defpackage.ii
    public final hu a() {
        B();
        return this.i;
    }

    @Override // defpackage.ii
    public final View b(int i) {
        A();
        return this.g.findViewById(i);
    }

    @Override // defpackage.ii
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ((ViewGroup) this.s.findViewById(R.id.content)).addView(view, layoutParams);
        this.h.b.onContentChanged();
    }

    @Override // defpackage.ii
    public final void d() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // defpackage.ii
    public final void e() {
        hu huVarA = a();
        if (huVarA == null || !huVarA.m()) {
            Q(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    @Override // defpackage.ii
    public final void f() {
        if (this.e instanceof Activity) {
            synchronized (ii.b) {
                ii.h(this);
            }
        }
        if (this.E) {
            this.g.getDecorView().removeCallbacks(this.Y);
        }
        this.B = false;
        this.C = true;
        if (this.T != -100) {
            Object obj = this.e;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                I.put(this.e.getClass().getName(), Integer.valueOf(this.T));
            } else {
                I.remove(this.e.getClass().getName());
            }
        } else {
            I.remove(this.e.getClass().getName());
        }
        hu huVar = this.i;
        if (huVar != null) {
            huVar.e();
        }
        it itVar = this.W;
        if (itVar != null) {
            itVar.c();
        }
        it itVar2 = this.X;
        if (itVar2 != null) {
            itVar2.c();
        }
    }

    @Override // defpackage.ii
    public final void g() {
        this.B = false;
        hu huVarA = a();
        if (huVarA != null) {
            huVarA.h(false);
        }
    }

    @Override // defpackage.ii
    public final void i(int i) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f).inflate(i, viewGroup);
        this.h.b.onContentChanged();
    }

    @Override // defpackage.ii
    public final void j(View view) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.h.b.onContentChanged();
    }

    @Override // defpackage.ii
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.h.b.onContentChanged();
    }

    @Override // defpackage.ii
    public final void l(CharSequence charSequence) {
        this.K = charSequence;
        nz nzVar = this.k;
        if (nzVar != null) {
            nzVar.p(charSequence);
            return;
        }
        hu huVar = this.i;
        if (huVar != null) {
            huVar.j(charSequence);
            return;
        }
        TextView textView = this.M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.ii
    public final void m() {
        String strS;
        this.A = true;
        L(false);
        P();
        Object obj = this.e;
        if (obj instanceof Activity) {
            try {
                strS = d.s((Activity) obj);
            } catch (IllegalArgumentException e) {
                strS = null;
            }
            if (strS != null) {
                hu huVar = this.i;
                if (huVar == null) {
                    this.Z = true;
                } else {
                    huVar.f(true);
                }
            }
            synchronized (ii.b) {
                ii.h(this);
                ii.a.add(new WeakReference(this));
            }
        }
        this.S = true;
    }

    @Override // defpackage.ii
    public final void n(int i) {
        if (i == 8) {
            i = com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
        } else if (i == 9) {
            i = com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
        }
        if (this.y && i == 108) {
        }
        if (this.u && i == 1) {
            this.u = false;
        }
        switch (i) {
            case 1:
                S();
                this.y = true;
                break;
            case 2:
                S();
                this.N = true;
                break;
            case 5:
                S();
                this.O = true;
                break;
            case 10:
                S();
                this.w = true;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                S();
                this.u = true;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                S();
                this.v = true;
                break;
            default:
                this.g.requestFeature(i);
                break;
        }
    }

    public final int o() {
        int i = this.T;
        if (i != -100) {
            return i;
        }
        return -100;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return I(str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return I(str, context, attributeSet);
    }

    final int p(Context context, int i) {
        long j;
        boolean z;
        switch (i) {
            case -100:
                return -1;
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
            case 1:
            case 2:
                return i;
            case 0:
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                jk jkVar = ((iu) N(context)).a;
                jj jjVar = jkVar.c;
                if (jjVar.b > System.currentTimeMillis()) {
                    z = jjVar.a;
                } else {
                    Location locationA = d.k(jkVar.b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? jkVar.a("network") : null;
                    Location locationA2 = d.k(jkVar.b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? jkVar.a("gps") : null;
                    if (locationA2 == null || locationA == null ? locationA2 != null : locationA2.getTime() > locationA.getTime()) {
                        locationA = locationA2;
                    }
                    if (locationA == null) {
                        int i2 = Calendar.getInstance().get(11);
                        return (i2 < 6 || i2 >= 22) ? 2 : 1;
                    }
                    jj jjVar2 = jkVar.c;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (ji.a == null) {
                        ji.a = new ji();
                    }
                    ji jiVar = ji.a;
                    jiVar.a(jCurrentTimeMillis - 86400000, locationA.getLatitude(), locationA.getLongitude());
                    long j2 = jiVar.b;
                    jiVar.a(jCurrentTimeMillis, locationA.getLatitude(), locationA.getLongitude());
                    int i3 = jiVar.d;
                    long j3 = jiVar.c;
                    long j4 = jiVar.b;
                    jiVar.a(jCurrentTimeMillis + 86400000, locationA.getLatitude(), locationA.getLongitude());
                    long j5 = jiVar.c;
                    if (j3 == -1 || j4 == -1) {
                        j = 43200000 + jCurrentTimeMillis;
                    } else {
                        if (jCurrentTimeMillis > j4) {
                            j3 = j5;
                        } else if (jCurrentTimeMillis > j3) {
                            j3 = j4;
                        }
                        j = j3 + 60000;
                    }
                    jjVar2.a = 1 == i3;
                    jjVar2.b = j;
                    z = jjVar.a;
                }
                return !z ? 1 : 2;
            case 3:
                return ((ir) M(context)).a.isPowerSaveMode() ? 2 : 1;
            default:
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        }
    }

    final Context q() {
        hu huVarA = a();
        Context contextB = huVarA != null ? huVarA.b() : null;
        return contextB == null ? this.f : contextB;
    }

    public final Configuration r(Context context, int i, Configuration configuration) {
        int i2;
        switch (Pref.MenuValue("pref_color_key")) {
            case 1:
                i2 = 16;
                break;
            case 2:
                i2 = 32;
                break;
            default:
                i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                break;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    final iw s(Menu menu) {
        iw[] iwVarArr = this.Q;
        int length = iwVarArr != null ? iwVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            iw iwVar = iwVarArr[i];
            if (iwVar != null && iwVar.h == menu) {
                return iwVar;
            }
        }
        return null;
    }

    final Window.Callback t() {
        return this.g.getCallback();
    }

    public final CharSequence u() {
        Object obj = this.e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.K;
    }

    final void v(int i, iw iwVar, Menu menu) {
        if (menu == null) {
            menu = iwVar.h;
        }
        if (!iwVar.m || this.C) {
            return;
        }
        this.h.b.onPanelClosed(i, menu);
    }

    final void w(kw kwVar) {
        if (this.P) {
            return;
        }
        this.P = true;
        this.k.g();
        Window.Callback callbackT = t();
        if (callbackT != null && !this.C) {
            callbackT.onPanelClosed(com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, kwVar);
        }
        this.P = false;
    }

    final void x(iw iwVar, boolean z) {
        ViewGroup viewGroup;
        nz nzVar;
        if (z && iwVar.a == 0 && (nzVar = this.k) != null && nzVar.t()) {
            w(iwVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f.getSystemService("window");
        if (windowManager != null && iwVar.m && (viewGroup = iwVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                v(iwVar.a, iwVar, null);
            }
        }
        iwVar.k = false;
        iwVar.l = false;
        iwVar.m = false;
        iwVar.f = null;
        iwVar.n = true;
        if (this.z == iwVar) {
            this.z = null;
        }
    }

    final void y(int i) {
        iw iwVarJ = J(i);
        if (iwVarJ.h != null) {
            Bundle bundle = new Bundle();
            iwVarJ.h.o(bundle);
            if (bundle.size() > 0) {
                iwVarJ.p = bundle;
            }
            iwVarJ.h.s();
            iwVarJ.h.clear();
        }
        iwVarJ.o = true;
        iwVarJ.n = true;
        if ((i == 108 || i == 0) && this.k != null) {
            iw iwVarJ2 = J(0);
            iwVarJ2.k = false;
            F(iwVarJ2, null);
        }
    }

    public final void z() {
        go goVar = this.p;
        if (goVar != null) {
            goVar.a();
        }
    }
}
