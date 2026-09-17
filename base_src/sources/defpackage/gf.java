package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class gf {
    static void a(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public void b(Rect rect, View view, RecyclerView recyclerView) {
        ((qd) view.getLayoutParams()).a();
        rect.set(0, 0, 0, 0);
    }

    public void c(Canvas canvas, RecyclerView recyclerView) {
    }
}
