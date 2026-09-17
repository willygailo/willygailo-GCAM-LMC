package defpackage;

import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class elh {
    public static final float[] a = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public final float[] c;
    public nlc f;
    public nle g;
    public nle h;
    public nle i;
    public nle j;
    public FloatBuffer b = mzi.g(a);
    public final float[] d = new float[16];
    public final float[] e = {1.0f, 1.0f, 1.0f, 1.0f};

    public elh() {
        float[] fArr = new float[16];
        this.c = fArr;
        Matrix.setIdentityM(fArr, 0);
    }
}
