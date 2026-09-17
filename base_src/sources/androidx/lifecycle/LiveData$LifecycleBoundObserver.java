package androidx.lifecycle;

import defpackage.adz;
import defpackage.aea;
import defpackage.aec;
import defpackage.aee;
import defpackage.ael;
import defpackage.aem;
import defpackage.aeo;

/* JADX INFO: loaded from: classes.dex */
public class LiveData$LifecycleBoundObserver extends ael implements aec {
    final aee a;
    final /* synthetic */ aem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(aem aemVar, aee aeeVar, aeo aeoVar) {
        super(aemVar, aeoVar);
        this.b = aemVar;
        this.a = aeeVar;
    }

    @Override // defpackage.aec
    public final void a(aee aeeVar, adz adzVar) {
        aea aeaVar = this.a.C().a;
        if (aeaVar == aea.DESTROYED) {
            this.b.f(this.c);
            return;
        }
        aea aeaVar2 = null;
        while (aeaVar2 != aeaVar) {
            d(g());
            aeaVar2 = aeaVar;
            aeaVar = this.a.C().a;
        }
    }

    @Override // defpackage.ael
    public final void b() {
        this.a.C().d(this);
    }

    @Override // defpackage.ael
    public final boolean c(aee aeeVar) {
        return this.a == aeeVar;
    }

    @Override // defpackage.ael
    public final boolean g() {
        return this.a.C().a.a(aea.STARTED);
    }
}
