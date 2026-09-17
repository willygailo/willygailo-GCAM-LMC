package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class aou implements Runnable {
    private final aox a;
    private final Intent b;
    private final int c;

    public aou(aox aoxVar, Intent intent, int i) {
        this.a = aoxVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b, this.c);
    }
}
