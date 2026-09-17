package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class hit implements hid {
    public final pih a = pih.f();
    public hin b;

    @Override // defpackage.hid, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        hin hinVar = this.b;
        if (hinVar == null) {
            this.a.o(Collections.emptySet());
        } else {
            this.a.o(ope.H(hinVar));
        }
    }
}
