package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class olh extends oln implements Serializable {
    private static final long serialVersionUID = 0;
    public transient org a = g();
    public transient long b;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.a = g();
        obr.J(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        obr.M(this, objectOutputStream);
    }

    @Override // defpackage.oln
    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.oln, defpackage.oqw
    public final int c(Object obj, int i) {
        obr.aI(true, "occurrences cannot be negative: %s", i);
        int iC = this.a.c(obj);
        if (iC == -1) {
            return 0;
        }
        int iB = this.a.b(iC);
        if (iB > i) {
            this.a.i(iC, iB - i);
        } else {
            this.a.g(iC);
            i = iB;
        }
        this.b -= (long) i;
        return iB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        org orgVar = this.a;
        orgVar.d++;
        Arrays.fill(orgVar.a, 0, orgVar.c, (Object) null);
        Arrays.fill(orgVar.b, 0, orgVar.c, 0);
        Arrays.fill(orgVar.e, -1);
        Arrays.fill(orgVar.f, -1L);
        orgVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.oln
    public final Iterator d() {
        return new ole(this);
    }

    @Override // defpackage.oln
    public final Iterator e() {
        return new olf(this);
    }

    @Override // defpackage.oln, defpackage.oqw
    public final void f(Object obj, int i) {
        if (i == 0) {
            gD(obj);
            return;
        }
        obr.aI(i > 0, "occurrences cannot be negative: %s", i);
        int iC = this.a.c(obj);
        if (iC == -1) {
            this.a.e(obj, i);
            this.b += (long) i;
            return;
        }
        long j = i;
        long jB = ((long) this.a.b(iC)) + j;
        obr.aJ(jB <= 2147483647L, "too many occurrences: %s", jB);
        this.a.i(iC, (int) jB);
        this.b += j;
    }

    public abstract org g();

    @Override // defpackage.oqw
    public final int gD(Object obj) {
        org orgVar = this.a;
        int iC = orgVar.c(obj);
        if (iC == -1) {
            return 0;
        }
        return orgVar.b[iC];
    }

    @Override // defpackage.oln, defpackage.oqw
    public final boolean h(Object obj, int i) {
        ohh.U(i, "oldCount");
        ohh.U(0, "newCount");
        int iC = this.a.c(obj);
        if (iC == -1) {
            return i == 0;
        }
        if (this.a.b(iC) != i) {
            return false;
        }
        this.a.g(iC);
        this.b -= (long) i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, defpackage.oqw
    public final Iterator iterator() {
        return obr.V(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.oqw
    public final int size() {
        return oxh.F(this.b);
    }
}
