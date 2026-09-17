package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdf extends ppd implements pqn {
    public static final pdf c;
    private static volatile pqs d;
    public int a;
    public int b;

    static {
        pdf pdfVar = new pdf();
        c = pdfVar;
        ppd.F(pdf.class, pdfVar);
    }

    private pdf() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0000", new Object[]{"a", "b", pde.c()});
            case 3:
                return new pdf();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (pdf.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
