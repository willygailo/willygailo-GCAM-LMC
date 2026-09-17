package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hio implements phh {
    final /* synthetic */ hsa a;
    final /* synthetic */ hip b;

    public hio(hip hipVar, hsa hsaVar) {
        this.b = hipVar;
        this.a = hsaVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) hip.e.b()).h(th)).G((char) 2486)).o("Lucky Shot Filter failed to return valid result.");
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Set set = (Set) obj;
        if (set != null) {
            this.b.c(set, this.a);
        }
    }
}
