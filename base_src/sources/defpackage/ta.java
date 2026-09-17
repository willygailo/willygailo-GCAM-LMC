package defpackage;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class ta extends sx {
    private final Rect b = new Rect();

    @Override // defpackage.sx
    public final void a(Rect rect) {
        if (this.a.c() == null) {
            rect.setEmpty();
            return;
        }
        k(rect);
        if (gi.j(rect)) {
            gi.f(rect, rect);
            return;
        }
        gi.e(rect, rect);
        gi.h(rect, rect);
        gi.e(rect, rect);
    }

    @Override // defpackage.sx
    public final int e() {
        ComplicationData complicationData = this.a;
        return (complicationData.i() == null || complicationData.c() != null) ? 16 : 80;
    }

    @Override // defpackage.sx
    public final int f() {
        return 48;
    }

    @Override // defpackage.sx
    public final Layout.Alignment i() {
        ComplicationData complicationData = this.a;
        k(this.b);
        return (!gi.j(this.b) || complicationData.c() == null) ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // defpackage.sx
    public final Layout.Alignment j() {
        return i();
    }

    @Override // defpackage.sx
    public final void o(Rect rect) {
        ComplicationData complicationData = this.a;
        k(rect);
        if (complicationData.c() == null) {
            if (complicationData.i() != null) {
                gi.h(rect, rect);
            }
        } else if (gi.j(rect)) {
            gi.g(rect, rect);
        } else {
            gi.e(rect, rect);
            gi.d(rect, rect);
        }
    }

    @Override // defpackage.sx
    public final void p(Rect rect) {
        ComplicationData complicationData = this.a;
        if (complicationData.c() != null || complicationData.i() == null) {
            rect.setEmpty();
        } else {
            k(rect);
            gi.d(rect, rect);
        }
    }
}
