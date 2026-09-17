package defpackage;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public final class aku implements Runnable {
    final /* synthetic */ ViewPager a;

    public aku(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(0);
    }
}
