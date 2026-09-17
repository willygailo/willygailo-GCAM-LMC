package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class ams {
    public final int a;
    public final int b;
    public final Notification c;

    public ams(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ams amsVar = (ams) obj;
        if (this.a == amsVar.a && this.b == amsVar.b) {
            return this.c.equals(amsVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
