package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class pvv implements DialogInterface.OnClickListener {
    final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public pvv(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                this.a.startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
                break;
            default:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
                intent.setPackage("com.android.vending");
                try {
                    this.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e(pvw.a, "Google Play Services is not installed, unable to download VrCore.");
                    return;
                }
                break;
        }
    }
}
