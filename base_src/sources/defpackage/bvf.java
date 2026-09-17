package defpackage;

import android.media.MediaCodecList;
import android.os.Trace;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bvf implements Runnable {
    private final /* synthetic */ int p;
    public static final /* synthetic */ bvf o = new bvf(20);
    public static final /* synthetic */ bvf n = new bvf(16);
    public static final /* synthetic */ bvf m = new bvf(15);
    public static final /* synthetic */ bvf l = new bvf(14);
    public static final /* synthetic */ bvf k = new bvf(13);
    public static final /* synthetic */ bvf j = new bvf(12);
    public static final /* synthetic */ bvf i = new bvf(10);
    public static final /* synthetic */ bvf h = new bvf(9);
    public static final /* synthetic */ bvf g = new bvf(8);
    public static final /* synthetic */ bvf f = new bvf(7);
    public static final /* synthetic */ bvf e = new bvf(5);
    public static final /* synthetic */ bvf d = new bvf(4);
    public static final /* synthetic */ bvf c = new bvf(3);
    public static final /* synthetic */ bvf b = new bvf(2);
    public static final /* synthetic */ bvf a = new bvf(0);

    public /* synthetic */ bvf(int i2) {
        this.p = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.p) {
            case 0:
                ouj oujVar = bvk.a;
                break;
            case 7:
                DynamicDepthUtils.savePdCacheImpl();
                break;
            case 11:
                ovd ovdVar = ovl.a;
                break;
            case 14:
                int i2 = euy.a;
                Trace.beginSection("preloadMediaCodecList");
                new MediaCodecList(0);
                Trace.endSection();
                break;
            case 15:
                int i3 = euy.a;
                Trace.beginSection("loadJniLibraries");
                lil.a((Class) ent.a.get(0));
                enl.b();
                Trace.endSection();
                break;
            case 16:
                boolean z = fps.a;
                boolean z2 = fps.a;
                break;
            case 19:
                lar.a();
                break;
        }
    }
}
