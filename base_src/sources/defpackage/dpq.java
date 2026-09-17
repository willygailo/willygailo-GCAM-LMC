package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

/* JADX INFO: loaded from: classes.dex */
final class dpq implements TextureFrame {
    final /* synthetic */ int a;
    final /* synthetic */ mrf b;
    final /* synthetic */ long c;

    public dpq(int i, mrf mrfVar, long j) {
        this.a = i;
        this.b = mrfVar;
        this.c = j;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.b.b().a.a();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        return this.a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.c;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.b.b().a.b();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void release() {
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
    }
}
