package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class iq extends kf {
    final /* synthetic */ iy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(iy iyVar, Window.Callback callback) {
        super(callback);
        this.a = iyVar;
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.D(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            iy iyVar = this.a;
            int keyCode = keyEvent.getKeyCode();
            hu huVarA = iyVar.a();
            if (huVarA == null || !huVarA.n(keyCode, keyEvent)) {
                iw iwVar = iyVar.z;
                if (iwVar == null || !iyVar.K(iwVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (iyVar.z == null) {
                        iw iwVarJ = iyVar.J(0);
                        iyVar.F(iwVarJ, keyEvent);
                        boolean zK = iyVar.K(iwVarJ, keyEvent.getKeyCode(), keyEvent);
                        iwVarJ.k = false;
                        if (!zK) {
                        }
                    }
                    return false;
                }
                iw iwVar2 = iyVar.z;
                if (iwVar2 != null) {
                    iwVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof kw)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        hu huVarA;
        super.onMenuOpened(i, menu);
        iy iyVar = this.a;
        if (i == 108 && (huVarA = iyVar.a()) != null) {
            huVarA.d(true);
        }
        return true;
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        iy iyVar = this.a;
        if (i == 108) {
            hu huVarA = iyVar.a();
            if (huVarA != null) {
                huVarA.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            iw iwVarJ = iyVar.J(0);
            if (iwVarJ.m) {
                iyVar.x(iwVarJ, false);
            }
        }
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        kw kwVar = menu instanceof kw ? (kw) menu : null;
        if (i == 0) {
            if (kwVar == null) {
                return false;
            }
            i = 0;
        }
        if (kwVar != null) {
            kwVar.i = true;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (kwVar != null) {
            kwVar.i = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        kw kwVar = this.a.J(0).h;
        if (kwVar != null) {
            super.onProvideKeyboardShortcuts(list, kwVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.kf, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Context usVar;
        iy iyVar = this.a;
        if (iyVar.q) {
            switch (i) {
                case 0:
                    jy jyVar = new jy(iyVar.f, callback);
                    iy iyVar2 = this.a;
                    jw jwVar = iyVar2.l;
                    if (jwVar != null) {
                        jwVar.f();
                    }
                    ip ipVar = new ip(iyVar2, jyVar);
                    hu huVarA = iyVar2.a();
                    if (huVarA != null) {
                        iyVar2.l = huVarA.c(ipVar);
                    }
                    jw jwVar2 = iyVar2.l;
                    if (jwVar2 == null) {
                        iyVar2.z();
                        jw jwVar3 = iyVar2.l;
                        if (jwVar3 != null) {
                            jwVar3.f();
                        }
                        if (iyVar2.m == null) {
                            if (iyVar2.x) {
                                TypedValue typedValue = new TypedValue();
                                Resources.Theme theme = iyVar2.f.getTheme();
                                theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    Resources.Theme themeNewTheme = iyVar2.f.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                                    usVar = new us(iyVar2.f, 0);
                                    usVar.getTheme().setTo(themeNewTheme);
                                } else {
                                    usVar = iyVar2.f;
                                }
                                iyVar2.m = new ActionBarContextView(usVar);
                                iyVar2.n = new PopupWindow(usVar, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                                hr.b(iyVar2.n, 2);
                                iyVar2.n.setContentView(iyVar2.m);
                                iyVar2.n.setWidth(-1);
                                usVar.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                                iyVar2.m.e = TypedValue.complexToDimensionPixelSize(typedValue.data, usVar.getResources().getDisplayMetrics());
                                iyVar2.n.setHeight(-2);
                                iyVar2.o = new im(iyVar2, 0);
                            } else {
                                ViewStubCompat viewStubCompat = (ViewStubCompat) iyVar2.s.findViewById(R.id.action_mode_bar_stub);
                                if (viewStubCompat != null) {
                                    viewStubCompat.a = LayoutInflater.from(iyVar2.q());
                                    iyVar2.m = (ActionBarContextView) viewStubCompat.a();
                                }
                            }
                        }
                        if (iyVar2.m != null) {
                            iyVar2.z();
                            iyVar2.m.i();
                            jx jxVar = new jx(iyVar2.m.getContext(), iyVar2.m, ipVar);
                            if (ipVar.c(jxVar, jxVar.a)) {
                                jxVar.g();
                                iyVar2.m.h(jxVar);
                                iyVar2.l = jxVar;
                                if (iyVar2.G()) {
                                    iyVar2.m.setAlpha(0.0f);
                                    go goVarP = gl.p(iyVar2.m);
                                    goVarP.b(1.0f);
                                    iyVar2.p = goVarP;
                                    iyVar2.p.d(new in(iyVar2));
                                } else {
                                    iyVar2.m.setAlpha(1.0f);
                                    iyVar2.m.setVisibility(0);
                                    iyVar2.m.sendAccessibilityEvent(32);
                                    if (iyVar2.m.getParent() instanceof View) {
                                        gl.D((View) iyVar2.m.getParent());
                                    }
                                }
                                if (iyVar2.n != null) {
                                    iyVar2.g.getDecorView().post(iyVar2.o);
                                }
                            } else {
                                iyVar2.l = null;
                            }
                        }
                        jwVar2 = iyVar2.l;
                    }
                    if (jwVar2 != null) {
                        return jyVar.e(jwVar2);
                    }
                    return null;
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
