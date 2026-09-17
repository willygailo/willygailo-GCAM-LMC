package j$.util;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: j$.util.SortedSet$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class SortedSet$CC {
    public static Spliterator $default$spliterator(final SortedSet sortedSet) {
        final int i = 21;
        return new Spliterators.IteratorSpliterator(sortedSet, i) { // from class: j$.util.SortedSet$1
            @Override // j$.util.Spliterators.IteratorSpliterator, j$.util.Spliterator
            public Comparator getComparator() {
                return sortedSet.comparator();
            }
        };
    }
}
