package defpackage;

import com.google.geo.lightfield.processing.ProgressCallback;

/* JADX INFO: loaded from: classes.dex */
final class ehs implements ProgressCallback {
    final /* synthetic */ eht a;

    public ehs(eht ehtVar) {
        this.a = ehtVar;
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setProgress(float f) {
        this.a.a.b(lif.b(f));
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final void setRange(float f, float f2) {
    }

    @Override // com.google.geo.lightfield.processing.ProgressCallback
    public final boolean wasCancelled() {
        return false;
    }
}
