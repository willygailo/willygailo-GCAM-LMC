package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class nr extends eg {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ nt d;

    public nr(nt ntVar, int i, int i2, WeakReference weakReference) {
        this.d = ntVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.eg
    public final void a(Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        nt ntVar = this.d;
        WeakReference weakReference = this.c;
        if (ntVar.c) {
            ntVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (gl.U(textView)) {
                    textView.post(new ns(textView, typeface, ntVar.a));
                } else {
                    textView.setTypeface(typeface, ntVar.a);
                }
            }
        }
    }

    @Override // defpackage.eg
    public final void e() {
    }
}
