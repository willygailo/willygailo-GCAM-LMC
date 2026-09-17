package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ezr {
    public static final ouj a = ouj.h("com/google/android/apps/camera/legacy/app/module/pckimageintent/ImageIntentResultHandler");
    public final WeakReference b;
    public final lar c;
    public final ojc d;
    public final bts e;
    public final Executor f;

    public ezr(WeakReference weakReference, lar larVar, emb embVar, btt bttVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.b = weakReference;
        this.c = larVar;
        this.e = bttVar;
        this.f = executor;
        this.d = bqe.e(embVar.a());
    }
}
