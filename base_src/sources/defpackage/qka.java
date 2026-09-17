package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class qka {
    public static final qbt a;
    public static final qbt b;

    static {
        ogr ogrVar = new ogr(5);
        qco qcoVar = qmd.d;
        a = qmd.Q(ogrVar);
        ogr ogrVar2 = new ogr(2);
        qco qcoVar2 = qmd.c;
        b = qmd.Q(ogrVar2);
        ogr ogrVar3 = new ogr(3);
        qco qcoVar3 = qmd.e;
        qmd.Q(ogrVar3);
        int i = qjd.a;
        ogr ogrVar4 = new ogr(4);
        qco qcoVar4 = qmd.f;
        qmd.Q(ogrVar4);
    }

    public static qbt a(Executor executor) {
        return new qio(executor);
    }
}
