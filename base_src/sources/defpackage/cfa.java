package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class cfa extends jlj {
    final /* synthetic */ cfe a;

    public cfa(cfe cfeVar) {
        this.a = cfeVar;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonClick() {
        if (!this.a.i.a()) {
            ddf ddfVar = this.a.m;
            ddi ddiVar = ddl.a;
            ddfVar.d();
        } else {
            Iterator it = this.a.f.iterator();
            while (it.hasNext()) {
                ((chy) it.next()).j(false);
            }
            if (this.a.m.k(ddl.aw)) {
                this.a.h.A(false);
            }
        }
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonDown() {
        if (this.a.i.a()) {
            return;
        }
        Iterator it = this.a.f.iterator();
        while (it.hasNext()) {
            ((chy) it.next()).j(false);
        }
    }
}
