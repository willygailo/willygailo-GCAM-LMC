package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bfv implements bfh {
    public static final bfv a = new bfv(1, null);
    private final /* synthetic */ int b;

    public bfv(int i) {
        this.b = i;
    }

    @Deprecated
    public bfv(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.bfh
    public final bfg b(bfn bfnVar) {
        switch (this.b) {
            case 0:
                return new bfw(bfnVar.a(bev.class, InputStream.class));
            case 1:
                return bfl.a;
            default:
                return new bge(bfnVar.a(bev.class, InputStream.class), 0);
        }
    }
}
