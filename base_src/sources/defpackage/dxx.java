package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class dxx implements dxt {
    private final /* synthetic */ int a;

    public dxx(int i) {
        this.a = i;
    }

    @Override // defpackage.dxt
    public final ByteArrayOutputStream a(Bitmap bitmap) {
        switch (this.a) {
            case 0:
                ByteArrayOutputStream byteArrayOutputStreamC = dug.c();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
                bitmap.copyPixelsToBuffer(byteBufferAllocate);
                byte[] bArrArray = byteBufferAllocate.array();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStreamC);
                try {
                    try {
                        dataOutputStream.writeInt(bArrArray.length);
                        dataOutputStream.writeInt(bitmap.getWidth());
                        dataOutputStream.writeInt(bitmap.getHeight());
                        dataOutputStream.writeUTF(bitmap.getConfig().toString());
                        dataOutputStream.write(bArrArray);
                        dataOutputStream.close();
                        return byteArrayOutputStreamC;
                    } catch (IOException e) {
                        throw new IOException("Could not write into ByteArrayOutputStream", e);
                    }
                } catch (Throwable th) {
                    dataOutputStream.close();
                    throw th;
                }
            default:
                ByteArrayOutputStream byteArrayOutputStreamC2 = dug.c();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStreamC2);
                return byteArrayOutputStreamC2;
        }
    }
}
