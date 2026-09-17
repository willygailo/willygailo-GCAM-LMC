package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class om extends ListView {
    public boolean a;
    ol b;
    private final Rect c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Field i;
    private ok j;
    private final boolean k;
    private boolean l;
    private hm m;

    public om(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.c = new Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private final void c(boolean z) {
        ok okVar = this.j;
        if (okVar != null) {
            okVar.b = z;
        }
    }

    private final void d() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9 A[Catch: IllegalAccessException -> 0x00ea, TryCatch #0 {IllegalAccessException -> 0x00ea, blocks: (B:38:0x00cd, B:40:0x00d9, B:42:0x00e6), top: B:75:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6 A[Catch: IllegalAccessException -> 0x00ea, TRY_LEAVE, TryCatch #0 {IllegalAccessException -> 0x00ea, blocks: (B:38:0x00cd, B:40:0x00d9, B:42:0x00e6), top: B:75:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    public final boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        int iFindPointerIndex;
        int x;
        int y;
        int iPointToPosition;
        View childAt;
        float f;
        float f2;
        int i2;
        Drawable selector;
        int i3;
        boolean z2;
        Drawable selector2;
        boolean z3;
        boolean z4;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = false;
        switch (actionMasked) {
            case 1:
                z = false;
                iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                    x = (int) motionEvent.getX(iFindPointerIndex);
                    y = (int) motionEvent.getY(iFindPointerIndex);
                    iPointToPosition = pointToPosition(x, y);
                    if (iPointToPosition == -1) {
                        childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                        f = x;
                        f2 = y;
                        this.l = true;
                        drawableHotspotChanged(f, f2);
                        if (!isPressed()) {
                            setPressed(true);
                        }
                        layoutChildren();
                        i2 = this.h;
                        if (i2 != -1 && (childAt2 = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt2 != childAt && childAt2.isPressed()) {
                            childAt2.setPressed(false);
                        }
                        this.h = iPointToPosition;
                        childAt.drawableHotspotChanged(f - childAt.getLeft(), f2 - childAt.getTop());
                        if (!childAt.isPressed()) {
                            childAt.setPressed(true);
                        }
                        selector = getSelector();
                        try {
                            if (selector != null) {
                                if (iPointToPosition != -1) {
                                    i3 = iPointToPosition;
                                    z2 = true;
                                } else {
                                    iPointToPosition = -1;
                                    i3 = -1;
                                }
                                if (z2) {
                                    selector.setVisible(false, false);
                                }
                                Rect rect = this.c;
                                rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                rect.left -= this.d;
                                rect.top -= this.e;
                                rect.right += this.f;
                                rect.bottom += this.g;
                                z4 = this.i.getBoolean(this);
                                if (childAt.isEnabled() != z4) {
                                    this.i.set(this, Boolean.valueOf(!z4));
                                    if (iPointToPosition != -1) {
                                        refreshDrawableState();
                                    }
                                }
                                if (z2) {
                                    Rect rect2 = this.c;
                                    float fExactCenterX = rect2.exactCenterX();
                                    float fExactCenterY = rect2.exactCenterY();
                                    if (getVisibility() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    selector.setVisible(z3, false);
                                    selector.setHotspot(fExactCenterX, fExactCenterY);
                                }
                                selector2 = getSelector();
                                if (selector2 != null && i3 != -1) {
                                    selector2.setHotspot(f, f2);
                                }
                                c(false);
                                refreshDrawableState();
                                if (actionMasked == 1) {
                                    performItemClick(childAt, i3, getItemIdAtPosition(i3));
                                }
                                z = true;
                                z5 = false;
                            } else {
                                i3 = iPointToPosition;
                            }
                            z4 = this.i.getBoolean(this);
                            if (childAt.isEnabled() != z4) {
                                this.i.set(this, Boolean.valueOf(!z4));
                                if (iPointToPosition != -1) {
                                    refreshDrawableState();
                                }
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        z2 = false;
                        if (z2) {
                            selector.setVisible(false, false);
                        }
                        Rect rect3 = this.c;
                        rect3.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        rect3.left -= this.d;
                        rect3.top -= this.e;
                        rect3.right += this.f;
                        rect3.bottom += this.g;
                        if (z2) {
                            Rect rect4 = this.c;
                            float fExactCenterX2 = rect4.exactCenterX();
                            float fExactCenterY2 = rect4.exactCenterY();
                            if (getVisibility() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            selector.setVisible(z3, false);
                            selector.setHotspot(fExactCenterX2, fExactCenterY2);
                        }
                        selector2 = getSelector();
                        if (selector2 != null) {
                            selector2.setHotspot(f, f2);
                        }
                        c(false);
                        refreshDrawableState();
                        if (actionMasked == 1) {
                            performItemClick(childAt, i3, getItemIdAtPosition(i3));
                        }
                        z = true;
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                } else {
                    z = false;
                }
                break;
            case 2:
                z = true;
                iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                    x = (int) motionEvent.getX(iFindPointerIndex);
                    y = (int) motionEvent.getY(iFindPointerIndex);
                    iPointToPosition = pointToPosition(x, y);
                    if (iPointToPosition == -1) {
                        childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                        f = x;
                        f2 = y;
                        this.l = true;
                        drawableHotspotChanged(f, f2);
                        if (!isPressed()) {
                            setPressed(true);
                        }
                        layoutChildren();
                        i2 = this.h;
                        if (i2 != -1) {
                            childAt2.setPressed(false);
                        }
                        this.h = iPointToPosition;
                        childAt.drawableHotspotChanged(f - childAt.getLeft(), f2 - childAt.getTop());
                        if (!childAt.isPressed()) {
                            childAt.setPressed(true);
                        }
                        selector = getSelector();
                        if (selector != null) {
                            if (iPointToPosition != -1) {
                                i3 = iPointToPosition;
                                z2 = true;
                            } else {
                                iPointToPosition = -1;
                                i3 = -1;
                            }
                            if (z2) {
                                selector.setVisible(false, false);
                            }
                            Rect rect5 = this.c;
                            rect5.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            rect5.left -= this.d;
                            rect5.top -= this.e;
                            rect5.right += this.f;
                            rect5.bottom += this.g;
                            z4 = this.i.getBoolean(this);
                            if (childAt.isEnabled() != z4) {
                                this.i.set(this, Boolean.valueOf(!z4));
                                if (iPointToPosition != -1) {
                                    refreshDrawableState();
                                }
                            }
                            if (z2) {
                                Rect rect6 = this.c;
                                float fExactCenterX3 = rect6.exactCenterX();
                                float fExactCenterY3 = rect6.exactCenterY();
                                if (getVisibility() == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                selector.setVisible(z3, false);
                                selector.setHotspot(fExactCenterX3, fExactCenterY3);
                            }
                            selector2 = getSelector();
                            if (selector2 != null) {
                                selector2.setHotspot(f, f2);
                            }
                            c(false);
                            refreshDrawableState();
                            if (actionMasked == 1) {
                                performItemClick(childAt, i3, getItemIdAtPosition(i3));
                            }
                            z = true;
                            z5 = false;
                        } else {
                            i3 = iPointToPosition;
                        }
                        z2 = false;
                        if (z2) {
                            selector.setVisible(false, false);
                        }
                        Rect rect7 = this.c;
                        rect7.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        rect7.left -= this.d;
                        rect7.top -= this.e;
                        rect7.right += this.f;
                        rect7.bottom += this.g;
                        z4 = this.i.getBoolean(this);
                        if (childAt.isEnabled() != z4) {
                            this.i.set(this, Boolean.valueOf(!z4));
                            if (iPointToPosition != -1) {
                                refreshDrawableState();
                            }
                        }
                        if (z2) {
                            Rect rect8 = this.c;
                            float fExactCenterX4 = rect8.exactCenterX();
                            float fExactCenterY4 = rect8.exactCenterY();
                            if (getVisibility() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            selector.setVisible(z3, false);
                            selector.setHotspot(fExactCenterX4, fExactCenterY4);
                        }
                        selector2 = getSelector();
                        if (selector2 != null) {
                            selector2.setHotspot(f, f2);
                        }
                        c(false);
                        refreshDrawableState();
                        if (actionMasked == 1) {
                            performItemClick(childAt, i3, getItemIdAtPosition(i3));
                        }
                        z = true;
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                } else {
                    z = false;
                }
                break;
            case 3:
                z = false;
                break;
            default:
                z = true;
                z5 = false;
                break;
        }
        if (!z || z5) {
            this.l = false;
            setPressed(false);
            drawableStateChanged();
            View childAt3 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt3 != null) {
                childAt3.setPressed(false);
            }
        }
        if (z) {
            if (this.m == null) {
                this.m = new hm(this);
            }
            this.m.c(true);
            this.m.onTouch(this, motionEvent);
        } else {
            hm hmVar = this.m;
            if (hmVar != null) {
                hmVar.c(false);
            }
        }
        return z;
    }

    public final int b(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i3 = 0;
        int i4 = 0;
        while (i3 < count) {
            int itemViewType = adapter.getItemViewType(i3);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            view = adapter.getView(i3, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i3 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
            i3++;
            i4 = i5;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.b != null) {
            return;
        }
        super.drawableStateChanged();
        c(true);
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.k || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.b == null) {
                ol olVar = new ol(this);
                this.b = olVar;
                olVar.a.post(olVar);
                actionMasked = 10;
            } else {
                actionMasked = 10;
            }
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                d();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        ol olVar = this.b;
        if (olVar != null) {
            om omVar = olVar.a;
            omVar.b = null;
            omVar.removeCallbacks(olVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        ok okVar = drawable != null ? new ok(drawable) : null;
        this.j = okVar;
        super.setSelector(okVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
