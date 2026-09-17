package defpackage;

import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuViewContainer;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cus implements cuu {
    public final ddf a;
    public PopupMenuView b;
    public PopupMenuViewContainer c;
    public final List d = new ArrayList();
    public final iud e;
    public final lap f;
    public final jhs g;

    public cus(bqg bqgVar, ddf ddfVar, jhs jhsVar, iud iudVar) {
        this.f = bqgVar.i();
        this.a = ddfVar;
        this.g = jhsVar;
        this.e = iudVar;
    }

    @Override // defpackage.cuu
    public final lie a(final cuw cuwVar) {
        this.d.add(cuwVar);
        return new lie() { // from class: cuq
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                cus cusVar = this.a;
                cusVar.d.remove(cuwVar);
            }
        };
    }

    @Override // defpackage.cuu
    public final void b() {
        this.b.b();
        Collection.EL.stream(this.d).forEach(cez.e);
    }

    @Override // defpackage.cuu
    public final boolean c() {
        return this.b.getVisibility() == 0;
    }
}
