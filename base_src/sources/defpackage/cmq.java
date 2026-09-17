package defpackage;

import j$.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cmq {
    public final jas a;
    public final jxo b;
    public final lar c;
    public final ojt d;
    public final ddf e;
    private final Timer g = new Timer();
    private final Map h = new HashMap();
    public ojc f = oih.a;
    private final TimerTask i = new cmp(this);
    private Duration j = Duration.ZERO;
    private int k = -1;

    public cmq(jas jasVar, jxo jxoVar, lar larVar, ojt ojtVar, ddf ddfVar) {
        this.a = jasVar;
        this.b = jxoVar;
        this.c = larVar;
        this.d = ojtVar;
        this.e = ddfVar;
    }

    private final void g(int i) {
        Duration durationOfMillis = Duration.ofMillis(this.d.a(TimeUnit.MILLISECONDS));
        this.h.put(Integer.valueOf(i), durationOfMillis.minus(this.j));
        this.j = durationOfMillis;
    }

    public final long a(int i) {
        Map map = this.h;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return this.d.a(TimeUnit.MILLISECONDS) - this.j.toMillis();
        }
        Duration duration = (Duration) this.h.get(numValueOf);
        duration.getClass();
        return duration.toMillis();
    }

    public final void b(int i) {
        int i2 = this.k;
        if (i2 != -1) {
            g(i2);
        }
        this.k = i;
    }

    public final void c() {
        ojt ojtVar = this.d;
        if (ojtVar.a) {
            ojtVar.e();
            this.c.c(new cmn(this, 1));
            this.b.g("/video_state_paused", -1L);
        }
    }

    public final void d() {
        ojt ojtVar = this.d;
        if (ojtVar.a) {
            return;
        }
        ojtVar.d();
        this.c.c(new cmn(this, 0));
        this.b.g("/video_state_resumed", -1L);
    }

    public final void e() {
        this.d.d();
        this.g.scheduleAtFixedRate(this.i, 0L, 1000L);
    }

    public final void f() {
        ojt ojtVar = this.d;
        if (ojtVar.a) {
            ojtVar.e();
        }
        this.f = oih.a;
        g(this.k);
        this.b.g("/video_state_stopped", -1L);
        this.g.cancel();
        this.i.cancel();
    }
}
