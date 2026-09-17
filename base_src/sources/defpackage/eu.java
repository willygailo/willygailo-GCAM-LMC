package defpackage;

import android.media.MediaDescription;
import android.net.Uri;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class eu {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean d(fm fmVar, KeyEvent keyEvent) {
        if (fmVar == null) {
            return false;
        }
        return fmVar.e(keyEvent);
    }

    public static final fk e(fi fiVar) {
        return new fk(new fj(fiVar.a.build()));
    }

    public static void f(ddj ddjVar, ddf ddfVar, lzi lziVar, dei deiVar) {
        ddjVar.m(dcs.e, Float.valueOf(1.3229325E7f));
        ddjVar.m(dcs.f, Float.valueOf(3.807744E7f));
        ddjVar.n(ddl.aa, "Pixel-2H19-Droidfood-Discuss@google.com");
        ddjVar.n(ddl.ab, "Pixel-2H19-Dogfood-Discuss@google.com");
        dep depVar = (dep) ddjVar;
        depVar.s(ddl.aR, true);
        depVar.s(ddl.K, lziVar.g);
        depVar.s(ddl.aV, true);
        ddjVar.l(ddl.m, -1);
        ddjVar.l(ddl.q, 60);
        depVar.s(ddl.ad, false);
        depVar.s(ddl.X, false);
        ddjVar.l(ddl.c, 2);
        ddjVar.l(ddl.d, 2);
        depVar.s(ddl.aZ, true);
        depVar.s(dde.f, true);
        depVar.s(ddd.a, true);
        depVar.s(dcu.E, true);
        depVar.s(dcu.G, true);
        depVar.s(dcu.I, true);
        depVar.s(dcu.R, true);
        depVar.s(dcu.P, true);
        depVar.s(dcu.L, true);
        depVar.s(dcu.T, true);
        depVar.s(dcu.U, true);
        depVar.s(dcu.ae, false);
        depVar.s(dcv.f, true);
        depVar.s(dcv.g, true);
        ddjVar.l(ddm.c, 2);
        ddg ddgVar = ddt.e;
        deiVar.b(dei.ENG);
        depVar.s(ddgVar, false);
        depVar.s(ddu.j, true);
        depVar.s(ddm.z, false);
        depVar.s(ddm.at, false);
        depVar.s(ddm.aj, true);
        depVar.s(ddm.ah, true);
        depVar.s(ddm.L, false);
        depVar.s(ddm.K, false);
        depVar.s(ddx.C, true);
        depVar.s(ddp.i, true);
        depVar.s(ddp.h, true);
        ddjVar.m(ddq.b, Float.valueOf(2.948064E7f));
        ddjVar.m(ddq.c, Float.valueOf(2.380845E7f));
        depVar.q(ddr.f, false);
        depVar.s(ddr.q, true);
        depVar.s(ddr.j, false);
        depVar.s(dds.O, true);
        depVar.s(dds.N, true);
        depVar.s(dds.r, true);
        depVar.s(dds.j, true);
        deiVar.b(dei.FISHFOOD);
        ddjVar.l(ddu.b, Integer.valueOf(((Integer) ddfVar.a(ddu.c).c()).intValue() * 4));
        ddjVar.l(ddu.a, 500);
        depVar.s(ddx.w, false);
        depVar.s(ddx.v, true);
        depVar.s(ddx.D, true);
        ddjVar.l(ddx.c, 2328);
        ddjVar.l(ddx.d, 1746);
        ddjVar.l(ddx.e, 2);
        depVar.s(ddy.c, true);
        ddjVar.l(ddy.a, 1);
        depVar.s(ddl.T, true);
        depVar.s(ddl.V, true);
        depVar.s(deh.a, false);
        depVar.s(ddm.ar, true);
        depVar.s(dcy.c, true);
        depVar.s(ddn.b, false);
    }

    public static void g(ddj ddjVar, ddf ddfVar, lzi lziVar, dei deiVar, hwx hwxVar) {
        ddjVar.m(dcs.e, Float.valueOf(1.3229325E7f));
        ddjVar.m(dcs.f, Float.valueOf(3.807744E7f));
        dep depVar = (dep) ddjVar;
        depVar.s(ddl.aR, true);
        ddg ddgVar = ddl.K;
        boolean z = lziVar.k || lziVar.j;
        depVar.s(ddgVar, z);
        depVar.s(ddl.aV, true);
        ddjVar.l(ddl.m, -1);
        ddjVar.m(ddl.bm, Float.valueOf(1.580689f));
        depVar.s(ddl.aB, false);
        depVar.q(ddl.ag, true);
        depVar.s(ddl.X, lziVar.h());
        depVar.s(ddl.Y, true);
        depVar.s(ddl.ad, false);
        depVar.s(ddo.c, true);
        ddjVar.l(ddl.c, 2);
        ddjVar.l(ddl.d, 4);
        depVar.s(ddl.af, false);
        depVar.s(ddl.aZ, true);
        depVar.s(ddl.bu, hwxVar.b(107761451L));
        depVar.s(dde.f, true);
        ddjVar.m(dde.b, Float.valueOf(1.0f));
        depVar.s(dcz.c, true);
        depVar.s(ddd.a, true);
        depVar.s(ddd.b, true);
        depVar.s(ddd.c, true);
        depVar.s(dcu.E, true);
        depVar.s(dcu.G, true);
        depVar.s(dcu.I, true);
        depVar.s(dcu.ag, true);
        depVar.s(dcu.R, true);
        depVar.s(dcu.P, true);
        depVar.s(dcu.L, true);
        depVar.s(dcu.T, true);
        depVar.s(dcu.U, true);
        depVar.s(dcu.Z, false);
        ddg ddgVar2 = dcu.A;
        Float fValueOf = Float.valueOf(7.0f);
        ddjVar.m(ddgVar2, fValueOf);
        ddjVar.m(dcu.B, fValueOf);
        depVar.s(dcu.aa, false);
        ddjVar.l(ddm.b, 2);
        ddjVar.l(ddm.c, 2);
        deiVar.b(dei.FISHFOOD);
        depVar.s(ddm.as, false);
        depVar.s(ddt.e, false);
        depVar.s(ddt.f, true);
        depVar.s(ddt.g, true);
        depVar.s(ddm.aj, true);
        depVar.s(ddm.ah, true);
        depVar.s(dde.h, true);
        ddjVar.m(ddm.ac, Float.valueOf(-2.4f));
        ddjVar.m(ddm.ad, Float.valueOf(-2.3f));
        depVar.s(ddm.an, true);
        depVar.s(ddm.L, false);
        depVar.s(ddm.K, false);
        depVar.s(ddx.C, true);
        depVar.s(ddp.s, true);
        depVar.s(ddp.x, false);
        ddjVar.m(ddq.b, Float.valueOf(2.948064E7f));
        ddjVar.m(ddq.c, Float.valueOf(2.380845E7f));
        hwxVar.b(107703678L);
        depVar.q(ddr.f, false);
        depVar.s(ddr.q, true);
        depVar.s(ddr.j, false);
        depVar.s(ddr.t, true);
        depVar.s(dds.q, true);
        depVar.s(dds.O, true);
        depVar.s(dds.N, true);
        depVar.s(dds.P, false);
        depVar.s(dds.r, false);
        depVar.s(dds.i, true);
        depVar.s(dds.k, true);
        depVar.s(dds.u, true);
        depVar.s(dds.l, true);
        depVar.s(dds.g, true);
        depVar.s(dds.h, true);
        depVar.s(dds.e, true);
        depVar.s(dds.f, true);
        depVar.s(dds.G, true);
        deiVar.b(dei.FISHFOOD);
        ddjVar.l(ddu.b, Integer.valueOf(((Integer) ddfVar.a(ddu.c).c()).intValue() * (true == lziVar.k ? 5 : 4)));
        ddjVar.l(ddu.a, 300);
        depVar.s(ddu.k, false);
        depVar.s(ddu.l, true);
        int i = dct.a;
        depVar.s(ddx.w, true);
        depVar.s(ddx.v, true);
        depVar.s(ddx.D, true);
        depVar.s(ddx.E, true);
        ddjVar.l(ddx.c, 2016);
        ddjVar.l(ddx.d, 1508);
        ddjVar.l(ddx.e, 0);
        ddjVar.m(ddx.g, Float.valueOf(1.5172f));
        depVar.s(ddx.s, true);
        ddjVar.l(ddx.b, 3000);
        depVar.s(ddx.I, lziVar.k);
        depVar.s(ddx.H, lziVar.j);
        depVar.s(ddy.c, true);
        depVar.s(ddx.u, true);
        ddjVar.l(ddy.a, 1);
        depVar.s(ddl.T, true);
        depVar.s(ddl.U, lziVar.k);
        depVar.s(ddl.V, true);
        ddi ddiVar = dee.a;
        deiVar.b(dei.FISHFOOD);
        int i2 = ddb.a;
        deiVar.b(dei.FISHFOOD);
        depVar.s(ddm.ap, true);
        depVar.s(ddm.aq, true);
        depVar.s(ddm.ar, true);
        depVar.s(dcy.c, true);
        depVar.s(dcu.ac, true);
        depVar.s(dcu.ab, false);
        deiVar.b(dei.DOGFOOD);
        depVar.s(ddl.bt, deiVar.a(dei.FISHFOOD));
        deiVar.b(dei.DOGFOOD);
    }
}
