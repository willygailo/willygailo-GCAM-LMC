package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class all extends gd {
    final /* synthetic */ ViewPager2 a;

    public all(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.gd
    public final void p(int i) {
        if (i == 0) {
            this.a.f();
        }
    }

    @Override // defpackage.gd
    public final void r(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.c != i) {
            viewPager2.c = i;
            viewPager2.k.o();
        }
    }
}
