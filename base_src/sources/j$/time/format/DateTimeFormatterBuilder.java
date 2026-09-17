package j$.time.format;

import com.google.android.apps.camera.bottombar.R;
import j$.lang.DesugarMath$$ExternalSyntheticBackport2;
import j$.nio.file.attribute.FileTime$$ExternalSyntheticBackport0;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDate$$ExternalSyntheticBackport0;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneId$$ExternalSyntheticBackport0;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.IsoFields;
import j$.time.temporal.JulianFields;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.ValueRange;
import j$.time.temporal.WeekFields;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {
    private static final Map FIELD_MAP;
    static final Comparator LENGTH_SORT;
    private static final TemporalQuery QUERY_REGION_ONLY = new TemporalQuery() { // from class: j$.time.format.DateTimeFormatterBuilder$$ExternalSyntheticLambda0
        @Override // j$.time.temporal.TemporalQuery
        public final Object queryFrom(TemporalAccessor temporalAccessor) {
            return DateTimeFormatterBuilder.lambda$static$0(temporalAccessor);
        }
    };
    private DateTimeFormatterBuilder active;
    private final boolean optional;
    private char padNextChar;
    private int padNextWidth;
    private final DateTimeFormatterBuilder parent;
    private final List printerParsers;
    private int valueParserIndex;

    /* JADX INFO: renamed from: j$.time.format.DateTimeFormatterBuilder$3, reason: invalid class name */
    abstract /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$java$time$format$SignStyle;

        static {
            int[] iArr = new int[SignStyle.values().length];
            $SwitchMap$java$time$format$SignStyle = iArr;
            try {
                iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$format$SignStyle[SignStyle.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$format$SignStyle[SignStyle.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$format$SignStyle[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    final class CharLiteralPrinterParser implements DateTimePrinterParser {
        private final char literal;

        CharLiteralPrinterParser(char c) {
            this.literal = c;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            sb.append(this.literal);
            return true;
        }

        public String toString() {
            char c = this.literal;
            if (c == '\'') {
                return "''";
            }
            StringBuilder sb = new StringBuilder(3);
            sb.append("'");
            sb.append(c);
            sb.append("'");
            return sb.toString();
        }
    }

    final class CompositePrinterParser implements DateTimePrinterParser {
        private final boolean optional;
        private final DateTimePrinterParser[] printerParsers;

        CompositePrinterParser(List list, boolean z) {
            this((DateTimePrinterParser[]) list.toArray(new DateTimePrinterParser[list.size()]), z);
        }

        CompositePrinterParser(DateTimePrinterParser[] dateTimePrinterParserArr, boolean z) {
            this.printerParsers = dateTimePrinterParserArr;
            this.optional = z;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            int length = sb.length();
            if (this.optional) {
                dateTimePrintContext.startOptional();
            }
            try {
                for (DateTimePrinterParser dateTimePrinterParser : this.printerParsers) {
                    if (!dateTimePrinterParser.format(dateTimePrintContext, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                return true;
            } finally {
                if (this.optional) {
                    dateTimePrintContext.endOptional();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.printerParsers != null) {
                sb.append(this.optional ? "[" : "(");
                for (DateTimePrinterParser dateTimePrinterParser : this.printerParsers) {
                    sb.append(dateTimePrinterParser);
                }
                sb.append(this.optional ? "]" : ")");
            }
            return sb.toString();
        }

        public CompositePrinterParser withOptional(boolean z) {
            return z == this.optional ? this : new CompositePrinterParser(this.printerParsers, z);
        }
    }

    interface DateTimePrinterParser {
        boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb);
    }

    final class FractionPrinterParser extends NumberPrinterParser {
        private final boolean decimalPoint;

        FractionPrinterParser(TemporalField temporalField, int i, int i2, boolean z) {
            this(temporalField, i, i2, z, 0);
            Objects.requireNonNull(temporalField, "field");
            if (!temporalField.range().isFixed()) {
                String strValueOf = String.valueOf(temporalField);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
                sb.append("Field must have a fixed set of values: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            if (i < 0 || i > 9) {
                StringBuilder sb2 = new StringBuilder(63);
                sb2.append("Minimum width must be from 0 to 9 inclusive but was ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
            }
            if (i2 < 1 || i2 > 9) {
                StringBuilder sb3 = new StringBuilder(63);
                sb3.append("Maximum width must be from 1 to 9 inclusive but was ");
                sb3.append(i2);
                throw new IllegalArgumentException(sb3.toString());
            }
            if (i2 >= i) {
                return;
            }
            StringBuilder sb4 = new StringBuilder(82);
            sb4.append("Maximum width must exceed or equal the minimum width but ");
            sb4.append(i2);
            sb4.append(" < ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }

        FractionPrinterParser(TemporalField temporalField, int i, int i2, boolean z, int i3) {
            super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i3);
            this.decimalPoint = z;
        }

        private BigDecimal convertToFraction(long j) {
            ValueRange valueRangeRange = this.field.range();
            valueRangeRange.checkValidValue(j, this.field);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(j).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return bigDecimalDivide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : bigDecimalDivide.stripTrailingZeros();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser, j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            Long value = dateTimePrintContext.getValue(this.field);
            if (value == null) {
                return false;
            }
            DecimalStyle decimalStyle = dateTimePrintContext.getDecimalStyle();
            BigDecimal bigDecimalConvertToFraction = convertToFraction(value.longValue());
            if (bigDecimalConvertToFraction.scale() != 0) {
                String strConvertNumberToI18N = decimalStyle.convertNumberToI18N(bigDecimalConvertToFraction.setScale(Math.min(Math.max(bigDecimalConvertToFraction.scale(), this.minWidth), this.maxWidth), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.decimalPoint) {
                    sb.append(decimalStyle.getDecimalSeparator());
                }
                sb.append(strConvertNumberToI18N);
                return true;
            }
            if (this.minWidth <= 0) {
                return true;
            }
            if (this.decimalPoint) {
                sb.append(decimalStyle.getDecimalSeparator());
            }
            for (int i = 0; i < this.minWidth; i++) {
                sb.append(decimalStyle.getZeroDigit());
            }
            return true;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public String toString() {
            String str = this.decimalPoint ? ",DecimalPoint" : "";
            String strValueOf = String.valueOf(this.field);
            int i = this.minWidth;
            int i2 = this.maxWidth;
            StringBuilder sb = new StringBuilder(strValueOf.length() + 34 + str.length());
            sb.append("Fraction(");
            sb.append(strValueOf);
            sb.append(",");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public FractionPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new FractionPrinterParser(this.field, this.minWidth, this.maxWidth, this.decimalPoint, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public FractionPrinterParser withSubsequentWidth(int i) {
            return new FractionPrinterParser(this.field, this.minWidth, this.maxWidth, this.decimalPoint, this.subsequentWidth + i);
        }
    }

    final class InstantPrinterParser implements DateTimePrinterParser {
        private final int fractionalDigits;

        InstantPrinterParser(int i) {
            this.fractionalDigits = i;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            Long value = dateTimePrintContext.getValue(ChronoField.INSTANT_SECONDS);
            TemporalAccessor temporal = dateTimePrintContext.getTemporal();
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            Long lValueOf = temporal.isSupported(chronoField) ? Long.valueOf(dateTimePrintContext.getTemporal().getLong(chronoField)) : null;
            int i = 0;
            if (value == null) {
                return false;
            }
            long jLongValue = value.longValue();
            int iCheckValidIntValue = chronoField.checkValidIntValue(lValueOf != null ? lValueOf.longValue() : 0L);
            if (jLongValue >= -62167219200L) {
                long j = (jLongValue - 315569520000L) + 62167219200L;
                long jM = DesugarMath$$ExternalSyntheticBackport2.m(j, 315569520000L) + 1;
                LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(FileTime$$ExternalSyntheticBackport0.m(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                if (jM > 0) {
                    sb.append('+');
                    sb.append(jM);
                }
                sb.append(localDateTimeOfEpochSecond);
                if (localDateTimeOfEpochSecond.getSecond() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = jLongValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                LocalDateTime localDateTimeOfEpochSecond2 = LocalDateTime.ofEpochSecond(j4 - 62167219200L, 0, ZoneOffset.UTC);
                int length = sb.length();
                sb.append(localDateTimeOfEpochSecond2);
                if (localDateTimeOfEpochSecond2.getSecond() == 0) {
                    sb.append(":00");
                }
                if (j3 < 0) {
                    if (localDateTimeOfEpochSecond2.getYear() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb.insert(length, j3);
                    } else {
                        sb.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.fractionalDigits;
            if ((i2 < 0 && iCheckValidIntValue > 0) || i2 > 0) {
                sb.append('.');
                int i3 = 100000000;
                while (true) {
                    int i4 = this.fractionalDigits;
                    if ((i4 != -1 || iCheckValidIntValue <= 0) && ((i4 != -2 || (iCheckValidIntValue <= 0 && i % 3 == 0)) && i >= i4)) {
                        break;
                    }
                    int i5 = iCheckValidIntValue / i3;
                    sb.append((char) (i5 + 48));
                    iCheckValidIntValue -= i5 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    final class LocalizedOffsetIdPrinterParser implements DateTimePrinterParser {
        private final TextStyle style;

        LocalizedOffsetIdPrinterParser(TextStyle textStyle) {
            this.style = textStyle;
        }

        private static StringBuilder appendHMS(StringBuilder sb, int i) {
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
            return sb;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            Long value = dateTimePrintContext.getValue(ChronoField.OFFSET_SECONDS);
            if (value == null) {
                return false;
            }
            sb.append("GMT");
            int iM = LocalDate$$ExternalSyntheticBackport0.m(value.longValue());
            if (iM == 0) {
                return true;
            }
            int iAbs = Math.abs((iM / 3600) % 100);
            int iAbs2 = Math.abs((iM / 60) % 60);
            int iAbs3 = Math.abs(iM % 60);
            sb.append(iM < 0 ? "-" : "+");
            if (this.style == TextStyle.FULL) {
                appendHMS(sb, iAbs);
                sb.append(':');
                appendHMS(sb, iAbs2);
                if (iAbs3 == 0) {
                    return true;
                }
                sb.append(':');
                appendHMS(sb, iAbs3);
                return true;
            }
            if (iAbs >= 10) {
                sb.append((char) ((iAbs / 10) + 48));
            }
            sb.append((char) ((iAbs % 10) + 48));
            if (iAbs2 == 0 && iAbs3 == 0) {
                return true;
            }
            sb.append(':');
            appendHMS(sb, iAbs2);
            if (iAbs3 == 0) {
                return true;
            }
            sb.append(':');
            appendHMS(sb, iAbs3);
            return true;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.style);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 17);
            sb.append("LocalizedOffset(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    final class LocalizedPrinterParser implements DateTimePrinterParser {
        private static final ConcurrentMap FORMATTER_CACHE = new ConcurrentHashMap(16, 0.75f, 2);
        private final FormatStyle dateStyle;
        private final FormatStyle timeStyle;

        LocalizedPrinterParser(FormatStyle formatStyle, FormatStyle formatStyle2) {
            this.dateStyle = formatStyle;
            this.timeStyle = formatStyle2;
        }

        private DateTimeFormatter formatter(Locale locale, Chronology chronology) {
            String id = chronology.getId();
            String string = locale.toString();
            String strValueOf = String.valueOf(this.dateStyle);
            String strValueOf2 = String.valueOf(this.timeStyle);
            StringBuilder sb = new StringBuilder(String.valueOf(id).length() + 2 + String.valueOf(string).length() + strValueOf.length() + strValueOf2.length());
            sb.append(id);
            sb.append('|');
            sb.append(string);
            sb.append('|');
            sb.append(strValueOf);
            sb.append(strValueOf2);
            String string2 = sb.toString();
            ConcurrentMap concurrentMap = FORMATTER_CACHE;
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentMap.get(string2);
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern(DateTimeFormatterBuilder.getLocalizedDateTimePattern(this.dateStyle, this.timeStyle, chronology, locale)).toFormatter(locale);
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentMap.putIfAbsent(string2, formatter);
            return dateTimeFormatter2 != null ? dateTimeFormatter2 : formatter;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            return formatter(dateTimePrintContext.getLocale(), Chronology.CC.from(dateTimePrintContext.getTemporal())).toPrinterParser(false).format(dateTimePrintContext, sb);
        }

        public String toString() {
            Object obj = this.dateStyle;
            if (obj == null) {
                obj = "";
            }
            String strValueOf = String.valueOf(obj);
            FormatStyle formatStyle = this.timeStyle;
            String strValueOf2 = String.valueOf(formatStyle != null ? formatStyle : "");
            StringBuilder sb = new StringBuilder(strValueOf.length() + 12 + strValueOf2.length());
            sb.append("Localized(");
            sb.append(strValueOf);
            sb.append(",");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    class NumberPrinterParser implements DateTimePrinterParser {
        static final long[] EXCEED_POINTS = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
        final TemporalField field;
        final int maxWidth;
        final int minWidth;
        private final SignStyle signStyle;
        final int subsequentWidth;

        NumberPrinterParser(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
            this.field = temporalField;
            this.minWidth = i;
            this.maxWidth = i2;
            this.signStyle = signStyle;
            this.subsequentWidth = 0;
        }

        protected NumberPrinterParser(TemporalField temporalField, int i, int i2, SignStyle signStyle, int i3) {
            this.field = temporalField;
            this.minWidth = i;
            this.maxWidth = i2;
            this.signStyle = signStyle;
            this.subsequentWidth = i3;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            Long value = dateTimePrintContext.getValue(this.field);
            if (value == null) {
                return false;
            }
            long value2 = getValue(dateTimePrintContext, value.longValue());
            DecimalStyle decimalStyle = dateTimePrintContext.getDecimalStyle();
            String string = value2 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(value2));
            if (string.length() > this.maxWidth) {
                String strValueOf = String.valueOf(this.field);
                int i = this.maxWidth;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + R.styleable.AppCompatTheme_textAppearanceListItemSmall);
                sb2.append("Field ");
                sb2.append(strValueOf);
                sb2.append(" cannot be printed as the value ");
                sb2.append(value2);
                sb2.append(" exceeds the maximum print width of ");
                sb2.append(i);
                throw new DateTimeException(sb2.toString());
            }
            String strConvertNumberToI18N = decimalStyle.convertNumberToI18N(string);
            if (value2 >= 0) {
                int i2 = AnonymousClass3.$SwitchMap$java$time$format$SignStyle[this.signStyle.ordinal()];
                if (i2 == 1) {
                    int i3 = this.minWidth;
                    if (i3 < 19 && value2 >= EXCEED_POINTS[i3]) {
                        sb.append(decimalStyle.getPositiveSign());
                    }
                } else if (i2 == 2) {
                    sb.append(decimalStyle.getPositiveSign());
                }
            } else {
                int i4 = AnonymousClass3.$SwitchMap$java$time$format$SignStyle[this.signStyle.ordinal()];
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    sb.append(decimalStyle.getNegativeSign());
                } else if (i4 == 4) {
                    String strValueOf2 = String.valueOf(this.field);
                    StringBuilder sb3 = new StringBuilder(strValueOf2.length() + R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                    sb3.append("Field ");
                    sb3.append(strValueOf2);
                    sb3.append(" cannot be printed as the value ");
                    sb3.append(value2);
                    sb3.append(" cannot be negative according to the SignStyle");
                    throw new DateTimeException(sb3.toString());
                }
            }
            for (int i5 = 0; i5 < this.minWidth - strConvertNumberToI18N.length(); i5++) {
                sb.append(decimalStyle.getZeroDigit());
            }
            sb.append(strConvertNumberToI18N);
            return true;
        }

        long getValue(DateTimePrintContext dateTimePrintContext, long j) {
            return j;
        }

        public String toString() {
            int i = this.minWidth;
            if (i == 1 && this.maxWidth == 19 && this.signStyle == SignStyle.NORMAL) {
                String strValueOf = String.valueOf(this.field);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
                sb.append("Value(");
                sb.append(strValueOf);
                sb.append(")");
                return sb.toString();
            }
            if (i == this.maxWidth && this.signStyle == SignStyle.NOT_NEGATIVE) {
                String strValueOf2 = String.valueOf(this.field);
                int i2 = this.minWidth;
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
                sb2.append("Value(");
                sb2.append(strValueOf2);
                sb2.append(",");
                sb2.append(i2);
                sb2.append(")");
                return sb2.toString();
            }
            String strValueOf3 = String.valueOf(this.field);
            int i3 = this.minWidth;
            int i4 = this.maxWidth;
            String strValueOf4 = String.valueOf(this.signStyle);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 32 + strValueOf4.length());
            sb3.append("Value(");
            sb3.append(strValueOf3);
            sb3.append(",");
            sb3.append(i3);
            sb3.append(",");
            sb3.append(i4);
            sb3.append(",");
            sb3.append(strValueOf4);
            sb3.append(")");
            return sb3.toString();
        }

        NumberPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new NumberPrinterParser(this.field, this.minWidth, this.maxWidth, this.signStyle, -1);
        }

        NumberPrinterParser withSubsequentWidth(int i) {
            return new NumberPrinterParser(this.field, this.minWidth, this.maxWidth, this.signStyle, this.subsequentWidth + i);
        }
    }

    final class OffsetIdPrinterParser implements DateTimePrinterParser {
        private final String noOffsetText;
        private final int style;
        private final int type;
        static final String[] PATTERNS = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
        static final OffsetIdPrinterParser INSTANCE_ID_Z = new OffsetIdPrinterParser("+HH:MM:ss", "Z");
        static final OffsetIdPrinterParser INSTANCE_ID_ZERO = new OffsetIdPrinterParser("+HH:MM:ss", "0");

        OffsetIdPrinterParser(String str, String str2) {
            Objects.requireNonNull(str, "pattern");
            Objects.requireNonNull(str2, "noOffsetText");
            int iCheckPattern = checkPattern(str);
            this.type = iCheckPattern;
            this.style = iCheckPattern % 11;
            this.noOffsetText = str2;
        }

        private int checkPattern(String str) {
            int i = 0;
            while (true) {
                String[] strArr = PATTERNS;
                if (i >= strArr.length) {
                    String strValueOf = String.valueOf(str);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid zone offset pattern: ".concat(strValueOf) : new String("Invalid zone offset pattern: "));
                }
                if (strArr[i].equals(str)) {
                    return i;
                }
                i++;
            }
        }

        private void formatZeroPad(boolean z, int i, StringBuilder sb) {
            sb.append(z ? ":" : "");
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
        }

        private boolean isColon() {
            int i = this.style;
            return i > 0 && i % 2 == 0;
        }

        private boolean isPaddedHour() {
            return this.type < 11;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            Long value = dateTimePrintContext.getValue(ChronoField.OFFSET_SECONDS);
            if (value == null) {
                return false;
            }
            int iM = LocalDate$$ExternalSyntheticBackport0.m(value.longValue());
            if (iM == 0) {
                sb.append(this.noOffsetText);
            } else {
                int iAbs = Math.abs((iM / 3600) % 100);
                int iAbs2 = Math.abs((iM / 60) % 60);
                int iAbs3 = Math.abs(iM % 60);
                int length = sb.length();
                sb.append(iM < 0 ? "-" : "+");
                if (isPaddedHour() || iAbs >= 10) {
                    formatZeroPad(false, iAbs, sb);
                } else {
                    sb.append((char) (iAbs + 48));
                }
                int i = this.style;
                if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
                    formatZeroPad(isColon(), iAbs2, sb);
                    iAbs += iAbs2;
                    int i2 = this.style;
                    if (i2 == 7 || i2 == 8 || (i2 >= 5 && iAbs3 > 0)) {
                        formatZeroPad(isColon(), iAbs3, sb);
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb.setLength(length);
                    sb.append(this.noOffsetText);
                }
            }
            return true;
        }

        public String toString() {
            String strReplace = this.noOffsetText.replace("'", "''");
            String str = PATTERNS[this.type];
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(strReplace).length());
            sb.append("Offset(");
            sb.append(str);
            sb.append(",'");
            sb.append(strReplace);
            sb.append("')");
            return sb.toString();
        }
    }

    final class PadPrinterParserDecorator implements DateTimePrinterParser {
        private final char padChar;
        private final int padWidth;
        private final DateTimePrinterParser printerParser;

        PadPrinterParserDecorator(DateTimePrinterParser dateTimePrinterParser, int i, char c) {
            this.printerParser = dateTimePrinterParser;
            this.padWidth = i;
            this.padChar = c;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            int length = sb.length();
            if (!this.printerParser.format(dateTimePrintContext, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.padWidth) {
                for (int i = 0; i < this.padWidth - length2; i++) {
                    sb.insert(length, this.padChar);
                }
                return true;
            }
            int i2 = this.padWidth;
            StringBuilder sb2 = new StringBuilder(81);
            sb2.append("Cannot print as output of ");
            sb2.append(length2);
            sb2.append(" characters exceeds pad width of ");
            sb2.append(i2);
            throw new DateTimeException(sb2.toString());
        }

        public String toString() {
            String string;
            String strValueOf = String.valueOf(this.printerParser);
            int i = this.padWidth;
            char c = this.padChar;
            if (c == ' ') {
                string = ")";
            } else {
                StringBuilder sb = new StringBuilder(5);
                sb.append(",'");
                sb.append(c);
                sb.append("')");
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16 + String.valueOf(string).length());
            sb2.append("Pad(");
            sb2.append(strValueOf);
            sb2.append(",");
            sb2.append(i);
            sb2.append(string);
            return sb2.toString();
        }
    }

    final class ReducedPrinterParser extends NumberPrinterParser {
        static final LocalDate BASE_DATE = LocalDate.of(2000, 1, 1);
        private final ChronoLocalDate baseDate;
        private final int baseValue;

        ReducedPrinterParser(TemporalField temporalField, int i, int i2, int i3, ChronoLocalDate chronoLocalDate) {
            this(temporalField, i, i2, i3, chronoLocalDate, 0);
            if (i < 1 || i > 10) {
                StringBuilder sb = new StringBuilder(63);
                sb.append("The minWidth must be from 1 to 10 inclusive but was ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            if (i2 < 1 || i2 > 10) {
                StringBuilder sb2 = new StringBuilder(63);
                sb2.append("The maxWidth must be from 1 to 10 inclusive but was ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
            }
            if (i2 < i) {
                StringBuilder sb3 = new StringBuilder(82);
                sb3.append("Maximum width must exceed or equal the minimum width but ");
                sb3.append(i2);
                sb3.append(" < ");
                sb3.append(i);
                throw new IllegalArgumentException(sb3.toString());
            }
            if (chronoLocalDate == null) {
                long j = i3;
                if (!temporalField.range().isValidValue(j)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j + NumberPrinterParser.EXCEED_POINTS[i2] > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
        }

        private ReducedPrinterParser(TemporalField temporalField, int i, int i2, int i3, ChronoLocalDate chronoLocalDate, int i4) {
            super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i4);
            this.baseValue = i3;
            this.baseDate = chronoLocalDate;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        long getValue(DateTimePrintContext dateTimePrintContext, long j) {
            long jAbs = Math.abs(j);
            int i = this.baseValue;
            if (this.baseDate != null) {
                i = Chronology.CC.from(dateTimePrintContext.getTemporal()).date(this.baseDate).get(this.field);
            }
            long j2 = i;
            if (j >= j2) {
                long[] jArr = NumberPrinterParser.EXCEED_POINTS;
                int i2 = this.minWidth;
                if (j < j2 + jArr[i2]) {
                    return jAbs % jArr[i2];
                }
            }
            return jAbs % NumberPrinterParser.EXCEED_POINTS[this.maxWidth];
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public String toString() {
            String strValueOf = String.valueOf(this.field);
            int i = this.minWidth;
            int i2 = this.maxWidth;
            String strValueOf2 = String.valueOf(ZoneId$$ExternalSyntheticBackport0.m(this.baseDate, Integer.valueOf(this.baseValue)));
            StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length());
            sb.append("ReducedValue(");
            sb.append(strValueOf);
            sb.append(",");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.append(",");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public ReducedPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new ReducedPrinterParser(this.field, this.minWidth, this.maxWidth, this.baseValue, this.baseDate, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public ReducedPrinterParser withSubsequentWidth(int i) {
            return new ReducedPrinterParser(this.field, this.minWidth, this.maxWidth, this.baseValue, this.baseDate, this.subsequentWidth + i);
        }
    }

    enum SettingsParser implements DateTimePrinterParser {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    final class StringLiteralPrinterParser implements DateTimePrinterParser {
        private final String literal;

        StringLiteralPrinterParser(String str) {
            this.literal = str;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            sb.append(this.literal);
            return true;
        }

        public String toString() {
            String strReplace = this.literal.replace("'", "''");
            StringBuilder sb = new StringBuilder(String.valueOf(strReplace).length() + 2);
            sb.append("'");
            sb.append(strReplace);
            sb.append("'");
            return sb.toString();
        }
    }

    final class TextPrinterParser implements DateTimePrinterParser {
        private final TemporalField field;
        private volatile NumberPrinterParser numberPrinterParser;
        private final DateTimeTextProvider provider;
        private final TextStyle textStyle;

        TextPrinterParser(TemporalField temporalField, TextStyle textStyle, DateTimeTextProvider dateTimeTextProvider) {
            this.field = temporalField;
            this.textStyle = textStyle;
            this.provider = dateTimeTextProvider;
        }

        private NumberPrinterParser numberPrinterParser() {
            if (this.numberPrinterParser == null) {
                this.numberPrinterParser = new NumberPrinterParser(this.field, 1, 19, SignStyle.NORMAL);
            }
            return this.numberPrinterParser;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            Long value = dateTimePrintContext.getValue(this.field);
            if (value == null) {
                return false;
            }
            Chronology chronology = (Chronology) dateTimePrintContext.getTemporal().query(TemporalQueries.chronology());
            String text = (chronology == null || chronology == IsoChronology.INSTANCE) ? this.provider.getText(this.field, value.longValue(), this.textStyle, dateTimePrintContext.getLocale()) : this.provider.getText(chronology, this.field, value.longValue(), this.textStyle, dateTimePrintContext.getLocale());
            if (text == null) {
                return numberPrinterParser().format(dateTimePrintContext, sb);
            }
            sb.append(text);
            return true;
        }

        public String toString() {
            if (this.textStyle == TextStyle.FULL) {
                String strValueOf = String.valueOf(this.field);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 6);
                sb.append("Text(");
                sb.append(strValueOf);
                sb.append(")");
                return sb.toString();
            }
            String strValueOf2 = String.valueOf(this.field);
            String strValueOf3 = String.valueOf(this.textStyle);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 7 + strValueOf3.length());
            sb2.append("Text(");
            sb2.append(strValueOf2);
            sb2.append(",");
            sb2.append(strValueOf3);
            sb2.append(")");
            return sb2.toString();
        }
    }

    final class WeekBasedFieldPrinterParser extends NumberPrinterParser {
        private char chr;
        private int count;

        WeekBasedFieldPrinterParser(char c, int i, int i2, int i3) {
            this(c, i, i2, i3, 0);
        }

        WeekBasedFieldPrinterParser(char c, int i, int i2, int i3, int i4) {
            super(null, i2, i3, SignStyle.NOT_NEGATIVE, i4);
            this.chr = c;
            this.count = i;
        }

        private DateTimePrinterParser printerParser(Locale locale) {
            TemporalField temporalFieldWeekOfMonth;
            WeekFields weekFieldsOf = WeekFields.of(locale);
            char c = this.chr;
            if (c == 'W') {
                temporalFieldWeekOfMonth = weekFieldsOf.weekOfMonth();
            } else {
                if (c == 'Y') {
                    TemporalField temporalFieldWeekBasedYear = weekFieldsOf.weekBasedYear();
                    int i = this.count;
                    if (i == 2) {
                        return new ReducedPrinterParser(temporalFieldWeekBasedYear, 2, 2, 0, ReducedPrinterParser.BASE_DATE, this.subsequentWidth);
                    }
                    return new NumberPrinterParser(temporalFieldWeekBasedYear, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.subsequentWidth);
                }
                if (c == 'c' || c == 'e') {
                    temporalFieldWeekOfMonth = weekFieldsOf.dayOfWeek();
                } else {
                    if (c != 'w') {
                        throw new IllegalStateException("unreachable");
                    }
                    temporalFieldWeekOfMonth = weekFieldsOf.weekOfWeekBasedYear();
                }
            }
            return new NumberPrinterParser(temporalFieldWeekOfMonth, this.minWidth, this.maxWidth, SignStyle.NOT_NEGATIVE, this.subsequentWidth);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser, j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            return printerParser(dateTimePrintContext.getLocale()).format(dateTimePrintContext, sb);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public String toString() {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.chr;
            if (c == 'Y') {
                int i = this.count;
                if (i == 1) {
                    sb.append("WeekBasedYear");
                } else if (i == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.count);
                    sb.append(",");
                    sb.append(19);
                    sb.append(",");
                    sb.append(this.count < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                }
            } else {
                if (c == 'W') {
                    sb.append("WeekOfMonth");
                } else if (c == 'c' || c == 'e') {
                    sb.append("DayOfWeek");
                } else if (c == 'w') {
                    sb.append("WeekOfWeekBasedYear");
                }
                sb.append(",");
                sb.append(this.count);
            }
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public WeekBasedFieldPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new WeekBasedFieldPrinterParser(this.chr, this.count, this.minWidth, this.maxWidth, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public WeekBasedFieldPrinterParser withSubsequentWidth(int i) {
            return new WeekBasedFieldPrinterParser(this.chr, this.count, this.minWidth, this.maxWidth, this.subsequentWidth + i);
        }
    }

    class ZoneIdPrinterParser implements DateTimePrinterParser {
        private final String description;
        private final TemporalQuery query;

        ZoneIdPrinterParser(TemporalQuery temporalQuery, String str) {
            this.query = temporalQuery;
            this.description = str;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) dateTimePrintContext.getValue(this.query);
            if (zoneId == null) {
                return false;
            }
            sb.append(zoneId.getId());
            return true;
        }

        public String toString() {
            return this.description;
        }
    }

    final class ZoneTextPrinterParser extends ZoneIdPrinterParser {
        private static final Map cache = new ConcurrentHashMap();
        private final Map cachedTree;
        private final Map cachedTreeCI;
        private final boolean isGeneric;
        private Set preferredZones;
        private final TextStyle textStyle;

        ZoneTextPrinterParser(TextStyle textStyle, Set set, boolean z) {
            TemporalQuery temporalQueryZone = TemporalQueries.zone();
            String strValueOf = String.valueOf(textStyle);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
            sb.append("ZoneText(");
            sb.append(strValueOf);
            sb.append(")");
            super(temporalQueryZone, sb.toString());
            this.cachedTree = new HashMap();
            this.cachedTreeCI = new HashMap();
            this.textStyle = (TextStyle) Objects.requireNonNull(textStyle, "textStyle");
            this.isGeneric = z;
            if (set == null || set.size() == 0) {
                return;
            }
            this.preferredZones = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.preferredZones.add(((ZoneId) it.next()).getId());
            }
        }

        private String getDisplayName(String str, int i, Locale locale) {
            String[] strArr;
            Map concurrentHashMap = null;
            if (this.textStyle == TextStyle.NARROW) {
                return null;
            }
            Map map = cache;
            SoftReference softReference = (SoftReference) map.get(str);
            if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                String[] strArr2 = {str, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), str, str};
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                concurrentHashMap.put(locale, strArr2);
                map.put(str, new SoftReference(concurrentHashMap));
                strArr = strArr2;
            }
            if (i != 0) {
                return i != 1 ? strArr[this.textStyle.zoneNameStyleIndex() + 5] : strArr[this.textStyle.zoneNameStyleIndex() + 3];
            }
            return strArr[this.textStyle.zoneNameStyleIndex() + 1];
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.DateTimeFormatterBuilder$ZoneTextPrinterParser] */
        @Override // j$.time.format.DateTimeFormatterBuilder.ZoneIdPrinterParser, j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) dateTimePrintContext.getValue(TemporalQueries.zoneId());
            if (zoneId == null) {
                return false;
            }
            String id = zoneId.getId();
            if (!(zoneId instanceof ZoneOffset)) {
                TemporalAccessor temporal = dateTimePrintContext.getTemporal();
                ?? IsDaylightSavings = 2;
                IsDaylightSavings = 2;
                IsDaylightSavings = 2;
                IsDaylightSavings = 2;
                if (!this.isGeneric) {
                    if (temporal.isSupported(ChronoField.INSTANT_SECONDS)) {
                        IsDaylightSavings = zoneId.getRules().isDaylightSavings(Instant.from(temporal));
                    } else {
                        ChronoField chronoField = ChronoField.EPOCH_DAY;
                        if (temporal.isSupported(chronoField)) {
                            ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                            if (temporal.isSupported(chronoField2)) {
                                LocalDateTime localDateTimeAtTime = LocalDate.ofEpochDay(temporal.getLong(chronoField)).atTime(LocalTime.ofNanoOfDay(temporal.getLong(chronoField2)));
                                if (zoneId.getRules().getTransition(localDateTimeAtTime) == null) {
                                    IsDaylightSavings = zoneId.getRules().isDaylightSavings(localDateTimeAtTime.atZone(zoneId).toInstant());
                                }
                            }
                        }
                    }
                }
                String displayName = getDisplayName(id, IsDaylightSavings, dateTimePrintContext.getLocale());
                if (displayName != null) {
                    id = displayName;
                }
            }
            sb.append(id);
            return true;
        }
    }

    static {
        HashMap map = new HashMap();
        FIELD_MAP = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        TemporalField temporalField = IsoFields.QUARTER_OF_YEAR;
        map.put('Q', temporalField);
        map.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', JulianFields.MODIFIED_JULIAN_DAY);
        LENGTH_SORT = new Comparator() { // from class: j$.time.format.DateTimeFormatterBuilder.2
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
            }
        };
    }

    public DateTimeFormatterBuilder() {
        this.active = this;
        this.printerParsers = new ArrayList();
        this.valueParserIndex = -1;
        this.parent = null;
        this.optional = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        this.active = this;
        this.printerParsers = new ArrayList();
        this.valueParserIndex = -1;
        this.parent = dateTimeFormatterBuilder;
        this.optional = z;
    }

    private int appendInternal(DateTimePrinterParser dateTimePrinterParser) {
        Objects.requireNonNull(dateTimePrinterParser, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        int i = dateTimeFormatterBuilder.padNextWidth;
        if (i > 0) {
            if (dateTimePrinterParser != null) {
                dateTimePrinterParser = new PadPrinterParserDecorator(dateTimePrinterParser, i, dateTimeFormatterBuilder.padNextChar);
            }
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.active;
            dateTimeFormatterBuilder2.padNextWidth = 0;
            dateTimeFormatterBuilder2.padNextChar = (char) 0;
        }
        this.active.printerParsers.add(dateTimePrinterParser);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = this.active;
        dateTimeFormatterBuilder3.valueParserIndex = -1;
        return dateTimeFormatterBuilder3.printerParsers.size() - 1;
    }

    private DateTimeFormatterBuilder appendValue(NumberPrinterParser numberPrinterParser) {
        NumberPrinterParser numberPrinterParserWithFixedWidth;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        int i = dateTimeFormatterBuilder.valueParserIndex;
        if (i >= 0) {
            NumberPrinterParser numberPrinterParser2 = (NumberPrinterParser) dateTimeFormatterBuilder.printerParsers.get(i);
            if (numberPrinterParser.minWidth == numberPrinterParser.maxWidth && numberPrinterParser.signStyle == SignStyle.NOT_NEGATIVE) {
                numberPrinterParserWithFixedWidth = numberPrinterParser2.withSubsequentWidth(numberPrinterParser.maxWidth);
                appendInternal(numberPrinterParser.withFixedWidth());
                this.active.valueParserIndex = i;
            } else {
                numberPrinterParserWithFixedWidth = numberPrinterParser2.withFixedWidth();
                this.active.valueParserIndex = appendInternal(numberPrinterParser);
            }
            this.active.printerParsers.set(i, numberPrinterParserWithFixedWidth);
        } else {
            dateTimeFormatterBuilder.valueParserIndex = appendInternal(numberPrinterParser);
        }
        return this;
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat timeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            timeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else {
            timeInstance = formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (timeInstance instanceof SimpleDateFormat) {
            return DateTimeFormatterBuilderHelper.transformAndroidJavaTextDateTimePattern(((SimpleDateFormat) timeInstance).toPattern());
        }
        String strValueOf = String.valueOf(timeInstance);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
        sb.append("Can't determine pattern from ");
        sb.append(strValueOf);
        throw new UnsupportedOperationException(sb.toString());
    }

    static /* synthetic */ ZoneId lambda$static$0(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zoneId());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0193  */
    /* JADX WARN: Code duplicated, block: B:102:0x019c  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f A[DONT_INVERT, FALL_THROUGH, PHI: r3
      0x014f: PHI (r3v1 boolean) = (r3v0 boolean), (r3v2 boolean), (r3v0 boolean), (r3v0 boolean), (r3v0 boolean) binds: [B:5:0x0012, B:68:0x0105, B:28:0x0040, B:29:0x0043, B:30:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0151 A[ADDED_TO_REGION] */
    /* JADX WARN: Switch 'out' block B:68:0x0105 for B:30:0x0046 already processed. Defaulting to fallback option. */
    private void parseField(char c, int i, TemporalField temporalField) {
        if (c != 'A') {
            boolean z = false;
            if (c != 'Q') {
                if (c == 'S') {
                    appendFraction(ChronoField.NANO_OF_SECOND, i, i, false);
                    return;
                }
                if (c == 'a') {
                    if (i == 1) {
                        appendText(temporalField, TextStyle.SHORT);
                        return;
                    }
                    StringBuilder sb = new StringBuilder(27);
                    sb.append("Too many pattern letters: ");
                    sb.append(c);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (c != 'k') {
                    if (c == 'q') {
                        z = true;
                    } else if (c != 's') {
                        if (c == 'u' || c == 'y') {
                            if (i == 2) {
                                appendValueReduced(temporalField, 2, 2, ReducedPrinterParser.BASE_DATE);
                                return;
                            } else if (i < 4) {
                                appendValue(temporalField, i, 19, SignStyle.NORMAL);
                                return;
                            } else {
                                appendValue(temporalField, i, 19, SignStyle.EXCEEDS_PAD);
                                return;
                            }
                        }
                        if (c == 'g') {
                            appendValue(temporalField, i, 19, SignStyle.NORMAL);
                            return;
                        }
                        if (c != 'h' && c != 'm') {
                            if (c != 'n') {
                                switch (c) {
                                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                        if (i == 1) {
                                            appendValue(temporalField);
                                            return;
                                        }
                                        if (i == 2 || i == 3) {
                                            appendValue(temporalField, i, 3, SignStyle.NOT_NEGATIVE);
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder(27);
                                        sb2.append("Too many pattern letters: ");
                                        sb2.append(c);
                                        throw new IllegalArgumentException(sb2.toString());
                                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                        break;
                                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                        if (i == 1) {
                                            appendValue(temporalField);
                                            return;
                                        }
                                        StringBuilder sb3 = new StringBuilder(27);
                                        sb3.append("Too many pattern letters: ");
                                        sb3.append(c);
                                        throw new IllegalArgumentException(sb3.toString());
                                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                        if (i == 1 || i == 2 || i == 3) {
                                            appendText(temporalField, TextStyle.SHORT);
                                            return;
                                        }
                                        if (i == 4) {
                                            appendText(temporalField, TextStyle.FULL);
                                            return;
                                        } else {
                                            if (i == 5) {
                                                appendText(temporalField, TextStyle.NARROW);
                                                return;
                                            }
                                            StringBuilder sb4 = new StringBuilder(27);
                                            sb4.append("Too many pattern letters: ");
                                            sb4.append(c);
                                            throw new IllegalArgumentException(sb4.toString());
                                        }
                                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                        break;
                                    default:
                                        switch (c) {
                                            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                                break;
                                            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                                z = true;
                                            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                                if (i != 1 || i == 2) {
                                                    if (c == 'e') {
                                                        appendValue(new WeekBasedFieldPrinterParser(c, i, i, i));
                                                        return;
                                                    }
                                                    if (c == 'E') {
                                                        appendText(temporalField, TextStyle.SHORT);
                                                        return;
                                                    } else if (i == 1) {
                                                        appendValue(temporalField);
                                                        return;
                                                    } else {
                                                        appendValue(temporalField, 2);
                                                        return;
                                                    }
                                                }
                                                if (i == 3) {
                                                    appendText(temporalField, z ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                                                    return;
                                                }
                                                if (i == 4) {
                                                    appendText(temporalField, z ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                                                    return;
                                                } else {
                                                    if (i == 5) {
                                                        appendText(temporalField, z ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                                                        return;
                                                    }
                                                    StringBuilder sb5 = new StringBuilder(27);
                                                    sb5.append("Too many pattern letters: ");
                                                    sb5.append(c);
                                                    throw new IllegalArgumentException(sb5.toString());
                                                }
                                            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                                break;
                                            default:
                                                switch (c) {
                                                    case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                                        if (i == 1) {
                                                            appendValue(new WeekBasedFieldPrinterParser(c, i, i, i));
                                                            return;
                                                        }
                                                        if (i == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        z = true;
                                                        if (i != 1) {
                                                        }
                                                        if (c == 'e') {
                                                            appendValue(new WeekBasedFieldPrinterParser(c, i, i, i));
                                                            return;
                                                        }
                                                        if (c == 'E') {
                                                            appendText(temporalField, TextStyle.SHORT);
                                                            return;
                                                        } else if (i == 1) {
                                                            appendValue(temporalField);
                                                            return;
                                                        } else {
                                                            appendValue(temporalField, 2);
                                                            return;
                                                        }
                                                    case R.styleable.AppCompatTheme_spinnerStyle /* 100 */:
                                                        break;
                                                    case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                                        if (i != 1) {
                                                        }
                                                        if (c == 'e') {
                                                            appendValue(new WeekBasedFieldPrinterParser(c, i, i, i));
                                                            return;
                                                        }
                                                        if (c == 'E') {
                                                            appendText(temporalField, TextStyle.SHORT);
                                                            return;
                                                        } else if (i == 1) {
                                                            appendValue(temporalField);
                                                            return;
                                                        } else {
                                                            appendValue(temporalField, 2);
                                                            return;
                                                        }
                                                    default:
                                                        if (i == 1) {
                                                            appendValue(temporalField);
                                                            return;
                                                        } else {
                                                            appendValue(temporalField, i);
                                                            return;
                                                        }
                                                }
                                                break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
                if (i == 1) {
                    appendValue(temporalField);
                    return;
                } else {
                    if (i == 2) {
                        appendValue(temporalField, i);
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(27);
                    sb6.append("Too many pattern letters: ");
                    sb6.append(c);
                    throw new IllegalArgumentException(sb6.toString());
                }
            }
            if (i != 1) {
            }
            if (c == 'e') {
                appendValue(new WeekBasedFieldPrinterParser(c, i, i, i));
                return;
            }
            if (c == 'E') {
                appendText(temporalField, TextStyle.SHORT);
                return;
            } else if (i == 1) {
                appendValue(temporalField);
                return;
            } else {
                appendValue(temporalField, 2);
                return;
            }
        }
        appendValue(temporalField, i, 19, SignStyle.NOT_NEGATIVE);
    }

    private void parsePattern(String str) {
        int i;
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i3 = i2 + 1;
                while (i3 < str.length() && str.charAt(i3) == cCharAt) {
                    i3++;
                }
                int i4 = i3 - i2;
                if (cCharAt == 'p') {
                    if (i3 >= str.length() || (((cCharAt = str.charAt(i3)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i = i4;
                        i4 = 0;
                    } else {
                        int i5 = i3 + 1;
                        while (i5 < str.length() && str.charAt(i5) == cCharAt) {
                            i5++;
                        }
                        i = i5 - i3;
                        i3 = i5;
                    }
                    if (i4 == 0) {
                        throw new IllegalArgumentException(str.length() != 0 ? "Pad letter 'p' must be followed by valid pad pattern: ".concat(str) : new String("Pad letter 'p' must be followed by valid pad pattern: "));
                    }
                    padNext(i4);
                    i4 = i;
                }
                TemporalField temporalField = (TemporalField) FIELD_MAP.get(Character.valueOf(cCharAt));
                if (temporalField != null) {
                    parseField(cCharAt, i4, temporalField);
                } else if (cCharAt == 'z') {
                    if (i4 > 4) {
                        StringBuilder sb = new StringBuilder(27);
                        sb.append("Too many pattern letters: ");
                        sb.append(cCharAt);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (i4 == 4) {
                        appendZoneText(TextStyle.FULL);
                    } else {
                        appendZoneText(TextStyle.SHORT);
                    }
                } else if (cCharAt == 'V') {
                    if (i4 != 2) {
                        StringBuilder sb2 = new StringBuilder(33);
                        sb2.append("Pattern letter count must be 2: ");
                        sb2.append(cCharAt);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    appendZoneId();
                } else if (cCharAt != 'v') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i4 < 4) {
                            appendOffset("+HHMM", "+0000");
                        } else if (i4 == 4) {
                            appendLocalizedOffset(TextStyle.FULL);
                        } else {
                            if (i4 != 5) {
                                StringBuilder sb3 = new StringBuilder(27);
                                sb3.append("Too many pattern letters: ");
                                sb3.append(cCharAt);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                            appendOffset("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i4 == 1) {
                            appendLocalizedOffset(TextStyle.SHORT);
                        } else {
                            if (i4 != 4) {
                                StringBuilder sb4 = new StringBuilder(38);
                                sb4.append("Pattern letter count must be 1 or 4: ");
                                sb4.append(cCharAt);
                                throw new IllegalArgumentException(sb4.toString());
                            }
                            appendLocalizedOffset(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i4 > 5) {
                            StringBuilder sb5 = new StringBuilder(27);
                            sb5.append("Too many pattern letters: ");
                            sb5.append(cCharAt);
                            throw new IllegalArgumentException(sb5.toString());
                        }
                        appendOffset(OffsetIdPrinterParser.PATTERNS[i4 + (i4 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i4 > 5) {
                            StringBuilder sb6 = new StringBuilder(27);
                            sb6.append("Too many pattern letters: ");
                            sb6.append(cCharAt);
                            throw new IllegalArgumentException(sb6.toString());
                        }
                        if (i4 == 1) {
                            str2 = "+00";
                        } else if (i4 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        appendOffset(OffsetIdPrinterParser.PATTERNS[i4 + (i4 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i4 > 1) {
                            StringBuilder sb7 = new StringBuilder(27);
                            sb7.append("Too many pattern letters: ");
                            sb7.append(cCharAt);
                            throw new IllegalArgumentException(sb7.toString());
                        }
                        appendValue(new WeekBasedFieldPrinterParser(cCharAt, i4, i4, i4));
                    } else if (cCharAt == 'w') {
                        if (i4 > 2) {
                            StringBuilder sb8 = new StringBuilder(27);
                            sb8.append("Too many pattern letters: ");
                            sb8.append(cCharAt);
                            throw new IllegalArgumentException(sb8.toString());
                        }
                        appendValue(new WeekBasedFieldPrinterParser(cCharAt, i4, i4, 2));
                    } else {
                        if (cCharAt != 'Y') {
                            StringBuilder sb9 = new StringBuilder(25);
                            sb9.append("Unknown pattern letter: ");
                            sb9.append(cCharAt);
                            throw new IllegalArgumentException(sb9.toString());
                        }
                        if (i4 == 2) {
                            appendValue(new WeekBasedFieldPrinterParser(cCharAt, i4, i4, 2));
                        } else {
                            appendValue(new WeekBasedFieldPrinterParser(cCharAt, i4, i4, 19));
                        }
                    }
                } else if (i4 == 1) {
                    appendGenericZoneText(TextStyle.SHORT);
                } else {
                    if (i4 != 4) {
                        StringBuilder sb10 = new StringBuilder(35);
                        sb10.append("Wrong number of  pattern letters: ");
                        sb10.append(cCharAt);
                        throw new IllegalArgumentException(sb10.toString());
                    }
                    appendGenericZoneText(TextStyle.FULL);
                }
                i2 = i3 - 1;
            } else if (cCharAt == '\'') {
                int i6 = i2 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 >= str.length() || str.charAt(i8) != '\'') {
                            break;
                        } else {
                            i7 = i8;
                        }
                    }
                    i7++;
                }
                if (i7 >= str.length()) {
                    throw new IllegalArgumentException(str.length() != 0 ? "Pattern ends with an incomplete string literal: ".concat(str) : new String("Pattern ends with an incomplete string literal: "));
                }
                String strSubstring = str.substring(i6, i7);
                if (strSubstring.isEmpty()) {
                    appendLiteral('\'');
                } else {
                    appendLiteral(strSubstring.replace("''", "'"));
                }
                i2 = i7;
            } else if (cCharAt == '[') {
                optionalStart();
            } else if (cCharAt == ']') {
                if (this.active.parent == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                optionalEnd();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    StringBuilder sb11 = new StringBuilder(40);
                    sb11.append("Pattern includes reserved character: '");
                    sb11.append(cCharAt);
                    sb11.append("'");
                    throw new IllegalArgumentException(sb11.toString());
                }
                appendLiteral(cCharAt);
            }
            i2++;
        }
    }

    private DateTimeFormatter toFormatter(Locale locale, ResolverStyle resolverStyle, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.active.parent != null) {
            optionalEnd();
        }
        return new DateTimeFormatter(new CompositePrinterParser(this.printerParsers, false), locale, DecimalStyle.STANDARD, resolverStyle, null, chronology, null);
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        appendInternal(dateTimeFormatter.toPrinterParser(false));
        return this;
    }

    public DateTimeFormatterBuilder appendFraction(TemporalField temporalField, int i, int i2, boolean z) {
        if (i != i2 || z) {
            appendInternal(new FractionPrinterParser(temporalField, i, i2, z));
        } else {
            appendValue(new FractionPrinterParser(temporalField, i, i2, z));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendGenericZoneText(TextStyle textStyle) {
        appendInternal(new ZoneTextPrinterParser(textStyle, null, true));
        return this;
    }

    public DateTimeFormatterBuilder appendInstant() {
        appendInternal(new InstantPrinterParser(-2));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        appendInternal(new CharLiteralPrinterParser(c));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            if (str.length() == 1) {
                appendInternal(new CharLiteralPrinterParser(str.charAt(0)));
            } else {
                appendInternal(new StringLiteralPrinterParser(str));
            }
        }
        return this;
    }

    public DateTimeFormatterBuilder appendLocalized(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        appendInternal(new LocalizedPrinterParser(formatStyle, formatStyle2));
        return this;
    }

    public DateTimeFormatterBuilder appendLocalizedOffset(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        appendInternal(new LocalizedOffsetIdPrinterParser(textStyle));
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        appendInternal(new OffsetIdPrinterParser(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        appendInternal(OffsetIdPrinterParser.INSTANCE_ID_Z);
        return this;
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        Objects.requireNonNull(str, "pattern");
        parsePattern(str);
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        appendInternal(new TextPrinterParser(temporalField, textStyle, DateTimeTextProvider.getInstance()));
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, Map map) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        final DateTimeTextProvider.LocaleStore localeStore = new DateTimeTextProvider.LocaleStore(Collections.singletonMap(textStyle, linkedHashMap));
        appendInternal(new TextPrinterParser(temporalField, textStyle, new DateTimeTextProvider(this) { // from class: j$.time.format.DateTimeFormatterBuilder.1
            @Override // j$.time.format.DateTimeTextProvider
            public String getText(Chronology chronology, TemporalField temporalField2, long j, TextStyle textStyle2, Locale locale) {
                return localeStore.getText(j, textStyle2);
            }

            @Override // j$.time.format.DateTimeTextProvider
            public String getText(TemporalField temporalField2, long j, TextStyle textStyle2, Locale locale) {
                return localeStore.getText(j, textStyle2);
            }
        }));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        appendValue(new NumberPrinterParser(temporalField, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i) {
        Objects.requireNonNull(temporalField, "field");
        if (i >= 1 && i <= 19) {
            appendValue(new NumberPrinterParser(temporalField, i, i, SignStyle.NOT_NEGATIVE));
            return this;
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("The width must be from 1 to 19 inclusive but was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
        if (i == i2 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i2);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i < 1 || i > 19) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("The minimum width must be from 1 to 19 inclusive but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < 1 || i2 > 19) {
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append("The maximum width must be from 1 to 19 inclusive but was ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i2 >= i) {
            appendValue(new NumberPrinterParser(temporalField, i, i2, signStyle));
            return this;
        }
        StringBuilder sb3 = new StringBuilder(86);
        sb3.append("The maximum width must exceed or equal the minimum width but ");
        sb3.append(i2);
        sb3.append(" < ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString());
    }

    public DateTimeFormatterBuilder appendValueReduced(TemporalField temporalField, int i, int i2, ChronoLocalDate chronoLocalDate) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(chronoLocalDate, "baseDate");
        appendValue(new ReducedPrinterParser(temporalField, i, i2, 0, chronoLocalDate));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneId() {
        appendInternal(new ZoneIdPrinterParser(TemporalQueries.zoneId(), "ZoneId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneRegionId() {
        appendInternal(new ZoneIdPrinterParser(QUERY_REGION_ONLY, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle) {
        appendInternal(new ZoneTextPrinterParser(textStyle, null, false));
        return this;
    }

    public DateTimeFormatterBuilder optionalEnd() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        if (dateTimeFormatterBuilder.parent == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.printerParsers.size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.active;
            CompositePrinterParser compositePrinterParser = new CompositePrinterParser(dateTimeFormatterBuilder2.printerParsers, dateTimeFormatterBuilder2.optional);
            this.active = this.active.parent;
            appendInternal(compositePrinterParser);
        } else {
            this.active = this.active.parent;
        }
        return this;
    }

    public DateTimeFormatterBuilder optionalStart() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        dateTimeFormatterBuilder.valueParserIndex = -1;
        this.active = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder padNext(int i) {
        return padNext(i, ' ');
    }

    public DateTimeFormatterBuilder padNext(int i, char c) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("The pad width must be at least one but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        dateTimeFormatterBuilder.padNextWidth = i;
        dateTimeFormatterBuilder.padNextChar = c;
        dateTimeFormatterBuilder.valueParserIndex = -1;
        return this;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        appendInternal(SettingsParser.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseCaseSensitive() {
        appendInternal(SettingsParser.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseLenient() {
        appendInternal(SettingsParser.LENIENT);
        return this;
    }

    public DateTimeFormatterBuilder parseStrict() {
        appendInternal(SettingsParser.STRICT);
        return this;
    }

    public DateTimeFormatter toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    DateTimeFormatter toFormatter(ResolverStyle resolverStyle, Chronology chronology) {
        return toFormatter(Locale.getDefault(), resolverStyle, chronology);
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        return toFormatter(locale, ResolverStyle.SMART, null);
    }
}
