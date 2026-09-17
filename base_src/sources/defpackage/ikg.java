package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ikg implements pgk {
    final /* synthetic */ Object a;
    final /* synthetic */ ikh b;

    public ikg(ikh ikhVar, Object obj) {
        this.b = ikhVar;
        this.a = obj;
    }

    @Override // defpackage.pgk
    public final /* synthetic */ pht a(Object obj) {
        try {
            ayr ayrVarF = ((ayu) obj).f(this.b.c);
            if (ayrVarF != null) {
                try {
                    File fileD = ayrVarF.d();
                    Object obj2 = this.a;
                    fileD.getClass();
                    FileOutputStream fileOutputStream = new FileOutputStream(fileD);
                    try {
                        int i = ((ikd) obj2).b.e;
                        fileOutputStream.write(i & 255);
                        fileOutputStream.write(i >> 8);
                        ((ikd) obj2).a.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                        fileOutputStream.close();
                        ayrVarF.c();
                        synchronized (this.b.f) {
                            this.b.e = null;
                        }
                        ayrVarF.b();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    ayrVarF.b();
                    throw th3;
                }
            }
            return plk.V(null);
        } catch (IOException e) {
            return plk.U(e);
        }
    }
}
