package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class nxq implements hj {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public nxq(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.hj
    public final boolean a(View view) {
        this.b.F(this.a);
        return true;
    }
}
