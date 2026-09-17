package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class jxb implements jxj {
    private jxj a = null;

    @Override // defpackage.jxj
    public final boolean a(PointF pointF) {
        jxj jxjVar = this.a;
        if (jxjVar == null) {
            return false;
        }
        return jxjVar.a(pointF);
    }

    @Override // defpackage.jxj
    public final void b() {
        jxj jxjVar = this.a;
        if (jxjVar == null) {
            return;
        }
        jxjVar.b();
    }

    public final void c() {
        this.a = null;
    }

    public final void d(jxj jxjVar) {
        jxjVar.getClass();
        this.a = jxjVar;
    }

    @Override // defpackage.jxj
    public final boolean e(PointF pointF) {
        jxj jxjVar = this.a;
        if (jxjVar == null) {
            return false;
        }
        return jxjVar.e(pointF);
    }
}
