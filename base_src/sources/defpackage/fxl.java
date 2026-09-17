package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fxl {
    public static final fxl a = a(false);
    public static final fxl b = a(true);
    public final boolean c;

    public fxl() {
    }

    public fxl(boolean z) {
        this.c = z;
    }

    private static fxl a(boolean z) {
        return new fxl(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof fxl) && this.c == ((fxl) obj).c;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(39);
        sb.append("FirstPreviewFrameState{delivered=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
