package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class lcm {
    public final List a = new ArrayList();
    public boolean b;
    public final lij c;
    public final Executor d;

    public lcm(lcn lcnVar, lij lijVar, Executor executor) {
        this.c = lijVar;
        this.d = executor;
        for (int i = 0; i < lcnVar.a.size(); i++) {
            this.a.add(null);
        }
        this.b = false;
    }
}
