package defpackage;

import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class idg implements Predicate {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Function b;
    private final /* synthetic */ int c;

    public /* synthetic */ idg(Map map, Function function, int i) {
        this.c = i;
        this.a = map;
        this.b = function;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.c) {
            case 0:
                return j$.util.Map.EL.putIfAbsent(this.a, this.b.apply(obj), Boolean.TRUE) == null;
            case 1:
                Map map = this.a;
                Function function = this.b;
                int i = icf.d;
                return j$.util.Map.EL.putIfAbsent(map, function.apply(obj), Boolean.TRUE) == null;
            case 2:
                return j$.util.Map.EL.putIfAbsent(this.a, this.b.apply(obj), Boolean.TRUE) == null;
            default:
                Map map2 = this.a;
                Function function2 = this.b;
                ouj oujVar = iec.a;
                return j$.util.Map.EL.putIfAbsent(map2, function2.apply(obj), Boolean.TRUE) == null;
        }
    }
}
