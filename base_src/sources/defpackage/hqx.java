package defpackage;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hqx implements Runnable {
    public final /* synthetic */ hqz a;
    private final /* synthetic */ int b;

    public /* synthetic */ hqx(hqz hqzVar, int i) {
        this.b = i;
        this.a = hqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        ExifInterface exifInterface;
        switch (this.b) {
            case 0:
                hqz hqzVar = this.a;
                hqzVar.e.lock();
                try {
                    try {
                        File fileA = hqzVar.d.a();
                        fileA.getClass();
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(new ByteArrayInputStream(oxh.w(fileA)));
                        if (bitmapDrawable.getBitmap() == null) {
                            File fileA2 = hqzVar.d.a();
                            fileA2.getClass();
                            String strValueOf = String.valueOf(fileA2.getAbsolutePath());
                            hqzVar.H(strValueOf.length() != 0 ? "Could not decode preview file: ".concat(strValueOf) : new String("Could not decode preview file: "));
                            reentrantLock = hqzVar.e;
                        } else {
                            hqzVar.W(bitmapDrawable.getBitmap());
                            reentrantLock = hqzVar.e;
                        }
                    } catch (IOException e) {
                        File fileA3 = hqzVar.d.a();
                        fileA3.getClass();
                        String absolutePath = fileA3.getAbsolutePath();
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 30 + String.valueOf(message).length());
                        sb.append("Could not read preview file: ");
                        sb.append(absolutePath);
                        sb.append(" ");
                        sb.append(message);
                        hqzVar.H(sb.toString());
                        reentrantLock = hqzVar.e;
                    }
                    reentrantLock.unlock();
                    return;
                } catch (Throwable th) {
                    hqzVar.e.unlock();
                    throw th;
                }
            default:
                hqz hqzVar2 = this.a;
                hqzVar2.e.lock();
                try {
                    if (hqzVar2.d.b()) {
                        try {
                            byte[] bArrW = oxh.w(hqzVar2.d.a());
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeByteArray(bArrW, 0, bArrW.length, options);
                            int i = options.outWidth;
                            int i2 = options.outHeight;
                            try {
                                exifInterface = new ExifInterface();
                                exifInterface.r(bArrW);
                            } catch (IOException e2) {
                                String strValueOf2 = String.valueOf(e2.getMessage());
                                hqzVar2.H(strValueOf2.length() != 0 ? "Could not read exif: ".concat(strValueOf2) : new String("Could not read exif: "));
                                exifInterface = null;
                            }
                            new lig(i, i2);
                            ikc ikcVar = new ikc(mbs.JPEG);
                            ikcVar.a(exifInterface);
                            ikcVar.b(lic.CLOCKWISE_0);
                            hqzVar2.r(bArrW, ikcVar);
                            reentrantLock2 = hqzVar2.e;
                        } catch (IOException e3) {
                            reentrantLock2 = hqzVar2.e;
                        }
                        break;
                    } else {
                        reentrantLock2 = hqzVar2.e;
                    }
                    reentrantLock2.unlock();
                    return;
                } catch (Throwable th2) {
                    hqzVar2.e.unlock();
                    throw th2;
                }
        }
    }
}
