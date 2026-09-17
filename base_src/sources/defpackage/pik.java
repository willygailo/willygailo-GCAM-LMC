package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class pik implements Runnable {
    pim a;

    public pik(pim pimVar) {
        this.a = pimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pht phtVar;
        pim pimVar = this.a;
        if (pimVar == null || (phtVar = pimVar.a) == null) {
            return;
        }
        this.a = null;
        if (phtVar.isDone()) {
            pimVar.e(phtVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = pimVar.b;
            pimVar.b = null;
            String string = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    pimVar.a(new pil(string));
                    throw th;
                }
            }
            try {
                String strValueOf = String.valueOf(string);
                String strValueOf2 = String.valueOf(phtVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 2 + String.valueOf(strValueOf2).length());
                sb2.append(strValueOf);
                sb2.append(": ");
                sb2.append(strValueOf2);
                pimVar.a(new pil(sb2.toString()));
                phtVar.cancel(true);
            } catch (Throwable th2) {
                th = th2;
                pimVar.a(new pil(string));
                throw th;
            }
        } catch (Throwable th3) {
            phtVar.cancel(true);
            throw th3;
        }
    }
}
