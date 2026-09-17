package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mym implements mwi {
    private final int a;

    public mym() {
    }

    public mym(byte[] bArr) {
        this.a = 1;
    }

    @Override // defpackage.mwi
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        return this.a == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mym)) {
            return false;
        }
        int i = this.a;
        boolean z = i == ((mym) obj).a;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        mwj.b(this.a);
        return 1000002;
    }

    public final String toString() {
        String strA = mwj.a(this.a);
        StringBuilder sb = new StringBuilder(strA.length() + 42);
        sb.append("ApplicationExitConfigurations{enablement=");
        sb.append(strA);
        sb.append("}");
        return sb.toString();
    }
}
