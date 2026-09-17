package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ve {
    public final String a;

    private /* synthetic */ ve(String str) {
        this.a = str;
    }

    public static final /* synthetic */ ve a(String str) {
        return new ve(str);
    }

    public static String b(String str) {
        return qno.a("Camera ", str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ve) && qno.c(this.a, ((ve) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
