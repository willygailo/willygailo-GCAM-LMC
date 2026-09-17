package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lpr {
    private final long a;

    public lpr() {
        int i;
        synchronized (lrv.class) {
            i = lrv.c;
            lrv.c = i + 1;
        }
        this.a = i;
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append("FrameServer-");
        sb.append(j);
        return sb.toString();
    }
}
