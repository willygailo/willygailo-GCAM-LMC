package defpackage;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class sy extends sx {
    private final Rect b = new Rect();

    private final boolean v(Rect rect) {
        ComplicationData complicationData = this.a;
        return (complicationData.c() == null && complicationData.d() == null) || !gi.j(rect);
    }

    @Override // defpackage.sx
    public final void a(Rect rect) {
        ComplicationData complicationData = this.a;
        k(rect);
        if (complicationData.c() == null || complicationData.d() != null || v(rect)) {
            rect.setEmpty();
        } else {
            gi.f(rect, rect);
        }
    }

    @Override // defpackage.sx
    public final int c() {
        return this.a.g() == null ? 16 : 80;
    }

    @Override // defpackage.sx
    public final int d() {
        return 48;
    }

    @Override // defpackage.sx
    public final Layout.Alignment g() {
        k(this.b);
        return v(this.b) ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // defpackage.sx
    public final Layout.Alignment h() {
        return g();
    }

    @Override // defpackage.sx
    public final void l(Rect rect) {
        ComplicationData complicationData = this.a;
        k(rect);
        if (v(rect)) {
            if (complicationData.g() != null) {
                gi.h(rect, rect);
            }
        } else if (complicationData.g() == null) {
            gi.g(rect, rect);
        } else {
            gi.g(rect, rect);
            gi.h(rect, rect);
        }
    }

    @Override // defpackage.sx
    public final void m(Rect rect) {
        ComplicationData complicationData = this.a;
        k(rect);
        if (complicationData.g() == null) {
            rect.setEmpty();
        } else if (v(rect)) {
            gi.d(rect, rect);
        } else {
            gi.g(rect, rect);
            gi.d(rect, rect);
        }
    }

    @Override // defpackage.sx
    public final void q(Rect rect) {
        ComplicationData complicationData = this.a;
        k(rect);
        if (complicationData.d() == null || v(rect)) {
            rect.setEmpty();
        } else {
            gi.f(rect, rect);
        }
    }
}
