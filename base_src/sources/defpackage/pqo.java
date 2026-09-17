package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class pqo implements prb {
    private static final int[] a = new int[0];
    private static final Unsafe b = prv.j();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final pqm g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int[] k;
    private final int l;
    private final int m;
    private final pqa n;
    private final plk o;

    private pqo(int[] iArr, Object[] objArr, int i, int i2, pqm pqmVar, boolean z, int[] iArr2, int i3, int i4, pqa pqaVar, plk plkVar, plk plkVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = pqmVar instanceof ppd;
        this.j = z;
        boolean z2 = false;
        if (plkVar2 != null && (pqmVar instanceof ppb)) {
            z2 = true;
        }
        this.h = z2;
        this.k = iArr2;
        this.l = i3;
        this.m = i4;
        this.n = pqaVar;
        this.o = plkVar;
        this.g = pqmVar;
    }

    private final int A(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iS = s(i4);
            if (i == iS) {
                return i4;
            }
            if (i < iS) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int B(int i) {
        return (i >>> 20) & 255;
    }

    private final int C(int i) {
        return this.c[i + 1];
    }

    private static long D(int i) {
        return i & 1048575;
    }

    private static long E(Object obj, long j) {
        return ((Long) prv.h(obj, j)).longValue();
    }

    private final ppi F(int i) {
        int i2 = i / 3;
        return (ppi) this.d[i2 + i2 + 1];
    }

    private final prb G(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        prb prbVar = (prb) this.d[i3];
        if (prbVar != null) {
            return prbVar;
        }
        prb prbVarA = pqu.a.a((Class) this.d[i3 + 1]);
        this.d[i3] = prbVarA;
        return prbVarA;
    }

    private final Object H(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private static Field I(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List J(Object obj, long j) {
        return (List) prv.h(obj, j);
    }

    private final void K(Object obj, Object obj2, int i) {
        long jD = D(C(i));
        if (R(obj2, i)) {
            Object objH = prv.h(obj, jD);
            Object objH2 = prv.h(obj2, jD);
            if (objH != null && objH2 != null) {
                prv.u(obj, jD, ppn.e(objH, objH2));
                N(obj, i);
            } else if (objH2 != null) {
                prv.u(obj, jD, objH2);
                N(obj, i);
            }
        }
    }

    private final void L(Object obj, Object obj2, int i) {
        int iC = C(i);
        int iS = s(i);
        long jD = D(iC);
        if (U(obj2, iS, i)) {
            Object objH = U(obj, iS, i) ? prv.h(obj, jD) : null;
            Object objH2 = prv.h(obj2, jD);
            if (objH != null && objH2 != null) {
                prv.u(obj, jD, ppn.e(objH, objH2));
                O(obj, iS, i);
            } else if (objH2 != null) {
                prv.u(obj, jD, objH2);
                O(obj, iS, i);
            }
        }
    }

    private final void M(Object obj, int i, pqx pqxVar) {
        if (Q(i)) {
            prv.u(obj, D(i), pqxVar.x());
        } else if (this.i) {
            prv.u(obj, D(i), pqxVar.v());
        } else {
            prv.u(obj, D(i), pqxVar.q());
        }
    }

    private final void N(Object obj, int i) {
        int iZ = z(i);
        long j = 1048575 & iZ;
        if (j == 1048575) {
            return;
        }
        prv.s(obj, j, (1 << (iZ >>> 20)) | prv.d(obj, j));
    }

    private final void O(Object obj, int i, int i2) {
        prv.s(obj, z(i2) & 1048575, i);
    }

    private final boolean P(Object obj, Object obj2, int i) {
        return R(obj, i) == R(obj2, i);
    }

    private static boolean Q(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean R(Object obj, int i) {
        int iZ = z(i);
        long j = 1048575 & iZ;
        if (j != 1048575) {
            return (prv.d(obj, j) & (1 << (iZ >>> 20))) != 0;
        }
        int iC = C(i);
        long jD = D(iC);
        switch (B(iC)) {
            case 0:
                return prv.b(obj, jD) != 0.0d;
            case 1:
                return prv.c(obj, jD) != 0.0f;
            case 2:
                return prv.f(obj, jD) != 0;
            case 3:
                return prv.f(obj, jD) != 0;
            case 4:
                return prv.d(obj, jD) != 0;
            case 5:
                return prv.f(obj, jD) != 0;
            case 6:
                return prv.d(obj, jD) != 0;
            case 7:
                return prv.w(obj, jD);
            case 8:
                Object objH = prv.h(obj, jD);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof poc) {
                    return !poc.b.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return prv.h(obj, jD) != null;
            case 10:
                return !poc.b.equals(prv.h(obj, jD));
            case 11:
                return prv.d(obj, jD) != 0;
            case 12:
                return prv.d(obj, jD) != 0;
            case 13:
                return prv.d(obj, jD) != 0;
            case 14:
                return prv.f(obj, jD) != 0;
            case 15:
                return prv.d(obj, jD) != 0;
            case 16:
                return prv.f(obj, jD) != 0;
            case 17:
                return prv.h(obj, jD) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean S(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return R(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean T(Object obj, int i, prb prbVar) {
        return prbVar.k(prv.h(obj, D(i)));
    }

    private final boolean U(Object obj, int i, int i2) {
        return prv.d(obj, (long) (z(i2) & 1048575)) == i;
    }

    private static boolean V(Object obj, long j) {
        return ((Boolean) prv.h(obj, j)).booleanValue();
    }

    private static final int W(byte[] bArr, int i, int i2, pry pryVar, Class cls, pnr pnrVar) {
        pry pryVar2 = pry.DOUBLE;
        switch (pryVar) {
            case DOUBLE:
                pnrVar.c = Double.valueOf(plk.m(bArr, i));
                return i + 8;
            case FLOAT:
                pnrVar.c = Float.valueOf(plk.n(bArr, i));
                return i + 4;
            case INT64:
            case UINT64:
                int iA = plk.A(bArr, i, pnrVar);
                pnrVar.c = Long.valueOf(pnrVar.b);
                return iA;
            case INT32:
            case UINT32:
            case ENUM:
                int iX = plk.x(bArr, i, pnrVar);
                pnrVar.c = Integer.valueOf(pnrVar.a);
                return iX;
            case FIXED64:
            case SFIXED64:
                pnrVar.c = Long.valueOf(plk.C(bArr, i));
                return i + 8;
            case FIXED32:
            case SFIXED32:
                pnrVar.c = Integer.valueOf(plk.p(bArr, i));
                return i + 4;
            case BOOL:
                int iA2 = plk.A(bArr, i, pnrVar);
                pnrVar.c = Boolean.valueOf(pnrVar.b != 0);
                return iA2;
            case STRING:
                return plk.v(bArr, i, pnrVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return plk.r(pqu.a.a(cls), bArr, i, i2, pnrVar);
            case BYTES:
                return plk.o(bArr, i, pnrVar);
            case SINT32:
                int iX2 = plk.x(bArr, i, pnrVar);
                pnrVar.c = Integer.valueOf(poh.F(pnrVar.a));
                return iX2;
            case SINT64:
                int iA3 = plk.A(bArr, i, pnrVar);
                pnrVar.c = Long.valueOf(poh.G(pnrVar.b));
                return iA3;
        }
    }

    private final void X(Object obj, byte[] bArr, int i, int i2, pnr pnrVar) throws ppp {
        int i3;
        int iY;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        Unsafe unsafe2;
        int i7;
        Unsafe unsafe3;
        int i8;
        int i9;
        int i10;
        pqo pqoVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i11 = i2;
        pnr pnrVar2 = pnrVar;
        Unsafe unsafe4 = b;
        int i12 = -1;
        int iW = i;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (iW < i11) {
            int i17 = iW + 1;
            byte b2 = bArr2[iW];
            if (b2 < 0) {
                iY = plk.y(b2, bArr2, i17, pnrVar2);
                i3 = pnrVar2.a;
            } else {
                i3 = b2;
                iY = i17;
            }
            int i18 = i3 >>> 3;
            int i19 = i3 & 7;
            int iY2 = i18 > i13 ? pqoVar.y(i18, i14 / 3) : pqoVar.x(i18);
            if (iY2 == i12) {
                i4 = iY;
                i5 = i18;
                unsafe = unsafe4;
                i6 = 0;
            } else {
                int i20 = pqoVar.c[iY2 + 1];
                int iB = B(i20);
                Unsafe unsafe5 = unsafe4;
                long jD = D(i20);
                if (iB <= 17) {
                    int i21 = pqoVar.c[iY2 + 2];
                    int i22 = 1 << (i21 >>> 20);
                    int i23 = i21 & 1048575;
                    if (i23 != i16) {
                        if (i16 != 1048575) {
                            long j = i16;
                            unsafe3 = unsafe5;
                            unsafe3.putInt(obj2, j, i15);
                        } else {
                            unsafe3 = unsafe5;
                        }
                        if (i23 != 1048575) {
                            i15 = unsafe3.getInt(obj2, i23);
                        }
                        unsafe2 = unsafe3;
                        i16 = i23;
                    } else {
                        i20 = i20;
                        iY2 = iY2;
                        unsafe2 = unsafe5;
                    }
                    switch (iB) {
                        case 0:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 1) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                prv.q(obj2, jD, plk.m(bArr2, iY));
                                iW = iY + 8;
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        case 1:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 5) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                prv.r(obj2, jD, plk.n(bArr2, iY));
                                iW = iY + 4;
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        case 2:
                        case 3:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                int iA = plk.A(bArr2, iY, pnrVar2);
                                unsafe2.putLong(obj, jD, pnrVar2.b);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                iW = iA;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iW = plk.x(bArr2, iY, pnrVar2);
                                unsafe2.putInt(obj2, jD, pnrVar2.a);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        case 5:
                        case 14:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 1) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                unsafe2.putLong(obj, jD, plk.C(bArr2, iY));
                                iW = iY + 8;
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        case 6:
                        case 13:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 5) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                unsafe2.putInt(obj2, jD, plk.p(bArr2, iY));
                                iW = iY + 4;
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                                i14 = i7;
                            }
                            break;
                        case 7:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iW = plk.A(bArr2, iY, pnrVar2);
                                prv.m(obj2, jD, pnrVar2.b != 0);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                                i14 = i7;
                            }
                            break;
                        case 8:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iW = (i20 & 536870912) == 0 ? plk.u(bArr2, iY, pnrVar2) : plk.v(bArr2, iY, pnrVar2);
                                unsafe2.putObject(obj2, jD, pnrVar2.c);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                                i14 = i7;
                            }
                            break;
                        case 9:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iW = plk.r(pqoVar.G(i7), bArr2, iY, i2, pnrVar2);
                                Object object = unsafe2.getObject(obj2, jD);
                                if (object == null) {
                                    unsafe2.putObject(obj2, jD, pnrVar2.c);
                                } else {
                                    unsafe2.putObject(obj2, jD, ppn.e(object, pnrVar2.c));
                                }
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                                i14 = i7;
                            }
                            break;
                        case 10:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iW = plk.o(bArr2, iY, pnrVar2);
                                unsafe2.putObject(obj2, jD, pnrVar2.c);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        case 12:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iW = plk.x(bArr2, iY, pnrVar2);
                                unsafe2.putInt(obj2, jD, pnrVar2.a);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        case 15:
                            i7 = iY2;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iW = plk.x(bArr2, iY, pnrVar2);
                                unsafe2.putInt(obj2, jD, poh.F(pnrVar2.a));
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        case 16:
                            if (i19 != 0) {
                                i7 = iY2;
                                i5 = i18;
                                i4 = iY;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                int iA2 = plk.A(bArr2, iY, pnrVar2);
                                unsafe2.putLong(obj, jD, poh.G(pnrVar2.b));
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = iY2;
                                iW = iA2;
                                i13 = i18;
                                i12 = -1;
                                i11 = i2;
                            }
                            break;
                        default:
                            i7 = iY2;
                            i5 = i18;
                            i4 = iY;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                    }
                } else {
                    i5 = i18;
                    int i24 = iY2;
                    if (iB == 27) {
                        if (i19 == 2) {
                            ppm ppmVarE = (ppm) unsafe5.getObject(obj2, jD);
                            if (!ppmVarE.c()) {
                                int size = ppmVarE.size();
                                ppmVarE = ppmVarE.e(size == 0 ? 10 : size + size);
                                unsafe5.putObject(obj2, jD, ppmVarE);
                            }
                            iW = plk.s(pqoVar.G(i24), i3, bArr, iY, i2, ppmVarE, pnrVar);
                            i15 = i15;
                            unsafe4 = unsafe5;
                            i14 = i24;
                            i13 = i5;
                            i12 = -1;
                            i11 = i2;
                        } else {
                            i8 = iY;
                            i9 = i16;
                            i10 = i15;
                            unsafe = unsafe5;
                            i6 = i24;
                            i4 = i8;
                            i15 = i10;
                            i16 = i9;
                        }
                    } else if (iB <= 49) {
                        int i25 = iY;
                        int i26 = i15;
                        int i27 = i16;
                        unsafe = unsafe5;
                        i6 = i24;
                        iW = w(obj, bArr, iY, i2, i3, i5, i19, i24, i20, iB, jD, pnrVar);
                        if (iW != i25) {
                            pqoVar = this;
                            obj2 = obj;
                            bArr2 = bArr;
                            i11 = i2;
                            pnrVar2 = pnrVar;
                            i13 = i5;
                            i14 = i6;
                            i15 = i26;
                            i16 = i27;
                            unsafe4 = unsafe;
                            i12 = -1;
                        } else {
                            i4 = iW;
                            i15 = i26;
                            i16 = i27;
                        }
                    } else {
                        i8 = iY;
                        i10 = i15;
                        i9 = i16;
                        unsafe = unsafe5;
                        i6 = i24;
                        if (iB != 50) {
                            iW = v(obj, bArr, i8, i2, i3, i5, i19, i20, iB, jD, i6, pnrVar);
                            if (iW != i8) {
                                pqoVar = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i11 = i2;
                                pnrVar2 = pnrVar;
                                i13 = i5;
                                i14 = i6;
                                i15 = i10;
                                i16 = i9;
                                unsafe4 = unsafe;
                                i12 = -1;
                            } else {
                                i4 = iW;
                                i15 = i10;
                                i16 = i9;
                            }
                        } else if (i19 == 2) {
                            iW = u(obj, bArr, i8, i2, i6, jD, pnrVar);
                            if (iW != i8) {
                                pqoVar = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                i11 = i2;
                                pnrVar2 = pnrVar;
                                i13 = i5;
                                i14 = i6;
                                i15 = i10;
                                i16 = i9;
                                unsafe4 = unsafe;
                                i12 = -1;
                            } else {
                                i4 = iW;
                                i15 = i10;
                                i16 = i9;
                            }
                        } else {
                            i4 = i8;
                            i15 = i10;
                            i16 = i9;
                        }
                    }
                }
            }
            iW = plk.w(i3, bArr, i4, i2, d(obj), pnrVar);
            pqoVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i11 = i2;
            pnrVar2 = pnrVar;
            i13 = i5;
            i14 = i6;
            unsafe4 = unsafe;
            i12 = -1;
        }
        int i28 = i15;
        Unsafe unsafe6 = unsafe4;
        if (i16 != 1048575) {
            unsafe6.putInt(obj, i16, i28);
        }
        if (iW != i2) {
            throw ppp.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    private final void Y(Object obj, pon ponVar) {
        Iterator itD;
        Map.Entry entry;
        int i;
        if (this.h) {
            pou pouVarG = plk.g(obj);
            if (pouVarG.h()) {
                itD = null;
                entry = null;
            } else {
                itD = pouVarG.d();
                entry = (Map.Entry) itD.next();
            }
        } else {
            itD = null;
            entry = null;
        }
        int length = this.c.length;
        Unsafe unsafe = b;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iC = C(i3);
            int iS = s(i3);
            int iB = B(iC);
            if (iB <= 17) {
                int i6 = this.c[i3 + 2];
                int i7 = i6 & i2;
                if (i7 != i4) {
                    i5 = unsafe.getInt(obj, i7);
                    i4 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && plk.f(entry) <= iS) {
                plk.j(ponVar, entry);
                entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
            }
            long jD = D(iC);
            switch (iB) {
                case 0:
                    if ((i & i5) != 0) {
                        ponVar.c(iS, prv.b(obj, jD));
                    }
                    break;
                case 1:
                    if ((i & i5) != 0) {
                        ponVar.g(iS, prv.c(obj, jD));
                    }
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        ponVar.j(iS, unsafe.getLong(obj, jD));
                    }
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        ponVar.s(iS, unsafe.getLong(obj, jD));
                    }
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        ponVar.i(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        ponVar.f(iS, unsafe.getLong(obj, jD));
                    }
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        ponVar.e(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 7:
                    if ((i & i5) != 0) {
                        ponVar.a(iS, prv.w(obj, jD));
                    }
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        aa(iS, unsafe.getObject(obj, jD), ponVar);
                    }
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        ponVar.k(iS, unsafe.getObject(obj, jD), G(i3));
                    }
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        ponVar.b(iS, (poc) unsafe.getObject(obj, jD));
                    }
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        ponVar.r(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        ponVar.d(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        ponVar.m(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        ponVar.n(iS, unsafe.getLong(obj, jD));
                    }
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        ponVar.o(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        ponVar.p(iS, unsafe.getLong(obj, jD));
                    }
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        ponVar.h(iS, unsafe.getObject(obj, jD), G(i3));
                    }
                    break;
                case 18:
                    prc.D(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 19:
                    prc.H(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 20:
                    prc.K(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 21:
                    prc.S(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 22:
                    prc.J(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 23:
                    prc.G(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 24:
                    prc.F(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 25:
                    prc.B(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 26:
                    prc.Q(s(i3), (List) unsafe.getObject(obj, jD), ponVar);
                    break;
                case 27:
                    prc.L(s(i3), (List) unsafe.getObject(obj, jD), ponVar, G(i3));
                    break;
                case 28:
                    prc.C(s(i3), (List) unsafe.getObject(obj, jD), ponVar);
                    break;
                case 29:
                    prc.R(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    prc.E(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    prc.M(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case 32:
                    prc.N(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    prc.O(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    prc.P(s(i3), (List) unsafe.getObject(obj, jD), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    prc.D(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    prc.H(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    prc.K(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    prc.S(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    prc.J(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    prc.G(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    prc.F(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    prc.B(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    prc.R(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    prc.E(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    prc.M(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    prc.N(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    prc.O(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    prc.P(s(i3), (List) unsafe.getObject(obj, jD), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    prc.I(s(i3), (List) unsafe.getObject(obj, jD), ponVar, G(i3));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    Z(ponVar, iS, unsafe.getObject(obj, jD), i3);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (U(obj, iS, i3)) {
                        ponVar.c(iS, o(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (U(obj, iS, i3)) {
                        ponVar.g(iS, p(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (U(obj, iS, i3)) {
                        ponVar.j(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (U(obj, iS, i3)) {
                        ponVar.s(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (U(obj, iS, i3)) {
                        ponVar.i(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (U(obj, iS, i3)) {
                        ponVar.f(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (U(obj, iS, i3)) {
                        ponVar.e(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (U(obj, iS, i3)) {
                        ponVar.a(iS, V(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (U(obj, iS, i3)) {
                        aa(iS, unsafe.getObject(obj, jD), ponVar);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (U(obj, iS, i3)) {
                        ponVar.k(iS, unsafe.getObject(obj, jD), G(i3));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (U(obj, iS, i3)) {
                        ponVar.b(iS, (poc) unsafe.getObject(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (U(obj, iS, i3)) {
                        ponVar.r(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (U(obj, iS, i3)) {
                        ponVar.d(iS, t(obj, jD));
                    }
                    break;
                case 64:
                    if (U(obj, iS, i3)) {
                        ponVar.m(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (U(obj, iS, i3)) {
                        ponVar.n(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (U(obj, iS, i3)) {
                        ponVar.o(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (U(obj, iS, i3)) {
                        ponVar.p(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (U(obj, iS, i3)) {
                        ponVar.h(iS, unsafe.getObject(obj, jD), G(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        while (entry != null) {
            plk.j(ponVar, entry);
            entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
        }
        ad(obj, ponVar);
    }

    private final void Z(pon ponVar, int i, Object obj, int i2) {
        if (obj != null) {
            pqf pqfVarAN = plk.aN(H(i2));
            pom pomVar = ponVar.a;
            Iterator it = ((pqh) obj).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ponVar.a.A(i, 2);
                ponVar.a.C(pqg.a(pqfVarAN, entry.getKey(), entry.getValue()));
                pqg.c(ponVar.a, pqfVarAN, entry.getKey(), entry.getValue());
            }
        }
    }

    private static final void aa(int i, Object obj, pon ponVar) {
        if (obj instanceof String) {
            ponVar.q(i, (String) obj);
        } else {
            ponVar.b(i, (poc) obj);
        }
    }

    private final Object ab(Object obj, int i, Object obj2) {
        ppi ppiVarF;
        int iS = s(i);
        Object objH = prv.h(obj, D(C(i)));
        if (objH == null || (ppiVarF = F(i)) == null) {
            return obj2;
        }
        pqf pqfVarAN = plk.aN(H(i));
        Iterator it = ((pqh) objH).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!ppiVarF.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = prn.b();
                }
                int iA = pqg.a(pqfVarAN, entry.getKey(), entry.getValue());
                poc pocVar = poc.b;
                byte[] bArr = new byte[iA];
                pom pomVarAi = pom.ai(bArr);
                try {
                    pqg.c(pomVarAi, pqfVarAN, entry.getKey(), entry.getValue());
                    plk.aD(obj2, iS, plk.l(pomVarAi, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static final int ac(Object obj) {
        return plk.aF(obj).a();
    }

    private static final void ad(Object obj, pon ponVar) {
        plk.aF(obj).e(ponVar);
    }

    static prn d(Object obj) {
        ppd ppdVar = (ppd) obj;
        prn prnVar = ppdVar.aF;
        if (prnVar != prn.a) {
            return prnVar;
        }
        prn prnVarB = prn.b();
        ppdVar.aF = prnVarB;
        return prnVarB;
    }

    static pqo m(pqj pqjVar, plk plkVar, pqa pqaVar, plk plkVar2, plk plkVar3, plk plkVar4) {
        if (pqjVar instanceof pqw) {
            return n((pqw) pqjVar, pqaVar, plkVar2, plkVar3, plkVar4);
        }
        throw null;
    }

    static pqo n(pqw pqwVar, pqa pqaVar, plk plkVar, plk plkVar2, plk plkVar3) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z;
        int iObjectFieldOffset;
        int i20;
        int i21;
        int i22;
        Field fieldI;
        char cCharAt9;
        int i23;
        Field fieldI2;
        Field fieldI3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        int i28 = 0;
        boolean z2 = pqwVar.c() == 2;
        String str = pqwVar.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (str.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt3 = str.charAt(i);
        if (iCharAt3 >= 55296) {
            int i31 = iCharAt3 & 8191;
            int i32 = 13;
            while (true) {
                i27 = i30 + 1;
                cCharAt13 = str.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i27;
            }
            iCharAt3 = i31 | (cCharAt13 << i32);
            i30 = i27;
        }
        if (iCharAt3 == 0) {
            iArr = a;
            i3 = 0;
            iCharAt = 0;
            i5 = 0;
            i4 = 0;
            i2 = 0;
            iCharAt2 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt4 = str.charAt(i30);
            if (iCharAt4 >= 55296) {
                int i34 = iCharAt4 & 8191;
                int i35 = 13;
                while (true) {
                    i13 = i33 + 1;
                    cCharAt8 = str.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i13;
                }
                iCharAt4 = i34 | (cCharAt8 << i35);
                i33 = i13;
            }
            int i36 = i33 + 1;
            int iCharAt5 = str.charAt(i33);
            if (iCharAt5 >= 55296) {
                int i37 = iCharAt5 & 8191;
                int i38 = 13;
                while (true) {
                    i12 = i36 + 1;
                    cCharAt7 = str.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i12;
                }
                iCharAt5 = i37 | (cCharAt7 << i38);
                i36 = i12;
            }
            int i39 = i36 + 1;
            iCharAt = str.charAt(i36);
            if (iCharAt >= 55296) {
                int i40 = iCharAt & 8191;
                int i41 = 13;
                while (true) {
                    i11 = i39 + 1;
                    cCharAt6 = str.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i11;
                }
                iCharAt = i40 | (cCharAt6 << i41);
                i39 = i11;
            }
            int i42 = i39 + 1;
            int iCharAt6 = str.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i10 = i42 + 1;
                    cCharAt5 = str.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i10;
                }
                iCharAt6 = i43 | (cCharAt5 << i44);
                i42 = i10;
            }
            int i45 = i42 + 1;
            int iCharAt7 = str.charAt(i42);
            if (iCharAt7 >= 55296) {
                int i46 = iCharAt7 & 8191;
                int i47 = 13;
                while (true) {
                    i9 = i45 + 1;
                    cCharAt4 = str.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i9;
                }
                iCharAt7 = i46 | (cCharAt4 << i47);
                i45 = i9;
            }
            int i48 = i45 + 1;
            int iCharAt8 = str.charAt(i45);
            if (iCharAt8 >= 55296) {
                int i49 = iCharAt8 & 8191;
                int i50 = 13;
                while (true) {
                    i8 = i48 + 1;
                    cCharAt3 = str.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i8;
                }
                iCharAt8 = i49 | (cCharAt3 << i50);
                i48 = i8;
            }
            int i51 = i48 + 1;
            int iCharAt9 = str.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i52 = iCharAt9 & 8191;
                int i53 = 13;
                while (true) {
                    i7 = i51 + 1;
                    cCharAt2 = str.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i7;
                }
                iCharAt9 = i52 | (cCharAt2 << i53);
                i51 = i7;
            }
            int i54 = i51 + 1;
            iCharAt2 = str.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i6 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i56 = i6;
                }
                iCharAt2 = i55 | (cCharAt << i57);
                i54 = i6;
            }
            int[] iArr2 = new int[iCharAt2 + iCharAt8 + iCharAt9];
            i2 = iCharAt4 + iCharAt4 + iCharAt5;
            i3 = iCharAt7;
            i4 = iCharAt6;
            i5 = iCharAt8;
            iArr = iArr2;
            i28 = iCharAt4;
            i30 = i54;
        }
        Unsafe unsafe = b;
        Object[] objArr = pqwVar.c;
        Class<?> cls = pqwVar.a.getClass();
        int i58 = i30;
        int[] iArr3 = new int[i3 * 3];
        Object[] objArr2 = new Object[i3 + i3];
        int i59 = iCharAt2 + i5;
        int i60 = iCharAt2;
        int i61 = i58;
        int i62 = i59;
        int i63 = 0;
        int i64 = 0;
        while (i61 < length) {
            int i65 = i61 + 1;
            int iCharAt10 = str.charAt(i61);
            int i66 = length;
            if (iCharAt10 >= 55296) {
                int i67 = iCharAt10 & 8191;
                int i68 = i65;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    i14 = iCharAt2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i26;
                    iCharAt2 = i14;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i15 = i26;
            } else {
                i14 = iCharAt2;
                i15 = i65;
            }
            int i70 = i15 + 1;
            int iCharAt11 = str.charAt(i15);
            if (iCharAt11 >= 55296) {
                int i71 = iCharAt11 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i25 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    i16 = i4;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i72 = i25;
                    i4 = i16;
                }
                iCharAt11 = i71 | (cCharAt11 << i73);
                i17 = i25;
            } else {
                i16 = i4;
                i17 = i70;
            }
            int i74 = iCharAt11 & 255;
            int i75 = iCharAt;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i74 >= 51) {
                int i76 = i17 + 1;
                int iCharAt12 = str.charAt(i17);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i77 = 13;
                    int i78 = iCharAt12 & 8191;
                    int i79 = i76;
                    while (true) {
                        i24 = i79 + 1;
                        cCharAt10 = str.charAt(i79);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i79 = i24;
                        c = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i77);
                    i23 = i24;
                } else {
                    i23 = i76;
                }
                int i80 = i23;
                int i81 = i74 - 51;
                if (i81 == 9 || i81 == 17) {
                    int i82 = i63 / 3;
                    objArr2[i82 + i82 + 1] = objArr[i2];
                    i2++;
                } else if (i81 == 12 && !z2) {
                    int i83 = i63 / 3;
                    objArr2[i83 + i83 + 1] = objArr[i2];
                    i2++;
                }
                int i84 = iCharAt12 + iCharAt12;
                Object obj = objArr[i84];
                if (obj instanceof Field) {
                    fieldI2 = (Field) obj;
                } else {
                    fieldI2 = I(cls, (String) obj);
                    objArr[i84] = fieldI2;
                }
                i18 = iCharAt10;
                int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI2);
                int i85 = i84 + 1;
                Object obj2 = objArr[i85];
                if (obj2 instanceof Field) {
                    fieldI3 = (Field) obj2;
                } else {
                    fieldI3 = I(cls, (String) obj2);
                    objArr[i85] = fieldI3;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI3);
                iObjectFieldOffset = iObjectFieldOffset2;
                i21 = iObjectFieldOffset3;
                i19 = i2;
                i17 = i80;
                str = str;
                z = z2;
                i20 = 0;
            } else {
                i18 = iCharAt10;
                i19 = i2 + 1;
                Field fieldI4 = I(cls, (String) objArr[i2]);
                if (i74 == 9 || i74 == 17) {
                    int i86 = i63 / 3;
                    objArr2[i86 + i86 + 1] = fieldI4.getType();
                } else if (i74 == 27 || i74 == 49) {
                    int i87 = i63 / 3;
                    objArr2[i87 + i87 + 1] = objArr[i19];
                    i19++;
                } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                    if (!z2) {
                        int i88 = i63 / 3;
                        objArr2[i88 + i88 + 1] = objArr[i19];
                        i19++;
                    }
                } else if (i74 == 50) {
                    int i89 = i60 + 1;
                    iArr[i60] = i63;
                    int i90 = i63 / 3;
                    int i91 = i90 + i90;
                    int i92 = i19 + 1;
                    objArr2[i91] = objArr[i19];
                    if ((iCharAt11 & 2048) != 0) {
                        i19 = i92 + 1;
                        objArr2[i91 + 1] = objArr[i92];
                        i60 = i89;
                    } else {
                        i60 = i89;
                        i19 = i92;
                    }
                }
                z = z2;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI4);
                if ((iCharAt11 & 4096) != 4096 || i74 > 17) {
                    i20 = 0;
                    i21 = 1048575;
                } else {
                    int i93 = i17 + 1;
                    int iCharAt13 = str.charAt(i17);
                    if (iCharAt13 >= 55296) {
                        int i94 = iCharAt13 & 8191;
                        int i95 = 13;
                        while (true) {
                            i22 = i93 + 1;
                            cCharAt9 = str.charAt(i93);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i94 |= (cCharAt9 & 8191) << i95;
                            i95 += 13;
                            i93 = i22;
                        }
                        iCharAt13 = i94 | (cCharAt9 << i95);
                    } else {
                        i22 = i93;
                    }
                    int i96 = i28 + i28 + (iCharAt13 / 32);
                    Object obj3 = objArr[i96];
                    if (obj3 instanceof Field) {
                        fieldI = (Field) obj3;
                    } else {
                        fieldI = I(cls, (String) obj3);
                        objArr[i96] = fieldI;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldI);
                    i20 = iCharAt13 % 32;
                    i17 = i22;
                    i21 = iObjectFieldOffset4;
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
            }
            int i97 = i63 + 1;
            iArr3[i63] = i18;
            int i98 = i97 + 1;
            iArr3[i97] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i74 << 20) | iObjectFieldOffset;
            iArr3[i98] = (i20 << 20) | i21;
            i63 = i98 + 1;
            str = str;
            z2 = z;
            i61 = i17;
            iCharAt = i75;
            length = i66;
            iCharAt2 = i14;
            i4 = i16;
            i2 = i19;
        }
        return new pqo(iArr3, objArr2, iCharAt, i4, pqwVar.a, z2, iArr, iCharAt2, i59, pqaVar, plkVar, plkVar2, null, null, null, null);
    }

    private static double o(Object obj, long j) {
        return ((Double) prv.h(obj, j)).doubleValue();
    }

    private static float p(Object obj, long j) {
        return ((Float) prv.h(obj, j)).floatValue();
    }

    private final int q(Object obj) {
        int i;
        Unsafe unsafe = b;
        int iAw = 0;
        int i2 = 0;
        int i3 = 1048575;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int iC = C(i4);
            int iS = s(i4);
            int iB = B(iC);
            if (iB <= 17) {
                int i5 = this.c[i4 + 2];
                int i6 = i5 & 1048575;
                i = 1 << (i5 >>> 20);
                if (i6 != i3) {
                    i2 = unsafe.getInt(obj, i6);
                    i3 = i6;
                }
            } else {
                i = 0;
            }
            long jD = D(iC);
            switch (iB) {
                case 0:
                    if ((i2 & i) != 0) {
                        iAw += pom.aw(iS);
                    }
                    break;
                case 1:
                    if ((i2 & i) != 0) {
                        iAw += pom.az(iS);
                    }
                    break;
                case 2:
                    if ((i2 & i) != 0) {
                        iAw += pom.O(iS, unsafe.getLong(obj, jD));
                    }
                    break;
                case 3:
                    if ((i2 & i) != 0) {
                        iAw += pom.ae(iS, unsafe.getLong(obj, jD));
                    }
                    break;
                case 4:
                    if ((i2 & i) != 0) {
                        iAw += pom.M(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 5:
                    if ((i2 & i) != 0) {
                        iAw += pom.ay(iS);
                    }
                    break;
                case 6:
                    if ((i2 & i) != 0) {
                        iAw += pom.ax(iS);
                    }
                    break;
                case 7:
                    if ((i2 & i) != 0) {
                        iAw += pom.av(iS);
                    }
                    break;
                case 8:
                    if ((i2 & i) != 0) {
                        Object object = unsafe.getObject(obj, jD);
                        iAw = object instanceof poc ? iAw + pom.H(iS, (poc) object) : iAw + pom.Z(iS, (String) object);
                    }
                    break;
                case 9:
                    if ((i2 & i) != 0) {
                        iAw += prc.i(iS, unsafe.getObject(obj, jD), G(i4));
                    }
                    break;
                case 10:
                    if ((i2 & i) != 0) {
                        iAw += pom.H(iS, (poc) unsafe.getObject(obj, jD));
                    }
                    break;
                case 11:
                    if ((i2 & i) != 0) {
                        iAw += pom.ac(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 12:
                    if ((i2 & i) != 0) {
                        iAw += pom.J(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 13:
                    if ((i2 & i) != 0) {
                        iAw += pom.aA(iS);
                    }
                    break;
                case 14:
                    if ((i2 & i) != 0) {
                        iAw += pom.aB(iS);
                    }
                    break;
                case 15:
                    if ((i2 & i) != 0) {
                        iAw += pom.V(iS, unsafe.getInt(obj, jD));
                    }
                    break;
                case 16:
                    if ((i2 & i) != 0) {
                        iAw += pom.X(iS, unsafe.getLong(obj, jD));
                    }
                    break;
                case 17:
                    if ((i2 & i) != 0) {
                        iAw += pom.K(iS, (pqm) unsafe.getObject(obj, jD), G(i4));
                    }
                    break;
                case 18:
                    iAw += prc.u(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 19:
                    iAw += prc.t(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 20:
                    iAw += prc.w(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 21:
                    iAw += prc.A(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 22:
                    iAw += prc.v(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 23:
                    iAw += prc.u(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 24:
                    iAw += prc.t(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 25:
                    iAw += prc.r(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 26:
                    iAw += prc.m(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 27:
                    iAw += prc.j(iS, (List) unsafe.getObject(obj, jD), G(i4));
                    break;
                case 28:
                    iAw += prc.b(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 29:
                    iAw += prc.z(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    iAw += prc.s(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iAw += prc.t(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case 32:
                    iAw += prc.u(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iAw += prc.x(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    iAw += prc.y(iS, (List) unsafe.getObject(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    int iE = prc.e((List) unsafe.getObject(obj, jD));
                    if (iE > 0) {
                        iAw += pom.ab(iS) + pom.ad(iE) + iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    int iD = prc.d((List) unsafe.getObject(obj, jD));
                    if (iD > 0) {
                        iAw += pom.ab(iS) + pom.ad(iD) + iD;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    int iH = prc.h((List) unsafe.getObject(obj, jD));
                    if (iH > 0) {
                        iAw += pom.ab(iS) + pom.ad(iH) + iH;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    int iO = prc.o((List) unsafe.getObject(obj, jD));
                    if (iO > 0) {
                        iAw += pom.ab(iS) + pom.ad(iO) + iO;
                    }
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    int iG = prc.g((List) unsafe.getObject(obj, jD));
                    if (iG > 0) {
                        iAw += pom.ab(iS) + pom.ad(iG) + iG;
                    }
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    int iE2 = prc.e((List) unsafe.getObject(obj, jD));
                    if (iE2 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iE2) + iE2;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    int iD2 = prc.d((List) unsafe.getObject(obj, jD));
                    if (iD2 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iD2) + iD2;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    int iA = prc.a((List) unsafe.getObject(obj, jD));
                    if (iA > 0) {
                        iAw += pom.ab(iS) + pom.ad(iA) + iA;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    int iN = prc.n((List) unsafe.getObject(obj, jD));
                    if (iN > 0) {
                        iAw += pom.ab(iS) + pom.ad(iN) + iN;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    int iC2 = prc.c((List) unsafe.getObject(obj, jD));
                    if (iC2 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iC2) + iC2;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    int iD3 = prc.d((List) unsafe.getObject(obj, jD));
                    if (iD3 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iD3) + iD3;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    int iE3 = prc.e((List) unsafe.getObject(obj, jD));
                    if (iE3 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iE3) + iE3;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    int iK = prc.k((List) unsafe.getObject(obj, jD));
                    if (iK > 0) {
                        iAw += pom.ab(iS) + pom.ad(iK) + iK;
                    }
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    int iL = prc.l((List) unsafe.getObject(obj, jD));
                    if (iL > 0) {
                        iAw += pom.ab(iS) + pom.ad(iL) + iL;
                    }
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iAw += prc.f(iS, (List) unsafe.getObject(obj, jD), G(i4));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    iAw += plk.aO(iS, unsafe.getObject(obj, jD), H(i4));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.aw(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.az(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.O(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.ae(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.M(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.ay(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.ax(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.av(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (U(obj, iS, i4)) {
                        Object object2 = unsafe.getObject(obj, jD);
                        iAw = object2 instanceof poc ? iAw + pom.H(iS, (poc) object2) : iAw + pom.Z(iS, (String) object2);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (U(obj, iS, i4)) {
                        iAw += prc.i(iS, unsafe.getObject(obj, jD), G(i4));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.H(iS, (poc) unsafe.getObject(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.ac(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.J(iS, t(obj, jD));
                    }
                    break;
                case 64:
                    if (U(obj, iS, i4)) {
                        iAw += pom.aA(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.aB(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.V(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.X(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (U(obj, iS, i4)) {
                        iAw += pom.K(iS, (pqm) unsafe.getObject(obj, jD), G(i4));
                    }
                    break;
            }
        }
        int iAc = iAw + ac(obj);
        if (!this.h) {
            return iAc;
        }
        pou pouVarG = plk.g(obj);
        int iJ = 0;
        for (int i7 = 0; i7 < pouVarG.b.a(); i7++) {
            Map.Entry entryF = pouVarG.b.f(i7);
            iJ += pou.j((ppc) entryF.getKey(), entryF.getValue());
        }
        for (Map.Entry entry : pouVarG.b.c()) {
            iJ += pou.j((ppc) entry.getKey(), entry.getValue());
        }
        return iAc + iJ;
    }

    private final int r(Object obj) {
        Unsafe unsafe = b;
        int iAw = 0;
        for (int i = 0; i < this.c.length; i += 3) {
            int iC = C(i);
            int iB = B(iC);
            int iS = s(i);
            long jD = D(iC);
            if (iB >= pov.DOUBLE_LIST_PACKED.Z && iB <= pov.SINT64_LIST_PACKED.Z) {
                int i2 = this.c[i + 2];
            }
            switch (iB) {
                case 0:
                    if (R(obj, i)) {
                        iAw += pom.aw(iS);
                    }
                    break;
                case 1:
                    if (R(obj, i)) {
                        iAw += pom.az(iS);
                    }
                    break;
                case 2:
                    if (R(obj, i)) {
                        iAw += pom.O(iS, prv.f(obj, jD));
                    }
                    break;
                case 3:
                    if (R(obj, i)) {
                        iAw += pom.ae(iS, prv.f(obj, jD));
                    }
                    break;
                case 4:
                    if (R(obj, i)) {
                        iAw += pom.M(iS, prv.d(obj, jD));
                    }
                    break;
                case 5:
                    if (R(obj, i)) {
                        iAw += pom.ay(iS);
                    }
                    break;
                case 6:
                    if (R(obj, i)) {
                        iAw += pom.ax(iS);
                    }
                    break;
                case 7:
                    if (R(obj, i)) {
                        iAw += pom.av(iS);
                    }
                    break;
                case 8:
                    if (R(obj, i)) {
                        Object objH = prv.h(obj, jD);
                        iAw = objH instanceof poc ? iAw + pom.H(iS, (poc) objH) : iAw + pom.Z(iS, (String) objH);
                    }
                    break;
                case 9:
                    if (R(obj, i)) {
                        iAw += prc.i(iS, prv.h(obj, jD), G(i));
                    }
                    break;
                case 10:
                    if (R(obj, i)) {
                        iAw += pom.H(iS, (poc) prv.h(obj, jD));
                    }
                    break;
                case 11:
                    if (R(obj, i)) {
                        iAw += pom.ac(iS, prv.d(obj, jD));
                    }
                    break;
                case 12:
                    if (R(obj, i)) {
                        iAw += pom.J(iS, prv.d(obj, jD));
                    }
                    break;
                case 13:
                    if (R(obj, i)) {
                        iAw += pom.aA(iS);
                    }
                    break;
                case 14:
                    if (R(obj, i)) {
                        iAw += pom.aB(iS);
                    }
                    break;
                case 15:
                    if (R(obj, i)) {
                        iAw += pom.V(iS, prv.d(obj, jD));
                    }
                    break;
                case 16:
                    if (R(obj, i)) {
                        iAw += pom.X(iS, prv.f(obj, jD));
                    }
                    break;
                case 17:
                    if (R(obj, i)) {
                        iAw += pom.K(iS, (pqm) prv.h(obj, jD), G(i));
                    }
                    break;
                case 18:
                    iAw += prc.u(iS, J(obj, jD));
                    break;
                case 19:
                    iAw += prc.t(iS, J(obj, jD));
                    break;
                case 20:
                    iAw += prc.w(iS, J(obj, jD));
                    break;
                case 21:
                    iAw += prc.A(iS, J(obj, jD));
                    break;
                case 22:
                    iAw += prc.v(iS, J(obj, jD));
                    break;
                case 23:
                    iAw += prc.u(iS, J(obj, jD));
                    break;
                case 24:
                    iAw += prc.t(iS, J(obj, jD));
                    break;
                case 25:
                    iAw += prc.r(iS, J(obj, jD));
                    break;
                case 26:
                    iAw += prc.m(iS, J(obj, jD));
                    break;
                case 27:
                    iAw += prc.j(iS, J(obj, jD), G(i));
                    break;
                case 28:
                    iAw += prc.b(iS, J(obj, jD));
                    break;
                case 29:
                    iAw += prc.z(iS, J(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    iAw += prc.s(iS, J(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iAw += prc.t(iS, J(obj, jD));
                    break;
                case 32:
                    iAw += prc.u(iS, J(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iAw += prc.x(iS, J(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    iAw += prc.y(iS, J(obj, jD));
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    int iE = prc.e((List) unsafe.getObject(obj, jD));
                    if (iE > 0) {
                        iAw += pom.ab(iS) + pom.ad(iE) + iE;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    int iD = prc.d((List) unsafe.getObject(obj, jD));
                    if (iD > 0) {
                        iAw += pom.ab(iS) + pom.ad(iD) + iD;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    int iH = prc.h((List) unsafe.getObject(obj, jD));
                    if (iH > 0) {
                        iAw += pom.ab(iS) + pom.ad(iH) + iH;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    int iO = prc.o((List) unsafe.getObject(obj, jD));
                    if (iO > 0) {
                        iAw += pom.ab(iS) + pom.ad(iO) + iO;
                    }
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    int iG = prc.g((List) unsafe.getObject(obj, jD));
                    if (iG > 0) {
                        iAw += pom.ab(iS) + pom.ad(iG) + iG;
                    }
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    int iE2 = prc.e((List) unsafe.getObject(obj, jD));
                    if (iE2 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iE2) + iE2;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    int iD2 = prc.d((List) unsafe.getObject(obj, jD));
                    if (iD2 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iD2) + iD2;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    int iA = prc.a((List) unsafe.getObject(obj, jD));
                    if (iA > 0) {
                        iAw += pom.ab(iS) + pom.ad(iA) + iA;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    int iN = prc.n((List) unsafe.getObject(obj, jD));
                    if (iN > 0) {
                        iAw += pom.ab(iS) + pom.ad(iN) + iN;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    int iC2 = prc.c((List) unsafe.getObject(obj, jD));
                    if (iC2 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iC2) + iC2;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    int iD3 = prc.d((List) unsafe.getObject(obj, jD));
                    if (iD3 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iD3) + iD3;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    int iE3 = prc.e((List) unsafe.getObject(obj, jD));
                    if (iE3 > 0) {
                        iAw += pom.ab(iS) + pom.ad(iE3) + iE3;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    int iK = prc.k((List) unsafe.getObject(obj, jD));
                    if (iK > 0) {
                        iAw += pom.ab(iS) + pom.ad(iK) + iK;
                    }
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    int iL = prc.l((List) unsafe.getObject(obj, jD));
                    if (iL > 0) {
                        iAw += pom.ab(iS) + pom.ad(iL) + iL;
                    }
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iAw += prc.f(iS, J(obj, jD), G(i));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    iAw += plk.aO(iS, prv.h(obj, jD), H(i));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.aw(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.az(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.O(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.ae(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.M(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.ay(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.ax(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.av(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (U(obj, iS, i)) {
                        Object objH2 = prv.h(obj, jD);
                        iAw = objH2 instanceof poc ? iAw + pom.H(iS, (poc) objH2) : iAw + pom.Z(iS, (String) objH2);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (U(obj, iS, i)) {
                        iAw += prc.i(iS, prv.h(obj, jD), G(i));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.H(iS, (poc) prv.h(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.ac(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.J(iS, t(obj, jD));
                    }
                    break;
                case 64:
                    if (U(obj, iS, i)) {
                        iAw += pom.aA(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.aB(iS);
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.V(iS, t(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.X(iS, E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (U(obj, iS, i)) {
                        iAw += pom.K(iS, (pqm) prv.h(obj, jD), G(i));
                    }
                    break;
            }
        }
        return iAw + ac(obj);
    }

    private final int s(int i) {
        return this.c[i];
    }

    private static int t(Object obj, long j) {
        return ((Integer) prv.h(obj, j)).intValue();
    }

    private final int u(Object obj, byte[] bArr, int i, int i2, int i3, long j, pnr pnrVar) throws ppp {
        Unsafe unsafe = b;
        Object objH = H(i3);
        Object object = unsafe.getObject(obj, j);
        if (plk.aP(object)) {
            Object objAR = plk.aR();
            plk.aQ(objAR, object);
            unsafe.putObject(obj, j, objAR);
            object = objAR;
        }
        pqf pqfVarAN = plk.aN(objH);
        pqh pqhVar = (pqh) object;
        int iX = plk.x(bArr, i, pnrVar);
        int i4 = pnrVar.a;
        if (i4 < 0 || i4 > i2 - iX) {
            throw ppp.i();
        }
        int i5 = iX + i4;
        Object obj2 = pqfVarAN.b;
        Object obj3 = pqfVarAN.d;
        while (iX < i5) {
            int iY = iX + 1;
            int i6 = bArr[iX];
            if (i6 < 0) {
                iY = plk.y(i6, bArr, iY, pnrVar);
                i6 = pnrVar.a;
            }
            int i7 = i6 & 7;
            switch (i6 >>> 3) {
                case 1:
                    pry pryVar = pqfVarAN.a;
                    if (i7 != pryVar.t) {
                        iX = plk.B(i6, bArr, iY, i2, pnrVar);
                    } else {
                        iX = W(bArr, iY, i2, pryVar, null, pnrVar);
                        obj2 = pnrVar.c;
                    }
                    break;
                case 2:
                    pry pryVar2 = pqfVarAN.c;
                    if (i7 != pryVar2.t) {
                        iX = plk.B(i6, bArr, iY, i2, pnrVar);
                    } else {
                        iX = W(bArr, iY, i2, pryVar2, pqfVarAN.d.getClass(), pnrVar);
                        obj3 = pnrVar.c;
                    }
                    break;
                default:
                    iX = plk.B(i6, bArr, iY, i2, pnrVar);
                    break;
            }
        }
        if (iX != i5) {
            throw ppp.g();
        }
        pqhVar.put(obj2, obj3);
        return i5;
    }

    private final int v(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, pnr pnrVar) throws ppp {
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(plk.m(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(plk.n(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                int iA = plk.A(bArr, i, pnrVar);
                unsafe.putObject(obj, j, Long.valueOf(pnrVar.b));
                unsafe.putInt(obj, j2, i4);
                return iA;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                int iX = plk.x(bArr, i, pnrVar);
                unsafe.putObject(obj, j, Integer.valueOf(pnrVar.a));
                unsafe.putInt(obj, j2, i4);
                return iX;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(plk.C(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(plk.p(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                int iA2 = plk.A(bArr, i, pnrVar);
                unsafe.putObject(obj, j, Boolean.valueOf(pnrVar.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iA2;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                int iX2 = plk.x(bArr, i, pnrVar);
                int i9 = pnrVar.a;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !prx.h(bArr, iX2, iX2 + i9)) {
                        throw ppp.d();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iX2, i9, ppn.a));
                    iX2 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return iX2;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int iR = plk.r(G(i8), bArr, i, i2, pnrVar);
                Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, pnrVar.c);
                } else {
                    unsafe.putObject(obj, j, ppn.e(object, pnrVar.c));
                }
                unsafe.putInt(obj, j2, i4);
                return iR;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                int iO = plk.o(bArr, i, pnrVar);
                unsafe.putObject(obj, j, pnrVar.c);
                unsafe.putInt(obj, j2, i4);
                return iO;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int iX3 = plk.x(bArr, i, pnrVar);
                int i10 = pnrVar.a;
                ppi ppiVarF = F(i8);
                if (ppiVarF == null || ppiVarF.a(i10)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    d(obj).d(i3, Long.valueOf(i10));
                }
                return iX3;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                int iX4 = plk.x(bArr, i, pnrVar);
                unsafe.putObject(obj, j, Integer.valueOf(poh.F(pnrVar.a)));
                unsafe.putInt(obj, j2, i4);
                return iX4;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i5 != 0) {
                    return i;
                }
                int iA3 = plk.A(bArr, i, pnrVar);
                unsafe.putObject(obj, j, Long.valueOf(poh.G(pnrVar.b)));
                unsafe.putInt(obj, j2, i4);
                return iA3;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i5 != 3) {
                    return i;
                }
                int iQ = plk.q(G(i8), bArr, i, i2, (i3 & (-8)) | 4, pnrVar);
                Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j, pnrVar.c);
                } else {
                    unsafe.putObject(obj, j, ppn.e(object2, pnrVar.c));
                }
                unsafe.putInt(obj, j2, i4);
                return iQ;
            default:
                return i;
        }
    }

    private final int w(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, pnr pnrVar) throws ppp {
        int iZ;
        int iX = i;
        Unsafe unsafe = b;
        ppm ppmVarE = (ppm) unsafe.getObject(obj, j2);
        if (!ppmVarE.c()) {
            int size = ppmVarE.size();
            ppmVarE = ppmVarE.e(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, ppmVarE);
        }
        switch (i7) {
            case 18:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                if (i5 == 2) {
                    poo pooVar = (poo) ppmVarE;
                    int iX2 = plk.x(bArr, iX, pnrVar);
                    int i8 = pnrVar.a + iX2;
                    while (iX2 < i8) {
                        pooVar.d(plk.m(bArr, iX2));
                        iX2 += 8;
                    }
                    if (iX2 == i8) {
                        return iX2;
                    }
                    throw ppp.i();
                }
                if (i5 == 1) {
                    poo pooVar2 = (poo) ppmVarE;
                    pooVar2.d(plk.m(bArr, i));
                    int i9 = iX + 8;
                    while (i9 < i2) {
                        int iX3 = plk.x(bArr, i9, pnrVar);
                        if (i3 != pnrVar.a) {
                            return i9;
                        }
                        pooVar2.d(plk.m(bArr, iX3));
                        i9 = iX3 + 8;
                    }
                    return i9;
                }
                break;
            case 19:
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                if (i5 == 2) {
                    pow powVar = (pow) ppmVarE;
                    int iX4 = plk.x(bArr, iX, pnrVar);
                    int i10 = pnrVar.a + iX4;
                    while (iX4 < i10) {
                        powVar.g(plk.n(bArr, iX4));
                        iX4 += 4;
                    }
                    if (iX4 == i10) {
                        return iX4;
                    }
                    throw ppp.i();
                }
                if (i5 == 5) {
                    pow powVar2 = (pow) ppmVarE;
                    powVar2.g(plk.n(bArr, i));
                    int i11 = iX + 4;
                    while (i11 < i2) {
                        int iX5 = plk.x(bArr, i11, pnrVar);
                        if (i3 != pnrVar.a) {
                            return i11;
                        }
                        powVar2.g(plk.n(bArr, iX5));
                        i11 = iX5 + 4;
                    }
                    return i11;
                }
                break;
            case 20:
            case 21:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                if (i5 == 2) {
                    pqb pqbVar = (pqb) ppmVarE;
                    int iX6 = plk.x(bArr, iX, pnrVar);
                    int i12 = pnrVar.a + iX6;
                    while (iX6 < i12) {
                        iX6 = plk.A(bArr, iX6, pnrVar);
                        pqbVar.d(pnrVar.b);
                    }
                    if (iX6 == i12) {
                        return iX6;
                    }
                    throw ppp.i();
                }
                if (i5 == 0) {
                    pqb pqbVar2 = (pqb) ppmVarE;
                    int iA = plk.A(bArr, iX, pnrVar);
                    pqbVar2.d(pnrVar.b);
                    while (iA < i2) {
                        int iX7 = plk.x(bArr, iA, pnrVar);
                        if (i3 != pnrVar.a) {
                            return iA;
                        }
                        iA = plk.A(bArr, iX7, pnrVar);
                        pqbVar2.d(pnrVar.b);
                    }
                    return iA;
                }
                break;
            case 22:
            case 29:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                if (i5 == 2) {
                    return plk.t(bArr, iX, ppmVarE, pnrVar);
                }
                if (i5 == 0) {
                    return plk.z(i3, bArr, i, i2, ppmVarE, pnrVar);
                }
                break;
            case 23:
            case 32:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                if (i5 == 2) {
                    pqb pqbVar3 = (pqb) ppmVarE;
                    int iX8 = plk.x(bArr, iX, pnrVar);
                    int i13 = pnrVar.a + iX8;
                    while (iX8 < i13) {
                        pqbVar3.d(plk.C(bArr, iX8));
                        iX8 += 8;
                    }
                    if (iX8 == i13) {
                        return iX8;
                    }
                    throw ppp.i();
                }
                if (i5 == 1) {
                    pqb pqbVar4 = (pqb) ppmVarE;
                    pqbVar4.d(plk.C(bArr, i));
                    int i14 = iX + 8;
                    while (i14 < i2) {
                        int iX9 = plk.x(bArr, i14, pnrVar);
                        if (i3 != pnrVar.a) {
                            return i14;
                        }
                        pqbVar4.d(plk.C(bArr, iX9));
                        i14 = iX9 + 8;
                    }
                    return i14;
                }
                break;
            case 24:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                if (i5 == 2) {
                    ppe ppeVar = (ppe) ppmVarE;
                    int iX10 = plk.x(bArr, iX, pnrVar);
                    int i15 = pnrVar.a + iX10;
                    while (iX10 < i15) {
                        ppeVar.g(plk.p(bArr, iX10));
                        iX10 += 4;
                    }
                    if (iX10 == i15) {
                        return iX10;
                    }
                    throw ppp.i();
                }
                if (i5 == 5) {
                    ppe ppeVar2 = (ppe) ppmVarE;
                    ppeVar2.g(plk.p(bArr, i));
                    int i16 = iX + 4;
                    while (i16 < i2) {
                        int iX11 = plk.x(bArr, i16, pnrVar);
                        if (i3 != pnrVar.a) {
                            return i16;
                        }
                        ppeVar2.g(plk.p(bArr, iX11));
                        i16 = iX11 + 4;
                    }
                    return i16;
                }
                break;
            case 25:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                if (i5 == 2) {
                    pnu pnuVar = (pnu) ppmVarE;
                    int iX12 = plk.x(bArr, iX, pnrVar);
                    int i17 = pnrVar.a + iX12;
                    while (iX12 < i17) {
                        iX12 = plk.A(bArr, iX12, pnrVar);
                        pnuVar.f(pnrVar.b != 0);
                    }
                    if (iX12 == i17) {
                        return iX12;
                    }
                    throw ppp.i();
                }
                if (i5 == 0) {
                    pnu pnuVar2 = (pnu) ppmVarE;
                    int iA2 = plk.A(bArr, iX, pnrVar);
                    pnuVar2.f(pnrVar.b != 0);
                    while (iA2 < i2) {
                        int iX13 = plk.x(bArr, iA2, pnrVar);
                        if (i3 != pnrVar.a) {
                            return iA2;
                        }
                        iA2 = plk.A(bArr, iX13, pnrVar);
                        pnuVar2.f(pnrVar.b != 0);
                    }
                    return iA2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iX = plk.x(bArr, iX, pnrVar);
                        int i18 = pnrVar.a;
                        if (i18 < 0) {
                            throw ppp.f();
                        }
                        if (i18 == 0) {
                            ppmVarE.add("");
                        } else {
                            ppmVarE.add(new String(bArr, iX, i18, ppn.a));
                            iX += i18;
                        }
                        while (iX < i2) {
                            int iX14 = plk.x(bArr, iX, pnrVar);
                            if (i3 != pnrVar.a) {
                                break;
                            } else {
                                iX = plk.x(bArr, iX14, pnrVar);
                                int i19 = pnrVar.a;
                                if (i19 < 0) {
                                    throw ppp.f();
                                }
                                if (i19 == 0) {
                                    ppmVarE.add("");
                                } else {
                                    ppmVarE.add(new String(bArr, iX, i19, ppn.a));
                                    iX += i19;
                                }
                            }
                        }
                    } else {
                        iX = plk.x(bArr, iX, pnrVar);
                        int i20 = pnrVar.a;
                        if (i20 < 0) {
                            throw ppp.f();
                        }
                        if (i20 == 0) {
                            ppmVarE.add("");
                        } else {
                            int i21 = iX + i20;
                            if (!prx.h(bArr, iX, i21)) {
                                throw ppp.d();
                            }
                            ppmVarE.add(new String(bArr, iX, i20, ppn.a));
                            iX = i21;
                        }
                        while (iX < i2) {
                            int iX15 = plk.x(bArr, iX, pnrVar);
                            if (i3 != pnrVar.a) {
                                break;
                            } else {
                                iX = plk.x(bArr, iX15, pnrVar);
                                int i22 = pnrVar.a;
                                if (i22 < 0) {
                                    throw ppp.f();
                                }
                                if (i22 == 0) {
                                    ppmVarE.add("");
                                } else {
                                    int i23 = iX + i22;
                                    if (!prx.h(bArr, iX, i23)) {
                                        throw ppp.d();
                                    }
                                    ppmVarE.add(new String(bArr, iX, i22, ppn.a));
                                    iX = i23;
                                }
                            }
                        }
                    }
                }
                break;
            case 27:
                if (i5 == 2) {
                    return plk.s(G(i6), i3, bArr, i, i2, ppmVarE, pnrVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int iX16 = plk.x(bArr, iX, pnrVar);
                    int i24 = pnrVar.a;
                    if (i24 < 0) {
                        throw ppp.f();
                    }
                    if (i24 > bArr.length - iX16) {
                        throw ppp.i();
                    }
                    if (i24 == 0) {
                        ppmVarE.add(poc.b);
                    } else {
                        ppmVarE.add(poc.u(bArr, iX16, i24));
                        iX16 += i24;
                    }
                    while (iX16 < i2) {
                        int iX17 = plk.x(bArr, iX16, pnrVar);
                        if (i3 != pnrVar.a) {
                            return iX16;
                        }
                        iX16 = plk.x(bArr, iX17, pnrVar);
                        int i25 = pnrVar.a;
                        if (i25 < 0) {
                            throw ppp.f();
                        }
                        if (i25 > bArr.length - iX16) {
                            throw ppp.i();
                        }
                        if (i25 == 0) {
                            ppmVarE.add(poc.b);
                        } else {
                            ppmVarE.add(poc.u(bArr, iX16, i25));
                            iX16 += i25;
                        }
                    }
                    return iX16;
                }
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                if (i5 == 2) {
                    iZ = plk.t(bArr, iX, ppmVarE, pnrVar);
                } else if (i5 == 0) {
                    iZ = plk.z(i3, bArr, i, i2, ppmVarE, pnrVar);
                }
                ppd ppdVar = (ppd) obj;
                prn prnVar = ppdVar.aF;
                if (prnVar == prn.a) {
                    prnVar = null;
                }
                Object objX = prc.X(i4, ppmVarE, F(i6), prnVar);
                if (objX == null) {
                    return iZ;
                }
                ppdVar.aF = (prn) objX;
                return iZ;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                if (i5 == 2) {
                    ppe ppeVar3 = (ppe) ppmVarE;
                    int iX18 = plk.x(bArr, iX, pnrVar);
                    int i26 = pnrVar.a + iX18;
                    while (iX18 < i26) {
                        iX18 = plk.x(bArr, iX18, pnrVar);
                        ppeVar3.g(poh.F(pnrVar.a));
                    }
                    if (iX18 == i26) {
                        return iX18;
                    }
                    throw ppp.i();
                }
                if (i5 == 0) {
                    ppe ppeVar4 = (ppe) ppmVarE;
                    int iX19 = plk.x(bArr, iX, pnrVar);
                    ppeVar4.g(poh.F(pnrVar.a));
                    while (iX19 < i2) {
                        int iX20 = plk.x(bArr, iX19, pnrVar);
                        if (i3 != pnrVar.a) {
                            return iX19;
                        }
                        iX19 = plk.x(bArr, iX20, pnrVar);
                        ppeVar4.g(poh.F(pnrVar.a));
                    }
                    return iX19;
                }
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                if (i5 == 2) {
                    pqb pqbVar5 = (pqb) ppmVarE;
                    int iX21 = plk.x(bArr, iX, pnrVar);
                    int i27 = pnrVar.a + iX21;
                    while (iX21 < i27) {
                        iX21 = plk.A(bArr, iX21, pnrVar);
                        pqbVar5.d(poh.G(pnrVar.b));
                    }
                    if (iX21 == i27) {
                        return iX21;
                    }
                    throw ppp.i();
                }
                if (i5 == 0) {
                    pqb pqbVar6 = (pqb) ppmVarE;
                    int iA3 = plk.A(bArr, iX, pnrVar);
                    pqbVar6.d(poh.G(pnrVar.b));
                    while (iA3 < i2) {
                        int iX22 = plk.x(bArr, iA3, pnrVar);
                        if (i3 != pnrVar.a) {
                            return iA3;
                        }
                        iA3 = plk.A(bArr, iX22, pnrVar);
                        pqbVar6.d(poh.G(pnrVar.b));
                    }
                    return iA3;
                }
                break;
            default:
                if (i5 == 3) {
                    prb prbVarG = G(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iQ = plk.q(prbVarG, bArr, i, i2, i28, pnrVar);
                    ppmVarE.add(pnrVar.c);
                    while (iQ < i2) {
                        int iX23 = plk.x(bArr, iQ, pnrVar);
                        if (i3 != pnrVar.a) {
                            return iQ;
                        }
                        iQ = plk.q(prbVarG, bArr, iX23, i2, i28, pnrVar);
                        ppmVarE.add(pnrVar.c);
                    }
                    return iQ;
                }
                break;
        }
        return iX;
    }

    private final int x(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return A(i, 0);
    }

    private final int y(int i, int i2) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return A(i, i2);
    }

    private final int z(int i) {
        return this.c[i + 2];
    }

    @Override // defpackage.prb
    public final int a(Object obj) {
        return this.j ? r(obj) : q(obj);
    }

    @Override // defpackage.prb
    public final int b(Object obj) {
        int length = this.c.length;
        int iC = 0;
        for (int i = 0; i < length; i += 3) {
            int iC2 = C(i);
            int iS = s(i);
            long jD = D(iC2);
            switch (B(iC2)) {
                case 0:
                    iC = (iC * 53) + ppn.c(Double.doubleToLongBits(prv.b(obj, jD)));
                    break;
                case 1:
                    iC = (iC * 53) + Float.floatToIntBits(prv.c(obj, jD));
                    break;
                case 2:
                    iC = (iC * 53) + ppn.c(prv.f(obj, jD));
                    break;
                case 3:
                    iC = (iC * 53) + ppn.c(prv.f(obj, jD));
                    break;
                case 4:
                    iC = (iC * 53) + prv.d(obj, jD);
                    break;
                case 5:
                    iC = (iC * 53) + ppn.c(prv.f(obj, jD));
                    break;
                case 6:
                    iC = (iC * 53) + prv.d(obj, jD);
                    break;
                case 7:
                    iC = (iC * 53) + ppn.a(prv.w(obj, jD));
                    break;
                case 8:
                    iC = (iC * 53) + ((String) prv.h(obj, jD)).hashCode();
                    break;
                case 9:
                    Object objH = prv.h(obj, jD);
                    iC = (iC * 53) + (objH != null ? objH.hashCode() : 37);
                    break;
                case 10:
                    iC = (iC * 53) + prv.h(obj, jD).hashCode();
                    break;
                case 11:
                    iC = (iC * 53) + prv.d(obj, jD);
                    break;
                case 12:
                    iC = (iC * 53) + prv.d(obj, jD);
                    break;
                case 13:
                    iC = (iC * 53) + prv.d(obj, jD);
                    break;
                case 14:
                    iC = (iC * 53) + ppn.c(prv.f(obj, jD));
                    break;
                case 15:
                    iC = (iC * 53) + prv.d(obj, jD);
                    break;
                case 16:
                    iC = (iC * 53) + ppn.c(prv.f(obj, jD));
                    break;
                case 17:
                    Object objH2 = prv.h(obj, jD);
                    iC = (iC * 53) + (objH2 != null ? objH2.hashCode() : 37);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    iC = (iC * 53) + prv.h(obj, jD).hashCode();
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    iC = (iC * 53) + prv.h(obj, jD).hashCode();
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + ppn.c(Double.doubleToLongBits(o(obj, jD)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + Float.floatToIntBits(p(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + ppn.c(E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + ppn.c(E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + t(obj, jD);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + ppn.c(E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + t(obj, jD);
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + ppn.a(V(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + ((String) prv.h(obj, jD)).hashCode();
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + prv.h(obj, jD).hashCode();
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + prv.h(obj, jD).hashCode();
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + t(obj, jD);
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + t(obj, jD);
                    }
                    break;
                case 64:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + t(obj, jD);
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + ppn.c(E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + t(obj, jD);
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + ppn.c(E(obj, jD));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (U(obj, iS, i)) {
                        iC = (iC * 53) + prv.h(obj, jD).hashCode();
                    }
                    break;
            }
        }
        int iHashCode = (iC * 53) + plk.aF(obj).hashCode();
        return this.h ? (iHashCode * 53) + plk.g(obj).hashCode() : iHashCode;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int c(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, defpackage.pnr r36) {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqo.c(java.lang.Object, byte[], int, int, int, pnr):int");
    }

    @Override // defpackage.prb
    public final Object e() {
        return ((ppd) this.g).G(4);
    }

    @Override // defpackage.prb
    public final void f(Object obj) {
        int i;
        int i2 = this.l;
        while (true) {
            i = this.m;
            if (i2 >= i) {
                break;
            }
            long jD = D(C(this.k[i2]));
            Object objH = prv.h(obj, jD);
            if (objH != null) {
                ((pqh) objH).c();
                prv.u(obj, jD, objH);
            }
            i2++;
        }
        int length = this.k.length;
        while (i < length) {
            this.n.c(obj, this.k[i]);
            i++;
        }
        plk.aI(obj);
        if (this.h) {
            plk.k(obj);
        }
    }

    @Override // defpackage.prb
    public final void g(Object obj, Object obj2) {
        if (obj2 == null) {
            throw null;
        }
        for (int i = 0; i < this.c.length; i += 3) {
            int iC = C(i);
            long jD = D(iC);
            int iS = s(i);
            switch (B(iC)) {
                case 0:
                    if (R(obj2, i)) {
                        prv.q(obj, jD, prv.b(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 1:
                    if (R(obj2, i)) {
                        prv.r(obj, jD, prv.c(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 2:
                    if (R(obj2, i)) {
                        prv.t(obj, jD, prv.f(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 3:
                    if (R(obj2, i)) {
                        prv.t(obj, jD, prv.f(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 4:
                    if (R(obj2, i)) {
                        prv.s(obj, jD, prv.d(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 5:
                    if (R(obj2, i)) {
                        prv.t(obj, jD, prv.f(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 6:
                    if (R(obj2, i)) {
                        prv.s(obj, jD, prv.d(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 7:
                    if (R(obj2, i)) {
                        prv.m(obj, jD, prv.w(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 8:
                    if (R(obj2, i)) {
                        prv.u(obj, jD, prv.h(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 9:
                    K(obj, obj2, i);
                    break;
                case 10:
                    if (R(obj2, i)) {
                        prv.u(obj, jD, prv.h(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 11:
                    if (R(obj2, i)) {
                        prv.s(obj, jD, prv.d(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 12:
                    if (R(obj2, i)) {
                        prv.s(obj, jD, prv.d(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 13:
                    if (R(obj2, i)) {
                        prv.s(obj, jD, prv.d(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 14:
                    if (R(obj2, i)) {
                        prv.t(obj, jD, prv.f(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 15:
                    if (R(obj2, i)) {
                        prv.s(obj, jD, prv.d(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 16:
                    if (R(obj2, i)) {
                        prv.t(obj, jD, prv.f(obj2, jD));
                        N(obj, i);
                    }
                    break;
                case 17:
                    K(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    this.n.d(obj, obj2, jD);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    prc.U(obj, obj2, jD);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (U(obj2, iS, i)) {
                        prv.u(obj, jD, prv.h(obj2, jD));
                        O(obj, iS, i);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    L(obj, obj2, i);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case 64:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (U(obj2, iS, i)) {
                        prv.u(obj, jD, prv.h(obj2, jD));
                        O(obj, iS, i);
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    L(obj, obj2, i);
                    break;
            }
        }
        prc.V(obj, obj2);
        if (this.h) {
            prc.T(obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x06ee A[LOOP:3: B:204:0x06ea->B:206:0x06ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x06fb  */
    @Override // defpackage.prb
    public final void h(Object obj, pqx pqxVar, pos posVar) throws Throwable {
        int i;
        Object objValueOf;
        if (posVar == null) {
            throw null;
        }
        plk plkVar = this.o;
        Object objAb = null;
        pou pouVarH = null;
        while (true) {
            try {
                int iC = pqxVar.c();
                int iX = x(iC);
                if (iX >= 0) {
                    int iC2 = C(iX);
                    try {
                        switch (B(iC2)) {
                            case 0:
                                prv.q(obj, D(iC2), pqxVar.a());
                                N(obj, iX);
                                break;
                            case 1:
                                prv.r(obj, D(iC2), pqxVar.b());
                                N(obj, iX);
                                break;
                            case 2:
                                prv.t(obj, D(iC2), pqxVar.l());
                                N(obj, iX);
                                break;
                            case 3:
                                prv.t(obj, D(iC2), pqxVar.o());
                                N(obj, iX);
                                break;
                            case 4:
                                prv.s(obj, D(iC2), pqxVar.g());
                                N(obj, iX);
                                break;
                            case 5:
                                prv.t(obj, D(iC2), pqxVar.k());
                                N(obj, iX);
                                break;
                            case 6:
                                prv.s(obj, D(iC2), pqxVar.f());
                                N(obj, iX);
                                break;
                            case 7:
                                prv.m(obj, D(iC2), pqxVar.T());
                                N(obj, iX);
                                break;
                            case 8:
                                M(obj, iC2, pqxVar);
                                N(obj, iX);
                                break;
                            case 9:
                                if (R(obj, iX)) {
                                    prv.u(obj, D(iC2), ppn.e(prv.h(obj, D(iC2)), pqxVar.u(G(iX), posVar)));
                                } else {
                                    prv.u(obj, D(iC2), pqxVar.u(G(iX), posVar));
                                    N(obj, iX);
                                }
                                break;
                            case 10:
                                prv.u(obj, D(iC2), pqxVar.q());
                                N(obj, iX);
                                break;
                            case 11:
                                prv.s(obj, D(iC2), pqxVar.j());
                                N(obj, iX);
                                break;
                            case 12:
                                int iE = pqxVar.e();
                                ppi ppiVarF = F(iX);
                                if (ppiVarF == null || ppiVarF.a(iE)) {
                                    prv.s(obj, D(iC2), iE);
                                    N(obj, iX);
                                } else {
                                    objAb = prc.W(iC, iE, objAb);
                                }
                                break;
                            case 13:
                                prv.s(obj, D(iC2), pqxVar.h());
                                N(obj, iX);
                                break;
                            case 14:
                                prv.t(obj, D(iC2), pqxVar.m());
                                N(obj, iX);
                                break;
                            case 15:
                                prv.s(obj, D(iC2), pqxVar.i());
                                N(obj, iX);
                                break;
                            case 16:
                                prv.t(obj, D(iC2), pqxVar.n());
                                N(obj, iX);
                                break;
                            case 17:
                                if (R(obj, iX)) {
                                    prv.u(obj, D(iC2), ppn.e(prv.h(obj, D(iC2)), pqxVar.s(G(iX), posVar)));
                                } else {
                                    prv.u(obj, D(iC2), pqxVar.s(G(iX), posVar));
                                    N(obj, iX);
                                }
                                break;
                            case 18:
                                pqxVar.A(this.n.b(obj, D(iC2)));
                                break;
                            case 19:
                                pqxVar.E(this.n.b(obj, D(iC2)));
                                break;
                            case 20:
                                pqxVar.H(this.n.b(obj, D(iC2)));
                                break;
                            case 21:
                                pqxVar.S(this.n.b(obj, D(iC2)));
                                break;
                            case 22:
                                pqxVar.G(this.n.b(obj, D(iC2)));
                                break;
                            case 23:
                                pqxVar.D(this.n.b(obj, D(iC2)));
                                break;
                            case 24:
                                pqxVar.C(this.n.b(obj, D(iC2)));
                                break;
                            case 25:
                                pqxVar.y(this.n.b(obj, D(iC2)));
                                break;
                            case 26:
                                if (Q(iC2)) {
                                    pqxVar.Q(this.n.b(obj, D(iC2)));
                                } else {
                                    pqxVar.O(this.n.b(obj, D(iC2)));
                                }
                                break;
                            case 27:
                                pqxVar.J(this.n.b(obj, D(iC2)), G(iX), posVar);
                                break;
                            case 28:
                                pqxVar.z(this.n.b(obj, D(iC2)));
                                break;
                            case 29:
                                pqxVar.R(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                List listB = this.n.b(obj, D(iC2));
                                pqxVar.B(listB);
                                objAb = prc.X(iC, listB, F(iX), objAb);
                                break;
                            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                pqxVar.K(this.n.b(obj, D(iC2)));
                                break;
                            case 32:
                                pqxVar.L(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                pqxVar.M(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                pqxVar.N(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                pqxVar.A(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                                pqxVar.E(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                pqxVar.H(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                pqxVar.S(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                pqxVar.G(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                pqxVar.D(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                pqxVar.C(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                pqxVar.y(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                pqxVar.R(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                List listB2 = this.n.b(obj, D(iC2));
                                pqxVar.B(listB2);
                                objAb = prc.X(iC, listB2, F(iX), objAb);
                                break;
                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                pqxVar.K(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                pqxVar.L(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                pqxVar.M(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                pqxVar.N(this.n.b(obj, D(iC2)));
                                break;
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                pqxVar.F(this.n.b(obj, D(iC2)), G(iX), posVar);
                                break;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Object objH = H(iX);
                                long jD = D(C(iX));
                                Object objH2 = prv.h(obj, jD);
                                if (objH2 == null) {
                                    objH2 = plk.aR();
                                    prv.u(obj, jD, objH2);
                                } else if (plk.aP(objH2)) {
                                    Object objAR = plk.aR();
                                    plk.aQ(objAR, objH2);
                                    prv.u(obj, jD, objAR);
                                    objH2 = objAR;
                                }
                                pqxVar.I((pqh) objH2, plk.aN(objH), posVar);
                                break;
                            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                prv.u(obj, D(iC2), Double.valueOf(pqxVar.a()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                prv.u(obj, D(iC2), Float.valueOf(pqxVar.b()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                prv.u(obj, D(iC2), Long.valueOf(pqxVar.l()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                prv.u(obj, D(iC2), Long.valueOf(pqxVar.o()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                prv.u(obj, D(iC2), Integer.valueOf(pqxVar.g()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_colorError /* 56 */:
                                prv.u(obj, D(iC2), Long.valueOf(pqxVar.k()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                prv.u(obj, D(iC2), Integer.valueOf(pqxVar.f()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                prv.u(obj, D(iC2), Boolean.valueOf(pqxVar.T()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                M(obj, iC2, pqxVar);
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                if (U(obj, iC, iX)) {
                                    prv.u(obj, D(iC2), ppn.e(prv.h(obj, D(iC2)), pqxVar.u(G(iX), posVar)));
                                } else {
                                    prv.u(obj, D(iC2), pqxVar.u(G(iX), posVar));
                                    N(obj, iX);
                                }
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                prv.u(obj, D(iC2), pqxVar.q());
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                prv.u(obj, D(iC2), Integer.valueOf(pqxVar.j()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                int iE2 = pqxVar.e();
                                ppi ppiVarF2 = F(iX);
                                if (ppiVarF2 == null || ppiVarF2.a(iE2)) {
                                    prv.u(obj, D(iC2), Integer.valueOf(iE2));
                                    O(obj, iC, iX);
                                } else {
                                    objAb = prc.W(iC, iE2, objAb);
                                }
                                break;
                            case 64:
                                prv.u(obj, D(iC2), Integer.valueOf(pqxVar.h()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                prv.u(obj, D(iC2), Long.valueOf(pqxVar.m()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                prv.u(obj, D(iC2), Integer.valueOf(pqxVar.i()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                prv.u(obj, D(iC2), Long.valueOf(pqxVar.n()));
                                O(obj, iC, iX);
                                break;
                            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                prv.u(obj, D(iC2), pqxVar.s(G(iX), posVar));
                                O(obj, iC, iX);
                                break;
                            default:
                                if (objAb == null) {
                                    objAb = prn.b();
                                }
                                try {
                                    if (!plkVar.aC(objAb, pqxVar)) {
                                        for (int i2 = this.l; i2 < this.m; i2++) {
                                            objAb = ab(obj, this.k[i2], objAb);
                                        }
                                        if (objAb == null) {
                                            return;
                                        }
                                    }
                                } catch (ppo e) {
                                    if (objAb == null) {
                                        try {
                                            objAb = plk.aH(obj);
                                        } catch (Throwable th) {
                                            th = th;
                                            for (i = this.l; i < this.m; i++) {
                                                objAb = ab(obj, this.k[i], objAb);
                                            }
                                            if (objAb != null) {
                                                plk.aG(obj, (prn) objAb);
                                            }
                                            throw th;
                                        }
                                    }
                                    if (!plkVar.aC(objAb, pqxVar)) {
                                        for (int i3 = this.l; i3 < this.m; i3++) {
                                            objAb = ab(obj, this.k[i3], objAb);
                                        }
                                        if (objAb == null) {
                                            return;
                                        }
                                        plk.aG(obj, (prn) objAb);
                                    }
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (i < this.m) {
                                        objAb = ab(obj, this.k[i], objAb);
                                    }
                                    if (objAb != null) {
                                        plk.aG(obj, (prn) objAb);
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (ppo e2) {
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    for (int i4 = this.l; i4 < this.m; i4++) {
                        objAb = ab(obj, this.k[i4], objAb);
                    }
                    if (objAb == null) {
                        return;
                    }
                } else {
                    poq poqVarD = !this.h ? null : posVar.d(this.g, iC);
                    if (poqVarD != null) {
                        if (pouVarH == null) {
                            pouVarH = plk.h(obj);
                        }
                        poqVarD.a();
                        if (poqVarD.b() == pry.ENUM) {
                            pqxVar.g();
                            throw null;
                        }
                        switch (poqVarD.b()) {
                            case DOUBLE:
                                objValueOf = Double.valueOf(pqxVar.a());
                                break;
                            case FLOAT:
                                objValueOf = Float.valueOf(pqxVar.b());
                                break;
                            case INT64:
                                objValueOf = Long.valueOf(pqxVar.l());
                                break;
                            case UINT64:
                                objValueOf = Long.valueOf(pqxVar.o());
                                break;
                            case INT32:
                                objValueOf = Integer.valueOf(pqxVar.g());
                                break;
                            case FIXED64:
                                objValueOf = Long.valueOf(pqxVar.k());
                                break;
                            case FIXED32:
                                objValueOf = Integer.valueOf(pqxVar.f());
                                break;
                            case BOOL:
                                objValueOf = Boolean.valueOf(pqxVar.T());
                                break;
                            case STRING:
                                objValueOf = pqxVar.v();
                                break;
                            case GROUP:
                                objValueOf = pqxVar.r(poqVarD.c.getClass(), posVar);
                                break;
                            case MESSAGE:
                                objValueOf = pqxVar.t(poqVarD.c.getClass(), posVar);
                                break;
                            case BYTES:
                                objValueOf = pqxVar.q();
                                break;
                            case UINT32:
                                objValueOf = Integer.valueOf(pqxVar.j());
                                break;
                            case ENUM:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case SFIXED32:
                                objValueOf = Integer.valueOf(pqxVar.h());
                                break;
                            case SFIXED64:
                                objValueOf = Long.valueOf(pqxVar.m());
                                break;
                            case SINT32:
                                objValueOf = Integer.valueOf(pqxVar.i());
                                break;
                            case SINT64:
                                objValueOf = Long.valueOf(pqxVar.n());
                                break;
                            default:
                                objValueOf = null;
                                break;
                        }
                        poqVarD.c();
                        switch (poqVarD.b().ordinal()) {
                            case 9:
                            case 10:
                                Object objK = pouVarH.k(poqVarD.d);
                                if (objK != null) {
                                    objValueOf = ppn.e(objK, objValueOf);
                                }
                                break;
                        }
                        pouVarH.l(poqVarD.d, objValueOf);
                    } else {
                        if (objAb == null) {
                            objAb = plk.aH(obj);
                        }
                        try {
                            if (!plkVar.aC(objAb, pqxVar)) {
                                for (int i5 = this.l; i5 < this.m; i5++) {
                                    objAb = ab(obj, this.k[i5], objAb);
                                }
                                if (objAb == null) {
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (i < this.m) {
                                objAb = ab(obj, this.k[i], objAb);
                            }
                            if (objAb != null) {
                                plk.aG(obj, (prn) objAb);
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        plk.aG(obj, (prn) objAb);
    }

    @Override // defpackage.prb
    public final void i(Object obj, byte[] bArr, int i, int i2, pnr pnrVar) throws ppp {
        if (this.j) {
            X(obj, bArr, i, i2, pnrVar);
        } else {
            c(obj, bArr, i, i2, 0, pnrVar);
        }
    }

    @Override // defpackage.prb
    public final boolean j(Object obj, Object obj2) {
        boolean zQ;
        int length = this.c.length;
        for (int i = 0; i < length; i += 3) {
            int iC = C(i);
            long jD = D(iC);
            switch (B(iC)) {
                case 0:
                    if (!P(obj, obj2, i) || Double.doubleToLongBits(prv.b(obj, jD)) != Double.doubleToLongBits(prv.b(obj2, jD))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!P(obj, obj2, i) || Float.floatToIntBits(prv.c(obj, jD)) != Float.floatToIntBits(prv.c(obj2, jD))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!P(obj, obj2, i) || prv.f(obj, jD) != prv.f(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!P(obj, obj2, i) || prv.f(obj, jD) != prv.f(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!P(obj, obj2, i) || prv.d(obj, jD) != prv.d(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!P(obj, obj2, i) || prv.f(obj, jD) != prv.f(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!P(obj, obj2, i) || prv.d(obj, jD) != prv.d(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!P(obj, obj2, i) || prv.w(obj, jD) != prv.w(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!P(obj, obj2, i) || !prc.q(prv.h(obj, jD), prv.h(obj2, jD))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!P(obj, obj2, i) || !prc.q(prv.h(obj, jD), prv.h(obj2, jD))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!P(obj, obj2, i) || !prc.q(prv.h(obj, jD), prv.h(obj2, jD))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!P(obj, obj2, i) || prv.d(obj, jD) != prv.d(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!P(obj, obj2, i) || prv.d(obj, jD) != prv.d(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!P(obj, obj2, i) || prv.d(obj, jD) != prv.d(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!P(obj, obj2, i) || prv.f(obj, jD) != prv.f(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!P(obj, obj2, i) || prv.d(obj, jD) != prv.d(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!P(obj, obj2, i) || prv.f(obj, jD) != prv.f(obj2, jD)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!P(obj, obj2, i) || !prc.q(prv.h(obj, jD), prv.h(obj2, jD))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    zQ = prc.q(prv.h(obj, jD), prv.h(obj2, jD));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    zQ = prc.q(prv.h(obj, jD), prv.h(obj2, jD));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case 64:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long jZ = z(i) & 1048575;
                    if (prv.d(obj, jZ) != prv.d(obj2, jZ) || !prc.q(prv.h(obj, jD), prv.h(obj2, jD))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zQ) {
                return false;
            }
        }
        if (!plk.aF(obj).equals(plk.aF(obj2))) {
            return false;
        }
        if (this.h) {
            return plk.g(obj).equals(plk.g(obj2));
        }
        return true;
    }

    @Override // defpackage.prb
    public final boolean k(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.l) {
            int i6 = this.k[i5];
            int iS = s(i6);
            int iC = C(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i3) {
                i = i3;
                i2 = i4;
            } else if (i8 != 1048575) {
                i2 = b.getInt(obj, i8);
                i = i8;
            } else {
                i2 = i4;
                i = i8;
            }
            if ((268435456 & iC) != 0 && !S(obj, i6, i, i2, i9)) {
                return false;
            }
            switch (B(iC)) {
                case 9:
                case 17:
                    if (S(obj, i6, i, i2, i9) && !T(obj, iC, G(i6))) {
                        return false;
                    }
                    break;
                    break;
                case 27:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    List list = (List) prv.h(obj, D(iC));
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        prb prbVarG = G(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (!prbVarG.k(list.get(i10))) {
                                return false;
                            }
                        }
                    }
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    pqh pqhVar = (pqh) prv.h(obj, D(iC));
                    if (!pqhVar.isEmpty() && plk.aN(H(i6)).c.s == prz.MESSAGE) {
                        prb prbVarA = null;
                        for (Object obj2 : pqhVar.values()) {
                            if (prbVarA == null) {
                                prbVarA = pqu.a.a(obj2.getClass());
                            }
                            if (!prbVarA.k(obj2)) {
                                return false;
                            }
                        }
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (U(obj, iS, i6) && !T(obj, iC, G(i6))) {
                        return false;
                    }
                    break;
                    break;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.h || plk.g(obj).i();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // defpackage.prb
    public final void l(Object obj, pon ponVar) {
        Iterator itD;
        Map.Entry entry;
        if (!this.j) {
            Y(obj, ponVar);
            return;
        }
        if (this.h) {
            pou pouVarG = plk.g(obj);
            if (pouVarG.h()) {
                itD = null;
                entry = null;
            } else {
                itD = pouVarG.d();
                entry = (Map.Entry) itD.next();
            }
        } else {
            itD = null;
            entry = null;
        }
        int length = this.c.length;
        for (int i = 0; i < length; i += 3) {
            int iC = C(i);
            int iS = s(i);
            while (entry != null && plk.f(entry) <= iS) {
                plk.j(ponVar, entry);
                entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
            }
            switch (B(iC)) {
                case 0:
                    if (R(obj, i)) {
                        ponVar.c(iS, prv.b(obj, D(iC)));
                    }
                    break;
                case 1:
                    if (R(obj, i)) {
                        ponVar.g(iS, prv.c(obj, D(iC)));
                    }
                    break;
                case 2:
                    if (R(obj, i)) {
                        ponVar.j(iS, prv.f(obj, D(iC)));
                    }
                    break;
                case 3:
                    if (R(obj, i)) {
                        ponVar.s(iS, prv.f(obj, D(iC)));
                    }
                    break;
                case 4:
                    if (R(obj, i)) {
                        ponVar.i(iS, prv.d(obj, D(iC)));
                    }
                    break;
                case 5:
                    if (R(obj, i)) {
                        ponVar.f(iS, prv.f(obj, D(iC)));
                    }
                    break;
                case 6:
                    if (R(obj, i)) {
                        ponVar.e(iS, prv.d(obj, D(iC)));
                    }
                    break;
                case 7:
                    if (R(obj, i)) {
                        ponVar.a(iS, prv.w(obj, D(iC)));
                    }
                    break;
                case 8:
                    if (R(obj, i)) {
                        aa(iS, prv.h(obj, D(iC)), ponVar);
                    }
                    break;
                case 9:
                    if (R(obj, i)) {
                        ponVar.k(iS, prv.h(obj, D(iC)), G(i));
                    }
                    break;
                case 10:
                    if (R(obj, i)) {
                        ponVar.b(iS, (poc) prv.h(obj, D(iC)));
                    }
                    break;
                case 11:
                    if (R(obj, i)) {
                        ponVar.r(iS, prv.d(obj, D(iC)));
                    }
                    break;
                case 12:
                    if (R(obj, i)) {
                        ponVar.d(iS, prv.d(obj, D(iC)));
                    }
                    break;
                case 13:
                    if (R(obj, i)) {
                        ponVar.m(iS, prv.d(obj, D(iC)));
                    }
                    break;
                case 14:
                    if (R(obj, i)) {
                        ponVar.n(iS, prv.f(obj, D(iC)));
                    }
                    break;
                case 15:
                    if (R(obj, i)) {
                        ponVar.o(iS, prv.d(obj, D(iC)));
                    }
                    break;
                case 16:
                    if (R(obj, i)) {
                        ponVar.p(iS, prv.f(obj, D(iC)));
                    }
                    break;
                case 17:
                    if (R(obj, i)) {
                        ponVar.h(iS, prv.h(obj, D(iC)), G(i));
                    }
                    break;
                case 18:
                    prc.D(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 19:
                    prc.H(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 20:
                    prc.K(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 21:
                    prc.S(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 22:
                    prc.J(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 23:
                    prc.G(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 24:
                    prc.F(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 25:
                    prc.B(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 26:
                    prc.Q(s(i), (List) prv.h(obj, D(iC)), ponVar);
                    break;
                case 27:
                    prc.L(s(i), (List) prv.h(obj, D(iC)), ponVar, G(i));
                    break;
                case 28:
                    prc.C(s(i), (List) prv.h(obj, D(iC)), ponVar);
                    break;
                case 29:
                    prc.R(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    prc.E(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    prc.M(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case 32:
                    prc.N(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    prc.O(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    prc.P(s(i), (List) prv.h(obj, D(iC)), ponVar, false);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    prc.D(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    prc.H(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    prc.K(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    prc.S(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    prc.J(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    prc.G(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    prc.F(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    prc.B(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    prc.R(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    prc.E(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    prc.M(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    prc.N(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    prc.O(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    prc.P(s(i), (List) prv.h(obj, D(iC)), ponVar, true);
                    break;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    prc.I(s(i), (List) prv.h(obj, D(iC)), ponVar, G(i));
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    Z(ponVar, iS, prv.h(obj, D(iC)), i);
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (U(obj, iS, i)) {
                        ponVar.c(iS, o(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (U(obj, iS, i)) {
                        ponVar.g(iS, p(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (U(obj, iS, i)) {
                        ponVar.j(iS, E(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (U(obj, iS, i)) {
                        ponVar.s(iS, E(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (U(obj, iS, i)) {
                        ponVar.i(iS, t(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (U(obj, iS, i)) {
                        ponVar.f(iS, E(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (U(obj, iS, i)) {
                        ponVar.e(iS, t(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (U(obj, iS, i)) {
                        ponVar.a(iS, V(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (U(obj, iS, i)) {
                        aa(iS, prv.h(obj, D(iC)), ponVar);
                    }
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (U(obj, iS, i)) {
                        ponVar.k(iS, prv.h(obj, D(iC)), G(i));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (U(obj, iS, i)) {
                        ponVar.b(iS, (poc) prv.h(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (U(obj, iS, i)) {
                        ponVar.r(iS, t(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (U(obj, iS, i)) {
                        ponVar.d(iS, t(obj, D(iC)));
                    }
                    break;
                case 64:
                    if (U(obj, iS, i)) {
                        ponVar.m(iS, t(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (U(obj, iS, i)) {
                        ponVar.n(iS, E(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (U(obj, iS, i)) {
                        ponVar.o(iS, t(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (U(obj, iS, i)) {
                        ponVar.p(iS, E(obj, D(iC)));
                    }
                    break;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (U(obj, iS, i)) {
                        ponVar.h(iS, prv.h(obj, D(iC)), G(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            plk.j(ponVar, entry);
            entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
        }
        ad(obj, ponVar);
    }
}
