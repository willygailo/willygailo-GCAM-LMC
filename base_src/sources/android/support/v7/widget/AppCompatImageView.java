package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.mp;
import defpackage.mx;
import defpackage.ri;
import defpackage.rk;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final mp a;
    private final mx b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rk.a(context);
        ri.d(this, getContext());
        mp mpVar = new mp(this);
        this.a = mpVar;
        mpVar.d(attributeSet, i);
        mx mxVar = new mx(this);
        this.b = mxVar;
        mxVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.c();
        }
        mx mxVar = this.b;
        if (mxVar != null) {
            mxVar.a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.b.d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.e(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        mx mxVar = this.b;
        if (mxVar != null) {
            mxVar.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        mx mxVar = this.b;
        if (mxVar != null) {
            mxVar.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        mx mxVar = this.b;
        if (mxVar != null) {
            mxVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        mx mxVar = this.b;
        if (mxVar != null) {
            mxVar.a();
        }
    }
}
