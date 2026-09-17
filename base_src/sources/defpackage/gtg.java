package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.apps.camera.optionsbar.common.LinearMinibarImpl;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.mdmitriev.auxlenses.AuxButtonsLayout;
import j$.util.DesugarArrays;
import j$.util.List$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gtg implements cwh, jrt, gtt, gtn, gtw {
    public static final ouj a = ouj.h("com/google/android/apps/camera/optionsbar/OptionsBarController2");
    public final lda A;
    public final lda B;
    public final lda C;
    public final lda D;
    public final lda E;
    public final lda F;
    public final lda G;
    public final lda H;
    public final lda I;
    public lda J;
    public final huq K;
    public final hur L;
    public final huo M;
    public final lda N;
    public final imf O;
    public final dqa P;
    public final gtk Q;
    public final gtk R;
    public final gtk S;
    public final gtk T;
    public final gtk U;
    public final gtk V;
    public final gtk W;
    public final gtk X;
    public final gtk Y;
    public final gtk Z;
    public OptionsMenuView aT;
    public View aU;
    public OptionsMenuContainer aV;
    public ImageButton aW;
    public final fjs aX;
    public final elw aY;
    public final lda aZ;
    public final gtk aa;
    public final gtk ab;
    public final gtk ac;
    public final gtk ad;
    public final gtk ae;
    public final gtk af;
    public final gtk ag;
    public final gtk ah;
    public final gtk ai;
    public gtk aj;
    public gtk ak;
    public final lco al;
    public final lco am;
    public final lco an;
    public final lco ao;
    public boolean ar;
    public final gtk as;
    public boolean at;
    public boolean av;
    public boolean aw;
    public boolean ay;
    public final lda b;
    public final gsp ba;
    public final ojc bb;
    public final doq bc;
    public final ojc bd;
    public final pyn be;
    public final ojc bf;
    public final iud bg;
    public final Map bh;
    public final olt bi;
    public final lap bj;
    private final boolean bk;
    private final boolean bl;
    private final boolean bm;
    private boolean bo;
    private final lqv bs;
    public final lar c;
    public final ljf d;
    public final ddf e;
    public final dmh f;
    public final kas g;
    public final jdk h;
    public final hub i;
    public final huj j;
    public final boolean k;
    public final lda l;
    public final lda m;
    public final lda n;
    public final lda o;
    public final lda p;
    public final lda q;
    public final lda r;
    public final lda s;
    public final lda t;
    public final lda u;
    public final lda v;
    public final lda w;
    public final lda x;
    public final lda y;
    public final lda z;
    public boolean ap = false;
    public boolean aq = false;
    private boolean bn = true;
    public boolean au = false;
    public boolean ax = false;
    private boolean bp = false;
    public List az = new ArrayList();
    public final olt aA = oob.f(gtv.TIMER_ZERO_SECONDS, hti.OFF, gtv.TIMER_THREE_SECONDS, hti.THREE, gtv.TIMER_TEN_SECONDS, hti.TEN, gtv.TIMER_AUTO, hti.AUTO);
    public final olt aB = oob.d(gtv.HDR_OFF, gqx.OFF, gtv.HDR_AUTO, gqx.AUTO, gtv.HDR_ON, gqx.ON);
    public final olt aC = oob.c(gtv.SELECTED, true, gtv.UNSELECTED, false);
    public final olt aD = oob.f(gtv.PHOTO_FLASH_AUTO, "auto", gtv.PHOTO_FLASH_OFF, "off", gtv.PHOTO_FLASH_NS, "ns", gtv.PHOTO_FLASH_ON, "on");
    public final olt aE = oob.f(gtv.FPS_AUTO, htg.FPS_AUTO, gtv.FPS_24, htg.FPS_24, gtv.FPS_30, htg.FPS_30, gtv.FPS_60, htg.FPS_60);
    public final olt aF = oob.c(gtv.RES_2160P, htl.RES_2160P, gtv.RES_1080P, htl.RES_1080P);
    public final olt aG = oob.c(gtv.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE, htk.SIXTEEN_BY_NINE, gtv.VIDEO_ASPECT_RATIO_THREE_BY_FOUR, htk.THREE_BY_FOUR);
    public final olt aH = oob.d(gtv.MIC_INPUT_EXT_BLUETOOTH, hth.EXT_BLUETOOTH, gtv.MIC_INPUT_EXT_WIRED, hth.EXT_WIRED, gtv.MIC_INPUT_PHONE, hth.PHONE);
    public final olt aI = oob.d(gtv.BEAUTIFICATION_ON_LIGHT, Integer.valueOf(htf.ON_LIGHT.f), gtv.BEAUTIFICATION_ON_STRONG, Integer.valueOf(htf.ON_STRONG.f), gtv.BEAUTIFICATION_OFF, Integer.valueOf(htf.OFF.f));
    public final olt aJ = oob.f(gtv.MAKEUP_MAKEUP1, Integer.valueOf(hls.e(2)), gtv.MAKEUP_MAKEUP2, Integer.valueOf(hls.e(3)), gtv.MAKEUP_MAKEUP3, Integer.valueOf(hls.e(4)), gtv.MAKEUP_OFF, Integer.valueOf(hls.e(1)));
    public final olt aK = oob.h(gtv.AF_ON, Integer.valueOf(hte.ON.f), gtv.AF_ON_LOCKED, Integer.valueOf(hte.ON_LOCKED.f), gtv.AF_OFF_NEAR, Integer.valueOf(hte.OFF_NEAR.f), gtv.AF_OFF_FAR, Integer.valueOf(hte.OFF_FAR.f), gtv.AF_OFF_INFINITY, Integer.valueOf(hte.OFF_INFINITY.f));
    public final olt aL = oob.d(gtv.MICROVIDEO_ON, 2, gtv.MICROVIDEO_AUTO, 1, gtv.MICROVIDEO_OFF, 0);
    public final olt aM = oob.h(gtv.PHOTO_SPHERE, "pano_photosphere", gtv.HORIZONTAL_PHOTO_SPHERE, "pano_horizontal", gtv.VERTICAL_PHOTO_SPHERE, "pano_vertical", gtv.WIDE_ANGLE_PHOTO_SPHERE, "pano_wide", gtv.FISH_EYE_PHOTO_SPHERE, "pano_fisheye");
    public final olt aN = oob.d(gtv.ASPECT_RATIO_SIXTEEN_BY_NINE, 0, gtv.ASPECT_RATIO_FOUR_BY_THREE, 1, gtv.ASPECT_RATIO_THREE_BY_FOUR, 2);
    public final olt aO = oob.c(gtv.ASTRO_OFF, Integer.valueOf(hls.g(1)), gtv.ASTRO_AUTO, Integer.valueOf(hls.g(2)));
    public final olt aP = oob.c(gtv.VIDEO_FLASH_OFF, "off", gtv.VIDEO_FLASH_ON, "torch");
    public final olt aQ = oob.c(gtv.IMAX_AUDIO_ON, true, gtv.IMAX_AUDIO_OFF, false);
    private final Set bq = ope.K(gtm.RAW_OUTPUT, gtm.MICROVIDEO, gtm.VIDEO_RESOLUTION, gtm.FPS);
    public gul aR = new gul() { // from class: gtd
        @Override // defpackage.gul
        public final void a() {
        }
    };
    public gtf aS = new gtf() { // from class: gsy
        @Override // defpackage.gtf
        public final void a() {
        }
    };
    private final AtomicBoolean br = new AtomicBoolean(false);

    public gtg(lda ldaVar, lar larVar, ljf ljfVar, lap lapVar, gsp gspVar, ddf ddfVar, lda ldaVar2, lda ldaVar3, lda ldaVar4, lda ldaVar5, huq huqVar, hur hurVar, huo huoVar, lda ldaVar6, lda ldaVar7, lda ldaVar8, lda ldaVar9, lda ldaVar10, boolean z, lda ldaVar11, boolean z2, lda ldaVar12, boolean z3, lda ldaVar13, lda ldaVar14, lda ldaVar15, lda ldaVar16, fjs fjsVar, lqv lqvVar, hub hubVar, lda ldaVar17, dmh dmhVar, kas kasVar, jdk jdkVar, lda ldaVar18, huj hujVar, lda ldaVar19, boolean z4, elw elwVar, lda ldaVar20, huf hufVar, hug hugVar, doq doqVar, ojc ojcVar, ojc ojcVar2, pyn pynVar, iud iudVar, ojc ojcVar3, imf imfVar, dqa dqaVar) {
        this.b = ldaVar;
        this.c = larVar;
        this.d = ljfVar;
        this.bj = lapVar;
        this.e = ddfVar;
        this.ba = gspVar;
        this.l = ldaVar16;
        this.m = ldaVar2;
        this.n = ldaVar4;
        this.o = ldaVar5;
        this.p = hugVar.b(htu.i);
        this.q = hugVar.b(htu.j);
        this.t = hugVar.b(htu.n);
        this.r = hugVar.b(htu.l);
        this.s = hugVar.b(htu.m);
        this.u = ldaVar6;
        this.v = ldaVar7;
        this.w = ldaVar8;
        this.x = ldaVar9;
        this.y = ldaVar10;
        this.z = ldaVar11;
        this.A = ldaVar12;
        this.B = ldaVar13;
        this.C = ldaVar14;
        this.D = hugVar.b(htu.aa);
        this.E = ldaVar15;
        this.G = ldaVar17;
        this.F = hugVar.b(htu.d);
        this.H = ldaVar19;
        this.N = hugVar.b(htu.W);
        this.bf = ojcVar3;
        this.O = imfVar;
        this.P = dqaVar;
        this.Q = gspVar.b(false);
        this.R = gspVar.b(ddfVar.k(ddl.aP));
        this.S = gspVar.b;
        this.T = gspVar.c;
        this.U = gspVar.d;
        this.V = gspVar.e;
        this.W = gspVar.g;
        this.X = gspVar.h;
        this.Y = gspVar.f;
        this.K = huqVar;
        this.L = hurVar;
        this.M = huoVar;
        this.ak = gspVar.a(false, "");
        this.Z = gspVar.i;
        this.aa = gspVar.j;
        this.ab = gspVar.k;
        this.ac = gspVar.m;
        this.ad = gspVar.l;
        this.ae = gspVar.n;
        this.as = gspVar.s;
        this.ag = gspVar.p;
        this.af = gspVar.o;
        this.ah = gspVar.q;
        this.ai = gspVar.r;
        this.al = ldaVar3;
        this.bk = z;
        this.bl = z2;
        this.bm = z3;
        this.an = hufVar.a(htu.o);
        this.am = ddfVar.k(ddm.ao) ? hufVar.a(htu.p) : lcv.g(false);
        this.ao = hufVar.a(htu.ab);
        this.aX = fjsVar;
        this.f = dmhVar;
        this.g = kasVar;
        this.I = ldaVar18;
        this.h = jdkVar;
        this.bs = lqvVar;
        this.i = hubVar;
        this.j = hujVar;
        this.k = z4;
        this.aY = elwVar;
        this.aZ = ldaVar20;
        this.bc = doqVar;
        this.bb = ojcVar;
        this.bd = ojcVar2;
        this.be = pynVar;
        this.bg = iudVar;
        this.bh = gspVar.t;
        this.bi = oob.a((Map) DesugarArrays.stream(gtv.values()).collect(Collectors.toMap(cgw.q, cgw.r)));
    }

    static boolean A(jrl jrlVar, boolean z) {
        return jrlVar == jrl.PHOTO && z;
    }

    private final void K(olt oltVar, lda ldaVar, final gtk gtkVar, boolean z) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        gtl gtlVar;
        if (z) {
            gtv gtvVarB = b(oltVar, ldaVar, gtv.UNKNOWN);
            if (gtvVarB == gtv.UNKNOWN) {
                ((oug) ((oug) a.c()).G((char) 2124)).r("Property value %s is not associated with a MenuOption.", ldaVar.fA());
                return;
            }
            obr.aT(gtvVarB != null, "Property value %s is not associated with a MenuOption.", gtvVarB);
            OptionsMenuContainer optionsMenuContainer = this.aV;
            ddf ddfVar = this.e;
            final OptionsMenuView optionsMenuViewN = optionsMenuContainer.n();
            synchronized (optionsMenuViewN) {
                final guq guqVar = new guq(optionsMenuViewN.getContext(), gtkVar, gtvVarB == gtv.AF_ON_LOCKED ? gtv.AF_ON : gtvVarB, new gtw() { // from class: gus
                    @Override // defpackage.gtw
                    public final void gh(gtv gtvVar) {
                        OptionsMenuView optionsMenuView = optionsMenuViewN;
                        gtk gtkVar2 = gtkVar;
                        gtw gtwVar = (gtw) optionsMenuView.c.get(gtkVar2);
                        if (gtwVar != null) {
                            gtm gtmVar = gtkVar2.a;
                            gtwVar.gh(gtvVar);
                        }
                        gtw gtwVar2 = optionsMenuView.k;
                        if (gtwVar2 != null) {
                            gtm gtmVar2 = gtkVar2.a;
                            ((gtg) gtwVar2).v();
                        }
                    }
                }, (gtp) optionsMenuViewN.d.get(gtkVar), (gtb) optionsMenuViewN.e.get(gtkVar), ddfVar);
                if (guqVar.l) {
                    int[][] iArr = {new int[]{R.attr.state_selected}, new int[0]};
                    colorStateList = new ColorStateList(iArr, new int[]{mip.dR(guqVar), mip.dT(guqVar)});
                    colorStateList2 = new ColorStateList(iArr, new int[]{mip.dN(guqVar), mip.dO(guqVar)});
                } else {
                    colorStateList = new ColorStateList(new int[][]{new int[0]}, new int[]{0});
                    colorStateList2 = colorStateList;
                }
                Typeface typefaceCreate = Typeface.create("google-sans-medium", 0);
                Typeface typefaceCreate2 = Typeface.create("google-sans-medium", 0);
                for (int size = guqVar.k.d.size() - 1; size >= 0; size--) {
                    ImageButton imageButton = new ImageButton(guqVar.m);
                    FrameLayout frameLayout = new FrameLayout(guqVar.m);
                    frameLayout.addView(imageButton, new af(-1, -1));
                    frameLayout.setId(View.generateViewId());
                    guqVar.d.add(frameLayout);
                }
                ah ahVar = new ah();
                ahVar.d(guqVar);
                guqVar.g.setText(guqVar.k.b);
                guqVar.g.setContentDescription(guqVar.getResources().getString(guqVar.k.c));
                if (guqVar.l) {
                    guqVar.g.setTextAppearance(mip.dV(guqVar.getContext(), com.google.android.GoogleCameraEngR18F1.R.attr.textAppearanceCaption));
                    guqVar.g.setTextColor(obr.e(guqVar, com.google.android.GoogleCameraEngR18F1.R.attr.colorOnBackground));
                } else {
                    guqVar.g.setTypeface(typefaceCreate);
                    guqVar.g.setTextSize(2, 12.0f);
                    guqVar.g.setTextColor(guqVar.getResources().getColor(com.google.android.GoogleCameraEngR18F1.R.color.options_menu_text_color, null));
                }
                guqVar.g.setTextDirection(5);
                ahVar.e(guqVar.g.getId(), 6, 0, 6, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_label_margin_left));
                ahVar.e(guqVar.g.getId(), 3, 0, 3, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_label_margin_top));
                if (guqVar.k.d.size() < 5) {
                    ahVar.e(guqVar.g.getId(), 7, ((FrameLayout) guqVar.d.get(0)).getId(), 6, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_left));
                    ahVar.e(guqVar.i.getId(), 7, ((FrameLayout) guqVar.d.get(0)).getId(), 6, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_left));
                } else {
                    ahVar.e(guqVar.g.getId(), 7, ((FrameLayout) guqVar.d.get(guqVar.k.d.size() - 3)).getId(), 6, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_left));
                }
                ahVar.f(guqVar.g.getId(), -2);
                ahVar.g(guqVar.g.getId(), 0);
                guqVar.addView(guqVar.g);
                oom oomVar = guqVar.k.d;
                int size2 = oomVar.size();
                int i = 0;
                do {
                    if (i >= size2) {
                        gtlVar = null;
                        break;
                    } else {
                        gtlVar = (gtl) oomVar.get(i);
                        i++;
                    }
                } while (gtlVar.a != guqVar.n);
                if (gtlVar != null) {
                    guqVar.h.setText(gtlVar.b(guqVar.getResources()));
                    guqVar.h.setContentDescription(gtlVar.a(guqVar.getResources()));
                }
                if (guqVar.l) {
                    guqVar.h.setTextAppearance(mip.dV(guqVar.getContext(), com.google.android.GoogleCameraEngR18F1.R.attr.textAppearanceSubhead1));
                    guqVar.h.setTextColor(mip.dQ(guqVar));
                } else {
                    guqVar.h.setTypeface(typefaceCreate2);
                    guqVar.h.setTextSize(2, 16.0f);
                    guqVar.h.setTextColor(guqVar.getResources().getColor(com.google.android.GoogleCameraEngR18F1.R.color.options_menu_value_color, null));
                }
                guqVar.h.setTextDirection(5);
                guqVar.i.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                guqVar.i.addView(guqVar.h, layoutParams);
                if (guqVar.p != null) {
                    Drawable drawable = guqVar.m.getDrawable(com.google.android.GoogleCameraEngR18F1.R.drawable.help_outline);
                    if (guqVar.l && drawable != null) {
                        drawable.setTint(mip.dQ(guqVar));
                    }
                    guqVar.j.setImageDrawable(drawable);
                    guqVar.j.setBackgroundColor(0);
                    guqVar.j.setPadding(guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.help_outline_padding_left), 0, 0, 0);
                    guqVar.i.addView(guqVar.j, layoutParams);
                    final gtp gtpVar = guqVar.p;
                    guqVar.i.setOnClickListener(new View.OnClickListener() { // from class: gup
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            guq guqVar2 = guqVar;
                            gtpVar.a(guqVar2.n, guqVar2.isEnabled());
                        }
                    });
                }
                ahVar.f(guqVar.i.getId(), -2);
                ahVar.g(guqVar.i.getId(), 0);
                ahVar.e(guqVar.i.getId(), 6, 0, 6, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_label_margin_left));
                ahVar.a(guqVar.i.getId()).D = guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_label_margin_top);
                ahVar.e(guqVar.i.getId(), 3, guqVar.g.getId(), 4, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_label_margin_bottom));
                guqVar.addView(guqVar.i);
                int size3 = guqVar.k.d.size();
                int i2 = com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_size;
                if (size3 < 5) {
                    for (int size4 = guqVar.k.d.size() - 1; size4 >= 0; size4--) {
                        FrameLayout frameLayout2 = (FrameLayout) guqVar.d.get(size4);
                        ImageButton imageButton2 = (ImageButton) frameLayout2.getChildAt(0);
                        final gtl gtlVar2 = (gtl) guqVar.k.d.get(size4);
                        guqVar.e.put(gtlVar2.a, imageButton2);
                        guqVar.f.put(imageButton2, gtlVar2);
                        imageButton2.setContentDescription(gtlVar2.a(guqVar.getResources()));
                        final int i3 = 1;
                        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: guo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i3) {
                                    case 0:
                                        guq guqVar2 = guqVar;
                                        gtl gtlVar3 = gtlVar2;
                                        gtb gtbVar = guqVar2.q;
                                        if (gtbVar != null) {
                                            if (gtbVar.a(guqVar2.n == gtlVar3.a)) {
                                            }
                                        }
                                        guqVar2.d(gtlVar3.a);
                                        gtw gtwVar = guqVar2.o;
                                        if (gtwVar != null) {
                                            gtv gtvVar = gtlVar3.a;
                                            gtm gtmVar = guqVar2.k.a;
                                            gtwVar.gh(gtvVar);
                                        }
                                        break;
                                    default:
                                        guq guqVar3 = guqVar;
                                        gtl gtlVar4 = gtlVar2;
                                        gtb gtbVar2 = guqVar3.q;
                                        if (gtbVar2 != null) {
                                            if (gtbVar2.a(guqVar3.n == gtlVar4.a)) {
                                            }
                                        }
                                        guqVar3.d(gtlVar4.a);
                                        gtw gtwVar2 = guqVar3.o;
                                        if (gtwVar2 != null) {
                                            gtv gtvVar2 = gtlVar4.a;
                                            gtm gtmVar2 = guqVar3.k.a;
                                            gtwVar2.gh(gtvVar2);
                                        }
                                        break;
                                }
                            }
                        });
                        ahVar.f(frameLayout2.getId(), guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_size));
                        ahVar.g(frameLayout2.getId(), guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_size));
                        imageButton2.setImageDrawable(guqVar.m.getDrawable(gtlVar2.b));
                        imageButton2.getDrawable().setAutoMirrored(false);
                        if (guqVar.l) {
                            imageButton2.setBackgroundResource(com.google.android.GoogleCameraEngR18F1.R.drawable.value_icon_background);
                            imageButton2.setBackgroundTintList(colorStateList);
                            imageButton2.setImageTintList(colorStateList2);
                        }
                        if (gtlVar2.a == guqVar.n) {
                            guqVar.e(imageButton2);
                        } else {
                            guqVar.f(imageButton2);
                        }
                        if (size4 == guqVar.k.d.size() - 1) {
                            ahVar.e(frameLayout2.getId(), 7, 0, 7, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_right));
                        }
                        int i4 = size4 + 1;
                        if (i4 < guqVar.k.d.size()) {
                            ahVar.e(frameLayout2.getId(), 7, ((FrameLayout) guqVar.d.get(i4)).getId(), 6, 0);
                        }
                        ahVar.e(frameLayout2.getId(), 4, 0, 4, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_top));
                        ahVar.e(frameLayout2.getId(), 3, 0, 3, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_top));
                        guqVar.addView(frameLayout2);
                    }
                } else {
                    obr.aF(guqVar.k.d.size() <= 6);
                    int size5 = guqVar.k.d.size() - 1;
                    while (size5 >= 0) {
                        FrameLayout frameLayout3 = (FrameLayout) guqVar.d.get(size5);
                        ImageButton imageButton3 = (ImageButton) frameLayout3.getChildAt(0);
                        final gtl gtlVar3 = (gtl) guqVar.k.d.get(size5);
                        guqVar.e.put(gtlVar3.a, imageButton3);
                        guqVar.f.put(imageButton3, gtlVar3);
                        imageButton3.setContentDescription(gtlVar3.a(guqVar.getResources()));
                        final int i5 = 0;
                        imageButton3.setOnClickListener(new View.OnClickListener() { // from class: guo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i5) {
                                    case 0:
                                        guq guqVar2 = guqVar;
                                        gtl gtlVar4 = gtlVar3;
                                        gtb gtbVar = guqVar2.q;
                                        if (gtbVar != null) {
                                            if (gtbVar.a(guqVar2.n == gtlVar4.a)) {
                                            }
                                        }
                                        guqVar2.d(gtlVar4.a);
                                        gtw gtwVar = guqVar2.o;
                                        if (gtwVar != null) {
                                            gtv gtvVar = gtlVar4.a;
                                            gtm gtmVar = guqVar2.k.a;
                                            gtwVar.gh(gtvVar);
                                        }
                                        break;
                                    default:
                                        guq guqVar3 = guqVar;
                                        gtl gtlVar5 = gtlVar3;
                                        gtb gtbVar2 = guqVar3.q;
                                        if (gtbVar2 != null) {
                                            if (gtbVar2.a(guqVar3.n == gtlVar5.a)) {
                                            }
                                        }
                                        guqVar3.d(gtlVar5.a);
                                        gtw gtwVar2 = guqVar3.o;
                                        if (gtwVar2 != null) {
                                            gtv gtvVar2 = gtlVar5.a;
                                            gtm gtmVar2 = guqVar3.k.a;
                                            gtwVar2.gh(gtvVar2);
                                        }
                                        break;
                                }
                            }
                        });
                        ahVar.f(frameLayout3.getId(), guqVar.getResources().getDimensionPixelSize(i2));
                        ahVar.g(frameLayout3.getId(), guqVar.getResources().getDimensionPixelSize(i2));
                        imageButton3.setImageResource(gtlVar3.b);
                        imageButton3.getDrawable().setAutoMirrored(false);
                        if (guqVar.l) {
                            imageButton3.setBackgroundResource(com.google.android.GoogleCameraEngR18F1.R.drawable.value_icon_background);
                            imageButton3.setBackgroundTintList(colorStateList);
                            imageButton3.setImageTintList(colorStateList2);
                        }
                        if (gtlVar3.a == guqVar.n) {
                            guqVar.e(imageButton3);
                        } else {
                            guqVar.f(imageButton3);
                        }
                        if (size5 == guqVar.k.d.size() - 1 || size5 == guqVar.k.d.size() - 4) {
                            ahVar.e(frameLayout3.getId(), 7, 0, 7, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_right));
                        } else {
                            int i6 = size5 + 1;
                            if (i6 < guqVar.k.d.size()) {
                                ahVar.e(frameLayout3.getId(), 7, ((FrameLayout) guqVar.d.get(i6)).getId(), 6, 0);
                            }
                        }
                        if (size5 >= guqVar.k.d.size() - 3) {
                            ahVar.e(frameLayout3.getId(), 3, 0, 3, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_top));
                        } else {
                            ahVar.e(frameLayout3.getId(), 4, 0, 4, guqVar.getResources().getDimensionPixelSize(com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_margin_top));
                            ahVar.e(frameLayout3.getId(), 3, ((FrameLayout) guqVar.d.get(size5 + 3)).getId(), 4, 0);
                        }
                        guqVar.addView(frameLayout3);
                        size5--;
                        i2 = com.google.android.GoogleCameraEngR18F1.R.dimen.options_menu_button_size;
                    }
                }
                ahVar.b(guqVar);
                LinearLayout linearLayout = optionsMenuViewN.l;
                if (linearLayout != null) {
                    linearLayout.addView(guqVar);
                    if (gtkVar.a == gtm.ASPECT_RATIO) {
                        optionsMenuViewN.j = guqVar;
                    }
                }
                optionsMenuViewN.f.put(gtkVar.a, guqVar);
            }
            if (optionsMenuContainer.g || !gtm.MICROVIDEO.equals(gtkVar.a)) {
                return;
            }
            if (gtv.MICROVIDEO_ON.equals(gtvVarB) || gtv.MICROVIDEO_AUTO.equals(gtvVarB)) {
                optionsMenuContainer.x(optionsMenuContainer.g());
            }
        }
    }

    private final void L() {
        this.aV.u();
        if (this.bf.g()) {
            ((gts) this.bf.c()).k();
        }
        obr.ap(G());
    }

    private final boolean M() {
        jrl jrlVar = (jrl) this.b.fA();
        if (this.bn) {
            return jrlVar == jrl.PHOTO || jrlVar == jrl.IMAGE_INTENT || jrlVar == jrl.PORTRAIT;
        }
        return false;
    }

    private final boolean N() {
        jrl jrlVar = (jrl) this.b.fA();
        if (!this.bn) {
            return false;
        }
        if (jrlVar == jrl.VIDEO || jrlVar == jrl.VIDEO_INTENT || jrlVar == jrl.SLOW_MOTION) {
            return true;
        }
        return jrlVar == jrl.LONG_EXPOSURE && this.ar;
    }

    private final boolean O() {
        jsh jshVar = this.aV.c;
        int i = jshVar.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return jshVar.a.getVisibility() == 0;
            default:
                throw new IllegalStateException("Should never be here");
        }
    }

    public static gtv b(olt oltVar, lda ldaVar, gtv gtvVar) {
        gtv gtvVar2 = (gtv) oltVar.e().get(ldaVar.fA());
        if (gtvVar2 != null) {
            return gtvVar2;
        }
        ((oug) ((oug) a.c()).G(2122)).A("Tried to get MenuOption for property %s with value %s but value wasn't found in map. Returning default instead: %s", ldaVar, ldaVar.fA(), gtvVar);
        return gtvVar;
    }

    public final boolean B() {
        return ("on".equals(((lce) this.p).d) && M() && this.aT.i(gtm.BACK_PHOTO_FLASH)) || ("torch".equals(((lce) this.r).d) && N() && this.aT.i(gtm.BACK_VIDEO_FLASH));
    }

    @Override // defpackage.gtn
    public final boolean C() {
        return jrl.VIDEO.equals(this.b.fA()) && this.at;
    }

    @Override // defpackage.gtt
    public final boolean D() {
        return this.aV.n().a() > 0;
    }

    public final boolean E() {
        return this.bf.g();
    }

    @Override // defpackage.gtt
    public final boolean F() {
        return this.aV.A();
    }

    @Override // defpackage.gtt
    public final boolean G() {
        return this.aV.isEnabled();
    }

    @Override // defpackage.gtt
    public final boolean H() {
        jrl jrlVar = (jrl) this.b.fA();
        return (jrlVar == jrl.VIDEO && !this.au) || jrlVar == jrl.SLOW_MOTION || jrlVar == jrl.VIDEO_INTENT;
    }

    public final void I(final int i, lwd lwdVar, String str) {
        lig ligVar;
        String strSwitchToPicturesize;
        lwdVar.getClass();
        lvs lvsVarE = this.bs.a.e(lwdVar);
        if (lvsVarE == null) {
            ((oug) ((oug) a.b()).G((char) 2131)).r("Unable to fetch camera ID for facing value: %s", lwdVar);
            return;
        }
        Collection collectionP = ohh.P(fvq.A(lvsVarE, this.bs.a, this.e).x(256), new ojf() { // from class: gsx
            @Override // defpackage.ojf
            public final boolean a(Object obj) {
                lhs lhsVar;
                int i2 = i;
                lig ligVar2 = (lig) obj;
                ligVar2.getClass();
                lhs lhsVarH = lhs.h(ligVar2);
                hte hteVar = hte.ON;
                leb lebVar = leb.RES_UNKNOWN;
                switch (i2 - 1) {
                    case 0:
                        lhsVar = lhs.b;
                        break;
                    case 1:
                        lhsVar = lhs.a;
                        break;
                    default:
                        lhsVar = lhs.c;
                        break;
                }
                return lhsVarH.k(lhsVar);
            }
        });
        obr.aQ(!collectionP.isEmpty());
        ArrayList arrayList = new ArrayList(collectionP);
        List$CC.$default$sort(arrayList, Collections.reverseOrder(yc.b));
        if (!str.equals("full")) {
            if (!str.equals("medium")) {
                ((oug) ((oug) a.c()).G((char) 2123)).o("Invalid resolution setting, using default.");
                ligVar = (lig) arrayList.get(0);
                break;
            }
            if (arrayList.size() > 1) {
                arrayList.remove(0);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((oug) ((oug) a.c()).G((char) 2123)).o("Invalid resolution setting, using default.");
                    ligVar = (lig) arrayList.get(0);
                    break;
                } else {
                    lig ligVar2 = (lig) it.next();
                    if (ligVar2.b() < 5242880) {
                        ligVar = ligVar2;
                        break;
                    }
                }
            }
        } else {
            ligVar = (lig) arrayList.get(0);
        }
        htl htlVar = htl.RES_1080P;
        htg htgVar = htg.FPS_AUTO;
        switch (lwdVar) {
            case FRONT:
                strSwitchToPicturesize = "pref_camera_picturesize_front_key";
                break;
            case BACK:
                strSwitchToPicturesize = AuxButtonsLayout.switchToPicturesize();
                break;
            default:
                ((oug) ((oug) a.c()).G((char) 2130)).r("Unsupported facing value: %s", lwdVar);
                return;
        }
        this.i.k(strSwitchToPicturesize, mip.bt(ligVar));
    }

    public final void J(ghx ghxVar) {
        boolean z = false;
        this.ar = ghxVar.k() == lwd.FRONT;
        if (ghxVar.I() || this.ar) {
            z = true;
        }
        this.bn = z;
        this.bo = ghxVar.E();
        p(true);
    }

    @Override // defpackage.cwh
    public final pht a(lwd lwdVar) {
        l();
        return phq.a;
    }

    @Override // defpackage.gtn
    public final htg c() {
        lwd lwdVar = lwd.FRONT;
        htl htlVar = htl.RES_1080P;
        htg htgVar = htg.FPS_AUTO;
        switch (((htg) this.J.fA()).ordinal()) {
            case 1:
                return htg.FPS_24;
            case 2:
                return htg.FPS_30;
            case 3:
                return htg.FPS_60;
            default:
                return htg.FPS_AUTO;
        }
    }

    public final String d() {
        String strA = "";
        if (((hth) this.u.fA()).equals(hth.EXT_BLUETOOTH)) {
            oom oomVar = this.ak.d;
            int size = oomVar.size();
            for (int i = 0; i < size; i++) {
                gtl gtlVar = (gtl) oomVar.get(i);
                if (gtlVar.a.equals(gtv.MIC_INPUT_EXT_BLUETOOTH)) {
                    strA = gtlVar.a(this.aV.getResources());
                }
            }
        }
        return strA;
    }

    public final List e(List list) {
        ArrayList arrayList = new ArrayList();
        orq orqVar = ((orq) this.aE).c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            htg htgVar = (htg) it.next();
            if (orqVar.containsKey(htgVar)) {
                arrayList.add((gtv) orqVar.get(htgVar));
            }
        }
        return arrayList;
    }

    @Override // defpackage.gtt
    public final void f(gtu gtuVar) {
        this.aV.p(gtuVar);
    }

    @Override // defpackage.gtt
    public final void g() {
        if (this.aV.A()) {
            this.aV.s();
        }
    }

    @Override // defpackage.gtw
    public final void gh(gtv gtvVar) {
        v();
    }

    public final void h() {
        this.aV.t();
        if (this.bf.g()) {
            ((gts) this.bf.c()).k();
        }
        obr.ap(!G());
    }

    @Deprecated
    public final void i() {
        if (G()) {
            return;
        }
        L();
    }

    public final void j() {
        if (!O()) {
            this.aV.c.c();
            this.h.b();
        }
        L();
    }

    @Override // defpackage.jrt
    public final void k(jrz jrzVar) {
        if (this.bf.g()) {
            LinearMinibarImpl linearMinibarImpl = ((gts) this.bf.c()).b;
            for (int i = 0; i < linearMinibarImpl.getChildCount(); i++) {
                View childAt = linearMinibarImpl.getChildAt(i);
                if (childAt != linearMinibarImpl.a() && childAt != linearMinibarImpl.b()) {
                    mip.et(childAt, jrzVar);
                }
            }
        }
    }

    public final void l() {
        h();
        if (O()) {
            OptionsMenuContainer optionsMenuContainer = this.aV;
            optionsMenuContainer.c.d();
            ArrayList arrayList = optionsMenuContainer.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gtu) arrayList.get(i)).b();
            }
            this.h.e();
        }
    }

    public final void m(final lda ldaVar, final olt oltVar, final gtk gtkVar) {
        gtw gtwVar = (gtw) this.aT.c.get(gtkVar);
        OptionsMenuView optionsMenuView = this.aT;
        optionsMenuView.c.put(gtkVar, new gtw() { // from class: gtc
            @Override // defpackage.gtw
            public final void gh(gtv gtvVar) {
                gtg gtgVar = this.a;
                olt oltVar2 = oltVar;
                lda ldaVar2 = ldaVar;
                gtk gtkVar2 = gtkVar;
                Object obj = oltVar2.get(gtvVar);
                if (obj == null || obj.equals(ldaVar2.fA())) {
                    return;
                }
                ldaVar2.fB(obj);
                fjs fjsVar = gtgVar.aX;
                if (fjsVar != null) {
                    fjsVar.v(gtvVar);
                }
                if (gtkVar2.a == gtm.MICROVIDEO && gtgVar.j.a("micro_tutorial_dismiss") == 0 && !gtgVar.k && !gtgVar.e.k(ddl.aL)) {
                    if (gtgVar.e.k(ddr.p)) {
                        ((fvn) ((ojj) gtgVar.bd).a).a();
                    } else {
                        final OptionsMenuContainer optionsMenuContainer = gtgVar.aV;
                        final elw elwVar = gtgVar.aY;
                        lar.a();
                        elwVar.i();
                        final int i = 0;
                        AlertDialog.Builder onDismissListener = new AlertDialog.Builder(optionsMenuContainer.k, com.google.android.GoogleCameraEngR18F1.R.style.DialogTutorialStyle).setTitle(optionsMenuContainer.getResources().getString(com.google.android.GoogleCameraEngR18F1.R.string.micro_tutorial_title)).setMessage(optionsMenuContainer.getResources().getString(com.google.android.GoogleCameraEngR18F1.R.string.micro_tutorial_text)).setCancelable(false).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: gub
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                OptionsMenuContainer optionsMenuContainer2 = optionsMenuContainer;
                                elwVar.n();
                                if (dialogInterface == optionsMenuContainer2.m) {
                                    optionsMenuContainer2.m = null;
                                }
                            }
                        });
                        final int i2 = 1;
                        onDismissListener.setNegativeButton(optionsMenuContainer.getResources().getString(com.google.android.GoogleCameraEngR18F1.R.string.infopane_learn_more), new DialogInterface.OnClickListener() { // from class: gua
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                switch (i2) {
                                    case 0:
                                        OptionsMenuContainer optionsMenuContainer2 = optionsMenuContainer;
                                        optionsMenuContainer2.w();
                                        huj hujVar = optionsMenuContainer2.t;
                                        if (hujVar != null) {
                                            hujVar.b("micro_tutorial_dismiss");
                                        }
                                        break;
                                    default:
                                        OptionsMenuContainer optionsMenuContainer3 = optionsMenuContainer;
                                        optionsMenuContainer3.k.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googlecamera?p=motion_toast")));
                                        break;
                                }
                            }
                        });
                        onDismissListener.setPositiveButton(optionsMenuContainer.getResources().getString(com.google.android.GoogleCameraEngR18F1.R.string.infopane_got_it), new DialogInterface.OnClickListener() { // from class: gua
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                switch (i) {
                                    case 0:
                                        OptionsMenuContainer optionsMenuContainer2 = optionsMenuContainer;
                                        optionsMenuContainer2.w();
                                        huj hujVar = optionsMenuContainer2.t;
                                        if (hujVar != null) {
                                            hujVar.b("micro_tutorial_dismiss");
                                        }
                                        break;
                                    default:
                                        OptionsMenuContainer optionsMenuContainer3 = optionsMenuContainer;
                                        optionsMenuContainer3.k.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googlecamera?p=motion_toast")));
                                        break;
                                }
                            }
                        });
                        optionsMenuContainer.m = onDismissListener.show();
                        optionsMenuContainer.m.setCanceledOnTouchOutside(true);
                        optionsMenuContainer.s();
                    }
                }
                if (gtkVar2.a == gtm.MICROPHONE && obj.equals(hth.EXT_BLUETOOTH)) {
                    gtgVar.aT.c(gtm.MICROPHONE, gtgVar.aV.getResources().getString(com.google.android.GoogleCameraEngR18F1.R.string.mic_input_ext_bluetooth_connecting));
                }
            }
        });
        if (gtwVar != null) {
            return;
        }
        this.bj.c(ldaVar.a(new lij() { // from class: gsw
            @Override // defpackage.lij
            public final void fB(Object obj) {
                VectorDrawable vectorDrawable;
                gtg gtgVar = this.a;
                olt oltVar2 = oltVar;
                lda ldaVar2 = ldaVar;
                gtk gtkVar2 = gtkVar;
                gtv gtvVarB = gtg.b(oltVar2, ldaVar2, gtv.UNKNOWN);
                if (gtvVarB == gtv.AF_ON_LOCKED) {
                    gtvVarB = gtv.AF_ON;
                }
                if (gtvVarB == gtv.UNKNOWN) {
                    ((oug) ((oug) gtg.a.c()).G((char) 2126)).r("Property value %s is not associated with a MenuOption.", obj);
                    return;
                }
                guq guqVar = (guq) gtgVar.aT.f.get(gtkVar2.a);
                if (gtvVarB.equals(guqVar == null ? null : guqVar.n) || gtkVar2 == null) {
                    return;
                }
                OptionsMenuContainer optionsMenuContainer = gtgVar.aV;
                synchronized (optionsMenuContainer) {
                    OptionsMenuView optionsMenuViewN = optionsMenuContainer.n();
                    if (gtvVarB == null) {
                        ((oug) ((oug) OptionsMenuView.a.b()).G(2154)).y("Attempted to set invalid value. %s is not a valid option for category: %s", null, gtkVar2.a);
                    } else {
                        synchronized (optionsMenuViewN) {
                            guq guqVar2 = (guq) optionsMenuViewN.f.get(gtkVar2.a);
                            if (guqVar2 != null) {
                                guqVar2.d(gtvVarB);
                            }
                        }
                    }
                    if (!optionsMenuContainer.g && gtm.MICROVIDEO.equals(gtkVar2.a)) {
                        if (gtv.MICROVIDEO_ON.equals(gtvVarB) || gtv.MICROVIDEO_AUTO.equals(gtvVarB)) {
                            optionsMenuContainer.x(optionsMenuContainer.g());
                            if (optionsMenuContainer.s && (vectorDrawable = optionsMenuContainer.r) != null) {
                                vectorDrawable.setAlpha(255);
                            }
                        } else {
                            optionsMenuContainer.r();
                        }
                    }
                }
            }
        }, this.c));
        if (this.be != null && this.bq.contains(gtkVar.a)) {
            OptionsMenuView optionsMenuView2 = this.aT;
            optionsMenuView2.e.put(gtkVar, new gtb(this));
        }
        if (gtkVar.a == gtm.BEAUTIFICATION && this.e.k(dda.f) && this.bc != null) {
            final int i = 1;
            this.aT.g(gtkVar, new gtp(this) { // from class: gta
                public final /* synthetic */ gtg a;

                {
                    this.a = this;
                }

                @Override // defpackage.gtp
                public final void a(gtv gtvVar, boolean z) {
                    switch (i) {
                        case 0:
                            ((fli) this.a.bb.c()).a();
                            break;
                        case 1:
                            this.a.bc.a(gtvVar);
                            break;
                        default:
                            Object obj = ((ojj) this.a.bd).a;
                            if (!z) {
                                fvn fvnVar = (fvn) obj;
                                lar.a();
                                if (fvnVar.d == null) {
                                    FrameLayout frameLayout = new FrameLayout(fvnVar.b);
                                    View.inflate(fvnVar.b, true != fvnVar.c.k(ddl.ay) ? com.google.android.GoogleCameraEngR18F1.R.layout.motionphoto_disabled_sheet_legacy : com.google.android.GoogleCameraEngR18F1.R.layout.motionphoto_disabled_sheet, frameLayout);
                                    ((Button) frameLayout.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.what_is_button)).setOnClickListener(new fvm(fvnVar, 1));
                                    fvnVar.d = frameLayout;
                                }
                                fvnVar.a.f(7, com.google.android.GoogleCameraEngR18F1.R.string.motion_photos_not_available_title, fvnVar.d);
                            } else {
                                ((fvn) obj).a();
                            }
                            break;
                    }
                }
            });
        }
        if (gtkVar.a == gtm.ASTRO && this.bb.g()) {
            final int i2 = 0;
            this.aT.g(gtkVar, new gtp(this) { // from class: gta
                public final /* synthetic */ gtg a;

                {
                    this.a = this;
                }

                @Override // defpackage.gtp
                public final void a(gtv gtvVar, boolean z) {
                    switch (i2) {
                        case 0:
                            ((fli) this.a.bb.c()).a();
                            break;
                        case 1:
                            this.a.bc.a(gtvVar);
                            break;
                        default:
                            Object obj = ((ojj) this.a.bd).a;
                            if (!z) {
                                fvn fvnVar = (fvn) obj;
                                lar.a();
                                if (fvnVar.d == null) {
                                    FrameLayout frameLayout = new FrameLayout(fvnVar.b);
                                    View.inflate(fvnVar.b, true != fvnVar.c.k(ddl.ay) ? com.google.android.GoogleCameraEngR18F1.R.layout.motionphoto_disabled_sheet_legacy : com.google.android.GoogleCameraEngR18F1.R.layout.motionphoto_disabled_sheet, frameLayout);
                                    ((Button) frameLayout.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.what_is_button)).setOnClickListener(new fvm(fvnVar, 1));
                                    fvnVar.d = frameLayout;
                                }
                                fvnVar.a.f(7, com.google.android.GoogleCameraEngR18F1.R.string.motion_photos_not_available_title, fvnVar.d);
                            } else {
                                ((fvn) obj).a();
                            }
                            break;
                    }
                }
            });
        }
        if (gtkVar.a == gtm.MICROVIDEO && this.e.k(ddr.p)) {
            final int i3 = 2;
            this.aT.g(gtkVar, new gtp(this) { // from class: gta
                public final /* synthetic */ gtg a;

                {
                    this.a = this;
                }

                @Override // defpackage.gtp
                public final void a(gtv gtvVar, boolean z) {
                    switch (i3) {
                        case 0:
                            ((fli) this.a.bb.c()).a();
                            break;
                        case 1:
                            this.a.bc.a(gtvVar);
                            break;
                        default:
                            Object obj = ((ojj) this.a.bd).a;
                            if (!z) {
                                fvn fvnVar = (fvn) obj;
                                lar.a();
                                if (fvnVar.d == null) {
                                    FrameLayout frameLayout = new FrameLayout(fvnVar.b);
                                    View.inflate(fvnVar.b, true != fvnVar.c.k(ddl.ay) ? com.google.android.GoogleCameraEngR18F1.R.layout.motionphoto_disabled_sheet_legacy : com.google.android.GoogleCameraEngR18F1.R.layout.motionphoto_disabled_sheet, frameLayout);
                                    ((Button) frameLayout.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.what_is_button)).setOnClickListener(new fvm(fvnVar, 1));
                                    fvnVar.d = frameLayout;
                                }
                                fvnVar.a.f(7, com.google.android.GoogleCameraEngR18F1.R.string.motion_photos_not_available_title, fvnVar.d);
                            } else {
                                ((fvn) obj).a();
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // defpackage.gtt
    public final void n() {
        if (!this.aV.A() && this.aV.isEnabled() && D()) {
            this.aV.w();
        }
    }

    public final void o(gtu gtuVar) {
        this.aV.l.remove(gtuVar);
    }

    public final void p(final boolean z) {
        if (this.br.compareAndSet(false, true)) {
            this.c.execute(new Runnable() { // from class: gsz
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.x(z);
                }
            });
        }
    }

    public final void q(boolean z) {
        if (this.bf.g()) {
            gts gtsVar = (gts) this.bf.c();
            if (z) {
                gtsVar.b.n(false);
                gtsVar.b.h(true);
            } else {
                gtsVar.b.h(false);
                gtsVar.g();
            }
        }
    }

    public final void r() {
        if (this.ba.c() && this.b.fA() == jrl.IMAGE_INTENT) {
            this.aT.d(gtm.BACK_PHOTO_FLASH, gtv.PHOTO_FLASH_NS);
            this.aT.d(gtm.FRONT_PHOTO_FLASH, gtv.PHOTO_FLASH_NS);
        }
    }

    public final void s(boolean z) {
        if (this.bp != z) {
            this.bp = z;
            w();
        }
    }

    public final void t() {
        gtk gtkVar = this.aj;
        if (gtkVar != null) {
            this.aT.f(gtkVar.a, true);
            oom oomVar = this.aj.d;
            int size = oomVar.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                gtv gtvVar = ((gtl) oomVar.get(i2)).a;
                if (!this.az.contains(gtvVar)) {
                    this.aT.d(this.aj.a, gtvVar);
                }
            }
            if (this.e.k(dcu.E) && this.aj.a == gtm.FPS_4K) {
                gtk gtkVar2 = this.aj;
                gtv gtvVar2 = gtv.FPS_60;
                oom oomVar2 = gtkVar2.d;
                int size2 = oomVar2.size();
                while (i < size2) {
                    int i3 = i + 1;
                    if (((gtl) oomVar2.get(i)).a.equals(gtvVar2)) {
                        if (((Float) this.I.fA()).floatValue() < 1.0f) {
                            this.aT.d(gtm.FPS_4K, gtv.FPS_60);
                            return;
                        }
                        OptionsMenuView optionsMenuView = this.aT;
                        gtm gtmVar = gtm.FPS_4K;
                        gtv gtvVar3 = gtv.FPS_60;
                        synchronized (optionsMenuView) {
                            if (optionsMenuView.f.get(gtmVar) != null) {
                                guq guqVar = (guq) optionsMenuView.f.get(gtmVar);
                                ImageButton imageButton = (ImageButton) guqVar.e.get(gtvVar3);
                                imageButton.getClass();
                                if (imageButton != ((ImageButton) guqVar.e.get(guqVar.n))) {
                                    imageButton.setEnabled(true);
                                    imageButton.setImageAlpha(255);
                                }
                            }
                        }
                        return;
                    }
                    i = i3;
                }
            }
        }
    }

    public final void u() {
        if (this.bo && this.b.fA() == jrl.LONG_EXPOSURE) {
            if (((Float) this.I.fA()).floatValue() < 1.0f) {
                this.aT.b(gtm.AF);
            } else {
                this.aT.e(gtm.AF);
            }
        }
    }

    public final void v() {
        for (gto gtoVar : this.bh.keySet()) {
            OptionsMenuView optionsMenuView = this.aT;
            gtk gtkVar = (gtk) this.bh.get(gtoVar);
            gtkVar.getClass();
            if (optionsMenuView.h(gtkVar.a)) {
                boolean zI = this.aT.i(gtoVar.d());
                boolean zI2 = gtoVar.i(this);
                if (this.bf.g()) {
                    gtoVar.h((gts) this.bf.c(), zI2);
                }
                if (zI2 && !zI) {
                    this.aT.e(gtoVar.d());
                } else if (!zI2 && zI) {
                    this.aT.b(gtoVar.d());
                }
            } else if (this.bf.g()) {
                gtoVar.h((gts) this.bf.c(), false);
            }
        }
    }

    public final void w() {
        if (((this.ar ? ((String) ((lce) this.q).d).equals("on") : ((String) ((lce) this.p).d).equals("on")) && ((Boolean) ((lce) this.f.a()).d).booleanValue()) || gqx.ON.equals(this.m.fA()) || ((Boolean) this.H.fA()).booleanValue() || this.bp || ((Boolean) this.O.a().fA()).booleanValue() || ((Boolean) this.P.a().fA()).booleanValue()) {
            this.aT.b(gtm.MICROVIDEO);
        } else {
            this.aT.e(gtm.MICROVIDEO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void x(boolean r26) {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtg.x(boolean):void");
    }

    public final void y() {
        if (((Boolean) ((lce) this.ao).d).booleanValue() || ((Boolean) this.O.a().fA()).booleanValue()) {
            this.aT.b(gtm.RAW_OUTPUT);
        } else {
            this.aT.e(gtm.RAW_OUTPUT);
        }
    }

    public final boolean z(gtm gtmVar) {
        return this.aT.h(gtmVar);
    }
}
