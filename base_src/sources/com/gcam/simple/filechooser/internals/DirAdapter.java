package com.gcam.simple.filechooser.internals;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class DirAdapter extends ArrayAdapter {
    private static final Object a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static SimpleDateFormat f0a;
    private static TypedValue b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    List f1b;

    public DirAdapter(Context context, List list, int i) {
        super(context, i, R.id.text1, list);
        a(list, (String) null);
        a = new Object();
    }

    public DirAdapter(Context context, List list, int i, int i2) {
        super(context, i, i2, list);
        a(list, (String) null);
    }

    public DirAdapter(Context context, List list, int i, String str) {
        super(context, i, R.id.text1, list);
        a(list, str);
    }

    public static Drawable a(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (a) {
            if (b == null) {
                b = new TypedValue();
            }
            context.getResources().getValue(i, b, true);
            i2 = b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    private void a(List list, String str) {
        f0a = new SimpleDateFormat((str == null || "".equals(str.trim())) ? "yyyy/MM/dd HH:mm:ss" : str.trim(), Locale.ENGLISH);
        this.f1b = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        SimpleDateFormat simpleDateFormat;
        Date date;
        ViewGroup viewGroup2 = (ViewGroup) super.getView(i, view, viewGroup);
        if (viewGroup2 == null) {
            return null;
        }
        TextView textView = (TextView) viewGroup2.findViewById(R.id.text1);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.txt_size);
        TextView textView3 = (TextView) viewGroup2.findViewById(R.id.txt_date);
        textView3.setVisibility(0);
        File file = (File) this.f1b.get(i);
        if (file != null) {
            if (file.isDirectory()) {
                textView.setText(((File) this.f1b.get(i)).getName());
                textView.setCompoundDrawablesWithIntrinsicBounds(a(getContext(), R.drawable.quantum_gm_ic_info_outline_black_24), (Drawable) null, (Drawable) null, (Drawable) null);
                textView2.setText("");
                if (!((File) this.f1b.get(i)).getName().trim().equals("..")) {
                    simpleDateFormat = f0a;
                    date = new Date(file.lastModified());
                }
                return viewGroup2;
            }
            textView.setText(((File) this.f1b.get(i)).getName());
            textView.setCompoundDrawablesWithIntrinsicBounds(a(getContext(), R.drawable.quantum_gm_ic_info_outline_black_24), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setText(FileUtil.getReadableFileSize(file.length()));
            simpleDateFormat = f0a;
            date = new Date(file.lastModified());
            textView3.setText(simpleDateFormat.format(date));
            return viewGroup2;
        }
        textView.setText("..");
        textView.setCompoundDrawablesWithIntrinsicBounds(a(getContext(), R.drawable.ic_arrow_down_24dp), (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setVisibility(8);
        return viewGroup2;
    }
}
