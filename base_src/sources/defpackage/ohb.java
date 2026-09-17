package defpackage;

import com.google.android.apps.camera.bottombar.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ohb extends InputStream implements ogs {
    public static final ouj a = ouj.h("com/google/babelfish/device/avenh/l2l/speechenhancer2/SpeechEnhancerImpl");
    public final PipedOutputStream b;
    public final ohd c;
    private final PipedInputStream e;
    private final ohf f;
    private final ohw h;
    private final AtomicReference d = new AtomicReference(ogz.UNINITIALIZED);
    private Optional g = Optional.empty();
    private volatile Thread i = null;

    public ohb(ohd ohdVar, ohw ohwVar, PipedInputStream pipedInputStream, PipedOutputStream pipedOutputStream, ohf ohfVar) {
        this.c = ohdVar;
        this.h = ohwVar;
        this.e = pipedInputStream;
        this.b = pipedOutputStream;
        this.f = ohfVar;
    }

    @Override // defpackage.ogs
    public final void a() {
        obr.aR((this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true, "'flush()' must be called before calling 'provideRawAudio()'.");
        obr.aR(this.d.get() != ogz.READY, "'start()' must be called before calling 'flush()'.");
        obr.aR((this.d.get() == ogz.SHUTTING_DOWN || this.d.get() == ogz.SHUT_DOWN) ? false : true, "Can't call 'flush()' after calling 'shutdown()'.");
        obr.aR(this.c.i == 2, "raw audio interface type is set to 'InputStream' - calls to flush() aren't allowed in this mode.");
        if (this.d.get() == ogz.PAUSED) {
            ((ogz) this.d.get()).name();
        } else {
            this.f.flush();
            this.c.a.ifPresent(gui.f);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = this.c.j;
        obr.aR(false, "To use InputStream methods on SpeechEnhancer, set the 'processed audio interface type' to 'INPUT_STREAM' when creating the SpeechEnhancer instance.");
        return this.e.available();
    }

    @Override // defpackage.ogs
    public final void b() {
        if (this.d.compareAndSet(ogz.UNINITIALIZED, ogz.INITIALIZING)) {
            this.i = Thread.currentThread();
            ohd ohdVar = this.c;
            if (ohdVar.i == 1) {
                this.g = Optional.of(new ohj((InputStream) ohdVar.b.get(), new ogu(this), this.c.c));
            }
            this.d.set(ogz.READY);
        }
    }

    @Override // defpackage.ogs
    public final void c(ByteBuffer byteBuffer) {
        obr.aR((this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'provideRawAudio()'.");
        obr.aR(this.d.get() != ogz.READY, "'start()' must be called before calling 'provideRawAudio()'.");
        obr.aR((this.d.get() == ogz.SHUTTING_DOWN || this.d.get() == ogz.SHUT_DOWN) ? false : true, "Can't call 'provideRawAudio()' after calling 'shutdown()'.");
        obr.aR(this.c.i == 2, "raw audio interface type is set to 'InputStream' - calls to provideRawAudio() aren't allowed in this mode.");
        if (this.d.get() == ogz.PAUSED) {
            ((ogz) this.d.get()).name();
        } else {
            i(byteBuffer);
        }
    }

    @Override // defpackage.ogs
    public final void d(ohy ohyVar) {
        boolean z = (this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true;
        obr.aR(z, "'initialize()' must be called before calling 'provideVideoFrame()'.");
        obr.aR(this.d.get() != ogz.READY, "'start()' must be called before calling 'provideVideoFrame()'.");
        obr.aR((this.d.get() == ogz.SHUTTING_DOWN || this.d.get() == ogz.SHUT_DOWN) ? false : true, "Can't call 'provideVideoFrame()' after calling 'shutdown()'.");
        if (this.d.get() == ogz.PAUSED) {
            ((ogz) this.d.get()).name();
            return;
        }
        ohw ohwVar = this.h;
        if (ohwVar.b.b) {
            ohwVar.c.b();
            pff pffVar = pff.INSTANCE;
            Instant instantNow = Instant.now();
            if ((ohwVar.g.isAfter(Instant.EPOCH) ? Duration.between(ohwVar.g, instantNow) : ohwVar.b.h.plusSeconds(1L)).compareTo(ohwVar.b.h) >= 0) {
                ohwVar.g = instantNow;
                double dA = ohwVar.c.a();
                ohq ohqVar = ohwVar.b;
                double d = ohqVar.d;
                double d2 = ohqVar.e;
                if (dA < d || dA > d2) {
                    oha ohaVar = ohwVar.k;
                    StringBuilder sb = new StringBuilder(R.styleable.AppCompatTheme_tooltipFrameBackground);
                    sb.append("StoredVideoFrameProcessor: current input FPS (");
                    sb.append((int) dA);
                    sb.append(") is outside the allowed range (");
                    sb.append((int) d);
                    sb.append(", ");
                    sb.append((int) d2);
                    sb.append(").");
                    ((oug) ((oug) ohw.a.c()).G((char) 3697)).r("%s", sb.toString());
                    ((oug) ((oug) ohw.a.c()).G((char) 3698)).o("SVFP: Input FPS warning");
                }
            }
        }
        int i = ohwVar.j;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                ohwVar.i.set(ohyVar);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ogs
    public final void e(double d) {
        obr.aR((this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'setMixRawAudioRatio()'.");
        obr.aR((this.d.get() == ogz.SHUTTING_DOWN || this.d.get() == ogz.SHUT_DOWN) ? false : true, "Can't call 'setMixRawAudioRatio()' after calling 'shutdown()'.");
        obr.aK(d >= 0.0d && d <= 1.0d, "ratio must be 0-1 (got %s)", String.valueOf(d));
        this.f.setRawAudioMixingRatio(d);
    }

    @Override // defpackage.ogs
    public final void f() {
        obr.aR((this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true, "call 'initialize()' before calling 'start()'.");
        obr.aR((this.d.get() == ogz.SHUTTING_DOWN || this.d.get() == ogz.SHUT_DOWN) ? false : true, "can't call 'start()' after calling 'stop()'.");
        obr.aR(this.d.get() != ogz.PAUSED, "can't call 'start()' while paused. Use 'resume()' instead.");
        obr.aR(Thread.currentThread() == this.i, "'start' must be called from the thread that was used to call initialize()");
        if (this.d.get() != ogz.READY) {
            ((ogz) this.d.get()).name();
            return;
        }
        this.h.start();
        this.g.ifPresent(gui.g);
        this.d.set(ogz.PROCESSING);
        ((ogz) this.d.get()).name();
    }

    @Override // defpackage.ogs
    public final void g() {
        obr.aR((this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true, "call 'initialize()' before calling 'stop()'.");
        obr.aR(this.d.get() != ogz.READY, "call 'start()' before calling 'stop()'.");
        obr.aR(Thread.currentThread() == this.i, "'stop' must be called from the thread that was used to call initialize()");
        if (this.d.get() == ogz.SHUTTING_DOWN || this.d.get() == ogz.SHUT_DOWN) {
            ((ogz) this.d.get()).name();
            return;
        }
        this.d.set(ogz.SHUTTING_DOWN);
        ((ogz) this.d.get()).name();
        ohw ohwVar = this.h;
        ohwVar.f.set(false);
        ((oho) ohwVar.e).c.set(true);
        this.g.ifPresent(gui.h);
        this.d.set(ogz.SHUT_DOWN);
        ((ogz) this.d.get()).name();
    }

    @Override // defpackage.ogs
    public final void h() {
        boolean z = false;
        obr.aR((this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'setMixAllSpeechRatio()'.");
        if (this.d.get() != ogz.SHUTTING_DOWN && this.d.get() != ogz.SHUT_DOWN) {
            z = true;
        }
        obr.aR(z, "Can't call 'setMixAllSpeechRatio()' after calling 'shutdown()'.");
        obr.aK(true, "ratio must be 0-1 (got %s)", String.valueOf(1.0d));
        this.f.setAllSpeechMixingRatio(1.0d);
    }

    public final void i(ByteBuffer byteBuffer) {
        obr.aG(byteBuffer.hasRemaining(), "audio buffer can't be empty");
        ohd ohdVar = this.c;
        if (ohdVar.i == 1) {
            ohdVar.a.ifPresent(new gui(6));
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.f.provideRawAudio(bArr);
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.c.j;
        obr.aR(false, "To use InputStream methods on SpeechEnhancer, set the 'processed audio interface type' to 'INPUT_STREAM' when creating the SpeechEnhancer instance.");
        obr.aR((this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'read()'.");
        obr.aR(this.d.get() != ogz.READY, "'start()' must be called before calling 'read()'.");
        return this.e.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.c.j;
        obr.aR(false, "To use InputStream methods on SpeechEnhancer, set the 'processed audio interface type' to 'INPUT_STREAM' when creating the SpeechEnhancer instance.");
        obr.aR((this.d.get() == ogz.UNINITIALIZED || this.d.get() == ogz.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'read()'.");
        obr.aR(this.d.get() != ogz.READY, "'start()' must be called before calling 'read()'.");
        return this.e.read(bArr, i, i2);
    }
}
