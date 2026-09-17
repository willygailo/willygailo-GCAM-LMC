package com.SDE;

import com.Fix.Pref;
import com.Helper;

/* JADX INFO: loaded from: classes.dex */
public class LensValue {
    public static String SetLensValue(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (Helper.sFront != 0) {
            str2 = "_front";
        } else {
            int iMenuValue = Pref.MenuValue("pref_aux_key");
            if (iMenuValue == 1) {
                str2 = "_2";
            } else if (iMenuValue == 2) {
                str2 = "_3";
            } else if (iMenuValue == 3) {
                str2 = "_4";
            } else {
                str2 = iMenuValue == 4 ? "_5" : "";
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String SetLensValue1(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (Pref.MenuValue("pref_frontcam_value_restart_key") == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                default:
                    str2 = "";
                    break;
                case 1:
                    str2 = "_2";
                    break;
                case 2:
                    str2 = "_3";
                    break;
                case 3:
                    str2 = "_4";
                    break;
                case 4:
                    str2 = "_5";
                    break;
            }
        } else {
            str2 = "_front";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String SetLensValueBack(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i = Pref.sAuxKey;
        if (i == 1) {
            str2 = "_tele";
        } else if (i == 2) {
            str2 = "_wide";
        } else if (i == 3) {
            str2 = "_id4";
        } else {
            str2 = i == 4 ? "_id5" : "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String SetLensValueCT(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (Helper.sFront == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                default:
                    str2 = "";
                    break;
                case 1:
                    str2 = "_2";
                    break;
                case 2:
                    str2 = "_3";
                    break;
                case 3:
                    str2 = "_4";
                    break;
                case 4:
                    str2 = "_5";
                    break;
            }
        } else {
            str2 = "_front";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String SetLensValueLog(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (Helper.sFront != 0) {
            str2 = "_FRONT.CSS";
        } else {
            int iMenuValue = Pref.MenuValue("pref_aux_key");
            if (iMenuValue == 1) {
                str2 = "_TELE.CSS";
            } else if (iMenuValue == 2) {
                str2 = "_WIDE.CSS";
            } else if (iMenuValue == 3) {
                str2 = "_ID4.CSS";
            } else {
                str2 = iMenuValue == 4 ? "_ID5.CSS" : ".CSS";
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String SetLensValueOp(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (Helper.sFront != 0) {
            str2 = "_front";
        } else {
            int iMenuValue = Pref.MenuValue("pref_aux_key");
            if (iMenuValue == 1) {
                str2 = "_2";
            } else if (iMenuValue == 2) {
                str2 = "_3";
            } else if (iMenuValue == 3) {
                str2 = "_4";
            } else {
                str2 = iMenuValue == 4 ? "_5" : "";
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String SetLensValueWithFront(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (Helper.sFront == 0) {
            switch (Pref.MenuValue("pref_aux_key")) {
                case 0:
                default:
                    str2 = "_main";
                    break;
                case 1:
                    str2 = "_tele";
                    break;
                case 2:
                    str2 = "_wide";
                    break;
                case 3:
                    str2 = "_id4";
                    break;
                case 4:
                    str2 = "_id5";
                    break;
            }
        } else {
            str2 = "_front";
        }
        sb.append(str2);
        return sb.toString();
    }
}
