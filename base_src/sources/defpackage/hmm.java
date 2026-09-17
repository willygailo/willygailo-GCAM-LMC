package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class hmm implements lmt {
    final /* synthetic */ gcf a;
    private final /* synthetic */ int b;

    public hmm(gcf gcfVar, int i) {
        this.b = i;
        this.a = gcfVar;
    }

    @Override // defpackage.lmt
    public final lrr a(Collection collection) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = new ArrayList(collection);
                return (lrr) arrayList.get(this.a.a(arrayList));
            default:
                ArrayList arrayList2 = new ArrayList(collection);
                return (lrr) arrayList2.get(this.a.a(arrayList2));
        }
    }
}
