package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitOutputsInterface;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hfw implements hgi {
    public static final ouj a = ouj.h("com/google/android/apps/camera/portrait/PortraitControllerImpl");
    public static final String b = GcamModuleJNI.kRequestCameraPrimary_get();
    public static final String c = GcamModuleJNI.kRequestCameraSecondaryTele_get();
    public static final String d = GcamModuleJNI.kRequestCameraSecondaryWide_get();
    public final Executor e;
    public final ddf f;
    public final Object g;
    public final Object h;
    public final HashMap i;
    public final PortraitOutputsInterface j;
    public boolean k;
    public final hgm l;
    public final hgl m;
    private final gjw n;
    private final ead o;
    private final boolean p;
    private final hoh q;
    private final qkg r;

    public hfw(hgm hgmVar, hgl hglVar, gjw gjwVar, Executor executor, ddf ddfVar, ead eadVar, hoh hohVar, qkg qkgVar) {
        Object obj = new Object();
        this.g = obj;
        this.h = new Object();
        this.i = new HashMap();
        this.j = new PortraitOutputsInterface();
        this.k = false;
        synchronized (obj) {
            this.l = hgmVar;
            this.m = hglVar;
        }
        this.n = gjwVar;
        this.e = executor;
        this.f = ddfVar;
        this.o = eadVar;
        this.p = ddfVar.k(ddx.f);
        this.q = hohVar;
        this.r = qkgVar;
    }

    public static hgk a(String str, String str2) {
        hgj hgjVarA = hgk.a();
        hgjVarA.a = b(str);
        hgjVarA.b = b(str2);
        return hgjVarA.a();
    }

    public static ojc b(String str) {
        if (oje.d(str)) {
            return oih.a;
        }
        try {
            return ojc.i(asv.c(str));
        } catch (ass e) {
            ((oug) ((oug) a.b()).G((char) 2428)).o("String was not a serialized XMPMeta.");
            return oih.a;
        }
    }

    public static boolean f(msq msqVar) {
        ojc ojcVar = msqVar.b;
        ojc ojcVar2 = msqVar.a;
        return ((ojcVar.g() && !((InterleavedImageU8) ojcVar.c()).f()) || (ojcVar2.g() && ((HardwareBuffer) ojcVar2.c()).getWidth() > 0 && ((HardwareBuffer) ojcVar2.c()).getHeight() > 0)) ? false : true;
    }

    @Override // defpackage.hgi
    public final void c() {
        synchronized (this.h) {
            if (this.k) {
                ((oug) ((oug) a.c()).G(2431)).o("init() called on an already initialized PortraitController.");
            } else {
                this.e.execute(new Runnable() { // from class: hfi
                    @Override // java.lang.Runnable
                    public final void run() {
                        hfw hfwVar = this.a;
                        synchronized (hfwVar.h) {
                            synchronized (hfwVar.g) {
                                hgm hgmVar = hfwVar.l;
                                if (hgmVar != null && hfwVar.m != null) {
                                    if (hgmVar.a() == 0) {
                                        ((oug) ((oug) hfw.a.c()).G(2433)).o("Expected portrait segmenter to be initialized, but it wasn't. Initializing again.");
                                        hfwVar.l.b();
                                    }
                                    if (hfwVar.m.a() == 0 && hfwVar.f.k(ddx.B)) {
                                        ((oug) ((oug) hfw.a.c()).G(2432)).o("Expected portrait relighting processor to be initialized, but it wasn't. Initializing again.");
                                        hfwVar.m.d();
                                    }
                                    hfwVar.k = true;
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.hgi
    public final void d() {
    }

    @Override // defpackage.hgi
    public final pht e(long j, InterleavedImageU8 interleavedImageU8, InterleavedImageU16 interleavedImageU16, ghx ghxVar, PortraitRequest portraitRequest, RawReadView rawReadView, ShotMetadata shotMetadata, RawReadView rawReadView2, ShotMetadata shotMetadata2, ega egaVar) {
        synchronized (this.h) {
            if (!this.k) {
                return plk.U(new llv("Controller hasn't been initialized"));
            }
            Object obj = this.n.a.d;
            GcamModuleJNI.PortraitRequest_embed_gdepth_metadata_set(portraitRequest.a, portraitRequest, this.p);
            if (this.f.k(ddx.w)) {
                GcamModuleJNI.PortraitRequest_depth_processing_set(portraitRequest.a, portraitRequest, 2);
            }
            GcamModuleJNI.PortraitRequest_allow_raw_blur_rear_set(portraitRequest.a, portraitRequest, this.f.k(ddx.z));
            GcamModuleJNI.PortraitRequest_allow_raw_blur_front_set(portraitRequest.a, portraitRequest, this.f.k(ddx.y));
            GcamModuleJNI.PortraitRequest_use_opencl_depth_set(portraitRequest.a, portraitRequest, this.f.k(ddx.v));
            GcamModuleJNI.PortraitRequest_relighting_option_set(portraitRequest.a, portraitRequest, this.f.k(ddx.B) ? fcy.v(3) : fcy.v(1));
            GcamModuleJNI.PortraitRequest_horizontal_flip_set(portraitRequest.a, portraitRequest, this.q.e(ghxVar.k()));
            GcamModuleJNI.PortraitRequest_use_spotlight_enhance_set(portraitRequest.a, portraitRequest, this.f.k(ddx.D));
            GcamModuleJNI.PortraitRequest_use_spotlight_enhance_v2_set(portraitRequest.a, portraitRequest, this.f.k(ddx.E));
            GcamModuleJNI.PortraitRequest_apply_portrait_matting_set(portraitRequest.a, portraitRequest, this.f.k(ddx.s));
            this.f.d();
            GcamModuleJNI.PortraitRequest_use_gpu_resample_set(portraitRequest.a, portraitRequest, false);
            ojc ojcVarB = ((fsr) this.r).b();
            if (ojcVarB.g()) {
                GcamModuleJNI.PortraitRequest_cache_directory_set(portraitRequest.a, portraitRequest, ((File) ojcVarB.c()).getAbsolutePath());
            }
            if (this.o.b()) {
                GcamModuleJNI.PortraitRequest_execute_finish_on_set(portraitRequest.a, portraitRequest, 1);
            }
            return this.n.a(new hfs(this, j, egaVar, this.f.k(ddx.F), portraitRequest, rawReadView, shotMetadata, rawReadView2, shotMetadata2, interleavedImageU16, interleavedImageU8));
        }
    }
}
