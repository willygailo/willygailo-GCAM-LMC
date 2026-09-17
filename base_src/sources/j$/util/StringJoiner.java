package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class StringJoiner {
    private final String delimiter;
    private String[] elts;
    private String emptyValue;
    private int len;
    private final String prefix;
    private int size;
    private final String suffix;

    public StringJoiner(CharSequence charSequence) {
        this(charSequence, "", "");
    }

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.requireNonNull(charSequence2, "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull(charSequence3, "The suffix must not be null");
        this.prefix = charSequence2.toString();
        this.delimiter = charSequence.toString();
        this.suffix = charSequence3.toString();
    }

    private void compactElts() {
        String[] strArr;
        if (this.size > 1) {
            char[] cArr = new char[this.len];
            int chars = getChars(this.elts[0], cArr, 0);
            int i = 1;
            do {
                int chars2 = chars + getChars(this.delimiter, cArr, chars);
                chars = chars2 + getChars(this.elts[i], cArr, chars2);
                strArr = this.elts;
                strArr[i] = null;
                i++;
            } while (i < this.size);
            this.size = 1;
            strArr[0] = new String(cArr);
        }
    }

    private static int getChars(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public StringJoiner add(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.elts;
        if (strArr == null) {
            this.elts = new String[8];
        } else {
            int i = this.size;
            if (i == strArr.length) {
                this.elts = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.len += this.delimiter.length();
        }
        this.len += strValueOf.length();
        String[] strArr2 = this.elts;
        int i2 = this.size;
        this.size = i2 + 1;
        strArr2[i2] = strValueOf;
        return this;
    }

    public int length() {
        String str;
        return (this.size != 0 || (str = this.emptyValue) == null) ? this.len + this.prefix.length() + this.suffix.length() : str.length();
    }

    public StringJoiner merge(StringJoiner stringJoiner) {
        stringJoiner.getClass();
        if (stringJoiner.elts == null) {
            return this;
        }
        stringJoiner.compactElts();
        return add(stringJoiner.elts[0]);
    }

    public String toString() {
        String str;
        String[] strArr = this.elts;
        if (strArr == null && (str = this.emptyValue) != null) {
            return str;
        }
        int i = this.size;
        int length = this.prefix.length() + this.suffix.length();
        if (length == 0) {
            compactElts();
            return i == 0 ? "" : strArr[0];
        }
        String str2 = this.delimiter;
        char[] cArr = new char[this.len + length];
        int chars = getChars(this.prefix, cArr, 0);
        if (i > 0) {
            chars += getChars(strArr[0], cArr, chars);
            for (int i2 = 1; i2 < i; i2++) {
                int chars2 = chars + getChars(str2, cArr, chars);
                chars = chars2 + getChars(strArr[i2], cArr, chars2);
            }
        }
        getChars(this.suffix, cArr, chars);
        return new String(cArr);
    }
}
