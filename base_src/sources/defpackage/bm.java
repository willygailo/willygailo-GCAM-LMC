package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class bm implements DialogInterface.OnDismissListener {
    final /* synthetic */ bp a;

    public bm(bp bpVar) {
        this.a = bpVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        bp bpVar = this.a;
        Dialog dialog = bpVar.c;
        if (dialog != null) {
            bpVar.onDismiss(dialog);
        }
    }
}
