package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class pfa extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final float[] a;
    public final int b;
    public final int c;

    public pfa(float[] fArr, int i, int i2) {
        this.a = fArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Float) && oxh.J(this.a, ((Float) obj).floatValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pfa)) {
            return super.equals(obj);
        }
        pfa pfaVar = (pfa) obj;
        int size = size();
        if (pfaVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != pfaVar.a[pfaVar.b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        obr.aX(i, size());
        return Float.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.b; i < this.c; i++) {
            iHashCode = (iHashCode * 31) + Float.valueOf(this.a[i]).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iJ;
        if (!(obj instanceof Float) || (iJ = oxh.J(this.a, ((Float) obj).floatValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return iJ - this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.a;
            float fFloatValue = ((Float) obj).floatValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (i2 >= i) {
                if (fArr[i2] != fFloatValue) {
                    i2--;
                } else if (i2 >= 0) {
                    return i2 - this.b;
                }
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - this.b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        obr.aX(i, size());
        float[] fArr = this.a;
        int i2 = this.b + i;
        float f2 = fArr[i2];
        f.getClass();
        fArr[i2] = f.floatValue();
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        obr.aP(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        float[] fArr = this.a;
        int i3 = this.b;
        return new pfa(fArr, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        sb.append(this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.a[i]);
        }
    }
}
