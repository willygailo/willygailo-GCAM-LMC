package defpackage;

import android.opengl.GLES20;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class mql implements Callable {
    final /* synthetic */ mqm a;

    public mql(mqm mqmVar) {
        this.a = mqmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        mqy mqyVar = new mqy(GLES20.glCreateProgram());
        try {
            try {
                Iterator it = this.a.a.iterator();
                while (it.hasNext()) {
                    GLES20.glAttachShader(mqyVar.b, ((mqz) ((mrd) ((mtu) it.next()).c()).c()).b);
                }
                GLES20.glLinkProgram(mqyVar.b);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(mqyVar.b, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    throw new mrk(GLES20.glGetProgramInfoLog(mqyVar.b));
                }
                Iterator it2 = this.a.a.iterator();
                while (it2.hasNext()) {
                    GLES20.glDetachShader(mqyVar.b, ((mqz) ((mrd) ((mtu) it2.next()).c()).c()).b);
                }
                this.a.a.close();
                return mqyVar;
            } catch (Exception e) {
                mqyVar.close();
                throw e;
            }
        } catch (Throwable th) {
            this.a.a.close();
            throw th;
        }
    }

    public final String toString() {
        int size = this.a.a.size();
        StringBuilder sb = new StringBuilder(26);
        sb.append("linkProgram(n=");
        sb.append(size);
        sb.append(")");
        return sb.toString();
    }
}
