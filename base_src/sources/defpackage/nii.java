package defpackage;

import com.google.common.io.ByteStreams;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class nii {
    private static final Logger a = Logger.getLogger("XmpUtil");

    public static ast a(InputStream inputStream) {
        Iterator it;
        int i;
        ast astVarB;
        ast astVarB2;
        int length;
        int i2;
        ArrayList<nih> arrayList = new ArrayList();
        try {
            try {
                if (inputStream != null) {
                    try {
                        if (inputStream.read() == 255 && inputStream.read() == 216) {
                            while (true) {
                                int i3 = inputStream.read();
                                if (i3 == -1) {
                                    inputStream.close();
                                    break;
                                }
                                if (i3 != 255) {
                                    inputStream.close();
                                    break;
                                }
                                do {
                                    i2 = inputStream.read();
                                } while (i2 == 255);
                                if (i2 != -1) {
                                    if (i2 != 218) {
                                        int i4 = inputStream.read();
                                        int i5 = inputStream.read();
                                        if (i4 != -1 && i5 != -1) {
                                            int i6 = (i4 << 8) | i5;
                                            if (i2 == 225) {
                                                nih nihVar = new nih();
                                                nihVar.a = new byte[i6 - 2];
                                                ByteStreams.readFully(inputStream, nihVar.a);
                                                arrayList.add(nihVar);
                                            } else {
                                                ByteStreams.skipFully(inputStream, i6 - 2);
                                            }
                                        }
                                        inputStream.close();
                                        break;
                                    }
                                    inputStream.close();
                                    break;
                                }
                                inputStream.close();
                                break;
                            }
                        }
                        a.logp(Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", "parse", "XMP parse: only JPEG file is supported");
                        inputStream.close();
                    } catch (IOException e) {
                        a.logp(Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", "parse", "Could not parse file.", (Throwable) e);
                        inputStream.close();
                    }
                }
                while (true) {
                    astVarB = null;
                    if (!it.hasNext()) {
                        astVarB2 = null;
                        break;
                    }
                    nih nihVar2 = (nih) it.next();
                    if (c(nihVar2.a, "http://ns.adobe.com/xap/1.0/\u0000")) {
                        byte[] bArr = nihVar2.a;
                        int length2 = bArr.length - 1;
                        while (true) {
                            if (length2 <= 0) {
                                length = bArr.length;
                                break;
                            }
                            if (bArr[length2] == 62 && bArr[length2 - 1] != 63) {
                                length = length2 + 1;
                                break;
                            }
                            length2--;
                        }
                        int i7 = length - 29;
                        byte[] bArr2 = new byte[i7];
                        System.arraycopy(nihVar2.a, 29, bArr2, 0, i7);
                        try {
                            astVarB2 = asv.b(bArr2);
                            break;
                        } catch (ass e2) {
                            a.logp(Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", "parseFirstValidXMPSection", "XMP parse error", (Throwable) e2);
                            astVarB2 = null;
                            break;
                        } catch (RuntimeException e3) {
                            a.logp(Level.WARNING, "com.google.android.libraries.social.xmp.XmpUtil", "parseFirstValidXMPSection", "Unexpected exception when parsing XMP", (Throwable) e3);
                            astVarB2 = null;
                            break;
                        }
                    }
                }
            } catch (IOException e4) {
            }
            it = arrayList.iterator();
            if (astVarB2 != null && astVarB2.e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
                try {
                    String str = (String) ((ath) astVarB2.a("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")).a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
                    sb.append("http://ns.adobe.com/xmp/extension/\u0000");
                    sb.append(str);
                    sb.append("\u0000");
                    String string = sb.toString();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i8 = 0;
                    for (nih nihVar3 : arrayList) {
                        if (c(nihVar3.a, string)) {
                            int length3 = string.length() + 7;
                            int length4 = nihVar3.a.length;
                            i8 += length4 - length3;
                            arrayList2.add(nihVar3);
                            arrayList3.add(Integer.valueOf(length3));
                            arrayList4.add(Integer.valueOf(length4));
                        }
                    }
                    byte[] bArr3 = new byte[i8];
                    int i9 = 0;
                    for (i = 0; i < arrayList2.size(); i++) {
                        nih nihVar4 = (nih) arrayList2.get(i);
                        int iIntValue = ((Integer) arrayList3.get(i)).intValue();
                        int iIntValue2 = ((Integer) arrayList4.get(i)).intValue() - iIntValue;
                        System.arraycopy(nihVar4.a, iIntValue, bArr3, i9, iIntValue2);
                        i9 += iIntValue2;
                    }
                    try {
                        astVarB = asv.b(bArr3);
                    } catch (ass e5) {
                        a.logp(Level.INFO, "com.google.android.libraries.social.xmp.XmpUtil", "parseExtendedXMPSections", "Extended XMP parse error", (Throwable) e5);
                    } catch (RuntimeException e6) {
                        a.logp(Level.WARNING, "com.google.android.libraries.social.xmp.XmpUtil", "parseExtendedXMPSections", "Unexpected exception when parsing extended XMP", (Throwable) e6);
                    }
                    if (astVarB != null) {
                        try {
                            atg atgVarF = astVarB.f();
                            while (true) {
                                atd atdVar = (atd) atgVarF.next();
                                String str2 = atdVar.b;
                                if (str2 != null) {
                                    astVarB2.d(atdVar.a, str2, atdVar.c, atdVar.a());
                                }
                            }
                        } catch (Exception e7) {
                        }
                    }
                } catch (ass e8) {
                    e8.printStackTrace();
                }
            }
            return astVarB2;
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException e9) {
                throw th;
            }
        }
    }

    public static ast b(String str) {
        try {
            return a(new FileInputStream(str));
        } catch (FileNotFoundException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(str);
            logger.logp(level, "com.google.android.libraries.social.xmp.XmpUtil", "extractXMPMeta", strValueOf.length() != 0 ? "Could not read file: ".concat(strValueOf) : new String("Could not read file: "), (Throwable) e);
            return null;
        }
    }

    private static boolean c(byte[] bArr, String str) {
        if (bArr.length < str.length()) {
            return false;
        }
        try {
            byte[] bArr2 = new byte[str.length()];
            System.arraycopy(bArr, 0, bArr2, 0, str.length());
            return new String(bArr2, "UTF-8").equals(str);
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }
}
