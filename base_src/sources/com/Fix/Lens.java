package com.Fix;

import MC.Device;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class Lens {
    public static int sAux5;
    public static int sAuxInfinity;
    public static int sAuxMain;
    public static int sAuxSwitch5;
    public static int sAuxSwitchInfinity;
    public static int sAuxSwitchMain;
    public static int sAuxSwitchTele;
    public static int sAuxSwitchWide;
    public static int sAuxTele;
    public static int sAuxWide;

    public Lens() {
        AuxLens();
    }

    public static void AuxLens() {
        if (Pref.MenuValue("pref_manual_cameraid_key") != 0) {
            sAuxMain = Pref.MenuValue("pref_manual_cameraid_back_1_key");
            sAuxTele = Pref.MenuValue("pref_manual_cameraid_back_2_key");
            sAuxWide = Pref.MenuValue("pref_manual_cameraid_back_3_key");
            sAuxInfinity = Pref.MenuValue("pref_manual_cameraid_back_4_key");
            sAux5 = Pref.MenuValue("pref_manual_cameraid_back_5_key");
            sAuxSwitchMain = Pref.MenuValue("pref_manual_cameraid_front_1_key");
            sAuxSwitchTele = Pref.MenuValue("pref_manual_cameraid_front_2_key");
            sAuxSwitchWide = Pref.MenuValue("pref_manual_cameraid_front_3_key");
            sAuxSwitchInfinity = Pref.MenuValue("pref_manual_cameraid_front_4_key");
            sAuxSwitch5 = Pref.MenuValue("pref_manual_cameraid_front_5_key");
            return;
        }
        sAuxMain = 0;
        sAuxSwitchMain = 1;
        sAuxTele = 2;
        sAuxSwitchTele = 1;
        sAuxWide = 3;
        sAuxSwitchWide = 1;
        sAuxInfinity = 4;
        sAuxSwitchInfinity = 1;
        sAux5 = 5;
        sAuxSwitch5 = 1;
        if (Device.isInvertedAux()) {
            sAuxTele = 3;
            sAuxWide = 2;
            sAuxInfinity = 4;
            sAux5 = 5;
            return;
        }
        if (Device.MN10()) {
            sAuxTele = 2;
            sAuxWide = 3;
            sAuxInfinity = 5;
            sAux5 = 4;
            return;
        }
        if (Device.SamsungS23Ultra()) {
            sAuxMain = 4;
            sAuxTele = 2;
            sAuxWide = 5;
            sAuxInfinity = 3;
            sAux5 = 4;
            return;
        }
        if (!Build.BOARD.equals("s5e9925") && !Build.DEVICE.equals("b0q") && Build.DEVICE.equals("r9s")) {
            sAuxMain = 6;
            sAuxTele = 4;
            sAuxWide = 2;
            sAuxInfinity = 5;
            return;
        }
        if (Build.DEVICE.equals("ASUS_I002DD")) {
            sAuxTele = 3;
            sAuxWide = 2;
            sAuxInfinity = 6;
            sAux5 = 5;
            return;
        }
        if (Build.MODEL.equals("ASUS_I003D")) {
            sAuxTele = 3;
            sAuxWide = 2;
            sAuxInfinity = 4;
            sAux5 = 5;
            return;
        }
        if (Build.MODEL.equals("ASUS_I003DD")) {
            sAuxTele = 3;
            sAuxWide = 2;
            sAuxInfinity = 4;
            sAux5 = 5;
            return;
        }
        if (Build.MODEL.equals("Redmi Note 7")) {
            sAuxMain = 0;
            sAuxTele = 2;
            return;
        }
        if (Build.MODEL.equals("ASUS_I01WD")) {
            sAuxTele = 3;
            sAuxWide = 3;
            sAuxInfinity = 4;
            sAux5 = 5;
            return;
        }
        if (Build.DEVICE.equals("Nord")) {
            sAuxTele = 3;
            sAuxWide = 2;
            sAuxInfinity = 4;
            sAux5 = 5;
            return;
        }
        if (Build.DEVICE.equals("star")) {
            sAuxTele = 3;
            sAuxWide = 2;
            return;
        }
        if (Device.Mi12UltraDevice()) {
            sAuxMain = 8;
            sAuxTele = 3;
            sAuxWide = 2;
            return;
        }
        if (Device.Samsungs22UExynos()) {
            sAuxMain = 4;
            sAuxTele = 2;
            sAuxWide = 5;
            sAuxInfinity = 3;
            sAux5 = 4;
            return;
        }
        if (Device.Samsungs22Exynos()) {
            sAuxMain = 6;
            sAuxTele = 4;
            sAuxWide = 2;
            sAuxInfinity = 5;
            sAux5 = 5;
            return;
        }
        if (Device.S20FE()) {
            sAuxMain = 0;
            sAuxTele = 5;
            sAuxWide = 2;
            sAuxInfinity = 4;
            sAux5 = 5;
            return;
        }
        if (Device.SamsungS21Ultra()) {
            sAuxMain = 0;
            sAuxTele = 4;
            sAuxWide = 2;
            sAuxInfinity = 5;
            sAux5 = 0;
            return;
        }
        if (Device.RedmiNote10Pro()) {
            sAuxMain = 0;
            sAuxTele = 3;
            sAuxWide = 4;
        } else if (Device.Xiaomi13()) {
            sAuxMain = 7;
            sAuxTele = 3;
            sAuxWide = 2;
        }
    }
}
