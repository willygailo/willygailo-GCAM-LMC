package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class lqs implements phh {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;
    final /* synthetic */ lqt c;

    public lqs(lqt lqtVar, Set set, Set set2) {
        this.c = lqtVar;
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        lis lisVar = this.c.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 41);
        sb.append("Failed to allocate pending ");
        sb.append(strValueOf);
        sb.append(" this may leak");
        lisVar.d(sb.toString());
        synchronized (this.c) {
            this.c.g = false;
            this.c.e();
        }
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Set set = (Set) obj;
        synchronized (this.c) {
            this.c.g = false;
            this.c.b(this.a, set);
        }
    }
}
