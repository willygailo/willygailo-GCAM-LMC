package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mhi {
    public static final pos a = pos.c();

    public static mhe a(ByteBuffer byteBuffer, pos posVar) {
        if (byteBuffer != null) {
            try {
                return (mhe) ppd.r(mhe.e, byteBuffer, posVar);
            } catch (Exception e) {
            }
        }
        return mhe.e;
    }
}
