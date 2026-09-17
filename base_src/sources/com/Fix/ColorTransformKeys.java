package com.Fix;

/* JADX INFO: loaded from: classes2.dex */
public class ColorTransformKeys {
    static final String[] keys_camera_back = null;
    static final String[] keys_camera_front = null;

    public ColorTransformKeys(int i) {
        String[] strArr;
        keys_camera_front = new String[]{"rr_1_key", "rg_1_key", "rb_1_key", "gr_1_key", "gg_1_key", "gb_1_key", "br_1_key", "bg_1_key", "bb_1_key"};
        switch (i) {
            case 0:
            default:
                strArr = new String[]{"rr_0_key", "rg_0_key", "rb_0_key", "gr_0_key", "gg_0_key", "gb_0_key", "br_0_key", "bg_0_key", "bb_0_key"};
                break;
            case 1:
                strArr = new String[]{"rr_2_key", "rg_2_key", "rb_2_key", "gr_2_key", "gg_2_key", "gb_2_key", "br_2_key", "bg_2_key", "bb_2_key"};
                break;
            case 2:
                strArr = new String[]{"rr_3_key", "rg_3_key", "rb_3_key", "gr_3_key", "gg_3_key", "gb_3_key", "br_3_key", "bg_3_key", "bb_3_key"};
                break;
            case 3:
                strArr = new String[]{"rr_4_key", "rg_4_key", "rb_4_key", "gr_4_key", "gg_4_key", "gb_4_key", "br_4_key", "bg_4_key", "bb_4_key"};
                break;
            case 4:
                strArr = new String[]{"rr_5_key", "rg_5_key", "rb_5_key", "gr_5_key", "gg_5_key", "gb_5_key", "br_5_key", "bg_5_key", "bb_5_key"};
                break;
        }
        keys_camera_back = strArr;
    }
}
