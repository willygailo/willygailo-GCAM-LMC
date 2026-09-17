package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class dqw {
    private final String a;
    private final dqw[] b;

    public dqw(String str, dqw[] dqwVarArr) {
        this.a = str;
        this.b = dqwVarArr;
    }

    public static dqw b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", str)) {
            return enl.J(str, arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Feature with bad type name '");
        sb.append(str);
        sb.append("'!");
        throw new IllegalArgumentException(sb.toString());
    }

    public final int a() {
        int iA = -1;
        for (dqw dqwVar : this.b) {
            if (dqwVar.a() > iA) {
                iA = dqwVar.a();
            }
        }
        return iA + 1;
    }

    public final Set c() {
        HashSet hashSet = new HashSet();
        for (dqw dqwVar : this.b) {
            hashSet.add(dqwVar);
            hashSet.addAll(dqwVar.c());
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dqw) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return this.a;
    }
}
