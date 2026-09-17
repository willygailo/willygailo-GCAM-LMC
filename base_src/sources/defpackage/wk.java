package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class wk {
    public static zf a(yk ykVar, int i, ArrayList arrayList, zf zfVar) {
        int i2;
        int i3 = i == 0 ? ykVar.an : ykVar.ao;
        if (i3 != -1 && (zfVar == null || i3 != zfVar.c)) {
            int i4 = 0;
            while (i4 < arrayList.size()) {
                zf zfVar2 = (zf) arrayList.get(i4);
                if (zfVar2.c == i3) {
                    if (zfVar != null) {
                        zfVar.c(i, zfVar2);
                        arrayList.remove(zfVar);
                    }
                    zfVar = zfVar2;
                    break;
                }
                i4++;
            }
        } else if (i3 != -1) {
            return zfVar;
        }
        if (zfVar == null) {
            if (ykVar instanceof yo) {
                yo yoVar = (yo) ykVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= yoVar.ar) {
                        i2 = -1;
                        break;
                    }
                    yk ykVar2 = yoVar.aq[i5];
                    if (i == 0) {
                        i2 = ykVar2.an;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = ykVar2.ao;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        zf zfVar3 = (zf) arrayList.get(i6);
                        if (zfVar3.c == i2) {
                            zfVar = zfVar3;
                            break;
                        }
                    }
                }
            }
            if (zfVar == null) {
                zfVar = new zf(i);
            }
            arrayList.add(zfVar);
        }
        if (zfVar.d(ykVar)) {
            if (ykVar instanceof yn) {
                yn ynVar = (yn) ykVar;
                ynVar.d.c(ynVar.aq == 0 ? 1 : 0, arrayList, zfVar);
            }
            if (i == 0) {
                ykVar.an = zfVar.c;
                ykVar.J.c(0, arrayList, zfVar);
                ykVar.L.c(0, arrayList, zfVar);
            } else {
                ykVar.ao = zfVar.c;
                ykVar.K.c(1, arrayList, zfVar);
                ykVar.N.c(1, arrayList, zfVar);
                ykVar.M.c(1, arrayList, zfVar);
            }
            ykVar.Q.c(i, arrayList, zfVar);
        }
        return zfVar;
    }

    public static zf b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zf zfVar = (zf) arrayList.get(i2);
            if (i == zfVar.c) {
                return zfVar;
            }
        }
        return null;
    }

    public static boolean c(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static final int d(int i, ByteBuffer byteBuffer) {
        if (f(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static final short e(int i, ByteBuffer byteBuffer) {
        if (f(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    private static final boolean f(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }
}
