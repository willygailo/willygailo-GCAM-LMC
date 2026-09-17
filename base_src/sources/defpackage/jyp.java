package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class jyp implements idd {
    final /* synthetic */ jyq a;

    public jyp(jyq jyqVar) {
        this.a = jyqVar;
    }

    @Override // defpackage.idd
    public final void a() {
        if (TextUtils.isEmpty(this.a.t)) {
            return;
        }
        jyq jyqVar = this.a;
        jyqVar.c(jyqVar.t);
        this.a.t = null;
    }

    @Override // defpackage.idd
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.idd
    public final void c() {
        synchronized (this.a.n) {
            jyq jyqVar = this.a;
            jyqVar.t = jyqVar.s;
        }
        this.a.b();
    }

    @Override // defpackage.idd
    public final /* synthetic */ void d() {
    }
}
