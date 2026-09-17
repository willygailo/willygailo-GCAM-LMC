package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ocy implements ala {
    public int a;
    public int b;
    private final WeakReference c;

    public ocy(TabLayout tabLayout) {
        this.c = new WeakReference(tabLayout);
    }

    @Override // defpackage.ala
    public final void a(int i) {
        this.a = this.b;
        this.b = i;
    }

    @Override // defpackage.ala
    public final void b(int i, float f) {
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null) {
            tabLayout.j(i, f, true, true);
        }
    }
}
