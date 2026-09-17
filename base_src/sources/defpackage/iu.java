package defpackage;

import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
final class iu extends it {
    public final jk a;
    final /* synthetic */ iy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(iy iyVar, jk jkVar) {
        super(iyVar);
        this.b = iyVar;
        this.a = jkVar;
    }

    @Override // defpackage.it
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.it
    public final void b() {
        this.b.H();
    }
}
