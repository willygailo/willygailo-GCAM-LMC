package defpackage;

/* JADX INFO: loaded from: classes2.dex */
enum lqo {
    SESSION_BLACKLIST("Session blacklist"),
    DEVICE_BLACKLIST("Device blacklist"),
    API_BLACKLIST("Api blacklist"),
    AAA_BLACKLIST("Please use 3A methods exposed via frameserver for this operation"),
    UNSUPPORTED_KEY("Unsupported key");

    public final String f;

    lqo(String str) {
        this.f = str;
    }
}
