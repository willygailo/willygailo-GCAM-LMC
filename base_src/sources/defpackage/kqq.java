package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kqq extends kqh {
    protected abstract kqw a(Context context);

    @Override // defpackage.kqh
    public final void c(String str, byte[] bArr, byte[] bArr2, kre kreVar) {
        pls plsVar = pls.a;
        d(str, bArr, bArr2, kreVar);
    }

    @Override // defpackage.kqh
    public final void d(String str, byte[] bArr, byte[] bArr2, kre kreVar) throws ppp {
        try {
            pnq pnqVar = (pnq) ppd.s(pnq.c, bArr, pos.b());
            try {
                if (!pnqVar.a.isEmpty() && !"type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria".equals(pnqVar.a)) {
                    throw new ppp(String.format("Incorrect type url: %s, expected: %s", pnqVar.a, "type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria"));
                }
                try {
                    poc pocVar = pnqVar.b;
                    pos posVarB = pos.b();
                    plr plrVar = plr.h;
                    try {
                        poh pohVarL = pocVar.l();
                        ppd ppdVar = (ppd) plrVar.G(4);
                        try {
                            try {
                                try {
                                    try {
                                        prb prbVarB = pqu.a.b(ppdVar);
                                        prbVarB.h(ppdVar, poi.p(pohVarL), posVarB);
                                        prbVarB.f(ppdVar);
                                        try {
                                            pohVarL.z(0);
                                            ppd.H(ppdVar);
                                            plr plrVar2 = (plr) ppdVar;
                                            prl prlVar = plrVar2.e;
                                            if (prlVar == null) {
                                                prlVar = prl.c;
                                            }
                                            if (prlVar.a < 0) {
                                                throw new ppp("Start date less than zero");
                                            }
                                            prl prlVar2 = plrVar2.e;
                                            if (prlVar2 == null) {
                                                prlVar2 = prl.c;
                                            }
                                            if (prlVar2.b >= 0) {
                                                prl prlVar3 = plrVar2.e;
                                                if (prlVar3 == null) {
                                                    prlVar3 = prl.c;
                                                }
                                                if (prlVar3.b <= 999999999) {
                                                    prl prlVar4 = plrVar2.f;
                                                    if (prlVar4 == null) {
                                                        prlVar4 = prl.c;
                                                    }
                                                    if (prlVar4.a < 0) {
                                                        throw new ppp("End date less than zero");
                                                    }
                                                    prl prlVar5 = plrVar2.f;
                                                    if (prlVar5 == null) {
                                                        prlVar5 = prl.c;
                                                    }
                                                    if (prlVar5.b >= 0) {
                                                        prl prlVar6 = plrVar2.f;
                                                        if (prlVar6 == null) {
                                                            prlVar6 = prl.c;
                                                        }
                                                        if (prlVar6.b <= 999999999) {
                                                            prl prlVar7 = plrVar2.f;
                                                            if (prlVar7 == null) {
                                                                prlVar7 = prl.c;
                                                            }
                                                            long j = prlVar7.a;
                                                            prl prlVar8 = plrVar2.e;
                                                            if (prlVar8 == null) {
                                                                prlVar8 = prl.c;
                                                            }
                                                            if (j < prlVar8.a) {
                                                                throw new ppp("End date before start date");
                                                            }
                                                            try {
                                                                pnq pnqVar2 = (pnq) ppd.s(pnq.c, bArr2, pos.b());
                                                                try {
                                                                    if (!pnqVar2.equals(pnq.c) && !"type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint".equals(pnqVar2.a)) {
                                                                        throw new ppp(String.format("Incorrect type url: %s, expected: %s", pnqVar2.a, "type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint"));
                                                                    }
                                                                    try {
                                                                        poc pocVar2 = pnqVar2.b;
                                                                        pos posVarB2 = pos.b();
                                                                        plq plqVar = plq.c;
                                                                        try {
                                                                            poh pohVarL2 = pocVar2.l();
                                                                            ppd ppdVar2 = (ppd) plqVar.G(4);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        prb prbVarB2 = pqu.a.b(ppdVar2);
                                                                                        prbVarB2.h(ppdVar2, poi.p(pohVarL2), posVarB2);
                                                                                        prbVarB2.f(ppdVar2);
                                                                                        try {
                                                                                            pohVarL2.z(0);
                                                                                            ppd.H(ppdVar2);
                                                                                            plq plqVar2 = (plq) ppdVar2;
                                                                                            if ((plqVar2.a == 1 ? ((Long) plqVar2.b).longValue() : 0L) < 0) {
                                                                                                throw new ppp("LastReturnedId less than zero");
                                                                                            }
                                                                                            kqw kqwVarA = a(this);
                                                                                            kqw.a(str);
                                                                                            kreVar.b(new kqt(kqwVarA.b, str, plrVar2, plqVar2, kqwVarA.c));
                                                                                            return;
                                                                                        } catch (ppp e) {
                                                                                            throw e;
                                                                                        }
                                                                                    } catch (ppp e2) {
                                                                                        throw e2;
                                                                                    }
                                                                                } catch (RuntimeException e3) {
                                                                                    if (!(e3.getCause() instanceof ppp)) {
                                                                                        throw e3;
                                                                                    }
                                                                                    throw ((ppp) e3.getCause());
                                                                                }
                                                                            } catch (ppp e4) {
                                                                                if (!e4.a) {
                                                                                    throw e4;
                                                                                }
                                                                                throw new ppp(e4);
                                                                            } catch (IOException e5) {
                                                                                if (!(e5.getCause() instanceof ppp)) {
                                                                                    throw new ppp(e5);
                                                                                }
                                                                                throw ((ppp) e5.getCause());
                                                                            }
                                                                        } catch (ppp e6) {
                                                                            throw e6;
                                                                        }
                                                                    } catch (ppp e7) {
                                                                        e = e7;
                                                                        Log.w("ExampleStoreSvc", e.getMessage());
                                                                        kreVar.a(10, e.getMessage());
                                                                        return;
                                                                    }
                                                                } catch (ppp e8) {
                                                                    e = e8;
                                                                }
                                                            } catch (ppp e9) {
                                                                Log.w("ExampleStoreSvc", "Error parsing Any proto from resumptionPoint");
                                                                kreVar.a(10, "Error parsing Any proto from resumptionPoint");
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    throw new ppp("Invalid end date nanos");
                                                }
                                            }
                                            throw new ppp("Invalid start date nanos");
                                        } catch (ppp e10) {
                                            throw e10;
                                        }
                                    } catch (ppp e11) {
                                        throw e11;
                                    }
                                } catch (ppp e12) {
                                    if (!e12.a) {
                                        throw e12;
                                    }
                                    throw new ppp(e12);
                                }
                            } catch (RuntimeException e13) {
                                if (!(e13.getCause() instanceof ppp)) {
                                    throw e13;
                                }
                                throw ((ppp) e13.getCause());
                            }
                        } catch (IOException e14) {
                            if (!(e14.getCause() instanceof ppp)) {
                                throw new ppp(e14);
                            }
                            throw ((ppp) e14.getCause());
                        }
                    } catch (ppp e15) {
                        throw e15;
                    }
                } catch (ppp e16) {
                    e = e16;
                    String strValueOf = String.valueOf(e.getMessage());
                    String strConcat = strValueOf.length() != 0 ? "Error parsing SelectionCriteria proto: ".concat(strValueOf) : new String("Error parsing SelectionCriteria proto: ");
                    Log.w("ExampleStoreSvc", strConcat);
                    kreVar.a(10, strConcat);
                }
            } catch (ppp e17) {
                e = e17;
            }
        } catch (ppp e18) {
            Log.w("ExampleStoreSvc", "Error parsing Any proto from criteria");
            kreVar.a(10, "Error parsing Any proto from criteria");
        }
    }
}
