package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mtw {
    private final Iterable a;

    public mtw(Iterable iterable) {
        this.a = iterable;
    }

    public final mne a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((mls) it.next()).a());
        }
        return mne.i(mip.Z(arrayList).a(pgr.INSTANCE, mip.ai()));
    }
}
