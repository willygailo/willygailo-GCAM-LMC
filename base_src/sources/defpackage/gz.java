package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class gz extends ClickableSpan {
    private final int a;
    private final hb b;
    private final int c;

    public gz(int i, hb hbVar, int i2) {
        this.a = i;
        this.b = hbVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        hb hbVar = this.b;
        hbVar.a.performAction(this.c, bundle);
    }
}
