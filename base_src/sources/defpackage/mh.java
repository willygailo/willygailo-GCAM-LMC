package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mh extends kj {
    me g;
    public int h;
    mf i;
    public mb j;
    mc k;
    final mg l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final SparseBooleanArray r;
    private ki s;

    public mh(Context context) {
        super(context);
        this.r = new SparseBooleanArray();
        this.l = new mg(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kj
    public final View a(kz kzVar, View view, ViewGroup viewGroup) {
        View actionView = kzVar.getActionView();
        if (actionView == null || kzVar.m()) {
            ll llVar = view instanceof ll ? (ll) view : (ll) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            llVar.f(kzVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) llVar;
            actionMenuItemView.b = (ActionMenuView) this.f;
            if (this.s == null) {
                this.s = new ki(this);
            }
            actionMenuItemView.c = this.s;
            actionView = (View) llVar;
        }
        actionView.setVisibility(true == kzVar.p ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof mk)) {
            actionView.setLayoutParams(ActionMenuView.n(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.kj, defpackage.lk
    public final void b(Context context, kw kwVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = kwVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = ga.f(context);
        int measuredWidth = this.o;
        if (this.m) {
            if (this.g == null) {
                this.g = new me(this, this.a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.kj, defpackage.lk
    public final void c(kw kwVar, boolean z) {
        n();
        lj ljVar = this.e;
        if (ljVar != null) {
            ljVar.a(kwVar, z);
        }
    }

    @Override // defpackage.kj, defpackage.lk
    public final boolean e() {
        ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        kw kwVar = this.c;
        View view = null;
        if (kwVar != null) {
            arrayListF = kwVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.h;
        int i2 = this.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            kz kzVar = (kz) arrayListF.get(i3);
            if (kzVar.r()) {
                i4++;
            } else if (kzVar.q()) {
                i5++;
            } else {
                z3 = true;
            }
            if (this.q && kzVar.p) {
                i = 0;
            }
            i3++;
        }
        if (this.m && (z3 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            kz kzVar2 = (kz) arrayListF.get(i7);
            if (kzVar2.r()) {
                View viewA = a(kzVar2, view, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = kzVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                kzVar2.k(z);
            } else if (kzVar2.q()) {
                int i10 = kzVar2.b;
                boolean z4 = sparseBooleanArray.get(i10);
                boolean z5 = (i6 > 0 || z4) && i2 > 0;
                if (z5) {
                    View viewA2 = a(kzVar2, view, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z2 = i2 + i8 > 0;
                } else {
                    z2 = z5;
                }
                if (z2 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z4) {
                    sparseBooleanArray.put(i10, false);
                    for (int i11 = 0; i11 < i7; i11++) {
                        kz kzVar3 = (kz) arrayListF.get(i11);
                        if (kzVar3.b == i10) {
                            if (kzVar3.o()) {
                                i6++;
                            }
                            kzVar3.k(false);
                        }
                    }
                }
                if (z2) {
                    i6--;
                }
                kzVar2.k(z2);
            } else {
                kzVar2.k(false);
            }
            i7++;
            view = null;
            z = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.kj, defpackage.lk
    public final boolean f(ls lsVar) {
        kw kwVar;
        boolean z = false;
        if (!lsVar.hasVisibleItems()) {
            return false;
        }
        ls lsVar2 = lsVar;
        while (true) {
            kw kwVar2 = lsVar2.j;
            if (kwVar2 == this.c) {
                break;
            }
            lsVar2 = (ls) kwVar2;
        }
        kz kzVar = lsVar2.k;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ?? r3 = 0;
        r3 = 0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                KeyEvent.Callback childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ll) && ((ll) childAt).a() == kzVar) {
                    r3 = childAt;
                    break;
                }
            }
        }
        if (r3 == 0) {
            return false;
        }
        kz kzVar2 = lsVar.k;
        int size = lsVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = lsVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        mb mbVar = new mb(this, this.b, lsVar, r3);
        this.j = mbVar;
        mbVar.d(z);
        if (!this.j.h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        lj ljVar = this.e;
        if (ljVar != null) {
            if (lsVar == null) {
                kwVar = this.c;
            }
            ljVar.b(kwVar);
        }
        kwVar = lsVar;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kj, defpackage.lk
    public final void i() {
        me meVar;
        Object parent;
        Object obj;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        boolean z = false;
        if (viewGroup != null) {
            kw kwVar = this.c;
            if (kwVar != null) {
                kwVar.k();
                ArrayList arrayListF = this.c.f();
                int size = arrayListF.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    kz kzVar = (kz) arrayListF.get(i2);
                    if (kzVar.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        kz kzVarA = childAt instanceof ll ? ((ll) childAt).a() : null;
                        View viewA = a(kzVar, childAt, viewGroup);
                        if (kzVar != kzVarA) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        kw kwVar2 = this.c;
        if (kwVar2 != null) {
            kwVar2.k();
            ArrayList arrayList = kwVar2.d;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                fh fhVar = ((kz) arrayList.get(i3)).o;
            }
        }
        kw kwVar3 = this.c;
        ArrayList arrayListE = kwVar3 != null ? kwVar3.e() : null;
        if (!this.m || arrayListE == null) {
            meVar = this.g;
            if (meVar != null) {
                parent = meVar.getParent();
                obj = this.f;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.g);
                }
            }
        } else {
            int size3 = arrayListE.size();
            if (size3 == 1) {
                z = !((kz) arrayListE.get(0)).p;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                if (this.g == null) {
                    this.g = new me(this, this.a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.g.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.g);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.f;
                    me meVar2 = this.g;
                    mk mkVarM = ActionMenuView.m();
                    mkVarM.a = true;
                    actionMenuView.addView(meVar2, mkVarM);
                }
            } else {
                meVar = this.g;
                if (meVar != null) {
                    parent = meVar.getParent();
                    obj = this.f;
                    if (parent == obj) {
                        ((ViewGroup) obj).removeView(this.g);
                    }
                }
            }
        }
        ((ActionMenuView) this.f).b = this.m;
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        Object obj;
        mc mcVar = this.k;
        if (mcVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(mcVar);
            this.k = null;
            return true;
        }
        mf mfVar = this.i;
        if (mfVar == null) {
            return false;
        }
        mfVar.b();
        return true;
    }

    public final boolean l() {
        mf mfVar = this.i;
        return mfVar != null && mfVar.g();
    }

    public final boolean m() {
        kw kwVar;
        if (!this.m || l() || (kwVar = this.c) == null || this.f == null || this.k != null || kwVar.e().isEmpty()) {
            return false;
        }
        this.k = new mc(this, new mf(this, this.b, this.c, this.g));
        ((View) this.f).post(this.k);
        return true;
    }

    public final void n() {
        k();
        q();
    }

    public final void o() {
        this.q = true;
    }

    public final void p() {
        this.m = true;
        this.n = true;
    }

    public final void q() {
        mb mbVar = this.j;
        if (mbVar != null) {
            mbVar.b();
        }
    }
}
