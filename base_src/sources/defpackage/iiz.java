package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iiz {
    public int a;
    private final int b;
    private final boolean c;

    public iiz(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean a() {
        return !this.c && this.b == 0;
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 4;
            case 1:
                return a() ? 1 : 2;
            default:
                return 3;
        }
    }
}
