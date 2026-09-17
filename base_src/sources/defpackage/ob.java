package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class ob implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ py b;
    private final /* synthetic */ int c;

    public ob(py pyVar, ArrayList arrayList, int i) {
        this.c = i;
        this.b = pyVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        float f = 0.0f;
        switch (this.c) {
            case 0:
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                while (i < size) {
                    oh ohVar = (oh) arrayList.get(i);
                    py pyVar = this.b;
                    qs qsVar = ohVar.a;
                    View view = qsVar == null ? null : qsVar.a;
                    qs qsVar2 = ohVar.b;
                    View view2 = qsVar2 != null ? qsVar2.a : null;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(60L);
                        pyVar.l.add(ohVar.a);
                        duration.translationX(ohVar.e - ohVar.c);
                        duration.translationY(ohVar.f - ohVar.d);
                        duration.alpha(0.0f).setListener(new of(pyVar, ohVar, duration, view)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                        pyVar.l.add(ohVar.b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(60L).alpha(1.0f).setListener(new og(pyVar, ohVar, viewPropertyAnimatorAnimate, view2)).start();
                    }
                    i++;
                }
                this.a.clear();
                this.b.h.remove(this.a);
                break;
            case 1:
                ArrayList arrayList2 = this.a;
                int size2 = arrayList2.size();
                while (i < size2) {
                    oi oiVar = (oi) arrayList2.get(i);
                    py pyVar2 = this.b;
                    qs qsVar3 = oiVar.a;
                    int i2 = oiVar.b;
                    int i3 = oiVar.c;
                    int i4 = oiVar.d;
                    int i5 = oiVar.e;
                    View view3 = qsVar3.a;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view3.animate().translationX(f);
                    }
                    if (i7 != 0) {
                        view3.animate().translationY(f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                    pyVar2.j.add(qsVar3);
                    viewPropertyAnimatorAnimate2.setDuration(60L).setListener(new oe(pyVar2, qsVar3, i6, view3, i7, viewPropertyAnimatorAnimate2)).start();
                    i++;
                    f = 0.0f;
                }
                this.a.clear();
                this.b.g.remove(this.a);
                break;
            default:
                ArrayList arrayList3 = this.a;
                int size3 = arrayList3.size();
                while (i < size3) {
                    qs qsVar4 = (qs) arrayList3.get(i);
                    py pyVar3 = this.b;
                    View view4 = qsVar4.a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    pyVar3.i.add(qsVar4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(60L).setListener(new od(pyVar3, qsVar4, view4, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                this.a.clear();
                this.b.f.remove(this.a);
                break;
        }
    }
}
