package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pry {
    DOUBLE(prz.DOUBLE, 1),
    FLOAT(prz.FLOAT, 5),
    INT64(prz.LONG, 0),
    UINT64(prz.LONG, 0),
    INT32(prz.INT, 0),
    FIXED64(prz.LONG, 1),
    FIXED32(prz.INT, 5),
    BOOL(prz.BOOLEAN, 0),
    STRING(prz.STRING, 2),
    GROUP(prz.MESSAGE, 3),
    MESSAGE(prz.MESSAGE, 2),
    BYTES(prz.BYTE_STRING, 2),
    UINT32(prz.INT, 0),
    ENUM(prz.ENUM, 0),
    SFIXED32(prz.INT, 5),
    SFIXED64(prz.LONG, 1),
    SINT32(prz.INT, 0),
    SINT64(prz.LONG, 0);

    public final prz s;
    public final int t;

    pry(prz przVar, int i) {
        this.s = przVar;
        this.t = i;
    }
}
