package j$.util;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class DesugarLinkedHashSet {
    public static Spliterator spliterator(LinkedHashSet linkedHashSet) {
        return Spliterators.spliterator(linkedHashSet, 17);
    }
}
