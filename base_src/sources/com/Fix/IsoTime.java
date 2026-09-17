package com.Fix;

import com.Helper;

/* JADX INFO: loaded from: classes2.dex */
public class IsoTime {
    public static float iso100;
    public static float iso1600;
    public static float iso200;
    public static float iso300;
    public static float iso400;
    public static float iso500;
    public static float iso800;
    public static float sGetActual_analog_gain;
    public static float sGetActual_exposure_time_ms;
    public static float sGetApplied_digital_gain;
    public static float sGetDesired_analog_gain;
    public static float sGetDesired_digital_gain;
    public static float sGetDesired_exposure_time_ms;
    public static float sGetMaxISO;
    public static float sGetPost_raw_digital_gain;
    public static float shotMaxISO;
    public static float shotMaxTime;

    public static float AstroTime() {
        switch (Pref.MenuValue("pref_aemode_astro_key")) {
            case 0:
                return 200.0f;
            case 1:
                return 500.0f;
            case 2:
                return 1000.0f;
            case 3:
                return 2000.0f;
            case 4:
                return 4000.0f;
            case 5:
                return 7000.0f;
            case 6:
                return 10000.0f;
            case 7:
                return 15000.0f;
            default:
                return 32000.0f;
        }
    }

    public static float OneShotTime() {
        switch (Pref.MenuValue("pref_aemode_oneshot_key")) {
            case 0:
                return 2.0f;
            case 1:
                return 10.0f;
            case 2:
                return 20.0f;
            case 3:
                return 40.0f;
            case 4:
                return 100.0f;
            case 5:
                return 333.0f;
            case 6:
                return 1000.0f;
            case 7:
                return 5000.0f;
            case 8:
                return 10000.0f;
            case 9:
                return 30000.0f;
            default:
                return 32000.0f;
        }
    }

    public static int getBitrate() {
        switch (Pref.MenuValue("pref_bitrate_key")) {
            case 0:
                return 0;
            case 1:
                return 800000;
            case 2:
                return 4000000;
            case 3:
                return 8000000;
            case 4:
                return 12000000;
            case 5:
                return 16000000;
            case 6:
                return 20000000;
            case 7:
                return 24000000;
            case 8:
                return 28000000;
            case 9:
                return 32000000;
            case 10:
                return 36000000;
            case 11:
                return 40000000;
            case 12:
                return 48000000;
            case 13:
                return 56000000;
            case 14:
                return 64000000;
            case 15:
                return 72000000;
            case 16:
                return 80000000;
            case 17:
                return 96000000;
            case 18:
                return 120000000;
            default:
                return 0;
        }
    }

    public static float getLimitMaxTime() {
        int iMenuValue = Pref.MenuValue(Helper.sFront != 0 ? "pref_exposure_max_front_key" : "pref_exposure_max_back_key");
        if (iMenuValue == 0) {
            return 300.0f;
        }
        if (iMenuValue == 1) {
            return 500.0f;
        }
        if (iMenuValue == 2) {
            return 1000.0f;
        }
        if (iMenuValue != 3) {
            return iMenuValue != 4 ? shotMaxTime : shotMaxTime * 0.63f;
        }
        return 3000.0f;
    }

    public static void isoTimeAstroParametrs(int i) {
        float f = 32000.0f;
        switch (i) {
            case 0:
                f = 200.0f;
                break;
            case 1:
                f = 500.0f;
                break;
            case 2:
                f = 1000.0f;
                break;
            case 3:
                f = 2000.0f;
                break;
            case 4:
                f = 4000.0f;
                break;
            case 5:
                f = 7000.0f;
                break;
            case 6:
                f = 10000.0f;
                break;
            case 7:
                f = 15000.0f;
                break;
        }
        float f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
        float f3 = f2 / 1.0f;
        if (((int) (f3 - f)) <= 0) {
            sGetDesired_exposure_time_ms = f3;
            sGetDesired_analog_gain = 1.0f;
            sGetDesired_digital_gain = 1.0f;
            return;
        }
        float f4 = f2 / f;
        float f5 = shotMaxISO;
        if (((int) (f4 - f5)) > 0) {
            sGetDesired_digital_gain = f4 / f5;
            sGetDesired_analog_gain = f5;
            sGetDesired_exposure_time_ms = f;
        } else {
            sGetDesired_analog_gain = f4;
            sGetDesired_digital_gain = 1.0f;
            sGetDesired_exposure_time_ms = f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public static void isoTimeFParametrs(int i) {
        float f;
        float limitMaxTime;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        switch (i) {
            case 0:
                break;
            case 1:
                f = shotMaxISO;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 2:
                f = iso1600;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 3:
                f = iso800;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 4:
                f = iso500;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 5:
                f = iso400;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 6:
                f = iso300;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 7:
                f = iso200;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 8:
                f = iso100;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 9:
                f8 = shotMaxTime;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 10:
                f8 = 2000.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 11:
                f8 = 1000.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 12:
                f8 = 500.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 13:
                f8 = 333.333f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 14:
                f8 = 200.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 15:
                f8 = 142.857f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 16:
                f8 = 100.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 17:
                f8 = 80.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 18:
                f8 = 65.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 19:
                f8 = 50.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 20:
                f8 = 30.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 21:
                f8 = 20.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 22:
                f8 = 15.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 23:
                f8 = 10.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 24:
                f8 = 5.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 25:
                f8 = 2.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 26:
                f8 = 1.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            default:
                if (0 == 0) {
                }
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
        }
    }

    public static void isoTimeOneShotParametrs(int i) {
        float f = 32000.0f;
        switch (i) {
            case 0:
                f = 2.0f;
                break;
            case 1:
                f = 10.0f;
                break;
            case 2:
                f = 20.0f;
                break;
            case 3:
                f = 40.0f;
                break;
            case 4:
                f = 100.0f;
                break;
            case 5:
                f = 333.0f;
                break;
            case 6:
                f = 1000.0f;
                break;
            case 7:
                f = 5000.0f;
                break;
            case 8:
                f = 10000.0f;
                break;
            case 9:
                f = 30000.0f;
                break;
        }
        float f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
        float f3 = f2 / 1.0f;
        if (((int) (f3 - f)) <= 0) {
            sGetDesired_exposure_time_ms = f3;
            sGetDesired_analog_gain = 1.0f;
            sGetDesired_digital_gain = 1.0f;
            return;
        }
        float f4 = f2 / f;
        float f5 = shotMaxISO;
        if (((int) (f4 - f5)) > 0) {
            sGetDesired_digital_gain = f4 / f5;
            sGetDesired_analog_gain = f5;
            sGetDesired_exposure_time_ms = f;
        } else {
            sGetDesired_analog_gain = f4;
            sGetDesired_digital_gain = 1.0f;
            sGetDesired_exposure_time_ms = f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public static void isoTimeParametrs(int i) {
        float f;
        float limitMaxTime;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        switch (i) {
            case 0:
                break;
            case 1:
                f = shotMaxISO;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 2:
                f = iso1600;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 3:
                f = iso800;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 4:
                f = iso500;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 5:
                f = iso400;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 6:
                f = iso300;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 7:
                f = iso200;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 8:
                f = iso100;
                limitMaxTime = getLimitMaxTime();
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                f3 = 10.0f;
                if (((int) (f2 - 10.0f)) > 0) {
                    f4 = f2 / 10.0f;
                    if (((int) (f4 - f)) > 0) {
                        f4 = f;
                        f3 = f2 / f4;
                        if (((int) (f3 - limitMaxTime)) > 0) {
                            f3 = limitMaxTime;
                            f4 = f2 / f3;
                        }
                    }
                    sGetDesired_exposure_time_ms = f3;
                    f5 = shotMaxISO;
                    if (((int) (f4 - f5)) > 0) {
                        sGetDesired_analog_gain = f4;
                        sGetDesired_digital_gain = 1.0f;
                    } else {
                        sGetDesired_digital_gain = f4 / f5;
                        sGetDesired_analog_gain = f5;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 9:
                f8 = shotMaxTime;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 10:
                f8 = 2000.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 11:
                f8 = 1000.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 12:
                f8 = 500.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 13:
                f8 = 333.333f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 14:
                f8 = 200.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 15:
                f8 = 142.857f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 16:
                f8 = 100.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 17:
                f8 = 80.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 18:
                f8 = 65.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 19:
                f8 = 50.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 20:
                f8 = 30.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 21:
                f8 = 20.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 22:
                f8 = 15.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 23:
                f8 = 10.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 24:
                f8 = 5.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 25:
                f8 = 2.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            case 26:
                f8 = 1.0f;
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
            default:
                if (0 == 0) {
                }
                f2 = sGetDesired_exposure_time_ms * sGetDesired_analog_gain * sGetDesired_digital_gain;
                if (((int) (f2 - f8)) > 0) {
                    f6 = f2 / f8;
                    f7 = shotMaxISO;
                    if (((int) (f6 - f7)) <= 0) {
                        sGetDesired_analog_gain = f6;
                        sGetDesired_digital_gain = 1.0f;
                        sGetDesired_exposure_time_ms = f8;
                    } else {
                        sGetDesired_digital_gain = f6 / f7;
                        sGetDesired_analog_gain = f7;
                        sGetDesired_exposure_time_ms = f8;
                    }
                }
                sGetDesired_exposure_time_ms = f2;
                sGetDesired_analog_gain = 1.0f;
                sGetDesired_digital_gain = 1.0f;
                break;
        }
    }
}
