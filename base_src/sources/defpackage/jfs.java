package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jfs extends LinearLayout {
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/modeswitcher/ModeList");
    private static final jrv q = new jrv();
    public final olt b;
    public final HashMap c;
    public final EnumSet d;
    public final EnumMap e;
    public boolean f;
    public boolean g;
    public TextView h;
    public int i;
    public int j;
    public int k;
    public jrl l;
    public final Drawable m;
    public Animator n;
    public ojc o;
    public int p;
    private Animator r;
    private final int s;

    public jfs(Context context) {
        super(context);
        this.b = new omz(jrl.class);
        this.c = new HashMap();
        this.d = EnumSet.noneOf(jrl.class);
        this.e = new EnumMap(jrl.class);
        this.p = 1;
        this.o = oih.a;
        lar.a();
        Resources resources = context.getResources();
        setVisibility(4);
        setAlpha(0.0f);
        this.i = obr.e(this, R.attr.colorOnSecondary);
        this.j = obr.e(this, R.attr.colorOnSurface);
        this.k = obr.e(this, R.attr.colorSecondary);
        this.s = resources.getInteger(R.integer.move_accent_animation_duration);
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.mode_chip, null);
        this.m = drawable;
        drawable.setVisible(true, true);
        a().setColor(this.k);
    }

    private static Rect e(TextView textView) {
        return new Rect(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
    }

    private final void f(TextView textView) {
        TextView textView2 = this.h;
        if (textView2 != null) {
            textView2.setSelected(false);
            g(this.h, false);
        }
        this.h = textView;
        textView.setSelected(true);
        g(this.h, true);
    }

    private final void g(TextView textView, boolean z) {
        String strC;
        if (textView != null) {
            if (z) {
                strC = textView.getText().toString();
            } else {
                jrl jrlVar = (jrl) ((okm) this.b).b.get(textView);
                jrlVar.getClass();
                strC = jri.b(jrlVar).c(getContext().getResources());
            }
            textView.setContentDescription(strC);
        }
    }

    final jrp a() {
        return new jfq(this, 1);
    }

    public final void b(jrl jrlVar, boolean z) {
        lar.a();
        if (this.b.isEmpty()) {
            return;
        }
        TextView textView = (TextView) this.b.get(jrlVar);
        boolean z2 = textView != null;
        String strValueOf = String.valueOf(jrlVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 40);
        sb.append("attempted to activate non-existent mode ");
        sb.append(strValueOf);
        obr.aG(z2, sb.toString());
        if (textView.getWidth() == 0) {
            return;
        }
        if (this.h != textView) {
            if (z) {
                d(jrlVar);
            } else {
                Animator animator = this.n;
                if (animator != null) {
                    animator.end();
                }
                TextView textView2 = this.h;
                if (textView2 != null) {
                    textView2.setTextColor(this.j);
                }
                textView.setTextColor(this.i);
                this.m.setBounds(e(textView));
                f(textView);
                invalidate();
            }
        }
        textView.getText();
        textView.getLeft();
        textView.getRight();
        if (this.o.g()) {
            ((jft) this.o.c()).a.f((textView.getLeft() + textView.getRight()) / 2, z);
        }
    }

    public final void c(boolean z, boolean z2) {
        if (!z2) {
            setAlpha(true != z ? 0.0f : 1.0f);
            return;
        }
        Animator animator = this.r;
        if (animator != null) {
            animator.end();
        }
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f) : ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(120L);
        objectAnimatorOfFloat.setStartDelay(120L);
        objectAnimatorOfFloat.start();
        this.r = objectAnimatorOfFloat;
    }

    public final void d(jrl jrlVar) {
        Animator animator = this.n;
        if (animator != null) {
            animator.end();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.s);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.m, "bounds", q, this.m.getBounds(), e((TextView) this.b.get(jrlVar)));
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jfp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.invalidate();
            }
        });
        objectAnimatorOfObject.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(this.h, "textColor", this.i, this.j);
        objectAnimatorOfArgb.setInterpolator(new DecelerateInterpolator());
        f((TextView) this.b.get(jrlVar));
        ObjectAnimator objectAnimatorOfArgb2 = ObjectAnimator.ofArgb(this.h, "textColor", this.j, this.i);
        objectAnimatorOfArgb2.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(objectAnimatorOfObject).with(objectAnimatorOfArgb2).with(objectAnimatorOfArgb);
        invalidate();
        animatorSet.start();
        this.n = animatorSet;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.m.isVisible()) {
            this.m.draw(canvas);
        } else {
            ((oug) ((oug) a.c()).G((char) 3321)).o("highlight chip is not visible");
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EnumSet enumSetCopyOf;
        jhm jhmVar;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.p;
        if (i5 == 2 || i5 == 3) {
            lar.a();
            synchronized (this) {
                if (this.f) {
                    enumSetCopyOf = EnumSet.copyOf(this.d);
                    this.f = false;
                } else {
                    enumSetCopyOf = null;
                }
            }
            if (enumSetCopyOf != null) {
                for (jrl jrlVar : this.b.keySet()) {
                    boolean z2 = ((TextView) this.b.get(jrlVar)).getForeground() != null;
                    boolean zContains = enumSetCopyOf.contains(jrlVar);
                    if (z2 != zContains && (jhmVar = (jhm) this.e.get(jrlVar)) != null) {
                        if (zContains) {
                            jhmVar.b();
                        } else {
                            jhmVar.a(true);
                        }
                    }
                }
            }
        }
        if (this.p == 2) {
            obr.aQ(true);
            boolean z3 = gl.f(this) == 1;
            jrl jrlVar2 = this.l;
            jrlVar2.getClass();
            b(jrlVar2, z3);
            if (isEnabled()) {
                setVisibility(0);
                c(true, false);
            }
            this.p = 3;
        }
        TextView textView = this.h;
        if (textView != null) {
            this.m.setBounds(e(textView));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        super.onMeasure(i, i2);
        lar.a();
        Size size = new Size(i, i2);
        jfr jfrVar = (jfr) this.c.get(size);
        if (jfrVar == null) {
            jfrVar = new jfr();
            int measuredWidth2 = 0;
            int measuredWidth3 = 0;
            int iMax = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                measuredWidth3 += getChildAt(i3).getMeasuredWidth();
                iMax = Math.max(iMax, getChildAt(i3).getMeasuredHeight());
            }
            jfrVar.a = measuredWidth3;
            jfrVar.b = iMax;
            boolean z = measuredWidth3 > 0 && iMax > 0;
            int size2 = View.MeasureSpec.getSize(i);
            int iF = gl.f(this);
            if (getChildCount() > 0) {
                View childAt = iF == 1 ? getChildAt(getChildCount() - 1) : getChildAt(0);
                View childAt2 = iF == 1 ? getChildAt(0) : getChildAt(getChildCount() - 1);
                if (childAt != null && childAt2 != null && childAt.getMeasuredWidth() > 0 && childAt2.getMeasuredWidth() > 0) {
                    measuredWidth2 = (size2 - childAt.getMeasuredWidth()) / 2;
                    measuredWidth = (size2 - childAt2.getMeasuredWidth()) / 2;
                } else if (z && measuredWidth2 != 0) {
                    this.c.put(size, jfrVar);
                }
            } else {
                measuredWidth = 0;
            }
            jfrVar.c = measuredWidth2;
            jfrVar.d = measuredWidth;
            measuredWidth2 = 1;
            if (z) {
                this.c.put(size, jfrVar);
            }
        }
        setPadding(jfrVar.c, getPaddingTop(), jfrVar.d, getPaddingBottom());
        setMeasuredDimension(resolveSize(jfrVar.a + jfrVar.c + jfrVar.d, i), resolveSize(jfrVar.b, i2));
    }
}
