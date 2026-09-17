package j$.time.temporal;

import j$.time.DateTimeException;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalAccessor {

    /* JADX INFO: renamed from: j$.time.temporal.TemporalAccessor$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static int $default$get(TemporalAccessor temporalAccessor, TemporalField temporalField) {
            ValueRange valueRangeRange = temporalAccessor.range(temporalField);
            if (!valueRangeRange.isIntValue()) {
                String strValueOf = String.valueOf(temporalField);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 54);
                sb.append("Invalid field ");
                sb.append(strValueOf);
                sb.append(" for get() method, use getLong() instead");
                throw new UnsupportedTemporalTypeException(sb.toString());
            }
            long j = temporalAccessor.getLong(temporalField);
            if (valueRangeRange.isValidValue(j)) {
                return (int) j;
            }
            String strValueOf2 = String.valueOf(temporalField);
            String strValueOf3 = String.valueOf(valueRangeRange);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 56 + strValueOf3.length());
            sb2.append("Invalid value for ");
            sb2.append(strValueOf2);
            sb2.append(" (valid values ");
            sb2.append(strValueOf3);
            sb2.append("): ");
            sb2.append(j);
            throw new DateTimeException(sb2.toString());
        }

        public static Object $default$query(TemporalAccessor temporalAccessor, TemporalQuery temporalQuery) {
            if (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.precision()) {
                return null;
            }
            return temporalQuery.queryFrom(temporalAccessor);
        }

        public static ValueRange $default$range(TemporalAccessor temporalAccessor, TemporalField temporalField) {
            if (!(temporalField instanceof ChronoField)) {
                Objects.requireNonNull(temporalField, "field");
                return temporalField.rangeRefinedBy(temporalAccessor);
            }
            if (temporalAccessor.isSupported(temporalField)) {
                return temporalField.range();
            }
            String strValueOf = String.valueOf(temporalField);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 19);
            sb.append("Unsupported field: ");
            sb.append(strValueOf);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    int get(TemporalField temporalField);

    long getLong(TemporalField temporalField);

    boolean isSupported(TemporalField temporalField);

    Object query(TemporalQuery temporalQuery);

    ValueRange range(TemporalField temporalField);
}
