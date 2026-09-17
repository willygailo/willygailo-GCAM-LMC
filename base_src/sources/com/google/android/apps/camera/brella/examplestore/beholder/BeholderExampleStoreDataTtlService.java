package com.google.android.apps.camera.brella.examplestore.beholder;

import com.google.android.apps.camera.brella.examplestore.beholder.BeholderExampleStoreDataTtlService;
import defpackage.cbp;
import defpackage.cby;
import defpackage.cdf;
import defpackage.cef;
import defpackage.enc;
import defpackage.hub;
import defpackage.oiu;
import defpackage.pgb;
import defpackage.pgk;
import defpackage.pho;
import defpackage.pht;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class BeholderExampleStoreDataTtlService extends cby {
    public hub a;
    public cdf b;
    public cef c;
    public ExecutorService d;

    public final synchronized cdf a() {
        return this.b;
    }

    protected final synchronized hub b() {
        return this.a;
    }

    @Override // defpackage.cby
    public final pht c() {
        final int i = 1;
        pho phoVarQ = pho.q(pgb.i(pho.q(a().g()), new pgk(this) { // from class: cbo
            public final /* synthetic */ BeholderExampleStoreDataTtlService a;

            {
                this.a = this;
            }

            @Override // defpackage.pgk
            public final pht a(Object obj) {
                switch (i) {
                    case 0:
                        return this.a.a().f(TimeUnit.DAYS.toMillis(7L));
                    default:
                        return this.a.c.b(((ope) obj).v());
                }
            }
        }, this.d));
        final int i2 = 0;
        return pgb.i(phoVarQ, new pgk(this) { // from class: cbo
            public final /* synthetic */ BeholderExampleStoreDataTtlService a;

            {
                this.a = this;
            }

            @Override // defpackage.pgk
            public final pht a(Object obj) {
                switch (i2) {
                    case 0:
                        return this.a.a().f(TimeUnit.DAYS.toMillis(7L));
                    default:
                        return this.a.c.b(((ope) obj).v());
                }
            }
        }, this.d);
    }

    @Override // defpackage.cby
    public final pht d() {
        final hub hubVarB = b();
        return pgb.h(pho.q(a().k()), new oiu() { // from class: cbn
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                hub hubVar = hubVarB;
                Map map = (Map) obj;
                Iterator it = map.values().iterator();
                int iIntValue = 0;
                while (it.hasNext()) {
                    iIntValue += ((Integer) it.next()).intValue();
                }
                Integer num = (Integer) map.get(0);
                long jRound = -1;
                if (num != null && iIntValue != 0) {
                    double dIntValue = num.intValue();
                    Double.isNaN(dIntValue);
                    double d = iIntValue;
                    Double.isNaN(d);
                    jRound = Math.round((dIntValue * 100.0d) / d);
                }
                hubVar.j("pref_camera_beholder_example_percent_key", jRound);
                return true;
            }
        }, this.d);
    }

    @Override // defpackage.cby
    protected final ExecutorService e() {
        return this.d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Object applicationContext = getApplicationContext();
        applicationContext.getClass();
        ((cbp) ((enc) applicationContext).c(cbp.class)).c(this);
    }
}
