package defpackage;

import j$.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cvm implements Predicate {
    public final /* synthetic */ lwd a;
    private final /* synthetic */ int b;

    public /* synthetic */ cvm(lwd lwdVar, int i) {
        this.b = i;
        this.a = lwdVar;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((cvn) obj).a == this.a;
            case 1:
                return ((cvn) obj).a == this.a;
            case 2:
                return ((cvn) obj).a == this.a;
            case 3:
                cvn cvnVar = (cvn) obj;
                return cvnVar.b && cvnVar.c && cvnVar.a == this.a;
            default:
                return ((cvn) obj).a == this.a;
        }
    }
}
