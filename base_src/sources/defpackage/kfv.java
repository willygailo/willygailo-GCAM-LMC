package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kfv extends kmp {
    public final GoogleSignInOptions a;

    public kfv(Context context, Looper looper, kmf kmfVar, GoogleSignInOptions googleSignInOptions, kik kikVar, kil kilVar) {
        super(context, looper, 91, kmfVar, kikVar, kilVar);
        kfr kfrVar = googleSignInOptions != null ? new kfr(googleSignInOptions) : new kfr();
        kfrVar.b = kqc.a();
        if (!kmfVar.c.isEmpty()) {
            Iterator it = kmfVar.c.iterator();
            while (it.hasNext()) {
                kfrVar.c((Scope) it.next(), new Scope[0]);
            }
        }
        this.a = kfrVar.a();
    }

    @Override // defpackage.kmp, defpackage.kmb, defpackage.kie
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kmb
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof kgi ? (kgi) iInterfaceQueryLocalInterface : new kgi(iBinder);
    }

    @Override // defpackage.kmb
    protected final String c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.kmb
    protected final String d() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
