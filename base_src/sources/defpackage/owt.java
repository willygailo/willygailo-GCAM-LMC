package defpackage;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class owt implements owu {
    public final String a;
    public final boolean b;

    public owt() {
        this("", true);
    }

    public owt(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.owu
    public final ovr a(String str) {
        return new oxf(this.a, str, this.b, Level.ALL, true);
    }
}
