package com.google.android.apps.camera.ui.gridlines;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.jbj;
import defpackage.jbl;
import defpackage.jbm;
import defpackage.jbn;
import defpackage.jbp;
import defpackage.oor;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GridLinesUi extends View {
    private static final jbm c = new jbj();
    private static final jbm d = new jbn(new float[]{0.0f, 1.0f}, false, true);
    private static final jbm e = new jbn(new float[]{0.33333334f, 0.6666666f}, false, false);
    private static final jbm f = new jbn(new float[]{0.25f, 0.5f, 0.75f}, true, false);
    private static final jbm g = new jbn(new float[]{0.38196602f, 0.618034f}, false, false);
    public final Map a;
    public final jbl b;

    public GridLinesUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = oor.s(jbp.OFF, d, jbp.THREE_BY_THREE, e, jbp.FOUR_BY_FOUR, f, jbp.GOLDEN_RATIO, g);
        Paint paint = new Paint();
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.grid_line_width));
        paint.setColor(a(context.getResources()));
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.grid_line_width));
        paint2.setColor(a(context.getResources()));
        jbl jblVar = new jbl(this, paint, paint2);
        this.b = jblVar;
        jblVar.a(c);
    }

    private static int a(Resources resources) {
        return resources.getColor(R.color.grid_line, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        jbl jblVar = this.b;
        if (jblVar.b.g) {
            return;
        }
        jblVar.d.b(canvas, jblVar.a);
        jblVar.e.b(canvas, jblVar.a);
        jblVar.g.b(canvas, jblVar.a);
        jblVar.h.b(canvas, jblVar.a);
        jblVar.f.b(canvas, jblVar.a);
        jblVar.i.b(canvas, jblVar.a);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jbl jblVar = this.b;
        jblVar.a.set(i, i2, i3, i4);
        jblVar.b();
        jblVar.c.invalidate();
    }
}
