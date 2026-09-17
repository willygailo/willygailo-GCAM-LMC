package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class ks implements AdapterView.OnItemClickListener, lk {
    Context a;
    public LayoutInflater b;
    kw c;
    public ExpandedMenuView d;
    public lj e;
    public kr f;

    public ks(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new kr(this);
        }
        return this.f;
    }

    @Override // defpackage.lk
    public final void b(Context context, kw kwVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = kwVar;
        kr krVar = this.f;
        if (krVar != null) {
            krVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.lk
    public final void c(kw kwVar, boolean z) {
        lj ljVar = this.e;
        if (ljVar != null) {
            ljVar.a(kwVar, z);
        }
    }

    @Override // defpackage.lk
    public final void d(lj ljVar) {
        throw null;
    }

    @Override // defpackage.lk
    public final boolean e() {
        return false;
    }

    @Override // defpackage.lk
    public final boolean f(ls lsVar) {
        if (!lsVar.hasVisibleItems()) {
            return false;
        }
        kx kxVar = new kx(lsVar);
        kw kwVar = kxVar.a;
        id idVar = new id(kwVar.a);
        kxVar.c = new ks(idVar.a());
        ks ksVar = kxVar.c;
        ksVar.e = kxVar;
        kxVar.a.g(ksVar);
        ListAdapter listAdapterA = kxVar.c.a();
        hz hzVar = idVar.a;
        hzVar.o = listAdapterA;
        hzVar.p = kxVar;
        View view = kwVar.g;
        if (view != null) {
            hzVar.e = view;
        } else {
            idVar.d(kwVar.f);
            idVar.i(kwVar.e);
        }
        idVar.g(kxVar);
        kxVar.b = idVar.b();
        kxVar.b.setOnDismissListener(kxVar);
        WindowManager.LayoutParams attributes = kxVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        kxVar.b.show();
        lj ljVar = this.e;
        if (ljVar == null) {
            return true;
        }
        ljVar.b(lsVar);
        return true;
    }

    @Override // defpackage.lk
    public final boolean g(kz kzVar) {
        return false;
    }

    @Override // defpackage.lk
    public final boolean h(kz kzVar) {
        return false;
    }

    @Override // defpackage.lk
    public final void i() {
        kr krVar = this.f;
        if (krVar != null) {
            krVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
