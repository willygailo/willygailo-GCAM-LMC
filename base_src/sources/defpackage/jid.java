package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jid implements View.OnClickListener {
    public final /* synthetic */ Button a;
    private final /* synthetic */ int b;

    public /* synthetic */ jid(Button button, int i) {
        this.b = i;
        this.a = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                this.a.performClick();
                break;
            default:
                Button button = this.a;
                int i = ManagedSwitchPreference.n;
                button.performClick();
                break;
        }
    }
}
