package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class euy {
    public static final /* synthetic */ int a = 0;
    private static final Executor b = bwk.a;
    private final pih c = pih.f();
    private boolean d = false;

    public final synchronized pht a() {
        return this.c;
    }

    public final synchronized void b(Context context) {
        if (!this.d) {
            final int i = 1;
            this.d = true;
            final eux euxVar = new eux(context);
            pih pihVar = this.c;
            bvf bvfVar = bvf.l;
            Executor executor = b;
            final int i2 = 0;
            final int i3 = 2;
            pihVar.e(pgb.h(plk.R(oom.q(plk.Y(bvfVar, executor), plk.Y(new Runnable() { // from class: euw
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            eux euxVar2 = euxVar;
                            int i4 = euy.a;
                            euxVar2.a();
                            break;
                        case 1:
                            eux euxVar3 = euxVar;
                            int i5 = euy.a;
                            Trace.beginSection("retrievePhenotypeFlags");
                            gvh.c(euxVar3.a);
                            Trace.endSection();
                            break;
                        default:
                            eux euxVar4 = euxVar;
                            int i6 = euy.a;
                            Trace.beginSection("prewarmSensorService");
                            euxVar4.a.getSystemService("sensor");
                            Trace.endSection();
                            break;
                    }
                }
            }, executor), plk.Y(new Runnable() { // from class: euw
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            eux euxVar2 = euxVar;
                            int i4 = euy.a;
                            euxVar2.a();
                            break;
                        case 1:
                            eux euxVar3 = euxVar;
                            int i5 = euy.a;
                            Trace.beginSection("retrievePhenotypeFlags");
                            gvh.c(euxVar3.a);
                            Trace.endSection();
                            break;
                        default:
                            eux euxVar4 = euxVar;
                            int i6 = euy.a;
                            Trace.beginSection("prewarmSensorService");
                            euxVar4.a.getSystemService("sensor");
                            Trace.endSection();
                            break;
                    }
                }
            }, executor), plk.Y(new Runnable() { // from class: euw
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            eux euxVar2 = euxVar;
                            int i4 = euy.a;
                            euxVar2.a();
                            break;
                        case 1:
                            eux euxVar3 = euxVar;
                            int i5 = euy.a;
                            Trace.beginSection("retrievePhenotypeFlags");
                            gvh.c(euxVar3.a);
                            Trace.endSection();
                            break;
                        default:
                            eux euxVar4 = euxVar;
                            int i6 = euy.a;
                            Trace.beginSection("prewarmSensorService");
                            euxVar4.a.getSystemService("sensor");
                            Trace.endSection();
                            break;
                    }
                }
            }, executor), plk.Y(bvf.m, executor))), eto.c, pgr.INSTANCE));
        }
    }
}
