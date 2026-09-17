package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dwk implements dwh {
    public final dtg a;
    public final dwg[] b;
    public final Object c;

    public dwk() {
        int iConvert = (int) (TimeUnit.SECONDS.convert(30000L, TimeUnit.MILLISECONDS) * 30);
        this.c = new Object();
        this.a = new dtg(iConvert);
        this.b = new dwg[iConvert];
    }

    @Override // defpackage.dwh
    public final dwg a(long j) {
        synchronized (this.c) {
            if (this.a.e() <= 0) {
                return null;
            }
            dtg dtgVar = this.a;
            int iF = dtgVar.f(dtgVar.c(j));
            dtg dtgVar2 = this.a;
            int iF2 = dtgVar2.f(dtgVar2.d(j));
            dwg dwgVar = iF >= 0 ? this.b[iF] : null;
            dwg dwgVar2 = iF2 >= 0 ? this.b[iF2] : null;
            if (dwgVar == null) {
                return dwgVar2;
            }
            if (dwgVar2 == null) {
                return dwgVar;
            }
            if (j - dwgVar.a >= dwgVar2.a - j) {
                dwgVar = dwgVar2;
            }
            return dwgVar;
        }
    }
}
