package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class nya extends ja {
    public BottomSheetBehavior a;
    public FrameLayout b;
    public boolean c;
    boolean d;
    public boolean e;
    public boolean f;
    public nxr g;
    private FrameLayout h;
    private CoordinatorLayout i;
    private final boolean j;
    private final nxr k;

    public nya(Context context, int i) {
        super(context, i);
        this.d = true;
        this.e = true;
        this.k = new nxy(this);
        d();
        this.j = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public static void e(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    private final View f(int i, View view, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.j) {
            gl.N(this.b, new nxv(this));
        }
        this.b.removeAllViews();
        if (layoutParams == null) {
            this.b.addView(view);
        } else {
            this.b.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new nxw(this));
        gl.F(this.b, new nxx(this));
        this.b.setOnTouchListener(new guf(4));
        return this.h;
    }

    private final void g() {
        if (this.h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.h = frameLayout;
            this.i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(R.id.design_bottom_sheet);
            this.b = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorZ = BottomSheetBehavior.z(frameLayout2);
            this.a = bottomSheetBehaviorZ;
            bottomSheetBehaviorZ.A(this.k);
            this.a.D(this.d);
        }
    }

    public final BottomSheetBehavior a() {
        if (this.a == null) {
            g();
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior bottomSheetBehaviorA = a();
        if (!this.c || bottomSheetBehaviorA.s == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorA.F(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.j && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // defpackage.ja, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.s != 5) {
            return;
        }
        bottomSheetBehavior.F(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.d != z) {
            this.d = z;
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.D(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.d) {
            this.d = true;
        }
        this.e = z;
        this.f = true;
    }

    @Override // defpackage.ja, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(f(i, null, null));
    }

    @Override // defpackage.ja, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(f(0, view, null));
    }

    @Override // defpackage.ja, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(0, view, layoutParams));
    }
}
