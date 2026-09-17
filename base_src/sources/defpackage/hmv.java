package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.rewind.RewindThumbnailScrollView;

/* JADX INFO: loaded from: classes2.dex */
final class hmv implements View.OnTouchListener {
    final /* synthetic */ RewindThumbnailScrollView a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    private float d = -1.0f;
    private int e = -1;

    public hmv(RewindThumbnailScrollView rewindThumbnailScrollView, int i, int i2) {
        this.a = rewindThumbnailScrollView;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.d = motionEvent.getX();
                this.e = this.a.a();
                return true;
            case 1:
                this.d = -1.0f;
                this.e = -1;
                return true;
            case 2:
                if (this.d == -1.0f) {
                    this.d = motionEvent.getX() - jsa.b(5.0f);
                    this.e = this.a.a();
                }
                int iB = this.a.b();
                this.a.smoothScrollTo(Math.min(iB, Math.max(0, (int) (((this.e * iB) / this.b) + (((this.d - motionEvent.getX()) * iB) / this.c)))), 0);
                return true;
            default:
                return false;
        }
    }
}
