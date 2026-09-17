package defpackage;

import android.os.Environment;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class pvy {
    private static final String a = pvy.class.getSimpleName();

    public static pxd a() {
        return (pxd) e(pxd.a.m(), "current_device_params", 894990891, true);
    }

    public static pxe b() {
        return (pxe) e(pxe.e.m(), "phone_params", 779508118, false);
    }

    public static boolean c() {
        boolean zDelete;
        try {
            File fileF = f("current_device_params");
            zDelete = fileF.exists() ? fileF.delete() : true;
        } catch (IllegalStateException e) {
            String str = a;
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 34);
            sb.append("Error clearing device parameters: ");
            sb.append(strValueOf);
            Log.w(str, sb.toString());
            zDelete = false;
        }
        if (!zDelete) {
            Log.e(a, "Could not clear Cardboard parameters from external storage.");
        }
        return zDelete;
    }

    public static boolean d(pxd pxdVar) throws Throwable {
        byte[] bArrG = pxdVar.g();
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(f("current_device_params")));
                    try {
                        try {
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                            byteBufferAllocate.putInt(894990891);
                            byteBufferAllocate.putInt(bArrG.length);
                            bufferedOutputStream2.write(byteBufferAllocate.array());
                            bufferedOutputStream2.write(bArrG);
                            z = true;
                        } catch (IOException e) {
                            try {
                                String str = a;
                                String strValueOf = String.valueOf(e.toString());
                                Log.w(str, strValueOf.length() != 0 ? "Error writing parameters: ".concat(strValueOf) : new String("Error writing parameters: "));
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                bufferedOutputStream = bufferedOutputStream2;
                                String str2 = a;
                                String strValueOf2 = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf2).length() + 39);
                                sb.append("Parameters file not found for writing: ");
                                sb.append(strValueOf2);
                                Log.e(str2, sb.toString());
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                            }
                        }
                        bufferedOutputStream2.close();
                    } catch (IllegalStateException e3) {
                        e = e3;
                        bufferedOutputStream = bufferedOutputStream2;
                        String str3 = a;
                        String strValueOf3 = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + 26);
                        sb2.append("Error writing parameters: ");
                        sb2.append(strValueOf3);
                        Log.w(str3, sb2.toString());
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e5) {
                e = e5;
            } catch (IllegalStateException e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e7) {
        }
        if (!z) {
            Log.e(a, "Could not write Cardboard parameters to external storage.");
        }
        return z;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:49:0x0074). Please report as a decompilation issue!!! */
    private static pqm e(pql pqlVar, String str, int i, boolean z) throws Throwable {
        BufferedInputStream bufferedInputStream;
        byte[] bArr;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(f(str)));
            try {
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    if (bufferedInputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length) == -1) {
                        Log.e(a, "Error parsing param record: end of stream.");
                        bArr = null;
                    } else {
                        int i2 = byteBufferAllocate.getInt();
                        int i3 = byteBufferAllocate.getInt();
                        if (i2 != i) {
                            Log.e(a, "Error parsing param record: incorrect sentinel.");
                            bArr = null;
                        } else {
                            bArr = new byte[i3];
                            if (bufferedInputStream.read(bArr, 0, i3) == -1) {
                                Log.e(a, "Error parsing param record: end of stream.");
                                bArr = null;
                            }
                        }
                    }
                } catch (IOException e) {
                    String str2 = a;
                    String strValueOf = String.valueOf(e.toString());
                    Log.w(str2, strValueOf.length() != 0 ? "Error reading parameters: ".concat(strValueOf) : new String("Error reading parameters: "));
                    bArr = null;
                }
                try {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                    }
                } catch (FileNotFoundException e3) {
                    if (z) {
                        String.valueOf(String.valueOf(e3)).length();
                        bArr = null;
                    } else {
                        bArr = null;
                    }
                } catch (IllegalStateException e4) {
                    String str3 = a;
                    String strValueOf2 = String.valueOf(e4);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf2).length() + 26);
                    sb.append("Error reading parameters: ");
                    sb.append(strValueOf2);
                    Log.w(str3, sb.toString());
                    bArr = null;
                }
                if (bArr == null) {
                    return null;
                }
                try {
                    return pqlVar.d(bArr).j();
                } catch (ppp e5) {
                    Log.e(a, "Error reading params from ContentProvider", e5);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    private static File f(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 61);
            sb.append(strValueOf);
            sb.append(" already exists as a file, but is expected to be a directory.");
            throw new IllegalStateException(sb.toString());
        }
        return new File(file, str);
    }
}
