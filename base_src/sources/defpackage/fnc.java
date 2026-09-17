package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.function.Supplier;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fnc implements hsb {
    public final ojc c;
    public final ddf d;
    private final jns f;
    private final Resources g;
    private final elw h;
    private final hpu i;
    private final huj j;
    private final ScheduledExecutorService k;
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final idd e = new fnb(this);

    public fnc(jns jnsVar, Resources resources, huj hujVar, elw elwVar, ScheduledExecutorService scheduledExecutorService, hpu hpuVar, ojc ojcVar, ddf ddfVar) {
        this.f = jnsVar;
        this.g = resources;
        this.j = hujVar;
        this.i = hpuVar;
        this.h = elwVar;
        this.k = scheduledExecutorService;
        this.c = ojcVar;
        this.d = ddfVar;
    }

    public final synchronized void a() {
        this.j.c("long_press_photos_edu", this.j.a("long_press_photos_edu") + 1);
    }

    public final synchronized void b() {
        if (this.l.compareAndSet(true, false) && this.j.a("long_press_photos_edu") == 0) {
            float thumbnailFinalDiameter = this.f.f.getThumbnailButton().getThumbnailFinalDiameter();
            int dimensionPixelSize = this.g.getDimensionPixelSize(true != this.d.k(ddl.ay) ? R.dimen.long_press_tooltip_above_thumbnail_legacy : R.dimen.long_press_tooltip_above_thumbnail);
            jlz jlzVar = new jlz(new jly() { // from class: fmy
                @Override // defpackage.jly
                public final View a(Context context, boolean z) {
                    return LayoutInflater.from(context).inflate(true != this.a.d.k(ddl.ay) ? R.layout.longshot_notification_tooltip_legacy : R.layout.longshot_notification_tooltip, (ViewGroup) null);
                }
            });
            jlzVar.c(this.f.f.getThumbnailButton(), (int) ((-(thumbnailFinalDiameter / 2.0f)) + dimensionPixelSize));
            jlzVar.i();
            jlzVar.h = this.d.k(ddl.ay);
            jlzVar.n();
            jlzVar.p();
            jlzVar.q();
            jlzVar.c = 200;
            jlzVar.d = 30000;
            jlzVar.d(new Supplier() { // from class: fna
                @Override // j$.util.function.Supplier
                public final Object get() {
                    return Boolean.valueOf(!this.a.b.get());
                }
            });
            jlzVar.o();
            jlzVar.f = true;
            jlzVar.g = false;
            jlzVar.a.add(new jlt(new Runnable() { // from class: fmz
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            }, this.k, TimeUnit.MILLISECONDS.convert(1L, TimeUnit.SECONDS)));
            jlzVar.i = this.h;
            jlzVar.m = 4;
            jlzVar.e = false;
            jlzVar.a();
        }
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void j(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void k(hsp hspVar, Bitmap bitmap, int i) {
    }

    @Override // defpackage.hsb
    public final void l(hsp hspVar) {
        this.l.set(((Boolean) ojc.h(this.i.a(hspVar)).b(eto.d).e(false)).booleanValue());
        if (this.a.get()) {
            return;
        }
        b();
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void m(long j) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void n(Bitmap bitmap) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void o(hsp hspVar, lif lifVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void p(hsp hspVar, hsj hsjVar, hss hssVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void q(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void w(hsp hspVar) {
    }
}
