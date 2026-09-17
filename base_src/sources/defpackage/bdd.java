package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bdd implements bcv {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final bde b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    public bdd(long j) {
        bdj bdjVar = new bdj();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.b = bdjVar;
        this.c = setUnmodifiableSet;
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[Catch: all -> 0x00f1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0022, B:19:0x0041, B:21:0x0044, B:23:0x0059, B:25:0x0061, B:31:0x006d, B:34:0x0074, B:35:0x008a, B:36:0x008d, B:38:0x009a, B:40:0x00aa, B:41:0x00b0, B:11:0x0025, B:12:0x002d, B:13:0x0030, B:18:0x003f, B:14:0x0033, B:15:0x0036, B:16:0x0039, B:17:0x003c, B:44:0x00c7, B:45:0x00f0), top: B:51:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: all -> 0x00f1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0022, B:19:0x0041, B:21:0x0044, B:23:0x0059, B:25:0x0061, B:31:0x006d, B:34:0x0074, B:35:0x008a, B:36:0x008d, B:38:0x009a, B:40:0x00aa, B:41:0x00b0, B:11:0x0025, B:12:0x002d, B:13:0x0030, B:18:0x003f, B:14:0x0033, B:15:0x0036, B:16:0x0039, B:17:0x003c, B:44:0x00c7, B:45:0x00f0), top: B:51:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa A[Catch: all -> 0x00f1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0022, B:19:0x0041, B:21:0x0044, B:23:0x0059, B:25:0x0061, B:31:0x006d, B:34:0x0074, B:35:0x008a, B:36:0x008d, B:38:0x009a, B:40:0x00aa, B:41:0x00b0, B:11:0x0025, B:12:0x002d, B:13:0x0030, B:18:0x003f, B:14:0x0033, B:15:0x0036, B:16:0x0039, B:17:0x003c, B:44:0x00c7, B:45:0x00f0), top: B:51:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0 A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0022, B:19:0x0041, B:21:0x0044, B:23:0x0059, B:25:0x0061, B:31:0x006d, B:34:0x0074, B:35:0x008a, B:36:0x008d, B:38:0x009a, B:40:0x00aa, B:41:0x00b0, B:11:0x0025, B:12:0x002d, B:13:0x0030, B:18:0x003f, B:14:0x0033, B:15:0x0036, B:16:0x0039, B:17:0x003c, B:44:0x00c7, B:45:0x00f0), top: B:51:0x0001 }] */
    private final synchronized Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        if (config == Bitmap.Config.HARDWARE) {
            String strValueOf = String.valueOf(config);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 176);
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(strValueOf);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
        bde bdeVar = this.b;
        if (config == null) {
            config = a;
        }
        int iB = bmf.b(i, i2, config);
        bdh bdhVarD = ((bdj) bdeVar).f.d(iB, config);
        if (!Bitmap.Config.RGBA_F16.equals(config)) {
            switch (bdg.a[config.ordinal()]) {
                case 1:
                    configArr = bdj.a;
                    break;
                case 2:
                    configArr = bdj.c;
                    break;
                case 3:
                    configArr = bdj.d;
                    break;
                case 4:
                    configArr = bdj.e;
                    break;
                default:
                    configArr = new Bitmap.Config[1];
                    configArr[0] = config;
                    break;
            }
        } else {
            configArr = bdj.b;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) ((bdj) bdeVar).b(config2).ceilingKey(Integer.valueOf(iB));
            if (num != null && num.intValue() <= iB * 8) {
                if (num.intValue() != iB) {
                    ((bdj) bdeVar).f.c(bdhVarD);
                    bdhVarD = ((bdj) bdeVar).f.d(num.intValue(), config2);
                } else if (config2 == null) {
                    if (config != null) {
                        ((bdj) bdeVar).f.c(bdhVarD);
                        bdhVarD = ((bdj) bdeVar).f.d(num.intValue(), config2);
                    }
                } else if (!config2.equals(config)) {
                    ((bdj) bdeVar).f.c(bdhVarD);
                    bdhVarD = ((bdj) bdeVar).f.d(num.intValue(), config2);
                }
                bitmap = (Bitmap) ((bdj) bdeVar).g.a(bdhVarD);
                if (bitmap != null) {
                    ((bdj) bdeVar).c(Integer.valueOf(bdhVarD.a), bitmap);
                    bitmap.reconfigure(i, i2, config);
                }
                if (bitmap == null) {
                    this.g++;
                } else {
                    this.f++;
                    this.e -= (long) bmf.a(bitmap);
                    bitmap.setHasAlpha(true);
                    bitmap.setPremultiplied(true);
                }
            }
        }
        bitmap = (Bitmap) ((bdj) bdeVar).g.a(bdhVarD);
        if (bitmap != null) {
            ((bdj) bdeVar).c(Integer.valueOf(bdhVarD.a), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        if (bitmap == null) {
            this.g++;
        } else {
            this.f++;
            this.e -= (long) bmf.a(bitmap);
            bitmap.setHasAlpha(true);
            bitmap.setPremultiplied(true);
        }
        return bitmap;
    }

    private final synchronized void h(long j) {
        while (this.e > j) {
            bde bdeVar = this.b;
            Bitmap bitmap = (Bitmap) ((bdj) bdeVar).g.b();
            if (bitmap != null) {
                ((bdj) bdeVar).c(Integer.valueOf(bmf.a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    String.valueOf(String.valueOf(this.b)).length();
                }
                this.e = 0L;
                return;
            }
            this.e -= (long) bmf.a(bitmap);
            this.i++;
            bitmap.recycle();
        }
    }

    @Override // defpackage.bcv
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG == null) {
            return f(i, i2, config);
        }
        bitmapG.eraseColor(0);
        return bitmapG;
    }

    @Override // defpackage.bcv
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        return bitmapG == null ? f(i, i2, config) : bitmapG;
    }

    @Override // defpackage.bcv
    public final void c() {
        h(0L);
    }

    @Override // defpackage.bcv
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && bmf.a(bitmap) <= this.d && this.c.contains(bitmap.getConfig())) {
                int iA = bmf.a(bitmap);
                bde bdeVar = this.b;
                bdh bdhVarD = ((bdj) bdeVar).f.d(bmf.a(bitmap), bitmap.getConfig());
                ((bdj) bdeVar).g.c(bdhVarD, bitmap);
                NavigableMap navigableMapB = ((bdj) bdeVar).b(bitmap.getConfig());
                Integer num = (Integer) navigableMapB.get(Integer.valueOf(bdhVarD.a));
                navigableMapB.put(Integer.valueOf(bdhVarD.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                this.h++;
                this.e += (long) iA;
                h(this.d);
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bcv
    public final void e(int i) {
        if (i >= 40 || i >= 20) {
            c();
        } else if (i == 15) {
            h(this.d >> 1);
        }
    }
}
