package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nbj {
    public Boolean a;
    public ojc b;
    public int c;

    public nbj() {
    }

    public nbj(byte[] bArr) {
        this.b = oih.a;
    }

    public final nbk a() {
        Boolean bool;
        int i = this.c;
        if (i != 0 && (bool = this.a) != null) {
            return new nbk(i, bool.booleanValue(), this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" manualCapture");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.c = true != z ? 2 : 3;
    }
}
