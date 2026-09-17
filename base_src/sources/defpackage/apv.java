package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class apv extends apq {
    static {
        kus.g("StorageNotLowTracker");
    }

    public apv(Context context, aso asoVar) {
        super(context, asoVar);
    }

    @Override // defpackage.apq
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    @Override // defpackage.aps
    public final /* bridge */ /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, a());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return true;
        }
        switch (intentRegisterReceiver.getAction()) {
            case "android.intent.action.DEVICE_STORAGE_OK":
                return true;
            case "android.intent.action.DEVICE_STORAGE_LOW":
                return false;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    @Override // defpackage.apq
    public final void c(Intent intent) {
        if (intent.getAction() == null) {
        }
        kus kusVarL = kus.l();
        String.format("Received %s", intent.getAction());
        kusVarL.h(new Throwable[0]);
        switch (intent.getAction()) {
            case "android.intent.action.DEVICE_STORAGE_OK":
                g(true);
                break;
            case "android.intent.action.DEVICE_STORAGE_LOW":
                g(false);
                break;
        }
    }
}
