package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nwm {
    private final xf a = new xf();
    private final xf b = new xf();

    public static nwm a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        nwm nwmVarC = null;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                nwmVarC = c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            } else if (animatorLoadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(animatorLoadAnimator);
                nwmVarC = c(arrayList);
            }
        } catch (Exception e) {
            String strValueOf = String.valueOf(Integer.toHexString(resourceId));
            Log.w("MotionSpec", strValueOf.length() != 0 ? "Can't load animation resource ID #0x".concat(strValueOf) : new String("Can't load animation resource ID #0x"), e);
        }
        return nwmVarC;
    }

    private static nwm c(List list) {
        nwm nwmVar = new nwm();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                String strValueOf = String.valueOf(animator);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            nwmVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = nwj.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = nwj.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = nwj.d;
            }
            nwn nwnVar = new nwn(startDelay, duration, interpolator);
            nwnVar.a = objectAnimator.getRepeatCount();
            nwnVar.b = objectAnimator.getRepeatMode();
            nwmVar.a.put(propertyName, nwnVar);
        }
        return nwmVar;
    }

    public final nwn b(String str) {
        if (this.a.get(str) != null) {
            return (nwn) this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nwm) {
            return this.a.equals(((nwm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
