package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class drn implements dqt {
    final /* synthetic */ drp a;

    public drn(drp drpVar) {
        this.a = drpVar;
    }

    @Override // defpackage.dqt
    public final void a() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((dqt) it.next()).a();
        }
    }

    @Override // defpackage.dqt
    public final /* synthetic */ void c(lvp lvpVar) {
    }

    @Override // defpackage.dqt
    public final void d(lvp lvpVar, brg brgVar) {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((dqt) it.next()).d(lvpVar, brgVar);
        }
    }
}
