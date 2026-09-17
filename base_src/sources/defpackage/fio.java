package defpackage;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class fio extends ih {
    private int k;
    protected final fhv t = new fhv();
    protected final enl u = new enl();

    private final void k() {
        this.k--;
    }

    private final void l() {
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.t.b(new cez(8));
        }
    }

    @Override // defpackage.ih, defpackage.ds, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (((Boolean) this.t.a(new fhg(1), false)).booleanValue()) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        if (((Boolean) this.t.a(new BiFunction() { // from class: fhf
            @Override // j$.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                fik fikVar = (fik) obj;
                Boolean bool = (Boolean) obj2;
                int i = fhv.k;
                if (!bool.booleanValue() && (fikVar instanceof fgh) && ((fgh) fikVar).a()) {
                    return true;
                }
                return bool;
            }
        }, false)).booleanValue()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void finish() {
        this.t.b(cez.i);
        super.finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.t.b(cez.j);
        super.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.t.b(cez.k);
        super.onActionModeStarted(actionMode);
    }

    @Override // defpackage.by, defpackage.ub, android.app.Activity
    protected final void onActivityResult(final int i, final int i2, Intent intent) {
        this.t.b(new Consumer() { // from class: fht
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                int i3 = i;
                int i4 = i2;
                fik fikVar = (fik) obj;
                int i5 = fhv.k;
                if (fikVar instanceof fhw) {
                    ((fhw) fikVar).b(i3, i4);
                }
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        fhv fhvVar = this.t;
        fhc fhcVar = fhc.b;
        fhvVar.d(fhcVar);
        fhvVar.j = fhcVar;
        super.onAttachedToWindow();
    }

    @Override // defpackage.ub, android.app.Activity
    public void onBackPressed() {
        if (((Boolean) this.t.a(fhg.a, false)).booleanValue()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.ih, defpackage.by, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(final Configuration configuration) {
        this.t.b(new Consumer() { // from class: fha
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                Configuration configuration2 = configuration;
                fik fikVar = (fik) obj;
                int i = fhv.k;
                if (fikVar instanceof fgm) {
                    ((fgm) fikVar).y(configuration2);
                }
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return ((Boolean) this.t.a(new fhg(4), false)).booleanValue();
    }

    @Override // defpackage.by, defpackage.ub, defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.u.h();
        fhv fhvVar = this.t;
        fhb fhbVar = new fhb(bundle, 2);
        fhvVar.d(fhbVar);
        fhvVar.c = fhbVar;
        super.onCreate(bundle);
        this.u.g();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.t.b(new gui(1));
    }

    @Override // defpackage.ub, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (((Boolean) this.t.a(new fhg(2), false)).booleanValue()) {
            return true;
        }
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // defpackage.ih, defpackage.by, android.app.Activity
    protected void onDestroy() {
        this.u.j();
        fhv fhvVar = this.t;
        fhvVar.c(fhvVar.h);
        fhvVar.c(fhvVar.g);
        fhvVar.c(fhvVar.f);
        fhvVar.c(fhvVar.c);
        fhvVar.b(cez.o);
        super.onDestroy();
        this.u.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        fhv fhvVar = this.t;
        fhvVar.c(fhvVar.j);
        fhvVar.b(cez.l);
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public final /* synthetic */ void onGetDirectActions(CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        Consumer.VivifiedWrapper.convert(consumer);
        this.t.b(new cez(9));
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(final int i, final KeyEvent keyEvent) {
        if (((Boolean) this.t.a(new BiFunction() { // from class: fhd
            @Override // j$.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i2 = i;
                KeyEvent keyEvent2 = keyEvent;
                fik fikVar = (fik) obj;
                Boolean bool = (Boolean) obj2;
                int i3 = fhv.k;
                if (!bool.booleanValue() && (fikVar instanceof fgo) && ((fgo) fikVar).f(i2, keyEvent2)) {
                    return true;
                }
                return bool;
            }
        }, false)).booleanValue()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(final int i, KeyEvent keyEvent) {
        if (((Boolean) this.t.a(new BiFunction() { // from class: fhe
            @Override // j$.util.function.BiFunction
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i2 = i;
                fik fikVar = (fik) obj;
                Boolean bool = (Boolean) obj2;
                int i3 = fhv.k;
                if (!bool.booleanValue() && (fikVar instanceof fgp) && ((fgp) fikVar).i(i2)) {
                    return true;
                }
                return bool;
            }
        }, false)).booleanValue()) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.by, android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.t.b(cez.p);
        super.onLowMemory();
    }

    @Override // defpackage.by, android.app.Activity
    protected void onNewIntent(final Intent intent) {
        this.t.b(new Consumer() { // from class: fgz
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                Intent intent2 = intent;
                fik fikVar = (fik) obj;
                int i = fhv.k;
                if (fikVar instanceof fgq) {
                    ((fgq) fikVar).z(intent2);
                }
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        super.onNewIntent(intent);
    }

    @Override // defpackage.ub, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (((Boolean) this.t.a(new fhg(5), false)).booleanValue()) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.by, android.app.Activity
    protected void onPause() {
        this.u.l();
        fhv fhvVar = this.t;
        fhvVar.c(fhvVar.i);
        fhvVar.c(fhvVar.e);
        fhvVar.b(cez.q);
        super.onPause();
        this.u.k();
    }

    @Override // android.app.Activity
    public final /* synthetic */ void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        Consumer.VivifiedWrapper.convert(consumer);
        this.t.b(new cez(10));
    }

    @Override // defpackage.ih, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        fhv fhvVar = this.t;
        fhb fhbVar = new fhb(bundle, 1);
        fhvVar.d(fhbVar);
        fhvVar.g = fhbVar;
        super.onPostCreate(bundle);
    }

    @Override // defpackage.ih, defpackage.by, android.app.Activity
    protected final void onPostResume() {
        fhv fhvVar = this.t;
        fhc fhcVar = fhc.a;
        fhvVar.d(fhcVar);
        fhvVar.i = fhcVar;
        super.onPostResume();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (((Boolean) this.t.a(new fhg(3), false)).booleanValue()) {
            return true;
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.by, defpackage.ub, android.app.Activity
    public void onRequestPermissionsResult(final int i, final String[] strArr, final int[] iArr) {
        this.t.b(new Consumer() { // from class: fhh
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                String[] strArr2 = strArr;
                int[] iArr2 = iArr;
                fik fikVar = (fik) obj;
                int i3 = fhv.k;
                if (fikVar instanceof fgt) {
                    ((fgt) fikVar).f(i2, strArr2, iArr2);
                }
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        fhv fhvVar = this.t;
        fhb fhbVar = new fhb(bundle, 0);
        fhvVar.d(fhbVar);
        fhvVar.h = fhbVar;
        super.onRestoreInstanceState(bundle);
    }

    @Override // defpackage.by, android.app.Activity
    protected void onResume() {
        this.u.n();
        fhv fhvVar = this.t;
        fhc fhcVar = fhc.f;
        fhvVar.d(fhcVar);
        fhvVar.e = fhcVar;
        super.onResume();
        this.u.m();
    }

    @Override // defpackage.ub, defpackage.ds, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        fhv fhvVar = this.t;
        fhb fhbVar = new fhb(bundle, 3);
        fhvVar.d(fhbVar);
        fhvVar.f = fhbVar;
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.ih, defpackage.by, android.app.Activity
    protected void onStart() {
        this.u.p();
        fhv fhvVar = this.t;
        fhc fhcVar = fhc.g;
        fhvVar.d(fhcVar);
        fhvVar.d = fhcVar;
        super.onStart();
        this.u.o();
    }

    @Override // defpackage.ih, defpackage.by, android.app.Activity
    protected void onStop() {
        this.u.r();
        fhv fhvVar = this.t;
        fhvVar.c(fhvVar.d);
        fhvVar.b(cez.r);
        super.onStop();
        this.u.q();
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        this.t.b(cez.m);
        super.onUserInteraction();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        this.t.b(cez.n);
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.t.b(new ieo(z, 1));
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        l();
        super.startActivity(intent);
        k();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        l();
        super.startActivity(intent, bundle);
        k();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        l();
        super.startActivityForResult(intent, i);
        k();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        l();
        super.startActivityForResult(intent, i, bundle);
        k();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        l();
        super.startActivityFromFragment(fragment, intent, i);
        k();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        l();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        k();
    }
}
