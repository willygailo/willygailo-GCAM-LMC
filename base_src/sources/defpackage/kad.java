package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.widget.TextView;
import com.Fix.Pref;
import com.Helper;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.zoomui.ZoomUi;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class kad {
    public final lco a;
    public final lda b;
    public final lda c;
    public final ValueAnimator d;
    public final AtomicReference e;
    public boolean f;
    public ldz g;
    private final cwj h;
    private final lzi i;
    private final lda j;
    private final ddf k;
    private final ValueAnimator.AnimatorUpdateListener l;
    private final Map m;
    private final Map n;
    private final Map o;
    private final Map p;
    private final Map q;
    private final Map r;
    private final Map s;
    private final Map t;
    private final Map u;
    private final Map v;
    private final Map w;
    private final Map x;
    private final Map y;
    private final Map z;

    public kad(lco lcoVar, lda ldaVar, lda ldaVar2, lda ldaVar3, cwj cwjVar, lzi lziVar, ddf ddfVar) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: kac
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.b.fB(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
            }
        };
        this.l = animatorUpdateListener;
        this.e = new AtomicReference(kag.MAIN_ONLY);
        this.f = false;
        this.g = ldz.FPS_AUTO;
        kae kaeVar = kae.ULTRAWIDE;
        Float fValueOf = Float.valueOf(1.0f);
        kae kaeVar2 = kae.WIDE;
        Float fValueOf2 = Float.valueOf(1.0f);
        kae kaeVar3 = kae.TELE;
        Float fValueOf3 = Float.valueOf(Helper.getizoomv(Helper.getizoom()));
        this.m = oor.r(kaeVar, fValueOf, kaeVar2, fValueOf2, kaeVar3, fValueOf3);
        kae kaeVar4 = kae.ULTRAWIDE;
        Float fValueOf4 = Float.valueOf(0.670443f);
        this.n = oor.s(kaeVar4, fValueOf4, kae.WIDE, fValueOf2, kae.TELE, fValueOf3, kae.ULTRATELE, Float.valueOf(4.3f));
        this.o = oor.q(kae.WIDE, fValueOf2, kae.TELE, fValueOf3);
        kae kaeVar5 = kae.WIDE;
        Float fValueOf5 = Float.valueOf(Pref.MenuValue("pref_pzoom_key") == 0 ? 1.5f : 1.0f);
        this.p = oor.q(kaeVar5, fValueOf5, kae.TELE, Float.valueOf(3.0f));
        this.q = oor.q(kae.WIDE, fValueOf3, kae.TELE, Float.valueOf(2.6f));
        this.r = oor.q(kae.WIDE, fValueOf2, kae.TELE, fValueOf3);
        this.s = oor.q(kae.WIDE, fValueOf2, kae.TELE, fValueOf3);
        this.t = oor.q(kae.WIDE, fValueOf3, kae.TELE, Float.valueOf(5.0f));
        this.u = oor.q(kae.WIDE, fValueOf, kae.TELE, Float.valueOf(1.23f));
        this.v = oor.q(kae.WIDE, fValueOf4, kae.TELE, Float.valueOf(1.34f));
        kae kaeVar6 = kae.WIDE;
        kae kaeVar7 = kae.TELE;
        Float fValueOf6 = Float.valueOf(1.4f);
        this.w = oor.q(kaeVar6, fValueOf2, kaeVar7, fValueOf6);
        this.x = oor.q(kae.WIDE, fValueOf2, kae.TELE, Float.valueOf(1.2f));
        this.y = oor.q(kae.WIDE, fValueOf2, kae.TELE, fValueOf5);
        this.z = oor.q(kae.WIDE, fValueOf2, kae.TELE, fValueOf6);
        this.a = lcoVar;
        this.b = ldaVar;
        this.h = cwjVar;
        this.i = lziVar;
        this.c = ldaVar2;
        this.j = ldaVar3;
        this.k = ddfVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.d = valueAnimator;
        valueAnimator.addUpdateListener(animatorUpdateListener);
        valueAnimator.setDuration(0L);
        valueAnimator.setInterpolator(new adt());
    }

    private final Float n(kae kaeVar, jrl jrlVar) {
        Map map;
        if (this.h.d().equals(lwd.FRONT)) {
            if (this.i.d()) {
                return Float.valueOf(this.y.containsKey(kaeVar) ? ((Float) this.y.get(kaeVar)).floatValue() : 0.0f);
            }
            if (this.i.k) {
                return Float.valueOf(this.z.containsKey(kaeVar) ? ((Float) this.z.get(kaeVar)).floatValue() : 0.0f);
            }
            jrl jrlVar2 = jrl.UNINITIALIZED;
            kag kagVar = kag.OFF;
            kae kaeVar2 = kae.ULTRAWIDE;
            switch (jrlVar.ordinal()) {
                case 6:
                    return Float.valueOf(this.x.containsKey(kaeVar) ? ((Float) this.x.get(kaeVar)).floatValue() : 0.0f);
                default:
                    return Float.valueOf(this.w.containsKey(kaeVar) ? ((Float) this.w.get(kaeVar)).floatValue() : 0.0f);
            }
        }
        if (this.k.k(ddl.T)) {
            map = this.i.k ? this.n : this.m;
        } else {
            map = this.o;
        }
        jrl jrlVar3 = jrl.UNINITIALIZED;
        kag kagVar2 = kag.OFF;
        kae kaeVar3 = kae.ULTRAWIDE;
        switch (jrlVar.ordinal()) {
            case 2:
            case 13:
                if (((kag) this.e.get()).equals(kag.OFF)) {
                    return Float.valueOf(this.t.containsKey(kaeVar) ? ((Float) this.t.get(kaeVar)).floatValue() : 0.0f);
                }
                if (((kag) this.e.get()).equals(kag.ALL)) {
                    lzi lziVar = this.i;
                    if (lziVar.k || lziVar.j) {
                        return Float.valueOf(this.v.containsKey(kaeVar) ? ((Float) this.v.get(kaeVar)).floatValue() : 0.0f);
                    }
                    return Float.valueOf(this.u.containsKey(kaeVar) ? ((Float) this.u.get(kaeVar)).floatValue() : 0.0f);
                }
                if (this.f && o()) {
                    return Float.valueOf(this.s.containsKey(kaeVar) ? ((Float) this.s.get(kaeVar)).floatValue() : 0.0f);
                }
                if (this.f || !this.i.k) {
                    return Float.valueOf(map.containsKey(kaeVar) ? ((Float) map.get(kaeVar)).floatValue() : 0.0f);
                }
                return Float.valueOf(this.n.containsKey(kaeVar) ? ((Float) this.n.get(kaeVar)).floatValue() : 0.0f);
            case 5:
                return Float.valueOf(this.r.containsKey(kaeVar) ? ((Float) this.r.get(kaeVar)).floatValue() : 0.0f);
            case 6:
                if (this.i.f()) {
                    return Float.valueOf(this.q.containsKey(kaeVar) ? ((Float) this.q.get(kaeVar)).floatValue() : 0.0f);
                }
                return Float.valueOf(this.p.containsKey(kaeVar) ? ((Float) this.p.get(kaeVar)).floatValue() : 0.0f);
            case 12:
                if (((Float) ((lce) this.c).d).floatValue() >= 1.0f) {
                    return Float.valueOf(this.o.containsKey(kaeVar) ? ((Float) this.o.get(kaeVar)).floatValue() : 0.0f);
                }
                return Float.valueOf(map.containsKey(kaeVar) ? ((Float) map.get(kaeVar)).floatValue() : 0.0f);
            default:
                return Float.valueOf(map.containsKey(kaeVar) ? ((Float) map.get(kaeVar)).floatValue() : 0.0f);
        }
    }

    private final boolean o() {
        return this.g.k == 60;
    }

    public final float a(int i) {
        float fFloatValue = 1.0f;
        if (i >= 4) {
            return 1.0f;
        }
        if (((orw) f((jrl) this.a.fA())).c == 3) {
            if (((Float) ((lce) this.c).d).floatValue() >= 1.0f) {
                i++;
            }
            fFloatValue = (n(kae.values()[i], (jrl) this.a.fA()).floatValue() <= ((Float) ((lce) this.j).d).floatValue() ? n(kae.values()[i], (jrl) this.a.fA()) : (Float) ((lce) this.j).d).floatValue();
        } else if (((orw) f((jrl) this.a.fA())).c == 4) {
            fFloatValue = (n(kae.values()[i], (jrl) this.a.fA()).floatValue() <= ((Float) ((lce) this.j).d).floatValue() ? n(kae.values()[i], (jrl) this.a.fA()) : (Float) ((lce) this.j).d).floatValue();
        } else if (i < 2) {
            int i2 = i + 1;
            fFloatValue = (n(kae.values()[i2], (jrl) this.a.fA()).floatValue() <= ((Float) ((lce) this.j).d).floatValue() ? n(kae.values()[i2], (jrl) this.a.fA()) : (Float) ((lce) this.j).d).floatValue();
        }
        return Math.max(((Float) ((lce) this.c).d).floatValue(), fFloatValue);
    }

    public final float b() {
        if (this.i.k) {
            return 4.0f;
        }
        return ((Float) ((lce) this.j).d).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023 A[PHI: r4
      0x0023: PHI (r4v1 float) = (r4v0 float), (r4v0 float), (r4v5 float) binds: [B:3:0x0012, B:9:0x0029, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final float c(float f, float f2) {
        jrl jrlVar = jrl.UNINITIALIZED;
        kag kagVar = kag.OFF;
        kae kaeVar = kae.ULTRAWIDE;
        switch ((kag) this.e.get()) {
            case MAIN_ONLY:
                if (f2 >= 1.0f) {
                    f /= f2;
                }
                break;
            case FRONT_PORTRAIT:
                f2 = n(kae.TELE, jrl.PORTRAIT).floatValue();
                f /= f2;
                break;
            case ALL:
                f /= f2;
                break;
        }
        double dRound = Math.round(f * 10.0f);
        Double.isNaN(dRound);
        return (float) (dRound / 10.0d);
    }

    public final kae d(float f) {
        Map mapF = f((jrl) this.a.fA());
        float fC = c(f, ((Float) ((lce) this.c).d).floatValue());
        for (Map.Entry entry : ((oor) mapF).entrySet()) {
            jrl jrlVar = jrl.UNINITIALIZED;
            kag kagVar = kag.OFF;
            kae kaeVar = kae.ULTRAWIDE;
            switch ((kae) entry.getKey()) {
                case ULTRAWIDE:
                    if (m(kae.WIDE, fC)) {
                        return kae.ULTRAWIDE;
                    }
                    break;
                    break;
                case WIDE:
                    if (j(kae.WIDE, fC) && m(kae.TELE, fC)) {
                        return kae.WIDE;
                    }
                    break;
                case TELE:
                    if (j(kae.TELE, fC) && l(f)) {
                        return kae.TELE;
                    }
                    break;
                case ULTRATELE:
                    if (j(kae.ULTRATELE, fC) || k(fC)) {
                        return kae.ULTRATELE;
                    }
                    break;
            }
        }
        return kae.WIDE;
    }

    public final String e(boolean z, float f, boolean z2) {
        String strValueOf = String.format("%.01f", Float.valueOf(c(f, ((Float) ((lce) this.c).d).floatValue())));
        String str = true != z2 ? "" : "×";
        float fC = c(f, ((Float) ((lce) this.c).d).floatValue());
        if (fC < 1.0f) {
            char[] cArr = new char[strValueOf.length() - 1];
            strValueOf.getChars(1, strValueOf.length(), cArr, 0);
            strValueOf = String.copyValueOf(cArr);
        } else if (k(fC)) {
            strValueOf = String.valueOf(Math.round(fC));
        } else {
            double d = fC;
            double dFloor = Math.floor(d);
            Double.isNaN(d);
            if ((d - dFloor) * 10.0d < 1.0d) {
                strValueOf = String.valueOf(Math.round(Math.floor(d)));
            }
        }
        if (z) {
            String strValueOf2 = String.valueOf(strValueOf);
            return strValueOf2.length() != 0 ? str.concat(strValueOf2) : new String(str);
        }
        String strValueOf3 = String.valueOf(strValueOf);
        return str.length() != 0 ? strValueOf3.concat(str) : new String(strValueOf3);
    }

    public final Map f(jrl jrlVar) {
        Map map;
        if (this.h.d().equals(lwd.FRONT)) {
            if (this.i.d()) {
                return this.y;
            }
            if (this.i.k) {
                return this.z;
            }
            jrl jrlVar2 = jrl.UNINITIALIZED;
            kag kagVar = kag.OFF;
            kae kaeVar = kae.ULTRAWIDE;
            switch (jrlVar.ordinal()) {
                case 6:
                    return this.x;
                default:
                    return this.w;
            }
        }
        if (this.k.k(ddl.T)) {
            map = this.i.k ? this.n : this.m;
        } else {
            map = this.o;
        }
        jrl jrlVar3 = jrl.UNINITIALIZED;
        kag kagVar2 = kag.OFF;
        kae kaeVar2 = kae.ULTRAWIDE;
        switch (jrlVar.ordinal()) {
            case 2:
            case 13:
                if (((kag) this.e.get()).equals(kag.OFF)) {
                    return this.t;
                }
                if (((kag) this.e.get()).equals(kag.ALL)) {
                    lzi lziVar = this.i;
                    return (lziVar.k || lziVar.j) ? this.v : this.u;
                }
                if (this.f && o()) {
                    return this.s;
                }
                return (this.f || !this.i.k) ? map : this.n;
            case 5:
                return this.r;
            case 6:
                return this.i.f() ? this.q : this.p;
            case 12:
                return ((Float) ((lce) this.c).d).floatValue() >= 1.0f ? this.o : map;
            default:
                return map;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x00a2. Please report as an issue. */
    public final void g(ZoomUi zoomUi, kae kaeVar) {
        int iE;
        Typeface typefaceCreate;
        int color;
        float f;
        TextView textViewM;
        TextView textViewJ;
        TextView textViewK;
        Map mapF = f((jrl) this.a.fA());
        boolean z = zoomUi.getResources().getConfiguration().getLayoutDirection() == 1;
        for (Map.Entry entry : ((oor) mapF).entrySet()) {
            boolean z2 = entry.getKey() == kaeVar;
            if (z2) {
                Typeface typefaceCreate2 = Typeface.create("google-sans-text-medium", 0);
                TypedValue typedValue = new TypedValue();
                zoomUi.getResources().getValue(R.dimen.zoom_toggle_bar_letter_spacing, typedValue, true);
                float f2 = typedValue.getFloat();
                if (zoomUi.e) {
                    int iE2 = obr.e(zoomUi, R.attr.colorOnSecondary);
                    iE = obr.e(zoomUi, R.attr.colorOnSurface);
                    zoomUi.getResources().getValue(R.dimen.zoom_toggle_bar_selected_letter_spacing, typedValue, true);
                    float f3 = typedValue.getFloat();
                    typefaceCreate = typefaceCreate2;
                    color = iE2;
                    f = f3;
                } else {
                    color = zoomUi.getResources().getColor(R.color.zoom_toggle_bar_text_color, null);
                    typefaceCreate = Typeface.create("google-sans-medium_compat", 0);
                    iE = color;
                    f = f2;
                }
                kae kaeVar2 = kae.ULTRAWIDE;
                jrz jrzVar = jrz.PORTRAIT;
                switch (kaeVar) {
                    case ULTRAWIDE:
                        zoomUi.o(zoomUi.l(), color, f, typefaceCreate);
                        textViewM = zoomUi.m();
                        zoomUi.o(textViewM, iE, f2, typefaceCreate);
                        textViewJ = zoomUi.j();
                        zoomUi.o(textViewJ, iE, f2, typefaceCreate);
                        textViewK = zoomUi.k();
                        zoomUi.o(textViewK, iE, f2, typefaceCreate);
                        break;
                    case WIDE:
                        zoomUi.o(zoomUi.m(), color, f, typefaceCreate);
                        textViewM = zoomUi.l();
                        zoomUi.o(textViewM, iE, f2, typefaceCreate);
                        textViewJ = zoomUi.j();
                        zoomUi.o(textViewJ, iE, f2, typefaceCreate);
                        textViewK = zoomUi.k();
                        zoomUi.o(textViewK, iE, f2, typefaceCreate);
                        break;
                    case TELE:
                        zoomUi.o(zoomUi.j(), color, f, typefaceCreate);
                        zoomUi.o(zoomUi.l(), iE, f2, typefaceCreate);
                        textViewJ = zoomUi.m();
                        zoomUi.o(textViewJ, iE, f2, typefaceCreate);
                        textViewK = zoomUi.k();
                        zoomUi.o(textViewK, iE, f2, typefaceCreate);
                        break;
                    case ULTRATELE:
                        zoomUi.o(zoomUi.k(), color, f, typefaceCreate);
                        zoomUi.o(zoomUi.l(), iE, f2, typefaceCreate);
                        zoomUi.o(zoomUi.m(), iE, f2, typefaceCreate);
                        textViewK = zoomUi.j();
                        zoomUi.o(textViewK, iE, f2, typefaceCreate);
                        break;
                }
            }
            if (entry.getKey() == kae.ULTRAWIDE) {
                zoomUi.l().setText(e(z, Math.max(((Float) ((lce) this.c).d).floatValue(), ((Float) entry.getValue()).floatValue()), z2));
            } else if (entry.getKey() == kae.WIDE) {
                zoomUi.m().setText(e(z, ((Float) entry.getValue()).floatValue(), z2));
            } else if (entry.getKey() == kae.TELE) {
                if (((Float) entry.getValue()).floatValue() > ((Float) ((lce) this.j).d).floatValue()) {
                    zoomUi.j().setText(e(z, ((Float) ((lce) this.j).d).floatValue(), z2));
                } else {
                    zoomUi.j().setText(e(z, ((Float) entry.getValue()).floatValue(), z2));
                }
            } else if (entry.getKey() == kae.ULTRATELE) {
                if (((Float) entry.getValue()).floatValue() > ((Float) ((lce) this.j).d).floatValue()) {
                    zoomUi.k().setText(e(z, ((Float) ((lce) this.j).d).floatValue(), z2));
                } else {
                    zoomUi.k().setText(e(z, ((Float) entry.getValue()).floatValue(), z2));
                }
            }
        }
    }

    public final void h() {
        if (this.d.isRunning()) {
            this.d.cancel();
        }
    }

    public final boolean i(float f) {
        Map mapF = f((jrl) this.a.fA());
        double dRound = Math.round(c(f, ((Float) ((lce) this.c).d).floatValue()) * 10.0f);
        Double.isNaN(dRound);
        float f2 = (float) (dRound / 10.0d);
        double dRound2 = Math.round(f * 10.0f);
        Double.isNaN(dRound2);
        if (mapF.containsValue(Float.valueOf((float) (dRound2 / 10.0d)))) {
            return true;
        }
        Iterator it = ((oor) mapF).entrySet().iterator();
        while (it.hasNext()) {
            double dRound3 = Math.round(c(((Float) ((Map.Entry) it.next()).getValue()).floatValue(), ((Float) ((lce) this.c).d).floatValue()) * 10.0f);
            Double.isNaN(dRound3);
            if (f2 == ((float) (dRound3 / 10.0d))) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(kae kaeVar, float f) {
        return f >= c(n(kaeVar, (jrl) this.a.fA()).floatValue(), ((Float) ((lce) this.c).d).floatValue()) || f == c(((Float) ((lce) this.j).d).floatValue(), ((Float) ((lce) this.c).d).floatValue());
    }

    public final boolean k(float f) {
        return f >= b() || f == c(((Float) ((lce) this.c).d).floatValue(), ((Float) ((lce) this.c).d).floatValue());
    }

    public final boolean l(float f) {
        return n(kae.ULTRATELE, (jrl) this.a.fA()).floatValue() == 0.0f || c(f, ((Float) ((lce) this.c).d).floatValue()) < c(4.0f, ((Float) ((lce) this.c).d).floatValue());
    }

    public final boolean m(kae kaeVar, float f) {
        return f < c(n(kaeVar, (jrl) this.a.fA()).floatValue(), ((Float) ((lce) this.c).d).floatValue()) && f < c(((Float) ((lce) this.j).d).floatValue(), ((Float) ((lce) this.c).d).floatValue());
    }
}
