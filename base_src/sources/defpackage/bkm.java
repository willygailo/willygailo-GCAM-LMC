package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bkm {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    private final synchronized List e(String str) {
        List arrayList;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        arrayList = (List) this.b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.b.put(str, arrayList);
        }
        return arrayList;
    }

    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<bkl> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (bkl bklVar : list) {
                    if (bklVar.a(cls, cls2)) {
                        arrayList.add(bklVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<bkl> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (bkl bklVar : list) {
                    if (bklVar.a(cls, cls2) && !arrayList.contains(bklVar.a)) {
                        arrayList.add(bklVar.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, azv azvVar, Class cls, Class cls2) {
        e(str).add(new bkl(cls, cls2, azvVar));
    }

    public final synchronized void d(List list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }
}
