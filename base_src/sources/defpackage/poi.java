package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class poi implements pqx {
    private final poh a;
    private int b;
    private int c;
    private int d = 0;

    private poi(poh pohVar) {
        ppn.i(pohVar, "input");
        this.a = pohVar;
        pohVar.c = this;
    }

    private final Object P(pry pryVar, Class cls, pos posVar) {
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

    private final Object V(prb prbVar, pos posVar) {
        int i = this.c;
        this.c = psa.c(psa.a(this.b), 4);
        try {
            Object objE = prbVar.e();
            prbVar.h(objE, this, posVar);
            prbVar.f(objE);
            if (this.b != this.c) {
                throw ppp.g();
            }
            this.c = i;
            return objE;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    private final Object W(prb prbVar, pos posVar) throws ppp {
        int iN = this.a.n();
        poh pohVar = this.a;
        if (pohVar.a >= pohVar.b) {
            throw new ppp("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = pohVar.e(iN);
        Object objE = prbVar.e();
        this.a.a++;
        prbVar.h(objE, this, posVar);
        prbVar.f(objE);
        this.a.z(0);
        poh pohVar2 = this.a;
        pohVar2.a--;
        pohVar2.A(iE);
        return objE;
    }

    private final void X(int i) throws ppp {
        if (this.a.d() != i) {
            throw ppp.i();
        }
    }

    private final void Y(int i) throws ppo {
        if (psa.b(this.b) != i) {
            throw ppp.a();
        }
    }

    private static final void Z(int i) throws ppp {
        if ((i & 3) != 0) {
            throw ppp.g();
        }
    }

    private static final void aa(int i) throws ppp {
        if ((i & 7) != 0) {
            throw ppp.g();
        }
    }

    public static poi p(poh pohVar) {
        poi poiVar = pohVar.c;
        return poiVar != null ? poiVar : new poi(pohVar);
    }

    @Override // defpackage.pqx
    public final void A(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof poo)) {
            switch (psa.b(this.b)) {
                case 1:
                    break;
                case 2:
                    int iN = this.a.n();
                    aa(iN);
                    int iD = this.a.d() + iN;
                    do {
                        list.add(Double.valueOf(this.a.b()));
                    } while (this.a.d() < iD);
                    return;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Double.valueOf(this.a.b()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        poo pooVar = (poo) list;
        switch (psa.b(this.b)) {
            case 1:
                break;
            case 2:
                int iN2 = this.a.n();
                aa(iN2);
                int iD2 = this.a.d() + iN2;
                do {
                    pooVar.d(this.a.b());
                } while (this.a.d() < iD2);
                return;
            default:
                throw ppp.a();
        }
        do {
            pooVar.d(this.a.b());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void B(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iD = this.a.d() + this.a.n();
                    do {
                        list.add(Integer.valueOf(this.a.f()));
                    } while (this.a.d() < iD);
                    X(iD);
                    return;
            }
            do {
                list.add(Integer.valueOf(this.a.f()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.b)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iD2 = this.a.d() + this.a.n();
                do {
                    ppeVar.g(this.a.f());
                } while (this.a.d() < iD2);
                X(iD2);
                return;
        }
        do {
            ppeVar.g(this.a.f());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void C(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.b)) {
                case 2:
                    int iN = this.a.n();
                    Z(iN);
                    int iD = this.a.d() + iN;
                    do {
                        list.add(Integer.valueOf(this.a.g()));
                    } while (this.a.d() < iD);
                    return;
                case 5:
                    break;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Integer.valueOf(this.a.g()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.b)) {
            case 2:
                int iN2 = this.a.n();
                Z(iN2);
                int iD2 = this.a.d() + iN2;
                do {
                    ppeVar.g(this.a.g());
                } while (this.a.d() < iD2);
                return;
            case 5:
                break;
            default:
                throw ppp.a();
        }
        do {
            ppeVar.g(this.a.g());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void D(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.b)) {
                case 1:
                    break;
                case 2:
                    int iN = this.a.n();
                    aa(iN);
                    int iD = this.a.d() + iN;
                    do {
                        list.add(Long.valueOf(this.a.o()));
                    } while (this.a.d() < iD);
                    return;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Long.valueOf(this.a.o()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.b)) {
            case 1:
                break;
            case 2:
                int iN2 = this.a.n();
                aa(iN2);
                int iD2 = this.a.d() + iN2;
                do {
                    pqbVar.d(this.a.o());
                } while (this.a.d() < iD2);
                return;
            default:
                throw ppp.a();
        }
        do {
            pqbVar.d(this.a.o());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void E(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof pow)) {
            switch (psa.b(this.b)) {
                case 2:
                    int iN = this.a.n();
                    Z(iN);
                    int iD = this.a.d() + iN;
                    do {
                        list.add(Float.valueOf(this.a.c()));
                    } while (this.a.d() < iD);
                    return;
                case 5:
                    break;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Float.valueOf(this.a.c()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        pow powVar = (pow) list;
        switch (psa.b(this.b)) {
            case 2:
                int iN2 = this.a.n();
                Z(iN2);
                int iD2 = this.a.d() + iN2;
                do {
                    powVar.g(this.a.c());
                } while (this.a.d() < iD2);
                return;
            case 5:
                break;
            default:
                throw ppp.a();
        }
        do {
            powVar.g(this.a.c());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void F(List list, prb prbVar, pos posVar) throws ppo {
        int iM;
        if (psa.b(this.b) != 3) {
            throw ppp.a();
        }
        int i = this.b;
        do {
            list.add(V(prbVar, posVar));
            if (this.a.C() || this.d != 0) {
                return;
            } else {
                iM = this.a.m();
            }
        } while (iM == i);
        this.d = iM;
    }

    @Override // defpackage.pqx
    public final void G(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iD = this.a.d() + this.a.n();
                    do {
                        list.add(Integer.valueOf(this.a.h()));
                    } while (this.a.d() < iD);
                    X(iD);
                    return;
            }
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.b)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iD2 = this.a.d() + this.a.n();
                do {
                    ppeVar.g(this.a.h());
                } while (this.a.d() < iD2);
                X(iD2);
                return;
        }
        do {
            ppeVar.g(this.a.h());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void H(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iD = this.a.d() + this.a.n();
                    do {
                        list.add(Long.valueOf(this.a.p()));
                    } while (this.a.d() < iD);
                    X(iD);
                    return;
            }
            do {
                list.add(Long.valueOf(this.a.p()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.b)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iD2 = this.a.d() + this.a.n();
                do {
                    pqbVar.d(this.a.p());
                } while (this.a.d() < iD2);
                X(iD2);
                return;
        }
        do {
            pqbVar.d(this.a.p());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void I(Map map, pqf pqfVar, pos posVar) throws ppo {
        Y(2);
        int iE = this.a.e(this.a.n());
        Object objP = pqfVar.b;
        Object objP2 = pqfVar.d;
        while (true) {
            try {
                int iC = c();
                if (iC != Integer.MAX_VALUE && !this.a.C()) {
                    switch (iC) {
                        case 1:
                            objP = P(pqfVar.a, null, null);
                            break;
                        case 2:
                            objP2 = P(pqfVar.c, pqfVar.d.getClass(), posVar);
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
                }
            } catch (Throwable th) {
                this.a.A(iE);
                throw th;
            }
        }
        map.put(objP, objP2);
        this.a.A(iE);
    }

    @Override // defpackage.pqx
    public final void J(List list, prb prbVar, pos posVar) throws ppo {
        int iM;
        if (psa.b(this.b) != 2) {
            throw ppp.a();
        }
        int i = this.b;
        do {
            list.add(W(prbVar, posVar));
            if (this.a.C() || this.d != 0) {
                return;
            } else {
                iM = this.a.m();
            }
        } while (iM == i);
        this.d = iM;
    }

    @Override // defpackage.pqx
    public final void K(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.b)) {
                case 2:
                    int iN = this.a.n();
                    Z(iN);
                    int iD = this.a.d() + iN;
                    do {
                        list.add(Integer.valueOf(this.a.k()));
                    } while (this.a.d() < iD);
                    return;
                case 5:
                    break;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Integer.valueOf(this.a.k()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.b)) {
            case 2:
                int iN2 = this.a.n();
                Z(iN2);
                int iD2 = this.a.d() + iN2;
                do {
                    ppeVar.g(this.a.k());
                } while (this.a.d() < iD2);
                return;
            case 5:
                break;
            default:
                throw ppp.a();
        }
        do {
            ppeVar.g(this.a.k());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void L(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.b)) {
                case 1:
                    break;
                case 2:
                    int iN = this.a.n();
                    aa(iN);
                    int iD = this.a.d() + iN;
                    do {
                        list.add(Long.valueOf(this.a.t()));
                    } while (this.a.d() < iD);
                    return;
                default:
                    throw ppp.a();
            }
            do {
                list.add(Long.valueOf(this.a.t()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.b)) {
            case 1:
                break;
            case 2:
                int iN2 = this.a.n();
                aa(iN2);
                int iD2 = this.a.d() + iN2;
                do {
                    pqbVar.d(this.a.t());
                } while (this.a.d() < iD2);
                return;
            default:
                throw ppp.a();
        }
        do {
            pqbVar.d(this.a.t());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void M(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iD = this.a.d() + this.a.n();
                    do {
                        list.add(Integer.valueOf(this.a.l()));
                    } while (this.a.d() < iD);
                    X(iD);
                    return;
            }
            do {
                list.add(Integer.valueOf(this.a.l()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.b)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iD2 = this.a.d() + this.a.n();
                do {
                    ppeVar.g(this.a.l());
                } while (this.a.d() < iD2);
                X(iD2);
                return;
        }
        do {
            ppeVar.g(this.a.l());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void N(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iD = this.a.d() + this.a.n();
                    do {
                        list.add(Long.valueOf(this.a.u()));
                    } while (this.a.d() < iD);
                    X(iD);
                    return;
            }
            do {
                list.add(Long.valueOf(this.a.u()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.b)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iD2 = this.a.d() + this.a.n();
                do {
                    pqbVar.d(this.a.u());
                } while (this.a.d() < iD2);
                X(iD2);
                return;
        }
        do {
            pqbVar.d(this.a.u());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void O(List list) throws ppo {
        w(list, false);
    }

    @Override // defpackage.pqx
    public final void Q(List list) throws ppo {
        w(list, true);
    }

    @Override // defpackage.pqx
    public final void R(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof ppe)) {
            switch (psa.b(this.b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iD = this.a.d() + this.a.n();
                    do {
                        list.add(Integer.valueOf(this.a.n()));
                    } while (this.a.d() < iD);
                    X(iD);
                    return;
            }
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        ppe ppeVar = (ppe) list;
        switch (psa.b(this.b)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iD2 = this.a.d() + this.a.n();
                do {
                    ppeVar.g(this.a.n());
                } while (this.a.d() < iD2);
                X(iD2);
                return;
        }
        do {
            ppeVar.g(this.a.n());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void S(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof pqb)) {
            switch (psa.b(this.b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iD = this.a.d() + this.a.n();
                    do {
                        list.add(Long.valueOf(this.a.v()));
                    } while (this.a.d() < iD);
                    X(iD);
                    return;
            }
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        pqb pqbVar = (pqb) list;
        switch (psa.b(this.b)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iD2 = this.a.d() + this.a.n();
                do {
                    pqbVar.d(this.a.v());
                } while (this.a.d() < iD2);
                X(iD2);
                return;
        }
        do {
            pqbVar.d(this.a.v());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final boolean T() throws ppo {
        Y(0);
        return this.a.D();
    }

    @Override // defpackage.pqx
    public final boolean U() {
        int i;
        if (this.a.C() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.E(i);
    }

    @Override // defpackage.pqx
    public final double a() throws ppo {
        Y(1);
        return this.a.b();
    }

    @Override // defpackage.pqx
    public final float b() throws ppo {
        Y(5);
        return this.a.c();
    }

    @Override // defpackage.pqx
    public final int c() {
        int iM = this.d;
        if (iM != 0) {
            this.b = iM;
            this.d = 0;
        } else {
            iM = this.a.m();
            this.b = iM;
        }
        if (iM == 0 || iM == this.c) {
            return Integer.MAX_VALUE;
        }
        return psa.a(iM);
    }

    @Override // defpackage.pqx
    public final int d() {
        return this.b;
    }

    @Override // defpackage.pqx
    public final int e() throws ppo {
        Y(0);
        return this.a.f();
    }

    @Override // defpackage.pqx
    public final int f() throws ppo {
        Y(5);
        return this.a.g();
    }

    @Override // defpackage.pqx
    public final int g() throws ppo {
        Y(0);
        return this.a.h();
    }

    @Override // defpackage.pqx
    public final int h() throws ppo {
        Y(5);
        return this.a.k();
    }

    @Override // defpackage.pqx
    public final int i() throws ppo {
        Y(0);
        return this.a.l();
    }

    @Override // defpackage.pqx
    public final int j() throws ppo {
        Y(0);
        return this.a.n();
    }

    @Override // defpackage.pqx
    public final long k() throws ppo {
        Y(1);
        return this.a.o();
    }

    @Override // defpackage.pqx
    public final long l() throws ppo {
        Y(0);
        return this.a.p();
    }

    @Override // defpackage.pqx
    public final long m() throws ppo {
        Y(1);
        return this.a.t();
    }

    @Override // defpackage.pqx
    public final long n() throws ppo {
        Y(0);
        return this.a.u();
    }

    @Override // defpackage.pqx
    public final long o() throws ppo {
        Y(0);
        return this.a.v();
    }

    @Override // defpackage.pqx
    public final poc q() throws ppo {
        Y(2);
        return this.a.w();
    }

    @Override // defpackage.pqx
    public final Object r(Class cls, pos posVar) throws ppo {
        Y(3);
        return V(pqu.a.a(cls), posVar);
    }

    @Override // defpackage.pqx
    public final Object s(prb prbVar, pos posVar) throws ppo {
        Y(3);
        return V(prbVar, posVar);
    }

    @Override // defpackage.pqx
    public final Object t(Class cls, pos posVar) throws ppo {
        Y(2);
        return W(pqu.a.a(cls), posVar);
    }

    @Override // defpackage.pqx
    public final Object u(prb prbVar, pos posVar) throws ppo {
        Y(2);
        return W(prbVar, posVar);
    }

    @Override // defpackage.pqx
    public final String v() throws ppo {
        Y(2);
        return this.a.x();
    }

    public final void w(List list, boolean z) throws ppo {
        int iM;
        int iM2;
        if (psa.b(this.b) != 2) {
            throw ppp.a();
        }
        if (!(list instanceof ppx) || z) {
            do {
                list.add(z ? x() : v());
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        ppx ppxVar = (ppx) list;
        do {
            ppxVar.i(q());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final String x() throws ppo {
        Y(2);
        return this.a.y();
    }

    @Override // defpackage.pqx
    public final void y(List list) throws ppp {
        int iM;
        int iM2;
        if (!(list instanceof pnu)) {
            switch (psa.b(this.b)) {
                case 0:
                    break;
                case 1:
                default:
                    throw ppp.a();
                case 2:
                    int iD = this.a.d() + this.a.n();
                    do {
                        list.add(Boolean.valueOf(this.a.D()));
                    } while (this.a.d() < iD);
                    X(iD);
                    return;
            }
            do {
                list.add(Boolean.valueOf(this.a.D()));
                if (this.a.C()) {
                    return;
                } else {
                    iM = this.a.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        pnu pnuVar = (pnu) list;
        switch (psa.b(this.b)) {
            case 0:
                break;
            case 1:
            default:
                throw ppp.a();
            case 2:
                int iD2 = this.a.d() + this.a.n();
                do {
                    pnuVar.f(this.a.D());
                } while (this.a.d() < iD2);
                X(iD2);
                return;
        }
        do {
            pnuVar.f(this.a.D());
            if (this.a.C()) {
                return;
            } else {
                iM2 = this.a.m();
            }
        } while (iM2 == this.b);
        this.d = iM2;
    }

    @Override // defpackage.pqx
    public final void z(List list) throws ppo {
        int iM;
        if (psa.b(this.b) != 2) {
            throw ppp.a();
        }
        do {
            list.add(q());
            if (this.a.C()) {
                return;
            } else {
                iM = this.a.m();
            }
        } while (iM == this.b);
        this.d = iM;
    }
}
