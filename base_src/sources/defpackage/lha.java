package defpackage;

import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class lha implements lhd {
    private static final AtomicInteger b = new AtomicInteger(0);
    public final MediaRecorder a;
    private boolean c = false;
    private ojc d = oih.a;

    public lha(MediaRecorder mediaRecorder) {
        this.a = mediaRecorder;
        b.getAndIncrement();
    }

    @Override // defpackage.lhd
    public final synchronized void A(int i) {
        if (!this.c) {
            this.a.setVideoFrameRate(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void B(int i, int i2) {
        if (!this.c) {
            this.a.setVideoSize(i, i2);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void C() {
        if (this.c) {
            return;
        }
        try {
            this.a.start();
        } catch (RuntimeException e) {
            throw new lhb(e);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void D() {
        if (this.c) {
            return;
        }
        try {
            this.a.stop();
        } catch (RuntimeException e) {
            throw new lhb(e);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void E() {
        if (!this.c) {
            this.a.setVideoSource(2);
        }
    }

    @Override // defpackage.lhd
    public final MediaRecorder a() {
        return this.a;
    }

    @Override // defpackage.lhd
    public final synchronized Surface b() {
        Surface surface;
        if (this.c) {
            surface = null;
        } else {
            if (this.d.g()) {
                return (Surface) this.d.c();
            }
            surface = this.a.getSurface();
        }
        return surface;
    }

    @Override // defpackage.lhd
    public final synchronized void c() {
        if (this.c) {
            return;
        }
        try {
            this.a.pause();
        } catch (RuntimeException e) {
            throw new lhb(e);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void d() {
        if (this.c) {
            return;
        }
        try {
            this.a.prepare();
        } catch (IOException e) {
            throw new lhb(e);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void e() {
        if (!this.c) {
            this.a.release();
            this.c = true;
        }
    }

    @Override // defpackage.lhd
    public final synchronized void f() {
        if (!this.c) {
            this.d = oih.a;
            this.a.reset();
        }
    }

    @Override // defpackage.lhd
    public final synchronized void g() {
        if (this.c) {
            return;
        }
        try {
            this.a.resume();
        } catch (RuntimeException e) {
            throw new lhb(e);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void h(int i) {
        if (!this.c) {
            this.a.setAudioChannels(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void i(int i) {
        if (!this.c) {
            this.a.setAudioEncoder(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void j(int i) {
        if (!this.c) {
            this.a.setAudioEncodingBitRate(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void k(int i) {
        if (!this.c) {
            this.a.setAudioSamplingRate(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void l(int i) {
        if (!this.c) {
            this.a.setAudioSource(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void m(double d) {
        if (!this.c) {
            this.a.setCaptureRate(d);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void n(Surface surface) {
        if (!this.c) {
            this.a.setInputSurface(surface);
            this.d = ojc.i(surface);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void o(float f, float f2) {
        if (!this.c) {
            this.a.setLocation(f, f2);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void p(int i) {
        if (!this.c) {
            this.a.setMaxDuration(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void q(long j) {
        if (!this.c) {
            this.a.setMaxFileSize(j);
        }
    }

    @Override // defpackage.lhd
    public final void r(FileDescriptor fileDescriptor) throws lhb {
        if (this.c) {
            return;
        }
        try {
            this.a.setNextOutputFile(fileDescriptor);
        } catch (IOException e) {
            throw new lhb(e);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void s(MediaRecorder.OnErrorListener onErrorListener) {
        if (!this.c) {
            this.a.setOnErrorListener(onErrorListener);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void t(MediaRecorder.OnInfoListener onInfoListener) {
        if (!this.c) {
            this.a.setOnInfoListener(onInfoListener);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void u(int i) {
        if (!this.c) {
            this.a.setOrientationHint(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void v(FileDescriptor fileDescriptor) {
        if (!this.c) {
            this.a.setOutputFile(fileDescriptor);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void w(String str) {
        if (!this.c) {
            this.a.setOutputFile(str);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void x(int i) {
        if (!this.c) {
            this.a.setOutputFormat(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void y(int i) {
        if (!this.c) {
            this.a.setVideoEncoder(i);
        }
    }

    @Override // defpackage.lhd
    public final synchronized void z(int i) {
        if (!this.c) {
            this.a.setVideoEncodingBitRate(i);
        }
    }
}
