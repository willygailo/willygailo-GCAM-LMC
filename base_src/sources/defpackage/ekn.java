package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ekn {
    public static final FloatBuffer a = mzi.g(mzi.h(-1.0f, -1.0f));
    public static final FloatBuffer b = mzi.g(mzi.h(0.0f, 0.0f));
    public Texture c = null;
    public final float[] d;
    public final float[] e;
    public nlc f;
    public nle g;
    public nle h;
    public nle i;
    public nle j;
    public nle k;

    public ekn() {
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
    }
}
