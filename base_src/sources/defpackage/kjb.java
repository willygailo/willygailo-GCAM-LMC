package defpackage;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kjb extends kjf {
    protected final kji a;

    public kjb(int i, kji kjiVar) {
        super(i);
        this.a = kjiVar;
    }

    @Override // defpackage.kjf
    public final void d(Status status) {
        try {
            this.a.f(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.kjf
    public final void e(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.a.f(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.kjf
    public final void f(kkc kkcVar) throws DeadObjectException {
        try {
            this.a.e(kkcVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    @Override // defpackage.kjf
    public final void g(kjt kjtVar, boolean z) {
        kji kjiVar = this.a;
        kjtVar.a.put(kjiVar, Boolean.valueOf(z));
        kjiVar.l(new kjr(kjtVar, kjiVar));
    }
}
