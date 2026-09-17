package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public class ief extends ImageButton implements ieg {
    public TransitionDrawable a;
    public View.OnClickListener b;
    public View.OnClickListener c;
    public iby d;
    private int e;
    private final View.AccessibilityDelegate f;

    public ief(Context context) {
        super(context);
        this.f = new iee(this);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.social_share_main_item_height);
    }

    public final Drawable a(int i) {
        Drawable drawable = getContext().getDrawable(i);
        drawable.getClass();
        return drawable;
    }

    @Override // defpackage.ieg
    public final void b() {
        this.e = getContext().getResources().getDimensionPixelSize(R.dimen.social_share_outcrop_main_item_height);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.social_share_outcrop_main_item_bottom_margin));
        setLayoutParams(layoutParams);
        setAccessibilityDelegate(this.f);
    }

    @Override // defpackage.ieg
    public final void c() {
        this.e = getContext().getResources().getDimensionPixelSize(R.dimen.social_share_main_item_height);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setAccessibilityDelegate(null);
    }

    @Override // defpackage.ieg
    public final void d() {
        this.e = getContext().getResources().getDimensionPixelSize(R.dimen.social_share_outcrop_main_item_height);
        setAccessibilityDelegate(this.f);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.e);
    }
}
