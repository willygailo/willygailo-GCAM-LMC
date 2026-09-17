package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class khy extends bp {
    public Dialog aa;
    public DialogInterface.OnCancelListener ab;
    private Dialog ac;

    @Override // defpackage.bp
    public final Dialog l() {
        Dialog dialog = this.aa;
        if (dialog != null) {
            return dialog;
        }
        this.b = false;
        if (this.ac == null) {
            Context contextR = r();
            mip.dk(contextR);
            this.ac = new AlertDialog.Builder(contextR).create();
        }
        return this.ac;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
