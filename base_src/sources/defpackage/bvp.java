package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bvp implements iho, fik, fii, fij {
    public static final ouj a = ouj.h("com/google/android/apps/camera/assistant/CameraAssistantBehavior");
    public final Context b;
    public final ljf c;
    private final ddf d;
    private final fhv e;
    private final lar f;
    private final Executor g;
    private pht h;

    public bvp(Context context, ddf ddfVar, fhv fhvVar, lar larVar, Executor executor, ljf ljfVar) {
        this.b = context;
        this.d = ddfVar;
        this.e = fhvVar;
        this.f = larVar;
        this.g = executor;
        this.c = ljfVar;
    }

    @Override // defpackage.fij
    public final void e() {
        pht phtVar = this.h;
        if (phtVar == null) {
            return;
        }
        mip.ca(phtVar, new lht() { // from class: bvn
            @Override // defpackage.lht
            public final void a(Object obj) {
                bvp bvpVar = this.a;
                ServiceConnection serviceConnection = (ServiceConnection) obj;
                try {
                    bvpVar.c.e("unbindPhotosService");
                    Context context = bvpVar.b;
                    obr.ao(serviceConnection);
                    context.unbindService(serviceConnection);
                } finally {
                    bvpVar.c.f();
                }
            }
        }, this.g);
        this.h = null;
    }

    @Override // defpackage.fii
    public final void fW() {
        if (this.h != null) {
            return;
        }
        this.h = plk.aa(new pgj() { // from class: bvo
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [bvp] */
            /* JADX WARN: Type inference failed for: r0v4, types: [ljf] */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v7 */
            @Override // defpackage.pgj
            public final pht a() {
                pht phtVarU;
                bvp bvpVar = this.a;
                try {
                    try {
                        bvpVar.c.e("bindPhotosService");
                        kwp kwpVar = new kwp(1);
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
                        bvpVar.b.bindService(intent, kwpVar, 5);
                        phtVarU = plk.V(kwpVar);
                        bvpVar = bvpVar.c;
                    } catch (SecurityException e) {
                        ((oug) ((oug) ((oug) bvp.a.c()).h(e)).G(139)).o("Either Photos service does not exist or does not have permission to connect.");
                        phtVarU = plk.U(e);
                        bvpVar = bvpVar.c;
                    }
                    bvpVar.f();
                    return phtVarU;
                } catch (Throwable th) {
                    bvpVar.c.f();
                    throw th;
                }
            }
        }, this.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.k(ddl.J)) {
            enl.f(this.f, this.e, this);
        }
    }
}
