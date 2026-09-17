package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jtj {
    private final float b;
    private float c = 0.0f;
    public float a = 0.0f;

    public jtj(int i) {
        this.b = i;
    }

    public final void a(float f) {
        float f2 = this.c;
        float f3 = this.b;
        if (f2 != f3) {
            f3 = f2 + 1.0f;
        }
        this.c = f3;
        float f4 = 1.0f / f3;
        this.a = (this.a * (1.0f - f4)) + (f * f4);
    }

    public final void b() {
        this.c = 0.0f;
        this.a = 0.0f;
    }
}
