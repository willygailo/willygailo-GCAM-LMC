package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;

/* JADX INFO: loaded from: classes2.dex */
public final class oxx implements oxt {
    public int a = 0;
    public int b = -1;
    public final Object[] c;
    public final StringBuilder d;
    public int e;
    private final owr f;

    public oxx(owr owrVar, Object[] objArr, StringBuilder sb) {
        oxh.x(owrVar, "context");
        this.f = owrVar;
        this.e = 0;
        this.c = (Object[]) oxh.x(objArr, "arguments");
        this.d = sb;
    }

    public static void d(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(ovt.b(obj));
        sb.append("]");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0164  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0071  */
    /* JADX WARN: Code duplicated, block: B:51:0x0078  */
    /* JADX WARN: Code duplicated, block: B:53:0x007e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0081  */
    /* JADX WARN: Code duplicated, block: B:60:0x008c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0099  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x00af  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    @Override // defpackage.oxt
    public final void a(Object obj, ovm ovmVar, ovn ovnVar) {
        StringBuilder sb;
        String string;
        int i;
        Formattable formattable;
        int i2;
        Formatter formatter;
        int i3;
        int iIntValue;
        ovn ovnVar2;
        Number number;
        boolean zD;
        long jLongValue;
        String string2;
        int i4;
        int i5;
        boolean zIsValidCodePoint;
        switch (ovmVar.m) {
            case GENERAL:
                sb = this.d;
                switch (ovmVar) {
                    case null:
                        if (!(obj instanceof Formattable)) {
                            formattable = (Formattable) obj;
                            i2 = ovnVar.b & 162;
                            if (i2 != 0) {
                                int i6 = (i2 & 32) == 0 ? 0 : 1;
                                if ((i2 & 128) != 0) {
                                    i3 = 2;
                                } else {
                                    i3 = 0;
                                }
                                i2 = i6 | i3 | ((i2 & 2) != 0 ? 4 : 0);
                            }
                            int length = sb.length();
                            formatter = new Formatter(sb, ovt.a);
                            try {
                                formattable.formatTo(formatter, i2, ovnVar.c, ovnVar.d);
                                return;
                            } catch (RuntimeException e) {
                                sb.setLength(length);
                                try {
                                    formatter.out().append(ovt.a(formattable, e));
                                    return;
                                } catch (IOException e2) {
                                    return;
                                }
                            }
                        }
                        if (ovnVar.c()) {
                            sb.append(ovt.b(obj));
                            return;
                        }
                        break;
                    case 1:
                    case 3:
                        if (ovnVar.c()) {
                            sb.append(obj);
                            return;
                        }
                        break;
                    case 2:
                        if (ovnVar.c()) {
                            if (obj instanceof Character) {
                                sb.append(obj);
                                return;
                            }
                            iIntValue = ((Number) obj).intValue();
                            if ((iIntValue >>> 16) == 0) {
                                sb.append((char) iIntValue);
                                return;
                            } else {
                                sb.append(Character.toChars(iIntValue));
                                return;
                            }
                        }
                        break;
                    case 5:
                        if (ovnVar.c()) {
                            ovnVar2 = ovnVar;
                        } else {
                            i4 = ovnVar.b;
                            i5 = i4 & 128;
                            if (i5 == 0) {
                                ovnVar2 = ovn.a;
                            } else if (i5 != i4 && ovnVar.c == -1 && ovnVar.d == -1) {
                                ovnVar2 = ovnVar;
                            } else {
                                ovnVar2 = new ovn(i5, -1, -1);
                            }
                        }
                        if (ovnVar2.equals(ovnVar)) {
                            number = (Number) obj;
                            zD = ovnVar.d();
                            jLongValue = number.longValue();
                            if (number instanceof Long) {
                                ovt.c(sb, jLongValue, zD);
                                return;
                            }
                            if (number instanceof Integer) {
                                ovt.c(sb, jLongValue & 4294967295L, zD);
                                return;
                            }
                            if (number instanceof Byte) {
                                ovt.c(sb, jLongValue & 255, zD);
                                return;
                            }
                            if (number instanceof Short) {
                                ovt.c(sb, jLongValue & 65535, zD);
                                return;
                            }
                            if (number instanceof BigInteger) {
                                string2 = ((BigInteger) number).toString(16);
                                if (zD) {
                                    string2 = string2.toUpperCase(ovt.a);
                                }
                                sb.append(string2);
                                return;
                            }
                            String strValueOf = String.valueOf(number.getClass());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 25);
                            sb2.append("unsupported number type: ");
                            sb2.append(strValueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        break;
                }
                string = ovmVar.o;
                if (!ovnVar.c()) {
                    i = ovmVar.l;
                    if (ovnVar.d()) {
                        i &= 65503;
                    }
                    StringBuilder sb3 = new StringBuilder("%");
                    ovnVar.f(sb3);
                    sb3.append((char) i);
                    string = sb3.toString();
                }
                sb.append(String.format(ovt.a, string, obj));
            case BOOLEAN:
                zIsValidCodePoint = obj instanceof Boolean;
                break;
            case CHARACTER:
                if (!(obj instanceof Character)) {
                    zIsValidCodePoint = (!(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short)) ? false : Character.isValidCodePoint(((Number) obj).intValue());
                } else {
                    zIsValidCodePoint = true;
                }
                break;
            case INTEGRAL:
                zIsValidCodePoint = (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
                break;
            case FLOAT:
                zIsValidCodePoint = (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
                break;
            default:
                throw null;
        }
        if (!zIsValidCodePoint) {
            d(this.d, obj, ovmVar.o);
            return;
        }
        sb = this.d;
        switch (ovmVar) {
            case STRING:
                if (!(obj instanceof Formattable)) {
                    formattable = (Formattable) obj;
                    i2 = ovnVar.b & 162;
                    if (i2 != 0) {
                        if ((i2 & 32) == 0) {
                        }
                        if ((i2 & 128) != 0) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        i2 = i6 | i3 | ((i2 & 2) != 0 ? 4 : 0);
                    }
                    int length2 = sb.length();
                    formatter = new Formatter(sb, ovt.a);
                    formattable.formatTo(formatter, i2, ovnVar.c, ovnVar.d);
                    return;
                }
                if (ovnVar.c()) {
                    sb.append(ovt.b(obj));
                    return;
                }
                break;
            case BOOLEAN:
            case DECIMAL:
                if (ovnVar.c()) {
                    sb.append(obj);
                    return;
                }
                break;
            case CHAR:
                if (ovnVar.c()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    iIntValue = ((Number) obj).intValue();
                    if ((iIntValue >>> 16) == 0) {
                        sb.append((char) iIntValue);
                        return;
                    } else {
                        sb.append(Character.toChars(iIntValue));
                        return;
                    }
                }
                break;
            case HEX:
                if (ovnVar.c()) {
                    i4 = ovnVar.b;
                    i5 = i4 & 128;
                    if (i5 == 0) {
                        ovnVar2 = ovn.a;
                    } else {
                        if (i5 != i4) {
                        }
                        ovnVar2 = new ovn(i5, -1, -1);
                    }
                } else {
                    ovnVar2 = ovnVar;
                }
                if (ovnVar2.equals(ovnVar)) {
                    number = (Number) obj;
                    zD = ovnVar.d();
                    jLongValue = number.longValue();
                    if (number instanceof Long) {
                        ovt.c(sb, jLongValue, zD);
                        return;
                    }
                    if (number instanceof Integer) {
                        ovt.c(sb, jLongValue & 4294967295L, zD);
                        return;
                    }
                    if (number instanceof Byte) {
                        ovt.c(sb, jLongValue & 255, zD);
                        return;
                    }
                    if (number instanceof Short) {
                        ovt.c(sb, jLongValue & 65535, zD);
                        return;
                    }
                    if (number instanceof BigInteger) {
                        string2 = ((BigInteger) number).toString(16);
                        if (zD) {
                            string2 = string2.toUpperCase(ovt.a);
                        }
                        sb.append(string2);
                        return;
                    }
                    String strValueOf2 = String.valueOf(number.getClass());
                    StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf2).length() + 25);
                    sb4.append("unsupported number type: ");
                    sb4.append(strValueOf2);
                    throw new IllegalStateException(sb4.toString());
                }
                break;
        }
        string = ovmVar.o;
        if (!ovnVar.c()) {
            i = ovmVar.l;
            if (ovnVar.d()) {
                i &= 65503;
            }
            StringBuilder sb5 = new StringBuilder("%");
            ovnVar.f(sb5);
            sb5.append((char) i);
            string = sb5.toString();
        }
        sb.append(String.format(ovt.a, string, obj));
    }

    public final oxy b() {
        return this.f.a;
    }

    public final String c() {
        return this.f.b;
    }
}
