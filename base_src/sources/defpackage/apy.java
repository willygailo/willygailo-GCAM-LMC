package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class apy implements Runnable {
    final /* synthetic */ WorkDatabase a;
    final /* synthetic */ String b;
    final /* synthetic */ aqa c;

    public apy(aqa aqaVar, WorkDatabase workDatabase, String str) {
        this.c = aqaVar;
        this.a = workDatabase;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqt aqtVarA = this.a.s().a(this.b);
        if (aqtVarA == null || !aqtVarA.b()) {
            return;
        }
        synchronized (this.c.c) {
            this.c.f.put(this.b, aqtVarA);
            this.c.g.add(aqtVarA);
            aqa aqaVar = this.c;
            aqaVar.h.a(aqaVar.g);
        }
    }
}
