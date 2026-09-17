package defpackage;

import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cvx implements DialogInterface.OnClickListener {
    public final /* synthetic */ cvz a;
    public final /* synthetic */ lwd b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    private final /* synthetic */ int e;

    public /* synthetic */ cvx(cvz cvzVar, lwd lwdVar, int i, int i2, int i3) {
        this.e = i3;
        this.a = cvzVar;
        this.b = lwdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.e) {
            case 0:
                this.a.e(this.b, this.c, this.d, 3);
                dialogInterface.dismiss();
                break;
            case 1:
                cvz cvzVar = this.a;
                lwd lwdVar = this.b;
                cvzVar.f(lwdVar, this.c, this.d, 3);
                dialogInterface.dismiss();
                brc brcVar = cvzVar.b;
                String strValueOf = String.valueOf(lwdVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 88);
                sb.append(strValueOf);
                sb.append(" camera not working. User decided to close the app instead of using the available camera");
                brcVar.a(sb.toString());
                break;
            case 2:
                cvz cvzVar2 = this.a;
                lwd lwdVar2 = this.b;
                cvzVar2.f(lwdVar2, this.c, this.d, 5);
                dialogInterface.dismiss();
                brc brcVar2 = cvzVar2.b;
                String strValueOf2 = String.valueOf(lwdVar2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 88);
                sb2.append(strValueOf2);
                sb2.append(" camera not working. User decided to close the app instead of using the available camera");
                brcVar2.a(sb2.toString());
                break;
            case 3:
                this.a.e(this.b, this.c, this.d, 5);
                dialogInterface.dismiss();
                break;
            case 4:
                cvz cvzVar3 = this.a;
                cvzVar3.f(this.b, this.c, this.d, 4);
                akf.e(cvzVar3.a, Uri.parse(cvzVar3.d.q()));
                break;
            default:
                this.a.e(this.b, this.c, this.d, 4);
                dialogInterface.dismiss();
                break;
        }
    }
}
