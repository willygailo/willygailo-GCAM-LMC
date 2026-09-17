package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jy implements jv {
    public final ActionMode.Callback a;
    public final Context b;
    final ArrayList c = new ArrayList();
    final xf d = new xf();

    public jy(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.jv
    public final void a(jw jwVar) {
        throw null;
    }

    @Override // defpackage.jv
    public final boolean b(jw jwVar, MenuItem menuItem) {
        throw null;
    }

    @Override // defpackage.jv
    public final boolean c(jw jwVar, Menu menu) {
        throw null;
    }

    @Override // defpackage.jv
    public final void d(jw jwVar, Menu menu) {
        throw null;
    }

    public final ActionMode e(jw jwVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            jz jzVar = (jz) this.c.get(i);
            if (jzVar != null && jzVar.b == jwVar) {
                return jzVar;
            }
        }
        jz jzVar2 = new jz(this.b, jwVar);
        this.c.add(jzVar2);
        return jzVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Menu f(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        ln lnVar = new ln(this.b, menu);
        this.d.put(menu, lnVar);
        return lnVar;
    }
}
