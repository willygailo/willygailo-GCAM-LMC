package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum aea {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(aea aeaVar) {
        return compareTo(aeaVar) >= 0;
    }
}
