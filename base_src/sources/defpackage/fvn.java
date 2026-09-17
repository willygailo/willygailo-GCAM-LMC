package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;

/* JADX INFO: loaded from: classes.dex */
public final class fvn {
    public final ius a;
    public final Context b;
    public final ddf c;
    private final huj e;
    private final DisplayMetrics f;
    private View g = null;
    public View d = null;

    public fvn(ius iusVar, huj hujVar, DisplayMetrics displayMetrics, Context context, ddf ddfVar) {
        this.a = iusVar;
        this.e = hujVar;
        this.b = context;
        this.f = displayMetrics;
        this.c = ddfVar;
    }

    public final void a() {
        lar.a();
        if (this.g == null) {
            FrameLayout frameLayout = new FrameLayout(this.b);
            View.inflate(this.b, true != this.c.k(ddl.ay) ? R.layout.motionphoto_bottom_sheet_legacy : R.layout.motionphoto_bottom_sheet, frameLayout);
            ((Button) frameLayout.findViewById(R.id.learn_more_button)).setOnClickListener(new fvm(this, 0));
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.bottom_sheet_video_container);
            EduImageView eduImageView = (EduImageView) frameLayout.findViewById(R.id.bottom_sheet_video);
            ViewGroup.LayoutParams layoutParams = eduImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
            float f = (this.f.widthPixels - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
            float f2 = (this.f.heightPixels - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
            if (layoutParams.width > f) {
                int i = layoutParams.height;
                int i2 = layoutParams.width;
                layoutParams.width = (int) f;
                layoutParams.height = (int) (f * (i / i2));
                eduImageView.setLayoutParams(layoutParams);
            } else if (layoutParams.height > f2) {
                marginLayoutParams.width = (int) ((layoutParams.width / layoutParams.height) * f2);
                marginLayoutParams.height = (int) f2;
                eduImageView.setLayoutParams(layoutParams);
            }
            eduImageView.b(this.b.getString(R.string.motion_photos_video_url), this.b.getString(R.string.motion_photos_video_content_description));
            this.g = frameLayout;
        }
        this.a.f(7, R.string.motion_photos_bottomsheet_title, this.g);
        this.e.b("micro_tutorial_dismiss");
    }
}
