package defpackage;

import android.opengl.GLES20;
import android.util.SparseIntArray;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class mpu extends mmh {
    final /* synthetic */ mqb a;

    public mpu(mqb mqbVar) {
        this.a = mqbVar;
    }

    @Override // defpackage.mmh
    public final /* synthetic */ void b(Object obj) {
        int i;
        int i2;
        mqq mqqVar = (mqq) obj;
        mqqVar.i();
        mqy mqyVar = (mqy) this.a.i.c();
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(35725, iArr, 0);
        int i3 = iArr[0];
        int i4 = mqyVar.b;
        if (i3 != i4) {
            GLES20.glUseProgram(i4);
        }
        Iterator it = this.a.e.values().iterator();
        while (it.hasNext()) {
            ((mqa) it.next()).a(mqyVar);
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (mpz mpzVar : this.a.g) {
            int i5 = ((mrb) mpzVar.a.c()).c;
            int i6 = sparseIntArray.get(i5, 0);
            int[] iArr2 = new int[1];
            GLES20.glGetIntegerv(35661, iArr2, 0);
            int i7 = iArr2[0];
            if (i6 > i7) {
                StringBuilder sb = new StringBuilder(90);
                sb.append("Attempting to bind ");
                sb.append(i6 + 1);
                sb.append(" textures at once, but only up to ");
                sb.append(i7);
                sb.append(" are supported!");
                throw new IllegalStateException(sb.toString());
            }
            if (mqb.a > 0) {
                i2 = mqb.a;
            } else {
                int[] iArr3 = new int[1];
                GLES20.glGetTexParameteriv(((mrb) mpzVar.a.c()).c, 36200, iArr3, 0);
                i2 = iArr3[0];
                if (i2 < 0 || i2 > 3) {
                    throw new IndexOutOfBoundsException("Unit count returned by OpenGL is outside of valid range!");
                }
            }
            sparseIntArray.put(i5, i2 + i6);
            GLES20.glActiveTexture(33984 + i6);
            ((mrb) mpzVar.a.c()).d();
            GLES20.glUniform1i(((mqy) mpzVar.c.i.c()).b(mpzVar.b), i6);
        }
        ((mqp) this.a.c.a.c()).b();
        mmd mmdVarAf = mip.af(this.a.f.size());
        try {
            int i8 = mqyVar.b;
            for (Map.Entry entry : this.a.f.entrySet()) {
                String str = (String) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i8, str);
                if (iGlGetAttribLocation != -1) {
                    mmdVarAf.add(new mpx(iGlGetAttribLocation));
                    GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
                    boolean z = this.a.c.d(iIntValue).c() == 4;
                    int iC = this.a.c.c(iIntValue);
                    mod modVarD = this.a.c.d(iIntValue);
                    if (modVarD == mop.a) {
                        i = 5120;
                    } else if (modVarD == mop.d) {
                        i = 5121;
                    } else if (modVarD == mop.b) {
                        i = 5122;
                    } else if (modVarD == mop.e) {
                        i = 5123;
                    } else if (modVarD == mop.c) {
                        i = 5124;
                    } else if (modVarD == mop.f) {
                        i = 5125;
                    } else if (modVarD == mop.g) {
                        i = 5131;
                    } else {
                        if (modVarD != mop.h) {
                            String strValueOf = String.valueOf(modVarD);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 30);
                            sb2.append("No Gl type for attribute type ");
                            sb2.append(strValueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        i = 5126;
                    }
                    int iB = this.a.c.b(iIntValue);
                    mri mriVar = this.a.c;
                    int iB2 = 0;
                    for (int i9 = 0; i9 < iIntValue; i9++) {
                        iB2 += mriVar.b(i9) * mriVar.c;
                    }
                    GLES20.glVertexAttribPointer(iGlGetAttribLocation, iC, i, z, iB, iB2);
                }
            }
            mqb mqbVar = this.a;
            mqk mqkVar = mqbVar.d;
            if (mqkVar != null) {
                ((mqp) mqkVar.a.c()).b();
                mqb mqbVar2 = this.a;
                GLES20.glDrawElements(mqbVar2.b, mqbVar2.d.b, 5123, 0);
            } else {
                GLES20.glDrawArrays(mqbVar.b, 0, mqbVar.c.c);
            }
            mmdVarAf.close();
            if (this.a.h) {
                mqqVar.k();
            }
        } catch (Throwable th) {
            try {
                mmdVarAf.close();
                throw th;
            } catch (Throwable th2) {
                throw th;
            }
        }
    }
}
