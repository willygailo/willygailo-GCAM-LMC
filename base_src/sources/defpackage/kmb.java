package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kmb {
    private static final khk[] a = new khk[0];
    kmw b;
    public final Context c;
    final Handler d;
    protected klw g;
    public final int j;
    public volatile String k;
    public final kmn p;
    public final kmo q;
    public knc r;
    private final kmr t;
    private IInterface u;
    private klx v;
    private final String w;
    private volatile String s = null;
    public final Object e = new Object();
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();
    public int i = 1;
    public khi l = null;
    public boolean m = false;
    public volatile kmh n = null;
    protected final AtomicInteger o = new AtomicInteger(0);

    protected kmb(Context context, Looper looper, kmr kmrVar, khn khnVar, int i, kmn kmnVar, kmo kmoVar, String str) {
        mip.du(context, "Context must not be null");
        this.c = context;
        mip.du(looper, "Looper must not be null");
        mip.du(kmrVar, "Supervisor must not be null");
        this.t = kmrVar;
        mip.du(khnVar, "API availability must not be null");
        this.d = new klu(this, looper);
        this.j = i;
        this.p = kmnVar;
        this.q = kmoVar;
        this.w = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int i, IInterface iInterface) {
        boolean z;
        kmw kmwVar;
        mip.dl((i == 4) == (iInterface != null));
        synchronized (this.e) {
            this.i = i;
            this.u = iInterface;
            switch (i) {
                case 1:
                    klx klxVar = this.v;
                    if (klxVar != null) {
                        kmr kmrVar = this.t;
                        kmw kmwVar2 = this.b;
                        String str = kmwVar2.a;
                        String str2 = kmwVar2.b;
                        int i2 = kmwVar2.c;
                        v();
                        kmrVar.a(str, str2, klxVar, this.b.d);
                        this.v = null;
                    }
                    break;
                case 2:
                case 3:
                    klx klxVar2 = this.v;
                    if (klxVar2 != null && (kmwVar = this.b) != null) {
                        String str3 = kmwVar.a;
                        String str4 = kmwVar.b;
                        StringBuilder sb = new StringBuilder(str3.length() + 70 + str4.length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        kmr kmrVar2 = this.t;
                        kmw kmwVar3 = this.b;
                        String str5 = kmwVar3.a;
                        String str6 = kmwVar3.b;
                        int i3 = kmwVar3.c;
                        v();
                        kmrVar2.a(str5, str6, klxVar2, this.b.d);
                        this.o.incrementAndGet();
                    }
                    klx klxVar3 = new klx(this, this.o.get());
                    this.v = klxVar3;
                    kmw kmwVar4 = new kmw(w(), d(), A());
                    this.b = kmwVar4;
                    if (kmwVar4.d && a() < 17895000) {
                        String str7 = this.b.a;
                        throw new IllegalStateException(str7.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(str7) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                    }
                    kmr kmrVar3 = this.t;
                    kmw kmwVar5 = this.b;
                    String str8 = kmwVar5.a;
                    String str9 = kmwVar5.b;
                    int i4 = kmwVar5.c;
                    String strV = v();
                    boolean z2 = this.b.d;
                    F();
                    kmq kmqVar = new kmq(str8, str9, z2);
                    synchronized (kmrVar3.c) {
                        kms kmsVar = (kms) kmrVar3.c.get(kmqVar);
                        if (kmsVar == null) {
                            kmsVar = new kms(kmrVar3, kmqVar);
                            kmsVar.c(klxVar3, klxVar3);
                            kmsVar.d(strV);
                            kmrVar3.c.put(kmqVar, kmsVar);
                        } else {
                            kmrVar3.e.removeMessages(0, kmqVar);
                            if (!kmsVar.a(klxVar3)) {
                                kmsVar.c(klxVar3, klxVar3);
                                switch (kmsVar.b) {
                                    case 1:
                                        klxVar3.onServiceConnected(kmsVar.f, kmsVar.d);
                                        break;
                                    case 2:
                                        kmsVar.d(strV);
                                        break;
                                }
                            } else {
                                String strValueOf = String.valueOf(kmqVar);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 81);
                                sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                                sb2.append(strValueOf);
                                throw new IllegalStateException(sb2.toString());
                            }
                        }
                        z = kmsVar.c;
                    }
                    if (!z) {
                        kmw kmwVar6 = this.b;
                        String str10 = kmwVar6.a;
                        String str11 = kmwVar6.b;
                        StringBuilder sb3 = new StringBuilder(str10.length() + 34 + str11.length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str10);
                        sb3.append(" on ");
                        sb3.append(str11);
                        Log.w("GmsClient", sb3.toString());
                        G(16, this.o.get());
                    }
                    break;
                    break;
                case 4:
                    mip.dk(iInterface);
                    System.currentTimeMillis();
                    break;
                default:
                    break;
            }
        }
    }

    protected boolean A() {
        return false;
    }

    public final boolean B() {
        return this.n != null;
    }

    public boolean C() {
        return false;
    }

    public khk[] D() {
        throw null;
    }

    protected void F() {
        throw null;
    }

    protected final void G(int i, int i2) {
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new kma(this, i)));
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    public khk[] e() {
        return a;
    }

    public final String f() {
        return this.s;
    }

    public void h(klw klwVar) {
        mip.du(klwVar, "Connection progress callbacks cannot be null.");
        this.g = klwVar;
        H(2, null);
    }

    public void i() {
        this.o.incrementAndGet();
        synchronized (this.h) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                ((klv) this.h.get(i)).e();
            }
            this.h.clear();
        }
        synchronized (this.f) {
            this.r = null;
        }
        H(1, null);
    }

    public final void j(String str) {
        this.s = str;
        i();
    }

    public final boolean k() {
        boolean z;
        synchronized (this.e) {
            z = this.i == 4;
        }
        return z;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.e) {
            int i = this.i;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean m() {
        return true;
    }

    public boolean n() {
        return false;
    }

    public final khk[] o() {
        kmh kmhVar = this.n;
        if (kmhVar == null) {
            return null;
        }
        return kmhVar.b;
    }

    public final void p(kkb kkbVar) {
        kkbVar.a.j.o.post(new kka(kkbVar));
    }

    public final void q() {
        if (!k() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void r(kmy kmyVar, Set set) {
        Bundle bundleT = t();
        kmm kmmVar = new kmm(this.j, this.k);
        kmmVar.d = this.c.getPackageName();
        kmmVar.g = bundleT;
        if (set != null) {
            kmmVar.f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (n()) {
            Account accountS = s();
            if (accountS == null) {
                accountS = new Account("<<default account>>", "com.google");
            }
            kmmVar.h = accountS;
            if (kmyVar != null) {
                kmmVar.e = kmyVar.a;
            }
        }
        kmmVar.i = D();
        kmmVar.j = e();
        if (C()) {
            kmmVar.m = true;
        }
        try {
            synchronized (this.f) {
                knc kncVar = this.r;
                if (kncVar != null) {
                    knb knbVar = new knb(this, this.o.get());
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        parcelObtain.writeStrongBinder(knbVar);
                        parcelObtain.writeInt(1);
                        sk.a(kmmVar, parcelObtain, 0);
                        kncVar.a.transact(46, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } catch (Throwable th) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.d;
            handler.sendMessage(handler.obtainMessage(6, this.o.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            x(8, null, null, this.o.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            x(8, null, null, this.o.get());
        }
    }

    public Account s() {
        throw null;
    }

    protected Bundle t() {
        return new Bundle();
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.e) {
            if (this.i == 5) {
                throw new DeadObjectException();
            }
            if (!k()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.u;
            mip.du(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected final String v() {
        String str = this.w;
        return str == null ? this.c.getClass().getName() : str;
    }

    protected String w() {
        return "com.google.android.gms";
    }

    protected void x(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new klz(this, i, iBinder, bundle)));
    }

    protected final void y(klw klwVar, int i, PendingIntent pendingIntent) {
        this.g = klwVar;
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(3, this.o.get(), i, pendingIntent));
    }

    public final boolean z(int i, int i2, IInterface iInterface) {
        synchronized (this.e) {
            if (this.i != i) {
                return false;
            }
            H(i2, iInterface);
            return true;
        }
    }
}
