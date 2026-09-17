package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mkz {
    public final ojc a;

    static {
        ovk.h("Mp4BoxFileSlicer");
    }

    public mkz(ojc ojcVar) {
        this.a = ojcVar;
    }

    public static mkz a() {
        return new mkz(oih.a);
    }

    public static mkz c(FileInputStream fileInputStream) throws IOException {
        long size = fileInputStream.getChannel().size();
        return size < 0 ? a() : new mkz(ojc.i(new mlb(fileInputStream, 0L, size)));
    }

    public static mkz d(mlb mlbVar) {
        return new mkz(ojc.i(mlbVar));
    }

    public final mkz b() throws IOException, mky {
        ojc ojcVarI;
        if (!this.a.g()) {
            return a();
        }
        mlb mlbVar = (mlb) this.a.c();
        mla mlaVarAk = mip.ak(mlbVar);
        if (mlaVarAk.a != mlbVar.a()) {
            throw new mky(String.format(Locale.US, "contents failed - argument has length %s but claims length of %s", Long.valueOf(mlbVar.a()), Long.valueOf(mlaVarAk.a)));
        }
        int i = true != mlaVarAk.b ? 8 : 16;
        mlb mlbVarB = mlbVar.b();
        long j = mlbVar.d + ((long) i);
        if (j <= mlbVarB.e) {
            mlbVarB.e(j);
            ojcVarI = ojc.i(mlbVarB.c());
        } else {
            ojcVarI = oih.a;
        }
        return new mkz(ojcVarI);
    }

    public final mkz e(String str) {
        return b().f(str);
    }

    public final mkz f(String str) throws mky {
        if (!this.a.g()) {
            return a();
        }
        mlb mlbVarB = ((mlb) this.a.c()).b();
        byte[] bArrA = mlc.a(str);
        mlb mlbVar = null;
        while (true) {
            mlb mlbVarAl = mip.al(mlbVarB);
            if (mlbVarAl == null) {
                return mlbVar == null ? a() : new mkz(ojc.i(mlbVar));
            }
            if (Arrays.equals(mip.am(mlbVarAl), bArrA)) {
                if (mlbVar != null) {
                    return a();
                }
                mlbVar = mlbVarAl;
            }
        }
    }

    public final mlb g() {
        return (mlb) this.a.c();
    }
}
