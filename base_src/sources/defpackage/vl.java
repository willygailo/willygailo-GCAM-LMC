package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "androidx.camera.camera2.pipe.compat.Camera2CameraDevices$findAll$1", c = "Camera2CameraDevices.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_activityChooserViewStyle})
public final class vl extends qmb implements qmy {
    int a;
    final /* synthetic */ vm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(vm vmVar, qlh qlhVar) {
        super(2, qlhVar);
        this.b = vmVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new vl(this.b, qlhVar);
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((vl) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        List list;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (this.a) {
            case 0:
                qmd.M(obj);
                vq vqVar = this.b.a;
                this.a = 1;
                synchronized (vqVar.b) {
                    list = vqVar.c;
                }
                obj = (list == null || list.isEmpty()) ? qmd.k(vqVar.a.b, new vp(vqVar, null), this) : list;
                return obj == qlpVar ? qlpVar : obj;
            default:
                qmd.M(obj);
        }
    }
}
