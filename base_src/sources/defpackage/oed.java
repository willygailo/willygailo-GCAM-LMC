package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class oed {
    public static final oxk e = new oxk("AppUpdateService", null);
    private static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public oew a;
    public final String b;
    public final Context c;
    public final odu d;

    public oed(Context context, odu oduVar, byte[] bArr) {
        this.b = context.getPackageName();
        this.c = context;
        this.d = oduVar;
        if (ofm.a(context)) {
            this.a = new oew(ohh.f(context), e, f, null);
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putAll(oeh.a());
        bundle.putInt("playcore.version.code", 11003);
        return bundle;
    }

    public static off c() {
        e.g("onError(%d)", -9);
        oej oejVar = new oej(-9);
        off offVar = new off(null);
        synchronized (offVar.a) {
            ohh.a(!offVar.c, "Task is already complete");
            offVar.c = true;
            offVar.e = oejVar;
        }
        offVar.b.b(offVar);
        return offVar;
    }
}
