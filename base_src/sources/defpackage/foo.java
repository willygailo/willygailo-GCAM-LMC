package defpackage;

import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class foo implements fpl {
    public final fou a;
    public final fpl b;
    final /* synthetic */ hsp c;
    final /* synthetic */ pih d;
    final /* synthetic */ fou e;

    public foo(fou fouVar, hsp hspVar, pih pihVar) {
        this.e = fouVar;
        this.c = hspVar;
        this.d = pihVar;
        this.a = fouVar;
        this.b = new foz(hspVar);
    }

    @Override // defpackage.fpl
    public final pht a(final ikc ikcVar, final hsc hscVar, final ojc ojcVar, final long j, final iij iijVar) {
        return fou.b(this.d, new pgk() { // from class: fok
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                foo fooVar = this.a;
                final ikc ikcVar2 = ikcVar;
                final hsc hscVar2 = hscVar;
                final ojc ojcVar2 = ojcVar;
                final iij iijVar2 = iijVar;
                final fot fotVar = (fot) obj;
                final fou fouVar = fooVar.a;
                final pih pihVarF = pih.f();
                fouVar.b.execute(new Runnable() { // from class: fnx
                    @Override // java.lang.Runnable
                    public final void run() {
                        fou fouVar2 = fouVar;
                        ikc ikcVar3 = ikcVar2;
                        ojc ojcVar3 = ojcVar2;
                        iij iijVar3 = iijVar2;
                        hsc hscVar3 = hscVar2;
                        fot fotVar2 = fotVar;
                        pih pihVar = pihVarF;
                        fos fosVar = new fos(ikcVar3, ojcVar3, iijVar3, null, hscVar3);
                        fotVar2.h.o(Long.valueOf(fotVar2.e));
                        fotVar2.m.o(ikcVar3.d);
                        plk.af(fotVar2.o.b(), new Cfor(fouVar2, fotVar2, fosVar), fouVar2.c);
                        pihVar.e(fotVar2.n);
                    }
                });
                return pihVarF;
            }
        }, new pgk() { // from class: foj
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                foo fooVar = this.a;
                return fooVar.b.a(ikcVar, hscVar, ojcVar, j, iijVar);
            }
        });
    }

    @Override // defpackage.fpl
    public final pht b(final ikc ikcVar, final InputStream inputStream, final hsc hscVar, final ojc ojcVar, final long j, final String str, final iij iijVar) {
        return fou.b(this.d, new pgk() { // from class: fom
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                foo fooVar = this.a;
                ikc ikcVar2 = ikcVar;
                InputStream inputStream2 = inputStream;
                hsc hscVar2 = hscVar;
                ojc ojcVar2 = ojcVar;
                iij iijVar2 = iijVar;
                final fot fotVar = (fot) obj;
                final fou fouVar = fooVar.a;
                boolean z = fps.a;
                try {
                    obr.aQ(!((ojc) plk.ad(fotVar.m)).g());
                    if (fouVar.g.g()) {
                        ((gez) fouVar.g.c()).c(fotVar.a);
                    }
                    try {
                        final fos fosVar = new fos(ikcVar2, ojcVar2, iijVar2, ByteStreams.toByteArray(inputStream2), hscVar2);
                        hsp hspVar = fotVar.a;
                        if (!fotVar.p) {
                            obr.aQ(true);
                            fouVar.p.postDelayed(new Runnable() { // from class: fof
                                @Override // java.lang.Runnable
                                public final void run() {
                                    fou fouVar2 = fouVar;
                                    fot fotVar2 = fotVar;
                                    fos fosVar2 = fosVar;
                                    if (fotVar2.l.getAndSet(true)) {
                                        return;
                                    }
                                    ((oug) ((oug) fou.a.b()).G(1818)).r("Microvideo with uri %s timed out; saving fallback.", fotVar2.a);
                                    fouVar2.j.c();
                                    fotVar2.o.c();
                                    fou.g(fotVar2, fosVar2);
                                    ((iik) fosVar2.c).l = fou.j(fotVar2);
                                }
                            }, fotVar.a, 15000L);
                            fou.e(fotVar.g, fotVar.a, fouVar.p);
                        }
                        if (!fotVar.h.isDone()) {
                            fotVar.h.o(Long.valueOf(fotVar.e));
                        }
                        plk.af(fotVar.o.b(), new foq(fouVar, fotVar, fosVar), fouVar.c);
                        return fotVar.n;
                    } catch (IOException e) {
                        ((oug) ((oug) ((oug) fou.a.b()).h(e)).G((char) 1801)).o("Error occurred fetching jpeg bytes in finishMicrovideo");
                        return plk.U(e);
                    }
                } catch (ExecutionException e2) {
                    ((oug) ((oug) ((oug) fou.a.b()).h(e2)).G((char) 1802)).o("Location info found for a non-long shot");
                    return plk.U(e2);
                }
            }
        }, new pgk() { // from class: fol
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                foo fooVar = this.a;
                return fooVar.b.b(ikcVar, inputStream, hscVar, ojcVar, j, str, iijVar);
            }
        });
    }

    @Override // defpackage.fpl
    public final void c() {
        plk.af(this.d, new fon(this), pgr.INSTANCE);
    }
}
