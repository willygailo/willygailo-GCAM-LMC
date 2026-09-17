package defpackage;

import android.app.NotificationManager;

/* JADX INFO: loaded from: classes.dex */
public final class emy implements pys {
    private final qkg a;

    public emy(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static NotificationManager b(emr emrVar) {
        NotificationManager notificationManager = (NotificationManager) emrVar.a(emr.i);
        qmd.ae(notificationManager);
        return notificationManager;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NotificationManager get() {
        return b((emr) this.a.get());
    }
}
