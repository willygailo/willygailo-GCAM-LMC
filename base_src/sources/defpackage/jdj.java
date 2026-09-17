package defpackage;

import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.mars.MarsSwitch;

/* JADX INFO: loaded from: classes2.dex */
final class jdj implements phh {
    final /* synthetic */ MarsSwitch a;
    final /* synthetic */ jhp b;
    final /* synthetic */ jdk c;

    public jdj(jdk jdkVar, MarsSwitch marsSwitch, jhp jhpVar) {
        this.c = jdkVar;
        this.a = marsSwitch;
        this.b = jhpVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.c.f();
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        nho nhoVar = (nho) obj;
        if (nhoVar == nho.SETUP_COMPLETE) {
            this.c.e.e(htu.ab, true);
            this.a.b(this.b, this.c.g.k(ddl.ay));
            return;
        }
        jcz jczVar = this.c.f;
        nhoVar.getClass();
        if (nhoVar == nho.NEEDS_ONBOARDING) {
            jczVar.a.f(9, -1, jczVar.c);
        } else {
            TextView textView = (TextView) jczVar.d.findViewById(R.id.ineligible_reason);
            switch (nhoVar.ordinal()) {
                case 2:
                    textView.setText(R.string.mars_not_available_reason_account);
                    break;
                case 6:
                    textView.setText(R.string.mars_not_available_reason_work_profile);
                    break;
            }
            jczVar.a.f(9, R.string.mars_not_available, jczVar.d);
        }
        this.c.f();
    }
}
