package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class apo extends apq {
    private static final String f = kus.g("BatteryNotLowTracker");

    public apo(Context context, aso asoVar) {
        super(context, asoVar);
    }

    @Override // defpackage.apq
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.aps
    public final /* bridge */ /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver == null) {
            kus.l();
            kus.i(f, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
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
            case "android.intent.action.BATTERY_OKAY":
                g(true);
                break;
            case "android.intent.action.BATTERY_LOW":
                g(false);
                break;
        }
    }
}
