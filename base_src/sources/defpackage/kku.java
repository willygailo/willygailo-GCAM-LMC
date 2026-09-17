package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class kku implements kvc {
    private final kkg a;
    private final int b;
    private final kjg c;
    private final long d;
    private final long e;

    public kku(kkg kkgVar, int i, kjg kjgVar, long j, long j2) {
        this.a = kkgVar;
        this.b = i;
        this.c = kjgVar;
        this.d = j;
        this.e = j2;
    }

    public static kmi b(kkc kkcVar, kmb kmbVar, int i) {
        int[] iArr;
        int[] iArr2;
        kmh kmhVar = kmbVar.n;
        kmi kmiVar = kmhVar == null ? null : kmhVar.d;
        if (kmiVar == null || !kmiVar.b || ((iArr = kmiVar.d) != null ? !mip.cr(iArr, i) : !((iArr2 = kmiVar.f) == null || !mip.cr(iArr2, i))) || kkcVar.i >= kmiVar.e) {
            return null;
        }
        return kmiVar;
    }

    @Override // defpackage.kvc
    public final void a(kvk kvkVar) {
        kkc kkcVarB;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int iElapsedRealtime;
        if (this.a.h()) {
            knl knlVar = knk.a().a;
            if ((knlVar == null || knlVar.b) && (kkcVarB = this.a.b(this.c)) != null) {
                Object obj = kkcVarB.b;
                if (obj instanceof kmb) {
                    int i5 = 0;
                    boolean z = this.d > 0;
                    kmb kmbVar = (kmb) obj;
                    int i6 = kmbVar.j;
                    if (knlVar != null) {
                        z &= knlVar.c;
                        int i7 = knlVar.d;
                        int i8 = knlVar.e;
                        i = knlVar.a;
                        if (kmbVar.B() && !kmbVar.l()) {
                            kmi kmiVarB = b(kkcVarB, kmbVar, this.b);
                            if (kmiVarB == null) {
                                return;
                            }
                            boolean z2 = kmiVarB.c && this.d > 0;
                            i8 = kmiVarB.e;
                            z = z2;
                        }
                        i2 = i7;
                        i3 = i8;
                    } else {
                        i = 0;
                        i2 = 5000;
                        i3 = 100;
                    }
                    kkg kkgVar = this.a;
                    if (kvkVar.e()) {
                        i4 = 0;
                    } else if (((kvp) kvkVar).c) {
                        i5 = 100;
                        i4 = -1;
                    } else {
                        Exception excB = kvkVar.b();
                        if (excB instanceof kig) {
                            Status status = ((kig) excB).a;
                            int i9 = status.g;
                            khi khiVar = status.j;
                            i4 = khiVar == null ? -1 : khiVar.c;
                            i5 = i9;
                        } else {
                            i5 = R.styleable.AppCompatTheme_switchStyle;
                            i4 = -1;
                        }
                    }
                    if (z) {
                        long j3 = this.d;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                        iElapsedRealtime = -1;
                    }
                    kne kneVar = new kne(this.b, i5, i4, j, j2, null, null, i6, iElapsedRealtime);
                    Handler handler = kkgVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new kkv(kneVar, i, i2, i3)));
                }
            }
        }
    }
}
