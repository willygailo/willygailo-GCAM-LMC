package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class oum extends ovd {
    public oum(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.ovd
    public final /* bridge */ /* synthetic */ void b(Object obj, ovc ovcVar) {
        for (Map.Entry entry : ((oxp) obj).c.d) {
            if (((Set) entry.getValue()).isEmpty()) {
                ovcVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    ovcVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
