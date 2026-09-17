package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ius implements fik, fie {
    public final Context a;
    public final lar b;
    public final ddf c;
    public nya d;
    public iur e;
    public View.OnScrollChangeListener f;
    public lic g;
    public epp i;
    private final View.OnLayoutChangeListener l;
    private final fjs m;
    public int j = 1;
    public long h = 0;
    public poy k = ozy.e.m();
    private final View.OnScrollChangeListener n = new View.OnScrollChangeListener() { // from class: iul
        @Override // android.view.View.OnScrollChangeListener
        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            View.OnScrollChangeListener onScrollChangeListener = this.a.f;
            if (onScrollChangeListener != null) {
                onScrollChangeListener.onScrollChange(view, i, i2, i3, i4);
            }
        }
    };

    public ius(Context context, lar larVar, final gvb gvbVar, final fhv fhvVar, fjs fjsVar, ddf ddfVar) {
        this.a = context;
        this.b = larVar;
        this.c = ddfVar;
        this.g = gvbVar.f();
        this.l = new View.OnLayoutChangeListener() { // from class: iuk
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                lic licVar;
                ius iusVar = this.a;
                gvb gvbVar2 = gvbVar;
                lic licVar2 = iusVar.g;
                iusVar.g = gvbVar2.f();
                iur iurVar = iusVar.e;
                if (iurVar == null || (licVar = iusVar.g) == licVar2) {
                    return;
                }
                iurVar.b(licVar);
            }
        };
        this.m = fjsVar;
        larVar.c(new Runnable() { // from class: iuh
            @Override // java.lang.Runnable
            public final void run() {
                fhvVar.e(this.a);
            }
        });
    }

    public final ViewGroup a(View view, Context context) {
        FrameLayout frameLayout;
        lar.a();
        d();
        nya nyaVar = new nya(context, true != this.c.k(ddl.ay) ? R.style.Theme_BottomSheet_Legacy : R.style.Theme_BottomSheet);
        this.d = nyaVar;
        nyaVar.setContentView(true != this.c.k(ddl.ay) ? R.layout.bottom_sheet_frame_legacy : R.layout.bottom_sheet_frame);
        nyaVar.c = true;
        if (this.c.k(ddl.ay)) {
            View viewFindViewById = nyaVar.findViewById(R.id.bottomsheet_container);
            if (viewFindViewById != null) {
                Drawable drawable = context.getDrawable(R.drawable.sheet_background);
                if (drawable != null) {
                    drawable.setTint(mip.aH(R.dimen.gm_sys_elevation_level1, context));
                }
                viewFindViewById.setBackground(drawable);
            }
            View viewInflate = View.inflate(context, R.layout.handle_bar, null);
            FrameLayout frameLayout2 = (FrameLayout) nyaVar.findViewById(R.id.bottomsheet_handle_bar_container);
            if (frameLayout2 != null) {
                frameLayout2.addView(viewInflate);
                frameLayout2.setVisibility(0);
            }
        } else {
            ImageView imageView = (ImageView) nyaVar.findViewById(R.id.bottomsheet_handle_bar);
            imageView.getClass();
            imageView.setVisibility(0);
        }
        Window window = nyaVar.getWindow();
        window.getClass();
        window.addFlags(1024);
        NestedScrollView nestedScrollView = (NestedScrollView) nyaVar.findViewById(R.id.sheet_content);
        nestedScrollView.getClass();
        nestedScrollView.addOnLayoutChangeListener(this.l);
        nestedScrollView.setOnScrollChangeListener(this.n);
        if (view != null && (frameLayout = (FrameLayout) nyaVar.findViewById(R.id.sheet_title_frame)) != null) {
            frameLayout.addView(view);
        }
        return nestedScrollView;
    }

    public final void c(ViewGroup viewGroup) {
        iur iurVar = this.e;
        if (iurVar != null) {
            iurVar.b(this.g);
        }
        final nya nyaVar = this.d;
        if (nyaVar == null) {
            return;
        }
        final NestedScrollView nestedScrollView = (NestedScrollView) nyaVar.findViewById(R.id.sheet_content);
        nestedScrollView.getClass();
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new iuq(viewGroup, new Runnable() { // from class: iuo
            @Override // java.lang.Runnable
            public final void run() {
                ius iusVar = this.a;
                NestedScrollView nestedScrollView2 = nestedScrollView;
                nya nyaVar2 = nyaVar;
                if (!nestedScrollView2.canScrollVertically(1) || iusVar.a.getResources().getConfiguration().orientation == 2) {
                    nyaVar2.a().F(3);
                }
            }
        }));
        nyaVar.a().q = true;
        nyaVar.a().D(true);
    }

    public final void d() {
        this.b.c(new Runnable() { // from class: ium
            @Override // java.lang.Runnable
            public final void run() {
                ius iusVar = this.a;
                nya nyaVar = iusVar.d;
                if (nyaVar != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) nyaVar.findViewById(R.id.sheet_content);
                    nestedScrollView.getClass();
                    nestedScrollView.removeAllViews();
                    nya nyaVar2 = iusVar.d;
                    nyaVar2.getClass();
                    nyaVar2.cancel();
                }
            }
        });
    }

    public final void e() {
        int i = this.j;
        if (i == 1 || this.h == 0) {
            return;
        }
        poy poyVar = this.k;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        ozy ozyVar = (ozy) poyVar.b;
        int i2 = i - 1;
        ozy ozyVar2 = ozy.e;
        if (i == 0) {
            throw null;
        }
        ozyVar.b = i2;
        ozyVar.a |= 1;
        long jCurrentTimeMillis = (int) (System.currentTimeMillis() - this.h);
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        ozy ozyVar3 = (ozy) poyVar.b;
        ozyVar3.a |= 2;
        ozyVar3.c = jCurrentTimeMillis;
        epp eppVar = this.i;
        if (eppVar != null) {
            poy poyVar2 = this.k;
            epw epwVar = eppVar.a;
            epwVar.a();
            List list = epwVar.b;
            if (poyVar2.c) {
                poyVar2.m();
                poyVar2.c = false;
            }
            ozy ozyVar4 = (ozy) poyVar2.b;
            ppm ppmVar = ozyVar4.d;
            if (!ppmVar.c()) {
                ozyVar4.d = ppd.B(ppmVar);
            }
            pnl.e(list, ozyVar4.d);
        }
        this.m.o((ozy) this.k.j());
    }

    public final void f(int i, int i2, View view) {
        g(i, i2, view, null, this.a);
    }

    @Override // defpackage.fie
    public final void fU() {
        d();
    }

    public final void g(int i, int i2, View view, DialogInterface.OnDismissListener onDismissListener, Context context) {
        h(i, i2, view, onDismissListener, context, null);
    }

    public final void h(int i, final int i2, final View view, final DialogInterface.OnDismissListener onDismissListener, final Context context, epp eppVar) {
        if (this.c.k(ddl.aL)) {
            return;
        }
        this.b.execute(new Runnable() { // from class: iun
            @Override // java.lang.Runnable
            public final void run() {
                FrameLayout frameLayout;
                final ius iusVar = this.a;
                int i3 = i2;
                Context context2 = context;
                View view2 = view;
                final DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                if (i3 >= 0) {
                    frameLayout = new FrameLayout(context2);
                    View.inflate(context2, true != iusVar.c.k(ddl.ay) ? R.layout.title_text_legacy : R.layout.title_text, frameLayout);
                    ((TextView) frameLayout.findViewById(R.id.sheet_title)).setText(i3);
                } else {
                    frameLayout = null;
                }
                ViewGroup viewGroupA = iusVar.a(frameLayout, context2);
                viewGroupA.addView(view2);
                iusVar.c(viewGroupA);
                nya nyaVar = iusVar.d;
                if (nyaVar != null) {
                    nyaVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: iuj
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ius iusVar2 = iusVar;
                            DialogInterface.OnDismissListener onDismissListener3 = onDismissListener2;
                            iusVar2.e();
                            if (onDismissListener3 != null) {
                                onDismissListener3.onDismiss(dialogInterface);
                            }
                        }
                    });
                    iusVar.d.show();
                }
            }
        });
        this.h = System.currentTimeMillis();
        this.k = ozy.e.m();
        this.i = eppVar;
        this.j = i;
    }
}
