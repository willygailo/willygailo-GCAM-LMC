package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class qrh extends CancellationException implements qqc {
    public final qrg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrh(String str, Throwable th, qrg qrgVar) {
        super(str);
        str.getClass();
        qrgVar.getClass();
        this.a = qrgVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.qqc
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!qql.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new qrh(message, this, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qrh) {
            qrh qrhVar = (qrh) obj;
            return qno.c(qrhVar.getMessage(), getMessage()) && qno.c(qrhVar.a, this.a) && qno.c(qrhVar.getCause(), getCause());
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (qql.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = ((message.hashCode() * 31) + this.a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
