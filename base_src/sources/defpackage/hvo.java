package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hvo extends ldn {
    private final olt a;

    public hvo(Resources resources, hug hugVar) {
        super(hugVar.b(htu.f));
        this.a = oob.f(hvn.SHUTTER, resources.getString(R.string.preference_volume_key_shutter), hvn.ZOOM, resources.getString(R.string.preference_volume_key_zoom), hvn.VOLUME, resources.getString(R.string.preference_volume_key_volume), hvn.OFF, resources.getString(R.string.preference_volume_key_off));
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        hvn hvnVar = (hvn) ((orq) this.a).c.get((String) obj);
        return hvnVar != null ? hvnVar : hvn.SHUTTER;
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        String str = (String) this.a.get((hvn) obj);
        obr.ao(str);
        return str;
    }
}
