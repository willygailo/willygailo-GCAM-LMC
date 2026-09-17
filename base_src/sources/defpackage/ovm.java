package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ovm {
    STRING('s', ovo.GENERAL, "-#", true),
    BOOLEAN('b', ovo.BOOLEAN, "-", true),
    CHAR('c', ovo.CHARACTER, "-", true),
    DECIMAL('d', ovo.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', ovo.INTEGRAL, "-#0(", false),
    HEX('x', ovo.INTEGRAL, "-#0(", true),
    FLOAT('f', ovo.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', ovo.FLOAT, "-#0+ (", true),
    GENERAL('g', ovo.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', ovo.FLOAT, "-#0+ ", true);

    public static final ovm[] k = new ovm[26];
    public final char l;
    public final ovo m;
    public final int n;
    public final String o;

    static {
        for (ovm ovmVar : values()) {
            k[a(ovmVar.l)] = ovmVar;
        }
    }

    ovm(char c, ovo ovoVar, String str, boolean z) {
        this.l = c;
        this.m = ovoVar;
        this.n = ovn.a(str, z);
        StringBuilder sb = new StringBuilder(2);
        sb.append("%");
        sb.append(c);
        this.o = sb.toString();
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
