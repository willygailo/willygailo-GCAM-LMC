package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class jhr {
    final ViewGroup a;
    final ViewGroup b;
    final TextView c;
    final TextView d;
    final ImageView e;
    final ImageView f;

    public jhr(View view, boolean z) {
        this.a = (ViewGroup) view.findViewById(R.id.item_framelayout_inner);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.item_linearlayout_row_container);
        this.b = viewGroup;
        TextView textView = (TextView) view.findViewById(R.id.item_title);
        this.c = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.item_description);
        this.d = textView2;
        ImageView imageView = (ImageView) view.findViewById(R.id.item_button_icon);
        this.e = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.item_button_icon_second);
        this.f = imageView2;
        if (z) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.topMargin = view.getResources().getDimensionPixelSize(R.dimen.menu_listview_row_container_vertical_margin_legacy);
        layoutParams.bottomMargin = view.getResources().getDimensionPixelSize(R.dimen.menu_listview_row_container_vertical_margin_legacy);
        layoutParams.leftMargin = view.getResources().getDimensionPixelSize(R.dimen.menu_listview_row_container_left_margin_legacy);
        layoutParams.rightMargin = view.getResources().getDimensionPixelSize(R.dimen.menu_listview_row_container_right_margin_legacy);
        viewGroup.setLayoutParams(layoutParams);
        imageView.setColorFilter(-1);
        imageView2.setColorFilter(-1);
        textView.setTextAppearance(R.style.ItemTitleTextStyle);
        textView.setPadding(view.getResources().getDimensionPixelSize(R.dimen.menu_listview_row_item_title_padding_start_legacy), 0, 0, 0);
        textView2.setTextAppearance(R.style.ItemDescriptionTextStyle);
        textView2.setPadding(view.getResources().getDimensionPixelSize(R.dimen.menu_listview_row_item_desc_padding_start_legacy), 0, 0, 0);
    }
}
