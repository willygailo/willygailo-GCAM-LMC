package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum dei {
    ENG,
    FISHFOOD,
    DOGFOOD,
    RELEASE;

    public final boolean a(dei deiVar) {
        return ordinal() > deiVar.ordinal();
    }

    public final boolean b(dei deiVar) {
        return ordinal() <= deiVar.ordinal();
    }
}
