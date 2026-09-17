package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nnh extends ohh {
    private final Set c;
    private final List d;
    private final boolean a = false;
    private final Long b = null;
    private final int e = 1;

    public nnh(Set set, List list) {
        this.c = set;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnh)) {
            return false;
        }
        nnh nnhVar = (nnh) obj;
        boolean z = nnhVar.a;
        Long l = nnhVar.b;
        if (!qno.c(null, null) || !qno.c(this.c, nnhVar.c) || !qno.c(this.d, nnhVar.d)) {
            return false;
        }
        int i = nnhVar.e;
        return true;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + 1) * 31) + 1;
    }

    public final String toString() {
        return "QueryResources(isSnapshot=false, onDeviceId=" + ((Object) null) + ", filters=" + this.c + ", sortOrders=" + this.d + ", queryType=" + ((Object) "RESOURCE") + ')';
    }
}
