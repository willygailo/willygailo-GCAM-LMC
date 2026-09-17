package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public class ds extends Activity implements aee, fm {
    private final aeb a = new aeb(this);

    @Override // defpackage.aee
    public aeb C() {
        return this.a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            int[] iArr = gl.a;
        }
        return eu.d(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            int[] iArr = gl.a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.fm
    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aer.b(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        aeb aebVar = this.a;
        aea aeaVar = aea.CREATED;
        aeb.f("markState");
        aebVar.e(aeaVar);
        super.onSaveInstanceState(bundle);
    }
}
