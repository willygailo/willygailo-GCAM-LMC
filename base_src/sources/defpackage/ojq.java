package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ojq {
    public final oir a;
    public final boolean b;
    private final ojp c;

    private ojq(ojp ojpVar) {
        this(ojpVar, false, oip.a);
    }

    private ojq(ojp ojpVar, boolean z, oir oirVar) {
        this.c = ojpVar;
        this.b = z;
        this.a = oirVar;
    }

    public static ojq b(char c) {
        return c(new oin(c));
    }

    public static ojq c(oir oirVar) {
        oirVar.getClass();
        return new ojq(new ojl(oirVar));
    }

    public static ojq d(String str) {
        obr.aG(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? b(str.charAt(0)) : new ojq(new ojn(str));
    }

    public final ojq a() {
        return new ojq(this.c, true, this.a);
    }

    public final Iterable e(CharSequence charSequence) {
        charSequence.getClass();
        return new ojo(this, charSequence);
    }

    public final Iterator f(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List g(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itF = f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add((String) itF.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
