package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mrk extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public mrk(String str) {
        String strValueOf = String.valueOf(str);
        super(strValueOf.length() != 0 ? "Failed to link shader program:\n".concat(strValueOf) : new String("Failed to link shader program:\n"));
    }
}
