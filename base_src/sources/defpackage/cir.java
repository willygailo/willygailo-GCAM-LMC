package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class cir {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/audio/processor/AudioPipedStream");
    public final cip b;
    public final ciq c;

    public cir(int i, int i2) throws IOException {
        cip cipVar = new cip(i, i2);
        this.b = cipVar;
        try {
            this.c = new ciq(cipVar);
        } catch (IOException e) {
            throw new IOException("Failed to set up output stream pipe", e);
        }
    }

    public final void a() {
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }
}
