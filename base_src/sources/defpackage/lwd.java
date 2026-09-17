package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lwd {
    FRONT,
    BACK,
    EXTERNAL;

    public static String a(lwd lwdVar) {
        switch (lwdVar) {
            case FRONT:
                return "front";
            case BACK:
                return "back";
            case EXTERNAL:
                return "external";
            default:
                return "unknown";
        }
    }
}
