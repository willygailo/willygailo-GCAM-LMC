package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cdj {
    private ojc a = oih.a;

    public final ojc a() {
        return !this.a.g() ? oih.a : ojc.h((List) ((Map) this.a.c()).get(1L));
    }

    public final ojc b() {
        return !this.a.g() ? oih.a : ojc.h((List) ((Map) this.a.c()).get(0L));
    }

    public final void c(Map map) {
        this.a = ojc.h(map);
    }
}
