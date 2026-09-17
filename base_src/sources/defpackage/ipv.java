package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
class ipv extends iph {
    final /* synthetic */ ipx b;

    public ipv(ipx ipxVar) {
        this.b = ipxVar;
    }

    @Override // defpackage.iph
    public void d() {
        int height;
        FrameLayout.LayoutParams layoutParams;
        int width = 0;
        if (this.b.h.k(dcu.J)) {
            this.b.i.v(false);
            this.b.i.l(false);
        } else {
            this.b.n.b();
        }
        jxn.c();
        this.b.g.d(false);
        this.b.f.startTimelapseRecording();
        this.b.k.Z();
        this.b.l.g();
        this.b.j.l();
        iqj iqjVar = this.b.l;
        if (iqjVar.k.k(dcu.J)) {
            boolean z = iqjVar.L.a(((Double) iqjVar.z.fA()).doubleValue()) != 1.0d;
            jaq jaqVarA = jar.a();
            jaqVarA.e(z);
            jaqVarA.d(true);
            iqjVar.j.d(jaqVarA.a());
            iqjVar.j.f();
            iqjVar.I = ((cmr) iqjVar.A).get();
            iqjVar.I.e();
            return;
        }
        final iro iroVar = iqjVar.i;
        iroVar.a();
        AtomicLong atomicLong = iroVar.e;
        jun junVar = iroVar.h;
        atomicLong.set(System.currentTimeMillis());
        iroVar.j = new Timer();
        iroVar.j.scheduleAtFixedRate(new irn(iroVar), 0L, 500L);
        jrz jrzVarA = jrz.a(iroVar.f.getDisplay(), iroVar.f.getContext());
        switch (jrzVarA) {
            case PORTRAIT:
                int[] iArr = new int[2];
                iroVar.k.getLocationInWindow(iArr);
                height = (iArr[1] + (iroVar.k.getHeight() / 2)) - (iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_container_height) / 2);
                break;
            case LANDSCAPE:
            case REVERSE_LANDSCAPE:
                height = iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_landscape_bottom_margin);
                break;
            default:
                height = 0;
                break;
        }
        int[] iArr2 = new int[2];
        Object objC = iroVar.i.k.c(R.id.uncovered_preview_layout);
        switch (jrzVarA.ordinal()) {
            case 1:
            case 2:
                View view = (View) objC;
                view.getLocationInWindow(iArr2);
                width = (iArr2[0] + (view.getWidth() / 2)) - (iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_container_width) / 2);
                break;
        }
        switch (jrzVarA.ordinal()) {
            case 1:
                layoutParams = new FrameLayout.LayoutParams(iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_container_width), iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_container_height), 80);
                layoutParams.bottomMargin = height;
                layoutParams.leftMargin = width;
                break;
            case 2:
                layoutParams = new FrameLayout.LayoutParams(iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_container_width), iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_container_height), 48);
                layoutParams.topMargin = height;
                layoutParams.leftMargin = width;
                break;
            default:
                layoutParams = new FrameLayout.LayoutParams(iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_container_width), iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_container_height), 49);
                layoutParams.topMargin = height;
                break;
        }
        iroVar.f.setLayoutParams(layoutParams);
        iroVar.f.requestLayout();
        iroVar.f.animate().setDuration(60L).setStartDelay(517L).alpha(1.0f).withStartAction(new Runnable() { // from class: irl
            @Override // java.lang.Runnable
            public final void run() {
                iroVar.f.setVisibility(0);
            }
        });
    }
}
