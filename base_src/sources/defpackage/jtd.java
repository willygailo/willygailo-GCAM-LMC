package defpackage;

import j$.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class jtd {
    private final Optional a;

    public jtd(Optional optional) {
        this.a = optional;
    }

    public final void a() {
        this.a.ifPresent(gui.d);
    }

    public final void b() {
        this.a.ifPresent(gui.e);
    }
}
