package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class mpf implements Callable {
    final /* synthetic */ mtu a;
    private final /* synthetic */ int b;

    public mpf(mtu mtuVar, int i) {
        this.b = i;
        this.a = mtuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.b) {
            case 0:
                break;
        }
        return mqv.b(this.a);
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                String strValueOf = String.valueOf(((mrf) this.a.c()).b());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
                sb.append("createCanvasForTexture(");
                sb.append(strValueOf);
                sb.append(")");
                return sb.toString();
            default:
                String strValueOf2 = String.valueOf(((mrf) this.a.c()).b());
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 24);
                sb2.append("createCanvasForTexture(");
                sb2.append(strValueOf2);
                sb2.append(")");
                return sb2.toString();
        }
    }
}
