package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class age implements DialogInterface.OnClickListener {
    final /* synthetic */ agf a;

    public age(agf agfVar) {
        this.a = agfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        agf agfVar = this.a;
        agfVar.aa = i;
        ((agr) agfVar).ae = -1;
        dialogInterface.dismiss();
    }
}
