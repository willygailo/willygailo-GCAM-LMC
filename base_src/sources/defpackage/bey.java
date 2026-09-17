package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bey {
    public final String a;

    public bey(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bey) {
            return this.a.equals(((bey) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append("StringHeaderFactory{value='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
