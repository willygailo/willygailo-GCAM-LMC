package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public enum qcz implements Callable {
    INSTANCE;

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set call() {
        return new HashSet();
    }
}
