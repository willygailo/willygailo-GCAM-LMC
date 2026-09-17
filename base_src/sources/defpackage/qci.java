package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qci extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public qci(Throwable th) {
        String strValueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 168);
        sb.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(strValueOf);
        super(sb.toString(), th == null ? new NullPointerException() : th);
    }
}
