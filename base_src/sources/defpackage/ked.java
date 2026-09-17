package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ked extends kdu {
    public final kec a;
    public key c;
    private final kep d;
    private final kfm e;

    protected ked(kdx kdxVar) {
        super(kdxVar);
        this.e = new kfm();
        this.a = new kec(this);
        this.d = new kdz(this, kdxVar);
    }

    public final void C() {
        this.e.b();
        this.d.d(((Long) keu.x.a()).longValue());
    }

    public final boolean D() {
        kdo.a();
        z();
        return this.c != null;
    }

    public final boolean E(kex kexVar) {
        mip.dk(kexVar);
        kdo.a();
        z();
        key keyVar = this.c;
        if (keyVar == null) {
            return false;
        }
        String strF = kexVar.d ? ken.f() : ken.h();
        List listEmptyList = Collections.emptyList();
        try {
            Map map = kexVar.a;
            long j = kexVar.c;
            Parcel parcelA = keyVar.a();
            parcelA.writeMap(map);
            parcelA.writeLong(j);
            parcelA.writeString(strF);
            parcelA.writeTypedList(listEmptyList);
            keyVar.z(1, parcelA);
            C();
            return true;
        } catch (RemoteException e) {
            q("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    @Override // defpackage.kdu
    protected final void a() {
    }

    public final void b() {
        kdo.a();
        z();
        try {
            knx.a().b(d(), this.a);
        } catch (IllegalArgumentException e) {
        } catch (IllegalStateException e2) {
        }
        if (this.c != null) {
            this.c = null;
            c();
        }
    }

    public final void c() {
        kds kdsVarF = f();
        kdsVarF.z();
        kdo.a();
        kel kelVar = kdsVarF.a;
        kdo.a();
        kelVar.z();
        kelVar.q("Service disconnected");
    }
}
