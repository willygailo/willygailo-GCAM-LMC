package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.libraries.vision.visionkit.pipeline.PipelineException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cza implements cyw, dab {
    public final dac b;
    public cyv c = a;
    private nvh e;
    private final cyl f;
    private cyz g;
    private final lap h;
    private final ljf i;
    private final dei j;
    private static final ouj d = ouj.h("com/google/android/apps/camera/cameravisionkit/CameraVisionKitPipelineImpl");
    public static final cyv a = new cyy();

    public cza(cyl cylVar, dac dacVar, ljf ljfVar, dei deiVar) {
        lil.a(dae.class);
        this.f = cylVar;
        this.b = dacVar;
        this.i = ljfVar;
        this.j = deiVar;
        this.h = new lap();
    }

    private final void j(Exception exc, String str) {
        ((oug) ((oug) ((oug) d.b()).h(exc)).G((char) 660)).r("%s", str);
        if (this.j.b(dei.DOGFOOD)) {
            throw new cyo(str, exc);
        }
    }

    @Override // defpackage.cyw
    public final lie a(cyv cyvVar) {
        this.c = cyvVar;
        return new lie() { // from class: cyx
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.a.c = cza.a;
            }
        };
    }

    @Override // defpackage.cyw
    public final void b() {
        this.h.close();
    }

    @Override // defpackage.cyw
    public final void c() {
        lap lapVar = this.h;
        final dac dacVar = this.b;
        dacVar.h = this;
        final czv czvVar = dacVar.d;
        czvVar.c = dacVar;
        final lie lieVar = new lie() { // from class: czs
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                ScheduledFuture scheduledFuture;
                czv czvVar2 = czvVar;
                synchronized (czvVar2) {
                    czvVar2.c = czv.a;
                    scheduledFuture = czvVar2.d;
                    if (scheduledFuture != null) {
                        czvVar2.d = null;
                    } else {
                        scheduledFuture = null;
                    }
                }
                czv.b(scheduledFuture);
            }
        };
        lapVar.c(new lie() { // from class: czy
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                dac dacVar2 = dacVar;
                lie lieVar2 = lieVar;
                dacVar2.h = dac.a;
                lieVar2.close();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:249:0x0816  */
    /* JADX WARN: Code duplicated, block: B:250:0x081a  */
    /* JADX WARN: Code duplicated, block: B:252:0x082a  */
    /* JADX WARN: Code duplicated, block: B:255:0x0849  */
    /* JADX WARN: Code duplicated, block: B:258:0x0875  */
    /* JADX WARN: Code duplicated, block: B:261:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:262:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:265:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:269:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:283:0x0945 A[Catch: PipelineException -> 0x0953, TryCatch #1 {PipelineException -> 0x0953, blocks: (B:274:0x091c, B:283:0x0945, B:284:0x0952, B:281:0x093d, B:282:0x0944, B:277:0x092e), top: B:291:0x091c, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x092e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.cyw
    public final void d() {
        String str;
        cza czaVar;
        IOException iOException;
        cyl cylVar;
        poy poyVarL;
        poy poyVarM;
        poy poyVarM2;
        poy poyVarM3;
        boolean z;
        nvm nvmVar;
        String str2;
        String str3;
        int i;
        String str4;
        cyz cyzVar;
        long j;
        String str5 = "BarcodeReader";
        this.i.e("camera_vkp_initialize");
        if (this.g == null) {
            try {
                cyl cylVar2 = this.f;
                poy poyVarL2 = cylVar2.l();
                cylVar2.m(poyVarL2);
                if (cylVar2.j()) {
                    AssetFileDescriptor assetFileDescriptorA = cylVar2.a("camera_vkp/mobile_ica_8bit_v2.tflite.uncompressed");
                    AssetFileDescriptor assetFileDescriptorA2 = cylVar2.a("camera_vkp/mobile_ica_8bit_v2_label_map.uncompressed");
                    poy poyVarM4 = nwe.f.m();
                    poy poyVarM5 = nwd.d.m();
                    poy poyVarM6 = nvx.c.m();
                    poy poyVarM7 = nvy.e.m();
                    int fd = assetFileDescriptorA.getParcelFileDescriptor().getFd();
                    try {
                        if (poyVarM7.c) {
                            try {
                                poyVarM7.m();
                                poyVarM7.c = false;
                            } catch (IOException e) {
                                iOException = e;
                                str = "LazyPipeline";
                                czaVar = this;
                                ((oug) ((oug) ((oug) d.b()).h(iOException)).G((char) 661)).o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                                cylVar = czaVar.f;
                                poyVarL = cylVar.l();
                                cylVar.m(poyVarL);
                                if (cylVar.b.k(ddp.p)) {
                                    poyVarM = nvm.d.m();
                                    poyVarM2 = nuy.e.m();
                                    if (poyVarM2.c) {
                                        poyVarM2.m();
                                        poyVarM2.c = false;
                                    }
                                    nuy.b((nuy) poyVarM2.b);
                                    poyVarM2.t("CoarseClassifierTexto128V2_3");
                                    poyVarM2.t(str5);
                                    long micros = TimeUnit.SECONDS.toMicros(120L);
                                    if (poyVarM2.c) {
                                        poyVarM2.m();
                                        poyVarM2.c = false;
                                    }
                                    nuy nuyVar = (nuy) poyVarM2.b;
                                    nuyVar.a |= 2;
                                    nuyVar.d = micros;
                                    poyVarM2.s(cylVar.c());
                                    poy poyVarM8 = nva.b.m();
                                    poyVarM8.as(poyVarM2);
                                    nva nvaVar = (nva) poyVarM8.j();
                                    if (poyVarM.c) {
                                        poyVarM.m();
                                        poyVarM.c = false;
                                    }
                                    nvm nvmVar2 = (nvm) poyVarM.b;
                                    nvaVar.getClass();
                                    nvmVar2.b = nvaVar;
                                    nvmVar2.a |= 2;
                                    poy poyVarM9 = nvq.b.m();
                                    poyVarM9.u(cylVar.b());
                                    poyVarM3 = nvp.e.m();
                                    if (poyVarM3.c) {
                                        poyVarM3.m();
                                        z = false;
                                        poyVarM3.c = false;
                                    } else {
                                        z = false;
                                    }
                                    nvp nvpVar = (nvp) poyVarM3.b;
                                    int i2 = nvpVar.a | 2;
                                    nvpVar.a = i2;
                                    nvpVar.d = z;
                                    nvpVar.a = 1 | i2;
                                    nvpVar.b = str;
                                    poyVarM9.u((nvp) poyVarM3.j());
                                    if (poyVarM.c) {
                                        poyVarM.m();
                                        poyVarM.c = false;
                                    }
                                    nvm nvmVar3 = (nvm) poyVarM.b;
                                    nvq nvqVar = (nvq) poyVarM9.j();
                                    nvqVar.getClass();
                                    nvmVar3.c = nvqVar;
                                    nvmVar3.a |= 8;
                                    nvmVar = (nvm) poyVarM.j();
                                } else {
                                    nvmVar = nvm.d;
                                }
                                if (poyVarL.c) {
                                    poyVarL.m();
                                    poyVarL.c = false;
                                }
                                nvl nvlVar = (nvl) poyVarL.b;
                                nvl nvlVar2 = nvl.j;
                                nvmVar.getClass();
                                nvlVar.h = nvmVar;
                                nvlVar.a |= 16384;
                                czaVar.e = cylVar.k(poyVarL);
                            }
                        }
                        nvy nvyVar = (nvy) poyVarM7.b;
                        str2 = "LazyPipeline";
                        try {
                            nvyVar.a |= 1;
                            nvyVar.b = fd;
                            long startOffset = assetFileDescriptorA.getStartOffset();
                            if (poyVarM7.c) {
                                try {
                                    poyVarM7.m();
                                    poyVarM7.c = false;
                                } catch (IOException e2) {
                                    czaVar = this;
                                    iOException = e2;
                                    str = str2;
                                    ((oug) ((oug) ((oug) d.b()).h(iOException)).G((char) 661)).o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                                    cylVar = czaVar.f;
                                    poyVarL = cylVar.l();
                                    cylVar.m(poyVarL);
                                    if (cylVar.b.k(ddp.p)) {
                                        nvmVar = nvm.d;
                                    } else {
                                        poyVarM = nvm.d.m();
                                        poyVarM2 = nuy.e.m();
                                        if (poyVarM2.c) {
                                            poyVarM2.m();
                                            poyVarM2.c = false;
                                        }
                                        nuy.b((nuy) poyVarM2.b);
                                        poyVarM2.t("CoarseClassifierTexto128V2_3");
                                        poyVarM2.t(str5);
                                        long micros2 = TimeUnit.SECONDS.toMicros(120L);
                                        if (poyVarM2.c) {
                                            poyVarM2.m();
                                            poyVarM2.c = false;
                                        }
                                        nuy nuyVar2 = (nuy) poyVarM2.b;
                                        nuyVar2.a |= 2;
                                        nuyVar2.d = micros2;
                                        poyVarM2.s(cylVar.c());
                                        poy poyVarM10 = nva.b.m();
                                        poyVarM10.as(poyVarM2);
                                        nva nvaVar2 = (nva) poyVarM10.j();
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        nvm nvmVar4 = (nvm) poyVarM.b;
                                        nvaVar2.getClass();
                                        nvmVar4.b = nvaVar2;
                                        nvmVar4.a |= 2;
                                        poy poyVarM11 = nvq.b.m();
                                        poyVarM11.u(cylVar.b());
                                        poyVarM3 = nvp.e.m();
                                        if (poyVarM3.c) {
                                            poyVarM3.m();
                                            z = false;
                                            poyVarM3.c = false;
                                        } else {
                                            z = false;
                                        }
                                        nvp nvpVar2 = (nvp) poyVarM3.b;
                                        int i3 = nvpVar2.a | 2;
                                        nvpVar2.a = i3;
                                        nvpVar2.d = z;
                                        nvpVar2.a = 1 | i3;
                                        nvpVar2.b = str;
                                        poyVarM11.u((nvp) poyVarM3.j());
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        nvm nvmVar5 = (nvm) poyVarM.b;
                                        nvq nvqVar2 = (nvq) poyVarM11.j();
                                        nvqVar2.getClass();
                                        nvmVar5.c = nvqVar2;
                                        nvmVar5.a |= 8;
                                        nvmVar = (nvm) poyVarM.j();
                                    }
                                    if (poyVarL.c) {
                                        poyVarL.m();
                                        poyVarL.c = false;
                                    }
                                    nvl nvlVar3 = (nvl) poyVarL.b;
                                    nvl nvlVar4 = nvl.j;
                                    nvmVar.getClass();
                                    nvlVar3.h = nvmVar;
                                    nvlVar3.a |= 16384;
                                    czaVar.e = cylVar.k(poyVarL);
                                }
                            }
                            nvy nvyVar2 = (nvy) poyVarM7.b;
                            str3 = "BarcodeReader";
                            try {
                                nvyVar2.a |= 4;
                                nvyVar2.d = startOffset;
                                long length = assetFileDescriptorA.getLength();
                                if (poyVarM7.c) {
                                    try {
                                        poyVarM7.m();
                                        poyVarM7.c = false;
                                    } catch (IOException e3) {
                                        czaVar = this;
                                        iOException = e3;
                                        str = str2;
                                        str5 = str3;
                                        ((oug) ((oug) ((oug) d.b()).h(iOException)).G((char) 661)).o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                                        cylVar = czaVar.f;
                                        poyVarL = cylVar.l();
                                        cylVar.m(poyVarL);
                                        if (cylVar.b.k(ddp.p)) {
                                            nvmVar = nvm.d;
                                        } else {
                                            poyVarM = nvm.d.m();
                                            poyVarM2 = nuy.e.m();
                                            if (poyVarM2.c) {
                                                poyVarM2.m();
                                                poyVarM2.c = false;
                                            }
                                            nuy.b((nuy) poyVarM2.b);
                                            poyVarM2.t("CoarseClassifierTexto128V2_3");
                                            poyVarM2.t(str5);
                                            long micros3 = TimeUnit.SECONDS.toMicros(120L);
                                            if (poyVarM2.c) {
                                                poyVarM2.m();
                                                poyVarM2.c = false;
                                            }
                                            nuy nuyVar3 = (nuy) poyVarM2.b;
                                            nuyVar3.a |= 2;
                                            nuyVar3.d = micros3;
                                            poyVarM2.s(cylVar.c());
                                            poy poyVarM12 = nva.b.m();
                                            poyVarM12.as(poyVarM2);
                                            nva nvaVar3 = (nva) poyVarM12.j();
                                            if (poyVarM.c) {
                                                poyVarM.m();
                                                poyVarM.c = false;
                                            }
                                            nvm nvmVar6 = (nvm) poyVarM.b;
                                            nvaVar3.getClass();
                                            nvmVar6.b = nvaVar3;
                                            nvmVar6.a |= 2;
                                            poy poyVarM13 = nvq.b.m();
                                            poyVarM13.u(cylVar.b());
                                            poyVarM3 = nvp.e.m();
                                            if (poyVarM3.c) {
                                                poyVarM3.m();
                                                z = false;
                                                poyVarM3.c = false;
                                            } else {
                                                z = false;
                                            }
                                            nvp nvpVar3 = (nvp) poyVarM3.b;
                                            int i4 = nvpVar3.a | 2;
                                            nvpVar3.a = i4;
                                            nvpVar3.d = z;
                                            nvpVar3.a = 1 | i4;
                                            nvpVar3.b = str;
                                            poyVarM13.u((nvp) poyVarM3.j());
                                            if (poyVarM.c) {
                                                poyVarM.m();
                                                poyVarM.c = false;
                                            }
                                            nvm nvmVar7 = (nvm) poyVarM.b;
                                            nvq nvqVar3 = (nvq) poyVarM13.j();
                                            nvqVar3.getClass();
                                            nvmVar7.c = nvqVar3;
                                            nvmVar7.a |= 8;
                                            nvmVar = (nvm) poyVarM.j();
                                        }
                                        if (poyVarL.c) {
                                            poyVarL.m();
                                            poyVarL.c = false;
                                        }
                                        nvl nvlVar5 = (nvl) poyVarL.b;
                                        nvl nvlVar6 = nvl.j;
                                        nvmVar.getClass();
                                        nvlVar5.h = nvmVar;
                                        nvlVar5.a |= 16384;
                                        czaVar.e = cylVar.k(poyVarL);
                                    }
                                }
                                nvy nvyVar3 = (nvy) poyVarM7.b;
                                nvyVar3.a |= 2;
                                nvyVar3.c = length;
                                nvy nvyVar4 = (nvy) poyVarM7.j();
                                if (poyVarM6.c) {
                                    poyVarM6.m();
                                    poyVarM6.c = false;
                                }
                                nvx nvxVar = (nvx) poyVarM6.b;
                                nvyVar4.getClass();
                                nvxVar.b = nvyVar4;
                                nvxVar.a |= 4;
                                nvx nvxVar2 = (nvx) poyVarM6.j();
                                if (poyVarM5.c) {
                                    poyVarM5.m();
                                    poyVarM5.c = false;
                                }
                                nwd nwdVar = (nwd) poyVarM5.b;
                                nvxVar2.getClass();
                                nwdVar.b = nvxVar2;
                                nwdVar.a |= 1;
                                poy poyVarM14 = nvx.c.m();
                                poy poyVarM15 = nvy.e.m();
                                int fd2 = assetFileDescriptorA2.getParcelFileDescriptor().getFd();
                                if (poyVarM15.c) {
                                    poyVarM15.m();
                                    poyVarM15.c = false;
                                }
                                nvy nvyVar5 = (nvy) poyVarM15.b;
                                nvyVar5.a |= 1;
                                nvyVar5.b = fd2;
                                long startOffset2 = assetFileDescriptorA2.getStartOffset();
                                if (poyVarM15.c) {
                                    poyVarM15.m();
                                    poyVarM15.c = false;
                                }
                                nvy nvyVar6 = (nvy) poyVarM15.b;
                                nvyVar6.a |= 4;
                                nvyVar6.d = startOffset2;
                                long length2 = assetFileDescriptorA2.getLength();
                                if (poyVarM15.c) {
                                    poyVarM15.m();
                                    poyVarM15.c = false;
                                }
                                nvy nvyVar7 = (nvy) poyVarM15.b;
                                nvyVar7.a |= 2;
                                nvyVar7.c = length2;
                                nvy nvyVar8 = (nvy) poyVarM15.j();
                                if (poyVarM14.c) {
                                    poyVarM14.m();
                                    poyVarM14.c = false;
                                }
                                nvx nvxVar3 = (nvx) poyVarM14.b;
                                nvyVar8.getClass();
                                nvxVar3.b = nvyVar8;
                                nvxVar3.a |= 4;
                                nvx nvxVar4 = (nvx) poyVarM14.j();
                                if (poyVarM5.c) {
                                    poyVarM5.m();
                                    poyVarM5.c = false;
                                }
                                nwd nwdVar2 = (nwd) poyVarM5.b;
                                nvxVar4.getClass();
                                nwdVar2.c = nvxVar4;
                                nwdVar2.a |= 2;
                                nwd nwdVar3 = (nwd) poyVarM5.j();
                                if (poyVarM4.c) {
                                    poyVarM4.m();
                                    poyVarM4.c = false;
                                }
                                nwe nweVar = (nwe) poyVarM4.b;
                                int i5 = nweVar.a | 2;
                                nweVar.a = i5;
                                nweVar.b = "MobileIca8bitV2";
                                nwdVar3.getClass();
                                nweVar.c = nwdVar3;
                                nweVar.a = i5 | 4;
                                if (cylVar2.h()) {
                                    oom oomVar = cyl.a;
                                    if (poyVarM4.c) {
                                        poyVarM4.m();
                                        poyVarM4.c = false;
                                    }
                                    nwe nweVar2 = (nwe) poyVarM4.b;
                                    nweVar2.b();
                                    pnl.e(oomVar, nweVar2.e);
                                    if (poyVarM4.c) {
                                        poyVarM4.m();
                                        poyVarM4.c = false;
                                    }
                                    nwe nweVar3 = (nwe) poyVarM4.b;
                                    nweVar3.a |= 256;
                                    nweVar3.d = 0.4f;
                                }
                                if (cylVar2.g()) {
                                    if (poyVarM4.c) {
                                        poyVarM4.m();
                                        poyVarM4.c = false;
                                    }
                                    nwe nweVar4 = (nwe) poyVarM4.b;
                                    nweVar4.b();
                                    nweVar4.e.add("/m/015bv3");
                                    if (poyVarM4.c) {
                                        poyVarM4.m();
                                        poyVarM4.c = false;
                                    }
                                    nwe nweVar5 = (nwe) poyVarM4.b;
                                    nweVar5.a |= 256;
                                    nweVar5.d = 0.25f;
                                }
                                if (poyVarL2.c) {
                                    poyVarL2.m();
                                    poyVarL2.c = false;
                                }
                                nvl nvlVar7 = (nvl) poyVarL2.b;
                                nwe nweVar6 = (nwe) poyVarM4.j();
                                nvl nvlVar8 = nvl.j;
                                nweVar6.getClass();
                                ppm ppmVar = nvlVar7.b;
                                if (!ppmVar.c()) {
                                    nvlVar7.b = ppd.B(ppmVar);
                                }
                                nvlVar7.b.add(nweVar6);
                            } catch (IOException e4) {
                                e = e4;
                                czaVar = this;
                                str = str2;
                                str5 = str3;
                                iOException = e;
                                ((oug) ((oug) ((oug) d.b()).h(iOException)).G((char) 661)).o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                                cylVar = czaVar.f;
                                poyVarL = cylVar.l();
                                cylVar.m(poyVarL);
                                if (cylVar.b.k(ddp.p)) {
                                    nvmVar = nvm.d;
                                } else {
                                    poyVarM = nvm.d.m();
                                    poyVarM2 = nuy.e.m();
                                    if (poyVarM2.c) {
                                        poyVarM2.m();
                                        poyVarM2.c = false;
                                    }
                                    nuy.b((nuy) poyVarM2.b);
                                    poyVarM2.t("CoarseClassifierTexto128V2_3");
                                    poyVarM2.t(str5);
                                    long micros4 = TimeUnit.SECONDS.toMicros(120L);
                                    if (poyVarM2.c) {
                                        poyVarM2.m();
                                        poyVarM2.c = false;
                                    }
                                    nuy nuyVar4 = (nuy) poyVarM2.b;
                                    nuyVar4.a |= 2;
                                    nuyVar4.d = micros4;
                                    poyVarM2.s(cylVar.c());
                                    poy poyVarM16 = nva.b.m();
                                    poyVarM16.as(poyVarM2);
                                    nva nvaVar4 = (nva) poyVarM16.j();
                                    if (poyVarM.c) {
                                        poyVarM.m();
                                        poyVarM.c = false;
                                    }
                                    nvm nvmVar8 = (nvm) poyVarM.b;
                                    nvaVar4.getClass();
                                    nvmVar8.b = nvaVar4;
                                    nvmVar8.a |= 2;
                                    poy poyVarM17 = nvq.b.m();
                                    poyVarM17.u(cylVar.b());
                                    poyVarM3 = nvp.e.m();
                                    if (poyVarM3.c) {
                                        poyVarM3.m();
                                        z = false;
                                        poyVarM3.c = false;
                                    } else {
                                        z = false;
                                    }
                                    nvp nvpVar4 = (nvp) poyVarM3.b;
                                    int i6 = nvpVar4.a | 2;
                                    nvpVar4.a = i6;
                                    nvpVar4.d = z;
                                    nvpVar4.a = 1 | i6;
                                    nvpVar4.b = str;
                                    poyVarM17.u((nvp) poyVarM3.j());
                                    if (poyVarM.c) {
                                        poyVarM.m();
                                        poyVarM.c = false;
                                    }
                                    nvm nvmVar9 = (nvm) poyVarM.b;
                                    nvq nvqVar4 = (nvq) poyVarM17.j();
                                    nvqVar4.getClass();
                                    nvmVar9.c = nvqVar4;
                                    nvmVar9.a |= 8;
                                    nvmVar = (nvm) poyVarM.j();
                                }
                                if (poyVarL.c) {
                                    poyVarL.m();
                                    poyVarL.c = false;
                                }
                                nvl nvlVar9 = (nvl) poyVarL.b;
                                nvl nvlVar10 = nvl.j;
                                nvmVar.getClass();
                                nvlVar9.h = nvmVar;
                                nvlVar9.a |= 16384;
                                czaVar.e = cylVar.k(poyVarL);
                                czaVar.g = new cyz(czaVar, czaVar.e);
                                czaVar.i.g("camera_vkp_start");
                                cyzVar = czaVar.g;
                                obr.at(cyzVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
                                j = cyzVar.c;
                                if (j == 0) {
                                    throw new PipelineException(nvi.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
                                }
                                try {
                                    cyzVar.b.start(j);
                                    cyzVar.b.waitUntilIdle(cyzVar.c);
                                } catch (PipelineException e5) {
                                    cyzVar.b.stop(cyzVar.c);
                                    throw e5;
                                }
                                czaVar.i.f();
                            }
                        } catch (IOException e6) {
                            e = e6;
                            czaVar = this;
                            str = str2;
                            iOException = e;
                            ((oug) ((oug) ((oug) d.b()).h(iOException)).G((char) 661)).o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                            cylVar = czaVar.f;
                            poyVarL = cylVar.l();
                            cylVar.m(poyVarL);
                            if (cylVar.b.k(ddp.p)) {
                                nvmVar = nvm.d;
                            } else {
                                poyVarM = nvm.d.m();
                                poyVarM2 = nuy.e.m();
                                if (poyVarM2.c) {
                                    poyVarM2.m();
                                    poyVarM2.c = false;
                                }
                                nuy.b((nuy) poyVarM2.b);
                                poyVarM2.t("CoarseClassifierTexto128V2_3");
                                poyVarM2.t(str5);
                                long micros5 = TimeUnit.SECONDS.toMicros(120L);
                                if (poyVarM2.c) {
                                    poyVarM2.m();
                                    poyVarM2.c = false;
                                }
                                nuy nuyVar5 = (nuy) poyVarM2.b;
                                nuyVar5.a |= 2;
                                nuyVar5.d = micros5;
                                poyVarM2.s(cylVar.c());
                                poy poyVarM18 = nva.b.m();
                                poyVarM18.as(poyVarM2);
                                nva nvaVar5 = (nva) poyVarM18.j();
                                if (poyVarM.c) {
                                    poyVarM.m();
                                    poyVarM.c = false;
                                }
                                nvm nvmVar10 = (nvm) poyVarM.b;
                                nvaVar5.getClass();
                                nvmVar10.b = nvaVar5;
                                nvmVar10.a |= 2;
                                poy poyVarM19 = nvq.b.m();
                                poyVarM19.u(cylVar.b());
                                poyVarM3 = nvp.e.m();
                                if (poyVarM3.c) {
                                    poyVarM3.m();
                                    z = false;
                                    poyVarM3.c = false;
                                } else {
                                    z = false;
                                }
                                nvp nvpVar5 = (nvp) poyVarM3.b;
                                int i7 = nvpVar5.a | 2;
                                nvpVar5.a = i7;
                                nvpVar5.d = z;
                                nvpVar5.a = 1 | i7;
                                nvpVar5.b = str;
                                poyVarM19.u((nvp) poyVarM3.j());
                                if (poyVarM.c) {
                                    poyVarM.m();
                                    poyVarM.c = false;
                                }
                                nvm nvmVar11 = (nvm) poyVarM.b;
                                nvq nvqVar5 = (nvq) poyVarM19.j();
                                nvqVar5.getClass();
                                nvmVar11.c = nvqVar5;
                                nvmVar11.a |= 8;
                                nvmVar = (nvm) poyVarM.j();
                            }
                            if (poyVarL.c) {
                                poyVarL.m();
                                poyVarL.c = false;
                            }
                            nvl nvlVar11 = (nvl) poyVarL.b;
                            nvl nvlVar12 = nvl.j;
                            nvmVar.getClass();
                            nvlVar11.h = nvmVar;
                            nvlVar11.a |= 16384;
                            czaVar.e = cylVar.k(poyVarL);
                            czaVar.g = new cyz(czaVar, czaVar.e);
                            czaVar.i.g("camera_vkp_start");
                            cyzVar = czaVar.g;
                            obr.at(cyzVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
                            j = cyzVar.c;
                            if (j == 0) {
                                throw new PipelineException(nvi.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
                            }
                            cyzVar.b.start(j);
                            cyzVar.b.waitUntilIdle(cyzVar.c);
                            czaVar.i.f();
                        }
                    } catch (IOException e7) {
                        e = e7;
                        str = "LazyPipeline";
                        czaVar = this;
                        iOException = e;
                        ((oug) ((oug) ((oug) d.b()).h(iOException)).G((char) 661)).o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                        cylVar = czaVar.f;
                        poyVarL = cylVar.l();
                        cylVar.m(poyVarL);
                        if (cylVar.b.k(ddp.p)) {
                            nvmVar = nvm.d;
                        } else {
                            poyVarM = nvm.d.m();
                            poyVarM2 = nuy.e.m();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            nuy.b((nuy) poyVarM2.b);
                            poyVarM2.t("CoarseClassifierTexto128V2_3");
                            poyVarM2.t(str5);
                            long micros6 = TimeUnit.SECONDS.toMicros(120L);
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            nuy nuyVar6 = (nuy) poyVarM2.b;
                            nuyVar6.a |= 2;
                            nuyVar6.d = micros6;
                            poyVarM2.s(cylVar.c());
                            poy poyVarM110 = nva.b.m();
                            poyVarM110.as(poyVarM2);
                            nva nvaVar6 = (nva) poyVarM110.j();
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            nvm nvmVar12 = (nvm) poyVarM.b;
                            nvaVar6.getClass();
                            nvmVar12.b = nvaVar6;
                            nvmVar12.a |= 2;
                            poy poyVarM111 = nvq.b.m();
                            poyVarM111.u(cylVar.b());
                            poyVarM3 = nvp.e.m();
                            if (poyVarM3.c) {
                                poyVarM3.m();
                                z = false;
                                poyVarM3.c = false;
                            } else {
                                z = false;
                            }
                            nvp nvpVar6 = (nvp) poyVarM3.b;
                            int i8 = nvpVar6.a | 2;
                            nvpVar6.a = i8;
                            nvpVar6.d = z;
                            nvpVar6.a = 1 | i8;
                            nvpVar6.b = str;
                            poyVarM111.u((nvp) poyVarM3.j());
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            nvm nvmVar13 = (nvm) poyVarM.b;
                            nvq nvqVar6 = (nvq) poyVarM111.j();
                            nvqVar6.getClass();
                            nvmVar13.c = nvqVar6;
                            nvmVar13.a |= 8;
                            nvmVar = (nvm) poyVarM.j();
                        }
                        if (poyVarL.c) {
                            poyVarL.m();
                            poyVarL.c = false;
                        }
                        nvl nvlVar13 = (nvl) poyVarL.b;
                        nvl nvlVar14 = nvl.j;
                        nvmVar.getClass();
                        nvlVar13.h = nvmVar;
                        nvlVar13.a |= 16384;
                        czaVar.e = cylVar.k(poyVarL);
                        czaVar.g = new cyz(czaVar, czaVar.e);
                        czaVar.i.g("camera_vkp_start");
                        cyzVar = czaVar.g;
                        obr.at(cyzVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
                        j = cyzVar.c;
                        if (j == 0) {
                            throw new PipelineException(nvi.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
                        }
                        cyzVar.b.start(j);
                        cyzVar.b.waitUntilIdle(cyzVar.c);
                        czaVar.i.f();
                    }
                } else {
                    str2 = "LazyPipeline";
                    str3 = "BarcodeReader";
                }
                if (cylVar2.f()) {
                    poy poyVarM20 = nwf.e.m();
                    AssetFileDescriptor assetFileDescriptorA3 = cylVar2.a("camera_vkp/mobile_ica_v2_embedder.tflite.uncompressed");
                    poy poyVarM21 = nvx.c.m();
                    poy poyVarM22 = nvy.e.m();
                    int fd3 = assetFileDescriptorA3.getParcelFileDescriptor().getFd();
                    if (poyVarM22.c) {
                        poyVarM22.m();
                        poyVarM22.c = false;
                    }
                    nvy nvyVar9 = (nvy) poyVarM22.b;
                    nvyVar9.a |= 1;
                    nvyVar9.b = fd3;
                    long startOffset3 = assetFileDescriptorA3.getStartOffset();
                    if (poyVarM22.c) {
                        poyVarM22.m();
                        poyVarM22.c = false;
                    }
                    nvy nvyVar10 = (nvy) poyVarM22.b;
                    nvyVar10.a |= 4;
                    nvyVar10.d = startOffset3;
                    long length3 = assetFileDescriptorA3.getLength();
                    if (poyVarM22.c) {
                        poyVarM22.m();
                        poyVarM22.c = false;
                    }
                    nvy nvyVar11 = (nvy) poyVarM22.b;
                    nvyVar11.a |= 2;
                    nvyVar11.c = length3;
                    nvy nvyVar12 = (nvy) poyVarM22.j();
                    if (poyVarM21.c) {
                        poyVarM21.m();
                        poyVarM21.c = false;
                    }
                    nvx nvxVar5 = (nvx) poyVarM21.b;
                    nvyVar12.getClass();
                    nvxVar5.b = nvyVar12;
                    nvxVar5.a |= 4;
                    nvx nvxVar6 = (nvx) poyVarM21.j();
                    if (poyVarM20.c) {
                        poyVarM20.m();
                        poyVarM20.c = false;
                    }
                    nwf nwfVar = (nwf) poyVarM20.b;
                    nvxVar6.getClass();
                    nwfVar.c = nvxVar6;
                    int i9 = nwfVar.a | 4;
                    nwfVar.a = i9;
                    int i10 = i9 | 2;
                    nwfVar.a = i10;
                    nwfVar.b = "MobileIcaV2Embedder";
                    nwfVar.a = i10 | 32;
                    nwfVar.d = false;
                    if (poyVarL2.c) {
                        poyVarL2.m();
                        poyVarL2.c = false;
                    }
                    nvl nvlVar15 = (nvl) poyVarL2.b;
                    nwf nwfVar2 = (nwf) poyVarM20.j();
                    nvl nvlVar16 = nvl.j;
                    nwfVar2.getClass();
                    ppm ppmVar2 = nvlVar15.e;
                    if (!ppmVar2.c()) {
                        nvlVar15.e = ppd.B(ppmVar2);
                    }
                    nvlVar15.e.add(nwfVar2);
                }
                if (cylVar2.g()) {
                    AssetFileDescriptor assetFileDescriptorA4 = cylVar2.a("camera_vkp/corner_detector_fixed_input_shape_with_partial_metadata.tflite.uncompressed");
                    AssetFileDescriptor assetFileDescriptorA5 = cylVar2.a("camera_vkp/corner_detector_label_map.uncompressed");
                    AssetFileDescriptor assetFileDescriptorA6 = cylVar2.a("camera_vkp/corner_detector_anchor.uncompressed");
                    ppa ppaVar = (ppa) ptp.k.m();
                    if (ppaVar.c) {
                        ppaVar.m();
                        ppaVar.c = false;
                    }
                    ptp ptpVar = (ptp) ppaVar.b;
                    int i11 = ptpVar.a | 2;
                    ptpVar.a = i11;
                    ptpVar.c = 1;
                    int i12 = i11 | 4;
                    ptpVar.a = i12;
                    ptpVar.d = 1;
                    int i13 = i12 | 8;
                    ptpVar.a = i13;
                    ptpVar.e = -2.0f;
                    int i14 = i13 | 16;
                    ptpVar.a = i14;
                    ptpVar.f = 0.3f;
                    int i15 = i14 | 256;
                    ptpVar.a = i15;
                    ptpVar.i = 4;
                    int i16 = i15 | 128;
                    ptpVar.a = i16;
                    ptpVar.g = true;
                    ptpVar.a = i16 | 1;
                    ptpVar.b = "MobileSSDTfLiteClient";
                    poy poyVarM23 = ptn.e.m();
                    poy poyVarM24 = pto.e.m();
                    int fd4 = assetFileDescriptorA4.getParcelFileDescriptor().getFd();
                    if (poyVarM24.c) {
                        poyVarM24.m();
                        poyVarM24.c = false;
                    }
                    pto ptoVar = (pto) poyVarM24.b;
                    ptoVar.a |= 1;
                    ptoVar.b = fd4;
                    long startOffset4 = assetFileDescriptorA4.getStartOffset();
                    if (poyVarM24.c) {
                        poyVarM24.m();
                        poyVarM24.c = false;
                    }
                    pto ptoVar2 = (pto) poyVarM24.b;
                    ptoVar2.a |= 4;
                    ptoVar2.d = startOffset4;
                    long length4 = assetFileDescriptorA4.getLength();
                    if (poyVarM24.c) {
                        poyVarM24.m();
                        poyVarM24.c = false;
                    }
                    pto ptoVar3 = (pto) poyVarM24.b;
                    ptoVar3.a |= 2;
                    ptoVar3.c = length4;
                    pto ptoVar4 = (pto) poyVarM24.j();
                    if (poyVarM23.c) {
                        poyVarM23.m();
                        poyVarM23.c = false;
                    }
                    ptn ptnVar = (ptn) poyVarM23.b;
                    ptoVar4.getClass();
                    ptnVar.b = ptoVar4;
                    ptnVar.a |= 4;
                    poy poyVarM25 = pto.e.m();
                    int fd5 = assetFileDescriptorA5.getParcelFileDescriptor().getFd();
                    if (poyVarM25.c) {
                        poyVarM25.m();
                        poyVarM25.c = false;
                    }
                    pto ptoVar5 = (pto) poyVarM25.b;
                    ptoVar5.a |= 1;
                    ptoVar5.b = fd5;
                    long startOffset5 = assetFileDescriptorA5.getStartOffset();
                    if (poyVarM25.c) {
                        poyVarM25.m();
                        poyVarM25.c = false;
                    }
                    pto ptoVar6 = (pto) poyVarM25.b;
                    ptoVar6.a |= 4;
                    ptoVar6.d = startOffset5;
                    long length5 = assetFileDescriptorA5.getLength();
                    if (poyVarM25.c) {
                        poyVarM25.m();
                        poyVarM25.c = false;
                    }
                    pto ptoVar7 = (pto) poyVarM25.b;
                    ptoVar7.a |= 2;
                    ptoVar7.c = length5;
                    pto ptoVar8 = (pto) poyVarM25.j();
                    if (poyVarM23.c) {
                        poyVarM23.m();
                        poyVarM23.c = false;
                    }
                    ptn ptnVar2 = (ptn) poyVarM23.b;
                    ptoVar8.getClass();
                    ptnVar2.c = ptoVar8;
                    ptnVar2.a |= 32;
                    poy poyVarM26 = pto.e.m();
                    int fd6 = assetFileDescriptorA6.getParcelFileDescriptor().getFd();
                    if (poyVarM26.c) {
                        poyVarM26.m();
                        poyVarM26.c = false;
                    }
                    pto ptoVar9 = (pto) poyVarM26.b;
                    ptoVar9.a |= 1;
                    ptoVar9.b = fd6;
                    long startOffset6 = assetFileDescriptorA6.getStartOffset();
                    if (poyVarM26.c) {
                        poyVarM26.m();
                        poyVarM26.c = false;
                    }
                    pto ptoVar10 = (pto) poyVarM26.b;
                    ptoVar10.a |= 4;
                    ptoVar10.d = startOffset6;
                    long length6 = assetFileDescriptorA6.getLength();
                    if (poyVarM26.c) {
                        poyVarM26.m();
                        poyVarM26.c = false;
                    }
                    pto ptoVar11 = (pto) poyVarM26.b;
                    ptoVar11.a |= 2;
                    ptoVar11.c = length6;
                    pto ptoVar12 = (pto) poyVarM26.j();
                    if (poyVarM23.c) {
                        poyVarM23.m();
                        poyVarM23.c = false;
                    }
                    ptn ptnVar3 = (ptn) poyVarM23.b;
                    ptoVar12.getClass();
                    ptnVar3.d = ptoVar12;
                    ptnVar3.a |= 256;
                    ptn ptnVar4 = (ptn) poyVarM23.j();
                    if (ppaVar.c) {
                        ppaVar.m();
                        ppaVar.c = false;
                    }
                    ptp ptpVar2 = (ptp) ppaVar.b;
                    ptnVar4.getClass();
                    ptpVar2.j = ptnVar4;
                    ptpVar2.a |= 8192;
                    poy poyVarM27 = nvz.k.m();
                    poy poyVarM28 = nwa.d.m();
                    if (poyVarM28.c) {
                        poyVarM28.m();
                        poyVarM28.c = false;
                    }
                    nwa nwaVar = (nwa) poyVarM28.b;
                    nwaVar.a |= 2;
                    nwaVar.c = 0.997f;
                    ptp ptpVar3 = (ptp) ppaVar.j();
                    ptpVar3.getClass();
                    nwaVar.b = ptpVar3;
                    nwaVar.a |= 1;
                    if (poyVarM27.c) {
                        poyVarM27.m();
                        poyVarM27.c = false;
                    }
                    nvz nvzVar = (nvz) poyVarM27.b;
                    nwa nwaVar2 = (nwa) poyVarM28.j();
                    nwaVar2.getClass();
                    nvzVar.c = nwaVar2;
                    nvzVar.b = 2;
                    if (poyVarM27.c) {
                        poyVarM27.m();
                        poyVarM27.c = false;
                    }
                    nvz nvzVar2 = (nvz) poyVarM27.b;
                    nvzVar2.a |= 1;
                    nvzVar2.d = true;
                    poy poyVarM29 = nvw.f.m();
                    if (poyVarM29.c) {
                        poyVarM29.m();
                        poyVarM29.c = false;
                    }
                    nvw nvwVar = (nvw) poyVarM29.b;
                    int i17 = nvwVar.a | 8;
                    nvwVar.a = i17;
                    nvwVar.e = "MobileIca8bitV2";
                    nvwVar.b = 1;
                    nvwVar.c = "/m/015bv3";
                    nvwVar.a = i17 | 4;
                    nvwVar.d = 0.25f;
                    poyVarM27.at(poyVarM29);
                    poy poyVarM30 = nvw.f.m();
                    if (poyVarM30.c) {
                        poyVarM30.m();
                        poyVarM30.c = false;
                    }
                    nvw nvwVar2 = (nvw) poyVarM30.b;
                    int i18 = nvwVar2.a | 8;
                    nvwVar2.a = i18;
                    nvwVar2.e = "CoarseClassifierTexto128V2_3";
                    i = 3;
                    nvwVar2.b = 3;
                    nvwVar2.c = "text";
                    nvwVar2.a = i18 | 4;
                    nvwVar2.d = 0.4f;
                    poyVarM27.at(poyVarM30);
                    if (poyVarM27.c) {
                        poyVarM27.m();
                        poyVarM27.c = false;
                    }
                    nvz nvzVar3 = (nvz) poyVarM27.b;
                    ppj ppjVar = nvzVar3.f;
                    if (!ppjVar.c()) {
                        nvzVar3.f = ppd.v(ppjVar);
                    }
                    nvzVar3.f.g(0.70744234f);
                    if (poyVarM27.c) {
                        poyVarM27.m();
                        poyVarM27.c = false;
                    }
                    nvz nvzVar4 = (nvz) poyVarM27.b;
                    int i19 = nvzVar4.a | 4;
                    nvzVar4.a = i19;
                    nvzVar4.g = 0.2f;
                    int i20 = i19 | 32;
                    nvzVar4.a = i20;
                    nvzVar4.j = 0.025f;
                    int i21 = i20 | 16;
                    nvzVar4.a = i21;
                    nvzVar4.i = 0.5f;
                    nvzVar4.a = i21 | 8;
                    nvzVar4.h = 0.5f;
                    if (poyVarL2.c) {
                        poyVarL2.m();
                        poyVarL2.c = false;
                    }
                    nvl nvlVar17 = (nvl) poyVarL2.b;
                    nvz nvzVar5 = (nvz) poyVarM27.j();
                    nvl nvlVar18 = nvl.j;
                    nvzVar5.getClass();
                    nvlVar17.f = nvzVar5;
                    nvlVar17.a |= 8;
                } else {
                    i = 3;
                }
                poy poyVarM31 = nvm.d.m();
                poy poyVarM32 = nuy.e.m();
                if (poyVarM32.c) {
                    poyVarM32.m();
                    poyVarM32.c = false;
                }
                nuy.b((nuy) poyVarM32.b);
                poyVarM32.t("CoarseClassifierTexto128V2_3");
                if (cylVar2.b.k(ddp.p)) {
                    str5 = str3;
                    poyVarM32.t(str5);
                } else {
                    str5 = str3;
                }
                if (cylVar2.j()) {
                    poyVarM32.t("MobileIca8bitV2");
                }
                if (cylVar2.f()) {
                    str4 = "MobileIcaV2Embedder";
                    poyVarM32.t(str4);
                } else {
                    str4 = r2;
                }
                long micros7 = TimeUnit.SECONDS.toMicros(120L);
                if (poyVarM32.c) {
                    poyVarM32.m();
                    poyVarM32.c = false;
                }
                nuy nuyVar7 = (nuy) poyVarM32.b;
                nuyVar7.a |= 2;
                nuyVar7.d = micros7;
                poyVarM32.s(cylVar2.c());
                poy poyVarM33 = nva.b.m();
                poyVarM33.as(poyVarM32);
                nva nvaVar7 = (nva) poyVarM33.j();
                if (poyVarM31.c) {
                    poyVarM31.m();
                    poyVarM31.c = false;
                }
                nvm nvmVar14 = (nvm) poyVarM31.b;
                nvaVar7.getClass();
                nvmVar14.b = nvaVar7;
                nvmVar14.a |= 2;
                poy poyVarM34 = nvq.b.m();
                poyVarM34.u(cylVar2.b());
                ArrayList arrayList = new ArrayList();
                if (cylVar2.j()) {
                    arrayList.add("MobileIca8bitV2");
                }
                if (cylVar2.g()) {
                    arrayList.add("DocumentCornerFixedInputShapeClient");
                }
                if (cylVar2.f()) {
                    arrayList.add(str4);
                }
                poy poyVarM35 = nvp.e.m();
                poyVarM35.v(arrayList);
                if (poyVarM35.c) {
                    poyVarM35.m();
                    poyVarM35.c = false;
                }
                nvp nvpVar7 = (nvp) poyVarM35.b;
                int i22 = nvpVar7.a | 2;
                nvpVar7.a = i22;
                nvpVar7.d = false;
                nvpVar7.a = i22 | 1;
                str = str2;
                try {
                    nvpVar7.b = str;
                    poyVarM34.u((nvp) poyVarM35.j());
                    if (poyVarM31.c) {
                        poyVarM31.m();
                        poyVarM31.c = false;
                    }
                    nvm nvmVar15 = (nvm) poyVarM31.b;
                    nvq nvqVar7 = (nvq) poyVarM34.j();
                    nvqVar7.getClass();
                    nvmVar15.c = nvqVar7;
                    nvmVar15.a |= 8;
                    nvm nvmVar16 = (nvm) poyVarM31.j();
                    if (poyVarL2.c) {
                        poyVarL2.m();
                        poyVarL2.c = false;
                    }
                    nvl nvlVar19 = (nvl) poyVarL2.b;
                    nvl nvlVar20 = nvl.j;
                    nvmVar16.getClass();
                    nvlVar19.h = nvmVar16;
                    nvlVar19.a |= 16384;
                    if (true == cylVar2.b.k(ddp.y)) {
                        i = 1;
                    }
                    if (poyVarL2.c) {
                        poyVarL2.m();
                        poyVarL2.c = false;
                    }
                    nvl nvlVar21 = (nvl) poyVarL2.b;
                    nvlVar21.i = i - 1;
                    nvlVar21.a |= 524288;
                    czaVar = this;
                    try {
                        czaVar.e = cylVar2.k(poyVarL2);
                    } catch (IOException e8) {
                        e = e8;
                        iOException = e;
                        ((oug) ((oug) ((oug) d.b()).h(iOException)).G((char) 661)).o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                        cylVar = czaVar.f;
                        poyVarL = cylVar.l();
                        cylVar.m(poyVarL);
                        if (cylVar.b.k(ddp.p)) {
                            nvmVar = nvm.d;
                        } else {
                            poyVarM = nvm.d.m();
                            poyVarM2 = nuy.e.m();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            nuy.b((nuy) poyVarM2.b);
                            poyVarM2.t("CoarseClassifierTexto128V2_3");
                            poyVarM2.t(str5);
                            long micros8 = TimeUnit.SECONDS.toMicros(120L);
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            nuy nuyVar8 = (nuy) poyVarM2.b;
                            nuyVar8.a |= 2;
                            nuyVar8.d = micros8;
                            poyVarM2.s(cylVar.c());
                            poy poyVarM112 = nva.b.m();
                            poyVarM112.as(poyVarM2);
                            nva nvaVar8 = (nva) poyVarM112.j();
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            nvm nvmVar17 = (nvm) poyVarM.b;
                            nvaVar8.getClass();
                            nvmVar17.b = nvaVar8;
                            nvmVar17.a |= 2;
                            poy poyVarM113 = nvq.b.m();
                            poyVarM113.u(cylVar.b());
                            poyVarM3 = nvp.e.m();
                            if (poyVarM3.c) {
                                poyVarM3.m();
                                z = false;
                                poyVarM3.c = false;
                            } else {
                                z = false;
                            }
                            nvp nvpVar8 = (nvp) poyVarM3.b;
                            int i23 = nvpVar8.a | 2;
                            nvpVar8.a = i23;
                            nvpVar8.d = z;
                            nvpVar8.a = 1 | i23;
                            nvpVar8.b = str;
                            poyVarM113.u((nvp) poyVarM3.j());
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            nvm nvmVar18 = (nvm) poyVarM.b;
                            nvq nvqVar8 = (nvq) poyVarM113.j();
                            nvqVar8.getClass();
                            nvmVar18.c = nvqVar8;
                            nvmVar18.a |= 8;
                            nvmVar = (nvm) poyVarM.j();
                        }
                        if (poyVarL.c) {
                            poyVarL.m();
                            poyVarL.c = false;
                        }
                        nvl nvlVar110 = (nvl) poyVarL.b;
                        nvl nvlVar111 = nvl.j;
                        nvmVar.getClass();
                        nvlVar110.h = nvmVar;
                        nvlVar110.a |= 16384;
                        czaVar.e = cylVar.k(poyVarL);
                    }
                } catch (IOException e9) {
                    e = e9;
                    czaVar = this;
                    iOException = e;
                    ((oug) ((oug) ((oug) d.b()).h(iOException)).G((char) 661)).o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                    cylVar = czaVar.f;
                    poyVarL = cylVar.l();
                    cylVar.m(poyVarL);
                    if (cylVar.b.k(ddp.p)) {
                        nvmVar = nvm.d;
                    } else {
                        poyVarM = nvm.d.m();
                        poyVarM2 = nuy.e.m();
                        if (poyVarM2.c) {
                            poyVarM2.m();
                            poyVarM2.c = false;
                        }
                        nuy.b((nuy) poyVarM2.b);
                        poyVarM2.t("CoarseClassifierTexto128V2_3");
                        poyVarM2.t(str5);
                        long micros9 = TimeUnit.SECONDS.toMicros(120L);
                        if (poyVarM2.c) {
                            poyVarM2.m();
                            poyVarM2.c = false;
                        }
                        nuy nuyVar9 = (nuy) poyVarM2.b;
                        nuyVar9.a |= 2;
                        nuyVar9.d = micros9;
                        poyVarM2.s(cylVar.c());
                        poy poyVarM114 = nva.b.m();
                        poyVarM114.as(poyVarM2);
                        nva nvaVar9 = (nva) poyVarM114.j();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        nvm nvmVar19 = (nvm) poyVarM.b;
                        nvaVar9.getClass();
                        nvmVar19.b = nvaVar9;
                        nvmVar19.a |= 2;
                        poy poyVarM115 = nvq.b.m();
                        poyVarM115.u(cylVar.b());
                        poyVarM3 = nvp.e.m();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            z = false;
                            poyVarM3.c = false;
                        } else {
                            z = false;
                        }
                        nvp nvpVar9 = (nvp) poyVarM3.b;
                        int i24 = nvpVar9.a | 2;
                        nvpVar9.a = i24;
                        nvpVar9.d = z;
                        nvpVar9.a = 1 | i24;
                        nvpVar9.b = str;
                        poyVarM115.u((nvp) poyVarM3.j());
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        nvm nvmVar110 = (nvm) poyVarM.b;
                        nvq nvqVar9 = (nvq) poyVarM115.j();
                        nvqVar9.getClass();
                        nvmVar110.c = nvqVar9;
                        nvmVar110.a |= 8;
                        nvmVar = (nvm) poyVarM.j();
                    }
                    if (poyVarL.c) {
                        poyVarL.m();
                        poyVarL.c = false;
                    }
                    nvl nvlVar112 = (nvl) poyVarL.b;
                    nvl nvlVar113 = nvl.j;
                    nvmVar.getClass();
                    nvlVar112.h = nvmVar;
                    nvlVar112.a |= 16384;
                    czaVar.e = cylVar.k(poyVarL);
                    czaVar.g = new cyz(czaVar, czaVar.e);
                    czaVar.i.g("camera_vkp_start");
                    cyzVar = czaVar.g;
                    obr.at(cyzVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
                    j = cyzVar.c;
                    if (j == 0) {
                        throw new PipelineException(nvi.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
                    }
                    cyzVar.b.start(j);
                    cyzVar.b.waitUntilIdle(cyzVar.c);
                    czaVar.i.f();
                }
            } catch (IOException e10) {
                e = e10;
                str = "LazyPipeline";
                czaVar = this;
            }
            czaVar.g = new cyz(czaVar, czaVar.e);
        } else {
            czaVar = this;
        }
        czaVar.i.g("camera_vkp_start");
        try {
            cyzVar = czaVar.g;
            obr.at(cyzVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
            j = cyzVar.c;
            if (j == 0) {
                throw new PipelineException(nvi.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
            }
            cyzVar.b.start(j);
            cyzVar.b.waitUntilIdle(cyzVar.c);
        } catch (PipelineException e11) {
            czaVar.j(e11, "Unable to start VisionKitPipeline");
        }
        czaVar.i.f();
    }

    @Override // defpackage.cyw
    public final void e() {
        this.i.e("camera_vkp_enable_sub_pipeline");
        cyz cyzVar = this.g;
        obr.at(cyzVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
        long j = cyzVar.c;
        if (j == 0) {
            Log.w("VKP", "enableSubpipeline called but pipeline is not available. Ignoring call.");
        } else {
            cyzVar.b.enableSubpipeline(j, "LazyPipeline");
        }
        this.i.f();
    }

    @Override // defpackage.cyw
    public final void f() {
        cyz cyzVar = this.g;
        if (cyzVar != null) {
            try {
                obr.ao(cyzVar);
                cyzVar.c();
                this.f.d();
            } catch (IOException | RuntimeException e) {
                j(e, "Unable to close Vision kit");
            }
            this.g = null;
        }
    }

    @Override // defpackage.cyw
    public final void g() {
        this.i.e("camera_vkp_disable_sub_pipeline");
        cyz cyzVar = this.g;
        obr.at(cyzVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
        long j = cyzVar.c;
        if (j == 0) {
            Log.w("VKP", "disableSubpipeline called but pipeline is not available. Ignoring call.");
        } else {
            cyzVar.b.disableSubpipeline(j, "LazyPipeline");
        }
        this.i.f();
    }

    @Override // defpackage.cyw
    public final boolean h(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        cyz cyzVar = this.g;
        obr.at(cyzVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
        if (cyzVar.c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
            return cyzVar.b.receiveYuvFrame(cyzVar.c, j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6);
        }
        throw new IllegalStateException("Byte buffers are not direct.");
    }

    @Override // defpackage.dab
    public final void i(czo czoVar) {
        this.c.d(czoVar);
    }
}
