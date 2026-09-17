package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class kij {
    public final Context c;
    public final String d;
    public final kif e;
    public final kid f;
    public final kjg g;
    public final Looper h;
    public final int i;
    public final kim j;
    protected final kkg k;

    public kij(Context context) {
        this(context, koz.a, kid.r, kii.a);
        kzy.b(context.getApplicationContext());
    }

    public kij(Context context, Activity activity, kif kifVar, kid kidVar, kii kiiVar) {
        String str;
        kkp kkpVar;
        kkp kkpVar2;
        kkn kknVar;
        klh klhVar;
        klh klhVar2;
        mip.du(context, "Null context is not permitted.");
        mip.du(kiiVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.c = context.getApplicationContext();
        try {
            str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            str = null;
        }
        this.d = str;
        this.e = kifVar;
        this.f = kidVar;
        this.h = kiiVar.b;
        kjg kjgVar = new kjg(kifVar, kidVar, str);
        this.g = kjgVar;
        this.j = new kkh(this);
        kkg kkgVarC = kkg.c(this.c);
        this.k = kkgVarC;
        this.i = kkgVarC.j.getAndIncrement();
        mip mipVar = kiiVar.c;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            Object obj = new kkm(activity).a;
            if (obj instanceof by) {
                by byVar = (by) obj;
                WeakReference weakReference = (WeakReference) klh.a.get(byVar);
                if (weakReference == null || (klhVar2 = (klh) weakReference.get()) == null) {
                    try {
                        kknVar = klhVar2;
                        klh klhVar3 = (klh) byVar.fm().d("SupportLifecycleFragmentImpl");
                        if (klhVar3 == null || klhVar3.r) {
                            klhVar = klhVar3;
                            klh klhVar4 = new klh();
                            dd ddVarH = byVar.fm().h();
                            ddVarH.n(klhVar4, "SupportLifecycleFragmentImpl");
                            ddVarH.h();
                            klhVar = klhVar4;
                        }
                        klhVar = klhVar3;
                        klh.a.put(byVar, new WeakReference(klhVar));
                        kknVar = klhVar;
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
                    }
                }
            } else {
                WeakReference weakReference2 = (WeakReference) kkp.a.get(obj);
                if (weakReference2 == null || (kkpVar2 = (kkp) weakReference2.get()) == null) {
                    try {
                        kknVar = kkpVar2;
                        kkp kkpVar3 = (kkp) ((Activity) obj).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                        if (kkpVar3 == null || kkpVar3.isRemoving()) {
                            kkpVar = kkpVar3;
                            kkp kkpVar4 = new kkp();
                            ((Activity) obj).getFragmentManager().beginTransaction().add(kkpVar4, "LifecycleFragmentImpl").commitAllowingStateLoss();
                            kkpVar = kkpVar4;
                        }
                        kkpVar = kkpVar3;
                        kkp.a.put(obj, new WeakReference(kkpVar));
                        kknVar = kkpVar;
                    } catch (ClassCastException e3) {
                        throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e3);
                    }
                }
            }
            kknVar = kkpVar2;
            kknVar = klhVar2;
            kju kjuVar = (kju) kknVar.d(kju.class);
            kjuVar = kjuVar == null ? new kju(kknVar, kkgVarC) : kjuVar;
            kjuVar.e.add(kjgVar);
            kkgVarC.g(kjuVar);
        }
        Handler handler = kkgVarC.o;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public kij(Context context, kif kifVar, kid kidVar, kii kiiVar) {
        this(context, null, kifVar, kidVar, kiiVar);
    }

    @Deprecated
    public kij(Context context, kif kifVar, kid kidVar, mip mipVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        kih kihVar = new kih();
        kihVar.a = mipVar;
        this(context, kifVar, kidVar, kihVar.a());
    }

    public kij(Context context, kvx kvxVar) {
        this(context, kvy.a, kvxVar, kii.a);
    }

    private final kvk a(int i, klj kljVar) {
        kvm kvmVar = new kvm();
        kkg kkgVar = this.k;
        kkgVar.d(kvmVar, kljVar.c, this);
        kjd kjdVar = new kjd(i, kljVar, kvmVar);
        Handler handler = kkgVar.o;
        handler.sendMessage(handler.obtainMessage(4, new kkx(kjdVar, kkgVar.k.get(), this)));
        return kvmVar.a;
    }

    public static void l(kxi kxiVar) {
        mip.du(kxiVar, "channel must not be null");
    }

    public final kmd c() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        kmd kmdVar = new kmd();
        kid kidVar = this.f;
        Account accountA = null;
        if (!(kidVar instanceof kib) || (googleSignInAccountA2 = ((kib) kidVar).a()) == null) {
            kid kidVar2 = this.f;
            if (kidVar2 instanceof kia) {
                accountA = ((kia) kidVar2).a();
            }
        } else {
            String str = googleSignInAccountA2.d;
            if (str != null) {
                accountA = new Account(str, "com.google");
            }
        }
        kmdVar.a = accountA;
        kid kidVar3 = this.f;
        Set setEmptySet = (!(kidVar3 instanceof kib) || (googleSignInAccountA = ((kib) kidVar3).a()) == null) ? Collections.emptySet() : googleSignInAccountA.a();
        if (kmdVar.b == null) {
            kmdVar.b = new xa();
        }
        kmdVar.b.addAll(setEmptySet);
        kmdVar.d = this.c.getClass().getName();
        kmdVar.c = this.c.getPackageName();
        return kmdVar;
    }

    public final kvk d(klj kljVar) {
        return a(0, kljVar);
    }

    public final kvk e(kkr kkrVar, int i) {
        kkg kkgVar = this.k;
        kvm kvmVar = new kvm();
        kkgVar.d(kvmVar, i, this);
        kje kjeVar = new kje(kkrVar, kvmVar);
        Handler handler = kkgVar.o;
        handler.sendMessage(handler.obtainMessage(13, new kkx(kjeVar, kkgVar.k.get(), this)));
        return kvmVar.a;
    }

    public final void f(int i, kji kjiVar) {
        boolean z = true;
        if (!kjiVar.i && !((Boolean) BasePendingResult.c.get()).booleanValue()) {
            z = false;
        }
        kjiVar.i = z;
        kkg kkgVar = this.k;
        kjb kjbVar = new kjb(i, kjiVar);
        Handler handler = kkgVar.o;
        handler.sendMessage(handler.obtainMessage(4, new kkx(kjbVar, kkgVar.k.get(), this)));
    }

    public final kvk g() {
        kli kliVarA = klj.a();
        kliVarA.a = new klb() { // from class: ksk
            @Override // defpackage.klb
            public final void a(Object obj, Object obj2) {
                Location location;
                ktk ktkVar = (ktk) obj;
                String str = this.a.d;
                khk[] khkVarArrO = ktkVar.o();
                if (khkVarArrO == null || !mip.cs(khkVarArrO, ksi.d)) {
                    kti ktiVar = (kti) ktkVar.u();
                    Parcel parcelY = ktiVar.y(7, ktiVar.a());
                    location = (Location) bmp.a(parcelY, Location.CREATOR);
                    parcelY.recycle();
                } else {
                    kti ktiVar2 = (kti) ktkVar.u();
                    Parcel parcelA = ktiVar2.a();
                    parcelA.writeString(str);
                    Parcel parcelY2 = ktiVar2.y(80, parcelA);
                    location = (Location) bmp.a(parcelY2, Location.CREATOR);
                    parcelY2.recycle();
                }
                ((kvm) obj2).b(location);
            }
        };
        kliVarA.c = 2414;
        return d(kliVarA.a());
    }

    public final void h(kkr kkrVar) {
        e(kkrVar, 0).a(kvo.a, new klk());
    }

    public final kvk i(final String str) {
        kli kliVarA = klj.a();
        kliVarA.a = new klb() { // from class: kua
            @Override // defpackage.klb
            public final void a(Object obj, Object obj2) {
                String str2 = str;
                kud kudVar = new kud((kvm) obj2);
                kue kueVar = (kue) ((kuf) obj).u();
                Parcel parcelA = kueVar.a();
                bmp.e(parcelA, kudVar);
                parcelA.writeString(str2);
                kueVar.z(5, parcelA);
            }
        };
        return d(kliVarA.a());
    }

    public final kvk j(final String str, final String str2) {
        kli kliVarA = klj.a();
        kliVarA.a = new klb() { // from class: ktz
            @Override // defpackage.klb
            public final void a(Object obj, Object obj2) {
                String str3 = str;
                String str4 = str2;
                kud kudVar = new kud((kvm) obj2);
                kue kueVar = (kue) ((kuf) obj).u();
                Parcel parcelA = kueVar.a();
                bmp.e(parcelA, kudVar);
                parcelA.writeString(str3);
                parcelA.writeString(str4);
                parcelA.writeString(null);
                kueVar.z(11, parcelA);
            }
        };
        return d(kliVarA.a());
    }

    public final kvk k() {
        kli kliVarA = klj.a();
        kliVarA.a = new klb() { // from class: kvu
            @Override // defpackage.klb
            public final void a(Object obj, Object obj2) {
                kvv kvvVar = new kvv((kvm) obj2);
                kwc kwcVar = (kwc) ((kwf) obj).u();
                Parcel parcelA = kwcVar.a();
                bmp.e(parcelA, kvvVar);
                kwcVar.z(2, parcelA);
            }
        };
        kliVarA.c = 4501;
        return d(kliVarA.a());
    }

    public final void m(klj kljVar) {
        a(2, kljVar);
    }

    public final void n(kla klaVar) {
        mip.du(klaVar.a.a(), "Listener has already been released.");
        kkg kkgVar = this.k;
        kky kkyVar = klaVar.a;
        klm klmVar = klaVar.b;
        Runnable runnable = klaVar.c;
        kvm kvmVar = new kvm();
        kkgVar.d(kvmVar, kkyVar.b, this);
        kjc kjcVar = new kjc(new kla(kkyVar, klmVar, runnable, null), kvmVar, null);
        Handler handler = kkgVar.o;
        handler.sendMessage(handler.obtainMessage(8, new kkx(kjcVar, kkgVar.k.get(), this)));
    }
}
