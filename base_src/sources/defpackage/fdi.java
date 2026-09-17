package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class fdi implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ fdj b;

    public fdi(fdj fdjVar, byte[] bArr) {
        this.b = fdjVar;
        this.a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double d;
        try {
            try {
                String str = (String) this.b.E.remove(0);
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                File file = new File(str);
                String.valueOf(String.valueOf(file)).length();
                if (fcv.b()) {
                    byte[] bArr = this.a;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    bitmapDecodeByteArray.recycle();
                } else {
                    fileOutputStream.write(this.a);
                }
                fileOutputStream.close();
                fdj fdjVar = this.b;
                if (fdjVar.n < fdjVar.C.size()) {
                    fdj fdjVar2 = this.b;
                    ((few) fdjVar2.C.get(fdjVar2.n)).b = file.getAbsolutePath();
                }
                int length = this.a.length;
                fdj fdjVar3 = this.b;
                fdjVar3.m.get(fdjVar3.n);
                this.b.D.remove(0);
                fcx fcxVar = this.b.A;
                String absolutePath = file.getAbsolutePath();
                String strValueOf = String.valueOf(absolutePath);
                if (strValueOf.length() != 0) {
                    "alignNextImage called for ".concat(strValueOf);
                } else {
                    new String("alignNextImage called for ");
                }
                try {
                    fcxVar.a.put(absolutePath);
                    fdj fdjVar4 = this.b;
                    fdjVar4.n++;
                    fdo fdoVar = fdjVar4.F;
                    try {
                        String attribute = new ExifInterface(file.getAbsolutePath()).getAttribute("ExposureTime");
                        if (attribute != null) {
                            try {
                                d = Double.parseDouble(attribute);
                            } catch (NumberFormatException e) {
                                d = -2.0d;
                            }
                        } else {
                            d = -1.0d;
                        }
                    } catch (IOException e2) {
                        d = -3.0d;
                    }
                    fdoVar.b = d;
                    fdoVar.a();
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Unexpected interruption");
                }
            } catch (IndexOutOfBoundsException e4) {
                e4.printStackTrace();
            }
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }
}
