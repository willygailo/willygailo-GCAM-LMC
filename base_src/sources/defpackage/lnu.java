package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lnu {
    private Boolean a;
    private int b;
    private int c;
    private int d;

    public final lnv a() {
        int i;
        int i2;
        Boolean bool;
        int i3 = this.b;
        if (i3 != 0 && (i = this.c) != 0 && (i2 = this.d) != 0 && (bool = this.a) != null) {
            return new lnv(i3, i, i2, bool.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" exposure");
        }
        if (this.c == 0) {
            sb.append(" focus");
        }
        if (this.d == 0) {
            sb.append(" whiteBalance");
        }
        if (this.a == null) {
            sb.append(" forCapture");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(int i) {
        if (i == 0) {
            throw new NullPointerException("Null exposure");
        }
        this.b = i;
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null focus");
        }
        this.c = i;
    }

    public final void d(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void e(int i) {
        if (i == 0) {
            throw new NullPointerException("Null whiteBalance");
        }
        this.d = i;
    }
}
