package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hph {
    public final float a;
    public final float b;
    public final float c;

    public hph(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.d("azimuth", this.a);
        ojbVarAZ.d("pitch", this.b);
        ojbVarAZ.d("roll", this.c);
        return ojbVarAZ.toString();
    }
}
