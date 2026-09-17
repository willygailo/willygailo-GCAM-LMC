package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class epq implements odd {
    public final /* synthetic */ List a;
    private final /* synthetic */ int b;

    public /* synthetic */ epq(List list, int i) {
        this.b = i;
        this.a = list;
    }

    @Override // defpackage.odd
    public final void a(ocx ocxVar, int i) {
        switch (this.b) {
            case 0:
                List list = this.a;
                ocxVar.e = LayoutInflater.from(ocxVar.h.getContext()).inflate(R.layout.tab, (ViewGroup) ocxVar.h, false);
                ocxVar.b();
                ocxVar.c(((epv) list.get(i)).b);
                ocxVar.a = ((epv) list.get(i)).a;
                View view = ocxVar.e;
                view.getClass();
                epw.b((TextView) view.findViewById(android.R.id.text1), epr.b);
                break;
            default:
                List list2 = this.a;
                Integer num = cuk.a;
                ocxVar.c((CharSequence) list2.get(i));
                break;
        }
    }
}
