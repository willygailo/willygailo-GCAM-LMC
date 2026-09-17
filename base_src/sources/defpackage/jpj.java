package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.captureframe.CaptureFrameUi;

/* JADX INFO: loaded from: classes2.dex */
public final class jpj implements jqn {
    private final qkg a;
    private final ivf b;

    public jpj(ivf ivfVar, qkg qkgVar) {
        this.b = ivfVar;
        this.a = qkgVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        final CaptureFrameUi captureFrameUi = (CaptureFrameUi) ((jnr) this.a.get()).c.c(R.id.capture_frame);
        final ivf ivfVar = this.b;
        ivfVar.a = ValueAnimator.ofFloat(0.0f, 1.0f);
        ivfVar.a.setDuration(60L);
        ivfVar.a.setInterpolator(new LinearInterpolator());
        ivfVar.a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ivd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iArgb;
                ivf ivfVar2 = ivfVar;
                CaptureFrameUi captureFrameUi2 = captureFrameUi;
                synchronized (ivfVar2.d) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int iA = ivfVar2.b.a();
                    ivh ivhVar = ivfVar2.b;
                    int iArgb2 = Color.argb(iA, ivhVar.e, ivhVar.f, ivhVar.g);
                    if (ivfVar2.c.equals(ivh.HIDDEN)) {
                        int iA2 = ivfVar2.c.a();
                        ivh ivhVar2 = ivfVar2.b;
                        iArgb = Color.argb(iA2, ivhVar2.e, ivhVar2.f, ivhVar2.g);
                    } else {
                        int iA3 = ivfVar2.c.a();
                        ivh ivhVar3 = ivfVar2.c;
                        iArgb = Color.argb(iA3, ivhVar3.e, ivhVar3.f, ivhVar3.g);
                    }
                    captureFrameUi2.b.setColor(ek.b(iArgb2, iArgb, fFloatValue));
                    captureFrameUi2.invalidate();
                }
            }
        });
        ivfVar.a.addListener(new ive(ivfVar, captureFrameUi));
    }
}
