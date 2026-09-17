package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class jzh {
    private ius a;

    public final void a(ius iusVar) {
        this.a = iusVar;
    }

    public final void b(Context context) {
        if (this.a == null) {
            return;
        }
        lar.a();
        FrameLayout frameLayout = new FrameLayout(context);
        View.inflate(context, R.layout.chameleon_edu_layout, frameLayout);
        TextView textView = (TextView) frameLayout.findViewById(R.id.wb_edu_information);
        String string = context.getString(R.string.wb_education_bottom_sheet_info);
        String string2 = context.getString(R.string.wb_education_bottom_sheet_information_settings);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new jzg(context), spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        textView.setLinkTextColor(mip.dR(textView));
        EduImageView eduImageView = (EduImageView) frameLayout.findViewById(R.id.wb_edu_image);
        eduImageView.b(context.getString(R.string.wb_edu_image_url), context.getString(R.string.wb_edu_image_content_description));
        eduImageView.a();
        this.a.g(11, R.string.wb_education_bottom_sheet_title, frameLayout, null, context);
    }
}
