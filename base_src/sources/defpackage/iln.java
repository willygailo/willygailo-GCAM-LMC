package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class iln {
    public final Context a;
    public final ojc b;
    public final ddf c;
    private final huf d;

    public iln(Context context, huf hufVar, ojc ojcVar, ddf ddfVar) {
        this.a = context;
        this.d = hufVar;
        this.b = ojcVar;
        this.c = ddfVar;
    }

    public final boolean a() {
        boolean zBooleanValue = ((Boolean) this.d.c(htu.F)).booleanValue();
        if (zBooleanValue) {
            nyj nyjVar = new nyj(this.a, true != this.c.k(ddl.ay) ? 0 : 2132083558);
            nyjVar.t(this.a.getString(R.string.turn_off_lsm_dialog_title));
            nyjVar.m(this.a.getString(R.string.turn_off_lsm_dialog_message));
            nyjVar.r(this.a.getString(R.string.view_in_settings_button), new DialogInterface.OnClickListener() { // from class: ilm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    iln ilnVar = this.a;
                    Intent intentA = ilk.a(ilnVar.a);
                    if (ilnVar.b.g()) {
                        ((hnx) ilnVar.b.c()).g(intentA);
                    } else {
                        ilnVar.a.startActivity(intentA);
                    }
                }
            });
            nyjVar.o(this.a.getString(android.R.string.cancel), null);
            nyjVar.c();
        }
        return zBooleanValue;
    }
}
