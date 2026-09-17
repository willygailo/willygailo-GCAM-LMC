package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class opc extends ooc {
    Object[] d;
    private int e;

    public opc() {
        super(4);
    }

    public opc(byte[] bArr) {
        super(4);
        this.d = new Object[ope.B(4)];
    }

    public final ope f() {
        ope opeVarE;
        int i = this.b;
        switch (i) {
            case 0:
                return orx.a;
            case 1:
                Object obj = this.a[0];
                obj.getClass();
                return ope.H(obj);
            default:
                if (this.d == null || ope.B(i) != this.d.length) {
                    opeVarE = ope.E(this.b, this.a);
                    this.b = opeVarE.size();
                } else {
                    Object[] objArrCopyOf = ope.N(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
                    int i2 = this.e;
                    Object[] objArr = this.d;
                    opeVarE = new orx(objArrCopyOf, i2, objArr, objArr.length - 1, this.b);
                }
                this.c = true;
                this.d = null;
                return opeVarE;
        }
    }

    @Override // defpackage.ooc
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iB = ope.B(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (iB <= length) {
                objArr.getClass();
                int i = length - 1;
                int iHashCode = obj.hashCode();
                int iC = ohh.C(iHashCode);
                while (true) {
                    int i2 = iC & i;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i2];
                    if (obj2 == null) {
                        objArr2[i2] = obj;
                        this.e += iHashCode;
                        super.c(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iC = i2 + 1;
                    }
                }
            }
        }
        this.d = null;
        super.c(obj);
    }

    public final void h(Object... objArr) {
        if (this.d != null) {
            for (Object obj : objArr) {
                d(obj);
            }
            return;
        }
        int length = objArr.length;
        obr.R(objArr, length);
        super.b(this.b + length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final void i(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.e(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }
}
