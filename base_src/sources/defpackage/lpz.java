package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lpz {
    private final lis a;
    private lpr b;

    public lpz(lis lisVar) {
        this.a = lisVar.a("FrameServerLock");
    }

    public final synchronized void a(lpr lprVar) {
        if (!lprVar.equals(this.b)) {
            lis lisVar = this.a;
            String strValueOf = String.valueOf(lprVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
            sb.append(strValueOf);
            sb.append(" is now active.");
            lisVar.b(sb.toString());
            this.b = lprVar;
        }
    }

    public final synchronized void b(lpr lprVar) {
        if (!lprVar.equals(this.b)) {
            lis lisVar = this.a;
            String strValueOf = String.valueOf(lprVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
            sb.append(strValueOf);
            sb.append(" is now active.");
            lisVar.b(sb.toString());
            this.b = lprVar;
        }
    }

    public final synchronized void c(lpr lprVar) {
        if (this.b == lprVar) {
            this.b = null;
        }
    }

    public final synchronized boolean d(lpr lprVar) {
        return lprVar.equals(this.b);
    }
}
