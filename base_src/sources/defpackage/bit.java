package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bit implements azw {
    @Override // defpackage.aze
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, azt aztVar) throws Throwable {
        try {
            blr.e(((bis) ((bcl) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.azw
    public final int b() {
        return 1;
    }
}
