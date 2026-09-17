package defpackage;

import android.util.Log;
import j$.nio.charset.StandardCharsets;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mde {
    static {
        try {
            asv.a.c("http://ns.google.com/photos/1.0/panorama/", "GPano");
        } catch (ass e) {
            Log.e("XmpUtil", "Could not register pano namespace!");
            e.printStackTrace();
        }
    }

    private static ast A(mdd mddVar) {
        ast astVarS = s(w(mddVar, true, true));
        if (astVarS == null || !astVarS.e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
            return astVarS;
        }
        try {
            return astVarS;
        } catch (ass e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void B(mdd mddVar, OutputStream outputStream, ast astVar, ast astVar2) {
        byte[] bArrY;
        if (astVar == null) {
            return;
        }
        if (astVar2 != null) {
            bArrY = y(astVar2);
            if (bArrY == null) {
                return;
            }
            try {
                astVar.c("http://ns.adobe.com/xmp/note/", "HasExtendedXMP", v(bArrY));
            } catch (ass e) {
                return;
            }
        } else {
            bArrY = null;
        }
        byte[] bArrY2 = y(astVar);
        if (bArrY2 == null) {
            return;
        }
        if (astVar2 != null) {
            astVar.h();
        }
        List listW = w(mddVar, false, false);
        int iR = r(listW, bArrY2);
        if (iR < 0) {
            return;
        }
        if (bArrY != null) {
            int i = iR + 1;
            ohh.z(listW, mcz.a);
            String strValueOf = String.valueOf(v(bArrY));
            String strConcat = strValueOf.length() != 0 ? "http://ns.adobe.com/xmp/extension/\u0000".concat(strValueOf) : new String("http://ns.adobe.com/xmp/extension/\u0000");
            int length = strConcat.length() + 8;
            ArrayList arrayList = new ArrayList();
            int length2 = (bArrY.length / (65458 - length)) + 1;
            int iQ = 0;
            for (int i2 = 0; i2 < length2; i2++) {
                int length3 = bArrY.length;
                byte[] bArr = new byte[Math.min((length3 - iQ) + length, 65458)];
                int iQ2 = q(strConcat.getBytes(StandardCharsets.UTF_8), 0, bArr, 0);
                int iQ3 = iQ2 + q(z(length3), 0, bArr, iQ2);
                iQ += q(bArrY, iQ, bArr, iQ3 + q(z(iQ), 0, bArr, iQ3));
                arrayList.add(t(bArr));
            }
            listW.addAll(i, arrayList);
        }
        try {
            x(outputStream, listW);
        } catch (IOException e2) {
        }
    }

    public static ast a() {
        return asv.a();
    }

    public static ast b(ast astVar, ast astVar2) {
        if (astVar == null) {
            return astVar2;
        }
        if (astVar2 != null) {
            try {
                atg atgVarF = astVar2.f();
                while (true) {
                    Object next = atgVarF.next();
                    next.getClass();
                    atd atdVar = (atd) next;
                    String str = atdVar.b;
                    if (str != null) {
                        astVar.d(atdVar.a, str, atdVar.c, atdVar.a());
                    }
                }
            } catch (Exception e) {
            }
        }
        return astVar;
    }

    public static ojc c(String str) {
        if (oje.d(str)) {
            return oih.a;
        }
        try {
            return ojc.i(asv.c(str));
        } catch (ass e) {
            Log.e("XmpUtil", "String was not a serialized XMPMeta.");
            return oih.a;
        }
    }

    public static ojd d(byte[] bArr, ast astVar) {
        Object obj;
        Object obj2;
        ojd ojdVarU = u(new mda(bArr));
        ast astVarA = (ojdVarU == null || (obj2 = ojdVarU.a) == null) ? asv.a() : (ast) obj2;
        ast astVar2 = null;
        if (ojdVarU != null && (obj = ojdVarU.b) != null) {
            astVar2 = (ast) obj;
        }
        return ojd.a(astVarA, b(astVar2, astVar));
    }

    public static ojd e(InputStream inputStream) {
        return u(new mdb(inputStream));
    }

    public static String f(ast astVar) {
        try {
            gj.f("http://ns.google.com/photos/1.0/camera/");
            gj.c("SpecialTypeID");
            atz atzVarA = ((ati) astVar).a("http://ns.google.com/photos/1.0/camera/", gh.g("SpecialTypeID", 1));
            if (atzVarA != null) {
                return (String) ((ath) atzVarA).a;
            }
            return null;
        } catch (ass e) {
            return null;
        }
    }

    public static boolean g(mdc mdcVar, String str) {
        if (mdcVar == null || mdcVar.c < str.length()) {
            return false;
        }
        try {
            byte[] bArr = new byte[str.length()];
            System.arraycopy(mdcVar.a, mdcVar.b, bArr, 0, str.length());
            return new String(bArr, "UTF-8").equals(str);
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

    public static boolean h(String str, ast astVar) {
        if (!str.toLowerCase().endsWith(".jpg") && !str.toLowerCase().endsWith(".jpeg")) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                List listW = w(new mdb(fileInputStream), false, false);
                byte[] bArrY = y(astVar);
                if (bArrY == null) {
                    fileInputStream.close();
                    return false;
                }
                r(listW, bArrY);
                fileInputStream.close();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(str);
                    try {
                        x(fileOutputStream, listW);
                        fileOutputStream.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    if (str.length() != 0) {
                        "Write file failed:".concat(str);
                    } else {
                        new String("Write file failed:");
                    }
                    return false;
                }
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                }
                throw th3;
            }
        } catch (FileNotFoundException e2) {
            Log.e("XmpUtil", str.length() != 0 ? "Could not find file: ".concat(str) : new String("Could not find file: "), e2);
            return false;
        } catch (IOException e3) {
            Log.e("XmpUtil", str.length() != 0 ? "Could not read file: ".concat(str) : new String("Could not read file: "), e3);
            return false;
        }
    }

    public static void i(ast astVar, String[] strArr) {
        try {
            asv.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            for (int i = 0; i < 2; i++) {
                astVar.g("DisableSuggestedAction", new atx(512), strArr[i], new atx());
            }
        } catch (ass e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("XmpUtil", strValueOf.length() != 0 ? "exception while appending disable suggested actions ".concat(strValueOf) : new String("exception while appending disable suggested actions "));
        }
    }

    public static void j(ast astVar, String str) {
        try {
            asv.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            astVar.g("SlowRawPath", new atx(512), str, new atx());
        } catch (ass e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("XmpUtil", strValueOf.length() != 0 ? "exception while appending disable suggested actions ".concat(strValueOf) : new String("exception while appending disable suggested actions "));
        }
    }

    public static void k(ast astVar, String str) {
        try {
            asv.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            astVar.g("SpecialTypeID", new atx(512), str, new atx());
        } catch (ass e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.e("XmpUtil", strValueOf.length() != 0 ? "exception while appending special type id ".concat(strValueOf) : new String("exception while appending special type id "));
        }
    }

    public static ast l(String str) {
        ast astVar = null;
        if (str.toLowerCase().endsWith(".jpg") || str.toLowerCase().endsWith(".jpeg") || str.toLowerCase().endsWith(".rgbz")) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    ast astVarM = m(fileInputStream);
                    fileInputStream.close();
                    astVar = astVarM;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                Log.e("XmpUtil", str.length() != 0 ? "Could not find file: ".concat(str) : new String("Could not find file: "), e);
            } catch (IOException e2) {
                Log.e("XmpUtil", str.length() != 0 ? "Could not read file: ".concat(str) : new String("Could not read file: "), e2);
            }
        }
        return astVar == null ? asv.a() : astVar;
    }

    public static ast m(InputStream inputStream) {
        return A(new mdb(inputStream));
    }

    public static ast n(byte[] bArr) {
        return A(new mda(bArr));
    }

    public static void o(InputStream inputStream, OutputStream outputStream, ast astVar, ast astVar2) {
        B(new mdb(inputStream), outputStream, astVar, astVar2);
    }

    public static void p(byte[] bArr, OutputStream outputStream, ast astVar, ast astVar2) {
        B(new mda(bArr), outputStream, astVar, astVar2);
    }

    private static int q(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iMin = Math.min(bArr.length - i, bArr2.length - i2);
        System.arraycopy(bArr, i, bArr2, i2, iMin);
        return iMin;
    }

    private static int r(List list, byte[] bArr) {
        int length = bArr.length;
        if (length > 65502) {
            Log.e("XmpUtil", "The standard XMP section cannot have a size larger than 65502 bytes.");
            return -1;
        }
        byte[] bArr2 = new byte[length + 29];
        int i = 0;
        q(bArr, 0, bArr2, q("http://ns.adobe.com/xap/1.0/\u0000".getBytes(StandardCharsets.UTF_8), 0, bArr2, 0));
        mdc mdcVarT = t(bArr2);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((mdc) list.get(i2)).d == 225 && g((mdc) list.get(i2), "http://ns.adobe.com/xap/1.0/\u0000")) {
                list.set(i2, mdcVarT);
                return i2;
            }
        }
        if (!list.isEmpty() && ((mdc) list.get(0)).d == 225) {
            i = 1;
        }
        list.add(i, mdcVarT);
        return i;
    }

    private static ast s(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mdc mdcVar = (mdc) it.next();
            if (g(mdcVar, "http://ns.adobe.com/xap/1.0/\u0000")) {
                try {
                    for (int i2 = mdcVar.c - 1; i2 > 0; i2--) {
                        int i3 = mdcVar.b + i2;
                        byte[] bArr = mdcVar.a;
                        if (bArr[i3] == 62 && bArr[i3 - 1] != 63) {
                            i = i2 + 1;
                            int i4 = i - 29;
                            byte[] bArr2 = new byte[i4];
                            System.arraycopy(mdcVar.a, mdcVar.b + 29, bArr2, 0, i4);
                            return asv.b(bArr2);
                        }
                    }
                    return asv.b(bArr2);
                } catch (ass e) {
                    break;
                }
                i = mdcVar.c;
                int i5 = i - 29;
                byte[] bArr3 = new byte[i5];
                System.arraycopy(mdcVar.a, mdcVar.b + 29, bArr3, 0, i5);
            }
        }
        return null;
    }

    private static mdc t(byte[] bArr) {
        return new mdc(bArr, 225, 0, bArr.length);
    }

    private static ojd u(mdd mddVar) {
        ast astVarB;
        List<mdc> listW = w(mddVar, true, false);
        ast astVarS = s(listW);
        if (astVarS == null) {
            return null;
        }
        if (!astVarS.e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
            return ojd.a(astVarS, null);
        }
        try {
            String str = (String) ((ath) astVarS.a("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")).a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("http://ns.adobe.com/xmp/extension/\u0000");
            sb.append(str);
            sb.append("\u0000");
            String string = sb.toString();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int iMax = 0;
            for (mdc mdcVar : listW) {
                if (g(mdcVar, string)) {
                    int length = mdcVar.b + string.length() + 7;
                    int i = mdcVar.b + mdcVar.c;
                    iMax += Math.max(0, i - length);
                    arrayList.add(mdcVar);
                    arrayList2.add(Integer.valueOf(length));
                    arrayList3.add(Integer.valueOf(i));
                }
            }
            if (iMax == 0) {
                astVarB = null;
            } else {
                byte[] bArr = new byte[iMax];
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    mdc mdcVar2 = (mdc) arrayList.get(i3);
                    int iIntValue = ((Integer) arrayList2.get(i3)).intValue();
                    int iIntValue2 = ((Integer) arrayList3.get(i3)).intValue() - iIntValue;
                    System.arraycopy(mdcVar2.a, iIntValue, bArr, i2, iIntValue2);
                    i2 += iIntValue2;
                }
                try {
                    astVarB = asv.b(bArr);
                } catch (ass e) {
                    astVarB = null;
                }
            }
            if (astVarB == null) {
                return null;
            }
            return ojd.a(astVarS, astVarB);
        } catch (ass e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String v(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            StringBuilder sb = new StringBuilder(length + length);
            Formatter formatter = new Formatter(sb);
            int i = 0;
            for (byte b : bArrDigest) {
                formatter.format("%02x", Byte.valueOf(b));
            }
            formatter.close();
            String string = sb.toString();
            int length2 = string.length();
            while (i < length2) {
                if (ohh.c(string.charAt(i))) {
                    char[] charArray = string.toCharArray();
                    while (i < length2) {
                        char c = charArray[i];
                        if (ohh.c(c)) {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    return String.valueOf(charArray);
                }
                i++;
            }
            return string;
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    private static List w(mdd mddVar, boolean z, boolean z2) {
        int iA;
        ArrayList arrayList = new ArrayList();
        try {
            if (mddVar.a() == 255 && mddVar.a() == 216) {
                while (true) {
                    int iA2 = mddVar.a();
                    if (iA2 == -1 || iA2 != 255) {
                        break;
                    }
                    do {
                        iA = mddVar.a();
                    } while (iA == 255);
                    if (iA == -1) {
                        return arrayList;
                    }
                    if (iA == 218) {
                        if (!z) {
                            arrayList.add(mddVar.d());
                        }
                        return arrayList;
                    }
                    int iA3 = mddVar.a();
                    int iA4 = mddVar.a();
                    if (iA3 != -1 && iA4 != -1) {
                        int i = (iA3 << 8) | iA4;
                        if (!z || iA == 225) {
                            mdc mdcVarB = mddVar.b(i - 2, iA);
                            if (!g(mdcVarB, "http://ns.adobe.com/xmp/extension/\u0000") || !z2) {
                                arrayList.add(mdcVarB);
                            }
                        } else {
                            mddVar.c(i - 2);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            return arrayList;
        }
    }

    private static void x(OutputStream outputStream, List list) throws IOException {
        outputStream.write(255);
        outputStream.write(216);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mdc mdcVar = (mdc) it.next();
            outputStream.write(255);
            outputStream.write(mdcVar.d);
            if (mdcVar.d != 218) {
                int iA = mdcVar.a();
                int iA2 = mdcVar.a();
                outputStream.write(iA >> 8);
                outputStream.write(iA2 & 255);
            }
            outputStream.write(mdcVar.a, mdcVar.b, mdcVar.c);
        }
    }

    private static byte[] y(ast astVar) {
        try {
            aty atyVar = new aty();
            atyVar.f(64, true);
            atyVar.f(16, true);
            asv.d(astVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
            hn.e((ati) astVar, byteArrayOutputStream, atyVar);
            return byteArrayOutputStream.toByteArray();
        } catch (ass e) {
            return null;
        }
    }

    private static byte[] z(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }
}
