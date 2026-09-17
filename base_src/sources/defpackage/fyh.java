package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
final class fyh implements DialogInterface.OnClickListener {
    final /* synthetic */ fyr a;
    private final /* synthetic */ int b;

    public fyh(fyr fyrVar, int i) {
        this.b = i;
        this.a = fyrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                this.a.s.u("Fatal error in Panorama module: 2132018016");
                break;
            default:
                this.a.s.g().d();
                break;
        }
    }
}
