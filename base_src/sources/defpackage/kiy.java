package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kiy extends UnsupportedOperationException {
    private final khk a;

    public kiy(khk khkVar) {
        this.a = khkVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb.append("Missing ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
