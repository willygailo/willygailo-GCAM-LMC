package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class lgo implements lfe {
    private final int A;
    public final ConcurrentLinkedQueue a;
    public boolean b;
    public boolean c;
    public final lge d;
    private mah e;
    private final Handler i;
    private final lfg k;
    private final lfg l;
    private final pih n;
    private final int q;
    private final lfc r;
    private final ojc s;
    private final int t;
    private final ExecutorService w;
    private final long x;
    private mah f = null;
    private List g = new ArrayList();
    private volatile long j = 0;
    private List m = new ArrayList();
    private final lgf o = new lgf();
    private lfa p = new lfa(Long.MAX_VALUE, Long.MAX_VALUE);
    private long u = 0;
    private boolean v = false;
    private final Map y = new HashMap();
    private final Object h = new Object();
    private int z = 1;

    public lgo(FileDescriptor fileDescriptor, int i, int i2, ojc ojcVar, pht phtVar, long j, long j2, int i3, int i4, int i5, lfc lfcVar, Handler handler, ExecutorService executorService, lge lgeVar) {
        this.t = i2;
        this.q = i;
        this.s = ojcVar;
        this.r = lfcVar;
        this.d = lgeVar;
        this.e = v(fileDescriptor, lfcVar, i, i2, ojcVar);
        if (i4 != 1) {
            throw new IllegalArgumentException("add least audio or video is required.");
        }
        this.k = new lfg(i3);
        this.l = new lfg(1);
        this.m.add(new lfg(i5));
        this.A = i5;
        this.i = handler;
        this.n = pih.f();
        this.a = new ConcurrentLinkedQueue();
        this.b = false;
        this.c = false;
        this.w = executorService;
        this.x = j2 - 30000000;
        plk.af(pgb.h(phtVar, new lgj(j, 0), pgr.INSTANCE), new lgn(this), pgr.INSTANCE);
    }

    private final synchronized lfa r() {
        return this.p;
    }

    private final void s() {
        synchronized (this.h) {
            obr.aF(this.v);
            final mah mahVar = this.e;
            mah mahVar2 = this.f;
            mahVar2.getClass();
            this.e = mahVar2;
            this.f = null;
            this.m = obr.ah(this.g);
            this.g = new ArrayList();
            this.e.f();
            this.v = false;
            ((pfy) this.w).submit(new Runnable() { // from class: lgm
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    lgo lgoVar = this.a;
                    mah mahVar3 = mahVar;
                    try {
                        mahVar3.g();
                        z = false;
                    } catch (IllegalStateException e) {
                        Log.e("MediaMuxerMul", "Failed to stop previous media muxer", e);
                        z = true;
                    }
                    try {
                        mahVar3.c();
                        if (!z) {
                            return;
                        }
                    } catch (IllegalStateException e2) {
                        Log.e("MediaMuxerMul", "Failed to release previous media muxer", e2);
                    }
                    lgoVar.d.a(lga.MUXER_STOP_ERROR);
                }
            });
            this.i.post(new lgk(this, 0));
        }
    }

    private final void t(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        lfa lfaVarR = r();
        synchronized (this.h) {
            int i2 = this.z;
            if (i2 != 2) {
                String strBA = mip.bA(i2);
                StringBuilder sb = new StringBuilder(strBA.length() + 32);
                sb.append("STARTED");
                sb.append(" is expected, but we get ");
                sb.append(strBA);
                Log.e("MediaMuxerMul", sb.toString());
                return;
            }
            synchronized (this.h) {
                if (this.u >= this.x) {
                    this.i.post(new lgk(this, 1));
                    this.u = 0L;
                }
                if (this.v) {
                    if (this.l.d()) {
                        s();
                    } else if (i == this.l.a() && (bufferInfo.flags & 1) != 0) {
                        long j = bufferInfo.presentationTimeUs;
                        s();
                    }
                }
            }
            if (bufferInfo.presentationTimeUs < 0) {
                long j2 = bufferInfo.presentationTimeUs;
                StringBuilder sb2 = new StringBuilder(63);
                sb2.append("Tried to write negative presentationTimeUs ");
                sb2.append(j2);
                Log.e("MediaMuxerMul", sb2.toString());
                return;
            }
            try {
                this.e.h(i, byteBuffer, bufferInfo);
                this.o.a += (long) bufferInfo.size;
                this.u += (long) bufferInfo.size;
            } catch (IllegalArgumentException | IllegalStateException e) {
                Log.e("MediaMuxerMul", "Fail to write data to muxer", e);
                this.i.post(new lgk(this, 2));
            }
            if (this.o.a >= lfaVarR.a) {
                this.i.post(new lgk(this, 3));
            }
            if (this.o.b >= lfaVarR.b) {
                this.i.post(new lgk(this, 4));
            }
        }
    }

    private final boolean u() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            if (!((lfg) it.next()).e()) {
                return false;
            }
        }
        return true;
    }

    private static mah v(FileDescriptor fileDescriptor, lfc lfcVar, int i, int i2, ojc ojcVar) {
        if (fileDescriptor == null) {
            throw new IllegalArgumentException("Either outputFilePath or outputFilePath should be provided.");
        }
        mah mahVarA = lfcVar.a(fileDescriptor, i);
        mahVarA.e(i2);
        if (i == 0 && ojcVar.g()) {
            mahVarA.d((float) ((Location) ojcVar.c()).getLatitude(), (float) ((Location) ojcVar.c()).getLongitude());
        }
        return mahVarA;
    }

    @Override // defpackage.lfe
    public final ojc a(MediaFormat mediaFormat) {
        lfg lfgVar;
        synchronized (this.h) {
            String strValueOf = String.valueOf(mediaFormat.getString("mime"));
            if (strValueOf.length() != 0) {
                "Trying to add metadata track: ".concat(strValueOf);
            } else {
                new String("Trying to add metadata track: ");
            }
            int i = this.z;
            if (i != 3 && i != 4) {
                if (i == 2 && !this.e.i()) {
                    Log.e("MediaMuxerMul", "Already started, cannot add metadata track.");
                    return oih.a;
                }
                if (this.A == 3) {
                    Log.e("MediaMuxerMul", "Metadata track is forbidden and can't be added");
                    return oih.a;
                }
                String string = mediaFormat.getString("mime");
                string.getClass();
                for (lfg lfgVar2 : this.m) {
                    MediaFormat mediaFormat2 = lfgVar2.d;
                    if (mediaFormat2 != null && string.equals(mediaFormat2.getString("mime"))) {
                        StringBuilder sb = new StringBuilder(string.length() + 37);
                        sb.append("Metadata track format ");
                        sb.append(string);
                        sb.append(" already added.");
                        Log.w("MediaMuxerMul", sb.toString());
                        return ojc.i(Integer.valueOf(lfgVar2.a()));
                    }
                }
                if (((lfg) ohh.t(this.m)).a) {
                    lfgVar = new lfg(this.A);
                } else {
                    List list = this.m;
                    lfgVar = (lfg) list.remove(list.size() - 1);
                }
                lfgVar.c(this.e.a(mediaFormat));
                lfgVar.d = mediaFormat;
                this.m.add(lfgVar);
                lfgVar.a();
                return ojc.i(Integer.valueOf(lfgVar.a()));
            }
            Log.e("MediaMuxerMul", "Already stopped or closed, cannot add metadata track.");
            return oih.a;
        }
    }

    @Override // defpackage.lfe
    public final void b(MediaFormat mediaFormat) {
        synchronized (this.h) {
            int i = this.z;
            if (i != 3 && i != 4) {
                if (i == 2 && !this.e.i()) {
                    Log.e("MediaMuxerMul", "Already started, cannot add audio track.");
                    return;
                }
                if (this.k.d()) {
                    Log.e("MediaMuxerMul", "Audio track is forbidden and can't be added");
                    return;
                }
                this.k.c(this.e.a(mediaFormat));
                lfg lfgVar = this.k;
                lfgVar.d = mediaFormat;
                lfgVar.a();
                return;
            }
            Log.e("MediaMuxerMul", "Already stopped or closed, cannot add audio track.");
        }
    }

    @Override // defpackage.lfe
    public final void c(lff lffVar) {
        this.a.add(lffVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        i();
        this.w.shutdown();
    }

    @Override // defpackage.lfe
    public final void d(long j) {
        if (j < 0) {
            Log.e("MediaMuxerMul", "The duration of record cannot be shorter than existing one.");
        } else {
            this.o.b += j;
        }
    }

    @Override // defpackage.lfe
    public final void e(MediaFormat mediaFormat) {
        synchronized (this.h) {
            int i = this.z;
            if (i != 3 && i != 4) {
                if (i == 2 && !this.e.i()) {
                    Log.e("MediaMuxerMul", "Already started, cannot add video track.");
                    return;
                }
                this.l.c(this.e.a(mediaFormat));
                lfg lfgVar = this.l;
                lfgVar.d = mediaFormat;
                lfgVar.a();
                return;
            }
            Log.e("MediaMuxerMul", "Already stopped or closed, cannot add video track.");
        }
    }

    @Override // defpackage.lfe
    public final void f() {
        synchronized (this.h) {
            if (this.z != 1) {
                Log.e("MediaMuxerMul", "Already started, cannot discard track.");
                return;
            }
            lfg lfgVar = this.k;
            if (lfgVar.a) {
                Log.w("TrackInf", "Track is already added");
            } else {
                lfgVar.b = true;
            }
        }
    }

    @Override // defpackage.lfe
    public final void g(lff lffVar) {
        this.a.remove(lffVar);
    }

    @Override // defpackage.lfe
    public final void h(FileDescriptor fileDescriptor) {
        try {
            this.f = v(fileDescriptor, this.r, this.q, this.t, this.s);
            ArrayList arrayList = new ArrayList();
            lfg lfgVar = this.l;
            if (lfgVar.a) {
                arrayList.add(lfgVar);
            }
            lfg lfgVar2 = this.k;
            if (lfgVar2.a) {
                arrayList.add(lfgVar2);
            }
            for (lfg lfgVar3 : this.m) {
                if (lfgVar3.a) {
                    arrayList.add(lfgVar3);
                }
            }
            this.g = obr.ah(this.m);
            Collections.sort(arrayList);
            int size = arrayList.size();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= size) {
                    break;
                }
                lfg lfgVar4 = (lfg) arrayList.get(i);
                mah mahVar = this.f;
                mahVar.getClass();
                MediaFormat mediaFormat = lfgVar4.d;
                mediaFormat.getClass();
                if (mahVar.a(mediaFormat) != lfgVar4.a()) {
                    z = false;
                }
                obr.aF(z);
                i++;
            }
            for (Map.Entry entry : this.y.entrySet()) {
                mah mahVar2 = this.f;
                mahVar2.getClass();
                mahVar2.b((String) entry.getKey(), entry.getValue());
            }
            this.v = true;
        } catch (lfb e) {
            Log.e("MediaMuxerMul", "Fail to create next video file", e);
            throw new IllegalStateException("Fail to create next video file", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009e A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:10:0x0015, B:12:0x0019, B:14:0x003d, B:15:0x0041, B:17:0x0047, B:18:0x004b, B:19:0x0052, B:23:0x0067, B:26:0x006d, B:30:0x0098, B:31:0x009a, B:33:0x009e, B:34:0x00a4, B:29:0x0074, B:22:0x0059), top: B:41:0x0003, inners: #0, #2 }] */
    @Override // defpackage.lfe
    public final void i() {
        mah mahVar;
        synchronized (this.h) {
            int i = this.z;
            try {
                if (i != 2) {
                    if (i == 4) {
                        mahVar = this.f;
                        if (mahVar != null) {
                            mahVar.c();
                            this.f = null;
                        }
                    }
                    throw th;
                }
                if (this.l.c) {
                    lfg lfgVar = this.k;
                    if (!lfgVar.a || lfgVar.c) {
                        Log.e("MediaMuxerMul", "All tracks empty; writing empty packet to avoid muxer hang");
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1);
                        byteBufferAllocateDirect.put((byte) 0);
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        bufferInfo.set(0, 1, this.j, 5);
                        if (this.l.a) {
                            n(byteBufferAllocateDirect, bufferInfo);
                        } else if (this.k.a) {
                            l(byteBufferAllocateDirect, bufferInfo);
                        } else {
                            Log.e("MediaMuxerMul", "Couldn't write out any empty packets.");
                        }
                    }
                }
                try {
                    this.e.g();
                } catch (IllegalStateException e) {
                    Log.e("MediaMuxerMul", "Failed to stop mediamuxer ", e);
                    this.d.a(lga.MUXER_STOP_ERROR);
                }
                this.z = 3;
                this.e.c();
            } catch (IllegalStateException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29);
                sb.append("Failed to release mediamuxer ");
                sb.append(strValueOf);
                Log.e("MediaMuxerMul", sb.toString());
            }
            this.z = 4;
            mahVar = this.f;
            if (mahVar != null) {
                mahVar.c();
                this.f = null;
            }
        }
    }

    @Override // defpackage.lfe
    public final void j(long j) {
        try {
            this.n.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (ExecutionException e2) {
            e = e2;
            throw new RuntimeException("Wait for Muxer start is interrupted", e);
        } catch (TimeoutException e3) {
            throw new RuntimeException(String.format("Wait for muxer to start timed out after %s milliseconds.audio-ready: %s, video-ready: %s, meta-ready: %s", Long.valueOf(j), Boolean.valueOf(this.k.e()), Boolean.valueOf(this.l.e()), Boolean.valueOf(u())));
        }
    }

    @Override // defpackage.lfe
    public final void k() {
        synchronized (this.h) {
            int i = this.z;
            if (i == 1) {
                if ((this.k.e() && this.l.e() && u()) || this.e.i()) {
                    this.e.f();
                    this.z = 2;
                    this.n.o(null);
                    this.j = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
                }
            } else if (i == 3) {
                Log.e("MediaMuxerMul", "Muxer is already stopped and it cannot be reused");
            }
        }
    }

    @Override // defpackage.lfe
    public final void l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        lfg lfgVar = this.k;
        if (!lfgVar.a) {
            Log.e("MediaMuxerMul", "Audio track is not supported");
            return;
        }
        t(byteBuffer, bufferInfo, lfgVar.a());
        if (bufferInfo.size > 0) {
            this.k.b();
        }
    }

    @Override // defpackage.lfe
    public final void m(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        lfg lfgVar;
        Iterator it = this.m.iterator();
        while (true) {
            if (!it.hasNext()) {
                lfgVar = null;
                break;
            }
            lfgVar = (lfg) it.next();
            if (lfgVar.a && lfgVar.a() == i) {
                break;
            }
        }
        if (lfgVar == null) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Couldn't find metadata track: ");
            sb.append(i);
            Log.e("MediaMuxerMul", sb.toString());
            return;
        }
        if (!lfgVar.a) {
            Log.e("MediaMuxerMul", "Metadata track is not supported");
            return;
        }
        t(byteBuffer, bufferInfo, lfgVar.a());
        if (bufferInfo.size > 0) {
            lfgVar.b();
        }
    }

    @Override // defpackage.lfe
    public final void n(ByteBuffer byteBuffer, final MediaCodec.BufferInfo bufferInfo) {
        lfg lfgVar = this.l;
        if (!lfgVar.a) {
            Log.e("MediaMuxerMul", "Video track is not supported");
            return;
        }
        t(byteBuffer, bufferInfo, lfgVar.a());
        if (bufferInfo.size > 0) {
            this.l.b();
            this.i.post(new Runnable() { // from class: lgl
                @Override // java.lang.Runnable
                public final void run() {
                    lgo lgoVar = this.a;
                    MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
                    Iterator it = Collections.unmodifiableCollection(lgoVar.a).iterator();
                    while (it.hasNext()) {
                        ((lff) it.next()).j(bufferInfo2.presentationTimeUs, bufferInfo2.size);
                    }
                }
            });
        }
    }

    @Override // defpackage.lfe
    public final boolean o() {
        boolean z;
        synchronized (this.h) {
            z = this.z == 2;
        }
        return z;
    }

    @Override // defpackage.lfe
    public final void p(Object obj) {
        synchronized (this.h) {
            int i = this.z;
            if (i != 3 && i != 4) {
                this.y.put("SpecialTypeID", obj);
                this.e.b("SpecialTypeID", obj);
                return;
            }
            String strBA = mip.bA(i);
            StringBuilder sb = new StringBuilder(strBA.length() + 35);
            sb.append("Failed to add metadata with state: ");
            sb.append(strBA);
            Log.e("MediaMuxerMul", sb.toString());
        }
    }

    public final synchronized void q(lfa lfaVar) {
        this.p = lfaVar;
    }
}
