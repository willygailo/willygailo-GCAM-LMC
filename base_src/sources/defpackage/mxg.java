package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mxg {
    public final String a;
    public final boolean b;
    public final qyk c;
    public final qxe d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final mvp h;

    public mxg() {
    }

    public mxg(String str, boolean z, qyk qykVar, qxe qxeVar, String str2, Long l, boolean z2, mvp mvpVar) {
        this.a = str;
        this.b = z;
        this.c = qykVar;
        this.d = qxeVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = mvpVar;
    }

    public static mxf a() {
        mxf mxfVar = new mxf();
        mxfVar.b(false);
        mxfVar.c(false);
        return mxfVar;
    }

    public final boolean equals(Object obj) {
        qxe qxeVar;
        String str;
        Long l;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mxg)) {
            return false;
        }
        mxg mxgVar = (mxg) obj;
        String str2 = this.a;
        if (str2 != null ? str2.equals(mxgVar.a) : mxgVar.a == null) {
            if (this.b == mxgVar.b && this.c.equals(mxgVar.c) && ((qxeVar = this.d) != null ? qxeVar.equals(mxgVar.d) : mxgVar.d == null) && ((str = this.e) != null ? str.equals(mxgVar.e) : mxgVar.e == null) && ((l = this.f) != null ? l.equals(mxgVar.f) : mxgVar.f == null) && this.g == mxgVar.g) {
                mvp mvpVar = this.h;
                mvp mvpVar2 = mxgVar.h;
                if (mvpVar != null ? mvpVar.equals(mvpVar2) : mvpVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB;
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        qyk qykVar = this.c;
        int iB2 = qykVar.aD;
        if (iB2 == 0) {
            iB2 = pqu.a.b(qykVar).b(qykVar);
            qykVar.aD = iB2;
        }
        int i = (iHashCode ^ iB2) * 1000003;
        qxe qxeVar = this.d;
        if (qxeVar == null) {
            iB = 0;
        } else {
            iB = qxeVar.aD;
            if (iB == 0) {
                iB = pqu.a.b(qxeVar).b(qxeVar);
                qxeVar.aD = iB;
            }
        }
        int i2 = (i ^ iB) * 1000003;
        String str2 = this.e;
        int iHashCode2 = (i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int iHashCode3 = (((iHashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003;
        mvp mvpVar = this.h;
        return iHashCode3 ^ (mvpVar != null ? mvpVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        String strValueOf3 = String.valueOf(this.f);
        boolean z2 = this.g;
        String strValueOf4 = String.valueOf(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(strValueOf).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 161 + length2 + length3 + length4 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("Metric{customEventName=");
        sb.append(str);
        sb.append(", isEventNameConstant=");
        sb.append(z);
        sb.append(", metric=");
        sb.append(strValueOf);
        sb.append(", metricExtension=");
        sb.append(strValueOf2);
        sb.append(", accountableComponentName=");
        sb.append(str2);
        sb.append(", sampleRatePermille=");
        sb.append(strValueOf3);
        sb.append(", isUnsampled=");
        sb.append(z2);
        sb.append(", debugLogsTime=");
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }
}
