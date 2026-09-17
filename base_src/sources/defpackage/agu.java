package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class agu extends gf {
    public Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ agy d;

    public agu(agy agyVar) {
        this.d = agyVar;
    }

    private final boolean d(View view, RecyclerView recyclerView) {
        qs qsVarG = recyclerView.g(view);
        if (!(qsVarG instanceof ahm) || !((ahm) qsVarG).v) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        qs qsVarG2 = recyclerView.g(recyclerView.getChildAt(iIndexOfChild + 1));
        return (qsVarG2 instanceof ahm) && ((ahm) qsVarG2).u;
    }

    @Override // defpackage.gf
    public final void b(Rect rect, View view, RecyclerView recyclerView) {
        if (d(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.gf
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (d(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
