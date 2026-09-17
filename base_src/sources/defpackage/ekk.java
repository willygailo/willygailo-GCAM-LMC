package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;
import com.google.android.apps.camera.imax.cyclops.processing.OmnistereoRendererImpl;
import com.google.geo.lightfield.processing.ProgressCallback;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ekk implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ ProgressCallback b;
    final /* synthetic */ ekl c;

    public ekk(ekl eklVar, AtomicReference atomicReference, ProgressCallback progressCallback) {
        this.c = eklVar;
        this.a = atomicReference;
        this.b = progressCallback;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x010a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0143  */
    /* JADX WARN: Code duplicated, block: B:36:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x017c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0197  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0212  */
    /* JADX WARN: Code duplicated, block: B:70:0x021a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0179 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        StereoPanorama stereoPanorama;
        boolean z;
        AtomicReference atomicReference;
        ejq ejqVarA;
        OmnistereoRendererImpl omnistereoRendererImpl;
        float fA;
        ekl eklVar;
        boolean z2;
        StereoPanorama result;
        int name;
        int integer;
        int integer2;
        AtomicReference atomicReference2 = this.a;
        ekl eklVar2 = this.c;
        ProgressCallback progressCallback = this.b;
        progressCallback.setProgress(0.0f);
        nlb nlbVar = new nlb();
        nlbVar.b();
        String strB = eklVar2.g.b();
        int[] iArr = {0, 0};
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaFormat mediaFormatB = ekw.b(mediaExtractor, strB);
        mediaExtractor.release();
        if (mediaFormatB != null) {
            iArr[0] = mediaFormatB.getInteger("width");
            iArr[1] = mediaFormatB.getInteger("height");
        }
        nld nldVar = new nld(iArr[0], iArr[1]);
        Surface surface = new Surface(nldVar.c);
        ekw ekwVar = new ekw(surface);
        String strB2 = eklVar2.g.b();
        ekwVar.f = false;
        ekwVar.d = ekw.b(ekwVar.c, strB2);
        MediaFormat mediaFormat = ekwVar.d;
        if (mediaFormat != null) {
            if (mediaFormat.containsKey("durationUs")) {
                ekwVar.e = ekwVar.d.getLong("durationUs");
            }
            try {
                ekwVar.h = MediaCodec.createDecoderByType(ekwVar.d.getString("mime"));
                ekwVar.d.getString("mime");
                try {
                    stereoPanorama = null;
                    try {
                        ekwVar.h.configure(ekwVar.d, ekwVar.b, (MediaCrypto) null, 0);
                        try {
                            ekwVar.h.start();
                            ekwVar.g = ekwVar.h.getInputBuffers();
                            ekwVar.f = true;
                        } catch (Exception e) {
                            ((oug) ((oug) ((oug) ekw.a.b()).h(e)).G((char) 1255)).o("Could not start MediaCodec");
                            z = ekwVar.f;
                            if (z) {
                                ((oug) ((oug) ekl.a.b()).G((char) 1225)).r("Failed to open video file %s", eklVar2.g.b());
                                atomicReference = atomicReference2;
                                result = stereoPanorama;
                            }
                            atomicReference.set(result);
                        }
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        ((oug) ((oug) ((oug) ekw.a.b()).h(e)).G((char) 1257)).o("Could not configure MediaCodec");
                        z = ekwVar.f;
                    } catch (IllegalStateException e3) {
                        e = e3;
                        ((oug) ((oug) ((oug) ekw.a.b()).h(e)).G((char) 1256)).o("Could not configure MediaCodec");
                        z = ekwVar.f;
                    }
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    stereoPanorama = null;
                } catch (IllegalStateException e5) {
                    e = e5;
                    stereoPanorama = null;
                }
            } catch (IOException e6) {
                stereoPanorama = null;
                ((oug) ((oug) ekw.a.b()).G((char) 1258)).r("Could not create MediaCodec of type %s", ekwVar.d.getString("mime"));
                z = ekwVar.f;
            }
            atomicReference = atomicReference2;
            ejqVarA = eklVar2.b.a(eklVar2.g.a(), eklVar2.d, eklVar2.e, eklVar2.f);
            omnistereoRendererImpl = (OmnistereoRendererImpl) ejqVarA;
            if (omnistereoRendererImpl.b) {
                progressCallback.setProgress(0.2f);
                fA = 0.0f;
                while (true) {
                    if (fA < 1.0f) {
                        eklVar = eklVar2;
                        z2 = true;
                        break;
                    }
                    try {
                        if (!ekwVar.c()) {
                            eklVar = eklVar2;
                            z2 = true;
                            break;
                        }
                        try {
                            eklVar = eklVar2;
                            try {
                                if (!nldVar.d.tryAcquire(10000L, TimeUnit.MILLISECONDS)) {
                                    z2 = true;
                                    break;
                                }
                                nldVar.c.updateTexImage();
                                name = nldVar.b.getName();
                                integer = ekwVar.d.getInteger("width");
                                integer2 = ekwVar.d.getInteger("height");
                                if (omnistereoRendererImpl.b) {
                                    omnistereoRendererImpl.nativeApplyTexture(omnistereoRendererImpl.a, name, integer, integer2);
                                    omnistereoRendererImpl.a++;
                                }
                                progressCallback.setProgress((fA * 0.75f) + 0.2f);
                                fA = ekwVar.a();
                                eklVar2 = eklVar;
                            } catch (InterruptedException e7) {
                                e = e7;
                                Log.e(nld.a, e.getMessage());
                                z2 = true;
                            }
                        } catch (InterruptedException e8) {
                            e = e8;
                            eklVar = eklVar2;
                        }
                    } catch (IllegalStateException e9) {
                        eklVar = eklVar2;
                        ((oug) ((oug) ((oug) ekl.a.b()).h(e9)).G((char) 1222)).o("Could not decodeNextFrame");
                        z2 = false;
                    }
                }
                if (ekwVar.f) {
                    try {
                        ekwVar.h.stop();
                    } catch (IllegalStateException e10) {
                        ((oug) ((oug) ((oug) ekw.a.b()).h(e10)).G((char) 1253)).o("Exception when stopping the decoder");
                    }
                    ekwVar.h.release();
                    ekwVar.c.release();
                    ekwVar.f = false;
                }
                surface.release();
                nldVar.c.release();
                nldVar.b.delete();
                if (z2) {
                    result = ejqVarA.getResult(eklVar.c);
                } else {
                    result = null;
                }
                progressCallback.setProgress(1.0f);
                omnistereoRendererImpl.nativeRelease();
                omnistereoRendererImpl.b = false;
                nlbVar.a();
            } else {
                ((oug) ((oug) ekl.a.b()).G((char) 1224)).o("Failed to initialize omnistereo renderer");
                result = null;
            }
            atomicReference.set(result);
        }
        ((oug) ((oug) ekw.a.b()).G((char) 1259)).r("Could not extract MediaFormat from %s", strB2);
        z = ekwVar.f;
        stereoPanorama = null;
        if (z) {
            atomicReference = atomicReference2;
            ejqVarA = eklVar2.b.a(eklVar2.g.a(), eklVar2.d, eklVar2.e, eklVar2.f);
            omnistereoRendererImpl = (OmnistereoRendererImpl) ejqVarA;
            if (omnistereoRendererImpl.b) {
                ((oug) ((oug) ekl.a.b()).G((char) 1224)).o("Failed to initialize omnistereo renderer");
                result = null;
            } else {
                progressCallback.setProgress(0.2f);
                fA = 0.0f;
                while (true) {
                    if (fA < 1.0f) {
                        eklVar = eklVar2;
                        z2 = true;
                        break;
                    }
                    if (!ekwVar.c()) {
                        eklVar = eklVar2;
                        z2 = true;
                        break;
                    }
                    eklVar = eklVar2;
                    if (!nldVar.d.tryAcquire(10000L, TimeUnit.MILLISECONDS)) {
                        z2 = true;
                        break;
                    }
                    nldVar.c.updateTexImage();
                    name = nldVar.b.getName();
                    integer = ekwVar.d.getInteger("width");
                    integer2 = ekwVar.d.getInteger("height");
                    if (omnistereoRendererImpl.b) {
                        omnistereoRendererImpl.nativeApplyTexture(omnistereoRendererImpl.a, name, integer, integer2);
                        omnistereoRendererImpl.a++;
                    }
                    progressCallback.setProgress((fA * 0.75f) + 0.2f);
                    fA = ekwVar.a();
                    eklVar2 = eklVar;
                }
                if (ekwVar.f) {
                    ekwVar.h.stop();
                    ekwVar.h.release();
                    ekwVar.c.release();
                    ekwVar.f = false;
                }
                surface.release();
                nldVar.c.release();
                nldVar.b.delete();
                if (z2) {
                    result = ejqVarA.getResult(eklVar.c);
                } else {
                    result = null;
                }
                progressCallback.setProgress(1.0f);
                omnistereoRendererImpl.nativeRelease();
                omnistereoRendererImpl.b = false;
                nlbVar.a();
            }
        } else {
            ((oug) ((oug) ekl.a.b()).G((char) 1225)).r("Failed to open video file %s", eklVar2.g.b());
            atomicReference = atomicReference2;
            result = stereoPanorama;
        }
        atomicReference.set(result);
    }
}
