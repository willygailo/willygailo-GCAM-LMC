package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bjd implements bjg {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    @Override // defpackage.bjg
    public final bcl a(bcl bclVar, azt aztVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) bclVar.c()).compress(this.a, 100, byteArrayOutputStream);
        bclVar.e();
        return new bii(byteArrayOutputStream.toByteArray());
    }
}
