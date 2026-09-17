package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class hyu implements View.OnLayoutChangeListener {
    final /* synthetic */ hza a;

    public hyu(hza hzaVar) {
        this.a = hzaVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        this.a.j();
    }
}
