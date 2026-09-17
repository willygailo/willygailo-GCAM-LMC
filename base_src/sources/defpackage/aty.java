package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aty extends atv {
    public int b;
    public String c;
    public String d;

    public aty() {
        this.b = 2048;
        this.c = "\n";
        this.d = "  ";
    }

    public aty(int i) {
        super(i);
        this.b = 2048;
        this.c = "\n";
        this.d = "  ";
    }

    @Override // defpackage.atv
    protected final int a() {
        return 4976;
    }

    public final String b() {
        if (c()) {
            return "UTF-16BE";
        }
        return d() ? "UTF-16LE" : "UTF-8";
    }

    public final boolean c() {
        return (this.a & 3) == 2;
    }

    public final Object clone() {
        try {
            aty atyVar = new aty(this.a);
            atyVar.d = this.d;
            atyVar.c = this.c;
            atyVar.b = this.b;
            return atyVar;
        } catch (ass e) {
            return null;
        }
    }

    public final boolean d() {
        return (this.a & 3) == 3;
    }

    public final boolean i() {
        return h(512);
    }

    public final boolean j() {
        return h(256);
    }

    public final boolean k() {
        return h(16);
    }

    public final boolean l() {
        return h(32);
    }
}
