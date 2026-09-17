package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class prm extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public prm() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final ppp a() {
        return new ppp(getMessage());
    }
}
