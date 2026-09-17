package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kjd extends kiz {
    private final klj a;
    private final kvm b;

    public kjd(int i, klj kljVar, kvm kvmVar) {
        super(i);
        this.b = kvmVar;
        this.a = kljVar;
        if (i == 2 && kljVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.kiz
    public final boolean a(kkc kkcVar) {
        return this.a.b;
    }

    @Override // defpackage.kiz
    public final khk[] b(kkc kkcVar) {
        return this.a.a;
    }

    @Override // defpackage.kjf
    public final void d(Status status) {
        this.b.c(mip.dA(status));
    }

    @Override // defpackage.kjf
    public final void e(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.kjf
    public final void f(kkc kkcVar) throws DeadObjectException {
        try {
            klj kljVar = this.a;
            kljVar.d.a.a(kkcVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(kjf.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.kjf
    public final void g(kjt kjtVar, boolean z) {
        kvm kvmVar = this.b;
        kjtVar.b.put(kvmVar, Boolean.valueOf(z));
        kvmVar.a.f(new kjs(kjtVar, kvmVar));
    }
}
