package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
final class hx implements AdapterView.OnItemClickListener {
    final /* synthetic */ ic a;
    final /* synthetic */ hz b;

    public hx(hz hzVar, ic icVar) {
        this.b = hzVar;
        this.a = icVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.p.onClick(this.a.b, i);
        if (this.b.u) {
            return;
        }
        this.a.b.dismiss();
    }
}
