package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class mya {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public mya(Context context) throws Throwable {
        mwh.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
