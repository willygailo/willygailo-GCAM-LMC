package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class yr extends yk {
    public ArrayList aH = new ArrayList();

    public void T() {
        ArrayList arrayList = this.aH;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yk ykVar = (yk) this.aH.get(i);
            if (ykVar instanceof yr) {
                ((yr) ykVar).T();
            }
        }
    }

    public final void Y(yk ykVar) {
        this.aH.remove(ykVar);
        ykVar.s();
    }

    @Override // defpackage.yk
    public void s() {
        this.aH.clear();
        super.s();
    }

    @Override // defpackage.yk
    public final void u(xz xzVar) {
        super.u(xzVar);
        int size = this.aH.size();
        for (int i = 0; i < size; i++) {
            ((yk) this.aH.get(i)).u(xzVar);
        }
    }
}
