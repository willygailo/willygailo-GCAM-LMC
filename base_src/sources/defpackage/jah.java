package defpackage;

import android.os.Handler;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.Choreographer;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.widget.TracedFrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class jah extends TracedFrameLayout {
    public int a;
    public jag b;
    public final ViewGroup c;
    private final TextView d;
    private final Handler e;

    public jah(FrameLayout frameLayout) {
        super(frameLayout.getContext());
        this.a = 0;
        this.e = new jaf(this);
        this.c = frameLayout;
        setTag("countdown");
        TextView textView = new TextView(frameLayout.getContext(), null, R.style.CountdownTextStyle);
        mip.ep(textView);
        this.d = textView;
        textView.setTextAppearance(R.style.CountdownTextStyle);
        textView.setGravity(17);
        addView(textView);
    }

    public final void a() {
        if (this.a > 0) {
            this.a = 0;
            this.e.removeMessages(1);
            this.c.removeView(this);
        }
    }

    public final void b(boolean z, int i) {
        jac jacVar;
        jad jadVar;
        this.a = i;
        jag jagVar = this.b;
        if (jagVar != null && (jadVar = (jacVar = (jac) jagVar).h) != null) {
            if (z) {
                jadVar.z();
            } else {
                jadVar.C(i);
            }
            if (i == 0) {
                jacVar.h.y();
            } else if (jacVar.g.g() && !jacVar.b.j() && jacVar.c.k(ddl.bo) && gxm.b() && ((Boolean) jacVar.e.fA()).booleanValue()) {
                if (i > 1) {
                    try {
                        ((jac) jagVar).i = ((lnc) jacVar.g.c()).c();
                        ((jac) jagVar).b(true, ((jac) jagVar).i, false, false);
                    } catch (InterruptedException | llv e) {
                        throw new AssertionError("Unhandled exception");
                    }
                }
                if (i > 3) {
                    jacVar.c(false, 300, true, false);
                } else if (i > 1) {
                    jacVar.c(false, 66, false, false);
                    jacVar.c(true, ScriptIntrinsicBLAS.UNIT, false, false);
                    jacVar.c(false, 198, true, i <= 2);
                }
            } else {
                ((oug) ((oug) jac.a.b()).G((char) 3230)).o("Should not fire Led indicator");
            }
        }
        if (i == 0) {
            this.c.removeView(this);
            return;
        }
        String str = String.format(getResources().getConfiguration().locale, "%d", Integer.valueOf(i));
        this.d.setText(str);
        this.d.announceForAccessibility(str);
        c();
        this.e.sendEmptyMessageDelayed(1, 1000L);
    }

    public final void c() {
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight = this.d.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: jae
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    this.a.c();
                }
            });
            return;
        }
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        this.d.setPivotX(measuredWidth >> 1);
        this.d.setPivotY(measuredHeight >> 1);
        this.d.setAlpha(1.0f);
        this.d.animate().scaleX(1.375f).scaleY(1.375f).alpha(0.0f).setDuration(250L).start();
    }

    public final boolean d() {
        return this.a > 0;
    }
}
