package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public class mw extends ImageButton {
    private final mp mBackgroundTintHelper;
    private final mx mImageHelper;

    public mw(Context context) {
        this(context, null);
    }

    public mw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rk.a(context);
        ri.d(this, getContext());
        mp mpVar = new mp(this);
        this.mBackgroundTintHelper = mpVar;
        mpVar.d(attributeSet, i);
        mx mxVar = new mx(this);
        this.mImageHelper = mxVar;
        mxVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        mp mpVar = this.mBackgroundTintHelper;
        if (mpVar != null) {
            mpVar.c();
        }
        mx mxVar = this.mImageHelper;
        if (mxVar != null) {
            mxVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        mp mpVar = this.mBackgroundTintHelper;
        if (mpVar != null) {
            return mpVar.a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        mp mpVar = this.mBackgroundTintHelper;
        if (mpVar != null) {
            return mpVar.b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        rl rlVar;
        mx mxVar = this.mImageHelper;
        if (mxVar == null || (rlVar = mxVar.a) == null) {
            return null;
        }
        return rlVar.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        rl rlVar;
        mx mxVar = this.mImageHelper;
        if (mxVar == null || (rlVar = mxVar.a) == null) {
            return null;
        }
        return rlVar.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        mp mpVar = this.mBackgroundTintHelper;
        if (mpVar != null) {
            mpVar.i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        mp mpVar = this.mBackgroundTintHelper;
        if (mpVar != null) {
            mpVar.e(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        mx mxVar = this.mImageHelper;
        if (mxVar != null) {
            mxVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        mx mxVar = this.mImageHelper;
        if (mxVar != null) {
            mxVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.mImageHelper.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        mx mxVar = this.mImageHelper;
        if (mxVar != null) {
            mxVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        mp mpVar = this.mBackgroundTintHelper;
        if (mpVar != null) {
            mpVar.g(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        mp mpVar = this.mBackgroundTintHelper;
        if (mpVar != null) {
            mpVar.h(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        mx mxVar = this.mImageHelper;
        if (mxVar != null) {
            if (mxVar.a == null) {
                mxVar.a = new rl();
            }
            rl rlVar = mxVar.a;
            rlVar.a = colorStateList;
            rlVar.d = true;
            mxVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        mx mxVar = this.mImageHelper;
        if (mxVar != null) {
            if (mxVar.a == null) {
                mxVar.a = new rl();
            }
            rl rlVar = mxVar.a;
            rlVar.b = mode;
            rlVar.c = true;
            mxVar.a();
        }
    }
}
