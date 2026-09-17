package defpackage;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
final class mpt implements mqa {
    final /* synthetic */ String a;
    final /* synthetic */ float[] b;
    private final /* synthetic */ int c;

    public mpt(String str, float[] fArr, int i) {
        this.c = i;
        this.a = str;
        this.b = fArr;
    }

    public mpt(float[] fArr, int i) {
        this.c = i;
        this.a = "uTransform";
        this.b = fArr;
    }

    @Override // defpackage.mqa
    public final void a(mqy mqyVar) {
        switch (this.c) {
            case 0:
                GLES20.glUniform1fv(mqyVar.b(this.a), 128, this.b, 0);
                break;
            default:
                GLES20.glUniformMatrix4fv(mqyVar.b(this.a), 1, false, this.b, 0);
                break;
        }
    }
}
