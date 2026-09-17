package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;

/* JADX INFO: loaded from: classes2.dex */
public final class jdw implements View.OnTouchListener {
    final /* synthetic */ ModeSlider a;

    public jdw(ModeSlider modeSlider) {
        this.a = modeSlider;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        ModeSlider modeSlider = (ModeSlider) view;
        if (!modeSlider.j()) {
            return false;
        }
        if (this.a.a == null || motionEvent.getAction() != 0) {
            i = 0;
        } else {
            if (view.getParent() != null) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.a.a.c(true);
            i = 0;
        }
        while (i < modeSlider.getChildCount()) {
            View childAt = modeSlider.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                rect.top = Integer.MIN_VALUE;
                rect.bottom = Integer.MAX_VALUE;
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    this.a.l(i, true);
                    break;
                }
            }
            i++;
        }
        if (this.a.a != null && motionEvent.getAction() == 1) {
            this.a.a.b(view, true);
            if (view.getParent() != null) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return true;
    }
}
