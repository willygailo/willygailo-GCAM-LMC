package defpackage;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes2.dex */
final class kwv extends kym {
    final /* synthetic */ kww a;
    private volatile int b = -1;

    public kwv(kww kwwVar) {
        this.a = kwwVar;
    }

    private final boolean l(Runnable runnable) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if ((!kzt.a(this.a).b() || !mip.cm(this.a, callingUid, "com.google.android.wearable.app.cn")) && !mip.cl(this.a, callingUid)) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Caller is not GooglePlayServices; caller UID: ");
                sb.append(callingUid);
                Log.e("WearableLS", sb.toString());
                return false;
            }
            this.b = callingUid;
        }
        synchronized (this.a.c) {
            kww kwwVar = this.a;
            if (kwwVar.d) {
                return false;
            }
            kwwVar.a.post(runnable);
            return true;
        }
    }

    @Override // defpackage.kyn
    public final void b(kxh kxhVar) {
        l(new kwu(this, kxhVar));
    }

    @Override // defpackage.kyn
    public final void c(DataHolder dataHolder) {
        kws kwsVar = new kws(dataHolder);
        try {
            String strValueOf = String.valueOf(dataHolder);
            int i = dataHolder.h;
            String.valueOf(strValueOf).length();
            if (l(kwsVar)) {
                return;
            }
            dataHolder.close();
        } catch (Throwable th) {
            dataHolder.close();
            throw th;
        }
    }

    @Override // defpackage.kyn
    public final void d(kyw kywVar) {
        l(new kwt(this, kywVar));
    }

    @Override // defpackage.kyn
    public final void e(final kyw kywVar, final kyi kyiVar) {
        l(new Runnable() { // from class: kwr
            @Override // java.lang.Runnable
            public final void run() {
                kyw kywVar2 = kywVar;
                kyi kyiVar2 = kyiVar;
                String str = kywVar2.d;
                String str2 = kywVar2.b;
                byte[] bArr = kywVar2.c;
                try {
                    Parcel parcelA = kyiVar2.a();
                    bmp.b(parcelA, false);
                    parcelA.writeByteArray(null);
                    kyiVar2.A(1, parcelA);
                } catch (RemoteException e) {
                    Log.e("WearableLS", "Failed to send a response back", e);
                }
            }
        });
    }

    @Override // defpackage.kyn
    public final void f() {
        l(new isd(17));
    }

    @Override // defpackage.kyn
    public final void g() {
        l(new isd(16));
    }

    @Override // defpackage.kyn
    public final void h() {
        l(new isd(19));
    }

    @Override // defpackage.kyn
    public final void i() {
        l(new isd(18));
    }

    @Override // defpackage.kyn
    public final void j() {
        l(new isd(14));
    }

    @Override // defpackage.kyn
    public final void k() {
        l(new isd(15));
    }
}
