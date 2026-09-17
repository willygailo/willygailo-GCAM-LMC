package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class gi {
    static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void c(Rect rect, Rect rect2) {
        if (rect.isEmpty()) {
            return;
        }
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        if (!rect.intersect(rect2)) {
            rect.setEmpty();
            return;
        }
        e(rect, rect);
        int iCenterX2 = iCenterX - rect.centerX();
        int iCenterY2 = iCenterY - rect.centerY();
        rect.offset(iCenterX2, iCenterY2);
        if (rect2.contains(rect)) {
            return;
        }
        rect.offset(-iCenterX2, -iCenterY2);
    }

    public static void d(Rect rect, Rect rect2) {
        rect.set(rect2.left, (rect2.top + rect2.bottom) / 2, rect2.right, rect2.bottom);
    }

    public static void e(Rect rect, Rect rect2) {
        int iMin = Math.min(rect2.width(), rect2.height()) / 2;
        rect.set(rect2.centerX() - iMin, rect2.centerY() - iMin, rect2.centerX() + iMin, rect2.centerY() + iMin);
    }

    public static void f(Rect rect, Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.setEmpty();
        } else {
            rect.set(rect2.left, rect2.top, rect2.left + rect2.height(), rect2.bottom);
        }
    }

    public static void g(Rect rect, Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.set(rect2);
        } else {
            rect.set(rect2.left + rect2.height(), rect2.top, rect2.right, rect2.bottom);
        }
    }

    public static void h(Rect rect, Rect rect2) {
        rect.set(rect2.left, rect2.top, rect2.right, (rect2.top + rect2.bottom) / 2);
    }

    public static void i(Rect rect, Rect rect2, float f) {
        rect.set(rect2);
        float f2 = 0.5f - (f / 2.0f);
        rect.inset((int) (rect.width() * f2), (int) (rect.height() * f2));
    }

    public static boolean j(Rect rect) {
        int iWidth = rect.width();
        float fHeight = rect.height();
        return ((float) iWidth) > fHeight + fHeight;
    }

    public static String k(atc atcVar) {
        TimeZone timeZone;
        StringBuffer stringBuffer = new StringBuffer();
        DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
        stringBuffer.append(decimalFormat.format(atcVar.a));
        if (atcVar.b == 0) {
            return stringBuffer.toString();
        }
        decimalFormat.applyPattern("'-'00");
        stringBuffer.append(decimalFormat.format(atcVar.b));
        int i = atcVar.c;
        if (i == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append(decimalFormat.format(i));
        if (atcVar.d != 0 || atcVar.e != 0 || atcVar.f != 0 || atcVar.h != 0 || ((timeZone = atcVar.g) != null && timeZone.getRawOffset() != 0)) {
            stringBuffer.append('T');
            decimalFormat.applyPattern("00");
            stringBuffer.append(decimalFormat.format(atcVar.d));
            stringBuffer.append(':');
            stringBuffer.append(decimalFormat.format(atcVar.e));
            int i2 = atcVar.f;
            if (i2 != 0) {
                int i3 = atcVar.h;
                decimalFormat.applyPattern(":00.#########");
                double d = i2;
                double d2 = i3;
                Double.isNaN(d2);
                Double.isNaN(d);
                stringBuffer.append(decimalFormat.format(d + (d2 / 1.0E9d)));
            } else if (atcVar.h != 0) {
                i2 = 0;
                int i4 = atcVar.h;
                decimalFormat.applyPattern(":00.#########");
                double d3 = i2;
                double d4 = i4;
                Double.isNaN(d4);
                Double.isNaN(d3);
                stringBuffer.append(decimalFormat.format(d3 + (d4 / 1.0E9d)));
            }
            if (atcVar.g != null) {
                int offset = atcVar.g.getOffset(atcVar.a().getTimeInMillis());
                if (offset == 0) {
                    stringBuffer.append('Z');
                } else {
                    int iAbs = Math.abs((offset % 3600000) / 60000);
                    decimalFormat.applyPattern("+00;-00");
                    stringBuffer.append(decimalFormat.format(offset / 3600000));
                    decimalFormat.applyPattern(":00");
                    stringBuffer.append(decimalFormat.format(iAbs));
                }
            }
        }
        return stringBuffer.toString();
    }

    public static atc l(String str) throws ass {
        boolean z;
        int i;
        int iC;
        int i2;
        if (str == null || str.length() == 0) {
            throw new ass("Empty convert-string", 5);
        }
        atc atcVar = new atc();
        gj.d(str);
        ata ataVar = new ata(str);
        int i3 = 0;
        if (ataVar.b(0) == 'T') {
            z = true;
        } else if (ataVar.d() < 2 || ataVar.b(1) != ':') {
            z = ataVar.d() >= 3 && ataVar.b(2) == ':';
        } else {
            z = true;
        }
        if (!z) {
            if (ataVar.b(0) == '-') {
                ataVar.e();
            }
            int iC2 = ataVar.c("Invalid year in date string", 9999);
            if (ataVar.f() && ataVar.a() != '-') {
                throw new ass("Invalid date string, after year", 5);
            }
            if (ataVar.b(0) == '-') {
                iC2 = -iC2;
            }
            atcVar.a = Math.min(Math.abs(iC2), 9999);
            if (ataVar.f()) {
                ataVar.e();
                int iC3 = ataVar.c("Invalid month in date string", 12);
                if (ataVar.f() && ataVar.a() != '-') {
                    throw new ass("Invalid date string, after month", 5);
                }
                atcVar.c(iC3);
                if (ataVar.f()) {
                    ataVar.e();
                    int iC4 = ataVar.c("Invalid day in date string", 31);
                    if (ataVar.f() && ataVar.a() != 'T') {
                        throw new ass("Invalid date string, after day", 5);
                    }
                    atcVar.b(iC4);
                    if (ataVar.f()) {
                    }
                }
            }
            return atcVar;
        }
        atcVar.c(1);
        atcVar.b(1);
        if (ataVar.a() == 'T') {
            ataVar.e();
        } else if (!z) {
            throw new ass("Invalid date string, missing 'T' after date", 5);
        }
        int iC5 = ataVar.c("Invalid hour in date string", 23);
        if (ataVar.a() != ':') {
            throw new ass("Invalid date string, after hour", 5);
        }
        atcVar.d = Math.min(Math.abs(iC5), 23);
        ataVar.e();
        int iC6 = ataVar.c("Invalid minute in date string", 59);
        if (ataVar.f() && ataVar.a() != ':' && ataVar.a() != 'Z' && ataVar.a() != '+' && ataVar.a() != '-') {
            throw new ass("Invalid date string, after minute", 5);
        }
        atcVar.e = Math.min(Math.abs(iC6), 59);
        if (ataVar.a() == ':') {
            ataVar.e();
            int iC7 = ataVar.c("Invalid whole seconds in date string", 59);
            if (ataVar.f() && ataVar.a() != '.' && ataVar.a() != 'Z' && ataVar.a() != '+' && ataVar.a() != '-') {
                throw new ass("Invalid date string, after whole seconds", 5);
            }
            atcVar.f = Math.min(Math.abs(iC7), 59);
            if (ataVar.a() == '.') {
                ataVar.e();
                int i4 = ataVar.a;
                int iC8 = ataVar.c("Invalid fractional seconds in date string", 999999999);
                if (ataVar.a() != 'Z' && ataVar.a() != '+' && ataVar.a() != '-') {
                    throw new ass("Invalid date string, after fractional second", 5);
                }
                int i5 = ataVar.a - i4;
                while (i5 > 9) {
                    iC8 /= 10;
                    i5--;
                }
                while (i5 < 9) {
                    iC8 *= 10;
                    i5++;
                }
                atcVar.h = iC8;
            }
        }
        if (ataVar.a() == 'Z') {
            ataVar.e();
            i = 0;
            iC = 0;
        } else if (ataVar.f()) {
            if (ataVar.a() == '+') {
                i2 = 1;
            } else {
                if (ataVar.a() != '-') {
                    throw new ass("Time zone must begin with 'Z', '+', or '-'", 5);
                }
                i2 = -1;
            }
            ataVar.e();
            int iC9 = ataVar.c("Invalid time zone hour in date string", 23);
            if (ataVar.a() != ':') {
                throw new ass("Invalid date string, after time zone hour", 5);
            }
            ataVar.e();
            iC = ataVar.c("Invalid time zone minute in date string", 59);
            i = i2;
            i3 = iC9;
        } else {
            i = 0;
            iC = 0;
        }
        atcVar.g = new SimpleTimeZone(((i3 * 3600000) + (iC * 60000)) * i, "");
        if (ataVar.f()) {
            throw new ass("Invalid date string, extra chars at end", 5);
        }
        return atcVar;
    }
}
