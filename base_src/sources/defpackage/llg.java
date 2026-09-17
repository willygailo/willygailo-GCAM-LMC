package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class llg {
    private final lzp a;
    private final lis b;

    public llg(lzp lzpVar, lis lisVar) {
        this.a = lzpVar;
        this.b = lisVar;
    }

    public final void a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i3 = 0;
        switch (i2) {
            case 1:
                i3 = 1;
                break;
            case 2:
                i3 = 3;
                break;
        }
        try {
            if (this.a.a() != i3) {
                this.a.g(i3);
            }
        } catch (llv e) {
            this.b.i("Failed to set audio restriction on camera device.", e);
        }
    }
}
