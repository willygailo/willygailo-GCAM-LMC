package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mgb {
    public final mgm a;
    public final mga b;
    public final String c;
    public final ojc d;
    public final ojc e;
    public final ojc f;
    public final ojc g;
    public final ojc h;
    public final ojc i;
    public final ojc j;
    private final ojc k;

    public mgb() {
    }

    public mgb(mgm mgmVar, mga mgaVar, String str, ojc ojcVar, ojc ojcVar2, ojc ojcVar3, ojc ojcVar4, ojc ojcVar5, ojc ojcVar6, ojc ojcVar7, ojc ojcVar8) {
        this.a = mgmVar;
        this.b = mgaVar;
        this.c = str;
        this.k = ojcVar;
        this.d = ojcVar2;
        this.e = ojcVar3;
        this.f = ojcVar4;
        this.g = ojcVar5;
        this.h = ojcVar6;
        this.i = ojcVar7;
        this.j = ojcVar8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgb) {
            mgb mgbVar = (mgb) obj;
            if (this.a.equals(mgbVar.a) && this.b.equals(mgbVar.b) && this.c.equals(mgbVar.c) && this.k.equals(mgbVar.k) && this.d.equals(mgbVar.d) && this.e.equals(mgbVar.e) && this.f.equals(mgbVar.f) && this.g.equals(mgbVar.g) && this.h.equals(mgbVar.h) && this.i.equals(mgbVar.i) && this.j.equals(mgbVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String str = this.c;
        String strValueOf3 = String.valueOf(this.k);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        String strValueOf8 = String.valueOf(this.h);
        String strValueOf9 = String.valueOf(this.i);
        String strValueOf10 = String.valueOf(this.j);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(strValueOf3).length();
        int length5 = String.valueOf(strValueOf4).length();
        int length6 = String.valueOf(strValueOf5).length();
        int length7 = String.valueOf(strValueOf6).length();
        int length8 = String.valueOf(strValueOf7).length();
        int length9 = String.valueOf(strValueOf8).length();
        StringBuilder sb = new StringBuilder(length + 145 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(strValueOf9).length() + String.valueOf(strValueOf10).length());
        sb.append("ActionData{actionType=");
        sb.append(strValueOf);
        sb.append(", engineType=");
        sb.append(strValueOf2);
        sb.append(", actionText=");
        sb.append(str);
        sb.append(", displayText=");
        sb.append(strValueOf3);
        sb.append(", calendarEvent=");
        sb.append(strValueOf4);
        sb.append(", calendarBegin=");
        sb.append(strValueOf5);
        sb.append(", calendarEnd=");
        sb.append(strValueOf6);
        sb.append(", contact=");
        sb.append(strValueOf7);
        sb.append(", geo=");
        sb.append(strValueOf8);
        sb.append(", sms=");
        sb.append(strValueOf9);
        sb.append(", wifiNetwork=");
        sb.append(strValueOf10);
        sb.append("}");
        return sb.toString();
    }
}
