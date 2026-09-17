package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.apps.camera.bottombar.R;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bip implements azv {
    private static final bio a = new bio();
    private final Context b;
    private final List c;
    private final bio d;
    private final biq e;

    public bip(Context context, List list, bcv bcvVar, bct bctVar) {
        bio bioVar = a;
        this.b = context.getApplicationContext();
        this.c = list;
        this.e = new biq(bcvVar, bctVar);
        this.d = bioVar;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01f1 A[Catch: all -> 0x02c7, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0013, B:8:0x001c, B:82:0x01f5, B:84:0x01f9, B:87:0x01ff, B:89:0x020b, B:91:0x0210, B:95:0x0224, B:97:0x0233, B:100:0x0238, B:101:0x028a, B:102:0x028b, B:105:0x0297, B:94:0x0220, B:90:0x020e, B:9:0x0020, B:12:0x0029, B:13:0x0034, B:15:0x0042, B:25:0x00a1, B:27:0x00a7, B:29:0x00ad, B:30:0x00b5, B:31:0x00b8, B:77:0x01e7, B:32:0x00bc, B:34:0x00c2, B:35:0x00c9, B:39:0x010b, B:41:0x010f, B:43:0x0118, B:45:0x0130, B:42:0x0116, B:46:0x0140, B:47:0x0145, B:48:0x0148, B:49:0x014d, B:52:0x015a, B:53:0x0165, B:55:0x0171, B:57:0x017a, B:58:0x0189, B:60:0x018d, B:63:0x0195, B:64:0x019a, B:65:0x019f, B:67:0x01ba, B:68:0x01bc, B:72:0x01c3, B:75:0x01cf, B:76:0x01e2, B:78:0x01eb, B:80:0x01f1, B:81:0x01f3, B:16:0x0047, B:20:0x0064, B:22:0x0087, B:24:0x008d, B:109:0x02bf, B:110:0x02c6), top: B:117:0x000f, outer: #1 }] */
    @Override // defpackage.azv
    public final /* bridge */ /* synthetic */ bcl a(Object obj, int i, int i2, azt aztVar) {
        aza azaVar;
        aza azaVar2;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        azb azbVarA = this.d.a(byteBuffer);
        try {
            blz.b();
            if (azbVarA.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            biu biuVar = null;
            if (azbVarA.e()) {
                azaVar = azbVarA.c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < 6; i3++) {
                    sb.append((char) azbVarA.a());
                }
                if (sb.toString().startsWith("GIF")) {
                    azbVarA.c.f = azbVarA.b();
                    azbVarA.c.g = azbVarA.b();
                    int iA = azbVarA.a();
                    aza azaVar3 = azbVarA.c;
                    azaVar3.h = (iA & 128) != 0;
                    azaVar3.i = (int) Math.pow(2.0d, (iA & 7) + 1);
                    azbVarA.c.j = azbVarA.a();
                    azbVarA.c.k = azbVarA.a();
                    if (azbVarA.c.h && !azbVarA.e()) {
                        aza azaVar4 = azbVarA.c;
                        azaVar4.a = azbVarA.f(azaVar4.i);
                        aza azaVar5 = azbVarA.c;
                        azaVar5.l = azaVar5.a[azaVar5.j];
                    }
                } else {
                    azbVarA.c.b = 1;
                }
                if (!azbVarA.e()) {
                    while (!azbVarA.e()) {
                        int i4 = azbVarA.c.c;
                        switch (azbVarA.a()) {
                            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                switch (azbVarA.a()) {
                                    case 1:
                                        azbVarA.d();
                                        break;
                                    case 249:
                                        azbVarA.c.d = new ayz();
                                        azbVarA.a();
                                        int iA2 = azbVarA.a();
                                        ayz ayzVar = azbVarA.c.d;
                                        int i5 = (iA2 & 28) >> 2;
                                        ayzVar.g = i5;
                                        if (i5 == 0) {
                                            ayzVar.g = 1;
                                        }
                                        ayzVar.f = 1 == (iA2 & 1);
                                        int iB = azbVarA.b();
                                        if (iB < 2) {
                                            iB = 10;
                                        }
                                        ayz ayzVar2 = azbVarA.c.d;
                                        ayzVar2.i = iB * 10;
                                        ayzVar2.h = azbVarA.a();
                                        azbVarA.a();
                                        break;
                                    case 254:
                                        azbVarA.d();
                                        break;
                                    case 255:
                                        azbVarA.c();
                                        StringBuilder sb2 = new StringBuilder();
                                        for (int i6 = 0; i6 < 11; i6++) {
                                            sb2.append((char) azbVarA.a[i6]);
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                azbVarA.c();
                                                byte[] bArr = azbVarA.a;
                                                if (bArr[0] == 1) {
                                                    azbVarA.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                                }
                                                if (azbVarA.d <= 0) {
                                                }
                                            } while (!azbVarA.e());
                                        } else {
                                            azbVarA.d();
                                            continue;
                                        }
                                        break;
                                    default:
                                        azbVarA.d();
                                        break;
                                }
                                break;
                            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                                aza azaVar6 = azbVarA.c;
                                if (azaVar6.d == null) {
                                    azaVar6.d = new ayz();
                                }
                                azbVarA.c.d.a = azbVarA.b();
                                azbVarA.c.d.b = azbVarA.b();
                                azbVarA.c.d.c = azbVarA.b();
                                azbVarA.c.d.d = azbVarA.b();
                                int iA3 = azbVarA.a();
                                int i7 = iA3 & 128;
                                int iPow = (int) Math.pow(2.0d, (iA3 & 7) + 1);
                                ayz ayzVar3 = azbVarA.c.d;
                                ayzVar3.e = (iA3 & 64) != 0;
                                if (i7 != 0) {
                                    ayzVar3.k = azbVarA.f(iPow);
                                } else {
                                    ayzVar3.k = null;
                                }
                                azbVarA.c.d.j = azbVarA.b.position();
                                azbVarA.a();
                                azbVarA.d();
                                if (azbVarA.e()) {
                                    continue;
                                } else {
                                    aza azaVar7 = azbVarA.c;
                                    azaVar7.c++;
                                    azaVar7.e.add(azaVar7.d);
                                }
                                break;
                            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                break;
                            default:
                                azbVarA.c.b = 1;
                                continue;
                        }
                        azaVar2 = azbVarA.c;
                        if (azaVar2.c < 0) {
                            azaVar2.b = 1;
                        }
                    }
                    azaVar2 = azbVarA.c;
                    if (azaVar2.c < 0) {
                        azaVar2.b = 1;
                    }
                }
                azaVar = azbVarA.c;
            }
            if (azaVar.c > 0 && azaVar.b == 0) {
                Bitmap.Config config = aztVar.b(bjb.a) == azd.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(azaVar.g / i2, azaVar.f / i);
                azc azcVar = new azc(this.e, azaVar, byteBuffer, Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin)));
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    String strValueOf = String.valueOf(config);
                    String strValueOf2 = String.valueOf(Bitmap.Config.ARGB_8888);
                    String strValueOf3 = String.valueOf(Bitmap.Config.RGB_565);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 41 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
                    sb3.append("Unsupported format: ");
                    sb3.append(strValueOf);
                    sb3.append(", must be one of ");
                    sb3.append(strValueOf2);
                    sb3.append(" or ");
                    sb3.append(strValueOf3);
                    throw new IllegalArgumentException(sb3.toString());
                }
                azcVar.i = config;
                azcVar.b();
                Bitmap bitmapA = azcVar.a();
                if (bitmapA != null) {
                    biuVar = new biu(new bis(new bir(new biz(axv.b(this.b), azcVar, i, i2, bgj.b, bitmapA))), 0);
                }
            }
            this.d.b(azbVarA);
            return biuVar;
        } catch (Throwable th) {
            this.d.b(azbVarA);
            throw th;
        }
    }

    @Override // defpackage.azv
    public final /* bridge */ /* synthetic */ boolean b(Object obj, azt aztVar) {
        return !((Boolean) aztVar.b(bjb.b)).booleanValue() && vj.h(this.c, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
