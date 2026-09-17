package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.apps.camera.bottombar.R;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class bhe {
    public static final azs a = azs.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", azd.c);
    public static final azs b = azs.b("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    public static final azs c;
    public static final azs d;
    public static final bhd e;
    private static final Queue h;
    public final bct f;
    public final List g;
    private final bcv i;
    private final DisplayMetrics j;
    private final bhk k = bhk.a();

    static {
        bhb bhbVar = bhb.a;
        c = azs.c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        d = azs.c("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new bhc();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        h = bmf.h(0);
    }

    public bhe(List list, DisplayMetrics displayMetrics, bcv bcvVar, bct bctVar) {
        this.g = list;
        aae.s(displayMetrics);
        this.j = displayMetrics;
        aae.s(bcvVar);
        this.i = bcvVar;
        aae.s(bctVar);
        this.f = bctVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    private static Bitmap d(bho bhoVar, BitmapFactory.Options options, bhd bhdVar, bcv bcvVar) {
        String string;
        Bitmap bitmapD;
        Lock lock;
        if (!options.inJustDecodeBounds) {
            bhdVar.b();
            bhoVar.d();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        bhy.a.lock();
        try {
            try {
                bitmapD = bhoVar.b(options);
                lock = bhy.a;
            } catch (IllegalArgumentException e2) {
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    string = null;
                } else {
                    int allocationByteCount = bitmap.getAllocationByteCount();
                    StringBuilder sb = new StringBuilder(14);
                    sb.append(" (");
                    sb.append(allocationByteCount);
                    sb.append(")");
                    String string2 = sb.toString();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    String strValueOf = String.valueOf(bitmap.getConfig());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 26 + String.valueOf(string2).length());
                    sb2.append("[");
                    sb2.append(width);
                    sb2.append("x");
                    sb2.append(height);
                    sb2.append("] ");
                    sb2.append(strValueOf);
                    sb2.append(string2);
                    string = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 99 + String.valueOf(string).length());
                sb3.append("Exception decoding bitmap, outWidth: ");
                sb3.append(i);
                sb3.append(", outHeight: ");
                sb3.append(i2);
                sb3.append(", outMimeType: ");
                sb3.append(str);
                sb3.append(", inBitmap: ");
                sb3.append(string);
                IOException iOException = new IOException(sb3.toString(), e2);
                if (options.inBitmap == null) {
                    throw iOException;
                }
                try {
                    bcvVar.d(options.inBitmap);
                    options.inBitmap = null;
                    bitmapD = d(bhoVar, options, bhdVar, bcvVar);
                    lock = bhy.a;
                } catch (IOException e3) {
                    throw iOException;
                }
            }
            lock.unlock();
            return bitmapD;
        } catch (Throwable th) {
            bhy.a.unlock();
            throw th;
        }
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        Queue queue = h;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options != null) {
            return options;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        g(options2);
        return options2;
    }

    private static void f(BitmapFactory.Options options) {
        g(options);
        Queue queue = h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean h(int i) {
        return i == 90 || i == 270;
    }

    private static boolean i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] j(bho bhoVar, BitmapFactory.Options options, bhd bhdVar, bcv bcvVar) {
        options.inJustDecodeBounds = true;
        d(bhoVar, options, bhdVar, bcvVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final bcl a(bho bhoVar, int i, int i2, azt aztVar, bhd bhdVar) throws Throwable {
        bhe bheVar;
        azd azdVar;
        int i3;
        boolean z;
        bhd bhdVar2;
        Bitmap.Config config;
        Bitmap bitmap;
        Bitmap bitmap2;
        int iFloor;
        int iFloor2;
        bhd bhdVar3;
        bhoVar = bhoVar;
        bhd bhdVar4 = bhdVar;
        byte[] bArr = (byte[]) this.f.a(65536, byte[].class);
        BitmapFactory.Options optionsE = e();
        optionsE.inTempStorage = bArr;
        azd azdVar2 = (azd) aztVar.b(a);
        azu azuVar = (azu) aztVar.b(b);
        bhb bhbVar = (bhb) aztVar.b(bhb.f);
        boolean zBooleanValue = ((Boolean) aztVar.b(c)).booleanValue();
        azs azsVar = d;
        boolean z2 = aztVar.b(azsVar) != null && ((Boolean) aztVar.b(azsVar)).booleanValue();
        try {
            blz.b();
            int[] iArrJ = j(bhoVar, optionsE, bhdVar4, this.i);
            int i4 = iArrJ[0];
            int i5 = iArrJ[1];
            String str = optionsE.outMimeType;
            if (i4 == -1) {
                z2 = false;
            } else if (i5 == -1) {
                z2 = false;
                i5 = -1;
            }
            int iA = bhoVar.a();
            int iA2 = bhy.a(iA);
            boolean zI = bhy.i(iA);
            int i6 = i;
            if (i6 == Integer.MIN_VALUE) {
                try {
                    i6 = h(iA2) ? i5 : i4;
                } catch (Throwable th) {
                    th = th;
                    bheVar = this;
                    bArr = bArr;
                    f(optionsE);
                    bheVar.f.c(bArr);
                    throw th;
                }
            }
            int iRound = i2;
            if (iRound == Integer.MIN_VALUE) {
                iRound = h(iA2) ? i4 : i5;
            }
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = bhoVar.c();
            bcv bcvVar = this.i;
            if (i4 <= 0 || i5 <= 0) {
                z2 = z2;
                azdVar = azdVar2;
                i3 = i4;
                z = zI;
                bhdVar2 = bhdVar4;
            } else {
                try {
                    boolean zH = h(iA2);
                    azdVar = azdVar2;
                    int i7 = true != zH ? i5 : i4;
                    int i8 = true != zH ? i4 : i5;
                    float fA = bhbVar.a(i8, i7, i6, iRound);
                    if (fA <= 0.0f) {
                        String strValueOf = String.valueOf(bhbVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + R.styleable.AppCompatTheme_windowActionBarOverlay);
                        sb.append("Cannot scale with factor: ");
                        sb.append(fA);
                        sb.append(" from: ");
                        sb.append(strValueOf);
                        sb.append(", source: [");
                        sb.append(i4);
                        sb.append("x");
                        sb.append(i5);
                        sb.append("], target: [");
                        sb.append(i6);
                        sb.append("x");
                        sb.append(iRound);
                        sb.append("]");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    int iB = bhbVar.b(i8, i7, i6, iRound);
                    z = zI;
                    float f = i8;
                    int i9 = i5;
                    float f2 = i7;
                    int iC = i8 / c(fA * f);
                    int iC2 = i7 / c(fA * f2);
                    int iMax = Math.max(1, Integer.highestOneBit(iB == 1 ? Math.max(iC, iC2) : Math.min(iC, iC2)));
                    if (iB == 1 && iMax < 1.0f / fA) {
                        iMax += iMax;
                    }
                    optionsE.inSampleSize = iMax;
                    if (imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.JPEG) {
                        float fMin = Math.min(iMax, 8);
                        int iCeil = (int) Math.ceil(f / fMin);
                        int iCeil2 = (int) Math.ceil(f2 / fMin);
                        int i10 = iMax / 8;
                        if (i10 > 0) {
                            iCeil /= i10;
                            iCeil2 /= i10;
                        }
                        iFloor2 = iCeil2;
                        iFloor = iCeil;
                        bhoVar = bhoVar;
                        bhdVar3 = bhdVar;
                    } else if (imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.PNG_A) {
                        float f3 = iMax;
                        iFloor = (int) Math.floor(f / f3);
                        iFloor2 = (int) Math.floor(f2 / f3);
                        bhdVar3 = bhdVar;
                    } else if (imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.WEBP || imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.WEBP_A) {
                        float f4 = iMax;
                        iFloor = Math.round(f / f4);
                        iFloor2 = Math.round(f2 / f4);
                        bhdVar3 = bhdVar;
                    } else if (i8 % iMax == 0 && i7 % iMax == 0) {
                        iFloor2 = i7 / iMax;
                        iFloor = i8 / iMax;
                        bhoVar = bhoVar;
                        bhdVar3 = bhdVar;
                    } else {
                        bhoVar = bhoVar;
                        bhd bhdVar5 = bhdVar;
                        int[] iArrJ2 = j(bhoVar, optionsE, bhdVar5, bcvVar);
                        int i11 = iArrJ2[0];
                        iFloor2 = iArrJ2[1];
                        iFloor = i11;
                        bhdVar3 = bhdVar5;
                    }
                    double dA = bhbVar.a(iFloor, iFloor2, i6, iRound);
                    int iB2 = b(dA);
                    double d2 = iB2;
                    Double.isNaN(d2);
                    Double.isNaN(dA);
                    int iC3 = c(d2 * dA);
                    double d3 = iC3 / iB2;
                    Double.isNaN(dA);
                    Double.isNaN(d3);
                    double d4 = iC3;
                    Double.isNaN(d4);
                    optionsE.inTargetDensity = c((dA / d3) * d4);
                    optionsE.inDensity = b(dA);
                    if (i(optionsE)) {
                        optionsE.inScaled = true;
                        i3 = i4;
                        i5 = i9;
                        bhdVar2 = bhdVar3;
                    } else {
                        optionsE.inTargetDensity = 0;
                        optionsE.inDensity = 0;
                        i3 = i4;
                        i5 = i9;
                        bhdVar2 = bhdVar3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bheVar = this;
                    bArr = bArr;
                    f(optionsE);
                    bheVar.f.c(bArr);
                    throw th;
                }
            }
            bheVar = this;
            try {
                if (bheVar.k.b(i6, iRound, z2, z)) {
                    optionsE.inPreferredConfig = Bitmap.Config.HARDWARE;
                    optionsE.inMutable = false;
                } else if (azdVar != azd.PREFER_ARGB_8888) {
                    try {
                        config = bhoVar.c().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                    } catch (IOException e2) {
                    }
                    optionsE.inPreferredConfig = config;
                    if (optionsE.inPreferredConfig == Bitmap.Config.RGB_565) {
                        optionsE.inDither = true;
                    }
                } else {
                    optionsE.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                int i12 = optionsE.inSampleSize;
                if (i3 < 0 || i5 < 0 || !zBooleanValue) {
                    float f5 = i(optionsE) ? optionsE.inTargetDensity / optionsE.inDensity : 1.0f;
                    float f6 = optionsE.inSampleSize;
                    int iCeil3 = (int) Math.ceil(i3 / f6);
                    int iCeil4 = (int) Math.ceil(i5 / f6);
                    int iRound2 = Math.round(iCeil3 * f5);
                    iRound = Math.round(iCeil4 * f5);
                    i6 = iRound2;
                }
                if (i6 > 0 && iRound > 0) {
                    bcv bcvVar2 = bheVar.i;
                    if (optionsE.inPreferredConfig != Bitmap.Config.HARDWARE) {
                        Bitmap.Config config2 = optionsE.outConfig;
                        if (config2 == null) {
                            config2 = optionsE.inPreferredConfig;
                        }
                        optionsE.inBitmap = bcvVar2.b(i6, iRound, config2);
                    }
                }
                if (azuVar != null) {
                    optionsE.inPreferredColorSpace = ColorSpace.get((azuVar == azu.DISPLAY_P3 && optionsE.outColorSpace != null && optionsE.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                }
                Bitmap bitmapD = d(bhoVar, optionsE, bhdVar2, bheVar.i);
                bhdVar2.a(bheVar.i, bitmapD);
                if (bitmapD != null) {
                    bitmapD.setDensity(bheVar.j.densityDpi);
                    bcv bcvVar3 = bheVar.i;
                    if (bhy.i(iA)) {
                        Matrix matrix = new Matrix();
                        switch (iA) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapD.getWidth(), bitmapD.getHeight());
                        matrix.mapRect(rectF);
                        Bitmap bitmapA = bcvVar3.a(Math.round(rectF.width()), Math.round(rectF.height()), bhy.b(bitmapD));
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        bitmapA.setHasAlpha(bitmapD.hasAlpha());
                        bhy.g(bitmapD, bitmapA, matrix);
                        bitmap2 = bitmapA;
                    } else {
                        bitmap2 = bitmapD;
                    }
                    boolean zEquals = bitmapD.equals(bitmap2);
                    bitmap = bitmap2;
                    if (!zEquals) {
                        bheVar.i.d(bitmapD);
                        bitmap = bitmap2;
                    }
                } else {
                    bitmap = null;
                }
                bgn bgnVarF = bgn.f(bitmap, bheVar.i);
                f(optionsE);
                bheVar.f.c(bArr);
                return bgnVarF;
            } catch (Throwable th3) {
                th = th3;
                bArr = bArr;
                f(optionsE);
                bheVar.f.c(bArr);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bheVar = this;
        }
    }
}
