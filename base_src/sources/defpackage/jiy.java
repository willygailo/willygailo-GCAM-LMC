package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;

/* JADX INFO: loaded from: classes2.dex */
public final class jiy implements fik, fii, fij {
    public final Context a;
    final Handler b;
    public RemoteControlView c;
    public ViewStub d;
    public elw e;
    public jit f;
    public Intent g;
    private final hlv k;
    public boolean h = false;
    public boolean i = false;
    private final hlu l = new jiw(this);
    public final BroadcastReceiver j = new jix(this);

    public jiy(Context context, hlv hlvVar) {
        this.a = context;
        this.k = hlvVar;
        this.b = new Handler(context.getMainLooper());
    }

    public final void a(Intent intent) {
        int intExtra = (int) ((intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1));
        RemoteControlView remoteControlView = this.c;
        if (remoteControlView != null) {
            if (intExtra < 0 || intExtra > 100) {
                remoteControlView.b.setText("--");
                return;
            }
            TextView textView = remoteControlView.b;
            StringBuilder sb = new StringBuilder(12);
            sb.append(intExtra);
            sb.append("%");
            textView.setText(sb.toString());
        }
    }

    public final void b(final int i) {
        this.b.post(new Runnable() { // from class: jiv
            @Override // java.lang.Runnable
            public final void run() {
                jiy jiyVar = this.a;
                int i2 = i;
                if (jiyVar.c == null) {
                    jiyVar.c = (RemoteControlView) jiyVar.d.inflate();
                    jiyVar.f = new jit(jiyVar.c);
                }
                jiyVar.e.d(jiyVar.f);
                jiyVar.g = jiyVar.a.registerReceiver(jiyVar.j, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                jiyVar.h = true;
                jiyVar.e.j(elx.SMARTS);
                RemoteControlView remoteControlView = jiyVar.c;
                if (i2 >= 0) {
                    TextView textView = remoteControlView.a;
                    StringBuilder sb = new StringBuilder(12);
                    sb.append(i2);
                    sb.append("%");
                    textView.setText(sb.toString());
                } else {
                    remoteControlView.a.setText("--");
                }
                Intent intent = jiyVar.g;
                if (intent != null) {
                    jiyVar.a(intent);
                    jiyVar.g = null;
                }
            }
        });
    }

    public final void c(float f) {
        this.b.post(new jiu(this, f, 1));
    }

    @Override // defpackage.fij
    public final void e() {
        if (this.c != null && this.h) {
            this.e.g(this.f);
            this.a.unregisterReceiver(this.j);
            this.h = false;
        }
        this.k.b(this.l);
        this.e.m(elx.SMARTS);
    }

    public final void f(float f) {
        this.b.post(new jiu(this, f, 0));
    }

    @Override // defpackage.fii
    public final void fW() {
        RemoteControlView remoteControlView = this.c;
        if (remoteControlView != null) {
            remoteControlView.a();
        }
        this.k.a(this.l);
        hlv hlvVar = this.k;
        if (hlvVar.a) {
            this.i = hlvVar.b;
            b(hlvVar.c);
            if (this.k.d()) {
                c(this.k.d);
            }
            if (this.k.d()) {
                f(this.k.f);
            }
        }
    }
}
