package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nms extends ohh {
    public final Set a;

    public nms(Set set) {
        set.getClass();
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nms) && qno.c(this.a, ((nms) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AirlockFileStateFilter(values=" + this.a + ')';
    }
}
