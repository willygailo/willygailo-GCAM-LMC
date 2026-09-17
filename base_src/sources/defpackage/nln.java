package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nln {
    public static final Pattern a = Pattern.compile("[\\dOo]*(?:\\d[Oo]|[Oo]\\d)[\\dOo]*");
    public static final Pattern b = Pattern.compile("[\\dg]*(?:\\d[g]|[g]\\d)[\\dg]*");
    public static final Pattern c = Pattern.compile("[Oo]");
    public static final Pattern d = Pattern.compile("[g]");
    public static final Pattern e = Pattern.compile("fax[^0-9a-zA-Z]", 2);
    public static final List f = Collections.emptyList();
    public final nhd g = nhd.c();
    public final List h;
    public final nlx i;

    public nln(List list) {
        this.h = list;
        this.i = new nly(list);
    }

    public static orl a(CharSequence charSequence, Pattern pattern, Pattern pattern2, String str) {
        opb opbVar = opb.a;
        ArrayList arrayListAg = obr.ag();
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            Matcher matcher2 = pattern2.matcher(matcher.group());
            while (matcher2.find()) {
                ohh.B(orj.g(Integer.valueOf(matcher.start() + matcher2.start()), Integer.valueOf(matcher.start() + matcher2.end())), str, arrayListAg);
            }
        }
        return ohh.A(arrayListAg);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:81:0x0165  */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0163, code lost:
    
        if (r11.q(r13) != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(defpackage.nlh r17, defpackage.orl r18, defpackage.nlm r19) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nln.b(nlh, orl, nlm):java.util.List");
    }
}
