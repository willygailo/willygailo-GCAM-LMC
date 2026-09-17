package defpackage;

import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class eom {
    final edd a;
    final hdv b;
    final int c;
    final mak d;
    final pih e;
    long m;
    eot n = null;
    final List f = new ArrayList();
    int k = 0;
    int l = 0;
    final pih g = pih.f();
    final pih h = pih.f();
    final ConditionVariable i = new ConditionVariable(true);
    final List j = new ArrayList();

    public eom(edd eddVar, hdv hdvVar, int i, mak makVar, pih pihVar) {
        this.a = eddVar;
        this.b = hdvVar;
        this.c = i;
        this.d = makVar;
        this.e = pihVar;
        this.m = hdvVar.b.b.d();
    }
}
