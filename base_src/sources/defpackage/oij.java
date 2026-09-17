package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class oij extends oir {
    private final char[] a;

    public oij(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.oir
    public final boolean b(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(oir.d(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
