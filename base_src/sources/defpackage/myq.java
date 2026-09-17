package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import com.google.android.GoogleCameraEngR18F1.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class myq {
    public myq() {
    }

    public myq(byte[] bArr) {
    }

    public static long a(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List b(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.emptyList() : mwy.a.d(healthStats.getTimers(i));
    }

    public static Map d(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.emptyMap() : healthStats.getStats(i);
    }

    public static qwx e(String str) {
        poy poyVarM = qwx.d.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qwx qwxVar = (qwx) poyVarM.b;
        qwxVar.a |= 2;
        qwxVar.c = str;
        return (qwx) poyVarM.j();
    }

    public static qxc f(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return h(null, healthStats.getTimer(i));
    }

    public static qxc g(qxc qxcVar, qxc qxcVar2) {
        if (qxcVar == null || qxcVar2 == null) {
            return qxcVar;
        }
        int i = qxcVar.b - qxcVar2.b;
        long j = qxcVar.c - qxcVar2.c;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        poy poyVarM = qxc.e.m();
        qwx qwxVar = qxcVar.d;
        if (qwxVar == null) {
            qwxVar = qwx.d;
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxc qxcVar3 = (qxc) poyVarM.b;
        qwxVar.getClass();
        qxcVar3.d = qwxVar;
        int i2 = qxcVar3.a | 4;
        qxcVar3.a = i2;
        int i3 = i2 | 1;
        qxcVar3.a = i3;
        qxcVar3.b = i;
        qxcVar3.a = i3 | 2;
        qxcVar3.c = j;
        return (qxc) poyVarM.j();
    }

    public static qxc h(String str, TimerStat timerStat) {
        poy poyVarM = qxc.e.m();
        int count = timerStat.getCount();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxc qxcVar = (qxc) poyVarM.b;
        qxcVar.a |= 1;
        qxcVar.b = count;
        long time = timerStat.getTime();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxc qxcVar2 = (qxc) poyVarM.b;
        int i = qxcVar2.a | 2;
        qxcVar2.a = i;
        qxcVar2.c = time;
        if (qxcVar2.b < 0) {
            qxcVar2.a = i | 1;
            qxcVar2.b = 0;
        }
        if (str != null) {
            qwx qwxVarE = e(str);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxc qxcVar3 = (qxc) poyVarM.b;
            qwxVarE.getClass();
            qxcVar3.d = qwxVarE;
            qxcVar3.a |= 4;
        }
        qxc qxcVar4 = (qxc) poyVarM.b;
        if (qxcVar4.b == 0 && qxcVar4.c == 0) {
            return null;
        }
        return (qxc) poyVarM.j();
    }

    public static qxd i(qxd qxdVar, qxd qxdVar2) {
        qxc qxcVar;
        qxc qxcVar2;
        qxc qxcVar3;
        qxc qxcVar4;
        qxc qxcVar5;
        qxc qxcVar6;
        qxc qxcVar7;
        qxc qxcVar8;
        qxc qxcVar9;
        qxc qxcVar10;
        qxc qxcVar11;
        qxc qxcVar12;
        qxc qxcVar13;
        qxc qxcVar14;
        qxc qxcVar15;
        qxc qxcVar16;
        qxc qxcVar17;
        qxc qxcVar18;
        qxc qxcVar19;
        qxc qxcVar20;
        qxc qxcVar21;
        qxc qxcVar22;
        qxc qxcVar23;
        qxc qxcVar24;
        qxc qxcVar25;
        qxc qxcVar26;
        qxc qxcVar27;
        qxc qxcVar28;
        qxc qxcVar29;
        qxc qxcVar30;
        if (qxdVar == null || qxdVar2 == null) {
            return qxdVar;
        }
        poy poyVarM = qxd.an.m();
        if ((qxdVar.a & 1) != 0) {
            long j = qxdVar.c - qxdVar2.c;
            if (j != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar3 = (qxd) poyVarM.b;
                qxdVar3.a |= 1;
                qxdVar3.c = j;
            }
        }
        if ((qxdVar.a & 2) != 0) {
            long j2 = qxdVar.d - qxdVar2.d;
            if (j2 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar4 = (qxd) poyVarM.b;
                qxdVar4.a |= 2;
                qxdVar4.d = j2;
            }
        }
        if ((qxdVar.a & 4) != 0) {
            long j3 = qxdVar.e - qxdVar2.e;
            if (j3 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar5 = (qxd) poyVarM.b;
                qxdVar5.a |= 4;
                qxdVar5.e = j3;
            }
        }
        if ((qxdVar.a & 8) != 0) {
            long j4 = qxdVar.f - qxdVar2.f;
            if (j4 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar6 = (qxd) poyVarM.b;
                qxdVar6.a |= 8;
                qxdVar6.f = j4;
            }
        }
        poyVarM.X(mwy.a.e(qxdVar.g, qxdVar2.g));
        poyVarM.Y(mwy.a.e(qxdVar.h, qxdVar2.h));
        poyVarM.Z(mwy.a.e(qxdVar.i, qxdVar2.i));
        poyVarM.W(mwy.a.e(qxdVar.j, qxdVar2.j));
        poyVarM.V(mwy.a.e(qxdVar.k, qxdVar2.k));
        poyVarM.R(mwy.a.e(qxdVar.l, qxdVar2.l));
        if ((qxdVar.a & 16) != 0) {
            qxcVar = qxdVar.m;
            if (qxcVar == null) {
                qxcVar = qxc.e;
            }
        } else {
            qxcVar = null;
        }
        if ((qxdVar2.a & 16) != 0) {
            qxcVar2 = qxdVar2.m;
            if (qxcVar2 == null) {
                qxcVar2 = qxc.e;
            }
        } else {
            qxcVar2 = null;
        }
        qxc qxcVarG = g(qxcVar, qxcVar2);
        if (qxcVarG != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar7 = (qxd) poyVarM.b;
            qxdVar7.m = qxcVarG;
            qxdVar7.a |= 16;
        }
        poyVarM.S(mwy.a.e(qxdVar.n, qxdVar2.n));
        poyVarM.U(mwv.a.e(qxdVar.p, qxdVar2.p));
        poyVarM.T(mwu.a.e(qxdVar.q, qxdVar2.q));
        if ((qxdVar.a & 32) != 0) {
            long j5 = qxdVar.r - qxdVar2.r;
            if (j5 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar8 = (qxd) poyVarM.b;
                qxdVar8.a |= 32;
                qxdVar8.r = j5;
            }
        }
        if ((qxdVar.a & 64) != 0) {
            long j6 = qxdVar.s - qxdVar2.s;
            if (j6 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar9 = (qxd) poyVarM.b;
                qxdVar9.a |= 64;
                qxdVar9.s = j6;
            }
        }
        if ((qxdVar.a & 128) != 0) {
            long j7 = qxdVar.t - qxdVar2.t;
            if (j7 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar10 = (qxd) poyVarM.b;
                qxdVar10.a |= 128;
                qxdVar10.t = j7;
            }
        }
        if ((qxdVar.a & 256) != 0) {
            long j8 = qxdVar.u - qxdVar2.u;
            if (j8 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar11 = (qxd) poyVarM.b;
                qxdVar11.a |= 256;
                qxdVar11.u = j8;
            }
        }
        if ((qxdVar.a & 512) != 0) {
            long j9 = qxdVar.v - qxdVar2.v;
            if (j9 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar12 = (qxd) poyVarM.b;
                qxdVar12.a |= 512;
                qxdVar12.v = j9;
            }
        }
        if ((qxdVar.a & 1024) != 0) {
            long j10 = qxdVar.w - qxdVar2.w;
            if (j10 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar13 = (qxd) poyVarM.b;
                qxdVar13.a |= 1024;
                qxdVar13.w = j10;
            }
        }
        if ((qxdVar.a & 2048) != 0) {
            long j11 = qxdVar.x - qxdVar2.x;
            if (j11 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).O(j11);
            }
        }
        if ((qxdVar.a & 4096) != 0) {
            long j12 = qxdVar.y - qxdVar2.y;
            if (j12 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).P(j12);
            }
        }
        if ((qxdVar.a & 8192) != 0) {
            long j13 = qxdVar.z - qxdVar2.z;
            if (j13 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).Q(j13);
            }
        }
        if ((qxdVar.a & 16384) != 0) {
            long j14 = qxdVar.A - qxdVar2.A;
            if (j14 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).R(j14);
            }
        }
        if ((qxdVar.a & 32768) != 0) {
            long j15 = qxdVar.B - qxdVar2.B;
            if (j15 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).S(j15);
            }
        }
        if ((qxdVar.a & 65536) != 0) {
            long j16 = qxdVar.C - qxdVar2.C;
            if (j16 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).T(j16);
            }
        }
        if ((qxdVar.a & 131072) != 0) {
            long j17 = qxdVar.D - qxdVar2.D;
            if (j17 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).U(j17);
            }
        }
        if ((qxdVar.a & 262144) != 0) {
            long j18 = qxdVar.E - qxdVar2.E;
            if (j18 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).V(j18);
            }
        }
        if ((qxdVar.a & 524288) != 0) {
            qxcVar3 = qxdVar.F;
            if (qxcVar3 == null) {
                qxcVar3 = qxc.e;
            }
        } else {
            qxcVar3 = null;
        }
        if ((524288 & qxdVar2.a) != 0) {
            qxcVar4 = qxdVar2.F;
            if (qxcVar4 == null) {
                qxcVar4 = qxc.e;
            }
        } else {
            qxcVar4 = null;
        }
        qxc qxcVarG2 = g(qxcVar3, qxcVar4);
        if (qxcVarG2 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).W(qxcVarG2);
        }
        if ((qxdVar.a & 1048576) != 0) {
            long j19 = qxdVar.G - qxdVar2.G;
            if (j19 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).X(j19);
            }
        }
        if ((qxdVar.a & 2097152) != 0) {
            qxcVar5 = qxdVar.H;
            if (qxcVar5 == null) {
                qxcVar5 = qxc.e;
            }
        } else {
            qxcVar5 = null;
        }
        if ((2097152 & qxdVar2.a) != 0) {
            qxcVar6 = qxdVar2.H;
            if (qxcVar6 == null) {
                qxcVar6 = qxc.e;
            }
        } else {
            qxcVar6 = null;
        }
        qxc qxcVarG3 = g(qxcVar5, qxcVar6);
        if (qxcVarG3 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).Y(qxcVarG3);
        }
        if ((qxdVar.a & 4194304) != 0) {
            qxcVar7 = qxdVar.I;
            if (qxcVar7 == null) {
                qxcVar7 = qxc.e;
            }
        } else {
            qxcVar7 = null;
        }
        if ((qxdVar2.a & 4194304) != 0) {
            qxcVar8 = qxdVar2.I;
            if (qxcVar8 == null) {
                qxcVar8 = qxc.e;
            }
        } else {
            qxcVar8 = null;
        }
        qxc qxcVarG4 = g(qxcVar7, qxcVar8);
        if (qxcVarG4 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).Z(qxcVarG4);
        }
        if ((qxdVar.a & 8388608) != 0) {
            qxcVar9 = qxdVar.J;
            if (qxcVar9 == null) {
                qxcVar9 = qxc.e;
            }
        } else {
            qxcVar9 = null;
        }
        if ((qxdVar2.a & 8388608) != 0) {
            qxcVar10 = qxdVar2.J;
            if (qxcVar10 == null) {
                qxcVar10 = qxc.e;
            }
        } else {
            qxcVar10 = null;
        }
        qxc qxcVarG5 = g(qxcVar9, qxcVar10);
        if (qxcVarG5 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).aa(qxcVarG5);
        }
        if ((qxdVar.a & 16777216) != 0) {
            qxcVar11 = qxdVar.K;
            if (qxcVar11 == null) {
                qxcVar11 = qxc.e;
            }
        } else {
            qxcVar11 = null;
        }
        if ((qxdVar2.a & 16777216) != 0) {
            qxcVar12 = qxdVar2.K;
            if (qxcVar12 == null) {
                qxcVar12 = qxc.e;
            }
        } else {
            qxcVar12 = null;
        }
        qxc qxcVarG6 = g(qxcVar11, qxcVar12);
        if (qxcVarG6 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).ab(qxcVarG6);
        }
        if ((qxdVar.a & 33554432) != 0) {
            qxcVar13 = qxdVar.L;
            if (qxcVar13 == null) {
                qxcVar13 = qxc.e;
            }
        } else {
            qxcVar13 = null;
        }
        if ((qxdVar2.a & 33554432) != 0) {
            qxcVar14 = qxdVar2.L;
            if (qxcVar14 == null) {
                qxcVar14 = qxc.e;
            }
        } else {
            qxcVar14 = null;
        }
        qxc qxcVarG7 = g(qxcVar13, qxcVar14);
        if (qxcVarG7 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).ac(qxcVarG7);
        }
        if ((qxdVar.a & 67108864) != 0) {
            qxcVar15 = qxdVar.M;
            if (qxcVar15 == null) {
                qxcVar15 = qxc.e;
            }
        } else {
            qxcVar15 = null;
        }
        if ((qxdVar2.a & 67108864) != 0) {
            qxcVar16 = qxdVar2.M;
            if (qxcVar16 == null) {
                qxcVar16 = qxc.e;
            }
        } else {
            qxcVar16 = null;
        }
        qxc qxcVarG8 = g(qxcVar15, qxcVar16);
        if (qxcVarG8 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).ad(qxcVarG8);
        }
        if ((qxdVar.a & 134217728) != 0) {
            qxcVar17 = qxdVar.N;
            if (qxcVar17 == null) {
                qxcVar17 = qxc.e;
            }
        } else {
            qxcVar17 = null;
        }
        if ((qxdVar2.a & 134217728) != 0) {
            qxcVar18 = qxdVar2.N;
            if (qxcVar18 == null) {
                qxcVar18 = qxc.e;
            }
        } else {
            qxcVar18 = null;
        }
        qxc qxcVarG9 = g(qxcVar17, qxcVar18);
        if (qxcVarG9 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).ae(qxcVarG9);
        }
        if ((qxdVar.a & 268435456) != 0) {
            qxcVar19 = qxdVar.O;
            if (qxcVar19 == null) {
                qxcVar19 = qxc.e;
            }
        } else {
            qxcVar19 = null;
        }
        if ((qxdVar2.a & 268435456) != 0) {
            qxcVar20 = qxdVar2.O;
            if (qxcVar20 == null) {
                qxcVar20 = qxc.e;
            }
        } else {
            qxcVar20 = null;
        }
        qxc qxcVarG10 = g(qxcVar19, qxcVar20);
        if (qxcVarG10 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).af(qxcVarG10);
        }
        if ((qxdVar.a & 536870912) != 0) {
            qxcVar21 = qxdVar.P;
            if (qxcVar21 == null) {
                qxcVar21 = qxc.e;
            }
        } else {
            qxcVar21 = null;
        }
        if ((qxdVar2.a & 536870912) != 0) {
            qxcVar22 = qxdVar2.P;
            if (qxcVar22 == null) {
                qxcVar22 = qxc.e;
            }
        } else {
            qxcVar22 = null;
        }
        qxc qxcVarG11 = g(qxcVar21, qxcVar22);
        if (qxcVarG11 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).ag(qxcVarG11);
        }
        if ((qxdVar.a & 1073741824) != 0) {
            qxcVar23 = qxdVar.Q;
            if (qxcVar23 == null) {
                qxcVar23 = qxc.e;
            }
        } else {
            qxcVar23 = null;
        }
        if ((qxdVar2.a & 1073741824) != 0) {
            qxcVar24 = qxdVar2.Q;
            if (qxcVar24 == null) {
                qxcVar24 = qxc.e;
            }
        } else {
            qxcVar24 = null;
        }
        qxc qxcVarG12 = g(qxcVar23, qxcVar24);
        if (qxcVarG12 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).ah(qxcVarG12);
        }
        if ((qxdVar.a & Integer.MIN_VALUE) != 0) {
            qxcVar25 = qxdVar.R;
            if (qxcVar25 == null) {
                qxcVar25 = qxc.e;
            }
        } else {
            qxcVar25 = null;
        }
        if ((qxdVar2.a & Integer.MIN_VALUE) != 0) {
            qxcVar26 = qxdVar2.R;
            if (qxcVar26 == null) {
                qxcVar26 = qxc.e;
            }
        } else {
            qxcVar26 = null;
        }
        qxc qxcVarG13 = g(qxcVar25, qxcVar26);
        if (qxcVarG13 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).ai(qxcVarG13);
        }
        if ((qxdVar.b & 1) != 0) {
            qxcVar27 = qxdVar.S;
            if (qxcVar27 == null) {
                qxcVar27 = qxc.e;
            }
        } else {
            qxcVar27 = null;
        }
        if ((qxdVar2.b & 1) != 0) {
            qxcVar28 = qxdVar2.S;
            if (qxcVar28 == null) {
                qxcVar28 = qxc.e;
            }
        } else {
            qxcVar28 = null;
        }
        qxc qxcVarG14 = g(qxcVar27, qxcVar28);
        if (qxcVarG14 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).aj(qxcVarG14);
        }
        if ((qxdVar.b & 2) != 0) {
            qxcVar29 = qxdVar.T;
            if (qxcVar29 == null) {
                qxcVar29 = qxc.e;
            }
        } else {
            qxcVar29 = null;
        }
        if ((qxdVar2.b & 2) != 0) {
            qxcVar30 = qxdVar2.T;
            if (qxcVar30 == null) {
                qxcVar30 = qxc.e;
            }
        } else {
            qxcVar30 = null;
        }
        qxc qxcVarG15 = g(qxcVar29, qxcVar30);
        if (qxcVarG15 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ((qxd) poyVarM.b).ak(qxcVarG15);
        }
        if ((qxdVar.b & 4) != 0) {
            long j20 = qxdVar.U - qxdVar2.U;
            if (j20 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).al(j20);
            }
        }
        if ((qxdVar.b & 8) != 0) {
            long j21 = qxdVar.V - qxdVar2.V;
            if (j21 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).am(j21);
            }
        }
        if ((qxdVar.b & 16) != 0) {
            long j22 = qxdVar.W - qxdVar2.W;
            if (j22 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).an(j22);
            }
        }
        if ((qxdVar.b & 32) != 0) {
            long j23 = qxdVar.X - qxdVar2.X;
            if (j23 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).ao(j23);
            }
        }
        if ((qxdVar.b & 64) != 0) {
            long j24 = qxdVar.Y - qxdVar2.Y;
            if (j24 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).ap(j24);
            }
        }
        if ((qxdVar.b & 128) != 0) {
            long j25 = qxdVar.Z - qxdVar2.Z;
            if (j25 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).aq(j25);
            }
        }
        if ((qxdVar.b & 256) != 0) {
            long j26 = qxdVar.aa - qxdVar2.aa;
            if (j26 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).ar(j26);
            }
        }
        if ((qxdVar.b & 512) != 0) {
            long j27 = qxdVar.ab - qxdVar2.ab;
            if (j27 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).as(j27);
            }
        }
        if ((qxdVar.b & 1024) != 0) {
            long j28 = qxdVar.ac - qxdVar2.ac;
            if (j28 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).at(j28);
            }
        }
        if ((qxdVar.b & 2048) != 0) {
            long j29 = qxdVar.ad - qxdVar2.ad;
            if (j29 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ((qxd) poyVarM.b).au(j29);
            }
        }
        if ((qxdVar.b & 4096) != 0) {
            long j30 = qxdVar.ae - qxdVar2.ae;
            if (j30 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar14 = (qxd) poyVarM.b;
                qxdVar14.b |= 4096;
                qxdVar14.ae = j30;
            }
        }
        if ((qxdVar.b & 8192) != 0) {
            long j31 = qxdVar.af - qxdVar2.af;
            if (j31 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar15 = (qxd) poyVarM.b;
                qxdVar15.b |= 8192;
                qxdVar15.af = j31;
            }
        }
        if ((qxdVar.b & 16384) != 0) {
            long j32 = qxdVar.ag - qxdVar2.ag;
            if (j32 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar16 = (qxd) poyVarM.b;
                qxdVar16.b |= 16384;
                qxdVar16.ag = j32;
            }
        }
        if ((qxdVar.b & 32768) != 0) {
            long j33 = qxdVar.ah - qxdVar2.ah;
            if (j33 != 0) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                qxd qxdVar17 = (qxd) poyVarM.b;
                qxdVar17.b |= 32768;
                qxdVar17.ah = j33;
            }
        }
        if ((qxdVar.b & 65536) != 0) {
            long j34 = qxdVar.ai - qxdVar2.ai;
            if (j34 != 0) {
                poyVarM.aa(j34);
            }
        }
        qxc qxcVarG16 = g(qxdVar.av() ? qxdVar.aw() : null, qxdVar2.av() ? qxdVar2.aw() : null);
        if (qxcVarG16 != null) {
            poyVarM.ad(qxcVarG16);
        }
        if (qxdVar.ax()) {
            long j35 = qxdVar.ak - qxdVar2.ak;
            if (j35 != 0) {
                poyVarM.ah(j35);
            }
        }
        if (qxdVar.ay()) {
            long j36 = qxdVar.al - qxdVar2.al;
            if (j36 != 0) {
                poyVarM.ag(j36);
            }
        }
        if (qxdVar.az()) {
            long j37 = qxdVar.am - qxdVar2.am;
            if (j37 != 0) {
                poyVarM.ab(j37);
            }
        }
        qxd qxdVar18 = (qxd) poyVarM.j();
        if (m(qxdVar18)) {
            return null;
        }
        return qxdVar18;
    }

    public static boolean j(qwy qwyVar) {
        return qwyVar == null || (qwyVar.b.size() == 0 && qwyVar.c.size() == 0);
    }

    public static boolean k(qxa qxaVar) {
        if (qxaVar != null) {
            return qxaVar.b <= 0 && qxaVar.c <= 0 && qxaVar.d <= 0 && qxaVar.e <= 0 && qxaVar.f <= 0 && qxaVar.g <= 0;
        }
        return true;
    }

    public static boolean l(qxb qxbVar) {
        return qxbVar == null || (((long) qxbVar.b) <= 0 && ((long) qxbVar.c) <= 0);
    }

    static boolean m(qxd qxdVar) {
        if (qxdVar != null) {
            return qxdVar.c <= 0 && qxdVar.d <= 0 && qxdVar.e <= 0 && qxdVar.f <= 0 && qxdVar.g.size() == 0 && qxdVar.h.size() == 0 && qxdVar.i.size() == 0 && qxdVar.j.size() == 0 && qxdVar.k.size() == 0 && qxdVar.l.size() == 0 && qxdVar.n.size() == 0 && qxdVar.o.size() == 0 && qxdVar.p.size() == 0 && qxdVar.q.size() == 0 && qxdVar.r <= 0 && qxdVar.s <= 0 && qxdVar.t <= 0 && qxdVar.u <= 0 && qxdVar.v <= 0 && qxdVar.w <= 0 && qxdVar.x <= 0 && qxdVar.y <= 0 && qxdVar.z <= 0 && qxdVar.A <= 0 && qxdVar.B <= 0 && qxdVar.C <= 0 && qxdVar.D <= 0 && qxdVar.E <= 0 && qxdVar.G <= 0 && qxdVar.U <= 0 && qxdVar.V <= 0 && qxdVar.W <= 0 && qxdVar.X <= 0 && qxdVar.Y <= 0 && qxdVar.Z <= 0 && qxdVar.aa <= 0 && qxdVar.ab <= 0 && qxdVar.ac <= 0 && qxdVar.ad <= 0 && qxdVar.ae <= 0 && qxdVar.af <= 0 && qxdVar.ag <= 0 && qxdVar.ah <= 0 && qxdVar.ai <= 0 && qxdVar.ak <= 0 && qxdVar.al <= 0 && qxdVar.am <= 0;
        }
        return true;
    }

    public static String n(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int i2 = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static String o(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return n(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_102))), j, i);
    }

    public static Object p(Callable callable) throws IOException {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static int q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    public static int r(int i) {
        return i - 1;
    }
}
