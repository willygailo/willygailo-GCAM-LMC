package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class abg implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ abf c;
    final /* synthetic */ int d;

    public abg(String str, Context context, abf abfVar, int i) {
        this.a = str;
        this.b = context;
        this.c = abfVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return abl.a(this.a, this.b, this.c, this.d);
    }
}
