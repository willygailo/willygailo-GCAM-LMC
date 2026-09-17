package defpackage;

import android.content.Context;
import android.database.Cursor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nhv implements Callable {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ nhv(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return aaq.b(this.a, null);
            case 1:
                Context context = this.a;
                nho nhoVar = nho.DISABLED;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(nhp.a, null, null, null, null);
                    try {
                        if (cursorQuery == null) {
                            ((oug) ((oug) jdk.a.c()).G(3259)).o("Empty Mars status -- Photos may be disabled.");
                            return nho.DISABLED;
                        }
                        cursorQuery.moveToFirst();
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("version"));
                        int i2 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("state"));
                        if (i > 0) {
                            if (nho.values().length <= i2) {
                                ((oug) ((oug) jdk.a.c()).G(3258)).p("Received unknown Mars status: %d", i2);
                                nhoVar = nho.DISABLED;
                            } else {
                                nhoVar = nho.values()[i2];
                            }
                        }
                        cursorQuery.close();
                        return nhoVar;
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                                break;
                            } catch (Throwable th2) {
                            }
                        }
                        throw th;
                    }
                } catch (SecurityException e) {
                    ((oug) ((oug) ((oug) jdk.a.c()).h(e)).G((char) 3257)).o("Failed to query Mars status.");
                    return nho.ACCESS_DENIED;
                }
            default:
                return aaq.a(this.a);
        }
    }
}
