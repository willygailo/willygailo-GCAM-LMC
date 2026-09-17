package defpackage;

import com.google.googlex.gcam.BurstSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hef implements eav, ebn, eby {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/SecondaryStereoProcessor");
    public final ojc b;
    public final heu c;
    private final hcg d;
    private final dzv e;
    private final Executor f;
    private final HashMap g = new HashMap();
    private final pyn h;
    private final eeu i;
    private final nvb j;

    public hef(hcg hcgVar, dzv dzvVar, ojc ojcVar, pyn pynVar, Executor executor, nvb nvbVar, heu heuVar, eeu eeuVar, byte[] bArr, byte[] bArr2) {
        this.d = hcgVar;
        this.e = dzvVar;
        this.b = ojcVar;
        this.h = pynVar;
        this.f = executor;
        this.j = nvbVar;
        this.c = heuVar;
        this.i = eeuVar;
        obr.aQ(ojcVar.g());
    }

    private static void k(ebw ebwVar, Throwable th) {
        if (th == null) {
            th = new Throwable();
        }
        ebwVar.b(new ebr(th));
    }

    @Override // defpackage.ebn
    public final synchronized void a(edd eddVar, int i, long j, lzv lzvVar) {
        eddVar.a();
        hdv hdvVar = (hdv) this.g.get(eddVar);
        if (hdvVar == null) {
            int iA = eddVar.a();
            StringBuilder sb = new StringBuilder(41);
            sb.append("Shot ");
            sb.append(iA);
            sb.append(" hasn't been started yet!");
            throw new IllegalStateException(sb.toString());
        }
        hdvVar.d.o(Integer.valueOf(i));
    }

    @Override // defpackage.eby
    public final /* synthetic */ void b(iin iinVar, dzx dzxVar) {
    }

    @Override // defpackage.eby
    public final synchronized void c(edd eddVar, ebr ebrVar) {
        d(eddVar.c.b.h());
    }

    @Override // defpackage.eav
    public final synchronized void d(hsp hspVar) {
        edd eddVar;
        Iterator it = this.g.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eddVar = null;
                break;
            }
            eddVar = (edd) it.next();
        } while (!eddVar.c.b.h().equals(hspVar));
        if (eddVar == null) {
            return;
        }
        ((oug) ((oug) a.c()).G(2391)).p("Aborting shot %s", eddVar.a());
        hdv hdvVar = (hdv) this.g.remove(eddVar);
        if (hdvVar != null) {
            hdvVar.b();
        }
    }

    @Override // defpackage.eav
    public final synchronized void e(edd eddVar, lmr lmrVar) {
        hee heeVar = (hee) this.g.get(eddVar);
        if (heeVar != null) {
            heeVar.c(lmrVar);
        } else {
            lmrVar.close();
        }
    }

    @Override // defpackage.eav
    public final synchronized void f(edd eddVar, BurstSpec burstSpec, lzv lzvVar) {
        eddVar.a();
        obr.aQ(!this.g.containsKey(eddVar));
        this.g.put(eddVar, new hee(this, eddVar.c, this.e.a(), burstSpec, lzvVar));
    }

    @Override // defpackage.eav
    public final synchronized void g(hsp hspVar) {
        ede edeVarF = this.j.f(hspVar);
        edeVarF.a(new ebn() { // from class: heb
            @Override // defpackage.ebn
            public final void a(edd eddVar, int i, long j, lzv lzvVar) {
                this.a.a(eddVar, i, j, lzvVar);
            }
        });
        edeVarF.e(this);
    }

    @Override // defpackage.eav
    public final synchronized void h(final edd eddVar) {
        eddVar.a();
        final hdv hdvVar = (hdv) this.g.get(eddVar);
        if (hdvVar == null) {
            ((oug) ((oug) a.c()).G(2401)).p("Shot %s hasn't started yet or was aborted!", eddVar.a());
        } else {
            this.f.execute(new Runnable() { // from class: hec
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.a.j(hdvVar, eddVar);
                }
            });
        }
    }

    @Override // defpackage.eav
    public final /* synthetic */ void i(edd eddVar) {
    }

    /* JADX WARN: Code duplicated, block: B:56:0x010a A[Catch: all -> 0x00fb, TryCatch #14 {all -> 0x00fb, blocks: (B:4:0x0018, B:6:0x002d, B:15:0x005e, B:19:0x006a, B:21:0x00ae, B:54:0x0106, B:56:0x010a, B:57:0x0111, B:59:0x0119, B:7:0x0039, B:8:0x0041, B:10:0x0047), top: B:66:0x0016 }] */
    final /* synthetic */ void j(hdv hdvVar, edd eddVar) throws Throwable {
        hed hedVar;
        HashMap map;
        lzv lzvVarB;
        edd eddVar2 = eddVar;
        hed hedVar2 = new hed(this, hdvVar.b);
        List listA = hdvVar.a();
        try {
            if (listA.isEmpty()) {
                hdvVar.b();
                k(hedVar2, null);
                return;
            }
            try {
                try {
                    lzv lzvVar = eddVar2.p;
                    lnx lnxVarB = this.d.a((lmr) listA.get(0)).b();
                    if (lnxVarB == null) {
                        otj it = ((oom) listA).iterator();
                        lzv lzvVarA = null;
                        while (true) {
                            if (!it.hasNext()) {
                                lzvVarB = lzvVarA;
                                break;
                            }
                            lzvVarA = hdw.a(this.d.a((lmr) it.next()), false);
                            if (lzvVarA != null) {
                                lzvVarB = lzvVarA;
                                break;
                            }
                        }
                    } else {
                        lzvVarB = hdw.b(lzvVar, lnxVarB.c().a);
                    }
                    if (lzvVarB == null) {
                        k(hedVar2, null);
                        hdvVar.d();
                        map = this.g;
                    } else {
                        this.j.f(eddVar2.c.b.h()).d(hedVar2);
                        int iIntValue = ((Integer) hdvVar.d.get()).intValue();
                        ojc ojcVarA = this.i.a((lmr) hdvVar.a().get(iIntValue));
                        eddVar.a();
                        gog gogVar = hdvVar.b;
                        gfs gfsVar = gogVar.a;
                        hedVar = hedVar2;
                        try {
                            try {
                                ((hea) this.h.get()).a(listA, hao.d, new gog(new gfs(gfsVar.a, gfsVar.b, gfsVar.c, gfsVar.d, gfsVar.e, gfsVar.g, gfsVar.h, gfsVar.i, ojcVarA), gogVar.b, gogVar.c, gogVar.d), iIntValue, lzvVarB, hdvVar.c);
                                hdvVar.d();
                                map = this.g;
                                eddVar2 = eddVar;
                            } catch (dlv e) {
                                eddVar2 = eddVar;
                                ((oug) ((oug) a.c()).G(2396)).o("Secondary shot didn't proceed");
                                hdvVar.d();
                                map = this.g;
                            } catch (dmd e2) {
                                e = e2;
                                eddVar2 = eddVar;
                                if (e instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                k(hedVar, e);
                                hdvVar.d();
                                map = this.g;
                            } catch (InterruptedException e3) {
                                e = e3;
                                eddVar2 = eddVar;
                                if (e instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                k(hedVar, e);
                                hdvVar.d();
                                map = this.g;
                            } catch (CancellationException e4) {
                                e = e4;
                                eddVar2 = eddVar;
                                if (e instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                k(hedVar, e);
                                hdvVar.d();
                                map = this.g;
                            } catch (ExecutionException e5) {
                                e = e5;
                                eddVar2 = eddVar;
                                if (e instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                k(hedVar, e);
                                hdvVar.d();
                                map = this.g;
                            } catch (Throwable th) {
                                th = th;
                                eddVar2 = eddVar;
                                hdvVar.d();
                                this.g.remove(eddVar2);
                                throw th;
                            }
                        } catch (dmd e6) {
                            e = e6;
                        } catch (InterruptedException e7) {
                            e = e7;
                        } catch (CancellationException e8) {
                            e = e8;
                        } catch (ExecutionException e9) {
                            e = e9;
                        }
                    }
                } catch (dlv e10) {
                }
            } catch (dmd | InterruptedException | CancellationException | ExecutionException e11) {
                e = e11;
                hedVar = hedVar2;
            }
            map.remove(eddVar2);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.eby
    public final synchronized void s(edd eddVar) {
        d(eddVar.c.b.h());
    }
}
