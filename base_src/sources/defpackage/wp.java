package defpackage;

import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes2.dex */
public final class wp {
    public Drawable a;
    public final /* synthetic */ CardView b;

    public wp(CardView cardView) {
        this.b = cardView;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.b.d.set(i, i2, i3, i4);
        CardView cardView = this.b;
        super/*android.widget.FrameLayout*/.setPadding(i + cardView.c.left, i2 + this.b.c.top, i3 + this.b.c.right, i4 + this.b.c.bottom);
    }

    public final boolean b() {
        return this.b.b;
    }

    public final boolean c() {
        return this.b.a;
    }
}
