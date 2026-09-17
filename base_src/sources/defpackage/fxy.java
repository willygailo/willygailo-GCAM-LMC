package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class fxy implements DialogInterface.OnClickListener {
    final /* synthetic */ fxz a;

    public fxy(fxz fxzVar) {
        this.a = fxzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fyr fyrVar = this.a.a;
        fdj fdjVar = fyrVar.r;
        if (fdjVar == null || fdjVar.r) {
            ((oug) ((oug) fyr.b.c()).G((char) 1978)).o("Photo is being taken, ignoring user's request for cancel.");
        } else {
            fyrVar.v();
        }
    }
}
