package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class de {
    static final df a;
    public static final /* synthetic */ int b = 0;

    static {
        df dfVar;
        try {
            dfVar = (df) Class.forName("akg").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            dfVar = null;
        }
        a = dfVar;
    }
}
