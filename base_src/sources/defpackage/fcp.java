package defpackage;

import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public abstract class fcp {
    private final float[] f;
    public FloatBuffer a = null;
    public FloatBuffer b = null;
    public ShortBuffer c = null;
    public final Vector d = new Vector();
    private final float[] g = new float[16];
    public fcr e = null;

    public fcp() {
        float[] fArr = new float[16];
        this.f = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void a(float[] fArr) {
        Matrix.multiplyMM(this.g, 0, fArr, 0, this.f, 0);
        c(this.g);
    }

    public abstract void c(float[] fArr);

    protected final void d(int i, float f, float f2) {
        int i2 = i * 3;
        int i3 = i2 + 1;
        this.a.put(i2, f);
        this.a.put(i3, -1.7f);
        this.a.put(i3 + 1, f2);
    }
}
