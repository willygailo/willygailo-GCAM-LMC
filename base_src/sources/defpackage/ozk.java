package defpackage;

import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ozk {
    public static final byte[] a(File file) throws Throwable {
        ozi oziVar = new ozi(ozi.a);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            oziVar.c.addFirst(fileInputStream);
            byte[] byteArray = ByteStreams.toByteArray(fileInputStream, fileInputStream.getChannel().size());
            oziVar.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                oziVar.d = th;
                okd.c(th, IOException.class);
                throw new RuntimeException(th);
            } catch (Throwable th2) {
                oziVar.close();
                throw th2;
            }
        }
    }
}
