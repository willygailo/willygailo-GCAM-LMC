package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.ResourceWithAnnotachmentsDao", c = "ResourceWithAnnotachments.kt", d = "failPermanentlyInvalidUploads$suspendImpl", e = {R.styleable.AppCompatTheme_colorError, R.styleable.AppCompatTheme_colorPrimary, R.styleable.AppCompatTheme_colorPrimaryDark})
final class nqj extends qlu {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ nql c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqj(nql nqlVar, qlh qlhVar) {
        super(qlhVar);
        this.c = nqlVar;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return nql.b(this.c, this);
    }
}
