package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bgm implements azw {
    public static final azs a = azs.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final azs b = azs.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final bct c;

    @Deprecated
    public bgm() {
        this.c = null;
    }

    public bgm(bct bctVar) {
        this.c = bctVar;
    }

    @Override // defpackage.aze
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, azt aztVar) {
        Bitmap bitmap = (Bitmap) ((bcl) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) aztVar.b(b);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        blz.b();
        int iIntValue = ((Integer) aztVar.b(a)).intValue();
        OutputStream baaVar = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bct bctVar = this.c;
                baaVar = bctVar != null ? new baa(fileOutputStream, bctVar) : fileOutputStream;
                try {
                    bitmap.compress(compressFormat, iIntValue, baaVar);
                    baaVar.close();
                    try {
                        baaVar.close();
                        return true;
                    } catch (IOException e) {
                        return true;
                    }
                } catch (IOException e2) {
                    if (baaVar != null) {
                        try {
                            baaVar.close();
                            return false;
                        } catch (IOException e3) {
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (baaVar != null) {
                        try {
                            baaVar.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                baaVar = fileOutputStream;
            } catch (Throwable th2) {
                th = th2;
                baaVar = fileOutputStream;
            }
        } catch (IOException e6) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.azw
    public final int b() {
        return 2;
    }
}
