package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oik extends oir {
    static final oir a = new oik();

    private oik() {
    }

    @Override // defpackage.oir
    public final boolean b(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case ' ':
            case 133:
            case 5760:
            case 8232:
            case 8233:
            case 8287:
            case 12288:
                return true;
            case 8199:
                return false;
            default:
                return c >= 8192 && c <= 8202;
        }
    }

    public final String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
