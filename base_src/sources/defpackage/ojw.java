package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ojw {
    private int b = -1;
    private final Map a = new HashMap();

    public final void a(char c, String str) {
        this.a.put(Character.valueOf(c), str);
        if (c > this.b) {
            this.b = c;
        }
    }

    public final void b() {
        char[][] cArr = new char[this.b + 1][];
        for (Map.Entry entry : this.a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
    }
}
