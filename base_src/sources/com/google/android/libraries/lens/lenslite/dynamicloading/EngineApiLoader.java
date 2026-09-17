package com.google.android.libraries.lens.lenslite.dynamicloading;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public interface EngineApiLoader {
    @Deprecated
    DLEngineApi getEngineApi(Context context, Callable callable, long j);

    DLEngineApi getEngineApi(Context context, Callable callable, Bundle bundle);
}
