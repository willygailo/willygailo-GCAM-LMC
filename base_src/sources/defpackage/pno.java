package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pno implements pqs {
    static {
        pos.a();
    }

    private static final void e(pqm pqmVar) throws ppp {
        if (pqmVar != null && !pqmVar.n()) {
            throw pnm.h().a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, pqm] */
    @Override // defpackage.pqs
    public final /* bridge */ /* synthetic */ Object a(InputStream inputStream, pos posVar) throws ppp {
        poh pohVarH = poh.H(inputStream);
        ?? D = d(pohVarH, posVar);
        try {
            pohVarH.z(0);
            e(D);
            return D;
        } catch (ppp e) {
            throw e;
        }
    }

    @Override // defpackage.pqs
    public final /* bridge */ /* synthetic */ Object b(byte[] bArr, int i, pos posVar) throws ppp {
        pqm pqmVarC = c(bArr, i, posVar);
        e(pqmVarC);
        return pqmVarC;
    }

    public pqm c(byte[] bArr, int i, pos posVar) {
        throw null;
    }
}
