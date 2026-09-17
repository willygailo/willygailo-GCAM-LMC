package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class iik implements iij {
    private static final ouj y = ouj.h("com/google/android/apps/camera/stats/CaptureSessionStatsCollectorImpl");
    private Long A;
    protected final fjs b;
    public ExifInterface g;
    protected List h;
    public fjw i;
    public Long k;
    public pcw l;
    public pbh m;
    public ozr n;
    public ozu o;
    public pbj p;
    public pbg q;
    public pet r;
    public pdb t;
    boolean v;
    public fkb w;
    public poy x;
    public long a = 0;
    private final pih z = pih.f();
    public boolean c = false;
    protected boolean d = false;
    public boolean e = false;
    protected boolean f = false;
    public iim j = null;
    public boolean s = false;
    public final pih u = pih.f();

    public iik(fjs fjsVar) {
        this.b = fjsVar;
    }

    private final ozs k(long j) {
        if (!this.s) {
            return null;
        }
        try {
            Long l = (Long) this.u.get(2500L, TimeUnit.MILLISECONDS);
            if (l == null) {
                return null;
            }
            long jLongValue = l.longValue() - j;
            poy poyVarM = ozs.c.m();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ozs ozsVar = (ozs) poyVarM.b;
            ozsVar.a |= 1;
            ozsVar.b = jLongValue;
            return (ozs) poyVarM.j();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((oug) ((oug) ((oug) y.b()).h(e)).G((char) 2938)).o("Error retrieving kepler meta.");
            return null;
        }
    }

    private final int l() {
        fkb fkbVar = this.w;
        if (fkbVar == null) {
            ((oug) ((oug) y.b()).G((char) 2940)).o("inferPhotoMode called while atTimeRequestData not present yet");
            return 1;
        }
        if (this.x != null) {
            return 22;
        }
        int i = fkbVar.o;
        if (i == 29) {
            return 29;
        }
        if (i == 36) {
            return 36;
        }
        pcw pcwVar = this.l;
        if (pcwVar != null) {
            int iAa = oxh.aa(pcwVar.l);
            if (iAa != 0 && iAa == 4) {
                return 32;
            }
            int iAa2 = oxh.aa(this.l.l);
            if (iAa2 != 0 && iAa2 == 5) {
                return 32;
            }
        }
        if (this.f) {
            return 8;
        }
        fkb fkbVar2 = this.w;
        if (fkbVar2 != null) {
            return fkbVar2.o;
        }
        ((oug) ((oug) y.b()).G((char) 2939)).o("inferPhotoMode called while atTimeRequestData not present yet");
        return 1;
    }

    @Override // defpackage.iij
    public final Long a() {
        iim iimVar = this.j;
        if (iimVar == null) {
            return null;
        }
        return Long.valueOf(iimVar.a);
    }

    @Override // defpackage.iij
    public final void b() {
        this.v = true;
    }

    @Override // defpackage.iij
    public final void c(fkd fkdVar) {
        this.z.o(fkdVar);
    }

    @Override // defpackage.iij
    public final void d(lzr lzrVar, boolean z) {
        this.f = z;
        int i = 0;
        if (kda.m == null || lzrVar.d(kda.m) == null) {
            Face[] faceArr = (Face[]) lzrVar.d(CaptureResult.STATISTICS_FACES);
            if (faceArr == null) {
                this.h = null;
            } else {
                int length = faceArr.length;
                this.h = new ArrayList(length);
                while (i < length) {
                    this.h.add(hjy.a(faceArr[i]));
                    i++;
                }
            }
        } else {
            List listB = lzs.b(lzrVar);
            int size = listB.size();
            this.h = new ArrayList(size);
            while (i < size) {
                this.h.add(hjy.b((lzs) listB.get(i)));
                i++;
            }
        }
    }

    @Override // defpackage.iij
    public final void e(long j) {
        iim iimVar = this.j;
        if (iimVar != null) {
            iimVar.c = SystemClock.elapsedRealtimeNanos();
        }
        this.A = Long.valueOf(j);
    }

    @Override // defpackage.iij
    public final void f(long j) throws Throwable {
        j(1, j);
    }

    @Override // defpackage.iij
    public final void g() {
        this.d = true;
    }

    public final boolean h() {
        fkb fkbVar = this.w;
        return fkbVar == null || fkbVar.i.booleanValue() || this.c;
    }

    public final boolean i() {
        return (this.w == null || this.a == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e2  */
    public final void j(int i, long j) throws Throwable {
        pcs pcsVar;
        Long l;
        dzx dzxVar;
        poy poyVar;
        pdn pdnVar;
        fjs fjsVar;
        int iL;
        fkb fkbVar;
        ExifInterface exifInterface;
        boolean zH;
        Float fValueOf;
        List list;
        Long l2;
        pcw pcwVar;
        pbh pbhVar;
        poy poyVar2;
        pdn pdnVar2;
        Integer num;
        pcs pcsVar2;
        long jLongValue = j - this.a;
        fjw fjwVar = this.i;
        if (fjwVar != null) {
            poy poyVarM = pcs.d.m();
            synchronized (fjwVar.a) {
                if (fjwVar.b.size() <= 0 || fjwVar.c.get(0) == null) {
                    int i2 = fjv.UNKNOWN.d;
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pcs pcsVar3 = (pcs) poyVarM.b;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    pcsVar3.b = i3;
                    pcsVar3.a |= 1;
                } else {
                    int i4 = ((fjv) fjwVar.c.get(0)).d;
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pcs pcsVar4 = (pcs) poyVarM.b;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    pcsVar4.b = i5;
                    pcsVar4.a |= 1;
                }
                List list2 = fjwVar.b;
                pcs pcsVar5 = (pcs) poyVarM.b;
                ppm ppmVar = pcsVar5.c;
                if (!ppmVar.c()) {
                    pcsVar5.c = ppd.B(ppmVar);
                }
                pnl.e(list2, pcsVar5.c);
                pcsVar2 = (pcs) poyVarM.j();
            }
            pcsVar = pcsVar2;
        } else {
            pcsVar = null;
        }
        poy poyVar3 = this.x;
        if (poyVar3 != null) {
            int i6 = (int) jLongValue;
            if (poyVar3.c) {
                poyVar3.m();
                poyVar3.c = false;
            }
            pdn pdnVar3 = (pdn) poyVar3.b;
            pdn pdnVar4 = pdn.f;
            pdnVar3.a |= 1;
            pdnVar3.b = i6;
        }
        try {
            if (this.f) {
                fkd fkdVar = (fkd) this.z.get(500L, TimeUnit.MILLISECONDS);
                dzx dzxVar2 = fkdVar.c;
                try {
                    l = fkdVar.a;
                    try {
                        num = fkdVar.b;
                        dzxVar = dzxVar2;
                    } catch (InterruptedException e) {
                        e = e;
                        dzxVar = dzxVar2;
                        try {
                            ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
                            if (!i()) {
                            }
                            fjsVar = this.b;
                            iL = l();
                            fkbVar = this.w;
                            exifInterface = this.g;
                            zH = h();
                            if (l != null) {
                                jLongValue = l.longValue();
                            }
                            fValueOf = Float.valueOf(mip.dW(jLongValue));
                            list = this.h;
                            l2 = this.k;
                            pcwVar = this.l;
                            pbhVar = this.m;
                            poyVar2 = this.x;
                            if (poyVar2 == null) {
                                pdnVar2 = null;
                            } else {
                                pdnVar2 = (pdn) poyVar2.j();
                            }
                            num = null;
                        } catch (Throwable th) {
                            th = th;
                            if (i()) {
                                fjs fjsVar2 = this.b;
                                int iL2 = l();
                                fkb fkbVar2 = this.w;
                                ExifInterface exifInterface2 = this.g;
                                boolean zH2 = h();
                                if (l != null) {
                                    jLongValue = l.longValue();
                                }
                                Float fValueOf2 = Float.valueOf(mip.dW(jLongValue));
                                List list3 = this.h;
                                Long l3 = this.k;
                                pcw pcwVar2 = this.l;
                                pbh pbhVar2 = this.m;
                                poyVar = this.x;
                                if (poyVar == null) {
                                    pdnVar = null;
                                } else {
                                    pdnVar = (pdn) poyVar.j();
                                }
                                fjsVar2.as(iL2, fkbVar2, exifInterface2, zH2, fValueOf2, list3, pcsVar, i, dzxVar, l3, null, pcwVar2, pbhVar2, pdnVar, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
                            }
                            throw th;
                        }
                    } catch (ExecutionException e2) {
                        e = e2;
                        dzxVar = dzxVar2;
                        ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
                        if (!i()) {
                        }
                        fjsVar = this.b;
                        iL = l();
                        fkbVar = this.w;
                        exifInterface = this.g;
                        zH = h();
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        fValueOf = Float.valueOf(mip.dW(jLongValue));
                        list = this.h;
                        l2 = this.k;
                        pcwVar = this.l;
                        pbhVar = this.m;
                        poyVar2 = this.x;
                        if (poyVar2 == null) {
                            pdnVar2 = null;
                        } else {
                            pdnVar2 = (pdn) poyVar2.j();
                        }
                        num = null;
                    } catch (TimeoutException e3) {
                        e = e3;
                        dzxVar = dzxVar2;
                        ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
                        if (!i()) {
                        }
                        fjsVar = this.b;
                        iL = l();
                        fkbVar = this.w;
                        exifInterface = this.g;
                        zH = h();
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        fValueOf = Float.valueOf(mip.dW(jLongValue));
                        list = this.h;
                        l2 = this.k;
                        pcwVar = this.l;
                        pbhVar = this.m;
                        poyVar2 = this.x;
                        if (poyVar2 == null) {
                            pdnVar2 = null;
                        } else {
                            pdnVar2 = (pdn) poyVar2.j();
                        }
                        num = null;
                    } catch (Throwable th2) {
                        th = th2;
                        dzxVar = dzxVar2;
                        if (i()) {
                            fjs fjsVar3 = this.b;
                            int iL3 = l();
                            fkb fkbVar3 = this.w;
                            ExifInterface exifInterface3 = this.g;
                            boolean zH3 = h();
                            if (l != null) {
                                jLongValue = l.longValue();
                            }
                            Float fValueOf3 = Float.valueOf(mip.dW(jLongValue));
                            List list4 = this.h;
                            Long l4 = this.k;
                            pcw pcwVar3 = this.l;
                            pbh pbhVar3 = this.m;
                            poyVar = this.x;
                            if (poyVar == null) {
                                pdnVar = null;
                            } else {
                                pdnVar = (pdn) poyVar.j();
                            }
                            fjsVar3.as(iL3, fkbVar3, exifInterface3, zH3, fValueOf3, list4, pcsVar, i, dzxVar, l4, null, pcwVar3, pbhVar3, pdnVar, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
                        }
                        throw th;
                    }
                } catch (InterruptedException e4) {
                    e = e4;
                    dzxVar = dzxVar2;
                    l = null;
                    ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
                    if (!i()) {
                        fjsVar = this.b;
                        iL = l();
                        fkbVar = this.w;
                        exifInterface = this.g;
                        zH = h();
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        fValueOf = Float.valueOf(mip.dW(jLongValue));
                        list = this.h;
                        l2 = this.k;
                        pcwVar = this.l;
                        pbhVar = this.m;
                        poyVar2 = this.x;
                        if (poyVar2 == null) {
                            pdnVar2 = null;
                        } else {
                            pdnVar2 = (pdn) poyVar2.j();
                        }
                        num = null;
                        fjsVar.as(iL, fkbVar, exifInterface, zH, fValueOf, list, pcsVar, i, dzxVar, l2, num, pcwVar, pbhVar, pdnVar2, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
                    }
                } catch (ExecutionException e5) {
                    e = e5;
                    dzxVar = dzxVar2;
                    l = null;
                    ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
                    if (!i()) {
                        fjsVar = this.b;
                        iL = l();
                        fkbVar = this.w;
                        exifInterface = this.g;
                        zH = h();
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        fValueOf = Float.valueOf(mip.dW(jLongValue));
                        list = this.h;
                        l2 = this.k;
                        pcwVar = this.l;
                        pbhVar = this.m;
                        poyVar2 = this.x;
                        if (poyVar2 == null) {
                            pdnVar2 = null;
                        } else {
                            pdnVar2 = (pdn) poyVar2.j();
                        }
                        num = null;
                        fjsVar.as(iL, fkbVar, exifInterface, zH, fValueOf, list, pcsVar, i, dzxVar, l2, num, pcwVar, pbhVar, pdnVar2, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
                    }
                } catch (TimeoutException e6) {
                    e = e6;
                    dzxVar = dzxVar2;
                    l = null;
                    ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
                    if (!i()) {
                        fjsVar = this.b;
                        iL = l();
                        fkbVar = this.w;
                        exifInterface = this.g;
                        zH = h();
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        fValueOf = Float.valueOf(mip.dW(jLongValue));
                        list = this.h;
                        l2 = this.k;
                        pcwVar = this.l;
                        pbhVar = this.m;
                        poyVar2 = this.x;
                        if (poyVar2 == null) {
                            pdnVar2 = null;
                        } else {
                            pdnVar2 = (pdn) poyVar2.j();
                        }
                        num = null;
                        fjsVar.as(iL, fkbVar, exifInterface, zH, fValueOf, list, pcsVar, i, dzxVar, l2, num, pcwVar, pbhVar, pdnVar2, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dzxVar = dzxVar2;
                    l = null;
                }
            } else {
                l = null;
                dzxVar = null;
                num = null;
            }
            if (i()) {
                fjsVar = this.b;
                iL = l();
                fkbVar = this.w;
                exifInterface = this.g;
                zH = h();
                if (l != null) {
                    jLongValue = l.longValue();
                }
                fValueOf = Float.valueOf(mip.dW(jLongValue));
                list = this.h;
                l2 = this.k;
                pcwVar = this.l;
                pbhVar = this.m;
                poy poyVar4 = this.x;
                pdnVar2 = poyVar4 == null ? null : (pdn) poyVar4.j();
                fjsVar.as(iL, fkbVar, exifInterface, zH, fValueOf, list, pcsVar, i, dzxVar, l2, num, pcwVar, pbhVar, pdnVar2, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
            }
        } catch (InterruptedException e7) {
            e = e7;
            l = null;
            dzxVar = null;
            ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
            if (!i()) {
                fjsVar = this.b;
                iL = l();
                fkbVar = this.w;
                exifInterface = this.g;
                zH = h();
                if (l != null) {
                    jLongValue = l.longValue();
                }
                fValueOf = Float.valueOf(mip.dW(jLongValue));
                list = this.h;
                l2 = this.k;
                pcwVar = this.l;
                pbhVar = this.m;
                poyVar2 = this.x;
                if (poyVar2 == null) {
                    pdnVar2 = null;
                } else {
                    pdnVar2 = (pdn) poyVar2.j();
                }
                num = null;
                fjsVar.as(iL, fkbVar, exifInterface, zH, fValueOf, list, pcsVar, i, dzxVar, l2, num, pcwVar, pbhVar, pdnVar2, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
            }
        } catch (ExecutionException e8) {
            e = e8;
            l = null;
            dzxVar = null;
            ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
            if (!i()) {
                fjsVar = this.b;
                iL = l();
                fkbVar = this.w;
                exifInterface = this.g;
                zH = h();
                if (l != null) {
                    jLongValue = l.longValue();
                }
                fValueOf = Float.valueOf(mip.dW(jLongValue));
                list = this.h;
                l2 = this.k;
                pcwVar = this.l;
                pbhVar = this.m;
                poyVar2 = this.x;
                if (poyVar2 == null) {
                    pdnVar2 = null;
                } else {
                    pdnVar2 = (pdn) poyVar2.j();
                }
                num = null;
                fjsVar.as(iL, fkbVar, exifInterface, zH, fValueOf, list, pcsVar, i, dzxVar, l2, num, pcwVar, pbhVar, pdnVar2, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
            }
        } catch (TimeoutException e9) {
            e = e9;
            l = null;
            dzxVar = null;
            ((oug) ((oug) y.b()).G(2941)).r("Error retrieving Gcam metadata. %s", e);
            if (!i()) {
                fjsVar = this.b;
                iL = l();
                fkbVar = this.w;
                exifInterface = this.g;
                zH = h();
                if (l != null) {
                    jLongValue = l.longValue();
                }
                fValueOf = Float.valueOf(mip.dW(jLongValue));
                list = this.h;
                l2 = this.k;
                pcwVar = this.l;
                pbhVar = this.m;
                poyVar2 = this.x;
                if (poyVar2 == null) {
                    pdnVar2 = null;
                } else {
                    pdnVar2 = (pdn) poyVar2.j();
                }
                num = null;
                fjsVar.as(iL, fkbVar, exifInterface, zH, fValueOf, list, pcsVar, i, dzxVar, l2, num, pcwVar, pbhVar, pdnVar2, this.n, this.q, this.A, a(), this.d, this.e, this.r, this.o, k(j), this.p, this.t, this.w.n, this.v);
            }
        } catch (Throwable th4) {
            th = th4;
            l = null;
            dzxVar = null;
        }
    }
}
