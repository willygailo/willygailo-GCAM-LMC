package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class kfc {
    public int a;
    public final ByteArrayOutputStream b = new ByteArrayOutputStream();
    final /* synthetic */ kfd c;

    public kfc(kfd kfdVar) {
        this.c = kfdVar;
    }

    public final byte[] a() {
        return this.b.toByteArray();
    }
}
