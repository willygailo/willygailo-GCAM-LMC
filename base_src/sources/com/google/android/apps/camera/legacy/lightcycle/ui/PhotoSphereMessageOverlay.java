package com.google.android.apps.camera.legacy.lightcycle.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.feo;
import defpackage.fer;
import defpackage.fes;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class PhotoSphereMessageOverlay extends FrameLayout {
    public final Handler a;
    public boolean b;
    public boolean c;
    private final int[] d;

    public PhotoSphereMessageOverlay(Context context) {
        super(context.getApplicationContext());
        this.a = mip.bU();
        this.b = false;
        this.c = true;
        this.d = new int[]{R.id.short_info_message, R.id.long_message_overlay, R.id.rotate_device_icon};
    }

    public PhotoSphereMessageOverlay(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        this.a = mip.bU();
        this.b = false;
        this.c = true;
        this.d = new int[]{R.id.short_info_message, R.id.long_message_overlay, R.id.rotate_device_icon};
    }

    public final void a() {
        this.a.post(new fer(this, 1));
    }

    public final void b(int i) {
        int[] iArr = this.d;
        int length = iArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            ((FrameLayout.LayoutParams) findViewById(iArr[i2]).getLayoutParams()).gravity = (i == 180 ? 80 : 48) | 1;
        }
    }

    public final void c(int i) {
        this.a.post(new feo(this, i));
    }

    public final void d(boolean z, int i) {
        this.a.post(new fes(this, z, i));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View viewFindViewById = findViewById(R.id.short_info_message);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        float dimension = getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_width);
        float dimension2 = getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_height);
        float dimension3 = getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_marginTop);
        layoutParams.width = (int) dimension;
        layoutParams.height = (int) dimension2;
        layoutParams.setMargins(0, (int) dimension3, 0, 0);
        viewFindViewById.requestLayout();
    }
}
