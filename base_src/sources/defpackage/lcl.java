package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class lcl implements lij {
    final /* synthetic */ lcm a;
    private final int b;

    public lcl(lcm lcmVar, int i) {
        this.a = lcmVar;
        this.b = i;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        this.a.a.set(this.b, obj);
        lcm lcmVar = this.a;
        if (!lcmVar.b) {
            Iterator it = lcmVar.a.iterator();
            do {
                if (!it.hasNext()) {
                    this.a.b = true;
                    break;
                }
            } while (it.next() != null);
        }
        lcm lcmVar2 = this.a;
        if (lcmVar2.b) {
            final oom oomVarJ = oom.j(lcmVar2.a);
            this.a.d.execute(new Runnable() { // from class: lck
                @Override // java.lang.Runnable
                public final void run() {
                    lcl lclVar = this.a;
                    lclVar.a.c.fB(oomVarJ);
                }
            });
        }
    }
}
