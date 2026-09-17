package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.RippleDrawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;

/* JADX INFO: loaded from: classes.dex */
public final class dnw implements doq {
    public final Context a;
    public final ius b;
    public final lzi c;
    public final lda d;
    public final ddf e;
    public gtv f = gtv.BEAUTIFICATION_OFF;
    public int g = -1;
    private final lar h;

    public dnw(Context context, ius iusVar, lar larVar, lzi lziVar, lda ldaVar, ddf ddfVar) {
        this.a = context;
        this.b = iusVar;
        this.h = larVar;
        this.c = lziVar;
        this.d = ldaVar;
        this.e = ddfVar;
    }

    public static void b(FrameLayout[] frameLayoutArr, gtv gtvVar) {
        int i = 0;
        while (i < 3) {
            int i2 = 8;
            if (gtvVar == gtv.BEAUTIFICATION_OFF && i == 0) {
                i = 0;
            } else {
                if (gtvVar != gtv.BEAUTIFICATION_ON_LIGHT || i != 1) {
                    if (gtvVar == gtv.BEAUTIFICATION_ON_STRONG && i == 2) {
                        i2 = 0;
                    }
                }
                frameLayoutArr[i].setVisibility(i2);
                i++;
            }
            i2 = 0;
            frameLayoutArr[i].setVisibility(i2);
            i++;
        }
    }

    public static void c(gtv gtvVar, View view, View view2, View view3, int i, int i2) {
        view.setBackgroundResource(gtvVar == gtv.BEAUTIFICATION_OFF ? i : i2);
        view2.setBackgroundResource(gtvVar == gtv.BEAUTIFICATION_ON_LIGHT ? i : i2);
        if (gtvVar != gtv.BEAUTIFICATION_ON_STRONG) {
            i = i2;
        }
        view3.setBackgroundResource(i);
    }

    public static void d(gtv gtvVar, ImageView imageView, ImageView imageView2, ImageView imageView3, int i, int i2) {
        if (imageView == null || imageView2 == null || imageView3 == null) {
            return;
        }
        imageView.setColorFilter(gtvVar == gtv.BEAUTIFICATION_OFF ? i : i2);
        imageView2.setColorFilter(gtvVar == gtv.BEAUTIFICATION_ON_LIGHT ? i : i2);
        if (gtvVar != gtv.BEAUTIFICATION_ON_STRONG) {
            i = i2;
        }
        imageView3.setColorFilter(i);
    }

    public static void e(gtv gtvVar, TextView textView, TextView textView2, TextView textView3, int i, int i2) {
        if (textView == null || textView2 == null || textView3 == null) {
            return;
        }
        textView.setTextColor(gtvVar == gtv.BEAUTIFICATION_OFF ? i : i2);
        textView2.setTextColor(gtvVar == gtv.BEAUTIFICATION_ON_LIGHT ? i : i2);
        if (gtvVar != gtv.BEAUTIFICATION_ON_STRONG) {
            i = i2;
        }
        textView3.setTextColor(i);
    }

    @Override // defpackage.doq
    public final void a(final gtv gtvVar) {
        this.h.c(new Runnable() { // from class: dnv
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView;
                ImageView imageView;
                ImageView imageView2;
                TextView textView2;
                ImageView imageView3;
                TextView textView3;
                String string;
                String str;
                final dnw dnwVar = this.a;
                dnwVar.f = gtvVar;
                final FrameLayout frameLayout = new FrameLayout(dnwVar.a);
                char c = 1;
                View.inflate(dnwVar.a, true != dnwVar.e.k(ddl.ay) ? R.layout.retouching_bottom_sheet_title_legacy : R.layout.retouching_bottom_sheet_title, frameLayout);
                final FrameLayout frameLayout2 = new FrameLayout(dnwVar.a);
                View.inflate(dnwVar.a, true != dnwVar.e.k(ddl.ay) ? R.layout.retouching_bottom_sheet_legacy : R.layout.retouching_bottom_sheet, frameLayout2);
                FrameLayout frameLayout3 = (FrameLayout) frameLayout2.findViewById(R.id.example_images_view);
                int i = 3;
                final FrameLayout[] frameLayoutArr = new FrameLayout[3];
                char c2 = 2;
                gtv[] gtvVarArr = {gtv.BEAUTIFICATION_OFF, gtv.BEAUTIFICATION_ON_LIGHT, gtv.BEAUTIFICATION_ON_STRONG};
                int i2 = 0;
                while (i2 < i) {
                    frameLayoutArr[i2] = new FrameLayout(dnwVar.a);
                    View.inflate(dnwVar.a, c != dnwVar.e.k(ddl.ay) ? R.layout.retouching_examples_legacy : R.layout.retouching_examples, frameLayoutArr[i2]);
                    Context context = dnwVar.a;
                    FrameLayout frameLayout4 = frameLayoutArr[i2];
                    gtv gtvVar2 = gtvVarArr[i2];
                    EduImageView[] eduImageViewArr = new EduImageView[7];
                    eduImageViewArr[0] = (EduImageView) frameLayout4.findViewById(R.id.retouching_edu_sample1);
                    eduImageViewArr[c] = (EduImageView) frameLayout4.findViewById(R.id.retouching_edu_sample2);
                    eduImageViewArr[c2] = (EduImageView) frameLayout4.findViewById(R.id.retouching_edu_sample3);
                    eduImageViewArr[3] = (EduImageView) frameLayout4.findViewById(R.id.retouching_edu_sample4);
                    eduImageViewArr[4] = (EduImageView) frameLayout4.findViewById(R.id.retouching_edu_sample5);
                    eduImageViewArr[5] = (EduImageView) frameLayout4.findViewById(R.id.retouching_edu_sample6);
                    eduImageViewArr[6] = (EduImageView) frameLayout4.findViewById(R.id.retouching_edu_sample7);
                    switch (gtvVar2.ordinal()) {
                        case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            string = context.getResources().getString(R.string.retouching_edu_image_light_desc);
                            str = "_light.jpg";
                            break;
                        case 32:
                        default:
                            string = context.getResources().getString(R.string.retouching_edu_image_strong_desc);
                            str = "_strong.jpg";
                            break;
                        case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            string = context.getResources().getString(R.string.retouching_edu_image_off_desc);
                            str = "_off.jpg";
                            break;
                    }
                    int i3 = 0;
                    while (i3 < 7) {
                        int i4 = i3 + 1;
                        StringBuilder sb = new StringBuilder(str.length() + 62);
                        sb.append("https://www.gstatic.com/aiux/gca/faceretouching/img");
                        sb.append(i4);
                        sb.append(str);
                        eduImageViewArr[i3].b(sb.toString(), string);
                        i3 = i4;
                    }
                    frameLayout3.addView(frameLayoutArr[i2]);
                    if (dnwVar.f == gtvVarArr[i2]) {
                        frameLayoutArr[i2].setVisibility(0);
                    } else {
                        frameLayoutArr[i2].setVisibility(8);
                    }
                    i2++;
                    i = 3;
                    c = 1;
                    c2 = 2;
                }
                final FrameLayout frameLayout5 = new FrameLayout(dnwVar.a);
                View.inflate(dnwVar.a, true != dnwVar.e.k(ddl.ay) ? R.layout.retouching_level_selector_legacy : R.layout.retouching_level_selector, frameLayout5);
                final View viewFindViewById = frameLayout5.findViewById(R.id.retouching_edu_off);
                final View viewFindViewById2 = frameLayout5.findViewById(R.id.retouching_edu_light);
                final View viewFindViewById3 = frameLayout5.findViewById(R.id.retouching_edu_strong);
                if (dnwVar.e.k(ddl.ay)) {
                    RippleDrawable rippleDrawable = (RippleDrawable) ((LinearLayout) frameLayout5.findViewById(R.id.level_selector)).getBackground();
                    if (rippleDrawable != null) {
                        rippleDrawable.setTint(mip.aH(R.dimen.gm_sys_elevation_level2, dnwVar.a));
                        rippleDrawable.getDrawable(0).setTint(mip.aH(R.dimen.gm_sys_elevation_level2, dnwVar.a));
                        rippleDrawable.getDrawable(1).setTint(mip.aH(R.dimen.gm_sys_elevation_level2, dnwVar.a));
                    }
                    TextView textView4 = (TextView) viewFindViewById.findViewById(R.id.retouching_edu_off_text);
                    TextView textView5 = (TextView) viewFindViewById2.findViewById(R.id.retouching_edu_light_text);
                    TextView textView6 = (TextView) viewFindViewById3.findViewById(R.id.retouching_edu_strong_text);
                    ImageView imageView4 = (ImageView) viewFindViewById.findViewById(R.id.retouching_edu_off_icon);
                    ImageView imageView5 = (ImageView) viewFindViewById2.findViewById(R.id.retouching_edu_light_icon);
                    ImageView imageView6 = (ImageView) viewFindViewById3.findViewById(R.id.retouching_edu_strong_icon);
                    if (dnwVar.g == -1) {
                        dnwVar.g = textView4.getCurrentTextColor();
                    }
                    textView = textView4;
                    textView2 = textView5;
                    imageView = imageView6;
                    textView3 = textView6;
                    imageView2 = imageView4;
                    imageView3 = imageView5;
                } else {
                    textView = null;
                    imageView = null;
                    imageView2 = null;
                    textView2 = null;
                    imageView3 = null;
                    textView3 = null;
                }
                boolean zK = dnwVar.e.k(ddl.ay);
                int i5 = zK ? R.drawable.retouching_edu_option_selected : R.drawable.retouching_edu_option_selected_legacy;
                int i6 = true != zK ? R.drawable.retouching_edu_option_unselected_legacy : R.drawable.retouching_edu_option_unselected;
                final int iE = obr.e(frameLayout5, R.attr.colorOnPrimaryContainer);
                final int i7 = dnwVar.g;
                final int i8 = 1;
                final int i9 = i5;
                final int i10 = i6;
                final TextView textView7 = textView;
                final TextView textView8 = textView2;
                final TextView textView9 = textView3;
                final ImageView imageView7 = imageView2;
                final ImageView imageView8 = imageView3;
                final ImageView imageView9 = imageView;
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: dnt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i8) {
                            case 0:
                                dnw dnwVar2 = dnwVar;
                                View view2 = viewFindViewById;
                                View view3 = viewFindViewById2;
                                View view4 = viewFindViewById3;
                                int i11 = i9;
                                int i12 = i10;
                                TextView textView10 = textView7;
                                TextView textView11 = textView8;
                                TextView textView12 = textView9;
                                int i13 = iE;
                                int i14 = i7;
                                ImageView imageView10 = imageView7;
                                ImageView imageView11 = imageView8;
                                ImageView imageView12 = imageView9;
                                FrameLayout[] frameLayoutArr2 = frameLayoutArr;
                                dnwVar2.f = gtv.BEAUTIFICATION_ON_LIGHT;
                                dnw.c(dnwVar2.f, view2, view3, view4, i11, i12);
                                dnw.e(dnwVar2.f, textView10, textView11, textView12, i13, i14);
                                dnw.d(dnwVar2.f, imageView10, imageView11, imageView12, i13, i14);
                                dnw.b(frameLayoutArr2, dnwVar2.f);
                                break;
                            case 1:
                                dnw dnwVar3 = dnwVar;
                                View view5 = viewFindViewById;
                                View view6 = viewFindViewById2;
                                View view7 = viewFindViewById3;
                                int i15 = i9;
                                int i16 = i10;
                                TextView textView13 = textView7;
                                TextView textView14 = textView8;
                                TextView textView15 = textView9;
                                int i17 = iE;
                                int i18 = i7;
                                ImageView imageView13 = imageView7;
                                ImageView imageView14 = imageView8;
                                ImageView imageView15 = imageView9;
                                FrameLayout[] frameLayoutArr3 = frameLayoutArr;
                                dnwVar3.f = gtv.BEAUTIFICATION_OFF;
                                dnw.c(dnwVar3.f, view5, view6, view7, i15, i16);
                                dnw.e(dnwVar3.f, textView13, textView14, textView15, i17, i18);
                                dnw.d(dnwVar3.f, imageView13, imageView14, imageView15, i17, i18);
                                dnw.b(frameLayoutArr3, dnwVar3.f);
                                break;
                            default:
                                dnw dnwVar4 = dnwVar;
                                View view8 = viewFindViewById;
                                View view9 = viewFindViewById2;
                                View view10 = viewFindViewById3;
                                int i19 = i9;
                                int i20 = i10;
                                TextView textView16 = textView7;
                                TextView textView17 = textView8;
                                TextView textView18 = textView9;
                                int i21 = iE;
                                int i22 = i7;
                                ImageView imageView16 = imageView7;
                                ImageView imageView17 = imageView8;
                                ImageView imageView18 = imageView9;
                                FrameLayout[] frameLayoutArr4 = frameLayoutArr;
                                dnwVar4.f = gtv.BEAUTIFICATION_ON_STRONG;
                                dnw.c(dnwVar4.f, view8, view9, view10, i19, i20);
                                dnw.e(dnwVar4.f, textView16, textView17, textView18, i21, i22);
                                dnw.d(dnwVar4.f, imageView16, imageView17, imageView18, i21, i22);
                                dnw.b(frameLayoutArr4, dnwVar4.f);
                                break;
                        }
                    }
                });
                final int i11 = 0;
                final int i12 = i5;
                final int i13 = i6;
                final TextView textView10 = textView;
                final TextView textView11 = textView2;
                final TextView textView12 = textView3;
                final ImageView imageView10 = imageView2;
                final ImageView imageView11 = imageView3;
                final ImageView imageView12 = imageView;
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: dnt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                dnw dnwVar2 = dnwVar;
                                View view2 = viewFindViewById;
                                View view3 = viewFindViewById2;
                                View view4 = viewFindViewById3;
                                int i14 = i12;
                                int i15 = i13;
                                TextView textView13 = textView10;
                                TextView textView14 = textView11;
                                TextView textView15 = textView12;
                                int i16 = iE;
                                int i17 = i7;
                                ImageView imageView13 = imageView10;
                                ImageView imageView14 = imageView11;
                                ImageView imageView15 = imageView12;
                                FrameLayout[] frameLayoutArr2 = frameLayoutArr;
                                dnwVar2.f = gtv.BEAUTIFICATION_ON_LIGHT;
                                dnw.c(dnwVar2.f, view2, view3, view4, i14, i15);
                                dnw.e(dnwVar2.f, textView13, textView14, textView15, i16, i17);
                                dnw.d(dnwVar2.f, imageView13, imageView14, imageView15, i16, i17);
                                dnw.b(frameLayoutArr2, dnwVar2.f);
                                break;
                            case 1:
                                dnw dnwVar3 = dnwVar;
                                View view5 = viewFindViewById;
                                View view6 = viewFindViewById2;
                                View view7 = viewFindViewById3;
                                int i18 = i12;
                                int i19 = i13;
                                TextView textView16 = textView10;
                                TextView textView17 = textView11;
                                TextView textView18 = textView12;
                                int i110 = iE;
                                int i111 = i7;
                                ImageView imageView16 = imageView10;
                                ImageView imageView17 = imageView11;
                                ImageView imageView18 = imageView12;
                                FrameLayout[] frameLayoutArr3 = frameLayoutArr;
                                dnwVar3.f = gtv.BEAUTIFICATION_OFF;
                                dnw.c(dnwVar3.f, view5, view6, view7, i18, i19);
                                dnw.e(dnwVar3.f, textView16, textView17, textView18, i110, i111);
                                dnw.d(dnwVar3.f, imageView16, imageView17, imageView18, i110, i111);
                                dnw.b(frameLayoutArr3, dnwVar3.f);
                                break;
                            default:
                                dnw dnwVar4 = dnwVar;
                                View view8 = viewFindViewById;
                                View view9 = viewFindViewById2;
                                View view10 = viewFindViewById3;
                                int i112 = i12;
                                int i20 = i13;
                                TextView textView19 = textView10;
                                TextView textView110 = textView11;
                                TextView textView111 = textView12;
                                int i21 = iE;
                                int i22 = i7;
                                ImageView imageView19 = imageView10;
                                ImageView imageView110 = imageView11;
                                ImageView imageView111 = imageView12;
                                FrameLayout[] frameLayoutArr4 = frameLayoutArr;
                                dnwVar4.f = gtv.BEAUTIFICATION_ON_STRONG;
                                dnw.c(dnwVar4.f, view8, view9, view10, i112, i20);
                                dnw.e(dnwVar4.f, textView19, textView110, textView111, i21, i22);
                                dnw.d(dnwVar4.f, imageView19, imageView110, imageView111, i21, i22);
                                dnw.b(frameLayoutArr4, dnwVar4.f);
                                break;
                        }
                    }
                });
                final int i14 = 2;
                final int i15 = i5;
                final int i16 = i6;
                final TextView textView13 = textView;
                final TextView textView14 = textView2;
                final TextView textView15 = textView3;
                final ImageView imageView13 = imageView2;
                final ImageView imageView14 = imageView3;
                final ImageView imageView15 = imageView;
                viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: dnt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                dnw dnwVar2 = dnwVar;
                                View view2 = viewFindViewById;
                                View view3 = viewFindViewById2;
                                View view4 = viewFindViewById3;
                                int i17 = i15;
                                int i18 = i16;
                                TextView textView16 = textView13;
                                TextView textView17 = textView14;
                                TextView textView18 = textView15;
                                int i19 = iE;
                                int i110 = i7;
                                ImageView imageView16 = imageView13;
                                ImageView imageView17 = imageView14;
                                ImageView imageView18 = imageView15;
                                FrameLayout[] frameLayoutArr2 = frameLayoutArr;
                                dnwVar2.f = gtv.BEAUTIFICATION_ON_LIGHT;
                                dnw.c(dnwVar2.f, view2, view3, view4, i17, i18);
                                dnw.e(dnwVar2.f, textView16, textView17, textView18, i19, i110);
                                dnw.d(dnwVar2.f, imageView16, imageView17, imageView18, i19, i110);
                                dnw.b(frameLayoutArr2, dnwVar2.f);
                                break;
                            case 1:
                                dnw dnwVar3 = dnwVar;
                                View view5 = viewFindViewById;
                                View view6 = viewFindViewById2;
                                View view7 = viewFindViewById3;
                                int i111 = i15;
                                int i112 = i16;
                                TextView textView19 = textView13;
                                TextView textView110 = textView14;
                                TextView textView111 = textView15;
                                int i113 = iE;
                                int i114 = i7;
                                ImageView imageView19 = imageView13;
                                ImageView imageView110 = imageView14;
                                ImageView imageView111 = imageView15;
                                FrameLayout[] frameLayoutArr3 = frameLayoutArr;
                                dnwVar3.f = gtv.BEAUTIFICATION_OFF;
                                dnw.c(dnwVar3.f, view5, view6, view7, i111, i112);
                                dnw.e(dnwVar3.f, textView19, textView110, textView111, i113, i114);
                                dnw.d(dnwVar3.f, imageView19, imageView110, imageView111, i113, i114);
                                dnw.b(frameLayoutArr3, dnwVar3.f);
                                break;
                            default:
                                dnw dnwVar4 = dnwVar;
                                View view8 = viewFindViewById;
                                View view9 = viewFindViewById2;
                                View view10 = viewFindViewById3;
                                int i115 = i15;
                                int i20 = i16;
                                TextView textView112 = textView13;
                                TextView textView113 = textView14;
                                TextView textView114 = textView15;
                                int i21 = iE;
                                int i22 = i7;
                                ImageView imageView112 = imageView13;
                                ImageView imageView113 = imageView14;
                                ImageView imageView114 = imageView15;
                                FrameLayout[] frameLayoutArr4 = frameLayoutArr;
                                dnwVar4.f = gtv.BEAUTIFICATION_ON_STRONG;
                                dnw.c(dnwVar4.f, view8, view9, view10, i115, i20);
                                dnw.e(dnwVar4.f, textView112, textView113, textView114, i21, i22);
                                dnw.d(dnwVar4.f, imageView112, imageView113, imageView114, i21, i22);
                                dnw.b(frameLayoutArr4, dnwVar4.f);
                                break;
                        }
                    }
                });
                dnw.c(dnwVar.f, viewFindViewById, viewFindViewById2, viewFindViewById3, i5, i6);
                dnw.e(dnwVar.f, textView, textView2, textView3, iE, i7);
                dnw.d(dnwVar.f, imageView2, imageView3, imageView, iE, i7);
                frameLayout2.findViewById(R.id.apply_button).setOnClickListener(new View.OnClickListener() { // from class: dns
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i17;
                        dnw dnwVar2 = dnwVar;
                        lda ldaVar = dnwVar2.d;
                        gtv gtvVar3 = dnwVar2.f;
                        gtv gtvVar4 = gtv.UNKNOWN;
                        switch (gtvVar3.ordinal()) {
                            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                i17 = htf.ON_LIGHT.f;
                                break;
                            case 32:
                                i17 = htf.ON_STRONG.f;
                                break;
                            case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                i17 = htf.OFF.f;
                                break;
                            default:
                                Log.e("VesperBottomSheet", "Invalid beautification option");
                                i17 = htf.OFF.f;
                                break;
                        }
                        ldaVar.fB(Integer.valueOf(i17));
                        dnwVar2.b.d();
                    }
                });
                if (dnwVar.c.c() || dnwVar.c.d()) {
                    ((TextView) frameLayout2.findViewById(R.id.retouching_desc)).setText(R.string.retouching_edu_desc_legacy);
                }
                TextView textView16 = (TextView) frameLayout2.findViewById(R.id.disclaimer);
                String strValueOf = String.valueOf(dnwVar.a.getResources().getString(R.string.retouching_edu_disc));
                textView16.setText(strValueOf.length() != 0 ? " ".concat(strValueOf) : new String(" "));
                ius iusVar = dnwVar.b;
                final View viewFindViewById4 = frameLayout.findViewById(R.id.retouching_sheet_title);
                final ViewGroup viewGroup = (ViewGroup) frameLayout.findViewById(R.id.title_level_selector);
                final ViewGroup viewGroup2 = (ViewGroup) frameLayout2.findViewById(R.id.content_level_selector);
                viewGroup2.addView(frameLayout5);
                iusVar.f = new View.OnScrollChangeListener() { // from class: dnu
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i17, int i18, int i19, int i20) {
                        View view2 = frameLayout;
                        ViewGroup viewGroup3 = viewGroup2;
                        View view3 = frameLayout5;
                        ViewGroup viewGroup4 = viewGroup;
                        View view4 = viewFindViewById4;
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        view2.getLocationInWindow(iArr);
                        viewGroup3.getLocationInWindow(iArr2);
                        if (iArr2[1] < iArr[1] + view2.getHeight()) {
                            if (viewGroup3.findViewById(R.id.level_selector) != null) {
                                viewGroup3.removeView(view3);
                                viewGroup4.addView(view3);
                            }
                            view4.setVisibility(4);
                            return;
                        }
                        if (viewGroup4.findViewById(R.id.level_selector) != null) {
                            viewGroup4.removeView(view3);
                            viewGroup3.addView(view3);
                        }
                        view4.setVisibility(0);
                    }
                };
                final ius iusVar2 = dnwVar.b;
                if (iusVar2.c.k(ddl.aL)) {
                    return;
                }
                iusVar2.b.execute(new Runnable() { // from class: iup
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ius iusVar3 = iusVar2;
                        View view = frameLayout;
                        View view2 = frameLayout2;
                        ViewGroup viewGroupA = iusVar3.a(view, iusVar3.a);
                        viewGroupA.addView(view2);
                        iusVar3.c(viewGroupA);
                        nya nyaVar = iusVar3.d;
                        if (nyaVar != null) {
                            nyaVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: iui
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    iusVar3.e();
                                }
                            });
                            iusVar3.d.show();
                        }
                    }
                });
                iusVar2.h = System.currentTimeMillis();
                iusVar2.k = ozy.e.m();
                iusVar2.i = null;
                iusVar2.j = 5;
            }
        });
    }
}
