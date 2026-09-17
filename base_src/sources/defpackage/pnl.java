package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pnl implements pql {
    public static void e(Iterable iterable, List list) {
        ppn.h(iterable);
        if (iterable instanceof ppx) {
            List listH = ((ppx) iterable).h();
            ppx ppxVar = (ppx) list;
            int size = list.size();
            for (Object obj : listH) {
                if (obj == null) {
                    int size2 = ppxVar.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = ppxVar.size() - 1; size3 >= size; size3--) {
                        ppxVar.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof poc) {
                    ppxVar.i((poc) obj);
                } else {
                    ppxVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof pqt) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5 - size4);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(string2);
            }
            list.add(obj2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public abstract pnl clone();

    protected abstract pnl b(pnm pnmVar);

    @Override // defpackage.pql
    public final /* bridge */ /* synthetic */ pql c(pqm pqmVar) {
        if (l().getClass().isInstance(pqmVar)) {
            return b((pnm) pqmVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.pql
    public final /* bridge */ /* synthetic */ pql d(byte[] bArr) {
        return f(bArr, bArr.length);
    }

    public pnl f(byte[] bArr, int i) {
        throw null;
    }
}
