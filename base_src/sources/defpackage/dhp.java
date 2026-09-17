package defpackage;

import j$.util.function.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dhp implements Predicate {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ dhp(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
            case 0:
                break;
        }
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.b) {
            case 0:
                break;
        }
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
            case 0:
                break;
        }
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                long j = this.a;
                int i = dhs.k;
                return ((Long) obj).longValue() < j;
            default:
                return this.a - ((Long) ((Map.Entry) obj).getValue()).longValue() > 3000;
        }
    }
}
