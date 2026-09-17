package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class ncd {
    public final int c;
    public final short[] a = new short[256];
    public final short[] b = new short[256];
    public long d = 0;

    public ncd(Random random) {
        this.c = (random.nextInt() & (-131075)) | 65537;
    }
}
