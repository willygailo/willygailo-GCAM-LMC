package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kex {
    public final Map a;
    public final long b;
    public final long c;
    public final boolean d;
    private final int e;

    public kex(kdt kdtVar, Map map, long j, boolean z, long j2, int i) {
        String strA;
        String strA2;
        mip.dk(map);
        this.c = j;
        this.d = z;
        this.b = j2;
        this.e = i;
        Collections.emptyList();
        TextUtils.isEmpty(null);
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (c(entry.getKey()) && (strA2 = a(kdtVar, entry.getKey())) != null) {
                map2.put(strA2, b(kdtVar, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!c(entry2.getKey()) && (strA = a(kdtVar, entry2.getKey())) != null) {
                map2.put(strA, b(kdtVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.a = Collections.unmodifiableMap(map2);
    }

    private static String a(kdt kdtVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.startsWith("&")) {
            string = string.substring(1);
        }
        int length = string.length();
        if (length > 256) {
            string = string.substring(0, 256);
            kdtVar.v("Hit param name is too long and will be trimmed", Integer.valueOf(length), string);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    private static String b(kdt kdtVar, Object obj) {
        String string = obj == null ? "" : obj.toString();
        int length = string.length();
        if (length <= 8192) {
            return string;
        }
        String strSubstring = string.substring(0, 8192);
        kdtVar.v("Hit param value is too long and will be trimmed", Integer.valueOf(length), strSubstring);
        return strSubstring;
    }

    private static boolean c(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.c);
        if (this.b != 0) {
            sb.append(", dbId=");
            sb.append(this.b);
        }
        if (this.e != 0) {
            sb.append(", appUID=");
            sb.append(this.e);
        }
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) this.a.get(str));
        }
        return sb.toString();
    }
}
