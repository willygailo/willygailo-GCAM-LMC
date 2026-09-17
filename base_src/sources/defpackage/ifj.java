package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class ifj {
    public final RoundedThumbnailView a;
    public final Duration b;
    public jrz c = jrz.PORTRAIT;
    public ConstraintLayout d;
    private final ojz e;
    private final ViewGroup f;

    public ifj(Context context, ojz ojzVar, final RoundedThumbnailView roundedThumbnailView) {
        this.e = ojzVar;
        this.a = roundedThumbnailView;
        ViewGroup viewGroup = (ViewGroup) roundedThumbnailView.getParent();
        this.f = viewGroup;
        this.b = Duration.ofMillis(context.getResources().getInteger(R.integer.social_anim_duration_default));
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: iff
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ifj ifjVar = this.a;
                final RoundedThumbnailView roundedThumbnailView2 = roundedThumbnailView;
                if (roundedThumbnailView2.getParent() == ifjVar.d) {
                    ifjVar.a(roundedThumbnailView2);
                    roundedThumbnailView2.post(new Runnable() { // from class: ifg
                        @Override // java.lang.Runnable
                        public final void run() {
                            roundedThumbnailView2.requestLayout();
                        }
                    });
                }
            }
        });
    }

    public final void a(View view) {
        if (view.getParent() == this.d) {
            Rect rect = new Rect();
            jbt jbtVar = ((jbw) this.e.a()).b;
            Rect rect2 = jbtVar.i;
            Size size = jbtVar.b;
            Point point = new Point();
            jrz jrzVar = jrz.PORTRAIT;
            switch (this.c.ordinal()) {
                case 1:
                    point.x = size.getHeight() - rect2.height();
                    point.y = rect2.left;
                    break;
                case 2:
                    point.x = rect2.top;
                    point.y = (size.getWidth() - rect2.left) - rect2.width();
                    break;
                default:
                    point.x = rect2.left;
                    point.y = rect2.top;
                    break;
            }
            int width = this.f.getWidth();
            int width2 = this.a.getWidth();
            int height = this.f.getHeight();
            int height2 = this.a.getHeight();
            rect.left = point.x + this.f.getLeft() + ((width - width2) / 2);
            rect.top = point.y + this.f.getTop() + ((height - height2) / 2);
            rect.right = rect.left + this.a.getWidth();
            rect.bottom = rect.top + this.a.getHeight();
            ah ahVar = new ah();
            ahVar.d(this.d);
            ahVar.e(view.getId(), 6, 0, 6, rect.left);
            ahVar.e(view.getId(), 3, 0, 3, rect.top);
            ahVar.b(this.d);
        }
    }

    final void b(final ConstraintLayout constraintLayout) {
        Runnable runnable = new Runnable() { // from class: ifh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(constraintLayout);
            }
        };
        if (this.a.getLeft() == 0 || this.a.getTop() == 0 || this.a.getRight() == 0 || this.a.getBottom() == 0) {
            this.a.post(runnable);
            return;
        }
        if (this.a.getParent() == constraintLayout || ((jbw) this.e.a()).a.j == jce.TABLET_LAYOUT) {
            return;
        }
        this.d = constraintLayout;
        RoundedThumbnailView roundedThumbnailView = (RoundedThumbnailView) constraintLayout.findViewById(R.id.thumbnail_button);
        a(roundedThumbnailView);
        int iIndexOfChild = ((ViewGroup) roundedThumbnailView.getParent()).indexOfChild(roundedThumbnailView);
        ViewGroup.LayoutParams layoutParams = roundedThumbnailView.getLayoutParams();
        constraintLayout.removeView(roundedThumbnailView);
        this.f.removeView(this.a);
        this.a.setRotation(mip.eq(this.c));
        this.a.setShrinkTouchArea(true);
        constraintLayout.addView(this.a, iIndexOfChild, layoutParams);
    }
}
