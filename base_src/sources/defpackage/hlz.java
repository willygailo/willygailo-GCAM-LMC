package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class hlz {
    public static final /* synthetic */ int a = 0;
    private static final ouj b = ouj.h("com/google/android/apps/camera/remotecontrol/SignatureValidator");
    private static final String[] c = {"13:86:84:D0:65:DB:A8:0B:62:77:7E:2C:E3:5E:08:1A:97:22:BC:0E:43:F1:39:0E:CA:11:DC:20:AA:BE:B2:B5"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    public static final boolean a(String str, PackageManager packageManager) {
        String strF;
        boolean z;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Signature[] signingCertificateHistory = packageInfo.signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory.length == 0) {
                ((oug) ((oug) b.b()).G((char) 2550)).o("Unsigned package");
                strF = "";
            } else {
                byte[] bArrDigest = messageDigest.digest(signingCertificateHistory[0].toByteArray());
                oyw oywVar = oyw.e;
                oyw oysVar = ((oyv) oywVar).d;
                if (oysVar == null) {
                    oyr oyrVar = ((oyv) oywVar).b;
                    for (char c2 : oyrVar.b) {
                        if (ohh.c(c2)) {
                            char[] cArr = oyrVar.b;
                            int length = cArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    z = false;
                                    break;
                                }
                                char c3 = cArr[i];
                                if (c3 >= 'A' && c3 <= 'Z') {
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                            obr.aR(!z, "Cannot call upperCase() on a mixed-case alphabet");
                            char[] cArr2 = new char[oyrVar.b.length];
                            int i2 = 0;
                            while (true) {
                                char[] cArr3 = oyrVar.b;
                                if (i2 >= cArr3.length) {
                                    break;
                                }
                                char c4 = cArr3[i2];
                                if (ohh.c(c4)) {
                                    c4 ^= 32;
                                }
                                cArr2[i2] = (char) c4;
                                i2++;
                            }
                            oyrVar = new oyr(oyrVar.a.concat(".upperCase()"), cArr2);
                            break;
                        }
                    }
                    if (oyrVar == ((oyv) oywVar).b) {
                        oysVar = oywVar;
                    } else {
                        Character ch = ((oyv) oywVar).c;
                        oysVar = new oys(oyrVar);
                    }
                    ((oyv) oywVar).d = oysVar;
                }
                for (int i3 = 0; i3 <= 0; i3++) {
                    obr.aK(!((oyv) oysVar).b.c(":".charAt(i3)), "Separator (%s) cannot contain alphabet characters", ":");
                }
                Character ch2 = ((oyv) oysVar).c;
                if (ch2 != null) {
                    obr.aK(":".indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", ":");
                }
                strF = new oyu(oysVar).f(bArrDigest);
            }
            String[] strArr = c;
            for (int i4 = 0; i4 <= 0; i4++) {
                if (strArr[i4].equals(strF)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            ((oug) ((oug) ((oug) b.b()).h(e)).G((char) 2552)).r("Error validating package %s", str);
        }
        ((oug) ((oug) b.b()).G((char) 2553)).r("Validation failed for %s", str);
        return false;
    }
}
