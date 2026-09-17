package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pnm implements pqm {
    public int aD = 0;

    static final prm h() {
        return new prm();
    }

    public int c() {
        throw null;
    }

    @Override // defpackage.pqm
    public final poc d() {
        try {
            int iK = k();
            poc pocVar = poc.b;
            byte[] bArr = new byte[iK];
            pom pomVarAi = pom.ai(bArr);
            fD(pomVarAi);
            return plk.l(pomVarAi, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public void e(int i) {
        throw null;
    }

    @Override // defpackage.pqm
    public final void f(OutputStream outputStream) {
        pom pomVarAj = pom.aj(outputStream, pom.U(k()));
        fD(pomVarAj);
        pomVarAj.i();
    }

    @Override // defpackage.pqm
    public final byte[] g() {
        try {
            byte[] bArr = new byte[k()];
            pom pomVarAi = pom.ai(bArr);
            fD(pomVarAi);
            pomVarAi.ak();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
