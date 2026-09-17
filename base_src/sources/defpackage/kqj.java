package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kqj {
    private String a;
    private int b;
    private boolean c;
    private String d;
    private final byte[] e = new byte[0];

    public final kqk a() {
        return new kqk(this.a, this.b, this.c, this.d, 0, null, null, 0L, null, null, this.e, null);
    }

    public final void b(String str) {
        str.getClass();
        obr.aF(!str.isEmpty());
        this.d = str;
    }

    public final void c(int i) {
        this.b = i;
        this.c = true;
    }

    public final void d(String str) {
        str.getClass();
        obr.aF(!str.isEmpty());
        this.a = str;
    }
}
