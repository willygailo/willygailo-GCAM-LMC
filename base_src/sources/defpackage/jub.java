package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jub {
    public float a;
    public float b;
    public float c;

    static {
        new jub(0.0f, 0.0f, 0.0f);
    }

    public jub() {
    }

    public jub(float f, float f2, float f3) {
        a(f, f2, f3);
    }

    public final void a(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sb = new StringBuilder(49);
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(f3);
        return sb.toString();
    }
}
