package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mri implements mls {
    public final mpa a;
    public final mod[] b;
    public final int c;
    private final int[] d;

    public mri(mpa mpaVar, mod[] modVarArr, int[] iArr, int i) {
        obr.aF(modVarArr.length == iArr.length);
        this.a = mpaVar;
        this.b = modVarArr;
        this.d = iArr;
        this.c = i;
    }

    public static mri e(mpi mpiVar, mrj... mrjVarArr) {
        int i = mrjVarArr[0].a;
        mod[] modVarArr = new mod[2];
        int[] iArr = new int[2];
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            mrj mrjVar = mrjVarArr[i3];
            mod modVar = mrjVar.b;
            int i4 = mrjVar.c;
            i2 += i4 * 32 * i;
            modVarArr[i3] = modVar;
            iArr[i3] = i4;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2 / 8).order(ByteOrder.nativeOrder());
        for (int i5 = 0; i5 < 2; i5++) {
            mrj mrjVar2 = mrjVarArr[i5];
            for (int i6 = 0; i6 < i; i6++) {
                mrjVar2.c(i6, byteBufferOrder);
            }
        }
        return new mri(mpa.b(mpiVar, 34962, byteBufferOrder), modVarArr, iArr, i);
    }

    @Override // defpackage.mls
    public final mne a() {
        return this.a.a();
    }

    public final int b(int i) {
        return (d(i).a() * c(i)) / 8;
    }

    public final int c(int i) {
        return this.d[i];
    }

    @Override // defpackage.mls, defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final mod d(int i) {
        return this.b[i];
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String string = Arrays.toString(this.b);
        String string2 = Arrays.toString(this.d);
        int i = this.c;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append("GLVertexArray{buffer=");
        sb.append(strValueOf);
        sb.append(", types=");
        sb.append(string);
        sb.append(", dimensions=");
        sb.append(string2);
        sb.append(", count=");
        sb.append(i);
        sb.append(", isInterleaved=false}");
        return sb.toString();
    }
}
