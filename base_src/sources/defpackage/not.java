package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.UploadQueryer$snapshotUploadsInProgress$2", c = "Queryer.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle})
public final class not extends qmb implements qmu {
    int a;
    final /* synthetic */ nou b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public not(nou nouVar, qlh qlhVar) {
        super(1, qlhVar);
        this.b = nouVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new not(this.b, (qlh) obj).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final qlh create(qlh qlhVar) {
        return new not(this.b, qlhVar);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (this.a) {
            case 0:
                qmd.M(obj);
                nql nqlVar = this.b.a;
                this.a = 1;
                obj = nqlVar.f(nnr.UPLOAD_IN_PROGRESS, this);
                return obj == qlpVar ? qlpVar : obj;
            default:
                qmd.M(obj);
        }
    }
}
