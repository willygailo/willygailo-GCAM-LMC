package defpackage;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public final class odr {
    public final int a;
    public final int b;
    public final int c;
    public boolean d = false;
    private final long e;
    private final long f;
    private final PendingIntent g;
    private final PendingIntent h;
    private final PendingIntent i;
    private final PendingIntent j;

    public odr(int i, int i2, int i3, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = j;
        this.f = j2;
        this.g = pendingIntent;
        this.h = pendingIntent2;
        this.i = pendingIntent3;
        this.j = pendingIntent4;
    }

    private final boolean c(ody odyVar) {
        return odyVar.b && this.e <= this.f;
    }

    final PendingIntent a(ody odyVar) {
        int i = odyVar.a;
        if (i == 0) {
            PendingIntent pendingIntent = this.h;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (c(odyVar)) {
                return this.j;
            }
            return null;
        }
        if (i == 1) {
            PendingIntent pendingIntent2 = this.g;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (c(odyVar)) {
                return this.i;
            }
        }
        return null;
    }

    public final boolean b() {
        return a(ody.a()) != null;
    }
}
