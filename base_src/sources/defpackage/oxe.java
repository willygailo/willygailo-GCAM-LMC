package defpackage;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class oxe implements owu {
    public final String a;
    public final boolean b;
    public final Level c;
    public final boolean d;
    private volatile oxf e;

    public oxe() {
        this("", true, Level.ALL, false);
    }

    public oxe(String str, boolean z, Level level, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = level;
        this.d = z2;
    }

    @Override // defpackage.owu
    public final ovr a(String str) {
        if (!this.d || !str.contains(".")) {
            return new oxg(this.a, str, this.b, this.c);
        }
        oxf oxfVar = this.e;
        if (oxfVar == null) {
            synchronized (this) {
                oxfVar = this.e;
                if (oxfVar == null) {
                    oxfVar = new oxf(this.a, null, this.b, this.c, false);
                    this.e = oxfVar;
                }
            }
        }
        return oxfVar;
    }
}
