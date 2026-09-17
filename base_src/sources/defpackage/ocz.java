package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class ocz implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;

    public ocz(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.getVisibility();
    }
}
