package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class hnv implements fik, fib, fii, fij, fhy {
    public final lis a;
    private final Context d;
    private final brc e;
    public boolean b = false;
    boolean c = false;
    private final BroadcastReceiver g = new hns(this);
    private final BroadcastReceiver h = new hnt(this);
    private final BroadcastReceiver i = new hnu(this);
    private boolean f = false;

    public hnv(Context context, brc brcVar, lir lirVar) {
        this.d = context;
        this.e = brcVar;
        this.a = lirVar.a("ActivityCloseSec");
    }

    @Override // defpackage.fhy
    public final void F() {
        if (this.f) {
            return;
        }
        this.a.f("Attaching secure activity shutdown receivers.");
        this.d.registerReceiver(this.h, new IntentFilter("android.intent.action.SCREEN_OFF"));
        this.d.registerReceiver(this.g, new IntentFilter("android.intent.action.SCREEN_ON"));
        this.d.registerReceiver(this.i, new IntentFilter("android.intent.action.USER_PRESENT"));
        this.f = true;
    }

    public final void b() {
        if (this.f) {
            this.a.b("Detaching secure activity shutdown receivers.");
            try {
                this.d.unregisterReceiver(this.h);
            } catch (IllegalArgumentException e) {
                lis lisVar = this.a;
                String strValueOf = String.valueOf(e.getMessage());
                lisVar.f(strValueOf.length() != 0 ? "unregisterReceiver screenOffReceiver fail".concat(strValueOf) : new String("unregisterReceiver screenOffReceiver fail"));
            }
            try {
                this.d.unregisterReceiver(this.g);
            } catch (IllegalArgumentException e2) {
                lis lisVar2 = this.a;
                String strValueOf2 = String.valueOf(e2.getMessage());
                lisVar2.f(strValueOf2.length() != 0 ? "unregisterReceiver screenOnReceiver fail".concat(strValueOf2) : new String("unregisterReceiver screenOnReceiver fail"));
            }
            try {
                this.d.unregisterReceiver(this.i);
            } catch (IllegalArgumentException e3) {
                lis lisVar3 = this.a;
                String strValueOf3 = String.valueOf(e3.getMessage());
                lisVar3.f(strValueOf3.length() != 0 ? "unregisterReceiver userUnlockReceiver fail".concat(strValueOf3) : new String("unregisterReceiver userUnlockReceiver fail"));
            }
            this.f = false;
        }
    }

    public final void c(String str) {
        b();
        this.e.a(str);
    }

    @Override // defpackage.fij
    public final void e() {
        this.b = false;
        if (this.c) {
            c("Already received ScreenOff broadcast so closing the activity.");
        }
    }

    @Override // defpackage.fib
    public final void fT() {
        b();
    }

    @Override // defpackage.fii
    public final void fW() {
        this.b = true;
    }
}
