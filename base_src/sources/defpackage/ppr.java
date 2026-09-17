package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ppr {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(poc.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        poc pocVar = poc.b;
    }

    ppr(Class cls) {
        this.k = cls;
    }
}
