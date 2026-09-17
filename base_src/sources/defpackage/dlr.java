package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dlr extends RuntimeException {
    public final List a;
    public final lju b;

    public dlr(String str, lju ljuVar, lwd... lwdVarArr) {
        super(str);
        this.a = Arrays.asList(lwdVarArr);
        this.b = ljuVar;
    }
}
