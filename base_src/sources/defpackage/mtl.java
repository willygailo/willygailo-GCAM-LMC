package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class mtl implements mtn {
    private final mtn[] a;

    public mtl(mtn... mtnVarArr) {
        this.a = mtnVarArr;
    }

    private static void b() {
        throw new IllegalArgumentException("No MemCopier found to copy between buffers.");
    }

    @Override // defpackage.mtn
    public final boolean a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        mtn[] mtnVarArr = this.a;
        for (int i = 0; i < 3; i++) {
            if (mtnVarArr[i].a(byteBuffer, byteBuffer2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mtn
    public final void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        mtn[] mtnVarArr = this.a;
        for (int i4 = 0; i4 < 3; i4++) {
            mtn mtnVar = mtnVarArr[i4];
            if (mtnVar.a(byteBuffer, byteBuffer2)) {
                mtnVar.copyBytes(byteBuffer, byteBuffer2, 0, 0, i3);
                return;
            }
        }
        b();
    }

    @Override // defpackage.mtn
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6) {
        mtn[] mtnVarArr = this.a;
        for (int i7 = 0; i7 < 3; i7++) {
            mtn mtnVar = mtnVarArr[i7];
            if (mtnVar.a(byteBuffer, byteBuffer2)) {
                mtnVar.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, i6);
                return;
            }
        }
        b();
    }

    @Override // defpackage.mtn
    public final void copyBytes2D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mtn[] mtnVarArr = this.a;
        for (int i9 = 0; i9 < 3; i9++) {
            mtn mtnVar = mtnVarArr[i9];
            if (mtnVar.a(byteBuffer, byteBuffer2)) {
                mtnVar.copyBytes2D(byteBuffer, byteBuffer2, i, i2, 0, 0, i5, 1, i7, i8);
                return;
            }
        }
        b();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String strA = oxk.e(",").a(Arrays.asList(this.a));
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(strA).length());
        sb.append(simpleName);
        sb.append("[");
        sb.append(strA);
        sb.append("]");
        return sb.toString();
    }
}
