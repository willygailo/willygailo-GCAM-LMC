package com.google.android.apps.camera.ui.eduimageview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.fyb;
import defpackage.iuz;
import defpackage.jap;
import defpackage.nyj;

/* JADX INFO: loaded from: classes.dex */
public class EduImageView extends FrameLayout {
    public ImageView a;
    public TextView b;

    public EduImageView(Context context) {
        super(context);
    }

    public EduImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EduImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void c(Context context) {
        Resources resources = context.getResources();
        nyj nyjVar = new nyj(context, 2132083558);
        nyjVar.t(resources.getString(R.string.internet_required));
        nyjVar.m(resources.getString(R.string.connect_internet_for_examples));
        nyjVar.r(resources.getString(R.string.dialog_ok_cased), fyb.a);
        nyjVar.c();
    }

    public final void a() {
        this.a.setBackgroundColor(0);
    }

    public final void b(String str, String str2) {
        d(str, str2, null);
    }

    public final void d(String str, String str2, iuz iuzVar) {
        new jap(this, getContext(), str, str2, iuzVar).b(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.eduimageview, this);
        this.a = (ImageView) findViewById(R.id.imageview);
        this.b = (TextView) findViewById(R.id.textview_offline);
    }
}
