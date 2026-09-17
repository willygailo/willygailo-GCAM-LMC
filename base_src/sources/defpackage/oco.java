package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class oco extends obr {
    private static float bd(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    private static float be(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.obr
    public final void j(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fBe;
        float fBd;
        RectF rectFI = i(tabLayout, view);
        RectF rectFI2 = i(tabLayout, view2);
        if (rectFI.left < rectFI2.left) {
            fBe = bd(f);
            fBd = be(f);
        } else {
            fBe = be(f);
            fBd = bd(f);
        }
        drawable.setBounds(nwj.c((int) rectFI.left, (int) rectFI2.left, fBe), drawable.getBounds().top, nwj.c((int) rectFI.right, (int) rectFI2.right, fBd), drawable.getBounds().bottom);
    }
}
