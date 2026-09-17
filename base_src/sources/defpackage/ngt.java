package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ngt {
    public static final /* synthetic */ int a = 0;
    private static volatile Map b = null;
    private static final Object c = new Object();
    private static volatile njw d = null;
    private static final Object e = new Object();
    private static final nkv f = new nkv(ngu.h);

    public static ngu a(neu neuVar) {
        int i;
        poy poyVarM = ngu.h.m();
        if (neuVar == null) {
            return (ngu) poyVarM.j();
        }
        for (nev nevVar : neuVar.e) {
            poy poyVarM2 = ngv.e.m();
            String str = nevVar.d;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            ngv ngvVar = (ngv) poyVarM2.b;
            str.getClass();
            ngvVar.a |= 1;
            ngvVar.d = str;
            int i2 = nevVar.b;
            switch (i2) {
                case 0:
                    i = 6;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                default:
                    i = 0;
                    break;
            }
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i3) {
                case 0:
                    long jLongValue = i2 == 1 ? ((Long) nevVar.c).longValue() : 0L;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    ngv ngvVar2 = (ngv) poyVarM2.b;
                    ngvVar2.b = 2;
                    ngvVar2.c = Long.valueOf(jLongValue);
                    break;
                case 1:
                    boolean zBooleanValue = i2 == 2 ? ((Boolean) nevVar.c).booleanValue() : false;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    ngv ngvVar3 = (ngv) poyVarM2.b;
                    ngvVar3.b = 3;
                    ngvVar3.c = Boolean.valueOf(zBooleanValue);
                    break;
                case 2:
                    double dDoubleValue = i2 == 3 ? ((Double) nevVar.c).doubleValue() : 0.0d;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    ngv ngvVar4 = (ngv) poyVarM2.b;
                    ngvVar4.b = 4;
                    ngvVar4.c = Double.valueOf(dDoubleValue);
                    break;
                case 3:
                    String str2 = i2 == 4 ? (String) nevVar.c : "";
                    str2.getClass();
                    ngvVar.b = 5;
                    ngvVar.c = str2;
                    break;
                case 4:
                    poc pocVar = i2 == 5 ? (poc) nevVar.c : poc.b;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    ngv ngvVar5 = (ngv) poyVarM2.b;
                    pocVar.getClass();
                    ngvVar5.b = 6;
                    ngvVar5.c = pocVar;
                    break;
                default:
                    throw new IllegalStateException("No known flag type");
            }
            ngv ngvVar6 = (ngv) poyVarM2.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ngu nguVar = (ngu) poyVarM.b;
            ngvVar6.getClass();
            ppm ppmVar = nguVar.g;
            if (!ppmVar.c()) {
                nguVar.g = ppd.B(ppmVar);
            }
            nguVar.g.add(ngvVar6);
        }
        String str3 = neuVar.d;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ngu nguVar2 = (ngu) poyVarM.b;
        str3.getClass();
        int i4 = 4 | nguVar2.a;
        nguVar2.a = i4;
        nguVar2.d = str3;
        String str4 = neuVar.b;
        str4.getClass();
        int i5 = 1 | i4;
        nguVar2.a = i5;
        nguVar2.b = str4;
        long j = neuVar.h;
        int i6 = i5 | 8;
        nguVar2.a = i6;
        nguVar2.e = j;
        if ((neuVar.a & 2) != 0) {
            poc pocVar2 = neuVar.c;
            pocVar2.getClass();
            nguVar2.a = i6 | 2;
            nguVar2.c = pocVar2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ngu nguVar3 = (ngu) poyVarM.b;
        nguVar3.a |= 16;
        nguVar3.f = jCurrentTimeMillis;
        return (ngu) poyVarM.j();
    }

    static njw b(Context context, phw phwVar) {
        njw njwVar = d;
        if (njwVar == null) {
            synchronized (e) {
                njwVar = d;
                if (njwVar == null) {
                    nio nioVar = new nio(Collections.singletonList(new niq(new odu(context, null), null)));
                    njx njxVar = new njx();
                    njxVar.a = phwVar;
                    njxVar.b = nioVar;
                    nks nksVar = nke.a;
                    obr.aK(!njxVar.c.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                    njxVar.c.put("singleproc", nksVar);
                    njw njwVar2 = new njw(njxVar.a, njxVar.b, njxVar.d, njxVar.c);
                    d = njwVar2;
                    njwVar = njwVar2;
                }
            }
        }
        return njwVar;
    }

    static oor c(ngu nguVar) {
        int i;
        HashMap mapAb = obr.ab(nguVar.g.size() + 3);
        for (ngv ngvVar : nguVar.g) {
            int i2 = ngvVar.b;
            switch (i2) {
                case 0:
                    i = 6;
                    break;
                case 1:
                default:
                    i = 0;
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 5;
                    break;
            }
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i3) {
                case 0:
                    mapAb.put(ngvVar.d, Long.valueOf(i2 == 2 ? ((Long) ngvVar.c).longValue() : 0L));
                    break;
                case 1:
                    mapAb.put(ngvVar.d, Boolean.valueOf(i2 == 3 ? ((Boolean) ngvVar.c).booleanValue() : false));
                    break;
                case 2:
                    mapAb.put(ngvVar.d, Double.valueOf(i2 == 4 ? ((Double) ngvVar.c).doubleValue() : 0.0d));
                    break;
                case 3:
                    mapAb.put(ngvVar.d, i2 == 5 ? (String) ngvVar.c : "");
                    break;
                case 4:
                    mapAb.put(ngvVar.d, (i2 == 6 ? (poc) ngvVar.c : poc.b).B());
                    break;
            }
        }
        mapAb.put("__phenotype_server_token", nguVar.d);
        mapAb.put("__phenotype_snapshot_token", nguVar.b);
        mapAb.put("__phenotype_configuration_version", Long.valueOf(nguVar.e));
        return oor.o(mapAb);
    }

    static pht d(nei neiVar, String str, String str2) {
        return pgb.h(neiVar.d().b(str, str2), imd.r, neiVar.c());
    }

    public static pht e(nei neiVar, String str, String str2, final ngu nguVar, boolean z, boolean z2) {
        final int i = 0;
        if (str.indexOf(35) < 0 && !z2) {
            final int i2 = 1;
            pht phtVarB = g(neiVar, neg.b(neiVar.g, str), str2, z).b(new oiu() { // from class: ngr
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    switch (i2) {
                        case 0:
                            ngu nguVar2 = nguVar;
                            int i3 = ngt.a;
                            return nguVar2;
                        default:
                            ngu nguVar3 = nguVar;
                            int i4 = ngt.a;
                            return nguVar3;
                    }
                }
            }, neiVar.c());
            phtVarB.d(new ngs(phtVarB, str, i), neiVar.c());
        }
        return g(neiVar, str, str2, z).b(new oiu() { // from class: ngr
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                switch (i) {
                    case 0:
                        ngu nguVar2 = nguVar;
                        int i3 = ngt.a;
                        return nguVar2;
                    default:
                        ngu nguVar3 = nguVar;
                        int i4 = ngt.a;
                        return nguVar3;
                }
            }
        }, neiVar.c());
    }

    public static Map f(Context context) {
        Map map = b;
        if (map == null) {
            synchronized (c) {
                map = b;
                if (map == null) {
                    oon oonVarM = oor.m();
                    try {
                        for (String str : context.getAssets().list("phenotype")) {
                            try {
                                AssetManager assets = context.getAssets();
                                String strValueOf = String.valueOf(str);
                                InputStream inputStreamOpen = assets.open(strValueOf.length() != 0 ? "phenotype/".concat(strValueOf) : new String("phenotype/"));
                                try {
                                    nfn nfnVar = new nfn(context, (nfo) ppd.q(nfo.g, inputStreamOpen, pos.b()));
                                    oonVarM.e(nfnVar.a, nfnVar);
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                } catch (Throwable th) {
                                    if (inputStreamOpen != null) {
                                        try {
                                            inputStreamOpen.close();
                                        } catch (Throwable th2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (ppp e2) {
                                String strValueOf2 = String.valueOf(str);
                                Log.e("SnapshotHandler", strValueOf2.length() != 0 ? "Unable to read Phenotype PackageMetadata for ".concat(strValueOf2) : new String("Unable to read Phenotype PackageMetadata for "), e2);
                            }
                        }
                    } catch (IOException e3) {
                        Log.e("SnapshotHandler", "Unable to read Phenotype PackageMetadata from assets.", e3);
                    }
                    oor oorVarC = oonVarM.c();
                    b = oorVarC;
                    map = oorVarC;
                }
            }
        }
        return map;
    }

    static nkq g(nei neiVar, String str, String str2, boolean z) {
        nju njuVarA = njv.a();
        nir nirVarA = nis.a(neiVar.g);
        nirVarA.b();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str2);
        sb.append(".pb");
        nirVarA.c(sb.toString());
        if (z) {
            int i = mez.a;
            myw.b(nis.d.contains("directboot-files"), "The only supported locations are %s: %s", nis.d, "directboot-files");
            nirVarA.a = "directboot-files";
        }
        njuVarA.e(nirVarA.a());
        njuVarA.d(ngu.h);
        njuVarA.c(f);
        njuVarA.b();
        return b(neiVar.g, neiVar.c()).a(njuVarA.a());
    }
}
