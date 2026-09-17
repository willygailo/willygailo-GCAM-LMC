package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class kkg implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    public static kkg d;
    public final Context g;
    public final khm h;
    public final kmx i;
    public final Handler o;
    public volatile boolean p;
    private knm q;
    private knu s;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public kju m = null;
    public final Set n = new xa();
    private final Set r = new xa();

    private kkg(Context context, Looper looper, khm khmVar) {
        this.p = true;
        this.g = context;
        ksg ksgVar = new ksg(looper, this);
        this.o = ksgVar;
        this.h = khmVar;
        this.i = new kmx(khmVar);
        PackageManager packageManager = context.getPackageManager();
        if (mip.f == null) {
            mip.f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (mip.f.booleanValue()) {
            this.p = false;
        }
        ksgVar.sendMessage(ksgVar.obtainMessage(6));
    }

    public static Status a(kjg kjgVar, khi khiVar) {
        String str = kjgVar.a.a;
        String strValueOf = String.valueOf(khiVar);
        StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(strValueOf).length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(1, 17, sb.toString(), khiVar.d, khiVar);
    }

    public static kkg c(Context context) {
        kkg kkgVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (kmr.a) {
                    if (kmr.b != null) {
                        handlerThread = kmr.b;
                    } else {
                        kmr.b = new HandlerThread("GoogleApiHandler", 9);
                        kmr.b.start();
                        handlerThread = kmr.b;
                    }
                }
                d = new kkg(context.getApplicationContext(), handlerThread.getLooper(), khm.a);
            }
            kkgVar = d;
        }
        return kkgVar;
    }

    private final kkc j(kij kijVar) {
        kjg kjgVar = kijVar.g;
        kkc kkcVar = (kkc) this.l.get(kjgVar);
        if (kkcVar == null) {
            kkcVar = new kkc(this, kijVar);
            this.l.put(kjgVar, kkcVar);
        }
        if (kkcVar.o()) {
            this.r.add(kjgVar);
        }
        kkcVar.d();
        return kkcVar;
    }

    private final void k() {
        knm knmVar = this.q;
        if (knmVar != null) {
            if (knmVar.a > 0 || h()) {
                l().a(knmVar);
            }
            this.q = null;
        }
    }

    private final knu l() {
        if (this.s == null) {
            this.s = new knu(this.g, knn.a);
        }
        return this.s;
    }

    final kkc b(kjg kjgVar) {
        return (kkc) this.l.get(kjgVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    public final void d(kvm kvmVar, int i, kij kijVar) {
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        if (i != 0) {
            kjg kjgVar = kijVar.g;
            kku kkuVar = null;
            if (h()) {
                knl knlVar = knk.a().a;
                boolean z = true;
                if (knlVar == null) {
                    if (z) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    if (z) {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jElapsedRealtime = 0;
                    }
                    kkuVar = new kku(this, i, kjgVar, jCurrentTimeMillis, jElapsedRealtime);
                } else if (knlVar.b) {
                    boolean z2 = knlVar.c;
                    kkc kkcVarB = b(kjgVar);
                    if (kkcVarB != null) {
                        Object obj = kkcVarB.b;
                        if (obj instanceof kmb) {
                            kmb kmbVar = (kmb) obj;
                            if (!kmbVar.B() || kmbVar.l()) {
                                z = z2;
                            } else {
                                kmi kmiVarB = kku.b(kkcVarB, kmbVar, i);
                                if (kmiVarB != null) {
                                    kkcVarB.i++;
                                    z = kmiVarB.c;
                                }
                            }
                            if (z) {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis = 0;
                            }
                            if (z) {
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                            } else {
                                jElapsedRealtime = 0;
                            }
                            kkuVar = new kku(this, i, kjgVar, jCurrentTimeMillis, jElapsedRealtime);
                        }
                    } else {
                        z = z2;
                        if (z) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        if (z) {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        } else {
                            jElapsedRealtime = 0;
                        }
                        kkuVar = new kku(this, i, kjgVar, jCurrentTimeMillis, jElapsedRealtime);
                    }
                }
            }
            if (kkuVar != null) {
                kvp kvpVar = kvmVar.a;
                Handler handler = this.o;
                handler.getClass();
                kvpVar.g(new kjw(handler, 0), kkuVar);
            }
        }
    }

    public final void e(khi khiVar, int i) {
        if (i(khiVar, i)) {
            return;
        }
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(5, i, 0, khiVar));
    }

    public final void f() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void g(kju kjuVar) {
        synchronized (c) {
            if (this.m != kjuVar) {
                this.m = kjuVar;
                this.n.clear();
            }
            this.n.addAll(kjuVar.e);
        }
    }

    final boolean h() {
        if (this.f) {
            return false;
        }
        knl knlVar = knk.a().a;
        if (knlVar != null && !knlVar.b) {
            return false;
        }
        int iB = this.i.b(203400000);
        return iB == -1 || iB == 0;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0334  */
    /* JADX WARN: Code duplicated, block: B:130:0x033f  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        khk[] khkVarArrB;
        kkc kkcVar = null;
        switch (message.what) {
            case 1:
                this.e = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.o.removeMessages(12);
                for (kjg kjgVar : this.l.keySet()) {
                    Handler handler = this.o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, kjgVar), this.e);
                }
                return true;
            case 2:
                throw null;
            case 3:
                for (kkc kkcVar2 : this.l.values()) {
                    kkcVar2.c();
                    kkcVar2.d();
                }
                return true;
            case 4:
            case 8:
            case 13:
                kkx kkxVar = (kkx) message.obj;
                kkc kkcVarJ = (kkc) this.l.get(kkxVar.c.g);
                if (kkcVarJ == null) {
                    kkcVarJ = j(kkxVar.c);
                }
                if (!kkcVarJ.o() || this.k.get() == kkxVar.b) {
                    kkcVarJ.e(kkxVar.a);
                } else {
                    kkxVar.a.d(a);
                    kkcVarJ.m();
                }
                return true;
            case 5:
                int i = message.arg1;
                khi khiVar = (khi) message.obj;
                for (kkc kkcVar3 : this.l.values()) {
                    if (kkcVar3.f == i) {
                        kkcVar = kkcVar3;
                        if (kkcVar != null) {
                            StringBuilder sb = new StringBuilder(76);
                            sb.append("Could not find API instance ");
                            sb.append(i);
                            sb.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                        } else if (khiVar.c == 13) {
                            String strF = khw.f();
                            String str = khiVar.e;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strF).length() + 69 + String.valueOf(str).length());
                            sb2.append("Error resolution was canceled by the user, original error message: ");
                            sb2.append(strF);
                            sb2.append(": ");
                            sb2.append(str);
                            kkcVar.f(new Status(17, sb2.toString()));
                        } else {
                            kkcVar.f(a(kkcVar.c, khiVar));
                        }
                        return true;
                    }
                }
                if (kkcVar != null) {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                } else if (khiVar.c == 13) {
                    String strF2 = khw.f();
                    String str2 = khiVar.e;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(strF2).length() + 69 + String.valueOf(str2).length());
                    sb4.append("Error resolution was canceled by the user, original error message: ");
                    sb4.append(strF2);
                    sb4.append(": ");
                    sb4.append(str2);
                    kkcVar.f(new Status(17, sb4.toString()));
                } else {
                    kkcVar.f(a(kkcVar.c, khiVar));
                }
                return true;
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.g.getApplicationContext();
                    synchronized (kjh.a) {
                        if (!kjh.a.e) {
                            application.registerActivityLifecycleCallbacks(kjh.a);
                            application.registerComponentCallbacks(kjh.a);
                            kjh.a.e = true;
                        }
                        break;
                    }
                    kjh kjhVar = kjh.a;
                    kjx kjxVar = new kjx(this);
                    synchronized (kjh.a) {
                        kjhVar.d.add(kjxVar);
                        break;
                    }
                    kjh kjhVar2 = kjh.a;
                    if (!kjhVar2.c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!kjhVar2.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            kjhVar2.b.set(true);
                        }
                    }
                    if (!kjhVar2.b.get()) {
                        this.e = 300000L;
                    }
                }
                return true;
            case 7:
                j((kij) message.obj);
                return true;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    kkc kkcVar4 = (kkc) this.l.get(message.obj);
                    mip.m84do(kkcVar4.j.o);
                    if (kkcVar4.g) {
                        kkcVar4.d();
                    }
                }
                return true;
            case 10:
                Iterator it = this.r.iterator();
                while (it.hasNext()) {
                    kkc kkcVar5 = (kkc) this.l.remove((kjg) it.next());
                    if (kkcVar5 != null) {
                        kkcVar5.m();
                    }
                }
                this.r.clear();
                return true;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    kkc kkcVar6 = (kkc) this.l.get(message.obj);
                    mip.m84do(kkcVar6.j.o);
                    if (kkcVar6.g) {
                        kkcVar6.n();
                        kkg kkgVar = kkcVar6.j;
                        kkcVar6.f(kkgVar.h.e(kkgVar.g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        kkcVar6.b.j("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    kkc kkcVar7 = (kkc) this.l.get(message.obj);
                    mip.m84do(kkcVar7.j.o);
                    if (kkcVar7.b.k() && kkcVar7.e.size() == 0) {
                        kjt kjtVar = kkcVar7.d;
                        if (kjtVar.a.isEmpty() && kjtVar.b.isEmpty()) {
                            kkcVar7.b.j("Timing out service connection.");
                        } else {
                            kkcVar7.l();
                        }
                    }
                }
                return true;
            case 14:
                throw null;
            case 15:
                kkd kkdVar = (kkd) message.obj;
                if (this.l.containsKey(kkdVar.a)) {
                    kkc kkcVar8 = (kkc) this.l.get(kkdVar.a);
                    if (kkcVar8.h.contains(kkdVar) && !kkcVar8.g) {
                        if (kkcVar8.b.k()) {
                            kkcVar8.g();
                        } else {
                            kkcVar8.d();
                        }
                    }
                }
                return true;
            case 16:
                kkd kkdVar2 = (kkd) message.obj;
                if (this.l.containsKey(kkdVar2.a)) {
                    kkc kkcVar9 = (kkc) this.l.get(kkdVar2.a);
                    if (kkcVar9.h.remove(kkdVar2)) {
                        kkcVar9.j.o.removeMessages(15, kkdVar2);
                        kkcVar9.j.o.removeMessages(16, kkdVar2);
                        khk khkVar = kkdVar2.b;
                        ArrayList arrayList = new ArrayList(kkcVar9.a.size());
                        for (kjf kjfVar : kkcVar9.a) {
                            if ((kjfVar instanceof kiz) && (khkVarArrB = ((kiz) kjfVar).b(kkcVar9)) != null && mip.cs(khkVarArrB, khkVar)) {
                                arrayList.add(kjfVar);
                            }
                        }
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            kjf kjfVar2 = (kjf) arrayList.get(i2);
                            kkcVar9.a.remove(kjfVar2);
                            kjfVar2.e(new kiy(khkVar));
                        }
                    }
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                kkv kkvVar = (kkv) message.obj;
                if (kkvVar.c == 0) {
                    l().a(new knm(kkvVar.b, Arrays.asList(kkvVar.a)));
                } else {
                    knm knmVar = this.q;
                    if (knmVar != null) {
                        List list = knmVar.b;
                        if (knmVar.a != kkvVar.b || (list != null && list.size() >= kkvVar.d)) {
                            this.o.removeMessages(17);
                            k();
                        } else {
                            knm knmVar2 = this.q;
                            kne kneVar = kkvVar.a;
                            if (knmVar2.b == null) {
                                knmVar2.b = new ArrayList();
                            }
                            knmVar2.b.add(kneVar);
                        }
                    }
                    if (this.q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(kkvVar.a);
                        this.q = new knm(kkvVar.b, arrayList2);
                        Handler handler2 = this.o;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), kkvVar.c);
                    }
                }
                return true;
            case 19:
                this.f = false;
                return true;
            default:
                int i3 = message.what;
                StringBuilder sb5 = new StringBuilder(31);
                sb5.append("Unknown message id: ");
                sb5.append(i3);
                Log.w("GoogleApiManager", sb5.toString());
                return false;
        }
    }

    final boolean i(khi khiVar, int i) {
        khm khmVar = this.h;
        Context context = this.g;
        if (mip.ck(context)) {
            return false;
        }
        PendingIntent pendingIntentH = khiVar.b() ? khiVar.d : khmVar.h(context, khiVar.c, null);
        if (pendingIntentH == null) {
            return false;
        }
        khmVar.c(context, khiVar.c, mip.cf(context, GoogleApiActivity.a(context, pendingIntentH, i, true), 167772160));
        return true;
    }
}
