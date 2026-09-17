package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jhd {
    public final jgu a;
    public final lce b;
    private final ddf e;
    private final Handler f;
    private final Runnable g;
    private final Object h = new Object();
    public lij c = null;
    public Executor d = null;

    public jhd(ddf ddfVar, Context context) {
        this.e = ddfVar;
        boolean zK = ddfVar.k(ddl.ay);
        String string = context.getResources().getString(R.string.flash_chip_text);
        jgv jgvVar = new jgv();
        jgvVar.e = string;
        jgvVar.a = true;
        jgvVar.f = context;
        jgvVar.i = 2;
        jgvVar.h = zK;
        jgvVar.a();
        jgv jgvVar2 = new jgv();
        jgvVar2.f = context;
        jgvVar2.i = 2;
        jgvVar2.h = zK;
        jgvVar2.e = context.getResources().getString(R.string.warm_light_on_with_flash);
        jgvVar2.a = true;
        jgvVar2.a();
        jgvVar2.a = false;
        jgvVar2.d = new jgt() { // from class: jha
            @Override // defpackage.jgt
            public final void a(long j) {
                final jhd jhdVar = this.a;
                Executor executor = jhdVar.d;
                final lij lijVar = jhdVar.c;
                if (lijVar == null || executor == null) {
                    return;
                }
                executor.execute(new Runnable() { // from class: jhc
                    @Override // java.lang.Runnable
                    public final void run() {
                        jhd jhdVar2 = jhdVar;
                        lij lijVar2 = lijVar;
                        jgu jguVar = jhdVar2.a;
                        jguVar.getClass();
                        lijVar2.fB(jguVar);
                    }
                });
            }
        };
        this.a = jgvVar2.a();
        this.f = mip.bV(Looper.getMainLooper());
        this.b = new lce(false);
        this.g = new Runnable() { // from class: jhb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.fB(true);
            }
        };
    }

    public final void a() {
        synchronized (this.h) {
            this.f.removeCallbacks(this.g);
            this.f.removeCallbacks(null);
        }
    }

    public final void b(lij lijVar, Executor executor) {
        this.c = lijVar;
        this.d = executor;
    }

    public final void c() {
        synchronized (this.h) {
            ddf ddfVar = this.e;
            ddi ddiVar = ddl.a;
            ddfVar.b();
        }
    }
}
