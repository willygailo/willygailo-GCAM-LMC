package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.StrictMode;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fkp implements fli {
    public final lar a;
    private final Context b;
    private final ius c;
    private final ojc d;
    private final float e;
    private final lda f;
    private final ddf g;

    public fkp(Context context, lar larVar, ius iusVar, ojc ojcVar, ddf ddfVar, lda ldaVar) {
        this.b = context;
        this.a = larVar;
        this.c = iusVar;
        this.d = ojcVar;
        this.f = ldaVar;
        this.g = ddfVar;
        this.e = TimeUnit.MILLISECONDS.toSeconds(((Integer) ddfVar.a(ddm.u).c()).intValue()) / 60.0f;
    }

    @Override // defpackage.fli
    public final void a() {
        FrameLayout frameLayout = new FrameLayout(this.b);
        View.inflate(this.b, true != this.g.k(ddl.ay) ? R.layout.bottom_sheet_legacy : R.layout.bottom_sheet, frameLayout);
        EduImageView eduImageView = (EduImageView) frameLayout.findViewById(R.id.bottom_sheet_image);
        eduImageView.b(this.b.getString(R.string.astro_photo_url), this.b.getString(R.string.astro_edu_image_content_description));
        eduImageView.a();
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) ((ImageView) frameLayout.findViewById(R.id.bottom_sheet_animation)).getDrawable();
        if (this.d.g() && ((Boolean) this.f.fA()).booleanValue()) {
            Context context = this.b;
            Object[] objArr = {"count", Float.valueOf(this.e)};
            Locale locale = Locale.getDefault();
            String string = context.getResources().getString(R.string.kepler_edu_text);
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                String strA = l.a(locale, string, objArr);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                ((TextView) frameLayout.findViewById(R.id.kepler_edu_textview)).setText(strA);
                ((LinearLayout) frameLayout.findViewById(R.id.kepler_edu)).setVisibility(0);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        frameLayout.addOnAttachStateChangeListener(new fko(this, animatedVectorDrawable, frameLayout));
        this.c.f(6, R.string.astrophotography_edu_title, frameLayout);
    }
}
