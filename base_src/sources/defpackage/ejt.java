package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ejt implements eko {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/audio/AudioEncoder");
    public MediaCodec b;
    public boolean c;
    public boolean d;
    private final MediaFormat e;

    public ejt() throws IOException {
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 1);
        this.c = false;
        this.d = false;
        this.b = mediaCodecCreateEncoderByType;
        this.e = mediaFormatCreateAudioFormat;
    }

    @Override // defpackage.eko
    public final MediaCodec a() {
        return this.b;
    }

    @Override // defpackage.eko
    public final void b() {
        this.c = true;
    }

    @Override // defpackage.eko
    public final void c() {
        this.d = false;
        this.b.stop();
        this.b.release();
    }

    @Override // defpackage.eko
    public final boolean d() {
        if (this.d) {
            ((oug) ((oug) a.b()).G((char) 1204)).o("AudioEncoder already started!");
            return true;
        }
        this.e.setInteger("aac-profile", 2);
        this.e.setInteger("bitrate", 128000);
        this.e.setInteger("max-input-size", 16384);
        try {
            this.b.configure(this.e, (Surface) null, (MediaCrypto) null, 1);
            this.b.start();
            this.d = true;
            return true;
        } catch (Exception e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1203)).o("Exception when configuring MediaCodec.");
            this.b.release();
            try {
                this.b = MediaCodec.createEncoderByType("audio/mp4a-latm");
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }
}
