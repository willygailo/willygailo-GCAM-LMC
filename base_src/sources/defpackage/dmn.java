package defpackage;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.CheckBox;
import android.widget.ImageButton;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.evcomp.EvCompView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dmn implements dmh, lie {
    public final Context a;
    public final ddf b;
    public EvCompView e;
    public lda f;
    public lda g;
    public lda h;
    public elw i;
    public lie j;
    private final lda l;
    private final ljf m;
    private dmt n;
    private dna o;
    private ObjectAnimator p;
    private lda q;
    private jhh r;
    private ojc s;
    private CheckBox t;
    private bpp u;
    private final lda k = new lce(false);
    public final lda d = new lce(false);
    public final lap c = new lap();

    public dmn(Context context, ljf ljfVar, ddf ddfVar, lda ldaVar) {
        this.a = context;
        this.m = ljfVar;
        this.b = ddfVar;
        this.l = ldaVar;
    }

    @Override // defpackage.dmh
    public final lco a() {
        dna dnaVar = this.o;
        return dnaVar == null ? new lce(true) : dnaVar.k;
    }

    @Override // defpackage.dmh
    public final lco b() {
        return this.k;
    }

    @Override // defpackage.dmh
    public final lco c() {
        return this.d;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        dmt dmtVar = this.n;
        if (dmtVar != null) {
            dmtVar.g();
        }
        this.k.fB(false);
        this.c.close();
    }

    @Override // defpackage.dmh
    public final void d() {
        this.m.e("EvCompViewCtrl#disable");
        dmt dmtVar = this.n;
        if (dmtVar != null) {
            dmtVar.a();
        }
        this.m.f();
    }

    @Override // defpackage.dmh
    public final void e() {
        CheckBox checkBox = this.t;
        obr.at(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setEnabled(false);
    }

    @Override // defpackage.dmh
    public final void f() {
        CheckBox checkBox = this.t;
        obr.at(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setSoundEffectsEnabled(false);
    }

    @Override // defpackage.dmh
    public final void g(int i, int i2, float f) {
        this.m.e("EvCompViewCtrl#enable");
        s().b(i, i2, f);
        this.m.f();
    }

    @Override // defpackage.dmh
    public final void h() {
        CheckBox checkBox = this.t;
        obr.at(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setEnabled(true);
    }

    @Override // defpackage.dmh
    public final void i() {
        CheckBox checkBox = this.t;
        obr.at(checkBox, "EvCompViewController must be first initialized", new Object[0]);
        checkBox.setSoundEffectsEnabled(true);
    }

    @Override // defpackage.dmh
    public final void j(boolean z) {
        if (((Boolean) this.l.fA()).booleanValue()) {
            t();
            s().c(z);
        }
    }

    @Override // defpackage.dmh
    public final void k() {
        if (this.b.k(ddl.br)) {
            ((hbu) ((ojj) this.s).a).h();
            u(false, false);
        }
        dna dnaVar = this.o;
        if (dnaVar != null) {
            dnaVar.j();
        }
        if (((Boolean) ((lce) a()).d).booleanValue()) {
            return;
        }
        dna dnaVar2 = this.o;
        obr.ao(dnaVar2);
        dnaVar2.l();
    }

    @Override // defpackage.dmh
    public final void l(boolean z) {
        this.r.p = z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    @Override // defpackage.dmh
    public final void m(boolean z) {
        if (((Boolean) ((lce) this.d).d).booleanValue() == z) {
            return;
        }
        lda ldaVar = this.d;
        Boolean boolValueOf = Boolean.valueOf(z);
        ldaVar.fB(boolValueOf);
        if (!this.b.k(ddl.br)) {
            CheckBox checkBox = this.t;
            obr.ao(checkBox);
            checkBox.setContentDescription(this.a.getResources().getString(R.string.ae_af_lock_label));
            CheckBox checkBox2 = this.t;
            obr.ao(checkBox2);
            checkBox2.setChecked(z);
            this.q.fB(boolValueOf);
            if (!z) {
                k();
            }
        }
        if (z) {
            dna dnaVar = this.o;
            obr.ao(dnaVar);
            dnaVar.c();
        }
        bpp bppVar = this.u;
        if (bppVar != null) {
            bpr bprVar = bppVar.a;
            ddf ddfVar = bppVar.b;
            if (ddfVar.k(ddl.br)) {
                if (!z) {
                    if (((bpo) ((lce) bprVar.a).d).equals(bpo.UNLOCKED)) {
                        return;
                    }
                    bprVar.a.fB(bpo.UNLOCKED);
                } else {
                    if (((bpo) ((lce) bprVar.a).d).equals(bpo.AE_LOCKED)) {
                        return;
                    }
                    if (ddfVar.k(ddl.br)) {
                        bprVar.a.fB(bpo.AE_LOCKED);
                    } else {
                        bprVar.a.fB(bpo.AE_AF_LOCKED);
                    }
                }
            }
            if (!z) {
                if (((bpo) ((lce) bprVar.a).d).equals(bpo.UNLOCKED)) {
                    return;
                }
                bprVar.a.fB(bpo.UNLOCKED);
            } else {
                if (((bpo) ((lce) bprVar.a).d).equals(bpo.AE_AF_LOCKED)) {
                    return;
                }
                if (ddfVar.k(ddl.br)) {
                    bprVar.a.fB(bpo.AE_LOCKED);
                } else {
                    bprVar.a.fB(bpo.AE_AF_LOCKED);
                }
            }
        }
    }

    @Override // defpackage.dmh
    public final void n(dme dmeVar) {
        this.f.fB(dmeVar);
        EvCompView evCompView = this.e;
        evCompView.b.fB(dmeVar);
        evCompView.k();
        evCompView.i();
        evCompView.j();
        if (!evCompView.a.isEmpty()) {
            ArrayList arrayList = evCompView.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dmf dmfVar = (dmf) arrayList.get(i);
                if (evCompView.f.indexOfChild(dmfVar) != -1) {
                    evCompView.f.removeView(dmfVar);
                } else if (evCompView.g.indexOfChild(dmfVar) != -1) {
                    evCompView.g.removeView(dmfVar);
                }
            }
            evCompView.a.clear();
        }
        dme dmeVar2 = dme.SINGLE;
        switch (dmeVar) {
            case SINGLE:
                evCompView.h = evCompView.c(dmg.BRIGHTNESS, 0.0f, 1.0f, R.drawable.quantum_gm_ic_brightness_medium_white_24, R.color.google_grey800, R.drawable.bg_evcomp_brightness_knob, R.string.exposure_knob_description);
                evCompView.f.addView(evCompView.h);
                evCompView.a.add(evCompView.h);
                evCompView.g.setVisibility(8);
                break;
            case DUAL:
                float fB = evCompView.c / evCompView.b();
                evCompView.h = evCompView.c(dmg.BRIGHTNESS, 0.0f, 1.0f - fB, R.drawable.ic_evc_brightness_24px, R.color.google_grey800, R.drawable.bg_evcomp_brightness_knob, R.string.brightness_knob_accessibility_description);
                evCompView.i = evCompView.c(dmg.SHADOW, fB, 1.0f, R.drawable.ic_evc_shadow_24px, R.color.google_grey100, R.drawable.bg_evcomp_shadow_knob, R.string.shadow_knob_accessibility_description);
                evCompView.f.addView(evCompView.h);
                evCompView.f.addView(evCompView.i);
                evCompView.a.add(evCompView.h);
                evCompView.a.add(evCompView.i);
                evCompView.g.setVisibility(8);
                break;
            case DUAL_INDEPENDENT:
                evCompView.h = evCompView.c(dmg.BRIGHTNESS, 0.0f, 1.0f, R.drawable.ic_evc_brightness_24px, R.color.google_grey800, R.drawable.bg_evcomp_brightness_knob, R.string.brightness_knob_accessibility_description);
                evCompView.i = evCompView.c(dmg.SHADOW, 0.0f, 1.0f, R.drawable.ic_evc_shadow_24px, R.color.google_grey100, R.drawable.bg_evcomp_shadow_knob, R.string.shadow_knob_accessibility_description);
                evCompView.f.addView(evCompView.h);
                evCompView.g.addView(evCompView.i);
                evCompView.a.add(evCompView.h);
                evCompView.a.add(evCompView.i);
                evCompView.g.setVisibility(0);
                break;
        }
        ArrayList arrayList2 = evCompView.a;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dmf dmfVar2 = (dmf) arrayList2.get(i2);
            evCompView.e(dmfVar2, dmfVar2.c);
        }
        evCompView.invalidate();
        evCompView.requestLayout();
        final dna dnaVar = this.o;
        obr.ao(dnaVar);
        dnaVar.a();
        dnaVar.j();
        Iterator it = this.e.a.iterator();
        while (it.hasNext()) {
            ((dmf) it.next()).setOnTouchListener(new View.OnTouchListener() { // from class: dmj
                /* JADX WARN: Code duplicated, block: B:38:0x0108 A[Catch: NullPointerException -> 0x0116, SecurityException -> 0x0118, ppp -> 0x013e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {NullPointerException -> 0x0116, SecurityException -> 0x0118, ppp -> 0x013e, blocks: (B:28:0x00aa, B:34:0x00fb, B:38:0x0108, B:45:0x0115), top: B:88:0x00aa }] */
                /* JADX WARN: Code duplicated, block: B:55:0x016c  */
                /* JADX WARN: Code duplicated, block: B:56:0x0176  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v15 */
                /* JADX WARN: Type inference failed for: r1v21, types: [ojc] */
                /* JADX WARN: Type inference failed for: r1v23, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r1v24, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r1v26 */
                /* JADX WARN: Type inference failed for: r1v27, types: [ojc] */
                /* JADX WARN: Type inference failed for: r1v29 */
                /* JADX WARN: Type inference failed for: r1v30 */
                /* JADX WARN: Type inference failed for: r1v31 */
                /* JADX WARN: Type inference failed for: r1v32 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ?? r1;
                    String string;
                    Object objI;
                    final ?? r2;
                    final dmn dmnVar = this.a;
                    dna dnaVar2 = dnaVar;
                    if (dmnVar.e.getVisibility() != 0) {
                        return false;
                    }
                    if (motionEvent.getAction() == 0) {
                        dmnVar.e.l(view, motionEvent);
                        dmnVar.t();
                        return true;
                    }
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2) {
                            float[] fArrL = dmnVar.e.l(view, motionEvent);
                            float f = fArrL[0];
                            Object tag = view.getTag();
                            tag.getClass();
                            dnaVar2.d(f, (dmg) tag);
                            if (fArrL[1] != -1.0f) {
                                Object tag2 = view.getTag();
                                tag2.getClass();
                                dnaVar2.d(fArrL[1], ((dmg) tag2).equals(dmg.BRIGHTNESS) ? dmg.SHADOW : dmg.BRIGHTNESS);
                            }
                        }
                        return true;
                    }
                    dmg dmgVar = (dmg) view.getTag();
                    dmgVar.getClass();
                    dnaVar2.b(dmgVar);
                    if (dmnVar.b.k(ddl.br)) {
                        dmnVar.u(true, true);
                        dmnVar.m(true);
                    }
                    if (!((dme) dmnVar.f.fA()).equals(dme.DUAL_INDEPENDENT) || dmnVar.b.k(ddl.br)) {
                        return true;
                    }
                    oih oihVar = oih.a;
                    if (dmgVar.equals(dmg.BRIGHTNESS)) {
                        if (((Boolean) dmnVar.g.fA()).booleanValue()) {
                            return true;
                        }
                        dmnVar.g.fB(true);
                        string = dmnVar.a.getString(R.string.brightness_knob_tooltip_description);
                        r2 = oihVar;
                    } else {
                        if (((Boolean) dmnVar.h.fA()).booleanValue()) {
                            return true;
                        }
                        dmnVar.h.fB(true);
                        Context context = dmnVar.a;
                        try {
                            ?? Query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.apps.tips.repository").appendEncodedPath("tips").appendEncodedPath("tips_camera_dualcontrols").build(), null, null, null);
                            if (Query != 0) {
                                try {
                                    if (Query.moveToFirst()) {
                                        objI = ojc.i(nhs.a(context, (nht) ppd.s(nht.p, Query.getBlob(Query.getColumnIndex("tip")), pos.b())));
                                        Query.close();
                                    } else {
                                        Log.w("TipsProviderHelper", "No tip for tip label tips_camera_dualcontrols");
                                        objI = oih.a;
                                        if (Query != 0) {
                                            Query.close();
                                        }
                                    }
                                    Query = objI;
                                    r1 = Query;
                                    if (r1.g()) {
                                        string = dmnVar.a.getString(R.string.shadow_knob_tooltip_with_tips_description);
                                        r2 = r1;
                                    } else {
                                        string = dmnVar.a.getString(R.string.shadow_knob_tooltip_description);
                                        r2 = r1;
                                    }
                                } catch (Throwable th) {
                                    if (Query != 0) {
                                        try {
                                            Query.close();
                                        } catch (Throwable th2) {
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                Log.w("TipsProviderHelper", "No tip for tip label tips_camera_dualcontrols");
                                objI = oih.a;
                                if (Query != 0) {
                                    Query.close();
                                }
                                Query = objI;
                                r1 = Query;
                                if (r1.g()) {
                                    string = dmnVar.a.getString(R.string.shadow_knob_tooltip_with_tips_description);
                                    r2 = r1;
                                } else {
                                    string = dmnVar.a.getString(R.string.shadow_knob_tooltip_description);
                                    r2 = r1;
                                }
                            }
                        } catch (NullPointerException e) {
                            e = e;
                            String strValueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 34);
                            sb.append("Failed to get data from Tips app. ");
                            sb.append(strValueOf);
                            Log.e("TipsProviderHelper", sb.toString());
                            r1 = oih.a;
                        } catch (SecurityException e2) {
                            e = e2;
                            String strValueOf2 = String.valueOf(e);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 34);
                            sb2.append("Failed to get data from Tips app. ");
                            sb2.append(strValueOf2);
                            Log.e("TipsProviderHelper", sb2.toString());
                            r1 = oih.a;
                        } catch (ppp e3) {
                            String strValueOf3 = String.valueOf(e3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 37);
                            sb3.append("Failed to parse Tip from byte array. ");
                            sb3.append(strValueOf3);
                            Log.e("TipsProviderHelper", sb3.toString());
                            r1 = oih.a;
                        }
                    }
                    dmnVar.t();
                    int dimensionPixelSize = (dmnVar.a.getResources().getDimensionPixelSize(R.dimen.evcomp_slider_knob_size) - dmnVar.a.getResources().getDimensionPixelSize(R.dimen.evcomp_slider_icon_size)) / 2;
                    jlz jlzVar = new jlz(string);
                    jrz jrzVar = jrz.PORTRAIT;
                    switch (dmnVar.e.j.ordinal()) {
                        case 1:
                            jlzVar.m(view, -dimensionPixelSize);
                            break;
                        case 2:
                            jlzVar.c(view, -dimensionPixelSize);
                            break;
                        default:
                            jlzVar.t(view);
                            break;
                    }
                    jlzVar.i();
                    jlzVar.h = dmnVar.b.k(ddl.ay);
                    jlzVar.n();
                    jlzVar.c = 300;
                    jlzVar.d = 3300;
                    jlzVar.o();
                    jlzVar.f = false;
                    jlzVar.e(new Runnable() { // from class: dmk
                        @Override // java.lang.Runnable
                        public final void run() {
                            dmn dmnVar2 = dmnVar;
                            ojc ojcVar = r2;
                            if (ojcVar.g()) {
                                dmnVar2.a.startActivity(((nhs) ojcVar.c()).a);
                            }
                        }
                    });
                    jlzVar.i = dmnVar.i;
                    jlzVar.e = false;
                    jlzVar.m = 10;
                    lie lieVarA = jlzVar.a();
                    dmnVar.c.c(lieVarA);
                    synchronized (dmnVar) {
                        dmnVar.j = lieVarA;
                    }
                    return true;
                }
            });
        }
    }

    @Override // defpackage.dmh
    public final void o(boolean z, boolean z2) {
        if (((Boolean) this.l.fA()).booleanValue()) {
            Object obj = ((lce) this.d).d;
            s().d(z, z2);
        }
    }

    @Override // defpackage.dmh
    public final void p(int i) {
        dna dnaVar = this.o;
        obr.ao(dnaVar);
        if (dnaVar.a.getVisibility() != 0) {
            return;
        }
        dnaVar.i();
        dnaVar.a.postDelayed(dnaVar.l, i);
    }

    @Override // defpackage.dmh
    public final void q(bpp bppVar) {
        this.u = bppVar;
    }

    @Override // defpackage.dmh
    public final void r(EvCompView evCompView, lda ldaVar, lda ldaVar2, lda ldaVar3, lda ldaVar4, lda ldaVar5, lda ldaVar6, lda ldaVar7, huq huqVar, ojc ojcVar, elw elwVar, jhh jhhVar) {
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this.a, android.R.animator.fade_in);
        objectAnimator.setTarget(evCompView);
        this.p = objectAnimator;
        this.f = ldaVar;
        this.e = evCompView;
        this.g = ldaVar6;
        this.h = ldaVar7;
        this.i = elwVar;
        this.r = jhhVar;
        this.s = ojcVar;
        this.q = ldaVar5;
        this.t = evCompView.d;
        final int i = 1;
        final int i2 = 0;
        if (this.b.k(ddl.br)) {
            CheckBox checkBox = this.t;
            obr.ao(checkBox);
            checkBox.setVisibility(8);
            evCompView.e.setOnClickListener(new View.OnClickListener(this) { // from class: dmi
                public final /* synthetic */ dmn a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            dmn dmnVar = this.a;
                            if (!((Boolean) ((lce) dmnVar.d).d).booleanValue()) {
                                dmnVar.m(true);
                            } else {
                                dmnVar.m(false);
                                dmnVar.j(true);
                            }
                            break;
                        default:
                            dmn dmnVar2 = this.a;
                            dmnVar2.u(true, false);
                            dmnVar2.k();
                            dmnVar2.m(false);
                            break;
                    }
                }
            });
        } else {
            this.t.setOnClickListener(new View.OnClickListener(this) { // from class: dmi
                public final /* synthetic */ dmn a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            dmn dmnVar = this.a;
                            if (!((Boolean) ((lce) dmnVar.d).d).booleanValue()) {
                                dmnVar.m(true);
                            } else {
                                dmnVar.m(false);
                                dmnVar.j(true);
                            }
                            break;
                        default:
                            dmn dmnVar2 = this.a;
                            dmnVar2.u(true, false);
                            dmnVar2.k();
                            dmnVar2.m(false);
                            break;
                    }
                }
            });
            CheckBox checkBox2 = this.t;
            obr.ao(checkBox2);
            checkBox2.setVisibility(0);
        }
        this.o = new dni(new qkg() { // from class: dml
            @Override // defpackage.qkg
            public final Object get() {
                return this.a.s();
            }
        }, evCompView, ldaVar2, ldaVar3, ldaVar4, ldaVar, huqVar, ojcVar, this.b.k(ddl.br), null);
        CheckBox checkBox3 = this.t;
        ObjectAnimator objectAnimator2 = this.p;
        dna dnaVar = this.o;
        obr.ao(dnaVar);
        dna dnaVar2 = this.o;
        obr.ao(dnaVar2);
        dne dneVar = new dne(evCompView, checkBox3, objectAnimator2, dnaVar, huqVar, dnaVar2, null);
        this.n = dneVar;
        dneVar.f();
        this.d.fB(false);
        jhhVar.p = false;
        this.k.fB(true);
    }

    public final dmt s() {
        dmt dmtVar = this.n;
        obr.ao(dmtVar);
        return dmtVar;
    }

    public final synchronized void t() {
        lie lieVar = this.j;
        if (lieVar != null) {
            lieVar.close();
        }
    }

    public final void u(boolean z, boolean z2) {
        AlphaAnimation alphaAnimation;
        if (!z) {
            this.e.e.setVisibility(true == z2 ? 0 : 8);
            return;
        }
        ImageButton imageButton = this.e.e;
        if (z2) {
            if (imageButton.getAlpha() == 1.0f && imageButton.getVisibility() == 0) {
                return;
            }
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new dmm(this, 1));
        } else {
            if (imageButton.getAlpha() == 0.0f && imageButton.getVisibility() == 8) {
                return;
            }
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new dmm(this, 0));
        }
        imageButton.startAnimation(alphaAnimation);
    }
}
