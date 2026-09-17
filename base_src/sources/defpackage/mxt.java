package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class mxt {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    private final ojt d;
    private volatile Process e;
    public volatile boolean c = false;
    public final oiu b = new oiu() { // from class: mxs
        @Override // defpackage.oiu
        public final Object a(Object obj) {
            try {
                return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
            } catch (IOException e) {
                this.a.c = true;
                return null;
            }
        }
    };

    public mxt(oke okeVar) {
        this.d = ojt.b(okeVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.e != null) {
            try {
                if (this.e.exitValue() != 0) {
                    this.c = true;
                    this.e = null;
                }
            } catch (IllegalThreadStateException e) {
                return;
            }
        }
        if (this.c) {
            return;
        }
        synchronized (this) {
            ojt ojtVar = this.d;
            if (ojtVar.a && ojtVar.a(TimeUnit.MILLISECONDS) < a) {
                return;
            }
            this.d.c();
            this.d.d();
            this.e = (Process) this.b.a(str);
        }
    }
}
