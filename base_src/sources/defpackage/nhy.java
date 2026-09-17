package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class nhy {
    private static final String[] a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] b;
    private static final String[] c;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        strArr[1] = true != (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "" : "androidx.test.services.storage.runfiles";
        b = strArr;
        c = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor a(Context context, Uri uri, String str) {
        return b(context, uri, str, nhx.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:130:0x0218 A[Catch: IOException -> 0x02ac, FileNotFoundException -> 0x02bb, TryCatch #2 {FileNotFoundException -> 0x02bb, IOException -> 0x02ac, blocks: (B:102:0x0179, B:105:0x01bb, B:107:0x01c7, B:109:0x01d1, B:110:0x01d4, B:108:0x01cc, B:115:0x01dd, B:157:0x0278, B:159:0x0284, B:161:0x028e, B:162:0x0291, B:160:0x0289, B:118:0x01e7, B:120:0x01ef, B:122:0x01f5, B:124:0x01fb, B:154:0x0273, B:130:0x0218, B:132:0x021e, B:134:0x0224, B:137:0x0230, B:139:0x023e, B:141:0x0242, B:144:0x024e, B:145:0x0251, B:147:0x025f, B:149:0x0263, B:152:0x026f, B:127:0x0208, B:163:0x0292, B:165:0x029e, B:167:0x02a8, B:168:0x02ab, B:166:0x02a3), top: B:178:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0230 A[Catch: IOException -> 0x02ac, FileNotFoundException -> 0x02bb, TryCatch #2 {FileNotFoundException -> 0x02bb, IOException -> 0x02ac, blocks: (B:102:0x0179, B:105:0x01bb, B:107:0x01c7, B:109:0x01d1, B:110:0x01d4, B:108:0x01cc, B:115:0x01dd, B:157:0x0278, B:159:0x0284, B:161:0x028e, B:162:0x0291, B:160:0x0289, B:118:0x01e7, B:120:0x01ef, B:122:0x01f5, B:124:0x01fb, B:154:0x0273, B:130:0x0218, B:132:0x021e, B:134:0x0224, B:137:0x0230, B:139:0x023e, B:141:0x0242, B:144:0x024e, B:145:0x0251, B:147:0x025f, B:149:0x0263, B:152:0x026f, B:127:0x0208, B:163:0x0292, B:165:0x029e, B:167:0x02a8, B:168:0x02ab, B:166:0x02a3), top: B:178:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x023e A[Catch: IOException -> 0x02ac, FileNotFoundException -> 0x02bb, TryCatch #2 {FileNotFoundException -> 0x02bb, IOException -> 0x02ac, blocks: (B:102:0x0179, B:105:0x01bb, B:107:0x01c7, B:109:0x01d1, B:110:0x01d4, B:108:0x01cc, B:115:0x01dd, B:157:0x0278, B:159:0x0284, B:161:0x028e, B:162:0x0291, B:160:0x0289, B:118:0x01e7, B:120:0x01ef, B:122:0x01f5, B:124:0x01fb, B:154:0x0273, B:130:0x0218, B:132:0x021e, B:134:0x0224, B:137:0x0230, B:139:0x023e, B:141:0x0242, B:144:0x024e, B:145:0x0251, B:147:0x025f, B:149:0x0263, B:152:0x026f, B:127:0x0208, B:163:0x0292, B:165:0x029e, B:167:0x02a8, B:168:0x02ab, B:166:0x02a3), top: B:178:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0242 A[Catch: IOException -> 0x02ac, FileNotFoundException -> 0x02bb, TryCatch #2 {FileNotFoundException -> 0x02bb, IOException -> 0x02ac, blocks: (B:102:0x0179, B:105:0x01bb, B:107:0x01c7, B:109:0x01d1, B:110:0x01d4, B:108:0x01cc, B:115:0x01dd, B:157:0x0278, B:159:0x0284, B:161:0x028e, B:162:0x0291, B:160:0x0289, B:118:0x01e7, B:120:0x01ef, B:122:0x01f5, B:124:0x01fb, B:154:0x0273, B:130:0x0218, B:132:0x021e, B:134:0x0224, B:137:0x0230, B:139:0x023e, B:141:0x0242, B:144:0x024e, B:145:0x0251, B:147:0x025f, B:149:0x0263, B:152:0x026f, B:127:0x0208, B:163:0x0292, B:165:0x029e, B:167:0x02a8, B:168:0x02ab, B:166:0x02a3), top: B:178:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x025f A[Catch: IOException -> 0x02ac, FileNotFoundException -> 0x02bb, TryCatch #2 {FileNotFoundException -> 0x02bb, IOException -> 0x02ac, blocks: (B:102:0x0179, B:105:0x01bb, B:107:0x01c7, B:109:0x01d1, B:110:0x01d4, B:108:0x01cc, B:115:0x01dd, B:157:0x0278, B:159:0x0284, B:161:0x028e, B:162:0x0291, B:160:0x0289, B:118:0x01e7, B:120:0x01ef, B:122:0x01f5, B:124:0x01fb, B:154:0x0273, B:130:0x0218, B:132:0x021e, B:134:0x0224, B:137:0x0230, B:139:0x023e, B:141:0x0242, B:144:0x024e, B:145:0x0251, B:147:0x025f, B:149:0x0263, B:152:0x026f, B:127:0x0208, B:163:0x0292, B:165:0x029e, B:167:0x02a8, B:168:0x02ab, B:166:0x02a3), top: B:178:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0263 A[Catch: IOException -> 0x02ac, FileNotFoundException -> 0x02bb, TryCatch #2 {FileNotFoundException -> 0x02bb, IOException -> 0x02ac, blocks: (B:102:0x0179, B:105:0x01bb, B:107:0x01c7, B:109:0x01d1, B:110:0x01d4, B:108:0x01cc, B:115:0x01dd, B:157:0x0278, B:159:0x0284, B:161:0x028e, B:162:0x0291, B:160:0x0289, B:118:0x01e7, B:120:0x01ef, B:122:0x01f5, B:124:0x01fb, B:154:0x0273, B:130:0x0218, B:132:0x021e, B:134:0x0224, B:137:0x0230, B:139:0x023e, B:141:0x0242, B:144:0x024e, B:145:0x0251, B:147:0x025f, B:149:0x0263, B:152:0x026f, B:127:0x0208, B:163:0x0292, B:165:0x029e, B:167:0x02a8, B:168:0x02ab, B:166:0x02a3), top: B:178:0x0179 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x024e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x026f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r20.b == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f4, code lost:
    
        if (r20.b != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.AssetFileDescriptor b(android.content.Context r17, android.net.Uri r18, java.lang.String r19, defpackage.nhx r20) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhy.b(android.content.Context, android.net.Uri, java.lang.String, nhx):android.content.res.AssetFileDescriptor");
    }

    private static String c(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static File[] d(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void e(Object obj) throws FileNotFoundException {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }

    private static void f(AssetFileDescriptor assetFileDescriptor) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
        }
    }
}
