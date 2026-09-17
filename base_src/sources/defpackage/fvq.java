package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.Helper;
import com.google.android.apps.camera.bottombar.R;
import com.google.googlex.gcam.BurstSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class fvq {
    public fvq() {
    }

    public fvq(byte[] bArr) {
        new ArrayList();
    }

    public static ghx A(lvs lvsVar, lvq lvqVar, ddf ddfVar) {
        lvp lvpVarA = lvqVar.a(lvsVar);
        return (lvpVarA.k() == lwd.FRONT && ddfVar.k(ddl.U)) ? B(lvpVarA, lvqVar) : new ghx(lvpVarA);
    }

    public static ghx B(lvp lvpVar, lvq lvqVar) {
        Iterator it = lvpVar.B().iterator();
        while (it.hasNext()) {
            lvp lvpVarA = lvqVar.a((lvs) it.next());
            if (lvpVarA.h().width() > lvpVar.h().width()) {
                lvpVar = lvpVarA;
            }
        }
        return new ghx(lvpVar);
    }

    public static lvs C(lqd lqdVar) {
        for (lnx lnxVar : lqdVar.c) {
            if (lnxVar.a() == 37) {
                return lnxVar.c();
            }
        }
        return null;
    }

    public static final goy D(goy goyVar) {
        return new hab(goyVar);
    }

    public static int E(lic licVar, boolean z) {
        if (z) {
            if (licVar == lic.CLOCKWISE_0) {
                return 1;
            }
            if (licVar == lic.CLOCKWISE_90) {
                return 3;
            }
            return licVar == lic.CLOCKWISE_180 ? 2 : 4;
        }
        if (licVar == lic.CLOCKWISE_0) {
            return 3;
        }
        if (licVar == lic.CLOCKWISE_90) {
            return 1;
        }
        return licVar == lic.CLOCKWISE_180 ? 4 : 2;
    }

    public static boolean F(int i) {
        return i == 3 || i == 4;
    }

    public static void a(String str, pht phtVar) {
        pfj.h(phtVar, Throwable.class, new nfp(str, 1), pgr.INSTANCE);
    }

    public static void b() {
        if (fvr.a != null) {
            ddf ddfVar = fvr.a;
            ddi ddiVar = ddr.a;
            ddfVar.b();
        }
    }

    public static Handler c(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return mip.bV(handlerThread.getLooper());
    }

    public static boolean d(ddf ddfVar) {
        return ddfVar.k(dds.y) && ddfVar.k(dds.Q);
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "TRIMMING_MODE_AUTO";
            case 2:
                return "TRIMMING_MODE_NEVER_DROP";
            default:
                return "null";
        }
    }

    public static MediaFormat g(lig ligVar, int i, float f, boolean z, boolean z2) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", ligVar.a, ligVar.b);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("color-format", 21);
        int i2 = true != z2 ? 2 : 1;
        mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", 3);
        mediaFormatCreateVideoFormat.setInteger("color-range", i2);
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", f);
        mediaFormatCreateVideoFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        if (z) {
            mediaFormatCreateVideoFormat.setInteger("profile", 8);
            mediaFormatCreateVideoFormat.setInteger("level", 32768);
        }
        return mediaFormatCreateVideoFormat;
    }

    public static fvh h(fua fuaVar, hkm hkmVar) {
        return new fvf(fuaVar, hkmVar, null, null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static lnz i(lvp lvpVar, gfw gfwVar, jrl jrlVar, ddf ddfVar, ojc ojcVar) {
        lwp lwpVar = (jrlVar == jrl.PORTRAIT && ddfVar.k(ddx.w)) ? new lwp(37, new lig(((Integer) ddfVar.a(ddx.c).c()).intValue(), ((Integer) ddfVar.a(ddx.d).c()).intValue())) : k(lvpVar, Helper.GetRawFormatFix());
        lwpVar.getClass();
        return j(lvpVar.i(), lwpVar, gfwVar.b, true, false, (Long) ojcVar.f());
    }

    public static lnz j(lvs lvsVar, lwp lwpVar, int i, boolean z, boolean z2, Long l) {
        lny lnyVarA = lnz.a();
        lnyVarA.b(lvsVar);
        lnyVarA.g(lwpVar.b);
        lnyVarA.f(lwpVar.a);
        lnyVarA.c(i);
        lnyVarA.h(loa.IMAGE_READER);
        lnyVarA.e(z2);
        lnyVarA.d(z);
        if (l != null) {
            lnyVarA.i(l.longValue());
        }
        return lnyVarA.a();
    }

    public static lwp k(lvp lvpVar, int... iArr) {
        for (int i : iArr) {
            List listX = lvpVar.x(i);
            if (!listX.isEmpty()) {
                return new lwp(i, mip.bs(listX));
            }
        }
        return null;
    }

    public static boolean l(lwd lwdVar, ddf ddfVar) {
        return lwdVar == lwd.FRONT && ddfVar.k(ddl.U);
    }

    public static lnz m(lvs lvsVar, lwp lwpVar, int i) {
        return j(lvsVar, lwpVar, i, true, false, null);
    }

    public static void n(Map map, qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, ghx ghxVar, ddf ddfVar) {
        if (!ghxVar.L() || !ddfVar.k(ddl.aR) || l(ghxVar.k(), ddfVar)) {
            map.put(hdr.RAW_HDRPLUS, (lnz) qkgVar.get());
            return;
        }
        map.put(hdr.RAW_WIDE, (lnz) qkgVar2.get());
        if (((ojc) qkgVar3.get()).g()) {
            map.put(hdr.RAW_TELE, (lnz) ((ojc) qkgVar3.get()).c());
        }
        if (((ojc) qkgVar4.get()).g()) {
            map.put(hdr.RAW_ULTRAWIDE, (lnz) ((ojc) qkgVar4.get()).c());
        }
    }

    public static Set o(gjm gjmVar) {
        opc opcVarD = ope.D();
        Iterator it = gjmVar.a.iterator();
        while (it.hasNext()) {
            opcVarD.d((lnq) it.next());
        }
        return opcVarD.f();
    }

    public static void p(lnc lncVar, Set set) {
        opc opcVarD = ope.D();
        lmp lmpVarA = lncVar.a();
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            lnq lnqVar = (lnq) it.next();
            CaptureRequest.Key key = lnqVar.a;
            if (!key.equals(CaptureRequest.CONTROL_AF_REGIONS) && !key.equals(CaptureRequest.CONTROL_AE_REGIONS) && !key.equals(CaptureRequest.CONTROL_AWB_REGIONS) && !key.equals(CaptureRequest.CONTROL_AF_TRIGGER) && !key.equals(CaptureRequest.CONTROL_AE_LOCK) && !key.equals(CaptureRequest.CONTROL_AWB_LOCK)) {
                Object obj = lnqVar.b;
                CaptureRequest.Key key2 = lnqVar.a;
                if (key2.equals(CaptureRequest.CONTROL_AE_MODE)) {
                    ((lok) lmpVarA).e = (Integer) obj;
                } else if (key2.equals(CaptureRequest.CONTROL_AF_MODE)) {
                    ((lok) lmpVarA).d = (Integer) obj;
                } else if (key2.equals(CaptureRequest.CONTROL_AWB_MODE)) {
                    ((lok) lmpVarA).f = (Integer) obj;
                } else if (key2.equals(CaptureRequest.CONTROL_MODE)) {
                    ((lok) lmpVarA).c = (Integer) obj;
                } else if (key2.equals(CaptureRequest.FLASH_MODE)) {
                    ((lok) lmpVarA).g = (Integer) obj;
                } else {
                    opcVarD.d(lnqVar);
                }
                z = true;
            }
        }
        if (z) {
            lncVar.n(lmpVarA.a());
        }
        ope opeVarF = opcVarD.f();
        if (opeVarF.isEmpty()) {
            return;
        }
        lncVar.i(opeVarF);
    }

    public static ojc q(lnc lncVar, Set set, ojc ojcVar, ojc ojcVar2, ojc ojcVar3, qkg qkgVar) {
        if (set.isEmpty()) {
            return oih.a;
        }
        opc opcVar = new opc();
        opcVar.i(set);
        if (ojcVar.g()) {
            opcVar.d((lnx) ojcVar.c());
        }
        if (ojcVar3.g()) {
            opcVar.d((lnx) ojcVar3.c());
        }
        opc opcVar2 = new opc();
        opcVar2.i(((pyw) qkgVar).get());
        if (ojcVar2.g()) {
            opcVar.d((lnx) ojcVar2.c());
            if (kcz.b != null) {
                opcVar2.d(mip.be(kcz.b, (byte) 1));
            }
        }
        return ojc.i(lncVar.v(opcVar.f(), opcVar2.f()));
    }

    public static void r(jrl jrlVar, ddf ddfVar) {
        if (jrlVar == jrl.PHOTO) {
            ddi ddiVar = dee.a;
            ddfVar.d();
        }
    }

    public static long s(lvp lvpVar, BurstSpec burstSpec, ojc ojcVar, int i, int i2, boolean z, boolean z2, lzv lzvVar) {
        float millis = TimeUnit.NANOSECONDS.toMillis(pkr.e(lvpVar));
        long jRound = 0;
        if (ojcVar.g() && i2 > 0) {
            jRound = Math.round(((BurstSpec) ojcVar.c()).a(millis, z2));
        }
        if (i > 0) {
            jRound += (long) Math.round(burstSpec.a(millis, z2));
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
        l.getClass();
        return z ? jRound + (((long) (i + i2)) * timeUnit.toMillis(l.longValue()) * 6) : jRound;
    }

    public static oom t(lvp lvpVar) {
        Iterator it = lvpVar.A().iterator();
        while (it.hasNext()) {
            if (((CaptureRequest.Key) it.next()).getName().equals(ghy.a.getName())) {
                return oom.m(mip.be(ghy.a, 1));
            }
        }
        return oom.l();
    }

    public static ope u(jrl jrlVar) {
        int i;
        HashSet hashSet = new HashSet();
        if (kdb.o != null) {
            jrl jrlVar2 = jrl.UNINITIALIZED;
            switch (jrlVar.ordinal()) {
                case 3:
                    i = R.styleable.AppCompatTheme_switchStyle;
                    break;
                case 6:
                    i = 3;
                    break;
                case 12:
                    i = 5;
                    break;
                case 13:
                    i = 100;
                    break;
                default:
                    return orx.a;
            }
            hashSet.add(mip.be(kdb.o, true));
            hashSet.add(mip.be(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(i)));
        }
        return ope.F(hashSet);
    }

    public static ope v(jrl jrlVar, lvp lvpVar) {
        opc opcVarD = ope.D();
        opcVarD.i(t(lvpVar));
        opcVarD.i(u(jrlVar));
        return opcVarD.f();
    }

    public static void w(Set set, lne lneVar, lvp lvpVar) {
        if (set.isEmpty()) {
            return;
        }
        Set setBf = mip.bf(lvpVar.A());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            lnq lnqVar = (lnq) it.next();
            if (setBf.contains(lnqVar.a.getName())) {
                lneVar.b().d(lnqVar);
            }
        }
    }

    public static void x(lnc lncVar, lmv lmvVar) {
        Iterator it = lmvVar.q().c.iterator();
        while (it.hasNext()) {
            lncVar.d((lnx) it.next());
        }
    }

    public static boolean y(lnx lnxVar) {
        long jA = lnxVar.a();
        return jA == 257 || jA == 4098 || jA == 4099;
    }

    public static boolean z(lnx lnxVar) {
        long jA = lnxVar.a();
        return jA == 37 || jA == 38;
    }

    public final synchronized fuw f() {
        throw new IllegalStateException("Requesting mash trimmer but no start point yet");
    }
}
