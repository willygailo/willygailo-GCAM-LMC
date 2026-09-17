package defpackage;

import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.AndroidModelExtractor;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class igh implements Runnable {
    public final /* synthetic */ igq a;
    private final /* synthetic */ int b;

    public /* synthetic */ igh(igq igqVar, int i) {
        this.b = i;
        this.a = igqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                igq igqVar = this.a;
                try {
                    igqVar.j = Paths.get(AndroidModelExtractor.a(igqVar.b), new String[0]);
                } catch (Exception e) {
                    ((oug) ((oug) ((oug) igq.a.b()).h(e)).G((char) 2901)).o("Failed to extract the directory of streaming model assets.");
                }
                plk.af(igqVar.d.submit(new ogr(0)), new igm(igqVar, igqVar.g.a("SEController#initLibrary")), pgr.INSTANCE);
                break;
            case 1:
                this.a.l.a.a();
                break;
            default:
                this.a.l.a.g();
                break;
        }
    }
}
