package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, TemporalAdjuster, Comparable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final transient String id;
    private final int totalSeconds;
    private static final ConcurrentMap SECONDS_CACHE = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentMap ID_CACHE = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);
    public static final ZoneOffset MIN = ofTotalSeconds(-64800);
    public static final ZoneOffset MAX = ofTotalSeconds(64800);

    private ZoneOffset(int i) {
        this.totalSeconds = i;
        this.id = buildId(i);
    }

    private static String buildId(int i) {
        if (i == 0) {
            return "Z";
        }
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder();
        int i2 = iAbs / 3600;
        int i3 = (iAbs / 60) % 60;
        sb.append(i < 0 ? "-" : "+");
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        sb.append(i3 < 10 ? ":0" : ":");
        sb.append(i3);
        int i4 = iAbs % 60;
        if (i4 != 0) {
            sb.append(i4 >= 10 ? ":" : ":0");
            sb.append(i4);
        }
        return sb.toString();
    }

    public static ZoneOffset from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.query(TemporalQueries.offset());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        String strValueOf = String.valueOf(temporalAccessor);
        String name = temporalAccessor.getClass().getName();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 60 + name.length());
        sb.append("Unable to obtain ZoneOffset from TemporalAccessor: ");
        sb.append(strValueOf);
        sb.append(" of type ");
        sb.append(name);
        throw new DateTimeException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    public static ZoneOffset of(String str) {
        int number;
        int number2;
        int number3;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ID_CACHE.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length != 5) {
                    if (length == 6) {
                        number = parseNumber(str, 1, false);
                        number2 = parseNumber(str, 4, true);
                    } else if (length == 7) {
                        number = parseNumber(str, 1, false);
                        int number4 = parseNumber(str, 3, false);
                        number3 = parseNumber(str, 5, false);
                        number2 = number4;
                    } else {
                        if (length != 9) {
                            throw new DateTimeException(str.length() != 0 ? "Invalid ID for ZoneOffset, invalid format: ".concat(str) : new String("Invalid ID for ZoneOffset, invalid format: "));
                        }
                        number = parseNumber(str, 1, false);
                        number2 = parseNumber(str, 4, true);
                        number3 = parseNumber(str, 7, true);
                    }
                    cCharAt = str.charAt(0);
                    if (cCharAt != '+' || cCharAt == '-') {
                        return cCharAt == '-' ? ofHoursMinutesSeconds(-number, -number2, -number3) : ofHoursMinutesSeconds(number, number2, number3);
                    }
                    throw new DateTimeException(str.length() != 0 ? "Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str) : new String("Invalid ID for ZoneOffset, plus/minus not found when expected: "));
                }
                number = parseNumber(str, 1, false);
                number2 = parseNumber(str, 3, false);
            }
            number3 = 0;
            cCharAt = str.charAt(0);
            if (cCharAt != '+') {
            }
            if (cCharAt == '-') {
            }
        }
        char cCharAt2 = str.charAt(0);
        char cCharAt3 = str.charAt(1);
        StringBuilder sb = new StringBuilder(3);
        sb.append(cCharAt2);
        sb.append("0");
        sb.append(cCharAt3);
        str = sb.toString();
        number = parseNumber(str, 1, false);
        number2 = 0;
        number3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    public static ZoneOffset ofHoursMinutesSeconds(int i, int i2, int i3) {
        validate(i, i2, i3);
        return ofTotalSeconds(totalSeconds(i, i2, i3));
    }

    public static ZoneOffset ofTotalSeconds(int i) {
        if (i < -64800 || i > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentMap concurrentMap = SECONDS_CACHE;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentMap.putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(numValueOf);
        ID_CACHE.putIfAbsent(zoneOffset2.getId(), zoneOffset2);
        return zoneOffset2;
    }

    private static int parseNumber(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            String strValueOf = String.valueOf(charSequence);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
            sb.append("Invalid ID for ZoneOffset, colon not found when expected: ");
            sb.append(strValueOf);
            throw new DateTimeException(sb.toString());
        }
        char cCharAt = charSequence.charAt(i);
        char cCharAt2 = charSequence.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return ((cCharAt - '0') * 10) + (cCharAt2 - '0');
        }
        String strValueOf2 = String.valueOf(charSequence);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 57);
        sb2.append("Invalid ID for ZoneOffset, non numeric characters found: ");
        sb2.append(strValueOf2);
        throw new DateTimeException(sb2.toString());
    }

    static ZoneOffset readExternal(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(b * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static int totalSeconds(int i, int i2, int i3) {
        return (i * 3600) + (i2 * 60) + i3;
    }

    private static void validate(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            StringBuilder sb = new StringBuilder(85);
            sb.append("Zone offset hours not in valid range: value ");
            sb.append(i);
            sb.append(" is not in the range -18 to 18");
            throw new DateTimeException(sb.toString());
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            StringBuilder sb2 = new StringBuilder(87);
            sb2.append("Zone offset minutes not in valid range: value ");
            sb2.append(i2);
            sb2.append(" is not in the range -59 to 59");
            throw new DateTimeException(sb2.toString());
        }
        if (i3 >= -59 && i3 <= 59) {
            if (Math.abs(i) == 18 && (i2 | i3) != 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
        } else {
            StringBuilder sb3 = new StringBuilder(87);
            sb3.append("Zone offset seconds not in valid range: value ");
            sb3.append(i3);
            sb3.append(" is not in the range -59 to 59");
            throw new DateTimeException(sb3.toString());
        }
    }

    private Object writeReplace() {
        return new Ser((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.OFFSET_SECONDS, this.totalSeconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.totalSeconds - this.totalSeconds;
    }

    @Override // j$.time.ZoneId
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.totalSeconds == ((ZoneOffset) obj).totalSeconds;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.totalSeconds;
        }
        if (!(temporalField instanceof ChronoField)) {
            return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
        }
        String strValueOf = String.valueOf(temporalField);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 19);
        sb.append("Unsupported field: ");
        sb.append(strValueOf);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    @Override // j$.time.ZoneId
    public String getId() {
        return this.id;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.totalSeconds;
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        String strValueOf = String.valueOf(temporalField);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 19);
        sb.append("Unsupported field: ");
        sb.append(strValueOf);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    @Override // j$.time.ZoneId
    public ZoneRules getRules() {
        return ZoneRules.of(this);
    }

    public int getTotalSeconds() {
        return this.totalSeconds;
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.totalSeconds;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        return (temporalQuery == TemporalQueries.offset() || temporalQuery == TemporalQueries.zone()) ? this : TemporalAccessor.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return TemporalAccessor.CC.$default$range(this, temporalField);
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.id;
    }

    @Override // j$.time.ZoneId
    void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        writeExternal(dataOutput);
    }

    void writeExternal(DataOutput dataOutput) {
        int i = this.totalSeconds;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }
}
