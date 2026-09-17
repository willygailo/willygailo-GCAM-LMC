package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vj {
    public static final int a(Context context, String str) {
        return context.checkSelfPermission("android.permission.CAMERA");
    }

    public static pht b(xt xtVar) {
        xr xrVar = new xr();
        xv xvVar = new xv(xrVar);
        xrVar.b = xvVar;
        xrVar.a = xtVar.getClass();
        try {
            xrVar.a = xtVar.a(xrVar);
        } catch (Exception e) {
            xvVar.a(e);
        }
        return xvVar;
    }

    public static boolean c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static int f(List list, InputStream inputStream, bct bctVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new bht(inputStream, bctVar);
        }
        inputStream.mark(5242880);
        return g(list, new azl(inputStream, bctVar));
    }

    public static int g(List list, azn aznVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = aznVar.a((azg) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser$ImageType.UNKNOWN : j(list, new azi(byteBuffer));
    }

    public static ImageHeaderParser$ImageType i(List list, InputStream inputStream, bct bctVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new bht(inputStream, bctVar);
        }
        inputStream.mark(5242880);
        return j(list, new azh(inputStream));
    }

    public static ImageHeaderParser$ImageType j(List list, azo azoVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = azoVar.a((azg) list.get(i));
            if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeA;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
