package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gjb implements pys {
    private final giu a;
    private final /* synthetic */ int b;

    public gjb(giu giuVar, int i) {
        this.b = i;
        this.a = giuVar;
    }

    public final ojc a() {
        switch (this.b) {
            case 0:
                return this.a.h;
            default:
                return this.a.i;
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                break;
        }
        return a();
    }
}
