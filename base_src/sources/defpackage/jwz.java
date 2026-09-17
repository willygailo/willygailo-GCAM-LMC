package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class jwz implements jxg {
    private jxg a = null;

    @Override // defpackage.jxg
    public final void a(PointF pointF) {
        jxg jxgVar = this.a;
        if (jxgVar == null) {
            return;
        }
        jxgVar.a(pointF);
    }

    @Override // defpackage.jxf
    public final void b() {
        jxg jxgVar = this.a;
        if (jxgVar == null) {
            return;
        }
        jxgVar.b();
    }

    @Override // defpackage.jxg
    public final void c(PointF pointF) {
        jxg jxgVar = this.a;
        if (jxgVar == null) {
            return;
        }
        jxgVar.c(pointF);
    }

    public final void e() {
        this.a = null;
    }

    public final void f(jxg jxgVar) {
        jxgVar.getClass();
        this.a = jxgVar;
    }

    @Override // defpackage.jxf
    public final void g() {
    }
}
