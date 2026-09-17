package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class po extends pq {
    public po(qc qcVar) {
        super(qcVar);
    }

    @Override // defpackage.pq
    public final int a(View view) {
        return qc.bp(view) + ((qd) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.pq
    public final int b(View view) {
        qd qdVar = (qd) view.getLayoutParams();
        return qc.bc(view) + qdVar.leftMargin + qdVar.rightMargin;
    }

    @Override // defpackage.pq
    public final int c(View view) {
        qd qdVar = (qd) view.getLayoutParams();
        return qc.bb(view) + qdVar.topMargin + qdVar.bottomMargin;
    }

    @Override // defpackage.pq
    public final int d(View view) {
        return qc.bo(view) - ((qd) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.pq
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.pq
    public final int f() {
        qc qcVar = this.a;
        return qcVar.C - qcVar.aq();
    }

    @Override // defpackage.pq
    public final int g() {
        return this.a.aq();
    }

    @Override // defpackage.pq
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.pq
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.pq
    public final int j() {
        return this.a.ap();
    }

    @Override // defpackage.pq
    public final int k() {
        qc qcVar = this.a;
        return (qcVar.C - qcVar.ap()) - this.a.aq();
    }

    @Override // defpackage.pq
    public final int l(View view) {
        this.a.bh(view, this.c);
        return this.c.right;
    }

    @Override // defpackage.pq
    public final int m(View view) {
        this.a.bh(view, this.c);
        return this.c.left;
    }

    @Override // defpackage.pq
    public final void n(int i) {
        this.a.aD(i);
    }
}
