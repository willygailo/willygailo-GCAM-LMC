package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dj {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public dk i;
    public Bundle k;
    public String l;
    public final Notification m;

    @Deprecated
    public final ArrayList n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean j = false;

    @Deprecated
    public dj(Context context) {
        Notification notification = new Notification();
        this.m = notification;
        this.a = context;
        this.l = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.n = new ArrayList();
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Bundle a() {
        if (this.k == null) {
            this.k = new Bundle();
        }
        return this.k;
    }

    public final void c(int i) {
        this.m.icon = i;
    }

    public final void d(dk dkVar) {
        if (this.i != dkVar) {
            this.i = dkVar;
            if (dkVar == null || dkVar.b == this) {
                return;
            }
            dkVar.b = this;
            dj djVar = dkVar.b;
            if (djVar != null) {
                djVar.d(dkVar);
            }
        }
    }
}
