package defpackage;

import android.media.MediaCodec;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cgs implements lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/VideoRecorderProvider");
    public pht b;
    public cmz c;
    public final Object d = new Object();
    private final cnd e;
    private final cka f;
    private final ckh g;
    private final ljf h;

    public cgs(cfi cfiVar, cka ckaVar, ckh ckhVar, ljf ljfVar) {
        this.e = cfiVar.c;
        this.f = ckaVar;
        this.g = ckhVar;
        this.h = ljfVar;
    }

    private final void c() {
        synchronized (this.d) {
            cmz cmzVar = this.c;
            if (cmzVar != null) {
                cmzVar.close();
                this.c = null;
            }
            pht phtVar = this.b;
            if (phtVar != null) {
                phtVar.cancel(true);
                this.b = null;
            }
        }
    }

    public final cmz a(ckd ckdVar) {
        cmz cmzVar;
        try {
            try {
                this.h.e("VRP#getNew");
                synchronized (this.d) {
                    cmzVar = (cmz) b(ckdVar).get();
                }
                this.h.f();
                return cmzVar;
            } catch (Throwable th) {
                this.h.f();
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G(386)).o("Error creating video recorder: ");
            this.h.f();
            return null;
        }
    }

    final pht b(final ckd ckdVar) {
        pht phtVar;
        synchronized (this.d) {
            c();
            final cnd cndVar = this.e;
            final ckh ckhVar = this.g;
            final cju cjuVarA = this.f.a();
            synchronized (cndVar.o) {
                if (cndVar.r) {
                    cndVar.r = false;
                    cndVar.u.k(cms.VIDEO_RECORDER).c(cndVar);
                    cndVar.q = ((cnq) cndVar.b).get();
                }
            }
            pht phtVarAa = plk.aa(new pgj() { // from class: cnc
                /* JADX WARN: Code duplicated, block: B:102:0x02ce A[Catch: Exception -> 0x0391, all -> 0x03a0, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001c, B:10:0x0028, B:23:0x0095, B:25:0x009b, B:27:0x00a1, B:29:0x00bb, B:31:0x00dc, B:33:0x00e2, B:37:0x00f5, B:39:0x00fb, B:40:0x0102, B:42:0x0108, B:43:0x0110, B:45:0x011a, B:46:0x011c, B:50:0x0129, B:55:0x0153, B:57:0x018e, B:59:0x0198, B:66:0x01be, B:67:0x01c7, B:82:0x0212, B:84:0x0216, B:86:0x021e, B:88:0x024c, B:89:0x0271, B:91:0x0279, B:93:0x0287, B:106:0x02e8, B:108:0x0300, B:109:0x032e, B:110:0x035b, B:111:0x0374, B:94:0x0294, B:96:0x02a0, B:98:0x02a4, B:99:0x02b7, B:101:0x02bb, B:102:0x02ce, B:104:0x02d4, B:128:0x0397, B:129:0x039c, B:87:0x023e, B:132:0x039f, B:62:0x01a4, B:28:0x00b9, B:11:0x002b, B:13:0x002f, B:15:0x0033, B:17:0x0043, B:19:0x004b, B:21:0x0053, B:22:0x0093, B:51:0x012c, B:53:0x0134, B:54:0x0142, B:68:0x01c8, B:70:0x01d2, B:71:0x01d8, B:73:0x01da, B:77:0x01e0, B:79:0x01e7, B:80:0x0204, B:81:0x0211), top: B:139:0x0017, outer: #1, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:104:0x02d4 A[Catch: Exception -> 0x0391, all -> 0x03a0, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001c, B:10:0x0028, B:23:0x0095, B:25:0x009b, B:27:0x00a1, B:29:0x00bb, B:31:0x00dc, B:33:0x00e2, B:37:0x00f5, B:39:0x00fb, B:40:0x0102, B:42:0x0108, B:43:0x0110, B:45:0x011a, B:46:0x011c, B:50:0x0129, B:55:0x0153, B:57:0x018e, B:59:0x0198, B:66:0x01be, B:67:0x01c7, B:82:0x0212, B:84:0x0216, B:86:0x021e, B:88:0x024c, B:89:0x0271, B:91:0x0279, B:93:0x0287, B:106:0x02e8, B:108:0x0300, B:109:0x032e, B:110:0x035b, B:111:0x0374, B:94:0x0294, B:96:0x02a0, B:98:0x02a4, B:99:0x02b7, B:101:0x02bb, B:102:0x02ce, B:104:0x02d4, B:128:0x0397, B:129:0x039c, B:87:0x023e, B:132:0x039f, B:62:0x01a4, B:28:0x00b9, B:11:0x002b, B:13:0x002f, B:15:0x0033, B:17:0x0043, B:19:0x004b, B:21:0x0053, B:22:0x0093, B:51:0x012c, B:53:0x0134, B:54:0x0142, B:68:0x01c8, B:70:0x01d2, B:71:0x01d8, B:73:0x01da, B:77:0x01e0, B:79:0x01e7, B:80:0x0204, B:81:0x0211), top: B:139:0x0017, outer: #1, inners: #3 }] */
                /* JADX WARN: Code duplicated, block: B:105:0x02e7  */
                @Override // defpackage.pgj
                public final pht a() {
                    lfk lhjVar;
                    int i;
                    Surface surface;
                    int iIntValue;
                    cmz cmzVar;
                    pht phtVarV;
                    ojc ojcVarI;
                    ojc ojcVarI2;
                    cnd cndVar2 = cndVar;
                    ckh ckhVar2 = ckhVar;
                    ckd ckdVar2 = ckdVar;
                    cju cjuVar = cjuVarA;
                    synchronized (cndVar2.o) {
                        cndVar2.a.e("VideoRecorderFactory#CreateVideoRecorder");
                        synchronized (cndVar2.o) {
                            boolean z = true;
                            if (ckdVar2.B) {
                                ojc ojcVar = cndVar2.c;
                                cid cidVar = cndVar2.t;
                                if (ckdVar2.i.g() && cidVar.a && ckdVar2.D && ((cik) cidVar.b.fA()).equals(cik.ON) && cidVar.d.g() && cidVar.c.g()) {
                                    ihb ihbVar = (ihb) cidVar.d.c();
                                    int i2 = ((lee) ckdVar2.i.c()).c;
                                    int i3 = ((lee) ckdVar2.i.c()).e;
                                    ojcVarI = ojc.i(new ige(ihbVar, i2, i3, new cjd(i2 * i3 * ldx.ENCODING_PCM_16BIT.f * 8, Integer.MAX_VALUE)));
                                } else {
                                    ojcVarI = oih.a;
                                }
                                if (ojcVar.g() && ojcVarI.g()) {
                                    ojcVarI2 = ojc.i(new cja((ige) ojcVarI.c(), ((cit) ojcVar.c()).a));
                                } else {
                                    ojcVarI2 = oih.a;
                                }
                                phv phvVar = cndVar2.d;
                                cmm cmmVar = cndVar2.h;
                                cmmVar.b();
                                Handler handler = cmmVar.a;
                                handler.getClass();
                                lgz lgzVar = new lgz(phvVar, handler, cndVar2.a);
                                lgzVar.l = cndVar2.k;
                                lgzVar.q = (!cndVar2.m.k(dcu.af) || ojcVarI2.g() || ((hth) cjuVar.q.fA()).equals(hth.PHONE)) ? false : true;
                                if (ckdVar2.C) {
                                    lgzVar.m.add(cndVar2.n);
                                }
                                if (ojcVarI2.g()) {
                                    lgzVar.v = (lxm) ojcVarI2.c();
                                }
                                if (cndVar2.m.k(dcu.P)) {
                                    lgzVar.n = true;
                                }
                                lgzVar.f = true != cndVar2.m.k(dcu.ae) ? 2 : 1;
                                lhjVar = lgzVar;
                            } else {
                                if (!cndVar2.p.g()) {
                                    cndVar2.p = ojc.i(((cnz) cndVar2.g).get());
                                }
                                lhjVar = new lhj((lhd) cndVar2.p.c(), cndVar2.d, ckhVar2.g);
                            }
                            leh lehVar = ckdVar2.h;
                            lfl lflVar = cndVar2.q;
                            lflVar.getClass();
                            lfk lfkVarB = lhjVar.b(lflVar);
                            lfkVarB.r(lehVar);
                            lfkVarB.c((lee) ckdVar2.i.f());
                            lfkVarB.k(((Long) ckdVar2.l.e(Long.MAX_VALUE)).longValue());
                            if (cndVar2.m.k(dcu.I) && ckdVar2.e.equals(leb.RES_2160P) && ckdVar2.d.equals(ldz.FPS_60)) {
                                i = 2;
                            } else {
                                lfl lflVar2 = cndVar2.q;
                                lflVar2.getClass();
                                i = true != ((hth) ((cnp) lflVar2).a.fA()).equals(hth.EXT_BLUETOOTH) ? 6 : 2;
                            }
                            lfkVarB.d(i);
                            csh cshVar = ckhVar2.d;
                            leb lebVar = ckdVar2.e;
                            synchronized (cshVar.b) {
                                ojc ojcVarA = cshVar.a(lebVar);
                                if (ojcVarA.g()) {
                                    surface = (Surface) ojcVarA.c();
                                } else {
                                    if (cshVar.c != null) {
                                        z = false;
                                    }
                                    obr.aQ(z);
                                    if (cshVar.d != null) {
                                        ((oug) ((oug) csh.a.c()).G(629)).o("Pending surface exists, release it first before creating new one.");
                                        Surface surface2 = cshVar.d;
                                        surface2.getClass();
                                        surface2.release();
                                    }
                                    mip mipVar = cshVar.e;
                                    cshVar.d = MediaCodec.createPersistentInputSurface();
                                    surface = cshVar.d;
                                    surface.getClass();
                                }
                            }
                            lhjVar.g(surface);
                            ckt cktVar = null;
                            try {
                                if (ckdVar2.j.g()) {
                                    ParcelFileDescriptor parcelFileDescriptor = nhy.a(ckhVar2.b, (Uri) ckdVar2.j.c(), "rw").getParcelFileDescriptor();
                                    cvh cvhVar = cndVar2.j;
                                    parcelFileDescriptor.getClass();
                                    cndVar2.s = cvhVar.a(parcelFileDescriptor);
                                } else {
                                    cndVar2.s = cndVar2.j.b(ckdVar2.h.a.f);
                                }
                                cle cleVar = cndVar2.s;
                                cleVar.getClass();
                                lhjVar.p(cleVar.e());
                                cks cksVarA = ckt.a();
                                cle cleVar2 = cndVar2.s;
                                cleVar2.getClass();
                                cksVarA.b(cleVar2);
                                cksVarA.c(cndVar2.l.c());
                                ckt cktVarA = cksVarA.a();
                                try {
                                    if (!ckdVar2.k.g() || ((Integer) ckdVar2.k.c()).intValue() == 0) {
                                        cpj cpjVar = cndVar2.f;
                                        ldz ldzVar = lehVar.c;
                                        leb lebVar2 = lehVar.b;
                                        if (ldzVar.g()) {
                                            if (lebVar2 == leb.RES_2160P) {
                                                iIntValue = ((Integer) cpjVar.b.a(dcu.d).c()).intValue();
                                            } else if (lebVar2 == leb.RES_1080P) {
                                                iIntValue = ((Integer) cpjVar.b.a(dcu.c).c()).intValue();
                                            } else if (ldzVar.f()) {
                                                iIntValue = ((Integer) cpjVar.b.a(dcu.e).c()).intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                        } else if (ldzVar.f()) {
                                            iIntValue = ((Integer) cpjVar.b.a(dcu.e).c()).intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                    } else {
                                        iIntValue = ((Integer) ckdVar2.k.c()).intValue();
                                    }
                                    lhjVar.j(iIntValue * 1000);
                                    lhjVar.o(((Integer) ((lce) cjuVar.m).d).intValue());
                                    if (ckdVar2.m) {
                                        final bww bwwVarC = cndVar2.i.c();
                                        lhjVar.i(pfj.h(plk.ac(pgb.h(plk.W(bwwVarC.b), bxe.b, pgr.INSTANCE), bwwVarC.c, TimeUnit.MILLISECONDS, cndVar2.e), Exception.class, new oiu() { // from class: bwv
                                            @Override // defpackage.oiu
                                            public final Object a(Object obj) {
                                                ((oug) ((oug) bww.a.c()).G(145)).r("Failed to resolve %s, returning absent instead.", bwwVarC.b);
                                                return oih.a;
                                            }
                                        }, pgr.INSTANCE));
                                    }
                                    lhjVar.l(((Long) cndVar2.f.b.h(dcu.O).e(4000000000L)).longValue());
                                    lhjVar.s(cndVar2.f.b.k(dcu.D));
                                    cmzVar = new cmz(lhjVar.a(), cktVarA, (hth) cjuVar.q.fA(), (cik) cjuVar.r.fA());
                                } catch (Exception e) {
                                    e = e;
                                    cktVar = cktVarA;
                                    if (cktVar != null) {
                                        cktVar.a.close();
                                    }
                                    throw e;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        csh cshVar2 = ckhVar2.d;
                        synchronized (cshVar2.b) {
                            Surface surface3 = cshVar2.d;
                            if (surface3 != null) {
                                cshVar2.c = surface3;
                                cshVar2.d = null;
                            }
                        }
                        cndVar2.a.f();
                        phtVarV = plk.V(cmzVar);
                    }
                    return phtVarV;
                }
            }, cndVar.h.a());
            this.b = phtVarAa;
            plk.af(phtVarAa, new cgr(this), pgr.INSTANCE);
            phtVar = this.b;
        }
        return phtVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        c();
    }
}
