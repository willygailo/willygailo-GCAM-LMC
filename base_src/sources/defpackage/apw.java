package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class apw {
    private static apw e;
    public final apn a;
    public final apo b;
    public final apu c;
    public final apv d;

    private apw(Context context, aso asoVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new apn(applicationContext, asoVar);
        this.b = new apo(applicationContext, asoVar);
        this.c = new apu(applicationContext, asoVar);
        this.d = new apv(applicationContext, asoVar);
    }

    public static synchronized apw a(Context context, aso asoVar) {
        if (e == null) {
            e = new apw(context, asoVar);
        }
        return e;
    }
}
