package defpackage;

import MC.Device;
import MC.hsld;
import android.content.SharedPreferences;
import com.C10tpro;
import com.C12tpro;
import com.Fix.Pref;
import com.Fog;
import com.G780G;
import com.M52;
import com.Mi11Ultra;
import com.Mi12Ultra;
import com.Nokia;
import com.OnePlus;
import com.OnePlus7;
import com.OnePlus9;
import com.OppoVivoRealme;
import com.RMX3085;
import com.RN8P;
import com.Realme9;
import com.Samsungs22Exynos;
import com.Samsungs22UExynos;
import com.Samsungs22USnapdragon;
import com.Samsungs23U;
import com.Tucana;
import com.VIVO;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.camera.experimental2017.ExperimentalKeys;
import com.isDefaults;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dep implements ddf, ddk, ddj {
    public static final dei a = dei.RELEASE;
    public static den d;
    private static Integer design;
    public static dep sh;
    public final Map b = new HashMap();
    private final den c;

    /* JADX WARN: Code duplicated, block: B:12:0x009c  */
    /* JADX WARN: Code duplicated, block: B:15:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:6:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x0088  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34, types: [boolean, float] */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    public dep(lzi lziVar, lzh lzhVar, hwx hwxVar, den denVar) {
        Integer numValueOf;
        this.c = denVar;
        sh = this;
        d = denVar;
        dei deiVar = a;
        ddl.a(this, lzhVar, deiVar);
        p(dcs.b);
        int i = 1;
        p(dcs.d);
        ddg ddgVar = dcs.e;
        Float fValueOf = Float.valueOf(Float.POSITIVE_INFINITY);
        r(ddgVar, fValueOf);
        r(dcs.f, fValueOf);
        o(dcs.a, 15000);
        int i2 = dct.a;
        dcu.a(this, lzhVar);
        dcv.a(this);
        o(dcy.b, 0);
        s(dcs.c, false);
        s(dcy.c, false);
        s(dcy.cd, false);
        switch (Pref.MenuValue("pref_design_key")) {
            case 0:
            default:
                if (lziVar.f) {
                    ddi ddiVar = dcy.a;
                    numValueOf = Integer.valueOf(dcx.P20S5.ordinal());
                    o(ddiVar, numValueOf);
                } else if (lziVar.h) {
                    ddi ddiVar2 = dcy.a;
                    numValueOf = Integer.valueOf(dcx.P20B5.ordinal());
                    o(ddiVar2, numValueOf);
                } else if (lziVar.g) {
                    ddi ddiVar3 = dcy.a;
                    numValueOf = Integer.valueOf(dcx.P20R3.ordinal());
                    o(ddiVar3, numValueOf);
                } else if (lziVar.i) {
                    ddi ddiVar4 = dcy.a;
                    numValueOf = Integer.valueOf(dcx.P21B9.ordinal());
                    o(ddiVar4, numValueOf);
                } else if (lziVar.j) {
                    ddi ddiVar5 = dcy.a;
                    numValueOf = Integer.valueOf(dcx.P21O6.ordinal());
                    o(ddiVar5, numValueOf);
                } else if (!lziVar.k) {
                    ddi ddiVar6 = dcy.a;
                    numValueOf = Integer.valueOf(dcx.NONE.ordinal());
                    o(ddiVar6, numValueOf);
                } else {
                    ddi ddiVar7 = dcy.a;
                    numValueOf = Integer.valueOf(dcx.P21R4.ordinal());
                    o(ddiVar7, numValueOf);
                }
                break;
            case 1:
                ddi ddiVar8 = dcy.a;
                numValueOf = Integer.valueOf(dcx.NONE.ordinal());
                o(ddiVar8, numValueOf);
                break;
            case 2:
                ddi ddiVar9 = dcy.a;
                numValueOf = Integer.valueOf(dcx.P20S5.ordinal());
                o(ddiVar9, numValueOf);
                break;
            case 3:
                ddi ddiVar10 = dcy.a;
                numValueOf = Integer.valueOf(dcx.P20B5.ordinal());
                o(ddiVar10, numValueOf);
                break;
            case 4:
                ddi ddiVar11 = dcy.a;
                numValueOf = Integer.valueOf(dcx.P20R3.ordinal());
                o(ddiVar11, numValueOf);
                break;
            case 5:
                ddi ddiVar12 = dcy.a;
                numValueOf = Integer.valueOf(dcx.P21B9.ordinal());
                o(ddiVar12, numValueOf);
                break;
            case 6:
                ddi ddiVar13 = dcy.a;
                numValueOf = Integer.valueOf(dcx.P21O6.ordinal());
                o(ddiVar13, numValueOf);
                break;
            case 7:
                ddi ddiVar14 = dcy.a;
                numValueOf = Integer.valueOf(dcx.P21R4.ordinal());
                o(ddiVar14, numValueOf);
                break;
        }
        design = numValueOf;
        s(dcz.a, false);
        q(dcz.b, true);
        s(dcz.c, false);
        s(dda.c, true);
        s(dda.d, true);
        s(dda.e, true);
        s(dda.f, true);
        s(dda.g, true);
        o(dda.a, 0);
        o(dda.b, 0);
        s(dda.h, true);
        s(dda.i, true);
        s(ddc.a, true);
        s(ddc.b, true);
        s(ddd.a, false);
        s(ddd.c, false);
        s(ddd.b, false);
        r(dde.a, Float.valueOf(hsld.setHDRregion()));
        r(dde.b, Float.valueOf(0.86f));
        s(dde.c, true);
        s(dde.d, true);
        s(dde.e, true);
        s(dde.f, false);
        s(dde.g, false);
        s(dde.h, false);
        r(dde.i, Float.valueOf(300.0f));
        o(ddm.a, 3);
        p(ddm.y);
        s(ddm.z, true);
        s(ddm.A, true);
        s(ddm.B, true);
        r(ddm.C, null);
        o(ddm.b, 0);
        o(ddm.c, null);
        r(ddm.G, null);
        r(ddm.H, null);
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        o(ddm.d, Integer.valueOf(Math.min(iAvailableProcessors, 2)));
        int iMin = Math.min(6, iAvailableProcessors);
        ddi ddiVar15 = ddm.e;
        Integer numValueOf2 = Integer.valueOf(iMin);
        o(ddiVar15, numValueOf2);
        o(ddm.f, numValueOf2);
        p(ddm.I);
        o(ddm.h, Integer.valueOf(hsld.setZSLFrames()));
        o(ddm.g, Integer.valueOf(hsld.setZSLFrames()));
        o(ddm.i, 15);
        p(ddm.J);
        s(ddm.K, false);
        s(ddm.L, false);
        r(ddm.M, null);
        o(ddm.k, null);
        o(ddm.j, null);
        r(ddm.N, Float.valueOf(hsld.setAEautomax()));
        s(ddm.O, false);
        s(ddm.P, false);
        s(ddm.Q, false);
        s(ddm.R, false);
        s(ddm.S, false);
        p(ddm.T);
        s(ddm.V, Pref.MenuValue("pref_temporalbin_key"));
        s(ddm.W, false);
        o(ddm.o, -1);
        s(ddm.X, Pref.MenuValue("pref_hdrnet_key"));
        s(ddm.XF, false);
        s(ddl.br, Pref.MenuValue("pref_expslideswitch_key"));
        o(ddm.p, Integer.valueOf(Pref.MenuValue("pref_vfres_key") == 0 ? 480 : 768));
        s(ddm.D, false);
        s(ddm.E, true);
        p(ddm.Y);
        o(ddm.q, Integer.valueOf(hsld.setZSLFrames()));
        o(ddm.r, 14);
        s(ddm.F, true);
        r(ddm.Z, Float.valueOf(1.0f));
        s(ddm.aa, true);
        o(ddm.m, 66);
        o(ddm.n, 166);
        r(ddm.U, Float.valueOf(0.76f));
        r(ddm.ac, Float.valueOf(-2.2f));
        r(ddm.ad, Float.valueOf(-2.0f));
        r(ddm.ae, Float.valueOf(0.0f));
        r(ddm.af, Float.valueOf(2.0f));
        r(ddm.ag, Float.valueOf(-3.0f));
        s(ddm.ah, false);
        s(ddm.aj, false);
        s(ddm.ab, true);
        o(ddm.l, 2000);
        s(ddm.am, true);
        s(ddm.an, false);
        o(ddm.w, 1500);
        s(ddm.ak, true);
        o(ddm.u, 150000);
        o(ddm.s, 15);
        o(ddm.t, 6);
        s(ddm.al, true);
        o(ddm.v, null);
        s(ddm.ao, true);
        s(ddm.ap, false);
        s(ddm.aq, false);
        o(ddm.x, 150);
        s(ddm.ar, false);
        s(ddm.ai, true);
        s(ddm.as, true);
        s(ddm.at, true);
        p(ddn.a);
        s(ddn.b, true);
        r(ddn.c, Float.valueOf(0.1f));
        r(ddn.d, Float.valueOf(50.0f));
        s(ddp.e, false);
        s(ddp.d, false);
        s(ddp.f, false);
        s(ddp.g, false);
        s(ddp.h, false);
        s(ddp.i, false);
        s(ddp.m, false);
        s(ddp.j, false);
        s(ddp.k, true);
        s(ddp.l, false);
        o(ddp.a, 0);
        s(ddp.n, false);
        s(ddp.o, false);
        o(ddp.b, 2);
        s(ddp.p, false);
        s(ddp.r, true);
        s(ddp.q, false);
        s(ddp.v, false);
        s(ddp.w, false);
        s(ddp.x, false);
        s(ddp.s, false);
        s(ddp.y, false);
        o(ddp.c, 15);
        s(ddp.z, false);
        s(ddp.t, false);
        r(ddp.u, Float.valueOf(1.5f));
        s(ddq.a, true);
        r(ddq.b, fValueOf);
        r(ddq.c, fValueOf);
        s(ddq.d, true);
        s(ddq.e, false);
        s(ddq.f, true);
        s(ddq.g, false);
        ddr.a(this, deiVar);
        s(dds.b, true);
        s(dds.c, true);
        s(dds.d, true);
        s(dds.a, true);
        s(dds.m, true);
        s(dds.e, false);
        s(dds.f, false);
        s(dds.g, false);
        s(dds.h, false);
        s(dds.i, false);
        s(dds.j, false);
        s(dds.k, false);
        s(dds.l, false);
        p(dds.p);
        s(dds.q, true);
        s(dds.u, false);
        s(dds.v, false);
        s(dds.w, true);
        s(dds.x, true);
        s(dds.y, true);
        s(dds.z, true);
        s(dds.n, false);
        s(dds.o, false);
        s(dds.A, true);
        s(dds.B, true);
        s(dds.J, true);
        s(dds.K, true);
        s(dds.L, true);
        s(dds.M, true);
        s(dds.N, false);
        s(dds.O, false);
        s(dds.P, false);
        s(dds.Q, true);
        s(dds.r, false);
        s(dds.s, false);
        s(dds.t, false);
        p(dds.R);
        s(dds.S, true);
        s(dds.C, true);
        s(dds.D, true);
        s(dds.T, true);
        s(dds.H, true);
        s(dds.G, false);
        s(dds.E, true);
        s(dds.I, true);
        s(dds.F, true);
        s(dds.U, true);
        s(dds.V, true);
        s(ddu.i, true);
        o(ddu.a, Integer.valueOf(R.styleable.AppCompatTheme_windowMinWidthMinor));
        s(ddu.j, false);
        o(ddu.c, 10);
        o(ddu.d, 48);
        o(ddu.b, Integer.valueOf(((Integer) a(ddu.c).c()).intValue() * 4));
        s(ddu.k, true);
        s(ddu.l, false);
        s(ddu.p, false);
        s(ddu.q, true);
        s(ddu.r, true);
        o(ddu.e, 0);
        p(ddu.m);
        o(ddu.f, 6);
        s(ddu.n, true);
        s(ddu.o, false);
        o(ddu.g, 2);
        o(ddu.h, 4);
        s(ddu.s, true);
        s(ddu.t, false);
        s(ddu.u, true);
        s(ddu.v, true);
        q(ddv.c, false);
        s(ddv.a, false);
        s(ddv.b, true);
        s(ddv.d, true);
        s(ddv.e, true);
        o(ddw.a, -1);
        s(ddw.b, true);
        s(ddw.c, false);
        s(ddx.f, true);
        r(ddx.g, Float.valueOf(Pref.MenuValue("pref_pzoom_key") == 0 ? 1.5f : 1.0f));
        r(ddx.h, Float.valueOf(2.0f));
        r(ddx.i, Float.valueOf(1.0f));
        o(ddx.a, 4);
        s(ddx.j, true);
        s(ddx.k, false);
        s(ddx.l, false);
        s(ddx.m, false);
        s(ddx.o, false);
        s(ddx.p, false);
        s(ddx.n, false);
        s(ddx.q, true);
        s(ddx.r, false);
        ?? r14 = Pref.MenuValue("pref_g_matting_key") != 0 ? 1 : 0;
        s(ddx.s, r14);
        s(ddx.t, false);
        s(ddx.u, false);
        s(ddx.v, false);
        s(ddx.w, false);
        s(ddx.x, true);
        s(ddx.z, true);
        s(ddx.y, true);
        s(ddx.A, true);
        s(ddx.B, false);
        s(ddx.C, false);
        s(ddx.D, true);
        s(ddx.E, false);
        s(ddx.F, true);
        o(ddx.b, 0);
        o(ddx.c, 2328);
        o(ddx.d, 1746);
        o(ddx.e, 2);
        r(ddx.G, Float.valueOf(7.0f));
        s(ddx.I, false);
        s(ddx.sh, false);
        s(ddx.H, false);
        o(ddy.a, 2);
        s(ddy.b, true);
        s(ddy.c, false);
        s(ddy.d, true);
        s(ddy.e, false);
        s(ddy.f, false);
        s(ddy.g, false);
        s(ddy.h, false);
        s(ddy.i, true);
        p(dea.a);
        r(ddz.a, Float.valueOf(500.0f));
        r(ddz.b, Float.valueOf(250.0f));
        ddg ddgVar2 = ddz.c;
        Float fValueOf2 = Float.valueOf(80.0f);
        r(ddgVar2, fValueOf2);
        r(ddz.d, fValueOf2);
        r(ddz.e, Float.valueOf(-0.3f));
        r(ddz.f, Float.valueOf(-1.0f));
        r(ddz.g, Float.valueOf((float) r14));
        r(ddz.h, Float.valueOf(-3.5f));
        ddg ddgVar3 = ddz.i;
        Float fValueOf3 = Float.valueOf(115.0f);
        r(ddgVar3, fValueOf3);
        r(ddz.j, fValueOf3);
        o(def.b, 3);
        o(def.c, 3);
        o(def.a, 3);
        o(def.f, 2);
        o(def.h, 2);
        o(def.i, 2);
        o(def.j, 3);
        o(def.d, 2);
        o(def.g, 3);
        o(def.k, 3);
        o(def.l, 3);
        o(def.m, 2);
        o(def.e, 2);
        s(deg.a, true);
        s(deg.b, false);
        s(deg.c, true);
        s(deg.d, true);
        s(deg.e, true);
        s(deg.f, true);
        s(deg.g, true);
        int i3 = ded.a;
        q(dec.b, lzhVar.e);
        o(dec.a, 5);
        int i4 = ddb.a;
        s(deh.a, false);
        s(ddt.e, false);
        s(ddt.f, false);
        s(ddt.g, false);
        s(ddt.h, false);
        o(ddt.b, 7);
        o(ddt.c, 16);
        o(ddt.d, 2);
        o(ddt.a, 3);
        o(dee.a, -1);
        o(dee.b, 3);
        o(dee.c, 0);
        o(dee.d, Integer.MAX_VALUE);
        o(ddo.a, 225);
        o(ddo.b, 5);
        r(ddo.d, Float.valueOf(1.1f));
        r(ddo.e, Float.valueOf(0.0f));
        r(ddo.f, Float.valueOf(0.5f));
        if (lziVar.c()) {
            ew.i(this, this, deiVar);
        } else if (lziVar.d()) {
            dae.a(this, this);
        } else if (lziVar.f()) {
            et.I(this, this, lziVar);
        } else if (lziVar.e()) {
            ew.h(this, this, lziVar, deiVar);
        } else if (lziVar.f) {
            m(dcs.e, Float.valueOf(1.3229325E7f));
            m(dcs.f, Float.valueOf(3.807744E7f));
            n(ddl.aa, "sunfish-droidfood-discuss@google.com");
            n(ddl.ab, "sunfish-dogfood-discuss@google.com");
            s(ddl.ad, false);
            s(ddl.aR, false);
            s(ddl.aV, true);
            l(ddl.m, -1);
            s(ddl.bn, true);
            l(ddl.c, 2);
            s(ddl.aZ, true);
            s(dde.f, true);
            s(ddd.a, true);
            s(dcu.p, false);
            s(dcu.L, true);
            s(dcu.V, true);
            s(dcu.ae, false);
            s(dcv.f, true);
            s(dcv.g, true);
            l(ddm.c, 2);
            s(ddm.ao, false);
            s(ddt.e, deiVar.b(dei.ENG));
            s(ddm.z, false);
            s(ddm.at, false);
            s(ddm.aj, deiVar.b(dei.FISHFOOD));
            s(ddm.K, false);
            s(ddp.i, true);
            s(ddp.h, true);
            m(ddq.b, Float.valueOf(2.747752E7f));
            m(ddq.c, Float.valueOf(4.9411428E7f));
            q(ddr.f, false);
            s(ddr.q, true);
            s(ddr.j, false);
            s(dds.O, true);
            s(dds.N, true);
            s(dds.r, true);
            s(dds.t, true);
            s(dds.u, true);
            s(dds.j, true);
            deiVar.b(dei.FISHFOOD);
            s(ddx.y, false);
            s(ddx.v, true);
            s(ddy.c, true);
            l(dcy.a, design);
            s(dcy.c, true);
            s(ddl.bo, false);
            q(dcz.b, false);
            s(ddn.b, false);
            s(ddl.ak, false);
        } else if (lziVar.g()) {
            et.H(this, this, lziVar, deiVar);
        } else if (lziVar.h()) {
            eu.g(this, this, lziVar, deiVar, hwxVar);
        } else if (lziVar.i) {
            eu.f(this, this, lziVar, deiVar);
        } else if (lziVar.i()) {
            fw.k(this, this, lziVar, deiVar, hwxVar);
        } else if (lziVar.m) {
            ew.g(this, this, lziVar, deiVar, hwxVar);
        } else if (lziVar.a) {
            dae.b(this, this, deiVar);
        } else if (lziVar.b) {
            s(ddl.at, false);
        }
        ddi ddiVar16 = ddl.o;
        if (!k(ddl.at)) {
            i = -1;
        } else if (lziVar.k || lziVar.j) {
            i = 3;
        } else if (!lzhVar.e && ExperimentalKeys.getLibraryVersion() <= 2) {
            i = 0;
        } else if (lzhVar.e) {
            i = 2;
        }
        o(ddiVar16, Integer.valueOf(i));
        if (Device.isRedmiNote8()) {
            isDefaults.overrideDefaults(this, this);
        } else if (Device.isnokia()) {
            Nokia.overrideDefaults(this, this);
        } else if (Device.isOnePlus()) {
            OnePlus.overrideDefaults(this, this);
        } else if (Device.OppoVivoRealme()) {
            OppoVivoRealme.overrideDefaults(this, this);
        } else if (Device.isOnePlus9()) {
            OnePlus9.overrideDefaults(this, this);
        } else if (Device.isOnePlus7()) {
            OnePlus7.overrideDefaults(this, this);
        } else if (Device.MN10()) {
            Tucana.overrideDefaults(this, this);
        } else if (Device.Fog()) {
            Fog.overrideDefaults(this, this);
        } else if (Device.Samsungs22UExynos()) {
            Samsungs22UExynos.overrideDefaults(this, this);
        } else if (Device.SamsungS23Ultra()) {
            Samsungs23U.overrideDefaults(this, this);
        } else if (Device.Samsungs22USnapdragon()) {
            Samsungs22USnapdragon.overrideDefaults(this, this);
        } else if (Device.Mi12UltraDevice()) {
            Mi12Ultra.overrideDefaults(this, this);
        } else if (Device.M52()) {
            M52.overrideDefaults(this, this);
        } else if (Device.Random()) {
            RMX3085.overrideDefaults(this, this);
        } else if (Device.S20FE()) {
            G780G.overrideDefaults(this, this);
        } else if (Device.isStar()) {
            Mi11Ultra.overrideDefaults(this, this);
        } else if (Device.is12tpro()) {
            C12tpro.overrideDefaults(this, this);
        } else if (Device.isRealme9()) {
            Realme9.overrideDefaults(this, this);
        } else if (Device.isRN8P()) {
            RN8P.overrideDefaults(this, this);
        } else if (Device.VivoDevice()) {
            VIVO.overrideDefaults(this, this);
        } else if (Device.Mi10TPro()) {
            C10tpro.overrideDefaults(this, this);
        } else if (Device.Samsungs22Exynos()) {
            Samsungs22Exynos.overrideDefaults(this, this);
        }
        sh("pref_awbrec_key", "0");
        s(dda.c, false);
        s(dda.d, false);
        s(ddl.aR, false);
        s(deh.a, false);
        s(ddm.D, false);
        s(ddl.Y, false);
        s(ddl.bk, false);
        s(ddl.bl, false);
        s(dcu.p, false);
        s(ddr.f, false);
        s(ddl.T, false);
        s(ddl.U, false);
        s(dcu.E, true);
        s(ddx.y, false);
        s(ddx.v, false);
        s(ddx.C, false);
        s(ddx.D, false);
        s(ddx.E, false);
        s(dcu.t, true);
        s(dcu.v, true);
        s(deg.d, true);
        s(deg.c, true);
        s(ddx.z, true);
        s(ddx.q, true);
        s(ddx.x, true);
        s(dcu.q, true);
        hsld.setDeveloperSettings(this);
    }

    private static final void v(Map map, ddg ddgVar, Object obj) {
        map.put(ddgVar, obj);
    }

    @Override // defpackage.ddf
    public final ojc a(ddi ddiVar) {
        String strH;
        dem demVar = (dem) this.b.get(ddiVar);
        if (ddiVar.a()) {
            demVar.getClass();
            return ojc.i((Integer) demVar.a());
        }
        den denVar = this.c;
        String str = ddiVar.a;
        str.getClass();
        ope opeVar = ddiVar.c;
        demVar.getClass();
        Integer num = (Integer) demVar.a;
        String strD = denVar.d(str);
        Integer numDecode = null;
        if (strD != null) {
            try {
                numDecode = Integer.decode(strD);
            } catch (NumberFormatException e) {
                ((oug) ((oug) ((oug) den.a.c()).h(e)).G(691)).y("getAdbOrGserviceIntValue: adbName=%s value=%s", str, strD);
            }
        }
        if (numDecode == null && (strH = denVar.c.h(str)) != null) {
            try {
                numDecode = Integer.decode(strH);
            } catch (NumberFormatException e2) {
                ((oug) ((oug) ((oug) den.a.c()).h(e2)).G(690)).y("getAdbOrGserviceIntValue: gservicesName=%s value=%s", str, strH);
            }
        }
        if (numDecode != null) {
            num = numDecode;
        }
        if (num == null || num.intValue() == Integer.MIN_VALUE) {
            return oih.a;
        }
        boolean z = true;
        if (!opeVar.isEmpty() && !opeVar.contains(num)) {
            z = false;
        }
        obr.aU(z, "%s must be one of: %s", ddiVar.a, opeVar);
        return ojc.i(num);
    }

    @Override // defpackage.ddf
    public final void b() {
    }

    @Override // defpackage.ddf
    public final void c() {
    }

    @Override // defpackage.ddf
    public final void d() {
    }

    @Override // defpackage.ddf
    public final void e() {
    }

    @Override // defpackage.ddf
    public final void f() {
    }

    @Override // defpackage.ddf
    public final ojc g(ddg ddgVar) {
        SharedPreferences sharedPreferences = this.c.b;
        String str = ddgVar.a;
        if (sharedPreferences.contains(str)) {
            return ojc.i(Float.valueOf(sharedPreferences.getFloat(str, Float.MIN_VALUE)));
        }
        dem demVar = (dem) this.b.get(ddgVar);
        if (ddgVar.a()) {
            demVar.getClass();
            return ojc.i(Float.valueOf(((Double) demVar.a()).floatValue()));
        }
        den denVar = this.c;
        String str2 = ddgVar.a;
        demVar.getClass();
        Float f = (Float) demVar.a;
        String strD = denVar.d(str2);
        Float fValueOf = null;
        if (strD != null) {
            try {
                fValueOf = Float.valueOf(Float.parseFloat(strD));
            } catch (NumberFormatException e) {
                ((oug) ((oug) ((oug) den.a.c()).h(e)).G(692)).y("getAdbOrPreferenceFloatValue: adbName=%s value=%s", str2, strD);
            }
        }
        if (fValueOf == null && denVar.b.contains(str2)) {
            fValueOf = Float.valueOf(denVar.b.getFloat(str2, Float.MIN_VALUE));
        }
        if (fValueOf != null && fValueOf.floatValue() != Float.MIN_VALUE) {
            f = fValueOf;
        }
        return f == null ? oih.a : ojc.i(f);
    }

    @Override // defpackage.ddf
    public final ojc h(ddg ddgVar) {
        SharedPreferences sharedPreferences = this.c.b;
        String str = ddgVar.a;
        if (sharedPreferences.contains(str)) {
            return ojc.i(Long.valueOf(sharedPreferences.getLong(str, Long.MIN_VALUE)));
        }
        dem demVar = (dem) this.b.get(ddgVar);
        if (ddgVar.a()) {
            demVar.getClass();
            return ojc.i((Long) demVar.a());
        }
        den denVar = this.c;
        String str2 = ddgVar.a;
        demVar.getClass();
        Long l = (Long) demVar.a;
        String strD = denVar.d(str2);
        Long lDecode = null;
        if (strD != null) {
            try {
                lDecode = Long.decode(strD);
            } catch (NumberFormatException e) {
                ((oug) ((oug) ((oug) den.a.c()).h(e)).G(693)).y("getAdbOrPreferenceLongValue: adbName=%s value=%s", str2, strD);
            }
        }
        if (lDecode == null && denVar.b.contains(str2)) {
            lDecode = Long.valueOf(denVar.b.getLong(str2, Long.MIN_VALUE));
        }
        if (lDecode != null) {
            l = lDecode;
        }
        return (l == null || l.longValue() == Long.MIN_VALUE) ? oih.a : ojc.i(l);
    }

    @Override // defpackage.ddf
    public final String i(ddg ddgVar) {
        String string;
        SharedPreferences sharedPreferences = this.c.b;
        String str = ddgVar.a;
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getString(str, (String) null);
        }
        dem demVar = (dem) this.b.get(ddgVar);
        if (ddgVar.a()) {
            demVar.getClass();
            return (String) demVar.a();
        }
        den denVar = this.c;
        String str2 = ddgVar.a;
        demVar.getClass();
        String str3 = (String) demVar.a;
        String strD = denVar.d(str2);
        if (strD != null) {
            return strD;
        }
        return (!denVar.b.contains(str2) || (string = denVar.b.getString(str2, null)) == null) ? str3 : string;
    }

    @Override // defpackage.ddf
    public final boolean j(ddg ddgVar) {
        SharedPreferences sharedPreferences = this.c.b;
        String str = ddgVar.a;
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, false);
        }
        dem demVar = (dem) this.b.get(ddgVar);
        demVar.getClass();
        return den.e((Boolean) demVar.a);
    }

    @Override // defpackage.ddf
    public final boolean k(ddg ddgVar) {
        SharedPreferences sharedPreferences = this.c.b;
        String str = ddgVar.a;
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, false);
        }
        dem demVar = (dem) this.b.get(ddgVar);
        if (ddgVar.a()) {
            demVar.getClass();
            return ((Boolean) demVar.a()).booleanValue();
        }
        den denVar = this.c;
        String str2 = ddgVar.a;
        str2.getClass();
        demVar.getClass();
        Boolean bool = (Boolean) demVar.a;
        String strD = denVar.d(str2);
        if (strD != null) {
            return deb.a(strD);
        }
        String strH = denVar.c.h(str2);
        return strH != null ? deb.a(strH) : den.e(bool);
    }

    @Override // defpackage.ddj
    public final void l(ddi ddiVar, Integer num) {
        this.b.put(ddiVar, new dem(num, den.b(ddiVar, num)));
    }

    @Override // defpackage.ddj
    public final void m(ddg ddgVar, Float f) {
        this.b.put(ddgVar, new dem(f, den.a(ddgVar, f)));
    }

    @Override // defpackage.ddj
    public final void n(ddg ddgVar, String str) {
        this.b.put(ddgVar, new dem(str, (ner) null));
    }

    @Override // defpackage.ddk
    public final void o(ddi ddiVar, Integer num) {
        this.b.put(ddiVar, new dem(num, den.b(ddiVar, num)));
    }

    @Override // defpackage.ddk
    public final void p(ddg ddgVar) {
        v(this.b, ddgVar, new dem(true, den.c(ddgVar, true)));
    }

    @Override // defpackage.ddk
    public final void q(ddg ddgVar, boolean z) {
        v(this.b, ddgVar, new dem(z, den.c(ddgVar, z)));
    }

    @Override // defpackage.ddk
    public final void r(ddg ddgVar, Float f) {
        this.b.put(ddgVar, new dem(f, den.a(ddgVar, f)));
    }

    @Override // defpackage.ddk
    public final void s(ddg ddgVar, boolean z) {
        v(this.b, ddgVar, new dem(z, den.c(ddgVar, z)));
    }

    @Override // defpackage.ddf
    public final Map sh() {
        return this.b;
    }

    public final void sh(String str, String str2) {
        SharedPreferences sharedPreferences = this.c.b;
        if (str == null || sharedPreferences.contains(str)) {
            return;
        }
        sharedPreferences.edit().putString(str, String.valueOf(str2)).apply();
    }

    @Override // defpackage.ddk
    public final void t(ddg ddgVar, String str) {
        ner nerVarD;
        Map map = this.b;
        String str2 = ddgVar.b;
        if (str2 != null) {
            String str3 = ddgVar.a;
            nep nepVar = del.a;
            StringBuilder sb = new StringBuilder(str2.length() + 2 + String.valueOf(str3).length());
            sb.append(str2);
            sb.append("__");
            sb.append(str3);
            nerVarD = ner.d(nepVar, sb.toString(), str, false);
        } else {
            nerVarD = null;
        }
        map.put(ddgVar, new dem(str, nerVarD));
    }

    @Override // defpackage.ddk
    public final void u(ddg ddgVar, String str) {
        this.b.put(ddgVar, new dem(str, (ner) null));
    }
}
