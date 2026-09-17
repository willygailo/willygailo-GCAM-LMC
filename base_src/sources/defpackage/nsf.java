package defpackage;

import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker", c = "F250Worker.kt", d = "pauseOrFailInProgressUploads", e = {R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 130, 149})
public final class nsf extends qlu {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    final /* synthetic */ F250Worker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsf(F250Worker f250Worker, qlh qlhVar) {
        super(qlhVar);
        this.e = f250Worker;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.l(null, this);
    }
}
