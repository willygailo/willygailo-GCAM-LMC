package defpackage;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nly implements nlx {
    public static final nhd a = nhd.c();
    public static final Pattern b = Pattern.compile("(\\+?\\b[\\d]{1,3}[- .]?)?(\\(?\\d{3,4}(?:\\) |\\)?-|\\)?\\.)[A-Z\\d][-.A-Z\\d]{5,8}[A-Z\\d])");
    public static final Pattern c = Pattern.compile(".*[A-Za-z].*");
    public final List d;

    public nly(List list) {
        this.d = list;
    }

    public static orj a(MatchResult matchResult, int i) {
        return orj.g(Integer.valueOf(matchResult.start(i)), Integer.valueOf(matchResult.end(i)));
    }
}
