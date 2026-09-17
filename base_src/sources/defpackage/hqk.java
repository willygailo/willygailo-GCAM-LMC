package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class hqk implements hsn {
    final /* synthetic */ File a;
    final /* synthetic */ hsa b;
    final /* synthetic */ hql c;

    public hqk(hql hqlVar, File file, hsa hsaVar) {
        this.c = hqlVar;
        this.a = file;
        this.b = hsaVar;
    }

    @Override // defpackage.hsn
    public final void a() {
        this.c.c.execute(new hqj(this.a, 0));
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void c(fjz fjzVar) {
    }

    @Override // defpackage.hsn
    public final void d(final Bitmap bitmap) {
        if (this.c.b.k(ddl.aY)) {
            return;
        }
        Executor executor = this.c.c;
        final File file = this.a;
        final hsa hsaVar = this.b;
        executor.execute(new Runnable() { // from class: hqi
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap2 = bitmap;
                File file2 = file;
                hsa hsaVar2 = hsaVar;
                try {
                    File parentFile = file2.getParentFile();
                    parentFile.getClass();
                    if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                        ((oug) ((oug) hql.a.b()).G((char) 2601)).r("Could not create directory %s", parentFile);
                        return;
                    }
                    lmi lmiVarB = lmi.b();
                    lmiVarB.g(hsaVar2.d());
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        ExifInterface exifInterface = lmiVarB.a;
                        if (bitmap2 == null) {
                            throw new IllegalArgumentException("Argument is null");
                        }
                        ozj ozjVar = new ozj(fileOutputStream);
                        try {
                            OutputStream outputStreamM = exifInterface.m(ozjVar);
                            try {
                                bitmap2.compress(Bitmap.CompressFormat.JPEG, 90, outputStreamM);
                                outputStreamM.close();
                                ozjVar.flush();
                                ozjVar.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    outputStreamM.close();
                                } catch (Throwable th2) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                ozjVar.close();
                            } catch (Throwable th4) {
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                        }
                        throw th5;
                    }
                } catch (IOException e) {
                    ((oug) ((oug) ((oug) hql.a.b()).h(e)).G((char) 2598)).r("Couldn't save medium-res thumbnail fallback for %s", hsaVar2.s());
                }
            }
        });
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void e(ojc ojcVar) {
    }

    @Override // defpackage.hsn
    public final void f(int i, int i2, Throwable th) {
        this.c.c.execute(new hqj(this.a, 1));
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void g(int i, int i2, Throwable th) {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void h(int i, int i2) {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void i(int i, int i2) {
    }
}
