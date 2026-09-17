package defpackage;

import android.view.Menu;

/* JADX INFO: loaded from: classes2.dex */
final class jc implements Runnable {
    final /* synthetic */ jh a;

    public jc(jh jhVar) {
        this.a = jhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jh jhVar = this.a;
        Menu menuV = jhVar.v();
        Menu menu = true != (menuV instanceof kw) ? null : menuV;
        if (menu != null) {
            ((kw) menu).s();
        }
        try {
            menuV.clear();
            if (!jhVar.c.onCreatePanelMenu(0, menuV) || !jhVar.c.onPreparePanel(0, null, menuV)) {
                menuV.clear();
            }
            if (menu != null) {
            }
        } finally {
            if (menu != null) {
                ((kw) menu).r();
            }
        }
    }
}
