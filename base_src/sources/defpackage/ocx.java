package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ocx {
    public Object a;
    public CharSequence b;
    public CharSequence c;
    public View e;
    public TabLayout g;
    public oda h;
    public int d = -1;
    public final int f = 1;
    public int i = -1;

    public final void a() {
        TabLayout tabLayout = this.g;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.h(this);
    }

    public final void b() {
        oda odaVar = this.h;
        if (odaVar != null) {
            odaVar.b();
        }
    }

    public final void c(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
            this.h.setContentDescription(charSequence);
        }
        this.b = charSequence;
        b();
    }
}
