package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class fxe implements DialogInterface.OnClickListener {
    final /* synthetic */ fxf a;

    public fxe(fxf fxfVar) {
        this.a = fxfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a.a("CaptureModule: Out of storage space on device.");
    }
}
