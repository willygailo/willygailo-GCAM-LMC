package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bel implements aze {
    @Override // defpackage.aze
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, azt aztVar) throws Throwable {
        try {
            blr.e((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
