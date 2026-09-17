package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ode extends gd {
    private final WeakReference a;
    private int c = 0;
    private int b = 0;

    public ode(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.gd
    public final void p(int i) {
        this.b = this.c;
        this.c = i;
    }

    @Override // defpackage.gd
    public final void q(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z = false;
            boolean z2 = i3 != 2 || this.b == 1;
            if (i3 != 2 || this.b != 0) {
                z = true;
            }
            tabLayout.j(i, f, z2, z);
        }
    }

    @Override // defpackage.gd
    public final void r(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.a() == i || i >= tabLayout.b()) {
            return;
        }
        int i2 = this.c;
        boolean z = false;
        if (i2 == 0) {
            z = true;
        } else if (i2 == 2 && this.b == 0) {
            z = true;
        }
        tabLayout.i(tabLayout.c(i), z);
    }
}
