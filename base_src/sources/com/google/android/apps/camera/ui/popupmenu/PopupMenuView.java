package com.google.android.apps.camera.ui.popupmenu;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;
import defpackage.jhs;
import defpackage.jrz;
import defpackage.mip;

/* JADX INFO: loaded from: classes.dex */
public class PopupMenuView extends FrameLayout {
    public LinearLayout a;
    public ImageButton b;
    private final Context c;
    private jrz d;
    private LinearLayout e;
    private FrameLayout f;
    private TextView g;
    private int h;
    private int i;
    private jhs j;

    public PopupMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = jrz.PORTRAIT;
        this.c = context;
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.menu_layout, this);
        this.b = (ImageButton) findViewById(R.id.menu_help_button);
        this.a = (LinearLayout) findViewById(R.id.menu_inner_layout);
        this.e = (LinearLayout) findViewById(R.id.menu_background);
        this.f = (FrameLayout) findViewById(R.id.menu_header_container);
        this.g = (TextView) findViewById(R.id.menu_header_text);
    }

    public final void a(jrz jrzVar) {
        this.d = jrzVar;
        mip.et(this.a, jrzVar);
        if (this.h == 0 || this.i == 0) {
            this.h = this.e.getWidth();
            int height = this.e.getHeight();
            this.i = height;
            if (this.h == 0 || height == 0) {
                return;
            }
        }
        if (!jrzVar.equals(jrz.LANDSCAPE) && !jrzVar.equals(jrz.REVERSE_LANDSCAPE)) {
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            layoutParams.height = this.i;
            layoutParams.width = this.h;
            this.e.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.a.getLayoutParams();
            layoutParams2.height = this.i;
            layoutParams2.width = this.h;
            this.a.setTranslationY(0.0f);
            this.a.setTranslationX(0.0f);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = this.e.getLayoutParams();
        int iMin = Math.min(this.i, getResources().getDisplayMetrics().heightPixels - ((ViewGroup.MarginLayoutParams) ((ViewGroup) this.e.getParent()).getLayoutParams()).rightMargin);
        layoutParams3.height = this.h;
        layoutParams3.width = iMin;
        this.e.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.a.getLayoutParams();
        layoutParams4.height = iMin;
        layoutParams4.width = this.h;
        LinearLayout linearLayout = this.a;
        linearLayout.setTranslationY((linearLayout.getWidth() - this.a.getHeight()) / 2);
        LinearLayout linearLayout2 = this.a;
        linearLayout2.setTranslationX((linearLayout2.getHeight() - this.a.getWidth()) / 2);
    }

    public final void b() {
        setVisibility(8);
    }

    public final void c(int i, final jhs jhsVar, int i2, boolean z) {
        ListView listView = (ListView) findViewById(R.id.option_list);
        View viewFindViewById = findViewById(R.id.arrow_up);
        View viewFindViewById2 = findViewById(R.id.arrow_down);
        if (!z) {
            View viewFindViewById3 = findViewById(R.id.menu_container);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById3.getLayoutParams();
            layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.menu_right_margin_legacy);
            viewFindViewById3.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = (GradientDrawable) this.e.getBackground();
            gradientDrawable.setCornerRadius(getResources().getDimensionPixelSize(R.dimen.menu_background_radius_legacy));
            gradientDrawable.setTintMode(PorterDuff.Mode.DST);
            gradientDrawable.setTint(getContext().getColor(R.color.menu_bg_color_legacy));
            this.e.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelSize(R.dimen.menu_width_legacy);
            this.a.setLayoutParams(layoutParams2);
            this.a.setPadding(0, 0, 0, 0);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams3.height = getResources().getDimensionPixelSize(R.dimen.menu_header_height_legacy);
            this.f.setLayoutParams(layoutParams3);
            this.f.setPadding(getResources().getDimensionPixelSize(R.dimen.menu_header_left_padding_legacy), 0, getResources().getDimensionPixelSize(R.dimen.menu_header_right_padding_legacy), 0);
            this.g.setTextAppearance(R.style.MenuHeaderTextStyle);
            this.b.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.help_button_size_legacy);
            this.b.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.help_button_size_legacy);
            this.b.setImageResource(R.drawable.quantum_gm_ic_help_outline_vd_theme_24);
            this.b.setColorFilter(getResources().getColor(R.color.action_button_bg_legacy, null));
            listView.setPadding(getResources().getDimensionPixelSize(R.dimen.menu_listview_left_padding_legacy), 0, getResources().getDimensionPixelSize(R.dimen.menu_listview_right_padding_legacy), getResources().getDimensionPixelSize(R.dimen.menu_listview_bottom_padding_legacy));
            ((LinearLayout.LayoutParams) viewFindViewById.getLayoutParams()).rightMargin = getResources().getDimensionPixelSize(R.dimen.menu_arrow_right_margin_legacy);
            ((LinearLayout.LayoutParams) viewFindViewById2.getLayoutParams()).rightMargin = getResources().getDimensionPixelSize(R.dimen.menu_arrow_right_margin_legacy);
        }
        this.j = jhsVar;
        if (i2 == 48) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById2.setVisibility(0);
        }
        this.g.setText(i);
        ImageButton imageButton = this.b;
        Context context = this.c;
        imageButton.setContentDescription(context.getString(R.string.menu_help_button_announce, context.getString(i)));
        listView.setAdapter((ListAdapter) jhsVar);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: jht
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                PopupMenuView popupMenuView = this.a;
                jhs jhsVar2 = jhsVar;
                jhsVar2.d(i3);
                if (jhsVar2.getItem(i3).f) {
                    jty.b(popupMenuView.getContext());
                    popupMenuView.announceForAccessibility(popupMenuView.getResources().getString(R.string.menu_selected_accessibility_announce, jhsVar2.getItem(i3).b));
                }
            }
        });
        b();
    }

    public final void d() {
        setVisibility(0);
        Context context = this.c;
        jhs jhsVar = this.j;
        jhsVar.getClass();
        announceForAccessibility(context.getString(R.string.menu_open_announce, this.g.getText(), jhsVar.b().b));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a(this.d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (jrz.b(this.d)) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
        }
    }
}
