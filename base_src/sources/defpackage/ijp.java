package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ijp extends ijs {
    public lji a;
    private final ljf b;

    public ijp(mcx mcxVar, ljf ljfVar) {
        super(mcxVar, ijo.values());
        this.b = ljfVar;
    }

    public final long c() {
        return g(ijo.SHUTTER_BUTTON_DOWN);
    }

    public final long d() {
        return g(ijo.SHUTTER_BUTTON_UP);
    }

    public final void e() {
        i(ijo.SHUTTER_BUTTON_DOWN);
    }

    public final void f() {
        i(ijo.SHUTTER_BUTTON_UP);
        this.a = this.b.a("Shutter.FramesTaken");
    }
}
