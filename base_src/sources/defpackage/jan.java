package defpackage;

import android.view.View;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;

/* JADX INFO: loaded from: classes2.dex */
final class jan implements bkw {
    final /* synthetic */ jap a;
    private final /* synthetic */ int b;

    public jan(jap japVar, int i) {
        this.b = i;
        this.a = japVar;
    }

    @Override // defpackage.bkw
    public final void l(bcg bcgVar) {
        switch (this.b) {
            case 0:
                this.a.b.a.setOnClickListener(new View.OnClickListener() { // from class: jam
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.a.b(true);
                    }
                });
                this.a.c();
                break;
            case 1:
                this.a.b.a.setImportantForAccessibility(2);
                break;
            default:
                this.a.b.a.setOnClickListener(new View.OnClickListener() { // from class: jao
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EduImageView.c(view.getContext());
                    }
                });
                this.a.c();
                break;
        }
    }

    @Override // defpackage.bkw
    public final /* synthetic */ void m(Object obj) {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            case 1:
                this.a.a();
                break;
            default:
                this.a.a();
                break;
        }
    }
}
