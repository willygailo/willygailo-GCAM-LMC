package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class oww {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a(owv owvVar) {
        if (!a.compareAndSet(false, true)) {
            throw new IllegalStateException("Logger backend configuration may only occur once.");
        }
        Object oxeVar = owvVar.a;
        if (oxeVar == null) {
            oxeVar = new oxe();
        }
        if (!oxc.a.compareAndSet(null, oxeVar)) {
            throw new IllegalStateException("Logger backends can only be configured once.");
        }
        oxc.e();
        oxd.a.b.set(oxj.a);
    }
}
