package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fjk implements fjt {
    private static final ouj a = ouj.h("com/google/android/apps/camera/logging/LocalCameraEventLogger");
    private FileOutputStream b;
    private final File c;

    public fjk(Context context) {
        FileOutputStream fileOutputStream;
        File file = new File(new File(context.getFilesDir(), "camera_events"), "session.pb");
        this.c = file;
        file.getPath();
        try {
            oxh.v(file);
            fileOutputStream = new FileOutputStream(file, true);
        } catch (IOException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1724)).o("Failed to create logging file!");
            fileOutputStream = null;
        }
        this.b = fileOutputStream;
    }

    @Override // defpackage.fjt
    public final void a(pac pacVar) {
        try {
            synchronized (this) {
                FileOutputStream fileOutputStream = this.b;
                if (fileOutputStream != null) {
                    poy poyVar = (poy) pacVar.G(5);
                    poyVar.o(pacVar);
                    poy poyVarM = pay.c.m();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pay payVar = (pay) poyVarM.b;
                    payVar.a |= 1;
                    payVar.b = jCurrentTimeMillis;
                    if (poyVar.c) {
                        poyVar.m();
                        poyVar.c = false;
                    }
                    pac pacVar2 = (pac) poyVar.b;
                    pay payVar2 = (pay) poyVarM.j();
                    pac pacVar3 = pac.aq;
                    payVar2.getClass();
                    pacVar2.X = payVar2;
                    pacVar2.b |= 134217728;
                    pac pacVar4 = (pac) poyVar.j();
                    int iA = pacVar4.aG;
                    if (iA == -1) {
                        iA = pqu.a.b(pacVar4).a(pacVar4);
                        pacVar4.aG = iA;
                    }
                    pom pomVarAj = pom.aj(fileOutputStream, pom.U(pom.ad(iA) + iA));
                    pomVarAj.C(iA);
                    pacVar4.fD(pomVarAj);
                    pomVarAj.i();
                    FileOutputStream fileOutputStream2 = this.b;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            this.b = null;
                            this.b = new FileOutputStream(this.c, true);
                        } catch (IOException e) {
                            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1727)).o("Failed to re-open logging file!");
                        }
                    }
                }
            }
        } catch (IOException e2) {
            ((oug) ((oug) ((oug) a.b()).h(e2)).G((char) 1728)).o("Failed to log an event!");
        }
    }
}
