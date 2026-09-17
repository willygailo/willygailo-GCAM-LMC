package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class jou extends jii {
    private final MainActivityLayout b;

    public jou(MainActivityLayout mainActivityLayout, FrameLayout frameLayout) {
        super(frameLayout);
        this.b = mainActivityLayout;
    }

    @Override // defpackage.jii
    public final void a(View view) {
        lar.a();
        this.a.addView(view);
        this.b.g(this.a);
    }

    @Override // defpackage.jii
    public final void b(View view) {
        lar.a();
        this.a.removeView(view);
        this.b.f();
    }

    @Override // defpackage.jii
    public final void c(int i, int i2) {
        this.b.h(i, i2);
    }
}
