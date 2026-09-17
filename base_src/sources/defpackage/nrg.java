package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nrg implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public nrg(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public nrg(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public nrg(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                Context context = (Context) this.a.get();
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) this.b.get();
                context.getClass();
                googleSignInOptions.getClass();
                return mip.dH(context, googleSignInOptions);
            case 1:
                Context context2 = (Context) this.a.get();
                Executor executor = (Executor) this.b.get();
                context2.getClass();
                executor.getClass();
                aig aigVarI = fw.i(context2, F250RoomDatabase.class, "f250-room-database");
                aigVarI.b = executor;
                aigVarI.b(npw.a);
                aigVarI.b(npw.b);
                aigVarI.b(npw.c);
                aigVarI.b(npw.d);
                aigVarI.b(npw.e);
                aigVarI.b(npw.f);
                aigVarI.b(npw.g);
                aigVarI.b(npw.j);
                aigVarI.b(npw.i);
                aigVarI.b(npw.h);
                aii aiiVarA = aigVarI.a();
                aiiVarA.getClass();
                return (F250RoomDatabase) aiiVarA;
            case 2:
                return new nsp(((nso) this.b).get(), ((nru) this.a).get());
            default:
                return new oed(((odw) this.b).get(), (odu) this.a.get(), null);
        }
    }
}
