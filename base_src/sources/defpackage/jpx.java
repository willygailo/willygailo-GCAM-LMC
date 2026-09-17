package defpackage;

import android.content.Context;
import com.google.android.apps.camera.ui.mars.MarsSwitch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jpx implements jqn {
    public final Context a;
    public final jdk b;
    public final ddf c;
    public final qkg d;
    public final lar e;
    public final ljf f;
    public MarsSwitch g;
    public final fhv h;
    private final jrl i;
    private final hug j;
    private final Executor k;

    public jpx(Context context, jrl jrlVar, jdk jdkVar, hug hugVar, ddf ddfVar, qkg qkgVar, lar larVar, Executor executor, ljf ljfVar, fhv fhvVar) {
        this.a = context;
        this.i = jrlVar;
        this.b = jdkVar;
        this.j = hugVar;
        this.c = ddfVar;
        this.d = qkgVar;
        this.e = larVar;
        this.k = executor;
        this.f = ljfVar;
        this.h = fhvVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        this.j.e(htu.ab, false);
        if (!this.c.k(ddl.bp) || this.i == jrl.IMAGE_INTENT || this.i == jrl.VIDEO_INTENT) {
            return;
        }
        plk.af(jdk.a(this.k, this.a), new jpw(this), this.k);
    }
}
