package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class py {
    private static TimeInterpolator n;
    public pz a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    private final ArrayList m;

    public py() {
        this.a = null;
        this.m = new ArrayList();
    }

    public py(byte[] bArr) {
        this();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public static final px c() {
        return new px();
    }

    public static void d(qs qsVar) {
        int i = qsVar.j;
        if (!qsVar.s() && (i & 4) == 0) {
            int i2 = qsVar.d;
            qsVar.a();
        }
    }

    public static final px e(qs qsVar) {
        px pxVarC = c();
        pxVarC.a(qsVar);
        return pxVarC;
    }

    public static void m(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((qs) list.get(size)).a.animate().cancel();
        }
    }

    private final void n(List list, qs qsVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            oh ohVar = (oh) list.get(size);
            if (p(ohVar, qsVar) && ohVar.a == null && ohVar.b == null) {
                list.remove(ohVar);
            }
        }
    }

    private final void o(oh ohVar) {
        qs qsVar = ohVar.a;
        if (qsVar != null) {
            p(ohVar, qsVar);
        }
        qs qsVar2 = ohVar.b;
        if (qsVar2 != null) {
            p(ohVar, qsVar2);
        }
    }

    private final boolean p(oh ohVar, qs qsVar) {
        if (ohVar.b == qsVar) {
            ohVar.b = null;
        } else {
            if (ohVar.a != qsVar) {
                return false;
            }
            ohVar.a = null;
        }
        qsVar.a.setAlpha(1.0f);
        qsVar.a.setTranslationX(0.0f);
        qsVar.a.setTranslationY(0.0f);
        a(qsVar);
        return true;
    }

    public final void a(qs qsVar) {
        pz pzVar = this.a;
        if (pzVar != null) {
            boolean z = true;
            qsVar.m(true);
            if (qsVar.h != null && qsVar.i == null) {
                qsVar.h = null;
            }
            qsVar.i = null;
            if ((qsVar.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = pzVar.a;
            View view = qsVar.a;
            recyclerView.Z();
            ny nyVar = recyclerView.f;
            int iG = nyVar.c.g(view);
            if (iG == -1) {
                nyVar.l(view);
            } else if (nyVar.a.f(iG)) {
                nyVar.a.g(iG);
                nyVar.l(view);
                nyVar.c.j(iG);
            } else {
                z = false;
            }
            if (z) {
                qs qsVarH = RecyclerView.h(view);
                recyclerView.c.l(qsVarH);
                recyclerView.c.j(qsVarH);
            }
            recyclerView.aa(!z);
            if (z || !qsVar.w()) {
                return;
            }
            pzVar.a.removeDetachedView(qsVar.a, false);
        }
    }

    public final void b() {
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            ((pw) this.m.get(i)).a();
        }
        this.m.clear();
    }

    public final boolean f(qs qsVar, qs qsVar2, px pxVar, px pxVar2) {
        int i;
        int i2;
        int i3 = pxVar.a;
        int i4 = pxVar.b;
        if (qsVar2.z()) {
            int i5 = pxVar.a;
            i2 = pxVar.b;
            i = i5;
        } else {
            i = pxVar2.a;
            i2 = pxVar2.b;
        }
        if (qsVar == qsVar2) {
            return k(qsVar, i3, i4, i, i2);
        }
        float translationX = qsVar.a.getTranslationX();
        float translationY = qsVar.a.getTranslationY();
        float alpha = qsVar.a.getAlpha();
        j(qsVar);
        int i6 = (int) ((i - i3) - translationX);
        int i7 = (int) ((i2 - i4) - translationY);
        qsVar.a.setTranslationX(translationX);
        qsVar.a.setTranslationY(translationY);
        qsVar.a.setAlpha(alpha);
        if (qsVar2 != null) {
            j(qsVar2);
            qsVar2.a.setTranslationX(-i6);
            qsVar2.a.setTranslationY(-i7);
            qsVar2.a.setAlpha(0.0f);
        }
        this.e.add(new oh(qsVar, qsVar2, i3, i4, i, i2));
        return true;
    }

    public final void g() {
        if (l()) {
            return;
        }
        b();
    }

    public final void h(qs qsVar) {
        View view = qsVar.a;
        view.animate().cancel();
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((oi) this.d.get(size)).a == qsVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                a(qsVar);
                this.d.remove(size);
            }
        }
        n(this.e, qsVar);
        if (this.b.remove(qsVar)) {
            view.setAlpha(1.0f);
            a(qsVar);
        }
        if (this.c.remove(qsVar)) {
            view.setAlpha(1.0f);
            a(qsVar);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.h.get(size2);
            n(arrayList, qsVar);
            if (arrayList.isEmpty()) {
                this.h.remove(size2);
            }
        }
        for (int size3 = this.g.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.g.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((oi) arrayList2.get(size4)).a == qsVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    a(qsVar);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.g.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f.get(size5);
            if (arrayList3.remove(qsVar)) {
                view.setAlpha(1.0f);
                a(qsVar);
                if (arrayList3.isEmpty()) {
                    this.f.remove(size5);
                }
            }
        }
        this.k.remove(qsVar);
        this.i.remove(qsVar);
        this.l.remove(qsVar);
        this.j.remove(qsVar);
        g();
    }

    public final void i() {
        int size = this.d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            oi oiVar = (oi) this.d.get(size);
            View view = oiVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            a(oiVar.a);
            this.d.remove(size);
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            a((qs) this.b.get(size2));
            this.b.remove(size2);
        }
        int size3 = this.c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            qs qsVar = (qs) this.c.get(size3);
            qsVar.a.setAlpha(1.0f);
            a(qsVar);
            this.c.remove(size3);
        }
        for (int size4 = this.e.size() - 1; size4 >= 0; size4--) {
            o((oh) this.e.get(size4));
        }
        this.e.clear();
        if (l()) {
            for (int size5 = this.g.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.g.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    oi oiVar2 = (oi) arrayList.get(size6);
                    View view2 = oiVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    a(oiVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.g.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    qs qsVar2 = (qs) arrayList2.get(size8);
                    qsVar2.a.setAlpha(1.0f);
                    a(qsVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.h.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.h.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    o((oh) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.h.remove(arrayList3);
                    }
                }
            }
            m(this.k);
            m(this.j);
            m(this.i);
            m(this.l);
            b();
        }
    }

    public final void j(qs qsVar) {
        if (n == null) {
            n = new ValueAnimator().getInterpolator();
        }
        qsVar.a.animate().setInterpolator(n);
        h(qsVar);
    }

    public final boolean k(qs qsVar, int i, int i2, int i3, int i4) {
        View view = qsVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) qsVar.a.getTranslationY());
        j(qsVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                a(qsVar);
                return false;
            }
            i5 = 0;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.d.add(new oi(qsVar, translationX, translationY, i3, i4));
        return true;
    }

    public final boolean l() {
        return (this.c.isEmpty() && this.e.isEmpty() && this.d.isEmpty() && this.b.isEmpty() && this.j.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.l.isEmpty() && this.g.isEmpty() && this.f.isEmpty() && this.h.isEmpty()) ? false : true;
    }
}
