package defpackage;

import android.util.ArraySet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dkg implements lmo {
    private static final ouj a = ouj.h("com/google/android/apps/camera/device/CameraDeviceErrorBroadcaster");
    private long c;
    private lju b = lju.CAMERA_ERROR_CODE_UNKNOWN;
    private int e = 1;
    private final Set d = new ArraySet();

    @Override // defpackage.lmo
    public final void a(lju ljuVar, long j) {
        synchronized (this) {
            if (this.e != 3) {
                this.e = 2;
                ((oug) ((oug) a.c()).G(813)).x("CameraDeviceError : %s Open duration = %s", ljuVar.c(), j);
                this.b = ljuVar;
                this.c = j;
                ope opeVarF = ope.F(this.d);
                this.d.clear();
                oti otiVarListIterator = opeVarF.listIterator();
                while (otiVarListIterator.hasNext()) {
                    ((lmo) otiVarListIterator.next()).a(ljuVar, j);
                }
            }
        }
    }

    @Override // defpackage.lmo
    public final void b() {
        synchronized (this) {
            if (this.e != 2) {
                this.e = 3;
                ope opeVarF = ope.F(this.d);
                this.d.clear();
                oti otiVarListIterator = opeVarF.listIterator();
                while (otiVarListIterator.hasNext()) {
                    ((lmo) otiVarListIterator.next()).b();
                }
            }
        }
    }

    public final lie c(final lmo lmoVar) {
        lju ljuVar;
        boolean z;
        long j;
        synchronized (this) {
            int i = this.e;
            int i2 = i - 1;
            ljuVar = null;
            if (i == 0) {
                throw null;
            }
            z = false;
            j = 0;
            switch (i2) {
                case 1:
                    ljuVar = this.b;
                    j = this.c;
                    break;
                case 2:
                    z = true;
                    break;
                default:
                    this.d.add(lmoVar);
                    break;
            }
        }
        if (ljuVar != null) {
            lmoVar.a(ljuVar, j);
            return new jmf(3);
        }
        if (!z) {
            return new lie() { // from class: dkf
                @Override // defpackage.lie, java.lang.AutoCloseable
                public final void close() {
                    this.a.d(lmoVar);
                }
            };
        }
        lmoVar.b();
        return new jmf(3);
    }

    public final synchronized void d(lmo lmoVar) {
        if (this.e != 2 && this.d.contains(lmoVar)) {
            lmoVar.b();
        }
        this.d.remove(lmoVar);
    }
}
