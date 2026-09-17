package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class aic {
    final long[] a;
    final boolean[] b;
    final int[] c;
    boolean d;
    boolean e;

    public aic(int i) {
        long[] jArr = new long[i];
        this.a = jArr;
        boolean[] zArr = new boolean[i];
        this.b = zArr;
        this.c = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }
}
