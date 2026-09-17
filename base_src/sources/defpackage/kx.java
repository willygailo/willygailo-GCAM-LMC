package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
final class kx implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, lj {
    public final kw a;
    public ie b;
    ks c;

    public kx(kw kwVar) {
        this.a = kwVar;
    }

    @Override // defpackage.lj
    public final void a(kw kwVar, boolean z) {
        ie ieVar;
        if ((z || kwVar == this.a) && (ieVar = this.b) != null) {
            ieVar.dismiss();
        }
    }

    @Override // defpackage.lj
    public final boolean b(kw kwVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.z(((kr) this.c.a()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82) {
            if (keyEvent.getAction() != 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.i(true);
                dialogInterface.dismiss();
                return true;
            }
        } else if (i == 4) {
            i = 4;
            if (keyEvent.getAction() != 0) {
                if (keyEvent.getAction() == 1) {
                    this.a.i(true);
                    dialogInterface.dismiss();
                    return true;
                }
            } else if (keyEvent.getAction() == 1) {
                this.a.i(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }
}
