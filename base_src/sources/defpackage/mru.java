package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import com.google.android.apps.camera.bottombar.R;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class mru implements AutoCloseable {
    public long a = 0;
    public final /* synthetic */ ByteBuffer b;
    final /* synthetic */ int c;
    final /* synthetic */ mrx d;

    public mru(mrx mrxVar, ByteBuffer byteBuffer, int i) {
        this.d = mrxVar;
        this.b = byteBuffer;
        this.c = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.d.k.remove(this)) {
                try {
                    this.d.a.queueInputBuffer(this.c, 0, this.b.position(), this.a, 0);
                } catch (MediaCodec.CodecException e) {
                    mrx mrxVar = this.d;
                    mrxVar.j.onError(mrxVar.a, e);
                } catch (Throwable th) {
                    Log.e("AsynchMediaCodec", "Exception caught while attempting to queue input buffer.", th);
                }
            } else {
                long j = this.a;
                StringBuilder sb = new StringBuilder(R.styleable.AppCompatTheme_windowNoTitle);
                sb.append("Trying to submit input buffer for timestamp ");
                sb.append(j);
                sb.append(" but it has been closed already (... or the codec was stopped)");
                Log.w("AsynchMediaCodec", sb.toString());
            }
        }
    }
}
