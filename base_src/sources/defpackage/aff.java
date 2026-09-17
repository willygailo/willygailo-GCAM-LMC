package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class aff extends afl implements Runnable {
    boolean a;
    final /* synthetic */ afg b;

    public aff(afg afgVar) {
        this.b = afgVar;
    }

    @Override // defpackage.afl
    protected final Object a() {
        try {
            return this.b.a();
        } catch (aba e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.afl
    protected final void b(Object obj) {
        afg afgVar = this.b;
        if (afgVar.a != this) {
            afgVar.d(this);
        } else {
            if (afgVar.e) {
                return;
            }
            SystemClock.uptimeMillis();
            afgVar.a = null;
            afgVar.g(obj);
        }
    }

    @Override // defpackage.afl
    protected final void c() {
        this.b.d(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.b();
    }
}
