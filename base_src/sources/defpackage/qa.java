package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class qa implements rz {
    final /* synthetic */ qc a;
    private final /* synthetic */ int b;

    public qa(qc qcVar, int i) {
        this.b = i;
        this.a = qcVar;
    }

    @Override // defpackage.rz
    public final int a(View view) {
        switch (this.b) {
            case 0:
                return qc.bn(view) + ((qd) view.getLayoutParams()).bottomMargin;
            default:
                return qc.bp(view) + ((qd) view.getLayoutParams()).rightMargin;
        }
    }

    @Override // defpackage.rz
    public final int b(View view) {
        switch (this.b) {
            case 0:
                return qc.bq(view) - ((qd) view.getLayoutParams()).topMargin;
            default:
                return qc.bo(view) - ((qd) view.getLayoutParams()).leftMargin;
        }
    }

    @Override // defpackage.rz
    public final int c() {
        switch (this.b) {
            case 0:
                qc qcVar = this.a;
                return qcVar.D - qcVar.ao();
            default:
                qc qcVar2 = this.a;
                return qcVar2.C - qcVar2.aq();
        }
    }

    @Override // defpackage.rz
    public final int d() {
        switch (this.b) {
            case 0:
                return this.a.ar();
            default:
                return this.a.ap();
        }
    }

    @Override // defpackage.rz
    public final View e(int i) {
        switch (this.b) {
            case 0:
                break;
        }
        return this.a.au(i);
    }
}
