package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
final class lh implements PopupWindow.OnDismissListener {
    final /* synthetic */ li a;

    public lh(li liVar) {
        this.a = liVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
