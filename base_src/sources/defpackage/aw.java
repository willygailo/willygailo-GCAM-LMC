package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aw extends ar {
    public final ArrayList al = new ArrayList();

    public void D() {
        r();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ar arVar = (ar) this.al.get(i);
            if (arVar instanceof aw) {
                ((aw) arVar).D();
            }
        }
    }

    public final void F(ar arVar) {
        this.al.remove(arVar);
        arVar.r = null;
    }

    @Override // defpackage.ar
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.ar
    public final void j(al alVar) {
        super.j(alVar);
        int size = this.al.size();
        for (int i = 0; i < size; i++) {
            ((ar) this.al.get(i)).j(alVar);
        }
    }

    @Override // defpackage.ar
    public final void o(int i, int i2) {
        super.o(i, i2);
        int size = this.al.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ar) this.al.get(i3)).o(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.ar
    public final void r() {
        super.r();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ar arVar = (ar) this.al.get(i);
            arVar.o(b(), c());
            if (!(arVar instanceof as)) {
                arVar.r();
            }
        }
    }
}
