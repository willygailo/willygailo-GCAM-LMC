package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class nkv extends njo {
    private final pqm a;

    public nkv(pqm pqmVar) {
        this.a = pqmVar;
    }

    @Override // defpackage.njo
    public final pht a(final IOException iOException, nkf nkfVar) {
        if (!(iOException.getCause() instanceof ppp)) {
            return plk.U(iOException);
        }
        pht phtVarV = plk.V(this.a);
        nkg nkgVar = nkfVar.a;
        return pfj.i(pgb.i(phtVarV, ogl.b(new nkb(nkgVar, 0)), nkgVar.c), IOException.class, new pgk() { // from class: nku
            @Override // defpackage.pgk
            public final pht a(Object obj) throws IOException {
                throw iOException;
            }
        }, pgr.INSTANCE);
    }
}
