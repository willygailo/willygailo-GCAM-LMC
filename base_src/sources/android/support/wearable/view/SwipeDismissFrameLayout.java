package android.support.wearable.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import defpackage.tc;
import defpackage.to;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SwipeDismissFrameLayout extends tc {
    public final ArrayList d;
    public final int e;
    public final DecelerateInterpolator f;
    public final AccelerateInterpolator g;
    public final DecelerateInterpolator h;
    public boolean i;
    private final to j;
    private final to k;
    private final to l;

    public SwipeDismissFrameLayout(Context context) {
        this(context, null, 0);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        to toVar = new to(this);
        this.k = toVar;
        to toVar2 = new to(this);
        this.l = toVar2;
        to toVar3 = new to(this);
        this.j = toVar3;
        this.d = new ArrayList();
        this.b = toVar;
        this.c = toVar2;
        this.a = toVar3;
        this.e = getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f = new DecelerateInterpolator(1.5f);
        this.g = new AccelerateInterpolator(1.5f);
        this.h = new DecelerateInterpolator(1.5f);
    }
}
