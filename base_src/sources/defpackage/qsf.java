package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class qsf extends qsg {
    private volatile qsf _immediate;
    public final Handler b;
    private final String d;
    private final boolean e;
    private final qsf f;

    public qsf(Handler handler, String str) {
        this(handler, str, false);
    }

    private qsf(Handler handler, String str, boolean z) {
        this.b = handler;
        this.d = str;
        this.e = z;
        this._immediate = true != z ? null : this;
        qsf qsfVar = this._immediate;
        if (qsfVar == null) {
            qsfVar = new qsf(handler, str, true);
            this._immediate = qsfVar;
        }
        this.f = qsfVar;
    }

    @Override // defpackage.qqf
    public final void d(qln qlnVar, Runnable runnable) {
        qlnVar.getClass();
        if (this.b.post(runnable)) {
            return;
        }
        qnt.m(qlnVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        qqq.b.d(qlnVar, runnable);
    }

    @Override // defpackage.qqf
    public final boolean e(qln qlnVar) {
        qlnVar.getClass();
        return (this.e && qno.c(Looper.myLooper(), this.b.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qsf) && ((qsf) obj).b == this.b;
    }

    @Override // defpackage.qrq
    public final /* synthetic */ qrq f() {
        return this.f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.qrq, defpackage.qqf
    public final String toString() {
        String strC = c();
        if (strC != null) {
            return strC;
        }
        String string = this.d;
        if (string == null) {
            string = this.b.toString();
        }
        return this.e ? qno.a(string, ".immediate") : string;
    }
}
