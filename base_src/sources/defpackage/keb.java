package defpackage;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes2.dex */
final class keb implements Runnable {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ kec b;

    public keb(kec kecVar, ComponentName componentName) {
        this.b = kecVar;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ked kedVar = this.b.b;
        ComponentName componentName = this.a;
        kdo.a();
        if (kedVar.c != null) {
            kedVar.c = null;
            kedVar.r("Disconnected from device AnalyticsService", componentName);
            kedVar.c();
        }
    }
}
