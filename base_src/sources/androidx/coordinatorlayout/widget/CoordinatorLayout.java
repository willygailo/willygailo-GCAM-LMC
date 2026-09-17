package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.aab;
import defpackage.aac;
import defpackage.aad;
import defpackage.aae;
import defpackage.aaf;
import defpackage.aag;
import defpackage.aah;
import defpackage.aai;
import defpackage.aaj;
import defpackage.aak;
import defpackage.aal;
import defpackage.fc;
import defpackage.fe;
import defpackage.fr;
import defpackage.fs;
import defpackage.ft;
import defpackage.gl;
import defpackage.gy;
import defpackage.px;
import defpackage.yc;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements fr, fs {
    static final String a;
    static final Class[] b;
    static final ThreadLocal c;
    static final Comparator d;
    private static final fc i;
    public final aak e;
    public gy f;
    public boolean g;
    public ViewGroup.OnHierarchyChangeListener h;
    private final List j;
    private final List k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private aai s;
    private boolean t;
    private Drawable u;
    private ft v;
    private final px w;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new yc(2);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        i = new fe(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = new ArrayList();
        this.e = new aak();
        this.k = new ArrayList();
        this.l = new int[2];
        this.m = new int[2];
        this.w = new px();
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, aab.a, 0, 2132084507) : context.obtainStyledAttributes(attributeSet, aab.a, i2, 0);
        if (i2 == 0) {
            gl.E(this, context, aab.a, attributeSet, typedArrayObtainStyledAttributes, 0, 2132084507);
        } else {
            gl.E(this, context, aab.a, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.p;
                iArr[i3] = (int) (iArr[i3] * f);
            }
        }
        this.u = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new aag(this));
        if (gl.d(this) == 0) {
            gl.M(this, 1);
        }
    }

    private static final MotionEvent A(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void B(View view, int i2) {
        aah aahVar = (aah) view.getLayoutParams();
        int i3 = aahVar.i;
        if (i3 != i2) {
            gl.x(view, i2 - i3);
            aahVar.i = i2;
        }
    }

    private static final void C(View view, int i2) {
        aah aahVar = (aah) view.getLayoutParams();
        int i3 = aahVar.j;
        if (i3 != i2) {
            gl.y(view, i2 - i3);
            aahVar.j = i2;
        }
    }

    public static aae g(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = c;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (aae) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final aah n(View view) {
        aah aahVar = (aah) view.getLayoutParams();
        if (!aahVar.b) {
            if (view instanceof aad) {
                aahVar.b(((aad) view).a());
                aahVar.b = true;
            } else {
                aaf aafVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    aafVar = (aaf) superclass.getAnnotation(aaf.class);
                    if (aafVar != null) {
                        break;
                    }
                }
                if (aafVar != null) {
                    try {
                        aahVar.b((aae) aafVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + aafVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                aahVar.b = true;
            }
        }
        return aahVar;
    }

    private final int p(int i2) {
        int[] iArr = this.p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private static int q(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int r(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect s() {
        Rect rect = (Rect) i.a();
        return rect == null ? new Rect() : rect;
    }

    private final void t(aah aahVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + aahVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - aahVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + aahVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - aahVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void u(Rect rect) {
        rect.setEmpty();
        i.b(rect);
    }

    private final void v() {
        View view = this.q;
        if (view != null) {
            aae aaeVar = ((aah) view.getLayoutParams()).a;
            if (aaeVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                aaeVar.g(this, this.q, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.q = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((aah) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.n = false;
    }

    private final void w() {
        if (!gl.R(this)) {
            gl.N(this, null);
            return;
        }
        if (this.v == null) {
            this.v = new aac(this);
        }
        gl.N(this, this.v);
        setSystemUiVisibility(1280);
    }

    private final boolean x(aae aaeVar, View view, MotionEvent motionEvent, int i2) {
        switch (i2) {
            case 0:
                return aaeVar.d(this, view, motionEvent);
            default:
                return aaeVar.g(this, view, motionEvent);
        }
    }

    private final boolean y(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.k;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventA = null;
        boolean zX = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            aah aahVar = (aah) view.getLayoutParams();
            aae aaeVar = aahVar.a;
            if (!zX || actionMasked == 0) {
                if (!zX && aaeVar != null && (zX = x(aaeVar, view, motionEvent, i2))) {
                    this.q = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            aae aaeVar2 = ((aah) view2.getLayoutParams()).a;
                            if (aaeVar2 != null) {
                                if (motionEventA == null) {
                                    motionEventA = A(motionEvent);
                                }
                                x(aaeVar2, view2, motionEventA, i2);
                            }
                        }
                    }
                }
                if (aahVar.a == null) {
                    aahVar.m = false;
                }
                boolean z = aahVar.m;
            } else if (aaeVar != null) {
                if (motionEventA == null) {
                    motionEventA = A(motionEvent);
                }
                x(aaeVar, view, motionEventA, i2);
            }
        }
        list.clear();
        if (motionEventA != null) {
            motionEventA.recycle();
        }
        return zX;
    }

    private static final void z(int i2, Rect rect, Rect rect2, aah aahVar, int i3, int i4) {
        int iWidth;
        int iHeight;
        int i5 = aahVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(q(aahVar.d), i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 112;
        switch (absoluteGravity2 & 7) {
            case 1:
                iWidth = rect.left + (rect.width() / 2);
                break;
            case 5:
                iWidth = rect.right;
                break;
            default:
                iWidth = rect.left;
                break;
        }
        switch (i8) {
            case 16:
                iHeight = (rect.height() / 2) + rect.top;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                iHeight = rect.bottom;
                break;
            default:
                iHeight = rect.top;
                break;
        }
        switch (i6) {
            case 1:
                iWidth -= i3 / 2;
                break;
            case 5:
                break;
            default:
                iWidth -= i3;
                break;
        }
        switch (i7) {
            case 16:
                iHeight -= i4 / 2;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                break;
            default:
                iHeight -= i4;
                break;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    @Override // defpackage.fr
    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        aae aaeVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                aah aahVar = (aah) childAt.getLayoutParams();
                if (aahVar.d(i4) && (aaeVar = aahVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aaeVar.m(this, childAt, view, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, this.l[0]) : Math.min(iMax, this.l[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, this.l[1]) : Math.min(iMax2, this.l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            k(1);
        }
    }

    @Override // defpackage.fr
    public final void b(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.m);
    }

    @Override // defpackage.fr
    public final void c(View view, View view2, int i2, int i3) {
        this.w.c(i2, i3);
        this.r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            aah aahVar = (aah) getChildAt(i4).getLayoutParams();
            if (aahVar.d(i3)) {
                aae aaeVar = aahVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aah) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.fr
    public final void d(View view, int i2) {
        this.w.d(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            aah aahVar = (aah) childAt.getLayoutParams();
            if (aahVar.d(i2)) {
                aae aaeVar = aahVar.a;
                if (aaeVar != null) {
                    aaeVar.c(this, childAt, view, i2);
                }
                aahVar.c(i2, false);
                aahVar.a();
            }
        }
        this.r = null;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        aae aaeVar = ((aah) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.fr
    public final boolean e(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                aah aahVar = (aah) childAt.getLayoutParams();
                aae aaeVar = aahVar.a;
                if (aaeVar != null) {
                    boolean zQ = aaeVar.q(this, childAt, view, i2, i3);
                    z |= zQ;
                    aahVar.c(i3, zQ);
                } else {
                    aahVar.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // defpackage.fs
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        aae aaeVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                aah aahVar = (aah) childAt.getLayoutParams();
                if (aahVar.d(i6) && (aaeVar = aahVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aaeVar.n(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, this.l[0]) : Math.min(iMax, this.l[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, this.l[1]) : Math.min(iMax2, this.l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            k(1);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aah();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aah(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aah) {
            return new aah((aah) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new aah((ViewGroup.MarginLayoutParams) layoutParams) : new aah(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.w.b();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final List h(View view) {
        aak aakVar = this.e;
        int i2 = aakVar.b.j;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) aakVar.b.i(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aakVar.b.f(i3));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final void i(View view) {
        ArrayList arrayListA = this.e.a(view);
        if (arrayListA == null || arrayListA.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            View view2 = (View) arrayListA.get(i2);
            aae aaeVar = ((aah) view2.getLayoutParams()).a;
            if (aaeVar != null) {
                aaeVar.i(this, view2, view);
            }
        }
    }

    final void j(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            aal.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void k(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int height;
        int i6;
        aae aaeVar;
        int iF = gl.f(this);
        int size = this.j.size();
        Rect rectS = s();
        Rect rectS2 = s();
        Rect rectS3 = s();
        int i7 = 0;
        while (i7 < size) {
            View view = (View) this.j.get(i7);
            aah aahVar = (aah) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = rectS3;
                i3 = i7;
            } else {
                int i8 = 0;
                while (i8 < i7) {
                    if (aahVar.l == ((View) this.j.get(i8))) {
                        aah aahVar2 = (aah) view.getLayoutParams();
                        if (aahVar2.k != null) {
                            Rect rectS4 = s();
                            Rect rectS5 = s();
                            Rect rectS6 = s();
                            aal.a(this, aahVar2.k, rectS4);
                            j(view, false, rectS5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            z(iF, rectS4, rectS6, aahVar2, measuredWidth, measuredHeight);
                            boolean z4 = (rectS6.left == rectS5.left && rectS6.top == rectS5.top) ? false : true;
                            t(aahVar2, rectS6, measuredWidth, measuredHeight);
                            int i9 = rectS6.left - rectS5.left;
                            int i10 = rectS6.top - rectS5.top;
                            if (i9 != 0) {
                                gl.x(view, i9);
                            }
                            if (i10 != 0) {
                                gl.y(view, i10);
                            }
                            if (z4 && (aaeVar = aahVar2.a) != null) {
                                aaeVar.i(this, view, aahVar2.k);
                            }
                            u(rectS4);
                            u(rectS5);
                            u(rectS6);
                        }
                    }
                    i8++;
                    size = size;
                    i7 = i7;
                    rectS3 = rectS3;
                    aahVar = aahVar;
                }
                aah aahVar3 = aahVar;
                int i11 = size;
                Rect rect2 = rectS3;
                i3 = i7;
                j(view, true, rectS2);
                if (aahVar3.g != 0 && !rectS2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(aahVar3.g, iF);
                    switch (absoluteGravity & 112) {
                        case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            rectS.top = Math.max(rectS.top, rectS2.bottom);
                            break;
                        case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                            rectS.bottom = Math.max(rectS.bottom, getHeight() - rectS2.top);
                            break;
                    }
                    switch (absoluteGravity & 7) {
                        case 3:
                            rectS.left = Math.max(rectS.left, rectS2.right);
                            break;
                        case 5:
                            rectS.right = Math.max(rectS.right, getWidth() - rectS2.left);
                            break;
                    }
                }
                if (aahVar3.h != 0 && view.getVisibility() == 0 && gl.V(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    aah aahVar4 = (aah) view.getLayoutParams();
                    aae aaeVar2 = aahVar4.a;
                    Rect rectS7 = s();
                    Rect rectS8 = s();
                    rectS8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (aaeVar2 == null || !aaeVar2.r(view, rectS7)) {
                        rectS7.set(rectS8);
                    } else if (!rectS8.contains(rectS7)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectS7.toShortString() + " | Bounds:" + rectS8.toShortString());
                    }
                    u(rectS8);
                    if (rectS7.isEmpty()) {
                        u(rectS7);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(aahVar4.h, iF);
                        if ((absoluteGravity2 & 48) != 48 || (i6 = (rectS7.top - aahVar4.topMargin) - aahVar4.j) >= rectS.top) {
                            z2 = false;
                        } else {
                            C(view, rectS.top - i6);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectS7.bottom) - aahVar4.bottomMargin) + aahVar4.j) < rectS.bottom) {
                            C(view, height - rectS.bottom);
                        } else if (!z2) {
                            C(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i5 = (rectS7.left - aahVar4.leftMargin) - aahVar4.i) >= rectS.left) {
                            z3 = false;
                        } else {
                            B(view, rectS.left - i5);
                            z3 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectS7.right) - aahVar4.rightMargin) + aahVar4.i) < rectS.right) {
                            B(view, width - rectS.right);
                        } else if (!z3) {
                            B(view, 0);
                        }
                        u(rectS7);
                    }
                }
                if (i2 != 2) {
                    rect = rect2;
                    rect.set(((aah) view.getLayoutParams()).p);
                    if (rect.equals(rectS2)) {
                        i4 = i11;
                    } else {
                        ((aah) view.getLayoutParams()).p.set(rectS2);
                    }
                } else {
                    rect = rect2;
                }
                int i12 = i3 + 1;
                while (true) {
                    i4 = i11;
                    if (i12 < i4) {
                        View view2 = (View) this.j.get(i12);
                        aah aahVar5 = (aah) view2.getLayoutParams();
                        aae aaeVar3 = aahVar5.a;
                        if (aaeVar3 != null && aaeVar3.h(view)) {
                            if (i2 == 0 && aahVar5.o) {
                                aahVar5.a();
                            } else {
                                switch (i2) {
                                    case 2:
                                        aaeVar3.j(this, view);
                                        z = true;
                                        break;
                                    default:
                                        aaeVar3.i(this, view2, view);
                                        z = false;
                                        break;
                                }
                                if (i2 == 1) {
                                    aahVar5.o = z;
                                }
                            }
                        }
                        i12++;
                        i11 = i4;
                    }
                }
            }
            i7 = i3 + 1;
            size = i4;
            rectS3 = rect;
        }
        u(rectS);
        u(rectS2);
        u(rectS3);
    }

    public final void l(View view, int i2) {
        int i3;
        aah aahVar = (aah) view.getLayoutParams();
        View view2 = aahVar.k;
        if (view2 == null && aahVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            Rect rectS = s();
            Rect rectS2 = s();
            try {
                aal.a(this, view2, rectS);
                aah aahVar2 = (aah) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                z(i2, rectS, rectS2, aahVar2, measuredWidth, measuredHeight);
                t(aahVar2, rectS2, measuredWidth, measuredHeight);
                view.layout(rectS2.left, rectS2.top, rectS2.right, rectS2.bottom);
                return;
            } finally {
                u(rectS);
                u(rectS2);
            }
        }
        int i4 = aahVar.e;
        if (i4 < 0) {
            aah aahVar3 = (aah) view.getLayoutParams();
            Rect rectS3 = s();
            rectS3.set(getPaddingLeft() + aahVar3.leftMargin, getPaddingTop() + aahVar3.topMargin, (getWidth() - getPaddingRight()) - aahVar3.rightMargin, (getHeight() - getPaddingBottom()) - aahVar3.bottomMargin);
            if (this.f != null && gl.R(this) && !gl.R(view)) {
                rectS3.left += this.f.b();
                rectS3.top += this.f.d();
                rectS3.right -= this.f.c();
                rectS3.bottom -= this.f.a();
            }
            Rect rectS4 = s();
            Gravity.apply(q(aahVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectS3, rectS4, i2);
            view.layout(rectS4.left, rectS4.top, rectS4.right, rectS4.bottom);
            u(rectS3);
            u(rectS4);
            return;
        }
        aah aahVar4 = (aah) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(r(aahVar4.c), i2);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int iP = p(i4) - measuredWidth2;
        switch (i5) {
            case 1:
                iP += measuredWidth2 / 2;
                break;
            case 5:
                iP += measuredWidth2;
                break;
        }
        switch (i6) {
            case 16:
                i3 = measuredHeight2 / 2;
                break;
            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                i3 = measuredHeight2;
                break;
            default:
                i3 = 0;
                break;
        }
        int iMax = Math.max(getPaddingLeft() + aahVar4.leftMargin, Math.min(iP, ((width - getPaddingRight()) - measuredWidth2) - aahVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + aahVar4.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - aahVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean m(View view, int i2, int i3) {
        Rect rectS = s();
        aal.a(this, view, rectS);
        try {
            return rectS.contains(i2, i3);
        } finally {
            u(rectS);
        }
    }

    public final void o(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        if (this.t) {
            if (this.s == null) {
                this.s = new aai(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.f == null && gl.R(this)) {
            gl.D(this);
        }
        this.o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.o = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.g || this.u == null) {
            return;
        }
        gy gyVar = this.f;
        int iD = gyVar != null ? gyVar.d() : 0;
        if (iD > 0) {
            this.u.setBounds(0, 0, getWidth(), iD);
            this.u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v();
            actionMasked = 0;
        }
        boolean zY = y(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            v();
        }
        return zY;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        aae aaeVar;
        int iF = gl.f(this);
        int size = this.j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.j.get(i6);
            if (view.getVisibility() != 8 && ((aaeVar = ((aah) view.getLayoutParams()).a) == null || !aaeVar.e(this, view, iF))) {
                l(view, iF);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0099
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.View
    protected final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                aah aahVar = (aah) childAt.getLayoutParams();
                if (aahVar.n) {
                    aae aaeVar = aahVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        aae aaeVar;
        int childCount = getChildCount();
        boolean zL = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                aah aahVar = (aah) childAt.getLayoutParams();
                if (aahVar.n && (aaeVar = aahVar.a) != null) {
                    zL |= aaeVar.l(view);
                }
            }
        }
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        b(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof aaj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aaj aajVar = (aaj) parcelable;
        super.onRestoreInstanceState(aajVar.d);
        SparseArray sparseArray = aajVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            aae aaeVar = n(childAt).a;
            if (id != -1 && aaeVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aaeVar.o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableP;
        aaj aajVar = new aaj(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            aae aaeVar = ((aah) childAt.getLayoutParams()).a;
            if (id != -1 && aaeVar != null && (parcelableP = aaeVar.p(childAt)) != null) {
                sparseArray.append(id, parcelableP);
            }
        }
        aajVar.a = sparseArray;
        return aajVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return e(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zY;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.q;
        boolean z = false;
        if (view != null) {
            aae aaeVar = ((aah) view.getLayoutParams()).a;
            zY = aaeVar != null ? aaeVar.g(this, this.q, motionEvent) : false;
        } else {
            zY = y(motionEvent, 1);
            if (actionMasked != 0 && zY) {
                z = true;
            }
        }
        if (this.q == null || actionMasked == 3) {
            zY |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventA = A(motionEvent);
            super.onTouchEvent(motionEventA);
            motionEventA.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            v();
        }
        return zY;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        aae aaeVar = ((aah) view.getLayoutParams()).a;
        if (aaeVar == null || !aaeVar.f(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.n) {
            return;
        }
        if (this.q == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                aae aaeVar = ((aah) childAt.getLayoutParams()).a;
                if (aaeVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    aaeVar.d(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        v();
        this.n = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.h = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.u;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.u.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }
}
