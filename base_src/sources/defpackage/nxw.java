package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class nxw implements View.OnClickListener {
    final /* synthetic */ nya a;

    public nxw(nya nyaVar) {
        this.a = nyaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nya nyaVar = this.a;
        if (nyaVar.d && nyaVar.isShowing()) {
            nya nyaVar2 = this.a;
            if (!nyaVar2.f) {
                TypedArray typedArrayObtainStyledAttributes = nyaVar2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                nyaVar2.e = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                nyaVar2.f = true;
            }
            if (nyaVar2.e) {
                this.a.cancel();
            }
        }
    }
}
