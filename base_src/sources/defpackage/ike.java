package defpackage;

import android.graphics.BitmapFactory;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class ike implements pgk {
    final /* synthetic */ ikh a;

    public ike(ikh ikhVar) {
        this.a = ikhVar;
    }

    @Override // defpackage.pgk
    public final /* bridge */ /* synthetic */ pht a(Object obj) {
        try {
            ayt aytVarA = ((ayu) obj).a(this.a.c);
            if (aytVarA == null) {
                return plk.V(null);
            }
            FileInputStream fileInputStream = new FileInputStream(aytVarA.a());
            try {
                ikd ikdVar = new ikd(BitmapFactory.decodeStream(fileInputStream), lic.b((fileInputStream.read() & 255) | ((fileInputStream.read() & 255) << 8)));
                synchronized (this.a.f) {
                    this.a.e = ikdVar;
                }
                pht phtVarV = plk.V(ikdVar);
                fileInputStream.close();
                return phtVarV;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (IOException e) {
            return plk.U(e);
        }
    }
}
