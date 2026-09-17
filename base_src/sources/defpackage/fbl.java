package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fbl implements agn {
    public final /* synthetic */ fbn a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbl(fbn fbnVar, int i) {
        this.b = i;
        this.a = fbnVar;
    }

    @Override // defpackage.agn
    public final boolean a() {
        switch (this.b) {
            case 0:
                this.a.startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 2);
                return true;
            default:
                this.a.ab.p.ag(2);
                return false;
        }
    }
}
