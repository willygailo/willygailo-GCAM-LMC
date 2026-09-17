package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ahy {
    public final ajt a;
    public final Context b;
    public final String c;
    public final aih d;
    public final List e;
    public final List f = Collections.emptyList();
    public final List g = Collections.emptyList();
    public final boolean h;
    public final Executor i;
    public final Executor j;
    public final boolean k;
    public final boolean l;
    public final int m;

    public ahy(Context context, String str, ajt ajtVar, aih aihVar, List list, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.a = ajtVar;
        this.b = context;
        this.c = str;
        this.d = aihVar;
        this.e = list;
        this.h = z;
        this.m = i;
        this.i = executor;
        this.j = executor2;
        this.k = z2;
        this.l = z3;
    }
}
