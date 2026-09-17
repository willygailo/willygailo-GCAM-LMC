package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ney {
    private final kij a;

    public ney(kij kijVar) {
        this.a = kijVar;
    }

    private static pht c(kvk kvkVar) {
        return pfj.i(mip.I(kvkVar), kig.class, ewp.g, pgr.INSTANCE);
    }

    public final pht a(String str) {
        str.getClass();
        return c(this.a.i(str));
    }

    public final pht b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return c(this.a.j(str, str2).a(pgr.INSTANCE, new kuu() { // from class: nex
            @Override // defpackage.kuu
            public final Object a(kvk kvkVar) {
                nev nevVar;
                kto ktoVar = (kto) kvkVar.c();
                poy poyVarM = neu.i.m();
                String str3 = ktoVar.a;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                neu neuVar = (neu) poyVarM.b;
                str3.getClass();
                int i = neuVar.a | 1;
                neuVar.a = i;
                neuVar.b = str3;
                String str4 = ktoVar.c;
                str4.getClass();
                int i2 = 4;
                int i3 = i | 4;
                neuVar.a = i3;
                neuVar.d = str4;
                boolean z = ktoVar.f;
                int i4 = i3 | 8;
                neuVar.a = i4;
                neuVar.g = z;
                long j = ktoVar.g;
                neuVar.a = i4 | 16;
                neuVar.h = j;
                byte[] bArr = ktoVar.b;
                if (bArr != null) {
                    poc pocVarT = poc.t(bArr);
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    neu neuVar2 = (neu) poyVarM.b;
                    neuVar2.a |= 2;
                    neuVar2.c = pocVarT;
                }
                ktn[] ktnVarArr = ktoVar.d;
                int length = ktnVarArr.length;
                int i5 = 0;
                while (i5 < length) {
                    ktn ktnVar = ktnVarArr[i5];
                    kts[] ktsVarArr = ktnVar.b;
                    int length2 = ktsVarArr.length;
                    int i6 = 0;
                    while (i6 < length2) {
                        kts ktsVar = ktsVarArr[i6];
                        int i7 = ktsVar.g;
                        switch (i7) {
                            case 1:
                                poy poyVarM2 = nev.e.m();
                                String str5 = ktsVar.a;
                                if (poyVarM2.c) {
                                    poyVarM2.m();
                                    poyVarM2.c = false;
                                }
                                nev nevVar2 = (nev) poyVarM2.b;
                                str5.getClass();
                                nevVar2.a |= 1;
                                nevVar2.d = str5;
                                if (ktsVar.g != 1) {
                                    throw new IllegalArgumentException("Not a long type");
                                }
                                long j2 = ktsVar.b;
                                nevVar2.b = 1;
                                nevVar2.c = Long.valueOf(j2);
                                nevVar = (nev) poyVarM2.j();
                                break;
                                break;
                            case 2:
                                poy poyVarM3 = nev.e.m();
                                String str6 = ktsVar.a;
                                if (poyVarM3.c) {
                                    poyVarM3.m();
                                    poyVarM3.c = false;
                                }
                                nev nevVar3 = (nev) poyVarM3.b;
                                str6.getClass();
                                nevVar3.a |= 1;
                                nevVar3.d = str6;
                                if (ktsVar.g != 2) {
                                    throw new IllegalArgumentException("Not a boolean type");
                                }
                                boolean z2 = ktsVar.c;
                                nevVar3.b = 2;
                                nevVar3.c = Boolean.valueOf(z2);
                                nevVar = (nev) poyVarM3.j();
                                break;
                                break;
                            case 3:
                                poy poyVarM4 = nev.e.m();
                                String str7 = ktsVar.a;
                                if (poyVarM4.c) {
                                    poyVarM4.m();
                                    poyVarM4.c = false;
                                }
                                nev nevVar4 = (nev) poyVarM4.b;
                                str7.getClass();
                                nevVar4.a |= 1;
                                nevVar4.d = str7;
                                if (ktsVar.g != 3) {
                                    throw new IllegalArgumentException("Not a double type");
                                }
                                double d = ktsVar.d;
                                nevVar4.b = 3;
                                nevVar4.c = Double.valueOf(d);
                                nevVar = (nev) poyVarM4.j();
                                break;
                                break;
                            case 4:
                                poy poyVarM5 = nev.e.m();
                                String str8 = ktsVar.a;
                                if (poyVarM5.c) {
                                    poyVarM5.m();
                                    poyVarM5.c = false;
                                }
                                nev nevVar5 = (nev) poyVarM5.b;
                                str8.getClass();
                                nevVar5.a |= 1;
                                nevVar5.d = str8;
                                if (ktsVar.g != i2) {
                                    throw new IllegalArgumentException("Not a String type");
                                }
                                String str9 = ktsVar.e;
                                mip.dk(str9);
                                if (poyVarM5.c) {
                                    poyVarM5.m();
                                    poyVarM5.c = false;
                                }
                                nev nevVar6 = (nev) poyVarM5.b;
                                nevVar6.b = i2;
                                nevVar6.c = str9;
                                nevVar = (nev) poyVarM5.j();
                                break;
                                break;
                            case 5:
                                poy poyVarM6 = nev.e.m();
                                String str10 = ktsVar.a;
                                if (poyVarM6.c) {
                                    poyVarM6.m();
                                    poyVarM6.c = false;
                                }
                                nev nevVar7 = (nev) poyVarM6.b;
                                str10.getClass();
                                nevVar7.a |= 1;
                                nevVar7.d = str10;
                                if (ktsVar.g != 5) {
                                    throw new IllegalArgumentException("Not a bytes type");
                                }
                                poc pocVarT2 = poc.t((byte[]) mip.dk(ktsVar.f));
                                if (poyVarM6.c) {
                                    poyVarM6.m();
                                    poyVarM6.c = false;
                                }
                                nev nevVar8 = (nev) poyVarM6.b;
                                nevVar8.b = 5;
                                nevVar8.c = pocVarT2;
                                nevVar = (nev) poyVarM6.j();
                                break;
                                break;
                            default:
                                StringBuilder sb = new StringBuilder(35);
                                sb.append("Unrecognized flag type: ");
                                sb.append(i7);
                                throw new IllegalArgumentException(sb.toString());
                        }
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        neu neuVar3 = (neu) poyVarM.b;
                        nevVar.getClass();
                        ppm ppmVar = neuVar3.e;
                        if (!ppmVar.c()) {
                            neuVar3.e = ppd.B(ppmVar);
                        }
                        neuVar3.e.add(nevVar);
                        i6++;
                        i2 = 4;
                    }
                    String[] strArr = ktnVar.c;
                    if (strArr != null) {
                        for (String str11 : strArr) {
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            neu neuVar4 = (neu) poyVarM.b;
                            str11.getClass();
                            ppm ppmVar2 = neuVar4.f;
                            if (!ppmVar2.c()) {
                                neuVar4.f = ppd.B(ppmVar2);
                            }
                            neuVar4.f.add(str11);
                        }
                    }
                    i5++;
                    i2 = 4;
                }
                return (neu) poyVarM.j();
            }
        }));
    }
}
