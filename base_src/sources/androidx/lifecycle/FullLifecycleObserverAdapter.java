package androidx.lifecycle;

import defpackage.adx;
import defpackage.adz;
import defpackage.aec;
import defpackage.aee;

/* JADX INFO: loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements aec {
    private final adx a;
    private final aec b;

    public FullLifecycleObserverAdapter(adx adxVar, aec aecVar) {
        this.a = adxVar;
        this.b = aecVar;
    }

    @Override // defpackage.aec
    public final void a(aee aeeVar, adz adzVar) {
        switch (adzVar) {
            case ON_CREATE:
                this.a.a();
                break;
            case ON_START:
                this.a.e();
                break;
            case ON_RESUME:
                this.a.d();
                break;
            case ON_PAUSE:
                this.a.c();
                break;
            case ON_STOP:
                this.a.f();
                break;
            case ON_DESTROY:
                this.a.b();
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        aec aecVar = this.b;
        if (aecVar != null) {
            aecVar.a(aeeVar, adzVar);
        }
    }
}
