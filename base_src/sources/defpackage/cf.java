package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class cf extends cb {
    public final Activity b;
    public final Context c;
    public final Handler d;
    final cu e = new cu();

    public cf(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.cb
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.cb
    public boolean b() {
        throw null;
    }

    public final void d(Intent intent, int i) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        aap.b(this.c, intent, null);
    }
}
