package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class poc implements Iterable, Serializable {
    public static final poc b = new pob(ppn.b);
    public int c = 0;

    static void A(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    private static poc c(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (poc) it.next();
        }
        int i2 = i >>> 1;
        poc pocVarC = c(it, i2);
        poc pocVarC2 = c(it, i - i2);
        if (Integer.MAX_VALUE - pocVarC.d() < pocVarC2.d()) {
            int iD = pocVarC.d();
            int iD2 = pocVarC2.d();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(iD);
            sb.append("+");
            sb.append(iD2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = pra.a;
        if (pocVarC2.d() == 0) {
            return pocVarC;
        }
        if (pocVarC.d() == 0) {
            return pocVarC2;
        }
        int iD3 = pocVarC.d() + pocVarC2.d();
        if (iD3 < 128) {
            return pra.g(pocVarC, pocVarC2);
        }
        if (pocVarC instanceof pra) {
            pra praVar = (pra) pocVarC;
            if (praVar.f.d() + pocVarC2.d() < 128) {
                return new pra(praVar.e, pra.g(praVar.f, pocVarC2));
            }
            if (praVar.e.f() > praVar.f.f() && praVar.g > pocVarC2.f()) {
                return new pra(praVar.e, new pra(praVar.f, pocVarC2));
            }
        }
        if (iD3 >= pra.c(Math.max(pocVarC.f(), pocVarC2.f()) + 1)) {
            return new pra(pocVarC, pocVarC2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        plk.aK(pocVarC, arrayDeque);
        plk.aK(pocVarC2, arrayDeque);
        poc praVar2 = (poc) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            praVar2 = new pra((poc) arrayDeque.pop(), praVar2);
        }
        return praVar2;
    }

    static int q(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static poc s(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        q(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new pob(bArr);
    }

    public static poc t(byte[] bArr) {
        return u(bArr, 0, bArr.length);
    }

    public static poc u(byte[] bArr, int i, int i2) {
        q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new pob(bArr2);
    }

    public static poc v(String str) {
        return new pob(str.getBytes(ppn.a));
    }

    public static poc w(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            poc pocVarU = i == 0 ? null : u(bArr, 0, i);
            if (pocVarU == null) {
                break;
            }
            arrayList.add(pocVarU);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? b : c(arrayList.iterator(), size);
    }

    static poc x(byte[] bArr) {
        return new pob(bArr);
    }

    static poc y(byte[] bArr, int i, int i2) {
        return new pny(bArr, i, i2);
    }

    public final byte[] B() {
        int iD = d();
        if (iD == 0) {
            return ppn.b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    @Deprecated
    public final void C(byte[] bArr, int i, int i2) {
        q(0, i2, d());
        q(i, i + i2, bArr.length);
        if (i2 > 0) {
            e(bArr, 0, i, i2);
        }
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    protected abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    protected abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int iD = d();
            i = i(iD, 0, iD);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    protected abstract int i(int i, int i2, int i3);

    protected abstract int j(int i, int i2, int i3);

    public abstract poc k(int i, int i2);

    public abstract poh l();

    protected abstract String m(Charset charset);

    public abstract ByteBuffer n();

    public abstract void o(pnv pnvVar);

    public abstract boolean p();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public pnz iterator() {
        return new pnw(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        objArr[2] = d() <= 50 ? plk.aJ(this) : String.valueOf(plk.aJ(k(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String z() {
        return d() == 0 ? "" : m(ppn.a);
    }
}
