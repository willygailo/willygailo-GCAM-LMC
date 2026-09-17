package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nlq implements oiu {
    private final /* synthetic */ int d;
    public static final /* synthetic */ nlq c = new nlq(2);
    public static final /* synthetic */ nlq b = new nlq(1);
    public static final /* synthetic */ nlq a = new nlq(0);

    private /* synthetic */ nlq(int i) {
        this.d = i;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        switch (this.d) {
            case 0:
                pnc pncVar = ((pnj) obj).c;
                return pncVar == null ? pnc.g : pncVar;
            case 1:
                return Float.valueOf(((pnc) obj).f);
            default:
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                double dFloatValue = f.floatValue();
                boolean z = false;
                if (!Double.isInfinite(dFloatValue) && !Double.isNaN(dFloatValue)) {
                    z = true;
                }
                obr.aG(z, "to must be finite");
                obr.aG(true, "multiple cannot be 0");
                int iAbs = Math.abs(90);
                double d = iAbs;
                Double.isNaN(dFloatValue);
                Double.isNaN(d);
                int i = ((int) (dFloatValue / d)) * iAbs;
                int iSignum = (((int) Math.signum(dFloatValue)) * iAbs) + i;
                double d2 = i;
                Double.isNaN(dFloatValue);
                Double.isNaN(d2);
                double dAbs = Math.abs(dFloatValue - d2);
                double d3 = iSignum;
                Double.isNaN(dFloatValue);
                Double.isNaN(d3);
                if (dAbs >= Math.abs(dFloatValue - d3)) {
                    i = iSignum;
                }
                return Float.valueOf(Math.abs(fFloatValue - i));
        }
    }
}
