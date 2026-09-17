package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ihr implements ihs {
    public List a = null;

    public final void a(iib... iibVarArr) {
        for (iib iibVar : iibVarArr) {
            iia iiaVar = new iia(iibVar);
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add(iiaVar);
        }
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    @Override // defpackage.ihs, defpackage.iht
    public void f() {
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((iht) it.next()).f();
            }
        }
    }

    @Override // defpackage.ihs, defpackage.iht
    public void g() {
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((iht) it.next()).g();
            }
        }
    }

    @Override // defpackage.ihs
    public /* synthetic */ void h() {
    }

    public void i() {
    }
}
