package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class dqe {
    public final dqh a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference(jrl.PHOTO);
    private final lco d;

    public dqe(dqh dqhVar, lco lcoVar) {
        this.a = dqhVar;
        this.d = lcoVar;
    }

    public final float a() {
        return ((Float) this.d.fA()).floatValue();
    }
}
