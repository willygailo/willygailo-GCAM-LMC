package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oir implements ojf {
    protected oir() {
    }

    public static String d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    public static void e(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0:
                break;
            case 1:
                charSequence.charAt(0);
                break;
            case 2:
                charSequence.charAt(0);
                charSequence.charAt(1);
                break;
            default:
                new oij(charSequence);
                break;
        }
    }

    public static void f(char c, char c2) {
        new oim(c, c2);
    }

    @Override // defpackage.ojf
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public int c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        obr.aY(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
