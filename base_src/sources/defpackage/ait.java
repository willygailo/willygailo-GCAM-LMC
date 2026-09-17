package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ait implements qcl {
    final /* synthetic */ aid a;
    final /* synthetic */ aiu b;

    public ait(aiu aiuVar, aid aidVar) {
        this.b = aiuVar;
        this.a = aidVar;
    }

    @Override // defpackage.qcl
    public final void a() {
        aie aieVar;
        boolean z;
        aif aifVar = this.b.b.d;
        aid aidVar = this.a;
        synchronized (aifVar.h) {
            aieVar = (aie) aifVar.h.b(aidVar);
        }
        if (aieVar != null) {
            aic aicVar = aifVar.g;
            int[] iArr = aieVar.a;
            synchronized (aicVar) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = aicVar.a;
                    long j = jArr[i];
                    jArr[i] = (-1) + j;
                    if (j == 1) {
                        aicVar.d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                aifVar.a();
            }
        }
    }
}
