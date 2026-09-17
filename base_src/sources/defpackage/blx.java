package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class blx implements bly {
    final /* synthetic */ bly a;
    private volatile Object b;

    public blx(bly blyVar) {
        this.a = blyVar;
    }

    @Override // defpackage.bly
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) ((bjx) this.a).a.getSystemService("connectivity");
                    aae.s(connectivityManager);
                    this.b = connectivityManager;
                }
            }
        }
        return this.b;
    }
}
