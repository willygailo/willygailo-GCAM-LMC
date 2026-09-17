package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pov {
    DOUBLE(0, 1, ppr.DOUBLE),
    FLOAT(1, 1, ppr.FLOAT),
    INT64(2, 1, ppr.LONG),
    UINT64(3, 1, ppr.LONG),
    INT32(4, 1, ppr.INT),
    FIXED64(5, 1, ppr.LONG),
    FIXED32(6, 1, ppr.INT),
    BOOL(7, 1, ppr.BOOLEAN),
    STRING(8, 1, ppr.STRING),
    MESSAGE(9, 1, ppr.MESSAGE),
    BYTES(10, 1, ppr.BYTE_STRING),
    UINT32(11, 1, ppr.INT),
    ENUM(12, 1, ppr.ENUM),
    SFIXED32(13, 1, ppr.INT),
    SFIXED64(14, 1, ppr.LONG),
    SINT32(15, 1, ppr.INT),
    SINT64(16, 1, ppr.LONG),
    GROUP(17, 1, ppr.MESSAGE),
    DOUBLE_LIST(18, 2, ppr.DOUBLE),
    FLOAT_LIST(19, 2, ppr.FLOAT),
    INT64_LIST(20, 2, ppr.LONG),
    UINT64_LIST(21, 2, ppr.LONG),
    INT32_LIST(22, 2, ppr.INT),
    FIXED64_LIST(23, 2, ppr.LONG),
    FIXED32_LIST(24, 2, ppr.INT),
    BOOL_LIST(25, 2, ppr.BOOLEAN),
    STRING_LIST(26, 2, ppr.STRING),
    MESSAGE_LIST(27, 2, ppr.MESSAGE),
    BYTES_LIST(28, 2, ppr.BYTE_STRING),
    UINT32_LIST(29, 2, ppr.INT),
    ENUM_LIST(30, 2, ppr.ENUM),
    SFIXED32_LIST(31, 2, ppr.INT),
    SFIXED64_LIST(32, 2, ppr.LONG),
    SINT32_LIST(33, 2, ppr.INT),
    SINT64_LIST(34, 2, ppr.LONG),
    DOUBLE_LIST_PACKED(35, 3, ppr.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, ppr.FLOAT),
    INT64_LIST_PACKED(37, 3, ppr.LONG),
    UINT64_LIST_PACKED(38, 3, ppr.LONG),
    INT32_LIST_PACKED(39, 3, ppr.INT),
    FIXED64_LIST_PACKED(40, 3, ppr.LONG),
    FIXED32_LIST_PACKED(41, 3, ppr.INT),
    BOOL_LIST_PACKED(42, 3, ppr.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, ppr.INT),
    ENUM_LIST_PACKED(44, 3, ppr.ENUM),
    SFIXED32_LIST_PACKED(45, 3, ppr.INT),
    SFIXED64_LIST_PACKED(46, 3, ppr.LONG),
    SINT32_LIST_PACKED(47, 3, ppr.INT),
    SINT64_LIST_PACKED(48, 3, ppr.LONG),
    GROUP_LIST(49, 2, ppr.MESSAGE),
    MAP(50, 4, ppr.VOID);

    private static final pov[] aa;
    public final int Z;

    static {
        pov[] povVarArrValues = values();
        aa = new pov[povVarArrValues.length];
        for (pov povVar : povVarArrValues) {
            aa[povVar.Z] = povVar;
        }
    }

    pov(int i, int i2, ppr pprVar) {
        this.Z = i;
        ppr pprVar2 = ppr.VOID;
        switch (i2 - 1) {
            case 1:
            case 3:
                Class cls = pprVar.k;
                break;
        }
        if (i2 == 1) {
            pprVar.ordinal();
        }
    }
}
