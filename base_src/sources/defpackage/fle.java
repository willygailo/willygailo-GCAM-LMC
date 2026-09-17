package defpackage;

import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.ui.widget.ReviewImageView;

/* JADX INFO: loaded from: classes.dex */
public final class fle {
    public final ReviewImageView a;
    public final ImageView b;
    public boolean c;
    public boolean d;
    public int e;
    private final gvb g;
    private final hrx h;
    private final FrameLayout i;
    public int f = 178;
    private final hsb j = new fld(this);

    public fle(btt bttVar, Resources resources, gvb gvbVar, hrx hrxVar) {
        this.g = gvbVar;
        this.h = hrxVar;
        MainActivityLayout mainActivityLayout = ((bvk) bttVar.g()).f;
        this.i = (FrameLayout) mainActivityLayout.findViewById(R.id.module_layout);
        this.a = new ReviewImageView(mainActivityLayout.getContext());
        ImageView imageView = new ImageView(mainActivityLayout.getContext());
        this.b = imageView;
        imageView.setImageDrawable(resources.getDrawable(R.drawable.review_image_overlay, null));
        imageView.setVisibility(8);
    }

    private final void h() {
        this.b.setVisibility(8);
    }

    public final void a() {
        this.a.a();
        h();
        this.i.removeAllViews();
        this.h.i(this.j);
    }

    public final void b() {
        this.i.addView(this.a, 0);
        this.i.addView(this.b, 1);
        this.h.a(this.j);
    }

    public final void c() {
        this.d = false;
        h();
        this.a.a();
        this.c = false;
    }

    public final void d() {
        this.d = true;
        this.e = this.g.f().e - this.g.c().e;
    }

    public final void e() {
        f(178);
    }

    public final void f(int i) {
        this.f = i;
        this.b.setVisibility(0);
        this.b.setImageAlpha(i);
    }
}
