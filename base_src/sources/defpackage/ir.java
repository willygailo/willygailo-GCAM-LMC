package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes2.dex */
final class ir extends it {
    public final PowerManager a;
    final /* synthetic */ iy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(iy iyVar, Context context) {
        super(iyVar);
        this.b = iyVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.it
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.it
    public final void b() {
        this.b.H();
    }
}
