package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nfy implements pgk {
    public final /* synthetic */ nfn a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nei c;
    private final /* synthetic */ int d;

    public /* synthetic */ nfy(nei neiVar, nfn nfnVar, String str, int i) {
        this.d = i;
        this.c = neiVar;
        this.a = nfnVar;
        this.b = str;
    }

    public /* synthetic */ nfy(nfn nfnVar, String str, nei neiVar, int i) {
        this.d = i;
        this.a = nfnVar;
        this.b = str;
        this.c = neiVar;
    }

    @Override // defpackage.pgk
    public final pht a(Object obj) {
        String string;
        switch (this.d) {
            case 0:
                final nfn nfnVar = this.a;
                String str = this.b;
                final nei neiVar = this.c;
                List<String> listM = (List) obj;
                if (!nfnVar.d) {
                    listM = oom.m("");
                }
                ooh oohVarE = oom.e();
                for (final String str2 : listM) {
                    if (!nge.c.containsKey(ojd.a(str, str2))) {
                        if (nfnVar.c) {
                            Context context = neiVar.g;
                            string = nfw.a(context).getString(nfnVar.a, "");
                        } else {
                            string = str2;
                        }
                        final pht phtVarD = ngt.d(neiVar, nfnVar.a, string);
                        oohVarE.g(pgb.i(pgb.i(pho.q(phtVarD), new nfy(neiVar, nfnVar, str2, 1), neiVar.c()), new pgk() { // from class: nfx
                            @Override // defpackage.pgk
                            public final pht a(Object obj2) {
                                final nei neiVar2 = neiVar;
                                pht phtVar = phtVarD;
                                final nfn nfnVar2 = nfnVar;
                                final String str3 = str2;
                                final ngu nguVar = (ngu) plk.ad(phtVar);
                                if (nguVar.b.isEmpty()) {
                                    return phq.a;
                                }
                                return pgb.i(pho.q(pgb.h(pho.q(nfq.a(neiVar2).a()), new nfp(nfnVar2.a, 2), neiVar2.c())), new pgk() { // from class: nfz
                                    @Override // defpackage.pgk
                                    public final pht a(Object obj3) {
                                        String str4 = str3;
                                        nfn nfnVar3 = nfnVar2;
                                        nei neiVar3 = neiVar2;
                                        ngu nguVar2 = nguVar;
                                        if (((String) obj3).equals(str4) && !nge.c.containsKey(ojd.a(nfnVar3.a, str4))) {
                                            return neiVar3.d().a(nguVar2.b);
                                        }
                                        return phq.a;
                                    }
                                }, neiVar2.c());
                            }
                        }, neiVar.c()));
                    }
                }
                return plk.O(oohVarE.f()).a(ngd.c, neiVar.c());
            default:
                nei neiVar2 = this.c;
                nfn nfnVar2 = this.a;
                return ngt.e(neiVar2, nfnVar2.a, this.b, (ngu) obj, nfnVar2.b, nfnVar2.e);
        }
    }
}
