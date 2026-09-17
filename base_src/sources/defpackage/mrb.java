package defpackage;

import android.opengl.GLES30;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public class mrb extends mqx implements mqw {
    public final mrh a;
    public final int c;
    public final int d;
    public boolean e;
    public final moq f;

    public mrb(mrh mrhVar, int i, int i2, moq moqVar) {
        super(i);
        this.e = false;
        obr.aF(true);
        this.a = mrhVar;
        this.f = moqVar;
        this.c = i2;
        mqi.b();
        if (!mqi.a()) {
            this.d = 1;
            return;
        }
        mme mmeVar = moqVar.a;
        int iA = mmeVar.a.a(0);
        int i3 = 1;
        while (true) {
            pfc pfcVar = mmeVar.a;
            if (i3 >= pfcVar.c) {
                this.d = oxh.S(iA, RoundingMode.DOWN) + 1;
                return;
            } else {
                if (pfcVar.a(i3) > iA) {
                    iA = mmeVar.a.a(i3);
                }
                i3++;
            }
        }
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES30.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    @Override // defpackage.mqx
    protected void c() {
        GLES30.glDeleteTextures(1, new int[]{this.b}, 0);
    }

    public final void d() {
        GLES30.glBindTexture(this.c, this.b);
    }
}
