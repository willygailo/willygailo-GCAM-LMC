package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iew implements View.OnTouchListener {
    public final /* synthetic */ ife a;
    private final /* synthetic */ int b;

    public /* synthetic */ iew(ife ifeVar, int i) {
        this.b = i;
        this.a = ifeVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.a.f.onTouchEvent(motionEvent);
    }
}
