package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class bhy {
    public static final Lock a;
    private static final Paint b = new Paint(6);
    private static final Paint c = new Paint(7);
    private static final Paint d;
    private static final Set e;

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        e = hashSet;
        a = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new bhx();
        Paint paint = new Paint(7);
        d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static int a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap.Config b(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static Bitmap c(bcv bcvVar, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapA = bcvVar.a(i, i2, b(bitmap));
        h(bitmap, bitmapA);
        g(bitmap, bitmapA, matrix);
        return bitmapA;
    }

    public static Bitmap d(bcv bcvVar, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? f(bcvVar, bitmap, i, i2) : bitmap;
    }

    public static Bitmap e(bcv bcvVar, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapA;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap.Config configJ = j(bitmap);
        if (configJ.equals(bitmap.getConfig())) {
            bitmapA = bitmap;
        } else {
            bitmapA = bcvVar.a(bitmap.getWidth(), bitmap.getHeight(), configJ);
            new Canvas(bitmapA).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapA2 = bcvVar.a(iMin, iMin, j(bitmap));
        bitmapA2.setHasAlpha(true);
        Lock lock = a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapA2);
            canvas.drawCircle(f2, f2, f2, c);
            canvas.drawBitmap(bitmapA, (Rect) null, rectF, d);
            k(canvas);
            lock.unlock();
            if (!bitmapA.equals(bitmap)) {
                bcvVar.d(bitmapA);
            }
            return bitmapA2;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    public static Bitmap f(bcv bcvVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            return bitmap;
        }
        Bitmap bitmapA = bcvVar.a((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), b(bitmap));
        h(bitmap, bitmapA);
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        g(bitmap, bitmapA, matrix);
        return bitmapA;
    }

    public static void g(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        a.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, b);
            k(canvas);
        } finally {
            a.unlock();
        }
    }

    public static void h(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static boolean i(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    private static Bitmap.Config j(Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }

    private static void k(Canvas canvas) {
        canvas.setBitmap(null);
    }
}
