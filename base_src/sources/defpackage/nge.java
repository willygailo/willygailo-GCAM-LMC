package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nge extends BroadcastReceiver {
    public static volatile boolean b;
    public static final Object a = new Object();
    static final nes c = nes.b();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        for (Map.Entry entry : c.entrySet()) {
            if (((String) ((ojd) entry.getKey()).a).equals(stringExtra)) {
                ((nfi) entry.getValue()).a.c();
            }
        }
    }
}
