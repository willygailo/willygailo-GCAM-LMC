package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owp {
    private static String a = "owz";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] d = {"owz", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int a() {
        return ((oyd) oyd.a.get()).b;
    }

    public static long b() {
        return own.a.c();
    }

    public static ovr d(String str) {
        return own.a.e(str);
    }

    public static ovv f() {
        return i().a();
    }

    public static owo g() {
        return own.a.h();
    }

    public static oxh i() {
        return own.a.j();
    }

    public static oxp k() {
        return i().b();
    }

    public static String l() {
        return own.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract ovr e(String str);

    protected abstract owo h();

    protected oxh j() {
        return oxj.a;
    }

    protected abstract String m();
}
