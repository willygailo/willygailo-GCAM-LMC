package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class lld {
    public static final llc a = llc.a(false);
    public final Object b = new Object();
    public final lis c;
    public lap d;
    private final ScheduledExecutorService e;
    private final llc f;
    private lae g;

    public lld(ScheduledExecutorService scheduledExecutorService, lis lisVar, ojc ojcVar) {
        this.e = scheduledExecutorService;
        lis lisVarA = lisVar.a("CamDeviceWakelock");
        this.c = lisVarA;
        llc llcVar = (llc) ojcVar.e(a);
        this.f = llcVar;
        lap lapVar = new lap();
        this.d = lapVar;
        this.g = c(lapVar);
        String strValueOf = String.valueOf(llcVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 12);
        sb.append("Configured: ");
        sb.append(strValueOf);
        lisVarA.b(sb.toString());
    }

    private final lae c(lap lapVar) {
        synchronized (this.b) {
            if (this.f.a) {
                return new lae(lapVar, pgr.INSTANCE, null);
            }
            return new lae(lapVar, pgr.INSTANCE, new lbk(new lbi(this.e, 1000L, TimeUnit.MILLISECONDS)));
        }
    }

    public final lap a() {
        lap lapVarB;
        synchronized (this.b) {
            lapVarB = this.d.b();
        }
        return lapVarB;
    }

    public final lie b(final String str) {
        lie lieVar;
        synchronized (this.b) {
            final lie lieVarA = this.g.a();
            if (lieVarA == null) {
                lis lisVar = this.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
                sb.append("Failed to acquire token requested by:");
                sb.append(str);
                sb.append("; creating new wakelock");
                lisVar.f(sb.toString());
                lap lapVar = new lap();
                this.d = lapVar;
                lae laeVarC = c(lapVar);
                this.g = laeVarC;
                lieVarA = laeVarC.a();
                lieVarA.getClass();
            }
            lis lisVar2 = this.c;
            String strValueOf = String.valueOf(str);
            lisVar2.b(strValueOf.length() != 0 ? "Acquired by ".concat(strValueOf) : new String("Acquired by "));
            lieVar = new lie() { // from class: llb
                @Override // defpackage.lie, java.lang.AutoCloseable
                public final void close() {
                    lld lldVar = this.a;
                    String str2 = str;
                    lie lieVar2 = lieVarA;
                    lis lisVar3 = lldVar.c;
                    String strValueOf2 = String.valueOf(str2);
                    lisVar3.b(strValueOf2.length() != 0 ? "Closed by ".concat(strValueOf2) : new String("Closed by "));
                    lieVar2.close();
                }
            };
        }
        return lieVar;
    }
}
