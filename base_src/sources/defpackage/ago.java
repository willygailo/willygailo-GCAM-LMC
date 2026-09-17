package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ago implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    private final Preference a;

    public ago(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence charSequenceM = this.a.m();
        if (!this.a.z || TextUtils.isEmpty(charSequenceM)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceM);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ClipboardManager clipboardManager = (ClipboardManager) this.a.j.getSystemService("clipboard");
        CharSequence charSequenceM = this.a.m();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceM));
        Context context = this.a.j;
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceM), 0).show();
        return true;
    }
}
