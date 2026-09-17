package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cch {
    public final Context a;
    public final ExecutorService b;
    public final List c;
    public final mdf d;
    public final Random e = new Random();
    public int f = 10000;
    public boolean g = false;

    public cch(Context context, ExecutorService executorService, mdf mdfVar, List list) {
        this.a = context;
        this.b = executorService;
        this.d = mdfVar;
        this.c = list;
    }
}
