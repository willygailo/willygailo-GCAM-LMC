package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
final class ght {
    public final fwh a;
    public final gfu b;
    public final pht c;
    public final bws d;
    public final Future e;

    public ght() {
    }

    public ght(fwh fwhVar, gfu gfuVar, pht phtVar, bws bwsVar, Future future) {
        this.a = fwhVar;
        this.b = gfuVar;
        this.c = phtVar;
        this.d = bwsVar;
        this.e = future;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ght) {
            ght ghtVar = (ght) obj;
            if (this.a.equals(ghtVar.a) && this.b.equals(ghtVar.b) && this.c.equals(ghtVar.c) && this.d.equals(ghtVar.d) && this.e.equals(ghtVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        StringBuilder sb = new StringBuilder(length + 76 + length2 + length3 + String.valueOf(strValueOf4).length() + String.valueOf(strValueOf5).length());
        sb.append("StartupTransaction{cameraKey=");
        sb.append(strValueOf);
        sb.append(", camera=");
        sb.append(strValueOf2);
        sb.append(", starting=");
        sb.append(strValueOf3);
        sb.append(", closed=");
        sb.append(strValueOf4);
        sb.append(", previewSurface=");
        sb.append(strValueOf5);
        sb.append("}");
        return sb.toString();
    }
}
