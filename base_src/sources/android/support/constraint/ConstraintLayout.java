package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.af;
import defpackage.ah;
import defpackage.ai;
import defpackage.ar;
import defpackage.as;
import defpackage.at;
import defpackage.aw;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray a;
    as b;
    public ah c;
    private final ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new as();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        f(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new as();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        f(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.d = new ArrayList(100);
        this.b = new as();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 2;
        this.c = null;
        f(attributeSet);
    }

    private final ar d(int i) {
        View view;
        if (i != 0 && (view = (View) this.a.get(i)) != this) {
            if (view == null) {
                return null;
            }
            return ((af) view.getLayoutParams()).Y;
        }
        return this.b;
    }

    private final ar e(View view) {
        if (view == this) {
            return this.b;
        }
        if (view == null) {
            return null;
        }
        return ((af) view.getLayoutParams()).Y;
    }

    private final void f(AttributeSet attributeSet) {
        this.b.J = this;
        this.a.put(getId(), this);
        this.c = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ai.a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.e);
                } else if (index == 17) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.f);
                } else if (index == 14) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.g);
                } else if (index == 15) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.h);
                } else if (index == 112) {
                    this.j = typedArrayObtainStyledAttributes.getInt(112, this.j);
                } else if (index == 34) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    ah ahVar = new ah();
                    this.c = ahVar;
                    ahVar.h(getContext(), resourceId);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.b.ai = this.j;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof af;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new af(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: gp, reason: merged with bridge method [inline-methods] */
    public af generateDefaultLayoutParams() {
        return new af(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: gq, reason: merged with bridge method [inline-methods] */
    public af generateLayoutParams(AttributeSet attributeSet) {
        return new af(getContext(), attributeSet);
    }

    protected final void gr() {
        this.b.D();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            af afVar = (af) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || afVar.Q || zIsInEditMode) {
                ar arVar = afVar.Y;
                int iB = arVar.b();
                int iC = arVar.c();
                childAt.layout(iB, iC, arVar.h() + iB, arVar.d() + iC);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:198:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:279:0x051d  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int baseline;
        int childMeasureSpec;
        boolean z;
        int childMeasureSpec2;
        boolean z2;
        int measuredHeight;
        int baseline2;
        ar arVar;
        af afVar;
        ar arVarD;
        ar arVarD2;
        ar arVarD3;
        ar arVarD4;
        ar arVar2;
        int i6;
        int i7;
        float fAbs;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        as asVar = this.b;
        asVar.w = paddingLeft;
        asVar.x = paddingTop;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        getLayoutParams();
        switch (mode) {
            case Integer.MIN_VALUE:
                i3 = 2;
                break;
            case 0:
                i3 = 2;
                size = 0;
                break;
            case 1073741824:
                size = Math.min(this.g, size) - paddingLeft2;
                i3 = 1;
                break;
            default:
                i3 = 1;
                size = 0;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                i4 = 2;
                break;
            case 0:
                i4 = 2;
                size2 = 0;
                break;
            case 1073741824:
                size2 = Math.min(this.h, size2) - paddingTop2;
                i4 = 1;
                break;
            default:
                i4 = 1;
                size2 = 0;
                break;
        }
        this.b.n(0);
        this.b.m(0);
        this.b.w(i3);
        this.b.q(size);
        this.b.x(i4);
        this.b.k(size2);
        this.b.n((this.e - getPaddingLeft()) - getPaddingRight());
        this.b.m((this.f - getPaddingTop()) - getPaddingBottom());
        if (this.i) {
            this.i = false;
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).isLayoutRequested()) {
                    this.d.clear();
                    ah ahVar = this.c;
                    if (ahVar != null) {
                        ahVar.c(this);
                    }
                    this.b.al.clear();
                    int i9 = 0;
                    for (int childCount2 = getChildCount(); i9 < childCount2; childCount2 = childCount2) {
                        View childAt = getChildAt(i9);
                        ar arVarE = e(childAt);
                        if (arVarE != null) {
                            af afVar2 = (af) childAt.getLayoutParams();
                            arVarE.i();
                            arVarE.K = childAt.getVisibility();
                            arVarE.J = childAt;
                            as asVar2 = this.b;
                            asVar2.al.add(arVarE);
                            ar arVar3 = arVarE.r;
                            if (arVar3 != null) {
                                ((aw) arVar3).F(arVarE);
                            }
                            arVarE.r = asVar2;
                            if (!afVar2.O || !afVar2.N) {
                                this.d.add(arVarE);
                            }
                            if (afVar2.Q) {
                                at atVar = (at) arVarE;
                                int i10 = afVar2.a;
                                if (i10 != -1 && i10 >= 0) {
                                    atVar.af = -1.0f;
                                    atVar.ag = i10;
                                    atVar.ah = -1;
                                }
                                int i11 = afVar2.b;
                                if (i11 != -1 && i11 >= 0) {
                                    atVar.af = -1.0f;
                                    atVar.ag = -1;
                                    atVar.ah = i11;
                                }
                                float f = afVar2.c;
                                if (f != -1.0f && f > -1.0f) {
                                    atVar.af = f;
                                    atVar.ag = -1;
                                    atVar.ah = -1;
                                }
                            } else if (afVar2.R != -1 || afVar2.S != -1 || afVar2.T != -1 || afVar2.U != -1 || afVar2.h != -1 || afVar2.i != -1 || afVar2.j != -1 || afVar2.k != -1 || afVar2.l != -1 || afVar2.K != -1 || afVar2.L != -1 || afVar2.width == -1 || afVar2.height == -1) {
                                int i12 = afVar2.R;
                                int i13 = afVar2.S;
                                int i14 = afVar2.T;
                                int i15 = afVar2.U;
                                int i16 = afVar2.V;
                                int i17 = afVar2.W;
                                float f2 = afVar2.X;
                                if (i12 != -1) {
                                    ar arVarD5 = d(i12);
                                    if (arVarD5 != null) {
                                        arVar = arVarE;
                                        arVarE.v(2, arVarD5, 2, afVar2.leftMargin, i16);
                                        afVar = afVar2;
                                    } else {
                                        arVar = arVarE;
                                        afVar = afVar2;
                                    }
                                } else {
                                    arVar = arVarE;
                                    if (i13 == -1 || (arVarD = d(i13)) == null) {
                                        afVar = afVar2;
                                    } else {
                                        afVar = afVar2;
                                        arVar.v(2, arVarD, 4, afVar.leftMargin, i16);
                                    }
                                }
                                if (i14 != -1) {
                                    ar arVarD6 = d(i14);
                                    if (arVarD6 != null) {
                                        arVar.v(4, arVarD6, 2, afVar.rightMargin, i17);
                                    }
                                } else if (i15 != -1 && (arVarD2 = d(i15)) != null) {
                                    arVar.v(4, arVarD2, 4, afVar.rightMargin, i17);
                                }
                                int i18 = afVar.h;
                                if (i18 != -1) {
                                    ar arVarD7 = d(i18);
                                    if (arVarD7 != null) {
                                        arVar.v(3, arVarD7, 3, afVar.topMargin, afVar.r);
                                    }
                                } else {
                                    int i19 = afVar.i;
                                    if (i19 != -1 && (arVarD3 = d(i19)) != null) {
                                        arVar.v(3, arVarD3, 5, afVar.topMargin, afVar.r);
                                    }
                                }
                                int i20 = afVar.j;
                                if (i20 != -1) {
                                    ar arVarD8 = d(i20);
                                    if (arVarD8 != null) {
                                        arVar.v(5, arVarD8, 3, afVar.bottomMargin, afVar.t);
                                    }
                                } else {
                                    int i21 = afVar.k;
                                    if (i21 != -1 && (arVarD4 = d(i21)) != null) {
                                        arVar.v(5, arVarD4, 5, afVar.bottomMargin, afVar.t);
                                    }
                                }
                                int i22 = afVar.l;
                                if (i22 != -1) {
                                    View view = (View) this.a.get(i22);
                                    ar arVarD9 = d(afVar.l);
                                    if (arVarD9 == null || view == null || !(view.getLayoutParams() instanceof af)) {
                                        arVar2 = arVar;
                                    } else {
                                        af afVar3 = (af) view.getLayoutParams();
                                        afVar.P = true;
                                        afVar3.P = true;
                                        arVar2 = arVar;
                                        arVar2.u(6).d(arVarD9.u(6), 0, -1, 2, 0, true);
                                        arVar2.u(3).b();
                                        arVar2.u(5).b();
                                    }
                                } else {
                                    arVar2 = arVar;
                                }
                                if (f2 >= 0.0f && f2 != 0.5f) {
                                    arVar2.H = f2;
                                }
                                float f3 = afVar.x;
                                if (f3 >= 0.0f && f3 != 0.5f) {
                                    arVar2.I = f3;
                                }
                                if (isInEditMode()) {
                                    int i23 = afVar.K;
                                    if (i23 != -1) {
                                        int i24 = afVar.L;
                                        arVar2.w = i23;
                                        arVar2.x = i24;
                                    } else if (afVar.L != -1) {
                                        i23 = -1;
                                        int i25 = afVar.L;
                                        arVar2.w = i23;
                                        arVar2.x = i25;
                                    }
                                }
                                if (afVar.N) {
                                    arVar2.w(1);
                                    arVar2.q(afVar.width);
                                } else if (afVar.width == -1) {
                                    arVar2.w(4);
                                    arVar2.u(2).c = afVar.leftMargin;
                                    arVar2.u(4).c = afVar.rightMargin;
                                } else {
                                    arVar2.w(3);
                                    arVar2.q(0);
                                }
                                if (afVar.O) {
                                    arVar2.x(1);
                                    arVar2.k(afVar.height);
                                } else if (afVar.height == -1) {
                                    arVar2.x(4);
                                    arVar2.u(3).c = afVar.topMargin;
                                    arVar2.u(5).c = afVar.bottomMargin;
                                } else {
                                    arVar2.x(3);
                                    arVar2.k(0);
                                }
                                String str = afVar.y;
                                if (str != null) {
                                    if (str.length() == 0) {
                                        arVar2.u = 0.0f;
                                    } else {
                                        int length = str.length();
                                        int iIndexOf = str.indexOf(44);
                                        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                            i6 = 0;
                                            i7 = -1;
                                        } else {
                                            String strSubstring = str.substring(0, iIndexOf);
                                            i7 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                            i6 = iIndexOf + 1;
                                        }
                                        int iIndexOf2 = str.indexOf(58);
                                        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                            String strSubstring2 = str.substring(i6);
                                            fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                        } else {
                                            String strSubstring3 = str.substring(i6, iIndexOf2);
                                            String strSubstring4 = str.substring(iIndexOf2 + 1);
                                            if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                                fAbs = 0.0f;
                                            } else {
                                                try {
                                                    float f4 = Float.parseFloat(strSubstring3);
                                                    float f5 = Float.parseFloat(strSubstring4);
                                                    if (f4 <= 0.0f || f5 <= 0.0f) {
                                                        fAbs = 0.0f;
                                                    } else {
                                                        fAbs = i7 == 1 ? Math.abs(f5 / f4) : Math.abs(f4 / f5);
                                                    }
                                                } catch (NumberFormatException e) {
                                                    fAbs = 0.0f;
                                                }
                                            }
                                        }
                                        if (fAbs > 0.0f) {
                                            arVar2.u = fAbs;
                                            arVar2.v = i7;
                                        }
                                    }
                                }
                                arVar2.Z = afVar.A;
                                arVar2.aa = afVar.B;
                                arVar2.V = afVar.C;
                                arVar2.W = afVar.D;
                                int i26 = afVar.E;
                                int i27 = afVar.G;
                                int i28 = afVar.I;
                                arVar2.c = i26;
                                arVar2.e = i27;
                                arVar2.f = i28;
                                int i29 = afVar.F;
                                int i30 = afVar.H;
                                int i31 = afVar.J;
                                arVar2.d = i29;
                                arVar2.g = i30;
                                arVar2.h = i31;
                            }
                        }
                        i9++;
                    }
                }
            }
        }
        int paddingTop3 = getPaddingTop() + getPaddingBottom();
        int paddingLeft3 = getPaddingLeft() + getPaddingRight();
        int childCount3 = getChildCount();
        int i32 = 0;
        while (true) {
            int i33 = 8;
            if (i32 >= childCount3) {
                if (getChildCount() > 0) {
                    gr();
                }
                int size3 = this.d.size();
                int paddingBottom = paddingTop + getPaddingBottom();
                int paddingRight = paddingLeft + getPaddingRight();
                if (size3 > 0) {
                    as asVar3 = this.b;
                    int i34 = asVar3.ad;
                    int i35 = asVar3.ae;
                    int iCombineMeasuredStates = 0;
                    int i36 = 0;
                    boolean z3 = false;
                    while (i36 < size3) {
                        ar arVar4 = (ar) this.d.get(i36);
                        if ((arVar4 instanceof at) || (obj = arVar4.J) == null) {
                            size3 = size3;
                        } else {
                            View view2 = (View) obj;
                            if (view2.getVisibility() == i33) {
                                size3 = size3;
                            } else {
                                af afVar4 = (af) view2.getLayoutParams();
                                view2.measure(afVar4.width == -2 ? getChildMeasureSpec(i, paddingRight, afVar4.width) : View.MeasureSpec.makeMeasureSpec(arVar4.h(), 1073741824), afVar4.height == -2 ? getChildMeasureSpec(i2, paddingBottom, afVar4.height) : View.MeasureSpec.makeMeasureSpec(arVar4.d(), 1073741824));
                                int measuredWidth = view2.getMeasuredWidth();
                                int measuredHeight2 = view2.getMeasuredHeight();
                                if (measuredWidth != arVar4.h()) {
                                    arVar4.q(measuredWidth);
                                    if (i34 != 2 || arVar4.g() <= this.b.h()) {
                                        z3 = true;
                                    } else {
                                        this.b.q(Math.max(this.e, arVar4.g() + arVar4.u(4).a()));
                                        z3 = true;
                                    }
                                }
                                if (measuredHeight2 != arVar4.d()) {
                                    arVar4.k(measuredHeight2);
                                    if (i35 != 2 || arVar4.a() <= this.b.d()) {
                                        z3 = true;
                                    } else {
                                        this.b.k(Math.max(this.f, arVar4.a() + arVar4.u(5).a()));
                                        z3 = true;
                                    }
                                }
                                if (afVar4.P && (baseline = view2.getBaseline()) != -1 && baseline != arVar4.C) {
                                    arVar4.C = baseline;
                                    z3 = true;
                                }
                                iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                            }
                        }
                        i36++;
                        size3 = size3;
                        i33 = 8;
                    }
                    if (z3) {
                        gr();
                    }
                    i5 = iCombineMeasuredStates;
                } else {
                    i5 = 0;
                }
                int iH = this.b.h();
                int iD = this.b.d();
                int iResolveSizeAndState = resolveSizeAndState(iH + paddingRight, i, i5);
                int iResolveSizeAndState2 = resolveSizeAndState(iD + paddingBottom, i2, i5 << 16);
                int iMin = Math.min(this.g, iResolveSizeAndState) & 16777215;
                int iMin2 = Math.min(this.h, iResolveSizeAndState2) & 16777215;
                as asVar4 = this.b;
                if (asVar4.aj) {
                    iMin |= 16777216;
                }
                if (asVar4.ak) {
                    iMin2 |= 16777216;
                }
                setMeasuredDimension(iMin, iMin2);
                return;
            }
            View childAt2 = getChildAt(i32);
            if (childAt2.getVisibility() != 8) {
                af afVar5 = (af) childAt2.getLayoutParams();
                ar arVar5 = afVar5.Y;
                if (!afVar5.Q) {
                    int measuredWidth2 = afVar5.width;
                    int i37 = afVar5.height;
                    if (afVar5.N || afVar5.O || afVar5.E == 1 || afVar5.width == -1 || (!afVar5.O && (afVar5.F == 1 || afVar5.height == -1))) {
                        if (measuredWidth2 == 0 || measuredWidth2 == -1) {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft3, -2);
                            z = true;
                        } else {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft3, measuredWidth2);
                            z = false;
                        }
                        if (i37 == 0 || i37 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop3, -2);
                            z2 = true;
                        } else {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop3, i37);
                            z2 = false;
                        }
                        childAt2.measure(childMeasureSpec, childMeasureSpec2);
                        measuredWidth2 = childAt2.getMeasuredWidth();
                        measuredHeight = childAt2.getMeasuredHeight();
                    } else {
                        measuredHeight = i37;
                        z = false;
                        z2 = false;
                    }
                    arVar5.q(measuredWidth2);
                    arVar5.k(measuredHeight);
                    if (z) {
                        arVar5.F = measuredWidth2;
                    }
                    if (z2) {
                        arVar5.G = measuredHeight;
                    }
                    if (afVar5.P && (baseline2 = childAt2.getBaseline()) != -1) {
                        arVar5.C = baseline2;
                    }
                }
            }
            i32++;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        ar arVarE = e(view);
        if ((view instanceof Guideline) && !(arVarE instanceof at)) {
            af afVar = (af) view.getLayoutParams();
            afVar.Y = new at();
            afVar.Q = true;
            ((at) afVar.Y).A(afVar.M);
            ar arVar = afVar.Y;
        }
        this.a.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.b.F(e(view));
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.i = true;
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }
}
