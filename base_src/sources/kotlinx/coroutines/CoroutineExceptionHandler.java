package kotlinx.coroutines;

import defpackage.qli;
import defpackage.qlk;
import defpackage.qln;

/* JADX INFO: loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends qlk {
    public static final qli a = qli.b;

    void handleException(qln qlnVar, Throwable th);
}
