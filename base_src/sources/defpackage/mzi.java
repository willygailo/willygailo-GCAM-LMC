package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.StrictMode;
import android.system.Os;
import android.system.StructStat;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mzi {
    public mzi() {
    }

    public mzi(byte[] bArr) {
    }

    private static String a(String str) {
        return new String(str);
    }

    private static IOException b(File file, IOException iOException) {
        String strConcat = "Inoperable file:";
        try {
            String strValueOf = String.valueOf(String.format(Locale.US, " canonical[%s] freeSpace[%d]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace())));
            strConcat = strValueOf.length() != 0 ? "Inoperable file:".concat(strValueOf) : new String("Inoperable file:");
            try {
                StructStat structStatStat = Os.stat(file.getCanonicalPath());
                String strValueOf2 = String.valueOf(strConcat);
                String strValueOf3 = String.valueOf(String.format(Locale.US, " mode[%d]", Integer.valueOf(structStatStat.st_mode)));
                strConcat = strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
            } catch (IOException e) {
                strConcat = String.valueOf(strConcat).concat(" failed");
            } catch (Exception e2) {
            }
        } catch (IOException e3) {
        }
        return new IOException(strConcat, iOException);
    }

    private static IOException c(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            if (parentFile.isDirectory()) {
                if (parentFile.canRead()) {
                    return parentFile.canWrite() ? b(file, iOException) : b(file, iOException);
                }
                return parentFile.canWrite() ? b(file, iOException) : b(file, iOException);
            }
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? b(file, iOException) : b(file, iOException);
            }
            return parentFile.canWrite() ? b(file, iOException) : b(file, iOException);
        }
        return b(file, iOException);
    }

    public static ojc e(Context context) {
        ojc ojcVarI;
        ojc ojcVarI2;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
            return oih.a;
        }
        Context contextA = mez.a(context);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(contextA.getDir("phenotype_hermetic", 0), "overrides.txt");
                ojcVarI = file.exists() ? ojc.i(file) : oih.a;
            } catch (RuntimeException e) {
                Log.e("HermeticFileOverrides", "no data dir", e);
                ojcVarI = oih.a;
            }
            if (ojcVarI.g()) {
                File file2 = (File) ojcVarI.c();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = line.split(" ", 3);
                            if (strArrSplit.length != 3) {
                                Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                            } else {
                                String strA = a(strArrSplit[0]);
                                String strDecode = Uri.decode(a(strArrSplit[1]));
                                String strDecode2 = (String) map2.get(strArrSplit[2]);
                                if (strDecode2 == null) {
                                    String strA2 = a(strArrSplit[2]);
                                    strDecode2 = Uri.decode(strA2);
                                    if (strDecode2.length() < 1024 || strDecode2 == strA2) {
                                        map2.put(strA2, strDecode2);
                                    }
                                }
                                if (!map.containsKey(strA)) {
                                    map.put(strA, new HashMap());
                                }
                                ((Map) map.get(strA)).put(strDecode, strDecode2);
                            }
                        }
                        String.valueOf(String.valueOf(file2)).length();
                        nvb nvbVar = new nvb(map);
                        bufferedReader.close();
                        ojcVarI2 = ojc.i(nvbVar);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                ojcVarI2 = oih.a;
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return ojcVarI2;
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
    }

    public static Object f(neb nebVar) {
        try {
            return nebVar.a();
        } catch (SecurityException e) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return nebVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static FloatBuffer g(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        return floatBufferAsFloatBuffer;
    }

    public static float[] h(float f, float f2) {
        float[] fArr = new float[8];
        float f3 = 1.0f;
        float f4 = 1.0f - f;
        float f5 = (-1.0f) + f2;
        int i = 0;
        int i2 = 0;
        while (true) {
            float f6 = i;
            if (f6 > 0.0f) {
                return fArr;
            }
            if (i > 0) {
                int i3 = i2 + 1;
                fArr[i2] = fArr[i3 - 3];
                int i4 = i3 + 1;
                fArr[i3] = fArr[i4 - 3];
                int i5 = i4 + 1;
                fArr[i4] = f;
                i2 = i5 + 1;
                fArr[i5] = f3;
            }
            float f7 = f6 == 0.0f ? f2 : f3 + f5;
            float f8 = f;
            int i6 = 0;
            while (i6 <= 1) {
                int i7 = i2 + 1;
                fArr[i2] = f8;
                int i8 = i7 + 1;
                fArr[i7] = f3;
                int i9 = i8 + 1;
                fArr[i8] = f8;
                i2 = i9 + 1;
                fArr[i9] = f7;
                i6++;
                f8 += f4;
            }
            i++;
            f3 += f5;
        }
    }

    public static Uri i(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String strValueOf = String.valueOf(uri.getPath());
        return builderBuildUpon.path(str.length() != 0 ? strValueOf.concat(str) : new String(strValueOf)).build();
    }

    public static IOException j(nio nioVar, Uri uri, IOException iOException) {
        try {
            njf njfVar = new njf();
            njfVar.a = true;
            File file = (File) nioVar.b(uri, njfVar);
            if (!file.exists()) {
                return c(file, iOException);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? c(file, iOException) : c(file, iOException);
                }
                return file.canWrite() ? c(file, iOException) : c(file, iOException);
            }
            if (file.canRead()) {
                return file.canWrite() ? c(file, iOException) : c(file, iOException);
            }
            return file.canWrite() ? c(file, iOException) : c(file, iOException);
        } catch (IOException e) {
            return new IOException(iOException);
        }
    }
}
