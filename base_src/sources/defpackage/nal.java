package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nal implements mwi {
    public final ojc a;
    public final ojc b;
    private final int c;

    public nal() {
    }

    public nal(ojc ojcVar, ojc ojcVar2) {
        this.c = 1;
        this.a = ojcVar;
        this.b = ojcVar2;
    }

    @Override // defpackage.mwi
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nal)) {
            return false;
        }
        nal nalVar = (nal) obj;
        int i = this.c;
        int i2 = nalVar.c;
        if (i != 0) {
            return i2 == 1 && this.a.equals(nalVar.a) && this.b.equals(nalVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        mwj.b(this.c);
        return 395873938;
    }

    public final String toString() {
        String strA = mwj.a(this.c);
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        int length = strA.length();
        StringBuilder sb = new StringBuilder(length + 86 + String.valueOf(strValueOf).length() + String.valueOf(strValueOf2).length());
        sb.append("StartupConfigurations{enablement=");
        sb.append(strA);
        sb.append(", metricExtensionProvider=");
        sb.append(strValueOf);
        sb.append(", customTimestampProvider=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
