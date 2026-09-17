package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class jeg extends jea {
    public View f;
    public jen g;
    public jen h;
    public Set i;

    public final void i(boolean z) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((jel) it.next()).l(z);
        }
    }
}
