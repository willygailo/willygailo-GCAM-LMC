package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pvo {
    BAD_URL(false),
    CANCELED(false),
    REQUEST_BODY_READ_ERROR(false),
    CONNECTION_ERROR(true),
    SERVER_ERROR(true),
    UNKNOWN(false);

    public final boolean g;

    pvo(boolean z) {
        this.g = z;
    }
}
