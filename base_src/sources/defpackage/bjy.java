package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class bjy implements bjl {
    final /* synthetic */ bkc a;

    public bjy(bkc bkcVar) {
        this.a = bkcVar;
    }

    @Override // defpackage.bjl
    public final void a(boolean z) {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.a.a);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjl) arrayList.get(i)).a(z);
        }
    }
}
