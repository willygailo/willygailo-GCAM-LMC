package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class apq extends aps {
    private final BroadcastReceiver f;

    static {
        kus.g("BrdcstRcvrCnstrntTrckr");
    }

    public apq(Context context, aso asoVar) {
        super(context, asoVar);
        this.f = new app(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.aps
    public final void d() {
        kus kusVarL = kus.l();
        String.format("%s: registering receiver", getClass().getSimpleName());
        kusVarL.h(new Throwable[0]);
        this.a.registerReceiver(this.f, a());
    }

    @Override // defpackage.aps
    public final void e() {
        kus kusVarL = kus.l();
        String.format("%s: unregistering receiver", getClass().getSimpleName());
        kusVarL.h(new Throwable[0]);
        this.a.unregisterReceiver(this.f);
    }
}
