package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class oph extends oon {
    private transient Object[] c;
    private transient Object[] d;
    private final Comparator e;

    public oph(Comparator comparator) {
        comparator.getClass();
        this.e = comparator;
        this.c = new Object[4];
        this.d = new Object[4];
    }

    @Override // defpackage.oon
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final opj c() {
        int i = this.b;
        switch (i) {
            case 0:
                return opj.f(this.e);
            case 1:
                Comparator comparator = this.e;
                Object obj = this.c[0];
                obj.getClass();
                Object obj2 = this.d[0];
                obj2.getClass();
                return new opj(new ory(oom.m(obj), comparator), oom.m(obj2));
            default:
                Object[] objArrCopyOf = Arrays.copyOf(this.c, i);
                Arrays.sort(objArrCopyOf, this.e);
                Object[] objArr = new Object[this.b];
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (this.e.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                            String strValueOf = String.valueOf(objArrCopyOf[i3]);
                            String strValueOf2 = String.valueOf(objArrCopyOf[i2]);
                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length());
                            sb.append("keys required to be distinct but compared as equal: ");
                            sb.append(strValueOf);
                            sb.append(" and ");
                            sb.append(strValueOf2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    Object obj3 = this.c[i2];
                    obj3.getClass();
                    int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.e);
                    Object obj4 = this.d[i2];
                    obj4.getClass();
                    objArr[iBinarySearch] = obj4;
                }
                return new opj(new ory(oom.g(objArrCopyOf), this.e), oom.g(objArr));
        }
    }

    @Override // defpackage.oon
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void e(Object obj, Object obj2) {
        int i = this.b + 1;
        int length = this.c.length;
        if (i > length) {
            int iA = ooc.a(length, i);
            this.c = Arrays.copyOf(this.c, iA);
            this.d = Arrays.copyOf(this.d, iA);
        }
        ohh.S(obj, obj2);
        Object[] objArr = this.c;
        int i2 = this.b;
        objArr[i2] = obj;
        this.d[i2] = obj2;
        this.b = i2 + 1;
    }
}
