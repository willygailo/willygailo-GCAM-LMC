package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum kcx {
    BADGE("badge"),
    EDIT("edit"),
    INTERACT("interact"),
    LAUNCH("launch");

    private static final Set f;
    public final String e;

    static {
        kcx kcxVar = BADGE;
        kcx kcxVar2 = EDIT;
        kcx kcxVar3 = INTERACT;
        kcx kcxVar4 = LAUNCH;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(kcxVar.e, kcxVar2.e, kcxVar3.e)));
        f = setUnmodifiableSet;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        hashSet.add(kcxVar4.e);
        Collections.unmodifiableSet(hashSet);
    }

    kcx(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
