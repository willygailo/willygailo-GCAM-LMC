package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class hgb extends iam {
    public final fvv a;
    public final cbl b;
    public boolean c;
    private final Resources d;
    private final lco e;
    private Rect f;

    public hgb(Resources resources, fvv fvvVar, lco lcoVar, ScheduledExecutorService scheduledExecutorService, cbl cblVar) {
        super(scheduledExecutorService);
        this.d = resources;
        this.a = fvvVar;
        this.e = lcoVar;
        this.b = cblVar;
    }

    @Override // defpackage.iam, defpackage.ias
    public final void c(lvp lvpVar) {
        super.c(lvpVar);
        this.f = (Rect) lvpVar.l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    @Override // defpackage.iam
    protected final ial d() {
        iaw iawVarA = iax.a();
        iawVarA.b = this.d.getString(R.string.portrait_suggestion_text);
        iawVarA.c = this.d.getDrawable(R.drawable.quantum_gm_ic_portrait_white_24, null);
        final int i = 1;
        iawVarA.d = new Runnable(this) { // from class: hga
            public final /* synthetic */ hgb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.a.c = true;
                        break;
                    case 1:
                        this.a.a.b(jrl.PORTRAIT);
                        break;
                    default:
                        this.a.b.f(jrl.PORTRAIT);
                        break;
                }
            }
        };
        final int i2 = 0;
        iawVarA.g = new Runnable(this) { // from class: hga
            public final /* synthetic */ hgb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.a.c = true;
                        break;
                    case 1:
                        this.a.a.b(jrl.PORTRAIT);
                        break;
                    default:
                        this.a.b.f(jrl.PORTRAIT);
                        break;
                }
            }
        };
        final int i3 = 2;
        iawVarA.h = new Runnable(this) { // from class: hga
            public final /* synthetic */ hgb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.a.c = true;
                        break;
                    case 1:
                        this.a.a.b(jrl.PORTRAIT);
                        break;
                    default:
                        this.a.b.f(jrl.PORTRAIT);
                        break;
                }
            }
        };
        iawVarA.d(5000L);
        iax iaxVarA = iawVarA.a();
        iak iakVarA = ial.a();
        iakVarA.a = iaxVarA;
        iakVarA.b(30);
        iakVarA.c(5);
        return iakVarA.a();
    }

    @Override // defpackage.iam
    protected final boolean e(lzv lzvVar) {
        Face[] faceArr;
        if (this.c || (faceArr = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES)) == null) {
            return false;
        }
        for (Face face : faceArr) {
            Rect bounds = face.getBounds();
            int iWidth = bounds.width();
            Rect rect = this.f;
            rect.getClass();
            int iWidth2 = rect.width();
            int iHeight = bounds.height();
            Rect rect2 = this.f;
            rect2.getClass();
            if ((iWidth / iWidth2) * (iHeight / rect2.height()) < 0.05f) {
                return false;
            }
        }
        int length = faceArr.length;
        return length > 0 && length <= 1 && ((Float) this.e.fA()).floatValue() >= 1.0f;
    }
}
