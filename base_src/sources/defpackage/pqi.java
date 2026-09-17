package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pqi {
    public static final plk a;
    public static final plk b;

    static {
        plk plkVar;
        try {
            plkVar = (plk) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            plkVar = null;
        }
        a = plkVar;
        b = new plk();
    }
}
