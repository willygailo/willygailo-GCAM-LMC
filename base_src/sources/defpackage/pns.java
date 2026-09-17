package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class pns implements pqx {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    public pns() {
    }

    public pns(ByteBuffer byteBuffer) {
        this.a = byteBuffer.array();
        this.b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final byte V() throws ppp {
        int i = this.b;
        if (i == this.c) {
            throw ppp.i();
        }
        byte[] bArr = this.a;
        this.b = i + 1;
        return bArr[i];
    }

    private final int W() throws ppp {
        af(4);
        return X();
    }

    private final int X() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[PHI: r3
      0x0074: PHI (r3v9 int) = (r3v8 int), (r3v11 int) binds: [B:26:0x005a, B:30:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private final int Y() throws ppp {
        int i;
        int i2 = this.b;
        int i3 = this.c;
        if (i3 == i2) {
            throw ppp.i();
        }
        byte[] bArr = this.a;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            this.b = i4;
            return b;
        }
        if (i3 - i4 < 9) {
            return (int) ab();
        }
        int i5 = i4 + 1;
        int i6 = b ^ (bArr[i4] << 7);
        if (i6 < 0) {
            i = i6 ^ (-128);
        } else {
            int i7 = i5 + 1;
            int i8 = i6 ^ (bArr[i5] << 14);
            if (i8 >= 0) {
                i = i8 ^ 16256;
                i5 = i7;
            } else {
                i5 = i7 + 1;
                int i9 = i8 ^ (bArr[i7] << 21);
                if (i9 < 0) {
                    i = i9 ^ (-2080896);
                } else {
                    int i10 = i5 + 1;
                    byte b2 = bArr[i5];
                    i = (i9 ^ (b2 << 28)) ^ 266354560;
                    if (b2 < 0) {
                        i5 = i10 + 1;
                        if (bArr[i10] < 0) {
                            int i11 = i5 + 1;
                            if (bArr[i5] < 0) {
                                i5 = i11 + 1;
                                if (bArr[i11] < 0) {
                                    i11 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i11 + 1;
                                        if (bArr[i11] < 0) {
                                            throw ppp.e();
                                        }
                                    } else {
                                        i5 = i11;
                                    }
                                }
                            } else {
                                i5 = i11;
                            }
                        }
                    } else {
                        i5 = i10;
                    }
                }
            }
        }
        this.b = i5;
        return i;
    }

    private final long Z() throws ppp {
        af(8);
        return aa();
    }

    private final long aa() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private final long ab() throws ppp {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bV = V();
            j |= ((long) (bV & 127)) << i;
            if ((bV & 128) == 0) {
                return j;
            }
        }
        throw ppp.e();
    }

    private final Object ac(pry pryVar, Class cls, pos posVar) {
        pry pryVar2 = pry.DOUBLE;
        switch (pryVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(l());
            case UINT64:
                return Long.valueOf(o());
            case INT32:
                return Integer.valueOf(g());
            case FIXED64:
                return Long.valueOf(k());
            case FIXED32:
                return Integer.valueOf(f());
            case BOOL:
                return Boolean.valueOf(T());
            case STRING:
                return x();
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return t(cls, posVar);
            case BYTES:
                return q();
            case UINT32:
                return Integer.valueOf(j());
            case ENUM:
                return Integer.valueOf(e());
            case SFIXED32:
                return Integer.valueOf(h());
            case SFIXED64:
                return Long.valueOf(m());
            case SINT32:
                return Integer.valueOf(i());
            case SINT64:
                return Long.valueOf(n());
        }
    }

    private final Object ad(prb prbVar, pos posVar) {
        int i = this.e;
        this.e = psa.c(psa.a(this.d), 4);
        try {
            Object objE = prbVar.e();
            prbVar.h(objE, this, posVar);
            prbVar.f(objE);
            if (this.d != this.e) {
                throw ppp.g();
            }
            this.e = i;
            return objE;
        } catch (Throwable th) {
            this.e = i;
            throw th;
        }
    }

    private final Object ae(prb prbVar, pos posVar) throws ppp {
        int iY = Y();
        af(iY);
        int i = this.c;
        int i2 = this.b + iY;
        this.c = i2;
        try {
            Object objE = prbVar.e();
            prbVar.h(objE, this, posVar);
            prbVar.f(objE);
            if (this.b != i2) {
                throw ppp.g();
            }
            this.c = i;
            return objE;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    private final void af(int i) throws ppp {
        if (i < 0 || i > this.c - this.b) {
            throw ppp.i();
        }
    }

    private final void ag(int i) throws ppp {
        if (this.b != i) {
            throw ppp.i();
        }
    }

    private final void ah(int i) throws ppo {
        if (psa.b(this.d) != i) {
            throw ppp.a();
        }
    }

    private final void ai(int i) throws ppp {
        af(i);
        this.b += i;
    }

    private final void aj(int i) throws ppp {
        af(i);
        if ((i & 3) != 0) {
            throw ppp.g();
        }
    }

    private final void ak(int i) throws ppp {
        af(i);
        if ((i & 7) != 0) {
            throw ppp.g();
        }
    }

    private final boolean al() {
        return this.b == this.c;
    }

    @Override // defpackage.pqx
    public final void A(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof poo)) {
            switch (psa.b(this.d)) {
                case 1:
                    break;
                case 2:
                    int iY = Y();
                    ak(iY);
                    int i3 = this.b + iY;
                    while (this.b < i3) {
                        list.add(Double.valueOf(Double.longBitsToDouble(aa())));
                    }
                    return;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Double.valueOf(a()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        poo pooVar = (poo) list;
        switch (psa.b(this.d)) {
            case 1:
                break;
            case 2:
                int iY2 = Y();
                ak(iY2);
                int i4 = this.b + iY2;
                while (this.b < i4) {
                    pooVar.d(Double.longBitsToDouble(aa()));
                }
                return;
            default:
                throw ppp.a();
        }
        do {
            pooVar.d(a());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void B(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.d)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iY = this.b + Y();
                    while (this.b < iY) {
                        list.add(Integer.valueOf(Y()));
                    }
                    return;
            }
            do {
                list.add(Integer.valueOf(e()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.d)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iY2 = this.b + Y();
                while (this.b < iY2) {
                    ppeVar.g(Y());
                }
                return;
        }
        do {
            ppeVar.g(e());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void C(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.d)) {
                case 2:
                    int iY = Y();
                    aj(iY);
                    int i3 = this.b + iY;
                    while (this.b < i3) {
                        list.add(Integer.valueOf(X()));
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Integer.valueOf(f()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.d)) {
            case 2:
                int iY2 = Y();
                aj(iY2);
                int i4 = this.b + iY2;
                while (this.b < i4) {
                    ppeVar.g(X());
                }
                return;
            case 5:
                break;
            default:
                throw ppp.a();
        }
        do {
            ppeVar.g(f());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void D(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.d)) {
                case 1:
                    break;
                case 2:
                    int iY = Y();
                    ak(iY);
                    int i3 = this.b + iY;
                    while (this.b < i3) {
                        list.add(Long.valueOf(aa()));
                    }
                    return;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Long.valueOf(k()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.d)) {
            case 1:
                break;
            case 2:
                int iY2 = Y();
                ak(iY2);
                int i4 = this.b + iY2;
                while (this.b < i4) {
                    pqbVar.d(aa());
                }
                return;
            default:
                throw ppp.a();
        }
        do {
            pqbVar.d(k());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void E(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof pow)) {
            switch (psa.b(this.d)) {
                case 2:
                    int iY = Y();
                    aj(iY);
                    int i3 = this.b + iY;
                    while (this.b < i3) {
                        list.add(Float.valueOf(Float.intBitsToFloat(X())));
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Float.valueOf(b()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        pow powVar = (pow) list;
        switch (psa.b(this.d)) {
            case 2:
                int iY2 = Y();
                aj(iY2);
                int i4 = this.b + iY2;
                while (this.b < i4) {
                    powVar.g(Float.intBitsToFloat(X()));
                }
                return;
            case 5:
                break;
            default:
                throw ppp.a();
        }
        do {
            powVar.g(b());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void F(List list, prb prbVar, pos posVar) throws ppo {
        int i;
        if (psa.b(this.d) != 3) {
            throw ppp.a();
        }
        int i2 = this.d;
        do {
            list.add(ad(prbVar, posVar));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == i2);
        this.b = i;
    }

    @Override // defpackage.pqx
    public final void G(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.d)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iY = this.b + Y();
                    while (this.b < iY) {
                        list.add(Integer.valueOf(Y()));
                    }
                    ag(iY);
                    return;
            }
            do {
                list.add(Integer.valueOf(g()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.d)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iY2 = this.b + Y();
                while (this.b < iY2) {
                    ppeVar.g(Y());
                }
                ag(iY2);
                return;
        }
        do {
            ppeVar.g(g());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void H(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.d)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iY = this.b + Y();
                    while (this.b < iY) {
                        list.add(Long.valueOf(p()));
                    }
                    ag(iY);
                    return;
            }
            do {
                list.add(Long.valueOf(l()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.d)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iY2 = this.b + Y();
                while (this.b < iY2) {
                    pqbVar.d(p());
                }
                ag(iY2);
                return;
        }
        do {
            pqbVar.d(l());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void I(Map map, pqf pqfVar, pos posVar) throws ppp {
        ah(2);
        int iY = Y();
        af(iY);
        int i = this.c;
        this.c = this.b + iY;
        try {
            Object objAc = pqfVar.b;
            Object objAc2 = pqfVar.d;
            while (true) {
                int iC = c();
                if (iC != Integer.MAX_VALUE) {
                    switch (iC) {
                        case 1:
                            objAc = ac(pqfVar.a, null, null);
                            break;
                        case 2:
                            objAc2 = ac(pqfVar.c, pqfVar.d.getClass(), posVar);
                            break;
                        default:
                            try {
                                if (!U()) {
                                    throw new ppp("Unable to parse map entry.");
                                }
                            } catch (ppo e) {
                                if (!U()) {
                                    throw new ppp("Unable to parse map entry.");
                                }
                            }
                    }
                } else {
                    map.put(objAc, objAc2);
                    this.c = i;
                    return;
                }
            }
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    @Override // defpackage.pqx
    public final void J(List list, prb prbVar, pos posVar) throws ppo {
        int i;
        if (psa.b(this.d) != 2) {
            throw ppp.a();
        }
        int i2 = this.d;
        do {
            list.add(ae(prbVar, posVar));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == i2);
        this.b = i;
    }

    @Override // defpackage.pqx
    public final void K(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.d)) {
                case 2:
                    int iY = Y();
                    aj(iY);
                    int i3 = this.b + iY;
                    while (this.b < i3) {
                        list.add(Integer.valueOf(X()));
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Integer.valueOf(h()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.d)) {
            case 2:
                int iY2 = Y();
                aj(iY2);
                int i4 = this.b + iY2;
                while (this.b < i4) {
                    ppeVar.g(X());
                }
                return;
            case 5:
                break;
            default:
                throw ppp.a();
        }
        do {
            ppeVar.g(h());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void L(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.d)) {
                case 1:
                    break;
                case 2:
                    int iY = Y();
                    ak(iY);
                    int i3 = this.b + iY;
                    while (this.b < i3) {
                        list.add(Long.valueOf(aa()));
                    }
                    return;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Long.valueOf(m()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.d)) {
            case 1:
                break;
            case 2:
                int iY2 = Y();
                ak(iY2);
                int i4 = this.b + iY2;
                while (this.b < i4) {
                    pqbVar.d(aa());
                }
                return;
            default:
                throw ppp.a();
        }
        do {
            pqbVar.d(m());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void M(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.d)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iY = this.b + Y();
                    while (this.b < iY) {
                        list.add(Integer.valueOf(poh.F(Y())));
                    }
                    return;
            }
            do {
                list.add(Integer.valueOf(i()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.d)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iY2 = this.b + Y();
                while (this.b < iY2) {
                    ppeVar.g(poh.F(Y()));
                }
                return;
        }
        do {
            ppeVar.g(i());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void N(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.d)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iY = this.b + Y();
                    while (this.b < iY) {
                        list.add(Long.valueOf(poh.G(p())));
                    }
                    return;
            }
            do {
                list.add(Long.valueOf(n()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.d)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iY2 = this.b + Y();
                while (this.b < iY2) {
                    pqbVar.d(poh.G(p()));
                }
                return;
        }
        do {
            pqbVar.d(n());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void O(List list) throws ppo {
        P(list, false);
    }

    public final void P(List list, boolean z) throws ppo {
        int i;
        int i2;
        if (psa.b(this.d) != 2) {
            throw ppp.a();
        }
        if (!(list instanceof ppx) || z) {
            do {
                list.add(w(z));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        ppx ppxVar = (ppx) list;
        do {
            ppxVar.i(q());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void Q(List list) throws ppo {
        P(list, true);
    }

    @Override // defpackage.pqx
    public final void R(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.d)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iY = this.b + Y();
                    while (this.b < iY) {
                        list.add(Integer.valueOf(Y()));
                    }
                    return;
            }
            do {
                list.add(Integer.valueOf(j()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.d)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iY2 = this.b + Y();
                while (this.b < iY2) {
                    ppeVar.g(Y());
                }
                return;
        }
        do {
            ppeVar.g(j());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void S(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.d)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iY = this.b + Y();
                    while (this.b < iY) {
                        list.add(Long.valueOf(p()));
                    }
                    ag(iY);
                    return;
            }
            do {
                list.add(Long.valueOf(o()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.d)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iY2 = this.b + Y();
                while (this.b < iY2) {
                    pqbVar.d(p());
                }
                ag(iY2);
                return;
        }
        do {
            pqbVar.d(o());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final boolean T() throws ppo {
        ah(0);
        return Y() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007d A[LOOP:2: B:36:0x0075->B:39:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0080 A[SYNTHETIC] */
    @Override // defpackage.pqx
    public final boolean U() throws ppp {
        int i;
        if (al() || (i = this.d) == this.e) {
            return false;
        }
        switch (psa.b(i)) {
            case 0:
                int i2 = this.c;
                int i3 = this.b;
                if (i2 - i3 < 10) {
                    for (int i4 = 0; i4 < 10; i4++) {
                        if (V() < 0) {
                        }
                    }
                    throw ppp.e();
                }
                byte[] bArr = this.a;
                int i5 = 0;
                while (i5 < 10) {
                    int i6 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.b = i6;
                    } else {
                        i5++;
                        i3 = i6;
                    }
                }
                while (i4 < 10) {
                    if (V() < 0) {
                    }
                }
                throw ppp.e();
                return true;
            case 1:
                ai(8);
                return true;
            case 2:
                ai(Y());
                return true;
            case 3:
                int i7 = this.e;
                this.e = psa.c(psa.a(this.d), 4);
                while (c() != Integer.MAX_VALUE && U()) {
                }
                if (this.d != this.e) {
                    throw ppp.g();
                }
                this.e = i7;
                return true;
            case 4:
            default:
                throw ppp.a();
            case 5:
                ai(4);
                return true;
        }
    }

    @Override // defpackage.pqx
    public final double a() throws ppo {
        ah(1);
        return Double.longBitsToDouble(Z());
    }

    @Override // defpackage.pqx
    public final float b() throws ppo {
        ah(5);
        return Float.intBitsToFloat(W());
    }

    @Override // defpackage.pqx
    public final int c() throws ppp {
        if (al()) {
            return Integer.MAX_VALUE;
        }
        int iY = Y();
        this.d = iY;
        if (iY == this.e) {
            return Integer.MAX_VALUE;
        }
        return psa.a(iY);
    }

    @Override // defpackage.pqx
    public final int d() {
        return this.d;
    }

    @Override // defpackage.pqx
    public final int e() throws ppo {
        ah(0);
        return Y();
    }

    @Override // defpackage.pqx
    public final int f() throws ppo {
        ah(5);
        return W();
    }

    @Override // defpackage.pqx
    public final int g() throws ppo {
        ah(0);
        return Y();
    }

    @Override // defpackage.pqx
    public final int h() throws ppo {
        ah(5);
        return W();
    }

    @Override // defpackage.pqx
    public final int i() throws ppo {
        ah(0);
        return poh.F(Y());
    }

    @Override // defpackage.pqx
    public final int j() throws ppo {
        ah(0);
        return Y();
    }

    @Override // defpackage.pqx
    public final long k() throws ppo {
        ah(1);
        return Z();
    }

    @Override // defpackage.pqx
    public final long l() throws ppo {
        ah(0);
        return p();
    }

    @Override // defpackage.pqx
    public final long m() throws ppo {
        ah(1);
        return Z();
    }

    @Override // defpackage.pqx
    public final long n() throws ppo {
        ah(0);
        return poh.G(p());
    }

    @Override // defpackage.pqx
    public final long o() throws ppo {
        ah(0);
        return p();
    }

    public final long p() throws ppp {
        long j;
        int i = this.b;
        int i2 = this.c;
        if (i2 == i) {
            throw ppp.i();
        }
        byte[] bArr = this.a;
        int i3 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            this.b = i3;
            return b;
        }
        if (i2 - i3 < 9) {
            return ab();
        }
        int i4 = i3 + 1;
        int i5 = b ^ (bArr[i3] << 7);
        if (i5 < 0) {
            j = i5 ^ (-128);
        } else {
            int i6 = i4 + 1;
            int i7 = i5 ^ (bArr[i4] << 14);
            if (i7 >= 0) {
                i4 = i6;
                j = i7 ^ 16256;
            } else {
                i4 = i6 + 1;
                int i8 = i7 ^ (bArr[i6] << 21);
                if (i8 < 0) {
                    j = i8 ^ (-2080896);
                } else {
                    int i9 = i4 + 1;
                    long j2 = (((long) bArr[i4]) << 28) ^ ((long) i8);
                    if (j2 >= 0) {
                        i4 = i9;
                        j = j2 ^ 266354560;
                    } else {
                        int i10 = i9 + 1;
                        long j3 = j2 ^ (((long) bArr[i9]) << 35);
                        if (j3 < 0) {
                            j = (-34093383808L) ^ j3;
                            i4 = i10;
                        } else {
                            int i11 = i10 + 1;
                            long j4 = j3 ^ (((long) bArr[i10]) << 42);
                            if (j4 >= 0) {
                                i4 = i11;
                                j = j4 ^ 4363953127296L;
                            } else {
                                int i12 = i11 + 1;
                                long j5 = j4 ^ (((long) bArr[i11]) << 49);
                                if (j5 < 0) {
                                    j = (-558586000294016L) ^ j5;
                                    i4 = i12;
                                } else {
                                    int i13 = i12 + 1;
                                    long j6 = (j5 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                    if (j6 < 0) {
                                        int i14 = i13 + 1;
                                        if (bArr[i13] < 0) {
                                            throw ppp.e();
                                        }
                                        j = j6;
                                        i4 = i14;
                                    } else {
                                        i4 = i13;
                                        j = j6;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.b = i4;
        return j;
    }

    @Override // defpackage.pqx
    public final poc q() throws ppp {
        ah(2);
        int iY = Y();
        if (iY == 0) {
            return poc.b;
        }
        af(iY);
        poc pocVarY = poc.y(this.a, this.b, iY);
        this.b += iY;
        return pocVarY;
    }

    @Override // defpackage.pqx
    public final Object r(Class cls, pos posVar) throws ppo {
        ah(3);
        return ad(pqu.a.a(cls), posVar);
    }

    @Override // defpackage.pqx
    public final Object s(prb prbVar, pos posVar) throws ppo {
        ah(3);
        return ad(prbVar, posVar);
    }

    @Override // defpackage.pqx
    public final Object t(Class cls, pos posVar) throws ppo {
        ah(2);
        return ae(pqu.a.a(cls), posVar);
    }

    @Override // defpackage.pqx
    public final Object u(prb prbVar, pos posVar) throws ppo {
        ah(2);
        return ae(prbVar, posVar);
    }

    @Override // defpackage.pqx
    public final String v() {
        return w(false);
    }

    public final String w(boolean z) throws ppp {
        ah(2);
        int iY = Y();
        if (iY == 0) {
            return "";
        }
        af(iY);
        if (z) {
            byte[] bArr = this.a;
            int i = this.b;
            if (!prx.h(bArr, i, i + iY)) {
                throw ppp.d();
            }
        }
        String str = new String(this.a, this.b, iY, ppn.a);
        this.b += iY;
        return str;
    }

    @Override // defpackage.pqx
    public final String x() {
        return w(true);
    }

    @Override // defpackage.pqx
    public final void y(List list) throws ppp {
        int i;
        int i2;
        if (!(list instanceof pnu)) {
            switch (psa.b(this.d)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iY = this.b + Y();
                    while (this.b < iY) {
                        list.add(Boolean.valueOf(Y() != 0));
                    }
                    ag(iY);
                    return;
            }
            do {
                list.add(Boolean.valueOf(T()));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        pnu pnuVar = (pnu) list;
        switch (psa.b(this.d)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iY2 = this.b + Y();
                while (this.b < iY2) {
                    pnuVar.f(Y() != 0);
                }
                ag(iY2);
                return;
        }
        do {
            pnuVar.f(T());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.pqx
    public final void z(List list) throws ppo {
        int i;
        if (psa.b(this.d) != 2) {
            throw ppp.a();
        }
        do {
            list.add(q());
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }
}
