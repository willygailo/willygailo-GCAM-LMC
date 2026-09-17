package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class dad {
    private UUID a;
    private nme b;
    private final Set c = new HashSet();

    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    public final ojc a(nme nmeVar) {
        otw otwVar;
        otn otnVarB;
        nme nmeVar2 = this.b;
        if (nmeVar2 != null && nmeVar.b == nmeVar2.b) {
            String str = nmeVar.a.a;
            String str2 = nmeVar2.a.a;
            oom oomVarM = oom.m(str);
            brr brrVar = new brr(10);
            otx otvVar = new otv(brrVar);
            otj it = oomVarM.iterator();
            loop0: while (true) {
                otwVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Object objA = brrVar.a(it.next());
                int i = 0;
                while (true) {
                    pfc pfcVar = (pfc) objA;
                    if (i < pfcVar.c) {
                        if ((pfcVar.a(i) & (-128)) != 0) {
                            otvVar = null;
                            break loop0;
                        }
                        i++;
                    }
                }
            }
            if (otvVar == null) {
                int[] iArr = new int[256];
                iArr[0] = 1;
                otj it2 = oomVarM.iterator();
                loop2: while (true) {
                    if (!it2.hasNext()) {
                        otwVar = new otw(iArr, brrVar);
                        break;
                    }
                    Object objA2 = brrVar.a(it2.next());
                    int i2 = 0;
                    while (true) {
                        pfc pfcVar2 = (pfc) objA2;
                        if (i2 < pfcVar2.c) {
                            int iA = pfcVar2.a(i2);
                            int i3 = iA & 255;
                            int i4 = iArr[i3];
                            if (i4 != iA) {
                                if ((i4 & 255) == i3) {
                                    break loop2;
                                }
                                iArr[i3] = iA;
                            }
                            i2++;
                        }
                    }
                }
                if (otwVar == null) {
                    otq otqVar = new otq(brrVar);
                    onw onwVar = new onw();
                    otr otrVar = new otr(onwVar);
                    otj it3 = oomVarM.iterator();
                    while (it3.hasNext()) {
                        otqVar.a(it3.next(), otrVar);
                    }
                    otvVar = new ott(new ord(onwVar), otqVar);
                } else {
                    otvVar = otwVar;
                }
            }
            pfc pfcVarB = otvVar.b(str);
            int iA2 = otvVar.a();
            switch (pfcVarB.c) {
                case 0:
                    otnVarB = otn.a;
                    break;
                case 1:
                    otnVarB = otn.b(pfcVarB);
                    break;
                default:
                    otnVarB = new otp(pfcVarB, iA2);
                    break;
            }
            obr.aI(true, "Expected nonnegative limit, but found %s.", Integer.MAX_VALUE);
            float fA = otnVarB.a(otvVar.b(str2), Integer.MAX_VALUE);
            if (fA / str.length() > 0.15f || fA / str2.length() > 0.15f) {
                this.b = nmeVar;
                this.a = UUID.randomUUID();
            }
        } else {
            this.b = nmeVar;
            this.a = UUID.randomUUID();
        }
        return c(Long.valueOf(this.a.getMostSignificantBits())) ? oih.a : ojc.i(Long.valueOf(this.a.getMostSignificantBits()));
    }

    public final synchronized void b(Long l) {
        this.c.add(l);
    }

    public final synchronized boolean c(Long l) {
        return this.c.contains(l);
    }
}
