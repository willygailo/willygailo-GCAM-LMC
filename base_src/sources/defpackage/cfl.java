package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cfl implements lgb {
    final Map a = new EnumMap(lga.class);
    public final Object b = new Object();

    @Override // defpackage.lgb
    public final void fE(lga lgaVar) {
        synchronized (this.b) {
            Integer num = (Integer) this.a.get(lgaVar);
            if (num == null) {
                num = 0;
            }
            this.a.put(lgaVar, Integer.valueOf(num.intValue() + 1));
        }
    }
}
