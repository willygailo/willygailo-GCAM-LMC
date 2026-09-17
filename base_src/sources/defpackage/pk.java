package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public class pk implements lo {
    private Context a;
    private ListAdapter b;
    private int c;
    private int d;
    public om e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    final pj n;
    final Handler o;
    public boolean p;
    public PopupWindow q;
    private int r;
    private boolean s;
    private DataSetObserver t;
    private final pi u;
    private final ph v;
    private final Rect w;
    private Rect x;
    private final pj y;

    public pk(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public pk(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.c = -2;
        this.f = -2;
        this.r = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.n = new pj(this, 0);
        this.u = new pi(this);
        this.v = new ph(this);
        this.y = new pj(this, 1);
        this.w = new Rect();
        this.a = context;
        this.o = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jq.n, i, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.d = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.s = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        mz mzVar = new mz(context, attributeSet, i);
        this.q = mzVar;
        mzVar.setInputMethodMode(1);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (this.s) {
            return this.d;
        }
        return 0;
    }

    public final Drawable c() {
        return this.q.getBackground();
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.t;
        if (dataSetObserver == null) {
            this.t = new pg(this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.t);
        }
        om omVar = this.e;
        if (omVar != null) {
            omVar.setAdapter(this.b);
        }
    }

    public final void f(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.lo
    public final ListView fn() {
        return this.e;
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.d = i;
        this.s = true;
    }

    @Override // defpackage.lo
    public final void k() {
        this.q.dismiss();
        this.q.setContentView(null);
        this.e = null;
        this.o.removeCallbacks(this.n);
    }

    public final int o() {
        if (u()) {
            return this.e.getSelectedItemPosition();
        }
        return -1;
    }

    public om p(Context context, boolean z) {
        return new om(context, z);
    }

    public final void q() {
        om omVar = this.e;
        if (omVar != null) {
            omVar.a = true;
            omVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.q.getBackground();
        if (background == null) {
            this.f = i;
        } else {
            background.getPadding(this.w);
            this.f = this.w.left + this.w.right + i;
        }
    }

    @Override // defpackage.lo
    public final void s() {
        int i;
        int iMakeMeasureSpec;
        int paddingTop;
        if (this.e == null) {
            om omVarP = p(this.a, !this.p);
            this.e = omVarP;
            omVarP.setAdapter(this.b);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new pf(this));
            this.e.setOnScrollListener(this.v);
            this.q.setContentView(this.e);
        }
        Drawable background = this.q.getBackground();
        if (background != null) {
            background.getPadding(this.w);
            i = this.w.top + this.w.bottom;
            if (!this.s) {
                this.d = -this.w.top;
            }
        } else {
            this.w.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = this.q.getMaxAvailableHeight(this.l, this.d, this.q.getInputMethodMode() == 2);
        if (this.c == -1) {
            paddingTop = maxAvailableHeight + i;
        } else {
            int i2 = this.f;
            switch (i2) {
                case -2:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.getResources().getDisplayMetrics().widthPixels - (this.w.left + this.w.right), Integer.MIN_VALUE);
                    break;
                case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.getResources().getDisplayMetrics().widthPixels - (this.w.left + this.w.right), 1073741824);
                    break;
                default:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                    break;
            }
            int iB = this.e.b(iMakeMeasureSpec, maxAvailableHeight);
            paddingTop = iB + (iB > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0);
        }
        boolean zW = w();
        hr.b(this.q, this.r);
        if (this.q.isShowing()) {
            if (gl.U(this.l)) {
                int width = this.f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.l.getWidth();
                }
                int i3 = this.c;
                if (i3 == -1) {
                    if (true != zW) {
                        paddingTop = -1;
                    }
                    if (zW) {
                        this.q.setWidth(this.f == -1 ? -1 : 0);
                        this.q.setHeight(0);
                    } else {
                        this.q.setWidth(this.f == -1 ? -1 : 0);
                        this.q.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    paddingTop = i3;
                }
                this.q.setOutsideTouchable(true);
                this.q.update(this.l, this.g, this.d, width < 0 ? -1 : width, paddingTop < 0 ? -1 : paddingTop);
                return;
            }
            return;
        }
        int width2 = this.f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.l.getWidth();
        }
        int i4 = this.c;
        if (i4 == -1) {
            paddingTop = -1;
        } else if (i4 != -2) {
            paddingTop = i4;
        }
        this.q.setWidth(width2);
        this.q.setHeight(paddingTop);
        this.q.setIsClippedToScreen(true);
        this.q.setOutsideTouchable(true);
        this.q.setTouchInterceptor(this.u);
        if (this.i) {
            hr.a(this.q, this.h);
        }
        this.q.setEpicenterBounds(this.x);
        hq.a(this.q, this.l, this.g, this.d, this.j);
        this.e.setSelection(-1);
        if (!this.p || this.e.isInTouchMode()) {
            q();
        }
        if (this.p) {
            return;
        }
        this.o.post(this.y);
    }

    public final void t(Rect rect) {
        this.x = rect != null ? new Rect(rect) : null;
    }

    @Override // defpackage.lo
    public final boolean u() {
        return this.q.isShowing();
    }

    public final void v(PopupWindow.OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }

    public final boolean w() {
        return this.q.getInputMethodMode() == 2;
    }

    public final void x() {
        this.q.setInputMethodMode(2);
    }

    public final void y() {
        this.p = true;
        this.q.setFocusable(true);
    }
}
