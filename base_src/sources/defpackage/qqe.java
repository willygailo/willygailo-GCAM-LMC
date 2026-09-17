package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqe extends qnp implements qmu {
    private final /* synthetic */ int f;
    public static final qqe e = new qqe(4);
    public static final qqe d = new qqe(3);
    public static final qqe c = new qqe(2);
    public static final qqe b = new qqe(1);
    public static final qqe a = new qqe(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqe(int i) {
        super(1);
        this.f = i;
    }

    @Override // defpackage.qmu
    public final /* synthetic */ Object a(Object obj) {
        switch (this.f) {
            case 0:
                qlk qlkVar = (qlk) obj;
                qlkVar.getClass();
                if (qlkVar instanceof qqf) {
                    return (qqf) qlkVar;
                }
                return null;
            case 1:
                String str = (String) obj;
                str.getClass();
                return str;
            case 2:
                qlk qlkVar2 = (qlk) obj;
                qlkVar2.getClass();
                if (qlkVar2 instanceof qqx) {
                    return (qqx) qlkVar2;
                }
                return null;
            case 3:
                ((Throwable) obj).getClass();
                return null;
            default:
                ((Throwable) obj).getClass();
                return null;
        }
    }
}
