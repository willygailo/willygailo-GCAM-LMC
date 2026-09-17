package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class alm extends gd {
    final /* synthetic */ ViewPager2 a;

    public alm(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.gd
    public final void r(int i) {
        this.a.clearFocus();
        if (this.a.hasFocus()) {
            this.a.f.requestFocus(2);
        }
    }
}
