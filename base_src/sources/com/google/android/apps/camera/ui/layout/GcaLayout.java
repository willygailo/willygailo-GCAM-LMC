package com.google.android.apps.camera.ui.layout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Trace;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.af;
import defpackage.ah;
import defpackage.end;
import defpackage.jbr;
import defpackage.jbt;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jca;
import defpackage.jcb;
import defpackage.jcd;
import defpackage.jce;
import defpackage.jrz;
import defpackage.obr;
import defpackage.ojz;

/* JADX INFO: loaded from: classes.dex */
public class GcaLayout extends ConstraintLayout {
    public ojz d;

    public GcaLayout(Context context) {
        super(context);
        d(context);
    }

    public GcaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public GcaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(Context context) {
        ((jca) ((end) context).b(jca.class)).a(this);
    }

    private final void e(View view, jrz jrzVar, Size size, ah ahVar) {
        int i;
        if (size == null) {
            return;
        }
        if (jrzVar == jrz.PORTRAIT || jrzVar == jrz.REVERSE_PORTRAIT) {
            double width = size.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_width);
            Double.isNaN(width);
            i = (int) (width / 2.0d);
        } else {
            double height = size.getHeight() - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_width);
            Double.isNaN(height);
            i = (int) (height / 2.0d);
        }
        g(ahVar, jrzVar, view.getId(), getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_width), getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height), (jrzVar == jrz.PORTRAIT || jrzVar == jrz.REVERSE_PORTRAIT) ? size.getHeight() - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height) : size.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height), i, size);
    }

    private static final Rect f(Size size, Size size2) {
        int height;
        int width;
        int i;
        int i2 = 0;
        if (size == null || size2 == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (size.getWidth() / size.getHeight() < size2.getWidth() / size2.getHeight()) {
            width = size.getWidth();
            height = (int) ((size2.getHeight() / size2.getWidth()) * width);
        } else {
            height = size.getHeight();
            width = (int) ((size2.getWidth() / size2.getHeight()) * height);
        }
        if (size.getWidth() / size.getHeight() < size2.getWidth() / size2.getHeight()) {
            double height2 = size.getHeight() - height;
            Double.isNaN(height2);
            i = (int) (height2 / 2.0d);
        } else {
            double width2 = size.getWidth() - width;
            Double.isNaN(width2);
            i2 = (int) (width2 / 2.0d);
            i = 0;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    private static final void g(ah ahVar, jrz jrzVar, int i, int i2, int i3, int i4, int i5, Size size) {
        if (size == null) {
        }
        jrz jrzVar2 = jrz.PORTRAIT;
        switch (jrzVar) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                ahVar.f(i, i3);
                ahVar.g(i, i2);
                ahVar.e(i, 3, 0, 3, i4);
                ahVar.e(i, 6, 0, 6, i5);
                break;
            case LANDSCAPE:
                ahVar.f(i, i2);
                ahVar.g(i, i3);
                ahVar.e(i, 3, 0, 3, (size.getHeight() - i5) - i2);
                ahVar.e(i, 6, 0, 6, i4);
                break;
            case REVERSE_LANDSCAPE:
                ahVar.f(i, i2);
                ahVar.g(i, i3);
                ahVar.e(i, 3, 0, 3, i5);
                ahVar.e(i, 6, 0, 6, (size.getWidth() - i3) - i4);
                break;
        }
    }

    private static final void h(View view, Rect rect, ah ahVar) {
        if (rect.width() < 0 || rect.height() < 0) {
            return;
        }
        ahVar.f(view.getId(), rect.height());
        ahVar.g(view.getId(), rect.width());
        ahVar.e(view.getId(), 3, 0, 3, rect.top);
        ahVar.e(view.getId(), 6, 0, 6, rect.left);
    }

    private static final void i(View view, Size size, Size size2, ah ahVar) {
        if (size == null || size2 == null) {
            return;
        }
        Rect rectF = f(size, size2);
        g(ahVar, jrz.PORTRAIT, view.getId(), rectF.width(), rectF.height(), rectF.top, rectF.left, size);
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jcb;
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new jcb(layoutParams);
    }

    @Override // android.support.constraint.ConstraintLayout
    /* JADX INFO: renamed from: gp */
    public final af generateDefaultLayoutParams() {
        return new jcb();
    }

    @Override // android.support.constraint.ConstraintLayout
    /* JADX INFO: renamed from: gq */
    public final af generateLayoutParams(AttributeSet attributeSet) {
        return new jcb(getContext(), attributeSet);
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object tag = getTag();
        obr.ao(tag);
        Trace.beginSection(String.valueOf(tag.toString()).concat(".onLayout"));
        super.onLayout(z, i, i2, i3, i4);
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0270  */
    @Override // android.support.constraint.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int height;
        Size size;
        int i6;
        GcaLayout gcaLayout = this;
        Object tag = getTag();
        obr.ao(tag);
        Trace.beginSection(String.valueOf(tag.toString()).concat(".onMeasure"));
        Object objA = gcaLayout.d.a();
        obr.ao(objA);
        jbw jbwVar = (jbw) objA;
        jbt jbtVar = jbwVar.b;
        ah ahVar = new ah();
        ahVar.d(gcaLayout);
        jce jceVar = jbwVar.a.j;
        int childCount = getChildCount();
        jbv jbvVar = jbwVar.a;
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = gcaLayout.getChildAt(i7);
            int i8 = ((jcb) childAt.getLayoutParams()).Z;
            if (i8 != 0) {
                jrz jrzVar = jrz.PORTRAIT;
                switch (i8 - 1) {
                    case 0:
                        i7 = i7;
                        h(childAt, jbtVar.k, ahVar);
                        break;
                    case 1:
                        i7 = i7;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.e, ahVar);
                        } else if (jceVar.equals(jce.TABLET_LAYOUT)) {
                            i(childAt, jbvVar.b, jbvVar.d, ahVar);
                        }
                        break;
                    case 2:
                        i7 = i7;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.f, ahVar);
                        } else if (jceVar.equals(jce.TABLET_LAYOUT)) {
                            Rect rectF = f(jbvVar.b, jbvVar.d);
                            if (jbvVar.h == jrz.PORTRAIT || jbvVar.h == jrz.REVERSE_PORTRAIT) {
                                g(ahVar, jrz.PORTRAIT, childAt.getId(), rectF.width(), (rectF.height() - getResources().getDimensionPixelSize(R.dimen.tab_options_top_bar)) - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height), rectF.top + getResources().getDimensionPixelSize(R.dimen.tab_options_top_bar), rectF.left, jbvVar.b);
                            } else if (jbvVar.h != jrz.LANDSCAPE) {
                                g(ahVar, jrz.PORTRAIT, childAt.getId(), (rectF.width() - getResources().getDimensionPixelSize(R.dimen.tab_options_top_bar)) - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height), rectF.height(), rectF.top, rectF.left + getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height), jbvVar.b);
                            } else {
                                g(ahVar, jrz.PORTRAIT, childAt.getId(), (rectF.width() - getResources().getDimensionPixelSize(R.dimen.tab_options_top_bar)) - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height), rectF.height(), rectF.top, rectF.left + getResources().getDimensionPixelSize(R.dimen.tab_options_top_bar), jbvVar.b);
                            }
                        }
                        break;
                    case 3:
                        i7 = i7;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.i, ahVar);
                        } else if (jceVar.equals(jce.TABLET_LAYOUT)) {
                            jrz jrzVar2 = jbvVar.h;
                            Size size2 = jbvVar.b;
                            if (size2 != null) {
                                if (jrzVar2 == jrz.PORTRAIT || jrzVar2 == jrz.REVERSE_PORTRAIT) {
                                    double height2 = size2.getHeight() - getResources().getDimensionPixelSize(R.dimen.tab_bottom_bar_height);
                                    Double.isNaN(height2);
                                    i3 = (int) (height2 / 2.0d);
                                } else {
                                    double width = size2.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_bottom_bar_height);
                                    Double.isNaN(width);
                                    i3 = (int) (width / 2.0d);
                                }
                                g(ahVar, jrzVar2, childAt.getId(), getResources().getDimensionPixelSize(R.dimen.tab_bottom_bar_width), getResources().getDimensionPixelSize(R.dimen.tab_bottom_bar_height), i3, (jrzVar2 == jrz.PORTRAIT || jrzVar2 == jrz.REVERSE_PORTRAIT) ? (size2.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_bottom_bar_width)) - getResources().getDimensionPixelSize(R.dimen.tab_bottom_bar_right_margin) : (size2.getHeight() - getResources().getDimensionPixelSize(R.dimen.tab_bottom_bar_width)) - getResources().getDimensionPixelSize(R.dimen.tab_bottom_bar_right_margin), size2);
                            }
                        }
                        break;
                    case 4:
                        jbw jbwVar2 = jbwVar;
                        i7 = i7;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            jbwVar = jbwVar2;
                            jcd jcdVar = jbwVar.c;
                            if (jcdVar == null) {
                                h(childAt, jbtVar.f, ahVar);
                            } else {
                                ahVar.f(childAt.getId(), jcdVar.a.getHeight());
                                ahVar.g(childAt.getId(), jcdVar.a.getWidth());
                                ahVar.e(childAt.getId(), 3, 0, 3, jcdVar.c.top);
                                ahVar.e(childAt.getId(), 6, 0, 6, jcdVar.c.left);
                                ahVar.e(childAt.getId(), 7, 0, 7, jcdVar.c.right);
                                ahVar.e(childAt.getId(), 4, 0, 4, jcdVar.c.bottom);
                                childAt.setPadding(jcdVar.b.left, jcdVar.b.top, jcdVar.b.right, jcdVar.b.bottom);
                            }
                        } else {
                            i(childAt, jbvVar.b, jbvVar.d, ahVar);
                            jbwVar = jbwVar2;
                        }
                        break;
                    case 5:
                        jbw jbwVar3 = jbwVar;
                        i7 = i7;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.l, ahVar);
                            jbwVar = jbwVar3;
                        } else if (!jceVar.equals(jce.TABLET_LAYOUT)) {
                            jbwVar = jbwVar3;
                        } else {
                            gcaLayout.e(childAt, jbvVar.h, jbvVar.b, ahVar);
                            jbwVar = jbwVar3;
                        }
                        break;
                    case 6:
                        jbw jbwVar4 = jbwVar;
                        i7 = i7;
                        gcaLayout = gcaLayout;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.h, ahVar);
                            jbwVar = jbwVar4;
                        } else if (!jceVar.equals(jce.TABLET_LAYOUT)) {
                            gcaLayout = gcaLayout;
                            jbwVar = jbwVar4;
                        } else {
                            jrz jrzVar3 = jbvVar.h;
                            Size size3 = jbvVar.b;
                            if (size3 == null) {
                                gcaLayout = gcaLayout;
                                jbwVar = jbwVar4;
                            } else {
                                if (jrzVar3 == jrz.PORTRAIT || jrzVar3 == jrz.REVERSE_PORTRAIT) {
                                    double height3 = size3.getHeight() - getResources().getDimensionPixelSize(R.dimen.tab_zoom_ui_height);
                                    Double.isNaN(height3);
                                    i4 = (int) (height3 / 2.0d);
                                } else {
                                    double width2 = size3.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_zoom_ui_height);
                                    Double.isNaN(width2);
                                    i4 = (int) (width2 / 2.0d);
                                }
                                gcaLayout = gcaLayout;
                                g(ahVar, jrzVar3, childAt.getId(), getResources().getDimensionPixelSize(R.dimen.tab_zoom_ui_width), getResources().getDimensionPixelSize(R.dimen.tab_zoom_ui_height), i4, getResources().getDimensionPixelSize(R.dimen.tab_zoom_ui_left_margin), size3);
                                jbwVar = jbwVar4;
                            }
                        }
                        break;
                    case 7:
                        jbw jbwVar5 = jbwVar;
                        i7 = i7;
                        GcaLayout gcaLayout2 = gcaLayout;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.g, ahVar);
                            gcaLayout = gcaLayout2;
                            jbwVar = jbwVar5;
                        } else if (!jceVar.equals(jce.TABLET_LAYOUT)) {
                            gcaLayout = gcaLayout2;
                            jbwVar = jbwVar5;
                        } else {
                            i(childAt, jbvVar.b, jbvVar.d, ahVar);
                            gcaLayout = gcaLayout2;
                            jbwVar = jbwVar5;
                        }
                        break;
                    case 8:
                        jbw jbwVar6 = jbwVar;
                        i7 = i7;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.j, ahVar);
                            gcaLayout = this;
                            jbwVar = jbwVar6;
                        } else if (!jceVar.equals(jce.TABLET_LAYOUT)) {
                            gcaLayout = this;
                            jbwVar = jbwVar6;
                        } else {
                            e(childAt, jbvVar.h, jbvVar.b, ahVar);
                            gcaLayout = this;
                            jbwVar = jbwVar6;
                        }
                        break;
                    case 9:
                        jbw jbwVar7 = jbwVar;
                        i7 = i7;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.c, ahVar);
                            gcaLayout = this;
                            jbwVar = jbwVar7;
                        } else if (!jceVar.equals(jce.TABLET_LAYOUT)) {
                            gcaLayout = this;
                            jbwVar = jbwVar7;
                        } else {
                            i(childAt, jbvVar.b, jbvVar.d, ahVar);
                            gcaLayout = this;
                            jbwVar = jbwVar7;
                        }
                        break;
                    case 10:
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.d, ahVar);
                            gcaLayout = this;
                            jbwVar = jbwVar;
                        } else if (!jceVar.equals(jce.TABLET_LAYOUT)) {
                            i7 = i7;
                            gcaLayout = this;
                        } else {
                            jrz jrzVar4 = jbvVar.h;
                            Size size4 = jbvVar.b;
                            if (size4 == null) {
                                i7 = i7;
                                gcaLayout = this;
                            } else {
                                if (jrzVar4 == jrz.PORTRAIT || jrzVar4 == jrz.REVERSE_PORTRAIT) {
                                    double width3 = size4.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_options_container_width);
                                    Double.isNaN(width3);
                                    i5 = (int) (width3 / 2.0d);
                                } else {
                                    jbwVar = jbwVar;
                                    double height4 = size4.getHeight() - getResources().getDimensionPixelSize(R.dimen.tab_options_container_width);
                                    Double.isNaN(height4);
                                    i5 = (int) (height4 / 2.0d);
                                }
                                if (jrzVar4 == jrz.PORTRAIT || jrzVar4 == jrz.REVERSE_PORTRAIT) {
                                    int i9 = R.dimen.tab_mode_switcher_height;
                                    height = size4.getHeight() - getResources().getDimensionPixelSize(i9);
                                } else {
                                    height = size4.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height);
                                }
                                i7 = i7;
                                g(ahVar, jrzVar4, childAt.getId(), getResources().getDimensionPixelSize(R.dimen.tab_options_container_width), height, getResources().getDimensionPixelSize(R.dimen.tab_options_container_top_margin), i5, size4);
                                gcaLayout = this;
                                jbwVar = jbwVar;
                            }
                        }
                        break;
                    case 11:
                        h(childAt, jbtVar.m, ahVar);
                        i7 = i7;
                        break;
                    default:
                        i7 = i7;
                        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
                            h(childAt, jbtVar.n, ahVar);
                        } else if (jceVar.equals(jce.TABLET_LAYOUT) && (size = jbvVar.b) != null) {
                            int dimensionPixelSize = jbr.b(jbvVar.i) ? getResources().getDimensionPixelSize(R.dimen.tab_mode_slider_height) : 0;
                            if (jbvVar.h == jrz.PORTRAIT || jbvVar.h == jrz.REVERSE_PORTRAIT) {
                                double width4 = size.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_mode_slider_width);
                                Double.isNaN(width4);
                                i6 = (int) (width4 / 2.0d);
                            } else {
                                double height5 = size.getHeight() - getResources().getDimensionPixelSize(R.dimen.tab_mode_slider_width);
                                Double.isNaN(height5);
                                i6 = (int) (height5 / 2.0d);
                            }
                            int height6 = (jbvVar.h == jrz.PORTRAIT || jbvVar.h == jrz.REVERSE_PORTRAIT) ? (size.getHeight() - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height)) - getResources().getDimensionPixelSize(R.dimen.tab_mode_slider_height) : (size.getWidth() - getResources().getDimensionPixelSize(R.dimen.tab_mode_switcher_height)) - getResources().getDimensionPixelSize(R.dimen.tab_mode_slider_height);
                            if (dimensionPixelSize != 0) {
                                g(ahVar, jrz.PORTRAIT, childAt.getId(), getResources().getDimensionPixelSize(R.dimen.tab_mode_slider_width), getResources().getDimensionPixelSize(R.dimen.tab_mode_slider_height), height6, i6, jbvVar.b);
                            }
                        }
                        break;
                }
            } else {
                i7 = i7;
                childAt.requestLayout();
            }
            i7++;
        }
        ahVar.b(gcaLayout);
        super.onMeasure(i, i2);
        Trace.endSection();
    }
}
