package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lny {
    private loa a;
    private ojc b;
    private ojc c;
    private lig d;
    private Integer e;
    private Integer f;
    private ojc g;
    private Boolean h;
    private Boolean i;

    public lny() {
    }

    public lny(byte[] bArr) {
        this.b = oih.a;
        this.c = oih.a;
        this.g = oih.a;
    }

    public final lnz a() {
        lig ligVar;
        Integer num;
        loa loaVar = this.a;
        if (loaVar != null && (ligVar = this.d) != null && (num = this.e) != null && this.f != null && this.h != null && this.i != null) {
            lnz lnzVar = new lnz(loaVar, this.b, this.c, ligVar, num.intValue(), this.f.intValue(), this.g, this.h.booleanValue(), this.i.booleanValue());
            int i = lnzVar.f;
            boolean z = i > 0 || i == -1;
            obr.aR(z, "Capacity should be positive or -1");
            obr.aR(lnzVar.d.b() > 0, "Size area must be positive");
            obr.aR(lnzVar.e >= 0, "Format must be valid");
            obr.aR(lnzVar.a != null, "StreamType cannot be null");
            obr.aR(lnzVar.d != null, "Size cannot be null");
            return lnzVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.d == null) {
            sb.append(" size");
        }
        if (this.e == null) {
            sb.append(" imageFormat");
        }
        if (this.f == null) {
            sb.append(" capacity");
        }
        if (this.h == null) {
            sb.append(" forCapture");
        }
        if (this.i == null) {
            sb.append(" ignoreMemoryLimits");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(lvs lvsVar) {
        this.b = ojc.i(lvsVar);
    }

    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void d(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void f(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void g(lig ligVar) {
        if (ligVar == null) {
            throw new NullPointerException("Null size");
        }
        this.d = ligVar;
    }

    public final void h(loa loaVar) {
        if (loaVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = loaVar;
    }

    public final void i(long j) {
        this.g = ojc.i(Long.valueOf(j));
    }
}
