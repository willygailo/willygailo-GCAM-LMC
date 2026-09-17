package defpackage;

import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker", c = "F250AutoWorker.kt", d = "doWork", e = {R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle})
public final class nrp extends qlu {
    public /* synthetic */ Object a;
    final /* synthetic */ F250AutoWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrp(F250AutoWorker f250AutoWorker, qlh qlhVar) {
        super(qlhVar);
        this.b = f250AutoWorker;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
