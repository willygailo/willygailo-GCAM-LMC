package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final class hgf implements lie {
    public final elw a;
    public final jgu b;
    public final lar c;
    public final Object d = new Object();
    public Boolean e = false;
    public boolean f = true;
    public int g = 1;
    private final Timer h;

    public hgf(elw elwVar, lar larVar, Context context, Timer timer, ddf ddfVar) {
        this.a = elwVar;
        this.c = larVar;
        this.h = timer;
        jgv jgvVar = new jgv();
        jgvVar.e = context.getResources().getString(R.string.portrait_notification_tap_to_focus);
        jgvVar.f = context;
        jgvVar.a = true;
        jgvVar.i = 5;
        jgvVar.h = ddfVar.k(ddl.ay);
        this.b = jgvVar.a();
    }

    public final void a() {
        if (this.g != 1) {
            this.g = 1;
            b();
        }
    }

    public final void b() {
        this.a.g(this.b);
    }

    public final void c(long j) {
        synchronized (this.d) {
            if (this.f) {
                this.h.schedule(new hge(this), j);
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            this.h.cancel();
            this.f = false;
            a();
        }
    }
}
