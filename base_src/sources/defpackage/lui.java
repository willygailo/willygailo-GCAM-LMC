package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lui implements lnx {
    private static int a = 0;
    private final int b = j();
    public final lvs f;
    public final boolean g;
    public final lnz h;

    public lui(lnz lnzVar, lvs lvsVar, boolean z) {
        this.h = lnzVar;
        this.f = lvsVar;
        this.g = z;
    }

    private static synchronized int j() {
        int i;
        i = a;
        a = i + 1;
        return i;
    }

    @Override // defpackage.lnx
    public final lvs c() {
        return this.f;
    }

    @Override // defpackage.lnx
    public final boolean e() {
        return this.h.h;
    }

    public abstract long f();

    public abstract Surface g();

    public abstract loa h();

    public abstract boolean i();

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(18);
        sb.append("Stream-");
        sb.append(i);
        return sb.toString();
    }
}
