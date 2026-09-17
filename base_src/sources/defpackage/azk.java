package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class azk implements azn {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ bct b;

    public azk(ByteBuffer byteBuffer, bct bctVar) {
        this.a = byteBuffer;
        this.b = bctVar;
    }

    @Override // defpackage.azn
    public final int a(azg azgVar) {
        return azgVar.b(this.a, this.b);
    }
}
