package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class amt {
    private static final String a = kus.g("InputMerger");

    public static amt b(String str) {
        try {
            return (amt) Class.forName(str).newInstance();
        } catch (Exception e) {
            kus.l();
            kus.i(a, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract amq a(List list);
}
