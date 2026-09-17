package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oin extends oil {
    private final char a;

    public oin(char c) {
        this.a = c;
    }

    @Override // defpackage.oir
    public final boolean b(char c) {
        return c == this.a;
    }

    public final String toString() {
        String strD = oir.d(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strD);
        sb.append("')");
        return sb.toString();
    }
}
