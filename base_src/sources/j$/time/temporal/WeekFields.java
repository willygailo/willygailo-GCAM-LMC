package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class WeekFields implements Serializable {
    private static final ConcurrentMap CACHE = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);
    public static final WeekFields SUNDAY_START = of(DayOfWeek.SUNDAY, 1);
    public static final TemporalUnit WEEK_BASED_YEARS = IsoFields.WEEK_BASED_YEARS;
    private static final long serialVersionUID = -1177360819670808121L;
    private final DayOfWeek firstDayOfWeek;
    private final int minimalDays;
    private final transient TemporalField dayOfWeek = ComputedDayOfField.ofDayOfWeekField(this);
    private final transient TemporalField weekOfMonth = ComputedDayOfField.ofWeekOfMonthField(this);
    private final transient TemporalField weekOfYear = ComputedDayOfField.ofWeekOfYearField(this);
    private final transient TemporalField weekOfWeekBasedYear = ComputedDayOfField.ofWeekOfWeekBasedYearField(this);
    private final transient TemporalField weekBasedYear = ComputedDayOfField.ofWeekBasedYearField(this);

    class ComputedDayOfField implements TemporalField {
        private final TemporalUnit baseUnit;
        private final String name;
        private final ValueRange range;
        private final TemporalUnit rangeUnit;
        private final WeekFields weekDef;
        private static final ValueRange DAY_OF_WEEK_RANGE = ValueRange.of(1, 7);
        private static final ValueRange WEEK_OF_MONTH_RANGE = ValueRange.of(0, 1, 4, 6);
        private static final ValueRange WEEK_OF_YEAR_RANGE = ValueRange.of(0, 1, 52, 54);
        private static final ValueRange WEEK_OF_WEEK_BASED_YEAR_RANGE = ValueRange.of(1, 52, 53);

        private ComputedDayOfField(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange) {
            this.name = str;
            this.weekDef = weekFields;
            this.baseUnit = temporalUnit;
            this.rangeUnit = temporalUnit2;
            this.range = valueRange;
        }

        private int computeWeek(int i, int i2) {
            return ((i + 7) + (i2 - 1)) / 7;
        }

        private int localizedDayOfWeek(TemporalAccessor temporalAccessor) {
            return WeekFields$ComputedDayOfField$$ExternalSyntheticBackport0.m(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.weekDef.getFirstDayOfWeek().getValue(), 7) + 1;
        }

        private int localizedWeekBasedYear(TemporalAccessor temporalAccessor) {
            int iLocalizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            int i = temporalAccessor.get(ChronoField.YEAR);
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            int i2 = temporalAccessor.get(chronoField);
            int iStartOfWeekOffset = startOfWeekOffset(i2, iLocalizedDayOfWeek);
            int iComputeWeek = computeWeek(iStartOfWeekOffset, i2);
            if (iComputeWeek == 0) {
                return i - 1;
            }
            return iComputeWeek >= computeWeek(iStartOfWeekOffset, ((int) temporalAccessor.range(chronoField).getMaximum()) + this.weekDef.getMinimalDaysInFirstWeek()) ? i + 1 : i;
        }

        private long localizedWeekOfMonth(TemporalAccessor temporalAccessor) {
            int iLocalizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            int i = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            return computeWeek(startOfWeekOffset(i, iLocalizedDayOfWeek), i);
        }

        private int localizedWeekOfWeekBasedYear(TemporalAccessor temporalAccessor) {
            int iComputeWeek;
            int iLocalizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            int i = temporalAccessor.get(chronoField);
            int iStartOfWeekOffset = startOfWeekOffset(i, iLocalizedDayOfWeek);
            int iComputeWeek2 = computeWeek(iStartOfWeekOffset, i);
            if (iComputeWeek2 == 0) {
                return localizedWeekOfWeekBasedYear(Chronology.CC.from(temporalAccessor).date(temporalAccessor).minus(i, (TemporalUnit) ChronoUnit.DAYS));
            }
            return (iComputeWeek2 <= 50 || iComputeWeek2 < (iComputeWeek = computeWeek(iStartOfWeekOffset, ((int) temporalAccessor.range(chronoField).getMaximum()) + this.weekDef.getMinimalDaysInFirstWeek()))) ? iComputeWeek2 : (iComputeWeek2 - iComputeWeek) + 1;
        }

        private long localizedWeekOfYear(TemporalAccessor temporalAccessor) {
            int iLocalizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            int i = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
            return computeWeek(startOfWeekOffset(i, iLocalizedDayOfWeek), i);
        }

        static ComputedDayOfField ofDayOfWeekField(WeekFields weekFields) {
            return new ComputedDayOfField("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, DAY_OF_WEEK_RANGE);
        }

        private ChronoLocalDate ofWeekBasedYear(Chronology chronology, int i, int i2, int i3) {
            ChronoLocalDate chronoLocalDateDate = chronology.date(i, 1, 1);
            int iStartOfWeekOffset = startOfWeekOffset(1, localizedDayOfWeek(chronoLocalDateDate));
            return chronoLocalDateDate.plus((-iStartOfWeekOffset) + (i3 - 1) + ((Math.min(i2, computeWeek(iStartOfWeekOffset, chronoLocalDateDate.lengthOfYear() + this.weekDef.getMinimalDaysInFirstWeek()) - 1) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
        }

        static ComputedDayOfField ofWeekBasedYearField(WeekFields weekFields) {
            return new ComputedDayOfField("WeekBasedYear", weekFields, IsoFields.WEEK_BASED_YEARS, ChronoUnit.FOREVER, ChronoField.YEAR.range());
        }

        static ComputedDayOfField ofWeekOfMonthField(WeekFields weekFields) {
            return new ComputedDayOfField("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, WEEK_OF_MONTH_RANGE);
        }

        static ComputedDayOfField ofWeekOfWeekBasedYearField(WeekFields weekFields) {
            return new ComputedDayOfField("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, IsoFields.WEEK_BASED_YEARS, WEEK_OF_WEEK_BASED_YEAR_RANGE);
        }

        static ComputedDayOfField ofWeekOfYearField(WeekFields weekFields) {
            return new ComputedDayOfField("WeekOfYear", weekFields, ChronoUnit.WEEKS, ChronoUnit.YEARS, WEEK_OF_YEAR_RANGE);
        }

        private ValueRange rangeByWeek(TemporalAccessor temporalAccessor, TemporalField temporalField) {
            int iStartOfWeekOffset = startOfWeekOffset(temporalAccessor.get(temporalField), localizedDayOfWeek(temporalAccessor));
            ValueRange valueRangeRange = temporalAccessor.range(temporalField);
            return ValueRange.of(computeWeek(iStartOfWeekOffset, (int) valueRangeRange.getMinimum()), computeWeek(iStartOfWeekOffset, (int) valueRangeRange.getMaximum()));
        }

        private ValueRange rangeWeekOfWeekBasedYear(TemporalAccessor temporalAccessor) {
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            if (!temporalAccessor.isSupported(chronoField)) {
                return WEEK_OF_YEAR_RANGE;
            }
            int iLocalizedDayOfWeek = localizedDayOfWeek(temporalAccessor);
            int i = temporalAccessor.get(chronoField);
            int iStartOfWeekOffset = startOfWeekOffset(i, iLocalizedDayOfWeek);
            int iComputeWeek = computeWeek(iStartOfWeekOffset, i);
            if (iComputeWeek == 0) {
                return rangeWeekOfWeekBasedYear(Chronology.CC.from(temporalAccessor).date(temporalAccessor).minus(i + 7, (TemporalUnit) ChronoUnit.DAYS));
            }
            int maximum = (int) temporalAccessor.range(chronoField).getMaximum();
            int iComputeWeek2 = computeWeek(iStartOfWeekOffset, this.weekDef.getMinimalDaysInFirstWeek() + maximum);
            return iComputeWeek >= iComputeWeek2 ? rangeWeekOfWeekBasedYear(Chronology.CC.from(temporalAccessor).date(temporalAccessor).plus((maximum - i) + 1 + 7, (TemporalUnit) ChronoUnit.DAYS)) : ValueRange.of(1L, iComputeWeek2 - 1);
        }

        private int startOfWeekOffset(int i, int i2) {
            int iM = WeekFields$ComputedDayOfField$$ExternalSyntheticBackport0.m(i - i2, 7);
            return iM + 1 > this.weekDef.getMinimalDaysInFirstWeek() ? 7 - iM : -iM;
        }

        @Override // j$.time.temporal.TemporalField
        public Temporal adjustInto(Temporal temporal, long j) {
            int iCheckValidIntValue = this.range.checkValidIntValue(j, this);
            int i = temporal.get(this);
            if (iCheckValidIntValue == i) {
                return temporal;
            }
            if (this.rangeUnit != ChronoUnit.FOREVER) {
                return temporal.plus(iCheckValidIntValue - i, this.baseUnit);
            }
            return ofWeekBasedYear(Chronology.CC.from(temporal), (int) j, temporal.get(this.weekDef.weekOfWeekBasedYear), temporal.get(this.weekDef.dayOfWeek));
        }

        @Override // j$.time.temporal.TemporalField
        public long getFrom(TemporalAccessor temporalAccessor) {
            int iLocalizedWeekBasedYear;
            TemporalUnit temporalUnit = this.rangeUnit;
            if (temporalUnit == ChronoUnit.WEEKS) {
                iLocalizedWeekBasedYear = localizedDayOfWeek(temporalAccessor);
            } else {
                if (temporalUnit == ChronoUnit.MONTHS) {
                    return localizedWeekOfMonth(temporalAccessor);
                }
                if (temporalUnit == ChronoUnit.YEARS) {
                    return localizedWeekOfYear(temporalAccessor);
                }
                if (temporalUnit == WeekFields.WEEK_BASED_YEARS) {
                    iLocalizedWeekBasedYear = localizedWeekOfWeekBasedYear(temporalAccessor);
                } else {
                    if (temporalUnit != ChronoUnit.FOREVER) {
                        String strValueOf = String.valueOf(this.rangeUnit);
                        String strValueOf2 = String.valueOf(this);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 32 + strValueOf2.length());
                        sb.append("unreachable, rangeUnit: ");
                        sb.append(strValueOf);
                        sb.append(", this: ");
                        sb.append(strValueOf2);
                        throw new IllegalStateException(sb.toString());
                    }
                    iLocalizedWeekBasedYear = localizedWeekBasedYear(temporalAccessor);
                }
            }
            return iLocalizedWeekBasedYear;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
            if (!temporalAccessor.isSupported(ChronoField.DAY_OF_WEEK)) {
                return false;
            }
            TemporalUnit temporalUnit = this.rangeUnit;
            if (temporalUnit == ChronoUnit.WEEKS) {
                return true;
            }
            if (temporalUnit == ChronoUnit.MONTHS) {
                return temporalAccessor.isSupported(ChronoField.DAY_OF_MONTH);
            }
            if (temporalUnit != ChronoUnit.YEARS && temporalUnit != WeekFields.WEEK_BASED_YEARS) {
                if (temporalUnit == ChronoUnit.FOREVER) {
                    return temporalAccessor.isSupported(ChronoField.YEAR);
                }
                return false;
            }
            return temporalAccessor.isSupported(ChronoField.DAY_OF_YEAR);
        }

        @Override // j$.time.temporal.TemporalField
        public boolean isTimeBased() {
            return false;
        }

        @Override // j$.time.temporal.TemporalField
        public ValueRange range() {
            return this.range;
        }

        @Override // j$.time.temporal.TemporalField
        public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
            TemporalUnit temporalUnit = this.rangeUnit;
            if (temporalUnit == ChronoUnit.WEEKS) {
                return this.range;
            }
            if (temporalUnit == ChronoUnit.MONTHS) {
                return rangeByWeek(temporalAccessor, ChronoField.DAY_OF_MONTH);
            }
            if (temporalUnit == ChronoUnit.YEARS) {
                return rangeByWeek(temporalAccessor, ChronoField.DAY_OF_YEAR);
            }
            if (temporalUnit == WeekFields.WEEK_BASED_YEARS) {
                return rangeWeekOfWeekBasedYear(temporalAccessor);
            }
            if (temporalUnit == ChronoUnit.FOREVER) {
                return ChronoField.YEAR.range();
            }
            String strValueOf = String.valueOf(this.rangeUnit);
            String strValueOf2 = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 32 + strValueOf2.length());
            sb.append("unreachable, rangeUnit: ");
            sb.append(strValueOf);
            sb.append(", this: ");
            sb.append(strValueOf2);
            throw new IllegalStateException(sb.toString());
        }

        public String toString() {
            String str = this.name;
            String string = this.weekDef.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
            sb.append(str);
            sb.append("[");
            sb.append(string);
            sb.append("]");
            return sb.toString();
        }
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.firstDayOfWeek = dayOfWeek;
        this.minimalDays = i;
    }

    public static WeekFields of(DayOfWeek dayOfWeek, int i) {
        String string = dayOfWeek.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 11);
        sb.append(string);
        sb.append(i);
        String string2 = sb.toString();
        ConcurrentMap concurrentMap = CACHE;
        WeekFields weekFields = (WeekFields) concurrentMap.get(string2);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(string2, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentMap.get(string2);
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        return of(DayOfWeek.SUNDAY.plus(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.firstDayOfWeek == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.minimalDays;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return of(this.firstDayOfWeek, this.minimalDays);
        } catch (IllegalArgumentException e) {
            String strValueOf = String.valueOf(e.getMessage());
            throw new InvalidObjectException(strValueOf.length() != 0 ? "Invalid serialized WeekFields: ".concat(strValueOf) : new String("Invalid serialized WeekFields: "));
        }
    }

    public TemporalField dayOfWeek() {
        return this.dayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public int getMinimalDaysInFirstWeek() {
        return this.minimalDays;
    }

    public int hashCode() {
        return (this.firstDayOfWeek.ordinal() * 7) + this.minimalDays;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.firstDayOfWeek);
        int i = this.minimalDays;
        StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
        sb.append("WeekFields[");
        sb.append(strValueOf);
        sb.append(',');
        sb.append(i);
        sb.append(']');
        return sb.toString();
    }

    public TemporalField weekBasedYear() {
        return this.weekBasedYear;
    }

    public TemporalField weekOfMonth() {
        return this.weekOfMonth;
    }

    public TemporalField weekOfWeekBasedYear() {
        return this.weekOfWeekBasedYear;
    }
}
