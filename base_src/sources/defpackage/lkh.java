package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lkh {
    public final lju a;
    public final String b;
    public final int c;

    public lkh(int i) {
        this.c = i;
        this.a = lju.CAMERA_ERROR_CODE_UNKNOWN;
        this.b = lju.CAMERA_ERROR_CODE_UNKNOWN.c();
    }

    public lkh(int i, lju ljuVar, String str) {
        this.c = i;
        this.a = ljuVar;
        this.b = str == null ? lju.CAMERA_ERROR_CODE_UNKNOWN.c() : str;
    }
}
