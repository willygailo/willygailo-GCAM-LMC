package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class nae {
    public static final ouj a = ouj.h("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector");
    public final qkg b;

    static {
        ope.K("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
        Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
        Pattern.compile("([^\\?]+)(\\?+)");
        Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
        Pattern.compile("([a-zA-Z0-9-_]+)");
        Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    }

    public nae(qkg qkgVar) {
        this.b = qkgVar;
    }
}
