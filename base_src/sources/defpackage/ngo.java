package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ngo implements pgk {
    public final /* synthetic */ nfm a;
    private final /* synthetic */ int b;

    public /* synthetic */ ngo(nfm nfmVar, int i) {
        this.b = i;
        this.a = nfmVar;
    }

    @Override // defpackage.pgk
    public final pht a(Object obj) {
        switch (this.b) {
            case 0:
                nfm nfmVar = this.a;
                return ngt.e(nfmVar.b, nfmVar.c, nfmVar.d, (ngu) obj, nfmVar.g, nfmVar.h);
            default:
                nfm nfmVar2 = this.a;
                Cnew cnew = (Cnew) obj;
                if (cnew.a == 29501) {
                    String str = nfmVar2.c;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
                    sb.append("Failed to commit due to stale snapshot for ");
                    sb.append(str);
                    sb.append(", triggering flag update.");
                    Log.w("ProtoDataStoreFlagStore", sb.toString(), cnew);
                    nfmVar2.c();
                }
                return plk.U(cnew);
        }
    }
}
