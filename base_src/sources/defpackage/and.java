package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class and {
    protected and() {
    }

    public abstract pht a(String str);

    public abstract ana b(String str, int i, List list);

    public final ana c(String str, int i, anf anfVar) {
        return b(str, i, Collections.singletonList(anfVar));
    }

    public abstract ana d();
}
