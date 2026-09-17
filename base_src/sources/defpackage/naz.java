package defpackage;

import android.app.Activity;
import android.os.Process;
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class naz extends myq implements mxo, mwa {
    private final mwe a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final AtomicBoolean e;

    public naz(mwe mweVar, qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        super(null);
        this.e = new AtomicBoolean();
        this.a = mweVar;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
    }

    private static long s(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static qxp u(nan nanVar) {
        poy poyVarM = qxp.f.m();
        if (nanVar.a != null) {
            String str = nanVar.a;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxp qxpVar = (qxp) poyVarM.b;
            str.getClass();
            qxpVar.a |= 1;
            qxpVar.b = str;
        }
        if (nanVar.b != null) {
            long jLongValue = nanVar.b.longValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxp qxpVar2 = (qxp) poyVarM.b;
            qxpVar2.a |= 2;
            qxpVar2.c = jLongValue;
        }
        if (nanVar.c != null) {
            long jLongValue2 = nanVar.c.longValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxp qxpVar3 = (qxp) poyVarM.b;
            qxpVar3.a |= 4;
            qxpVar3.d = jLongValue2;
        }
        if (nanVar.d != null) {
            long jLongValue3 = nanVar.d.longValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxp qxpVar4 = (qxp) poyVarM.b;
            qxpVar4.a |= 8;
            qxpVar4.e = jLongValue3;
        }
        return (qxp) poyVarM.j();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    @Override // defpackage.mwa
    public final void c(Activity activity) {
        Long lValueOf;
        long j;
        ojc ojcVarI;
        int i;
        boolean z;
        this.a.b(this);
        nav navVar = nav.a;
        long j2 = 0;
        if (navVar.g > 0 || navVar.h > 0) {
            long j3 = navVar.b ? navVar.c : navVar.e;
            if (j3 > 0) {
                if (navVar.g >= j3 || navVar.h >= j3) {
                    final poy poyVarM = qxr.v.m();
                    boolean z2 = navVar.b;
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    qxr qxrVar = (qxr) poyVarM.b;
                    qxrVar.a |= 65536;
                    qxrVar.q = z2;
                    if (navVar.b) {
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar2 = (qxr) poyVarM.b;
                        qxrVar2.r = 1;
                        qxrVar2.a = 131072 | qxrVar2.a;
                    } else {
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar3 = (qxr) poyVarM.b;
                        qxrVar3.r = 2;
                        qxrVar3.a = 131072 | qxrVar3.a;
                    }
                    nau nauVar = navVar.l;
                    if (nauVar.a) {
                        long j4 = navVar.c;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar4 = (qxr) poyVarM.b;
                        qxrVar4.a |= 16;
                        qxrVar4.e = j4;
                        lValueOf = Long.valueOf(j4);
                    } else {
                        lValueOf = null;
                    }
                    if (nauVar.b) {
                        long j5 = navVar.d;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar5 = (qxr) poyVarM.b;
                        qxrVar5.a |= 128;
                        qxrVar5.h = j5;
                        lValueOf = Long.valueOf(s(lValueOf, j5));
                    }
                    boolean z3 = nauVar.c;
                    boolean z4 = nauVar.d;
                    boolean z5 = nauVar.e;
                    if (nauVar.f) {
                        long j6 = navVar.e;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar6 = (qxr) poyVarM.b;
                        qxrVar6.a |= 512;
                        qxrVar6.j = j6;
                        lValueOf = Long.valueOf(s(lValueOf, j6));
                    }
                    switch (((Long) this.d.get()).intValue()) {
                        case 1:
                            if (!nauVar.i) {
                                j = -1;
                            } else {
                                j = navVar.h;
                            }
                            break;
                        case 2:
                            if (!nauVar.j) {
                                j = -1;
                            } else {
                                j = navVar.i;
                            }
                            break;
                        case 3:
                            if (!nauVar.g) {
                                j = -1;
                            } else {
                                j = navVar.g;
                            }
                            break;
                        case 4:
                            if (!nauVar.h) {
                                j = -1;
                            } else {
                                j = navVar.f;
                            }
                            break;
                        default:
                            j = -1;
                            break;
                    }
                    if (j != -1) {
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar7 = (qxr) poyVarM.b;
                        qxrVar7.a |= 1024;
                        qxrVar7.k = j;
                        lValueOf = Long.valueOf(s(lValueOf, j));
                    }
                    if (nauVar.g) {
                        long j7 = navVar.g;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar8 = (qxr) poyVarM.b;
                        qxrVar8.a |= 8192;
                        qxrVar8.n = j7;
                        lValueOf = Long.valueOf(s(lValueOf, j7));
                    }
                    if (nauVar.h) {
                        long j8 = navVar.f;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar9 = (qxr) poyVarM.b;
                        qxrVar9.a |= 16384;
                        qxrVar9.o = j8;
                        lValueOf = Long.valueOf(s(lValueOf, j8));
                    }
                    if (nauVar.i) {
                        long j9 = navVar.h;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar10 = (qxr) poyVarM.b;
                        qxrVar10.a |= 2048;
                        qxrVar10.l = j9;
                        lValueOf = Long.valueOf(s(lValueOf, j9));
                    }
                    if (nauVar.j) {
                        long j10 = navVar.i;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar11 = (qxr) poyVarM.b;
                        qxrVar11.a |= 4096;
                        qxrVar11.m = j10;
                        lValueOf = Long.valueOf(s(lValueOf, j10));
                    }
                    if (nauVar.k) {
                        long j11 = navVar.j;
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar12 = (qxr) poyVarM.b;
                        qxrVar12.a |= 32768;
                        qxrVar12.p = j11;
                        lValueOf = Long.valueOf(s(lValueOf, j11));
                    }
                    if (navVar.m.b != null) {
                        qxp qxpVarU = u(navVar.m);
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar13 = (qxr) poyVarM.b;
                        qxpVarU.getClass();
                        qxrVar13.s = qxpVarU;
                        qxrVar13.a |= 262144;
                        if ((qxpVarU.a & 2) != 0) {
                            lValueOf = Long.valueOf(s(lValueOf, qxpVarU.c));
                        }
                        if ((qxpVarU.a & 4) != 0) {
                            lValueOf = Long.valueOf(s(lValueOf, qxpVarU.d));
                        }
                        if ((qxpVarU.a & 8) != 0) {
                            lValueOf = Long.valueOf(s(lValueOf, qxpVarU.e));
                        }
                    }
                    if (navVar.n.b != null) {
                        qxp qxpVarU2 = u(navVar.n);
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar14 = (qxr) poyVarM.b;
                        qxpVarU2.getClass();
                        qxrVar14.t = qxpVarU2;
                        qxrVar14.a |= 524288;
                        if ((qxpVarU2.a & 2) != 0) {
                            lValueOf = Long.valueOf(s(lValueOf, qxpVarU2.c));
                        }
                        if ((qxpVarU2.a & 4) != 0) {
                            lValueOf = Long.valueOf(s(lValueOf, qxpVarU2.d));
                        }
                        if ((qxpVarU2.a & 8) != 0) {
                            lValueOf = Long.valueOf(s(lValueOf, qxpVarU2.e));
                        }
                    }
                    ojc ojcVarI2 = nba.a;
                    if (ojcVarI2 == null) {
                        long jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                        ojc ojcVarI3 = jSysconf > 0 ? ojc.i(Long.valueOf(jSysconf)) : oih.a;
                        if (ojcVarI3.g()) {
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            byte[] bArr = new byte[440];
                            try {
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                                    try {
                                        int i2 = fileInputStream.read(bArr);
                                        fileInputStream.close();
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= i2) {
                                                i3 = 0;
                                            } else if (bArr[i3] != 40) {
                                                i3++;
                                            }
                                        }
                                        if (i3 == 0 || (i = i3 + 16) >= i2) {
                                            ojcVarI = oih.a;
                                        } else {
                                            while (true) {
                                                if (i <= i3) {
                                                    z = false;
                                                } else if (bArr[i] == 41) {
                                                    i3 = i;
                                                    z = true;
                                                } else {
                                                    i--;
                                                }
                                            }
                                            if (z) {
                                                long j12 = 0;
                                                int i4 = 1;
                                                while (true) {
                                                    if (i3 < i2) {
                                                        byte b = bArr[i3];
                                                        if (b == 32) {
                                                            int i5 = i4 + 1;
                                                            if (i4 != 21) {
                                                                i4 = i5;
                                                                i3++;
                                                                j2 = 0;
                                                            } else if (j12 > j2) {
                                                                ojcVarI = ojc.i(Long.valueOf(j12));
                                                            }
                                                        } else {
                                                            if (i4 != 21) {
                                                                continue;
                                                            } else if (j12 <= 922337203685477580L) {
                                                                long j13 = j12 * 10;
                                                                if (b >= 48 && b <= 57) {
                                                                    j12 = j13 + ((long) (b - 48));
                                                                }
                                                            }
                                                            i3++;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    ojcVarI = oih.a;
                                                }
                                            } else {
                                                ojcVarI = oih.a;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            fileInputStream.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            throw th;
                                        }
                                    }
                                } catch (IOException e) {
                                    ojcVarI = oih.a;
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                }
                                ojcVarI2 = !ojcVarI.g() ? oih.a : ojc.i(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) ojcVarI.c()).longValue()) / ((Long) ojcVarI3.c()).longValue()));
                            } catch (Throwable th3) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th3;
                            }
                        } else {
                            ojcVarI2 = oih.a;
                        }
                        nba.a = ojcVarI2;
                    }
                    if (ojcVarI2.g()) {
                        Long l = (Long) ojcVarI2.c();
                        long jLongValue = l.longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qxr qxrVar15 = (qxr) poyVarM.b;
                        qxrVar15.a |= 2;
                        qxrVar15.c = jLongValue;
                        lValueOf = Long.valueOf(s(lValueOf, l.longValue()));
                    }
                    long startElapsedRealtime = Process.getStartElapsedRealtime();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    qxr qxrVar16 = (qxr) poyVarM.b;
                    qxrVar16.a |= 4;
                    qxrVar16.d = startElapsedRealtime;
                    long jLongValue2 = Long.valueOf(s(lValueOf, startElapsedRealtime)).longValue();
                    boolean zBooleanValue = ((Boolean) this.c.get()).booleanValue();
                    if (jLongValue2 != 0) {
                        if (!zBooleanValue) {
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar17 = (qxr) poyVarM.b;
                            qxrVar17.a |= 1;
                            qxrVar17.b = jLongValue2;
                        }
                        qxr qxrVar18 = (qxr) poyVarM.b;
                        if ((qxrVar18.a & 16) != 0) {
                            long j14 = qxrVar18.e - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar19 = (qxr) poyVarM.b;
                            qxrVar19.a |= 16;
                            qxrVar19.e = j14;
                        }
                        qxr qxrVar20 = (qxr) poyVarM.b;
                        if ((qxrVar20.a & 128) != 0) {
                            long j15 = qxrVar20.h - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar21 = (qxr) poyVarM.b;
                            qxrVar21.a |= 128;
                            qxrVar21.h = j15;
                        }
                        qxr qxrVar22 = (qxr) poyVarM.b;
                        if ((qxrVar22.a & 256) != 0) {
                            long j16 = qxrVar22.i - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar23 = (qxr) poyVarM.b;
                            qxrVar23.a |= 256;
                            qxrVar23.i = j16;
                        }
                        qxr qxrVar24 = (qxr) poyVarM.b;
                        if ((qxrVar24.a & 32) != 0) {
                            long j17 = qxrVar24.f - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar25 = (qxr) poyVarM.b;
                            qxrVar25.a |= 32;
                            qxrVar25.f = j17;
                        }
                        qxr qxrVar26 = (qxr) poyVarM.b;
                        if ((qxrVar26.a & 64) != 0) {
                            long j18 = qxrVar26.g - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar27 = (qxr) poyVarM.b;
                            qxrVar27.a |= 64;
                            qxrVar27.g = j18;
                        }
                        qxr qxrVar28 = (qxr) poyVarM.b;
                        if ((qxrVar28.a & 512) != 0) {
                            long j19 = qxrVar28.j - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar29 = (qxr) poyVarM.b;
                            qxrVar29.a |= 512;
                            qxrVar29.j = j19;
                        }
                        qxr qxrVar30 = (qxr) poyVarM.b;
                        if ((qxrVar30.a & 1024) != 0) {
                            long j20 = qxrVar30.k - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar31 = (qxr) poyVarM.b;
                            qxrVar31.a |= 1024;
                            qxrVar31.k = j20;
                        }
                        qxr qxrVar32 = (qxr) poyVarM.b;
                        if ((qxrVar32.a & 2048) != 0) {
                            long j21 = qxrVar32.l - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar33 = (qxr) poyVarM.b;
                            qxrVar33.a |= 2048;
                            qxrVar33.l = j21;
                        }
                        qxr qxrVar34 = (qxr) poyVarM.b;
                        if ((qxrVar34.a & 4096) != 0) {
                            long j22 = qxrVar34.m - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar35 = (qxr) poyVarM.b;
                            qxrVar35.a |= 4096;
                            qxrVar35.m = j22;
                        }
                        qxr qxrVar36 = (qxr) poyVarM.b;
                        if ((qxrVar36.a & 32768) != 0) {
                            long j23 = qxrVar36.p - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar37 = (qxr) poyVarM.b;
                            qxrVar37.a |= 32768;
                            qxrVar37.p = j23;
                        }
                        qxr qxrVar38 = (qxr) poyVarM.b;
                        if ((qxrVar38.a & 262144) != 0) {
                            qxp qxpVar = qxrVar38.s;
                            if (qxpVar == null) {
                                qxpVar = qxp.f;
                            }
                            poy poyVar = (poy) qxpVar.G(5);
                            poyVar.o(qxpVar);
                            qxp qxpVar2 = (qxp) poyVar.b;
                            if ((qxpVar2.a & 2) != 0) {
                                long j24 = qxpVar2.c - jLongValue2;
                                if (poyVar.c) {
                                    poyVar.m();
                                    poyVar.c = false;
                                }
                                qxp qxpVar3 = (qxp) poyVar.b;
                                qxpVar3.a |= 2;
                                qxpVar3.c = j24;
                            }
                            qxp qxpVar4 = (qxp) poyVar.b;
                            if ((qxpVar4.a & 4) != 0) {
                                long j25 = qxpVar4.d - jLongValue2;
                                if (poyVar.c) {
                                    poyVar.m();
                                    poyVar.c = false;
                                }
                                qxp qxpVar5 = (qxp) poyVar.b;
                                qxpVar5.a |= 4;
                                qxpVar5.d = j25;
                            }
                            qxp qxpVar6 = (qxp) poyVar.b;
                            if ((qxpVar6.a & 8) != 0) {
                                long j26 = qxpVar6.e - jLongValue2;
                                if (poyVar.c) {
                                    poyVar.m();
                                    poyVar.c = false;
                                }
                                qxp qxpVar7 = (qxp) poyVar.b;
                                qxpVar7.a |= 8;
                                qxpVar7.e = j26;
                            }
                            qxp qxpVar8 = (qxp) poyVar.j();
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar39 = (qxr) poyVarM.b;
                            qxpVar8.getClass();
                            qxrVar39.s = qxpVar8;
                            qxrVar39.a |= 262144;
                        }
                        qxr qxrVar40 = (qxr) poyVarM.b;
                        if ((qxrVar40.a & 524288) != 0) {
                            qxp qxpVar9 = qxrVar40.t;
                            if (qxpVar9 == null) {
                                qxpVar9 = qxp.f;
                            }
                            poy poyVar2 = (poy) qxpVar9.G(5);
                            poyVar2.o(qxpVar9);
                            qxp qxpVar10 = (qxp) poyVar2.b;
                            if ((qxpVar10.a & 2) != 0) {
                                long j27 = qxpVar10.c - jLongValue2;
                                if (poyVar2.c) {
                                    poyVar2.m();
                                    poyVar2.c = false;
                                }
                                qxp qxpVar11 = (qxp) poyVar2.b;
                                qxpVar11.a |= 2;
                                qxpVar11.c = j27;
                            }
                            qxp qxpVar12 = (qxp) poyVar2.b;
                            if ((qxpVar12.a & 4) != 0) {
                                long j28 = qxpVar12.d - jLongValue2;
                                if (poyVar2.c) {
                                    poyVar2.m();
                                    poyVar2.c = false;
                                }
                                qxp qxpVar13 = (qxp) poyVar2.b;
                                qxpVar13.a |= 4;
                                qxpVar13.d = j28;
                            }
                            qxp qxpVar14 = (qxp) poyVar2.b;
                            if ((qxpVar14.a & 8) != 0) {
                                long j29 = qxpVar14.e - jLongValue2;
                                if (poyVar2.c) {
                                    poyVar2.m();
                                    poyVar2.c = false;
                                }
                                qxp qxpVar15 = (qxp) poyVar2.b;
                                qxpVar15.a |= 8;
                                qxpVar15.e = j29;
                            }
                            qxp qxpVar16 = (qxp) poyVar2.j();
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar41 = (qxr) poyVarM.b;
                            qxpVar16.getClass();
                            qxrVar41.t = qxpVar16;
                            qxrVar41.a |= 524288;
                        }
                        qxr qxrVar42 = (qxr) poyVarM.b;
                        if ((qxrVar42.a & 4) != 0) {
                            long j30 = qxrVar42.d - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar43 = (qxr) poyVarM.b;
                            qxrVar43.a |= 4;
                            qxrVar43.d = j30;
                        }
                        qxr qxrVar44 = (qxr) poyVarM.b;
                        if ((qxrVar44.a & 2) != 0) {
                            long j31 = qxrVar44.c - jLongValue2;
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qxr qxrVar45 = (qxr) poyVarM.b;
                            qxrVar45.a |= 2;
                            qxrVar45.c = j31;
                        }
                    }
                    mul mulVar = navVar.k;
                    if (this.e.getAndSet(true)) {
                        pht phtVar = phq.a;
                    } else {
                        final nay nayVar = (nay) this.b.get();
                        plk.aa(new pgj() { // from class: nax
                            @Override // defpackage.pgj
                            public final pht a() {
                                int iF;
                                final nay nayVar2 = nayVar;
                                final poy poyVar3 = poyVarM;
                                if (!nayVar2.b.c(null)) {
                                    return phq.a;
                                }
                                int iF2 = qno.F(((qxr) poyVar3.b).r);
                                if (((iF2 != 0 && iF2 == 3) || ((iF = qno.F(((qxr) poyVar3.b).r)) != 0 && iF == 2)) && (((qxr) poyVar3.b).a & 16) == 0) {
                                    return phq.a;
                                }
                                nal nalVar = (nal) nayVar2.c.get();
                                ojc ojcVar = nalVar.b;
                                final pht phtVarV = plk.V(oih.a);
                                ojc ojcVar2 = nalVar.a;
                                final pht phtVarV2 = plk.V(oih.a);
                                return plk.P(phtVarV, phtVarV2).b(new pgj() { // from class: naw
                                    @Override // defpackage.pgj
                                    public final pht a() {
                                        nay nayVar3 = nayVar2;
                                        poy poyVar4 = poyVar3;
                                        pht phtVar2 = phtVarV;
                                        pht phtVar3 = phtVarV2;
                                        try {
                                            Map map = (Map) ((ojc) plk.ad(phtVar2)).f();
                                            if (map != null) {
                                                long j32 = ((qxr) poyVar4.b).b;
                                                for (Map.Entry entry : map.entrySet()) {
                                                    int iIntValue = ((Integer) entry.getKey()).intValue();
                                                    long jLongValue3 = ((Long) entry.getValue()).longValue() - j32;
                                                    if (poyVar4.c) {
                                                        poyVar4.m();
                                                        poyVar4.c = false;
                                                    }
                                                    qxr qxrVar46 = (qxr) poyVar4.b;
                                                    pqh pqhVar = qxrVar46.u;
                                                    if (!pqhVar.b) {
                                                        qxrVar46.u = pqhVar.a();
                                                    }
                                                    qxrVar46.u.put(Integer.valueOf(iIntValue), Long.valueOf(jLongValue3));
                                                }
                                            }
                                        } catch (Exception e2) {
                                            ((oug) ((oug) ((oug) nay.a.c()).h(e2)).G((char) 3645)).o("Failed to get custom timestamps future");
                                        }
                                        mxl mxlVar = nayVar3.b;
                                        mxf mxfVarA = mxg.a();
                                        poy poyVarM2 = qyk.t.m();
                                        poy poyVarM3 = qxn.f.m();
                                        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                                        if (poyVarM3.c) {
                                            poyVarM3.m();
                                            poyVarM3.c = false;
                                        }
                                        qxn qxnVar = (qxn) poyVarM3.b;
                                        int i6 = qxnVar.a | 1;
                                        qxnVar.a = i6;
                                        qxnVar.b = leastSignificantBits;
                                        qxnVar.c = 2;
                                        qxnVar.a = 2 | i6;
                                        qxr qxrVar47 = (qxr) poyVar4.j();
                                        qxrVar47.getClass();
                                        qxnVar.e = qxrVar47;
                                        qxnVar.a |= 16;
                                        if (poyVarM2.c) {
                                            poyVarM2.m();
                                            poyVarM2.c = false;
                                        }
                                        qyk qykVar = (qyk) poyVarM2.b;
                                        qxn qxnVar2 = (qxn) poyVarM3.j();
                                        qxnVar2.getClass();
                                        qykVar.m = qxnVar2;
                                        qykVar.a |= 16384;
                                        mxfVarA.d((qyk) poyVarM2.j());
                                        mxfVarA.b = (qxe) ((ojc) plk.ad(phtVar3)).f();
                                        mxfVarA.c = null;
                                        mxfVarA.c(true);
                                        return mxlVar.b(mxfVarA.a());
                                    }
                                }, pgr.INSTANCE);
                            }
                        }, nayVar.d);
                    }
                }
            }
        }
    }

    @Override // defpackage.mxo
    public final void t() {
        this.a.a(this);
    }
}
