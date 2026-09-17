package defpackage;

import android.media.MediaFormat;
import com.Helper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dvv {
    public static final lig a = lig.h(Helper.mv_w, Helper.mv_h);
    public static final lig b = lig.h(1280, 720);
    public static final lig c = lig.h(2048, 1536);
    public static final lig d = lig.h(1920, 1080);
    public static final lig e;
    public static final lig f;
    public static final long g;
    public static final long h;

    static {
        lig.h(4032, 3024);
        lig.h(4032, 2268);
        e = lig.h(2880, 2160);
        f = lig.h(3840, 2160);
        g = TimeUnit.MICROSECONDS.convert(1L, TimeUnit.SECONDS) / 30;
        h = TimeUnit.NANOSECONDS.convert(1L, TimeUnit.SECONDS) / 30;
        Math.max(2.0f, 0.23333333f);
    }

    public static int a(MediaFormat mediaFormat) {
        return ((mediaFormat.getInteger("width") * mediaFormat.getInteger("height")) * 3) / 2;
    }
}
