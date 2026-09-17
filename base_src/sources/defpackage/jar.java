package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jar {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final lco d;
    public final lco e;

    public jar() {
    }

    public jar(boolean z, boolean z2, boolean z3, lco lcoVar, lco lcoVar2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lcoVar;
        this.e = lcoVar2;
    }

    public static jaq a() {
        jaq jaqVar = new jaq();
        jaqVar.e(false);
        jaqVar.d(false);
        jaqVar.f(false);
        jaqVar.c(new lce(false));
        jaqVar.b(new lce(false));
        return jaqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jar) {
            jar jarVar = (jar) obj;
            if (this.a == jarVar.a && this.b == jarVar.b && this.c == jarVar.c && this.d.equals(jarVar.d) && this.e.equals(jarVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 147 + String.valueOf(strValueOf2).length());
        sb.append("ElapsedTimeUIConfig{showOutputTimer=");
        sb.append(z);
        sb.append(", showMutedAudioIcon=");
        sb.append(z2);
        sb.append(", showSpeechEnhanceIcon=");
        sb.append(z3);
        sb.append(", showMicInputExtWired=");
        sb.append(strValueOf);
        sb.append(", showMicInputExtBluetooth=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
