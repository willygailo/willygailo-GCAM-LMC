package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class pxl extends bmo implements IInterface {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ PendingIntent b;
    public final /* synthetic */ int c;

    public pxl() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxl(Activity activity, PendingIntent pendingIntent, int i) {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
        this.a = activity;
        this.b = pendingIntent;
        this.c = i;
    }

    public final void b() {
        this.a.runOnUiThread(new pwv(this));
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        b();
        return true;
    }
}
