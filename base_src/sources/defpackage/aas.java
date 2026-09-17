package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aas {
    public static int a(Context context, int i) {
        return context.getColor(i);
    }

    public static Object b(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final aeu c(Class cls, aih aihVar, aev aevVar) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strA = qno.a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        strA.getClass();
        aeu aeuVarB = (aeu) aihVar.a.get(strA);
        if (cls.isInstance(aeuVarB)) {
            if ((aevVar instanceof aex ? (aex) aevVar : null) != null) {
                aeuVarB.getClass();
            }
            if (aeuVarB == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            }
        } else {
            aeuVarB = aevVar instanceof aew ? ((aew) aevVar).b() : aevVar.a();
            aeu aeuVar = (aeu) aihVar.a.put(strA, aeuVarB);
            if (aeuVar != null) {
                aeuVar.c();
            }
            aeuVarB.getClass();
        }
        return aeuVarB;
    }

    public static bvv d(final Runnable runnable, final String str) {
        return f(new bvv() { // from class: bvw
            @Override // defpackage.bvv
            public final /* synthetic */ String c() {
                return aas.g(this);
            }

            @Override // defpackage.bvv
            public final pht fz() {
                String str2 = str;
                Runnable runnable2 = runnable;
                Trace.beginSection(str2.length() != 0 ? "task:".concat(str2) : new String("task:"));
                runnable2.run();
                Trace.endSection();
                return plk.V(true);
            }
        }, str);
    }

    public static bvv e(final Runnable runnable, final Executor executor, final String str) {
        return f(new bvv() { // from class: bvx
            @Override // defpackage.bvv
            public final /* synthetic */ String c() {
                return aas.g(this);
            }

            @Override // defpackage.bvv
            public final pht fz() {
                Executor executor2 = executor;
                final String str2 = str;
                final Runnable runnable2 = runnable;
                final pih pihVarF = pih.f();
                executor2.execute(new Runnable() { // from class: bvz
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = str2;
                        Runnable runnable3 = runnable2;
                        pih pihVar = pihVarF;
                        try {
                            Trace.beginSection(str3.length() != 0 ? "task:".concat(str3) : new String("task:"));
                            runnable3.run();
                            Trace.endSection();
                            pihVar.o(true);
                        } finally {
                            pihVar.o(false);
                        }
                    }
                });
                return pihVarF;
            }
        }, str);
    }

    public static bvv f(bvv bvvVar, String str) {
        return new bwa(bvvVar, str);
    }

    public static String g(bvv bvvVar) {
        return bvvVar.getClass().getName();
    }
}
