package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
final class laq extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return Boolean.valueOf(Looper.getMainLooper().isCurrentThread());
    }
}
