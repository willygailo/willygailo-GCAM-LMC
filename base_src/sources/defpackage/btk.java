package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class btk implements iho {
    private final bqm a;
    private final pih b;
    private final lis c;

    public btk(bqm bqmVar, pih pihVar, lis lisVar) {
        this.a = bqmVar;
        this.b = pihVar;
        this.c = lisVar.a("CameraDeviceVerifier");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((dkk) this.a.a().get()).a) {
                this.b.o(bxg.a);
            } else {
                this.c.f("Unable to retrieve camera devices.");
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("No Cameras are currently available.", e);
        }
    }
}
