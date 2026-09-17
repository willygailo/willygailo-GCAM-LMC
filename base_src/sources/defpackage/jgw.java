package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.notificationchip.NotificationChipView;
import j$.util.Objects;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class jgw implements jgu {
    private final int a;
    private final boolean b;
    private final Context c;
    private final boolean d;
    private final boolean e;
    private final View.OnClickListener f;
    private final jgt g;
    private Date h;
    private NotificationChipView i;
    private Date j;
    private String k;
    private final int l;

    public jgw(Context context, String str, int i, int i2, boolean z, View.OnClickListener onClickListener, jgt jgtVar, boolean z2, boolean z3) {
        this.c = context;
        this.k = str;
        this.a = i;
        this.l = i2;
        this.b = z;
        this.f = onClickListener;
        this.g = jgtVar;
        this.d = z2;
        this.e = z3;
        if (z3) {
            return;
        }
        context.getDrawable(R.drawable.notification_chip_background).setTint(context.getColor(R.color.notification_chip_background_color_legacy));
        context.getDrawable(R.drawable.notification_chip_multiple_lines_background).setTint(context.getColor(R.color.notification_chip_background_color_legacy));
    }

    @Override // defpackage.elv
    public final int a() {
        return this.a + 500;
    }

    @Override // defpackage.elv
    public final elx b() {
        return elx.NOTIFICATION_CHIP;
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
        return this.j;
    }

    public final boolean equals(Object obj) {
        Date date;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgw)) {
            return false;
        }
        jgw jgwVar = (jgw) obj;
        return this.a == jgwVar.a && this.b == jgwVar.b && this.l == jgwVar.l && Objects.equals(this.k, jgwVar.k) && Objects.equals(this.f, jgwVar.f) && Objects.equals(this.g, jgwVar.g) && (date = this.h) != null && jgwVar.h != null && date.getTime() == jgwVar.h.getTime();
    }

    @Override // defpackage.elv
    public final void f(Runnable runnable) {
        String strValueOf = String.valueOf(getClass().getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Unsupported Operation delayedHide(Runnable) in: ".concat(strValueOf) : new String("Unsupported Operation delayedHide(Runnable) in: "));
    }

    @Override // defpackage.elv
    public final void g() {
        NotificationChipView notificationChipView = this.i;
        notificationChipView.b.a.end();
        notificationChipView.setVisibility(8);
        if (!notificationChipView.d) {
            notificationChipView.a();
        }
        jgt jgtVar = notificationChipView.e;
        if (jgtVar != null) {
            jgtVar.a(new Date().getTime() - notificationChipView.f);
        }
    }

    @Override // defpackage.elv
    public final void h() {
        this.i.a();
        NotificationChipView notificationChipView = this.i;
        if (notificationChipView.b.b.isRunning()) {
            notificationChipView.b.b.reverse();
        }
        this.i.c(this.a);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.l), Boolean.valueOf(this.b), this.k, this.f, this.g, this.h);
    }

    @Override // defpackage.elv
    public final void i(Date date) {
        this.j = date;
    }

    @Override // defpackage.elv
    public final void j() {
        this.h = new Date();
        final NotificationChipView notificationChipView = (NotificationChipView) ((Activity) this.c).findViewById(R.id.notification_chip_view);
        this.i = notificationChipView;
        String str = this.k;
        int i = this.a;
        boolean z = this.b;
        View.OnClickListener onClickListener = this.f;
        jgt jgtVar = this.g;
        notificationChipView.c = i;
        notificationChipView.d = z;
        notificationChipView.e = jgtVar;
        notificationChipView.setText(str);
        notificationChipView.setOnClickListener(onClickListener);
        notificationChipView.g = new Runnable() { // from class: jgy
            @Override // java.lang.Runnable
            public final void run() {
                AnimatorSet animatorSet = notificationChipView.b.b;
                if (animatorSet != null) {
                    animatorSet.start();
                }
            }
        };
        ((ViewGroup) notificationChipView.getParent()).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jgx
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                notificationChipView.b();
            }
        });
        jro jroVarB = jro.b(200, new LinearInterpolator());
        jroVarB.c(notificationChipView, "alpha", 0.0f, 1.0f);
        jroVarB.a = 200;
        jroVarB.c(notificationChipView, "scaleX", 0.5f, 1.0f);
        jroVarB.c(notificationChipView, "scaleY", 0.5f, 1.0f);
        notificationChipView.b.a = jroVarB.a();
        jro jroVarB2 = jro.b(500, new LinearInterpolator());
        jroVarB2.c(notificationChipView, "alpha", 1.0f, 0.0f);
        notificationChipView.b.b = jroVarB2.a();
        if (!this.e) {
            this.i.setTextColor(this.c.getColor(R.color.notification_chip_text_color_legacy));
            this.i.setTypeface(null);
        }
        NotificationChipView notificationChipView2 = this.i;
        notificationChipView2.setBackground(notificationChipView2.getLineCount() > 1 ? notificationChipView2.a.getDrawable(R.drawable.notification_chip_multiple_lines_background) : notificationChipView2.a.getDrawable(R.drawable.notification_chip_background));
        notificationChipView2.setPaddingRelative(notificationChipView2.a.getResources().getDimensionPixelSize(R.dimen.notification_chip_text_padding_left), notificationChipView2.a.getResources().getDimensionPixelSize(R.dimen.notification_chip_text_padding_top), notificationChipView2.a.getResources().getDimensionPixelSize(R.dimen.notification_chip_text_padding_right), notificationChipView2.a.getResources().getDimensionPixelSize(R.dimen.notification_chip_text_padding_bottom));
        notificationChipView2.b();
        notificationChipView2.b.a.start();
        notificationChipView2.setVisibility(0);
        notificationChipView2.sendAccessibilityEvent(32768);
        if (!notificationChipView2.d) {
            notificationChipView2.c(notificationChipView2.c);
        }
        notificationChipView2.f = new Date().getTime();
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // defpackage.elv
    public final boolean l() {
        return this.d;
    }

    @Override // defpackage.elv
    public final boolean m() {
        return this.b;
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
        return this.l;
    }

    @Override // defpackage.elv
    public final /* synthetic */ void q(int i, boolean z, boolean z2) {
    }

    @Override // defpackage.jgu
    public final Date r() {
        return this.h;
    }

    @Override // defpackage.jgu
    public final void s(String str) {
        this.k = str;
        NotificationChipView notificationChipView = this.i;
        if (notificationChipView != null) {
            notificationChipView.setText(str);
        }
    }
}
