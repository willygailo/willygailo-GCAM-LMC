package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mow extends RuntimeException {
    public mow(String str) {
        super(str);
    }

    public static mow a(mrh mrhVar) {
        String strValueOf = String.valueOf(mrhVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 42);
        sb.append("Could not create EGL context for version ");
        sb.append(strValueOf);
        sb.append(".");
        return new mow(sb.toString());
    }
}
