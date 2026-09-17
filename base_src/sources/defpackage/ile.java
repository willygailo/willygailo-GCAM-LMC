package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ile extends RecyclerView {
    public ile(Context context) {
        super(context);
        setFocusable(false);
        setOverScrollMode(2);
        this.s = true;
        setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.settings_changed_view_padding_start), 0, 0, 0);
        getContext();
        V(new LinearLayoutManager());
        am(new ilb(getResources()));
        U(new ild(getResources()));
    }
}
