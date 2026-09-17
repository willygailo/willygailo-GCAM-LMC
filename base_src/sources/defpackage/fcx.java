package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class fcx extends Thread {
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(50);
    public boolean b = false;
    private fet c = null;
    private Boolean d = false;

    public final synchronized void a(fet fetVar) {
        if (isInterrupted() || !isAlive()) {
            throw new RuntimeException("IncrementalAligner is already shut down.");
        }
        this.c = fetVar;
        this.d = true;
        super.interrupt();
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        this.a.add("Poison Pill");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int size;
        int i;
        while (!isInterrupted()) {
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            try {
                String str = (String) this.a.take();
                this.b = true;
                arrayList.add(str);
                while (!this.a.isEmpty()) {
                    arrayList.add((String) this.a.take());
                }
                while (true) {
                    if (i >= size) {
                        z = false;
                        break;
                    }
                    String str2 = (String) arrayList.get(i);
                    if ("Poison Pill".equals(str2) || this.d.booleanValue()) {
                        break;
                    }
                    String strValueOf = String.valueOf(str2);
                    if (strValueOf.length() != 0) {
                        "Processing file ".concat(strValueOf);
                    } else {
                        new String("Processing file ");
                    }
                    i++;
                    fcz.g();
                }
            } catch (InterruptedException e) {
                interrupt();
            }
            size = arrayList.size();
            i = 0;
            this.b = false;
            if (z) {
                break;
            }
        }
        fet fetVar = this.c;
        if (fetVar != null) {
            fetVar.a(null);
        }
    }
}
