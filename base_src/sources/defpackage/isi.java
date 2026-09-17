package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.toast.EducationToastView;
import com.google.android.apps.camera.toast.ToastView;
import j$.time.Duration;
import j$.util.Objects;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class isi implements elv {
    public final ViewGroup a;
    public final String b;
    public final String c;
    public final Runnable d;
    public Runnable e;
    private final Duration g;
    private final View h;
    private final boolean j;
    private final gtg k;
    private final fjs l;
    private Date m;
    private ToastView n;
    private final int o;
    public Runnable f = isd.c;
    private final int i = 0;

    public isi(Duration duration, ViewGroup viewGroup, View view, String str, String str2, Runnable runnable, int i, boolean z, gtg gtgVar, fjs fjsVar) {
        this.g = duration;
        this.a = viewGroup;
        this.h = view;
        this.b = str;
        this.c = str2;
        this.d = runnable;
        this.o = i;
        this.j = z;
        this.k = gtgVar;
        this.l = fjsVar;
    }

    private static void r(ToastView toastView, View view) {
        FrameLayout frameLayout = (FrameLayout) toastView.findViewById(R.id.toast_inner_layout);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams(marginLayoutParams);
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.removeAllViewsInLayout();
        frameLayout.addView(view);
    }

    @Override // defpackage.elv
    public final int a() {
        return (int) (this.g.toMillis() + ToastView.d.toMillis() + ToastView.e.toMillis());
    }

    @Override // defpackage.elv
    public final elx b() {
        return this.j ? elx.SECOND_RUN_TOAST : elx.FIRST_RUN_TOAST;
    }

    @Override // defpackage.elv
    public final /* synthetic */ Object c() {
        return enl.t();
    }

    @Override // defpackage.elv
    public final /* synthetic */ Runnable d() {
        return null;
    }

    @Override // defpackage.elv
    public final Date e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isi)) {
            return false;
        }
        isi isiVar = (isi) obj;
        int i = isiVar.i;
        return this.j == isiVar.j && Objects.equals(this.g, isiVar.g) && Objects.equals(this.a, isiVar.a) && Objects.equals(this.b, isiVar.b) && Objects.equals(this.c, isiVar.c) && this.o == isiVar.o;
    }

    @Override // defpackage.elv
    public final void f(Runnable runnable) {
        String strValueOf = String.valueOf(getClass().getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Unsupported Operation delayedHide(Runnable) in: ".concat(strValueOf) : new String("Unsupported Operation delayedHide(Runnable) in: "));
    }

    @Override // defpackage.elv
    public final void g() {
        ToastView toastView = this.n;
        if (toastView != null) {
            Runnable runnable = toastView.i;
            if (runnable != null) {
                toastView.removeCallbacks(runnable);
            }
            toastView.setAlpha(0.0f);
            toastView.m.dismiss();
            toastView.removeAllViews();
            ViewGroup viewGroup = (ViewGroup) toastView.getParent();
            if (viewGroup == null) {
                return;
            }
            viewGroup.removeView(toastView);
        }
    }

    @Override // defpackage.elv
    public final /* synthetic */ void h() {
    }

    public final int hashCode() {
        return Objects.hash(this.g, this.a, this.b, this.c, 0, Integer.valueOf(this.o), Boolean.valueOf(this.j));
    }

    @Override // defpackage.elv
    public final void i(Date date) {
        this.m = date;
    }

    @Override // defpackage.elv
    public final void j() {
        if (!this.j) {
            ToastView toastViewE = ToastView.e(this);
            this.n = toastViewE;
            View view = this.h;
            if (view != null) {
                r(toastViewE, view);
            }
            this.n.g();
            return;
        }
        View view2 = this.h;
        if (view2 != null) {
            EducationToastView educationToastViewA = EducationToastView.a(this);
            this.n = educationToastViewA;
            r(educationToastViewA, view2);
            this.n.g();
            return;
        }
        if (this.k.F()) {
            this.e.run();
            return;
        }
        this.k.f(new isf(this));
        EducationToastView educationToastViewA2 = EducationToastView.a(this);
        this.n = educationToastViewA2;
        educationToastViewA2.g();
        this.l.au();
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // defpackage.elv
    public final boolean m() {
        return false;
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // defpackage.elv
    public final int p() {
        return this.o;
    }

    @Override // defpackage.elv
    public final /* synthetic */ void q(int i, boolean z, boolean z2) {
    }
}
