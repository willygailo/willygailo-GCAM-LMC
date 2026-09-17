package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pot {
    public static final plk a = new plk();
    private static final plk b;

    static {
        plk plkVar;
        try {
            plkVar = (plk) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            plkVar = null;
        }
        b = plkVar;
    }

    static plk a() {
        plk plkVar = b;
        if (plkVar != null) {
            return plkVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
