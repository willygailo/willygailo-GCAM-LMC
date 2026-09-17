package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fou implements fpm {
    public static final ouj a = ouj.h("com/google/android/apps/camera/microvideo/MicrovideoControllerImpl");
    private final fus A;
    private final nvb B;
    public final Executor b;
    public final Executor c;
    public final fpp d;
    public final Object e;
    public final fnu f;
    public final ojc g;
    public final ojc h;
    public final gfh i;
    public final fqs j;
    public final fva k;
    public final ddf l;
    public final boolean m;
    public final fnt n;
    public final fpc o;
    public final Handler p;
    public final hoh q;
    public final lvp r;
    public final dyx s;
    public final fnm t;
    public final ojz u = fob.a;
    public long v;
    public final List w;
    public final gxm x;
    public final jdy y;
    private final fnq z;

    public fou(Executor executor, Executor executor2, fpp fppVar, fnu fnuVar, fnq fnqVar, ojc ojcVar, ojc ojcVar2, gfh gfhVar, fqs fqsVar, fva fvaVar, fus fusVar, ddf ddfVar, fnt fntVar, hoh hohVar, lvp lvpVar, Handler handler, fpc fpcVar, dyx dyxVar, nvb nvbVar, jdy jdyVar, fnm fnmVar, gxm gxmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.d = fppVar;
        executor.getClass();
        this.b = executor;
        executor2.getClass();
        this.c = executor2;
        this.f = fnuVar;
        this.z = fnqVar;
        this.g = ojcVar;
        this.h = ojcVar2;
        this.i = gfhVar;
        this.j = fqsVar;
        this.k = fvaVar;
        this.A = fusVar;
        this.l = ddfVar;
        this.n = fntVar;
        this.o = fpcVar;
        this.p = handler;
        this.q = hohVar;
        this.r = lvpVar;
        this.s = dyxVar;
        this.B = nvbVar;
        this.x = gxmVar;
        this.y = jdyVar;
        this.t = fnmVar;
        this.e = new Object();
        this.w = new ArrayList();
        ddi ddiVar = ddr.a;
        ddfVar.d();
        this.m = ddfVar.k(ddr.j);
        ddi ddiVar2 = ddl.a;
        ddfVar.e();
        ddfVar.b();
        ddfVar.b();
    }

    public static pht b(pht phtVar, pgk pgkVar, final pgk pgkVar2) {
        return pfj.i(pgb.i(phtVar, pgkVar, pgr.INSTANCE), RuntimeException.class, new pgk() { // from class: foc
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                pgk pgkVar3 = pgkVar2;
                RuntimeException runtimeException = (RuntimeException) obj;
                ((oug) ((oug) ((oug) fou.a.c()).h(runtimeException)).G((char) 1803)).o("Could not finish microvideo session as it previously failed with cause:");
                return pgkVar3.a(runtimeException);
            }
        }, pgr.INSTANCE);
    }

    public static void e(final gfh gfhVar, final hsp hspVar, Handler handler) {
        handler.postDelayed(new Runnable() { // from class: fny
            @Override // java.lang.Runnable
            public final void run() {
                gfhVar.g(hspVar);
            }
        }, hspVar, 11000L);
    }

    public static final void g(fot fotVar, fos fosVar) {
        obr.aQ(fotVar.l.get());
        try {
            try {
                mip.R(fosVar.d, (ExifInterface) fosVar.b.f(), fosVar.e.a);
                fosVar.c.e(fosVar.e.a.a());
                fosVar.e.c();
                fotVar.c.b();
                obr.aQ(!fotVar.n.isDone());
                fotVar.n.o(fosVar.a);
            } catch (IOException e) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G(1815)).o("Could not move original image to place");
                fotVar.n.a(e);
                fosVar.e.b();
                fotVar.c.b();
            }
        } catch (Throwable th) {
            fotVar.c.b();
            throw th;
        }
    }

    public static final pcw i(fot fotVar, long j) {
        frf frfVarA = fotVar.d.a();
        poy poyVarM = pcw.m.m();
        int i = (int) (j - fotVar.f);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcw pcwVar = (pcw) poyVarM.b;
        pcwVar.a |= 1;
        pcwVar.b = i;
        if (fotVar.p && fotVar.r.g()) {
            SystemClock.elapsedRealtime();
            ((Long) fotVar.r.c()).longValue();
        }
        try {
            int iConvert = (int) TimeUnit.MILLISECONDS.convert(((Long) plk.ad(fotVar.h)).longValue() - frfVarA.c, TimeUnit.MICROSECONDS);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pcw pcwVar2 = (pcw) poyVarM.b;
            pcwVar2.a |= 2;
            pcwVar2.c = iConvert;
            int iConvert2 = (int) TimeUnit.MILLISECONDS.convert(frfVarA.d - fotVar.e, TimeUnit.MICROSECONDS);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pcw pcwVar3 = (pcw) poyVarM.b;
            int i2 = pcwVar3.a | 4;
            pcwVar3.a = i2;
            pcwVar3.d = iConvert2;
            int i3 = i2 | 16;
            pcwVar3.a = i3;
            pcwVar3.f = true;
            int i4 = frfVarA.b;
            int i5 = i3 | 8;
            pcwVar3.a = i5;
            pcwVar3.e = i4;
            pcwVar3.a = i5 | 32;
            pcwVar3.g = false;
            int iL = l(fotVar.t);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pcw pcwVar4 = (pcw) poyVarM.b;
            pcwVar4.h = iL - 1;
            int i6 = pcwVar4.a | 64;
            pcwVar4.a = i6;
            int i7 = fotVar.u;
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            pcwVar4.l = i8;
            pcwVar4.a = i6 | 512;
            obr.aQ(fotVar.j.isDone());
            if (((ojc) plk.ae(fotVar.j)).g()) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pcw pcwVar5 = (pcw) poyVarM.b;
                pcwVar5.a |= 128;
                pcwVar5.j = true;
            }
            fotVar.i.e(poyVarM);
            return (pcw) poyVarM.j();
        } catch (ExecutionException e) {
            throw new IllegalStateException("Shutter timestamp unavailable for stats collection", e);
        }
    }

    public static final pcw j(fot fotVar) {
        poy poyVarM = pcw.m.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcw pcwVar = (pcw) poyVarM.b;
        pcwVar.a |= 16;
        pcwVar.f = false;
        int iL = l(fotVar.t);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcw pcwVar2 = (pcw) poyVarM.b;
        pcwVar2.h = iL - 1;
        int i = pcwVar2.a | 64;
        pcwVar2.a = i;
        int i2 = fotVar.u;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        pcwVar2.l = i3;
        pcwVar2.a = i | 512;
        return (pcw) poyVarM.j();
    }

    public static final void k(fot fotVar, Throwable th, fos fosVar) {
        hsp hspVar = fotVar.a;
        if (fotVar.l.getAndSet(true)) {
            ((oug) ((oug) a.c()).G((char) 1826)).o("Cancelling microvideo but result has been submitted already");
            return;
        }
        if (fotVar.p) {
            fotVar.k.w(th);
            fotVar.n.a(new IllegalStateException("Microvideo LongS cancelled!", th));
        } else {
            g(fotVar, fosVar);
        }
        fotVar.c.b();
        iij iijVar = fosVar.c;
        poy poyVarM = pcw.m.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcw pcwVar = (pcw) poyVarM.b;
        int i = pcwVar.a | 16;
        pcwVar.a = i;
        pcwVar.f = false;
        pcwVar.a = i | 32;
        pcwVar.g = true;
        int iL = l(fotVar.t);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcw pcwVar2 = (pcw) poyVarM.b;
        pcwVar2.h = iL - 1;
        int i2 = pcwVar2.a | 64;
        pcwVar2.a = i2;
        int i3 = fotVar.u;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        pcwVar2.l = i4;
        pcwVar2.a = i2 | 512;
        ((iik) iijVar).l = (pcw) poyVarM.j();
    }

    private static final int l(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return 3;
            case 1:
                return 4;
            default:
                String strE = fvq.e(i);
                StringBuilder sb = new StringBuilder(strE.length() + 23);
                sb.append("Unknown trimming mode: ");
                sb.append(strE);
                throw new RuntimeException(sb.toString());
        }
    }

    @Override // defpackage.fpm
    public final synchronized fpl a(final hsa hsaVar, final int i, final boolean z, final pht phtVar) {
        foz fozVar;
        final hsp hspVarH = hsaVar.h();
        int i2 = 0;
        final boolean z2 = hsaVar.i() == hsr.LONG_SHOT;
        if (this.f.h() || z2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - System.currentTimeMillis();
            fvq.b();
            fps.b.clear();
            fps.c.clear();
            boolean z3 = fps.a;
            synchronized (this.e) {
                if (z2) {
                    this.A.b();
                    if (this.h.g()) {
                        fpz fpzVar = (fpz) this.h.c();
                        if (fpzVar.c.g() && fpzVar.a.g()) {
                            fpzVar.d.execute(new fpw(fpzVar, i2));
                        }
                    }
                }
                final long jConvert = TimeUnit.MICROSECONDS.convert(hsaVar.d() + jElapsedRealtime, TimeUnit.MILLISECONDS);
                if (this.v == 0) {
                    ((oug) ((oug) a.c()).G(1797)).o("Taking picture before any frames came in; aborting.");
                    if (!z2) {
                        return new foz(hspVarH);
                    }
                    if (!this.l.k(ddr.v)) {
                        hsaVar.w(new IllegalStateException("Taking long shot before any frames came in."));
                        return new foz(hspVarH);
                    }
                }
                this.w.add(Long.valueOf(jConvert));
                ddf ddfVar = this.l;
                ddi ddiVar = ddr.a;
                ddfVar.e();
                if (hsaVar.i() == hsr.LONG_SHOT && !this.z.b()) {
                    hsaVar.w(new IllegalStateException("Not enough free space."));
                    fozVar = new foz(hspVarH);
                }
                if (hsaVar.i() == hsr.LONG_SHOT) {
                    hsaVar.y();
                }
                final lie lieVarB = this.i.b();
                final pih pihVarF = pih.f();
                this.B.f(hspVarH).a(new ebn() { // from class: fnw
                    @Override // defpackage.ebn
                    public final void a(edd eddVar, int i3, long j, lzv lzvVar) {
                        plk.af(pihVarF, new fop(this.a, j), pgr.INSTANCE);
                    }
                });
                this.b.execute(new Runnable() { // from class: fog
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v23 */
                    /* JADX WARN: Type inference failed for: r1v24 */
                    /* JADX WARN: Type inference failed for: r1v8, types: [fuw] */
                    /* JADX WARN: Type inference failed for: r38v0, types: [fuw] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        ?? A;
                        hsc hscVarI;
                        int i3;
                        int i4;
                        mln mlnVar;
                        fou fouVar = this.a;
                        hsp hspVar = hspVarH;
                        pih pihVar = pihVarF;
                        long j = jConvert;
                        hsa hsaVar2 = hsaVar;
                        boolean z4 = z;
                        boolean z5 = z2;
                        int i5 = i;
                        pht phtVar2 = phtVar;
                        lie lieVar = lieVarB;
                        try {
                            fouVar.j.d();
                            fouVar.s.d();
                            Object obj = fouVar.e;
                            synchronized (obj) {
                                try {
                                    fouVar.w.remove(Long.valueOf(j));
                                    fvq.b();
                                    int i6 = fouVar.f.e;
                                    fns fnsVarA = fouVar.n.a(hsaVar2, z4);
                                    fva fvaVar = fouVar.k;
                                    long jLongValue = fnsVarA.a.g() ? ((Long) fnsVarA.a.c()).longValue() : TimeUnit.NANOSECONDS.convert(j, TimeUnit.MICROSECONDS);
                                    hsr hsrVarI = hsaVar2.i();
                                    gxm gxmVar = fouVar.x;
                                    ddf ddfVar2 = gxmVar.b;
                                    ddi ddiVar2 = ddr.a;
                                    ddfVar2.b();
                                    gxmVar.b.b();
                                    gxmVar.b.b();
                                    if (hsrVarI == hsr.AUTO_LONG_SHOT) {
                                        A = fvaVar.c.a(fvaVar.i.f());
                                    } else {
                                        hsr hsrVar = hsr.LONG_SHOT;
                                        fuw fuyVar = new fuy(fvaVar.a, jLongValue, fvaVar.b, i6, fvaVar.e, fvaVar.h, fvaVar.d, ojc.i(fvaVar.g), null);
                                        fvaVar.d.b();
                                        if (hsrVarI == hsrVar) {
                                            fuyVar = fvaVar.f.a(TimeUnit.NANOSECONDS.toMicros(jLongValue), fuyVar);
                                        }
                                        A = fvaVar.c.a(fuyVar);
                                    }
                                    long jA = A.a();
                                    Object objA = fouVar.u.a();
                                    gfe gfeVar = new gfe();
                                    pih pihVarF2 = pih.f();
                                    pih pihVarF3 = pih.f();
                                    final pih pihVarF4 = pih.f();
                                    final pht phtVarA = fouVar.g.g() ? ((gez) fouVar.g.c()).a(hspVar) : plk.V(oih.a);
                                    phtVarA.d(new Runnable() { // from class: fnz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            pihVarF4.e(phtVarA);
                                        }
                                    }, pgr.INSTANCE);
                                    pih pihVarF5 = pih.f();
                                    plk.af(pihVarF5, new foh(pihVarF4, phtVarA), pgr.INSTANCE);
                                    pih pihVarF6 = pih.f();
                                    if (!z5) {
                                        pihVarF6.o(oih.a);
                                    }
                                    boolean zG = fouVar.h.g();
                                    if (z5) {
                                        hsc hscVarF = hsaVar2.f();
                                        hscVarF.a.h("LS");
                                        hscVarI = hscVarF;
                                    } else {
                                        try {
                                            try {
                                                hscVarI = hsaVar2.g().i();
                                            } catch (IllegalStateException e) {
                                                ((oug) ((oug) ((oug) fou.a.b()).h(e)).G(1814)).r("Couldn't create cached file for encoder output. shot possible already cancele: %s", hspVar);
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    }
                                    try {
                                        FileOutputStream fileOutputStreamE = hscVarI.a.e();
                                        fpp fppVar = fouVar.d;
                                        hsc hscVar = hscVarI;
                                        ?? r38 = A;
                                        if (!fouVar.q.e(fouVar.r.k()) || hoh.f(lic.b(i5))) {
                                            i3 = i5;
                                            i4 = i3;
                                        } else {
                                            i3 = i5;
                                            i4 = (i3 + 180) % 360;
                                        }
                                        mlk fpvVar = new fpv(new frt(new fqq(hsaVar2.h().toString(), fouVar.l, fppVar.a(fileOutputStreamE, i4, pihVarF6, fouVar.b)), new foa(hsaVar2)), fouVar.f(z5), pihVarF3, pihVarF2, phtVar2, pihVarF4, pihVarF5, fouVar.m, fouVar.b);
                                        if (!z5 && !fouVar.m) {
                                            fpvVar = new fra(fpvVar);
                                        }
                                        frg frgVar = new frg((frf) objA, fpvVar);
                                        mln mlnVarA = frgVar.a();
                                        mln mlnVarA2 = frgVar.a();
                                        if (fouVar.l.k(ddr.d) && z5) {
                                            final frl frlVar = new frl(mlnVarA2, i3);
                                            frlVar.a.d(new Runnable() { // from class: frj
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    frlVar.c();
                                                }
                                            }, pgr.INSTANCE);
                                            pihVarF5.e(frlVar.b);
                                            mlnVar = frlVar;
                                        } else {
                                            pihVarF5.o(oih.a);
                                            mlnVar = mlnVarA2;
                                        }
                                        mln mlnVarA3 = zG ? frgVar.a() : null;
                                        fqg fqgVar = new fqg(frgVar.a());
                                        frgVar.d();
                                        mln mlnVar2 = mlnVarA3;
                                        gfg gfgVarA = fouVar.i.a(hspVar, jA, lic.b(i3), z5, gfeVar, mlnVar);
                                        lieVar.close();
                                        fuv fuvVarA = fouVar.j.a(hspVar, new fqr(mlnVarA, mlnVar2, fqgVar), Math.max(0L, jA), z5);
                                        fot fotVar = new fot(hspVar, hsaVar2, fuvVarA, hscVar, (frf) objA, j, pihVarF3, System.currentTimeMillis(), i6, fouVar.i, gfeVar, phtVar2, frgVar, z5, pihVarF2, pihVarF6, fouVar.l.k(ddr.w) ? fouVar.y.g() : oih.a);
                                        fotVar.u = true != z5 ? 3 : 5;
                                        r38.d(new foi(fouVar, gfgVarA, fuvVarA, fnsVarA, fotVar, z5, frgVar, fileOutputStreamE));
                                        frgVar.b().d(bvf.n, fouVar.b);
                                        pihVar.o(fotVar);
                                    } catch (IOException e2) {
                                        throw new RuntimeException(e2);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    A = obj;
                                }
                            }
                        } catch (RuntimeException e3) {
                            pihVar.a(e3);
                        }
                    }
                });
                return new foo(this, hspVarH, pihVarF);
            }
        }
        fozVar = new foz(hspVarH);
        return fozVar;
    }

    public final synchronized void c(fot fotVar) {
        fotVar.b.a(fuj.CANCELLED_EXTERNALLY);
        fotVar.o.c();
        fotVar.c.b();
        hsp hspVar = fotVar.a;
    }

    public final void d(fot fotVar, Throwable th, fos fosVar) {
        ((oug) ((oug) ((oug) a.c()).h(th)).G(1819)).r("%s: Microvideo session failed", fotVar.a);
        this.j.c();
        if (fotVar.l.getAndSet(true)) {
            return;
        }
        if (fotVar.p) {
            fotVar.n.a(new IllegalStateException("Microvideo LongS failed!", th));
        } else {
            g(fotVar, fosVar);
        }
        ((iik) fosVar.c).l = j(fotVar);
    }

    public final boolean f(boolean z) {
        if (!z) {
            return this.l.k(ddr.k);
        }
        ddf ddfVar = this.l;
        ddi ddiVar = ddr.a;
        ddfVar.b();
        return false;
    }

    public final void h(fot fotVar, fos fosVar, long j) {
        hsp hspVar = fotVar.a;
        ojc ojcVar = fotVar.r;
        if (ojcVar.g()) {
            ((iik) fosVar.c).a = ((Long) ojcVar.c()).longValue();
        } else {
            ((oug) ((oug) a.c()).G(1822)).r("No recording-end timestamp recorded for %s", fotVar.a);
        }
        try {
            mak makVar = fotVar.c.a;
            if (fotVar.l.getAndSet(true)) {
                throw new IllegalStateException("Trying to set final file but it has already been submitted.");
            }
            if (this.l.k(dds.J)) {
                this.o.a(makVar);
            }
            fosVar.c.e(makVar.a());
            obr.aQ(!fotVar.n.isDone());
            ((iik) fosVar.c).l = i(fotVar, System.currentTimeMillis());
            makVar.h("LS");
            fotVar.c.c();
            pih pihVar = fotVar.n;
            ikc ikcVar = new ikc(mbs.MPEG4);
            TimeUnit.MICROSECONDS.toMillis(j);
            ikcVar.a((ExifInterface) fosVar.a.c.f());
            ikc ikcVar2 = fosVar.a;
            ikcVar.d = ikcVar2.d;
            ikcVar.b((lic) ikcVar2.b.f());
            pihVar.o(ikcVar);
        } catch (Exception e) {
            d(fotVar, e, fosVar);
        }
    }
}
