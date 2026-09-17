package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.support.constraint.ConstraintLayout;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jir implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener, jil {
    private final ConstraintLayout a;
    private final TextureView b;
    private final WindowManager c;
    private final TextureView.SurfaceTextureListener d;
    private final ArrayList e;
    private final jcf f;
    private int g;
    private int h;
    private boolean i;
    private final RectF j;
    private int k;
    private Surface l;
    private SurfaceTexture m;

    public jir(ConstraintLayout constraintLayout, jcf jcfVar, WindowManager windowManager, TextureView.SurfaceTextureListener surfaceTextureListener) {
        new ArrayList();
        this.e = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.j = new RectF();
        this.k = -1;
        this.l = null;
        this.m = null;
        this.a = constraintLayout;
        constraintLayout.addOnLayoutChangeListener(this);
        TextureView textureView = new TextureView(constraintLayout.getContext());
        mip.ep(textureView);
        this.b = textureView;
        textureView.setSurfaceTextureListener(this);
        this.c = windowManager;
        this.f = jcfVar;
        this.d = surfaceTextureListener;
    }

    @Override // defpackage.jil
    public final int a() {
        return this.b.getHeight();
    }

    @Override // defpackage.jil
    public final int b() {
        return this.b.getWidth();
    }

    @Override // defpackage.jil
    public final ojc c() {
        RectF rectF;
        TextureView textureView = this.b;
        if (textureView == null) {
            rectF = new RectF();
        } else {
            Matrix matrix = new Matrix();
            RectF rectF2 = new RectF(0.0f, 0.0f, this.g, this.h);
            this.b.getTransform(matrix).mapRect(rectF2);
            rectF = rectF2;
        }
        int iMin = ((int) Math.min(rectF.width(), rectF.height())) / 2;
        int iMax = ((int) Math.max(rectF.height(), rectF.width())) / 2;
        if (iMin <= 0 || iMax <= 0) {
            return oih.a;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMax, Bitmap.Config.ARGB_8888);
        PixelCopy.request(new Surface(textureView.getSurfaceTexture()), bitmapCreateBitmap, jnd.e, mip.bV(Looper.getMainLooper()));
        return ojc.i(jnm.b(bitmapCreateBitmap, 2));
    }

    @Override // defpackage.jil
    public final pht d() {
        this.a.addView(this.b, 0);
        return plk.V(null);
    }

    @Override // defpackage.jil
    public final pht e() {
        obr.aR(true, "Last Create Synchronization has not finished yet.");
        this.a.removeView(this.b);
        return plk.V(null);
    }

    @Override // defpackage.jil
    public final void f() {
        this.b.setTransform(new Matrix());
        this.j.set(0.0f, 0.0f, this.g, this.h);
        this.b.post(new jiq(new ArrayList(this.e)));
        if (this.g <= 0 || this.h <= 0) {
            return;
        }
        this.f.b().i();
    }

    @Override // defpackage.jil
    public final void g() {
        this.b.requestLayout();
    }

    @Override // defpackage.jil
    public final void h(View.OnLayoutChangeListener onLayoutChangeListener) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b.getParent() == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        boolean zC = this.f.c();
        int iD = fcy.d(this.c);
        if (this.g == i9 && this.h == i10 && this.k == iD && this.i == zC) {
            return;
        }
        this.g = i9;
        this.h = i10;
        this.k = iD;
        this.i = zC;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.l = new Surface(surfaceTexture);
        this.m = surfaceTexture;
        this.d.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.d.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.d.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((bvk) this.d).s = surfaceTexture;
    }
}
