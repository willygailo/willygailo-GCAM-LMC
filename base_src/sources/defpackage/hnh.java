package defpackage;

import com.google.android.apps.camera.ui.views.MainActivityLayout;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
class hnh extends hnd {
    final /* synthetic */ hni b;

    public hnh(hni hniVar) {
        this.b = hniVar;
    }

    @Override // defpackage.hnd
    public void b() {
    }

    @Override // defpackage.hnd, defpackage.ihs, defpackage.iht
    public final void f() {
        ovd ovdVar = ovl.a;
        obr.ar(this.b.g.getChildCount() > 0, "Cannot enter Rewind without inflated Preview content.", new Object[0]);
        obr.ar(this.b.h.getChildCount() > 0, "Cannot enter Rewind without inflated ControllerView content.", new Object[0]);
        this.b.f.animate().alpha(0.0f).withEndAction(new hng(this.b.f, 0)).start();
        final hmy hmyVar = this.b.e;
        if (hmyVar.h == null || hmyVar.i == null) {
            ((oug) ((oug) hmy.b.b().g(ovl.a, "McFlyControllerImpl")).G((char) 2562)).o("Rewind has not been initialized.");
        } else {
            hmyVar.u(mip.ew(new Consumer() { // from class: hms
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    hmy hmyVar2 = hmyVar;
                    hmyVar2.h.setVisibility(0);
                    hmyVar2.i.setVisibility(0);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            })).start();
        }
    }

    @Override // defpackage.hnd, defpackage.ihs, defpackage.iht
    public final void g() {
        hmy hmyVar = this.b.e;
        if (hmyVar.h == null || hmyVar.i == null) {
            ((oug) ((oug) hmy.b.b().g(ovl.a, "McFlyControllerImpl")).G((char) 2561)).o("Rewind has not been initialized.");
            return;
        }
        mip mipVar = hmyVar.o;
        if (mipVar != null) {
            MainActivityLayout mainActivityLayout = hmyVar.l.c;
            lar.a();
            mainActivityLayout.e.remove(mipVar);
            hmyVar.o = null;
        }
        hmyVar.u(new hmu(hmyVar)).reverse();
    }
}
