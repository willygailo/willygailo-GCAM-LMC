package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cmy implements imr {
    public final cry a;
    public final imt b;
    public final ddf c;
    public final imw d;
    public final imw e;
    public final imw f;
    public final imw g;
    public cmu h;
    public crx i;
    public List j;
    public lie k;
    public ims l;
    private final hug m;

    public cmy(final Resources resources, final jhh jhhVar, cry cryVar, final cvo cvoVar, imt imtVar, ims imsVar, lar larVar, final huf hufVar, hug hugVar, ddf ddfVar) {
        this.a = cryVar;
        this.b = imtVar;
        this.m = hugVar;
        this.c = ddfVar;
        this.g = f(larVar, "StopRecordingInCritial", ims.HEAT_CRITICAL, jhhVar);
        this.d = f(larVar, "VideoRecording", ims.HEAT_EMERGENCY, jhhVar);
        imv imvVarA = imw.a();
        imvVarA.c(larVar);
        imvVarA.a = "PoorVideoQualityWarning";
        imvVarA.f(ims.HEAT_CRITICAL);
        int i = 0;
        imvVarA.d(new cmx(this, jhhVar, i));
        imvVarA.e(bvf.b);
        this.e = imvVarA.a();
        imv imvVarA2 = imw.a();
        imvVarA2.c(larVar);
        imvVarA2.a = "VideoTorch";
        imvVarA2.f(imsVar);
        imvVarA2.d(new Runnable() { // from class: cmw
            @Override // java.lang.Runnable
            public final void run() {
                cmy cmyVar = this.a;
                huf hufVar2 = hufVar;
                Resources resources2 = resources;
                cvo cvoVar2 = cvoVar;
                jhh jhhVar2 = jhhVar;
                cmyVar.b(true);
                if (((String) hufVar2.c(htu.l)).equals(resources2.getString(R.string.pref_camera_video_flashmode_torch)) && cvoVar2.i()) {
                    jhhVar2.e(ims.HEAT_SEVERE, cmyVar.e());
                }
            }
        });
        imvVarA2.e(new cmv(this, i));
        this.f = imvVarA2.a();
    }

    private final imw f(Executor executor, String str, ims imsVar, jhh jhhVar) {
        imv imvVarA = imw.a();
        imvVarA.c(executor);
        imvVarA.a = str;
        imvVarA.f(imsVar);
        int i = 1;
        imvVarA.d(new cmx(this, jhhVar, i));
        imvVarA.e(new cmv(this, i));
        return imvVarA.a();
    }

    public final synchronized ims a() {
        return this.b.c();
    }

    public final void b(boolean z) {
        this.m.e(htu.o, Boolean.valueOf(z));
    }

    @Override // defpackage.imr
    public final synchronized void c(ims imsVar) {
        otj it = ((oom) this.j).iterator();
        while (it.hasNext()) {
            ((imr) it.next()).c(imsVar);
        }
    }

    public final synchronized void d() {
        lie lieVar = this.k;
        if (lieVar != null) {
            lieVar.close();
            this.k = null;
        }
    }

    public final boolean e() {
        return this.i.fK();
    }
}
