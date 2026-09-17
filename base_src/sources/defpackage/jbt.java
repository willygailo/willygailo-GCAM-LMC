package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class jbt {
    public static final jbt a;
    public final Size b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final Rect g;
    public final Rect h;
    public final Rect i;
    public final Rect j;
    public final Rect k;
    public final Rect l;
    public final Rect m;
    public final Rect n;
    public final boolean o;
    public final boolean p;

    static {
        jbs jbsVarB = b();
        jbsVarB.n(new Size(0, 0));
        jbsVarB.j(new Rect());
        jbsVarB.l(new Rect());
        jbsVarB.k(new Rect());
        jbsVarB.m(new Rect());
        jbsVarB.p(new Rect());
        jbsVarB.b(new Rect());
        jbsVarB.g(new Rect());
        jbsVarB.d(new Rect());
        jbsVarB.e(new Rect());
        jbsVarB.i(new Rect());
        jbsVarB.c(new Rect());
        jbsVarB.f(new Rect());
        jbsVarB.h(true);
        jbsVarB.o(true);
        a = jbsVarB.a();
    }

    public jbt() {
    }

    public jbt(Size size, Rect rect, Rect rect2, Rect rect3, Rect rect4, Rect rect5, Rect rect6, Rect rect7, Rect rect8, Rect rect9, Rect rect10, Rect rect11, Rect rect12, boolean z, boolean z2) {
        this.b = size;
        this.c = rect;
        this.d = rect2;
        this.e = rect3;
        this.f = rect4;
        this.g = rect5;
        this.h = rect6;
        this.i = rect7;
        this.j = rect8;
        this.k = rect9;
        this.l = rect10;
        this.m = rect11;
        this.n = rect12;
        this.o = z;
        this.p = z2;
    }

    static Rect a(Rect rect, Size size, jrz jrzVar) {
        jrz jrzVar2 = jrz.PORTRAIT;
        switch (jrzVar) {
            case PORTRAIT:
                return rect;
            case LANDSCAPE:
                return new Rect(rect.top, size.getHeight() - rect.right, rect.bottom, size.getHeight() - rect.left);
            case REVERSE_LANDSCAPE:
                return new Rect(size.getWidth() - rect.bottom, rect.left, size.getWidth() - rect.top, rect.right);
            case REVERSE_PORTRAIT:
                return new Rect(size.getWidth() - rect.right, size.getHeight() - rect.bottom, size.getWidth() - rect.left, size.getHeight() - rect.top);
            default:
                String strValueOf = String.valueOf(jrzVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
                sb.append("Unexpected UI Orientation: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    static jbs b() {
        jbs jbsVar = new jbs();
        jbsVar.h(false);
        jbsVar.o(true);
        return jbsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbt) {
            jbt jbtVar = (jbt) obj;
            if (this.b.equals(jbtVar.b) && this.c.equals(jbtVar.c) && this.d.equals(jbtVar.d) && this.e.equals(jbtVar.e) && this.f.equals(jbtVar.f) && this.g.equals(jbtVar.g) && this.h.equals(jbtVar.h) && this.i.equals(jbtVar.i) && this.j.equals(jbtVar.j) && this.k.equals(jbtVar.k) && this.l.equals(jbtVar.l) && this.m.equals(jbtVar.m) && this.n.equals(jbtVar.n) && this.o == jbtVar.o && this.p == jbtVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ (true == this.p ? 1231 : 1237);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.e);
        String strValueOf5 = String.valueOf(this.f);
        String strValueOf6 = String.valueOf(this.g);
        String strValueOf7 = String.valueOf(this.h);
        String strValueOf8 = String.valueOf(this.i);
        String strValueOf9 = String.valueOf(this.j);
        String strValueOf10 = String.valueOf(this.k);
        String strValueOf11 = String.valueOf(this.l);
        String strValueOf12 = String.valueOf(this.m);
        String strValueOf13 = String.valueOf(this.n);
        boolean z = this.o;
        boolean z2 = this.p;
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        int length6 = String.valueOf(strValueOf6).length();
        int length7 = String.valueOf(strValueOf7).length();
        int length8 = String.valueOf(strValueOf8).length();
        int length9 = String.valueOf(strValueOf9).length();
        int length10 = String.valueOf(strValueOf10).length();
        int length11 = String.valueOf(strValueOf11).length();
        StringBuilder sb = new StringBuilder(length + 252 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + String.valueOf(strValueOf12).length() + String.valueOf(strValueOf13).length());
        sb.append("CameraLayoutBoxes{window=");
        sb.append(strValueOf);
        sb.append(", previewOverlay=");
        sb.append(strValueOf2);
        sb.append(", optionsMenuContainer=");
        sb.append(strValueOf3);
        sb.append(", preview=");
        sb.append(strValueOf4);
        sb.append(", uncoveredPreview=");
        sb.append(strValueOf5);
        sb.append(", viewfinderCoverIconArea=");
        sb.append(strValueOf6);
        sb.append(", zoomUi=");
        sb.append(strValueOf7);
        sb.append(", bottomBar=");
        sb.append(strValueOf8);
        sb.append(", gradientBar=");
        sb.append(strValueOf9);
        sb.append(", fullScreen=");
        sb.append(strValueOf10);
        sb.append(", modeSwitchUi=");
        sb.append(strValueOf11);
        sb.append(", cutoutArea=");
        sb.append(strValueOf12);
        sb.append(", modeSlider=");
        sb.append(strValueOf13);
        sb.append(", needsRetry=");
        sb.append(z);
        sb.append(", zoomInViewfinder=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
