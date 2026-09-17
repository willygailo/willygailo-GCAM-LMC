package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class cis implements lxl {
    private static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/audio/processor/AudioProcessingStream");
    private final lxl b;
    private final cir c;
    private final cjb d;
    private final Object e = new Object();
    private int f = 1;

    public cis(lxl lxlVar, cjb cjbVar, cir cirVar) {
        this.b = lxlVar;
        this.c = cirVar;
        this.d = cjbVar;
    }

    @Override // defpackage.lxl
    public final int a() {
        return this.b.a();
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.b.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // defpackage.lxl
    public final AudioFormat b() {
        return this.b.b();
    }

    @Override // defpackage.lxl
    public final void c() {
        synchronized (this.e) {
            cjb cjbVar = this.d;
            synchronized (((cja) cjbVar).d) {
                obr.aT(((cja) cjbVar).i == ciz.READY, "Cannot start from %s", ((cja) cjbVar).i);
                ((cja) cjbVar).f.c();
                cin cinVar = ((cja) cjbVar).j;
                synchronized (cinVar.c) {
                    cinVar.d = 0;
                    cinVar.f = 0L;
                    cinVar.e = 0;
                    cinVar.h = 0L;
                    cinVar.b.set(true);
                }
                final cja cjaVar = (cja) cjbVar;
                cja.d(new Runnable() { // from class: civ
                    @Override // java.lang.Runnable
                    public final void run() {
                        cja cjaVar2 = cjaVar;
                        cjaVar2.b(cjaVar2.h);
                    }
                }, ((cja) cjbVar).b);
                ((cja) cjbVar).i = ciz.STARTED;
            }
            this.f = 2;
        }
    }

    @Override // defpackage.lxl, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            this.d.close();
            this.f = 4;
        }
    }

    @Override // defpackage.lxl
    public final void d() {
        synchronized (this.e) {
            this.d.c();
            this.f = 3;
        }
    }

    @Override // defpackage.lxl
    public final lgp e(ByteBuffer byteBuffer, int i) {
        synchronized (this.e) {
            int i2 = this.f;
            lgp lgpVarA = null;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 4) {
                ((oug) ((oug) a.c()).G(428)).o("Ignore to read due to stream closed.");
                return null;
            }
            cir cirVar = this.c;
            try {
                lgpVarA = cirVar.b.a(byteBuffer, i);
            } catch (IOException e) {
                ((oug) ((oug) ((oug) cir.a.b()).h(e)).G((char) 427)).o("Failed to read audio packet from audio piped input stream.");
            }
            cirVar.a();
            return lgpVarA;
        }
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.b.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.b.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.b.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.b.setPreferredDevice(audioDeviceInfo);
    }
}
