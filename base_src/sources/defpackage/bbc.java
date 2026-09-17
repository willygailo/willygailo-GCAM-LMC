package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bbc extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public bbc(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
