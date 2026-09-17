package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class bq extends cb {
    final /* synthetic */ bu a;

    public bq(bu buVar) {
        this.a = buVar;
    }

    @Override // defpackage.cb
    public final View a(int i) {
        View view = this.a.M;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this.a + " does not have a view");
    }

    @Override // defpackage.cb
    public final boolean b() {
        return this.a.M != null;
    }
}
