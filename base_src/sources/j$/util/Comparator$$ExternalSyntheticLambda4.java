package j$.util;

import j$.lang.DesugarInteger$$ExternalSyntheticBackport0;
import j$.util.function.ToIntFunction;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Comparator$$ExternalSyntheticLambda4 implements Comparator, Serializable {
    public final /* synthetic */ ToIntFunction f$0;

    public /* synthetic */ Comparator$$ExternalSyntheticLambda4(ToIntFunction toIntFunction) {
        this.f$0 = toIntFunction;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ToIntFunction toIntFunction = this.f$0;
        return DesugarInteger$$ExternalSyntheticBackport0.m(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
    }
}
