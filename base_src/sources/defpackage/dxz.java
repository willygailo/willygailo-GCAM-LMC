package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dxz {
    public final mpi a;
    public final int b;
    public final float[] c;
    public final float[] d;
    private final short[] e;

    public dxz(mpi mpiVar, int i) {
        obr.aQ(i > 0);
        this.a = mpiVar;
        this.b = i;
        short[] sArr = new short[i * 6];
        for (int i2 = 0; i2 < i + i; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                sArr[(i2 * 3) + i3] = (short) (i2 + i3);
            }
        }
        this.e = sArr;
        int i4 = i + 1;
        this.d = c(-1.0f, 1.0f, -1.0f, i4, 4);
        this.c = c(0.0f, 0.0f, 1.0f, i4, 2);
    }

    private static float[] c(float f, float f2, float f3, int i, int i2) {
        float f4 = 1.0f - f;
        float f5 = (f3 - f2) / (i - 1);
        float[] fArr = new float[(i + i) * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            float f6 = f;
            int i5 = 0;
            while (true) {
                if (i5 < 2) {
                    fArr[i3] = f6;
                    fArr[i3 + 1] = f2;
                    f6 += f4;
                    if (i2 > 2) {
                        for (int i6 = 2; i6 < i2 - 1; i6 = 3) {
                            fArr[i3 + 2] = 0.0f;
                        }
                        fArr[(i3 + i2) - 1] = 1.0f;
                    }
                    i3 += i2;
                    i5++;
                }
            }
            f2 += f5;
        }
        return fArr;
    }

    public final mqk a() {
        mpi mpiVar = this.a;
        short[] sArr = this.e;
        int length = sArr.length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + length).order(ByteOrder.nativeOrder());
        byteBufferOrder.asShortBuffer().put(sArr);
        return new mqk(mpa.b(mpiVar, 34963, byteBufferOrder), length);
    }

    public final mri b(List list) {
        obr.aQ(list.size() == this.b);
        float[] fArr = this.d;
        float[] fArr2 = new float[fArr.length];
        int size = list.size();
        int i = 0;
        while (i <= size) {
            mou mouVar = i > 0 ? (mou) list.get(i - 1) : (mou) list.get(0);
            int i2 = i * 8;
            for (int i3 = 0; i3 < 2; i3++) {
                int i4 = (i3 * 4) + i2;
                float f = fArr[i4];
                float[] fArr3 = mouVar.c;
                int i5 = i4 + 1;
                int i6 = i4 + 3;
                fArr2[i4] = (f * fArr3[0]) + (fArr[i5] * fArr3[1]) + (fArr[i6] * fArr3[2]);
                fArr2[i5] = (fArr[i4] * fArr3[3]) + (fArr[i5] * fArr3[4]) + (fArr[i6] * fArr3[5]);
                fArr2[i4 + 2] = 0.0f;
                fArr2[i6] = (fArr[i4] * fArr3[6]) + (fArr[i5] * fArr3[7]) + (fArr[i6] * fArr3[8]);
            }
            i++;
        }
        return mri.e(this.a, mrj.b(fArr2), mrj.a(this.c));
    }
}
