package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gli implements oiu {
    final /* synthetic */ List a;
    final /* synthetic */ glj b;

    public gli(glj gljVar, List list) {
        this.b = gljVar;
        this.a = list;
    }

    @Override // defpackage.oiu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Integer num = (Integer) obj;
        num.getClass();
        obr.aX(num.intValue(), this.a.size());
        this.b.a.b(((Long) this.a.get(num.intValue())).longValue());
        return num;
    }
}
