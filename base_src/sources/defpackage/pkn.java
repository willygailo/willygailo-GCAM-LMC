package defpackage;

import android.hardware.HardwareBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class pkn {
    public final Object a = new Object();
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public final Runnable e;
    public final Runnable f;

    public pkn(final mad madVar, final HardwareBuffer hardwareBuffer) {
        this.e = new Runnable() { // from class: pkm
            @Override // java.lang.Runnable
            public final void run() {
                pkn pknVar = this.a;
                mad madVar2 = madVar;
                synchronized (pknVar.a) {
                    pknVar.b = true;
                    if (pknVar.d && !pknVar.c) {
                        madVar2.close();
                        pknVar.c = true;
                    }
                }
            }
        };
        this.f = new Runnable() { // from class: pkl
            @Override // java.lang.Runnable
            public final void run() {
                pkn pknVar = this.a;
                HardwareBuffer hardwareBuffer2 = hardwareBuffer;
                mad madVar2 = madVar;
                synchronized (pknVar.a) {
                    if (!pknVar.d) {
                        hardwareBuffer2.close();
                        pknVar.d = true;
                    }
                    if (pknVar.b) {
                        madVar2.close();
                        pknVar.c = true;
                    }
                }
            }
        };
    }
}
