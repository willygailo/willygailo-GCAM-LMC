package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ndq implements ojz {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ ndq(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.ojz
    public final Object a() {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(qaj.a.a().c(this.a));
            case 1:
                return this.a.getSharedPreferences("primes", 0);
            case 2:
                return new ney(kty.a(this.a));
            default:
                Context context = this.a;
                int i = ner.c;
                return mzi.e(context);
        }
    }
}
