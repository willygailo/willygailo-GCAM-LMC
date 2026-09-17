package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cuk extends iux implements cum {
    public static final Integer a = 1;

    public cuk(Context context, ius iusVar, ddf ddfVar) {
        super(ddfVar, context, iusVar);
    }

    @Override // defpackage.cum
    public final void a() {
        Context context = this.h;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new iuu(context.getString(R.string.stabilization_edu_standard_title), context.getString(R.string.stabilization_edu_standard_subtitle), oom.m(msq.a("https://www.gstatic.com/aiux/gca/stabilization/Standard_EDUPanel_376x320.gif")), context.getString(R.string.stabilization_edu_standard_sidebyside_video_announcement), context.getString(R.string.stabilization_edu_caption_unstabilized)));
        arrayList2.add(context.getString(R.string.stabilization_edu_tab_label_standard));
        if (this.f.k(dcu.T)) {
            arrayList.add(new iuu(context.getString(R.string.stabilization_edu_locked_title), context.getString(R.string.stabilization_edu_locked_subtitle), oom.m(msq.a("https://www.gstatic.com/aiux/gca/stabilization/Locked_EDUPanel_376x320.gif")), context.getString(R.string.stabilization_edu_locked_sidebyside_video_announcement), context.getString(R.string.stabilization_edu_caption_unstabilized)));
            arrayList2.add(context.getString(R.string.stabilization_edu_tab_label_locked));
        }
        if (this.f.k(dcu.U)) {
            arrayList.add(new iuu(context.getString(R.string.stabilization_edu_active_title), context.getString(R.string.stabilization_edu_active_subtitle), oom.m(msq.a("https://www.gstatic.com/aiux/gca/stabilization/Active_EDUPanel_376x320.gif")), context.getString(R.string.stabilization_edu_active_sidebyside_video_announcement), context.getString(R.string.stabilization_edu_caption_unstabilized)));
            arrayList2.add(context.getString(R.string.stabilization_edu_tab_label_active));
        }
        if (this.f.k(dcu.V)) {
            arrayList.add(new iuu(context.getString(R.string.stabilization_edu_panning_title), context.getString(R.string.stabilization_edu_panning_subtitle), oom.m(msq.a("https://www.gstatic.com/aiux/gca/stabilization/Panning_EDUPanel_376x320.gif")), context.getString(R.string.stabilization_edu_panning_sidebyside_video_announcement), context.getString(R.string.stabilization_edu_caption_unstabilized)));
            arrayList2.add(context.getString(R.string.stabilization_edu_tab_label_panning));
        }
        View viewE = e();
        f(viewE, arrayList, a.intValue(), null, new epq(arrayList2, 1));
        g(3, viewE, context, null);
    }
}
