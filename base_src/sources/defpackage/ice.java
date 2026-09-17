package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class ice extends ResolveInfo {
    final /* synthetic */ icf a;
    final /* synthetic */ int b;

    public ice(icf icfVar, int i) {
        this.a = icfVar;
        this.b = i;
    }

    @Override // android.content.pm.ResolveInfo
    public final Drawable loadIcon(PackageManager packageManager) {
        icf icfVar = this.a;
        int i = this.b;
        bua buaVar = bua.CAMERA_PREVIEW;
        switch (i - 1) {
            case 1:
                Drawable drawable = icfVar.b.getDrawable(R.drawable.social_app_black_add_icon);
                drawable.getClass();
                return drawable;
            default:
                Drawable drawable2 = icfVar.b.getDrawable(R.drawable.social_app_settings_icon);
                drawable2.getClass();
                return drawable2;
        }
    }

    @Override // android.content.pm.ResolveInfo
    public final CharSequence loadLabel(PackageManager packageManager) {
        return this.b == 2 ? this.a.b.getString(R.string.label_add_social_apps) : this.a.b.getString(R.string.label_social_share_setting);
    }
}
