package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class hsq {
    public final hsp a;
    public final long b;
    public final String c;
    public final hsr d;
    public final long e;

    public hsq() {
    }

    public hsq(hsp hspVar, long j, String str, hsr hsrVar, long j2) {
        this.a = hspVar;
        this.b = j;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.c = str;
        if (hsrVar == null) {
            throw new NullPointerException("Null captureSessionType");
        }
        this.d = hsrVar;
        this.e = j2;
    }

    public static hsq a(hsp hspVar, long j, String str, hsr hsrVar) {
        return new hsq(hspVar, j, str, hsrVar, Process.myPid());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hsq)) {
            return false;
        }
        hsq hsqVar = (hsq) obj;
        hsp hspVar = this.a;
        if (hspVar != null ? hspVar.equals(hsqVar.a) : hsqVar.a == null) {
            if (this.b == hsqVar.b && this.c.equals(hsqVar.c) && this.d.equals(hsqVar.d) && this.e == hsqVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        hsp hspVar = this.a;
        int iHashCode = hspVar == null ? 0 : hspVar.hashCode();
        long j = this.b;
        int iHashCode2 = this.c.hashCode();
        int iHashCode3 = this.d.hashCode();
        long j2 = this.e;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        long j = this.b;
        String str = this.c;
        String strValueOf2 = String.valueOf(this.d);
        long j2 = this.e;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 111 + str.length() + String.valueOf(strValueOf2).length());
        sb.append("ShotInfo{shotId=");
        sb.append(strValueOf);
        sb.append(", shotIdForTracker=");
        sb.append(j);
        sb.append(", title=");
        sb.append(str);
        sb.append(", captureSessionType=");
        sb.append(strValueOf2);
        sb.append(", pid=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
