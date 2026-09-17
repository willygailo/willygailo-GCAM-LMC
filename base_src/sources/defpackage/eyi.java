package defpackage;

import android.media.MediaFormat;
import android.os.HandlerThread;
import com.google.android.apps.camera.logging.InstrumentationCameraEventLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class eyi implements pys {
    private final /* synthetic */ int a;

    public eyi(int i) {
        this.a = i;
    }

    public static lda a() {
        lda ldaVar = fff.a;
        qmd.ae(ldaVar);
        return ldaVar;
    }

    public static MediaFormat b() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 2);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", 128000);
        mediaFormatCreateAudioFormat.setInteger("max-input-size", dvu.a * 10);
        mediaFormatCreateAudioFormat.setInteger("oo.muxer.force_sequential", 1);
        qmd.ae(mediaFormatCreateAudioFormat);
        return mediaFormatCreateAudioFormat;
    }

    public static MediaFormat c() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "application/microvideo-meta-stream");
        mediaFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        return mediaFormat;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return new fxk(jrl.LONG_EXPOSURE);
            case 1:
                return new fxk(jrl.IMAGE_INTENT);
            case 2:
                return new fxk(jrl.MOTION_BLUR);
            case 3:
                return new fxk(jrl.PORTRAIT);
            case 4:
                return new fxk(jrl.REWIND);
            case 5:
                throw null;
            case 6:
                return new InstrumentationCameraEventLogger();
            case 7:
                return new fjl();
            case 8:
                return new enl();
            case 9:
                return new jdy((char[]) null);
            case 10:
                return new Object() { // from class: fsj
                };
            case 11:
                return b();
            case 12:
                return c();
            case 13:
                ExecutorService executorServiceBM = mip.bM("mv-gyro-exec");
                qmd.ae(executorServiceBM);
                return executorServiceBM;
            case 14:
                return new AtomicBoolean(false);
            case 15:
                ExecutorService executorServiceBL = mip.bL("mv-writer", 4);
                qmd.ae(executorServiceBL);
                return executorServiceBL;
            case 16:
                ExecutorService executorServiceBM2 = mip.bM("mv-ctrl-exec");
                qmd.ae(executorServiceBM2);
                return executorServiceBM2;
            case 17:
                return new AtomicBoolean(false);
            case 18:
                HandlerThread handlerThread = new HandlerThread("mv-timeout-handler");
                handlerThread.start();
                return mip.bV(handlerThread.getLooper());
            case 19:
                return dqw.b("feature.acmi.imu.camera-orientation");
            default:
                return dqw.b("feature.acmi.imu.camera-pose");
        }
    }
}
