package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bez implements bew {
    public final Map b;
    public volatile Map c;

    public bez(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bez) {
            return this.b.equals(((bez) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 21);
        sb.append("LazyHeaders{headers=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}
