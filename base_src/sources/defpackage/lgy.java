package defpackage;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class lgy implements lfj {
    public final lfe b;
    public final lge c;
    public final lfi d;
    public final lfm e;
    public final pht h;
    public final ExecutorService i;
    public lxl j;
    public lfl k;
    public int l;
    private final phv m;
    private final int n;
    private final boolean o;
    private final boolean p;
    public final Map f = new HashMap();
    public lff g = null;
    public final Object a = new Object();

    public lgy(final lgz lgzVar) {
        lce lceVar;
        lce lceVar2;
        ojc ojcVarI;
        this.m = lgzVar.a;
        lgzVar.t();
        this.n = lgzVar.k;
        pht phtVar = lgzVar.r;
        this.h = phtVar;
        this.i = plk.K();
        lgzVar.d.c();
        this.p = lgzVar.q;
        if (lgzVar.u != null || lgzVar.o) {
            this.o = true;
        } else {
            this.o = false;
        }
        HashSet hashSet = new HashSet();
        if (!this.o) {
            if (lgzVar.c != null) {
                hashSet.add(lfh.AUDIO);
            }
            if (lgzVar.d != null) {
                hashSet.add(lfh.VIDEO);
            }
            if (lgzVar.n) {
                hashSet.add(lfh.METADATA);
            }
        }
        lge lgeVar = new lge(hashSet, lgzVar.g);
        this.c = lgeVar;
        leh lehVar = lgzVar.d;
        final int i = lehVar != null ? lehVar.a.e : 0;
        lez lezVar = new lez(pgb.h(plk.S(phtVar, lgzVar.t()), new oiu() { // from class: lgu
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                lgy lgyVar = this.a;
                lgz lgzVar2 = lgzVar;
                int i2 = i;
                List list = (List) obj;
                ojc ojcVar = (ojc) plk.ae(lgyVar.h);
                FileDescriptor fileDescriptor = (FileDescriptor) plk.ae(lgzVar2.t());
                obr.aQ(list.get(0) == ojcVar);
                obr.aQ(list.get(1) == fileDescriptor);
                try {
                    int i3 = lgzVar2.k;
                    pht phtVar2 = lgzVar2.j;
                    long j = lgzVar2.h;
                    long j2 = lgzVar2.i;
                    int i4 = 3;
                    int i5 = lgzVar2.c != null ? 2 : 3;
                    int i6 = lgzVar2.d != null ? 1 : 3;
                    if (true == lgzVar2.n) {
                        i4 = 2;
                    }
                    return new lgo(fileDescriptor, i2, i3, ojcVar, phtVar2, j, j2, i5, i6, i4, lgzVar2.l, lgzVar2.g, lgyVar.i, lgyVar.c);
                } catch (IllegalArgumentException | lfb e) {
                    Log.e("VideoRecorderImpl", "Failed to create muxer processor", e);
                    throw new IllegalArgumentException(e);
                }
            }
        }, pgr.INSTANCE));
        this.b = lezVar;
        lce lceVar3 = new lce(0L);
        lce lceVar4 = new lce(Long.MAX_VALUE);
        lfz lfzVar = new lfz();
        leh lehVar2 = lgzVar.d;
        if (lehVar2 != null) {
            lceVar = lceVar4;
            this.d = new lgt(lehVar2, lgzVar.e, lgzVar.f, lezVar, ojc.h(lgzVar.s), ojc.h(lgzVar.u), lgzVar.o, lgeVar, lgzVar.b, lceVar3, lceVar, lgzVar.p, lfzVar);
        } else {
            lceVar = lceVar4;
            this.d = null;
        }
        lee leeVar = lgzVar.c;
        if (leeVar != null) {
            int i2 = lgzVar.w;
            String.valueOf(String.valueOf(leeVar)).length();
            mip.bH(i2).length();
            int i3 = leeVar.e == 2 ? 12 : 16;
            int minBufferSize = AudioRecord.getMinBufferSize(leeVar.d, i3, 2) * 10;
            mip.bH(i2).length();
            try {
                AudioRecord audioRecord = new AudioRecord(i2 - 1, leeVar.d, i3, 2, minBufferSize);
                obr.aQ(audioRecord.getState() == 1);
                ojcVarI = ojc.i(audioRecord);
            } catch (RuntimeException e) {
                Log.e("AudioRecordFactory", "Could not create AudioRecord", e);
                ojcVarI = oih.a;
            }
            if (ojcVarI.g()) {
                this.j = new lgq(new mrq((AudioRecord) ojcVarI.c(), 0));
                lxm lxmVar = lgzVar.v;
                if (lxmVar != null) {
                    this.j = lxmVar.a(this.j);
                }
                String strValueOf = String.valueOf(lgzVar.c);
                int i4 = lgzVar.w;
                String.valueOf(strValueOf).length();
                mip.bH(i4).length();
                this.e = new lfy(leeVar, this.j, this.b, this.c, lgzVar.b, lceVar3, lceVar, lgzVar.p, lfzVar, this.p);
            } else {
                this.c.a(lga.AUDIO_RECORD_ERROR);
                this.b.f();
                this.e = null;
            }
        } else {
            this.e = null;
        }
        lfl lflVar = lgzVar.t;
        if (lflVar != null) {
            this.k = lflVar;
        }
        if (lgzVar.n) {
            lceVar2 = lceVar;
            this.f.put("application/meta", new lgi(this.b, this.c, lceVar2, lgzVar.d));
        } else {
            lceVar2 = lceVar;
        }
        for (cnu cnuVar : lgzVar.m) {
            cny cnyVar = new cny(this.b, lceVar2, cnuVar.a, cnuVar.b);
            this.f.put(cnyVar.a, cnyVar);
        }
        this.l = 1;
    }

    private final pht r(final boolean z) {
        pht phtVarW;
        synchronized (this.a) {
            final long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            this.c.close();
            final int i = 1;
            pht phtVarSubmit = this.m.submit(new Callable(this) { // from class: lgx
                public final /* synthetic */ lgy a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i) {
                        case 0:
                            lgy lgyVar = this.a;
                            boolean z2 = z;
                            long j = jUptimeMillis;
                            lfm lfmVar = lgyVar.e;
                            if (lfmVar != null) {
                                if (z2) {
                                    lfy lfyVar = (lfy) lfmVar;
                                    lfyVar.x = true;
                                    synchronized (lfyVar.e) {
                                        int i2 = ((lfy) lfmVar).O;
                                        if (i2 == 2 || i2 == 5) {
                                            if (((lfy) lfmVar).z) {
                                                final lfy lfyVar2 = (lfy) lfmVar;
                                                ((lfy) lfmVar).c.submit(new Callable() { // from class: lfr
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        return Boolean.valueOf(lfyVar2.N.o(null));
                                                    }
                                                });
                                            }
                                            ((lfy) lfmVar).b(lfy.c());
                                        }
                                    }
                                } else {
                                    lfmVar.b(j);
                                }
                                lfl lflVar = lgyVar.k;
                                if (lflVar != null) {
                                    lflVar.c();
                                }
                                lgyVar.e.a();
                                break;
                            }
                            return null;
                        default:
                            lgy lgyVar2 = this.a;
                            boolean z3 = z;
                            long j2 = jUptimeMillis;
                            lfi lfiVar = lgyVar2.d;
                            if (lfiVar != null) {
                                if (z3) {
                                    lgt lgtVar = (lgt) lfiVar;
                                    lgtVar.r = true;
                                    synchronized (lgtVar.a) {
                                        int i3 = ((lgt) lfiVar).x;
                                        if (i3 == 2 || i3 == 5) {
                                            if (((lgt) lfiVar).s) {
                                                ((lgt) lfiVar).j.post(new lgr((lgt) lfiVar, 2));
                                            }
                                            ((lgt) lfiVar).a(SystemClock.uptimeMillis() * 1000);
                                        }
                                    }
                                } else {
                                    lfiVar.a(j2);
                                }
                                break;
                            }
                            return null;
                    }
                }
            });
            final int i2 = 0;
            phtVarW = plk.W(plk.P(phtVarSubmit, this.m.submit(new Callable(this) { // from class: lgx
                public final /* synthetic */ lgy a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i2) {
                        case 0:
                            lgy lgyVar = this.a;
                            boolean z2 = z;
                            long j = jUptimeMillis;
                            lfm lfmVar = lgyVar.e;
                            if (lfmVar != null) {
                                if (z2) {
                                    lfy lfyVar = (lfy) lfmVar;
                                    lfyVar.x = true;
                                    synchronized (lfyVar.e) {
                                        int i3 = ((lfy) lfmVar).O;
                                        if (i3 == 2 || i3 == 5) {
                                            if (((lfy) lfmVar).z) {
                                                final lfy lfyVar2 = (lfy) lfmVar;
                                                ((lfy) lfmVar).c.submit(new Callable() { // from class: lfr
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        return Boolean.valueOf(lfyVar2.N.o(null));
                                                    }
                                                });
                                            }
                                            ((lfy) lfmVar).b(lfy.c());
                                        }
                                    }
                                } else {
                                    lfmVar.b(j);
                                }
                                lfl lflVar = lgyVar.k;
                                if (lflVar != null) {
                                    lflVar.c();
                                }
                                lgyVar.e.a();
                                break;
                            }
                            return null;
                        default:
                            lgy lgyVar2 = this.a;
                            boolean z3 = z;
                            long j2 = jUptimeMillis;
                            lfi lfiVar = lgyVar2.d;
                            if (lfiVar != null) {
                                if (z3) {
                                    lgt lgtVar = (lgt) lfiVar;
                                    lgtVar.r = true;
                                    synchronized (lgtVar.a) {
                                        int i4 = ((lgt) lfiVar).x;
                                        if (i4 == 2 || i4 == 5) {
                                            if (((lgt) lfiVar).s) {
                                                ((lgt) lfiVar).j.post(new lgr((lgt) lfiVar, 2));
                                            }
                                            ((lgt) lfiVar).a(SystemClock.uptimeMillis() * 1000);
                                        }
                                    }
                                } else {
                                    lfiVar.a(j2);
                                }
                                break;
                            }
                            return null;
                    }
                }
            }), this.m.submit(new lgw(this, 3))).b(new lgv(this, 0), this.m));
        }
        return phtVarW;
    }

    @Override // defpackage.lfj
    public final int a() {
        return this.n;
    }

    @Override // defpackage.lfj
    public final MediaCodec b() {
        lfi lfiVar = this.d;
        if (lfiVar != null) {
            return ((lgt) lfiVar).c;
        }
        return null;
    }

    @Override // defpackage.lfj
    public final ojc c() {
        synchronized (this.a) {
            obr.aQ(this.l != 4);
            lfi lfiVar = this.d;
            Surface surface = lfiVar != null ? ((lgt) lfiVar).d : null;
            if (surface == null) {
                return oih.a;
            }
            return ojc.i(surface);
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        try {
            k().get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("VideoRecorderImpl", "Failed to stop the video recorder at close");
        }
    }

    @Override // defpackage.lfj
    public final ojc d() {
        try {
            return (ojc) this.h.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("VideoRecorderImpl", "Failed to retrieve the location. Ignoring");
            return oih.a;
        }
    }

    @Override // defpackage.lfj
    public final ojc e() {
        lfi lfiVar = this.d;
        if (lfiVar != null) {
            return ojc.i(Long.valueOf(((lgt) lfiVar).o.get()));
        }
        Log.w("VideoRecorderImpl", "Cannot get frame count.");
        return oih.a;
    }

    @Override // defpackage.lfj
    public final ojc f() {
        lfi lfiVar = this.d;
        if (lfiVar == null) {
            Log.w("VideoRecorderImpl", "Cannot get recording time.");
            return oih.a;
        }
        lgt lgtVar = (lgt) lfiVar;
        if (lgtVar.p.get() > lgtVar.q.get()) {
            return ojc.i(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(lgtVar.b(lgtVar.p.get() - lgtVar.q.get()))));
        }
        Log.w("VideoEncoder", String.format("Invalid recording time, start: %d, end: %d", Long.valueOf(lgtVar.q.get()), Long.valueOf(lgtVar.p.get())));
        return oih.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9 A[Catch: all -> 0x0115, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0032, B:9:0x0034, B:18:0x0053, B:20:0x0058, B:21:0x005d, B:35:0x00b4, B:36:0x00b5, B:38:0x00b9, B:39:0x00be, B:50:0x00ee, B:51:0x00ef, B:52:0x00f9, B:54:0x00ff, B:55:0x0109, B:56:0x0110, B:12:0x0044, B:13:0x0048, B:60:0x0114, B:14:0x0049, B:16:0x004d, B:17:0x0052, B:22:0x005e, B:24:0x0065, B:25:0x006c, B:27:0x006e, B:29:0x0075, B:30:0x008c, B:31:0x00b0, B:40:0x00bf, B:42:0x00c6, B:43:0x00cd, B:45:0x00cf, B:46:0x00ea), top: B:69:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6 A[Catch: all -> 0x00ec, TryCatch #3 {, blocks: (B:40:0x00bf, B:42:0x00c6, B:43:0x00cd, B:45:0x00cf, B:46:0x00ea), top: B:71:0x00bf, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf A[Catch: all -> 0x00ec, TryCatch #3 {, blocks: (B:40:0x00bf, B:42:0x00c6, B:43:0x00cd, B:45:0x00cf, B:46:0x00ea), top: B:71:0x00bf, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff A[Catch: all -> 0x0115, LOOP:0: B:52:0x00f9->B:54:0x00ff, LOOP_END, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0032, B:9:0x0034, B:18:0x0053, B:20:0x0058, B:21:0x005d, B:35:0x00b4, B:36:0x00b5, B:38:0x00b9, B:39:0x00be, B:50:0x00ee, B:51:0x00ef, B:52:0x00f9, B:54:0x00ff, B:55:0x0109, B:56:0x0110, B:12:0x0044, B:13:0x0048, B:60:0x0114, B:14:0x0049, B:16:0x004d, B:17:0x0052, B:22:0x005e, B:24:0x0065, B:25:0x006c, B:27:0x006e, B:29:0x0075, B:30:0x008c, B:31:0x00b0, B:40:0x00bf, B:42:0x00c6, B:43:0x00cd, B:45:0x00cf, B:46:0x00ea), top: B:69:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.lfj
    public final pht g() {
        lfm lfmVar;
        Iterator it;
        synchronized (this.a) {
            int i = this.l;
            if (i != 2) {
                String strBy = mip.by(i);
                StringBuilder sb = new StringBuilder(strBy.length() + 31);
                sb.append("STARTED");
                sb.append(" is expected but we got ");
                sb.append(strBy);
                Log.e("VideoRecorderImpl", sb.toString());
                return plk.V(null);
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            lge lgeVar = this.c;
            if (!lgeVar.e) {
                lgeVar.g = jUptimeMillis;
                synchronized (lgeVar.c) {
                    Future future = lgeVar.j;
                    if (future != null) {
                        future.cancel(true);
                        lgeVar.j = null;
                    }
                }
            }
            lfi lfiVar = this.d;
            if (lfiVar == null) {
                lfmVar = this.e;
                if (lfmVar != null) {
                    synchronized (((lfy) lfmVar).e) {
                        if (((lfy) lfmVar).O != 2) {
                            Log.e("AudioEncoder", "It is not recording now");
                        } else {
                            ((lfy) lfmVar).O = 5;
                            ((lfy) lfmVar).q.add(orj.d(Long.valueOf(((lfy) lfmVar).d(jUptimeMillis))));
                        }
                    }
                }
                it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((lfd) it.next()).b(jUptimeMillis);
                }
                this.l = 3;
                return plk.V(null);
            }
            synchronized (((lgt) lfiVar).a) {
                if (((lgt) lfiVar).x != 2) {
                    Log.e("VideoEncoder", "VideoEncoder is not recording now");
                } else {
                    if (((lgt) lfiVar).d != null) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("drop-input-frames", 1);
                        bundle.putLong("drop-start-time-us", jUptimeMillis);
                        ((lgt) lfiVar).c.setParameters(bundle);
                    }
                    ((lgt) lfiVar).n = jUptimeMillis;
                    String.format("Paused recording at %d (or excluding pause time: %d)", Long.valueOf(jUptimeMillis), Long.valueOf(jUptimeMillis - ((lgt) lfiVar).m));
                    ((lgt) lfiVar).x = 5;
                }
            }
            lfmVar = this.e;
            if (lfmVar != null) {
                synchronized (((lfy) lfmVar).e) {
                    if (((lfy) lfmVar).O != 2) {
                        Log.e("AudioEncoder", "It is not recording now");
                    } else {
                        ((lfy) lfmVar).O = 5;
                        ((lfy) lfmVar).q.add(orj.d(Long.valueOf(((lfy) lfmVar).d(jUptimeMillis))));
                    }
                }
            }
            it = this.f.values().iterator();
            while (it.hasNext()) {
                ((lfd) it.next()).b(jUptimeMillis);
            }
            this.l = 3;
            return plk.V(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[Catch: all -> 0x0149, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0032, B:9:0x0034, B:11:0x0042, B:12:0x0047, B:26:0x00ab, B:27:0x00ac, B:29:0x00b0, B:30:0x00b5, B:41:0x00db, B:42:0x00dc, B:43:0x00e6, B:45:0x00ec, B:46:0x00f6, B:62:0x013e, B:63:0x0144, B:49:0x00fd, B:50:0x00ff, B:67:0x0148, B:51:0x0100, B:53:0x0108, B:54:0x010f, B:56:0x0111, B:58:0x0118, B:60:0x0138, B:61:0x013d, B:59:0x011e, B:31:0x00b6, B:33:0x00bd, B:34:0x00c4, B:36:0x00c6, B:37:0x00d7, B:13:0x0048, B:15:0x004f, B:16:0x0056, B:18:0x0058, B:20:0x0066, B:21:0x0088, B:22:0x00a7), top: B:78:0x0003, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[Catch: all -> 0x00d9, TryCatch #1 {, blocks: (B:31:0x00b6, B:33:0x00bd, B:34:0x00c4, B:36:0x00c6, B:37:0x00d7), top: B:75:0x00b6, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6 A[Catch: all -> 0x00d9, TryCatch #1 {, blocks: (B:31:0x00b6, B:33:0x00bd, B:34:0x00c4, B:36:0x00c6, B:37:0x00d7), top: B:75:0x00b6, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc A[Catch: all -> 0x0149, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0032, B:9:0x0034, B:11:0x0042, B:12:0x0047, B:26:0x00ab, B:27:0x00ac, B:29:0x00b0, B:30:0x00b5, B:41:0x00db, B:42:0x00dc, B:43:0x00e6, B:45:0x00ec, B:46:0x00f6, B:62:0x013e, B:63:0x0144, B:49:0x00fd, B:50:0x00ff, B:67:0x0148, B:51:0x0100, B:53:0x0108, B:54:0x010f, B:56:0x0111, B:58:0x0118, B:60:0x0138, B:61:0x013d, B:59:0x011e, B:31:0x00b6, B:33:0x00bd, B:34:0x00c4, B:36:0x00c6, B:37:0x00d7, B:13:0x0048, B:15:0x004f, B:16:0x0056, B:18:0x0058, B:20:0x0066, B:21:0x0088, B:22:0x00a7), top: B:78:0x0003, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec A[Catch: all -> 0x0149, LOOP:0: B:43:0x00e6->B:45:0x00ec, LOOP_END, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0032, B:9:0x0034, B:11:0x0042, B:12:0x0047, B:26:0x00ab, B:27:0x00ac, B:29:0x00b0, B:30:0x00b5, B:41:0x00db, B:42:0x00dc, B:43:0x00e6, B:45:0x00ec, B:46:0x00f6, B:62:0x013e, B:63:0x0144, B:49:0x00fd, B:50:0x00ff, B:67:0x0148, B:51:0x0100, B:53:0x0108, B:54:0x010f, B:56:0x0111, B:58:0x0118, B:60:0x0138, B:61:0x013d, B:59:0x011e, B:31:0x00b6, B:33:0x00bd, B:34:0x00c4, B:36:0x00c6, B:37:0x00d7, B:13:0x0048, B:15:0x004f, B:16:0x0056, B:18:0x0058, B:20:0x0066, B:21:0x0088, B:22:0x00a7), top: B:78:0x0003, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x0149, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0032, B:9:0x0034, B:11:0x0042, B:12:0x0047, B:26:0x00ab, B:27:0x00ac, B:29:0x00b0, B:30:0x00b5, B:41:0x00db, B:42:0x00dc, B:43:0x00e6, B:45:0x00ec, B:46:0x00f6, B:62:0x013e, B:63:0x0144, B:49:0x00fd, B:50:0x00ff, B:67:0x0148, B:51:0x0100, B:53:0x0108, B:54:0x010f, B:56:0x0111, B:58:0x0118, B:60:0x0138, B:61:0x013d, B:59:0x011e, B:31:0x00b6, B:33:0x00bd, B:34:0x00c4, B:36:0x00c6, B:37:0x00d7, B:13:0x0048, B:15:0x004f, B:16:0x0056, B:18:0x0058, B:20:0x0066, B:21:0x0088, B:22:0x00a7), top: B:78:0x0003, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0108 A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:51:0x0100, B:53:0x0108, B:54:0x010f, B:56:0x0111, B:58:0x0118, B:60:0x0138, B:61:0x013d, B:59:0x011e), top: B:73:0x0100, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:51:0x0100, B:53:0x0108, B:54:0x010f, B:56:0x0111, B:58:0x0118, B:60:0x0138, B:61:0x013d, B:59:0x011e), top: B:73:0x0100, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0118 A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:51:0x0100, B:53:0x0108, B:54:0x010f, B:56:0x0111, B:58:0x0118, B:60:0x0138, B:61:0x013d, B:59:0x011e), top: B:73:0x0100, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011e A[Catch: all -> 0x0146, TryCatch #0 {, blocks: (B:51:0x0100, B:53:0x0108, B:54:0x010f, B:56:0x0111, B:58:0x0118, B:60:0x0138, B:61:0x013d, B:59:0x011e), top: B:73:0x0100, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.lfj
    public final pht h() {
        lfm lfmVar;
        Iterator it;
        lge lgeVar;
        long j;
        synchronized (this.a) {
            int i = this.l;
            if (i != 3) {
                String strBy = mip.by(i);
                StringBuilder sb = new StringBuilder(strBy.length() + 30);
                sb.append("PAUSED");
                sb.append(" is expected but we got ");
                sb.append(strBy);
                Log.e("VideoRecorderImpl", sb.toString());
                return plk.V(null);
            }
            long jUptimeMillis = SystemClock.uptimeMillis() * 1000;
            lfi lfiVar = this.d;
            if (lfiVar == null) {
                lfmVar = this.e;
                if (lfmVar != null) {
                    it = this.f.values().iterator();
                    while (it.hasNext()) {
                        ((lfd) it.next()).d(jUptimeMillis);
                    }
                    lgeVar = this.c;
                    if (lgeVar.e) {
                        synchronized (lgeVar.c) {
                            if (lgeVar.g == 0) {
                                Log.w("EncWatcher", "Resume without pause");
                            } else {
                                j = jUptimeMillis - lgeVar.g;
                                if (j >= 0) {
                                    lgeVar.h += j;
                                } else {
                                    long j2 = lgeVar.h;
                                    StringBuilder sb2 = new StringBuilder(48);
                                    sb2.append("Pause duration is negative: ");
                                    sb2.append(j2);
                                    Log.e("EncWatcher", sb2.toString());
                                }
                                lgeVar.g = 0L;
                                lgeVar.c();
                            }
                        }
                    }
                    this.l = 2;
                    return plk.V(null);
                }
                synchronized (((lfy) lfmVar).e) {
                    if (((lfy) lfmVar).O != 5) {
                        Log.e("AudioEncoder", "It is not recording now");
                    } else {
                        ((lfy) lfmVar).O = 2;
                        ((lfy) lfmVar).i(((lfy) lfmVar).d(jUptimeMillis));
                    }
                    it = this.f.values().iterator();
                    while (it.hasNext()) {
                        ((lfd) it.next()).d(jUptimeMillis);
                    }
                    lgeVar = this.c;
                    if (lgeVar.e) {
                        synchronized (lgeVar.c) {
                            if (lgeVar.g == 0) {
                                Log.w("EncWatcher", "Resume without pause");
                            } else {
                                j = jUptimeMillis - lgeVar.g;
                                if (j >= 0) {
                                    lgeVar.h += j;
                                } else {
                                    long j3 = lgeVar.h;
                                    StringBuilder sb3 = new StringBuilder(48);
                                    sb3.append("Pause duration is negative: ");
                                    sb3.append(j3);
                                    Log.e("EncWatcher", sb3.toString());
                                }
                                lgeVar.g = 0L;
                                lgeVar.c();
                            }
                        }
                    }
                    this.l = 2;
                    return plk.V(null);
                }
            }
            synchronized (((lgt) lfiVar).a) {
                if (((lgt) lfiVar).x != 5) {
                    Log.e("VideoEncoder", "It is not recording now");
                } else {
                    ((lgt) lfiVar).e(jUptimeMillis);
                    if (((lgt) lfiVar).d != null) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("drop-input-frames", 0);
                        bundle.putLong("drop-start-time-us", jUptimeMillis);
                        bundle.putLong("time-offset-us", -((lgt) lfiVar).m);
                        ((lgt) lfiVar).c.setParameters(bundle);
                    }
                    String.format("Resumed recording at %d (or excluding pause time: %d)", Long.valueOf(jUptimeMillis), Long.valueOf(jUptimeMillis - ((lgt) lfiVar).m));
                    ((lgt) lfiVar).x = 2;
                }
            }
            lfmVar = this.e;
            if (lfmVar != null) {
                it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((lfd) it.next()).d(jUptimeMillis);
                }
                lgeVar = this.c;
                if (lgeVar.e) {
                    synchronized (lgeVar.c) {
                        if (lgeVar.g == 0) {
                            Log.w("EncWatcher", "Resume without pause");
                        } else {
                            j = jUptimeMillis - lgeVar.g;
                            if (j >= 0) {
                                lgeVar.h += j;
                            } else {
                                long j4 = lgeVar.h;
                                StringBuilder sb4 = new StringBuilder(48);
                                sb4.append("Pause duration is negative: ");
                                sb4.append(j4);
                                Log.e("EncWatcher", sb4.toString());
                            }
                            lgeVar.g = 0L;
                            lgeVar.c();
                        }
                    }
                }
                this.l = 2;
                return plk.V(null);
            }
            synchronized (((lfy) lfmVar).e) {
                if (((lfy) lfmVar).O != 5) {
                    Log.e("AudioEncoder", "It is not recording now");
                } else {
                    ((lfy) lfmVar).O = 2;
                    ((lfy) lfmVar).i(((lfy) lfmVar).d(jUptimeMillis));
                }
            }
            it = this.f.values().iterator();
            while (it.hasNext()) {
                ((lfd) it.next()).d(jUptimeMillis);
            }
            lgeVar = this.c;
            if (lgeVar.e) {
                synchronized (lgeVar.c) {
                    if (lgeVar.g == 0) {
                        Log.w("EncWatcher", "Resume without pause");
                    } else {
                        j = jUptimeMillis - lgeVar.g;
                        if (j >= 0) {
                            lgeVar.h += j;
                        } else {
                            long j5 = lgeVar.h;
                            StringBuilder sb5 = new StringBuilder(48);
                            sb5.append("Pause duration is negative: ");
                            sb5.append(j5);
                            Log.e("EncWatcher", sb5.toString());
                        }
                        lgeVar.g = 0L;
                        lgeVar.c();
                    }
                }
            }
            this.l = 2;
            return plk.V(null);
            throw th;
        }
    }

    @Override // defpackage.lfj
    public final pht i() {
        return r(true);
    }

    @Override // defpackage.lfj
    public final pht j(lff lffVar) {
        synchronized (this.a) {
            int i = this.l;
            int i2 = 1;
            if (i != 1) {
                String strBy = mip.by(i);
                StringBuilder sb = new StringBuilder(strBy.length() + 28);
                sb.append("Trying to start with state: ");
                sb.append(strBy);
                return plk.U(new IllegalStateException(sb.toString()));
            }
            this.g = lffVar;
            this.b.c(lffVar);
            this.c.d = ojc.h(this.g);
            SystemClock.elapsedRealtime();
            return plk.P(this.m.submit(new lgw(this, i2)), this.m.submit(new lgw(this, 0)), this.m.submit(new lgw(this, 2))).b(new lgv(this, 1), this.m);
        }
    }

    @Override // defpackage.lfj
    public final pht k() {
        return r(false);
    }

    @Override // defpackage.lfj
    public final void l(MediaFormat mediaFormat) {
        if (!this.o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        lfi lfiVar = this.d;
        if (lfiVar == null) {
            Log.w("VideoRecorderImpl", "Failed to notify output media format changed event.");
            return;
        }
        lgt lgtVar = (lgt) lfiVar;
        if (!lgtVar.k) {
            throw new IllegalStateException("Should handle encoder internally.");
        }
        lgtVar.c(mediaFormat);
    }

    @Override // defpackage.lfj
    public final void m(FileDescriptor fileDescriptor) {
        synchronized (this.a) {
            int i = this.l;
            if (i == 2) {
                this.b.h(fileDescriptor);
                return;
            }
            String strBy = mip.by(i);
            StringBuilder sb = new StringBuilder(strBy.length() + 31);
            sb.append("STARTED");
            sb.append(" is expected but we got ");
            sb.append(strBy);
            Log.w("VideoRecorderImpl", sb.toString());
        }
    }

    @Override // defpackage.lfj
    public final void n(int i, MediaCodec.BufferInfo bufferInfo) {
        if (!this.o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        lfi lfiVar = this.d;
        if (lfiVar == null) {
            Log.w("VideoRecorderImpl", "Failed to write video date due to not video encoder.");
            return;
        }
        lgt lgtVar = (lgt) lfiVar;
        if (!lgtVar.k) {
            throw new IllegalStateException("Should handle encoder internally.");
        }
        lgtVar.f(i, bufferInfo);
    }

    @Override // defpackage.lfj
    public final void o(Object obj) {
        synchronized (this.a) {
            int i = this.l;
            if (i == 2 || i == 3) {
                this.b.p(obj);
                return;
            }
            String strBy = mip.by(i);
            StringBuilder sb = new StringBuilder(strBy.length() + 36);
            sb.append("Trying to add metadata but state is ");
            sb.append(strBy);
            Log.e("VideoRecorderImpl", sb.toString());
        }
    }

    @Override // defpackage.lfj
    public final ojc p() {
        return ojc.h((lfd) this.f.get("application/meta"));
    }

    @Override // defpackage.lfj
    public final void q(float f) {
        synchronized (this.a) {
            if (this.l == 4) {
                return;
            }
            lfi lfiVar = this.d;
            if (lfiVar == null) {
                Log.w("VideoRecorderImpl", "video encoder is not enabled here, so ignored.");
                return;
            }
            synchronized (((lgt) lfiVar).a) {
                int i = ((lgt) lfiVar).x;
                if (i != 2) {
                    String strBz = mip.bz(i);
                    StringBuilder sb = new StringBuilder(strBz.length() + 17);
                    sb.append("illegal state as ");
                    sb.append(strBz);
                    Log.e("VideoEncoder", sb.toString());
                } else {
                    int iIntValue = ((Integer) ((lgt) lfiVar).g.clamp(Integer.valueOf((int) (((lgt) lfiVar).f * f)))).intValue();
                    float f2 = f * ((lgt) lfiVar).f;
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("Request bit rate ");
                    sb2.append(f2);
                    sb2.append(" but get ");
                    sb2.append(iIntValue);
                    sb2.toString();
                    Bundle bundle = new Bundle();
                    bundle.putInt("video-bitrate", iIntValue);
                    ((lgt) lfiVar).c.setParameters(bundle);
                }
            }
        }
    }
}
