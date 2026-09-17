package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class meh {
    public final qkg a;
    public final qkg b;
    public final qkg c;

    public meh(Context context) {
        pys pysVarA = pyt.a(context);
        this.a = pysVarA;
        mef mefVar = new mef(pysVarA);
        this.b = mefVar;
        this.c = pyr.b(new lwy((qkg) pysVarA, (qkg) mefVar, 2, (char[]) null));
    }

    public meh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        qkgVar.getClass();
        this.b = qkgVar;
        qkgVar2.getClass();
        this.c = qkgVar2;
        qkgVar3.getClass();
        this.a = qkgVar3;
    }

    public meh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, byte[] bArr) {
        qkgVar.getClass();
        this.c = qkgVar;
        qkgVar2.getClass();
        this.b = qkgVar2;
        qkgVar3.getClass();
        this.a = qkgVar3;
    }

    public meh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, byte[] bArr, byte[] bArr2) {
        qkgVar.getClass();
        this.c = qkgVar;
        qkgVar2.getClass();
        this.a = qkgVar2;
        qkgVar3.getClass();
        this.b = qkgVar3;
    }

    public meh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, char[] cArr) {
        qkgVar.getClass();
        this.c = qkgVar;
        qkgVar2.getClass();
        this.a = qkgVar2;
        qkgVar3.getClass();
        this.b = qkgVar3;
    }

    public final gyu a(long j, int i, ojz ojzVar) {
        mbg mbgVar = ((gzb) this.c).get();
        gzf gzfVarA = ((gzg) this.a).get();
        lap lapVar = (lap) this.b.get();
        lapVar.getClass();
        ojzVar.getClass();
        return new gyu(mbgVar, gzfVarA, lapVar, j, i, ojzVar, null, null);
    }
}
