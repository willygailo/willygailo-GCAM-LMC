package defpackage;

import j$.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class dhq {
    public final long a;
    public Instant c;
    final /* synthetic */ dhs d;
    private final hsq e;
    private final Instant f;
    private final hsr g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    public boolean b = false;
    private Instant i = Instant.MIN;
    private int j = 0;
    private lji k = lji.b;
    private ljk l = ljk.a;

    public dhq(dhs dhsVar, hsq hsqVar, Instant instant) {
        this.d = dhsVar;
        this.a = hsqVar.b;
        this.e = hsqVar;
        this.f = instant;
        this.g = hsqVar.d;
        this.c = instant;
    }

    public void a() {
        Instant instant = this.d.f.instant();
        d(instant, "CANCELED");
        if (this.h.compareAndSet(false, true)) {
            this.d.h.b(this.a, instant);
        } else {
            e("canceled");
        }
    }

    public void b() {
        Instant instant = this.d.f.instant();
        d(instant, "DELETED");
        if (this.h.compareAndSet(false, true)) {
            this.d.h.c(this.a, instant);
        } else {
            e("deleted");
        }
    }

    public void c(String str) {
        d(this.d.f.instant(), str);
    }

    public void d(Instant instant, String str) {
        this.c = instant;
        if (this.h.get()) {
            f(str);
        } else {
            this.d.h.d(this.a, instant, str);
        }
    }

    protected final void e(String str) {
        this.d.d.h(mip.bp("%s() on shot %d (%s), but it was already finished.", str, Long.valueOf(this.a), this.e));
    }

    protected final void f(String str) {
        this.d.d.g(mip.bp("On shot %d (%s) tried to log '%s', but shot was already finished.", Long.valueOf(this.a), this.e, str));
    }

    public void g(Integer num) {
        this.j++;
        Instant instant = this.d.f.instant();
        this.c = instant;
        if (num != null) {
            this.l.c(num.intValue());
        }
        if (instant.isAfter(this.i)) {
            lis lisVar = this.d.d;
            String strValueOf = String.valueOf(this.e);
            int i = this.j;
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29);
            sb.append("onShotProgress ");
            sb.append(strValueOf);
            sb.append(" (");
            sb.append(i);
            sb.append(")");
            lisVar.b(sb.toString());
            this.i = instant.plus(dhs.b);
            if (this.h.get()) {
                e("makingProgress");
            } else {
                this.d.h.e(this.a, instant);
            }
        }
    }

    public void h(Instant instant) {
        if (this.h.get()) {
            e("markStuck");
        } else {
            this.b = true;
            this.d.h.g(this.a, instant);
        }
    }

    public void i() {
        Instant instant = this.d.f.instant();
        d(instant, "PERSISTED");
        this.k.a();
        this.k = lji.b;
        if (this.h.compareAndSet(false, true)) {
            this.d.h.h(this.a, instant);
        } else {
            e("persisted");
        }
    }

    public void j() {
        if (this.h.get()) {
            e("started");
            return;
        }
        this.d.h.i(this.e, this.f, this.g);
        ljf ljfVar = this.d.e;
        long j = this.a;
        StringBuilder sb = new StringBuilder(26);
        sb.append("Shot #");
        sb.append(j);
        this.k = ljfVar.a(sb.toString());
        ljf ljfVar2 = this.d.e;
        long j2 = this.a;
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("ShotProgress #");
        sb2.append(j2);
        this.l = ljfVar2.b(sb2.toString());
    }
}
