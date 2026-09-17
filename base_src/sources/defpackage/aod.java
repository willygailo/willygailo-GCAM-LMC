package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class aod {
    public static final String a = kus.g("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public static String b() {
        return "androidx.work.workdb";
    }
}
