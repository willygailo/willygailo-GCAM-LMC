package android.support.wearable.watchface.decompositionface;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import defpackage.ts;
import defpackage.tt;

/* JADX INFO: loaded from: classes.dex */
public class DecompositionConfigView extends ImageView {
    private final GestureDetector.SimpleOnGestureListener a;
    private final GestureDetector b;

    public DecompositionConfigView(Context context) {
        super(context);
        getContext();
        new tt();
        new Rect();
        ts tsVar = new ts();
        this.a = tsVar;
        this.b = new GestureDetector(getContext(), tsVar);
        new Rect();
    }

    public DecompositionConfigView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        new tt();
        new Rect();
        ts tsVar = new ts();
        this.a = tsVar;
        this.b = new GestureDetector(getContext(), tsVar);
        new Rect();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.b.onTouchEvent(motionEvent);
    }
}
