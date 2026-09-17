package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
final class odh implements AdapterView.OnItemClickListener {
    final /* synthetic */ odi a;

    public odh(odi odiVar) {
        this.a = odiVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        View view2;
        int i2;
        long selectedItemId;
        if (i < 0) {
            pk pkVar = this.a.a;
            item = !pkVar.u() ? null : pkVar.e.getSelectedItem();
        } else {
            item = this.a.getAdapter().getItem(i);
        }
        this.a.a(item);
        AdapterView.OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                pk pkVar2 = this.a.a;
                View selectedView = !pkVar2.u() ? null : pkVar2.e.getSelectedView();
                int iO = this.a.a.o();
                pk pkVar3 = this.a.a;
                view2 = selectedView;
                i2 = iO;
                selectedItemId = !pkVar3.u() ? Long.MIN_VALUE : pkVar3.e.getSelectedItemId();
            } else {
                view2 = view;
                i2 = i;
                selectedItemId = j;
            }
            onItemClickListener.onItemClick(this.a.a.e, view2, i2, selectedItemId);
        }
        this.a.a.k();
    }
}
