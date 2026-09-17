package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class pvf {
    private final Map a = new HashMap();

    public final String a(String str) {
        if (!this.a.containsKey(str.toLowerCase(Locale.US))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : (List) this.a.get(str.toLowerCase(Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public final List b(String str) {
        List list = (List) this.a.get(str.toLowerCase(Locale.US));
        return list == null ? oom.l() : list;
    }

    public final Set c() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final void d(String str, String str2) {
        obr.aF(!str.isEmpty());
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        if (!this.a.containsKey(lowerCase)) {
            this.a.put(lowerCase, new ArrayList());
        }
        ((List) this.a.get(lowerCase)).add(str2);
    }

    public final void e(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        obr.aF(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        this.a.put(lowerCase, new ArrayList());
        ((List) this.a.get(lowerCase)).add(str2);
    }

    public final boolean f(String str) {
        return this.a.containsKey(str.toLowerCase(Locale.US));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.a.entrySet());
        Collections.sort(arrayList, mvm.d);
        StringBuilder sb = new StringBuilder("{");
        oxk oxkVarE = oxk.e(", ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(oxk.d(entry.getKey()));
                sb.append((CharSequence) "=");
                sb.append(oxk.d(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) oxkVarE.a);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(oxk.d(entry2.getKey()));
                    sb.append((CharSequence) "=");
                    sb.append(oxk.d(entry2.getValue()));
                }
            }
            sb.append('}');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
