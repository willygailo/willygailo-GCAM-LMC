package defpackage;

import android.os.StrictMode;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class nfm {
    public static final nfl a = new nfl();
    final nei b;
    final String c;
    public final boolean g;
    public final boolean h;
    private volatile String i;
    public final boolean f = false;
    final String d = "";
    final ngg e = new ngg(new nfk(this, 1));

    protected nfm(nei neiVar, String str, boolean z, boolean z2) {
        this.b = neiVar;
        this.c = str;
        this.g = z;
        this.h = z2;
    }

    protected final pht a() {
        return this.i.isEmpty() ? phq.a : pfj.i(this.b.d().a(this.i), Cnew.class, new ngo(this, 1), this.b.c());
    }

    protected final Map b() {
        ngu nguVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                nguVar = (ngu) plk.I(ngt.g(this.b, this.c, this.d, this.g).a());
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                throw th;
            }
        } catch (CancellationException | ExecutionException e) {
            String str = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("Unable to retrieve flag snapshot for ");
            sb.append(str);
            sb.append(" from storage.");
            Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            nguVar = null;
        }
        if (nguVar != null && !nguVar.b.isEmpty()) {
            this.i = nguVar.b;
            final int i = 1;
            this.b.c().execute(new Runnable(this) { // from class: ngp
                public final /* synthetic */ nfm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.a.c();
                            break;
                        case 1:
                            this.a.a();
                            break;
                        default:
                            nfm nfmVar = this.a;
                            nei neiVar = nfmVar.b;
                            pht phtVarB = nfq.a(neiVar).b(new nfp(nfmVar.c, 5), neiVar.c());
                            phtVarB.d(new ngq(nfmVar, phtVarB, 0), nfmVar.b.c());
                            break;
                    }
                }
            });
            final int i2 = 2;
            this.b.c().execute(new Runnable(this) { // from class: ngp
                public final /* synthetic */ nfm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.a.c();
                            break;
                        case 1:
                            this.a.a();
                            break;
                        default:
                            nfm nfmVar = this.a;
                            nei neiVar = nfmVar.b;
                            pht phtVarB = nfq.a(neiVar).b(new nfp(nfmVar.c, 5), neiVar.c());
                            phtVarB.d(new ngq(nfmVar, phtVarB, 0), nfmVar.b.c());
                            break;
                    }
                }
            });
            return ngt.c(nguVar);
        }
        final int i3 = 0;
        this.b.c().execute(new Runnable(this) { // from class: ngp
            public final /* synthetic */ nfm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.a.c();
                        break;
                    case 1:
                        this.a.a();
                        break;
                    default:
                        nfm nfmVar = this.a;
                        nei neiVar = nfmVar.b;
                        pht phtVarB = nfq.a(neiVar).b(new nfp(nfmVar.c, 5), neiVar.c());
                        phtVarB.d(new ngq(nfmVar, phtVarB, 0), nfmVar.b.c());
                        break;
                }
            }
        });
        String str2 = this.c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 54);
        sb2.append("Unable to retrieve flag snapshot for ");
        sb2.append(str2);
        sb2.append(", using defaults.");
        Log.w("ProtoDataStoreFlagStore", sb2.toString());
        return orw.a;
    }

    protected final void c() {
        pht phtVarD = ngt.d(this.b, this.c, this.d);
        pgb.i(phtVarD, new ngo(this, 0), this.b.c()).d(new ngq(this, phtVarD, 1), this.b.c());
    }

    public final /* synthetic */ void d(pht phtVar) {
        try {
            oor oorVarC = ngt.c((ngu) plk.ad(phtVar));
            ngg nggVar = this.e;
            oorVarC.getClass();
            synchronized (nggVar.a) {
                if (nggVar.b == null) {
                    nggVar.b = oorVarC;
                    nggVar.c = null;
                    return;
                }
                boolean zEquals = nggVar.b.equals(oorVarC);
                if (zEquals) {
                    return;
                }
                this.b.b();
                this.b.b().a();
            }
        } catch (CancellationException | ExecutionException e) {
            String str = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Unable to update local snapshot for ");
            sb.append(str);
            sb.append(", may result in stale flags.");
            Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
        }
    }
}
