package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.kv;
import defpackage.kw;
import defpackage.kz;
import defpackage.lm;
import defpackage.rn;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, kv, lm {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private kw b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        rn rnVarQ = rn.q(context, attributeSet, a, i);
        if (rnVarQ.p(0)) {
            setBackgroundDrawable(rnVarQ.h(0));
        }
        if (rnVarQ.p(1)) {
            setDivider(rnVarQ.h(1));
        }
        rnVarQ.n();
    }

    @Override // defpackage.lm
    public final void a(kw kwVar) {
        this.b = kwVar;
    }

    @Override // defpackage.kv
    public final boolean b(kz kzVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((kz) getAdapter().getItem(i), 0);
    }
}
