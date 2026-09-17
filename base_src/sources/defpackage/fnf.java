package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fnf implements jlr {
    public final jns a;
    public final elw b;
    public final fvk c;
    public final Handler d;
    public lie e;
    private final Resources g;
    private final SharedPreferences h;
    private final huj i;
    private final ScheduledExecutorService j;
    private final ddf k;
    private final boolean l;
    private jkc m;
    private ScheduledFuture n = null;
    public volatile lie f = null;

    public fnf(bqg bqgVar, jns jnsVar, Resources resources, SharedPreferences sharedPreferences, elw elwVar, huj hujVar, fvk fvkVar, ddf ddfVar, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.a = jnsVar;
        this.g = resources;
        this.h = sharedPreferences;
        this.b = elwVar;
        this.i = hujVar;
        this.c = fvkVar;
        this.j = scheduledExecutorService;
        this.d = handler;
        this.k = ddfVar;
        this.l = ddfVar.k(ddr.r);
        bqgVar.i().c(new lie() { // from class: fnd
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                fnf fnfVar = this.a;
                synchronized (fnfVar) {
                    lie lieVar = fnfVar.e;
                    if (lieVar != null) {
                        lieVar.close();
                    }
                }
            }
        });
    }

    private final synchronized void e() {
        this.n = this.j.schedule(new fne(this, 0), 3000L, TimeUnit.MILLISECONDS);
    }

    private final synchronized void f() {
        ScheduledFuture scheduledFuture = this.n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.n = null;
        }
        if (this.f != null) {
            this.f.close();
            this.f = null;
        }
    }

    public final synchronized void a() {
        this.i.c("long_press", this.i.a("long_press") + 1);
    }

    @Override // defpackage.jlr
    public final synchronized void b(jkc jkcVar) {
        lie lieVar;
        if (this.l && ((this.m == jkc.PHOTO_IDLE || this.m == null) && jkcVar == jkc.PHOTO_LONGPRESS)) {
            e();
        }
        if (this.m == jkc.VIDEO_PRESSED && jkcVar == jkc.VIDEO_IDLE && !this.h.contains("finish_video_capture")) {
            this.h.edit().putBoolean("finish_video_capture", true).apply();
        }
        if ((this.m == jkc.PHOTO_LONGPRESS || this.m == jkc.PHOTO_LONGPRESS_LOCKED) && jkcVar == jkc.PHOTO_IDLE) {
            if (this.l) {
                f();
            }
            if (!this.h.contains("finish_long_shot_capture")) {
                this.h.edit().putBoolean("finish_long_shot_capture", true).apply();
            }
        }
        if (jkcVar != jkc.PHOTO_IDLE && (lieVar = this.e) != null) {
            lieVar.close();
        }
        this.m = jkcVar;
    }

    final synchronized boolean c() {
        return this.m == jkc.PHOTO_IDLE && this.i.a("long_press") == 0 && this.h.getBoolean("finish_video_capture", false) && !this.h.getBoolean("finish_long_shot_capture", false);
    }

    @Override // defpackage.jlr
    public final synchronized void d() {
        int height = this.a.l.getHeight();
        if (c() && height > 0) {
            int dimensionPixelSize = ((-this.a.l.getHeight()) / 2) + this.g.getDimensionPixelSize(R.dimen.photo_button_radius);
            int dimensionPixelSize2 = this.k.k(ddl.ay) ? this.g.getDimensionPixelSize(R.dimen.long_press_tooltip_above_shutter) : this.g.getDimensionPixelSize(R.dimen.long_press_tooltip_above_shutter_legacy);
            jlz jlzVar = new jlz(this.g.getString(R.string.long_press_tooltip));
            jlzVar.c(this.a.l, dimensionPixelSize + dimensionPixelSize2);
            jlzVar.i();
            jlzVar.h = this.k.k(ddl.ay);
            jlzVar.n();
            jlzVar.p();
            jlzVar.q();
            jlzVar.c = 1500;
            jlzVar.o();
            jlzVar.f = true;
            jlzVar.g(new fne(this, 2), this.j);
            jlzVar.i = this.b;
            jlzVar.m = 4;
            jlzVar.e = true;
            this.e = jlzVar.a();
        }
    }
}
