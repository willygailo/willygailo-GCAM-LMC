package defpackage;

import android.media.MediaFormat;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class lgi implements lfd {
    public static final Long a = 4000L;
    public final lfe b;
    public final leh c;
    private final lge f;
    private final phv g;
    private final lda h;
    private final double i;
    private lie k;
    private long m;
    private int o;
    private final AtomicLong j = new AtomicLong(0);
    public final Queue d = new ArrayDeque(1000);
    private final Deque l = new ArrayDeque();
    public ojc e = oih.a;
    private final Object n = new Object();

    public lgi(lfe lfeVar, lge lgeVar, lda ldaVar, leh lehVar) {
        this.b = lfeVar;
        this.f = lgeVar;
        this.h = ldaVar;
        double dA = lehVar.a();
        double dC = lehVar.c();
        Double.isNaN(dA);
        Double.isNaN(dC);
        this.i = dA / dC;
        this.c = lehVar;
        this.g = plk.J(mip.bM("MEncOutput"));
        this.o = 1;
    }

    private final long a(long j) {
        double d = j;
        double d2 = this.i;
        Double.isNaN(d);
        return (long) (d * d2);
    }

    @Override // defpackage.lfd
    public final void b(long j) {
        synchronized (this.n) {
            if (this.o != 2) {
                Log.e("MetaEncoder", "It is not recording now");
            } else {
                this.o = 5;
                this.l.add(orj.d(Long.valueOf(a(j))));
            }
        }
    }

    @Override // defpackage.lfd
    public final void c() {
        synchronized (this.n) {
            if (this.o == 4) {
                return;
            }
            lie lieVar = this.k;
            if (lieVar != null) {
                lieVar.close();
            }
            this.g.shutdown();
            this.o = 4;
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.lfd
    public final void d(long j) {
        synchronized (this.n) {
            if (this.o != 5) {
                Log.e("MetaEncoder", "It is not paused now");
                return;
            }
            this.o = 2;
            long jA = a(j);
            orj orjVar = (orj) this.l.removeLast();
            this.l.add(orj.f((Long) orjVar.j(), Long.valueOf(jA)));
            this.m += jA - ((Long) orjVar.j()).longValue();
        }
    }

    @Override // defpackage.lfd
    public final void e() {
        String str;
        synchronized (this.n) {
            int i = this.o;
            if (i == 1) {
                this.m = 0L;
                this.k = this.h.a(new lgg(this), this.g);
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "application/meta");
                this.e = this.b.a(mediaFormat);
                this.b.k();
                this.f.b(lfh.METADATA, this.j);
                this.o = 2;
                return;
            }
            switch (i) {
                case 1:
                    str = "READY";
                    break;
                case 2:
                    str = "STARTED";
                    break;
                case 3:
                    str = "STOPPED";
                    break;
                case 4:
                    str = "CLOSED";
                    break;
                case 5:
                    str = "PAUSED";
                    break;
                default:
                    str = "null";
                    break;
            }
            StringBuilder sb = new StringBuilder(str.length() + 17);
            sb.append("illegal state as ");
            sb.append(str);
            Log.e("MetaEncoder", sb.toString());
        }
    }

    @Override // defpackage.lfd
    public final void k() {
    }

    @Override // defpackage.lfd
    public final void l(cmj cmjVar, long j) {
        synchronized (this.n) {
            this.j.set(j);
            if (this.d.size() < 1000) {
                long jA = a(j);
                Deque deque = this.l;
                while (!deque.isEmpty()) {
                    orj orjVar = (orj) deque.peek();
                    orjVar.getClass();
                    if (!orjVar.a(Long.valueOf(jA))) {
                        if (orjVar.m() && ((Long) orjVar.j()).longValue() > jA) {
                            break;
                        }
                        String.valueOf(String.valueOf(orjVar)).length();
                        deque.poll();
                    }
                }
                this.d.offer(new lgh(cmjVar, jA - this.m));
            } else {
                Log.w("MetaEncoder", "Video frame timestamp is very off. Possibly no metadata is written.");
            }
        }
    }
}
