package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class myw {
    public static volatile int a;
    private static Thread b;
    private static volatile Handler c;

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static File c(Uri uri) throws nix {
        if (!uri.getScheme().equals("file")) {
            throw new nix("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new nix("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new nix("Did not expect uri to have authority");
    }

    public static File d(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    public static Handler e() {
        if (c == null) {
            c = new Handler(Looper.getMainLooper());
        }
        return c;
    }

    public static void f() {
        if (i()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static void g() {
        if (!i()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    public static void h(Runnable runnable) {
        e().post(runnable);
    }

    public static boolean i() {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == b;
    }
}
