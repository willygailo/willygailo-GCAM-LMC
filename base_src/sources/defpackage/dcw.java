package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dcw {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    dcw() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public dcw(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f4;
        this.d = f3;
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.d;
        StringBuilder sb = new StringBuilder(65);
        sb.append("CutoutInfo(x=");
        sb.append(f);
        sb.append(",y=");
        sb.append(f2);
        sb.append(",r=");
        sb.append(f3);
        sb.append(")");
        return sb.toString();
    }
}
