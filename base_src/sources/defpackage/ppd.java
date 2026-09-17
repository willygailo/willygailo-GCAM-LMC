package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppd extends pnm {
    public static final Map aE = new ConcurrentHashMap();
    public prn aF = prn.a;
    public int aG = -1;

    public static ppm A() {
        return pqv.b;
    }

    public static ppm B(ppm ppmVar) {
        int size = ppmVar.size();
        return ppmVar.e(size == 0 ? 10 : size + size);
    }

    public static Object D(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object E(pqm pqmVar, String str, Object[] objArr) {
        return new pqw(pqmVar, str, objArr);
    }

    protected static void F(Class cls, ppd ppdVar) {
        aE.put(cls, ppdVar);
    }

    public static void H(ppd ppdVar) throws ppp {
        if (ppdVar != null && !ppdVar.n()) {
            throw h().a();
        }
    }

    public static poq I(pqm pqmVar, Object obj, pqm pqmVar2, int i, pry pryVar) {
        return new poq(pqmVar, obj, pqmVar2, new ppc(i, pryVar));
    }

    public static ppd o(ppd ppdVar, InputStream inputStream) throws ppp {
        ppd ppdVar2;
        pos posVarA = pos.a();
        try {
            int i = inputStream.read();
            if (i == -1) {
                ppdVar2 = null;
            } else {
                int i2 = poh.d;
                if ((i & 128) != 0) {
                    i &= 127;
                    int i3 = 7;
                    while (true) {
                        if (i3 < 32) {
                            int i4 = inputStream.read();
                            if (i4 == -1) {
                                throw ppp.i();
                            }
                            i |= (i4 & 127) << i3;
                            if ((i4 & 128) == 0) {
                                break;
                            }
                            i3 += 7;
                        } else {
                            while (true) {
                                if (i3 >= 64) {
                                    throw ppp.e();
                                }
                                int i5 = inputStream.read();
                                if (i5 == -1) {
                                    throw ppp.i();
                                }
                                if ((i5 & 128) == 0) {
                                    break;
                                }
                                i3 += 7;
                            }
                        }
                    }
                }
                poh pohVarH = poh.H(new pnk(inputStream, i));
                ppdVar2 = (ppd) ppdVar.G(4);
                try {
                    prb prbVarB = pqu.a.b(ppdVar2);
                    prbVarB.h(ppdVar2, poi.p(pohVarH), posVarA);
                    prbVarB.f(ppdVar2);
                    try {
                        pohVarH.z(0);
                    } catch (ppp e) {
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof ppp) {
                        throw ((ppp) e2.getCause());
                    }
                    throw e2;
                } catch (ppp e3) {
                    if (e3.a) {
                        throw new ppp(e3);
                    }
                    throw e3;
                } catch (IOException e4) {
                    if (e4.getCause() instanceof ppp) {
                        throw ((ppp) e4.getCause());
                    }
                    throw new ppp(e4);
                }
            }
            H(ppdVar2);
            return ppdVar2;
        } catch (ppp e5) {
            if (e5.a) {
                throw new ppp(e5);
            }
            throw e5;
        } catch (IOException e6) {
            throw new ppp(e6);
        }
    }

    public static ppd p(ppd ppdVar, byte[] bArr) throws ppp {
        ppd ppdVarU = u(ppdVar, bArr, 0, bArr.length, pos.a());
        H(ppdVarU);
        return ppdVarU;
    }

    public static ppd q(ppd ppdVar, InputStream inputStream, pos posVar) throws ppp {
        poh pohVarH = poh.H(inputStream);
        ppd ppdVar2 = (ppd) ppdVar.G(4);
        try {
            prb prbVarB = pqu.a.b(ppdVar2);
            prbVarB.h(ppdVar2, poi.p(pohVarH), posVar);
            prbVarB.f(ppdVar2);
            H(ppdVar2);
            return ppdVar2;
        } catch (ppp e) {
            if (e.a) {
                throw new ppp(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof ppp) {
                throw ((ppp) e2.getCause());
            }
            throw new ppp(e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ppp) {
                throw ((ppp) e3.getCause());
            }
            throw e3;
        }
    }

    public static ppd r(ppd ppdVar, ByteBuffer byteBuffer, pos posVar) throws ppp {
        poh pohVarJ;
        int i = poh.d;
        if (byteBuffer.hasArray()) {
            pohVarJ = poh.J(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else if (byteBuffer.isDirect() && prv.a) {
            pohVarJ = new pog(byteBuffer);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            pohVarJ = poh.J(bArr, 0, iRemaining);
        }
        ppd ppdVar2 = (ppd) ppdVar.G(4);
        try {
            prb prbVarB = pqu.a.b(ppdVar2);
            prbVarB.h(ppdVar2, poi.p(pohVarJ), posVar);
            prbVarB.f(ppdVar2);
            H(ppdVar2);
            H(ppdVar2);
            return ppdVar2;
        } catch (ppp e) {
            if (e.a) {
                throw new ppp(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof ppp) {
                throw ((ppp) e2.getCause());
            }
            throw new ppp(e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ppp) {
                throw ((ppp) e3.getCause());
            }
            throw e3;
        }
    }

    public static ppd s(ppd ppdVar, byte[] bArr, pos posVar) throws ppp {
        ppd ppdVarU = u(ppdVar, bArr, 0, bArr.length, posVar);
        H(ppdVarU);
        return ppdVarU;
    }

    static ppd t(ppd ppdVar, poh pohVar, pos posVar) throws ppp {
        ppd ppdVar2 = (ppd) ppdVar.G(4);
        try {
            prb prbVarB = pqu.a.b(ppdVar2);
            prbVarB.h(ppdVar2, poi.p(pohVar), posVar);
            prbVarB.f(ppdVar2);
            return ppdVar2;
        } catch (ppp e) {
            if (e.a) {
                throw new ppp(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof ppp) {
                throw ((ppp) e2.getCause());
            }
            throw new ppp(e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ppp) {
                throw ((ppp) e3.getCause());
            }
            throw e3;
        }
    }

    public static ppd u(ppd ppdVar, byte[] bArr, int i, int i2, pos posVar) throws ppp {
        ppd ppdVar2 = (ppd) ppdVar.G(4);
        try {
            prb prbVarB = pqu.a.b(ppdVar2);
            prbVarB.i(ppdVar2, bArr, i, i + i2, new pnr(posVar));
            prbVarB.f(ppdVar2);
            if (ppdVar2.aD == 0) {
                return ppdVar2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof ppp) {
                throw ((ppp) e.getCause());
            }
            throw new ppp(e);
        } catch (IndexOutOfBoundsException e2) {
            throw ppp.i();
        } catch (ppp e3) {
            if (e3.a) {
                throw new ppp(e3);
            }
            throw e3;
        }
    }

    public static ppj v(ppj ppjVar) {
        int size = ppjVar.size();
        return ppjVar.e(size == 0 ? 10 : size + size);
    }

    public static ppk w() {
        return ppe.b;
    }

    public static ppk x(ppk ppkVar) {
        int size = ppkVar.size();
        return ppkVar.e(size == 0 ? 10 : size + size);
    }

    public static ppl y() {
        return pqb.b;
    }

    public static ppl z(ppl pplVar) {
        int size = pplVar.size();
        return pplVar.e(size == 0 ? 10 : size + size);
    }

    @Override // defpackage.pqm
    public final pqs C() {
        return (pqs) G(7);
    }

    public final Object G(int i) {
        return a(i, null);
    }

    protected abstract Object a(int i, Object obj);

    @Override // defpackage.pnm
    public final int c() {
        return this.aG;
    }

    @Override // defpackage.pnm
    public final void e(int i) {
        this.aG = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return pqu.a.b(this).j(this, (ppd) obj);
        }
        return false;
    }

    @Override // defpackage.pqm
    public final /* synthetic */ pql fC() {
        return (poy) G(5);
    }

    @Override // defpackage.pqm
    public final void fD(pom pomVar) {
        prb prbVarB = pqu.a.b(this);
        pon ponVar = pomVar.f;
        if (ponVar == null) {
            ponVar = new pon(pomVar);
        }
        prbVarB.l(this, ponVar);
    }

    @Override // defpackage.pqm
    public final /* synthetic */ pql gz() {
        poy poyVar = (poy) G(5);
        poyVar.o(this);
        return poyVar;
    }

    public final int hashCode() {
        int i = this.aD;
        if (i != 0) {
            return i;
        }
        int iB = pqu.a.b(this).b(this);
        this.aD = iB;
        return iB;
    }

    @Override // defpackage.pqm
    public final int k() {
        int i = this.aG;
        if (i != -1) {
            return i;
        }
        int iA = pqu.a.b(this).a(this);
        this.aG = iA;
        return iA;
    }

    @Override // defpackage.pqn
    public final /* synthetic */ pqm l() {
        return (ppd) G(6);
    }

    public final poy m() {
        return (poy) G(5);
    }

    @Override // defpackage.pqn
    public final boolean n() {
        boolean zBooleanValue = Boolean.TRUE.booleanValue();
        byte bByteValue = ((Byte) G(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zK = pqu.a.b(this).k(this);
        if (!zBooleanValue) {
            return zK;
        }
        a(2, true != zK ? null : this);
        return zK;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        plk.aM(this, sb, 0);
        return sb.toString();
    }
}
