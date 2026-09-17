package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class odu {
    public final Context a;

    public odu(Context context) {
        this.a = context;
    }

    public odu(Context context, byte[] bArr) {
        new ConcurrentHashMap();
        myw.b(true, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }

    public odu(Context context, byte[] bArr, byte[] bArr2) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jA = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jA += a(file2);
            }
        }
        return jA;
    }

    public final void b(Intent intent) {
        if (!(this.a instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            nmk.a.d(this, "Could not find application for intent fulfillment.", new Object[0]);
        }
    }
}
