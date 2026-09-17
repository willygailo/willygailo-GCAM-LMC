package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class nzx implements ft {
    final /* synthetic */ nzz a;
    final /* synthetic */ nxo b;

    public nzx(nxo nxoVar, nzz nzzVar) {
        this.b = nxoVar;
        this.a = nzzVar;
    }

    @Override // defpackage.ft
    public final gy a(View view, gy gyVar) {
        nxo nxoVar = this.b;
        nzz nzzVar = new nzz(this.a);
        nxoVar.b.i = gyVar.d();
        int iF = gl.f(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = nxoVar.b;
        if (bottomSheetBehavior.e) {
            bottomSheetBehavior.h = gyVar.a();
            paddingBottom = nzzVar.d + nxoVar.b.h;
        }
        if (nxoVar.b.f) {
            paddingLeft = (iF == 1 ? nzzVar.c : nzzVar.a) + gyVar.b();
        }
        if (nxoVar.b.g) {
            paddingRight = (iF == 1 ? nzzVar.a : nzzVar.c) + gyVar.c();
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (nxoVar.a) {
            nxoVar.b.d = gyVar.e().e;
        }
        BottomSheetBehavior bottomSheetBehavior2 = nxoVar.b;
        if (bottomSheetBehavior2.e || nxoVar.a) {
            bottomSheetBehavior2.K();
        }
        return gyVar;
    }
}
