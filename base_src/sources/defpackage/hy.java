package defpackage;

import android.support.v7.app.AlertController$RecycleListView;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
final class hy implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController$RecycleListView a;
    final /* synthetic */ ic b;
    final /* synthetic */ hz c;

    public hy(hz hzVar, AlertController$RecycleListView alertController$RecycleListView, ic icVar) {
        this.c = hzVar;
        this.a = alertController$RecycleListView;
        this.b = icVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.c.s;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        this.c.w.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
