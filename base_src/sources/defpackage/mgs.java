package defpackage;

import android.content.Context;
import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;

/* JADX INFO: loaded from: classes2.dex */
public final class mgs {
    public final DLEngineApi a;
    public final Context b;
    public final String c;

    public mgs(DLEngineApi dLEngineApi, Context context, String str) {
        this.a = dLEngineApi;
        this.b = context;
        this.c = str;
    }

    public final long a() {
        try {
            return this.a.getHostApiVersion();
        } catch (Throwable th) {
            return ApiVersion.ORIGINAL.getVersionCode();
        }
    }
}
