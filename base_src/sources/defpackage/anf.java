package defpackage;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class anf {
    public final aqt a;
    public final Set b;
    private final UUID c;

    public anf(ane aneVar) {
        UUID uuid = aneVar.a;
        aqt aqtVar = aneVar.b;
        Set set = aneVar.c;
        this.c = uuid;
        this.a = aqtVar;
        this.b = set;
    }

    public final String a() {
        return this.c.toString();
    }
}
