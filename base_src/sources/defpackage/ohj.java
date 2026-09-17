package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ohj {
    public final InputStream c;
    public final ExecutorService d;
    public final ogu f;
    public final Object a = new Object();
    public final String b = "SPEECH_ENHANCER_RAW_AUDIO_STREAM_PARSER";
    public int e = 1;

    public ohj(InputStream inputStream, ogu oguVar, ExecutorService executorService) {
        this.c = inputStream;
        this.f = oguVar;
        this.d = executorService;
    }

    public final void a(IOException iOException) {
        synchronized (this.a) {
            this.e = 5;
        }
        if (iOException != null) {
            ohk ohkVar = new ohk(iOException);
            ((oug) ((oug) ((oug) ohb.a.b()).h(ohkVar)).G(3684)).y("Got an error from audio stream parser '%s'. Error: %s", "SPEECH_ENHANCER_RAW_AUDIO_STREAM_PARSER", ohkVar);
            return;
        }
        try {
            ohb ohbVar = this.f.a;
            PipedOutputStream pipedOutputStream = ohbVar.b;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            } else {
                ohbVar.c.a.ifPresent(gui.i);
            }
        } catch (IOException e) {
            ((oug) ((oug) ((oug) ohb.a.b()).h(e)).G((char) 3683)).o("Got an exception when trying to close the piped output stream.");
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.e == 2;
        }
        return z;
    }
}
