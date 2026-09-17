package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGL15;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLObjectHandle;
import android.opengl.EGLSurface;
import android.opengl.EGLSync;
import android.opengl.GLES30;
import android.opengl.GLES31;
import android.os.Process;
import android.os.health.HealthStats;
import android.util.Log;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class mwp {
    public mwp() {
    }

    public mwp(byte[] bArr) {
    }

    private static int a(byte[] bArr) {
        for (int i = 0; i < 255; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return 255;
    }

    private static String b(EGLObjectHandle eGLObjectHandle) {
        return String.format("0x%X", Long.valueOf(eGLObjectHandle.getNativeHandle()));
    }

    static mwz d(Long l, Long l2, HealthStats healthStats, qwt qwtVar, mwk mwkVar) {
        mxc mxcVar = mwkVar.a;
        poy poyVarM = qxd.an.m();
        long jA = myq.a(healthStats, 10001);
        if (jA != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar = (qxd) poyVarM.b;
            qxdVar.a |= 1;
            qxdVar.c = jA;
        }
        long jA2 = myq.a(healthStats, 10002);
        if (jA2 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar2 = (qxd) poyVarM.b;
            qxdVar2.a |= 2;
            qxdVar2.d = jA2;
        }
        long jA3 = myq.a(healthStats, 10003);
        if (jA3 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar3 = (qxd) poyVarM.b;
            qxdVar3.a |= 4;
            qxdVar3.e = jA3;
        }
        long jA4 = myq.a(healthStats, 10004);
        if (jA4 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar4 = (qxd) poyVarM.b;
            qxdVar4.a |= 8;
            qxdVar4.f = jA4;
        }
        poyVarM.X(myq.b(healthStats, 10005));
        poyVarM.Y(myq.b(healthStats, 10006));
        poyVarM.Z(myq.b(healthStats, 10007));
        poyVarM.W(myq.b(healthStats, 10008));
        poyVarM.V(myq.b(healthStats, 10009));
        poyVarM.R(myq.b(healthStats, 10010));
        qxc qxcVarF = myq.f(healthStats, 10011);
        if (qxcVarF != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar5 = (qxd) poyVarM.b;
            qxdVar5.m = qxcVarF;
            qxdVar5.a |= 16;
        }
        poyVarM.S(myq.b(healthStats, 10012));
        poyVarM.U(mwv.a.d(myq.d(healthStats, 10014)));
        poyVarM.T(mwu.a.d(myq.d(healthStats, 10015)));
        long jA5 = myq.a(healthStats, 10016);
        if (jA5 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar6 = (qxd) poyVarM.b;
            qxdVar6.a |= 32;
            qxdVar6.r = jA5;
        }
        long jA6 = myq.a(healthStats, 10017);
        if (jA6 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar7 = (qxd) poyVarM.b;
            qxdVar7.a |= 64;
            qxdVar7.s = jA6;
        }
        long jA7 = myq.a(healthStats, 10018);
        if (jA7 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar8 = (qxd) poyVarM.b;
            qxdVar8.a |= 128;
            qxdVar8.t = jA7;
        }
        long jA8 = myq.a(healthStats, 10019);
        if (jA8 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar9 = (qxd) poyVarM.b;
            qxdVar9.a |= 256;
            qxdVar9.u = jA8;
        }
        long jA9 = myq.a(healthStats, 10020);
        if (jA9 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar10 = (qxd) poyVarM.b;
            qxdVar10.a |= 512;
            qxdVar10.v = jA9;
        }
        long jA10 = myq.a(healthStats, 10021);
        if (jA10 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar11 = (qxd) poyVarM.b;
            qxdVar11.a |= 1024;
            qxdVar11.w = jA10;
        }
        long jA11 = myq.a(healthStats, 10022);
        if (jA11 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar12 = (qxd) poyVarM.b;
            qxdVar12.a |= 2048;
            qxdVar12.x = jA11;
        }
        long jA12 = myq.a(healthStats, 10023);
        if (jA12 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar13 = (qxd) poyVarM.b;
            qxdVar13.a |= 4096;
            qxdVar13.y = jA12;
        }
        long jA13 = myq.a(healthStats, 10024);
        if (jA13 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar14 = (qxd) poyVarM.b;
            qxdVar14.a |= 8192;
            qxdVar14.z = jA13;
        }
        long jA14 = myq.a(healthStats, 10025);
        if (jA14 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar15 = (qxd) poyVarM.b;
            qxdVar15.a |= 16384;
            qxdVar15.A = jA14;
        }
        long jA15 = myq.a(healthStats, 10026);
        if (jA15 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar16 = (qxd) poyVarM.b;
            qxdVar16.a |= 32768;
            qxdVar16.B = jA15;
        }
        long jA16 = myq.a(healthStats, 10027);
        if (jA16 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar17 = (qxd) poyVarM.b;
            qxdVar17.a |= 65536;
            qxdVar17.C = jA16;
        }
        long jA17 = myq.a(healthStats, 10028);
        if (jA17 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar18 = (qxd) poyVarM.b;
            qxdVar18.a |= 131072;
            qxdVar18.D = jA17;
        }
        long jA18 = myq.a(healthStats, 10029);
        if (jA18 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar19 = (qxd) poyVarM.b;
            qxdVar19.a |= 262144;
            qxdVar19.E = jA18;
        }
        qxc qxcVarF2 = myq.f(healthStats, 10030);
        if (qxcVarF2 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar20 = (qxd) poyVarM.b;
            qxdVar20.F = qxcVarF2;
            qxdVar20.a |= 524288;
        }
        long jA19 = myq.a(healthStats, 10031);
        if (jA19 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar21 = (qxd) poyVarM.b;
            qxdVar21.a |= 1048576;
            qxdVar21.G = jA19;
        }
        qxc qxcVarF3 = myq.f(healthStats, 10032);
        if (qxcVarF3 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar22 = (qxd) poyVarM.b;
            qxdVar22.H = qxcVarF3;
            qxdVar22.a |= 2097152;
        }
        qxc qxcVarF4 = myq.f(healthStats, 10033);
        if (qxcVarF4 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar23 = (qxd) poyVarM.b;
            qxdVar23.I = qxcVarF4;
            qxdVar23.a |= 4194304;
        }
        qxc qxcVarF5 = myq.f(healthStats, 10034);
        if (qxcVarF5 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar24 = (qxd) poyVarM.b;
            qxdVar24.J = qxcVarF5;
            qxdVar24.a |= 8388608;
        }
        qxc qxcVarF6 = myq.f(healthStats, 10035);
        if (qxcVarF6 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar25 = (qxd) poyVarM.b;
            qxdVar25.K = qxcVarF6;
            qxdVar25.a |= 16777216;
        }
        qxc qxcVarF7 = myq.f(healthStats, 10036);
        if (qxcVarF7 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar26 = (qxd) poyVarM.b;
            qxdVar26.L = qxcVarF7;
            qxdVar26.a |= 33554432;
        }
        qxc qxcVarF8 = myq.f(healthStats, 10037);
        if (qxcVarF8 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar27 = (qxd) poyVarM.b;
            qxdVar27.M = qxcVarF8;
            qxdVar27.a |= 67108864;
        }
        qxc qxcVarF9 = myq.f(healthStats, 10038);
        if (qxcVarF9 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar28 = (qxd) poyVarM.b;
            qxdVar28.N = qxcVarF9;
            qxdVar28.a |= 134217728;
        }
        qxc qxcVarF10 = myq.f(healthStats, 10039);
        if (qxcVarF10 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar29 = (qxd) poyVarM.b;
            qxdVar29.O = qxcVarF10;
            qxdVar29.a |= 268435456;
        }
        qxc qxcVarF11 = myq.f(healthStats, 10040);
        if (qxcVarF11 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar30 = (qxd) poyVarM.b;
            qxdVar30.P = qxcVarF11;
            qxdVar30.a |= 536870912;
        }
        qxc qxcVarF12 = myq.f(healthStats, 10041);
        if (qxcVarF12 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar31 = (qxd) poyVarM.b;
            qxdVar31.Q = qxcVarF12;
            qxdVar31.a |= 1073741824;
        }
        qxc qxcVarF13 = myq.f(healthStats, 10042);
        if (qxcVarF13 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar32 = (qxd) poyVarM.b;
            qxdVar32.R = qxcVarF13;
            qxdVar32.a |= Integer.MIN_VALUE;
        }
        qxc qxcVarF14 = myq.f(healthStats, 10043);
        if (qxcVarF14 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar33 = (qxd) poyVarM.b;
            qxdVar33.S = qxcVarF14;
            qxdVar33.b |= 1;
        }
        qxc qxcVarF15 = myq.f(healthStats, 10044);
        if (qxcVarF15 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar34 = (qxd) poyVarM.b;
            qxdVar34.T = qxcVarF15;
            qxdVar34.b |= 2;
        }
        long jA20 = myq.a(healthStats, 10045);
        if (jA20 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar35 = (qxd) poyVarM.b;
            qxdVar35.b |= 4;
            qxdVar35.U = jA20;
        }
        long jA21 = myq.a(healthStats, 10046);
        if (jA21 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar36 = (qxd) poyVarM.b;
            qxdVar36.b |= 8;
            qxdVar36.V = jA21;
        }
        long jA22 = myq.a(healthStats, 10047);
        if (jA22 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar37 = (qxd) poyVarM.b;
            qxdVar37.b |= 16;
            qxdVar37.W = jA22;
        }
        long jA23 = myq.a(healthStats, 10048);
        if (jA23 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar38 = (qxd) poyVarM.b;
            qxdVar38.b |= 32;
            qxdVar38.X = jA23;
        }
        long jA24 = myq.a(healthStats, 10049);
        if (jA24 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar39 = (qxd) poyVarM.b;
            qxdVar39.b |= 64;
            qxdVar39.Y = jA24;
        }
        long jA25 = myq.a(healthStats, 10050);
        if (jA25 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar40 = (qxd) poyVarM.b;
            qxdVar40.b |= 128;
            qxdVar40.Z = jA25;
        }
        long jA26 = myq.a(healthStats, 10051);
        if (jA26 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar41 = (qxd) poyVarM.b;
            qxdVar41.b |= 256;
            qxdVar41.aa = jA26;
        }
        long jA27 = myq.a(healthStats, 10052);
        if (jA27 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar42 = (qxd) poyVarM.b;
            qxdVar42.b |= 512;
            qxdVar42.ab = jA27;
        }
        long jA28 = myq.a(healthStats, 10053);
        if (jA28 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar43 = (qxd) poyVarM.b;
            qxdVar43.b |= 1024;
            qxdVar43.ac = jA28;
        }
        long jA29 = myq.a(healthStats, 10054);
        if (jA29 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar44 = (qxd) poyVarM.b;
            qxdVar44.b |= 2048;
            qxdVar44.ad = jA29;
        }
        long jA30 = myq.a(healthStats, 10055);
        if (jA30 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar45 = (qxd) poyVarM.b;
            qxdVar45.b |= 4096;
            qxdVar45.ae = jA30;
        }
        long jA31 = myq.a(healthStats, 10056);
        if (jA31 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar46 = (qxd) poyVarM.b;
            qxdVar46.b |= 8192;
            qxdVar46.af = jA31;
        }
        long jA32 = myq.a(healthStats, 10057);
        if (jA32 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar47 = (qxd) poyVarM.b;
            qxdVar47.b |= 16384;
            qxdVar47.ag = jA32;
        }
        long jA33 = myq.a(healthStats, 10058);
        if (jA33 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar48 = (qxd) poyVarM.b;
            qxdVar48.b = 32768 | qxdVar48.b;
            qxdVar48.ah = jA33;
        }
        long jA34 = myq.a(healthStats, 10059);
        if (jA34 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar49 = (qxd) poyVarM.b;
            qxdVar49.b |= 65536;
            qxdVar49.ai = jA34;
        }
        qxc qxcVarF16 = myq.f(healthStats, 10061);
        if (qxcVarF16 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar50 = (qxd) poyVarM.b;
            qxdVar50.aj = qxcVarF16;
            qxdVar50.b |= 131072;
        }
        long jA35 = myq.a(healthStats, 10062);
        if (jA35 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar51 = (qxd) poyVarM.b;
            qxdVar51.b = 262144 | qxdVar51.b;
            qxdVar51.ak = jA35;
        }
        long jA36 = myq.a(healthStats, 10063);
        if (jA36 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar52 = (qxd) poyVarM.b;
            qxdVar52.b |= 524288;
            qxdVar52.al = jA36;
        }
        long jA37 = myq.a(healthStats, 10064);
        if (jA37 != 0) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            qxd qxdVar53 = (qxd) poyVarM.b;
            qxdVar53.b |= 1048576;
            qxdVar53.am = jA37;
        }
        qxd qxdVar54 = (qxd) poyVarM.j();
        poy poyVar = (poy) qxdVar54.G(5);
        poyVar.o(qxdVar54);
        mws mwsVar = mxcVar.b;
        Collections.unmodifiableList(((qxd) poyVar.b).g);
        for (int i = 0; i < ((qxd) poyVar.b).g.size(); i++) {
            poyVar.aj(i, mwsVar.c(1, poyVar.K(i)));
        }
        Collections.unmodifiableList(((qxd) poyVar.b).h);
        for (int i2 = 0; i2 < ((qxd) poyVar.b).h.size(); i2++) {
            poyVar.ak(i2, mwsVar.c(1, poyVar.L(i2)));
        }
        Collections.unmodifiableList(((qxd) poyVar.b).i);
        for (int i3 = 0; i3 < ((qxd) poyVar.b).i.size(); i3++) {
            poyVar.al(i3, mwsVar.c(1, poyVar.M(i3)));
        }
        Collections.unmodifiableList(((qxd) poyVar.b).j);
        for (int i4 = 0; i4 < ((qxd) poyVar.b).j.size(); i4++) {
            poyVar.ai(i4, mwsVar.c(1, poyVar.N(i4)));
        }
        Collections.unmodifiableList(((qxd) poyVar.b).k);
        for (int i5 = 0; i5 < ((qxd) poyVar.b).k.size(); i5++) {
            poyVar.af(i5, mwsVar.c(2, poyVar.O(i5)));
        }
        Collections.unmodifiableList(((qxd) poyVar.b).l);
        for (int i6 = 0; i6 < ((qxd) poyVar.b).l.size(); i6++) {
            poyVar.ac(i6, mwsVar.c(3, poyVar.P(i6)));
        }
        Collections.unmodifiableList(((qxd) poyVar.b).n);
        for (int i7 = 0; i7 < ((qxd) poyVar.b).n.size(); i7++) {
            poyVar.ae(i7, mwsVar.c(5, poyVar.Q(i7)));
        }
        qxd qxdVar55 = (qxd) poyVar.j();
        String str = mwkVar.c;
        return new mwz(qxdVar55, l, l2, 399566260L, Long.valueOf(str != null ? str.hashCode() : 0L), qwtVar, null, null);
    }

    public static qxs e(String str, Context context) {
        poy poyVarM = qxs.f.m();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxs qxsVar = (qxs) poyVarM.b;
        qxsVar.a |= 1;
        qxsVar.b = elapsedCpuTime;
        boolean zC = mwh.c(context);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxs qxsVar2 = (qxs) poyVarM.b;
        qxsVar2.a |= 2;
        qxsVar2.c = zC;
        int iActiveCount = Thread.activeCount();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxs qxsVar3 = (qxs) poyVarM.b;
        int i = qxsVar3.a | 4;
        qxsVar3.a = i;
        qxsVar3.d = iActiveCount;
        if (str != null) {
            qxsVar3.a = i | 8;
            qxsVar3.e = str;
        }
        return (qxs) poyVarM.j();
    }

    public static mtu f(Object obj) {
        return new mty(obj);
    }

    public static mtu g(mls mlsVar) {
        return new mts(mlsVar);
    }

    public static mtd h(Executor executor) {
        return new mtb(executor);
    }

    public static void i(String str, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat.containsKey(str)) {
            mediaFormat2.setInteger(str, mediaFormat.getInteger(str));
        }
    }

    public static msd j(msr msrVar) {
        return new msh(msrVar);
    }

    public static void k(Runnable runnable, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        char c;
        int[] iArr = new int[2];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[2];
        int[] iArr6 = new int[1];
        int[] iArr7 = new int[1];
        int[] iArr8 = new int[4];
        String name = Thread.currentThread().getName();
        Thread threadCurrentThread = Thread.currentThread();
        ThreadGroup threadGroup = threadCurrentThread.getThreadGroup();
        if (threadGroup != null) {
            int iActiveCount = threadGroup.activeCount();
            int i6 = iActiveCount + iActiveCount;
            Thread[] threadArr = new Thread[i6];
            threadGroup.enumerate(threadArr, true);
            i4 = 0;
            i5 = 1;
            for (int i7 = 0; i7 < i6; i7++) {
                Thread thread = threadArr[i7];
                if (thread != null && thread.getName().equals(name)) {
                    i4++;
                }
                if (thread == threadCurrentThread) {
                    i5 = i4;
                }
            }
        } else {
            i4 = 0;
            i5 = 1;
        }
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        EGLSurface eGLSurfaceEglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        GLES30.glGetIntegerv(33307, iArr, 0);
        GLES30.glGetIntegerv(33308, iArr, 1);
        GLES30.glGetIntegerv(35725, iArr2, 0);
        GLES30.glGetIntegerv(34016, iArr3, 0);
        GLES30.glGetIntegerv(36010, iArr6, 0);
        GLES30.glGetIntegerv(36007, iArr7, 0);
        GLES30.glGetIntegerv(32873, iArr4, 0);
        GLES30.glGetIntegerv(2978, iArr8, 0);
        if (iArr4[0] != 0) {
            if (iArr[0] == 3) {
                c = 1;
                if (iArr[1] > 0) {
                    GLES31.glGetTexLevelParameteriv(3553, 0, 4096, iArr5, 0);
                    GLES31.glGetTexLevelParameteriv(3553, 0, 4097, iArr5, 1);
                }
            } else {
                c = 1;
            }
            iArr5[0] = -1;
            iArr5[c] = -1;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[25];
        objArr[0] = Integer.valueOf(iArr[0]);
        objArr[1] = Integer.valueOf(iArr[1]);
        objArr[2] = Thread.currentThread().getName();
        objArr[3] = Integer.valueOf(i5);
        objArr[4] = Integer.valueOf(i4);
        objArr[5] = Integer.valueOf(i);
        objArr[6] = runnable.toString();
        objArr[7] = eGLContextEglGetCurrentContext.equals(EGL14.EGL_NO_CONTEXT) ? "EGL_NO_CONTEXT" : b(eGLContextEglGetCurrentContext);
        objArr[8] = eGLDisplayEglGetCurrentDisplay.equals(EGL14.EGL_NO_DISPLAY) ? "EGL_NO_DISPLAY" : b(eGLDisplayEglGetCurrentDisplay);
        objArr[9] = eGLSurfaceEglGetCurrentSurface.equals(EGL14.EGL_NO_SURFACE) ? "EGL_NO_SURFACE" : b(eGLSurfaceEglGetCurrentSurface);
        objArr[10] = eGLSurfaceEglGetCurrentSurface2.equals(EGL14.EGL_NO_SURFACE) ? "EGL_NO_SURFACE" : b(eGLSurfaceEglGetCurrentSurface2);
        objArr[11] = i2 == 12288 ? "EGL_SUCCESS" : String.valueOf(i2);
        objArr[12] = i3 == 0 ? "GL_NO_ERROR" : String.valueOf(i3);
        objArr[13] = Boolean.valueOf(z);
        objArr[14] = Integer.valueOf(iArr2[0]);
        objArr[15] = Integer.valueOf(iArr3[0] - 33984);
        objArr[16] = Integer.valueOf(iArr4[0]);
        int i8 = iArr5[0];
        objArr[17] = i8 != -1 ? String.valueOf(i8) : "?";
        int i9 = iArr5[1];
        objArr[18] = i9 != -1 ? String.valueOf(i9) : "?";
        objArr[19] = Integer.valueOf(iArr6[0]);
        objArr[20] = Integer.valueOf(iArr7[0]);
        objArr[21] = Integer.valueOf(iArr8[0]);
        objArr[22] = Integer.valueOf(iArr8[1]);
        objArr[23] = Integer.valueOf(iArr8[2]);
        objArr[24] = Integer.valueOf(iArr8[3]);
        String str = String.format(locale, "\n- General EGL Status ------------------\nVersion: %d.%d\nThread: %s (%d of %d)\nCommands Executed: %d\nCommand Run: %s\nCurrent Context: %s\nCurrent Display: %s\nCurrent Read Surface: %s\nCurrent Draw Surface: %s\nEGL Error: %s\nGL Error: %s\nClosing: %b\n- GL Status ---------------------------\nBound Program: %d\nActive Texture Slot: %d\nTexture2D Binding: %d\nTexture Size: %sx%s\nFBO Binding: %d\nRenderbuffer Binding: %d\nViewport: %d,%d,%dx%d\n", objArr);
        StringBuilder sb = new StringBuilder();
        if (iArr2[0] != 0) {
            sb.append("- Program Details ---------------------\n");
            int i10 = iArr2[0];
            StringBuilder sb2 = new StringBuilder();
            int i11 = 1;
            int[] iArr9 = new int[1];
            GLES30.glGetProgramiv(i10, 35718, iArr9, 0);
            sb2.append(String.format(Locale.US, "Uni Count: %d\n", Integer.valueOf(iArr9[0])));
            int[] iArr10 = new int[1];
            GLES30.glGetProgramiv(i10, 35719, iArr10, 0);
            int i12 = 0;
            while (i12 < iArr9[0]) {
                int[] iArr11 = new int[i11];
                int[] iArr12 = new int[i11];
                int[] iArr13 = new int[i11];
                byte[] bArr = new byte[255];
                GLES30.glGetActiveUniform(i10, i12, iArr10[0], iArr11, 0, iArr12, 0, iArr13, 0, bArr, 0);
                sb2.append(String.format("Uni 0x%X %s\n", Integer.valueOf(iArr13[0]), new String(bArr, 0, a(bArr))));
                i12++;
                i11 = 1;
            }
            sb.append(sb2.toString());
            int i13 = iArr2[0];
            StringBuilder sb3 = new StringBuilder();
            int i14 = 1;
            int[] iArr14 = new int[1];
            GLES30.glGetProgramiv(i13, 35721, iArr14, 0);
            sb3.append(String.format(Locale.US, "Attrib Count: %d\n", Integer.valueOf(iArr14[0])));
            int[] iArr15 = new int[1];
            GLES30.glGetProgramiv(i13, 35722, iArr15, 0);
            int i15 = 0;
            while (i15 < iArr14[0]) {
                int[] iArr16 = new int[i14];
                int[] iArr17 = new int[i14];
                int[] iArr18 = new int[i14];
                byte[] bArr2 = new byte[255];
                GLES30.glGetActiveAttrib(i13, i15, iArr15[0], iArr16, 0, iArr17, 0, iArr18, 0, bArr2, 0);
                sb3.append(String.format("Attrib 0x%X %s\n", Integer.valueOf(iArr18[0]), new String(bArr2, 0, a(bArr2))));
                i15++;
                i14 = 1;
            }
            sb.append(sb3.toString());
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(sb.toString());
        Log.e("GLContext", strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    public static mpi l(mpi mpiVar) {
        return new mqd(mpiVar);
    }

    public static mpl m(mmt mmtVar) {
        return new mpr(mmtVar, mmtVar);
    }

    public static void n(mpi mpiVar) {
        mpiVar.e(gdr.f, oge.b);
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        EGLSync eGLSync = (EGLSync) plk.ae(plk.Z(new mpp(eGLDisplayEglGetDisplay), mpiVar));
        EGL15.eglClientWaitSync(eGLDisplayEglGetDisplay, eGLSync, 1, -1L);
        EGL15.eglDestroySync(eGLDisplayEglGetDisplay, eGLSync);
    }

    public static mov o() {
        return new mov(new mor(mmf.d(1, 1)));
    }

    public static moq p(moq moqVar, mmf mmfVar) {
        try {
            return moqVar.b(mmfVar);
        } catch (ClassCastException e) {
            throw new AssertionError("Resizable layout returns wrong type!");
        }
    }
}
