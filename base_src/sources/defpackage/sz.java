package defpackage;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class sz extends sx {
    private static final float b = (float) (1.0d / Math.sqrt(2.0d));
    private final ta c = new ta();
    private final Rect d = new Rect();
    private final Rect e = new Rect();

    private final void v() {
        if (this.a != null) {
            n(this.d);
            Rect rect = this.d;
            gi.i(rect, rect, b * 0.7f);
            this.c.u(this.d.width(), this.d.height(), this.a);
        }
    }

    @Override // defpackage.sx
    public final void a(Rect rect) {
        ComplicationData complicationData = this.a;
        if (complicationData.c() == null) {
            rect.setEmpty();
            return;
        }
        k(rect);
        if (complicationData.h() == null || gi.j(rect)) {
            gi.i(rect, this.d, 0.7f);
        } else {
            this.c.a(rect);
            rect.offset(this.d.left, this.d.top);
        }
    }

    @Override // defpackage.sx
    public final int e() {
        ComplicationData complicationData = this.a;
        k(this.e);
        if (gi.j(this.e)) {
            return complicationData.i() != null ? 80 : 16;
        }
        return this.c.e();
    }

    @Override // defpackage.sx
    public final int f() {
        return 48;
    }

    @Override // defpackage.sx
    public final Layout.Alignment i() {
        k(this.e);
        return gi.j(this.e) ? Layout.Alignment.ALIGN_NORMAL : this.c.i();
    }

    @Override // defpackage.sx
    public final Layout.Alignment j() {
        return i();
    }

    @Override // defpackage.sx
    public final void n(Rect rect) {
        k(rect);
        if (this.a.h() == null || !gi.j(rect)) {
            gi.e(rect, rect);
            gi.i(rect, rect, 0.95f);
        } else {
            gi.f(rect, rect);
            gi.i(rect, rect, 0.95f);
        }
    }

    @Override // defpackage.sx
    public final void o(Rect rect) {
        ComplicationData complicationData = this.a;
        if (complicationData.h() == null) {
            rect.setEmpty();
            return;
        }
        k(rect);
        if (!gi.j(rect)) {
            this.c.o(rect);
            rect.offset(this.d.left, this.d.top);
        } else if (complicationData.i() == null || complicationData.c() != null) {
            gi.g(rect, rect);
        } else {
            gi.g(rect, rect);
            gi.h(rect, rect);
        }
    }

    @Override // defpackage.sx
    public final void p(Rect rect) {
        ComplicationData complicationData = this.a;
        if (complicationData.i() == null || complicationData.h() == null) {
            rect.setEmpty();
            return;
        }
        k(rect);
        if (gi.j(rect)) {
            gi.g(rect, rect);
            gi.d(rect, rect);
        } else {
            this.c.p(rect);
            rect.offset(this.d.left, this.d.top);
        }
    }

    @Override // defpackage.sx
    public final void r(ComplicationData complicationData) {
        this.a = complicationData;
        v();
    }

    @Override // defpackage.sx
    public final void s(int i) {
        super.s(i);
        v();
    }

    @Override // defpackage.sx
    public final void t(int i) {
        super.t(i);
        v();
    }
}
