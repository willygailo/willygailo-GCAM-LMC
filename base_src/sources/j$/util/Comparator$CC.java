package j$.util;

import j$.util.function.Function;
import j$.util.function.ToIntFunction;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Comparator$CC {
    public static Comparator $default$thenComparing(Comparator comparator, Function function) {
        return $default$thenComparing(comparator, comparing(function));
    }

    public static Comparator $default$thenComparing(Comparator comparator, Comparator comparator2) {
        comparator2.getClass();
        return new Comparator$$ExternalSyntheticLambda0(comparator, comparator2);
    }

    public static Comparator comparing(Function function) {
        function.getClass();
        return new Comparator$$ExternalSyntheticLambda2(function);
    }

    public static Comparator comparingInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new Comparator$$ExternalSyntheticLambda4(toIntFunction);
    }

    public static /* synthetic */ int lambda$thenComparing$36697e65$1(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }
}
