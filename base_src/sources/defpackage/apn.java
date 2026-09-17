package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class apn extends apq {
    private static final String f = kus.g("BatteryChrgTracker");

    public apn(Context context, aso asoVar) {
        super(context, asoVar);
    }

    @Override // defpackage.apq
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
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
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    @Override // defpackage.apq
    public final void c(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        kus kusVarL = kus.l();
        String.format("Received %s", action);
        kusVarL.h(new Throwable[0]);
        switch (action) {
            case "android.os.action.CHARGING":
                g(true);
                break;
            case "android.os.action.DISCHARGING":
                g(false);
                break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                g(true);
                break;
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                g(false);
                break;
        }
    }
}
