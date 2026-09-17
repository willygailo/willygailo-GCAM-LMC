package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class ild extends pu {
    private final String[] d;
    private final String[] e;

    public ild(Resources resources) {
        this.d = resources.getStringArray(R.array.pref_awb_entryvalues);
        this.e = resources.getStringArray(R.array.pref_grgb_entries);
    }

    @Override // defpackage.pu
    public final int a() {
        return this.d.length;
    }

    @Override // defpackage.pu
    public final /* bridge */ /* synthetic */ qs d(ViewGroup viewGroup, int i) {
        return new ilc(new TextView(viewGroup.getContext()));
    }

    @Override // defpackage.pu
    public final /* bridge */ /* synthetic */ void e(qs qsVar, int i) {
        ilc ilcVar = (ilc) qsVar;
        Context context = ilcVar.s.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.d[i], new TextAppearanceSpan(context, R.style.ChangedSettingsText), 33);
        spannableStringBuilder.append('\n');
        spannableStringBuilder.append(this.e[i], new TextAppearanceSpan(context, R.style.ChangedSettingsDetailText), 33);
        ilcVar.s.setText(spannableStringBuilder);
        TextView textView = ilcVar.s;
        String strValueOf = String.valueOf(context.getString(R.string.settings_changed_item_description, this.d[i]));
        String strValueOf2 = String.valueOf(this.e[i]);
        textView.setContentDescription(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }
}
