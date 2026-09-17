package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class oux {
    public final TimeUnit a;
    public int b = -1;
    private final int c = 10000;

    public oux(TimeUnit timeUnit) {
        oxh.x(timeUnit, "time unit");
        this.a = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oux) {
            oux ouxVar = (oux) obj;
            int i = ouxVar.c;
            if (this.a == ouxVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 370000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("10000 ");
        sb.append(this.a);
        if (this.b > 0) {
            sb.append(" [skipped: ");
            sb.append(this.b);
            sb.append(']');
        }
        return sb.toString();
    }
}
