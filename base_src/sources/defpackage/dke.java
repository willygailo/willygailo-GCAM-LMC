package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class dke {
    public final lld a;
    public final Handler b;
    public lie c;
    public lie d;

    public dke(lld lldVar, Handler handler) {
        this.a = lldVar;
        this.b = handler;
    }

    public final void a() {
        lie lieVar = this.d;
        if (lieVar != null) {
            lieVar.close();
            this.d = null;
        }
    }
}
