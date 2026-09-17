package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ckk implements DialogInterface.OnClickListener {
    public final /* synthetic */ ckn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ckk(ckn cknVar, int i) {
        this.b = i;
        this.a = cknVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        btv btvVar;
        switch (this.b) {
            case 0:
                ckn cknVar = this.a;
                btv btvVar2 = cknVar.d;
                if (btvVar2 != null) {
                    btvVar2.k(true);
                }
                if (cknVar.a.o()) {
                    cknVar.b.x(jrl.PHOTO);
                }
                if (cknVar.a.f() && (btvVar = cknVar.d) != null) {
                    btvVar.d();
                }
                dialogInterface.dismiss();
                break;
            default:
                btv btvVar3 = this.a.d;
                if (btvVar3 != null) {
                    btvVar3.k(true);
                }
                dialogInterface.dismiss();
                break;
        }
    }
}
