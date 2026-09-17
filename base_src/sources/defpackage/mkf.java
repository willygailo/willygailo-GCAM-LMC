package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mkf {
    public Boolean a;
    public Boolean b;
    public int c;
    public int d;
    private int e;

    public final mkg a() {
        Boolean bool;
        int i = this.c;
        if (i != 0 && (bool = this.a) != null && this.b != null && this.d != 0 && this.e != 0) {
            return new mkg(i, bool.booleanValue(), this.b.booleanValue(), this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" lastFrameDurationBehavior");
        }
        if (this.a == null) {
            sb.append(" editsEnabled");
        }
        if (this.b == null) {
            sb.append(" dynamicFtypEnabled");
        }
        if (this.d == 0) {
            sb.append(" mainFileBrand");
        }
        if (this.e == 0) {
            sb.append(" mp4MuxerType");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b() {
        this.e = 2;
    }
}
