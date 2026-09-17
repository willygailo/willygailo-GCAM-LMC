package defpackage;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class eld implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public eld(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ehc get() {
        Context context = ((emd) this.a).get();
        iki ikiVar = (iki) this.b.get();
        ikj ikjVar = (ikj) this.c.get();
        return new ehc(context, ikiVar, ikjVar.a(ikiVar), (Set) this.d.get(), null);
    }
}
