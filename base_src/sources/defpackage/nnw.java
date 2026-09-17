package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.AutoUploadExpireQueryer$snapshotItemsToAutoExpire$2", c = "Queryer.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart})
public final class nnw extends qmb implements qmu {
    int a;
    final /* synthetic */ nnz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnw(nnz nnzVar, qlh qlhVar) {
        super(1, qlhVar);
        this.b = nnzVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new nnw(this.b, (qlh) obj).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final qlh create(qlh qlhVar) {
        return new nnw(this.b, qlhVar);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (this.a) {
            case 0:
                qmd.M(obj);
                nnz nnzVar = this.b;
                npf npfVar = nnzVar.a;
                prl prlVarAg = ohh.ag(nnzVar.b);
                this.a = 1;
                obj = npfVar.b(prlVarAg, qmd.H(new nnr[]{nnr.UPLOAD_NOT_REQUESTED, nnr.UPLOADED_TO_F250, nnr.UPLOAD_FAILED_PERMANENTLY}), nmr.IN_AIRLOCK, this);
                return obj == qlpVar ? qlpVar : obj;
            default:
                qmd.M(obj);
        }
    }
}
