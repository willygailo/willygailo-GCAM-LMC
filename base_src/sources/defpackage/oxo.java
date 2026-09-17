package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum oxo {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static oxo a(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
        sb.append("invalid tag type: ");
        sb.append(strValueOf);
        throw new AssertionError(sb.toString());
    }
}
