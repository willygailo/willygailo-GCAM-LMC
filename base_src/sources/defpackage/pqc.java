package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pqc implements pqk {
    public static final pqc a = new pqc(1);
    private final /* synthetic */ int b;

    public pqc(int i) {
        this.b = i;
    }

    @Override // defpackage.pqk
    public final pqj a(Class cls) {
        switch (this.b) {
            case 0:
                throw new IllegalStateException("This should never be called.");
            default:
                if (!ppd.class.isAssignableFrom(cls)) {
                    String strValueOf = String.valueOf(cls.getName());
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
                }
                try {
                    Class clsAsSubclass = cls.asSubclass(ppd.class);
                    ppd ppdVar = (ppd) ppd.aE.get(clsAsSubclass);
                    if (ppdVar == null) {
                        try {
                            Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                            ppdVar = (ppd) ppd.aE.get(clsAsSubclass);
                        } catch (ClassNotFoundException e) {
                            throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
                    if (ppdVar == null) {
                        ppdVar = (ppd) ((ppd) prv.g(clsAsSubclass)).G(6);
                        if (ppdVar == null) {
                            throw new IllegalStateException();
                        }
                        ppd.aE.put(clsAsSubclass, ppdVar);
                    }
                    return (pqj) ppdVar.G(3);
                } catch (Exception e2) {
                    String strValueOf2 = String.valueOf(cls.getName());
                    throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e2);
                }
        }
    }

    @Override // defpackage.pqk
    public final boolean b(Class cls) {
        switch (this.b) {
            case 0:
                return false;
            default:
                return ppd.class.isAssignableFrom(cls);
        }
    }
}
