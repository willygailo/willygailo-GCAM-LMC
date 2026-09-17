package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class guf implements View.OnTouchListener {
    private final /* synthetic */ int e;
    public static final /* synthetic */ guf d = new guf(3);
    public static final /* synthetic */ guf c = new guf(2);
    public static final /* synthetic */ guf b = new guf(1);
    public static final /* synthetic */ guf a = new guf(0);

    public /* synthetic */ guf(int i) {
        this.e = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.e) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    view.animate().scaleX(1.1f).scaleY(1.1f);
                } else if (motionEvent.getAction() == 1) {
                    view.animate().scaleX(1.0f).scaleY(1.0f);
                }
                return false;
            case 1:
                return view.getVisibility() == 0;
            case 2:
                int i = iva.z;
                return true;
            case 3:
                return false;
            default:
                return true;
        }
    }
}
