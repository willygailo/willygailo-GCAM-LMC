package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class pp extends pq {
    public pp(qc qcVar) {
        super(qcVar);
    }

    @Override // defpackage.pq
    public final int a(View view) {
        return qc.bn(view) + ((qd) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.pq
    public final int b(View view) {
        qd qdVar = (qd) view.getLayoutParams();
        return qc.bb(view) + qdVar.topMargin + qdVar.bottomMargin;
    }

    @Override // defpackage.pq
    public final int c(View view) {
        qd qdVar = (qd) view.getLayoutParams();
        return qc.bc(view) + qdVar.leftMargin + qdVar.rightMargin;
    }

    @Override // defpackage.pq
    public final int d(View view) {
        return qc.bq(view) - ((qd) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.pq
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.pq
    public final int f() {
        qc qcVar = this.a;
        return qcVar.D - qcVar.ao();
    }

    @Override // defpackage.pq
    public final int g() {
        return this.a.ao();
    }

    @Override // defpackage.pq
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.pq
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.pq
    public final int j() {
        return this.a.ar();
    }

    @Override // defpackage.pq
    public final int k() {
        qc qcVar = this.a;
        return (qcVar.D - qcVar.ar()) - this.a.ao();
    }

    @Override // defpackage.pq
    public final int l(View view) {
        this.a.bh(view, this.c);
        return this.c.bottom;
    }

    @Override // defpackage.pq
    public final int m(View view) {
        this.a.bh(view, this.c);
        return this.c.top;
    }

    @Override // defpackage.pq
    public final void n(int i) {
        this.a.aE(i);
    }
}
