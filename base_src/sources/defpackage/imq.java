package defpackage;

import android.os.PowerManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class imq implements PowerManager.OnThermalStatusChangedListener, imt, fik, fhn, fhm {
    private static final ouj c = ouj.h("com/google/android/apps/camera/temperature/SelfUpdatingTemperatureBroadcaster");
    private final fjs d;
    private final imo e;
    private boolean f;
    public final List a = new ArrayList();
    private ims g = ims.UNKNOWN;

    public imq(fjs fjsVar, imo imoVar, fhi fhiVar, lar larVar, ddf ddfVar) {
        this.d = fjsVar;
        this.e = imoVar;
        ddi ddiVar = ddl.a;
        ddfVar.f();
        synchronized (this) {
            if (!this.f) {
                imoVar.a(this);
                this.f = true;
            }
        }
        enl.e(larVar, fhiVar, this);
    }

    @Override // defpackage.fhm
    public final synchronized void a() {
        if (this.f) {
            ((oug) ((oug) c.c()).G((char) 3006)).o("Was already registered as ThermalStatusListener on AppStart");
        } else {
            this.e.a(this);
        }
        this.f = true;
    }

    @Override // defpackage.fhn
    public final synchronized void b() {
        if (this.f) {
            imo imoVar = this.e;
            imoVar.e.execute(new imn(imoVar, this, 0));
        } else {
            ((oug) ((oug) c.c()).G((char) 3008)).o("Was not registered as ThermalStatusListener on AppStop");
        }
        this.f = false;
    }

    @Override // defpackage.imt
    public final synchronized ims c() {
        return this.g;
    }

    @Override // defpackage.imt
    public final lie d(final imr imrVar) {
        ims imsVar;
        synchronized (this) {
            this.a.add(imrVar);
            imsVar = this.g;
        }
        if (imsVar != ims.UNKNOWN) {
            imrVar.c(imsVar);
        }
        return new lie() { // from class: imp
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                imq imqVar = this.a;
                imr imrVar2 = imrVar;
                synchronized (imqVar) {
                    imqVar.a.remove(imrVar2);
                }
            }
        };
    }

    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    public final void onThermalStatusChanged(int i) {
        oom oomVarJ;
        ims imsVar;
        Map map = b;
        Integer numValueOf = Integer.valueOf(i);
        map.get(numValueOf);
        ims imsVar2 = (ims) b.get(numValueOf);
        if (imsVar2 == null) {
            ((oug) ((oug) c.c()).G(3012)).p("Ignoring call to onThermalStatusChanged with unknown status value: %d", i);
            return;
        }
        synchronized (this) {
            if (imsVar2 != this.g) {
                poy poyVarM = pee.d.m();
                int i2 = this.g.j;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pee peeVar = (pee) poyVarM.b;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                peeVar.c = i3;
                int i4 = peeVar.a | 8;
                peeVar.a = i4;
                int i5 = imsVar2.j;
                int i6 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                peeVar.b = i6;
                peeVar.a = i4 | 4;
                this.g = imsVar2;
                this.d.z((pee) poyVarM.j());
                synchronized (this) {
                    oomVarJ = oom.j(this.a);
                    imsVar = this.g;
                }
                int size = oomVarJ.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((imr) oomVarJ.get(i7)).c(imsVar);
                }
            }
        }
    }
}
