package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ctn extends jdy {
    public final Context a;
    public final iqn b;
    public final lda c;
    public final String d;
    public final String e;
    public final LinkedHashMap f;
    public final lce g;

    public ctn(Context context, iqn iqnVar, lce lceVar, lda ldaVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f = linkedHashMap;
        this.a = context;
        this.b = iqnVar;
        this.g = lceVar;
        this.c = ldaVar;
        jdz jdzVar = new jdz(jrl.SLOW_MOTION, jri.b(jrl.SLOW_MOTION).d(context.getResources()), jri.b(jrl.SLOW_MOTION).c(context.getResources()), false);
        jdz jdzVar2 = new jdz(jrl.VIDEO, context.getString(R.string.video_mode_title), context.getString(R.string.accessibility_video_mode_desc));
        jdz jdzVar3 = new jdz(jrl.TIME_LAPSE, jri.b(jrl.TIME_LAPSE).d(context.getResources()), jri.b(jrl.TIME_LAPSE).c(context.getResources()));
        this.h.add(jdzVar);
        this.h.add(jdzVar2);
        this.h.add(jdzVar3);
        linkedHashMap.put(jrl.SLOW_MOTION, jdzVar);
        linkedHashMap.put(jrl.VIDEO, jdzVar2);
        linkedHashMap.put(jrl.TIME_LAPSE, jdzVar3);
        this.d = context.getString(R.string.hfr_record_speed, 1, 4);
        this.e = context.getString(R.string.hfr_record_speed, 1, 8);
    }

    public final void a(jrl jrlVar) {
        if (this.f.containsKey(jrlVar)) {
            return;
        }
        String strValueOf = String.valueOf(jrlVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
        sb.append("Unsupported mode: ");
        sb.append(strValueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
