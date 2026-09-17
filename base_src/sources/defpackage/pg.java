package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes2.dex */
final class pg extends DataSetObserver {
    final /* synthetic */ pk a;

    public pg(pk pkVar) {
        this.a = pkVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.a.u()) {
            this.a.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
