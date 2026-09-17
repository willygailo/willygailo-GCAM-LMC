package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lly {
    public byte[] b;
    public final ByteOrder d;
    public final lmj[] a = new lmj[5];
    public final ArrayList c = new ArrayList();

    public lly(ByteOrder byteOrder) {
        this.d = byteOrder;
    }

    protected final int a() {
        return this.c.size();
    }

    public final lmj b(int i) {
        if (lmg.f(i)) {
            return this.a[i];
        }
        return null;
    }

    protected final List c() {
        ArrayList arrayList = new ArrayList();
        lmj[] lmjVarArr = this.a;
        for (int i = 0; i < 5; i++) {
            lmj lmjVar = lmjVarArr[i];
            if (lmjVar != null) {
                for (lmg lmgVar : lmjVar.d()) {
                    if (lmgVar != null) {
                        arrayList.add(lmgVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void d(lmj lmjVar) {
        this.a[lmjVar.b] = lmjVar;
    }

    public final void e() {
        this.b = null;
        this.c.clear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof lly)) {
            lly llyVar = (lly) obj;
            if (llyVar.d == this.d && llyVar.c.size() == this.c.size() && Arrays.equals(llyVar.b, this.b)) {
                for (int i = 0; i < this.c.size(); i++) {
                    if (!Arrays.equals((byte[]) llyVar.c.get(i), (byte[]) this.c.get(i))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < 5; i2++) {
                    lmj lmjVarB = llyVar.b(i2);
                    lmj lmjVarB2 = b(i2);
                    if (lmjVarB != null && !lmjVarB.equals(lmjVarB2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b != null;
    }

    public final boolean g() {
        return this.c.size() != 0;
    }

    public final boolean h(short s, int i) {
        lmj lmjVar = this.a[i];
        if (lmjVar == null) {
            return false;
        }
        lmjVar.c(s);
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    protected final byte[] i(int i) {
        return (byte[]) this.c.get(i);
    }

    public final void j(lmg lmgVar) {
        if (lmgVar != null) {
            int i = lmgVar.e;
            if (lmg.f(i)) {
                lmj lmjVar = this.a[i];
                if (lmjVar == null) {
                    lmjVar = new lmj(i);
                    this.a[i] = lmjVar;
                }
                lmjVar.e(lmgVar);
            }
        }
    }
}
