package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class atr {
    private final List a = new ArrayList(5);

    public final int a() {
        return this.a.size();
    }

    public final ats b(int i) {
        return (ats) this.a.get(i);
    }

    public final void c(ats atsVar) {
        this.a.add(atsVar);
    }

    public final String toString() {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 1; i2 < a(); i2++) {
            stringBuffer.append(b(i2));
            if (i2 < a() - 1 && ((i = b(i2 + 1).b) == 1 || i == 2)) {
                stringBuffer.append('/');
            }
        }
        return stringBuffer.toString();
    }
}
