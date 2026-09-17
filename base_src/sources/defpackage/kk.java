package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
class kk {
    final Context a;
    public xf b;

    public kk(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof es)) {
            return menuItem;
        }
        es esVar = (es) menuItem;
        if (this.b == null) {
            this.b = new xf();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        lf lfVar = new lf(this.a, esVar);
        this.b.put(esVar, lfVar);
        return lfVar;
    }
}
