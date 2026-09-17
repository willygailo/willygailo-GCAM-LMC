package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

/* JADX INFO: loaded from: classes2.dex */
public final class jrh {
    public final ZoomLockView a;
    public final ImageView b;
    public final ImageView c;
    public final Resources d;
    public MotionEvent e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public final float j;

    public jrh(ZoomLockView zoomLockView) {
        this.a = zoomLockView;
        this.b = zoomLockView.b;
        this.c = zoomLockView.a;
        Resources resources = zoomLockView.getResources();
        this.d = resources;
        this.j = (resources.getDimensionPixelSize(R.dimen.zoom_lock_translation) - (resources.getDimensionPixelSize(R.dimen.zoom_lock_icon_size) / 2)) + resources.getDimensionPixelSize(R.dimen.zoom_dot_trans_adjust);
    }

    public static final float c(float f, float f2, float f3) {
        float fMin = Math.min(f2, f3);
        float fMax = Math.max(f2, f3);
        if (f <= fMin) {
            f = fMin;
        }
        return f >= fMax ? fMax : f;
    }

    public final void a() {
        this.e = null;
        ZoomLockView zoomLockView = this.a;
        if (zoomLockView.c.isRunning()) {
            zoomLockView.c.cancel();
        }
        if (zoomLockView.getVisibility() != 8) {
            zoomLockView.d.start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    public final void b(boolean z) {
        jrz jrzVar = this.a.g;
        Point pointEl = mip.el(this.b);
        float width = pointEl.x + (this.b.getWidth() / 2);
        float height = pointEl.y + (this.b.getHeight() / 2);
        jrz jrzVar2 = jrz.PORTRAIT;
        switch (jrzVar.ordinal()) {
            case 1:
                float height2 = pointEl.y - this.b.getHeight();
                if (height2 <= mip.el(this.c).y && height2 >= mip.el(this.c).y - this.c.getHeight()) {
                    if (!this.i && (!this.a.c.isRunning() || z)) {
                        if (!this.h) {
                            this.c.setImageDrawable(this.d.getDrawable(R.drawable.ic_lock_24dp_white, null));
                            this.h = true;
                        }
                    }
                }
                if (this.h) {
                    this.c.setImageDrawable(this.d.getDrawable(R.drawable.ic_lock_24dp, null));
                    this.h = false;
                }
                break;
            case 2:
                if (height >= mip.el(this.c).y && height <= mip.el(this.c).y + this.c.getHeight()) {
                    if (!this.i) {
                        if (!this.h) {
                            this.c.setImageDrawable(this.d.getDrawable(R.drawable.ic_lock_24dp_white, null));
                            this.h = true;
                        }
                    }
                }
                if (this.h) {
                    this.c.setImageDrawable(this.d.getDrawable(R.drawable.ic_lock_24dp, null));
                    this.h = false;
                }
                break;
            default:
                Point pointEl2 = mip.el(this.c);
                if (pointEl2.x <= width && width <= pointEl2.x + this.c.getWidth() && pointEl2.y <= height && height <= pointEl2.y + this.c.getHeight()) {
                    if (!this.i) {
                        if (!this.h) {
                            this.c.setImageDrawable(this.d.getDrawable(R.drawable.ic_lock_24dp_white, null));
                            this.h = true;
                        }
                    }
                }
                if (this.h) {
                    this.c.setImageDrawable(this.d.getDrawable(R.drawable.ic_lock_24dp, null));
                    this.h = false;
                }
                break;
        }
    }
}
