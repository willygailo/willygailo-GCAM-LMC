package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class klu extends ksg {
    final /* synthetic */ kmb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klu(kmb kmbVar, Looper looper) {
        super(looper);
        this.a = kmbVar;
    }

    private static final void a(Message message) {
        klv klvVar = (klv) message.obj;
        klvVar.b();
        klvVar.f();
    }

    private static final boolean c(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.a.o.get() != message.arg1) {
            if (c(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.a.l()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            this.a.l = new khi(message.arg2);
            kmb kmbVar = this.a;
            if (!kmbVar.m && !TextUtils.isEmpty(kmbVar.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(kmbVar.c());
                    kmb kmbVar2 = this.a;
                    if (!kmbVar2.m) {
                        kmbVar2.H(3, null);
                        return;
                    }
                } catch (ClassNotFoundException e) {
                }
            }
            khi khiVar = this.a.l;
            if (khiVar == null) {
                khiVar = new khi(8);
            }
            this.a.g.a(khiVar);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            khi khiVar2 = this.a.l;
            if (khiVar2 == null) {
                khiVar2 = new khi(8);
            }
            this.a.g.a(khiVar2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.g.a(new khi(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            this.a.H(5, null);
            kmn kmnVar = this.a.p;
            if (kmnVar != null) {
                kmnVar.a.a(message.arg2);
            }
            int i = message.arg2;
            System.currentTimeMillis();
            this.a.z(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.k()) {
            a(message);
            return;
        }
        if (!c(message)) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        klv klvVar = (klv) message.obj;
        synchronized (klvVar) {
            obj = klvVar.d;
            if (klvVar.e) {
                String strValueOf = String.valueOf(klvVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(strValueOf);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (obj != null) {
            try {
                klvVar.d();
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        synchronized (klvVar) {
            klvVar.e = true;
        }
        klvVar.f();
    }
}
