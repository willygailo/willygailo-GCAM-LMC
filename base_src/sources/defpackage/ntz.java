package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ntz {
    public static final Set a;
    public static final Set b;
    public static final qmu c;

    static {
        Set setH = qmd.H(new nnr[]{nnr.UPLOAD_PENDING, nnr.UPLOAD_IN_PROGRESS, nnr.UPLOAD_PAUSED});
        a = setH;
        nnr nnrVar = nnr.UPLOADED_TO_F250;
        setH.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(qmd.o(setH.size() + 1));
        linkedHashSet.addAll(setH);
        linkedHashSet.add(nnrVar);
        b = linkedHashSet;
        c = noj.r;
    }
}
