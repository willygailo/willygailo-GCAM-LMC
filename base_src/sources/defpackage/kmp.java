package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kmp extends kmb implements kie {
    private static volatile Executor a;
    public final Set s;
    private final Account t;

    /* JADX WARN: Illegal instructions before constructor call */
    protected kmp(Context context, Looper looper, int i, kmf kmfVar, kjq kjqVar, kkw kkwVar) {
        synchronized (kmr.a) {
            if (kmr.h == null) {
                kmr.h = new kmr(context.getApplicationContext(), context.getMainLooper());
            }
        }
        kmr kmrVar = kmr.h;
        khm khmVar = khm.a;
        mip.dk(kjqVar);
        mip.dk(kkwVar);
        super(context, looper, kmrVar, khmVar, i, new kmn(kjqVar), new kmo(kkwVar), kmfVar.f);
        this.t = kmfVar.a;
        Set set = kmfVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.s = set;
    }

    @Override // defpackage.kmb
    public final khk[] D() {
        return new khk[0];
    }

    @Override // defpackage.kmb
    protected final void F() {
    }

    @Override // defpackage.kmb, defpackage.kie
    public int a() {
        throw null;
    }

    @Override // defpackage.kie
    public final Set g() {
        return n() ? this.s : Collections.emptySet();
    }

    @Override // defpackage.kmb
    public final Account s() {
        return this.t;
    }
}
