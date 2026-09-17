package defpackage;

import android.util.Printer;

/* JADX INFO: loaded from: classes2.dex */
public final class lpf implements lnd {
    public final lpr a;
    public final lnf b;
    public final lxx c;
    public final luk d;
    private final lvq e;

    public lpf(lpr lprVar, lnf lnfVar, lvq lvqVar, luk lukVar, lxx lxxVar) {
        this.a = lprVar;
        this.b = lnfVar;
        this.e = lvqVar;
        this.d = lukVar;
        this.c = lxxVar;
    }

    public static final void e(Printer printer, String str, String str2) {
        printer.println(mip.bp("%-20s %s", str, str2));
    }

    @Override // defpackage.lnd
    public final lnx a(lnz lnzVar) {
        lnx lnxVarB = b(lnzVar);
        lnxVarB.getClass();
        return lnxVarB;
    }

    @Override // defpackage.lnd
    public final lnx b(lnz lnzVar) {
        oti otiVarListIterator = this.d.a.listIterator();
        while (otiVarListIterator.hasNext()) {
            lui luiVar = (lui) otiVarListIterator.next();
            if (luiVar.h == lnzVar) {
                return luiVar;
            }
        }
        return null;
    }

    @Override // defpackage.lnd
    public final lvp c() {
        return this.e.a(d());
    }

    public final lvs d() {
        return this.b.a;
    }
}
