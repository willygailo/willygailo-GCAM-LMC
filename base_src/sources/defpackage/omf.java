package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class omf extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public omf() {
        m(3);
    }

    public omf(int i) {
        m(i);
    }

    public static omf e(int i) {
        return new omf(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(i);
            throw new InvalidObjectException(sb.toString());
        }
        m(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final int t(int i, int i2, int i3, int i4) {
        Object objL = ohh.L(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ohh.N(objL, i3 & i5, i4 + 1);
        }
        Object objH = h();
        int[] iArrQ = q();
        for (int i6 = 0; i6 <= i; i6++) {
            int iJ = ohh.J(objH, i6);
            while (iJ != 0) {
                int i7 = iJ - 1;
                int i8 = iArrQ[i7];
                int iF = ohh.F(i8, i) | i6;
                int i9 = iF & i5;
                int iJ2 = ohh.J(objL, i9);
                ohh.N(objL, i9, iJ);
                iArrQ[i7] = ohh.G(iF, iJ2, i5);
                iJ = i8 & i;
            }
        }
        this.g = objL;
        u(i5);
        return i5;
    }

    private final void u(int i) {
        this.e = ohh.G(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itJ = j();
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (p()) {
            return;
        }
        l();
        Map mapK = k();
        if (mapK != null) {
            this.e = oxh.B(size(), 3, 1073741823);
            mapK.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(r(), 0, this.f, (Object) null);
        Arrays.fill(s(), 0, this.f, (Object) null);
        ohh.M(h());
        Arrays.fill(q(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (obr.bc(obj, i(i))) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (p()) {
            return -1;
        }
        int iD = ohh.D(obj);
        int iC = c();
        int iJ = ohh.J(h(), iD & iC);
        if (iJ == 0) {
            return -1;
        }
        int iF = ohh.F(iD, iC);
        do {
            int i = iJ - 1;
            int i2 = q()[i];
            if (ohh.F(i2, iC) == iF && obr.bc(obj, f(i))) {
                return i;
            }
            iJ = i2 & iC;
        } while (iJ != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        oma omaVar = new oma(this);
        this.i = omaVar;
        return omaVar;
    }

    public final Object f(int i) {
        return r()[i];
    }

    public final Object g(Object obj) {
        if (p()) {
            return a;
        }
        int iC = c();
        int I = ohh.I(obj, null, iC, h(), q(), r(), null);
        if (I == -1) {
            return a;
        }
        Object objI = i(I);
        n(I, iC);
        this.f--;
        l();
        return objI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return i(iD);
    }

    public final Object h() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    public final Object i(int i) {
        return s()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final Iterator j() {
        Map mapK = k();
        return mapK != null ? mapK.entrySet().iterator() : new oly(this);
    }

    final Map k() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        omc omcVar = new omc(this);
        this.h = omcVar;
        return omcVar;
    }

    final void l() {
        this.e += 32;
    }

    final void m(int i) {
        obr.aG(i >= 0, "Expected size must be >= 0");
        this.e = oxh.B(i, 1, 1073741823);
    }

    final void n(int i, int i2) {
        Object objH = h();
        int[] iArrQ = q();
        Object[] objArrR = r();
        Object[] objArrS = s();
        int size = size() - 1;
        if (i >= size) {
            objArrR[i] = null;
            objArrS[i] = null;
            iArrQ[i] = 0;
            return;
        }
        Object obj = objArrR[size];
        objArrR[i] = obj;
        objArrS[i] = objArrS[size];
        objArrR[size] = null;
        objArrS[size] = null;
        iArrQ[i] = iArrQ[size];
        iArrQ[size] = 0;
        int iD = ohh.D(obj) & i2;
        int iJ = ohh.J(objH, iD);
        int i3 = size + 1;
        if (iJ == i3) {
            ohh.N(objH, iD, i + 1);
            return;
        }
        while (true) {
            int i4 = iJ - 1;
            int i5 = iArrQ[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                iArrQ[i4] = ohh.G(i5, i + 1, i2);
                return;
            }
            iJ = i6;
        }
    }

    public final void o(int i, Object obj) {
        s()[i] = obj;
    }

    final boolean p() {
        return this.g == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (p()) {
            obr.aR(p(), "Arrays already allocated");
            int i = this.e;
            int iK = ohh.K(i);
            this.g = ohh.L(iK);
            u(iK - 1);
            this.b = new int[i];
            this.c = new Object[i];
            this.d = new Object[i];
        }
        Map mapK = k();
        if (mapK != null) {
            return mapK.put(obj, obj2);
        }
        int[] iArrQ = q();
        Object[] objArrR = r();
        Object[] objArrS = s();
        int i2 = this.f;
        int i3 = i2 + 1;
        int iD = ohh.D(obj);
        int iC = c();
        int i4 = iD & iC;
        int iJ = ohh.J(h(), i4);
        if (iJ != 0) {
            int iF = ohh.F(iD, iC);
            int i5 = 0;
            while (true) {
                int i6 = iJ - 1;
                int i7 = iArrQ[i6];
                if (ohh.F(i7, iC) == iF && obr.bc(obj, objArrR[i6])) {
                    Object obj3 = objArrS[i6];
                    objArrS[i6] = obj2;
                    return obj3;
                }
                int i8 = i7 & iC;
                i5++;
                if (i8 == 0) {
                    if (i5 < 9) {
                        if (i3 <= iC) {
                            iArrQ[i6] = ohh.G(i7, i3, iC);
                            break;
                        }
                        iC = t(iC, ohh.H(iC), iD, i2);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                    int iA = a();
                    while (iA >= 0) {
                        linkedHashMap.put(f(iA), i(iA));
                        iA = b(iA);
                    }
                    this.g = linkedHashMap;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    l();
                    return linkedHashMap.put(obj, obj2);
                }
                iJ = i8;
            }
        } else if (i3 > iC) {
            iC = t(iC, ohh.H(iC), iD, i2);
        } else {
            ohh.N(h(), i4, i3);
        }
        int length = q().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(q(), iMin);
            this.c = Arrays.copyOf(r(), iMin);
            this.d = Arrays.copyOf(s(), iMin);
        }
        q()[i2] = ohh.G(iD, 0, iC);
        r()[i2] = obj;
        o(i2, obj2);
        this.f = i3;
        l();
        return null;
    }

    public final int[] q() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    public final Object[] r() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.remove(obj);
        }
        Object objG = g(obj);
        if (objG == a) {
            return null;
        }
        return objG;
    }

    public final Object[] s() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapK = k();
        return mapK != null ? mapK.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        ome omeVar = new ome(this);
        this.j = omeVar;
        return omeVar;
    }
}
