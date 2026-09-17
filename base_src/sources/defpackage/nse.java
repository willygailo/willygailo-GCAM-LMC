package defpackage;

import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker", c = "F250Worker.kt", d = "failPermanentlyInvalidUploads", e = {R.styleable.AppCompatTheme_radioButtonStyle})
public final class nse extends qlu {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    final /* synthetic */ F250Worker d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nse(F250Worker f250Worker, qlh qlhVar) {
        super(qlhVar);
        this.d = f250Worker;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(null, this);
    }
}
