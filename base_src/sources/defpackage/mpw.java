package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
final class mpw implements mqa {
    final /* synthetic */ String a;
    final /* synthetic */ float b;

    public mpw(String str, float f) {
        this.a = str;
        this.b = f;
    }

    @Override // defpackage.mqa
    public final void a(mqy mqyVar) {
        GLES20.glUniform1f(mqyVar.b(this.a), this.b);
    }
}
