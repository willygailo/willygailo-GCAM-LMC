package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.cardboard.ExternalSurfaceManager;

/* JADX INFO: loaded from: classes2.dex */
public final class pwk implements pwg {
    private final Runnable a;
    private final long b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public pwk(final long j, long j2) {
        this.a = new Runnable() { // from class: pwj
            @Override // java.lang.Runnable
            public final void run() {
                ExternalSurfaceManager.nativeCallback(j);
            }
        };
        this.b = j2;
    }

    @Override // defpackage.pwg
    public final void a() {
        this.c.removeCallbacks(this.a);
    }

    @Override // defpackage.pwg
    public final void b() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }

    @Override // defpackage.pwg
    public final void c() {
        this.c.post(this.a);
    }
}
