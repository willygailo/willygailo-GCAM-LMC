package MC;

import android.os.Build;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class Device {
    public static boolean Exynos() {
        return Build.MANUFACTURER.toUpperCase().equals("SAMSUNG");
    }

    public static boolean Fog() {
        boolean zEquals = Build.DEVICE.equals("fog");
        if (zEquals || (zEquals = Build.BOARD.equals("sdm680")) || (zEquals = Build.BOARD.equals("sdm662")) || !(zEquals = Build.DEVICE.equals("lime"))) {
        }
        return zEquals;
    }

    public static boolean ForGettingC2api() {
        boolean zEquals = Build.BOARD.toUpperCase(Locale.US).equals("SDM845");
        if (zEquals || (zEquals = Build.BOARD.toUpperCase(Locale.US).equals("SDM710")) || !(zEquals = Build.BOARD.toUpperCase(Locale.US).equals("SDM712"))) {
        }
        return zEquals;
    }

    public static boolean GetRandomDevices() {
        return Build.MANUFACTURER.equals("LGE") || Build.MODEL.equals("RMX1921") || Build.MODEL.equals("RMX1931") || Build.MODEL.equals("RMX1971") || Build.DEVICE.equals("OnePlus8Pro") || Build.DEVICE.equals("NX659J") || Build.DEVICE.equals("OnePlus8") || Build.DEVICE.equals("cmi") || Build.DEVICE.equals("lmi") || Build.DEVICE.equals("Nord") || Build.MANUFACTURER.equals("Lenovo") || Build.DEVICE.equals("d2q") || Build.MANUFACTURER.equals("motorola");
    }

    public static boolean GoogleDevices() {
        return Build.DEVICE.equals("walleye") || Build.DEVICE.equals("taimen") || Build.DEVICE.equals("blueline") || Build.DEVICE.equals("crosshatch") || Build.DEVICE.equals("sargo") || Build.DEVICE.equals("bonito") || Build.DEVICE.equals("flame") || Build.DEVICE.equals("coral") || Build.DEVICE.equals("sunfish") || Build.DEVICE.equals("bramble") || Build.DEVICE.equals("redfin") || Build.DEVICE.equals("barbet") || Build.DEVICE.equals("oriole") || Build.DEVICE.equals("raven") || Build.DEVICE.equals("bluejay") || Build.DEVICE.equals("panther") || Build.DEVICE.equals("cheetah") || Build.DEVICE.equals("pipit") || Build.DEVICE.equals("tangor") || Build.DEVICE.equals("husky") || Build.DEVICE.equals("shiba") || Build.DEVICE.equals("lynx") || Build.DEVICE.equals("felix");
    }

    public static boolean GoogleDevicesAll() {
        return Build.MANUFACTURER.toUpperCase().equals("GOOGLE");
    }

    public static boolean GoogleDevicesIndividually() {
        boolean zEquals = Build.DEVICE.equals("oriole");
        if (zEquals || (zEquals = Build.DEVICE.equals("raven")) || (zEquals = Build.DEVICE.equals("bluejay")) || (zEquals = Build.DEVICE.equals("panther")) || (zEquals = Build.DEVICE.equals("cheetah")) || (zEquals = Build.DEVICE.equals("pipit")) || !(zEquals = Build.DEVICE.equals("tangor"))) {
        }
        return zEquals;
    }

    public static boolean GooglePixel4() {
        boolean zEquals = Build.DEVICE.toUpperCase().equals("coral".toUpperCase());
        if (zEquals || !(zEquals = Build.DEVICE.toUpperCase().equals("flame".toUpperCase()))) {
        }
        return zEquals;
    }

    public static boolean HdrRawFix() {
        String upperCase = Build.MANUFACTURER.toUpperCase(Locale.US);
        boolean zEquals = upperCase.equals("SAMSUNG");
        if (zEquals || (zEquals = upperCase.equals("ULEFONE")) || (zEquals = upperCase.equals("TECNO MOBILE LIMITED")) || (zEquals = upperCase.equals("VIVO")) || !(zEquals = upperCase.equals("OPPO"))) {
        }
        return zEquals;
    }

    public static boolean IdentifyExynos() {
        boolean zMatches = Pattern.matches(".*EXYNOS.*", Build.HARDWARE.toUpperCase());
        if (zMatches || !(zMatches = Build.MODEL.toUpperCase(Locale.US).equals("VIVO 1901"))) {
        }
        return zMatches;
    }

    public static boolean Iqoo9() {
        boolean zEquals = Build.MANUFACTURER.equals("vivo");
        return zEquals ? Build.BOARD.equals("lahaina") : zEquals;
    }

    public static boolean Iqoo9Pro() {
        return Build.DEVICE.equals("PD2172");
    }

    public static boolean M52() {
        return Build.MODEL.equals("SM-M526B");
    }

    public static boolean MN10() {
        return Build.DEVICE.equals("tucana");
    }

    public static boolean Mi10TPro() {
        return Build.DEVICE.toUpperCase().equals("M2007J35G") || Build.DEVICE.toUpperCase().equals("APOLLO") || Build.DEVICE.toUpperCase().contains("Mi10T Pro");
    }

    public static boolean Mi12UltraDevice() {
        return Build.DEVICE.equals("thor");
    }

    public static boolean Mi13UltraDevice() {
        return Build.DEVICE.equals("ishtar");
    }

    public static boolean Miatoll() {
        return Build.DEVICE.contains("merlin") || Build.DEVICE.contains("gram") || Build.DEVICE.contains("curtana") || Build.DEVICE.contains("joyeuse") || Build.DEVICE.contains("excalibur") || Build.DEVICE.contains("miatoll") || Build.DEVICE.contains("Note 9");
    }

    public static boolean MnFix() {
        boolean zEquals = Build.VERSION.SDK.equals("27");
        if (zEquals || (zEquals = Build.VERSION.SDK.equals("28")) || (zEquals = Build.VERSION.SDK.equals("29")) || !(zEquals = Build.VERSION.SDK.equals("30"))) {
        }
        return zEquals;
    }

    public static boolean OppoVivoRealme() {
        boolean zEquals = Build.MANUFACTURER.toUpperCase().equals("OPPO");
        if (zEquals || (zEquals = Build.MANUFACTURER.toUpperCase().equals("VIVO")) || (zEquals = Build.MANUFACTURER.toUpperCase().equals("REALME")) || !(zEquals = Build.BOARD.toUpperCase().equals("LIME"))) {
        }
        return zEquals;
    }

    public static boolean Pixel7Pro() {
        return Build.DEVICE.equals("cheetah");
    }

    public static boolean PocoX3() {
        return Build.DEVICE.toUpperCase().equals("SURYA") || Build.DEVICE.toUpperCase().contains("POCO X3");
    }

    public static boolean Random() {
        return Build.DEVICE.equals("RMX3085");
    }

    public static boolean RedmiNote10() {
        return Build.DEVICE.contains("mojito") || Build.DEVICE.contains("sunny") || Build.DEVICE.contains("sweet") || Build.DEVICE.contains("Note 10");
    }

    public static boolean RedmiNote10Pro() {
        return Build.DEVICE.equals("sweet");
    }

    public static boolean RedmiNote7() {
        return Build.DEVICE.toUpperCase().equals("LAVENDER") || Build.DEVICE.toUpperCase().contains("Note 7");
    }

    public static boolean RedmiNote8() {
        return Build.DEVICE.equals("ginkgo");
    }

    public static boolean S20FE() {
        return Build.DEVICE.equals("r8q");
    }

    public static boolean SamsungS21Ultra() {
        return Build.DEVICE.equals("p3q");
    }

    public static boolean SamsungS23Ultra() {
        return Build.DEVICE.equals("dm3q");
    }

    public static boolean SamsungUnknown1() {
        return Build.DEVICE.equals("beyond1q");
    }

    public static boolean Samsungs22Exynos() {
        return Build.DEVICE.equals("r0s");
    }

    public static boolean Samsungs22UExynos() {
        return Build.DEVICE.equals("b0s");
    }

    public static boolean Samsungs22USnapdragon() {
        boolean zEquals = Build.DEVICE.equals("b0q");
        if (zEquals || (zEquals = Build.DEVICE.equals("r0q")) || !(zEquals = Build.DEVICE.equals("q4q"))) {
        }
        return zEquals;
    }

    public static boolean SonyDevice() {
        return Build.MANUFACTURER.toUpperCase().equals("SONY");
    }

    public static boolean VivoDevice() {
        return Build.MANUFACTURER.equals("vivo");
    }

    public static boolean VivoPD2227() {
        return Build.DEVICE.toUpperCase().equals("PD2227");
    }

    public static boolean Xiaomi12sUltra() {
        return Build.DEVICE.equals("thor");
    }

    public static boolean Xiaomi13() {
        return Build.DEVICE.toUpperCase().equals("FUXI");
    }

    public static boolean Xiaomi13Pro() {
        return Build.DEVICE.toUpperCase().equals("NUWA");
    }

    public static boolean ZFOLD4() {
        return Build.DEVICE.equals("q4q");
    }

    public static boolean is12tpro() {
        return Build.DEVICE.equals("diting");
    }

    public static boolean isInvertedAux() {
        return Build.MODEL.equals("NX712J") || Build.DEVICE.equals("marble") || Build.DEVICE.equals("psyche") || Build.DEVICE.equals("munch") || Build.MANUFACTURER.equals("motorola") || Build.MANUFACTURER.equals("Lenovo") || Build.DEVICE.equals("lmi") || Build.DEVICE.equals("cmi") || Build.DEVICE.equals("OnePlus8") || Build.DEVICE.equals("NX659J") || Build.DEVICE.equals("OnePlus9Pro") || Build.DEVICE.equals("OnePlus8Pro") || Build.MODEL.equals("RMX3301") || Build.MODEL.equals("RMX3085") || Build.MODEL.equals("RMX1971") || Build.MODEL.equals("RMX1931") || Build.MODEL.equals("RMX1921") || Build.MODEL.equals("RMX3392") || Build.MODEL.equals("RMX3393") || Build.MANUFACTURER.equals("LGE");
    }

    public static boolean isOnePlus() {
        return Build.MANUFACTURER.equals("OnePlus");
    }

    public static boolean isOnePlus7() {
        return Build.DEVICE.equals("OnePlus7Pro") || Build.DEVICE.equals("oneplus7t") || Build.DEVICE.equals("oneplus7tpro") || Build.DEVICE.equals("hotdog") || Build.DEVICE.equals("hotdogb") || Build.DEVICE.equals("guacamole") || Build.DEVICE.equals("guacamoleb") || Build.DEVICE.equals("OnePlus7TProNR") || Build.DEVICE.equals("OnePlus7ProNR") || Build.DEVICE.equals("OnePlus7TPro") || Build.DEVICE.equals("OnePlus7T") || Build.DEVICE.equals("OnePlus7");
    }

    public static boolean isOnePlus9() {
        return Build.DEVICE.equals("OnePlus8Pro") || Build.DEVICE.equals("OnePlus8");
    }

    public static boolean isRN8P() {
        return Build.DEVICE.equals("begoniain") || Build.DEVICE.equals("begonia");
    }

    public static boolean isRealme9() {
        return Build.DEVICE.equals("RMX3392") || Build.DEVICE.equals("RMX3393");
    }

    public static boolean isRedmiNote() {
        return Build.DEVICE.contains("begoniain") || Build.DEVICE.contains("begonia") || Build.DEVICE.contains("curtana") || Build.DEVICE.contains("joyeuse") || Build.MODEL.contains("Note 9") || Build.MODEL.contains("Note 8");
    }

    public static boolean isRedmiNote8() {
        boolean zEquals = Build.BOARD.equals("sdm710");
        if (zEquals || (zEquals = Build.BOARD.equals("sdm845")) || !(zEquals = Build.BOARD.equals("sdm712"))) {
        }
        return zEquals;
    }

    public static boolean isRogPhone3() {
        return Build.MODEL.equals("ASUS_I003DD") || Build.MODEL.equals("ASUS_I003D");
    }

    public static boolean isStar() {
        return Build.DEVICE.equals("star");
    }

    public static boolean isXiaomi12() {
        return Build.DEVICE.equals("cupid") || Build.DEVICE.equals("jasmine_sprout");
    }

    public static boolean isZenfone7() {
        return Build.DEVICE.equals("ASUS_I002DD") || Build.DEVICE.equals("ASUS_I002D");
    }

    public static boolean isnokia() {
        return Build.BRAND.toUpperCase().equals("NOKIA");
    }
}
