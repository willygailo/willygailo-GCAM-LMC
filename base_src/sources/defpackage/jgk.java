package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import j$.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jgk implements jgq, jgr, jfy, fik, fie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/modeswitcher/ModeSwitcherControllerImpl");
    public final EnumMap b;
    public final EnumMap c;
    ModeSwitcher d;
    MoreModesGrid e;
    public final jlb f;
    public boolean g;
    public boolean h;
    public lie i;
    public final ljf j;
    public final ddf k;
    public final elw l;
    public final huj m;
    public ojc n;
    private ojc o;
    private boolean p;
    private final Context q;
    private final pyn r;
    private final lar s;
    private final pyn t;
    private final qkg u;
    private final jgl v;
    private final lap w;

    public jgk(Context context, lap lapVar, Map map, ModeSwitcher modeSwitcher, MoreModesGrid moreModesGrid, jlb jlbVar, ddf ddfVar, pyn pynVar, pyn pynVar2, qkg qkgVar, lar larVar, ljf ljfVar, elw elwVar, huj hujVar) {
        EnumMap enumMap = new EnumMap(jrl.class);
        this.b = enumMap;
        this.c = new EnumMap(jrl.class);
        this.o = oih.a;
        this.p = false;
        this.g = false;
        this.h = false;
        jgb jgbVar = new jgb(0);
        this.v = jgbVar;
        this.n = oih.a;
        this.q = context;
        this.w = lapVar;
        this.d = modeSwitcher;
        this.e = moreModesGrid;
        this.f = jlbVar;
        this.k = ddfVar;
        this.t = pynVar;
        this.u = qkgVar;
        this.r = pynVar2;
        this.s = larVar;
        this.j = ljfVar;
        this.l = elwVar;
        this.m = hujVar;
        boolean zK = ddfVar.k(ddl.ay);
        jfs jfsVar = modeSwitcher.c;
        jfsVar.g = zK;
        if (!zK) {
            jfsVar.i = jfsVar.getResources().getColor(R.color.mode_chip_text_color_selected_legacy);
            jfsVar.j = jfsVar.getResources().getColor(R.color.mode_chip_text_color_unselected_legacy);
            jfsVar.k = jfsVar.getResources().getColor(R.color.mode_chip_color_legacy);
            jfsVar.a().setColor(jfsVar.k);
        }
        moreModesGrid.g = ddfVar.k(ddl.ay);
        modeSwitcher.j = jgbVar;
        modeSwitcher.b = this;
        enumMap.putAll(map);
        Iterator it = enumMap.keySet().iterator();
        while (it.hasNext()) {
            i((jrl) it.next());
        }
    }

    private final void A() {
        if (this.n.g()) {
            ((lap) this.n.c()).close();
        }
    }

    private final boolean B(jrl jrlVar) {
        return this.c.get(jrlVar) == this.d;
    }

    @Override // defpackage.jgq
    public final jrp a() {
        return this.d.c.a();
    }

    @Override // defpackage.jgq
    public final jrp c() {
        return new jfq(this.d.c, 0);
    }

    @Override // defpackage.jgq
    public final jrp d() {
        return new jfq(this.d.c, 2);
    }

    @Override // defpackage.jgq
    public final lie e() {
        p(false);
        return new jfz(this, 1);
    }

    @Override // defpackage.jgr
    public final void f(jrl jrlVar) {
        A();
        this.p = false;
        if (this.o.g()) {
            ((jgr) this.o.c()).f(jrlVar);
        }
    }

    @Override // defpackage.fie
    public final void fU() {
        A();
    }

    @Override // defpackage.jgr
    public final void g(jrl jrlVar) {
        A();
        this.p = true;
        if (this.o.g()) {
            ((jgr) this.o.c()).g(jrlVar);
        }
    }

    @Override // defpackage.jgq
    public final lie h() {
        q(4);
        return new jfz(this, 0);
    }

    public final void i(final jrl jrlVar) {
        lco lcoVar = (lco) this.b.get(jrlVar);
        if (lcoVar != null) {
            this.w.c(lcoVar.a(new lij() { // from class: jga
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    jgm jgmVar;
                    jgk jgkVar = this.a;
                    jrl jrlVar2 = jrlVar;
                    if (!((Boolean) obj).booleanValue() || (jgmVar = (jgm) jgkVar.c.get(jrlVar2)) == null) {
                        return;
                    }
                    jgmVar.i(jrlVar2, false);
                }
            }, pgr.INSTANCE));
        }
    }

    @Override // defpackage.jgq
    public final void j(jrl jrlVar) {
        obr.aK(!x(jrlVar), "Mode %s already configured in More Modes", jrlVar);
        this.c.put(jrlVar, this.d);
        this.d.c(jrlVar);
        s(jrlVar);
    }

    public final void k(jrl jrlVar) {
        obr.aK(!B(jrlVar), "Mode %s already configured in mode list", jrlVar);
        MoreModesGrid moreModesGrid = this.e;
        moreModesGrid.getClass();
        this.c.put(jrlVar, moreModesGrid);
        MoreModesGrid moreModesGrid2 = this.e;
        lar.a();
        obr.aG(jrlVar != jrl.UNINITIALIZED, "UNINITIALIZED is not a valid mode");
        obr.aG(jrlVar != jrl.MORE_MODES, "Cannot append MORE_MODES mode");
        moreModesGrid2.b.add(new jgp(jrlVar));
        if (!moreModesGrid2.f) {
            moreModesGrid2.f = true;
            moreModesGrid2.requestLayout();
        }
        s(jrlVar);
    }

    @Override // defpackage.jgq
    public final void l(jrl jrlVar) {
        obr.aF(!B(jrl.MORE_MODES));
        this.d.c(jrl.MORE_MODES);
        this.c.put(jrl.MORE_MODES, this.d);
        ModeSwitcher modeSwitcher = this.d;
        jrlVar.getClass();
        modeSwitcher.k = jrlVar;
        boolean z = modeSwitcher.e;
        jrl jrlVar2 = modeSwitcher.k;
        jfs jfsVar = modeSwitcher.c;
        jfsVar.l = jrlVar2;
        jfsVar.p = 2;
        jfsVar.c.isEmpty();
        modeSwitcher.e = true;
        modeSwitcher.setEnabled(true);
    }

    @Override // defpackage.jgq
    public final void m() {
        ModeSwitcher modeSwitcher = this.d;
        if (modeSwitcher != null) {
            jur.a(4, modeSwitcher);
        }
    }

    @Override // defpackage.jgq
    public final void n(boolean z) {
        float f;
        ObjectAnimator objectAnimatorOfFloat;
        MoreModesGrid moreModesGrid = this.e;
        if (moreModesGrid != null) {
            if (z) {
                boolean z2 = this.p;
                obr.aG(true, "use hideImmediately to transition without animation");
                moreModesGrid.h.cancel();
                moreModesGrid.l = true;
                AnimatorSet animatorSet = new AnimatorSet();
                if (!z2) {
                    Animator[] animatorArr = new Animator[2];
                    if (moreModesGrid.d == jrz.LANDSCAPE) {
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(moreModesGrid, (Property<MoreModesGrid, Float>) View.TRANSLATION_Y, moreModesGrid.getTranslationY(), -moreModesGrid.k);
                    } else {
                        objectAnimatorOfFloat = moreModesGrid.d == jrz.REVERSE_LANDSCAPE ? ObjectAnimator.ofFloat(moreModesGrid, (Property<MoreModesGrid, Float>) View.TRANSLATION_Y, moreModesGrid.getTranslationY(), moreModesGrid.k) : ObjectAnimator.ofFloat(moreModesGrid, (Property<MoreModesGrid, Float>) View.TRANSLATION_X, moreModesGrid.getTranslationX(), moreModesGrid.k);
                    }
                    objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                    animatorArr[0] = objectAnimatorOfFloat;
                    animatorArr[1] = moreModesGrid.a();
                    animatorSet.playTogether(animatorArr);
                } else {
                    animatorSet.play(moreModesGrid.a());
                }
                animatorSet.setDuration(moreModesGrid.j);
                animatorSet.addListener(new jgo(moreModesGrid));
                animatorSet.start();
                moreModesGrid.h = animatorSet;
            } else {
                moreModesGrid.h.cancel();
                moreModesGrid.setAlpha(0.0f);
                if (moreModesGrid.d == jrz.LANDSCAPE) {
                    f = -moreModesGrid.k;
                } else {
                    if (moreModesGrid.d == jrz.REVERSE_LANDSCAPE) {
                        f = moreModesGrid.k;
                    } else {
                        moreModesGrid.setTranslationX(moreModesGrid.k);
                    }
                    moreModesGrid.setVisibility(8);
                    moreModesGrid.l = false;
                }
                moreModesGrid.setTranslationY(f);
                moreModesGrid.setVisibility(8);
                moreModesGrid.l = false;
            }
            lie lieVar = this.i;
            if (lieVar != null) {
                lieVar.close();
            }
        }
    }

    @Override // defpackage.jgq
    public final void o(jrl jrlVar, boolean z) {
        if (B(jrlVar)) {
            this.d.g(jrlVar, z);
            return;
        }
        if (this.k.k(dcu.J) && (jrlVar.equals(jrl.TIME_LAPSE) || jrlVar.equals(jrl.SLOW_MOTION))) {
            this.d.g(jrl.VIDEO, z);
            return;
        }
        if (!this.g || x(jrlVar) || jrlVar == jrl.REWIND) {
            return;
        }
        String strValueOf = String.valueOf(jrlVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
        sb.append("Mode ");
        sb.append(strValueOf);
        sb.append(" is not configured.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.jgq
    public final void p(boolean z) {
        ModeSwitcher modeSwitcher = this.d;
        if (modeSwitcher != null) {
            modeSwitcher.setEnabled(z);
            this.e.setEnabled(z);
        }
    }

    public final void q(int i) {
        this.d.setImportantForAccessibility(i);
    }

    @Override // defpackage.jgq
    public final void r(jgr jgrVar) {
        this.o = ojc.i(jgrVar);
        this.d.i = this;
        this.e.m = ojc.i(this);
    }

    public final void s(jrl jrlVar) {
        lco lcoVar = (lco) this.b.get(jrlVar);
        jgm jgmVar = (jgm) this.c.get(jrlVar);
        if (lcoVar == null || jgmVar == null) {
            return;
        }
        lco lcoVar2 = (lco) this.b.get(jrlVar);
        boolean z = false;
        if (lcoVar2 != null && !((Boolean) lcoVar2.fA()).booleanValue()) {
            z = true;
        }
        jgmVar.i(jrlVar, z);
    }

    @Override // defpackage.jgq
    public final void t(fjs fjsVar) {
        this.d.h = fjsVar;
        this.e.e = fjsVar;
    }

    @Override // defpackage.jgq
    public final void u() {
        ModeSwitcher modeSwitcher = this.d;
        if (modeSwitcher != null) {
            modeSwitcher.e(true, false);
            jur.a(0, this.d);
        }
    }

    @Override // defpackage.jgq
    public final void v() {
        MoreModesGrid moreModesGrid = this.e;
        if (moreModesGrid != null) {
            moreModesGrid.b();
            if (this.g) {
                if (this.h) {
                    w();
                    return;
                }
                return;
            }
            ((job) this.u).get();
            boolean zD = ((jtx) this.t.get()).d(this.q);
            jtx jtxVar = (jtx) this.t.get();
            Context context = this.q;
            boolean zE = false;
            if (jtxVar.a.k(ddl.as)) {
                pvr pvrVar = new pvr(context.getPackageManager());
                if (pvrVar.c(pvrVar.b(), "com.google.vr.apps.ornament.measure.MeasureMainActivity")) {
                    zE = jtx.e(pvrVar);
                }
            }
            plk.af(((jcw) this.r.get()).a(), new jgj(this, zD, jtx.f(this.q), zE), this.s);
        }
    }

    public final void w() {
        if (this.k.k(ddp.s)) {
            lco lcoVar = (lco) this.b.get(jrl.LENS);
            if (lcoVar != null && ((Boolean) lcoVar.fA()).booleanValue()) {
                return;
            }
            jgp jgpVar = (jgp) Collection.EL.stream(this.e.b).filter(bql.r).findFirst().orElse(null);
            ojc ojcVarI = jgpVar == null ? oih.a : ojc.i(jgpVar.b);
            if (ojcVarI.g()) {
                View view = (View) ojcVarI.c();
                view.getViewTreeObserver().addOnGlobalLayoutListener(new jgi(this, view));
            }
        }
    }

    public final boolean x(jrl jrlVar) {
        return this.c.get(jrlVar) == this.e;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jgq
    public final void y(float f, int i) {
        ModeSwitcher modeSwitcher = this.d;
        try {
            jfs jfsVar = modeSwitcher.c;
            int left = 0;
            obr.aF(f <= 1.0f);
            TextView textView = jfsVar.h;
            textView.getClass();
            int iIndexOfChild = jfsVar.indexOfChild(textView);
            if (iIndexOfChild >= 0) {
                TextView textView2 = (TextView) jfsVar.getChildAt(iIndexOfChild + (i != 1 ? 1 : -1));
                left = (textView.getLeft() + textView.getRight()) / 2;
                if (textView2 != null) {
                    left += Math.round((((textView2.getLeft() + textView2.getRight()) / 2) - left) * f);
                }
            }
            modeSwitcher.f(left, true);
        } catch (Throwable th) {
            ((oug) ((oug) ModeSwitcher.a.b()).G((char) 3343)).r("Working around b/110351942: %s", th);
        }
    }

    @Override // defpackage.jgq
    public final void z(boolean z) {
        this.d.e(z, true);
    }
}
