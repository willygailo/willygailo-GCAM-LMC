package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ew;
import defpackage.yh;
import defpackage.yk;
import defpackage.yl;
import defpackage.yn;
import defpackage.yo;
import defpackage.yp;
import defpackage.yq;
import defpackage.yr;
import defpackage.yt;
import defpackage.yu;
import defpackage.yw;
import defpackage.za;
import defpackage.zc;
import defpackage.ze;
import defpackage.zg;
import defpackage.zh;
import defpackage.zi;
import defpackage.zk;
import defpackage.zl;
import defpackage.zp;
import defpackage.zq;
import defpackage.zs;
import defpackage.zt;
import defpackage.zu;
import defpackage.zv;
import defpackage.zw;
import defpackage.zx;
import defpackage.zz;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray a;
    public ArrayList b;
    protected yl c;
    protected boolean d;
    public int e;
    zl f;
    private int g;
    private int h;
    private int i;
    private int j;
    private zu k;
    private int l;
    private HashMap m;
    private SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new yl();
        this.g = 0;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.f = new zl(this, this);
        f(null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new yl();
        this.g = 0;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.f = new zl(this, this);
        f(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new yl();
        this.g = 0;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.f = new zl(this, this);
        f(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new yl();
        this.g = 0;
        this.h = 0;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.d = true;
        this.e = 257;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.f = new zl(this, this);
        f(attributeSet, i, i2);
    }

    protected static final zk d() {
        return new zk();
    }

    private final void f(AttributeSet attributeSet, int i, int i2) {
        yl ylVar = this.c;
        ylVar.af = this;
        zl zlVar = this.f;
        ylVar.aG = zlVar;
        ylVar.b.g = zlVar;
        this.a.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, zz.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.g);
                } else if (index == 17) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.h);
                } else if (index == 14) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.i);
                } else if (index == 15) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.j);
                } else if (index == 112) {
                    this.e = typedArrayObtainStyledAttributes.getInt(112, this.e);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(55, 0);
                    if (resourceId != 0) {
                        try {
                            ew.e(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException e) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        zu zuVar = new zu();
                        this.k = zuVar;
                        zuVar.c(getContext(), resourceId2);
                    } catch (Resources.NotFoundException e2) {
                        this.k = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.U(this.e);
    }

    private final void g() {
        this.d = true;
    }

    /* JADX WARN: Code duplicated, block: B:376:0x0937  */
    private final void h() {
        boolean z;
        int i;
        int i2;
        float f;
        yk ykVar;
        yk ykVar2;
        yk ykVar3;
        yk ykVar4;
        float f2;
        int i3;
        int i4;
        float fAbs;
        int i5;
        yo yoVar;
        yk ykVarB;
        String str;
        int iD;
        ConstraintLayout constraintLayout;
        int i6;
        boolean z2;
        int i7;
        int i8;
        String resourceEntryName;
        yk ykVar5;
        ConstraintLayout constraintLayout2 = this;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            yk ykVarB2 = constraintLayout2.b(constraintLayout2.getChildAt(i9));
            if (ykVarB2 != null) {
                ykVarB2.s();
            }
        }
        int i10 = -1;
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = constraintLayout2.getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    Integer numValueOf = Integer.valueOf(childAt.getId());
                    if (resourceName instanceof String) {
                        if (constraintLayout2.m == null) {
                            constraintLayout2.m = new HashMap();
                        }
                        int iIndexOf = resourceName.indexOf("/");
                        constraintLayout2.m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, Integer.valueOf(numValueOf.intValue()));
                    }
                    int iIndexOf2 = resourceName.indexOf(47);
                    if (iIndexOf2 != -1) {
                        resourceName = resourceName.substring(iIndexOf2 + 1);
                    }
                    int id = childAt.getId();
                    if (id == 0) {
                        ykVar5 = constraintLayout2.c;
                    } else {
                        View viewFindViewById = (View) constraintLayout2.a.get(id);
                        if (viewFindViewById == null && (viewFindViewById = constraintLayout2.findViewById(id)) != null && viewFindViewById != constraintLayout2 && viewFindViewById.getParent() == constraintLayout2) {
                            constraintLayout2.onViewAdded(viewFindViewById);
                        }
                        ykVar5 = viewFindViewById == constraintLayout2 ? constraintLayout2.c : viewFindViewById == null ? null : ((zk) viewFindViewById.getLayoutParams()).aq;
                    }
                    ykVar5.ah = resourceName;
                } catch (Resources.NotFoundException e) {
                }
            }
        }
        if (constraintLayout2.l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = constraintLayout2.getChildAt(i12);
                if (childAt2.getId() == constraintLayout2.l && (childAt2 instanceof zv)) {
                    throw null;
                }
            }
        }
        zu zuVar = constraintLayout2.k;
        int i13 = 1;
        if (zuVar != null) {
            int childCount2 = getChildCount();
            HashSet<Integer> hashSet = new HashSet(zuVar.b.keySet());
            int i14 = 0;
            while (i14 < childCount2) {
                View childAt3 = constraintLayout2.getChildAt(i14);
                int id2 = childAt3.getId();
                HashMap map = zuVar.b;
                Integer numValueOf2 = Integer.valueOf(id2);
                if (!map.containsKey(numValueOf2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("id unknown ");
                    try {
                        resourceEntryName = childAt3.getContext().getResources().getResourceEntryName(childAt3.getId());
                    } catch (Exception e2) {
                        resourceEntryName = "UNKNOWN";
                    }
                    sb.append(resourceEntryName);
                    Log.w("ConstraintSet", sb.toString());
                    i6 = childCount2;
                    z2 = zIsInEditMode;
                    i7 = childCount;
                } else {
                    if (id2 == i10) {
                        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                    }
                    if (id2 == i10) {
                        i6 = childCount2;
                        z2 = zIsInEditMode;
                        i7 = childCount;
                    } else if (zuVar.b.containsKey(numValueOf2)) {
                        hashSet.remove(numValueOf2);
                        zp zpVar = (zp) zuVar.b.get(numValueOf2);
                        if (zpVar != null) {
                            if (childAt3 instanceof Barrier) {
                                zpVar.d.ai = i13;
                                Barrier barrier = (Barrier) childAt3;
                                barrier.setId(id2);
                                zq zqVar = zpVar.d;
                                barrier.a = zqVar.ag;
                                barrier.c(zqVar.ah);
                                zq zqVar2 = zpVar.d;
                                barrier.b.b = zqVar2.ao;
                                int[] iArr = zqVar2.aj;
                                if (iArr != null) {
                                    barrier.g(iArr);
                                } else {
                                    String str2 = zqVar2.ak;
                                    if (str2 != null) {
                                        zqVar2.aj = zu.g(barrier, str2);
                                        barrier.g(zpVar.d.aj);
                                    }
                                }
                            }
                            zk zkVar = (zk) childAt3.getLayoutParams();
                            zkVar.a();
                            zpVar.a(zkVar);
                            HashMap map2 = zpVar.f;
                            Class<?> cls = childAt3.getClass();
                            for (String str3 : map2.keySet()) {
                                zIsInEditMode = zIsInEditMode;
                                zh zhVar = (zh) map2.get(str3);
                                map2 = map2;
                                String str4 = zhVar.a ? str3 : "set" + str3;
                                try {
                                    int i15 = zhVar.h;
                                    int i16 = i15 - 1;
                                    if (i15 == 0) {
                                        i8 = childCount2;
                                        throw null;
                                    }
                                    switch (i16) {
                                        case 0:
                                            cls.getMethod(str4, Integer.TYPE).invoke(childAt3, Integer.valueOf(zhVar.c));
                                            childCount2 = childCount2;
                                            break;
                                        case 1:
                                            cls.getMethod(str4, Float.TYPE).invoke(childAt3, Float.valueOf(zhVar.d));
                                            childCount2 = childCount2;
                                            break;
                                        case 2:
                                            cls.getMethod(str4, Integer.TYPE).invoke(childAt3, Integer.valueOf(zhVar.g));
                                            childCount2 = childCount2;
                                            break;
                                        case 3:
                                            int i17 = childCount2;
                                            Method method = cls.getMethod(str4, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(zhVar.g);
                                            method.invoke(childAt3, colorDrawable);
                                            childCount2 = i17;
                                            break;
                                        case 4:
                                            cls.getMethod(str4, CharSequence.class).invoke(childAt3, zhVar.e);
                                            childCount2 = childCount2;
                                            break;
                                        case 5:
                                            cls.getMethod(str4, Boolean.TYPE).invoke(childAt3, Boolean.valueOf(zhVar.f));
                                            childCount2 = childCount2;
                                            break;
                                        case 6:
                                            cls.getMethod(str4, Float.TYPE).invoke(childAt3, Float.valueOf(zhVar.d));
                                            childCount2 = childCount2;
                                            break;
                                        case 7:
                                            i8 = childCount2;
                                            try {
                                                cls.getMethod(str4, Integer.TYPE).invoke(childAt3, Integer.valueOf(zhVar.c));
                                                childCount2 = i8;
                                            } catch (IllegalAccessException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                childCount2 = i8;
                                            } catch (NoSuchMethodException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(cls.getName());
                                                sb2.append(" must have a method ");
                                                sb2.append(str4);
                                                Log.e("TransitionLayout", sb2.toString());
                                                childCount2 = i8;
                                            } catch (InvocationTargetException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                childCount2 = i8;
                                            }
                                            break;
                                    }
                                } catch (IllegalAccessException e6) {
                                    e = e6;
                                    i8 = childCount2;
                                } catch (NoSuchMethodException e7) {
                                    e = e7;
                                    i8 = childCount2;
                                } catch (InvocationTargetException e8) {
                                    e = e8;
                                    i8 = childCount2;
                                }
                            }
                            i6 = childCount2;
                            z2 = zIsInEditMode;
                            i7 = childCount;
                            childAt3.setLayoutParams(zkVar);
                            zs zsVar = zpVar.b;
                            if (zsVar.c == 0) {
                                childAt3.setVisibility(zsVar.b);
                            }
                            childAt3.setAlpha(zpVar.b.d);
                            childAt3.setRotation(zpVar.e.c);
                            childAt3.setRotationX(zpVar.e.d);
                            childAt3.setRotationY(zpVar.e.e);
                            childAt3.setScaleX(zpVar.e.f);
                            childAt3.setScaleY(zpVar.e.g);
                            zt ztVar = zpVar.e;
                            if (ztVar.j != -1) {
                                View viewFindViewById2 = ((View) childAt3.getParent()).findViewById(zpVar.e.j);
                                if (viewFindViewById2 != null) {
                                    float top = (viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f;
                                    float left = (viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f;
                                    if (childAt3.getRight() - childAt3.getLeft() > 0 && childAt3.getBottom() - childAt3.getTop() > 0) {
                                        int left2 = childAt3.getLeft();
                                        int top2 = childAt3.getTop();
                                        childAt3.setPivotX(left - left2);
                                        childAt3.setPivotY(top - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(ztVar.h)) {
                                    childAt3.setPivotX(zpVar.e.h);
                                }
                                if (!Float.isNaN(zpVar.e.i)) {
                                    childAt3.setPivotY(zpVar.e.i);
                                }
                            }
                            childAt3.setTranslationX(zpVar.e.k);
                            childAt3.setTranslationY(zpVar.e.l);
                            childAt3.setTranslationZ(zpVar.e.m);
                            zt ztVar2 = zpVar.e;
                            if (ztVar2.n) {
                                childAt3.setElevation(ztVar2.o);
                            }
                        } else {
                            i6 = childCount2;
                            z2 = zIsInEditMode;
                            i7 = childCount;
                        }
                    } else {
                        i6 = childCount2;
                        z2 = zIsInEditMode;
                        i7 = childCount;
                    }
                }
                i14++;
                constraintLayout2 = this;
                zIsInEditMode = z2;
                childCount = i7;
                childCount2 = i6;
                i10 = -1;
                i13 = 1;
            }
            int i18 = childCount2;
            z = zIsInEditMode;
            i = childCount;
            for (Integer num : hashSet) {
                zp zpVar2 = (zp) zuVar.b.get(num);
                if (zpVar2 != null) {
                    if (zpVar2.d.ai == 1) {
                        Barrier barrier2 = new Barrier(getContext());
                        barrier2.setId(num.intValue());
                        zq zqVar3 = zpVar2.d;
                        int[] iArr2 = zqVar3.aj;
                        if (iArr2 != null) {
                            barrier2.g(iArr2);
                        } else {
                            String str5 = zqVar3.ak;
                            if (str5 != null) {
                                zqVar3.aj = zu.g(barrier2, str5);
                                barrier2.g(zpVar2.d.aj);
                            }
                        }
                        zq zqVar4 = zpVar2.d;
                        barrier2.a = zqVar4.ag;
                        barrier2.c(zqVar4.ah);
                        zk zkVarD = d();
                        barrier2.h();
                        zpVar2.a(zkVarD);
                        constraintLayout = this;
                        constraintLayout.addView(barrier2, zkVarD);
                    } else {
                        constraintLayout = this;
                    }
                    if (zpVar2.d.b) {
                        zw zwVar = new zw(getContext());
                        zwVar.setId(num.intValue());
                        zk zkVarD2 = d();
                        zpVar2.a(zkVarD2);
                        constraintLayout.addView(zwVar, zkVarD2);
                    }
                }
            }
            constraintLayout2 = this;
            int i19 = 0;
            while (true) {
                int i20 = i18;
                if (i19 < i20) {
                    View childAt4 = constraintLayout2.getChildAt(i19);
                    if (childAt4 instanceof zi) {
                    }
                    i19++;
                    i18 = i20;
                }
            }
        } else {
            z = zIsInEditMode;
            i = childCount;
        }
        constraintLayout2.c.aH.clear();
        int size = constraintLayout2.b.size();
        if (size > 0) {
            for (int i21 = 0; i21 < size; i21++) {
                zi ziVar = (zi) constraintLayout2.b.get(i21);
                if (ziVar.isInEditMode()) {
                    ziVar.e(ziVar.f);
                }
                yo yoVar2 = ziVar.i;
                if (yoVar2 != null) {
                    yoVar2.ar = 0;
                    Arrays.fill(yoVar2.aq, (Object) null);
                    for (int i22 = 0; i22 < ziVar.d; i22++) {
                        int i23 = ziVar.c[i22];
                        View viewA = constraintLayout2.a(i23);
                        if (viewA == null && (iD = ziVar.d(constraintLayout2, (str = (String) ziVar.h.get(Integer.valueOf(i23))))) != 0) {
                            ziVar.c[i22] = iD;
                            ziVar.h.put(Integer.valueOf(iD), str);
                            viewA = constraintLayout2.a(iD);
                        }
                        if (viewA != null && (ykVarB = constraintLayout2.b(viewA)) != (yoVar = ziVar.i) && ykVarB != null) {
                            int i24 = yoVar.ar;
                            yk[] ykVarArr = yoVar.aq;
                            int length = ykVarArr.length;
                            if (i24 + 1 > length) {
                                yoVar.aq = (yk[]) Arrays.copyOf(ykVarArr, length + length);
                            }
                            yk[] ykVarArr2 = yoVar.aq;
                            int i25 = yoVar.ar;
                            ykVarArr2[i25] = ykVarB;
                            yoVar.ar = i25 + 1;
                        }
                    }
                    yo yoVar3 = ziVar.i;
                }
            }
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (true) {
            int i26 = i;
            if (i2 >= i26) {
                constraintLayout2.n.clear();
                constraintLayout2.n.put(0, constraintLayout2.c);
                constraintLayout2.n.put(getId(), constraintLayout2.c);
                for (int i27 = 0; i27 < i26; i27++) {
                    View childAt5 = constraintLayout2.getChildAt(i27);
                    constraintLayout2.n.put(childAt5.getId(), constraintLayout2.b(childAt5));
                }
                for (int i28 = 0; i28 < i26; i28++) {
                    View childAt6 = constraintLayout2.getChildAt(i28);
                    yk ykVarB3 = constraintLayout2.b(childAt6);
                    if (ykVarB3 != null) {
                        zk zkVar2 = (zk) childAt6.getLayoutParams();
                        yl ylVar = constraintLayout2.c;
                        ylVar.aH.add(ykVarB3);
                        yk ykVar6 = ykVarB3.T;
                        if (ykVar6 != null) {
                            ((yr) ykVar6).Y(ykVarB3);
                        }
                        ykVarB3.T = ylVar;
                        SparseArray sparseArray = constraintLayout2.n;
                        zkVar2.a();
                        zkVar2.ar = false;
                        ykVarB3.ag = childAt6.getVisibility();
                        boolean z3 = zkVar2.ae;
                        ykVarB3.af = childAt6;
                        if (childAt6 instanceof zi) {
                            ((zi) childAt6).b(ykVarB3, constraintLayout2.c.d);
                        }
                        if (zkVar2.ac) {
                            yn ynVar = (yn) ykVarB3;
                            int i29 = zkVar2.an;
                            int i30 = zkVar2.ao;
                            float f3 = zkVar2.ap;
                            if (f3 == -1.0f) {
                                i5 = -1;
                                if (i29 != -1) {
                                    if (i29 >= 0) {
                                        ynVar.a = -1.0f;
                                        ynVar.b = i29;
                                        ynVar.c = i5;
                                    }
                                } else if (i30 != -1 && i30 >= 0) {
                                    ynVar.a = -1.0f;
                                    ynVar.b = -1;
                                    ynVar.c = i30;
                                }
                            } else if (f3 > -1.0f) {
                                ynVar.a = f3;
                                i5 = -1;
                                ynVar.b = -1;
                                ynVar.c = i5;
                            }
                        } else {
                            int i31 = zkVar2.ag;
                            int i32 = zkVar2.ah;
                            int i33 = zkVar2.ai;
                            int i34 = zkVar2.aj;
                            int i35 = zkVar2.ak;
                            int i36 = zkVar2.al;
                            float f4 = zkVar2.am;
                            int i37 = zkVar2.o;
                            if (i37 != -1) {
                                yk ykVar7 = (yk) sparseArray.get(i37);
                                if (ykVar7 != null) {
                                    float f5 = zkVar2.q;
                                    ykVarB3.P(7, ykVar7, 7, zkVar2.p, 0);
                                    ykVarB3.E = f5;
                                    f2 = 0.0f;
                                } else {
                                    f2 = 0.0f;
                                }
                            } else {
                                if (i31 != -1) {
                                    yk ykVar8 = (yk) sparseArray.get(i31);
                                    if (ykVar8 != null) {
                                        f = f4;
                                        ykVarB3.P(2, ykVar8, 2, zkVar2.leftMargin, i35);
                                    } else {
                                        f = f4;
                                    }
                                } else {
                                    f = f4;
                                    if (i32 != -1 && (ykVar = (yk) sparseArray.get(i32)) != null) {
                                        ykVarB3.P(2, ykVar, 4, zkVar2.leftMargin, i35);
                                    }
                                }
                                if (i33 != -1) {
                                    yk ykVar9 = (yk) sparseArray.get(i33);
                                    if (ykVar9 != null) {
                                        ykVarB3.P(4, ykVar9, 2, zkVar2.rightMargin, i36);
                                    }
                                } else if (i34 != -1 && (ykVar2 = (yk) sparseArray.get(i34)) != null) {
                                    ykVarB3.P(4, ykVar2, 4, zkVar2.rightMargin, i36);
                                }
                                int i38 = zkVar2.h;
                                if (i38 != -1) {
                                    yk ykVar10 = (yk) sparseArray.get(i38);
                                    if (ykVar10 != null) {
                                        ykVarB3.P(3, ykVar10, 3, zkVar2.topMargin, zkVar2.w);
                                    }
                                } else {
                                    int i39 = zkVar2.i;
                                    if (i39 != -1 && (ykVar3 = (yk) sparseArray.get(i39)) != null) {
                                        ykVarB3.P(3, ykVar3, 5, zkVar2.topMargin, zkVar2.w);
                                    }
                                }
                                int i40 = zkVar2.j;
                                if (i40 != -1) {
                                    yk ykVar11 = (yk) sparseArray.get(i40);
                                    if (ykVar11 != null) {
                                        ykVarB3.P(5, ykVar11, 3, zkVar2.bottomMargin, zkVar2.y);
                                    }
                                } else {
                                    int i41 = zkVar2.k;
                                    if (i41 != -1 && (ykVar4 = (yk) sparseArray.get(i41)) != null) {
                                        ykVarB3.P(5, ykVar4, 5, zkVar2.bottomMargin, zkVar2.y);
                                    }
                                }
                                int i42 = zkVar2.l;
                                if (i42 != -1) {
                                    i(ykVarB3, zkVar2, sparseArray, i42, 6);
                                } else {
                                    int i43 = zkVar2.m;
                                    if (i43 != -1) {
                                        i(ykVarB3, zkVar2, sparseArray, i43, 3);
                                    } else {
                                        int i44 = zkVar2.n;
                                        if (i44 != -1) {
                                            i(ykVarB3, zkVar2, sparseArray, i44, 5);
                                        }
                                    }
                                }
                                f2 = 0.0f;
                                if (f >= 0.0f) {
                                    ykVarB3.ad = f;
                                }
                                float f6 = zkVar2.E;
                                if (f6 >= 0.0f) {
                                    ykVarB3.ae = f6;
                                }
                            }
                            if (z) {
                                int i45 = zkVar2.S;
                                if (i45 != -1) {
                                    int i46 = zkVar2.T;
                                    ykVarB3.Y = i45;
                                    ykVarB3.Z = i46;
                                } else if (zkVar2.T != -1) {
                                    i45 = -1;
                                    int i47 = zkVar2.T;
                                    ykVarB3.Y = i45;
                                    ykVarB3.Z = i47;
                                }
                            }
                            if (zkVar2.Z) {
                                ykVarB3.Q(1);
                                ykVarB3.D(zkVar2.width);
                                if (zkVar2.width == -2) {
                                    ykVarB3.Q(2);
                                }
                            } else if (zkVar2.width == -1) {
                                if (zkVar2.V) {
                                    ykVarB3.Q(3);
                                } else {
                                    ykVarB3.Q(4);
                                }
                                ykVarB3.L(2).f = zkVar2.leftMargin;
                                ykVarB3.L(4).f = zkVar2.rightMargin;
                            } else {
                                ykVarB3.Q(3);
                                ykVarB3.D(0);
                            }
                            if (zkVar2.aa) {
                                ykVarB3.R(1);
                                ykVarB3.y(zkVar2.height);
                                if (zkVar2.height == -2) {
                                    ykVarB3.R(2);
                                }
                            } else if (zkVar2.height == -1) {
                                if (zkVar2.W) {
                                    ykVarB3.R(3);
                                } else {
                                    ykVarB3.R(4);
                                }
                                ykVarB3.L(3).f = zkVar2.topMargin;
                                ykVarB3.L(5).f = zkVar2.bottomMargin;
                            } else {
                                ykVarB3.R(3);
                                ykVarB3.y(0);
                            }
                            String str6 = zkVar2.F;
                            if (str6 == null || str6.length() == 0) {
                                ykVarB3.W = f2;
                            } else {
                                int length2 = str6.length();
                                int iIndexOf3 = str6.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length2 - 1) {
                                    i3 = 0;
                                    i4 = -1;
                                } else {
                                    String strSubstring = str6.substring(0, iIndexOf3);
                                    i4 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                    i3 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str6.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length2 - 1) {
                                    String strSubstring2 = str6.substring(i3);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                } else {
                                    String strSubstring3 = str6.substring(i3, iIndexOf4);
                                    String strSubstring4 = str6.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f8 = Float.parseFloat(strSubstring4);
                                            if (f7 <= f2 || f8 <= f2) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i4 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                            }
                                        } catch (NumberFormatException e9) {
                                            fAbs = 0.0f;
                                        }
                                    }
                                }
                                if (fAbs > f2) {
                                    ykVarB3.W = fAbs;
                                    ykVarB3.X = i4;
                                }
                            }
                            float f9 = zkVar2.G;
                            float[] fArr = ykVarB3.ak;
                            fArr[0] = f9;
                            fArr[1] = zkVar2.H;
                            ykVarB3.ai = zkVar2.I;
                            ykVarB3.aj = zkVar2.J;
                            int i48 = zkVar2.Y;
                            if (i48 >= 0 && i48 <= 3) {
                                ykVarB3.r = i48;
                            }
                            int i49 = zkVar2.K;
                            int i50 = zkVar2.M;
                            int i51 = zkVar2.O;
                            float f10 = zkVar2.Q;
                            ykVarB3.s = i49;
                            ykVarB3.v = i50;
                            if (i51 == Integer.MAX_VALUE) {
                                i51 = 0;
                            }
                            ykVarB3.w = i51;
                            ykVarB3.x = f10;
                            if (f10 > f2 && f10 < 1.0f && i49 == 0) {
                                ykVarB3.s = 2;
                            }
                            int i52 = zkVar2.L;
                            int i53 = zkVar2.N;
                            int i54 = zkVar2.P;
                            float f11 = zkVar2.R;
                            ykVarB3.t = i52;
                            ykVarB3.y = i53;
                            if (i54 == Integer.MAX_VALUE) {
                                i54 = 0;
                            }
                            ykVarB3.z = i54;
                            ykVarB3.A = f11;
                            if (f11 > f2 && f11 < 1.0f && i52 == 0) {
                                ykVarB3.t = 2;
                            }
                        }
                    }
                }
                return;
            }
            View childAt7 = constraintLayout2.getChildAt(i2);
            if (childAt7 instanceof zx) {
                throw null;
            }
            i2++;
            i = i26;
        }
    }

    private final void i(yk ykVar, zk zkVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        yk ykVar2 = (yk) sparseArray.get(i);
        if (ykVar2 == null || view == null || !(view.getLayoutParams() instanceof zk)) {
            return;
        }
        zkVar.ab = true;
        if (i2 == 6) {
            zk zkVar2 = (zk) view.getLayoutParams();
            zkVar2.ab = true;
            zkVar2.aq.F = true;
        }
        ykVar.L(6).j(ykVar2.L(i2), zkVar.C, zkVar.B);
        ykVar.F = true;
        ykVar.L(3).d();
        ykVar.L(5).d();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    public final yk b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof zk) {
            return ((zk) view.getLayoutParams()).aq;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof zk) {
            return ((zk) view.getLayoutParams()).aq;
        }
        return null;
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zk;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = Integer.parseInt(strArrSplit[3]);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        int i8 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i7;
                        float f2 = i8;
                        float f3 = i7 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i8 + ((int) ((i6 / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public final Object e(Object obj) {
        HashMap map;
        if ((obj instanceof String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.View
    public final void forceLayout() {
        g();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new zk(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new zk(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            zk zkVar = (zk) childAt.getLayoutParams();
            yk ykVar = zkVar.aq;
            if (childAt.getVisibility() != 8 || zkVar.ac || zkVar.ad) {
                boolean z2 = zkVar.ae;
                int iK = ykVar.k();
                int iL = ykVar.l();
                childAt.layout(iK, iL, ykVar.j() + iK, ykVar.h() + iL);
                if (!(childAt instanceof zx)) {
                    throw null;
                }
            } else {
                boolean z3 = zkVar.af;
                if (zIsInEditMode) {
                    boolean z4 = zkVar.ae;
                    int iK2 = ykVar.k();
                    int iL2 = ykVar.l();
                    childAt.layout(iK2, iL2, ykVar.j() + iK2, ykVar.h() + iL2);
                    if (!(childAt instanceof zx)) {
                        throw null;
                    }
                } else {
                    continue;
                }
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0212  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:147:0x0302 A[LOOP:11: B:143:0x02f1->B:147:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0308  */
    /* JADX WARN: Code duplicated, block: B:153:0x032a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0347  */
    /* JADX WARN: Code duplicated, block: B:405:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x01fc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMax;
        int i3;
        int iMax2;
        int i4;
        boolean z;
        boolean z2;
        zl zlVar;
        boolean z3;
        int i5;
        boolean zV;
        int i6;
        yl ylVar;
        int i7;
        yl ylVar2;
        zl zlVar2;
        boolean z4;
        zc zcVar;
        ze zeVar;
        boolean z5;
        int i8;
        ArrayList arrayList;
        int size;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        ArrayList arrayList2;
        if (!this.d) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).isLayoutRequested()) {
                    this.d = true;
                    break;
                }
            }
        }
        this.c.d = c();
        if (this.d) {
            this.d = false;
            int childCount2 = getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                if (getChildAt(i12).isLayoutRequested()) {
                    h();
                    yl ylVar3 = this.c;
                    ylVar3.a.a(ylVar3);
                    break;
                }
            }
        }
        yl ylVar4 = this.c;
        int i13 = this.e;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i14 = iMax3 + iMax4;
        int iMax5 = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax6 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (iMax6 > 0) {
            iMax5 = iMax6;
        }
        zl zlVar3 = this.f;
        zlVar3.b = iMax3;
        zlVar3.c = iMax4;
        zlVar3.d = iMax5;
        zlVar3.e = i14;
        zlVar3.f = i;
        zlVar3.g = i2;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if (c()) {
            iMax7 = iMax8;
        }
        int i15 = size2 - iMax5;
        int i16 = size3 - i14;
        zl zlVar4 = this.f;
        int i17 = zlVar4.e;
        int i18 = zlVar4.d;
        int childCount3 = getChildCount();
        switch (mode) {
            case Integer.MIN_VALUE:
                if (childCount3 == 0) {
                    iMax = Math.max(0, this.g);
                    childCount3 = 0;
                } else {
                    iMax = i15;
                }
                i3 = 2;
                break;
            case 0:
                if (childCount3 == 0) {
                    iMax = Math.max(0, this.g);
                    childCount3 = 0;
                } else {
                    iMax = 0;
                }
                i3 = 2;
                break;
            case 1073741824:
                iMax = Math.min(this.i - i18, i15);
                i3 = 1;
                break;
            default:
                iMax = 0;
                i3 = 1;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                iMax2 = childCount3 == 0 ? Math.max(0, this.h) : i16;
                i4 = 2;
                break;
            case 0:
                iMax2 = childCount3 == 0 ? Math.max(0, this.h) : 0;
                i4 = 2;
                break;
            case 1073741824:
                iMax2 = Math.min(this.j - i17, i16);
                i4 = 1;
                break;
            default:
                iMax2 = 0;
                i4 = 1;
                break;
        }
        if (iMax != ylVar4.j() || iMax2 != ylVar4.h()) {
            ylVar4.b.c = true;
        }
        ylVar4.Y = 0;
        ylVar4.Z = 0;
        int i19 = this.i;
        int[] iArr = ylVar4.D;
        iArr[0] = i19 - i18;
        iArr[1] = this.j - i17;
        ylVar4.C(0);
        ylVar4.B(0);
        ylVar4.Q(i3);
        ylVar4.D(iMax);
        ylVar4.R(i4);
        ylVar4.y(iMax2);
        ylVar4.C(this.g - i18);
        ylVar4.B(this.h - i17);
        ylVar4.ar = iMax7;
        ylVar4.as = iMax3;
        yt ytVar = ylVar4.a;
        zl zlVar5 = ylVar4.aG;
        int size4 = ylVar4.aH.size();
        int iJ = ylVar4.j();
        int iH = ylVar4.h();
        boolean zB = yp.b(i13, 128);
        boolean z8 = zB || yp.b(i13, 64);
        if (z8) {
            int i20 = 0;
            while (true) {
                if (i20 < size4) {
                    yk ykVar = (yk) ylVar4.aH.get(i20);
                    boolean z9 = z8;
                    boolean z10 = ykVar.N() == 3 && ykVar.O() == 3 && ykVar.W > 0.0f;
                    if (ykVar.I()) {
                        if (z10) {
                            z = false;
                        } else {
                            z10 = false;
                            if (!ykVar.J()) {
                                if (ykVar instanceof yq) {
                                    z = false;
                                } else {
                                    if (ykVar.I()) {
                                    }
                                    z = false;
                                }
                            } else if (ykVar instanceof yq) {
                                z = false;
                            } else {
                                if (ykVar.I()) {
                                }
                                z = false;
                            }
                        }
                    } else if (!ykVar.J() && z10) {
                        z = false;
                    } else if (ykVar instanceof yq) {
                        z = false;
                    } else if (!ykVar.I() || ykVar.J()) {
                        z = false;
                    } else {
                        i20++;
                        z8 = z9;
                    }
                } else {
                    z = z8;
                }
            }
        } else {
            z = z8;
        }
        if (mode != 1073741824) {
            if (zB) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (mode2 != 1073741824) {
            mode = 1073741824;
            if (zB) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
            mode = 1073741824;
            mode2 = 1073741824;
        }
        boolean z11 = z & z2;
        if (z11) {
            int iMin = Math.min(ylVar4.D[0], i15);
            int iMin2 = Math.min(ylVar4.D[1], i16);
            boolean z12 = mode != 1073741824;
            if (mode == 1073741824 && ylVar4.j() != iMin) {
                ylVar4.D(iMin);
                ylVar4.c();
            }
            boolean z13 = mode2 != 1073741824;
            if (mode2 == 1073741824 && ylVar4.h() != iMin2) {
                ylVar4.y(iMin2);
                ylVar4.c();
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                yw ywVar = ylVar4.b;
                if (ywVar.b || ywVar.c) {
                    ArrayList arrayList3 = ywVar.a.aH;
                    int size5 = arrayList3.size();
                    for (int i21 = 0; i21 < size5; i21++) {
                        yk ykVar2 = (yk) arrayList3.get(i21);
                        ykVar2.r();
                        ykVar2.e = false;
                        ykVar2.h.g();
                        ykVar2.i.g();
                    }
                    ywVar.a.r();
                    yl ylVar5 = ywVar.a;
                    i8 = 0;
                    ylVar5.e = false;
                    ylVar5.h.g();
                    ywVar.a.i.g();
                    ywVar.c = false;
                } else {
                    i8 = 0;
                }
                ywVar.d(ywVar.d);
                yl ylVar6 = ywVar.a;
                ylVar6.Y = i8;
                ylVar6.Z = i8;
                int iM = ylVar6.M(i8);
                int iM2 = ywVar.a.M(1);
                if (ywVar.b) {
                    ywVar.b();
                }
                int iK = ywVar.a.k();
                int iL = ywVar.a.l();
                ywVar.a.h.i.c(iK);
                ywVar.a.i.i.c(iL);
                ywVar.c();
                if (iM == 2) {
                    if (zB) {
                        arrayList = ywVar.e;
                        size = arrayList.size();
                        z3 = z11;
                        i9 = 0;
                        while (true) {
                            if (i9 < size) {
                                i10 = i9 + 1;
                                if (!((zg) arrayList.get(i9)).e()) {
                                    i9 = i10;
                                }
                            } else {
                                if (iM == 2) {
                                    ywVar.a.Q(1);
                                    yl ylVar7 = ywVar.a;
                                    ylVar7.D(ywVar.a(ylVar7, 0));
                                    yl ylVar8 = ywVar.a;
                                    ylVar8.h.f.c(ylVar8.j());
                                    iM = 2;
                                }
                                if (iM2 == 2) {
                                    ywVar.a.R(1);
                                    yl ylVar9 = ywVar.a;
                                    ylVar9.y(ywVar.a(ylVar9, 1));
                                    yl ylVar10 = ywVar.a;
                                    ylVar10.i.f.c(ylVar10.h());
                                }
                            }
                        }
                    } else {
                        z3 = z11;
                    }
                } else if (iM2 == 2) {
                    iM2 = 2;
                    if (zB) {
                        arrayList = ywVar.e;
                        size = arrayList.size();
                        z3 = z11;
                        i9 = 0;
                        while (true) {
                            if (i9 < size) {
                                i10 = i9 + 1;
                                if (!((zg) arrayList.get(i9)).e()) {
                                    i9 = i10;
                                }
                            } else {
                                if (iM == 2) {
                                    ywVar.a.Q(1);
                                    yl ylVar11 = ywVar.a;
                                    ylVar11.D(ywVar.a(ylVar11, 0));
                                    yl ylVar12 = ywVar.a;
                                    ylVar12.h.f.c(ylVar12.j());
                                    iM = 2;
                                }
                                if (iM2 == 2) {
                                    ywVar.a.R(1);
                                    yl ylVar13 = ywVar.a;
                                    ylVar13.y(ywVar.a(ylVar13, 1));
                                    yl ylVar14 = ywVar.a;
                                    ylVar14.i.f.c(ylVar14.h());
                                }
                            }
                        }
                    } else {
                        z3 = z11;
                    }
                } else {
                    z3 = z11;
                }
                yl ylVar15 = ywVar.a;
                int i22 = ylVar15.ap[0];
                if (i22 == 1 || i22 == 4) {
                    int iJ2 = ylVar15.j() + iK;
                    ywVar.a.h.j.c(iJ2);
                    ywVar.a.h.f.c(iJ2 - iK);
                    ywVar.c();
                    yl ylVar16 = ywVar.a;
                    int i23 = ylVar16.ap[1];
                    if (i23 == 1 || i23 == 4) {
                        int iH2 = ylVar16.h() + iL;
                        ywVar.a.i.j.c(iH2);
                        ywVar.a.i.f.c(iH2 - iL);
                    }
                    ywVar.c();
                    z6 = true;
                } else {
                    z6 = false;
                }
                ArrayList arrayList4 = ywVar.e;
                int size6 = arrayList4.size();
                int i24 = 0;
                while (i24 < size6) {
                    zg zgVar = (zg) arrayList4.get(i24);
                    ArrayList arrayList5 = arrayList4;
                    int i25 = size6;
                    if (zgVar.d != ywVar.a || zgVar.h) {
                        zgVar.c();
                    }
                    i24++;
                    arrayList4 = arrayList5;
                    size6 = i25;
                }
                ArrayList arrayList6 = ywVar.e;
                int size7 = arrayList6.size();
                int i26 = 0;
                while (true) {
                    if (i26 < size7) {
                        zg zgVar2 = (zg) arrayList6.get(i26);
                        if (z6) {
                            z7 = z6;
                            arrayList2 = arrayList6;
                        } else {
                            z7 = z6;
                            arrayList2 = arrayList6;
                            if (zgVar2.d == ywVar.a) {
                                continue;
                            }
                            i26++;
                            z6 = z7;
                            arrayList6 = arrayList2;
                        }
                        if (!zgVar2.i.i) {
                            zV = false;
                        } else if (!zgVar2.j.i && !(zgVar2 instanceof za)) {
                            zV = false;
                        } else if (zgVar2.f.i || (zgVar2 instanceof yu) || (zgVar2 instanceof za)) {
                            i26++;
                            z6 = z7;
                            arrayList6 = arrayList2;
                        } else {
                            zV = false;
                        }
                    } else {
                        zV = true;
                    }
                }
                ywVar.a.Q(iM);
                ywVar.a.R(iM2);
                zlVar = zlVar5;
                z5 = true;
                i5 = 2;
            } else {
                z3 = z11;
                yw ywVar2 = ylVar4.b;
                if (ywVar2.b) {
                    ArrayList arrayList7 = ywVar2.a.aH;
                    int size8 = arrayList7.size();
                    int i27 = 0;
                    while (i27 < size8) {
                        yk ykVar3 = (yk) arrayList7.get(i27);
                        ykVar3.r();
                        ykVar3.e = false;
                        int i28 = size8;
                        zc zcVar2 = ykVar3.h;
                        zcVar2.f.i = false;
                        zcVar2.h = false;
                        zcVar2.g();
                        ze zeVar2 = ykVar3.i;
                        zeVar2.f.i = false;
                        zeVar2.h = false;
                        zeVar2.g();
                        i27++;
                        size8 = i28;
                        arrayList7 = arrayList7;
                        zlVar5 = zlVar5;
                    }
                    zlVar = zlVar5;
                    ywVar2.a.r();
                    yl ylVar17 = ywVar2.a;
                    ylVar17.e = false;
                    zc zcVar3 = ylVar17.h;
                    zcVar3.f.i = false;
                    zcVar3.h = false;
                    zcVar3.g();
                    ze zeVar3 = ywVar2.a.i;
                    zeVar3.f.i = false;
                    zeVar3.h = false;
                    zeVar3.g();
                    ywVar2.b();
                } else {
                    zlVar = zlVar5;
                }
                ywVar2.d(ywVar2.d);
                yl ylVar18 = ywVar2.a;
                ylVar18.Y = 0;
                ylVar18.Z = 0;
                ylVar18.h.i.c(0);
                ywVar2.a.i.i.c(0);
                if (mode == 1073741824) {
                    zV = ylVar4.V(zB, 0);
                    i5 = 1;
                } else {
                    i5 = 0;
                    zV = true;
                }
                if (mode2 == 1073741824) {
                    z5 = true;
                    zV &= ylVar4.V(zB, 1);
                    i5++;
                } else {
                    z5 = true;
                }
            }
            if (zV) {
                ylVar4.E(!z12, z13 ^ z5);
            }
        } else {
            zlVar = zlVar5;
            z3 = z11;
            i5 = 0;
            zV = false;
        }
        if (!zV || i5 != 2) {
            int i29 = ylVar4.ax;
            if (size4 > 0) {
                int size9 = ylVar4.aH.size();
                boolean zW = ylVar4.W(64);
                zl zlVar6 = ylVar4.aG;
                for (int i30 = 0; i30 < size9; i30++) {
                    yk ykVar4 = (yk) ylVar4.aH.get(i30);
                    if (!(ykVar4 instanceof yn) && !(ykVar4 instanceof yh)) {
                        boolean z14 = ykVar4.G;
                        if (!zW || (zcVar = ykVar4.h) == null || (zeVar = ykVar4.i) == null || !zcVar.f.i || !zeVar.f.i) {
                            int iM3 = ykVar4.M(0);
                            int iM4 = ykVar4.M(1);
                            if (iM3 != 3) {
                                z4 = false;
                            } else if (ykVar4.s == 1 || iM4 != 3) {
                                z4 = false;
                                iM3 = 3;
                            } else if (ykVar4.t != 1) {
                                z4 = true;
                                iM3 = 3;
                                iM4 = 3;
                            } else {
                                z4 = false;
                                iM3 = 3;
                                iM4 = 3;
                            }
                            if (!z4) {
                                if (ylVar4.W(1) && !(ykVar4 instanceof yq)) {
                                    boolean z15 = iM3 == 3 && ykVar4.s == 0 && iM4 != 3 && !ykVar4.I();
                                    if (iM4 == 3 && ykVar4.t == 0 && iM3 != 3 && !ykVar4.I()) {
                                        z15 = true;
                                    }
                                    if ((iM3 != 3 && iM4 != 3) || ykVar4.W <= 0.0f) {
                                        if (!z15) {
                                        }
                                    }
                                }
                                ytVar.c(zlVar6, ykVar4, 0);
                            }
                        }
                    }
                }
                int childCount4 = zlVar6.a.getChildCount();
                for (int i31 = 0; i31 < childCount4; i31++) {
                    View childAt = zlVar6.a.getChildAt(i31);
                    if (childAt instanceof zx) {
                        ConstraintLayout constraintLayout = zlVar6.a;
                        throw null;
                    }
                }
                int size10 = zlVar6.a.b.size();
                if (size10 > 0) {
                    for (int i32 = 0; i32 < size10; i32++) {
                        ConstraintLayout constraintLayout2 = zlVar6.a;
                    }
                }
            }
            ytVar.a(ylVar4);
            int size11 = ytVar.a.size();
            if (size4 > 0) {
                ytVar.b(ylVar4, 0, iJ, iH);
            }
            if (size11 > 0) {
                int iN = ylVar4.N();
                int iO = ylVar4.O();
                int iMax9 = Math.max(ylVar4.j(), ytVar.b.ab);
                int iMax10 = Math.max(ylVar4.h(), ytVar.b.ac);
                int i33 = 0;
                boolean z16 = false;
                while (i33 < size11) {
                    yk ykVar5 = (yk) ytVar.a.get(i33);
                    if (ykVar5 instanceof yq) {
                        int iJ3 = ykVar5.j();
                        int iH3 = ykVar5.h();
                        zlVar2 = zlVar;
                        boolean zC = z16 | ytVar.c(zlVar2, ykVar5, 1);
                        int iJ4 = ykVar5.j();
                        boolean z17 = zC;
                        int iH4 = ykVar5.h();
                        if (iJ4 != iJ3) {
                            ykVar5.D(iJ4);
                            if (iN == 2 && ykVar5.i() > iMax9) {
                                iMax9 = Math.max(iMax9, ykVar5.i() + ykVar5.L(4).b());
                            }
                            z17 = true;
                        }
                        if (iH4 != iH3) {
                            ykVar5.y(iH4);
                            if (iO == 2 && ykVar5.g() > iMax10) {
                                iMax10 = Math.max(iMax10, ykVar5.g() + ykVar5.L(5).b());
                            }
                            z17 = true;
                        }
                        z16 = z17;
                    } else {
                        zlVar2 = zlVar;
                    }
                    i33++;
                    zlVar = zlVar2;
                    i29 = i29;
                }
                i6 = i29;
                zl zlVar7 = zlVar;
                int i34 = 0;
                while (true) {
                    if (i34 < 2) {
                        int i35 = 0;
                        while (i35 < size11) {
                            yk ykVar6 = (yk) ytVar.a.get(i35);
                            if (((ykVar6 instanceof yo) && !(ykVar6 instanceof yq)) || (ykVar6 instanceof yn) || ykVar6.ag == 8 || ((z3 && ykVar6.h.f.i && ykVar6.i.f.i) || (ykVar6 instanceof yq))) {
                                i7 = size11;
                                ylVar2 = ylVar4;
                            } else {
                                int iJ5 = ykVar6.j();
                                int iH5 = ykVar6.h();
                                i7 = size11;
                                int i36 = ykVar6.aa;
                                ylVar2 = ylVar4;
                                boolean zC2 = ytVar.c(zlVar7, ykVar6, i34 == 1 ? 2 : 1) | z16;
                                int iJ6 = ykVar6.j();
                                boolean z18 = zC2;
                                int iH6 = ykVar6.h();
                                if (iJ6 != iJ5) {
                                    ykVar6.D(iJ6);
                                    if (iN == 2 && ykVar6.i() > iMax9) {
                                        iMax9 = Math.max(iMax9, ykVar6.i() + ykVar6.L(4).b());
                                    }
                                    z18 = true;
                                }
                                if (iH6 != iH5) {
                                    ykVar6.y(iH6);
                                    if (iO == 2 && ykVar6.g() > iMax10) {
                                        iMax10 = Math.max(iMax10, ykVar6.g() + ykVar6.L(5).b());
                                    }
                                    z18 = true;
                                }
                                z16 = (!ykVar6.F || i36 == ykVar6.aa) ? z18 : true;
                            }
                            i35++;
                            size11 = i7;
                            ylVar4 = ylVar2;
                        }
                        int i37 = size11;
                        yl ylVar19 = ylVar4;
                        if (z16) {
                            i34++;
                            ytVar.b(ylVar19, i34, iJ, iH);
                            ylVar4 = ylVar19;
                            size11 = i37;
                            z16 = false;
                        } else {
                            ylVar = ylVar19;
                        }
                    } else {
                        ylVar = ylVar4;
                    }
                }
            } else {
                i6 = i29;
                ylVar = ylVar4;
            }
            ylVar.U(i6);
        }
        int iJ7 = this.c.j();
        int iH7 = this.c.h();
        yl ylVar20 = this.c;
        boolean z19 = ylVar20.ay;
        boolean z20 = ylVar20.az;
        zl zlVar8 = this.f;
        int i38 = zlVar8.e;
        int iResolveSizeAndState = resolveSizeAndState(iJ7 + zlVar8.d, i, 0);
        int iResolveSizeAndState2 = resolveSizeAndState(iH7 + i38, i2, 0);
        int iMin3 = Math.min(this.i, iResolveSizeAndState & 16777215);
        int iMin4 = Math.min(this.j, iResolveSizeAndState2 & 16777215);
        if (z19) {
            iMin3 |= 16777216;
        }
        if (z20) {
            iMin4 |= 16777216;
        }
        setMeasuredDimension(iMin3, iMin4);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        yk ykVarB = b(view);
        if ((view instanceof zw) && !(ykVarB instanceof yn)) {
            zk zkVar = (zk) view.getLayoutParams();
            zkVar.aq = new yn();
            zkVar.ac = true;
            ((yn) zkVar.aq).c(zkVar.U);
        }
        if (view instanceof zi) {
            zi ziVar = (zi) view;
            ziVar.h();
            ((zk) view.getLayoutParams()).ad = true;
            if (!this.b.contains(ziVar)) {
                this.b.add(ziVar);
            }
        }
        this.a.put(view.getId(), view);
        this.d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(b(view));
        this.b.remove(view);
        this.d = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        g();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
