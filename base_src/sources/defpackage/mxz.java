package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class mxz implements mxo {
    public final phw a;
    public final pyn b;

    public mxz(mxm mxmVar, final Context context, phw phwVar, pyn pynVar, qkg qkgVar, final qkg qkgVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        mxmVar.a(phwVar, pynVar, qkgVar);
        this.a = phwVar;
        this.b = pynVar;
        obr.au(new ojz() { // from class: mxw
            @Override // defpackage.ojz
            public final Object a() {
                Object objI;
                mxz mxzVar = this.a;
                Context context2 = context;
                synchronized (mxzVar) {
                    String strB = mwh.b();
                    String strConcat = String.valueOf(strB).concat(".trace");
                    File filesDir = context2.getFilesDir();
                    String strValueOf = String.valueOf(strB);
                    File file = new File(filesDir, strValueOf.length() != 0 ? "primes_profiling_".concat(strValueOf) : new String("primes_profiling_"));
                    if (file.exists() || file.mkdir()) {
                        File file2 = new File(file, strConcat);
                        file2.deleteOnExit();
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } catch (RuntimeException e) {
                        }
                        objI = ojc.i(file2);
                    } else {
                        objI = oih.a;
                    }
                }
                return objI;
            }
        });
        obr.au(new ojz() { // from class: mxx
            @Override // defpackage.ojz
            public final Object a() {
                return ((myb) qkgVar2).get();
            }
        });
    }

    public final synchronized void a() {
    }

    @Override // defpackage.mxo
    public final void t() {
        plk.Y(new Runnable() { // from class: mxy
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, this.a);
    }
}
