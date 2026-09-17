package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dyz {
    public final enm a;
    public final boolean b;
    public final boolean c;

    public dyz(enm enmVar, ghx ghxVar, lvp lvpVar) {
        this.a = enmVar;
        this.b = lvpVar.k() == lwd.BACK;
        Integer num = (Integer) ghxVar.l(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        this.c = num != null && num.equals(1);
    }

    public final synchronized void a(lxa lxaVar) {
        lxaVar.b(this.a.a() + 1, Long.MAX_VALUE, new lwz() { // from class: dyy
            @Override // defpackage.lwz
            public final void a(List list) {
                dyz dyzVar = this.a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    lxc lxcVar = (lxc) it.next();
                    if (dyzVar.b) {
                        dyzVar.a.b(lxcVar.f, lxcVar.g, lxcVar.h, lxcVar.e);
                    } else {
                        dyzVar.a.b(lxcVar.f, -lxcVar.g, -lxcVar.h, lxcVar.e);
                    }
                }
            }
        });
    }
}
