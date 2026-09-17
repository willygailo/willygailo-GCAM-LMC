package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class iiw implements fjs {
    private static final ouj l = ouj.h("com/google/android/apps/camera/stats/UsageStatisticsImpl");
    public final String a;
    public final qkg b;
    public final long c;
    public final String d;
    public final String e;
    public final dei f;
    public final boolean h;
    public final Context i;
    public long k;
    private long m;
    private final fkc o;
    private final Executor t;
    private long v;
    private final dlo w;
    private final AtomicInteger n = new AtomicInteger(0);
    private final List p = new ArrayList();
    private long q = 0;
    private boolean r = true;
    private long s = 0;
    private int x = 1;
    private final LinkedHashMap u = new LinkedHashMap();
    public final Phaser g = new Phaser(1);
    private int y = 1;
    private int z = 1;
    private int A = 1;
    public final AtomicBoolean j = new AtomicBoolean(false);
    private final nvb B = new nvb((short[]) null);

    public iiw(fkc fkcVar, Context context, long j, String str, String str2, Executor executor, dei deiVar, boolean z, qkg qkgVar, dlo dloVar, String str3) {
        this.k = -1L;
        this.o = fkcVar;
        this.i = context;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.t = executor;
        this.f = deiVar;
        this.h = z;
        this.b = qkgVar;
        this.w = dloVar;
        this.a = str3;
        this.k = hwv.b(context);
    }

    private static void aB(int i, String str, long j, paa paaVar) {
        Level level;
        String string;
        switch (i) {
            case 4:
                level = Level.INFO;
                break;
            default:
                level = Level.WARNING;
                break;
        }
        oug ougVar = (oug) l.a(level).G(2965);
        int iT = oxh.t(paaVar.b);
        if (iT == 0) {
            iT = 1;
        }
        int i2 = iT - 1;
        dei deiVar = dei.ENG;
        lwd lwdVar = lwd.FRONT;
        hsr hsrVar = hsr.UNKNOWN;
        pef pefVar = pef.UNKNOWN;
        switch (i2) {
            case 0:
                string = "-UNKNOWN";
                break;
            case 1:
                string = "-API1_JPEG";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                StringBuilder sb = new StringBuilder(20);
                sb.append("-UNKNOWN-");
                sb.append(i2);
                string = sb.toString();
                break;
            case 9:
                string = "-API2BETA_HDR_PLUS";
                break;
            case 10:
                string = "-API2_LEGACY";
                break;
            case 11:
                string = "-API2_AUTO_HDR_PLUS";
                break;
            case 12:
                string = "-API2_ZSL";
                break;
            case 13:
                string = "-API2_HDR_PLUS";
                break;
            case 14:
                string = "-API2_LIMITED";
                break;
        }
        ougVar.A("%s%s %d", str, string, Long.valueOf(j));
    }

    private final void aC(final ojz ojzVar) {
        final int i = this.x;
        final long j = this.m;
        final int andIncrement = this.n.getAndIncrement();
        this.g.register();
        this.t.execute(new Runnable() { // from class: iit
            /* JADX WARN: Code duplicated, block: B:17:0x0048  */
            /* JADX WARN: Code duplicated, block: B:19:0x004e  */
            @Override // java.lang.Runnable
            public final void run() {
                iiw iiwVar = this.a;
                ojz ojzVar2 = ojzVar;
                long j2 = j;
                int i2 = andIncrement;
                int i3 = i;
                poy poyVar = (poy) ojzVar2.a();
                pab pabVarB = pab.b(((pac) poyVar.b).d);
                if (pabVarB == null) {
                    pabVarB = pab.UNKNOWN_TYPE;
                }
                if (pabVarB == pab.CAPTURE_DONE) {
                    String str = iiwVar.d;
                    if (poyVar.c) {
                        poyVar.m();
                        poyVar.c = false;
                    }
                    pac pacVar = (pac) poyVar.b;
                    str.getClass();
                    pacVar.a |= 4;
                    pacVar.e = str;
                } else {
                    pab pabVarB2 = pab.b(((pac) poyVar.b).d);
                    if (pabVarB2 == null) {
                        pabVarB2 = pab.UNKNOWN_TYPE;
                    }
                    if (pabVarB2 == pab.CAPTURE_COMPUTE) {
                        String str2 = iiwVar.d;
                        if (poyVar.c) {
                            poyVar.m();
                            poyVar.c = false;
                        }
                        pac pacVar2 = (pac) poyVar.b;
                        str2.getClass();
                        pacVar2.a |= 4;
                        pacVar2.e = str2;
                    } else {
                        pab pabVarB3 = pab.b(((pac) poyVar.b).d);
                        if (pabVarB3 == null) {
                            pabVarB3 = pab.UNKNOWN_TYPE;
                        }
                        if (pabVarB3 == pab.FOREGROUND_EVENT) {
                            String str3 = iiwVar.d;
                            if (poyVar.c) {
                                poyVar.m();
                                poyVar.c = false;
                            }
                            pac pacVar3 = (pac) poyVar.b;
                            str3.getClass();
                            pacVar3.a |= 4;
                            pacVar3.e = str3;
                        }
                    }
                }
                long j3 = iiwVar.k;
                if (j3 != -1) {
                    if (poyVar.c) {
                        poyVar.m();
                        poyVar.c = false;
                    }
                    pac pacVar4 = (pac) poyVar.b;
                    pacVar4.c |= 4096;
                    pacVar4.an = j3;
                }
                boolean z = iiwVar.h;
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                pac pacVar5 = (pac) poyVar.b;
                pacVar5.a |= 536870912;
                pacVar5.z = z;
                long j4 = iiwVar.c;
                pacVar5.b |= 1048576;
                pacVar5.R = j4;
                dei deiVar = iiwVar.f;
                lwd lwdVar = lwd.FRONT;
                hsr hsrVar = hsr.UNKNOWN;
                pef pefVar = pef.UNKNOWN;
                int i4 = 1;
                switch (deiVar) {
                    case FISHFOOD:
                        i4 = 2;
                        break;
                    case DOGFOOD:
                        i4 = 3;
                        break;
                    case RELEASE:
                        i4 = 4;
                        break;
                }
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                pac pacVar6 = (pac) poyVar.b;
                pacVar6.y = i4 - 1;
                int i5 = pacVar6.a | 268435456;
                pacVar6.a = i5;
                String str4 = iiwVar.a;
                str4.getClass();
                int i6 = 4 | pacVar6.b;
                pacVar6.b = i6;
                pacVar6.C = str4;
                int i7 = i5 | 134217728;
                pacVar6.a = i7;
                pacVar6.x = j2;
                pacVar6.a = 67108864 | i7;
                pacVar6.w = i2;
                int i8 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                pacVar6.L = i8;
                pacVar6.b = i6 | 16384;
                ((fjt) iiwVar.b.get()).a((pac) poyVar.j());
                iiwVar.g.arriveAndDeregister();
            }
        });
    }

    private static final ozz aD(lwd lwdVar) {
        if (lwdVar != null) {
            dei deiVar = dei.ENG;
            hsr hsrVar = hsr.UNKNOWN;
            pef pefVar = pef.UNKNOWN;
            switch (lwdVar) {
                case FRONT:
                    return ozz.FRONT;
                case BACK:
                    return ozz.BACK;
                case EXTERNAL:
                    return ozz.UNKNOWN_CAMERA_DIRECTION;
            }
        }
        return ozz.UNKNOWN_CAMERA_DIRECTION;
    }

    private static final pei aE(PointF pointF) {
        poy poyVarM = pei.d.m();
        if (pointF != null) {
            float f = pointF.x;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pei peiVar = (pei) poyVarM.b;
            peiVar.a |= 1;
            peiVar.b = f;
            float f2 = pointF.y;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pei peiVar2 = (pei) poyVarM.b;
            peiVar2.a |= 2;
            peiVar2.c = f2;
        }
        return (pei) poyVarM.j();
    }

    private final void aF(int i, ped pedVar, pdv pdvVar, ozt oztVar, peq peqVar) {
        poy poyVarM = paw.h.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        paw pawVar = (paw) poyVarM.b;
        pawVar.b = i - 1;
        int i2 = pawVar.a | 1;
        pawVar.a = i2;
        int i3 = this.x;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        pawVar.c = i4;
        int i5 = i2 | 2;
        pawVar.a = i5;
        if (pedVar != null) {
            pawVar.d = pedVar;
            i5 |= 8;
            pawVar.a = i5;
        }
        if (pdvVar != null) {
            pawVar.e = pdvVar;
            i5 |= 16;
            pawVar.a = i5;
        }
        if (oztVar != null) {
            pawVar.f = oztVar;
            i5 |= 32;
            pawVar.a = i5;
        }
        if (peqVar != null) {
            pawVar.g = peqVar;
            pawVar.a = i5 | 64;
        }
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.CONTROL_USED;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        paw pawVar2 = (paw) poyVarM.j();
        pawVar2.getClass();
        pacVar.k = pawVar2;
        pacVar.a |= 256;
        aA(poyVarM2);
    }

    private static final pat aG(int i, int i2) {
        poy poyVarM = pat.d.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pat patVar = (pat) poyVarM.b;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        patVar.b = i3;
        int i4 = patVar.a | 1;
        patVar.a = i4;
        int i5 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        patVar.c = i5;
        patVar.a = i4 | 2;
        return (pat) poyVarM.j();
    }

    private static final int aH(hsr hsrVar) {
        dei deiVar = dei.ENG;
        lwd lwdVar = lwd.FRONT;
        hsr hsrVar2 = hsr.UNKNOWN;
        pef pefVar = pef.UNKNOWN;
        switch (hsrVar.ordinal()) {
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 12;
            default:
                return 1;
        }
    }

    @Override // defpackage.fjs
    public final void A(Throwable th, int i) {
        S(10, null, th, -1, -1, i, oom.l(), oom.l(), lju.CAMERA_ERROR_CODE_UNKNOWN, false);
    }

    @Override // defpackage.fjs
    public final void B(String str, boolean z, hsr hsrVar, String str2, int i) {
        poy poyVarM = pch.g.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pch pchVar = (pch) poyVarM.b;
        str.getClass();
        int i2 = pchVar.a | 1;
        pchVar.a = i2;
        pchVar.b = str;
        pchVar.a = i2 | 2;
        pchVar.c = z;
        dei deiVar = dei.ENG;
        lwd lwdVar = lwd.FRONT;
        hsr hsrVar2 = hsr.UNKNOWN;
        pef pefVar = pef.UNKNOWN;
        switch (hsrVar.ordinal()) {
            case 1:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar2 = (pch) poyVarM.b;
                pchVar2.d = 1;
                pchVar2.a |= 4;
                break;
            case 2:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar3 = (pch) poyVarM.b;
                pchVar3.d = 2;
                pchVar3.a |= 4;
                break;
            case 3:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar4 = (pch) poyVarM.b;
                pchVar4.d = 3;
                pchVar4.a |= 4;
                break;
            case 4:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar5 = (pch) poyVarM.b;
                pchVar5.d = 31;
                pchVar5.a |= 4;
                break;
            case 5:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar6 = (pch) poyVarM.b;
                pchVar6.d = 20;
                pchVar6.a |= 4;
                break;
            case 6:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar7 = (pch) poyVarM.b;
                pchVar7.d = 20;
                pchVar7.a |= 4;
                break;
            case 7:
            case 8:
            default:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar8 = (pch) poyVarM.b;
                pchVar8.d = 0;
                pchVar8.a |= 4;
                break;
            case 9:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar9 = (pch) poyVarM.b;
                pchVar9.d = 10;
                pchVar9.a |= 4;
                break;
            case 10:
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pch pchVar10 = (pch) poyVarM.b;
                pchVar10.d = 32;
                pchVar10.a |= 4;
                break;
        }
        if (str2 != null) {
            pch pchVar11 = (pch) poyVarM.b;
            pchVar11.a |= 8;
            pchVar11.e = str2;
        }
        if (i != 0) {
            pch pchVar12 = (pch) poyVarM.b;
            pchVar12.a |= 16;
            pchVar12.f = i;
        }
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.LAUNCH_PHOTOS_REVIEW_EVENT;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pch pchVar13 = (pch) poyVarM.j();
        pchVar13.getClass();
        pacVar.B = pchVar13;
        pacVar.b |= 1;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void C(pdm pdmVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.PHOTOBOOTH_SESSION_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pdmVar.getClass();
        pacVar.G = pdmVar;
        pacVar.b |= 512;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void D(pdp pdpVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.PORTRAIT_SEGMENTER_INIT_FAILURE;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pdpVar.getClass();
        pacVar.T = pdpVar;
        pacVar.b |= 8388608;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void E() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CAMERA_PREWARM;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = paj.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        paj pajVar = (paj) poyVarM2.b;
        pajVar.b = 1;
        pajVar.a = 1 | pajVar.a;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        paj pajVar2 = (paj) poyVarM2.j();
        pajVar2.getClass();
        pacVar2.q = pajVar2;
        pacVar2.a |= 131072;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void F() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CAMERA_PREWARM;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = paj.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        paj pajVar = (paj) poyVarM2.b;
        pajVar.b = 3;
        pajVar.a |= 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        paj pajVar2 = (paj) poyVarM2.j();
        pajVar2.getClass();
        pacVar2.q = pajVar2;
        pacVar2.a |= 131072;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void G(pdt pdtVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.PROCESS_GC_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pdtVar.getClass();
        pacVar.am = pdtVar;
        pacVar.c |= 2048;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void H(peb pebVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.STATS_3A_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pebVar.getClass();
        pacVar.ah = pebVar;
        pacVar.c |= 32;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void I(pbr pbrVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.FRAMING_HINT_SHOWN;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pbrVar.getClass();
        pacVar.ae = pbrVar;
        pacVar.c |= 4;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void J(pbs pbsVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.FRAMING_HINT_STATUS;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pbsVar.getClass();
        pacVar.ad = pbsVar;
        pacVar.c |= 2;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void K(pek pekVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.VIDEO_SESSION_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pekVar.getClass();
        pacVar.Y = pekVar;
        pacVar.b |= 268435456;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void L(pep pepVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.WEAR_SESSION_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pepVar.getClass();
        pacVar.N = pepVar;
        pacVar.b |= 65536;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void M(int i, float f, float f2, lwd lwdVar) {
        int i2;
        poy poyVarM = peq.e.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        peq peqVar = (peq) poyVarM.b;
        int i3 = peqVar.a | 1;
        peqVar.a = i3;
        peqVar.b = f;
        peqVar.a = i3 | 2;
        peqVar.c = f2;
        ozz ozzVarAD = aD(lwdVar);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        peq peqVar2 = (peq) poyVarM.b;
        peqVar2.d = ozzVarAD.d;
        peqVar2.a |= 4;
        peq peqVar3 = (peq) poyVarM.j();
        dei deiVar = dei.ENG;
        lwd lwdVar2 = lwd.FRONT;
        hsr hsrVar = hsr.UNKNOWN;
        pef pefVar = pef.UNKNOWN;
        switch (i - 1) {
            case 1:
                i2 = 9;
                break;
            case 2:
                i2 = 10;
                break;
            case 3:
                i2 = 13;
                break;
            case 4:
                i2 = 14;
                break;
            case 5:
                i2 = 15;
                break;
            case 6:
                i2 = 16;
                break;
            case 7:
                i2 = 17;
                break;
            case 8:
                i2 = 18;
                break;
            case 9:
                i2 = 19;
                break;
            case 10:
                i2 = 20;
                break;
            default:
                i2 = 1;
                break;
        }
        aF(i2, null, null, null, peqVar3);
    }

    @Override // defpackage.fjs
    public final void N() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CAMERA_PREWARM;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = paj.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        paj pajVar = (paj) poyVarM2.b;
        pajVar.b = 2;
        pajVar.a |= 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        paj pajVar2 = (paj) poyVarM2.j();
        pajVar2.getClass();
        pacVar2.q = pajVar2;
        pacVar2.a |= 131072;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void O() {
        this.m = UUID.randomUUID().getLeastSignificantBits();
    }

    @Override // defpackage.fjs
    public final void P(jrw jrwVar, boolean z) {
        poy poyVarM = ped.d.m();
        poy poyVarM2 = peh.f.m();
        float f = jrwVar.a;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        peh pehVar = (peh) poyVarM2.b;
        int i = pehVar.a | 1;
        pehVar.a = i;
        pehVar.b = f;
        float f2 = jrwVar.b;
        int i2 = i | 2;
        pehVar.a = i2;
        pehVar.c = f2;
        float f3 = jrwVar.c;
        int i3 = i2 | 4;
        pehVar.a = i3;
        pehVar.d = f3;
        float f4 = jrwVar.d;
        pehVar.a = i3 | 8;
        pehVar.e = f4;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ped pedVar = (ped) poyVarM.b;
        peh pehVar2 = (peh) poyVarM2.j();
        pehVar2.getClass();
        pedVar.b = pehVar2;
        pedVar.a |= 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ped pedVar2 = (ped) poyVarM.b;
        pedVar2.a |= 8;
        pedVar2.c = z;
        aF(2, (ped) poyVarM.j(), null, null, null);
    }

    @Override // defpackage.fjs
    public final void Q(lwd lwdVar, ojc ojcVar, pef pefVar, long j, long j2, boolean z, boolean z2, oor oorVar, oor oorVar2, oor oorVar3) {
        fjx fjxVar = new fjx(11, lwdVar.equals(lwd.FRONT));
        fjxVar.c(z2);
        poy poyVarM = peg.u.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        peg pegVar = (peg) poyVarM.b;
        int i = pegVar.a | 1;
        pegVar.a = i;
        pegVar.b = j;
        int i2 = i | 2;
        pegVar.a = i2;
        pegVar.c = j2;
        pegVar.d = pefVar.g;
        int i3 = i2 | 4;
        pegVar.a = i3;
        pegVar.a = i3 | 262144;
        pegVar.t = z;
        for (pef pefVar2 : pef.values()) {
            if (oorVar.containsKey(pefVar2) && oorVar2.containsKey(pefVar2) && oorVar3.containsKey(pefVar2)) {
                dei deiVar = dei.ENG;
                hsr hsrVar = hsr.UNKNOWN;
                switch (pefVar2.ordinal()) {
                    case 1:
                        int iIntValue = ((Integer) oorVar.get(pefVar2)).intValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar2 = (peg) poyVarM.b;
                        pegVar2.a |= 8;
                        pegVar2.e = iIntValue;
                        long jLongValue = ((Long) oorVar2.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar3 = (peg) poyVarM.b;
                        pegVar3.a |= 256;
                        pegVar3.j = jLongValue;
                        long jLongValue2 = ((Long) oorVar3.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar4 = (peg) poyVarM.b;
                        pegVar4.a |= 8192;
                        pegVar4.o = jLongValue2;
                        break;
                    case 2:
                        int iIntValue2 = ((Integer) oorVar.get(pefVar2)).intValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar5 = (peg) poyVarM.b;
                        pegVar5.a |= 16;
                        pegVar5.f = iIntValue2;
                        long jLongValue3 = ((Long) oorVar2.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar6 = (peg) poyVarM.b;
                        pegVar6.a |= 512;
                        pegVar6.k = jLongValue3;
                        long jLongValue4 = ((Long) oorVar3.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar7 = (peg) poyVarM.b;
                        pegVar7.a |= 16384;
                        pegVar7.p = jLongValue4;
                        break;
                    case 3:
                        int iIntValue3 = ((Integer) oorVar.get(pefVar2)).intValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar8 = (peg) poyVarM.b;
                        pegVar8.a |= 32;
                        pegVar8.g = iIntValue3;
                        long jLongValue5 = ((Long) oorVar2.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar9 = (peg) poyVarM.b;
                        pegVar9.a |= 1024;
                        pegVar9.l = jLongValue5;
                        long jLongValue6 = ((Long) oorVar3.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar10 = (peg) poyVarM.b;
                        pegVar10.a |= 32768;
                        pegVar10.q = jLongValue6;
                        break;
                    case 4:
                        int iIntValue4 = ((Integer) oorVar.get(pefVar2)).intValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar11 = (peg) poyVarM.b;
                        pegVar11.a |= 64;
                        pegVar11.h = iIntValue4;
                        long jLongValue7 = ((Long) oorVar2.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar12 = (peg) poyVarM.b;
                        pegVar12.a |= 2048;
                        pegVar12.m = jLongValue7;
                        long jLongValue8 = ((Long) oorVar3.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar13 = (peg) poyVarM.b;
                        pegVar13.a |= 65536;
                        pegVar13.r = jLongValue8;
                        break;
                    case 5:
                        int iIntValue5 = ((Integer) oorVar.get(pefVar2)).intValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar14 = (peg) poyVarM.b;
                        pegVar14.a |= 128;
                        pegVar14.i = iIntValue5;
                        long jLongValue9 = ((Long) oorVar2.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar15 = (peg) poyVarM.b;
                        pegVar15.a |= 4096;
                        pegVar15.n = jLongValue9;
                        long jLongValue10 = ((Long) oorVar3.get(pefVar2)).longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        peg pegVar16 = (peg) poyVarM.b;
                        pegVar16.a |= 131072;
                        pegVar16.s = jLongValue10;
                        break;
                }
            }
        }
        peg pegVar17 = (peg) poyVarM.j();
        if (pegVar17 != null) {
            poy poyVar = fjxVar.a;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pam pamVar = (pam) poyVar.b;
            pam pamVar2 = pam.T;
            pamVar.C = pegVar17;
            pamVar.b |= 16;
        }
        if (ojcVar.g()) {
            fjxVar.d((pcu) ojcVar.c());
        }
        ay(fjxVar);
    }

    @Override // defpackage.fjs
    public final void R(int i, List list, ojc ojcVar, ojc ojcVar2) {
        long j;
        String string;
        if (i == 0) {
            throw null;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.u.keySet().iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (((mip) this.u.get(str)) != null && jElapsedRealtime > 30000) {
                poy poyVarM = pac.aq.m();
                pab pabVar = pab.PHOTO_INTERACTION;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pac pacVar = (pac) poyVarM.b;
                pacVar.d = pabVar.an;
                pacVar.a |= 1;
                poy poyVarM2 = pcv.f.m();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                pcv pcvVar = (pcv) poyVarM2.b;
                pcvVar.b = 6;
                pcvVar.a |= 1;
                fkc fkcVar = this.o;
                synchronized (fkcVar.c) {
                    byte[] bArrDigest = fkcVar.b.digest(str.getBytes(fkc.a));
                    StringBuilder sb = new StringBuilder();
                    int length = bArrDigest.length;
                    while (i2 < length) {
                        sb.append(Integer.toString((bArrDigest[i2] & 255) + 256, 16).substring(1));
                        i2++;
                        jElapsedRealtime = jElapsedRealtime;
                    }
                    j = jElapsedRealtime;
                    string = sb.toString();
                }
                String strSubstring = string.substring(0, 10);
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                pcv pcvVar2 = (pcv) poyVarM2.b;
                strSubstring.getClass();
                int i3 = pcvVar2.a | 8;
                pcvVar2.a = i3;
                pcvVar2.c = strSubstring;
                int i4 = i3 | 32;
                pcvVar2.a = i4;
                pcvVar2.e = 0.0f;
                pcvVar2.a = i4 | 16;
                pcvVar2.d = 0.0f;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pac pacVar2 = (pac) poyVarM.b;
                pcv pcvVar3 = (pcv) poyVarM2.j();
                pcvVar3.getClass();
                pacVar2.h = pcvVar3;
                pacVar2.a |= 32;
                aA(poyVarM);
                it.remove();
                jElapsedRealtime = j;
            }
        }
        poy poyVarM3 = ozv.g.m();
        if (list != null && !list.isEmpty()) {
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            ozv ozvVar = (ozv) poyVarM3.b;
            ppm ppmVar = ozvVar.e;
            if (!ppmVar.c()) {
                ozvVar.e = ppd.B(ppmVar);
            }
            pnl.e(list, ozvVar.e);
        }
        if (ojcVar.g()) {
            pci pciVar = (pci) ojcVar.c();
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            ozv ozvVar2 = (ozv) poyVarM3.b;
            ozvVar2.b = pciVar;
            ozvVar2.a |= 2;
        }
        pai paiVar = (pai) ((ojj) ojcVar2).a;
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        ozv ozvVar3 = (ozv) poyVarM3.b;
        ozvVar3.f = paiVar;
        ozvVar3.a |= 8;
        List list2 = this.p;
        ppm ppmVar2 = ozvVar3.c;
        if (!ppmVar2.c()) {
            ozvVar3.c = ppd.B(ppmVar2);
        }
        pnl.e(list2, ozvVar3.c);
        this.p.clear();
        if (i == 2) {
            if (this.r) {
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                ozv ozvVar4 = (ozv) poyVarM3.b;
                ozvVar4.a |= 4;
                ozvVar4.d = -1.0f;
            } else {
                float f = (jElapsedRealtimeNanos - this.s) / 1.0E9f;
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                ozv ozvVar5 = (ozv) poyVarM3.b;
                ozvVar5.a |= 4;
                ozvVar5.d = f;
            }
        }
        this.r = true;
        this.s = 0L;
        poy poyVarM4 = pac.aq.m();
        pab pabVar2 = pab.BACKGROUND_EVENT;
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        pac pacVar3 = (pac) poyVarM4.b;
        pacVar3.d = pabVar2.an;
        pacVar3.a |= 1;
        ozv ozvVar6 = (ozv) poyVarM3.j();
        ozvVar6.getClass();
        pacVar3.m = ozvVar6;
        pacVar3.a |= 8192;
        aA(poyVarM4);
    }

    @Override // defpackage.fjs
    public final void S(int i, String str, Throwable th, int i2, int i3, int i4, List list, List list2, lju ljuVar, boolean z) {
        poy poyVarM = pad.m.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pad padVar = (pad) poyVarM.b;
        padVar.b = i - 1;
        int i5 = padVar.a | 1;
        padVar.a = i5;
        int i6 = i5 | 64;
        padVar.a = i6;
        padVar.g = i4;
        String str2 = this.e;
        str2.getClass();
        int i7 = i6 | 4;
        padVar.a = i7;
        padVar.d = str2;
        if (str != null) {
            i7 |= 2;
            padVar.a = i7;
            padVar.c = str;
        }
        if (i2 != -1) {
            i7 |= 8;
            padVar.a = i7;
            padVar.e = i2;
        }
        if (i3 != -1) {
            padVar.a = i7 | 16;
            padVar.f = i3;
        }
        if (th != null) {
            poy poyVarM2 = pce.b.m();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                poy poyVarM3 = pcf.d.m();
                String simpleName = cause.getClass().getSimpleName();
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                pcf pcfVar = (pcf) poyVarM3.b;
                simpleName.getClass();
                pcfVar.a |= 1;
                pcfVar.b = simpleName;
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    poy poyVarM4 = pcg.f.m();
                    String className = stackTraceElement.getClassName();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    pcg pcgVar = (pcg) poyVarM4.b;
                    className.getClass();
                    pcgVar.a |= 1;
                    pcgVar.b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    pcg pcgVar2 = (pcg) poyVarM4.b;
                    methodName.getClass();
                    pcgVar2.a |= 2;
                    pcgVar2.c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    pcg pcgVar3 = (pcg) poyVarM4.b;
                    pcgVar3.a |= 8;
                    pcgVar3.e = lineNumber;
                    String fileName = stackTraceElement.getFileName();
                    if (fileName != null) {
                        if (poyVarM4.c) {
                            poyVarM4.m();
                            poyVarM4.c = false;
                        }
                        pcg pcgVar4 = (pcg) poyVarM4.b;
                        pcgVar4.a |= 4;
                        pcgVar4.d = fileName;
                    }
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    pcf pcfVar2 = (pcf) poyVarM3.b;
                    pcg pcgVar5 = (pcg) poyVarM4.j();
                    pcgVar5.getClass();
                    ppm ppmVar = pcfVar2.c;
                    if (!ppmVar.c()) {
                        pcfVar2.c = ppd.B(ppmVar);
                    }
                    pcfVar2.c.add(pcgVar5);
                }
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                pce pceVar = (pce) poyVarM2.b;
                pcf pcfVar3 = (pcf) poyVarM3.j();
                pcfVar3.getClass();
                ppm ppmVar2 = pceVar.a;
                if (!ppmVar2.c()) {
                    pceVar.a = ppd.B(ppmVar2);
                }
                pceVar.a.add(pcfVar3);
            }
            pce pceVar2 = (pce) poyVarM2.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pad padVar2 = (pad) poyVarM.b;
            pceVar2.getClass();
            padVar2.h = pceVar2;
            padVar2.a |= 128;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(aD((lwd) it.next()));
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pad padVar3 = (pad) poyVarM.b;
        ppk ppkVar = padVar3.i;
        if (!ppkVar.c()) {
            padVar3.i = ppd.x(ppkVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            padVar3.i.g(((ozz) it2.next()).d);
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pad padVar4 = (pad) poyVarM.b;
        ppm ppmVar3 = padVar4.l;
        if (!ppmVar3.c()) {
            padVar4.l = ppd.B(ppmVar3);
        }
        pnl.e(list2, padVar4.l);
        if (ljuVar != lju.CAMERA_ERROR_CODE_UNKNOWN) {
            int i8 = ljuVar.u;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pad padVar5 = (pad) poyVarM.b;
            padVar5.a |= 256;
            padVar5.j = i8;
        }
        if (i == 3) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pad padVar6 = (pad) poyVarM.b;
            padVar6.a |= 512;
            padVar6.k = z;
        }
        poy poyVarM5 = pac.aq.m();
        pab pabVar = pab.CAMERA_FAILURE;
        if (poyVarM5.c) {
            poyVarM5.m();
            poyVarM5.c = false;
        }
        pac pacVar = (pac) poyVarM5.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pad padVar7 = (pad) poyVarM.j();
        padVar7.getClass();
        pacVar.j = padVar7;
        pacVar.a |= 128;
        aA(poyVarM5);
    }

    @Override // defpackage.fjs
    public final void T(int i, int i2, int i3, lwd lwdVar, int i4) {
        poy poyVarM = pag.g.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pag pagVar = (pag) poyVarM.b;
        pagVar.b = i - 1;
        int i5 = pagVar.a | 1;
        pagVar.a = i5;
        pagVar.c = i2 - 1;
        int i6 = i5 | 2;
        pagVar.a = i6;
        pagVar.d = i3 - 1;
        pagVar.a = i6 | 4;
        if (lwdVar != null) {
            ozz ozzVarAD = aD(lwdVar);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pag pagVar2 = (pag) poyVarM.b;
            pagVar2.e = ozzVarAD.d;
            pagVar2.a |= 8;
        }
        if (i4 != 0) {
            pag pagVar3 = (pag) poyVarM.b;
            pagVar3.f = i4 - 1;
            pagVar3.a |= 16;
        }
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.CAMERA_FATAL_ERROR_DIALOG;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pag pagVar4 = (pag) poyVarM.j();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar2 = (pac) poyVarM2.b;
        pagVar4.getClass();
        pacVar2.ac = pagVar4;
        pacVar2.c |= 1;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void U(int i, pdi pdiVar, pdl pdlVar, pdy pdyVar, Long l2) {
        this.q = SystemClock.elapsedRealtime();
        poy poyVarM = pal.g.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pal palVar = (pal) poyVarM.b;
        palVar.b = i - 1;
        int i2 = palVar.a | 1;
        palVar.a = i2;
        if (pdiVar != null) {
            palVar.c = pdiVar;
            i2 |= 4;
            palVar.a = i2;
        }
        if (pdlVar != null) {
            palVar.d = pdlVar;
            i2 |= 16;
            palVar.a = i2;
        }
        if (pdyVar != null) {
            palVar.f = pdyVar;
            palVar.a = i2 | 64;
        }
        if (l2 != null) {
            long jLongValue = l2.longValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pal palVar2 = (pal) poyVarM.b;
            palVar2.a |= 32;
            palVar2.e = jLongValue;
        }
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.CAPTURE_COMPUTE;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pal palVar3 = (pal) poyVarM.j();
        palVar3.getClass();
        pacVar.l = palVar3;
        pacVar.a |= 512;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void V(int i, int i2, long j, long j2) {
        long j3 = this.q;
        long jEb = mip.eb(this.v);
        long j4 = j - this.v;
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CHANGE_CAMERA;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pav.h.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pav pavVar = (pav) poyVarM2.b;
        pavVar.b = i - 1;
        int i3 = pavVar.a | 1;
        pavVar.a = i3;
        pavVar.c = i2 - 1;
        int i4 = i3 | 2;
        pavVar.a = i4;
        int i5 = i4 | 4;
        pavVar.a = i5;
        pavVar.d = j;
        int i6 = i5 | 8;
        pavVar.a = i6;
        pavVar.e = j2;
        int i7 = this.z;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        pavVar.f = i8;
        int i9 = i6 | 16;
        pavVar.a = i9;
        boolean z = j4 < 3000000000L && j3 < jEb;
        pavVar.a = i9 | 32;
        pavVar.g = z;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pav pavVar2 = (pav) poyVarM2.j();
        pavVar2.getClass();
        pacVar2.s = pavVar2;
        pacVar2.a |= 524288;
        aA(poyVarM);
        this.z = 1;
        this.v = j2;
    }

    @Override // defpackage.fjs
    public final void W(int i, int i2) {
        X(i, i2, 0L, 0L);
    }

    @Override // defpackage.fjs
    public final void X(int i, int i2, long j, long j2) {
        poy poyVarM = pdc.h.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdc pdcVar = (pdc) poyVarM.b;
        pdcVar.c = i - 1;
        int i3 = pdcVar.a | 2;
        pdcVar.a = i3;
        pdcVar.d = i2 - 1;
        int i4 = i3 | 4;
        pdcVar.a = i4;
        int i5 = this.x;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        pdcVar.b = i6;
        int i7 = i4 | 1;
        pdcVar.a = i7;
        int i8 = i7 | 16;
        pdcVar.a = i8;
        pdcVar.f = j;
        pdcVar.a = i8 | 32;
        pdcVar.g = j2;
        if (i == 3) {
            if (this.q == 0 || !(i5 == 8 || i5 == 6 || i5 == 2 || i5 == 9 || i5 == 12)) {
                i = 3;
            } else {
                float fDW = mip.dW(SystemClock.elapsedRealtime() - this.q);
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pdc pdcVar2 = (pdc) poyVarM.b;
                pdcVar2.a |= 8;
                pdcVar2.e = fDW;
                i = 3;
            }
        }
        this.q = 0L;
        int i9 = this.x;
        if (i9 != 1 && i != 28 && i9 != i) {
            poy poyVarM2 = pac.aq.m();
            pab pabVar = pab.NAVIGATION_CHANGE;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pac pacVar = (pac) poyVarM2.b;
            pacVar.d = pabVar.an;
            pacVar.a |= 1;
            pdc pdcVar3 = (pdc) poyVarM.j();
            pdcVar3.getClass();
            pacVar.f = pdcVar3;
            pacVar.a |= 8;
            aA(poyVarM2);
        }
        this.x = i;
    }

    @Override // defpackage.fjs
    public final void Y(int i) {
        aF(6, null, null, null, null);
    }

    @Override // defpackage.fjs
    public final void Z(int i) {
        poy poyVarM = pax.c.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pax paxVar = (pax) poyVarM.b;
        paxVar.b = i - 1;
        paxVar.a |= 1;
        final pax paxVar2 = (pax) poyVarM.j();
        aC(new ojz() { // from class: iis
            @Override // defpackage.ojz
            public final Object a() {
                pax paxVar3 = paxVar2;
                poy poyVarM2 = pac.aq.m();
                pab pabVar = pab.DND_ACCESS_NEEDED_EVENT;
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                pac pacVar = (pac) poyVarM2.b;
                pacVar.d = pabVar.an;
                pacVar.a |= 1;
                paxVar3.getClass();
                pacVar.V = paxVar3;
                pacVar.b |= 33554432;
                return poyVarM2;
            }
        });
    }

    @Override // defpackage.fjs
    public final long a() {
        return this.m;
    }

    public final void aA(final poy poyVar) {
        aC(new ojz() { // from class: iir
            @Override // defpackage.ojz
            public final Object a() {
                return poyVar;
            }
        });
    }

    @Override // defpackage.fjs
    public final void aa(int i, String str, String str2) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.MODE_SWITCH_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pcx.e.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pcx pcxVar = (pcx) poyVarM2.b;
        pcxVar.b = i - 1;
        int i2 = pcxVar.a | 1;
        pcxVar.a = i2;
        str.getClass();
        int i3 = i2 | 4;
        pcxVar.a = i3;
        pcxVar.d = str;
        str2.getClass();
        pcxVar.a = i3 | 2;
        pcxVar.c = str2;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pcx pcxVar2 = (pcx) poyVarM2.j();
        pcxVar2.getClass();
        pacVar2.H = pcxVar2;
        pacVar2.b |= 1024;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void ab(int i, String str) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CAMERA_SMARTS_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pak.d.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pak pakVar = (pak) poyVarM2.b;
        pakVar.b = i - 1;
        int i2 = pakVar.a | 1;
        pakVar.a = i2;
        str.getClass();
        pakVar.a = i2 | 2;
        pakVar.c = str;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pak pakVar2 = (pak) poyVarM2.j();
        pakVar2.getClass();
        pacVar2.M = pakVar2;
        pacVar2.b |= 32768;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void ac(long j, hsr hsrVar, int i, int i2, Throwable th) {
        poy poyVarM = paa.c.m();
        int iAH = aH(hsrVar);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        paa paaVar = (paa) poyVarM.b;
        paaVar.b = iAH - 1;
        paaVar.a |= 2;
        paa paaVar2 = (paa) poyVarM.j();
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.CAPTURE_PROFILE_ABORTED;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM3 = pan.f.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pan panVar = (pan) poyVarM3.b;
        panVar.a |= 2;
        panVar.c = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pan panVar2 = (pan) poyVarM3.b;
        int i3 = panVar2.a | 4;
        panVar2.a = i3;
        panVar2.d = jElapsedRealtimeNanos;
        paaVar2.getClass();
        panVar2.b = paaVar2;
        panVar2.a = i3 | 1;
        pat patVarAG = aG(i, i2);
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pan panVar3 = (pan) poyVarM3.b;
        patVarAG.getClass();
        panVar3.e = patVarAG;
        panVar3.a |= 8;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar2 = (pac) poyVarM2.b;
        pan panVar4 = (pan) poyVarM3.j();
        panVar4.getClass();
        pacVar2.p = panVar4;
        pacVar2.a |= 65536;
        aA(poyVarM2);
        aB(5, "onCaptureCanceled", j, paaVar2);
        this.w.a((dmc) th);
    }

    @Override // defpackage.fjs
    public final void ad(long j, hsr hsrVar, int i, int i2, Throwable th) {
        poy poyVarM = paa.c.m();
        int iAH = aH(hsrVar);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        paa paaVar = (paa) poyVarM.b;
        paaVar.b = iAH - 1;
        paaVar.a |= 2;
        paa paaVar2 = (paa) poyVarM.j();
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.CAPTURE_PROFILE_FAILED;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM3 = pap.f.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pap papVar = (pap) poyVarM3.b;
        papVar.a |= 2;
        papVar.c = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pap papVar2 = (pap) poyVarM3.b;
        int i3 = papVar2.a | 4;
        papVar2.a = i3;
        papVar2.d = jElapsedRealtimeNanos;
        paaVar2.getClass();
        papVar2.b = paaVar2;
        papVar2.a = i3 | 1;
        pat patVarAG = aG(i, i2);
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pap papVar3 = (pap) poyVarM3.b;
        patVarAG.getClass();
        papVar3.e = patVarAG;
        papVar3.a |= 8;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar2 = (pac) poyVarM2.b;
        pap papVar4 = (pap) poyVarM3.j();
        papVar4.getClass();
        pacVar2.u = papVar4;
        pacVar2.a |= 2097152;
        aA(poyVarM2);
        aB(5, "onCaptureFailed", j, paaVar2);
        this.w.a(th instanceof dmd ? (dmd) th : new dmd(th));
    }

    @Override // defpackage.fjs
    public final void ae(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, List list, long j10, hsr hsrVar, int i, int i2) {
        poy poyVarM = paa.c.m();
        int iAH = aH(hsrVar);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        paa paaVar = (paa) poyVarM.b;
        paaVar.b = iAH - 1;
        paaVar.a |= 2;
        paa paaVar2 = (paa) poyVarM.j();
        poy poyVarM2 = pas.m.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pas pasVar = (pas) poyVarM2.b;
        int i3 = pasVar.a | 1;
        pasVar.a = i3;
        pasVar.b = j3;
        if (j4 > 0) {
            i3 |= 2;
            pasVar.a = i3;
            pasVar.c = j4;
        }
        if (j5 > 0) {
            i3 |= 4;
            pasVar.a = i3;
            pasVar.d = j5;
        }
        if (j6 > 0) {
            i3 |= 512;
            pasVar.a = i3;
            pasVar.g = j6;
        }
        if (j7 > 0) {
            i3 |= 1024;
            pasVar.a = i3;
            pasVar.h = j7;
        }
        if (j10 > 0) {
            i3 |= 4096;
            pasVar.a = i3;
            pasVar.i = j10;
        }
        if (j8 > 0) {
            i3 |= 32;
            pasVar.a = i3;
            pasVar.e = j8;
        }
        if (j9 > 0) {
            i3 |= 64;
            pasVar.a = i3;
            pasVar.f = j9;
        }
        if (j > 0) {
            i3 |= 8192;
            pasVar.a = i3;
            pasVar.k = j;
        }
        if (j2 > 0) {
            pasVar.a = i3 | 16384;
            pasVar.l = j2;
        }
        if (list != null) {
            ppm ppmVar = pasVar.j;
            if (!ppmVar.c()) {
                pasVar.j = ppd.B(ppmVar);
            }
            pnl.e(list, pasVar.j);
        }
        poy poyVarM3 = pao.e.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pao paoVar = (pao) poyVarM3.b;
        pas pasVar2 = (pas) poyVarM2.j();
        pasVar2.getClass();
        paoVar.c = pasVar2;
        paoVar.a |= 2;
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pao paoVar2 = (pao) poyVarM3.b;
        paaVar2.getClass();
        paoVar2.b = paaVar2;
        paoVar2.a |= 1;
        pat patVarAG = aG(i, i2);
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pao paoVar3 = (pao) poyVarM3.b;
        patVarAG.getClass();
        paoVar3.d = patVarAG;
        paoVar3.a |= 4;
        pao paoVar4 = (pao) poyVarM3.j();
        poy poyVarM4 = pac.aq.m();
        pab pabVar = pab.CAPTURE_PROFILE;
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        pac pacVar = (pac) poyVarM4.b;
        pacVar.d = pabVar.an;
        int i4 = pacVar.a | 1;
        pacVar.a = i4;
        paoVar4.getClass();
        pacVar.o = paoVar4;
        pacVar.a = 32768 | i4;
        aA(poyVarM4);
        aB(4, "onCapturePersisted", j3, paaVar2);
    }

    @Override // defpackage.fjs
    public final void af(long j, hsr hsrVar, int i, int i2) {
        poy poyVarM = paa.c.m();
        int iAH = aH(hsrVar);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        paa paaVar = (paa) poyVarM.b;
        paaVar.b = iAH - 1;
        paaVar.a |= 2;
        paa paaVar2 = (paa) poyVarM.j();
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.CAPTURE_PROFILE_START_COMMITTED;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM3 = paq.f.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        paq paqVar = (paq) poyVarM3.b;
        paqVar.a |= 2;
        paqVar.c = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        paq paqVar2 = (paq) poyVarM3.b;
        int i3 = paqVar2.a | 4;
        paqVar2.a = i3;
        paqVar2.d = jElapsedRealtimeNanos;
        paaVar2.getClass();
        paqVar2.b = paaVar2;
        paqVar2.a = i3 | 1;
        pat patVarAG = aG(i, i2);
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        paq paqVar3 = (paq) poyVarM3.b;
        patVarAG.getClass();
        paqVar3.e = patVarAG;
        paqVar3.a |= 8;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar2 = (pac) poyVarM2.b;
        paq paqVar4 = (paq) poyVarM3.j();
        paqVar4.getClass();
        pacVar2.v = paqVar4;
        pacVar2.a |= 4194304;
        aA(poyVarM2);
        aB(4, "onCaptureStartCommitted", j, paaVar2);
    }

    @Override // defpackage.fjs
    public final void ag(int i) {
        if (i == 3) {
            this.y = 3;
            return;
        }
        int i2 = this.y;
        if (i2 != 1) {
            i = i2;
        }
        this.y = 1;
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.ENTER_STORAGE_PREFERENCE_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pbc.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pbc pbcVar = (pbc) poyVarM2.b;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        pbcVar.b = i3;
        pbcVar.a |= 1;
        pbc pbcVar2 = (pbc) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pbcVar2.getClass();
        pacVar2.ag = pbcVar2;
        pacVar2.c |= 16;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void ah(long j, long j2, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        poy poyVarM = pbw.l.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbw pbwVar = (pbw) poyVarM.b;
        int i8 = pbwVar.a | 1;
        pbwVar.a = i8;
        pbwVar.b = j;
        int i9 = i8 | 2;
        pbwVar.a = i9;
        pbwVar.c = j2;
        int i10 = i9 | 4;
        pbwVar.a = i10;
        pbwVar.d = z;
        int i11 = i10 | 8;
        pbwVar.a = i11;
        pbwVar.e = i;
        int i12 = i11 | 16;
        pbwVar.a = i12;
        pbwVar.f = i2;
        int i13 = i12 | 32;
        pbwVar.a = i13;
        pbwVar.g = i3;
        int i14 = i13 | 64;
        pbwVar.a = i14;
        pbwVar.h = i4;
        int i15 = i14 | 256;
        pbwVar.a = i15;
        pbwVar.j = i6;
        int i16 = i15 | 512;
        pbwVar.a = i16;
        pbwVar.k = i7;
        if (i5 != 0) {
            pbwVar.i = i5 - 1;
            pbwVar.a = i16 | 128;
        }
        if (z) {
            this.k = hwv.b(this.i);
        }
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.HAL_UPDATE_EVENT;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pbw pbwVar2 = (pbw) poyVarM.j();
        pbwVar2.getClass();
        pacVar.al = pbwVar2;
        pacVar.c |= 1024;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void ai(int i, long j, long j2, int i2, int i3) {
        poy poyVarM = pby.g.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pby pbyVar = (pby) poyVarM.b;
        pbyVar.b = i - 1;
        int i4 = pbyVar.a | 1;
        pbyVar.a = i4;
        int i5 = i4 | 2;
        pbyVar.a = i5;
        pbyVar.c = j;
        int i6 = i5 | 4;
        pbyVar.a = i6;
        pbyVar.d = j2;
        int i7 = i6 | 16;
        pbyVar.a = i7;
        pbyVar.f = i3;
        if (i2 != 0) {
            pbyVar.e = i2 - 1;
            pbyVar.a = i7 | 8;
        }
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.IN_APP_UPDATE_EVENT;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pby pbyVar2 = (pby) poyVarM.j();
        pbyVar2.getClass();
        pacVar.ai = pbyVar2;
        pacVar.c |= 128;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void aj(int i, long j) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.ZOOM_LOCK_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pes.d.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pes pesVar = (pes) poyVarM2.b;
        pesVar.b = i - 1;
        int i2 = pesVar.a | 1;
        pesVar.a = i2;
        pesVar.a = i2 | 2;
        pesVar.c = j;
        pes pesVar2 = (pes) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pesVar2.getClass();
        pacVar2.aj = pesVar2;
        pacVar2.c |= 256;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void ak(int i) {
        this.A = i;
    }

    @Override // defpackage.fjs
    public final void al(int i, boolean z, int i2) {
        poy poyVarM = pec.f.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pec pecVar = (pec) poyVarM.b;
        pecVar.b = 1;
        int i3 = pecVar.a | 1;
        pecVar.a = i3;
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        pecVar.c = i4;
        int i5 = i3 | 2;
        pecVar.a = i5;
        int i6 = i5 | 4;
        pecVar.a = i6;
        pecVar.d = i2;
        pecVar.a = i6 | 8;
        pecVar.e = z;
        pec pecVar2 = (pec) poyVarM.j();
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.SYSTEM_SERVICE_EVENT;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pecVar2.getClass();
        pacVar.ab = pecVar2;
        pacVar.b |= Integer.MIN_VALUE;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void am(int i, int i2, float f, float f2, lwd lwdVar) {
        poy poyVarM = ozt.g.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ozt oztVar = (ozt) poyVarM.b;
        oztVar.b = i - 1;
        int i3 = oztVar.a | 1;
        oztVar.a = i3;
        oztVar.c = i2 - 1;
        int i4 = i3 | 2;
        oztVar.a = i4;
        int i5 = i4 | 4;
        oztVar.a = i5;
        oztVar.d = f;
        oztVar.a = i5 | 8;
        oztVar.e = f2;
        ozz ozzVarAD = aD(lwdVar);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ozt oztVar2 = (ozt) poyVarM.b;
        oztVar2.f = ozzVarAD.d;
        oztVar2.a |= 16;
        aF(12, null, null, (ozt) poyVarM.j(), null);
    }

    @Override // defpackage.fjs
    public final void an(int i, boolean z) {
        poy poyVarM = pdv.d.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdv pdvVar = (pdv) poyVarM.b;
        pdvVar.b = i - 1;
        int i2 = pdvVar.a | 1;
        pdvVar.a = i2;
        pdvVar.a = i2 | 2;
        pdvVar.c = z;
        aF(8, null, (pdv) poyVarM.j(), null, null);
    }

    @Override // defpackage.fjs
    public final void ao(int i, lwd lwdVar, boolean z, boolean z2, pem pemVar, int i2, boolean z3, ojc ojcVar) {
        this.q = SystemClock.elapsedRealtime();
        fjx fjxVar = new fjx(i, lwdVar == lwd.FRONT);
        fjxVar.i(true != z ? 2 : 4);
        fjxVar.b(z2);
        fjxVar.f(pemVar);
        fjxVar.j(i2);
        fjxVar.c(z3);
        if (ojcVar.g()) {
            fjxVar.d((pcu) ojcVar.c());
        }
        int i3 = this.A;
        if (i3 != 1) {
            fjxVar.h(i3);
            this.A = 1;
        }
        ay(fjxVar);
    }

    @Override // defpackage.fjs
    public final void ap(final int i, final int i2, final int i3, final boolean z, final boolean z2, final boolean z3) {
        final long jLongValue = Long.valueOf(SystemClock.uptimeMillis() - Process.getStartUptimeMillis()).longValue();
        aC(new ojz() { // from class: iiu
            @Override // defpackage.ojz
            public final Object a() {
                iiw iiwVar = this.a;
                int i4 = i;
                int i5 = i3;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                long j = jLongValue;
                int i6 = i2;
                poy poyVarM = pbn.l.m();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pbn pbnVar = (pbn) poyVarM.b;
                pbnVar.b = i4 - 1;
                int i7 = pbnVar.a | 1;
                pbnVar.a = i7;
                pbnVar.c = i5 - 1;
                int i8 = i7 | 32;
                pbnVar.a = i8;
                String str = iiwVar.e;
                str.getClass();
                int i9 = i8 | 64;
                pbnVar.a = i9;
                pbnVar.d = str;
                int i10 = i9 | 128;
                pbnVar.a = i10;
                pbnVar.e = z4;
                int i11 = i10 | 256;
                pbnVar.a = i11;
                pbnVar.f = z5;
                int i12 = i11 | 512;
                pbnVar.a = i12;
                pbnVar.g = z6;
                int i13 = i12 | 1024;
                pbnVar.a = i13;
                pbnVar.h = 0L;
                int i14 = i13 | 8192;
                pbnVar.a = i14;
                pbnVar.k = j;
                pbnVar.i = i6 - 1;
                pbnVar.a = i14 | 2048;
                if (!iiwVar.j.getAndSet(true)) {
                    ozq ozqVar = null;
                    try {
                        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) iiwVar.i.getSystemService(ActivityManager.class)).getHistoricalProcessExitReasons(null, 0, 1);
                        if (!historicalProcessExitReasons.isEmpty()) {
                            ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(0);
                            long startUptimeMillis = (Process.getStartUptimeMillis() + (System.currentTimeMillis() - SystemClock.uptimeMillis())) - applicationExitInfo.getTimestamp();
                            poy poyVarM2 = ozq.h.m();
                            int importance = applicationExitInfo.getImportance();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            ozq ozqVar2 = (ozq) poyVarM2.b;
                            ozqVar2.a |= 4;
                            ozqVar2.d = importance;
                            long pss = applicationExitInfo.getPss();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            ozq ozqVar3 = (ozq) poyVarM2.b;
                            ozqVar3.a |= 8;
                            ozqVar3.e = pss;
                            long rss = applicationExitInfo.getRss();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            ozq ozqVar4 = (ozq) poyVarM2.b;
                            int i15 = ozqVar4.a | 16;
                            ozqVar4.a = i15;
                            ozqVar4.f = rss;
                            ozqVar4.a = i15 | 32;
                            ozqVar4.g = startUptimeMillis;
                            int iU = oxh.u(applicationExitInfo.getReason());
                            if (iU != 0) {
                                if (poyVarM2.c) {
                                    poyVarM2.m();
                                    poyVarM2.c = false;
                                }
                                ozq ozqVar5 = (ozq) poyVarM2.b;
                                ozqVar5.b = iU - 1;
                                ozqVar5.a |= 1;
                            } else {
                                int reason = applicationExitInfo.getReason();
                                if (poyVarM2.c) {
                                    poyVarM2.m();
                                    poyVarM2.c = false;
                                }
                                ozq ozqVar6 = (ozq) poyVarM2.b;
                                ozqVar6.a |= 2;
                                ozqVar6.c = reason;
                            }
                            ozqVar = (ozq) poyVarM2.j();
                        }
                    } catch (Throwable unused) {
                    }
                    if (ozqVar != null) {
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        pbn pbnVar2 = (pbn) poyVarM.b;
                        pbnVar2.j = ozqVar;
                        pbnVar2.a |= 4096;
                    }
                }
                poy poyVarM3 = pac.aq.m();
                pab pabVar = pab.FOREGROUND_EVENT;
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                pac pacVar = (pac) poyVarM3.b;
                pacVar.d = pabVar.an;
                pacVar.a |= 1;
                pbn pbnVar3 = (pbn) poyVarM.j();
                pbnVar3.getClass();
                pacVar.i = pbnVar3;
                pacVar.a |= 64;
                return poyVarM3;
            }
        });
    }

    @Override // defpackage.fjs
    public final void aq(int i, int i2, float f, float f2) {
        fjx fjxVar = new fjx(i, false);
        fjxVar.g(1.0f);
        fjxVar.e(f);
        if (i == 12) {
            poy poyVarM = pdg.d.m();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pdg pdgVar = (pdg) poyVarM.b;
            pdgVar.b = i2 - 1;
            int i3 = pdgVar.a | 1;
            pdgVar.a = i3;
            pdgVar.a = i3 | 2;
            pdgVar.c = f2;
            pdg pdgVar2 = (pdg) poyVarM.j();
            if (pdgVar2 != null) {
                poy poyVar = fjxVar.a;
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                pam pamVar = (pam) poyVar.b;
                pam pamVar2 = pam.T;
                pamVar.p = pdgVar2;
                pamVar.a |= 65536;
            }
        }
        ay(fjxVar);
    }

    @Override // defpackage.fjs
    public final void ar(int i, lwd lwdVar, llz llzVar, float f, boolean z, float f2, pen penVar, int i2, boolean z2) {
        this.q = SystemClock.elapsedRealtime();
        fjx fjxVar = new fjx(i, lwdVar == lwd.FRONT);
        fjxVar.g(f);
        fjxVar.i(true != z ? 2 : 4);
        fjxVar.e(f2);
        fjxVar.j(i2);
        poy poyVar = fjxVar.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        penVar.getClass();
        pamVar.I = penVar;
        pamVar.b |= 1024;
        fjxVar.c(z2);
        if (llzVar != null) {
            fjxVar.a(llzVar);
        }
        ay(fjxVar);
    }

    @Override // defpackage.fjs
    public final void as(int i, fkb fkbVar, ExifInterface exifInterface, boolean z, Float f, List list, pcs pcsVar, int i2, dzx dzxVar, Long l2, Integer num, pcw pcwVar, pbh pbhVar, pdn pdnVar, ozr ozrVar, pbg pbgVar, Long l3, Long l4, boolean z2, boolean z3, pet petVar, ozu ozuVar, ozs ozsVar, pbj pbjVar, pdb pdbVar, boolean z4, boolean z5) {
        int i3;
        this.q = SystemClock.elapsedRealtime();
        poy poyVarM = pdh.d.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdh pdhVar = (pdh) poyVarM.b;
        pdhVar.a |= 2;
        pdhVar.b = z;
        if (l3 == null) {
            ((oug) ((oug) l.c()).G((char) 2966)).o("Submitting log event with zero file size");
        }
        long jLongValue = l3 != null ? l3.longValue() / 1024 : 0L;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdh pdhVar2 = (pdh) poyVarM.b;
        pdhVar2.a |= 4;
        pdhVar2.c = jLongValue;
        fjx fjxVar = new fjx(i, fkbVar.a);
        fjxVar.a(exifInterface);
        fjxVar.g(fkbVar.b);
        String str = fkbVar.c;
        if (str != null) {
            if (str.equals("off")) {
                i3 = 2;
            } else if (str.equals("auto")) {
                i3 = 3;
            } else {
                i3 = (str.equals("on") || str.equals("torch")) ? 4 : 1;
            }
            poy poyVar = fjxVar.a;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pam pamVar = (pam) poyVar.b;
            pam pamVar2 = pam.T;
            pamVar.j = i3 - 1;
            pamVar.a |= 256;
        }
        fjxVar.b(fkbVar.d);
        boolean z6 = fkbVar.e;
        poy poyVar2 = fjxVar.a;
        if (poyVar2.c) {
            poyVar2.m();
            poyVar2.c = false;
        }
        pam pamVar3 = (pam) poyVar2.b;
        pam pamVar4 = pam.T;
        pamVar3.b |= 64;
        pamVar3.E = z6;
        float f2 = fkbVar.f;
        poy poyVar3 = fjxVar.a;
        if (poyVar3.c) {
            poyVar3.m();
            poyVar3.c = false;
        }
        pam pamVar5 = (pam) poyVar3.b;
        pamVar5.a |= 128;
        pamVar5.i = f2;
        pdh pdhVar3 = (pdh) poyVarM.j();
        if (pdhVar3 != null) {
            poy poyVar4 = fjxVar.a;
            if (poyVar4.c) {
                poyVar4.m();
                poyVar4.c = false;
            }
            pam pamVar6 = (pam) poyVar4.b;
            pamVar6.m = pdhVar3;
            pamVar6.a |= 4096;
        }
        fjxVar.e(f.floatValue());
        boolean zBooleanValue = fkbVar.g.booleanValue();
        poy poyVar5 = fjxVar.a;
        if (poyVar5.c) {
            poyVar5.m();
            poyVar5.c = false;
        }
        pam pamVar7 = (pam) poyVar5.b;
        pamVar7.a |= 512;
        pamVar7.k = zBooleanValue;
        poy poyVar6 = fjxVar.a;
        if (poyVar6.c) {
            poyVar6.m();
            poyVar6.c = false;
        }
        pam pamVar8 = (pam) poyVar6.b;
        pamVar8.t = i2 - 1;
        pamVar8.a |= 67108864;
        boolean zBooleanValue2 = fkbVar.j.booleanValue();
        poy poyVar7 = fjxVar.a;
        if (poyVar7.c) {
            poyVar7.m();
            poyVar7.c = false;
        }
        pam pamVar9 = (pam) poyVar7.b;
        pamVar9.b |= 4;
        pamVar9.A = zBooleanValue2;
        int i4 = fkbVar.p;
        poy poyVar8 = fjxVar.a;
        if (poyVar8.c) {
            poyVar8.m();
            poyVar8.c = false;
        }
        pam pamVar10 = (pam) poyVar8.b;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        pamVar10.B = i5;
        pamVar10.b |= 8;
        pba pbaVar = fkbVar.k;
        poy poyVar9 = fjxVar.a;
        if (poyVar9.c) {
            poyVar9.m();
            poyVar9.c = false;
        }
        pam pamVar11 = (pam) poyVar9.b;
        pbaVar.getClass();
        pamVar11.F = pbaVar;
        pamVar11.b |= 128;
        poy poyVar10 = fjxVar.a;
        if (poyVar10.c) {
            poyVar10.m();
            poyVar10.c = false;
        }
        pam pamVar12 = (pam) poyVar10.b;
        pamVar12.b |= 256;
        pamVar12.G = z2;
        poy poyVar11 = fjxVar.a;
        if (poyVar11.c) {
            poyVar11.m();
            poyVar11.c = false;
        }
        pam pamVar13 = (pam) poyVar11.b;
        pamVar13.b |= 512;
        pamVar13.H = z3;
        pbt pbtVar = fkbVar.m;
        poy poyVar12 = fjxVar.a;
        if (poyVar12.c) {
            poyVar12.m();
            poyVar12.c = false;
        }
        pam pamVar14 = (pam) poyVar12.b;
        pbtVar.getClass();
        pamVar14.J = pbtVar;
        pamVar14.b |= 2048;
        fjxVar.c(z4);
        poy poyVar13 = fjxVar.a;
        if (poyVar13.c) {
            poyVar13.m();
            poyVar13.c = false;
        }
        pam pamVar15 = (pam) poyVar13.b;
        pamVar15.b |= 4194304;
        pamVar15.R = z5;
        if (fkbVar.l.g()) {
            fjxVar.d((pcu) fkbVar.l.c());
        }
        if (pcsVar != null) {
            poy poyVar14 = fjxVar.a;
            if (poyVar14.c) {
                poyVar14.m();
                poyVar14.c = false;
            }
            pam pamVar16 = (pam) poyVar14.b;
            pamVar16.r = pcsVar;
            pamVar16.a |= 2097152;
        }
        if (list != null) {
            Rect rect = fkbVar.h;
            poy poyVar15 = fjxVar.a;
            if (poyVar15.c) {
                poyVar15.m();
                poyVar15.c = false;
            }
            ((pam) poyVar15.b).l = pam.A();
            Iterator it = list.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                hjy hjyVar = (hjy) it.next();
                float f3 = hjyVar.k;
                if (!(f3 == 0.0f && hjyVar.j == 0.0f && hjyVar.l == 0.0f) && Math.abs(f3) <= 5.0f && Math.abs(hjyVar.j) <= 10.0f) {
                    poy poyVar16 = fjxVar.a;
                    Rect rect2 = hjyVar.a;
                    poy poyVarM2 = pbf.i.m();
                    Iterator it2 = it;
                    float f4 = rect2.left;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pbf pbfVar = (pbf) poyVarM2.b;
                    pbfVar.a |= 1;
                    pbfVar.b = f4;
                    float f5 = rect2.top;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pbf pbfVar2 = (pbf) poyVarM2.b;
                    pbfVar2.a |= 4;
                    pbfVar2.d = f5;
                    float f6 = rect2.right;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pbf pbfVar3 = (pbf) poyVarM2.b;
                    pbfVar3.a |= 2;
                    pbfVar3.c = f6;
                    float f7 = rect2.bottom;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pbf pbfVar4 = (pbf) poyVarM2.b;
                    int i7 = pbfVar4.a | 8;
                    pbfVar4.a = i7;
                    pbfVar4.e = f7;
                    int i8 = hjyVar.b;
                    pbfVar4.a = i7 | 64;
                    pbfVar4.h = i8;
                    if (rect != null) {
                        float f8 = rect.right;
                        if (poyVarM2.c) {
                            poyVarM2.m();
                            poyVarM2.c = false;
                        }
                        pbf pbfVar5 = (pbf) poyVarM2.b;
                        pbfVar5.a |= 16;
                        pbfVar5.f = f8;
                        float f9 = rect.bottom;
                        if (poyVarM2.c) {
                            poyVarM2.m();
                            poyVarM2.c = false;
                        }
                        pbf pbfVar6 = (pbf) poyVarM2.b;
                        pbfVar6.a |= 32;
                        pbfVar6.g = f9;
                    }
                    pbf pbfVar7 = (pbf) poyVarM2.j();
                    if (poyVar16.c) {
                        poyVar16.m();
                        poyVar16.c = false;
                    }
                    pam pamVar17 = (pam) poyVar16.b;
                    pbfVar7.getClass();
                    ppm ppmVar = pamVar17.l;
                    if (!ppmVar.c()) {
                        pamVar17.l = ppd.B(ppmVar);
                    }
                    pamVar17.l.add(pbfVar7);
                    i6++;
                    if (i6 >= 5) {
                        break;
                    } else {
                        it = it2;
                    }
                } else {
                    it = it;
                }
            }
        }
        if (dzxVar != null) {
            poy poyVar17 = fjxVar.a;
            pbv pbvVar = dzxVar.a;
            if (poyVar17.c) {
                poyVar17.m();
                poyVar17.c = false;
            }
            pam pamVar18 = (pam) poyVar17.b;
            pbvVar.getClass();
            pamVar18.o = pbvVar;
            pamVar18.a |= 16384;
        }
        if (l2 != null) {
            poy poyVarM3 = pem.B.m();
            long jLongValue2 = l2.longValue();
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            pem pemVar = (pem) poyVarM3.b;
            pemVar.a |= 2;
            pemVar.c = jLongValue2;
            fjxVar.f((pem) poyVarM3.j());
        }
        if (num != null) {
            int iIntValue = num.intValue();
            poy poyVar18 = fjxVar.a;
            if (poyVar18.c) {
                poyVar18.m();
                poyVar18.c = false;
            }
            pam pamVar19 = (pam) poyVar18.b;
            pamVar19.a |= 33554432;
            pamVar19.s = iIntValue;
        }
        if (pcwVar != null) {
            poy poyVar19 = fjxVar.a;
            if (poyVar19.c) {
                poyVar19.m();
                poyVar19.c = false;
            }
            pam pamVar20 = (pam) poyVar19.b;
            pamVar20.u = pcwVar;
            pamVar20.a |= 134217728;
        }
        if (pbhVar != null) {
            poy poyVar20 = fjxVar.a;
            if (poyVar20.c) {
                poyVar20.m();
                poyVar20.c = false;
            }
            pam pamVar21 = (pam) poyVar20.b;
            pamVar21.v = pbhVar;
            pamVar21.a |= 268435456;
        }
        if (pdnVar != null) {
            poy poyVar21 = fjxVar.a;
            if (poyVar21.c) {
                poyVar21.m();
                poyVar21.c = false;
            }
            pam pamVar22 = (pam) poyVar21.b;
            pamVar22.w = pdnVar;
            pamVar22.a |= 536870912;
        }
        if (pbgVar != null) {
            poy poyVar22 = fjxVar.a;
            if (poyVar22.c) {
                poyVar22.m();
                poyVar22.c = false;
            }
            pam pamVar23 = (pam) poyVar22.b;
            pamVar23.y = pbgVar;
            pamVar23.a |= Integer.MIN_VALUE;
        }
        if (ozrVar != null) {
            poy poyVar23 = fjxVar.a;
            if (poyVar23.c) {
                poyVar23.m();
                poyVar23.c = false;
            }
            pam pamVar24 = (pam) poyVar23.b;
            pamVar24.D = ozrVar;
            pamVar24.b |= 32;
        }
        if (ozuVar != null) {
            poy poyVar24 = fjxVar.a;
            if (poyVar24.c) {
                poyVar24.m();
                poyVar24.c = false;
            }
            pam pamVar25 = (pam) poyVar24.b;
            pamVar25.M = ozuVar;
            pamVar25.b |= 32768;
        }
        if (ozsVar != null) {
            poy poyVar25 = fjxVar.a;
            if (poyVar25.c) {
                poyVar25.m();
                poyVar25.c = false;
            }
            pam pamVar26 = (pam) poyVar25.b;
            pamVar26.N = ozsVar;
            pamVar26.b |= 65536;
        }
        if (pbjVar != null) {
            poy poyVar26 = fjxVar.a;
            if (poyVar26.c) {
                poyVar26.m();
                poyVar26.c = false;
            }
            pam pamVar27 = (pam) poyVar26.b;
            pamVar27.P = pbjVar;
            pamVar27.b |= 262144;
        }
        if (pdbVar != null) {
            poy poyVar27 = fjxVar.a;
            if (poyVar27.c) {
                poyVar27.m();
                poyVar27.c = false;
            }
            pam pamVar28 = (pam) poyVar27.b;
            pamVar28.Q = pdbVar;
            pamVar28.b |= 2097152;
        }
        int i9 = this.A;
        if (i9 != 1) {
            fjxVar.h(i9);
            this.A = 1;
        }
        if (l4 != null) {
            poy poyVarM4 = pas.m.m();
            long jLongValue3 = l4.longValue();
            if (poyVarM4.c) {
                poyVarM4.m();
                poyVarM4.c = false;
            }
            pas pasVar = (pas) poyVarM4.b;
            pasVar.a |= 1;
            pasVar.b = jLongValue3;
            pas pasVar2 = (pas) poyVarM4.j();
            poy poyVar28 = fjxVar.a;
            if (poyVar28.c) {
                poyVar28.m();
                poyVar28.c = false;
            }
            pam pamVar29 = (pam) poyVar28.b;
            pasVar2.getClass();
            pamVar29.q = pasVar2;
            pamVar29.a |= 524288;
        }
        if (petVar != null) {
            poy poyVar29 = fjxVar.a;
            if (poyVar29.c) {
                poyVar29.m();
                poyVar29.c = false;
            }
            pam pamVar30 = (pam) poyVar29.b;
            pamVar30.L = petVar;
            pamVar30.b |= 8192;
        }
        ay(fjxVar);
    }

    @Override // defpackage.fjs
    public final void at(int i, long j, long j2, float f, boolean z) {
        fjx fjxVar = new fjx(23, false);
        fjxVar.g(1.0f);
        poy poyVarM = pbx.h.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbx pbxVar = (pbx) poyVarM.b;
        pbxVar.b = i - 1;
        int i2 = pbxVar.a | 1;
        pbxVar.a = i2;
        int i3 = i2 | 256;
        pbxVar.a = i3;
        pbxVar.f = j;
        int i4 = i3 | 512;
        pbxVar.a = i4;
        pbxVar.g = j2;
        int i5 = i4 | 64;
        pbxVar.a = i5;
        pbxVar.d = z;
        pbxVar.e = 2;
        int i6 = i5 | 128;
        pbxVar.a = i6;
        pbxVar.a = i6 | 32;
        pbxVar.c = f;
        pbx pbxVar2 = (pbx) poyVarM.j();
        if (pbxVar2 != null) {
            poy poyVar = fjxVar.a;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pam pamVar = (pam) poyVar.b;
            pam pamVar2 = pam.T;
            pamVar.x = pbxVar2;
            pamVar.a |= 1073741824;
        }
        ay(fjxVar);
    }

    @Override // defpackage.fjs
    public final void au() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.EDUCATION_TOAST_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pej.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pej pejVar = (pej) poyVarM2.b;
        pejVar.b = 1;
        pejVar.a = 1 | pejVar.a;
        pej pejVar2 = (pej) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pejVar2.getClass();
        pacVar2.Z = pejVar2;
        pacVar2.b |= 536870912;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void av(int i, int i2, float f) {
        poy poyVarM = pdi.f.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdi pdiVar = (pdi) poyVarM.b;
        int i3 = pdiVar.a | 2;
        pdiVar.a = i3;
        pdiVar.b = i;
        int i4 = i3 | 4;
        pdiVar.a = i4;
        pdiVar.c = i2;
        int i5 = i4 | 8;
        pdiVar.a = i5;
        pdiVar.d = f;
        pdiVar.e = 3;
        pdiVar.a = i5 | 16;
        U(6, (pdi) poyVarM.j(), null, null, null);
    }

    @Override // defpackage.fjs
    public final void aw() {
        this.z = 2;
    }

    @Override // defpackage.lvw
    public final void ax(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lvu lvuVar = (lvu) it.next();
            S(11, null, null, 0, 0, 0, oom.l(), oom.m(lvuVar.a), lju.b(lvuVar), false);
        }
    }

    public final void ay(fjx fjxVar) {
        this.g.register();
        this.t.execute(new iiv(this, fjxVar));
    }

    @Override // defpackage.lkm
    public final void az(int i, lju ljuVar, String str, int i2) {
        int iY = oxh.Y(i - 1);
        int iX = oxh.X(i2 - 1);
        if (iX == 0) {
            iX = 1;
        }
        if (iY == 0) {
            iY = 3;
        }
        poy poyVarM = pdd.f.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdd pddVar = (pdd) poyVarM.b;
        pddVar.b = iY - 1;
        int i3 = pddVar.a | 1;
        pddVar.a = i3;
        int i4 = ljuVar.u;
        int i5 = i3 | 2;
        pddVar.a = i5;
        pddVar.c = i4;
        pddVar.e = iX - 1;
        int i6 = i5 | 8;
        pddVar.a = i6;
        if (str != null) {
            pddVar.a = i6 | 4;
            pddVar.d = str;
        }
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.OPEN_DEVICE_RETRY;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pdd pddVar2 = (pdd) poyVarM.j();
        pddVar2.getClass();
        pacVar.r = pddVar2;
        pacVar.a |= 262144;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void b(int i, int i2, int i3, int i4) {
        poy poyVarM = pbd.f.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbd pbdVar = (pbd) poyVarM.b;
        int i5 = pbdVar.a | 1;
        pbdVar.a = i5;
        pbdVar.b = i;
        int i6 = i5 | 2;
        pbdVar.a = i6;
        pbdVar.c = i2;
        int i7 = i6 | 4;
        pbdVar.a = i7;
        pbdVar.d = i3;
        pbdVar.a = i7 | 8;
        pbdVar.e = i4;
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.CAMERA_FATAL_ERROR_COUNTS_EVENT;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM3 = pae.d.m();
        pbd pbdVar2 = (pbd) poyVarM.j();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pae paeVar = (pae) poyVarM3.b;
        pbdVar2.getClass();
        paeVar.c = pbdVar2;
        paeVar.a |= 2;
        pae paeVar2 = (pae) poyVarM3.j();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar2 = (pac) poyVarM2.b;
        paeVar2.getClass();
        pacVar2.aa = paeVar2;
        pacVar2.b |= 1073741824;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void c(String str, int i, int i2, int i3, int i4, int i5, long j) {
        poy poyVarM = pbk.i.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbk pbkVar = (pbk) poyVarM.b;
        str.getClass();
        int i6 = pbkVar.a | 1;
        pbkVar.a = i6;
        pbkVar.b = str;
        int i7 = i6 | 2;
        pbkVar.a = i7;
        pbkVar.c = i;
        int i8 = i7 | 4;
        pbkVar.a = i8;
        pbkVar.d = i2;
        int i9 = i8 | 8;
        pbkVar.a = i9;
        pbkVar.e = i3;
        int i10 = i9 | 16;
        pbkVar.a = i10;
        pbkVar.f = i4;
        int i11 = i10 | 32;
        pbkVar.a = i11;
        pbkVar.g = i5;
        pbkVar.a = i11 | 64;
        pbkVar.h = j;
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.CAMERA_FATAL_ERROR_COUNTS_EVENT;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM3 = pae.d.m();
        pbk pbkVar2 = (pbk) poyVarM.j();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pae paeVar = (pae) poyVarM3.b;
        pbkVar2.getClass();
        paeVar.b = pbkVar2;
        paeVar.a |= 1;
        pae paeVar2 = (pae) poyVarM3.j();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar2 = (pac) poyVarM2.b;
        paeVar2.getClass();
        pacVar2.aa = paeVar2;
        pacVar2.b |= 1073741824;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void d(boolean z, PointF pointF) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CONTROL_USED;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pbl.d.m();
        int i = true != z ? 3 : 2;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pbl pblVar = (pbl) poyVarM2.b;
        pblVar.b = i - 1;
        pblVar.a |= 1;
        pei peiVarAE = aE(pointF);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pbl pblVar2 = (pbl) poyVarM2.b;
        peiVarAE.getClass();
        pblVar2.c = peiVarAE;
        pblVar2.a |= 2;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pbl pblVar3 = (pbl) poyVarM2.j();
        pblVar3.getClass();
        pacVar2.I = pblVar3;
        pacVar2.b |= 2048;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void e(boolean z, PointF pointF, long j, int i, int i2) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CONTROL_USED;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pbm.g.m();
        int i3 = true != z ? 3 : 2;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pbm pbmVar = (pbm) poyVarM2.b;
        pbmVar.b = i3 - 1;
        pbmVar.a |= 1;
        pei peiVarAE = aE(pointF);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pbm pbmVar2 = (pbm) poyVarM2.b;
        peiVarAE.getClass();
        pbmVar2.c = peiVarAE;
        int i4 = pbmVar2.a | 2;
        pbmVar2.a = i4;
        pbmVar2.a = i4 | 4;
        pbmVar2.d = j;
        int iAd = oxh.ad(i2);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pbm pbmVar3 = (pbm) poyVarM2.b;
        int i5 = iAd - 1;
        if (iAd == 0) {
            throw null;
        }
        pbmVar3.e = i5;
        int i6 = pbmVar3.a | 16;
        pbmVar3.a = i6;
        pbmVar3.a = i6 | 32;
        pbmVar3.f = i;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pbm pbmVar4 = (pbm) poyVarM2.j();
        pbmVar4.getClass();
        pacVar2.J = pbmVar4;
        pacVar2.b |= 4096;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void f(boolean z) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.FREQUENT_FACE_PREFERENCE_CHANGE_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pbu.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pbu pbuVar = (pbu) poyVarM2.b;
        pbuVar.a |= 1;
        pbuVar.b = z;
        pbu pbuVar2 = (pbu) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pbuVar2.getClass();
        pacVar2.U = pbuVar2;
        pacVar2.b |= 16777216;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void g(pbz pbzVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.INFLIGHT_FALLBACK_RESTORED_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pbzVar.getClass();
        pacVar.P = pbzVar;
        pacVar.b |= 262144;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void h() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.PREFERENCES_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pds.d.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pds pdsVar = (pds) poyVarM2.b;
        pdsVar.b = 1;
        int i = pdsVar.a | 1;
        pdsVar.a = i;
        pdsVar.c = 1;
        pdsVar.a = i | 2;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pds pdsVar2 = (pds) poyVarM2.j();
        pdsVar2.getClass();
        pacVar2.A = pdsVar2;
        pacVar2.a |= 1073741824;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void i() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.PREFERENCES_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pds.d.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pds pdsVar = (pds) poyVarM2.b;
        pdsVar.b = 2;
        int i = pdsVar.a | 1;
        pdsVar.a = i;
        pdsVar.c = 1;
        pdsVar.a = i | 2;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pds pdsVar2 = (pds) poyVarM2.j();
        pdsVar2.getClass();
        pacVar2.A = pdsVar2;
        pacVar2.a |= 1073741824;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void j() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CAMERA_FAILURE;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pad.m.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pad padVar = (pad) poyVarM2.b;
        padVar.b = 8;
        int i = padVar.a | 1;
        padVar.a = i;
        String str = this.e;
        str.getClass();
        padVar.a = i | 4;
        padVar.d = str;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pad padVar2 = (pad) poyVarM2.j();
        padVar2.getClass();
        pacVar2.j = padVar2;
        pacVar2.a |= 128;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void k() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.ADVICE_SHOWN;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = ozp.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        ozp ozpVar = (ozp) poyVarM2.b;
        ozpVar.b = 1;
        ozpVar.a = 1 | ozpVar.a;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        ozp ozpVar2 = (ozp) poyVarM2.j();
        ozpVar2.getClass();
        pacVar2.D = ozpVar2;
        pacVar2.b |= 8;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void l() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.ADVICE_SHOWN;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = ozp.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        ozp ozpVar = (ozp) poyVarM2.b;
        ozpVar.b = 4;
        ozpVar.a |= 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        ozp ozpVar2 = (ozp) poyVarM2.j();
        ozpVar2.getClass();
        pacVar2.D = ozpVar2;
        pacVar2.b |= 8;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void m() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.ADVICE_HEEDED;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = ozo.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        ozo ozoVar = (ozo) poyVarM2.b;
        ozoVar.b = 4;
        ozoVar.a |= 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        ozo ozoVar2 = (ozo) poyVarM2.j();
        ozoVar2.getClass();
        pacVar2.W = ozoVar2;
        pacVar2.b |= 67108864;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void n(boolean z, float f, jrl jrlVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.CATSHARK_TOGGLE_CHANGE_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pau.e.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pau pauVar = (pau) poyVarM2.b;
        int i = pauVar.a | 1;
        pauVar.a = i;
        pauVar.b = z;
        pauVar.a = i | 2;
        pauVar.c = f;
        int iF = jri.f(jrlVar);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pau pauVar2 = (pau) poyVarM2.b;
        pauVar2.d = iF - 1;
        pauVar2.a |= 4;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pau pauVar3 = (pau) poyVarM2.j();
        pauVar3.getClass();
        pacVar2.af = pauVar3;
        pacVar2.c |= 8;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void o(ozy ozyVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.BOTTOM_SHEET_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        ozyVar.getClass();
        pacVar.ak = ozyVar;
        pacVar.c |= 512;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void p(String str, Object obj, Object obj2) {
        poy poyVarM = pdr.h.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pdr pdrVar = (pdr) poyVarM.b;
        str.getClass();
        int i = pdrVar.a | 2;
        pdrVar.a = i;
        pdrVar.c = str;
        if (obj2 instanceof Boolean) {
            pdrVar.b = 1;
            pdrVar.a = i | 1;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pdr pdrVar2 = (pdr) poyVarM.b;
            pdrVar2.a |= 4;
            pdrVar2.d = zBooleanValue;
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pdr pdrVar3 = (pdr) poyVarM.b;
            pdrVar3.a |= 8;
            pdrVar3.e = zBooleanValue2;
        } else if (obj2 instanceof String) {
            pdrVar.b = 2;
            int i2 = i | 1;
            pdrVar.a = i2;
            String str2 = (String) obj;
            str2.getClass();
            int i3 = i2 | 16;
            pdrVar.a = i3;
            pdrVar.f = str2;
            String str3 = (String) obj2;
            str3.getClass();
            pdrVar.a = i3 | 32;
            pdrVar.g = str3;
        }
        poy poyVarM2 = pac.aq.m();
        pab pabVar = pab.PREFERENCE_CHANGE_EVENT;
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pac pacVar = (pac) poyVarM2.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pdr pdrVar4 = (pdr) poyVarM.j();
        pdrVar4.getClass();
        pacVar.E = pdrVar4;
        pacVar.b |= 16;
        aA(poyVarM2);
    }

    @Override // defpackage.fjs
    public final void q(long j, fjz fjzVar) {
        poy poyVarM = paa.c.m();
        int iAH = aH(fjzVar.a);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        paa paaVar = (paa) poyVarM.b;
        paaVar.b = iAH - 1;
        paaVar.a |= 2;
        paa paaVar2 = (paa) poyVarM.j();
        poy poyVarM2 = par.h.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        par parVar = (par) poyVarM2.b;
        int i = parVar.a | 2;
        parVar.a = i;
        parVar.c = j;
        paaVar2.getClass();
        parVar.b = paaVar2;
        parVar.a = i | 1;
        int iEN = mip.eN(fjzVar.a);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        par parVar2 = (par) poyVarM2.b;
        parVar2.d = iEN - 1;
        parVar2.a |= 4;
        pcw pcwVar = fjzVar.b;
        if (pcwVar != null) {
            int iZ = oxh.Z(pcwVar.h);
            if (iZ == 0) {
                iZ = 1;
            }
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            par parVar3 = (par) poyVarM2.b;
            parVar3.e = iZ - 1;
            parVar3.a |= 8;
        }
        if (fjzVar.a == hsr.LONG_SHOT) {
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            par parVar4 = (par) poyVarM2.b;
            parVar4.f = 4;
            parVar4.a |= 16;
        } else if (pcwVar != null) {
            int iAa = oxh.aa(pcwVar.l);
            if (iAa == 0) {
                iAa = 1;
            }
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            par parVar5 = (par) poyVarM2.b;
            parVar5.f = iAa - 1;
            parVar5.a |= 16;
        }
        Float f = fjzVar.c;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            par parVar6 = (par) poyVarM2.b;
            parVar6.a |= 32;
            parVar6.g = fFloatValue;
        }
        poy poyVarM3 = pac.aq.m();
        pab pabVar = pab.CAPTURE_PROFILE_START;
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pac pacVar = (pac) poyVarM3.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        par parVar7 = (par) poyVarM2.j();
        parVar7.getClass();
        pacVar.n = parVar7;
        pacVar.a |= 16384;
        aA(poyVarM3);
        aB(4, "onCaptureStarted", j, paaVar2);
    }

    @Override // defpackage.fjs
    public final void r(int i) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.DUAL_FUSION_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pbb.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pbb pbbVar = (pbb) poyVarM2.b;
        pbbVar.a |= 1;
        pbbVar.b = i;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pbb pbbVar2 = (pbb) poyVarM2.j();
        pbbVar2.getClass();
        pacVar2.ao = pbbVar2;
        pacVar2.c |= 8192;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void s(pcj pcjVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.LENS_SUGGESTION_CHIP_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pcjVar.getClass();
        pacVar.ap = pcjVar;
        pacVar.c |= 16384;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void t(pco pcoVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.LENSLITE_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pcoVar.getClass();
        pacVar.S = pcoVar;
        pacVar.b |= 4194304;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void u(pcy pcyVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.MODE_SWITCH_ANIMATION_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        pcyVar.getClass();
        pacVar.O = pcyVar;
        pacVar.b |= 131072;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void v(gtv gtvVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.OPTIONBAR_OPTION_CHANGE_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pdf.c.m();
        pde pdeVar = (pde) this.B.a.get(gtvVar);
        pdeVar.getClass();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pdf pdfVar = (pdf) poyVarM2.b;
        pdfVar.b = pdeVar.ay;
        pdfVar.a |= 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pdf pdfVar2 = (pdf) poyVarM2.j();
        pdfVar2.getClass();
        pacVar2.Q = pdfVar2;
        pacVar2.b |= 524288;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void w() {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.ADVICE_SHOWN;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = ozp.c.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        ozp ozpVar = (ozp) poyVarM2.b;
        ozpVar.b = 2;
        ozpVar.a |= 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        ozp ozpVar2 = (ozp) poyVarM2.j();
        ozpVar2.getClass();
        pacVar2.D = ozpVar2;
        pacVar2.b |= 8;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void x(boolean z) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!this.r && z) {
            long j = this.s;
            if (j != 0) {
                poy poyVarM = pac.aq.m();
                pab pabVar = pab.BLOCK_SHOT;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pac pacVar = (pac) poyVarM.b;
                pacVar.d = pabVar.an;
                pacVar.a |= 1;
                poy poyVarM2 = ozw.e.m();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ozw ozwVar = (ozw) poyVarM2.b;
                int i = ozwVar.a | 1;
                ozwVar.a = i;
                ozwVar.b = j;
                int i2 = i | 2;
                ozwVar.a = i2;
                ozwVar.c = jElapsedRealtimeNanos;
                int i3 = this.x;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                ozwVar.d = i4;
                ozwVar.a = i2 | 4;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pac pacVar2 = (pac) poyVarM.b;
                ozw ozwVar2 = (ozw) poyVarM2.j();
                ozwVar2.getClass();
                pacVar2.t = ozwVar2;
                pacVar2.a |= 1048576;
                aA(poyVarM);
            }
        }
        this.s = jElapsedRealtimeNanos;
        this.r = z;
    }

    @Override // defpackage.fjs
    public final void y(long j, List list) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.SLOW_PROCESSING_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        poy poyVarM2 = pdx.d.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        pdx pdxVar = (pdx) poyVarM2.b;
        pdxVar.a |= 1;
        pdxVar.b = j;
        ppm ppmVar = pdxVar.c;
        if (!ppmVar.c()) {
            pdxVar.c = ppd.B(ppmVar);
        }
        pnl.e(list, pdxVar.c);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar2 = (pac) poyVarM.b;
        pdx pdxVar2 = (pdx) poyVarM2.j();
        pdxVar2.getClass();
        pacVar2.K = pdxVar2;
        pacVar2.b |= 8192;
        aA(poyVarM);
    }

    @Override // defpackage.fjs
    public final void z(pee peeVar) {
        poy poyVarM = pac.aq.m();
        pab pabVar = pab.THERMAL_EVENT;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pac pacVar = (pac) poyVarM.b;
        pacVar.d = pabVar.an;
        pacVar.a |= 1;
        peeVar.getClass();
        pacVar.F = peeVar;
        pacVar.b |= 256;
        aA(poyVarM);
    }
}
