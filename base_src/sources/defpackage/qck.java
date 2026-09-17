package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qck extends IllegalStateException {
    private static final long serialVersionUID = 1644750035281290266L;

    public qck(Throwable th) {
        String strValueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 252);
        sb.append("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ");
        sb.append(strValueOf);
        super(sb.toString(), th);
    }
}
