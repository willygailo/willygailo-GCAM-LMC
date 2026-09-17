package j$.time.format;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneId$$ExternalSyntheticBackport0;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class DateTimePrintContext {
    private DateTimeFormatter formatter;
    private int optional;
    private TemporalAccessor temporal;

    DateTimePrintContext(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        this.temporal = adjust(temporalAccessor, dateTimeFormatter);
        this.formatter = dateTimeFormatter;
    }

    private static TemporalAccessor adjust(final TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.getChronology();
        ZoneId zone = dateTimeFormatter.getZone();
        if (chronology == null && zone == null) {
            return temporalAccessor;
        }
        Chronology chronology2 = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        final ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zoneId());
        final ChronoLocalDate chronoLocalDateDate = null;
        if (Objects.equals(chronology, chronology2)) {
            chronology = null;
        }
        if (Objects.equals(zone, zoneId)) {
            zone = null;
        }
        if (chronology == null && zone == null) {
            return temporalAccessor;
        }
        final Chronology chronology3 = chronology != null ? chronology : chronology2;
        if (zone != null) {
            if (temporalAccessor.isSupported(ChronoField.INSTANT_SECONDS)) {
                return ((Chronology) ZoneId$$ExternalSyntheticBackport0.m(chronology3, IsoChronology.INSTANCE)).zonedDateTime(Instant.from(temporalAccessor), zone);
            }
            if (zone.normalized() instanceof ZoneOffset) {
                ChronoField chronoField = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.isSupported(chronoField) && temporalAccessor.get(chronoField) != zone.getRules().getOffset(Instant.EPOCH).getTotalSeconds()) {
                    String strValueOf = String.valueOf(zone);
                    String strValueOf2 = String.valueOf(temporalAccessor);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 135 + strValueOf2.length());
                    sb.append("Unable to apply override zone '");
                    sb.append(strValueOf);
                    sb.append("' because the temporal object being formatted has a different offset but does not represent an instant: ");
                    sb.append(strValueOf2);
                    throw new DateTimeException(sb.toString());
                }
            }
        }
        if (zone != null) {
            zoneId = zone;
        }
        if (chronology != null) {
            if (temporalAccessor.isSupported(ChronoField.EPOCH_DAY)) {
                chronoLocalDateDate = chronology3.date(temporalAccessor);
            } else if (chronology != IsoChronology.INSTANCE || chronology2 != null) {
                for (ChronoField chronoField2 : ChronoField.values()) {
                    if (chronoField2.isDateBased() && temporalAccessor.isSupported(chronoField2)) {
                        String strValueOf3 = String.valueOf(chronology);
                        String strValueOf4 = String.valueOf(temporalAccessor);
                        StringBuilder sb2 = new StringBuilder(strValueOf3.length() + ScriptIntrinsicBLAS.LEFT + strValueOf4.length());
                        sb2.append("Unable to apply override chronology '");
                        sb2.append(strValueOf3);
                        sb2.append("' because the temporal object being formatted contains date fields but does not represent a whole date: ");
                        sb2.append(strValueOf4);
                        throw new DateTimeException(sb2.toString());
                    }
                }
            }
        }
        return new TemporalAccessor() { // from class: j$.time.format.DateTimePrintContext.1
            @Override // j$.time.temporal.TemporalAccessor
            public /* synthetic */ int get(TemporalField temporalField) {
                return TemporalAccessor.CC.$default$get(this, temporalField);
            }

            @Override // j$.time.temporal.TemporalAccessor
            public long getLong(TemporalField temporalField) {
                return (chronoLocalDateDate == null || !temporalField.isDateBased()) ? temporalAccessor.getLong(temporalField) : chronoLocalDateDate.getLong(temporalField);
            }

            @Override // j$.time.temporal.TemporalAccessor
            public boolean isSupported(TemporalField temporalField) {
                return (chronoLocalDateDate == null || !temporalField.isDateBased()) ? temporalAccessor.isSupported(temporalField) : chronoLocalDateDate.isSupported(temporalField);
            }

            @Override // j$.time.temporal.TemporalAccessor
            public Object query(TemporalQuery temporalQuery) {
                if (temporalQuery == TemporalQueries.chronology()) {
                    return chronology3;
                }
                if (temporalQuery == TemporalQueries.zoneId()) {
                    return zoneId;
                }
                return temporalQuery == TemporalQueries.precision() ? temporalAccessor.query(temporalQuery) : temporalQuery.queryFrom(this);
            }

            @Override // j$.time.temporal.TemporalAccessor
            public ValueRange range(TemporalField temporalField) {
                return (chronoLocalDateDate == null || !temporalField.isDateBased()) ? temporalAccessor.range(temporalField) : chronoLocalDateDate.range(temporalField);
            }

            public String toString() {
                String string;
                String strValueOf5 = String.valueOf(temporalAccessor);
                Chronology chronology4 = chronology3;
                String string2 = "";
                if (chronology4 != null) {
                    String strValueOf6 = String.valueOf(chronology4);
                    StringBuilder sb3 = new StringBuilder(strValueOf6.length() + 17);
                    sb3.append(" with chronology ");
                    sb3.append(strValueOf6);
                    string = sb3.toString();
                } else {
                    string = "";
                }
                ZoneId zoneId2 = zoneId;
                if (zoneId2 != null) {
                    String strValueOf7 = String.valueOf(zoneId2);
                    StringBuilder sb4 = new StringBuilder(strValueOf7.length() + 11);
                    sb4.append(" with zone ");
                    sb4.append(strValueOf7);
                    string2 = sb4.toString();
                }
                StringBuilder sb5 = new StringBuilder(strValueOf5.length() + String.valueOf(string).length() + String.valueOf(string2).length());
                sb5.append(strValueOf5);
                sb5.append(string);
                sb5.append(string2);
                return sb5.toString();
            }
        };
    }

    void endOptional() {
        this.optional--;
    }

    DecimalStyle getDecimalStyle() {
        return this.formatter.getDecimalStyle();
    }

    Locale getLocale() {
        return this.formatter.getLocale();
    }

    TemporalAccessor getTemporal() {
        return this.temporal;
    }

    Long getValue(TemporalField temporalField) {
        if (this.optional <= 0 || this.temporal.isSupported(temporalField)) {
            return Long.valueOf(this.temporal.getLong(temporalField));
        }
        return null;
    }

    Object getValue(TemporalQuery temporalQuery) {
        Object objQuery = this.temporal.query(temporalQuery);
        if (objQuery != null || this.optional != 0) {
            return objQuery;
        }
        String strValueOf = String.valueOf(temporalQuery);
        String strValueOf2 = String.valueOf(this.temporal);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
        sb.append("Unable to extract ");
        sb.append(strValueOf);
        sb.append(" from temporal ");
        sb.append(strValueOf2);
        throw new DateTimeException(sb.toString());
    }

    void startOptional() {
        this.optional++;
    }

    public String toString() {
        return this.temporal.toString();
    }
}
