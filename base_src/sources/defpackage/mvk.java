package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.federatedlearning.PrimesExampleStoreDataTtlService;
import java.util.Random;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class mvk {
    private static final mdf a = new mdi();
    private static final Random b = new Random();
    private static final phv c;
    private static final Object d;
    private static kqw e;

    static {
        pij pijVar = new pij();
        pijVar.c("PrimesBrellaExampleStore-%d");
        c = plk.J(Executors.newSingleThreadExecutor(pij.b(pijVar)));
        d = new Object();
    }

    public static kqw a(Context context) {
        kqw kqwVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (d) {
            if (e == null) {
                mdf mdfVar = a;
                Random random = b;
                phv phvVar = c;
                e = new kqw(applicationContext, new kra(applicationContext, mdfVar, random, phvVar), phvVar, PrimesExampleStoreDataTtlService.class);
            }
            kqwVar = e;
        }
        return kqwVar;
    }
}
