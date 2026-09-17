package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class cnk implements cni {
    private static final ouj g = ouj.h("com/google/android/apps/camera/camcorder/media/audio/AudioDeviceChangeListenerImpl");
    public final AudioManager a;
    public final AudioDeviceCallback b;
    public final Handler c;
    public boolean d;
    public boolean e;
    public final Object f;
    private final cnm h;
    private final lda i;
    private final lda j;
    private final ddf k;
    private final HandlerThread l;
    private boolean m;

    public cnk(cnm cnmVar, AudioManager audioManager, lda ldaVar, lda ldaVar2, ddf ddfVar) {
        HandlerThread handlerThread = new HandlerThread("AudioDeviceChangeListenerImpl");
        this.l = handlerThread;
        this.d = false;
        this.e = false;
        this.m = true;
        this.f = new Object();
        this.h = cnmVar;
        this.a = audioManager;
        this.i = ldaVar;
        this.j = ldaVar2;
        this.k = ddfVar;
        this.b = new cnj(this);
        handlerThread.start();
        this.c = mip.bV(handlerThread.getLooper());
    }

    @Override // defpackage.cni
    public final void a() {
        synchronized (this.f) {
            if (this.d) {
                return;
            }
            this.a.unregisterAudioDeviceCallback(this.b);
            if (!this.k.k(dcu.r)) {
                this.i.fB(false);
                this.j.fB("");
            }
            this.e = false;
        }
    }

    public final void b() {
        ojc ojcVarA = this.k.a(dcu.j);
        if (ojcVarA.g()) {
            this.i.fB(Boolean.valueOf(1 == (((Integer) ojcVarA.c()).intValue() & 1)));
            this.j.fB((((Integer) ojcVarA.c()).intValue() & 2) > 0 ? "Bluetooth Audio" : "");
            ((oug) ((oug) g.c()).G((char) 563)).r("Override external mic state: %d. This should never be in prod.", ojcVarA.c());
            return;
        }
        boolean z = this.h.b() != null;
        if (this.m || z != ((Boolean) this.i.fA()).booleanValue()) {
            this.i.fB(Boolean.valueOf(z));
        }
        AudioDeviceInfo audioDeviceInfoA = this.h.a();
        String string = audioDeviceInfoA != null ? audioDeviceInfoA.getProductName().toString() : "";
        if (this.m || !TextUtils.equals(string, (CharSequence) this.j.fA())) {
            this.j.fB(string);
        }
        this.m = false;
        this.i.fA();
        this.j.fA();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            if (this.d) {
                ((oug) ((oug) g.c()).G(559)).o("Already closed");
                return;
            }
            a();
            this.d = true;
            try {
                this.l.quit();
                this.l.join();
            } catch (InterruptedException e) {
                ((oug) ((oug) g.b()).G(558)).o("Could not complete shutting down AudioDeviceChangeListener.");
            }
        }
    }
}
