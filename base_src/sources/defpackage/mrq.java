package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class mrq implements mrp {
    public AudioRecord a;
    public final int b;
    private final AudioFormat c;
    private final mrt d;
    private final AtomicInteger e = new AtomicInteger(0);
    private final AtomicLong f = new AtomicLong(0);
    private final AtomicLong g = new AtomicLong(0);
    private final AtomicInteger h = new AtomicInteger(0);
    private final AtomicInteger i = new AtomicInteger(0);
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicInteger k = new AtomicInteger(0);
    private final AtomicInteger l = new AtomicInteger(0);
    private final AtomicLong m = new AtomicLong(0);
    private final AtomicLong n = new AtomicLong(0);
    private final AtomicLong o = new AtomicLong(0);
    private final AtomicLong p = new AtomicLong(0);
    private final AudioTimestamp q;
    private long r;

    public mrq(AudioRecord audioRecord, int i) {
        this.a = audioRecord;
        this.b = i;
        AudioFormat format = audioRecord.getFormat();
        this.c = format;
        this.d = new mrt(format);
        this.q = new AudioTimestamp();
    }

    private final void e(boolean z) {
        if (z || System.currentTimeMillis() >= this.o.get()) {
            String.format("  read=%d (%d bytes), maxDeltaNs=%d, noTimestamp=%d, noData=%d, noInit=%d, badOut=%d, largeGap=%d", Integer.valueOf(this.e.get()), Long.valueOf(this.f.get()), Long.valueOf(this.g.get()), Integer.valueOf(this.h.get()), Integer.valueOf(this.i.get()), Integer.valueOf(this.j.get()), Integer.valueOf(this.k.get()), Integer.valueOf(this.l.get()));
            this.o.set(System.currentTimeMillis() + 5000);
        }
    }

    @Override // defpackage.mrp
    public final AudioFormat a() {
        return this.a.getFormat();
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.a.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // defpackage.mrp
    public final synchronized mro b(ByteBuffer byteBuffer, int i) {
        int i2;
        long j;
        long j2;
        if (this.a.getState() != 1) {
            this.j.incrementAndGet();
            e(false);
            return null;
        }
        if (byteBuffer.isDirect()) {
            i2 = this.a.read(byteBuffer, i);
            this.e.incrementAndGet();
            this.f.addAndGet(i2);
        } else {
            if (!byteBuffer.hasArray()) {
                Log.w("AudioStreamImpl", "Provided bytebuffer unsupported.");
                this.k.incrementAndGet();
                e(false);
                return null;
            }
            i2 = this.a.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i);
            this.e.incrementAndGet();
            this.f.addAndGet(i2);
        }
        if (i2 == 0) {
            this.i.incrementAndGet();
            e(false);
            return null;
        }
        if (this.a.getTimestamp(this.q, this.b) != 0) {
            this.h.incrementAndGet();
            e(false);
            return null;
        }
        mrt mrtVar = this.d;
        AudioTimestamp audioTimestamp = this.q;
        long j3 = (((long) i2) / ((long) mrtVar.c)) / ((long) mrtVar.d);
        synchronized (mrtVar.a) {
            long j4 = (mrtVar.e - audioTimestamp.framePosition) * mrtVar.b;
            mrtVar.e += j3;
            j = j4 + audioTimestamp.nanoTime;
        }
        if (j < this.m.get()) {
            Log.w("AudioStreamImpl", String.format("Stale audio packet detected: %d (start=%d)", Long.valueOf(j), Long.valueOf(this.m.get())));
        } else if (this.n.compareAndSet(0L, j)) {
            long j5 = this.n.get() - this.m.get();
            String.format("First read. Start: %d ns. First packet: %d ns. Audio startup latency: %d ns (%d ms)", Long.valueOf(this.m.get()), Long.valueOf(this.n.get()), Long.valueOf(j5), Long.valueOf(TimeUnit.MILLISECONDS.convert(j5, TimeUnit.NANOSECONDS)));
        }
        if (j < this.r) {
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(j);
            objArr[1] = Long.valueOf(this.r);
            mrt mrtVar2 = this.d;
            synchronized (mrtVar2.a) {
                j2 = mrtVar2.e;
            }
            objArr[2] = Long.valueOf(j2);
            Log.w("AudioStreamImpl", String.format("Timestamp out of order: %d < %d. Frame pos=%d", objArr));
            j = this.r;
            this.r = 100000 + j;
        } else {
            this.r = 100000 + j;
        }
        long j6 = this.p.get();
        if (j6 <= 0) {
            j6 = j;
        }
        long j7 = j - j6;
        if (j7 >= 100000000) {
            Log.w("AudioStreamImpl", String.format("Large audio timestamp gap detected: %d ns (packet %d)", Long.valueOf(j7), Integer.valueOf(this.e.get())));
            this.l.incrementAndGet();
        }
        AtomicLong atomicLong = this.g;
        atomicLong.set(Math.max(atomicLong.get(), j7));
        this.p.set(j);
        e(false);
        return mro.a(byteBuffer, i2, j);
    }

    @Override // defpackage.mrp
    public final synchronized void c() {
        this.r = 0L;
        mrt mrtVar = this.d;
        synchronized (mrtVar.a) {
            mrtVar.e = 0L;
        }
        if (this.a.getState() != 1) {
            int audioSource = this.a.getAudioSource();
            int sampleRate = this.a.getSampleRate();
            int channelConfiguration = this.a.getChannelConfiguration();
            int audioFormat = this.a.getAudioFormat();
            int iA = mrt.a(this.a.getFormat());
            int iMax = Math.max(1, this.a.getChannelCount());
            int bufferSizeInFrames = this.a.getBufferSizeInFrames();
            this.a.release();
            Log.w("AudioStreamImpl", "AudioRecord in a bad state. Recreating AudioRecord");
            this.a = new AudioRecord(audioSource, sampleRate, channelConfiguration, audioFormat, bufferSizeInFrames * iA * iMax);
        }
        if (this.a.getState() != 1) {
            Log.e("AudioStreamImpl", "Could not start AudioStream since it is not initialized.");
        } else {
            this.a.startRecording();
            this.m.set(this.b == 1 ? SystemClock.elapsedRealtimeNanos() : System.nanoTime());
        }
    }

    @Override // defpackage.mrp, java.lang.AutoCloseable
    public final synchronized void close() {
        e(true);
        this.a.release();
    }

    @Override // defpackage.mrp
    public final synchronized void d() {
        try {
            e(true);
            this.a.stop();
            this.e.set(0);
            this.f.set(0L);
            this.g.set(0L);
            this.h.set(0);
            this.i.set(0);
            this.j.set(0);
            this.k.set(0);
            this.l.set(0);
            this.o.set(0L);
            this.p.set(0L);
            this.m.set(0L);
            this.n.set(0L);
        } catch (IllegalStateException e) {
            Log.w("AudioStreamImpl", "Error while closing AudioStream.", e);
        }
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.a.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.a.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.a.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.a.setPreferredDevice(audioDeviceInfo);
    }
}
