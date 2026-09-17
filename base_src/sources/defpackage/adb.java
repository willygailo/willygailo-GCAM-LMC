package defpackage;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class adb {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public adb(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public adb(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    public static adb b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(ade.h);
        return new adb(2, bytes.length, bytes);
    }

    public static adb c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ade.e[4]]);
        byteBufferWrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            byteBufferWrap.putInt((int) jArr[i]);
        }
        return new adb(4, 1, byteBufferWrap.array());
    }

    public static adb d(add addVar, ByteOrder byteOrder) {
        add[] addVarArr = {addVar};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ade.e[5]]);
        byteBufferWrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            add addVar2 = addVarArr[i];
            byteBufferWrap.putInt((int) addVar2.a);
            byteBufferWrap.putInt((int) addVar2.b);
        }
        return new adb(5, 1, byteBufferWrap.array());
    }

    public static adb e(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ade.e[3]]);
        byteBufferWrap.order(byteOrder);
        for (int i2 = 0; i2 <= 0; i2++) {
            byteBufferWrap.putShort((short) iArr[i2]);
        }
        return new adb(3, 1, byteBufferWrap.array());
    }

    public final int a(ByteOrder byteOrder) throws Throwable {
        Object objF = f(byteOrder);
        if (objF == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objF instanceof String) {
            return Integer.parseInt((String) objF);
        }
        if (objF instanceof long[]) {
            long[] jArr = (long[]) objF;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objF instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objF;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final Object f(ByteOrder byteOrder) throws Throwable {
        ada adaVar;
        byte b;
        byte b2;
        ada adaVar2 = null;
        try {
            adaVar = new ada(this.d);
            try {
                adaVar.b = byteOrder;
                int i = 0;
                switch (this.a) {
                    case 1:
                    case 6:
                        byte[] bArr = this.d;
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, ade.h);
                            try {
                                adaVar.close();
                                break;
                            } catch (IOException e) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + 48)});
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e2) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                        }
                        return str2;
                    case 2:
                    case 7:
                        int i2 = this.b;
                        int length = ade.f.length;
                        if (i2 >= 8) {
                            int i3 = 0;
                            while (true) {
                                int length2 = ade.f.length;
                                if (i3 >= 8) {
                                    int length3 = ade.f.length;
                                    i = 8;
                                } else if (this.d[i3] == ade.f[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (i < this.b && (b2 = this.d[i]) != 0) {
                            if (b2 >= 32) {
                                sb.append((char) b2);
                            } else {
                                sb.append('?');
                            }
                            i++;
                        }
                        String string = sb.toString();
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e3) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        }
                        return string;
                    case 3:
                        int[] iArr = new int[this.b];
                        while (i < this.b) {
                            iArr[i] = adaVar.readUnsignedShort();
                            i++;
                        }
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e4) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                        }
                        return iArr;
                    case 4:
                        long[] jArr = new long[this.b];
                        while (i < this.b) {
                            jArr[i] = adaVar.a();
                            i++;
                        }
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e5) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                        return jArr;
                    case 5:
                        add[] addVarArr = new add[this.b];
                        while (i < this.b) {
                            addVarArr[i] = new add(adaVar.a(), adaVar.a());
                            i++;
                        }
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                        return addVarArr;
                    case 8:
                        int[] iArr2 = new int[this.b];
                        while (i < this.b) {
                            iArr2[i] = adaVar.readShort();
                            i++;
                        }
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e7) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                        }
                        return iArr2;
                    case 9:
                        int[] iArr3 = new int[this.b];
                        while (i < this.b) {
                            iArr3[i] = adaVar.readInt();
                            i++;
                        }
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e8) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                        }
                        return iArr3;
                    case 10:
                        add[] addVarArr2 = new add[this.b];
                        while (i < this.b) {
                            addVarArr2[i] = new add(adaVar.readInt(), adaVar.readInt());
                            i++;
                        }
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e9) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                        }
                        return addVarArr2;
                    case 11:
                        double[] dArr = new double[this.b];
                        while (i < this.b) {
                            dArr[i] = adaVar.readFloat();
                            i++;
                        }
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e10) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                        }
                        return dArr;
                    case 12:
                        double[] dArr2 = new double[this.b];
                        while (i < this.b) {
                            dArr2[i] = adaVar.readDouble();
                            i++;
                        }
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e11) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                        }
                        return dArr2;
                    default:
                        try {
                            adaVar.close();
                            break;
                        } catch (IOException e12) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                        }
                        return null;
                }
            } catch (IOException e13) {
                e = e13;
                try {
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (adaVar != null) {
                        try {
                            adaVar.close();
                        } catch (IOException e14) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    adaVar2 = adaVar;
                    if (adaVar2 != null) {
                        try {
                            adaVar2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                adaVar2 = adaVar;
                if (adaVar2 != null) {
                    adaVar2.close();
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            adaVar = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String g(ByteOrder byteOrder) throws Throwable {
        Object objF = f(byteOrder);
        if (objF == null) {
            return null;
        }
        if (objF instanceof String) {
            return (String) objF;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objF instanceof long[]) {
            long[] jArr = (long[]) objF;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    return sb.toString();
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (objF instanceof int[]) {
            int[] iArr = (int[]) objF;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    return sb.toString();
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (objF instanceof double[]) {
            double[] dArr = (double[]) objF;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    return sb.toString();
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else {
            if (!(objF instanceof add[])) {
                return null;
            }
            add[] addVarArr = (add[]) objF;
            while (true) {
                int length4 = addVarArr.length;
                if (i >= length4) {
                    return sb.toString();
                }
                sb.append(addVarArr[i].a);
                sb.append('/');
                sb.append(addVarArr[i].b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
    }

    public final String toString() {
        return "(" + ade.d[this.a] + ", data length:" + this.d.length + ")";
    }
}
