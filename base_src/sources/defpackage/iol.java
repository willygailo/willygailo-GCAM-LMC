package defpackage;

import android.content.Context;
import android.view.Surface;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class iol implements ldo {
    final /* synthetic */ ioq a;

    public iol(ioq ioqVar) {
        this.a = ioqVar;
    }

    @Override // defpackage.ldo
    public final void a(Exception exc) {
        ((oug) ((oug) ioq.a.b()).G((char) 3062)).r("Camcorder.onError(): %s", exc);
        synchronized (this.a.o) {
            this.a.E.clear();
            ipa ipaVar = this.a.ag;
            ipaVar.getClass();
            ((oug) ((oug) ipf.a.b()).G((char) 3074)).r("onRecordingError() %s", exc);
            ipaVar.g.j.fB(inr.STATE_RECORDING_ERROR);
            elw elwVar = ipaVar.d;
            jgv jgvVar = new jgv();
            Context context = ipaVar.e;
            jgvVar.f = context;
            jgvVar.i = 11;
            jgvVar.a = false;
            jgvVar.e = context.getString(R.string.vid_chip_err);
            jgvVar.h = ipaVar.f.k(ddl.ay);
            elwVar.d(jgvVar.a());
            ipaVar.g.i(true);
            ipaVar.a.c(new ioz(ipaVar.c, 0));
        }
    }

    @Override // defpackage.ldo
    public final void b() {
        ipa ipaVar = this.a.ag;
        ipaVar.getClass();
        ipaVar.g.j.fB(inr.STATE_RECORDING_PAUSE);
    }

    @Override // defpackage.ldo
    public final void c() {
        ipa ipaVar = this.a.ag;
        ipaVar.getClass();
        ipaVar.g.j.fB(inr.STATE_RECORDING);
        ipaVar.g.f();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0126 A[Catch: all -> 0x014e, TryCatch #4 {, blocks: (B:4:0x0005, B:6:0x0013, B:7:0x0025, B:11:0x0032, B:12:0x007c, B:39:0x00fd, B:41:0x0126, B:42:0x0149, B:30:0x00b7, B:33:0x00ba, B:34:0x00bb, B:35:0x00cd, B:38:0x00d3, B:46:0x014d, B:13:0x007d, B:14:0x0085, B:22:0x00aa, B:23:0x00b0, B:27:0x00b4, B:15:0x0086, B:19:0x008e, B:20:0x00a8, B:9:0x0027, B:10:0x0031, B:36:0x00ce, B:37:0x00d2), top: B:57:0x0005, inners: #1, #2, #3 }] */
    @Override // defpackage.ldo
    public final void d() {
        ipa ipaVar;
        Surface surface;
        synchronized (this.a.o) {
            boolean z = true;
            if (this.a.d.k(deg.d)) {
                ioq ioqVar = this.a;
                iod iodVar = ioqVar.v;
                ldv ldvVar = ioqVar.ad;
                iql iqlVar = ioqVar.X;
                iqo iqoVar = (iqo) ioqVar.E.get(0);
                synchronized (iodVar.s) {
                    iodVar.B = null;
                    iodVar.v = null;
                    iodVar.u = null;
                    iodVar.w = oih.a;
                }
                iodVar.e.set(0L);
                iodVar.f.set(0L);
                iodVar.g.set(0L);
                iodVar.b.set(false);
                iodVar.h.set(0L);
                iodVar.j.set(0L);
                iodVar.i.set(0L);
                iodVar.k.set(0L);
                iodVar.m.set(0L);
                iodVar.l.set(0L);
                iodVar.c.set(false);
                iodVar.p.set(0L);
                iodVar.o.set(0L);
                iodVar.n.set(0L);
                synchronized (iodVar.s) {
                    iodVar.B = ldvVar;
                    iodVar.v = iqoVar;
                    iodVar.u = iqlVar;
                    synchronized (ldvVar.d) {
                        if (ldvVar.e == ldu.STOPPED) {
                            z = false;
                        }
                        obr.aR(z, "Camcorder is closed already");
                        ojc ojcVarC = ldvVar.a.c();
                        obr.aG(ojcVarC.g(), "Input surface is not available.");
                        surface = (Surface) ojcVarC.c();
                    }
                    iodVar.A = mip.aU(surface, 5);
                }
                ldv ldvVar2 = this.a.ad;
                ldvVar2.getClass();
                ldvVar2.a.o(dxh.TIMELAPSE.c());
                ipaVar = this.a.ag;
                ipaVar.getClass();
                if (!((inr) ipaVar.g.j.d).equals(inr.STATE_RECORDING_ERROR)) {
                    ipaVar.g.j.fB(inr.STATE_RECORDING);
                    lar larVar = ipaVar.a;
                    ipx ipxVar = ipaVar.b;
                    ipxVar.getClass();
                    larVar.c(new iov(ipxVar, 4));
                    ipaVar.g.h(false);
                    ipaVar.g.f();
                }
            } else {
                ioq ioqVar2 = this.a;
                ink inkVar = ioqVar2.l;
                iqo iqoVar2 = (iqo) ioqVar2.E.get(0);
                iql iqlVar2 = this.a.X;
                synchronized (inkVar.x) {
                    inkVar.G = iqlVar2;
                    inkVar.H = iqoVar2;
                }
                inkVar.o.set(inkVar.K.f);
                inkVar.L = new Timer();
                inkVar.L.scheduleAtFixedRate(new inj(inkVar), 0L, TimeUnit.SECONDS.toMillis(1L));
                inkVar.c.set(true);
                ldv ldvVar3 = this.a.ad;
                ldvVar3.getClass();
                ldvVar3.a.o(dxh.TIMELAPSE.c());
                ipaVar = this.a.ag;
                ipaVar.getClass();
                if (!((inr) ipaVar.g.j.d).equals(inr.STATE_RECORDING_ERROR)) {
                    ipaVar.g.j.fB(inr.STATE_RECORDING);
                    lar larVar2 = ipaVar.a;
                    ipx ipxVar2 = ipaVar.b;
                    ipxVar2.getClass();
                    larVar2.c(new iov(ipxVar2, 4));
                    ipaVar.g.h(false);
                    ipaVar.g.f();
                }
            }
        }
    }

    @Override // defpackage.ldo
    public final void e() {
        synchronized (this.a.o) {
            if (this.a.d.k(deg.d)) {
                this.a.e();
            }
            final ArrayList arrayList = (ArrayList) this.a.E.clone();
            this.a.E.clear();
            ioq ioqVar = this.a;
            ipa ipaVar = ioqVar.ag;
            ipaVar.getClass();
            final iql iqlVar = ioqVar.X;
            final ipf ipfVar = ipaVar.g;
            ipfVar.m.execute(new Runnable() { // from class: iou
                @Override // java.lang.Runnable
                public final void run() {
                    pef pefVar;
                    long j;
                    long j2;
                    boolean z;
                    oor oorVarO;
                    long j3;
                    long j4;
                    oor oorVarO2;
                    oor oorVar;
                    oor oorVarO3;
                    oor oorVar2;
                    pef[] pefVarArr;
                    long j5;
                    long j6;
                    pef[] pefVarArr2;
                    iqp iqpVar;
                    final iqp iqpVarA;
                    ipf ipfVar2 = ipfVar;
                    List list = arrayList;
                    iql iqlVar2 = iqlVar;
                    synchronized (ipfVar2.r) {
                        iqp iqpVar2 = null;
                        int i = 0;
                        while (i < list.size()) {
                            if (i == 0) {
                                iqpVarA = ((iqo) list.get(0)).a();
                                iqpVar = iqpVarA;
                            } else {
                                iqo iqoVar = (iqo) list.get(i);
                                iqpVar2.getClass();
                                iqoVar.l(iqpVar2.a);
                                iqoVar.b(iqpVar2.b);
                                iqoVar.g(iqpVar2.f);
                                iqoVar.f(iqpVar2.d);
                                iqoVar.k(iqpVar2.e);
                                iqp iqpVarA2 = iqoVar.a();
                                iqpVar = iqpVar2;
                                iqpVarA = iqpVarA2;
                            }
                            ddf ddfVar = ipfVar2.o;
                            ddg ddgVar = deg.a;
                            ddfVar.b();
                            iqpVarA.c.close();
                            final cof cofVar = ipfVar2.f;
                            final long jCurrentTimeMillis = System.currentTimeMillis();
                            cofVar.c.execute(new Runnable() { // from class: cod
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cof cofVar2 = cofVar;
                                    iqp iqpVar3 = iqpVarA;
                                    cofVar2.e(hsr.TIMELAPSE, iqpVar3.c.d(), iqpVar3.c.c(), jCurrentTimeMillis, iqpVar3.g, "", iqpVar3.h, iqpVar3.i);
                                }
                            });
                            i++;
                            iqpVar2 = iqpVar;
                        }
                        synchronized (ipfVar2.r) {
                            list.clear();
                            ipfVar2.j.fB(inr.STATE_IDLE);
                        }
                        ipfVar2.q.c(new iot(ipfVar2, 3));
                        ddf ddfVar2 = ipfVar2.o;
                        ddg ddgVar2 = deg.a;
                        ddfVar2.b();
                        fjs fjsVar = ipfVar2.G;
                        synchronized (iqlVar2.a) {
                            String str = iqlVar2.b;
                        }
                        lwd lwdVar = ipfVar2.L;
                        ojc ojcVarI = ipfVar2.s.g() ? ojc.i(((hcl) ipfVar2.s.c()).c()) : oih.a;
                        synchronized (iqlVar2.a) {
                            pefVar = iqlVar2.h;
                        }
                        synchronized (iqlVar2.a) {
                            j = iqlVar2.j;
                        }
                        synchronized (iqlVar2.a) {
                            j2 = iqlVar2.k;
                        }
                        synchronized (iqlVar2.a) {
                            z = iqlVar2.i;
                        }
                        boolean z2 = iqlVar2.d;
                        synchronized (iqlVar2.a) {
                            HashMap map = new HashMap();
                            pef[] pefVarArrValues = pef.values();
                            int length = pefVarArrValues.length;
                            int i2 = 0;
                            while (i2 < length) {
                                int i3 = length;
                                pef pefVar2 = pefVarArrValues[i2];
                                try {
                                    iqm iqmVarA = iqlVar2.a(pefVar2);
                                    pefVarArr2 = pefVarArrValues;
                                    try {
                                        if (!iqlVar2.e.containsKey(iqmVarA)) {
                                            throw new IllegalArgumentException();
                                        }
                                        map.put(pefVar2, (Integer) iqlVar2.e.get(iqmVarA));
                                    } catch (IllegalArgumentException e) {
                                        pefVar2.name();
                                    }
                                } catch (IllegalArgumentException e2) {
                                    pefVarArr2 = pefVarArrValues;
                                }
                                i2++;
                                length = i3;
                                pefVarArrValues = pefVarArr2;
                            }
                            oorVarO = oor.o(map);
                        }
                        synchronized (iqlVar2.a) {
                            HashMap map2 = new HashMap();
                            pef[] pefVarArrValues2 = pef.values();
                            int length2 = pefVarArrValues2.length;
                            int i4 = 0;
                            while (i4 < length2) {
                                int i5 = length2;
                                pef pefVar3 = pefVarArrValues2[i4];
                                try {
                                    iqm iqmVarA2 = iqlVar2.a(pefVar3);
                                    pefVarArr = pefVarArrValues2;
                                    try {
                                        if (!iqlVar2.f.containsKey(iqmVarA2)) {
                                            j5 = j;
                                            j6 = j2;
                                            throw new IllegalArgumentException();
                                        }
                                        j6 = j2;
                                        try {
                                            j5 = j;
                                            try {
                                                map2.put(pefVar3, Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) iqlVar2.f.get(iqmVarA2)).longValue()) / ((long) iqlVar2.c)));
                                            } catch (IllegalArgumentException e3) {
                                                pefVar3.name();
                                            }
                                        } catch (IllegalArgumentException e4) {
                                            j5 = j;
                                            pefVar3.name();
                                        }
                                        i4++;
                                        length2 = i5;
                                        pefVarArrValues2 = pefVarArr;
                                        j2 = j6;
                                        j = j5;
                                    } catch (IllegalArgumentException e5) {
                                        j5 = j;
                                        j6 = j2;
                                    }
                                } catch (IllegalArgumentException e6) {
                                    pefVarArr = pefVarArrValues2;
                                }
                                pefVar3.name();
                                i4++;
                                length2 = i5;
                                pefVarArrValues2 = pefVarArr;
                                j2 = j6;
                                j = j5;
                            }
                            j3 = j;
                            j4 = j2;
                            oorVarO2 = oor.o(map2);
                        }
                        synchronized (iqlVar2.a) {
                            HashMap map3 = new HashMap();
                            pef[] pefVarArrValues3 = pef.values();
                            int length3 = pefVarArrValues3.length;
                            int i6 = 0;
                            while (i6 < length3) {
                                pef pefVar4 = pefVarArrValues3[i6];
                                try {
                                    iqm iqmVarA3 = iqlVar2.a(pefVar4);
                                    if (!iqlVar2.g.containsKey(iqmVarA3)) {
                                        oorVar2 = oorVarO2;
                                        throw new IllegalArgumentException();
                                    }
                                    oorVar2 = oorVarO2;
                                    try {
                                        map3.put(pefVar4, Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) iqlVar2.g.get(iqmVarA3)).longValue()) / ((long) iqlVar2.c)));
                                    } catch (IllegalArgumentException e7) {
                                        pefVar4.name();
                                    }
                                    i6++;
                                    oorVarO2 = oorVar2;
                                } catch (IllegalArgumentException e8) {
                                    oorVar2 = oorVarO2;
                                }
                                pefVar4.name();
                                i6++;
                                oorVarO2 = oorVar2;
                            }
                            oorVar = oorVarO2;
                            oorVarO3 = oor.o(map3);
                        }
                        fjsVar.Q(lwdVar, ojcVarI, pefVar, j3, j4, z, z2, oorVarO, oorVar, oorVarO3);
                    }
                }
            });
            ipaVar.a.c(new ioz(ipaVar.c, 1));
        }
    }
}
