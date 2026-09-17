package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface kkn {
    Activity a();

    void b(LifecycleCallback lifecycleCallback);

    LifecycleCallback d(Class cls);

    void startActivityForResult(Intent intent, int i);
}
