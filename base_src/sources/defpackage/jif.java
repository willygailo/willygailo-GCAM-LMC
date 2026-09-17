package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import com.google.android.apps.camera.ui.preference.MaterialManagedSwitchPreference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jif implements View.OnClickListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ ImageView b;
    private final /* synthetic */ int c;

    public /* synthetic */ jif(FrameLayout frameLayout, ImageView imageView, int i) {
        this.c = i;
        this.a = frameLayout;
        this.b = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                FrameLayout frameLayout = this.a;
                ImageView imageView = this.b;
                frameLayout.setVisibility(frameLayout.getVisibility() != 0 ? 0 : 8);
                imageView.setImageResource(MaterialManagedSwitchPreference.af(frameLayout));
                break;
            default:
                FrameLayout frameLayout2 = this.a;
                ImageView imageView2 = this.b;
                frameLayout2.setVisibility(frameLayout2.getVisibility() != 0 ? 0 : 8);
                imageView2.setImageResource(ManagedSwitchPreference.c(frameLayout2));
                break;
        }
    }
}
