package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.bottombar.R;
import defpackage.gl;
import defpackage.jq;
import defpackage.pa;
import defpackage.rn;
import defpackage.sd;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        rn rnVarQ = rn.q(context, attributeSet, jq.m, i);
        gl.E(this, context, jq.m, attributeSet, rnVarQ.b, i, 0);
        int iC = rnVarQ.c(1, -1);
        if (iC >= 0) {
            q(iC);
        }
        int iC2 = rnVarQ.c(0, -1);
        if (iC2 >= 0 && this.f != iC2) {
            iC2 = (8388615 & iC2) == 0 ? iC2 | 8388611 : iC2;
            this.f = (iC2 & 112) == 0 ? iC2 | 48 : iC2;
            requestLayout();
        }
        if (!rnVarQ.o(2, true)) {
            s();
        }
        this.i = rnVarQ.b.getFloat(4, -1.0f);
        this.b = rnVarQ.c(3, -1);
        this.j = rnVarQ.o(7, false);
        Drawable drawableH = rnVarQ.h(5);
        if (drawableH != this.g) {
            this.g = drawableH;
            if (drawableH != null) {
                this.h = drawableH.getIntrinsicWidth();
                this.m = drawableH.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(drawableH == null);
            requestLayout();
        }
        this.n = rnVarQ.c(8, 0);
        this.o = rnVarQ.b(6, 0);
        rnVarQ.n();
    }

    private static void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pa;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public pa generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new pa(-2);
        }
        if (i == 1) {
            return new pa(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: gB, reason: merged with bridge method [inline-methods] */
    public pa generateLayoutParams(AttributeSet attributeSet) {
        return new pa(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: gC, reason: merged with bridge method [inline-methods] */
    public pa generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new pa(layoutParams);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.d == 1 && (i = this.f & 112) != 48) {
            switch (i) {
                case 16:
                    bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
                    break;
            }
        }
        return bottom + ((pa) childAt.getLayoutParams()).topMargin + baseline;
    }

    final void o(Canvas canvas, int i) {
        this.g.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.g.draw(canvas);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int left;
        int bottom;
        if (this.g == null) {
            return;
        }
        int i = 0;
        if (this.d == 1) {
            int childCount = getChildCount();
            while (i < childCount) {
                View childAt = getChildAt(i);
                if (childAt != null && childAt.getVisibility() != 8 && r(i)) {
                    o(canvas, (childAt.getTop() - ((pa) childAt.getLayoutParams()).topMargin) - this.m);
                }
                i++;
            }
            if (r(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.m;
                } else {
                    bottom = childAt2.getBottom() + ((pa) childAt2.getLayoutParams()).bottomMargin;
                }
                o(canvas, bottom);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean zB = sd.b(this);
        while (i < childCount2) {
            View childAt3 = getChildAt(i);
            if (childAt3 != null && childAt3.getVisibility() != 8 && r(i)) {
                pa paVar = (pa) childAt3.getLayoutParams();
                p(canvas, zB ? childAt3.getRight() + paVar.rightMargin : (childAt3.getLeft() - paVar.leftMargin) - this.h);
            }
            i++;
        }
        if (r(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 == null) {
                left = zB ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.h;
            } else {
                pa paVar2 = (pa) childAt4.getLayoutParams();
                left = zB ? (childAt4.getLeft() - paVar2.leftMargin) - this.h : childAt4.getRight() + paVar2.rightMargin;
            }
            p(canvas, left);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0145  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:61:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Code duplicated, block: B:69:0x019b  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int baseline;
        int i10;
        int measuredHeight;
        int paddingTop;
        int i11;
        int i12 = 8;
        if (this.d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i13 = i3 - i;
            int paddingRight = i13 - getPaddingRight();
            int paddingRight2 = (i13 - paddingLeft2) - getPaddingRight();
            int childCount = getChildCount();
            int i14 = this.f;
            int i15 = 8388615 & i14;
            switch (i14 & 112) {
                case 16:
                    paddingTop = getPaddingTop() + (((i4 - i2) - this.e) / 2);
                    break;
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    paddingTop = ((getPaddingTop() + i4) - i2) - this.e;
                    break;
                default:
                    paddingTop = getPaddingTop();
                    break;
            }
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                if (childAt != null && childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    pa paVar = (pa) childAt.getLayoutParams();
                    int i17 = paVar.gravity;
                    if (i17 < 0) {
                        i17 = i15;
                    }
                    switch (Gravity.getAbsoluteGravity(i17, gl.f(this)) & 7) {
                        case 1:
                            i11 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft2) + paVar.leftMargin) - paVar.rightMargin;
                            break;
                        case 5:
                            i11 = (paddingRight - measuredWidth) - paVar.rightMargin;
                            break;
                        default:
                            i11 = paVar.leftMargin + paddingLeft2;
                            break;
                    }
                    if (r(i16)) {
                        paddingTop += this.m;
                    }
                    int i18 = paddingTop + paVar.topMargin;
                    a(childAt, i11, i18, measuredWidth, measuredHeight2);
                    paddingTop = i18 + measuredHeight2 + paVar.bottomMargin;
                }
            }
            return;
        }
        boolean zB = sd.b(this);
        int paddingTop2 = getPaddingTop();
        int i19 = i4 - i2;
        int paddingBottom = i19 - getPaddingBottom();
        int paddingBottom2 = (i19 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i20 = this.f;
        int i21 = i20 & 112;
        boolean z2 = this.a;
        int[] iArr = this.k;
        int[] iArr2 = this.l;
        switch (Gravity.getAbsoluteGravity(8388615 & i20, gl.f(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.e) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.e;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (zB) {
            i5 = childCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i22 = 0;
        while (i22 < childCount2) {
            int i23 = i5 + (i6 * i22);
            View childAt2 = getChildAt(i23);
            if (childAt2 == null) {
                i7 = i5;
                paddingBottom = paddingBottom;
                i8 = i6;
                i9 = i21;
            } else {
                i7 = i5;
                if (childAt2.getVisibility() != i12) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    pa paVar2 = (pa) childAt2.getLayoutParams();
                    if (z2) {
                        i8 = i6;
                        i9 = i21;
                        baseline = paVar2.height != -1 ? childAt2.getBaseline() : -1;
                        i10 = paVar2.gravity;
                        if (i10 < 0) {
                            i10 = i9;
                        }
                        switch (i10 & 112) {
                            case 16:
                                measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + paVar2.topMargin) - paVar2.bottomMargin;
                                break;
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                measuredHeight = paddingTop2 + paVar2.topMargin;
                                if (baseline != -1) {
                                    measuredHeight += iArr[1] - baseline;
                                }
                                break;
                            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                measuredHeight = (paddingBottom - measuredHeight3) - paVar2.bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                                break;
                            default:
                                measuredHeight = paddingTop2;
                                break;
                        }
                        if (r(i23)) {
                            paddingLeft += this.h;
                        }
                        int i24 = paddingLeft + paVar2.leftMargin;
                        a(childAt2, i24, measuredHeight, measuredWidth2, measuredHeight3);
                        paddingLeft = i24 + measuredWidth2 + paVar2.rightMargin;
                    } else {
                        i8 = i6;
                        i9 = i21;
                    }
                    i10 = paVar2.gravity;
                    if (i10 < 0) {
                        i10 = i9;
                    }
                    switch (i10 & 112) {
                        case 16:
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + paVar2.topMargin) - paVar2.bottomMargin;
                            break;
                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            measuredHeight = paddingTop2 + paVar2.topMargin;
                            if (baseline != -1) {
                                measuredHeight += iArr[1] - baseline;
                            }
                            break;
                        case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                            measuredHeight = (paddingBottom - measuredHeight3) - paVar2.bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                            break;
                        default:
                            measuredHeight = paddingTop2;
                            break;
                    }
                    if (r(i23)) {
                        paddingLeft += this.h;
                    }
                    int i25 = paddingLeft + paVar2.leftMargin;
                    a(childAt2, i25, measuredHeight, measuredWidth2, measuredHeight3);
                    paddingLeft = i25 + measuredWidth2 + paVar2.rightMargin;
                } else {
                    paddingBottom = paddingBottom;
                    i8 = i6;
                    i9 = i21;
                }
            }
            i22++;
            i5 = i7;
            i6 = i8;
            childCount2 = childCount2;
            i21 = i9;
            paddingBottom = paddingBottom;
            i12 = 8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:212:0x046f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0474  */
    /* JADX WARN: Code duplicated, block: B:216:0x049e  */
    /* JADX WARN: Code duplicated, block: B:217:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:220:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:221:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:223:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:226:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:229:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:232:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:240:0x0529 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:243:0x0533  */
    /* JADX WARN: Code duplicated, block: B:246:0x053a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0542  */
    /* JADX WARN: Code duplicated, block: B:252:0x0546  */
    /* JADX WARN: Code duplicated, block: B:254:0x0551  */
    /* JADX WARN: Code duplicated, block: B:257:0x0557  */
    /* JADX WARN: Code duplicated, block: B:280:0x05df  */
    /* JADX WARN: Code duplicated, block: B:282:0x05e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:283:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:284:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:287:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:295:0x061a  */
    /* JADX WARN: Code duplicated, block: B:318:0x068f  */
    /* JADX WARN: Code duplicated, block: B:321:0x0697  */
    /* JADX WARN: Code duplicated, block: B:324:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:326:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:328:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:329:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:331:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:333:0x0706  */
    /* JADX WARN: Code duplicated, block: B:340:0x0717  */
    /* JADX WARN: Code duplicated, block: B:342:0x071e  */
    /* JADX WARN: Code duplicated, block: B:345:0x0738  */
    /* JADX WARN: Code duplicated, block: B:348:0x0741  */
    /* JADX WARN: Code duplicated, block: B:349:0x0758  */
    /* JADX WARN: Code duplicated, block: B:352:0x0775  */
    /* JADX WARN: Code duplicated, block: B:355:0x077c  */
    /* JADX WARN: Code duplicated, block: B:358:0x0792  */
    /* JADX WARN: Code duplicated, block: B:359:0x0794  */
    /* JADX WARN: Code duplicated, block: B:362:0x079c  */
    /* JADX WARN: Code duplicated, block: B:364:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:365:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:368:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:372:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:373:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:376:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:380:0x0809  */
    /* JADX WARN: Code duplicated, block: B:382:0x080e  */
    /* JADX WARN: Code duplicated, block: B:388:0x081c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:389:0x081d A[PHI: r5
      0x081d: PHI (r5v15 int) = (r5v14 int), (r5v21 int), (r5v22 int) binds: [B:379:0x0807, B:388:0x081c, B:386:0x0816] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:394:0x0853  */
    /* JADX WARN: Code duplicated, block: B:397:0x0876  */
    /* JADX WARN: Code duplicated, block: B:400:0x0885  */
    /* JADX WARN: Code duplicated, block: B:402:0x0891  */
    /* JADX WARN: Code duplicated, block: B:404:0x089d  */
    /* JADX WARN: Code duplicated, block: B:405:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:440:0x08b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x08b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:64:0x0139  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int iMax;
        int i5;
        int i6;
        float f;
        int i7;
        int iCombineMeasuredStates;
        int i8;
        int iMax2;
        int i9;
        int i10;
        int i11;
        int i12;
        View childAt;
        int i13;
        int i14;
        pa paVar;
        float f2;
        boolean z;
        int i15;
        int measuredHeight;
        int i16;
        int i17;
        int baseline;
        int i18;
        int i19;
        int childMeasureSpec;
        int measuredWidth;
        int iMakeMeasureSpec;
        int i20;
        int i21;
        View childAt2;
        pa paVar2;
        int i22;
        int i23;
        View childAt3;
        int i24;
        int i25;
        int i26;
        float f3;
        byte b;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z2;
        boolean z3;
        pa paVar3;
        int measuredWidth2;
        boolean z4;
        int i32;
        int measuredHeight2;
        boolean z5;
        int baseline2;
        int i33;
        int i34;
        int i35;
        boolean z6;
        int i36;
        View childAt4;
        int i37;
        int i38;
        int i39;
        int i40;
        byte b2;
        int i41;
        pa paVar4;
        int i42;
        boolean z7;
        int i43;
        int measuredWidth3;
        boolean z8;
        int i44 = -2;
        int i45 = 8;
        float f4 = 0.0f;
        int i46 = 1073741824;
        if (this.d == 1) {
            this.e = 0;
            int childCount = getChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i47 = this.b;
            boolean z9 = this.j;
            int i48 = 0;
            boolean z10 = true;
            boolean z11 = false;
            boolean z12 = false;
            int i49 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            float f5 = 0.0f;
            int iMax5 = 0;
            int i50 = 0;
            while (i48 < childCount) {
                View childAt5 = getChildAt(i48);
                if (childAt5 == null || childAt5.getVisibility() == i45) {
                    i37 = i47;
                    i38 = mode2;
                    i39 = mode;
                    i40 = childCount;
                } else {
                    if (r(i48)) {
                        this.e += this.m;
                    }
                    pa paVar5 = (pa) childAt5.getLayoutParams();
                    f5 += paVar5.weight;
                    if (mode2 == i46 && paVar5.height == 0 && paVar5.weight > f4) {
                        int i51 = this.e;
                        this.e = Math.max(i51, paVar5.topMargin + i51 + paVar5.bottomMargin);
                        i37 = i47;
                        i38 = mode2;
                        i41 = mode;
                        i40 = childCount;
                        paVar4 = paVar5;
                        z12 = true;
                    } else {
                        if (paVar5.height != 0 || paVar5.weight <= f4) {
                            b2 = -2147483648;
                        } else {
                            paVar5.height = i44;
                            b2 = 0;
                        }
                        int i52 = f5 == f4 ? this.e : 0;
                        i37 = i47;
                        i38 = mode2;
                        i41 = mode;
                        i40 = childCount;
                        paVar4 = paVar5;
                        measureChildWithMargins(childAt5, i, 0, i2, i52);
                        if (b2 != -2147483648) {
                            paVar4.height = 0;
                        }
                        int measuredHeight3 = childAt5.getMeasuredHeight();
                        int i53 = this.e;
                        this.e = Math.max(i53, i53 + measuredHeight3 + paVar4.topMargin + paVar4.bottomMargin);
                        if (z9) {
                            iMax5 = Math.max(measuredHeight3, iMax5);
                        }
                    }
                    if (i37 >= 0 && i37 == i48 + 1) {
                        this.c = this.e;
                    }
                    if (i48 < i37 && paVar4.weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i39 = i41;
                    if (i39 != 1073741824) {
                        i42 = -1;
                        if (paVar4.width == -1) {
                            z7 = true;
                            z11 = true;
                        }
                        i43 = paVar4.leftMargin + paVar4.rightMargin;
                        measuredWidth3 = childAt5.getMeasuredWidth() + i43;
                        int iMax6 = Math.max(i50, measuredWidth3);
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(i49, childAt5.getMeasuredState());
                        if (z10 || paVar4.width != i42) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (paVar4.weight > 0.0f) {
                            if (true != z7) {
                                i43 = measuredWidth3;
                            }
                            iMax4 = Math.max(iMax4, i43);
                        } else {
                            int i54 = iMax4;
                            if (true != z7) {
                                i43 = measuredWidth3;
                            }
                            iMax3 = Math.max(iMax3, i43);
                            iMax4 = i54;
                        }
                        i50 = iMax6;
                        i49 = iCombineMeasuredStates2;
                        z10 = z8;
                    } else {
                        i42 = -1;
                    }
                    z7 = false;
                    i43 = paVar4.leftMargin + paVar4.rightMargin;
                    measuredWidth3 = childAt5.getMeasuredWidth() + i43;
                    int iMax7 = Math.max(i50, measuredWidth3);
                    int iCombineMeasuredStates3 = View.combineMeasuredStates(i49, childAt5.getMeasuredState());
                    if (z10) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (paVar4.weight > 0.0f) {
                        if (true != z7) {
                            i43 = measuredWidth3;
                        }
                        iMax4 = Math.max(iMax4, i43);
                    } else {
                        int i55 = iMax4;
                        if (true != z7) {
                            i43 = measuredWidth3;
                        }
                        iMax3 = Math.max(iMax3, i43);
                        iMax4 = i55;
                    }
                    i50 = iMax7;
                    i49 = iCombineMeasuredStates3;
                    z10 = z8;
                }
                i48++;
                mode = i39;
                i47 = i37;
                mode2 = i38;
                childCount = i40;
                i44 = -2;
                i45 = 8;
                f4 = 0.0f;
                i46 = 1073741824;
            }
            int i56 = mode2;
            int i57 = mode;
            int i58 = childCount;
            int iCombineMeasuredStates4 = i49;
            int iMax8 = iMax3;
            int i59 = iMax4;
            int i60 = iMax5;
            int i61 = i50;
            if (this.e > 0) {
                i33 = i58;
                if (r(i33)) {
                    this.e += this.m;
                }
            } else {
                i33 = i58;
            }
            if (z9) {
                i34 = i56;
                if (i34 == Integer.MIN_VALUE) {
                    this.e = 0;
                    for (i36 = 0; i36 < i33; i36++) {
                        childAt4 = getChildAt(i36);
                        if (childAt4 != null && childAt4.getVisibility() != 8) {
                            pa paVar6 = (pa) childAt4.getLayoutParams();
                            int i62 = this.e;
                            this.e = Math.max(i62, i62 + i60 + paVar6.topMargin + paVar6.bottomMargin);
                        }
                    }
                } else if (i34 == 0) {
                    i34 = 0;
                    this.e = 0;
                    while (i36 < i33) {
                        childAt4 = getChildAt(i36);
                        if (childAt4 != null) {
                            pa paVar7 = (pa) childAt4.getLayoutParams();
                            int i63 = this.e;
                            this.e = Math.max(i63, i63 + i60 + paVar7.topMargin + paVar7.bottomMargin);
                        }
                    }
                }
            } else {
                i34 = i56;
            }
            int paddingTop = this.e + getPaddingTop() + getPaddingBottom();
            this.e = paddingTop;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
            int i64 = (16777215 & iResolveSizeAndState) - this.e;
            if (z12 || (i64 != 0 && f5 > 0.0f)) {
                float f6 = this.i;
                if (f6 > 0.0f) {
                    f5 = f6;
                }
                this.e = 0;
                int i65 = 0;
                while (i65 < i33) {
                    View childAt6 = getChildAt(i65);
                    if (childAt6.getVisibility() != 8) {
                        pa paVar8 = (pa) childAt6.getLayoutParams();
                        float f7 = paVar8.weight;
                        if (f7 > 0.0f) {
                            int i66 = (int) ((i64 * f7) / f5);
                            f5 -= f7;
                            int i67 = i64 - i66;
                            int childMeasureSpec2 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + paVar8.leftMargin + paVar8.rightMargin, paVar8.width);
                            if (paVar8.height == 0 && i34 == 1073741824) {
                                if (i66 <= 0) {
                                    i66 = 0;
                                }
                                childAt6.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(i66, 1073741824));
                            } else {
                                int measuredHeight4 = childAt6.getMeasuredHeight() + i66;
                                if (measuredHeight4 < 0) {
                                    measuredHeight4 = 0;
                                }
                                childAt6.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(measuredHeight4, 1073741824));
                            }
                            iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates4, childAt6.getMeasuredState() & (-256));
                            i64 = i67;
                        }
                        int i68 = paVar8.leftMargin + paVar8.rightMargin;
                        int measuredWidth4 = childAt6.getMeasuredWidth() + i68;
                        int iMax9 = Math.max(i61, measuredWidth4);
                        if (i57 != 1073741824) {
                            i35 = iMax9;
                            if (paVar8.width != -1) {
                            }
                            int iMax10 = Math.max(iMax8, i68);
                            if (z10 || paVar8.width != -1) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            int i69 = this.e;
                            this.e = Math.max(i69, childAt6.getMeasuredHeight() + i69 + paVar8.topMargin + paVar8.bottomMargin);
                            z10 = z6;
                            i61 = i35;
                            iMax8 = iMax10;
                        } else {
                            i35 = iMax9;
                        }
                        i68 = measuredWidth4;
                        int iMax11 = Math.max(iMax8, i68);
                        if (z10) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        int i610 = this.e;
                        this.e = Math.max(i610, childAt6.getMeasuredHeight() + i610 + paVar8.topMargin + paVar8.bottomMargin);
                        z10 = z6;
                        i61 = i35;
                        iMax8 = iMax11;
                    }
                    i65++;
                    i34 = i34;
                }
                this.e += getPaddingTop() + getPaddingBottom();
            } else {
                iMax8 = Math.max(iMax8, i59);
                if (z9 && i34 != 1073741824) {
                    for (int i70 = 0; i70 < i33; i70++) {
                        View childAt7 = getChildAt(i70);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((pa) childAt7.getLayoutParams()).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i60, 1073741824));
                        }
                    }
                }
            }
            int i71 = i61;
            if (z10 || i57 == 1073741824) {
                iMax8 = i71;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates4), iResolveSizeAndState);
            if (z11) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i72 = 0; i72 < i33; i72++) {
                    View childAt8 = getChildAt(i72);
                    if (childAt8.getVisibility() != 8) {
                        pa paVar9 = (pa) childAt8.getLayoutParams();
                        if (paVar9.width == -1) {
                            int i73 = paVar9.height;
                            paVar9.height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            paVar9.height = i73;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.e = 0;
        int childCount2 = getChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.k == null || this.l == null) {
            this.k = new int[4];
            this.l = new int[4];
        }
        int[] iArr = this.k;
        int[] iArr2 = this.l;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z13 = this.a;
        boolean z14 = this.j;
        int iMax12 = 0;
        float f8 = 0.0f;
        int i74 = 0;
        int i75 = 0;
        int iMax13 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = true;
        int iMax14 = 0;
        int i76 = 0;
        while (i75 < childCount2) {
            View childAt9 = getChildAt(i75);
            if (childAt9 == null) {
                i24 = iMax12;
                i25 = i74;
            } else {
                i24 = iMax12;
                i25 = i74;
                if (childAt9.getVisibility() != 8) {
                    if (r(i75)) {
                        this.e += this.h;
                    }
                    pa paVar10 = (pa) childAt9.getLayoutParams();
                    float f9 = f8 + paVar10.weight;
                    if (mode3 == 1073741824) {
                        if (paVar10.width != 0 || paVar10.weight <= 0.0f) {
                            i26 = 1073741824;
                        } else {
                            int i77 = i75;
                            this.e += paVar10.leftMargin + paVar10.rightMargin;
                            if (z13) {
                                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                                paVar3 = paVar10;
                                z3 = z13;
                                i28 = i24;
                                i29 = i25;
                                i31 = i77;
                                z2 = z14;
                            } else {
                                paVar3 = paVar10;
                                z3 = z13;
                                i28 = i24;
                                i29 = i25;
                                i31 = i77;
                                z16 = true;
                                z2 = z14;
                            }
                        }
                        if (mode4 == 1073741824 && paVar3.height == -1) {
                            z4 = true;
                            z15 = true;
                        } else {
                            z4 = false;
                        }
                        i32 = paVar3.topMargin + paVar3.bottomMargin;
                        measuredHeight2 = childAt9.getMeasuredHeight() + i32;
                        int iCombineMeasuredStates5 = View.combineMeasuredStates(i29, childAt9.getMeasuredState());
                        if (!z3 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i78 = (((paVar3.gravity < 0 ? this.f : paVar3.gravity) & 112) >> 4) >> 1;
                            iArr[i78] = Math.max(iArr[i78], baseline2);
                            iArr2[i78] = Math.max(iArr2[i78], measuredHeight2 - baseline2);
                        }
                        int iMax15 = Math.max(i76, measuredHeight2);
                        if (z17 || paVar3.height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (paVar3.weight > 0.0f) {
                            if (true == z4) {
                                measuredHeight2 = i32;
                            }
                            iMax14 = Math.max(iMax14, measuredHeight2);
                            iMax12 = i28;
                        } else {
                            int i79 = iMax14;
                            if (true == z4) {
                                measuredHeight2 = i32;
                            }
                            iMax12 = Math.max(i28, measuredHeight2);
                            iMax14 = i79;
                        }
                        i76 = iMax15;
                        i74 = iCombineMeasuredStates5;
                        z17 = z5;
                        f8 = f9;
                    } else {
                        i26 = mode3;
                    }
                    if (paVar10.width == 0) {
                        f3 = 0.0f;
                        if (paVar10.weight > 0.0f) {
                            paVar10.width = -2;
                            b = 0;
                        }
                        if (f9 == f3) {
                            i27 = this.e;
                        } else {
                            i27 = 0;
                        }
                        i28 = i24;
                        i29 = i25;
                        i30 = i26;
                        i31 = i75;
                        int i80 = i27;
                        z2 = z14;
                        z3 = z13;
                        measureChildWithMargins(childAt9, i, i80, i2, 0);
                        if (b != -2147483648) {
                            paVar3 = paVar10;
                            paVar3.width = 0;
                        } else {
                            paVar3 = paVar10;
                        }
                        measuredWidth2 = childAt9.getMeasuredWidth();
                        if (i30 == 1073741824) {
                            this.e += paVar3.leftMargin + measuredWidth2 + paVar3.rightMargin;
                        } else {
                            int i81 = this.e;
                            this.e = Math.max(i81, i81 + measuredWidth2 + paVar3.leftMargin + paVar3.rightMargin);
                        }
                        if (z2) {
                            iMax13 = Math.max(measuredWidth2, iMax13);
                        }
                        if (mode4 == 1073741824) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        i32 = paVar3.topMargin + paVar3.bottomMargin;
                        measuredHeight2 = childAt9.getMeasuredHeight() + i32;
                        int iCombineMeasuredStates6 = View.combineMeasuredStates(i29, childAt9.getMeasuredState());
                        if (!z3) {
                        }
                        int iMax16 = Math.max(i76, measuredHeight2);
                        if (z17) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (paVar3.weight > 0.0f) {
                            if (true == z4) {
                                measuredHeight2 = i32;
                            }
                            iMax14 = Math.max(iMax14, measuredHeight2);
                            iMax12 = i28;
                        } else {
                            int i710 = iMax14;
                            if (true == z4) {
                                measuredHeight2 = i32;
                            }
                            iMax12 = Math.max(i28, measuredHeight2);
                            iMax14 = i710;
                        }
                        i76 = iMax16;
                        i74 = iCombineMeasuredStates6;
                        z17 = z5;
                        f8 = f9;
                    } else {
                        f3 = 0.0f;
                    }
                    b = -2147483648;
                    if (f9 == f3) {
                        i27 = this.e;
                    } else {
                        i27 = 0;
                    }
                    i28 = i24;
                    i29 = i25;
                    i30 = i26;
                    i31 = i75;
                    int i82 = i27;
                    z2 = z14;
                    z3 = z13;
                    measureChildWithMargins(childAt9, i, i82, i2, 0);
                    if (b != -2147483648) {
                        paVar3 = paVar10;
                        paVar3.width = 0;
                    } else {
                        paVar3 = paVar10;
                    }
                    measuredWidth2 = childAt9.getMeasuredWidth();
                    if (i30 == 1073741824) {
                        this.e += paVar3.leftMargin + measuredWidth2 + paVar3.rightMargin;
                    } else {
                        int i83 = this.e;
                        this.e = Math.max(i83, i83 + measuredWidth2 + paVar3.leftMargin + paVar3.rightMargin);
                    }
                    if (z2) {
                        iMax13 = Math.max(measuredWidth2, iMax13);
                    }
                    if (mode4 == 1073741824) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i32 = paVar3.topMargin + paVar3.bottomMargin;
                    measuredHeight2 = childAt9.getMeasuredHeight() + i32;
                    int iCombineMeasuredStates7 = View.combineMeasuredStates(i29, childAt9.getMeasuredState());
                    if (!z3) {
                    }
                    int iMax17 = Math.max(i76, measuredHeight2);
                    if (z17) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (paVar3.weight > 0.0f) {
                        if (true == z4) {
                            measuredHeight2 = i32;
                        }
                        iMax14 = Math.max(iMax14, measuredHeight2);
                        iMax12 = i28;
                    } else {
                        int i711 = iMax14;
                        if (true == z4) {
                            measuredHeight2 = i32;
                        }
                        iMax12 = Math.max(i28, measuredHeight2);
                        iMax14 = i711;
                    }
                    i76 = iMax17;
                    i74 = iCombineMeasuredStates7;
                    z17 = z5;
                    f8 = f9;
                }
                i75 = i31 + 1;
                z14 = z2;
                z13 = z3;
            }
            z2 = z14;
            z3 = z13;
            iMax12 = i24;
            i74 = i25;
            i31 = i75;
            i75 = i31 + 1;
            z14 = z2;
            z13 = z3;
        }
        boolean z18 = z14;
        boolean z19 = z13;
        int i84 = i76;
        int i85 = i74;
        int i86 = iMax14;
        if (this.e > 0 && r(childCount2)) {
            this.e += this.h;
        }
        int i87 = iArr[1];
        if (i87 == -1) {
            i3 = i85;
            if (iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
                iMax = i84;
            } else {
                i4 = -1;
            }
            if (z18) {
                if (mode3 != Integer.MIN_VALUE) {
                    i22 = mode3;
                } else if (mode3 == 0) {
                    i22 = 0;
                    mode3 = 0;
                } else {
                    i5 = mode3;
                }
                this.e = 0;
                for (i23 = 0; i23 < childCount2; i23++) {
                    childAt3 = getChildAt(i23);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        pa paVar11 = (pa) childAt3.getLayoutParams();
                        int i88 = this.e;
                        this.e = Math.max(i88, i88 + iMax13 + paVar11.leftMargin + paVar11.rightMargin);
                    }
                }
                i5 = mode3;
                mode3 = i22;
            } else {
                i5 = mode3;
            }
            int paddingLeft = this.e + getPaddingLeft() + getPaddingRight();
            this.e = paddingLeft;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
            i6 = (16777215 & iResolveSizeAndState2) - this.e;
            if (!z16 || (i6 != 0 && f8 > 0.0f)) {
                f = this.i;
                if (f > 0.0f) {
                    f8 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.e = 0;
                i7 = i6;
                iCombineMeasuredStates = i3;
                i8 = 0;
                iMax2 = -1;
                while (i8 < childCount2) {
                    childAt = getChildAt(i8);
                    if (childAt == null) {
                        childCount2 = childCount2;
                        i13 = i7;
                        i14 = mode4;
                    } else if (childAt.getVisibility() == 8) {
                        childCount2 = childCount2;
                        i13 = i7;
                        i14 = mode4;
                    } else {
                        paVar = (pa) childAt.getLayoutParams();
                        f2 = paVar.weight;
                        if (f2 > 0.0f) {
                            i19 = (int) ((i7 * f2) / f8);
                            float f10 = f8 - f2;
                            int i89 = i7 - i19;
                            childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + paVar.topMargin + paVar.bottomMargin, paVar.height);
                            if (paVar.width == 0 || mode3 != 1073741824) {
                                measuredWidth = childAt.getMeasuredWidth() + i19;
                                if (measuredWidth < 0) {
                                    measuredWidth = 0;
                                }
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                            } else {
                                if (i19 <= 0) {
                                    i19 = 0;
                                }
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f8 = f10;
                            i13 = i89;
                        } else {
                            i13 = i7;
                        }
                        if (i5 == 1073741824) {
                            this.e += childAt.getMeasuredWidth() + paVar.leftMargin + paVar.rightMargin;
                        } else {
                            int i90 = this.e;
                            this.e = Math.max(i90, childAt.getMeasuredWidth() + i90 + paVar.leftMargin + paVar.rightMargin);
                        }
                        i14 = mode4;
                        if (i14 == 1073741824 && paVar.height == -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i15 = paVar.topMargin + paVar.bottomMargin;
                        measuredHeight = childAt.getMeasuredHeight() + i15;
                        iMax2 = Math.max(iMax2, measuredHeight);
                        if (true != z) {
                            i16 = measuredHeight;
                        } else {
                            i16 = i15;
                        }
                        iMax12 = Math.max(iMax12, i16);
                        if (z17) {
                            i17 = -1;
                            boolean z20 = paVar.height == -1;
                            if (z19 && (baseline = childAt.getBaseline()) != i17) {
                                if (paVar.gravity < 0) {
                                    i18 = this.f;
                                } else {
                                    i18 = paVar.gravity;
                                }
                                int i91 = ((i18 & 112) >> 4) >> 1;
                                iArr[i91] = Math.max(iArr[i91], baseline);
                                iArr2[i91] = Math.max(iArr2[i91], measuredHeight - baseline);
                            }
                            z17 = z20;
                            iCombineMeasuredStates = iCombineMeasuredStates;
                            f8 = f8;
                        } else {
                            i17 = -1;
                        }
                        if (z19) {
                            if (paVar.gravity < 0) {
                                i18 = this.f;
                            } else {
                                i18 = paVar.gravity;
                            }
                            int i92 = ((i18 & 112) >> 4) >> 1;
                            iArr[i92] = Math.max(iArr[i92], baseline);
                            iArr2[i92] = Math.max(iArr2[i92], measuredHeight - baseline);
                        }
                        z17 = z20;
                        iCombineMeasuredStates = iCombineMeasuredStates;
                        f8 = f8;
                    }
                    i8++;
                    i7 = i13;
                    i5 = i5;
                    mode4 = i14;
                    childCount2 = childCount2;
                }
                i9 = i2;
                i10 = childCount2;
                i11 = mode4;
                this.e += getPaddingLeft() + getPaddingRight();
                i12 = iArr[1];
                if (i12 != -1) {
                    iMax = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i12, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                } else if (iArr[0] != -1 && iArr[2] == -1 && iArr[3] == -1) {
                    iMax = iMax2;
                } else {
                    i12 = -1;
                    iMax = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i12, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                }
            } else {
                iMax12 = Math.max(iMax12, i86);
                if (z18 && mode3 != 1073741824) {
                    for (int i93 = 0; i93 < childCount2; i93++) {
                        View childAt10 = getChildAt(i93);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((pa) childAt10.getLayoutParams()).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax13, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i9 = i2;
                i10 = childCount2;
                i11 = mode4;
                iCombineMeasuredStates = i3;
            }
            if (z17 || i11 == 1073741824) {
                iMax12 = iMax;
            }
            setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(iMax12 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, iCombineMeasuredStates << 16));
            if (z15) {
                return;
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i20 = 0;
            while (true) {
                i21 = i10;
                if (i20 < i21) {
                    return;
                }
                childAt2 = getChildAt(i20);
                if (childAt2.getVisibility() != 8) {
                    paVar2 = (pa) childAt2.getLayoutParams();
                    if (paVar2.height == -1) {
                        int i94 = paVar2.width;
                        paVar2.width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        paVar2.width = i94;
                    }
                }
                i20++;
                i10 = i21;
            }
        } else {
            i3 = i85;
            i4 = i87;
        }
        iMax = Math.max(i84, Math.max(iArr[3], Math.max(iArr[0], Math.max(i4, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z18) {
            i5 = mode3;
        } else {
            if (mode3 != Integer.MIN_VALUE) {
                i22 = mode3;
            } else if (mode3 == 0) {
                i22 = 0;
                mode3 = 0;
            } else {
                i5 = mode3;
            }
            this.e = 0;
            while (i23 < childCount2) {
                childAt3 = getChildAt(i23);
                if (childAt3 != null) {
                    pa paVar12 = (pa) childAt3.getLayoutParams();
                    int i810 = this.e;
                    this.e = Math.max(i810, i810 + iMax13 + paVar12.leftMargin + paVar12.rightMargin);
                }
            }
            i5 = mode3;
            mode3 = i22;
        }
        int paddingLeft2 = this.e + getPaddingLeft() + getPaddingRight();
        this.e = paddingLeft2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingLeft2, getSuggestedMinimumWidth()), i, 0);
        i6 = (16777215 & iResolveSizeAndState3) - this.e;
        if (z16) {
            f = this.i;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.e = 0;
            i7 = i6;
            iCombineMeasuredStates = i3;
            i8 = 0;
            iMax2 = -1;
            while (i8 < childCount2) {
                childAt = getChildAt(i8);
                if (childAt == null) {
                    childCount2 = childCount2;
                    i13 = i7;
                    i14 = mode4;
                } else if (childAt.getVisibility() == 8) {
                    childCount2 = childCount2;
                    i13 = i7;
                    i14 = mode4;
                } else {
                    paVar = (pa) childAt.getLayoutParams();
                    f2 = paVar.weight;
                    if (f2 > 0.0f) {
                        i19 = (int) ((i7 * f2) / f8);
                        float f11 = f8 - f2;
                        int i811 = i7 - i19;
                        childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + paVar.topMargin + paVar.bottomMargin, paVar.height);
                        if (paVar.width == 0) {
                            measuredWidth = childAt.getMeasuredWidth() + i19;
                            if (measuredWidth < 0) {
                                measuredWidth = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                        } else {
                            measuredWidth = childAt.getMeasuredWidth() + i19;
                            if (measuredWidth < 0) {
                                measuredWidth = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                        }
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                        f8 = f11;
                        i13 = i811;
                    } else {
                        i13 = i7;
                    }
                    if (i5 == 1073741824) {
                        this.e += childAt.getMeasuredWidth() + paVar.leftMargin + paVar.rightMargin;
                    } else {
                        int i95 = this.e;
                        this.e = Math.max(i95, childAt.getMeasuredWidth() + i95 + paVar.leftMargin + paVar.rightMargin);
                    }
                    i14 = mode4;
                    if (i14 == 1073741824) {
                        z = false;
                    } else {
                        z = false;
                    }
                    i15 = paVar.topMargin + paVar.bottomMargin;
                    measuredHeight = childAt.getMeasuredHeight() + i15;
                    iMax2 = Math.max(iMax2, measuredHeight);
                    if (true != z) {
                        i16 = measuredHeight;
                    } else {
                        i16 = i15;
                    }
                    iMax12 = Math.max(iMax12, i16);
                    if (z17) {
                        i17 = -1;
                        if (paVar.height == -1) {
                        }
                        if (z19) {
                            if (paVar.gravity < 0) {
                                i18 = this.f;
                            } else {
                                i18 = paVar.gravity;
                            }
                            int i96 = ((i18 & 112) >> 4) >> 1;
                            iArr[i96] = Math.max(iArr[i96], baseline);
                            iArr2[i96] = Math.max(iArr2[i96], measuredHeight - baseline);
                        }
                        z17 = z20;
                        iCombineMeasuredStates = iCombineMeasuredStates;
                        f8 = f8;
                    } else {
                        i17 = -1;
                    }
                    if (z19) {
                        if (paVar.gravity < 0) {
                            i18 = this.f;
                        } else {
                            i18 = paVar.gravity;
                        }
                        int i97 = ((i18 & 112) >> 4) >> 1;
                        iArr[i97] = Math.max(iArr[i97], baseline);
                        iArr2[i97] = Math.max(iArr2[i97], measuredHeight - baseline);
                    }
                    z17 = z20;
                    iCombineMeasuredStates = iCombineMeasuredStates;
                    f8 = f8;
                }
                i8++;
                i7 = i13;
                i5 = i5;
                mode4 = i14;
                childCount2 = childCount2;
            }
            i9 = i2;
            i10 = childCount2;
            i11 = mode4;
            this.e += getPaddingLeft() + getPaddingRight();
            i12 = iArr[1];
            if (i12 != -1) {
                iMax = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i12, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            } else if (iArr[0] != -1) {
                i12 = -1;
                iMax = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i12, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            } else {
                i12 = -1;
                iMax = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i12, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
        } else {
            f = this.i;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.e = 0;
            i7 = i6;
            iCombineMeasuredStates = i3;
            i8 = 0;
            iMax2 = -1;
            while (i8 < childCount2) {
                childAt = getChildAt(i8);
                if (childAt == null) {
                    childCount2 = childCount2;
                    i13 = i7;
                    i14 = mode4;
                } else if (childAt.getVisibility() == 8) {
                    childCount2 = childCount2;
                    i13 = i7;
                    i14 = mode4;
                } else {
                    paVar = (pa) childAt.getLayoutParams();
                    f2 = paVar.weight;
                    if (f2 > 0.0f) {
                        i19 = (int) ((i7 * f2) / f8);
                        float f12 = f8 - f2;
                        int i812 = i7 - i19;
                        childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + paVar.topMargin + paVar.bottomMargin, paVar.height);
                        if (paVar.width == 0) {
                            measuredWidth = childAt.getMeasuredWidth() + i19;
                            if (measuredWidth < 0) {
                                measuredWidth = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                        } else {
                            measuredWidth = childAt.getMeasuredWidth() + i19;
                            if (measuredWidth < 0) {
                                measuredWidth = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), childMeasureSpec);
                        }
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                        f8 = f12;
                        i13 = i812;
                    } else {
                        i13 = i7;
                    }
                    if (i5 == 1073741824) {
                        this.e += childAt.getMeasuredWidth() + paVar.leftMargin + paVar.rightMargin;
                    } else {
                        int i98 = this.e;
                        this.e = Math.max(i98, childAt.getMeasuredWidth() + i98 + paVar.leftMargin + paVar.rightMargin);
                    }
                    i14 = mode4;
                    if (i14 == 1073741824) {
                        z = false;
                    } else {
                        z = false;
                    }
                    i15 = paVar.topMargin + paVar.bottomMargin;
                    measuredHeight = childAt.getMeasuredHeight() + i15;
                    iMax2 = Math.max(iMax2, measuredHeight);
                    if (true != z) {
                        i16 = measuredHeight;
                    } else {
                        i16 = i15;
                    }
                    iMax12 = Math.max(iMax12, i16);
                    if (z17) {
                        i17 = -1;
                        if (paVar.height == -1) {
                        }
                        if (z19) {
                            if (paVar.gravity < 0) {
                                i18 = this.f;
                            } else {
                                i18 = paVar.gravity;
                            }
                            int i99 = ((i18 & 112) >> 4) >> 1;
                            iArr[i99] = Math.max(iArr[i99], baseline);
                            iArr2[i99] = Math.max(iArr2[i99], measuredHeight - baseline);
                        }
                        z17 = z20;
                        iCombineMeasuredStates = iCombineMeasuredStates;
                        f8 = f8;
                    } else {
                        i17 = -1;
                    }
                    if (z19) {
                        if (paVar.gravity < 0) {
                            i18 = this.f;
                        } else {
                            i18 = paVar.gravity;
                        }
                        int i910 = ((i18 & 112) >> 4) >> 1;
                        iArr[i910] = Math.max(iArr[i910], baseline);
                        iArr2[i910] = Math.max(iArr2[i910], measuredHeight - baseline);
                    }
                    z17 = z20;
                    iCombineMeasuredStates = iCombineMeasuredStates;
                    f8 = f8;
                }
                i8++;
                i7 = i13;
                i5 = i5;
                mode4 = i14;
                childCount2 = childCount2;
            }
            i9 = i2;
            i10 = childCount2;
            i11 = mode4;
            this.e += getPaddingLeft() + getPaddingRight();
            i12 = iArr[1];
            if (i12 != -1) {
                iMax = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i12, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            } else if (iArr[0] != -1) {
                i12 = -1;
                iMax = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i12, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            } else {
                i12 = -1;
                iMax = Math.max(iMax2, Math.max(iArr[3], Math.max(iArr[0], Math.max(i12, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
        }
        if (z17) {
            iMax12 = iMax;
        } else {
            iMax12 = iMax;
        }
        setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(iMax12 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, iCombineMeasuredStates << 16));
        if (z15) {
            return;
        }
        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        i20 = 0;
        while (true) {
            i21 = i10;
            if (i20 < i21) {
                return;
            }
            childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                paVar2 = (pa) childAt2.getLayoutParams();
                if (paVar2.height == -1) {
                    int i911 = paVar2.width;
                    paVar2.width = childAt2.getMeasuredWidth();
                    measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                    paVar2.width = i911;
                }
            }
            i20++;
            i10 = i21;
        }
    }

    final void p(Canvas canvas, int i) {
        this.g.setBounds(i, getPaddingTop() + this.o, this.h + i, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    public final void q(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    protected final boolean r(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public final void s() {
        this.a = false;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
