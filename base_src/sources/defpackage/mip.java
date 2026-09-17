package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppGlobals;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageWriter;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import com.CamcorderProfile;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.io.ByteStreams;
import com.google.lens.sdk.LensApi;
import j$.nio.charset.StandardCharsets;
import j$.util.function.Consumer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class mip {
    public static int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Context f13a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;
    public static Boolean e;
    public static Boolean f;

    public mip() {
    }

    public mip(Activity activity) {
        activity.getWindow().getDecorView().getRootView();
    }

    public mip(ddf ddfVar) {
        ddg ddgVar = deg.a;
        ddfVar.b();
    }

    public mip(lnd lndVar) {
        lndVar.c().h();
    }

    public mip(lvp lvpVar) {
        ((Integer) lvpVar.m(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue();
    }

    public mip(byte[] bArr) {
        Executors.newSingleThreadScheduledExecutor();
        new mlr();
        new mlr();
    }

    public static int A(int i) {
        return i - 2;
    }

    public static int B(mhl mhlVar) throws mhn {
        try {
            return (int) w(mhlVar).getDeclaredField("MIN_VERSION").getLong(null);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            throw new mhn("Failed to read host package version", e2);
        }
    }

    public static int C(mhl mhlVar) throws mhn {
        try {
            return (int) w(mhlVar).getDeclaredField("CURRENT_VERSION").getLong(null);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            throw new mhn("Failed to read host package version", e2);
        }
    }

    public static String D(String str, Object... objArr) {
        try {
            return String.format(Locale.US, str, objArr);
        } catch (RuntimeException e2) {
            return String.format(Locale.US, "Unable to format log message: '%s' error:'%s'", str, e2);
        }
    }

    public static int E(int i) {
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
            default:
                return 0;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
        }
    }

    public static void F() {
        G(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }

    public static void G(boolean z, String str) {
        if (z) {
            return;
        }
        x(new IllegalStateException(str));
    }

    public static void H(Object obj) {
        if (obj == null) {
            x(new NullPointerException());
        }
    }

    public static pht I(kvk kvkVar) {
        final pih pihVarF = pih.f();
        kvkVar.g(pgr.INSTANCE, new kvc() { // from class: mfc
            @Override // defpackage.kvc
            public final void a(kvk kvkVar2) {
                pih pihVar = pihVarF;
                if (((kvp) kvkVar2).c) {
                    pihVar.cancel(false);
                    return;
                }
                if (kvkVar2.e()) {
                    pihVar.o(kvkVar2.c());
                    return;
                }
                Exception excB = kvkVar2.b();
                if (excB == null) {
                    throw new IllegalStateException();
                }
                pihVar.a(excB);
            }
        });
        return pihVarF;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    public static String J(String str) {
        switch (str) {
            case "jpg":
            case "jpeg":
                return "image/jpeg";
            case "gif":
                return "image/gif";
            case "png":
                return "image/png";
            case "dng":
                return "image/x-adobe-dng";
            case "mp4":
                return "video/mp4";
            case "3gpp":
                return "video/3gpp";
            case "txt":
                return "text/plain";
            default:
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
    }

    public static boolean K(String str) {
        return str.startsWith("image/");
    }

    public static boolean L(String str) {
        return str.startsWith("video/");
    }

    public static long M(InputStream inputStream, mak makVar) {
        return O(inputStream, null, makVar);
    }

    public static long N(byte[] bArr, mak makVar) {
        return P(bArr, null, makVar);
    }

    public static long O(InputStream inputStream, ExifInterface exifInterface, mak makVar) throws IOException {
        long jCopy;
        ozj ozjVar;
        FileOutputStream fileOutputStreamE = makVar.e();
        try {
            if (exifInterface != null) {
                ozjVar = new ozj(fileOutputStreamE);
                OutputStream outputStreamM = exifInterface.m(ozjVar);
                try {
                    ByteStreams.copy(inputStream, outputStreamM);
                    outputStreamM.close();
                    ozjVar.flush();
                    jCopy = ozjVar.a;
                    ozjVar.close();
                } catch (Throwable th) {
                    try {
                        outputStreamM.close();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            } else {
                jCopy = ByteStreams.copy(inputStream, fileOutputStreamE);
            }
            fileOutputStreamE.flush();
            fileOutputStreamE.close();
            return jCopy;
        } catch (Throwable th3) {
            try {
                ozjVar.close();
            } catch (Throwable th4) {
            }
            throw th3;
        } finally {
            try {
                fileOutputStreamE.close();
            } catch (Throwable th5) {
            }
        }
    }

    public static long P(byte[] bArr, ExifInterface exifInterface, mak makVar) {
        return O(new ByteArrayInputStream(bArr), exifInterface, makVar);
    }

    public static long Q(InputStream inputStream, ExifInterface exifInterface, mak makVar) {
        return exifInterface == null ? M(inputStream, makVar) : R(ByteStreams.toByteArray(inputStream), exifInterface, makVar);
    }

    public static long R(byte[] bArr, ExifInterface exifInterface, mak makVar) throws IOException {
        if (exifInterface == null) {
            return N(bArr, makVar);
        }
        FileOutputStream fileOutputStreamE = makVar.e();
        try {
            OutputStream outputStreamM = exifInterface.m(fileOutputStreamE);
            try {
                ojd ojdVarD = mde.d(bArr, (ast) mde.c(exifInterface.bA).f());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                mde.p(bArr, byteArrayOutputStream, (ast) ojdVarD.a, (ast) ojdVarD.b);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                outputStreamM.write(byteArray);
                long length = byteArray.length;
                outputStreamM.close();
                fileOutputStreamE.close();
                return length;
            } catch (Throwable th) {
                try {
                    outputStreamM.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStreamE.close();
            } catch (Throwable th4) {
            }
            throw th3;
        }
    }

    public static long S(int i, lig ligVar) {
        int i2 = ligVar.a;
        int i3 = ligVar.b;
        int bitsPerPixel = ImageFormat.getBitsPerPixel(i);
        if (bitsPerPixel <= 0 && i == 257) {
            bitsPerPixel = 16;
            i = 257;
        }
        if (bitsPerPixel <= 0) {
            switch (i) {
                default:
                    switch (i) {
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        case 256:
                            break;
                    }
                case 1212500294:
                case 1768253795:
                    return ((((long) (i2 * 24)) * ((long) i3)) / 8) / 4;
            }
        }
        if (bitsPerPixel <= 0 && i == 34) {
            bitsPerPixel = ImageFormat.getBitsPerPixel(35);
        }
        return (((long) (i2 * Math.max(bitsPerPixel, 0))) * ((long) i3)) / 8;
    }

    public static String T(int i) {
        switch (i) {
            case 538982489:
                return "Y8";
            case 540422489:
                return "Y16";
            case 1212500294:
                return "HEIC";
            case 1768253795:
                return "DEPTH_JPEG";
            default:
                switch (i) {
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        return "PRIVATE";
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        return "RAW12";
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        return "YUV_422_888";
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        return "YUV_444_888";
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        return "FLEX_RGB_888";
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        return "FLEX_RGBA_8888";
                    case 257:
                        return "POINT_CLOUD";
                    case 4098:
                        return "RAW_DEPTH";
                    case 1144402265:
                        return "DEPTH16";
                    default:
                        switch (i) {
                            case 32:
                                return "RAW_SENSOR";
                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                return "RAW10";
                            default:
                                switch (i) {
                                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                        return "YUV_420_888";
                                    default:
                                        switch (i) {
                                            case 0:
                                                return "UNKNOWN";
                                            case 4:
                                                return "RGB_565";
                                            case 16:
                                                return "NV16";
                                            case 17:
                                                return "NV21";
                                            case 20:
                                                return "YUY2";
                                            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                                return "BLOB";
                                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                                return "PRIVATE";
                                            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                                return "YUV_420_888";
                                            case 256:
                                                return "JPEG";
                                            case 842094169:
                                                return "YV12";
                                            default:
                                                return Integer.toString(i);
                                        }
                                }
                        }
                }
        }
    }

    public static PointF U(PointF pointF, int i) {
        switch ((360 - i) % 360) {
            case 0:
                return pointF;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                return new PointF(pointF.y, 1.0f - pointF.x);
            case 180:
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            case 270:
                return new PointF(1.0f - pointF.y, pointF.x);
            default:
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
        }
    }

    public static String V(lyw lywVar) {
        if (lywVar == null) {
            return "-";
        }
        if (lywVar instanceof lyt) {
            return Long.toString(((lyt) lywVar).a);
        }
        if (!(lywVar instanceof lyu)) {
            return "-";
        }
        lyu lyuVar = (lyu) lywVar;
        return String.format(Locale.ROOT, "n: %6.6s, min: %12.12s, max: %12.12s, mean: %12.12s, last: %12.12s", Long.toString((long) lyuVar.a), eW(lyuVar.b), eW(lyuVar.c), eW(lyuVar.d), eW(lyuVar.e));
    }

    public static mnb W(pht phtVar) {
        return new mmr(phtVar);
    }

    public static mnb X(Executor executor, Callable callable) {
        moa moaVarI = moa.i();
        try {
            executor.execute(new mnh(moaVarI, callable));
        } catch (Exception e2) {
            moaVarI.l(mnc.a(e2));
        }
        return moaVarI;
    }

    public static mnb Y(Object obj) {
        return new mna(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mnb Z(Iterable iterable) {
        return iterable.isEmpty() ? Y(Collections.emptyList()) : new mnm(iterable).a;
    }

    public static List aA(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() == 0) {
            return obr.ag();
        }
        ArrayList arrayList = new ArrayList();
        obr.aF(byteBuffer.getInt(0) == 1);
        int i = 4;
        int i2 = 0;
        for (int i3 = 4; i3 < byteBuffer.limit(); i3++) {
            if (byteBuffer.get(i3) == 1 && i2 >= 3) {
                arrayList.add(eX(byteBuffer, i, (i3 - 3) - i));
                i = i3 + 1;
            }
            if (i3 == byteBuffer.limit() - 1) {
                arrayList.add(eX(byteBuffer, i, byteBuffer.limit() - i));
            }
            i2 = byteBuffer.get(i3) == 0 ? i2 + 1 : 0;
        }
        return arrayList;
    }

    public static int aB(ast astVar) {
        return ((Integer) eY(new mjd(astVar, 1), new mjd(astVar, 0), mje.a)).intValue();
    }

    public static int aC(ast astVar) throws ass {
        int iA;
        boolean z = true;
        if (aB(astVar) == 1) {
            return ((Integer) eY(new mjd(astVar, 2), mje.b)).intValue();
        }
        if (aB(astVar) == 1) {
            throw new ass("V1 format does not have a container", 5);
        }
        gj.f("http://ns.google.com/photos/1.0/container/");
        gj.c("Directory");
        atl atlVarE = gk.e(((ati) astVar).a, hn.d("http://ns.google.com/photos/1.0/container/", "Directory"), false, null);
        if (atlVarE == null) {
            iA = 0;
        } else {
            if (!atlVarE.g().d()) {
                throw new ass("The named property is not an array", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
            iA = atlVarE.a();
        }
        jdy jdyVar = new jdy((byte[]) null);
        for (int i = 1; i <= iA; i++) {
            String strG = gh.g("Directory", i);
            String strD = mlq.d(astVar, strG, "Mime");
            mlq.e(strD, "Mime");
            String strD2 = mlq.d(astVar, strG, "Semantic");
            mlq.e(strD2, "Semantic");
            String strD3 = mlq.d(astVar, strG, "Length");
            String strD4 = mlq.d(astVar, strG, "Padding");
            mlp mlpVarA = mlq.a();
            mlpVarA.a = strD;
            mlpVarA.b = strD2;
            mlpVarA.b(Integer.parseInt((String) mlq.c(strD3)));
            mlpVarA.c(Integer.parseInt((String) mlq.c(strD4)));
            jdyVar.e(mlpVarA.a());
        }
        int i2 = 0;
        for (mlq mlqVar : jdyVar.d()) {
            if (z) {
                aE(mlqVar);
                i2 += mlqVar.d;
                z = false;
            } else {
                aF(mlqVar);
                i2 += mlqVar.c + mlqVar.d;
            }
        }
        return i2;
    }

    public static Object aD(String str) throws ass {
        throw new ass(str.length() != 0 ? "Property value missing for ".concat(str) : new String("Property value missing for "), 5);
    }

    public static String aE(mlq mlqVar) {
        String str;
        if (mlqVar.b.contentEquals("Primary")) {
            str = "";
        } else {
            Log.w("MVXmpMetadata", "Badly formatted file. First container item is not primary");
            str = "First container item must be primary.\n";
        }
        if (mlqVar.c <= 0) {
            return str;
        }
        String strConcat = str.concat("First container item must have length of 0.\n");
        int i = mlqVar.c;
        StringBuilder sb = new StringBuilder(59);
        sb.append("First container length expected to be 0. Found: ");
        sb.append(i);
        Log.w("MVXmpMetadata", sb.toString());
        return strConcat;
    }

    public static String aF(mlq mlqVar) {
        String str;
        if (mlqVar.b.contentEquals("Primary")) {
            Log.w("MVXmpMetadata", "Badly formatted file. Only first container item should be primary");
            str = "Secondary container items must not be primary.\n";
        } else {
            str = "";
        }
        if (mlqVar.d <= 0) {
            return str;
        }
        String strConcat = str.concat("Secondary container items must have 0 padding.\n");
        Log.w("MVXmpMetadata", "Badly formatted file. Only primary container items may have padding.");
        return strConcat;
    }

    public static boolean aG(String str) {
        return str.startsWith("video/");
    }

    public static int aH(int i, Context context) {
        return new nyl(context).a(ohh.X(context, com.google.android.GoogleCameraEngR18F1.R.attr.colorSurface, 0), context.getResources().getDimension(i));
    }

    public static void aI(String str, lyd[] lydVarArr, lyd[] lydVarArr2) {
        if (Arrays.equals(lydVarArr, lydVarArr2)) {
            return;
        }
        String string = Arrays.toString(lydVarArr);
        String string2 = Arrays.toString(lydVarArr2);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 32 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(str);
        sb.append(" has: ");
        sb.append(string);
        sb.append(" which is different from: ");
        sb.append(string2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static float aJ(byte[] bArr, int i) {
        return Float.intBitsToFloat(aK(bArr, i));
    }

    public static int aK(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long aL(byte[] bArr, int i) {
        return ((long) aK(bArr, i + 12)) & 4294967295L;
    }

    public static long aM(byte[] bArr, int i) {
        int i2 = i + 16;
        return ((long) (bArr[i2] & 255)) + (((long) (bArr[i2 + 1] & 255)) << 8) + (((long) (bArr[i2 + 2] & 255)) << 16) + (((long) (bArr[i2 + 3] & 255)) << 24) + (((long) (bArr[i2 + 4] & 255)) << 32) + (((long) (bArr[i2 + 5] & 255)) << 40) + (((long) (bArr[i2 + 6] & 255)) << 48) + (((long) (bArr[i2 + 7] & 255)) << 56);
    }

    public static String aN(mag magVar) {
        return aO(magVar.b(), magVar.d());
    }

    public static String aO(int i, int i2) {
        String strT = T(i);
        StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 12);
        sb.append(strT);
        sb.append("w");
        sb.append(i2);
        return sb.toString();
    }

    public static double aP(float f2, double d2) {
        obr.aK(f2 > 0.0f, "Focal length cannot be zero (%s)", Float.valueOf(f2));
        obr.aK(d2 > 0.0d, "Diagonal size cannot be zero (%s)", Double.valueOf(d2));
        double d3 = f2 + f2;
        Double.isNaN(d3);
        double dAtan = Math.atan(d2 / d3);
        return dAtan + dAtan;
    }

    public static double aQ(double d2, float f2) {
        double d3 = f2 + f2;
        double dTan = Math.tan(d2 / 2.0d);
        Double.isNaN(d3);
        return d3 * dTan;
    }

    public static double aR(lvp lvpVar) {
        SizeF sizeF = (SizeF) lvpVar.n(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        return Math.hypot(sizeF.getHeight(), sizeF.getWidth());
    }

    public static Object aS(lzl lzlVar) {
        return lzlVar.j().a;
    }

    public static List aT(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(aS((lzl) list.get(i)));
        }
        return arrayList;
    }

    public static lvj aU(Surface surface, int i) {
        return new lvj(ImageWriter.newInstance(surface, i));
    }

    public static long aW(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            lui luiVar = (lui) ((lnx) it.next());
            long jF = luiVar.f();
            obr.ar(jF >= 0, "bytesPerImage() must be >= 0", new Object[0]);
            if (!luiVar.i()) {
                j += jF;
            }
        }
        return j;
    }

    public static void aX(final ltm ltmVar, Handler handler) {
        handler.post(new Runnable() { // from class: ltg
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = ltmVar.d.iterator();
                while (it.hasNext()) {
                    ((mip) it.next()).fw(null);
                }
            }
        });
    }

    public static void aY(final Collection collection, Handler handler) {
        handler.post(new Runnable() { // from class: lth
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ltm) it.next()).d.iterator();
                    while (it2.hasNext()) {
                        ((mip) it2.next()).fw(null);
                    }
                }
            }
        });
    }

    public static boolean aZ(lqd lqdVar, lqd lqdVar2, lis lisVar) {
        if (lqdVar2 == lqdVar || lqdVar.d.isEmpty() || lqdVar2.d.isEmpty()) {
            return true;
        }
        boolean z = true;
        for (lnq lnqVar : lqdVar2.d) {
            for (lnq lnqVar2 : lqdVar.d) {
                if (lnqVar.a.equals(lnqVar2.a) && !lnqVar.b.equals(lnqVar2.b)) {
                    if (lisVar == null) {
                        return false;
                    }
                    lisVar.d(bp("%s on %s (%s) conflicts with %s (%s)", lnqVar2.a(), lqdVar, lnqVar2.b, lqdVar2, lnqVar.b));
                    z = false;
                }
            }
        }
        return z;
    }

    public static Object aa(mnb mnbVar) {
        Object objAb = ab(mnbVar);
        if (objAb != null) {
            return objAb;
        }
        String strValueOf = String.valueOf(mnbVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 55);
        sb.append("Attempting to get value of ");
        sb.append(strValueOf);
        sb.append(" which is not yet available!");
        throw new IllegalStateException(sb.toString());
    }

    public static Object ab(mnb mnbVar) {
        if (mnbVar.f()) {
            return ac(mnbVar);
        }
        return null;
    }

    public static Object ac(mnb mnbVar) {
        try {
            return ad(mnbVar);
        } catch (mnc e2) {
            throw new piq(e2);
        }
    }

    public static Object ad(mnb mnbVar) {
        Object objE;
        boolean z = false;
        while (true) {
            try {
                objE = mnbVar.e();
                break;
            } catch (InterruptedException e2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objE;
    }

    public static mmv ae() {
        obr.aG(true, "maxPendingEventCount must be > 0");
        return new mmv();
    }

    public static mmd af(int i) {
        return new mmd(new ArrayList(i));
    }

    public static mlu ag(Object obj) {
        return new mlw(obj);
    }

    public static mlu ah(Throwable th) {
        return new mly(th);
    }

    public static mmh ai() {
        return new mlx();
    }

    public static mlu aj() {
        return new mlz();
    }

    public static mla ak(mlb mlbVar) throws IOException, mky {
        if (mlbVar.a() < 8) {
            throw new mky(String.format(Locale.US, "Box too small: remaining=%s", Long.valueOf(mlbVar.a())));
        }
        mlbVar.a.getChannel().position(mlbVar.b + mlbVar.d);
        long jA = new DataInputStream(mlbVar.a).readInt();
        if (jA != 1) {
            if (jA == 0) {
                jA = mlbVar.a();
            }
            return new mla(jA, false);
        }
        if (mlbVar.a() < 16) {
            throw new mky(String.format(Locale.US, "64-bit box too small just %s bytes remaining", Long.valueOf(mlbVar.a())));
        }
        mlbVar.a.getChannel().position(mlbVar.b + mlbVar.d + 8);
        return new mla((int) new DataInputStream(mlbVar.a).readLong(), true);
    }

    public static mlb al(mlb mlbVar) throws mky {
        if (mlbVar.a() == 0) {
            return null;
        }
        long j = ak(mlbVar).a;
        if (j > mlbVar.a()) {
            throw new mky(String.format(Locale.US, "getNextBox - Next box (is it a box?) claims length of %s but has only %s ", Long.valueOf(j), Long.valueOf(mlbVar.a())));
        }
        if (j < 0) {
            return null;
        }
        mlb mlbVarB = mlbVar.b();
        mlbVarB.d(mlbVarB.d + j);
        mlbVar.e(mlbVar.d + j);
        return mlbVarB.c();
    }

    public static byte[] am(mlb mlbVar) throws IOException, mky {
        if (mlbVar.a() < 8) {
            throw new mky(String.format(Locale.US, "Can't get type of short (%d bytes) box", Long.valueOf(mlbVar.a())));
        }
        obr.aF(mlbVar.a() >= 8);
        mlb mlbVarB = mlbVar.b();
        mlbVarB.e(mlbVar.d + 4);
        mlbVarB.d(mlbVarB.d + 4);
        mlb mlbVarC = mlbVarB.c();
        mlbVarC.a.getChannel().position(mlbVarC.b + mlbVarC.d);
        if (mlbVarC.a() >= 2147483647L) {
            throw new IOException("Can't read contents of a >2GB span");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) mlbVarC.a());
        int i = mlbVarC.a.getChannel().read(byteBufferAllocate);
        if (i == mlbVarC.a()) {
            byte[] bArr = new byte[4];
            byteBufferAllocate.get(bArr);
            return bArr;
        }
        long jA = mlbVarC.a();
        StringBuilder sb = new StringBuilder(83);
        sb.append("Was supposed to have ");
        sb.append(jA);
        sb.append(" bytes remaining but only read ");
        sb.append(i);
        throw new IOException(sb.toString());
    }

    public static long an(long j, long j2) {
        return (j * j2) / 1000000;
    }

    public static ojc ao(MediaFormat mediaFormat) {
        return (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) ? ojc.i(Float.valueOf(mediaFormat.getInteger("time-lapse-fps"))) : oih.a;
    }

    public static boolean ap(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").contains("audio/");
    }

    public static boolean aq(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").contains("video/");
    }

    public static mkd ar(FileOutputStream fileOutputStream, mkg mkgVar) throws IOException {
        mkq mkqVar = new mkq();
        mkt mktVar = new mkt(mkqVar, mkgVar);
        mkp mkpVar = new mkp();
        mkl mklVar = new mkl(mkgVar.b ? ojc.i(5) : oih.a);
        int i = mkgVar.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                int i3 = mkgVar.e;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                switch (i4) {
                    case 0:
                        mklVar.c("iso5", 512);
                        mklVar.b("iso5");
                        mklVar.b("iso6");
                        mklVar.b("mp41");
                        break;
                    case 1:
                        mklVar.c("isom", 131072);
                        mklVar.b("isom");
                        mklVar.b("iso2");
                        mklVar.b("mp41");
                        break;
                }
                break;
        }
        int i5 = mkgVar.e;
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalArgumentException("Unsupported option to switch between muxers.");
            }
            mkv mkvVar = new mkv(fileOutputStream, mktVar, mkpVar, mklVar);
            short[][] sArr = mkw.a;
            return new mke(mkvVar, mkqVar);
        }
        mkk mkkVar = new mkk(fileOutputStream, mklVar, mkgVar);
        mkkVar.a.position(0L);
        ByteBuffer byteBufferA = mkkVar.b.a();
        mkkVar.a.write(byteBufferA);
        mkkVar.c = byteBufferA.limit();
        return mkkVar;
    }

    public static int as(long j) {
        return (int) ((j / 1000) + 2082844800);
    }

    public static ByteBuffer at(List list, List list2, List list3) {
        int i = ((orr) list).c;
        obr.aF(((orr) list2).c == i);
        obr.aF(((orr) list3).c == i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            byteBufferAllocate.putInt(((Integer) list.get(i2)).intValue());
            byteBufferAllocate.putInt(((Integer) list2.get(i2)).intValue());
            byteBufferAllocate.putInt(((Integer) list3.get(i2)).intValue());
        }
        return ax("elst", byteBufferAllocate);
    }

    public static ByteBuffer au(mks mksVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        if (aq(mksVar.b())) {
            byteBufferAllocate.put("vide".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.put("VideoHandle".getBytes(StandardCharsets.UTF_8));
        } else if (ap(mksVar.b())) {
            byteBufferAllocate.put("soun".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.put("SoundHandle".getBytes(StandardCharsets.UTF_8));
        } else {
            byteBufferAllocate.put("meta".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.put("MetaHandle".getBytes(StandardCharsets.UTF_8));
        }
        byteBufferAllocate.put((byte) 0);
        return ax("hdlr", byteBufferAllocate);
    }

    public static ByteBuffer av(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, List list, ByteBuffer byteBuffer4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(byteBuffer);
        arrayList.add(byteBuffer2);
        arrayList.add(byteBuffer3);
        arrayList.addAll(list);
        arrayList.add(byteBuffer4);
        return aw("moov", arrayList);
    }

    public static ByteBuffer aw(String str, List list) {
        Iterator it = list.iterator();
        int iLimit = 8;
        while (it.hasNext()) {
            iLimit += ((ByteBuffer) it.next()).limit();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit);
        byteBufferAllocate.putInt(iLimit);
        byteBufferAllocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put((ByteBuffer) it2.next());
        }
        return byteBufferAllocate;
    }

    public static ByteBuffer ax(String str, ByteBuffer byteBuffer) {
        return ay(str.getBytes(StandardCharsets.UTF_8), byteBuffer);
    }

    public static ByteBuffer ay(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + 8);
        byteBufferAllocate.putInt(byteBuffer.limit() + 8);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        return byteBufferAllocate;
    }

    public static ByteBuffer az(MediaFormat mediaFormat) {
        switch (mediaFormat.getString("mime")) {
            case "audio/mp4a-latm":
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mediaFormat.getByteBuffer("csd-0").limit() + 200);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putShort((short) 0);
                byteBufferAllocate.putShort((short) 1);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putShort((short) mediaFormat.getInteger("channel-count"));
                byteBufferAllocate.putShort((short) 16);
                byteBufferAllocate.putShort((short) 0);
                byteBufferAllocate.putShort((short) 0);
                byteBufferAllocate.putInt(mediaFormat.getInteger("sample-rate") << 16);
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                int iLimit = byteBuffer.limit();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iLimit + 200);
                byteBufferAllocate2.putInt(0);
                byteBufferAllocate2.put((byte) 3);
                obr.aG(iLimit + 21 < 127, "CSD too long; we might need variable-length encoding?");
                byteBufferAllocate2.put((byte) (iLimit + 23));
                byteBufferAllocate2.putShort((short) 0);
                byteBufferAllocate2.put((byte) 0);
                byteBufferAllocate2.put((byte) 4);
                byteBufferAllocate2.put((byte) (iLimit + 15));
                byteBufferAllocate2.put((byte) 64);
                byteBufferAllocate2.put((byte) 21);
                byteBufferAllocate2.putShort((short) 3);
                byteBufferAllocate2.put((byte) 0);
                byteBufferAllocate2.putInt(mediaFormat.getInteger("max-bitrate"));
                byteBufferAllocate2.putInt(mediaFormat.getInteger("bitrate"));
                byteBufferAllocate2.put((byte) 5);
                byteBufferAllocate2.put((byte) iLimit);
                byteBufferAllocate2.put(byteBuffer);
                byteBufferAllocate2.put((byte) 6);
                byteBufferAllocate2.put((byte) 1);
                byteBufferAllocate2.put((byte) 2);
                byteBufferAllocate.put(ax("esds", byteBufferAllocate2));
                return ax("mp4a", byteBufferAllocate);
            default:
                String strValueOf = String.valueOf(mediaFormat.getString("mime"));
                throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Unsupported audio format: ".concat(strValueOf) : new String("Unsupported audio format: "));
        }
    }

    public static /* synthetic */ String bA(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "STOPPED";
            case 4:
                return "CLOSED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String bB(int i) {
        switch (i) {
            case 1:
                return "AUDIO";
            default:
                return "VIDEO";
        }
    }

    public static boolean bC(lvs lvsVar, len lenVar) {
        int i = lenVar.e;
        boolean profilehasHfr = CamcorderProfile.getProfilehasHfr(i);
        return profilehasHfr ? profilehasHfr : android.media.CamcorderProfile.hasProfile(Integer.parseInt(lvsVar.a), i);
    }

    public static les bD(lvs lvsVar, len lenVar) {
        int i = lenVar.e;
        return (CamcorderProfile.getProfilehasHfr(i) ? CamcorderProfile.getProfileHfr(i) : les.a(android.media.CamcorderProfile.get(Integer.parseInt(lvsVar.a), i))).a();
    }

    public static les bE(lvs lvsVar, lep lepVar) {
        android.media.CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = android.media.CamcorderProfile.get(Integer.parseInt(lvsVar.a), lepVar.k);
        } catch (Throwable unused) {
            int i = 6;
            int i2 = 0;
            Application initialApplication = AppGlobals.getInitialApplication();
            if (!PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).getString("pref_video_resolution", null).equals("RES_1080P")) {
                i = 8;
                i2 = 0;
            }
            camcorderProfile = android.media.CamcorderProfile.get(i2, i);
        }
        return les.a(camcorderProfile).a();
    }

    public static int bF(int i, leb lebVar, boolean z, ojc ojcVar) {
        if (lebVar.equals(leb.RES_2160P) && i < 48000000) {
            i = 48000000;
        }
        if (z) {
            i = Math.round(i * 0.9f);
        }
        return (!ojcVar.g() || ((Integer) ojcVar.c()).intValue() <= 0) ? i : ((Integer) ojcVar.c()).intValue();
    }

    public static MediaCodec bG(lek lekVar) throws lej {
        String strB = lekVar.b();
        String strValueOf = String.valueOf(strB);
        if (strValueOf.length() != 0) {
            "create mediaCodec for".concat(strValueOf);
        } else {
            new String("create mediaCodec for");
        }
        try {
            return MediaCodec.createEncoderByType(strB);
        } catch (IOException e2) {
            throw new lej(lekVar, e2);
        }
    }

    public static /* synthetic */ String bH(int i) {
        switch (i) {
            case 1:
                return "DEFAULT";
            case 2:
                return "MIC";
            case 3:
                return "VOICE_UPLINK";
            case 4:
                return "VOICE_DOWNLINK";
            case 5:
                return "VOICE_CALL";
            case 6:
                return "CAMCORDER";
            default:
                return "null";
        }
    }

    public static lbs bI(Executor executor) {
        return new lbs(executor, new lhx() { // from class: lbn
            @Override // defpackage.lhx
            public final Object a(Object obj) {
                return (lbt) ((Deque) obj).pollLast();
            }
        });
    }

    public static ExecutorService bJ(String str) {
        lbc lbcVarA = lbd.a();
        lbcVarA.a = str;
        lbcVarA.c(0);
        return bK(lbcVarA.a());
    }

    public static ExecutorService bK(lbd lbdVar) {
        obr.aF(lbdVar.a >= 0);
        ThreadFactory threadFactoryFa = fa(lbdVar);
        int i = lbdVar.a;
        switch (i) {
            case 0:
                return Executors.newCachedThreadPool(threadFactoryFa);
            case 1:
                return Executors.newSingleThreadExecutor(threadFactoryFa);
            default:
                return Executors.newFixedThreadPool(i, threadFactoryFa);
        }
    }

    public static ExecutorService bL(String str, int i) {
        lbc lbcVarA = lbd.a();
        lbcVarA.a = str;
        lbcVarA.c(i);
        return bK(lbcVarA.a());
    }

    public static ExecutorService bM(String str) {
        lbc lbcVarA = lbd.a();
        lbcVarA.a = str;
        lbcVarA.c(1);
        return bK(lbcVarA.a());
    }

    public static RunnableScheduledFuture bN(RunnableScheduledFuture runnableScheduledFuture) {
        return new lbg(runnableScheduledFuture);
    }

    public static ScheduledExecutorService bO(lbd lbdVar) {
        obr.aF(lbdVar.a > 0);
        ThreadFactory threadFactoryFa = fa(lbdVar);
        int i = lbdVar.a;
        return !lbdVar.d ? new ScheduledThreadPoolExecutor(i, threadFactoryFa) : new lbf(i, threadFactoryFa);
    }

    public static ScheduledExecutorService bP(String str, int i) {
        lbc lbcVarA = lbd.a();
        lbcVarA.a = str;
        lbcVarA.c(i);
        return bO(lbcVarA.a());
    }

    public static ScheduledExecutorService bQ(String str) {
        lbc lbcVarA = lbd.a();
        lbcVarA.a = str;
        lbcVarA.c(1);
        return bO(lbcVarA.a());
    }

    public static ExecutorService bR(String str, int i) {
        lbc lbcVarA = lbd.a();
        lbcVarA.a = str;
        lbcVarA.c(2);
        lbcVarA.b(i);
        return bK(lbcVarA.a());
    }

    public static Executor bS() {
        return bT(new lar());
    }

    public static Executor bT(lar larVar) {
        return new lav(larVar);
    }

    public static Handler bU() {
        return new Handler();
    }

    public static Handler bV(Looper looper) {
        return new Handler(looper);
    }

    public static Handler bW(lap lapVar, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        lapVar.c(new lao(handlerThread));
        return bV(handlerThread.getLooper());
    }

    public static pht bX(pht phtVar, pht phtVar2, lhw lhwVar) {
        lal lalVar = new lal(lhwVar);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(phtVar);
        arrayList.add(phtVar2);
        return pgb.i(plk.R(arrayList), new lai(lalVar, 1), pgr.INSTANCE);
    }

    public static Object bY(pht phtVar) {
        Object obj;
        if (!phtVar.isDone() || phtVar.isCancelled()) {
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = phtVar.get();
                break;
            } catch (InterruptedException e2) {
                z = true;
            } catch (ExecutionException e3) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return null;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void bZ(pht phtVar, lht lhtVar) {
        ca(phtVar, lhtVar, pgr.INSTANCE);
    }

    public static lnz ba(lvs lvsVar, lig ligVar) {
        lny lnyVarA = lnz.a();
        lnyVarA.h(loa.SURFACE_TEXTURE);
        lnyVarA.b(lvsVar);
        lnyVarA.g(ligVar);
        return lnyVarA.a();
    }

    public static lnz bb(lvs lvsVar, lig ligVar) {
        lny lnyVarA = lnz.a();
        lnyVarA.h(loa.SURFACE_VIEW);
        lnyVarA.b(lvsVar);
        lnyVarA.g(ligVar);
        return lnyVarA.a();
    }

    public static /* synthetic */ String bc(int i) {
        switch (i) {
            case 1:
                return "ANY";
            case 2:
                return "IMMEDIATE_LOCKED";
            case 3:
                return "CONVERGED";
            case 4:
                return "LOCKED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ void bd(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static lnq be(CaptureRequest.Key key, Object obj) {
        return new lnq(key, obj);
    }

    public static Set bf(Iterable iterable) {
        opc opcVarD = ope.D();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            opcVarD.d(((CaptureRequest.Key) it.next()).getName());
        }
        return opcVarD.f();
    }

    public static void bg(lmr lmrVar, lnn lnnVar) {
        lmrVar.j(new lni(lnnVar, lmrVar));
    }

    public static void bh(lmr lmrVar) {
        if (lmrVar.e() || lmrVar.f()) {
            return;
        }
        lnl lnlVar = new lnl();
        lmrVar.j(lnlVar);
        lnlVar.w();
    }

    public static void bi(lmr lmrVar) {
        if (lmrVar.e() || lmrVar.h() || lmrVar.f()) {
            return;
        }
        lnk lnkVar = new lnk();
        lmrVar.j(lnkVar);
        lnkVar.w();
    }

    public static void bj(lrr lrrVar, lnn lnnVar) {
        lmr lmrVarA = lrrVar.a();
        if (lmrVarA != null) {
            bg(lmrVarA, lnnVar);
        }
    }

    public static boolean bk(short s) {
        return ((s & (-16)) != -64 || s == -60 || s == -56 || s == -52) ? false : true;
    }

    public static String bl(long j) {
        return eZ(j % 1000, 3);
    }

    public static String bm(long j) {
        return eZ(j, 2);
    }

    public static void bn(ljf ljfVar, String str, Runnable runnable) {
        try {
            ljfVar.e(str);
            runnable.run();
        } finally {
            ljfVar.f();
        }
    }

    public static String bo() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < stackTrace.length; i++) {
            sb.append("\t");
            sb.append(stackTrace[i]);
            sb.append('\n');
        }
        return sb.toString();
    }

    public static String bp(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static Size bq(lig ligVar) {
        return new Size(ligVar.a, ligVar.b);
    }

    public static lig br(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("x");
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            return new lig(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    public static lig bs(List list) {
        obr.aQ(!list.isEmpty());
        return (lig) Collections.max(list, yc.b);
    }

    public static String bt(lig ligVar) {
        int i = ligVar.a;
        int i2 = ligVar.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    public static List bu(Size[] sizeArr) {
        if (sizeArr == null) {
            return oom.l();
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            if (size != null) {
                arrayList.add(new lig(size.getWidth(), size.getHeight()));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ int bv(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public static String bw(lvs lvsVar) {
        lvsVar.getClass();
        String str = lvsVar.a;
        str.getClass();
        return str;
    }

    public static /* synthetic */ String bx(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "CLOSED";
            case 4:
                return "PAUSED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String by(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "CLOSED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String bz(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "STOPPED";
            case 4:
                return "CLOSED";
            case 5:
                return "PAUSED";
            default:
                return "null";
        }
    }

    public static void cA(Parcel parcel, int i, int i2) {
        cz(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void cB(Parcel parcel, int i, long j) {
        cz(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void cC(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeBundle(bundle);
        cv(parcel, iCu);
    }

    public static void cD(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeByteArray(bArr);
        cv(parcel, iCu);
    }

    public static void cE(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        cv(parcel, iCu);
    }

    public static void cF(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeStrongBinder(iBinder);
        cv(parcel, iCu);
    }

    public static void cG(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeIntArray(iArr);
        cv(parcel, iCu);
    }

    public static void cH(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        cv(parcel, iCu);
    }

    public static void cI(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeString(str);
        cv(parcel, iCu);
    }

    public static void cJ(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeStringArray(strArr);
        cv(parcel, iCu);
    }

    public static void cK(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeStringList(list);
        cv(parcel, iCu);
    }

    public static void cL(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iCu = cu(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                fc(parcel, parcelable, i2);
            }
        }
        cv(parcel, iCu);
    }

    public static void cM(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iCu = cu(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                fc(parcel, parcelable, 0);
            }
        }
        cv(parcel, iCu);
    }

    public static byte cN(Parcel parcel, int i) {
        dc(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static float cO(Parcel parcel, int i) {
        dc(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int cP(int i) {
        return (char) i;
    }

    public static int cQ(Parcel parcel) {
        return parcel.readInt();
    }

    public static int cR(Parcel parcel, int i) {
        dc(parcel, i, 4);
        return parcel.readInt();
    }

    public static int cS(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int cT(Parcel parcel) {
        int i = parcel.readInt();
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (cP(i) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(i));
            throw new knp(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = iCS + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new knp(sb.toString(), parcel);
    }

    public static long cU(Parcel parcel, int i) {
        dc(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle cV(Parcel parcel, int i) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iCS);
        return bundle;
    }

    public static IBinder cW(Parcel parcel, int i) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iCS);
        return strongBinder;
    }

    public static Parcelable cX(Parcel parcel, int i, Parcelable.Creator creator) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iCS);
        return parcelable;
    }

    public static String cY(Parcel parcel, int i) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iCS);
        return string;
    }

    public static ArrayList cZ(Parcel parcel, int i) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iCS);
        return arrayListCreateStringArrayList;
    }

    public static void ca(pht phtVar, lht lhtVar, Executor executor) {
        plk.af(phtVar, new laj(lhtVar), executor);
    }

    public static void cb(pht phtVar, pht phtVar2, lak lakVar, Executor executor) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(phtVar);
        arrayList.add(phtVar2);
        pgb.i(plk.R(arrayList), new lai(lakVar, 0), executor);
    }

    public static Status cc(int i) {
        String strDF;
        switch (i) {
            case 4000:
                strDF = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                strDF = "DUPLICATE_LISTENER";
                break;
            case 4002:
                strDF = "UNKNOWN_LISTENER";
                break;
            case 4003:
                strDF = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                strDF = "INVALID_TARGET_NODE";
                break;
            case 4005:
                strDF = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                strDF = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                strDF = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                strDF = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                strDF = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                strDF = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            default:
                strDF = dF(i);
                break;
        }
        return new Status(i, strDF);
    }

    public static Object cd(kvk kvkVar, long j, TimeUnit timeUnit) throws TimeoutException {
        if (cn()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        du(timeUnit, "TimeUnit must not be null");
        if (kvkVar.d()) {
            return fb(kvkVar);
        }
        kvq kvqVar = new kvq();
        kvkVar.i(kvo.b, kvqVar);
        kvkVar.h(kvo.b, kvqVar);
        kvp kvpVar = (kvp) kvkVar;
        kvpVar.f.c(new kuz(kvo.b, kvqVar));
        kvpVar.j();
        if (kvqVar.a.await(j, timeUnit)) {
            return fb(kvkVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static boolean ce(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static PendingIntent cf(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }

    public static String[] cg(ArrayList arrayList) {
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void ch(kpb kpbVar) {
        if (((Boolean) kpj.c.a()).booleanValue()) {
            Parcel parcelObtain = Parcel.obtain();
            kpc.a(kpbVar, parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            if (iDataSize <= ((Integer) kpj.b.a()).intValue()) {
                return;
            }
            String strValueOf = String.valueOf(kpj.b.a());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
            sb.append("Max allowed feedback options size of ");
            sb.append(strValueOf);
            sb.append(" exceeded, you are passing in feedback options of ");
            sb.append(iDataSize);
            sb.append(" size.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static kpb ci(kpa kpaVar) {
        dk(kpaVar.d.crashInfo.exceptionClassName);
        dk(kpaVar.d.crashInfo.throwClassName);
        dk(kpaVar.d.crashInfo.throwMethodName);
        dk(kpaVar.d.crashInfo.stackTrace);
        if (TextUtils.isEmpty(kpaVar.d.crashInfo.throwFileName)) {
            kpaVar.d.crashInfo.throwFileName = "unknown";
        }
        kpb kpbVarA = kpaVar.a();
        kpbVarA.d.crashInfo = kpaVar.d.crashInfo;
        kpbVarA.g = null;
        return kpbVarA;
    }

    public static koq cj(Context context, kop kopVar) {
        koq koqVar = new koq();
        int iB = kopVar.b(context);
        koqVar.b = iB;
        if (iB != 0) {
            koqVar.c = 1;
        } else {
            int iA = kopVar.a(context);
            koqVar.a = iA;
            if (iA != 0) {
                koqVar.c = -1;
            }
        }
        return koqVar;
    }

    public static synchronized boolean ck(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f13a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        b = boolValueOf;
        f13a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static boolean cl(Context context, int i) {
        if (!cm(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            khx khxVarA = khx.a(context);
            if (packageInfo == null) {
                return false;
            }
            if (khx.c(packageInfo, false)) {
                return true;
            }
            if (!khx.c(packageInfo, true)) {
                return false;
            }
            if (khw.b(khxVarA.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    public static boolean cm(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) koe.b(context).a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException e2) {
            return false;
        }
    }

    public static boolean cn() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static int co(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static boolean cp(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (c == null) {
            c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return c.booleanValue();
    }

    public static void cq(Context context) {
        if (cp(context)) {
            if (d == null) {
                d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            d.booleanValue();
        }
    }

    public static boolean cr(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean cs(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (dx(objArr[i], obj)) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int ct(Parcel parcel) {
        return cu(parcel, 20293);
    }

    public static int cu(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void cv(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void cw(Parcel parcel, int i, boolean z) {
        cz(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void cx(Parcel parcel, int i, byte b2) {
        cz(parcel, i, 4);
        parcel.writeInt(b2);
    }

    public static void cy(Parcel parcel, int i, float f2) {
        cz(parcel, i, 4);
        parcel.writeFloat(f2);
    }

    public static void cz(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static kig dA(Status status) {
        return status.i != null ? new kit(status) : new kig(status);
    }

    public static void dB(Status status, kvm kvmVar) {
        dC(status, null, kvmVar);
    }

    public static void dC(Status status, Object obj, kvm kvmVar) {
        if (status.b()) {
            kvmVar.b(obj);
        } else {
            kvmVar.a(new kig(status));
        }
    }

    public static kkt dD(Object obj, Looper looper, String str) {
        du(looper, "Looper must not be null");
        du(str, "Listener type must not be null");
        return new kkt(looper, obj, str);
    }

    public static kin dE(kiv kivVar, kim kimVar) {
        kir kirVar = new kir(kimVar);
        kirVar.j(kivVar);
        return new kin(kirVar);
    }

    public static String dF(int i) {
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static long dG(byte[] bArr) {
        int length = bArr.length;
        int i = 37;
        char c2 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = ((long) (length + length)) - 7286425919675154353L;
                long jFf = ff(bArr, 0) * (-5435081209227447693L);
                long jFf2 = ff(bArr, 8);
                long jFf3 = ff(bArr, length - 8) * j;
                return fe(Long.rotateRight(jFf + jFf2, 43) + Long.rotateRight(jFf3, 30) + (ff(bArr, length - 16) * (-7286425919675154353L)), jFf + Long.rotateRight(jFf2 - 7286425919675154353L, 18) + jFf3, j);
            }
            if (length >= 8) {
                long j2 = ((long) (length + length)) - 7286425919675154353L;
                long jFf4 = ff(bArr, 0) - 7286425919675154353L;
                long jFf5 = ff(bArr, length - 8);
                return fe((Long.rotateRight(jFf5, 37) * j2) + jFf4, (Long.rotateRight(jFf4, 25) + jFf5) * j2, j2);
            }
            if (length >= 4) {
                return fe(((long) length) + ((((long) fd(bArr, 0)) & 4294967295L) << 3), ((long) fd(bArr, length - 4)) & 4294967295L, ((long) (length + length)) - 7286425919675154353L);
            }
            if (length > 0) {
                return (-7286425919675154353L) * fg((((long) ((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (length + ((bArr[length - 1] & 255) << 2))) * (-4348849565147123417L)));
            }
            return -7286425919675154353L;
        }
        if (length <= 64) {
            long j3 = ((long) (length + length)) - 7286425919675154353L;
            long jFf6 = ff(bArr, 0) * (-7286425919675154353L);
            long jFf7 = ff(bArr, 8);
            long jFf8 = ff(bArr, length - 8) * j3;
            long jRotateRight = Long.rotateRight(jFf6 + jFf7, 43) + Long.rotateRight(jFf8, 30) + (ff(bArr, length - 16) * (-7286425919675154353L));
            long jRotateRight2 = Long.rotateRight(jFf7 - 7286425919675154353L, 18);
            long jFf9 = ff(bArr, 16) * j3;
            long jFf10 = ff(bArr, 24);
            long jFf11 = (jRotateRight + ff(bArr, length - 32)) * j3;
            return fe(Long.rotateRight(jFf9 + jFf10, 43) + Long.rotateRight(jFf11, 30) + ((fe(jRotateRight, jRotateRight2 + jFf6 + jFf8, j3) + ff(bArr, length - 24)) * j3), jFf9 + Long.rotateRight(jFf10 + jFf6, 18) + jFf11, j3);
        }
        long jFg = fg(-7956866745689871395L) * (-7286425919675154353L);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jFf12 = ff(bArr, 0) + 95310865018149119L;
        int i2 = length - 1;
        int i3 = (i2 >> 6) * 64;
        int i4 = i2 & 63;
        int i5 = (i3 + i4) - 63;
        long j4 = 2480279821605975764L;
        int i6 = 0;
        while (true) {
            long jRotateRight3 = Long.rotateRight(jFf12 + j4 + jArr[c2] + ff(bArr, i6 + 8), i);
            long jRotateRight4 = Long.rotateRight(j4 + jArr[1] + ff(bArr, i6 + 48), 42);
            long j5 = (jRotateRight3 * (-5435081209227447693L)) ^ jArr2[1];
            long jFf13 = (jRotateRight4 * (-5435081209227447693L)) + jArr[c2] + ff(bArr, i6 + 40);
            long jRotateRight5 = Long.rotateRight(jFg + jArr2[c2], 33) * (-5435081209227447693L);
            long j6 = jArr[1] * (-5435081209227447693L);
            long j7 = j5 + jArr2[c2];
            int i7 = i4;
            int i8 = i3;
            fh(bArr, i6, j6, j7, jArr);
            fh(bArr, i6 + 32, jRotateRight5 + jArr2[1], ff(bArr, i6 + 16) + jFf13, jArr2);
            int i9 = i6 + 64;
            if (i9 == i8) {
                long j8 = j5 & 255;
                long j9 = (-5435081209227447693L) + j8 + j8;
                long j10 = jArr2[0] + ((long) i7);
                long j11 = jArr[0] + j10;
                jArr[0] = j11;
                jArr2[0] = j10 + j11;
                long jRotateRight6 = Long.rotateRight(jRotateRight5 + jFf13 + j11 + ff(bArr, i5 + 8), 37);
                long jRotateRight7 = Long.rotateRight(jFf13 + jArr[1] + ff(bArr, i5 + 48), 42);
                long j12 = (jRotateRight6 * j9) ^ (jArr2[1] * 9);
                long jFf14 = (jRotateRight7 * j9) + (jArr[0] * 9) + ff(bArr, i5 + 40);
                long jRotateRight8 = Long.rotateRight(j5 + jArr2[0], 33) * j9;
                fh(bArr, i5, jArr[1] * j9, jArr2[0] + j12, jArr);
                fh(bArr, i5 + 32, jRotateRight8 + jArr2[1], ff(bArr, i5 + 16) + jFf14, jArr2);
                return fe(fe(jArr[0], jArr2[0], j9) + (fg(jFf14) * (-4348849565147123417L)) + j12, fe(jArr[1], jArr2[1], j9) + jRotateRight8, j9);
            }
            i6 = i9;
            i4 = i7;
            i3 = i8;
            jFg = j5;
            jFf12 = jRotateRight5;
            c2 = 0;
            j4 = jFf13;
            i = 37;
        }
    }

    public static kfq dH(Context context, GoogleSignInOptions googleSignInOptions) {
        dk(googleSignInOptions);
        return new kfq(context, googleSignInOptions);
    }

    public static boolean dI(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            return receiverInfo != null && receiverInfo.enabled && (!z || receiverInfo.exported);
        } catch (PackageManager.NameNotFoundException e2) {
        }
    }

    public static kew dJ(int i, kev kevVar, kdt kdtVar) {
        try {
            return fi(kdtVar.b.b.getResources().getXml(i), kevVar, kdtVar);
        } catch (Resources.NotFoundException e2) {
            kdtVar.u("inflate() called with unknown resourceId", e2);
            return null;
        }
    }

    public static int dK(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 27:
            case 28:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
            case 112:
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case ScriptIntrinsicBLAS.NON_UNIT /* 131 */:
            case 137:
            case 138:
            case 139:
            case 140:
            case 144:
            case 147:
            case 149:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 181:
            case 190:
            case 191:
            case 192:
            case 193:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 201:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 222:
            case 224:
            case 225:
            case 226:
            case 229:
            case 230:
            case 234:
            case 235:
            case 236:
            case 237:
            case 252:
            case 257:
            case 258:
            case 272:
            case 274:
            case 275:
            default:
                return 0;
            case 7:
                return 7;
            case 14:
                return 14;
            case 16:
                return 16;
            case 18:
                return 18;
            case 24:
                return 24;
            case 26:
                return 26;
            case 29:
                return 29;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 30;
            case 32:
                return 32;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return 33;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 35;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return 38;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return 39;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return 42;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return 43;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return 44;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return 47;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return 48;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return 49;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return 51;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return 57;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return 58;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return 60;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return 63;
            case 64:
                return 64;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                return 67;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return 68;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return 72;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return 74;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                return 76;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                return 77;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return 78;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                return 79;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                return 82;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                return 84;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return 85;
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return 88;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return 94;
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return 95;
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                return 96;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return 97;
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                return 98;
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return 99;
            case R.styleable.AppCompatTheme_spinnerStyle /* 100 */:
                return 100;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                return R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return R.styleable.AppCompatTheme_textAppearanceListItem;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                return R.styleable.AppCompatTheme_textAppearanceListItemSmall;
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                return R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return R.styleable.AppCompatTheme_textColorAlertDialogListItem;
            case 111:
                return 111;
            case 113:
                return 113;
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return R.styleable.AppCompatTheme_tooltipFrameBackground;
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                return R.styleable.AppCompatTheme_viewInflaterClass;
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return R.styleable.AppCompatTheme_windowActionBar;
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                return R.styleable.AppCompatTheme_windowActionBarOverlay;
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return R.styleable.AppCompatTheme_windowActionModeOverlay;
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                return R.styleable.AppCompatTheme_windowFixedHeightMajor;
            case 121:
                return 121;
            case 122:
                return 122;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return R.styleable.AppCompatTheme_windowFixedWidthMinor;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case ScriptIntrinsicBLAS.UNIT /* 132 */:
                return ScriptIntrinsicBLAS.UNIT;
            case 133:
                return 133;
            case 134:
                return 134;
            case 135:
                return 135;
            case 136:
                return 136;
            case ScriptIntrinsicBLAS.LEFT /* 141 */:
                return ScriptIntrinsicBLAS.LEFT;
            case ScriptIntrinsicBLAS.RIGHT /* 142 */:
                return ScriptIntrinsicBLAS.RIGHT;
            case 143:
                return 143;
            case 145:
                return 145;
            case 146:
                return 146;
            case 148:
                return 148;
            case 150:
                return 150;
            case 151:
                return 151;
            case 152:
                return 152;
            case 153:
                return 153;
            case 154:
                return 154;
            case 180:
                return 180;
            case 182:
                return 182;
            case 183:
                return 183;
            case 184:
                return 184;
            case 185:
                return 185;
            case 186:
                return 186;
            case 187:
                return 187;
            case 188:
                return 188;
            case 189:
                return 189;
            case 194:
                return 194;
            case 200:
                return 200;
            case 202:
                return 202;
            case 203:
                return 203;
            case 204:
                return 204;
            case 205:
                return 205;
            case 206:
                return 206;
            case 218:
                return 218;
            case 219:
                return 219;
            case 220:
                return 220;
            case 221:
                return 221;
            case 223:
                return 223;
            case 227:
                return 227;
            case 228:
                return 228;
            case 231:
                return 231;
            case 232:
                return 232;
            case 233:
                return 233;
            case 238:
                return 238;
            case 239:
                return 239;
            case 240:
                return 240;
            case 241:
                return 241;
            case 242:
                return 242;
            case 243:
                return 243;
            case 244:
                return 244;
            case 245:
                return 245;
            case 246:
                return 246;
            case 247:
                return 247;
            case 248:
                return 248;
            case 249:
                return 249;
            case 250:
                return 250;
            case 251:
                return 251;
            case 253:
                return 253;
            case 254:
                return 254;
            case 255:
                return 255;
            case 256:
                return 256;
            case 259:
                return 259;
            case 260:
                return 260;
            case 261:
                return 261;
            case 262:
                return 262;
            case 263:
                return 263;
            case 264:
                return 264;
            case 265:
                return 265;
            case 266:
                return 266;
            case 267:
                return 267;
            case 268:
                return 268;
            case 269:
                return 269;
            case 270:
                return 270;
            case 271:
                return 271;
            case 273:
                return 273;
            case 276:
                return 276;
            case 277:
                return 277;
            case 278:
                return 278;
            case 279:
                return 279;
            case 280:
                return 280;
            case 281:
                return 281;
            case 282:
                return 282;
            case 283:
                return 283;
            case 284:
                return 284;
            case 285:
                return 285;
            case 286:
                return 286;
            case 287:
                return 287;
            case 288:
                return 288;
            case 289:
                return 289;
            case 290:
                return 290;
            case 291:
                return 291;
            case 292:
                return 292;
            case 293:
                return 293;
            case 294:
                return 294;
            case 295:
                return 295;
            case 296:
                return 296;
            case 297:
                return 297;
            case 298:
                return 298;
            case 299:
                return 299;
            case 300:
                return 300;
            case 301:
                return 301;
            case 302:
                return 302;
            case 303:
                return 303;
            case 304:
                return 304;
            case 305:
                return 305;
            case 306:
                return 306;
            case 307:
                return 307;
            case 308:
                return 308;
            case 309:
                return 309;
            case 310:
                return 310;
            case 311:
                return 311;
            case 312:
                return 312;
            case 313:
                return 313;
            case 314:
                return 314;
            case 315:
                return 315;
            case 316:
                return 316;
            case 317:
                return 317;
            case 318:
                return 318;
            case 319:
                return 319;
            case 320:
                return 320;
            case 321:
                return 321;
            case 322:
                return 322;
            case 323:
                return 323;
            case 324:
                return 324;
            case 325:
                return 325;
        }
    }

    public static String dL(jws jwsVar) {
        return jwsVar.a().name();
    }

    public static String dM(long j) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L);
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        return hours > 0 ? String.format("%1d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format("%1d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    public static int dN(View view) {
        return obr.e(view, com.google.android.GoogleCameraEngR18F1.R.attr.colorOnPrimaryContainer);
    }

    public static int dO(View view) {
        return obr.e(view, com.google.android.GoogleCameraEngR18F1.R.attr.colorOnSurfaceVariant);
    }

    public static int dP(View view) {
        return obr.e(view, com.google.android.GoogleCameraEngR18F1.R.attr.colorOnTertiaryContainer);
    }

    public static int dQ(View view) {
        return obr.e(view, android.R.attr.colorPrimary);
    }

    public static int dR(View view) {
        return obr.e(view, com.google.android.GoogleCameraEngR18F1.R.attr.colorPrimaryContainer);
    }

    public static int dS(View view) {
        return obr.e(view, com.google.android.GoogleCameraEngR18F1.R.attr.colorSecondary);
    }

    public static int dT(View view) {
        return aH(com.google.android.GoogleCameraEngR18F1.R.dimen.gm_sys_elevation_level1, view.getContext());
    }

    public static int dU(View view) {
        return obr.e(view, com.google.android.GoogleCameraEngR18F1.R.attr.colorTertiaryContainer);
    }

    public static int dV(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static float dW(long j) {
        return j / 1000.0f;
    }

    public static int dX(double d2) {
        return (int) (d2 * 1000.0d);
    }

    public static int dY(long j) {
        return (int) (j / 1000);
    }

    public static int dZ(int i) {
        return i * 1000;
    }

    public static ArrayList da(Parcel parcel, int i, Parcelable.Creator creator) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iCS);
        return arrayListCreateTypedArrayList;
    }

    public static void db(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new knp(sb.toString(), parcel);
    }

    public static void dc(Parcel parcel, int i, int i2) {
        int iCS = cS(parcel, i);
        if (iCS == i2) {
            return;
        }
        String hexString = Integer.toHexString(iCS);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iCS);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new knp(sb.toString(), parcel);
    }

    public static void dd(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + cS(parcel, i));
    }

    public static boolean de(Parcel parcel, int i) {
        dc(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] df(Parcel parcel, int i) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iCS);
        return bArrCreateByteArray;
    }

    public static int[] dg(Parcel parcel, int i) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iCS);
        return iArrCreateIntArray;
    }

    public static Object[] dh(Parcel parcel, int i, Parcelable.Creator creator) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iCS);
        return objArrCreateTypedArray;
    }

    public static String[] di(Parcel parcel, int i) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iCS);
        return strArrCreateStringArray;
    }

    public static byte[][] dj(Parcel parcel, int i) {
        int iCS = cS(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iCS == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iCS);
        return bArr;
    }

    public static Object dk(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static void dl(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void dm(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void dn(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static void m84do(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void dp(String str) {
        if (!cn()) {
            throw new IllegalStateException(str);
        }
    }

    public static void dq(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void dr(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void ds(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void dt(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void du(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static kvk dv(kip kipVar, knh knhVar) {
        kvm kvmVar = new kvm();
        kipVar.l(new knf(kipVar, kvmVar, knhVar));
        return kvmVar.a;
    }

    public static kvk dw(kip kipVar) {
        return dv(kipVar, new kng(0));
    }

    public static boolean dx(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String dy(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void dz(String str, Object obj, List list) {
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(strValueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        list.add(sb.toString());
    }

    public static lie eA(final jlb jlbVar) {
        jlbVar.F(true);
        return new lie() { // from class: jla
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                jlbVar.F(false);
            }
        };
    }

    public static jku eB(jkc jkcVar, List list) {
        jku jkuVar = new jku(jkcVar);
        list.add(jkuVar);
        return jkuVar;
    }

    public static jce eC(Context context, Display display) {
        Activity activity = (Activity) context;
        if (activity.isInMultiWindowMode()) {
            WindowMetrics maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
            Size size = new Size(maximumWindowMetrics.getBounds().width(), maximumWindowMetrics.getBounds().height());
            return fl(context, display, size.getWidth(), size.getHeight()).getWidth() > 600 ? jce.PHONE_LAYOUT : jce.SIMPLIFIED_LAYOUT;
        }
        Size sizeFl = fl(context, display, context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        if (sizeFl.getHeight() < 600) {
            return jce.SIMPLIFIED_LAYOUT;
        }
        return sizeFl.getWidth() > 600 ? jce.TABLET_LAYOUT : jce.PHONE_LAYOUT;
    }

    public static boolean eD(Context context, Display display) {
        return eC(context, display).equals(jce.SIMPLIFIED_LAYOUT);
    }

    public static jbf eE() {
        return new jbf(1, oih.a);
    }

    public static float eF(float f2) {
        return f2 * 0.0624f;
    }

    public static boolean eG(ddf ddfVar) {
        return ddfVar.k(deg.a);
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public static leb eH(cvo cvoVar, ddf ddfVar, cpj cpjVar, cpp cppVar) {
        ddfVar.k(deg.c);
        ddfVar.k(deg.d);
        return ddfVar.k(ddv.b) ? cppVar.a(cvoVar.d()) : cpjVar.a(cvoVar.d());
    }

    public static lne eI(lvp lvpVar, ldz ldzVar, Set set) {
        lnq lnqVarBe = be(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(ldzVar.i), Integer.valueOf(ldzVar.i)));
        lne lneVarA = lnf.a();
        lneVarA.g(lnp.NORMAL);
        lneVarA.c = new lnt(1, oom.m(lnqVarBe));
        lneVarA.i(new lnt(3, oom.m(lnqVarBe)));
        HashSet hashSet = new HashSet(set);
        hashSet.add(lnqVarBe);
        fvq.w(hashSet, lneVarA, lvpVar);
        return lneVarA;
    }

    public static lnq eJ(int i) {
        return be(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(i));
    }

    public static lnq eK(int i) {
        return be(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(i));
    }

    public static Set eL(Rect rect, float f2) {
        HashSet hashSet = new HashSet();
        hashSet.add(be(CaptureRequest.SCALER_CROP_REGION, rect));
        hashSet.add(be(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(f2)));
        return hashSet;
    }

    public static Integer eM(ddf ddfVar) {
        return (Integer) ddfVar.a(def.j).c();
    }

    public static int eN(hsr hsrVar) {
        hsr hsrVar2 = hsr.UNKNOWN;
        switch (hsrVar.ordinal()) {
            case 0:
                return 1;
            case 1:
            case 7:
                return 2;
            case 2:
            case 3:
                return 8;
            case 4:
                return 18;
            case 5:
                return 12;
            case 6:
                return 6;
            case 8:
                return 20;
            case 9:
            case 17:
                return 9;
            case 10:
                return 22;
            case 11:
                return 23;
            case 12:
                return 29;
            case 13:
                return 11;
            case 14:
            case 18:
                return 32;
            case 15:
                return 35;
            case 16:
                return 36;
            default:
                return 1;
        }
    }

    public static iib eO(final String str) {
        return new iib() { // from class: ihy
            @Override // defpackage.iib
            public final lie a() {
                final String str2 = str;
                if (str2.length() != 0) {
                    "Entering scope: ".concat(str2);
                } else {
                    new String("Entering scope: ");
                }
                return new lie() { // from class: ihz
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        String str3 = str2;
                        if (str3.length() != 0) {
                            "Exiting scope: ".concat(str3);
                        } else {
                            new String("Exiting scope: ");
                        }
                    }
                };
            }
        };
    }

    public static void eP(ihs ihsVar) {
        ihsVar.h();
    }

    public static void eQ(ihv ihvVar) {
        ihvVar.e();
    }

    public static iho eR(Runnable runnable) {
        runnable.getClass();
        return new ihq(runnable);
    }

    public static void eS(final qkg qkgVar, final Executor executor) {
        executor.execute(new Runnable() { // from class: ihp
            @Override // java.lang.Runnable
            public final void run() {
                qkg qkgVar2 = qkgVar;
                Executor executor2 = executor;
                Iterator it = ((pyw) qkgVar2).get().iterator();
                while (it.hasNext()) {
                    executor2.execute((iho) it.next());
                }
            }
        });
    }

    public static void eT(mad madVar, lzv lzvVar, hzq hzqVar, ojc ojcVar, iar iarVar) {
        gaz gazVar = (gaz) ojcVar.c();
        lzvVar.getClass();
        ger gerVarA = gazVar.a(lzvVar, 0);
        madVar.getClass();
        hzqVar.b.b(madVar, gerVarA, new gep(lig.h(madVar.c() / 2, madVar.b() / 2), 0, 1, 3L), new hzp(madVar, iarVar));
    }

    public static List eU(List list, String str) {
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length == 0) {
            return list;
        }
        HashSet hashSet = new HashSet(obr.aj(strArrSplit));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lig ligVar = (lig) it.next();
            if (!eV(ligVar, hashSet)) {
                arrayList.add(ligVar);
            }
        }
        return arrayList;
    }

    public static boolean eV(lig ligVar, Set set) {
        int i = ligVar.a;
        int i2 = ligVar.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return set.contains(sb.toString());
    }

    private static String eW(double d2) {
        return (d2 > 9.999999999E9d || d2 < -9.99999999E8d) ? String.format(Locale.ROOT, "%.6e", Double.valueOf(d2)) : String.format(Locale.ROOT, "%.4f", Double.valueOf(d2));
    }

    private static ByteBuffer eX(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        return byteBufferDuplicate.slice();
    }

    private static Object eY(mjf... mjfVarArr) {
        for (mjf mjfVar : mjfVarArr) {
            Object objA = mjfVar.a();
            if (objA != null) {
                return objA;
            }
        }
        return null;
    }

    private static String eZ(long j, int i) {
        return obr.ax(Long.toString(j), i);
    }

    public static long ea(int i) {
        return ((long) i) * 1000000;
    }

    public static long eb(long j) {
        return j / 1000000;
    }

    public static juj ec(juk jukVar) {
        return new juj(jukVar);
    }

    public static juj ed(int i) {
        return new juj(new jul(i));
    }

    public static void ee(float[] fArr, jua juaVar) {
        double dCos;
        obr.aF(fArr.length == 3);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = (f2 * f2) + (f3 * f3) + (f4 * f4);
        if (f5 > 0.0f) {
            double dSqrt = Math.sqrt(f5);
            double d2 = 0.5d * dSqrt;
            double dSin = Math.sin(d2) / dSqrt;
            double d3 = f2;
            Double.isNaN(d3);
            juaVar.a = d3 * dSin;
            double d4 = f3;
            Double.isNaN(d4);
            juaVar.b = d4 * dSin;
            double d5 = f4;
            Double.isNaN(d5);
            juaVar.c = d5 * dSin;
            dCos = Math.cos(d2);
        } else {
            double d6 = f2;
            Double.isNaN(d6);
            juaVar.a = d6 * 0.5d;
            double d7 = f3;
            Double.isNaN(d7);
            juaVar.b = d7 * 0.5d;
            double d8 = f4;
            Double.isNaN(d8);
            juaVar.c = d8 * 0.5d;
            dCos = 1.0d;
        }
        juaVar.d = dCos;
    }

    public static int ef(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(13)) {
            return 1;
        }
        return !connectivityManager.isActiveNetworkMetered() ? 3 : 2;
    }

    public static ojc eg(PackageManager packageManager, Intent intent, boolean z) {
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 851968);
        if (resolveInfoResolveActivity == null) {
            return oih.a;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        if (activityInfo.name == null || !activityInfo.name.endsWith("ResolverActivity")) {
            return ojc.i(resolveInfoResolveActivity.activityInfo.applicationInfo);
        }
        if (z) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 851968);
            ojc ojcVarI = oih.a;
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if ((resolveInfo.activityInfo.applicationInfo.flags & 1) != 0) {
                    if (!ojcVarI.g()) {
                        ojcVarI = ojc.i(resolveInfo.activityInfo.applicationInfo);
                    }
                }
            }
            return ojcVarI;
        }
        return oih.a;
    }

    public static boolean eh(lzh lzhVar, lzi lziVar) {
        if (!lzhVar.g || Build.ID.startsWith("RQ2")) {
            return false;
        }
        return (lziVar.e() && (Build.ID.startsWith("RP1") || Build.ID.startsWith("RD1"))) ? false : true;
    }

    public static Object ei(Class cls, final ope opeVar) {
        if (opeVar == null || opeVar.isEmpty()) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: jtg
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
                oti otiVarListIterator = opeVar.listIterator();
                while (otiVarListIterator.hasNext()) {
                    method.invoke(otiVarListIterator.next(), objArr);
                }
                return null;
            }
        }));
    }

    public static /* bridge */ /* synthetic */ jsk ej(Animator animator) {
        animator.getClass();
        return new jsm(animator);
    }

    public static Point ek(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static Point el(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static Collection em(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList.add(viewGroup.getChildAt(i));
        }
        return arrayList;
    }

    public static boolean en(View view) {
        if (view == null) {
            return false;
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        Rect privacyIndicatorBounds = rootWindowInsets != null ? rootWindowInsets.getPrivacyIndicatorBounds() : null;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return privacyIndicatorBounds != null && Rect.intersects(privacyIndicatorBounds, new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight()));
    }

    public static boolean eo(PointF pointF, View view) {
        int[] iArrE = jsa.e(view.getRootView());
        float f2 = pointF.x + iArrE[0];
        float f3 = pointF.y + iArrE[1];
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return f2 >= ((float) iArr[0]) && f2 <= ((float) (iArr[0] + view.getWidth())) && f3 >= ((float) iArr[1]) && f3 <= ((float) (iArr[1] + view.getHeight()));
    }

    public static void ep(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public static int eq(jrz jrzVar) {
        jrz jrzVar2;
        if (jrz.b(jrzVar)) {
            return 0;
        }
        switch (jrzVar) {
            case PORTRAIT:
                jrzVar2 = jrz.REVERSE_PORTRAIT;
                break;
            case LANDSCAPE:
                jrzVar2 = jrz.REVERSE_LANDSCAPE;
                break;
            case REVERSE_LANDSCAPE:
                jrzVar2 = jrz.LANDSCAPE;
                break;
            case REVERSE_PORTRAIT:
                jrzVar2 = jrz.PORTRAIT;
                break;
            default:
                String strValueOf = String.valueOf(jrzVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
                sb.append("unsupported orientation: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
        return jrzVar2.e;
    }

    public static ValueAnimator er(View view, jrz jrzVar) {
        view.getClass();
        float fEq = eq(jrzVar);
        float fAbs = Math.abs(fj(view.getRotation()) - fj(fEq));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION, view.getRotation(), fj(fEq));
        objectAnimatorOfFloat.setInterpolator(new adt());
        objectAnimatorOfFloat.setDuration(fAbs <= 90.0f ? 90L : 0L);
        return objectAnimatorOfFloat;
    }

    public static void es(View view, jrz jrzVar) {
        view.setRotation(jrzVar.e);
        view.setPivotX(view.getHeight() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        if (jrzVar.equals(jrz.LANDSCAPE)) {
            view.setTranslationY(view.getWidth() - view.getHeight());
        } else {
            view.setTranslationY(0.0f);
        }
    }

    public static void et(View view, jrz jrzVar) {
        er(view, jrzVar).start();
    }

    public static Bitmap eu(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int iMax = Math.max(1, drawable.getIntrinsicWidth());
        int iMax2 = Math.max(1, drawable.getIntrinsicHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, iMax, iMax2);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Animator.AnimatorListener ev(Consumer consumer) {
        return new jrm(consumer);
    }

    public static Animator.AnimatorListener ew(Consumer consumer) {
        return new jrn(consumer);
    }

    public static jmo ex(int i, Object... objArr) {
        return new jms(i, objArr);
    }

    public static jmo ey(int i, int i2, Object... objArr) {
        return new jmr(i, i2, objArr);
    }

    public static boolean ez(jmo jmoVar) {
        return jmoVar == jmq.a;
    }

    private static ThreadFactory fa(lbd lbdVar) {
        boolean z = lbdVar.a == 1;
        boolean z2 = z || lbdVar.b.length() <= 13;
        String str = lbdVar.b;
        if (z2) {
            return new lbe(lbdVar, z);
        }
        throw new IllegalArgumentException(obr.aw("Thread name %s is too long, must be less than %s", str, 13));
    }

    private static Object fb(kvk kvkVar) throws ExecutionException {
        if (kvkVar.e()) {
            return kvkVar.c();
        }
        if (((kvp) kvkVar).c) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(kvkVar.b());
    }

    private static void fc(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    private static int fd(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long fe(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long ff(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static long fg(long j) {
        return j ^ (j >>> 47);
    }

    private static void fh(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jFf = ff(bArr, i);
        long jFf2 = ff(bArr, i + 8);
        long jFf3 = ff(bArr, i + 16);
        long jFf4 = ff(bArr, i + 24);
        long j3 = j + jFf;
        long jRotateRight = Long.rotateRight(j2 + j3 + jFf4, 21);
        long j4 = jFf2 + j3 + jFf3;
        long jRotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + jFf4;
        jArr[1] = jRotateRight + jRotateRight2 + j3;
    }

    private static kew fi(XmlResourceParser xmlResourceParser, kev kevVar, kdt kdtVar) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue)) {
                            TextUtils.isEmpty(strTrim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && strTrim2 != null) {
                            if ("ga_appName".equals(attributeValue2)) {
                                kevVar.b.a = strTrim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                kevVar.b.b = strTrim2;
                            } else if ("ga_logLevel".equals(attributeValue2)) {
                                kevVar.b.c = strTrim2;
                            } else {
                                kevVar.a.d().u("String xml configuration name not recognized", attributeValue2);
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(strTrim3)) {
                            try {
                                boolean z = Boolean.parseBoolean(strTrim3);
                                if ("ga_dryRun".equals(attributeValue3)) {
                                    kevVar.b.e = z ? 1 : 0;
                                } else {
                                    kevVar.a.d().u("Bool xml configuration name not recognized", attributeValue3);
                                }
                            } catch (NumberFormatException e2) {
                                kdtVar.v("Error parsing bool configuration value", strTrim3, e2);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(strTrim4)) {
                            try {
                                int i = Integer.parseInt(strTrim4);
                                if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                    kevVar.b.d = i;
                                } else {
                                    kevVar.a.d().u("Int xml configuration name not recognized", attributeValue4);
                                }
                            } catch (NumberFormatException e3) {
                                kdtVar.v("Error parsing int configuration value", strTrim4, e3);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e4) {
            kdtVar.o("Error parsing tracker configuration file", e4);
        } catch (XmlPullParserException e5) {
            kdtVar.o("Error parsing tracker configuration file", e5);
        }
        return kevVar.b;
    }

    private static float fj(float f2) {
        return f2 >= 180.0f ? 180.0f - f2 : f2;
    }

    private static int fk(Context context, int i) {
        double d2 = i / context.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) (d2 + 0.5d);
    }

    private static Size fl(Context context, Display display, int i, int i2) {
        int rotation = display.getRotation();
        int iFk = fk(context, i);
        int iFk2 = fk(context, i2);
        return (rotation == 0 || rotation == 2) ? new Size(iFk, iFk2) : new Size(iFk2, iFk);
    }

    public static List k(Size[] sizeArr, Size[] sizeArr2) {
        if (sizeArr == null) {
            return oom.l();
        }
        int length = sizeArr.length;
        int length2 = sizeArr2.length;
        Size[] sizeArr3 = new Size[length + length2];
        for (int i = 0; i < sizeArr2.length; i++) {
            Size size = sizeArr2[i];
            if (size != null) {
                a = size.getWidth();
                sizeArr3[i] = size;
            }
        }
        while (length2 < sizeArr.length) {
            Size size2 = sizeArr[length2];
            if (size2 != null) {
                if (a > size2.getWidth()) {
                    sizeArr3[length2] = size2;
                }
            }
            length2++;
        }
        ArrayList arrayList = new ArrayList(sizeArr3.length);
        for (Size size3 : sizeArr3) {
            if (size3 != null) {
                arrayList.add(new lig(size3.getWidth(), size3.getHeight()));
            }
        }
        return arrayList;
    }

    private static Class w(mhl mhlVar) {
        try {
            return mhlVar.b("com.google.android.libraries.lens.lenslite.dynamicloading.PackageVersion");
        } catch (mhn e2) {
            return mhlVar.b("com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion");
        }
    }

    private static void x(RuntimeException runtimeException) {
        Log.e("Preconditions", "Precondition broken. Build is not strict; continuing...", runtimeException);
    }

    public static int y(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    public static int z(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    public final synchronized void aV() {
    }

    public void b(lzv lzvVar) {
    }

    public void fF() {
    }

    public void fG(lzv lzvVar) {
    }

    public void fH(lzr lzrVar) {
    }

    public void fI(long j, int i) {
    }

    public void fJ(lmw lmwVar) {
    }

    public void fv(lnx lnxVar, long j) {
    }

    public void fw(lux luxVar) {
    }

    public void fx() {
    }

    public void fy() {
    }

    public void gi() {
    }

    public boolean gj(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0;
    }

    public void k(long j, int i, long j2) {
    }

    public void l(long j, Set set) {
    }

    public void m(long j, int i) {
    }

    public boolean p(jtw jtwVar) {
        throw null;
    }

    public void q(byte[] bArr) {
        throw null;
    }

    public void r() {
        throw null;
    }

    public void s(int i) {
        throw null;
    }

    public Executor t() {
        return null;
    }

    @Deprecated
    public kie u(Context context, Looper looper, kmf kmfVar, Object obj, kik kikVar, kil kilVar) {
        return v(context, looper, kmfVar, obj, kikVar, kilVar);
    }

    public kie v(Context context, Looper looper, kmf kmfVar, Object obj, kjq kjqVar, kkw kkwVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
