package defpackage;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public class sx {
    public ComplicationData a;
    private final Rect b = new Rect();

    public void a(Rect rect) {
        rect.setEmpty();
    }

    public void b(Rect rect) {
        rect.setEmpty();
    }

    public int c() {
        return 17;
    }

    public int d() {
        return 17;
    }

    public int e() {
        return 17;
    }

    public int f() {
        return 17;
    }

    public Layout.Alignment g() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    public Layout.Alignment h() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    public Layout.Alignment i() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    public Layout.Alignment j() {
        return Layout.Alignment.ALIGN_CENTER;
    }

    public final void k(Rect rect) {
        rect.set(this.b);
    }

    public void l(Rect rect) {
        rect.setEmpty();
    }

    public void m(Rect rect) {
        rect.setEmpty();
    }

    public void n(Rect rect) {
        rect.setEmpty();
    }

    public void o(Rect rect) {
        rect.setEmpty();
    }

    public void p(Rect rect) {
        rect.setEmpty();
    }

    public void q(Rect rect) {
        rect.setEmpty();
    }

    public void r(ComplicationData complicationData) {
        this.a = complicationData;
    }

    public void s(int i) {
        this.b.bottom = i;
    }

    public void t(int i) {
        this.b.right = i;
    }

    public final void u(int i, int i2, ComplicationData complicationData) {
        t(i);
        s(i2);
        r(complicationData);
    }
}
