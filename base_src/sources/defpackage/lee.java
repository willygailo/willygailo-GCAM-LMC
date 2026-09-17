package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lee {
    public final ldw a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public lee(ldw ldwVar, int i, int i2, int i3, int i4) {
        this.a = ldwVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.c;
        int i2 = this.d;
        int i3 = this.b;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 112);
        sb.append("encoder=");
        sb.append(strValueOf);
        sb.append(", sampling rate=");
        sb.append(i);
        sb.append(", capture sample rate=");
        sb.append(i2);
        sb.append(", bit rate=");
        sb.append(i3);
        sb.append(", channels=");
        sb.append(i4);
        return sb.toString();
    }
}
