package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class azj implements azo {
    final /* synthetic */ baq a;
    final /* synthetic */ bct b;

    public azj(baq baqVar, bct bctVar) {
        this.a = baqVar;
        this.b = bctVar;
    }

    @Override // defpackage.azo
    public final ImageHeaderParser$ImageType a(azg azgVar) throws Throwable {
        bht bhtVar;
        try {
            bhtVar = new bht(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = azgVar.c(bhtVar);
                try {
                    bhtVar.close();
                } catch (IOException e) {
                }
                this.a.a();
                return imageHeaderParser$ImageTypeC;
            } catch (Throwable th) {
                th = th;
                if (bhtVar != null) {
                    try {
                        bhtVar.close();
                    } catch (IOException e2) {
                    }
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bhtVar = null;
        }
    }
}
