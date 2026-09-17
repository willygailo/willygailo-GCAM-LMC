package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
abstract class kja extends kiz {
    protected final kvm a;

    public kja(int i, kvm kvmVar) {
        super(i);
        this.a = kvmVar;
    }

    protected abstract void c(kkc kkcVar);

    @Override // defpackage.kjf
    public final void d(Status status) {
        this.a.c(new kig(status));
    }

    @Override // defpackage.kjf
    public final void e(Exception exc) {
        this.a.c(exc);
    }

    @Override // defpackage.kjf
    public final void f(kkc kkcVar) throws DeadObjectException {
        try {
            c(kkcVar);
        } catch (DeadObjectException e) {
            d(kjf.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(kjf.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.kjf
    public void g(kjt kjtVar, boolean z) {
    }
}
