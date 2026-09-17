package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class olc extends okz implements Set {
    final /* synthetic */ old f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc(old oldVar, Object obj, Set set) {
        super(oldVar, obj, set, null);
        this.f = oldVar;
    }

    @Override // defpackage.okz, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zE = obr.E((Set) this.b, collection);
        if (zE) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return zE;
    }
}
