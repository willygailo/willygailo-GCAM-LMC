package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class cwu implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public cwu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cwt get() {
        return new cwt((SharedPreferences) this.a.get(), (CameraFatalErrorTrackerDatabase) this.b.get(), ((cwd) this.c).get(), null, null, null);
    }
}
