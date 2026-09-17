package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class alp extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    public alp(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void N(qp qpVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.i == -1) {
            super.N(qpVar, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.f;
        if (viewPager2.a() == 0) {
            recyclerView.getWidth();
            recyclerView.getPaddingLeft();
            recyclerView.getPaddingRight();
        } else {
            recyclerView.getHeight();
            recyclerView.getPaddingTop();
            recyclerView.getPaddingBottom();
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // defpackage.qc
    public final void aF(qi qiVar, qp qpVar, hb hbVar) {
        super.aF(qiVar, qpVar, hbVar);
        this.a.k.j(hbVar);
    }

    @Override // defpackage.qc
    public final boolean aW(qi qiVar, qp qpVar, int i, Bundle bundle) {
        if (!this.a.k.s(i)) {
            return super.aW(qiVar, qpVar, i, bundle);
        }
        this.a.k.w(i);
        return false;
    }

    @Override // defpackage.qc
    public final boolean aX(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.qc
    public final void m(qi qiVar, qp qpVar, View view, hb hbVar) {
        this.a.k.k(view, hbVar);
    }
}
