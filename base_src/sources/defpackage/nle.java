package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class nle {
    private static nle b;
    public final int a;

    public nle() {
        this.a = 2;
    }

    public nle(int i) {
        this.a = i;
    }

    private nle(Context context) {
        this.a = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        ((Activity) context).isInMultiWindowMode();
    }

    public static int g(Context context) {
        nle nleVar = b;
        return nleVar != null ? nleVar.a : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static void h(Context context) {
        if (b == null) {
            b = new nle(context);
        }
    }

    public static void i() {
        b = null;
    }

    public static nle o(boolean z) {
        return new nle((true != z ? 0 : 4) | 1);
    }

    public final void a(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.a, 1, false, fArr, 0);
    }

    public final void b(float[] fArr) {
        GLES20.glUniform4fv(this.a, 1, fArr, 0);
    }

    public final void c(Texture texture) {
        GLES20.glActiveTexture(33984);
        texture.bind();
        GLES20.glUniform1i(this.a, 0);
    }

    public final void d() {
        GLES20.glDisableVertexAttribArray(this.a);
    }

    public final void e() {
        GLES20.glEnableVertexAttribArray(this.a);
    }

    public final void f(FloatBuffer floatBuffer, int i) {
        GLES20.glVertexAttribPointer(this.a, i, 5126, false, 0, (Buffer) floatBuffer);
    }

    public final PointF j(PointF pointF) {
        switch (this.a) {
            case 0:
                return pointF;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return new PointF(pointF.y, 1.0f - pointF.x);
            case 180:
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            case 270:
                return new PointF(1.0f - pointF.y, pointF.x);
            default:
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
        }
    }

    public final PointF k(PointF pointF) {
        switch (this.a) {
            case 0:
                return pointF;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return new PointF(1.0f - pointF.y, pointF.x);
            case 180:
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            case 270:
                return new PointF(pointF.y, 1.0f - pointF.x);
            default:
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
        }
    }

    public final boolean l() {
        return this.a == 0;
    }

    public final boolean m() {
        return (this.a & 2) != 0;
    }

    public final boolean n() {
        return (this.a & 4) != 0;
    }
}
