package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oim extends oil {
    private final char a;
    private final char b;

    public oim(char c, char c2) {
        obr.aF(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.oir
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        String strD = oir.d(this.a);
        String strD2 = oir.d(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 27 + String.valueOf(strD2).length());
        sb.append("CharMatcher.inRange('");
        sb.append(strD);
        sb.append("', '");
        sb.append(strD2);
        sb.append("')");
        return sb.toString();
    }
}
