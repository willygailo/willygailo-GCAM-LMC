package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nhm {
    private final nhl a;

    public nhm(int i) {
        this.a = new nhl(i);
    }

    public final Pattern a(String str) {
        Pattern pattern = (Pattern) this.a.a(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        this.a.b(str, patternCompile);
        return patternCompile;
    }
}
