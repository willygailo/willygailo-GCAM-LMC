package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fjy {
    public hsr a;
    public pcw b;
    public Float c;

    public final fjz a() {
        hsr hsrVar = this.a;
        if (hsrVar != null) {
            return new fjz(hsrVar, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: sessionType");
    }
}
