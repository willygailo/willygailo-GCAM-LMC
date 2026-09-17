package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class axq {
    private static final axo a = new axo("SysProps");

    public static String a() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "camera2.portability.force_api", "0");
        } catch (Exception e) {
            axp.b(a, "Exception while getting system property: ", e);
            return "0";
        }
    }
}
