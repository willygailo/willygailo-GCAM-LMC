package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.widget.ReviewImageView;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ezn {
    public static final ouj a = ouj.h("com/google/android/apps/camera/legacy/app/module/pckimageintent/ImageIntentModuleUI");
    public final btv b;
    public final jac c;
    public final Executor d;
    public final ReviewImageView e;
    public final ProgressOverlay f;
    public boolean g = false;

    public ezn(btv btvVar, View view, Executor executor, jac jacVar) {
        this.b = btvVar;
        this.c = jacVar;
        this.d = executor;
        ((ViewStub) view.findViewById(R.id.camera_intent_layout_stub)).inflate();
        this.e = (ReviewImageView) view.findViewById(R.id.intent_review_imageview);
        this.f = (ProgressOverlay) view.findViewById(R.id.intent_progress_bar);
        ((ViewfinderCover) view.findViewById(R.id.viewfinder_cover)).g = false;
    }

    public final void a(boolean z) {
        lar.a();
        this.b.k(z);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f A[Catch: all -> 0x0045, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000a, B:11:0x000f, B:13:0x002b, B:12:0x001d), top: B:19:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x001d A[Catch: all -> 0x0045, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000a, B:11:0x000f, B:13:0x002b, B:12:0x001d), top: B:19:0x0003 }] */
    public final synchronized void b(Bitmap bitmap, boolean z) {
        if (!z) {
            lar.a();
            if (z) {
                this.f.setVisibility(0);
                this.f.a.start();
            } else {
                this.f.a.stop();
                this.f.setVisibility(8);
            }
            this.g = true;
            this.e.b(bitmap);
            ReviewImageView reviewImageView = this.e;
            reviewImageView.announceForAccessibility(reviewImageView.getContext().getString(R.string.photo_accessibility_peek));
            return;
        }
        if (this.g) {
            return;
        }
        lar.a();
        if (z) {
            this.f.setVisibility(0);
            this.f.a.start();
        } else {
            this.f.a.stop();
            this.f.setVisibility(8);
        }
        this.g = true;
        this.e.b(bitmap);
        ReviewImageView reviewImageView2 = this.e;
        reviewImageView2.announceForAccessibility(reviewImageView2.getContext().getString(R.string.photo_accessibility_peek));
        return;
        throw th;
    }

    public final boolean c() {
        return this.c.e();
    }
}
