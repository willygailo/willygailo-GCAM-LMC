package defpackage;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public class aav {
    public static int b(Context context, String str) {
        eu.c(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
