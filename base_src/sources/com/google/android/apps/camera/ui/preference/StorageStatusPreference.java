package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.preference.Preference;
import android.text.SpannableString;
import android.text.format.Formatter;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes.dex */
public class StorageStatusPreference extends Preference {
    private static final Typeface h = Typeface.create("sans-serif-medium", 0);
    public long a;
    public long b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    private View i;
    private TextView j;
    private TextView k;
    private ProgressBar l;

    public StorageStatusPreference(Context context) {
        super(context);
        this.a = -1L;
        this.b = -1L;
    }

    public StorageStatusPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1L;
        this.b = -1L;
    }

    public StorageStatusPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1L;
        this.b = -1L;
    }

    public final void a() {
        ProgressBar progressBar;
        int i;
        int i2;
        if (this.j == null || this.k == null || (progressBar = this.l) == null) {
            return;
        }
        long j = this.b;
        progressBar.setProgress(Math.round(100.0f - (j == 0 ? 0.0f : (this.a * 100.0f) / j)));
        Resources resources = getContext().getResources();
        this.j.setText(resources.getString(R.string.storage_remaining, Formatter.formatFileSize(getContext(), this.a)));
        NumberFormat numberFormat = NumberFormat.getInstance();
        String str = numberFormat.format(this.c);
        String str2 = numberFormat.format(this.d);
        String string = resources.getString(R.string.storage_estimate, resources.getQuantityString(R.plurals.photos_remaining, this.c, str), resources.getQuantityString(R.plurals.videos_remaining, this.d, str2));
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf(str);
        if (iIndexOf != -1) {
            spannableString.setSpan(new TypefaceSpan(h), iIndexOf, str.length() + iIndexOf, 33);
        }
        int iLastIndexOf = string.lastIndexOf(str2);
        if (iLastIndexOf != -1) {
            spannableString.setSpan(new TypefaceSpan(h), iLastIndexOf, str2.length() + iLastIndexOf, 33);
        }
        this.k.setText(spannableString);
        if (this.e) {
            return;
        }
        if (this.g) {
            i = R.color.storage_card_background_out;
            i2 = R.drawable.storage_progress_out;
        } else if (this.f) {
            i = R.color.storage_card_background_low;
            i2 = R.drawable.storage_progress_low;
        } else {
            i = R.color.storage_card_background_normal;
            i2 = R.drawable.storage_progress_normal;
        }
        this.i.setBackgroundColor(getContext().getResources().getColor(i, null));
        this.l.setProgressDrawable(resources.getDrawable(i2, null));
    }

    @Override // android.preference.Preference
    protected final void onBindView(View view) {
        super.onBindView(view);
        this.i = view;
        this.j = (TextView) view.findViewById(R.id.storage_used);
        this.k = (TextView) view.findViewById(R.id.storage_remaining);
        this.l = (ProgressBar) view.findViewById(R.id.storage_progressbar);
        a();
    }
}
