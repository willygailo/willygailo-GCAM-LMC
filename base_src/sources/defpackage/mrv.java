package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import com.google.android.apps.camera.bottombar.R;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mrv implements AutoCloseable {
    final /* synthetic */ MediaCodec a;
    public final /* synthetic */ ByteBuffer b;
    public final /* synthetic */ MediaCodec.BufferInfo c;
    final /* synthetic */ MediaCodec.LinearBlock d = null;
    final /* synthetic */ int e;
    final /* synthetic */ mrx f;

    public mrv(mrx mrxVar, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, MediaCodec.LinearBlock linearBlock, int i) {
        this.f = mrxVar;
        this.a = mediaCodec;
        this.b = byteBuffer;
        this.c = bufferInfo;
        this.e = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            if (!this.f.l.remove(this) || this.f.e.isDone()) {
                long j = this.c.presentationTimeUs;
                StringBuilder sb = new StringBuilder(R.styleable.AppCompatTheme_windowMinWidthMajor);
                sb.append("Trying to close output buffer at timestamp ");
                sb.append(j);
                sb.append(" but it has been closed or the codec has been stopped already");
                Log.w("AsynchMediaCodec", sb.toString());
                return;
            }
            try {
                this.a.releaseOutputBuffer(this.e, false);
                this.f.n.b(this.c.presentationTimeUs);
                this.f.a(this.c);
            } catch (MediaCodec.CodecException e) {
                mrx mrxVar = this.f;
                mrxVar.j.onError(mrxVar.a, e);
            } catch (Throwable th) {
                Log.e("AsynchMediaCodec", "Exception occurred while trying to release output buffer", th);
            }
        }
    }
}
