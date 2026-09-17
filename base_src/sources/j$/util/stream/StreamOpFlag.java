package j$.util.stream;

import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
final class StreamOpFlag {
    private static final /* synthetic */ StreamOpFlag[] $VALUES;
    public static final StreamOpFlag DISTINCT;
    private static final int FLAG_MASK;
    private static final int FLAG_MASK_IS;
    private static final int FLAG_MASK_NOT;
    static final int INITIAL_OPS_VALUE;
    static final int IS_DISTINCT;
    static final int IS_ORDERED;
    static final int IS_SHORT_CIRCUIT;
    static final int IS_SIZED;
    static final int IS_SORTED;
    static final int NOT_DISTINCT;
    static final int NOT_ORDERED;
    static final int NOT_SIZED;
    static final int NOT_SORTED;
    static final int OP_MASK;
    public static final StreamOpFlag ORDERED;
    public static final StreamOpFlag SHORT_CIRCUIT;
    public static final StreamOpFlag SIZED;
    public static final StreamOpFlag SORTED;
    static final int SPLITERATOR_CHARACTERISTICS_MASK;
    static final int STREAM_MASK;
    static final int TERMINAL_OP_MASK;
    static final int UPSTREAM_TERMINAL_OP_MASK;
    private final int bitPosition;
    private final int clear;
    private final Map maskTable;
    private final int preserve;
    private final int set;

    class MaskBuilder {
        final Map map;

        MaskBuilder(Map map) {
            this.map = map;
        }

        Map build() {
            for (Type type : Type.values()) {
                j$.util.Map.EL.putIfAbsent(this.map, type, 0);
            }
            return this.map;
        }

        MaskBuilder clear(Type type) {
            return mask(type, 2);
        }

        MaskBuilder mask(Type type, Integer num) {
            this.map.put(type, num);
            return this;
        }

        MaskBuilder set(Type type) {
            return mask(type, 1);
        }

        MaskBuilder setAndClear(Type type) {
            return mask(type, 3);
        }
    }

    enum Type {
        SPLITERATOR,
        STREAM,
        OP,
        TERMINAL_OP,
        UPSTREAM_TERMINAL_OP
    }

    private static /* synthetic */ StreamOpFlag[] $values() {
        return new StreamOpFlag[]{DISTINCT, SORTED, ORDERED, SIZED, SHORT_CIRCUIT};
    }

    static {
        Type type = Type.SPLITERATOR;
        MaskBuilder maskBuilder = set(type);
        Type type2 = Type.STREAM;
        MaskBuilder maskBuilder2 = maskBuilder.set(type2);
        Type type3 = Type.OP;
        StreamOpFlag streamOpFlag = new StreamOpFlag("DISTINCT", 0, 0, maskBuilder2.setAndClear(type3));
        DISTINCT = streamOpFlag;
        StreamOpFlag streamOpFlag2 = new StreamOpFlag("SORTED", 1, 1, set(type).set(type2).setAndClear(type3));
        SORTED = streamOpFlag2;
        MaskBuilder andClear = set(type).set(type2).setAndClear(type3);
        Type type4 = Type.TERMINAL_OP;
        MaskBuilder maskBuilderClear = andClear.clear(type4);
        Type type5 = Type.UPSTREAM_TERMINAL_OP;
        StreamOpFlag streamOpFlag3 = new StreamOpFlag("ORDERED", 2, 2, maskBuilderClear.clear(type5));
        ORDERED = streamOpFlag3;
        StreamOpFlag streamOpFlag4 = new StreamOpFlag("SIZED", 3, 3, set(type).set(type2).clear(type3));
        SIZED = streamOpFlag4;
        StreamOpFlag streamOpFlag5 = new StreamOpFlag("SHORT_CIRCUIT", 4, 12, set(type3).set(type4));
        SHORT_CIRCUIT = streamOpFlag5;
        $VALUES = $values();
        SPLITERATOR_CHARACTERISTICS_MASK = createMask(type);
        int iCreateMask = createMask(type2);
        STREAM_MASK = iCreateMask;
        OP_MASK = createMask(type3);
        TERMINAL_OP_MASK = createMask(type4);
        UPSTREAM_TERMINAL_OP_MASK = createMask(type5);
        FLAG_MASK = createFlagMask();
        FLAG_MASK_IS = iCreateMask;
        int i = iCreateMask << 1;
        FLAG_MASK_NOT = i;
        INITIAL_OPS_VALUE = iCreateMask | i;
        IS_DISTINCT = streamOpFlag.set;
        NOT_DISTINCT = streamOpFlag.clear;
        IS_SORTED = streamOpFlag2.set;
        NOT_SORTED = streamOpFlag2.clear;
        IS_ORDERED = streamOpFlag3.set;
        NOT_ORDERED = streamOpFlag3.clear;
        IS_SIZED = streamOpFlag4.set;
        NOT_SIZED = streamOpFlag4.clear;
        IS_SHORT_CIRCUIT = streamOpFlag5.set;
    }

    private StreamOpFlag(String str, int i, int i2, MaskBuilder maskBuilder) {
        super(str, i);
        this.maskTable = maskBuilder.build();
        int i3 = i2 * 2;
        this.bitPosition = i3;
        this.set = 1 << i3;
        this.clear = 2 << i3;
        this.preserve = 3 << i3;
    }

    static int combineOpFlags(int i, int i2) {
        return i | (i2 & getMask(i));
    }

    private static int createFlagMask() {
        int i = 0;
        for (StreamOpFlag streamOpFlag : values()) {
            i |= streamOpFlag.preserve;
        }
        return i;
    }

    private static int createMask(Type type) {
        int iIntValue = 0;
        for (StreamOpFlag streamOpFlag : values()) {
            iIntValue |= ((Integer) streamOpFlag.maskTable.get(type)).intValue() << streamOpFlag.bitPosition;
        }
        return iIntValue;
    }

    static int fromCharacteristics(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        return ((iCharacteristics & 4) == 0 || spliterator.getComparator() == null) ? SPLITERATOR_CHARACTERISTICS_MASK & iCharacteristics : SPLITERATOR_CHARACTERISTICS_MASK & iCharacteristics & (-5);
    }

    private static int getMask(int i) {
        if (i == 0) {
            return FLAG_MASK;
        }
        return (((i & FLAG_MASK_NOT) >> 1) | (((FLAG_MASK_IS & i) << 1) | i)) ^ (-1);
    }

    private static MaskBuilder set(Type type) {
        return new MaskBuilder(new EnumMap(Type.class)).set(type);
    }

    static int toCharacteristics(int i) {
        return i & SPLITERATOR_CHARACTERISTICS_MASK;
    }

    static int toStreamFlags(int i) {
        return i & ((i ^ (-1)) >> 1) & FLAG_MASK_IS;
    }

    public static StreamOpFlag[] values() {
        return (StreamOpFlag[]) $VALUES.clone();
    }

    boolean isKnown(int i) {
        return (i & this.preserve) == this.set;
    }

    boolean isPreserved(int i) {
        int i2 = this.preserve;
        return (i & i2) == i2;
    }
}
