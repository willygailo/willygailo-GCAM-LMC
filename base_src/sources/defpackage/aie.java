package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class aie {
    final int[] a;
    public final String[] b;
    final aid c;
    public final Set d;

    public aie(aid aidVar, int[] iArr, String[] strArr) {
        Set setUnmodifiableSet;
        this.c = aidVar;
        this.a = iArr;
        this.b = strArr;
        if (iArr.length == 1) {
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        } else {
            setUnmodifiableSet = null;
        }
        this.d = setUnmodifiableSet;
    }
}
