package com.mdmitriev.auxlenses;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.Fix.Pref;
import com.Helper;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class AuxButtonsLayout extends RelativeLayout {
    public String buttonName5;
    public String buttonNameInfinity;
    public String buttonNameMain;
    public String buttonNameTele;
    public String buttonNameWide;
    public List<Button> buttons;
    public int idButton5;
    public int idButtonInfinity;
    public int idButtonMain;
    public int idButtonTele;
    public int idButtonWide;
    Resources resources;

    /* JADX INFO: renamed from: com.mdmitriev.auxlenses.AuxButtonsLayout$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        final /* synthetic */ void lambda$onClick$0$AuxButtonsLayout$1(View view, Button button) throws InterruptedException {
            int id;
            if (button != null && (id = button.getId()) == view.getId()) {
                AuxButtonsLayout.this.activateButton(id);
                Helper.onRestart();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View view) {
            AuxButtonsLayout.this.buttons.forEach(new Consumer(this, view) { // from class: com.mdmitriev.auxlenses.AuxButtonsLayout$1$$Lambda$0
                private final AuxButtonsLayout.AnonymousClass1 arg$1;
                private final View arg$2;

                {
                    this.arg$1 = this;
                    this.arg$2 = view;
                }

                @Override // java.util.function.Consumer
                public void accept(Object obj) throws InterruptedException {
                    this.arg$1.lambda$onClick$0$AuxButtonsLayout$1(this.arg$2, (Button) obj);
                }
            });
        }
    }

    public AuxButtonsLayout(Context context) {
        super(context);
        this.buttons = new ArrayList();
        this.resources = context.getResources();
        this.idButtonMain = GetButtonByID("AuxButtonMain");
        this.idButtonTele = GetButtonByID("AuxButtonTele");
        this.idButtonWide = GetButtonByID("AuxButtonWide");
        this.idButtonInfinity = GetButtonByID("AuxButtonInfinity");
        this.idButton5 = GetButtonByID("AuxButton5");
    }

    public AuxButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.buttons = new ArrayList();
        this.resources = context.getResources();
        this.idButtonMain = GetButtonByID("AuxButtonMain");
        this.idButtonTele = GetButtonByID("AuxButtonTele");
        this.idButtonWide = GetButtonByID("AuxButtonWide");
        this.idButtonInfinity = GetButtonByID("AuxButtonInfinity");
        this.idButton5 = GetButtonByID("AuxButton5");
    }

    public AuxButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.buttons = new ArrayList();
        this.resources = context.getResources();
        this.idButtonMain = GetButtonByID("AuxButtonMain");
        this.idButtonTele = GetButtonByID("AuxButtonTele");
        this.idButtonWide = GetButtonByID("AuxButtonWide");
        this.idButtonInfinity = GetButtonByID("AuxButtonInfinity");
        this.idButton5 = GetButtonByID("AuxButton5");
    }

    public static String switchToPicturesize() {
        switch (Pref.sAuxKey) {
            case 0:
                return "pref_camera_picturesize_back_key";
            case 1:
                return "pref_camera_picturesize_aux_key";
            case 2:
                return "pref_camera_picturesize_3rd_key";
            case 3:
                return "pref_camera_picturesize_4th_key";
            case 4:
                return "pref_camera_picturesize_5th_key";
            default:
                return "pref_camera_picturesize_back_key";
        }
    }

    public void AuxName() {
        this.buttonNameMain = "1x";
        this.buttonNameTele = "2x";
        this.buttonNameWide = "0.6x";
        this.buttonNameInfinity = "ID4";
        this.buttonName5 = "ID5";
        String upperCase = Build.DEVICE.toUpperCase(Locale.US);
        if (upperCase.equals("CMI")) {
            this.buttonNameTele = "3.7x";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "2x";
        } else if (upperCase.equals("UMI")) {
            this.buttonNameTele = "Macro";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "2x";
        } else if (upperCase.equals("TUCANA")) {
            this.buttonNameTele = "2x";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "3.7x";
            this.buttonName5 = "Macro";
        } else if (upperCase.equals("LMI")) {
            this.buttonNameTele = "ToF";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "Macro";
        } else if (upperCase.equals("ONEPLUS8PRO")) {
            this.buttonNameTele = "2.2х";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "C";
        } else if (upperCase.equals("ONEPLUS8")) {
            this.buttonNameTele = "Macro";
            this.buttonNameWide = "0.5x";
        } else if (upperCase.equals("GINKGO")) {
            this.buttonNameTele = "Depth";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "Macro";
        } else if (upperCase.equals("PYXIS")) {
            this.buttonNameTele = "Depth";
            this.buttonNameWide = "0.6x";
        } else if (upperCase.equals("NX659J")) {
            this.buttonNameTele = "Macro";
            this.buttonNameWide = "0.6x";
        } else if (upperCase.equals("CURTANA")) {
            this.buttonNameTele = "Depth";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "Macro";
        } else if (upperCase.equals("CAS")) {
            this.buttonNameTele = "2x";
            this.buttonNameWide = "0.5x";
            this.buttonNameInfinity = "5x";
        } else if (upperCase.equals("R5Q") || upperCase.equals("F2Q")) {
            this.buttonNameTele = "2x";
            this.buttonNameWide = "0.5x";
        } else if (upperCase.equals("PICASSO")) {
            this.buttonNameTele = " M ";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = " D ";
        } else if (upperCase.equals("PNX_SPROUT")) {
            this.buttonNameTele = " D ";
        } else if (upperCase.equals("SURYA")) {
            this.buttonNameTele = " M ";
            this.buttonNameWide = "0.6x";
        } else if (Build.MODEL.toUpperCase(Locale.US).equals("RMX1921") || Build.MODEL.equals("RMX1971")) {
            this.buttonNameTele = "Macro";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "Depth";
        } else if (Build.MODEL.equals("CPH2025")) {
            this.buttonNameTele = "5x";
            this.buttonNameWide = "0.6x";
        } else {
            this.buttonNameTele = "2x";
            this.buttonNameWide = "0.6x";
            this.buttonNameInfinity = "ID4";
            this.buttonName5 = "ID5";
        }
        if (Pref.MenuValue("pref_lenses_names_enable_key") != 0) {
            this.buttonNameMain = Pref.getStringValue("pref_manual_camera_name_key_main");
            this.buttonNameTele = Pref.getStringValue("pref_manual_camera_name_key_2");
            this.buttonNameWide = Pref.getStringValue("pref_manual_camera_name_key_3");
            this.buttonNameInfinity = Pref.getStringValue("pref_manual_camera_name_key_4");
            this.buttonName5 = Pref.getStringValue("pref_manual_camera_name_key_5");
        }
    }

    public int GetButtonByDrawable(String str) {
        return this.resources.getIdentifier(str, "drawable", getContext().getPackageName());
    }

    public int GetButtonByID(String str) {
        return this.resources.getIdentifier(str, "id", getContext().getPackageName());
    }

    public void activateButton(int i) {
        int i2 = 0;
        if (this.idButtonMain == i) {
            i2 = 0;
        } else if (this.idButtonTele == i) {
            i2 = 1;
        } else if (this.idButtonWide == i) {
            i2 = 2;
        } else if (this.idButtonInfinity == i) {
            i2 = 3;
        } else if (this.idButton5 == i) {
            i2 = 4;
        }
        Helper.setMenuValue("pref_aux_key", Integer.toString(i2));
    }

    public Button getBackground(int i, int i2, String str) {
        Button button = (Button) findViewById(i2);
        button.setBackgroundResource(GetButtonByDrawable(Pref.sAuxKey == i ? "ic_button_icon_2" : "main_button"));
        button.setText(str);
        button.setVisibility(getVisibilityById(i));
        return button;
    }

    public int getVisibilityById(int i) {
        String str;
        if (i == 1) {
            str = "pref_aux_tele_key";
        } else if (i == 2) {
            str = "pref_aux_wide_key";
        } else if (i != 3) {
            str = i != 4 ? "pref_show_buttons_key" : "pref_aux_5_key";
        } else {
            str = "pref_aux_4_key";
        }
        return (Pref.MenuValue(str) == 1 && Pref.MenuValue("pref_show_buttons_key") == 1) ? 0 : 8;
    }

    public void initButtons() {
        AuxName();
        this.buttons.add(getBackground(0, this.idButtonMain, this.buttonNameMain));
        this.buttons.add(getBackground(1, this.idButtonTele, this.buttonNameTele));
        this.buttons.add(getBackground(2, this.idButtonWide, this.buttonNameWide));
        this.buttons.add(getBackground(3, this.idButtonInfinity, this.buttonNameInfinity));
        this.buttons.add(getBackground(4, this.idButton5, this.buttonName5));
        this.buttons.forEach(new Consumer(this) { // from class: com.mdmitriev.auxlenses.AuxButtonsLayout$$Lambda$0
            private final AuxButtonsLayout arg$1;

            {
                this.arg$1 = this;
            }

            @Override // java.util.function.Consumer
            public void accept(Object obj) {
                this.arg$1.lambda$initButtons$0$AuxButtonsLayout((Button) obj);
            }
        });
    }

    final /* synthetic */ void lambda$initButtons$0$AuxButtonsLayout(Button button) {
        if (button == null) {
            return;
        }
        button.setOnClickListener(new AnonymousClass1());
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        initButtons();
    }
}
