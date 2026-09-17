package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class oul extends ovd {
    public oul(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.ovd
    public final void a(Iterator it, ovc ovcVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                ovcVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            ovcVar.a(str, sb.toString());
        }
    }
}
