package defpackage;

import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class dq {
    public final ViewGroup a;
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    boolean d = false;

    public dq(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    static dq b(ViewGroup viewGroup, cu cuVar) {
        cuVar.Z();
        return g(viewGroup);
    }

    public static void f(dp dpVar) {
        d.o(dpVar.e, dpVar.a.M);
    }

    static dq g(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof dq) {
            return (dq) tag;
        }
        dq dqVar = new dq(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, dqVar);
        return dqVar;
    }

    public final dp a(bu buVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dp dpVar = (dp) arrayList.get(i);
            if (dpVar.a.equals(buVar) && !dpVar.c) {
                return dpVar;
            }
        }
        return null;
    }

    final void c() {
        boolean zU = gl.U(this.a);
        synchronized (this.b) {
            d();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((dp) it.next()).b();
            }
            for (dp dpVar : new ArrayList(this.c)) {
                if (cu.Q(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zU ? "" : "Container " + this.a + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(dpVar);
                    sb.toString();
                }
                dpVar.d();
            }
            for (dp dpVar2 : new ArrayList(this.b)) {
                if (cu.Q(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zU ? "" : "Container " + this.a + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dpVar2);
                    sb2.toString();
                }
                dpVar2.d();
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dp dpVar = (dp) arrayList.get(i);
            if (dpVar.f == 2) {
                dpVar.f(d.m(dpVar.a.B().getVisibility()), 1);
            }
        }
    }

    public final void e(int i, int i2, da daVar) {
        synchronized (this.b) {
            aax aaxVar = new aax();
            dp dpVarA = a(daVar.c);
            if (dpVarA != null) {
                dpVarA.f(i, i2);
                return;
            }
            dn dnVar = new dn(i, i2, daVar, aaxVar);
            this.b.add(dnVar);
            dnVar.c(new dm(this, dnVar, 1));
            dnVar.c(new dm(this, dnVar, 0));
        }
    }
}
