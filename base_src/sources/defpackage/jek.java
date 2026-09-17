package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class jek extends jea {
    public View d;
    public jen e;
    public Set f;

    public final void i(boolean z) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((jel) it.next()).l(z);
        }
    }
}
