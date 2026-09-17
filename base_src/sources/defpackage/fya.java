package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class fya implements DialogInterface.OnClickListener {
    final /* synthetic */ fxz a;

    public fya(fxz fxzVar, byte[] bArr) {
        this.a = fxzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a.x();
    }
}
