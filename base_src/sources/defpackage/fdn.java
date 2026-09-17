package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class fdn extends fcp {
    public fcs f;
    private int g;

    public fdn() {
        this.g = 0;
        try {
            fcs fcsVar = new fcs();
            this.f = fcsVar;
            fcsVar.j(fcj.d);
            this.a = ByteBuffer.allocateDirect(58800).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.c = ByteBuffer.allocateDirect(9800).order(ByteOrder.nativeOrder()).asShortBuffer();
            this.b = ByteBuffer.allocateDirect(39200).order(ByteOrder.nativeOrder()).asFloatBuffer();
            short s = 0;
            float f = -5.1000004f;
            short s2 = 0;
            for (int i = 0; i < 35; i++) {
                int i2 = 0;
                float f2 = -5.1000004f;
                while (i2 < 35) {
                    short s3 = (short) (s2 + 1);
                    d(s2, f - 0.030000001f, f2);
                    short s4 = (short) (s3 + 1);
                    d(s3, f + 0.030000001f, f2);
                    short s5 = (short) (s4 + 1);
                    d(s4, f, (-0.030000001f) + f2);
                    short s6 = (short) (s5 + 1);
                    d(s5, f, 0.030000001f + f2);
                    int i3 = 0;
                    while (i3 < 4) {
                        this.c.put(s, (short) (s2 + i3));
                        i3++;
                        s = (short) (s + 1);
                    }
                    f2 += 0.3f;
                    i2++;
                    s2 = s6;
                }
                f += 0.3f;
            }
            this.g = s;
        } catch (fcq e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.fcp
    public final void c(float[] fArr) {
        this.f.c();
        this.f.j(fcj.d);
        this.f.g(this.a);
        this.f.e(this.b);
        this.f.f(fArr);
        GLES20.glDrawElements(1, this.g, 5123, this.c);
    }
}
