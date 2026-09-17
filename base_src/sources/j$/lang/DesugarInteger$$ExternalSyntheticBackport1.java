package j$.lang;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class DesugarInteger$$ExternalSyntheticBackport1 {
    public static /* synthetic */ int m(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 - i >= 2 && charSequence.charAt(i) == '+') {
            int i4 = i + 1;
            if (Character.digit(charSequence.charAt(i4), i3) >= 0) {
                i = i4;
            }
        }
        return Integer.parseInt(charSequence.subSequence(i, i2).toString(), i3);
    }
}
