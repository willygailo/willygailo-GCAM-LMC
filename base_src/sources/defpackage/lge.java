package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class lge implements lie {
    public Future j;
    private final Handler l;
    private final phw k = plk.L(mip.bP("EncWatch", 1));
    public final Object c = new Object();
    public ojc d = oih.a;
    public volatile boolean e = false;
    public volatile boolean f = false;
    public volatile long g = 0;
    public volatile long h = 0;
    public volatile long i = 0;
    public final Map b = new HashMap();
    public final Map a = new HashMap();

    public lge(Set set, Handler handler) {
        this.l = handler;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.a.put((lfh) it.next(), false);
        }
    }

    public static final lga d(lfh lfhVar, int i) {
        lfh lfhVar2 = lfh.AUDIO;
        switch (i - 1) {
            case 0:
                switch (lfhVar) {
                    case AUDIO:
                        return lga.AUDIO_TRACK_FAIL_TO_START;
                    case VIDEO:
                        return lga.VIDEO_TRACK_FAIL_TO_START;
                    case METADATA:
                        return lga.METADATA_DELAY;
                }
            default:
                switch (lfhVar) {
                    case AUDIO:
                        return lga.AUDIO_BUFFER_DELAY;
                    case VIDEO:
                        return lga.VIDEO_BUFFER_DELAY;
                    case METADATA:
                        return lga.METADATA_DELAY;
                }
        }
        return lga.OTHER;
    }

    public final void a(final lga lgaVar) {
        String strValueOf = String.valueOf(lgaVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
        sb.append("Found error: ");
        sb.append(strValueOf);
        Log.w("EncWatcher", sb.toString());
        synchronized (this.c) {
            if (lgaVar == lga.AUDIO_TRACK_FAIL_TO_START) {
                this.a.remove(lfh.AUDIO);
            }
        }
        if (this.d.g()) {
            this.l.post(new Runnable() { // from class: lgd
                @Override // java.lang.Runnable
                public final void run() {
                    lge lgeVar = this.a;
                    ((lgb) lgeVar.d.c()).fE(lgaVar);
                }
            });
        }
    }

    public final void b(lfh lfhVar, AtomicLong atomicLong) {
        if (this.e) {
            return;
        }
        synchronized (this.c) {
            if (this.a.containsKey(lfhVar)) {
                String.valueOf(String.valueOf(lfhVar)).length();
                this.a.put(lfhVar, true);
                this.b.put(lfhVar, atomicLong);
            } else {
                String strValueOf = String.valueOf(lfhVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
                sb.append("Unexpected track was started: ");
                sb.append(strValueOf);
                Log.w("EncWatcher", sb.toString());
            }
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                ((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue();
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            if (this.j == null) {
                this.j = this.k.scheduleAtFixedRate(new Runnable() { // from class: lgc
                    @Override // java.lang.Runnable
                    public final void run() {
                        lge lgeVar = this.a;
                        if (lgeVar.e) {
                            return;
                        }
                        long j = 0;
                        if (lgeVar.g > 0) {
                            return;
                        }
                        synchronized (lgeVar.c) {
                            long micros = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
                            oor oorVarO = oor.o(lgeVar.a);
                            for (lfh lfhVar : oorVarO.keySet()) {
                                if (((Boolean) oorVarO.get(lfhVar)).booleanValue()) {
                                    synchronized (lgeVar.c) {
                                        if (lgeVar.a.containsKey(lfhVar)) {
                                            if (((Boolean) lgeVar.a.get(lfhVar)).booleanValue()) {
                                                AtomicLong atomicLong = (AtomicLong) lgeVar.b.get(lfhVar);
                                                atomicLong.getClass();
                                                if (atomicLong.get() != j) {
                                                    long j2 = (micros - lgeVar.h) - atomicLong.get();
                                                    if (j2 > 3000000) {
                                                        Log.e("EncWatcher", String.format("Track %s is very delayed: %s us", lfhVar, Long.valueOf(j2)));
                                                        lgeVar.a(lge.d(lfhVar, 2));
                                                    }
                                                    j = 0;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    synchronized (lgeVar.c) {
                                        if (!lgeVar.a.containsKey(lfhVar)) {
                                            j = 0;
                                        } else if (((Boolean) lgeVar.a.get(lfhVar)).booleanValue()) {
                                            j = 0;
                                        } else {
                                            long j3 = micros;
                                            long j4 = (micros - lgeVar.h) - lgeVar.i;
                                            if (lfhVar == lfh.AUDIO) {
                                                if (j4 > 1000000) {
                                                    Log.e("EncWatcher", String.format("Audio track not started after %s us", Long.valueOf(j4)));
                                                    lgeVar.a(lge.d(lfh.AUDIO, 1));
                                                }
                                                micros = j3;
                                                j = 0;
                                            } else {
                                                if (j4 > 3000000) {
                                                    Log.e("EncWatcher", String.format("%s track not started after %s us", lfhVar, Long.valueOf(j4)));
                                                    lgeVar.a(lge.d(lfhVar, 1));
                                                }
                                                micros = j3;
                                                j = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }, 0L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            if (!this.e) {
                this.e = true;
                this.k.shutdown();
            }
        }
    }
}
