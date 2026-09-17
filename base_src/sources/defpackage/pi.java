package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
final class pi implements View.OnTouchListener {
    final /* synthetic */ pk a;

    public pi(pk pkVar) {
        this.a = pkVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            pk pkVar = this.a;
            pkVar.o.removeCallbacks(pkVar.n);
            return false;
        }
        PopupWindow popupWindow = this.a.q;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.a.q.getWidth() || y < 0 || y >= this.a.q.getHeight()) {
            return false;
        }
        pk pkVar2 = this.a;
        pkVar2.o.postDelayed(pkVar2.n, 250L);
        return false;
    }
}
