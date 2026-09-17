package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class ct implements cs {
    final int a;
    final /* synthetic */ cu b;

    public ct(cu cuVar, int i) {
        this.b = cuVar;
        this.a = i;
    }

    @Override // defpackage.cs
    public final boolean f(ArrayList arrayList, ArrayList arrayList2) {
        return this.b.W(arrayList, arrayList2, this.a, 1);
    }
}
