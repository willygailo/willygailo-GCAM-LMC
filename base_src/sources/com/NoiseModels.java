package com;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.util.Pair;
import com.Fix.Pref;
import com.SDE.LensValue;
import com.google.android.apps.camera.bottombar.R;
import com.noisemodel.Internal;
import defpackage.lvp;
import defpackage.lzr;

/* JADX INFO: loaded from: classes2.dex */
public class NoiseModels {
    static final Pair[] EdgeX30_JN1_OFF;
    static final Pair[] EdgeX30_JN1_SC;
    static final Pair[] EdgeX30_OV50A_OFF;
    static final Pair[] EdgeX30_OV50A_SC;
    static final Pair[] EdgeX30_OV60A_OFF;
    static final Pair[] EdgeX30_OV60A_SC;
    static final Pair[] GC02M1_ARNOVA_OFF;
    static final Pair[] GC02M1_ARNOVA_SC;
    static final Pair[] GalaxyM51_GC5035_54_OFF;
    static final Pair[] GalaxyM51_GC5035_54_SC;
    static final Pair[] GalaxyM51_IMX616_1_OFF;
    static final Pair[] GalaxyM51_IMX616_1_SC;
    static final Pair[] GalaxyM51_IMX616_3_OFF;
    static final Pair[] GalaxyM51_IMX616_3_SC;
    static final Pair[] GalaxyM51_IMX682_0_OFF;
    static final Pair[] GalaxyM51_IMX682_0_SC;
    static final Pair[] GalaxyM51_S5K3L6_2_OFF;
    static final Pair[] GalaxyM51_S5K3L6_2_SC;
    static final Pair[] IMX355_PX4A_CSTARK_OFF;
    static final Pair[] IMX355_PX4A_CSTARK_SC;
    static final Pair[] IMX363_CSTARK_OFF;
    static final Pair[] IMX363_CSTARK_SC;
    static final Pair[] IMX363_PX4A_CSTARK_OFF;
    static final Pair[] IMX363_PX4A_CSTARK_SC;
    static final Pair[] IMX363_PX4XL_CSTARK_OFF;
    static final Pair[] IMX363_PX4XL_CSTARK_SC;
    static final Pair[] IMX376_ARNOVA_OFF;
    static final Pair[] IMX376_ARNOVA_SC;
    static final Pair[] IMX471_ARNOVA_OFF;
    static final Pair[] IMX471_ARNOVA_SC;
    static final Pair[] IMX481_SAP_OFF;
    static final Pair[] IMX481_SAP_SC;
    static final Pair[] IMX519_ARNOVA_OFF;
    static final Pair[] IMX519_ARNOVA_SC;
    static final Pair[] IMX520_PX4XL_CSTARK_OFF;
    static final Pair[] IMX520_PX4XL_CSTARK_SC;
    static final Pair[] IMX555_CSTARK_OFF;
    static final Pair[] IMX555_CSTARK_SC;
    static final Pair[] IMX586_AVG_SAP_OFF;
    static final Pair[] IMX586_AVG_SAP_SC;
    static final Pair[] IMX586_OFILM_MEVLUT_OFF;
    static final Pair[] IMX586_OFILM_MEVLUT_SC;
    static final Pair[] IMX586_SAP2_OFF;
    static final Pair[] IMX586_SAP2_SC;
    static final Pair[] IMX586_SAP_OFF;
    static final Pair[] IMX586_SAP_SC;
    static final Pair[] IMX586_SEMCO_RAKIN_OFF;
    static final Pair[] IMX586_SEMCO_RAKIN_SC;
    static final Pair[] IMX586_VIOLET_ARCHESOLUS_OFF;
    static final Pair[] IMX586_VIOLET_ARCHESOLUS_SC;
    static final Pair[] IMX682_ARNOVA_OFF;
    static final Pair[] IMX682_ARNOVA_SC;
    static final Pair[] IMX686_0_Necrys_OFF;
    static final Pair[] IMX686_0_Necrys_SC;
    static final Pair[] IMX686_ARNOVA_OFF;
    static final Pair[] IMX686_ARNOVA_SC;
    static final Pair[] IMX689_ARNOVA_OFF;
    static final Pair[] IMX689_ARNOVA_SC;
    static final Pair[] LGV50_IMX351_2_OFF;
    static final Pair[] LGV50_IMX351_2_SC;
    static final Pair[] LGV50_IMX363_0_OFF;
    static final Pair[] LGV50_IMX363_0_SC;
    static final Pair[] LGV50_SL556_4_OFF;
    static final Pair[] LGV50_SL556_4_SC;
    static final Pair[] LGV50_SL846_1_OFF;
    static final Pair[] LGV50_SL846_1_SC;
    static final Pair[] LGV50_s5k3m5_3_OFF;
    static final Pair[] LGV50_s5k3m5_3_SC;
    static final Pair[] MI10U_2x_S5K2L7_OFF;
    static final Pair[] MI10U_2x_S5K2L7_SC;
    static final Pair[] MI10U_5x_IMX586_OFF;
    static final Pair[] MI10U_5x_IMX586_SC;
    static final Pair[] MI10U_Front_S5K3T2_OFF;
    static final Pair[] MI10U_Front_S5K3T2_SC;
    static final Pair[] MI10U_Main_OV48C_OFF;
    static final Pair[] MI10U_Main_OV48C_SC;
    static final Pair[] MI10U_UW_IMX350_OFF;
    static final Pair[] MI10U_UW_IMX350_SC;
    static final Pair[] MI11U_GN2_ID1_OFF;
    static final Pair[] MI11U_GN2_ID1_SC;
    static final Pair[] MI11X_IMX355_2_OFF;
    static final Pair[] MI11X_IMX355_2_SC;
    static final Pair[] MI11X_IMX582_0_OFF;
    static final Pair[] MI11X_IMX582_0_SC;
    static final Pair[] MI11X_S5K3T2_1_OFF;
    static final Pair[] MI11X_S5K3T2_1_SC;
    static final Pair[] Manual_Noise_Modeler;
    static final Pair[] Manual_Noise_Modeler_OFF;
    static final Pair[] Mi11Lite_S5KGW3_OFF;
    static final Pair[] Mi11Lite_S5KGW3_SC;
    static final Pair[] Mi11Pro_OV13B10_2_OFF;
    static final Pair[] Mi11Pro_OV13B10_2_SC;
    static final Pair[] Mi11Pro_fix_OV08A10_3_OFF;
    static final Pair[] Mi11Pro_fix_OV08A10_3_SC;
    static final Pair[] Mi11Pro_fix_S5KGN2_0_OFF;
    static final Pair[] Mi11Pro_fix_S5KGN2_0_SC;
    static final Pair[] Mi11U_GN2_ID1_Arnova_OFF;
    static final Pair[] Mi11U_GN2_ID1_Arnova_SC;
    static final Pair[] Mi11Ultra_IMX586_TELE_OFF;
    static final Pair[] Mi11Ultra_IMX586_TELE_SC;
    static final Pair[] Mi11Ultra_IMX586_UW_OFF;
    static final Pair[] Mi11Ultra_IMX586_UW_SC;
    static final Pair[] Mi11Ultra_S5KGN2_OFF;
    static final Pair[] Mi11Ultra_S5KGN2_SC;
    static final Pair[] Mi9_IMX481_21_OFF;
    static final Pair[] Mi9_IMX481_21_SC;
    static final Pair[] Mi9_IMX586_0_OFF;
    static final Pair[] Mi9_IMX586_0_SC;
    static final Pair[] Mi9_S5K3M5_20_OFF;
    static final Pair[] Mi9_S5K3M5_20_SC;
    public static Pair[] NM_OFF;
    public static Pair[] NM_SC;
    static final Pair[] OV13855_ARCHESOLUS_OFF;
    static final Pair[] OV13855_ARCHESOLUS_SC;
    static final Pair[] OV13B10_OFF;
    static final Pair[] OV13B10_SC;
    static final Pair[] OV8856_21_Necrys_OFF;
    static final Pair[] OV8856_21_Necrys_SC;
    static final Pair[] OV8856_ARNOVA_OFF;
    static final Pair[] OV8856_ARNOVA_SC;
    static final Pair[] OnePlus9Pro_imx471_1_OFF;
    static final Pair[] OnePlus9Pro_imx471_1_SC;
    static final Pair[] OnePlus9Pro_imx766_2_OFF;
    static final Pair[] OnePlus9Pro_imx766_2_SC;
    static final Pair[] OnePlus9Pro_imx789_0_OFF;
    static final Pair[] OnePlus9Pro_imx789_0_SC;
    static final Pair[] OnePlus9Pro_ov08a10_3_OFF;
    static final Pair[] OnePlus9Pro_ov08a10_3_SC;
    static final Pair[] Oneplus8Pro_IMX689_0_Enzo_OFF;
    static final Pair[] Oneplus8Pro_IMX689_0_Enzo_SC;
    static final Pair[] Oneplus8Pro_IMX689_0_OFF;
    static final Pair[] Oneplus8Pro_IMX689_0_SC;
    static final Pair[] Oneplus8pro_IMX471_1_OFF;
    static final Pair[] Oneplus8pro_IMX471_1_SC;
    static final Pair[] Oneplus8pro_IMX586_2_OFF;
    static final Pair[] Oneplus8pro_IMX586_2_SC;
    static final Pair[] Oneplus8pro_S5K3M5_3_OFF;
    static final Pair[] Oneplus8pro_S5K3M5_3_SC;
    static final Pair[] PocoX3Pro_IMX582_new_0_OFF;
    static final Pair[] PocoX3Pro_IMX582_new_0_SC;
    static final Pair[] PocoX3Pro_OV02B1B_4_OFF;
    static final Pair[] PocoX3Pro_OV02B1B_4_SC;
    static final Pair[] PocoX3Pro_OV8856_3_OFF;
    static final Pair[] PocoX3Pro_OV8856_3_SC;
    static final Pair[] PocoX3Pro_S5K3T2_new_1_OFF;
    static final Pair[] PocoX3Pro_S5K3T2_new_1_SC;
    static final Pair[] PocoX3_hi1337_21_DNF_OFF;
    static final Pair[] PocoX3_hi1337_21_DNF_SC;
    static final Pair[] PocoX3_hi259_22_DNF_OFF;
    static final Pair[] PocoX3_hi259_22_DNF_SC;
    static final Pair[] PocoX3_imx682_0_DNF_OFF;
    static final Pair[] PocoX3_imx682_0_DNF_SC;
    static final Pair[] PocoX3_s5k3t2_1_DNF_OFF;
    static final Pair[] PocoX3_s5k3t2_1_DNF_SC;
    static final Pair[] Pocox3nfc_imx682_i_sony_661_OFF;
    static final Pair[] Pocox3nfc_imx682_i_sony_661_SC;
    static final Pair[] RN10PRO_HM2_0_OFF;
    static final Pair[] RN10PRO_HM2_0_SC;
    static final Pair[] RN10PRO_IMX355_4_OFF;
    static final Pair[] RN10PRO_IMX355_4_SC;
    static final Pair[] RN10PRO_IMX471_1_OFF;
    static final Pair[] RN10PRO_IMX471_1_SC;
    static final Pair[] RN10PRO_OV5675_3_OFF;
    static final Pair[] RN10PRO_OV5675_3_SC;
    static final Pair[] RN7_s5kgm1_0_OFF;
    static final Pair[] RN7_s5kgm1_0_SC;
    static final Pair[] RN9PRO_GC8034_21_OFF;
    static final Pair[] RN9PRO_GC8034_21_SC;
    static final Pair[] RN9PRO_GW1_0_OFF;
    static final Pair[] RN9PRO_GW1_0_SC;
    static final Pair[] RN9PRO_SK5E9_22_OFF;
    static final Pair[] RN9PRO_SK5E9_22_SC;
    static final Pair[] RN9S_GC02M1_20_OFF;
    static final Pair[] RN9S_GC02M1_20_SC;
    static final Pair[] RN9S_OV16A1Q_1_NOISE_fix_OFF;
    static final Pair[] RN9S_OV16A1Q_1_NOISE_fix_SC;
    static final Pair[] RN9S_OV8856_21_OFF;
    static final Pair[] RN9S_OV8856_21_SC;
    static final Pair[] RN9S_S5K5E9_22_OFF;
    static final Pair[] RN9S_S5K5E9_22_SC;
    static final Pair[] RN9S_S5KGM2_0_OFF;
    static final Pair[] RN9S_S5KGM2_0_SC;
    static final Pair[] RN9S_fix_S5KGM2_0_OFF;
    static final Pair[] RN9S_fix_S5KGM2_0_SC;
    static final Pair[] RealmeX2PROTest_GW1_OFF;
    static final Pair[] RealmeX2PROTest_GW1_SC;
    static final Pair[] RealmeX2PRO_GW1_OFF;
    static final Pair[] RealmeX2PRO_GW1_SC;
    static final Pair[] RedmiNote8Pro_Main16_S5KGW1_OFF;
    static final Pair[] RedmiNote8Pro_Main16_S5KGW1_SC;
    static final Pair[] RedmiNote8Pro_Wide_ov8856_OFF;
    static final Pair[] RedmiNote8Pro_Wide_ov8856_SC;
    static final Pair[] S20FE_HI847_OFF;
    static final Pair[] S20FE_HI847_SC;
    static final Pair[] S20FE_IMX555_OFF;
    static final Pair[] S20FE_IMX555_SC;
    static final Pair[] S20FE_IMX616_OFF;
    static final Pair[] S20FE_IMX616_SC;
    static final Pair[] S20FE_IMX616_cropped_OFF;
    static final Pair[] S20FE_IMX616_cropped_SC;
    static final Pair[] S20FE_S5K3L6_OFF;
    static final Pair[] S20FE_S5K3L6_SC;
    static final Pair[] S5K3M5_SAP_OFF;
    static final Pair[] S5K3M5_SAP_SC;
    static final Pair[] S5K3T2_OFF;
    static final Pair[] S5K3T2_SAVITAR_OFF;
    static final Pair[] S5K3T2_SAVITAR_SC;
    static final Pair[] S5K3T2_SC;
    static final Pair[] S5K5E9_OFF;
    static final Pair[] S5K5E9_SC;
    static final Pair[] S5KGM2_CSTARK_OFF;
    static final Pair[] S5KGM2_CSTARK_SC;
    static final Pair[] S5KHMX1_SAVITAR_OFF;
    static final Pair[] S5KHMX1_SAVITAR_SC;
    static final Pair[] S5KHMX_OFF;
    static final Pair[] S5KHMX_SAVITAR_OFF;
    static final Pair[] S5KHMX_SAVITAR_SC;
    static final Pair[] S5KHMX_SC;
    static final Pair[] SAVITAR_Macro_OFF;
    static final Pair[] SAVITAR_Macro_SC;
    static final Pair[] Samsung_S5KGW1_2_OFF;
    static final Pair[] Samsung_S5KGW1_2_SC;
    static final Pair[] UWA_SAVITAR_OFF;
    static final Pair[] UWA_SAVITAR_SC;
    static final Pair[] Mi10U_new_IMX586_4_OFF = {new Pair(Double.valueOf(4.509425381797041E-12d), Double.valueOf(3.6366384941392123E-7d)), new Pair(Double.valueOf(2.267471275438403E-12d), Double.valueOf(-1.1207133554947757E-7d)), new Pair(Double.valueOf(1.1001758620061367E-12d), Double.valueOf(1.7857454243565782E-7d)), new Pair(Double.valueOf(1.3615498511866523E-12d), Double.valueOf(3.164271743346444E-7d))};
    static final Pair[] Mi10U_new_IMX586_4_SC = {new Pair(Double.valueOf(1.0673449016409514E-6d), Double.valueOf(-7.768410096045204E-6d)), new Pair(Double.valueOf(1.2113369862616123E-6d), Double.valueOf(1.2095708095164611E-5d)), new Pair(Double.valueOf(6.202622287233161E-7d), Double.valueOf(8.837843014774865E-6d)), new Pair(Double.valueOf(6.808332330119998E-7d), Double.valueOf(2.8301656450573236E-6d))};
    static final Pair[] S5K2L4SX_OFF = {new Pair(Double.valueOf(6.105846836664482E-11d), Double.valueOf(5.340598860102586E-7d)), new Pair(Double.valueOf(6.18426165964429E-11d), Double.valueOf(4.2584486393284937E-7d)), new Pair(Double.valueOf(6.037019690745369E-11d), Double.valueOf(4.3863964053399205E-7d)), new Pair(Double.valueOf(6.02052996461283E-11d), Double.valueOf(5.831728357625791E-7d))};
    static final Pair[] S5K2L4SX_SC = {new Pair(Double.valueOf(2.7247553530254037E-6d), Double.valueOf(-1.6446497043018675E-6d)), new Pair(Double.valueOf(2.712280577763318E-6d), Double.valueOf(3.214512824227016E-6d)), new Pair(Double.valueOf(2.7148805794404906E-6d), Double.valueOf(2.8421678471586633E-6d)), new Pair(Double.valueOf(2.758717188464434E-6d), Double.valueOf(-6.091488975561772E-6d))};
    static final Pair[] S5K3P9SN_OFF = {new Pair(Double.valueOf(1.874755744776529E-11d), Double.valueOf(2.782114659891854E-7d)), new Pair(Double.valueOf(1.9425137722952994E-11d), Double.valueOf(1.6845096416237958E-7d)), new Pair(Double.valueOf(1.880505546660499E-11d), Double.valueOf(1.5994698401740247E-7d)), new Pair(Double.valueOf(1.8203807690664772E-11d), Double.valueOf(2.768637479776927E-7d))};
    static final Pair[] S5K3P9SN_SC = {new Pair(Double.valueOf(3.1214021334568827E-6d), Double.valueOf(1.003354355561877E-6d)), new Pair(Double.valueOf(3.129986009479421E-6d), Double.valueOf(6.306618481907831E-6d)), new Pair(Double.valueOf(3.1179664338680484E-6d), Double.valueOf(7.554071720615053E-6d)), new Pair(Double.valueOf(3.1561213104300015E-6d), Double.valueOf(4.825139278558371E-7d))};
    static final Pair[] IMX374_SONY_OFF = {new Pair(Double.valueOf(4.784328183667498E-11d), Double.valueOf(4.871376546026121E-7d)), new Pair(Double.valueOf(4.924318456933684E-11d), Double.valueOf(-2.1134321498475526E-7d)), new Pair(Double.valueOf(5.041255988911175E-11d), Double.valueOf(-1.2506042665560945E-7d)), new Pair(Double.valueOf(4.7122780780193565E-11d), Double.valueOf(6.018984993451572E-7d))};
    static final Pair[] IMX374_SONY_SC = {new Pair(Double.valueOf(4.144542835395522E-6d), Double.valueOf(9.480427159358125E-6d)), new Pair(Double.valueOf(4.100355724022791E-6d), Double.valueOf(3.389837027101259E-5d)), new Pair(Double.valueOf(4.108844100338628E-6d), Double.valueOf(3.303838758626457E-5d)), new Pair(Double.valueOf(4.133344753262276E-6d), Double.valueOf(1.1218063271333587E-5d))};
    static final Pair[] S5K3M5_OFF = {new Pair(Double.valueOf(2.418876274731368E-11d), Double.valueOf(2.4490356002901705E-7d)), new Pair(Double.valueOf(2.360345469254357E-11d), Double.valueOf(1.1265588879673361E-8d)), new Pair(Double.valueOf(2.4902031916959567E-11d), Double.valueOf(-9.903007972668303E-8d)), new Pair(Double.valueOf(1.8543303768069118E-11d), Double.valueOf(3.723267249508622E-7d))};
    static final Pair[] S5K3M5_SC = {new Pair(Double.valueOf(3.107641290651073E-6d), Double.valueOf(7.600057549145033E-6d)), new Pair(Double.valueOf(3.1283341958383926E-6d), Double.valueOf(1.4135977633602071E-5d)), new Pair(Double.valueOf(3.110830032368219E-6d), Double.valueOf(2.2485594714361476E-5d)), new Pair(Double.valueOf(2.531296179566105E-6d), Double.valueOf(3.848888680646501E-6d))};
    static final Pair[] IMX563_OFF = {new Pair(Double.valueOf(1.340363524042639E-11d), Double.valueOf(5.947055109070044E-6d)), new Pair(Double.valueOf(4.8745152924063984E-6d), Double.valueOf(4.8745152924063984E-6d)), new Pair(Double.valueOf(2.1240437149436882E-11d), Double.valueOf(4.8273754778352105E-6d)), new Pair(Double.valueOf(9.627692821581255E-12d), Double.valueOf(3.957605332788913E-6d))};
    static final Pair[] IMX563_SC = {new Pair(Double.valueOf(6.018652170751584E-6d), Double.valueOf(-7.927162761847115E-6d)), new Pair(Double.valueOf(5.744611595030634E-6d), Double.valueOf(-1.1570944112698554E-6d)), new Pair(Double.valueOf(5.780335390559921E-6d), Double.valueOf(-7.07010724470648E-6d)), new Pair(Double.valueOf(4.217343862429885E-237d), Double.valueOf(-6.334470430155532E-5d))};
    static final Pair[] S5KGH1_OFF = {new Pair(Double.valueOf(2.421389986033331E-12d), Double.valueOf(1.4922030203586867E-6d)), new Pair(Double.valueOf(2.7991725487530074E-12d), Double.valueOf(1.588936854745729E-6d)), new Pair(Double.valueOf(2.718182233116262E-12d), Double.valueOf(1.2943968660146769E-6d)), new Pair(Double.valueOf(2.2242897356871544E-12d), Double.valueOf(1.2326226921109025E-6d))};
    static final Pair[] S5KGH1_SC = {new Pair(Double.valueOf(3.0842217415262358E-6d), Double.valueOf(-1.7282996083720194E-5d)), new Pair(Double.valueOf(3.163059574041805E-6d), Double.valueOf(-1.969382092181348E-5d)), new Pair(Double.valueOf(3.183356842403596E-6d), Double.valueOf(-1.2356433030039386E-5d)), new Pair(Double.valueOf(3.6845288993031475E-6d), Double.valueOf(-6.327944047487873E-5d))};

    static {
        Pair pair = new Pair(Double.valueOf(Double.POSITIVE_INFINITY), Double.valueOf(2.1226871319802393E12d));
        Samsung_S5KGW1_2_OFF = new Pair[]{pair, pair, pair, pair};
        Pair pair2 = new Pair(Double.valueOf(4.511793494193809E22d), Double.valueOf(9.380359E-6d));
        Samsung_S5KGW1_2_SC = new Pair[]{pair2, pair2, pair2, pair2};
        GC02M1_ARNOVA_OFF = new Pair[]{new Pair(Double.valueOf(1.590688399142476E-11d), Double.valueOf(3.241324823978058E-6d)), new Pair(Double.valueOf(5.022989294466151E-12d), Double.valueOf(2.9717795028699435E-6d)), new Pair(Double.valueOf(5.453749322807677E-12d), Double.valueOf(2.3584556174540734E-6d)), new Pair(Double.valueOf(3.1989054146471657E-12d), Double.valueOf(1.2532747235448713E-6d))};
        GC02M1_ARNOVA_SC = new Pair[]{new Pair(Double.valueOf(2.040656132706203E-6d), Double.valueOf(2.857095393696793E-4d)), new Pair(Double.valueOf(2.064877390632027E-6d), Double.valueOf(1.5628902360789154E-4d)), new Pair(Double.valueOf(2.048496448526778E-6d), Double.valueOf(1.6667445067572415E-4d)), new Pair(Double.valueOf(2.2360830024260534E-6d), Double.valueOf(8.881927148727596E-5d))};
        IMX355_PX4A_CSTARK_OFF = new Pair[]{new Pair(Double.valueOf(2.807913702949688E-11d), Double.valueOf(5.135267628632169E-7d)), new Pair(Double.valueOf(2.8924331549337406E-11d), Double.valueOf(1.1458480753839371E-7d)), new Pair(Double.valueOf(2.919342303061266E-11d), Double.valueOf(1.1751502516611887E-7d)), new Pair(Double.valueOf(2.8529904771840007E-11d), Double.valueOf(4.048690604847681E-7d))};
        IMX355_PX4A_CSTARK_SC = new Pair[]{new Pair(Double.valueOf(4.369247017085483E-6d), Double.valueOf(-1.065135904305436E-5d)), new Pair(Double.valueOf(4.139291984996128E-6d), Double.valueOf(1.447610314708525E-5d)), new Pair(Double.valueOf(4.162299832033733E-6d), Double.valueOf(1.2871056808554618E-5d)), new Pair(Double.valueOf(4.236823362633609E-6d), Double.valueOf(2.288474268533626E-6d))};
        IMX363_CSTARK_OFF = new Pair[]{new Pair(Double.valueOf(3.9530895962686986E-11d), Double.valueOf(5.615181265161969E-7d)), new Pair(Double.valueOf(4.265311198583654E-11d), Double.valueOf(-1.1253494536010611E-7d)), new Pair(Double.valueOf(4.512440199399962E-11d), Double.valueOf(-1.6467411636068733E-7d)), new Pair(Double.valueOf(4.153469530658073E-11d), Double.valueOf(1.9866757384399096E-7d))};
        IMX363_CSTARK_SC = new Pair[]{new Pair(Double.valueOf(2.560000015248682E-6d), Double.valueOf(5.1812460764034624E-6d)), new Pair(Double.valueOf(2.5066581447811637E-6d), Double.valueOf(2.5131982620833775E-5d)), new Pair(Double.valueOf(2.5125068640321085E-6d), Double.valueOf(2.6211667898865033E-5d)), new Pair(Double.valueOf(2.5242316484357217E-6d), Double.valueOf(2.1282040288344432E-5d))};
        IMX363_PX4A_CSTARK_OFF = new Pair[]{new Pair(Double.valueOf(3.867407953406427E-11d), Double.valueOf(5.98039670218832E-7d)), new Pair(Double.valueOf(4.116647803282451E-11d), Double.valueOf(6.708433785444848E-8d)), new Pair(Double.valueOf(4.351671784082341E-11d), Double.valueOf(6.430992909753865E-8d)), new Pair(Double.valueOf(4.00980955457173E-11d), Double.valueOf(3.450694934319736E-7d))};
        IMX363_PX4A_CSTARK_SC = new Pair[]{new Pair(Double.valueOf(2.5747590093420727E-6d), Double.valueOf(7.117871048395003E-7d)), new Pair(Double.valueOf(2.505955751915668E-6d), Double.valueOf(1.9905344413559362E-5d)), new Pair(Double.valueOf(2.5097044074270815E-6d), Double.valueOf(2.0075067861289233E-5d)), new Pair(Double.valueOf(2.529313102814466E-6d), Double.valueOf(1.4805802101814094E-5d))};
        IMX363_PX4XL_CSTARK_OFF = new Pair[]{new Pair(Double.valueOf(1.76919012700663E-11d), Double.valueOf(2.4927303375018733E-7d)), new Pair(Double.valueOf(3.619772636877716E-11d), Double.valueOf(2.702349528747767E-7d)), new Pair(Double.valueOf(3.737148455042335E-11d), Double.valueOf(2.7492453191231214E-7d)), new Pair(Double.valueOf(1.8627230530940593E-11d), Double.valueOf(8.94570644821683E-8d))};
        IMX363_PX4XL_CSTARK_SC = new Pair[]{new Pair(Double.valueOf(2.4344380954185645E-6d), Double.valueOf(8.287530626785582E-6d)), new Pair(Double.valueOf(2.4530412411774323E-6d), Double.valueOf(1.537767948252536E-5d)), new Pair(Double.valueOf(2.4490359914649503E-6d), Double.valueOf(1.4979995762594027E-5d)), new Pair(Double.valueOf(2.434909179476234E-6d), Double.valueOf(1.5113311536435933E-5d))};
        IMX376_ARNOVA_OFF = new Pair[]{new Pair(Double.valueOf(2.361775969835899E-12d), Double.valueOf(4.080295090040104E-7d)), new Pair(Double.valueOf(2.472999852587334E-12d), Double.valueOf(2.4816603411784154E-7d)), new Pair(Double.valueOf(2.680320690466283E-12d), Double.valueOf(1.8047704493553334E-6d)), new Pair(Double.valueOf(3.3576159973007502E-12d), Double.valueOf(8.569970314609774E-7d))};
        IMX376_ARNOVA_SC = new Pair[]{new Pair(Double.valueOf(9.407783056480619E-7d), Double.valueOf(1.7908117805185842E-5d)), new Pair(Double.valueOf(1.0826688686614698E-6d), Double.valueOf(3.1601725966603345E-5d)), new Pair(Double.valueOf(1.0748059270161805E-6d), Double.valueOf(2.6544642274027472E-5d)), new Pair(Double.valueOf(8.555887944354038E-7d), Double.valueOf(3.646056333434225E-5d))};
        IMX471_ARNOVA_OFF = new Pair[]{new Pair(Double.valueOf(2.058311063162844E-12d), Double.valueOf(9.707188974092642E-8d)), new Pair(Double.valueOf(1.0587775976594015E-12d), Double.valueOf(-5.084089497563423E-7d)), new Pair(Double.valueOf(1.0525025607457071E-12d), Double.valueOf(-3.8750433199322626E-7d)), new Pair(Double.valueOf(2.2635113252592216E-12d), Double.valueOf(1.3253945820553748E-7d))};
        IMX471_ARNOVA_SC = new Pair[]{new Pair(Double.valueOf(8.273861508302018E-7d), Double.valueOf(1.2306399560041351E-5d)), new Pair(Double.valueOf(8.913891601326574E-7d), Double.valueOf(2.3857779560777922E-5d)), new Pair(Double.valueOf(9.001029441858606E-7d), Double.valueOf(2.1463588263362834E-5d)), new Pair(Double.valueOf(8.23522262676952E-7d), Double.valueOf(1.7679405645586624E-5d))};
        IMX481_SAP_OFF = new Pair[]{new Pair(Double.valueOf(-4.1202352402298914E-14d), Double.valueOf(1.0335175408750888E-6d)), new Pair(Double.valueOf(-6.222889838516411E-14d), Double.valueOf(5.508194762633859E-7d)), new Pair(Double.valueOf(-5.93365519208338E-14d), Double.valueOf(7.557051940878284E-7d)), new Pair(Double.valueOf(-4.3919054303038314E-14d), Double.valueOf(9.416677017511695E-7d))};
        IMX481_SAP_SC = new Pair[]{new Pair(Double.valueOf(1.723524778290816E-6d), Double.valueOf(-2.134295780752146E-5d)), new Pair(Double.valueOf(1.6350221136097833E-6d), Double.valueOf(1.6784910859191478E-5d)), new Pair(Double.valueOf(1.4251111092847876E-6d), Double.valueOf(1.7992277408792413E-5d)), new Pair(Double.valueOf(1.5571895958002161E-6d), Double.valueOf(-1.9747585550909817E-6d))};
        IMX519_ARNOVA_OFF = new Pair[]{new Pair(Double.valueOf(3.21006518553559E-12d), Double.valueOf(4.080295090040104E-7d)), new Pair(Double.valueOf(2.873851234805704E-12d), Double.valueOf(2.4816603411784154E-7d)), new Pair(Double.valueOf(2.5467820974139303E-12d), Double.valueOf(7.188648510654069E-8d)), new Pair(Double.valueOf(3.0340283779274613E-12d), Double.valueOf(2.1449823538539E-7d))};
        IMX519_ARNOVA_SC = new Pair[]{new Pair(Double.valueOf(1.1248746565187077E-6d), Double.valueOf(8.530233092095577E-6d)), new Pair(Double.valueOf(1.131360803844329E-6d), Double.valueOf(2.308365559223756E-6d)), new Pair(Double.valueOf(1.1332521104337232E-6d), Double.valueOf(1.1675784334993566E-5d)), new Pair(Double.valueOf(1.0919533207916602E-6d), Double.valueOf(3.1565571237540885E-5d))};
        IMX520_PX4XL_CSTARK_OFF = new Pair[]{new Pair(Double.valueOf(1.9244836533901144E-11d), Double.valueOf(3.943399747066369E-7d)), new Pair(Double.valueOf(1.9884487074145626E-11d), Double.valueOf(2.879885868722699E-7d)), new Pair(Double.valueOf(1.9611224994067538E-11d), Double.valueOf(2.93669654279777E-7d)), new Pair(Double.valueOf(1.9311197709624543E-11d), Double.valueOf(3.436161442929945E-7d))};
        IMX520_PX4XL_CSTARK_SC = new Pair[]{new Pair(Double.valueOf(2.9248182099507473E-6d), Double.valueOf(4.049982224054697E-6d)), new Pair(Double.valueOf(2.914893415667162E-6d), Double.valueOf(1.1872347523883005E-5d)), new Pair(Double.valueOf(2.9147095612222852E-6d), Double.valueOf(1.2014136926244972E-5d)), new Pair(Double.valueOf(2.917266844024644E-6d), Double.valueOf(9.49367834502517E-6d))};
        IMX555_CSTARK_OFF = new Pair[]{new Pair(Double.valueOf(8.497431948063333E-12d), Double.valueOf(3.9667340534085705E-7d)), new Pair(Double.valueOf(9.741383040658396E-12d), Double.valueOf(2.451813439468867E-7d)), new Pair(Double.valueOf(9.627315414193144E-12d), Double.valueOf(2.4297074669692216E-7d)), new Pair(Double.valueOf(8.930999848696876E-12d), Double.valueOf(3.2755827249373236E-7d))};
        IMX555_CSTARK_SC = new Pair[]{new Pair(Double.valueOf(1.510080215901803E-6d), Double.valueOf(1.9922197291595573E-6d)), new Pair(Double.valueOf(1.4858189667562422E-6d), Double.valueOf(8.900467218988272E-6d)), new Pair(Double.valueOf(1.4835112246548877E-6d), Double.valueOf(9.278646699086895E-6d)), new Pair(Double.valueOf(1.4887150542434756E-6d), Double.valueOf(7.378285013206709E-6d))};
        IMX586_AVG_SAP_OFF = new Pair[]{new Pair(Double.valueOf(2.4407820301561647E-11d), Double.valueOf(1.6459574435581148E-6d)), new Pair(Double.valueOf(2.71117247779124E-11d), Double.valueOf(2.2145485853138597E-7d)), new Pair(Double.valueOf(1.4803216436416858E-11d), Double.valueOf(6.537303890987755E-7d)), new Pair(Double.valueOf(1.3810342589160767E-11d), Double.valueOf(6.33679176770087E-7d))};
        IMX586_AVG_SAP_SC = new Pair[]{new Pair(Double.valueOf(3.049616216049247E-6d), Double.valueOf(-6.868533952433888E-5d)), new Pair(Double.valueOf(3.066356748497584E-6d), Double.valueOf(1.978742630786456E-5d)), new Pair(Double.valueOf(1.6137164051534832E-6d), Double.valueOf(2.5178983454240047E-6d)), new Pair(Double.valueOf(1.704456796158355E-6d), Double.valueOf(9.534749285514284E-6d))};
        IMX586_OFILM_MEVLUT_OFF = new Pair[]{new Pair(Double.valueOf(8.067572014624526E-13d), Double.valueOf(3.9056656122964715E-7d)), new Pair(Double.valueOf(7.773464258473416E-13d), Double.valueOf(3.149188526795121E-7d)), new Pair(Double.valueOf(3.6748064901253935E-13d), Double.valueOf(3.1481797698217946E-7d)), new Pair(Double.valueOf(4.019036059324814E-13d), Double.valueOf(3.197954420112496E-7d))};
        IMX586_OFILM_MEVLUT_SC = new Pair[]{new Pair(Double.valueOf(6.281207006508773E-7d), Double.valueOf(-1.814685091047006E-5d)), new Pair(Double.valueOf(6.383802624430682E-7d), Double.valueOf(6.692000773339953E-7d)), new Pair(Double.valueOf(3.287529645380076E-7d), Double.valueOf(2.228000814449896E-6d)), new Pair(Double.valueOf(3.6293696956961336E-7d), Double.valueOf(6.693047795465168E-7d))};
        IMX586_SAP2_OFF = new Pair[]{new Pair(Double.valueOf(1.3857479583040313E-12d), Double.valueOf(3.9683930265936344E-7d)), new Pair(Double.valueOf(1.2221197992437363E-12d), Double.valueOf(2.9747357540386417E-7d)), new Pair(Double.valueOf(6.737385493144974E-13d), Double.valueOf(3.402565576404127E-7d)), new Pair(Double.valueOf(7.237217467974183E-13d), Double.valueOf(2.9152476261314997E-7d))};
        IMX586_SAP2_SC = new Pair[]{new Pair(Double.valueOf(7.535701164354216E-7d), Double.valueOf(-1.9437278549213782E-5d)), new Pair(Double.valueOf(7.841249485142162E-7d), Double.valueOf(3.1678662617858464E-6d)), new Pair(Double.valueOf(4.0227640236997107E-7d), Double.valueOf(6.415410241205575E-7d)), new Pair(Double.valueOf(4.5383578938829866E-7d), Double.valueOf(-1.730673601432591E-6d))};
        IMX586_SAP_OFF = new Pair[]{new Pair(Double.valueOf(1.7351480902051339E-12d), Double.valueOf(4.2095052447793174E-7d)), new Pair(Double.valueOf(1.1253298343695474E-12d), Double.valueOf(8.554459490835028E-8d)), new Pair(Double.valueOf(5.790502727645846E-13d), Double.valueOf(3.321801828350202E-7d)), new Pair(Double.valueOf(6.429951493630863E-13d), Double.valueOf(3.864456886305994E-7d))};
        IMX586_SAP_SC = new Pair[]{new Pair(Double.valueOf(7.242611346129416E-7d), Double.valueOf(-1.5563423301194667E-5d)), new Pair(Double.valueOf(7.820961686393163E-7d), Double.valueOf(7.03789022484502E-6d)), new Pair(Double.valueOf(4.0439160715210895E-7d), Double.valueOf(4.269174157844167E-6d)), new Pair(Double.valueOf(4.457770362452317E-7d), Double.valueOf(5.066919239764131E-7d))};
        IMX586_SEMCO_RAKIN_OFF = new Pair[]{new Pair(Double.valueOf(-2.8294164022358084E-12d), Double.valueOf(6.426725807423459E-7d)), new Pair(Double.valueOf(-5.641995917226965E-12d), Double.valueOf(5.866266572952281E-7d)), new Pair(Double.valueOf(-5.733030044620391E-12d), Double.valueOf(5.186897523753698E-7d)), new Pair(Double.valueOf(-1.875708003631557E-12d), Double.valueOf(-6.550241693443052E-7d))};
        IMX586_SEMCO_RAKIN_SC = new Pair[]{new Pair(Double.valueOf(6.591330096140277E-7d), Double.valueOf(-1.5334597547617306E-5d)), new Pair(Double.valueOf(6.934404121864833E-7d), Double.valueOf(2.1145286043444204E-6d)), new Pair(Double.valueOf(3.5982073741179383E-7d), Double.valueOf(2.771354010210994E-6d)), new Pair(Double.valueOf(3.9689047872154866E-7d), Double.valueOf(3.983422285389974E-8d))};
        IMX586_VIOLET_ARCHESOLUS_OFF = new Pair[]{new Pair(Double.valueOf(1.6515086197335443E-12d), Double.valueOf(4.324651934303984E-7d)), new Pair(Double.valueOf(1.0251352307282652E-12d), Double.valueOf(2.4725609679028823E-7d)), new Pair(Double.valueOf(5.158489384160834E-13d), Double.valueOf(4.203792298637016E-7d)), new Pair(Double.valueOf(5.364678944740704E-13d), Double.valueOf(3.7866419602639853E-7d))};
        IMX586_VIOLET_ARCHESOLUS_SC = new Pair[]{new Pair(Double.valueOf(6.037535739922917E-7d), Double.valueOf(-1.218967431872243E-5d)), new Pair(Double.valueOf(6.765018377265514E-7d), Double.valueOf(2.8539483085322503E-6d)), new Pair(Double.valueOf(3.5018761360980846E-7d), Double.valueOf(-1.0823474845872377E-6d)), new Pair(Double.valueOf(3.9226997956421583E-7d), Double.valueOf(-3.5871007863050484E-6d))};
        IMX682_ARNOVA_OFF = new Pair[]{new Pair(Double.valueOf(1.4606094535485033E-12d), Double.valueOf(4.3590990559816934E-7d)), new Pair(Double.valueOf(1.1559895717120879E-12d), Double.valueOf(1.8725291103007458E-7d)), new Pair(Double.valueOf(5.810883712550159E-13d), Double.valueOf(2.966014855273631E-7d)), new Pair(Double.valueOf(6.477436154830587E-13d), Double.valueOf(3.702587119823133E-7d))};
        IMX682_ARNOVA_SC = new Pair[]{new Pair(Double.valueOf(5.93610237095232E-7d), Double.valueOf(-1.2030344098536643E-5d)), new Pair(Double.valueOf(6.485308697994456E-7d), Double.valueOf(6.703821032422082E-6d)), new Pair(Double.valueOf(3.3311227866996336E-7d), Double.valueOf(5.229025183973859E-6d)), new Pair(Double.valueOf(3.676298595679989E-7d), Double.valueOf(-1.7983459929189314E-7d))};
        IMX686_ARNOVA_OFF = new Pair[]{new Pair(Double.valueOf(7.513481600529863E-13d), Double.valueOf(3.98395301495533E-7d)), new Pair(Double.valueOf(6.484606027737068E-13d), Double.valueOf(2.365713239316016E-7d)), new Pair(Double.valueOf(5.036183923096951E-13d), Double.valueOf(6.544546856417083E-7d)), new Pair(Double.valueOf(4.79332681445021E-13d), Double.valueOf(5.488184276649484E-7d))};
        IMX686_ARNOVA_SC = new Pair[]{new Pair(Double.valueOf(6.063777735190059E-7d), Double.valueOf(-1.4039155626356356E-5d)), new Pair(Double.valueOf(6.35582917417734E-7d), Double.valueOf(8.075991718729735E-6d)), new Pair(Double.valueOf(3.299120288227617E-7d), Double.valueOf(2.115311373246613E-6d)), new Pair(Double.valueOf(3.621129824789534E-7d), Double.valueOf(1.296891890611348E-6d))};
        IMX689_ARNOVA_OFF = new Pair[]{new Pair(Double.valueOf(2.4107716318285278E-12d), Double.valueOf(7.437326432752264E-7d)), new Pair(Double.valueOf(1.483385822216663E-12d), Double.valueOf(5.34417018453911E-7d)), new Pair(Double.valueOf(1.5044647809042385E-12d), Double.valueOf(5.161458647703001E-7d)), new Pair(Double.valueOf(1.1190066986899432E-12d), Double.valueOf(5.936138642139374E-7d))};
        IMX689_ARNOVA_SC = new Pair[]{new Pair(Double.valueOf(4.079372272877911E-7d), Double.valueOf(1.4624464867884615E-5d)), new Pair(Double.valueOf(4.5973981021186984E-7d), Double.valueOf(1.0645416334512508E-5d)), new Pair(Double.valueOf(4.599050076050646E-7d), Double.valueOf(1.1049869478594863E-5d)), new Pair(Double.valueOf(4.6857747411581564E-7d), Double.valueOf(1.0009755192034518E-5d))};
        OV13855_ARCHESOLUS_OFF = new Pair[]{new Pair(Double.valueOf(-4.5108957191851255E-12d), Double.valueOf(-1.847768534759474E-7d)), new Pair(Double.valueOf(-8.351810332186092E-12d), Double.valueOf(-6.625690235375723E-7d)), new Pair(Double.valueOf(-8.828955917598337E-12d), Double.valueOf(-7.587781907824528E-7d)), new Pair(Double.valueOf(-4.160007096285813E-12d), Double.valueOf(-3.8659826489769503E-7d))};
        OV13855_ARCHESOLUS_SC = new Pair[]{new Pair(Double.valueOf(1.0498044880928294E-6d), Double.valueOf(5.8380841436632115E-5d)), new Pair(Double.valueOf(1.0499838219276777E-6d), Double.valueOf(7.742263546110941E-5d)), new Pair(Double.valueOf(1.0696431880172118E-6d), Double.valueOf(7.885539068089481E-5d)), new Pair(Double.valueOf(1.1065392865179288E-6d), Double.valueOf(9.454564978416739E-5d))};
        OV8856_ARNOVA_OFF = new Pair[]{new Pair(Double.valueOf(2.710509529497973E-11d), Double.valueOf(4.7529402273534696E-6d)), new Pair(Double.valueOf(-1.5256185231142874E-11d), Double.valueOf(4.953642045597144E-6d)), new Pair(Double.valueOf(-6.796157576592285E-12d), Double.valueOf(4.651713033408851E-6d)), new Pair(Double.valueOf(3.435027761365672E-12d), Double.valueOf(4.825302353267576E-6d))};
        OV8856_ARNOVA_SC = new Pair[]{new Pair(Double.valueOf(2.6422076558113384E-6d), Double.valueOf(2.1653330218084413E-4d)), new Pair(Double.valueOf(4.625833743592171E-6d), Double.valueOf(8.892882585453921E-5d)), new Pair(Double.valueOf(4.557361381438625E-6d), Double.valueOf(1.1576467373442441E-4d)), new Pair(Double.valueOf(3.058596947827473E-6d), Double.valueOf(5.317251875028955E-5d))};
        S5K3M5_SAP_OFF = new Pair[]{new Pair(Double.valueOf(6.393139451907586E-12d), Double.valueOf(2.6711059550692037E-7d)), new Pair(Double.valueOf(6.738333537524045E-12d), Double.valueOf(-2.2563025078762078E-7d)), new Pair(Double.valueOf(6.845460819964984E-12d), Double.valueOf(-2.9050259826371E-7d)), new Pair(Double.valueOf(5.313327914514723E-12d), Double.valueOf(2.7043137507613384E-7d))};
        S5K3M5_SAP_SC = new Pair[]{new Pair(Double.valueOf(1.5927034005364303E-6d), Double.valueOf(6.511741854650378E-6d)), new Pair(Double.valueOf(1.5888828235244699E-6d), Double.valueOf(1.863536347876196E-5d)), new Pair(Double.valueOf(1.5844172153727016E-6d), Double.valueOf(2.349846044488917E-5d)), new Pair(Double.valueOf(1.2929165132777582E-6d), Double.valueOf(8.202677579758039E-6d))};
        S5K3T2_SAVITAR_OFF = new Pair[]{new Pair(Double.valueOf(4.969345368498326E-12d), Double.valueOf(4.45468700921302E-7d)), new Pair(Double.valueOf(5.086774111907292E-12d), Double.valueOf(3.445078005349451E-7d)), new Pair(Double.valueOf(5.045779381679925E-12d), Double.valueOf(2.833751328077128E-7d)), new Pair(Double.valueOf(5.0531079888783585E-12d), Double.valueOf(3.8271571936014857E-7d))};
        S5K3T2_SAVITAR_SC = new Pair[]{new Pair(Double.valueOf(1.7256808315484048E-6d), Double.valueOf(-1.756129046737042E-6d)), new Pair(Double.valueOf(1.7294709440868024E-6d), Double.valueOf(3.859623656408763E-6d)), new Pair(Double.valueOf(1.7079398125056823E-6d), Double.valueOf(5.685760616033548E-6d)), new Pair(Double.valueOf(1.7280430567679621E-6d), Double.valueOf(1.8530878486698612E-6d))};
        S5KGM2_CSTARK_OFF = new Pair[]{new Pair(Double.valueOf(-9.46749961956185E-13d), Double.valueOf(1.3891287164811258E-7d)), new Pair(Double.valueOf(-3.3999695877570462E-12d), Double.valueOf(-1.0526286448492638E-7d)), new Pair(Double.valueOf(-3.459275099308495E-12d), Double.valueOf(-5.903944404062111E-8d)), new Pair(Double.valueOf(-1.5125038986088285E-12d), Double.valueOf(2.0882338070730947E-8d))};
        S5KGM2_CSTARK_SC = new Pair[]{new Pair(Double.valueOf(1.2924905073503056E-6d), Double.valueOf(5.02648502841206E-6d)), new Pair(Double.valueOf(1.2928283057984556E-6d), Double.valueOf(9.244576572320962E-6d)), new Pair(Double.valueOf(1.2929345473059203E-6d), Double.valueOf(7.903574258233677E-6d)), new Pair(Double.valueOf(1.2874627193855998E-6d), Double.valueOf(7.064092985846772E-6d))};
        S5KHMX1_SAVITAR_OFF = new Pair[]{new Pair(Double.valueOf(9.903945921956313E-13d), Double.valueOf(4.7154308447440835E-7d)), new Pair(Double.valueOf(1.1013407406787164E-12d), Double.valueOf(4.0521449481065586E-7d)), new Pair(Double.valueOf(1.0823009180969327E-12d), Double.valueOf(3.8562159831722724E-7d)), new Pair(Double.valueOf(9.90797453982598E-13d), Double.valueOf(6.32004882872964E-7d))};
        S5KHMX1_SAVITAR_SC = new Pair[]{new Pair(Double.valueOf(7.197777128084277E-7d), Double.valueOf(1.5764429342619112E-6d)), new Pair(Double.valueOf(6.787758564625527E-7d), Double.valueOf(7.637733639341263E-6d)), new Pair(Double.valueOf(6.827870664081287E-7d), Double.valueOf(6.982401346435654E-6d)), new Pair(Double.valueOf(7.460570369198482E-7d), Double.valueOf(-6.256375604778196E-6d))};
        S5KHMX_SAVITAR_OFF = new Pair[]{new Pair(Double.valueOf(3.805336796537662E-12d), Double.valueOf(8.232733218749411E-7d)), new Pair(Double.valueOf(3.6269288569895153E-12d), Double.valueOf(7.660445340240666E-7d)), new Pair(Double.valueOf(3.637212271073568E-12d), Double.valueOf(7.675852674573227E-7d)), new Pair(Double.valueOf(3.66870924034513E-12d), Double.valueOf(7.945546688289329E-7d))};
        S5KHMX_SAVITAR_SC = new Pair[]{new Pair(Double.valueOf(1.354465772791874E-6d), Double.valueOf(-6.3316830799491E-6d)), new Pair(Double.valueOf(1.3047394616796737E-6d), Double.valueOf(-2.6115318245729493E-6d)), new Pair(Double.valueOf(1.3312099388850873E-6d), Double.valueOf(-5.889622344682246E-6d)), new Pair(Double.valueOf(1.440071502624118E-6d), Double.valueOf(-1.7650536520858908E-5d))};
        SAVITAR_Macro_OFF = new Pair[]{new Pair(Double.valueOf(-2.1654721090993902E-11d), Double.valueOf(1.6831535715035199E-6d)), new Pair(Double.valueOf(-3.7929425628812274E-11d), Double.valueOf(1.1041714698677676E-6d)), new Pair(Double.valueOf(-3.598331595999738E-11d), Double.valueOf(9.858382888467265E-7d)), new Pair(Double.valueOf(-2.3820697533759186E-11d), Double.valueOf(1.4071389252897514E-6d))};
        SAVITAR_Macro_SC = new Pair[]{new Pair(Double.valueOf(4.717542145950611E-6d), Double.valueOf(7.052415506914865E-6d)), new Pair(Double.valueOf(4.744420173316149E-6d), Double.valueOf(2.3934075366758663E-5d)), new Pair(Double.valueOf(4.715834824558392E-6d), Double.valueOf(2.8141473211543027E-5d)), new Pair(Double.valueOf(4.679917150112564E-6d), Double.valueOf(1.9649374577475087E-5d))};
        UWA_SAVITAR_OFF = new Pair[]{new Pair(Double.valueOf(-2.8294164022358084E-12d), Double.valueOf(6.426725807423459E-7d)), new Pair(Double.valueOf(-5.641995917226965E-12d), Double.valueOf(5.866266572952281E-7d)), new Pair(Double.valueOf(-5.733030044620391E-12d), Double.valueOf(5.186897523753698E-7d)), new Pair(Double.valueOf(-1.875708003631557E-12d), Double.valueOf(-6.550241693443052E-7d))};
        UWA_SAVITAR_SC = new Pair[]{new Pair(Double.valueOf(2.5182695000217713E-6d), Double.valueOf(6.130717460301975E-5d)), new Pair(Double.valueOf(2.176094486323927E-6d), Double.valueOf(9.363324993040339E-5d)), new Pair(Double.valueOf(2.2124281242577336E-6d), Double.valueOf(9.387765555268302E-5d)), new Pair(Double.valueOf(2.172667777633687E-6d), Double.valueOf(2.4342515539645744E-4d))};
        S5KHMX_OFF = new Pair[]{new Pair(Double.valueOf(4.303739947698806E-12d), Double.valueOf(7.796061774018726E-7d)), new Pair(Double.valueOf(3.801451793646833E-12d), Double.valueOf(6.459167799868641E-7d)), new Pair(Double.valueOf(3.719331681205487E-12d), Double.valueOf(6.716155575812885E-7d)), new Pair(Double.valueOf(4.0545828735352165E-12d), Double.valueOf(7.556604827071912E-7d))};
        S5KHMX_SC = new Pair[]{new Pair(Double.valueOf(1.4710891321600536E-6d), Double.valueOf(-1.1286871680113966E-5d)), new Pair(Double.valueOf(1.3510462348278469E-6d), Double.valueOf(-1.0452730910612234E-7d)), new Pair(Double.valueOf(1.366506496680252E-6d), Double.valueOf(-2.379787503124652E-6d)), new Pair(Double.valueOf(1.428429109502138E-6d), Double.valueOf(-1.0333576951611067E-5d))};
        S5K3T2_OFF = new Pair[]{new Pair(Double.valueOf(2.0817840796688906E-11d), Double.valueOf(4.699335719956273E-7d)), new Pair(Double.valueOf(2.0819726696911242E-11d), Double.valueOf(4.817098390502666E-7d)), new Pair(Double.valueOf(2.0630004676129923E-11d), Double.valueOf(4.824692404173973E-7d)), new Pair(Double.valueOf(2.0833822839648464E-11d), Double.valueOf(4.679860942302582E-7d))};
        S5K3T2_SC = new Pair[]{new Pair(Double.valueOf(3.4711594514167303E-6d), Double.valueOf(-5.9991533762007175E-6d)), new Pair(Double.valueOf(3.429080503897902E-6d), Double.valueOf(-9.748682478044983E-6d)), new Pair(Double.valueOf(3.415324968358495E-6d), Double.valueOf(-1.1951139670860392E-5d)), new Pair(Double.valueOf(3.515983137586475E-6d), Double.valueOf(-8.376967164213415E-6d))};
        S5K5E9_OFF = new Pair[]{new Pair(Double.valueOf(5.1315466058606874E-11d), Double.valueOf(4.7443793185954894E-7d)), new Pair(Double.valueOf(5.3797873838376726E-11d), Double.valueOf(1.8413526993930178E-7d)), new Pair(Double.valueOf(5.12794311746949E-11d), Double.valueOf(1.171416932147866E-7d)), new Pair(Double.valueOf(5.105098100338494E-11d), Double.valueOf(2.518195013481469E-7d))};
        S5K5E9_SC = new Pair[]{new Pair(Double.valueOf(3.6941316278534467E-6d), Double.valueOf(1.5155324121534171E-6d)), new Pair(Double.valueOf(3.693657614177134E-6d), Double.valueOf(1.0927883319899481E-5d)), new Pair(Double.valueOf(3.6860432127893983E-6d), Double.valueOf(1.1561474529403276E-5d)), new Pair(Double.valueOf(3.6785905303397487E-6d), Double.valueOf(1.0023440923573759E-5d))};
        OV13B10_OFF = new Pair[]{new Pair(Double.valueOf(-2.2401209847592446E-12d), Double.valueOf(6.430848610590508E-7d)), new Pair(Double.valueOf(-3.5286507399302953E-12d), Double.valueOf(6.777771147737735E-7d)), new Pair(Double.valueOf(-3.542275712120277E-12d), Double.valueOf(6.617148412439337E-7d)), new Pair(Double.valueOf(-2.7028687854492237E-12d), Double.valueOf(5.664057963625833E-7d))};
        OV13B10_SC = new Pair[]{new Pair(Double.valueOf(3.1153904403964444E-6d), Double.valueOf(1.522269096959186E-5d)), new Pair(Double.valueOf(2.741094778603847E-6d), Double.valueOf(4.479322529689532E-5d)), new Pair(Double.valueOf(2.73025649282933E-6d), Double.valueOf(4.807279509681852E-5d)), new Pair(Double.valueOf(2.7463450629426986E-6d), Double.valueOf(9.346911553771206E-5d))};
        LGV50_s5k3m5_3_OFF = new Pair[]{new Pair(Double.valueOf(2.5510586254795216E-11d), Double.valueOf(3.8478874334979405E-7d)), new Pair(Double.valueOf(2.550590557952781E-11d), Double.valueOf(3.6579467813062283E-7d)), new Pair(Double.valueOf(2.6444290791280195E-11d), Double.valueOf(3.775425609769892E-7d)), new Pair(Double.valueOf(2.0752415619477277E-11d), Double.valueOf(3.222983987454178E-7d))};
        LGV50_s5k3m5_3_SC = new Pair[]{new Pair(Double.valueOf(3.4682791625378023E-6d), Double.valueOf(-2.641496655784029E-5d)), new Pair(Double.valueOf(3.2876420614122565E-6d), Double.valueOf(-9.638648281602775E-6d)), new Pair(Double.valueOf(3.269164529196736E-6d), Double.valueOf(-8.023982109598632E-6d)), new Pair(Double.valueOf(2.8397118983775627E-6d), Double.valueOf(-1.1109901325016645E-5d))};
        LGV50_IMX363_0_OFF = new Pair[]{new Pair(Double.valueOf(2.9917133034145296E-11d), Double.valueOf(3.275624181535426E-7d)), new Pair(Double.valueOf(6.086258466440452E-11d), Double.valueOf(6.624913143068297E-7d)), new Pair(Double.valueOf(6.308190715155536E-11d), Double.valueOf(6.662466882279819E-7d)), new Pair(Double.valueOf(3.0739030068625654E-11d), Double.valueOf(3.1510627507887423E-7d))};
        LGV50_IMX363_0_SC = new Pair[]{new Pair(Double.valueOf(2.691353781189422E-6d), Double.valueOf(5.607265966668617E-6d)), new Pair(Double.valueOf(2.6817014313123966E-6d), Double.valueOf(1.0263138748900872E-5d)), new Pair(Double.valueOf(2.682315890739256E-6d), Double.valueOf(1.0650013817119217E-5d)), new Pair(Double.valueOf(2.695296790679005E-6d), Double.valueOf(7.6267061661234736E-6d))};
        LGV50_IMX351_2_OFF = new Pair[]{new Pair(Double.valueOf(3.120986096920601E-11d), Double.valueOf(5.155904840835123E-7d)), new Pair(Double.valueOf(3.024063437813071E-11d), Double.valueOf(4.146269845628112E-7d)), new Pair(Double.valueOf(3.053197167712915E-11d), Double.valueOf(4.083957939852829E-7d)), new Pair(Double.valueOf(3.1207882849118573E-11d), Double.valueOf(5.025064581013141E-7d))};
        LGV50_IMX351_2_SC = new Pair[]{new Pair(Double.valueOf(3.8258606080195075E-6d), Double.valueOf(-4.6434767272138893E-5d)), new Pair(Double.valueOf(3.2008252475740936E-6d), Double.valueOf(-1.0917595226160695E-5d)), new Pair(Double.valueOf(3.198942368079354E-6d), Double.valueOf(-1.0648744292159725E-5d)), new Pair(Double.valueOf(3.856480506192772E-6d), Double.valueOf(-4.2814906919669436E-5d))};
        MI10U_2x_S5K2L7_OFF = new Pair[]{new Pair(Double.valueOf(-3.1510628562986004E-12d), Double.valueOf(6.877038512862356E-7d)), new Pair(Double.valueOf(-7.143462287895284E-12d), Double.valueOf(4.278293164540484E-7d)), new Pair(Double.valueOf(-7.599040696687617E-12d), Double.valueOf(3.7782662462229533E-7d)), new Pair(Double.valueOf(-5.093703718094932E-12d), Double.valueOf(4.849074405514747E-7d))};
        MI10U_2x_S5K2L7_SC = new Pair[]{new Pair(Double.valueOf(2.9301888932937834E-6d), Double.valueOf(2.9312294435645307E-7d)), new Pair(Double.valueOf(2.711646325625571E-6d), Double.valueOf(1.9297783589617785E-5d)), new Pair(Double.valueOf(2.699993643013801E-6d), Double.valueOf(2.0870153148350997E-5d)), new Pair(Double.valueOf(2.7010819869230837E-6d), Double.valueOf(1.6667063099586657E-5d))};
        MI10U_5x_IMX586_OFF = new Pair[]{new Pair(Double.valueOf(5.31888668342756E-12d), Double.valueOf(3.8385388912925973E-7d)), new Pair(Double.valueOf(1.8658628295713372E-12d), Double.valueOf(-1.0288782930712185E-7d)), new Pair(Double.valueOf(1.0911685496439347E-12d), Double.valueOf(2.9541912407697537E-7d)), new Pair(Double.valueOf(1.0477839002857804E-12d), Double.valueOf(4.1845139647549235E-7d))};
        MI10U_5x_IMX586_SC = new Pair[]{new Pair(Double.valueOf(1.053762902139635E-6d), Double.valueOf(-8.532162916353741E-6d)), new Pair(Double.valueOf(1.2053427230503224E-6d), Double.valueOf(7.437459572377939E-6d)), new Pair(Double.valueOf(6.109445552637957E-7d), Double.valueOf(3.1163563669055395E-6d)), new Pair(Double.valueOf(6.783153967227434E-7d), Double.valueOf(-2.366038310067122E-6d))};
        MI10U_Front_S5K3T2_OFF = new Pair[]{new Pair(Double.valueOf(1.9336923425998037E-11d), Double.valueOf(4.1126570357849045E-7d)), new Pair(Double.valueOf(2.17723241457366E-11d), Double.valueOf(2.782710801547291E-7d)), new Pair(Double.valueOf(2.0004782236763923E-11d), Double.valueOf(2.875368171243818E-7d)), new Pair(Double.valueOf(1.9268673797571455E-11d), Double.valueOf(3.670222504423021E-7d))};
        MI10U_Front_S5K3T2_SC = new Pair[]{new Pair(Double.valueOf(3.3839328830854862E-6d), Double.valueOf(-1.4716025247823725E-7d)), new Pair(Double.valueOf(3.398941825670404E-6d), Double.valueOf(5.187032795178749E-6d)), new Pair(Double.valueOf(3.3797923700508456E-6d), Double.valueOf(4.415459221307766E-6d)), new Pair(Double.valueOf(3.416332300818453E-6d), Double.valueOf(1.1373541444242282E-6d))};
        MI10U_Main_OV48C_OFF = new Pair[]{new Pair(Double.valueOf(7.027204762776991E-13d), Double.valueOf(5.957591943252334E-7d)), new Pair(Double.valueOf(2.9394678194405552E-12d), Double.valueOf(5.965202522059852E-7d)), new Pair(Double.valueOf(3.2290379440720168E-12d), Double.valueOf(6.196807900725667E-7d)), new Pair(Double.valueOf(5.183783005575709E-13d), Double.valueOf(4.784574390339784E-7d))};
        MI10U_Main_OV48C_SC = new Pair[]{new Pair(Double.valueOf(6.822973636289237E-7d), Double.valueOf(4.7675278148798936E-6d)), new Pair(Double.valueOf(4.411099911499294E-7d), Double.valueOf(2.3680910116754668E-6d)), new Pair(Double.valueOf(4.3175085834662417E-7d), Double.valueOf(1.5143874190821574E-6d)), new Pair(Double.valueOf(5.959034133263064E-7d), Double.valueOf(5.298762090211848E-6d))};
        MI10U_UW_IMX350_OFF = new Pair[]{new Pair(Double.valueOf(-2.0979073309828657E-12d), Double.valueOf(1.0865283638976321E-6d)), new Pair(Double.valueOf(-5.54359592356158E-12d), Double.valueOf(6.849585625279857E-7d)), new Pair(Double.valueOf(-5.6683090465553965E-12d), Double.valueOf(7.220000765676395E-7d)), new Pair(Double.valueOf(-2.882321391483526E-12d), Double.valueOf(1.008989594885646E-6d))};
        MI10U_UW_IMX350_SC = new Pair[]{new Pair(Double.valueOf(3.853189022958072E-6d), Double.valueOf(-2.222925344599069E-5d)), new Pair(Double.valueOf(3.4264401782837554E-6d), Double.valueOf(2.0101161869953093E-5d)), new Pair(Double.valueOf(3.4321912679519885E-6d), Double.valueOf(1.8286510636158758E-5d)), new Pair(Double.valueOf(3.7820995590804905E-6d), Double.valueOf(-6.709565196809672E-6d))};
        RN9S_S5KGM2_0_OFF = new Pair[]{new Pair(Double.valueOf(7.162779052134337E-13d), Double.valueOf(3.41068688245735E-7d)), new Pair(Double.valueOf(7.011635670402076E-13d), Double.valueOf(2.2070523714639684E-7d)), new Pair(Double.valueOf(7.147087453384261E-13d), Double.valueOf(1.837349111571008E-7d)), new Pair(Double.valueOf(7.032771503540412E-13d), Double.valueOf(3.7332709031868095E-7d))};
        RN9S_S5KGM2_0_SC = new Pair[]{new Pair(Double.valueOf(3.8149708630354017E-7d), Double.valueOf(3.0683793854810103E-6d)), new Pair(Double.valueOf(3.825101370340864E-7d), Double.valueOf(6.230680014932392E-6d)), new Pair(Double.valueOf(3.813097248141632E-7d), Double.valueOf(8.541011185702983E-6d)), new Pair(Double.valueOf(3.8581324942921835E-7d), Double.valueOf(1.5665573843659396E-6d))};
        RN9S_S5K5E9_22_OFF = new Pair[]{new Pair(Double.valueOf(1.5170773716923652E-11d), Double.valueOf(2.3521973919866228E-7d)), new Pair(Double.valueOf(1.5352886984735387E-11d), Double.valueOf(-2.718849350212223E-7d)), new Pair(Double.valueOf(1.3834587941658361E-11d), Double.valueOf(-3.5991708623237367E-7d)), new Pair(Double.valueOf(1.3809496771705792E-11d), Double.valueOf(3.014445862185881E-7d))};
        RN9S_S5K5E9_22_SC = new Pair[]{new Pair(Double.valueOf(1.8569049351578922E-6d), Double.valueOf(6.810002004645316E-6d)), new Pair(Double.valueOf(1.8575670338436679E-6d), Double.valueOf(1.7191987893203065E-5d)), new Pair(Double.valueOf(1.8606064567570528E-6d), Double.valueOf(1.8442796702371956E-5d)), new Pair(Double.valueOf(1.8593974726290546E-6d), Double.valueOf(5.581805294883621E-6d))};
        RN9S_OV8856_21_OFF = new Pair[]{new Pair(Double.valueOf(-6.759117598302902E-13d), Double.valueOf(1.0493434078478835E-8d)), new Pair(Double.valueOf(-1.6148023673431822E-12d), Double.valueOf(-6.605554523056441E-7d)), new Pair(Double.valueOf(-1.684270642876226E-12d), Double.valueOf(-7.002509304439992E-7d)), new Pair(Double.valueOf(-7.316925927994267E-13d), Double.valueOf(-8.136378438844328E-8d))};
        RN9S_OV8856_21_SC = new Pair[]{new Pair(Double.valueOf(1.22753866934064E-6d), Double.valueOf(1.1617082096102847E-4d)), new Pair(Double.valueOf(1.1510528253346127E-6d), Double.valueOf(1.4270686116497417E-4d)), new Pair(Double.valueOf(1.1519531203422065E-6d), Double.valueOf(1.4301265242418605E-4d)), new Pair(Double.valueOf(1.1986692622408061E-6d), Double.valueOf(1.2847623004772166E-4d))};
        RN9S_OV16A1Q_1_NOISE_fix_OFF = new Pair[]{new Pair(Double.valueOf(2.9259500299526862E-12d), Double.valueOf(2.946450990157466E-7d)), new Pair(Double.valueOf(1.6753391480096164E-12d), Double.valueOf(-6.422722542080711E-8d)), new Pair(Double.valueOf(1.6893502249220108E-12d), Double.valueOf(-2.7171881963333693E-8d)), new Pair(Double.valueOf(2.1354030570435844E-12d), Double.valueOf(3.0138880189964954E-7d))};
        RN9S_OV16A1Q_1_NOISE_fix_SC = new Pair[]{new Pair(Double.valueOf(1.1355484737661006E-6d), Double.valueOf(5.121022934814428E-5d)), new Pair(Double.valueOf(1.176042359318061E-6d), Double.valueOf(4.4187316475242214E-5d)), new Pair(Double.valueOf(1.1757080931867842E-6d), Double.valueOf(4.251204700622479E-5d)), new Pair(Double.valueOf(1.2382181694271028E-6d), Double.valueOf(2.7298867765196392E-5d))};
        RN9S_GC02M1_20_OFF = new Pair[]{new Pair(Double.valueOf(1.0083120353476891E-13d), Double.valueOf(1.1176699324221493E-6d)), new Pair(Double.valueOf(-1.1165350938193049E-12d), Double.valueOf(7.121000317786408E-7d)), new Pair(Double.valueOf(-3.0526667534790585E-12d), Double.valueOf(7.807081609204163E-7d)), new Pair(Double.valueOf(1.8881173115945405E-12d), Double.valueOf(1.4067321822645155E-6d))};
        RN9S_GC02M1_20_SC = new Pair[]{new Pair(Double.valueOf(2.4200084532585074E-6d), Double.valueOf(9.56384345694705E-6d)), new Pair(Double.valueOf(2.468735071613404E-6d), Double.valueOf(1.3836233753385901E-5d)), new Pair(Double.valueOf(2.4540456251683367E-6d), Double.valueOf(1.2022446134380257E-5d)), new Pair(Double.valueOf(2.3945036475177424E-6d), Double.valueOf(4.542943989803444E-6d))};
        Pocox3nfc_imx682_i_sony_661_OFF = new Pair[]{new Pair(Double.valueOf(5.8675536217939195E-12d), Double.valueOf(9.856599902931143E-5d)), new Pair(Double.valueOf(5.3773023360459415E-12d), Double.valueOf(9.813562549713927E-5d)), new Pair(Double.valueOf(5.782809994747673E-12d), Double.valueOf(9.892315973069647E-5d)), new Pair(Double.valueOf(5.653773456348876E-12d), Double.valueOf(9.85635186357755E-5d))};
        Pocox3nfc_imx682_i_sony_661_SC = new Pair[]{new Pair(Double.valueOf(3.6112065910260735E-7d), Double.valueOf(0.001506547821804961d)), new Pair(Double.valueOf(3.246000126216271E-7d), Double.valueOf(0.0015057255608239154d)), new Pair(Double.valueOf(3.5469362596939144E-7d), Double.valueOf(0.0015113472569226263d)), new Pair(Double.valueOf(3.4712663227762084E-7d), Double.valueOf(0.0015075962152107313d))};
        PocoX3Pro_IMX582_new_0_OFF = new Pair[]{new Pair(Double.valueOf(6.1924191987382466E-12d), Double.valueOf(4.2277328686151914E-7d)), new Pair(Double.valueOf(4.89326519401308E-12d), Double.valueOf(-6.558164527869965E-8d)), new Pair(Double.valueOf(3.3497594024907993E-12d), Double.valueOf(3.481851832821333E-7d)), new Pair(Double.valueOf(2.8312700321969208E-12d), Double.valueOf(3.312224586149468E-7d))};
        PocoX3Pro_IMX582_new_0_SC = new Pair[]{new Pair(Double.valueOf(1.0532095189258927E-6d), Double.valueOf(-1.1638880243115061E-5d)), new Pair(Double.valueOf(1.181862939038596E-6d), Double.valueOf(1.1522236862149903E-5d)), new Pair(Double.valueOf(5.812640446737758E-7d), Double.valueOf(1.8607617323933644E-6d)), new Pair(Double.valueOf(6.517369221835729E-7d), Double.valueOf(-1.649345528659577E-6d))};
        PocoX3Pro_S5K3T2_new_1_OFF = new Pair[]{new Pair(Double.valueOf(5.369379167834468E-12d), Double.valueOf(4.498202918072871E-7d)), new Pair(Double.valueOf(6.063643784926979E-12d), Double.valueOf(3.2495639645545774E-7d)), new Pair(Double.valueOf(6.262026006615693E-12d), Double.valueOf(3.4252018102105474E-7d)), new Pair(Double.valueOf(5.170695211728239E-12d), Double.valueOf(4.174390166815053E-7d))};
        PocoX3Pro_S5K3T2_new_1_SC = new Pair[]{new Pair(Double.valueOf(1.7661720419760588E-6d), Double.valueOf(-6.5720175792661685E-6d)), new Pair(Double.valueOf(1.7329581710886852E-6d), Double.valueOf(3.1839945777664836E-6d)), new Pair(Double.valueOf(1.733101155140261E-6d), Double.valueOf(7.274102130079696E-7d)), new Pair(Double.valueOf(1.756085020235601E-6d), Double.valueOf(-1.482147454852686E-6d))};
        PocoX3Pro_OV8856_3_OFF = new Pair[]{new Pair(Double.valueOf(4.5272547646510453E-13d), Double.valueOf(5.584795962101891E-7d)), new Pair(Double.valueOf(-4.191400075322441E-12d), Double.valueOf(3.543910439125414E-7d)), new Pair(Double.valueOf(-4.035544711985042E-12d), Double.valueOf(3.2183856144992966E-7d)), new Pair(Double.valueOf(-1.0252630721404449E-12d), Double.valueOf(4.596029373030192E-7d))};
        PocoX3Pro_OV8856_3_SC = new Pair[]{new Pair(Double.valueOf(2.8380500011372263E-6d), Double.valueOf(7.286669830058903E-5d)), new Pair(Double.valueOf(2.5913686693153203E-6d), Double.valueOf(9.953807612413835E-5d)), new Pair(Double.valueOf(2.5821995501662894E-6d), Double.valueOf(1.0065339217444828E-4d)), new Pair(Double.valueOf(2.6662122955049517E-6d), Double.valueOf(9.263994579935594E-5d))};
        PocoX3Pro_OV02B1B_4_OFF = new Pair[]{new Pair(Double.valueOf(6.986201036212692E-11d), Double.valueOf(-8.525657267354495E-8d)), new Pair(Double.valueOf(9.193423319237633E-11d), Double.valueOf(-5.436959018147541E-8d)), new Pair(Double.valueOf(8.474779714191176E-11d), Double.valueOf(-3.138151293221202E-7d)), new Pair(Double.valueOf(9.237176702451221E-11d), Double.valueOf(-1.7281233104249528E-7d))};
        PocoX3Pro_OV02B1B_4_SC = new Pair[]{new Pair(Double.valueOf(4.805763684781152E-6d), Double.valueOf(3.2551669602664454E-5d)), new Pair(Double.valueOf(4.646277430528242E-6d), Double.valueOf(2.870827294867801E-5d)), new Pair(Double.valueOf(4.712697436410016E-6d), Double.valueOf(2.6414644259742917E-5d)), new Pair(Double.valueOf(4.800691869109125E-6d), Double.valueOf(1.916977840614219E-5d))};
        LGV50_SL846_1_OFF = new Pair[]{new Pair(Double.valueOf(4.8168756531952336E-11d), Double.valueOf(4.8013736645568E-7d)), new Pair(Double.valueOf(5.525181071206208E-11d), Double.valueOf(2.8630985746722235E-7d)), new Pair(Double.valueOf(4.864909038730924E-11d), Double.valueOf(2.561023734417534E-7d)), new Pair(Double.valueOf(4.992852598359178E-11d), Double.valueOf(3.741491199052914E-7d))};
        LGV50_SL846_1_SC = new Pair[]{new Pair(Double.valueOf(3.7772530529943453E-6d), Double.valueOf(-1.0705584748187495E-5d)), new Pair(Double.valueOf(3.725081841392302E-6d), Double.valueOf(7.193560166620833E-7d)), new Pair(Double.valueOf(3.7361932157116842E-6d), Double.valueOf(1.5720105001759174E-7d)), new Pair(Double.valueOf(3.759431695971855E-6d), Double.valueOf(-3.0692476658903458E-6d))};
        LGV50_SL556_4_OFF = new Pair[]{new Pair(Double.valueOf(4.216548442191213E-11d), Double.valueOf(5.377391461423908E-7d)), new Pair(Double.valueOf(4.634620929356648E-11d), Double.valueOf(5.030259886793609E-7d)), new Pair(Double.valueOf(4.170299953008458E-11d), Double.valueOf(5.018994498426105E-7d)), new Pair(Double.valueOf(4.1918761701804225E-11d), Double.valueOf(5.470930336964076E-7d))};
        LGV50_SL556_4_SC = new Pair[]{new Pair(Double.valueOf(3.966983633380628E-6d), Double.valueOf(-4.020482614091987E-5d)), new Pair(Double.valueOf(3.785906716336209E-6d), Double.valueOf(-2.1874126698417838E-5d)), new Pair(Double.valueOf(3.817895681422344E-6d), Double.valueOf(-2.384792704081933E-5d)), new Pair(Double.valueOf(3.953558821762855E-6d), Double.valueOf(-3.6226875458427725E-5d))};
        Oneplus8Pro_IMX689_0_Enzo_OFF = new Pair[]{new Pair(Double.valueOf(7.649694967775582E-13d), Double.valueOf(5.648799385596164E-7d)), new Pair(Double.valueOf(6.955729191953676E-13d), Double.valueOf(4.036438880477499E-7d)), new Pair(Double.valueOf(7.001156466769848E-13d), Double.valueOf(3.9648683875853E-7d)), new Pair(Double.valueOf(7.43773562839967E-13d), Double.valueOf(4.6292972334025407E-7d))};
        Oneplus8Pro_IMX689_0_Enzo_SC = new Pair[]{new Pair(Double.valueOf(4.845225866387346E-7d), Double.valueOf(5.154188240681658E-6d)), new Pair(Double.valueOf(4.928133271139873E-7d), Double.valueOf(8.149006851332345E-6d)), new Pair(Double.valueOf(4.928912995364439E-7d), Double.valueOf(8.182154130412574E-6d)), new Pair(Double.valueOf(4.877855164877632E-7d), Double.valueOf(7.387829476321257E-6d))};
        Oneplus8Pro_IMX689_0_OFF = new Pair[]{new Pair(Double.valueOf(8.508426092246834E-13d), Double.valueOf(6.669683110865475E-7d)), new Pair(Double.valueOf(8.016548316892879E-13d), Double.valueOf(6.291295508161228E-7d)), new Pair(Double.valueOf(8.180696898170809E-13d), Double.valueOf(6.411853728778407E-7d)), new Pair(Double.valueOf(8.578440048427356E-13d), Double.valueOf(6.536879727016502E-7d))};
        Oneplus8Pro_IMX689_0_SC = new Pair[]{new Pair(Double.valueOf(4.999949994589938E-7d), Double.valueOf(5.598168569413595E-6d)), new Pair(Double.valueOf(5.49393191750465E-7d), Double.valueOf(7.699584839101968E-7d)), new Pair(Double.valueOf(5.471633804272057E-7d), Double.valueOf(-5.287485769778427E-8d)), new Pair(Double.valueOf(5.148052087808338E-7d), Double.valueOf(5.1556954089782205E-6d))};
        Oneplus8pro_IMX471_1_OFF = new Pair[]{new Pair(Double.valueOf(-1.2266125073122358E-12d), Double.valueOf(2.469183122793986E-7d)), new Pair(Double.valueOf(-2.9087522355217364E-12d), Double.valueOf(-1.3699638875895377E-7d)), new Pair(Double.valueOf(-2.9375486282822924E-12d), Double.valueOf(-2.9662389928828582E-8d)), new Pair(Double.valueOf(-9.231363605119707E-13d), Double.valueOf(2.686031346997732E-7d))};
        Oneplus8pro_IMX471_1_SC = new Pair[]{new Pair(Double.valueOf(8.018425668202482E-7d), Double.valueOf(8.766090152094793E-6d)), new Pair(Double.valueOf(7.886490298394744E-7d), Double.valueOf(2.1533157260974756E-5d)), new Pair(Double.valueOf(7.950670132815323E-7d), Double.valueOf(2.0016228525555883E-5d)), new Pair(Double.valueOf(8.1092090173257E-7d), Double.valueOf(1.0520626699477358E-5d))};
        Oneplus8pro_IMX586_2_OFF = new Pair[]{new Pair(Double.valueOf(1.411655795919729E-12d), Double.valueOf(4.317761462223373E-7d)), new Pair(Double.valueOf(9.642305857704208E-13d), Double.valueOf(1.4772137674016613E-7d)), new Pair(Double.valueOf(5.840804035446009E-13d), Double.valueOf(3.950672041572251E-7d)), new Pair(Double.valueOf(5.801170184350601E-13d), Double.valueOf(3.6567111883963326E-7d))};
        Oneplus8pro_IMX586_2_SC = new Pair[]{new Pair(Double.valueOf(6.954806917578333E-7d), Double.valueOf(-1.6936185178497738E-5d)), new Pair(Double.valueOf(7.572280204216863E-7d), Double.valueOf(7.799980060012593E-6d)), new Pair(Double.valueOf(3.795651158366923E-7d), Double.valueOf(-6.921466178522018E-7d)), new Pair(Double.valueOf(4.2477238253763915E-7d), Double.valueOf(-2.5860859386928663E-6d))};
        Oneplus8pro_S5K3M5_3_OFF = new Pair[]{new Pair(Double.valueOf(7.135054612602816E-12d), Double.valueOf(3.044983198613219E-7d)), new Pair(Double.valueOf(7.928553479239473E-12d), Double.valueOf(2.140982633888941E-7d)), new Pair(Double.valueOf(7.606150008538314E-12d), Double.valueOf(1.0888414180485246E-7d)), new Pair(Double.valueOf(6.266410161800409E-12d), Double.valueOf(3.884031513696868E-7d))};
        Oneplus8pro_S5K3M5_3_SC = new Pair[]{new Pair(Double.valueOf(1.6207493004791664E-6d), Double.valueOf(7.582051425522677E-6d)), new Pair(Double.valueOf(1.6084101318039547E-6d), Double.valueOf(1.155358702668503E-5d)), new Pair(Double.valueOf(1.6080924543226292E-6d), Double.valueOf(1.4443794102798882E-5d)), new Pair(Double.valueOf(1.3243286989474827E-6d), Double.valueOf(6.389961659056898E-6d))};
        RN7_s5kgm1_0_OFF = new Pair[]{new Pair(Double.valueOf(3.382880416619494E-12d), Double.valueOf(2.9671168475679493E-6d)), new Pair(Double.valueOf(3.7502157175311416E-12d), Double.valueOf(1.157936915082543E-6d)), new Pair(Double.valueOf(3.3615663353500462E-12d), Double.valueOf(2.142953621011989E-6d)), new Pair(Double.valueOf(1.7340268828572487E-12d), Double.valueOf(1.7365085996425615E-6d))};
        RN7_s5kgm1_0_SC = new Pair[]{new Pair(Double.valueOf(1.67722640122066E-6d), Double.valueOf(9.564764750248305E-7d)), new Pair(Double.valueOf(1.684150883691703E-6d), Double.valueOf(2.286347305490134E-5d)), new Pair(Double.valueOf(1.6828647002386575E-6d), Double.valueOf(4.0669344406388106E-5d)), new Pair(Double.valueOf(1.2502886358687978E-6d), Double.valueOf(2.0015442710647615E-5d))};
        Mi9_IMX586_0_OFF = new Pair[]{new Pair(Double.valueOf(1.4223427818161162E-12d), Double.valueOf(3.6161221084824785E-7d)), new Pair(Double.valueOf(6.483861646712692E-13d), Double.valueOf(1.5498159191094513E-7d)), new Pair(Double.valueOf(3.426108655202949E-13d), Double.valueOf(2.982331631078912E-7d)), new Pair(Double.valueOf(3.984369575773855E-13d), Double.valueOf(3.225319173227361E-7d))};
        Mi9_IMX586_0_SC = new Pair[]{new Pair(Double.valueOf(5.550690452962096E-7d), Double.valueOf(-7.2516712227937075E-6d)), new Pair(Double.valueOf(6.28854003109143E-7d), Double.valueOf(5.222139481138479E-6d)), new Pair(Double.valueOf(3.2514281356232834E-7d), Double.valueOf(5.4155096702917535E-6d)), new Pair(Double.valueOf(3.596084804765092E-7d), Double.valueOf(2.4324671216536317E-6d))};
        Mi9_S5K3M5_20_OFF = new Pair[]{new Pair(Double.valueOf(6.102933904970193E-12d), Double.valueOf(2.9005954082168127E-7d)), new Pair(Double.valueOf(6.266528521949293E-12d), Double.valueOf(-1.6104509173060653E-7d)), new Pair(Double.valueOf(6.0503666184411834E-12d), Double.valueOf(-3.3963123778515874E-7d)), new Pair(Double.valueOf(5.058310937673021E-12d), Double.valueOf(1.538103663440867E-7d))};
        Mi9_S5K3M5_20_SC = new Pair[]{new Pair(Double.valueOf(1.5705128078183315E-6d), Double.valueOf(4.382530954462693E-6d)), new Pair(Double.valueOf(1.56071666079523E-6d), Double.valueOf(1.7499718124757E-5d)), new Pair(Double.valueOf(1.5638037333120137E-6d), Double.valueOf(2.5647348004253185E-5d)), new Pair(Double.valueOf(1.2581117702980262E-6d), Double.valueOf(1.2158787834667922E-5d))};
        Mi9_IMX481_21_OFF = new Pair[]{new Pair(Double.valueOf(8.119854889512704E-12d), Double.valueOf(5.314963658819075E-7d)), new Pair(Double.valueOf(8.154058892650946E-12d), Double.valueOf(1.7351008823834477E-7d)), new Pair(Double.valueOf(7.934321880230547E-12d), Double.valueOf(3.7211611090413054E-7d)), new Pair(Double.valueOf(7.244480506987444E-12d), Double.valueOf(5.182996922616912E-7d))};
        Mi9_IMX481_21_SC = new Pair[]{new Pair(Double.valueOf(1.627418545927463E-6d), Double.valueOf(-2.2306851512663175E-5d)), new Pair(Double.valueOf(1.6217272295857922E-6d), Double.valueOf(-3.3876145851968E-6d)), new Pair(Double.valueOf(1.4098009545603852E-6d), Double.valueOf(-5.875513588469666E-7d)), new Pair(Double.valueOf(1.46947358198844E-6d), Double.valueOf(-5.4479195276516125E-6d))};
        RN9PRO_GC8034_21_OFF = new Pair[]{new Pair(Double.valueOf(1.0231440735332213E-12d), Double.valueOf(1.802093976622962E-6d)), new Pair(Double.valueOf(-7.063531752777089E-13d), Double.valueOf(1.820495403701463E-6d)), new Pair(Double.valueOf(-6.211435174801466E-13d), Double.valueOf(1.759917424948129E-6d)), new Pair(Double.valueOf(1.761126353528198E-12d), Double.valueOf(1.8430536163058169E-6d))};
        RN9PRO_GC8034_21_SC = new Pair[]{new Pair(Double.valueOf(2.757345816935416E-6d), Double.valueOf(3.313261056678074E-5d)), new Pair(Double.valueOf(2.5902642046548913E-6d), Double.valueOf(6.0636327550507E-5d)), new Pair(Double.valueOf(2.5758294249034457E-6d), Double.valueOf(6.620023854987287E-5d)), new Pair(Double.valueOf(2.822144190112912E-6d), Double.valueOf(2.4642585043237524E-5d))};
        RN9PRO_GW1_0_OFF = new Pair[]{new Pair(Double.valueOf(1.0391672636592911E-12d), Double.valueOf(8.355482208762078E-8d)), new Pair(Double.valueOf(1.2598673291414324E-12d), Double.valueOf(-2.2327500235951426E-8d)), new Pair(Double.valueOf(1.2924429423552802E-12d), Double.valueOf(1.0914834405521421E-8d)), new Pair(Double.valueOf(9.409400071169055E-13d), Double.valueOf(1.0332832016764159E-7d))};
        RN9PRO_GW1_0_SC = new Pair[]{new Pair(Double.valueOf(7.303027148828715E-7d), Double.valueOf(8.607783062963792E-6d)), new Pair(Double.valueOf(7.014822387702729E-7d), Double.valueOf(1.845370049971899E-5d)), new Pair(Double.valueOf(6.954197569135758E-7d), Double.valueOf(1.8413035410184958E-5d)), new Pair(Double.valueOf(7.465427945918419E-7d), Double.valueOf(4.253912495853139E-6d))};
        RN9PRO_SK5E9_22_OFF = new Pair[]{new Pair(Double.valueOf(1.5548831717817116E-11d), Double.valueOf(1.1260936364716698E-7d)), new Pair(Double.valueOf(1.64592903142849E-11d), Double.valueOf(-2.775343357100474E-7d)), new Pair(Double.valueOf(1.457772021246583E-11d), Double.valueOf(-3.1396794814784877E-7d)), new Pair(Double.valueOf(1.4451363606691049E-11d), Double.valueOf(2.026566368122567E-7d))};
        RN9PRO_SK5E9_22_SC = new Pair[]{new Pair(Double.valueOf(1.925877163151114E-6d), Double.valueOf(1.4596315386363646E-5d)), new Pair(Double.valueOf(1.9040859724508712E-6d), Double.valueOf(2.5788325698878235E-5d)), new Pair(Double.valueOf(1.9004697886139171E-6d), Double.valueOf(2.718119999023534E-5d)), new Pair(Double.valueOf(1.905515406037025E-6d), Double.valueOf(1.5061317154866458E-5d))};
        RN10PRO_HM2_0_OFF = new Pair[]{new Pair(Double.valueOf(5.298404113861883E-13d), Double.valueOf(2.2376769998637303E-7d)), new Pair(Double.valueOf(-9.432119798744032E-14d), Double.valueOf(9.856305475314848E-8d)), new Pair(Double.valueOf(-1.4745154797407133E-13d), Double.valueOf(8.906504271654526E-8d)), new Pair(Double.valueOf(6.926624678253062E-13d), Double.valueOf(2.602227250699911E-7d))};
        RN10PRO_HM2_0_SC = new Pair[]{new Pair(Double.valueOf(3.72564187704448E-7d), Double.valueOf(4.576178663289518E-6d)), new Pair(Double.valueOf(3.68505797450511E-7d), Double.valueOf(7.679006332546115E-6d)), new Pair(Double.valueOf(3.685616855612288E-7d), Double.valueOf(7.851995691274046E-6d)), new Pair(Double.valueOf(3.767219550698988E-7d), Double.valueOf(3.21895148441262E-6d))};
        RN10PRO_IMX355_4_OFF = new Pair[]{new Pair(Double.valueOf(3.475125075432016E-11d), Double.valueOf(2.44478768550997E-7d)), new Pair(Double.valueOf(3.3220992298900855E-11d), Double.valueOf(-2.2277518327265838E-7d)), new Pair(Double.valueOf(3.007105791452821E-11d), Double.valueOf(-1.8234882967500516E-7d)), new Pair(Double.valueOf(3.476942998380424E-11d), Double.valueOf(4.1464814063898824E-8d))};
        RN10PRO_IMX355_4_SC = new Pair[]{new Pair(Double.valueOf(3.6792100463026606E-6d), Double.valueOf(1.2654179521241503E-5d)), new Pair(Double.valueOf(3.679402235028753E-6d), Double.valueOf(2.601129751430957E-5d)), new Pair(Double.valueOf(3.6927135255083715E-6d), Double.valueOf(2.446790613232594E-5d)), new Pair(Double.valueOf(3.6768438147408294E-6d), Double.valueOf(2.501086622962877E-5d))};
        RN10PRO_IMX471_1_OFF = new Pair[]{new Pair(Double.valueOf(2.3418441942014924E-11d), Double.valueOf(1.7939841367889806E-7d)), new Pair(Double.valueOf(2.276726186288406E-11d), Double.valueOf(-1.2787491285960479E-8d)), new Pair(Double.valueOf(2.343562236803529E-11d), Double.valueOf(1.5935427629059878E-8d)), new Pair(Double.valueOf(2.4248882034757775E-11d), Double.valueOf(1.837416843790984E-7d))};
        RN10PRO_IMX471_1_SC = new Pair[]{new Pair(Double.valueOf(3.4524060572111895E-6d), Double.valueOf(3.61348537432181E-6d)), new Pair(Double.valueOf(3.4406862446085517E-6d), Double.valueOf(1.2999423542234557E-5d)), new Pair(Double.valueOf(3.4322788639659253E-6d), Double.valueOf(1.2823471111251561E-5d)), new Pair(Double.valueOf(3.5060715464562336E-6d), Double.valueOf(1.3928605926648178E-6d))};
        RN10PRO_OV5675_3_OFF = new Pair[]{new Pair(Double.valueOf(2.34432587817128E-11d), Double.valueOf(2.385197062942821E-7d)), new Pair(Double.valueOf(1.6419148701242448E-11d), Double.valueOf(-4.5853946344436533E-7d)), new Pair(Double.valueOf(2.0296721226463477E-11d), Double.valueOf(-4.96149803235122E-7d)), new Pair(Double.valueOf(2.6351342698074758E-11d), Double.valueOf(1.755444796669939E-7d))};
        RN10PRO_OV5675_3_SC = new Pair[]{new Pair(Double.valueOf(3.09367038150777E-6d), Double.valueOf(1.0470034593575236E-4d)), new Pair(Double.valueOf(3.0337504721952296E-6d), Double.valueOf(1.280355573090183E-4d)), new Pair(Double.valueOf(2.9947014792186326E-6d), Double.valueOf(1.3096772496686316E-4d)), new Pair(Double.valueOf(3.219554059223249E-6d), Double.valueOf(9.981930884961239E-5d))};
        Mi11Pro_fix_S5KGN2_0_OFF = new Pair[]{new Pair(Double.valueOf(1.113213083751491E-12d), Double.valueOf(3.3231800188919867E-7d)), new Pair(Double.valueOf(1.0591434586120123E-12d), Double.valueOf(3.1314211548565365E-7d)), new Pair(Double.valueOf(1.1295069939719536E-12d), Double.valueOf(3.151262127276828E-7d)), new Pair(Double.valueOf(1.5250479057744908E-12d), Double.valueOf(3.127733841822625E-7d))};
        Mi11Pro_fix_S5KGN2_0_SC = new Pair[]{new Pair(Double.valueOf(6.379508863342819E-7d), Double.valueOf(-1.075417965947772E-6d)), new Pair(Double.valueOf(6.386307384882075E-7d), Double.valueOf(-7.441837175910562E-7d)), new Pair(Double.valueOf(6.39593903886238E-7d), Double.valueOf(-7.838997015606551E-7d)), new Pair(Double.valueOf(6.365035671514766E-7d), Double.valueOf(2.669225294616704E-7d))};
        Mi11Pro_OV13B10_2_OFF = new Pair[]{new Pair(Double.valueOf(-1.9283454363470606E-12d), Double.valueOf(5.836394108887956E-7d)), new Pair(Double.valueOf(-4.453535020691561E-12d), Double.valueOf(6.123810312416537E-7d)), new Pair(Double.valueOf(-4.694814930697108E-12d), Double.valueOf(5.17071682396945E-7d)), new Pair(Double.valueOf(-1.8502409619616106E-12d), Double.valueOf(3.6777321997767205E-10d))};
        Mi11Pro_OV13B10_2_SC = new Pair[]{new Pair(Double.valueOf(2.138562604778215E-6d), Double.valueOf(8.536283707891325E-5d)), new Pair(Double.valueOf(1.877475449634828E-6d), Double.valueOf(1.0829816756277854E-4d)), new Pair(Double.valueOf(1.9137152054261876E-6d), Double.valueOf(1.1043870586906126E-4d)), new Pair(Double.valueOf(1.9044910384037762E-6d), Double.valueOf(2.141246682447436E-4d))};
        Mi11Pro_fix_OV08A10_3_OFF = new Pair[]{new Pair(Double.valueOf(-5.086212985614021E-12d), Double.valueOf(9.698306600945243E-7d)), new Pair(Double.valueOf(-7.774718545285227E-12d), Double.valueOf(8.153820835193874E-7d)), new Pair(Double.valueOf(-7.75365722690581E-12d), Double.valueOf(7.80745679460295E-7d)), new Pair(Double.valueOf(2.693414328375221E-11d), Double.valueOf(-1.9672480941106338E-5d))};
        Mi11Pro_fix_OV08A10_3_SC = new Pair[]{new Pair(Double.valueOf(2.6599819946196775E-6d), Double.valueOf(1.0143981739871159E-4d)), new Pair(Double.valueOf(2.7141402608467584E-6d), Double.valueOf(1.0541230722157029E-4d)), new Pair(Double.valueOf(2.712585775668845E-6d), Double.valueOf(1.0892389505045393E-4d)), new Pair(Double.valueOf(2.6052984640645064E-6d), Double.valueOf(0.0016939651784817964d))};
        MI11X_IMX582_0_OFF = new Pair[]{new Pair(Double.valueOf(6.028408388732381E-12d), Double.valueOf(4.388466094607838E-7d)), new Pair(Double.valueOf(5.074280425910235E-12d), Double.valueOf(3.2849568991527097E-7d)), new Pair(Double.valueOf(2.386540080515199E-12d), Double.valueOf(4.0586579284976675E-7d)), new Pair(Double.valueOf(2.7267090539689144E-12d), Double.valueOf(3.625368394134763E-7d))};
        MI11X_IMX582_0_SC = new Pair[]{new Pair(Double.valueOf(1.0752325549832484E-6d), Double.valueOf(-1.3944581816859453E-5d)), new Pair(Double.valueOf(1.196258268476536E-6d), Double.valueOf(2.14376418628867E-6d)), new Pair(Double.valueOf(6.188713383244324E-7d), Double.valueOf(-3.472229159309987E-7d)), new Pair(Double.valueOf(6.664992219692763E-7d), Double.valueOf(-1.5230206476730423E-6d))};
        MI11X_S5K3T2_1_OFF = new Pair[]{new Pair(Double.valueOf(2.2314436826166334E-11d), Double.valueOf(4.3864650305339854E-7d)), new Pair(Double.valueOf(2.1974166526131606E-11d), Double.valueOf(3.541893383691396E-7d)), new Pair(Double.valueOf(2.101661649514541E-11d), Double.valueOf(2.6684533897039166E-7d)), new Pair(Double.valueOf(2.07311835625491E-11d), Double.valueOf(3.9838230145938835E-7d))};
        MI11X_S5K3T2_1_SC = new Pair[]{new Pair(Double.valueOf(3.5684190639844393E-6d), Double.valueOf(2.29609852853862E-6d)), new Pair(Double.valueOf(3.5173302058297746E-6d), Double.valueOf(5.012349936288773E-6d)), new Pair(Double.valueOf(3.472724026633459E-6d), Double.valueOf(8.105961030115472E-6d)), new Pair(Double.valueOf(3.4582930401352425E-6d), Double.valueOf(2.607919668825669E-6d))};
        MI11X_IMX355_2_OFF = new Pair[]{new Pair(Double.valueOf(3.1481734420082236E-11d), Double.valueOf(4.77476841191616E-7d)), new Pair(Double.valueOf(3.2468941977333715E-11d), Double.valueOf(1.0592691049712235E-7d)), new Pair(Double.valueOf(3.2742800580364906E-11d), Double.valueOf(1.3287252861673883E-7d)), new Pair(Double.valueOf(3.279521633439372E-11d), Double.valueOf(2.3309990571498685E-7d))};
        MI11X_IMX355_2_SC = new Pair[]{new Pair(Double.valueOf(3.743190610275065E-6d), Double.valueOf(3.6263571806451115E-6d)), new Pair(Double.valueOf(3.6868569103341015E-6d), Double.valueOf(1.6268770580278034E-5d)), new Pair(Double.valueOf(3.6767903706685852E-6d), Double.valueOf(1.643496892132244E-5d)), new Pair(Double.valueOf(3.687655843114006E-6d), Double.valueOf(1.4673539457884655E-5d))};
        OnePlus9Pro_imx789_0_OFF = new Pair[]{new Pair(Double.valueOf(6.578014614639445E-13d), Double.valueOf(3.1854476421084785E-7d)), new Pair(Double.valueOf(6.982490833698008E-13d), Double.valueOf(1.3919265499198306E-7d)), new Pair(Double.valueOf(7.07204820319361E-13d), Double.valueOf(1.400373049137573E-7d)), new Pair(Double.valueOf(7.07899057840293E-13d), Double.valueOf(2.316623819485842E-7d))};
        OnePlus9Pro_imx789_0_SC = new Pair[]{new Pair(Double.valueOf(4.788001528663524E-7d), Double.valueOf(2.463189109576943E-6d)), new Pair(Double.valueOf(4.779572077304512E-7d), Double.valueOf(6.842379611825756E-6d)), new Pair(Double.valueOf(4.77595868636426E-7d), Double.valueOf(6.765900631160765E-6d)), new Pair(Double.valueOf(4.762847260686767E-7d), Double.valueOf(5.355062225423184E-6d))};
        OnePlus9Pro_imx471_1_OFF = new Pair[]{new Pair(Double.valueOf(2.278775855714765E-12d), Double.valueOf(3.0840185894551757E-7d)), new Pair(Double.valueOf(2.407700239539807E-12d), Double.valueOf(1.7473661249574023E-7d)), new Pair(Double.valueOf(2.528083390246599E-12d), Double.valueOf(1.7458244241941856E-7d)), new Pair(Double.valueOf(2.3884368675990673E-12d), Double.valueOf(2.642582277455448E-7d))};
        OnePlus9Pro_imx471_1_SC = new Pair[]{new Pair(Double.valueOf(8.581585317602946E-7d), Double.valueOf(5.934657488329203E-7d)), new Pair(Double.valueOf(8.456955201497131E-7d), Double.valueOf(6.7999728746377715E-6d)), new Pair(Double.valueOf(8.491433577720162E-7d), Double.valueOf(6.449756574033481E-6d)), new Pair(Double.valueOf(8.525433961250139E-7d), Double.valueOf(3.3511307088409762E-6d))};
        OnePlus9Pro_imx766_2_OFF = new Pair[]{new Pair(Double.valueOf(9.497616248695974E-13d), Double.valueOf(2.9820444111044333E-7d)), new Pair(Double.valueOf(8.126323778386707E-13d), Double.valueOf(5.4559734865703505E-9d)), new Pair(Double.valueOf(8.349540914079964E-13d), Double.valueOf(1.9329228199001898E-8d)), new Pair(Double.valueOf(9.238858508390851E-13d), Double.valueOf(1.9502776481033734E-7d))};
        OnePlus9Pro_imx766_2_SC = new Pair[]{new Pair(Double.valueOf(5.963420452077806E-7d), Double.valueOf(8.167487477142132E-6d)), new Pair(Double.valueOf(6.002616697274695E-7d), Double.valueOf(1.5837915305334124E-5d)), new Pair(Double.valueOf(6.005308101187758E-7d), Double.valueOf(1.5554383909203365E-5d)), new Pair(Double.valueOf(5.967172636239723E-7d), Double.valueOf(1.2407026606145342E-5d))};
        OnePlus9Pro_ov08a10_3_OFF = new Pair[]{new Pair(Double.valueOf(-1.4488558403968465E-11d), Double.valueOf(1.2166556253604439E-6d)), new Pair(Double.valueOf(-3.765309831098686E-11d), Double.valueOf(1.4313169399499194E-6d)), new Pair(Double.valueOf(-3.722837634006918E-11d), Double.valueOf(1.3901461926568864E-6d)), new Pair(Double.valueOf(-1.9006850238666162E-11d), Double.valueOf(-1.5875388999144287E-5d))};
        OnePlus9Pro_ov08a10_3_SC = new Pair[]{new Pair(Double.valueOf(1.691555877559363E-6d), Double.valueOf(5.257612446847132E-5d)), new Pair(Double.valueOf(1.8370454477480787E-6d), Double.valueOf(4.067848138191813E-5d)), new Pair(Double.valueOf(1.8373191594584942E-6d), Double.valueOf(4.181954143184388E-5d)), new Pair(Double.valueOf(1.809365934014776E-6d), Double.valueOf(6.18104848935662E-4d))};
        RN9S_fix_S5KGM2_0_OFF = new Pair[]{new Pair(Double.valueOf(8.343543107661774E-13d), Double.valueOf(1.9476197977161135E-8d)), new Pair(Double.valueOf(8.123477120879552E-13d), Double.valueOf(1.8617034993216125E-8d)), new Pair(Double.valueOf(7.991779472622893E-13d), Double.valueOf(-2.301765777652407E-7d)), new Pair(Double.valueOf(7.08150254142889E-13d), Double.valueOf(3.8794724019092527E-7d))};
        RN9S_fix_S5KGM2_0_SC = new Pair[]{new Pair(Double.valueOf(3.886204951765929E-7d), Double.valueOf(1.3518164270670109E-5d)), new Pair(Double.valueOf(3.8449218392745116E-7d), Double.valueOf(1.3597571022231817E-5d)), new Pair(Double.valueOf(3.8753187266919906E-7d), Double.valueOf(2.4451218388301658E-5d)), new Pair(Double.valueOf(3.9389413266434107E-7d), Double.valueOf(1.5123227452970595E-6d))};
        GalaxyM51_IMX682_0_OFF = new Pair[]{new Pair(Double.valueOf(9.058814848695185E-12d), Double.valueOf(4.2674608752107257E-7d)), new Pair(Double.valueOf(8.18641822701314E-12d), Double.valueOf(2.991667904431627E-7d)), new Pair(Double.valueOf(4.08572943840551E-12d), Double.valueOf(3.5405619106568913E-7d)), new Pair(Double.valueOf(4.500599649793566E-12d), Double.valueOf(4.306545488741835E-7d))};
        GalaxyM51_IMX682_0_SC = new Pair[]{new Pair(Double.valueOf(1.4812068415250004E-6d), Double.valueOf(-1.5331914879059283E-5d)), new Pair(Double.valueOf(1.5977893642208007E-6d), Double.valueOf(1.9674993941333746E-6d)), new Pair(Double.valueOf(8.200193644072716E-7d), Double.valueOf(3.779988064693968E-6d)), new Pair(Double.valueOf(8.940826891748824E-7d), Double.valueOf(-1.5934701380404951E-6d))};
        GalaxyM51_IMX616_1_OFF = new Pair[]{new Pair(Double.valueOf(9.697335308074626E-12d), Double.valueOf(4.2439876275515086E-7d)), new Pair(Double.valueOf(8.728898229633198E-12d), Double.valueOf(2.031089910592602E-7d)), new Pair(Double.valueOf(4.142622775035482E-12d), Double.valueOf(3.4442107864107567E-7d)), new Pair(Double.valueOf(3.9375328487213635E-12d), Double.valueOf(3.659691503132901E-7d))};
        GalaxyM51_IMX616_1_SC = new Pair[]{new Pair(Double.valueOf(1.4755225796558258E-6d), Double.valueOf(-7.44114589808195E-6d)), new Pair(Double.valueOf(1.5891911706796498E-6d), Double.valueOf(1.1482089066550082E-5d)), new Pair(Double.valueOf(8.38283609687866E-7d), Double.valueOf(7.515597984943951E-6d)), new Pair(Double.valueOf(9.231325177165387E-7d), Double.valueOf(2.636353298353359E-6d))};
        GalaxyM51_S5K3L6_2_OFF = new Pair[]{new Pair(Double.valueOf(3.355818430332834E-11d), Double.valueOf(3.693465434026317E-7d)), new Pair(Double.valueOf(3.5860484574058965E-11d), Double.valueOf(2.53448473319276E-7d)), new Pair(Double.valueOf(3.2726170714748827E-11d), Double.valueOf(2.2084773650057367E-7d)), new Pair(Double.valueOf(3.3719546360840014E-11d), Double.valueOf(-1.4730732856794258E-6d))};
        GalaxyM51_S5K3L6_2_SC = new Pair[]{new Pair(Double.valueOf(3.1124074974979436E-6d), Double.valueOf(2.310567918249576E-6d)), new Pair(Double.valueOf(3.1351384194392298E-6d), Double.valueOf(6.897024375226586E-6d)), new Pair(Double.valueOf(3.1198944246511656E-6d), Double.valueOf(9.002707911235741E-6d)), new Pair(Double.valueOf(3.1114228548956764E-6d), Double.valueOf(2.0704587662434223E-4d))};
        GalaxyM51_IMX616_3_OFF = new Pair[]{new Pair(Double.valueOf(9.714039942983026E-12d), Double.valueOf(4.1785538188681203E-7d)), new Pair(Double.valueOf(8.797946922313622E-12d), Double.valueOf(2.051909229233941E-7d)), new Pair(Double.valueOf(4.25852089983909E-12d), Double.valueOf(3.524131737231465E-7d)), new Pair(Double.valueOf(4.109993307043332E-12d), Double.valueOf(3.571129634755304E-7d))};
        GalaxyM51_IMX616_3_SC = new Pair[]{new Pair(Double.valueOf(1.4717328200443973E-6d), Double.valueOf(-7.014109229372635E-6d)), new Pair(Double.valueOf(1.592901068823217E-6d), Double.valueOf(1.1838329332972713E-5d)), new Pair(Double.valueOf(8.391994815027095E-7d), Double.valueOf(7.2478842885716035E-6d)), new Pair(Double.valueOf(9.218786618878504E-7d), Double.valueOf(2.647612987752535E-6d))};
        GalaxyM51_GC5035_54_OFF = new Pair[]{new Pair(Double.valueOf(1.3156833672393117E-10d), Double.valueOf(1.2092197219330786E-6d)), new Pair(Double.valueOf(1.332407774827434E-10d), Double.valueOf(1.1097618286944459E-6d)), new Pair(Double.valueOf(1.3146960863459476E-10d), Double.valueOf(1.1687899062887236E-6d)), new Pair(Double.valueOf(1.3063345467612423E-10d), Double.valueOf(1.1822263493014864E-6d))};
        GalaxyM51_GC5035_54_SC = new Pair[]{new Pair(Double.valueOf(3.729645920998918E-6d), Double.valueOf(8.157411477824238E-6d)), new Pair(Double.valueOf(3.782009250290596E-6d), Double.valueOf(9.084036440208794E-6d)), new Pair(Double.valueOf(3.8085745800818437E-6d), Double.valueOf(5.882073902516482E-6d)), new Pair(Double.valueOf(3.7262479743019606E-6d), Double.valueOf(9.997743561697092E-6d))};
        MI11U_GN2_ID1_OFF = new Pair[]{new Pair(Double.valueOf(1.1787278804370704E-12d), Double.valueOf(2.525053711230836E-7d)), new Pair(Double.valueOf(1.1283848683344745E-12d), Double.valueOf(3.0321551518285744E-7d)), new Pair(Double.valueOf(1.156874437174173E-12d), Double.valueOf(3.128146398016889E-7d)), new Pair(Double.valueOf(1.4410461252182844E-12d), Double.valueOf(2.5532740039071347E-7d))};
        MI11U_GN2_ID1_SC = new Pair[]{new Pair(Double.valueOf(6.192003556388915E-7d), Double.valueOf(1.8331552742642131E-6d)), new Pair(Double.valueOf(6.146180663654605E-7d), Double.valueOf(1.8168099009606097E-6d)), new Pair(Double.valueOf(6.153220428783197E-7d), Double.valueOf(1.6213875603346528E-6d)), new Pair(Double.valueOf(6.246023618188511E-7d), Double.valueOf(2.7832485943778476E-6d))};
        Mi11U_GN2_ID1_Arnova_OFF = new Pair[]{new Pair(Double.valueOf(1.1787278804370704E-12d), Double.valueOf(2.525053711230836E-7d)), new Pair(Double.valueOf(1.1283848683344745E-12d), Double.valueOf(3.0321551518285744E-7d)), new Pair(Double.valueOf(1.156874437174173E-12d), Double.valueOf(3.128146398016889E-7d)), new Pair(Double.valueOf(1.4410461252182844E-12d), Double.valueOf(2.5532740039071347E-7d))};
        Mi11U_GN2_ID1_Arnova_SC = new Pair[]{new Pair(Double.valueOf(6.192003556388915E-7d), Double.valueOf(1.8331552742642131E-6d)), new Pair(Double.valueOf(6.146180663654605E-7d), Double.valueOf(1.8168099009606097E-6d)), new Pair(Double.valueOf(6.153220428783197E-7d), Double.valueOf(1.6213875603346528E-6d)), new Pair(Double.valueOf(6.246023618188511E-7d), Double.valueOf(2.7832485943778476E-6d))};
        PocoX3_imx682_0_DNF_OFF = new Pair[]{new Pair(Double.valueOf(1.413341745544537E-12d), Double.valueOf(4.171622418808059E-7d)), new Pair(Double.valueOf(1.064952890514326E-12d), Double.valueOf(2.1395936105604486E-7d)), new Pair(Double.valueOf(5.978248139446507E-13d), Double.valueOf(2.766603348974292E-7d)), new Pair(Double.valueOf(6.362818055099563E-13d), Double.valueOf(3.369075899068892E-7d))};
        PocoX3_imx682_0_DNF_SC = new Pair[]{new Pair(Double.valueOf(5.617495871069217E-7d), Double.valueOf(-1.1743534296674538E-5d)), new Pair(Double.valueOf(6.23010355692941E-7d), Double.valueOf(5.960386390226891E-6d)), new Pair(Double.valueOf(3.1585149656193244E-7d), Double.valueOf(2.446135847933483E-6d)), new Pair(Double.valueOf(3.494264445688428E-7d), Double.valueOf(-2.3081259023400415E-6d))};
        PocoX3_s5k3t2_1_DNF_OFF = new Pair[]{new Pair(Double.valueOf(4.283438275995058E-12d), Double.valueOf(4.6147957492573784E-7d)), new Pair(Double.valueOf(4.555574089185708E-12d), Double.valueOf(3.6979995331772484E-7d)), new Pair(Double.valueOf(4.483974411147901E-12d), Double.valueOf(3.947789614284405E-7d)), new Pair(Double.valueOf(4.863546521286367E-12d), Double.valueOf(4.456478362041292E-7d))};
        PocoX3_s5k3t2_1_DNF_SC = new Pair[]{new Pair(Double.valueOf(1.688312633087963E-6d), Double.valueOf(-2.8837251696360067E-6d)), new Pair(Double.valueOf(1.7045590910853704E-6d), Double.valueOf(1.5417148011951047E-6d)), new Pair(Double.valueOf(1.6968998292692804E-6d), Double.valueOf(1.3688310858653738E-7d)), new Pair(Double.valueOf(1.6914370318673386E-6d), Double.valueOf(-6.252505461752336E-7d))};
        PocoX3_hi1337_21_DNF_OFF = new Pair[]{new Pair(Double.valueOf(6.717595735120262E-12d), Double.valueOf(-8.938422093694518E-8d)), new Pair(Double.valueOf(7.219770083426863E-12d), Double.valueOf(-9.107644083146294E-8d)), new Pair(Double.valueOf(7.951818225082163E-12d), Double.valueOf(-2.1304327624218266E-7d)), new Pair(Double.valueOf(6.5844924371699426E-12d), Double.valueOf(-2.0810725735562353E-7d))};
        PocoX3_hi1337_21_DNF_SC = new Pair[]{new Pair(Double.valueOf(1.616394482872256E-6d), Double.valueOf(-1.8072604084207806E-6d)), new Pair(Double.valueOf(1.5688997357894452E-6d), Double.valueOf(5.978432234645166E-6d)), new Pair(Double.valueOf(1.5618083757316813E-6d), Double.valueOf(1.0445977484239495E-5d)), new Pair(Double.valueOf(1.5943625481145557E-6d), Double.valueOf(4.028761369525097E-6d))};
        PocoX3_hi259_22_DNF_OFF = new Pair[]{new Pair(Double.valueOf(1.8928297439906126E-11d), Double.valueOf(1.7197271391417579E-7d)), new Pair(Double.valueOf(2.0668578109314488E-11d), Double.valueOf(8.637632581198907E-8d)), new Pair(Double.valueOf(2.3248127500110098E-11d), Double.valueOf(-9.598472409150639E-8d)), new Pair(Double.valueOf(2.5834066893907267E-11d), Double.valueOf(-6.853067745876237E-8d))};
        PocoX3_hi259_22_DNF_SC = new Pair[]{new Pair(Double.valueOf(2.2807654496576747E-6d), Double.valueOf(2.299780602571509E-5d)), new Pair(Double.valueOf(2.2791028754376156E-6d), Double.valueOf(2.635149205158567E-5d)), new Pair(Double.valueOf(2.235438828024634E-6d), Double.valueOf(2.7009517160859915E-5d)), new Pair(Double.valueOf(2.284069705845165E-6d), Double.valueOf(1.9176665081059383E-5d))};
        IMX686_0_Necrys_OFF = new Pair[]{new Pair(Double.valueOf(1.4907295826227648E-12d), Double.valueOf(3.5879751194496915E-7d)), new Pair(Double.valueOf(5.49252509183455E-13d), Double.valueOf(1.7894887969935686E-7d)), new Pair(Double.valueOf(4.660449420822198E-13d), Double.valueOf(3.88784606849596E-7d)), new Pair(Double.valueOf(5.611697749662245E-13d), Double.valueOf(3.7556338452292887E-7d))};
        IMX686_0_Necrys_SC = new Pair[]{new Pair(Double.valueOf(5.04462554311158E-7d), Double.valueOf(-6.85606380460704E-6d)), new Pair(Double.valueOf(5.846623125916854E-7d), Double.valueOf(8.214648405425863E-6d)), new Pair(Double.valueOf(2.9256881892999975E-7d), Double.valueOf(3.637764998189714E-6d)), new Pair(Double.valueOf(3.259199710290222E-7d), Double.valueOf(-9.074789410122893E-7d))};
        OV8856_21_Necrys_OFF = new Pair[]{new Pair(Double.valueOf(-1.644027660318778E-13d), Double.valueOf(5.436578869975353E-7d)), new Pair(Double.valueOf(-1.1415945771163505E-12d), Double.valueOf(3.0500637833071204E-7d)), new Pair(Double.valueOf(-1.2757214989250754E-12d), Double.valueOf(2.8152516551208016E-7d)), new Pair(Double.valueOf(-2.4665118309331185E-13d), Double.valueOf(5.628027190518434E-7d))};
        OV8856_21_Necrys_SC = new Pair[]{new Pair(Double.valueOf(1.2778557091481338E-6d), Double.valueOf(9.944570503543366E-5d)), new Pair(Double.valueOf(1.200726182168784E-6d), Double.valueOf(1.2230721235788322E-4d)), new Pair(Double.valueOf(1.2226094190161916E-6d), Double.valueOf(1.2032500871079075E-4d)), new Pair(Double.valueOf(1.2959013982312613E-6d), Double.valueOf(1.0279602241026307E-4d))};
        S20FE_S5K3L6_OFF = new Pair[]{new Pair(Double.valueOf(3.8437478504145674E-11d), Double.valueOf(3.660455472717599E-7d)), new Pair(Double.valueOf(4.183659213165172E-11d), Double.valueOf(2.2627838223773694E-7d)), new Pair(Double.valueOf(3.838367591196617E-11d), Double.valueOf(2.626678972539777E-7d)), new Pair(Double.valueOf(3.9776214060763954E-11d), Double.valueOf(-4.0843557854449287E-7d))};
        S20FE_S5K3L6_SC = new Pair[]{new Pair(Double.valueOf(3.494661549941733E-6d), Double.valueOf(2.702756083645898E-6d)), new Pair(Double.valueOf(3.5043506456503242E-6d), Double.valueOf(1.0181719921056664E-5d)), new Pair(Double.valueOf(3.5124234880557357E-6d), Double.valueOf(1.0101472774922891E-5d)), new Pair(Double.valueOf(3.4956545696082096E-6d), Double.valueOf(1.0173946324810807E-4d))};
        S20FE_IMX616_cropped_OFF = new Pair[]{new Pair(Double.valueOf(4.5499208005015616E-12d), Double.valueOf(3.693785435621474E-7d)), new Pair(Double.valueOf(3.432642358191043E-12d), Double.valueOf(1.6243938209910884E-7d)), new Pair(Double.valueOf(1.4635263385573156E-12d), Double.valueOf(2.867025431056803E-7d)), new Pair(Double.valueOf(1.5226498386102671E-12d), Double.valueOf(3.0009806984346464E-7d))};
        S20FE_IMX616_cropped_SC = new Pair[]{new Pair(Double.valueOf(1.0762741793070384E-6d), Double.valueOf(-1.0133582849727787E-5d)), new Pair(Double.valueOf(1.1888235377142536E-6d), Double.valueOf(5.2109398273343714E-6d)), new Pair(Double.valueOf(6.286067311175517E-7d), Double.valueOf(5.163467677133342E-6d)), new Pair(Double.valueOf(6.89863840078728E-7d), Double.valueOf(1.1096024440969737E-6d))};
        S20FE_IMX616_OFF = new Pair[]{new Pair(Double.valueOf(4.4876270888493395E-12d), Double.valueOf(3.8851237612684326E-7d)), new Pair(Double.valueOf(3.3587336496513557E-12d), Double.valueOf(1.7107140680496053E-7d)), new Pair(Double.valueOf(1.45723704353802E-12d), Double.valueOf(2.859863170885568E-7d)), new Pair(Double.valueOf(1.5468794331186691E-12d), Double.valueOf(3.0322049989539413E-7d))};
        S20FE_IMX616_SC = new Pair[]{new Pair(Double.valueOf(1.0802578445314575E-6d), Double.valueOf(-1.1231914153775845E-5d)), new Pair(Double.valueOf(1.1920731455012117E-6d), Double.valueOf(5.086608344106319E-6d)), new Pair(Double.valueOf(6.300547882436361E-7d), Double.valueOf(5.347996674511531E-6d)), new Pair(Double.valueOf(6.86008560429173E-7d), Double.valueOf(9.450441612582963E-7d))};
        S20FE_IMX555_OFF = new Pair[]{new Pair(Double.valueOf(1.4681080532217188E-6d), Double.valueOf(5.05930001824252E-6d)), new Pair(Double.valueOf(1.4710588609257475E-6d), Double.valueOf(1.136444126968499E-5d)), new Pair(Double.valueOf(1.4711734754699614E-6d), Double.valueOf(1.152430457677084E-5d)), new Pair(Double.valueOf(1.4604290551358207E-6d), Double.valueOf(9.93420342553447E-6d))};
        S20FE_IMX555_SC = new Pair[]{new Pair(Double.valueOf(8.115236885366031E-12d), Double.valueOf(4.5086848575771186E-7d)), new Pair(Double.valueOf(9.116841618323087E-12d), Double.valueOf(2.6745152075605667E-7d)), new Pair(Double.valueOf(9.172584038348065E-12d), Double.valueOf(2.714587405508629E-7d)), new Pair(Double.valueOf(8.383274834684786E-12d), Double.valueOf(3.8802541981938136E-7d))};
        S20FE_HI847_OFF = new Pair[]{new Pair(Double.valueOf(2.4887558295683468E-11d), Double.valueOf(8.216286228985755E-8d)), new Pair(Double.valueOf(2.7747120439575797E-11d), Double.valueOf(-2.853031590650638E-7d)), new Pair(Double.valueOf(2.404418272149893E-11d), Double.valueOf(-2.26682701061103E-7d)), new Pair(Double.valueOf(2.405008242456117E-11d), Double.valueOf(6.420950014997832E-8d))};
        S20FE_HI847_SC = new Pair[]{new Pair(Double.valueOf(3.3601308017517956E-6d), Double.valueOf(1.069707853636439E-5d)), new Pair(Double.valueOf(3.3786859865640694E-6d), Double.valueOf(1.270209862515603E-5d)), new Pair(Double.valueOf(3.3655830094877335E-6d), Double.valueOf(9.78751050371603E-6d)), new Pair(Double.valueOf(3.3261376064363923E-6d), Double.valueOf(1.3621323865538143E-5d))};
        RedmiNote8Pro_Wide_ov8856_OFF = new Pair[]{new Pair(Double.valueOf(1.8257646926971884E-11d), Double.valueOf(-1.091082543816384E-6d)), new Pair(Double.valueOf(5.0898325322252386E-11d), Double.valueOf(-3.019517625603438E-6d)), new Pair(Double.valueOf(5.164972188007391E-11d), Double.valueOf(-3.0624965166723383E-6d)), new Pair(Double.valueOf(3.55638210395616E-11d), Double.valueOf(-2.1001919468606478E-6d))};
        RedmiNote8Pro_Wide_ov8856_SC = new Pair[]{new Pair(Double.valueOf(1.2901609547862841E-6d), Double.valueOf(1.173444394127581E-4d)), new Pair(Double.valueOf(1.1384054169425613E-6d), Double.valueOf(1.530881163513037E-4d)), new Pair(Double.valueOf(1.1344758707951035E-6d), Double.valueOf(1.5465240197293023E-4d)), new Pair(Double.valueOf(1.1362495615577489E-6d), Double.valueOf(1.5187822199302331E-4d))};
        RedmiNote8Pro_Main16_S5KGW1_OFF = new Pair[]{new Pair(Double.valueOf(-3.779905567420725E-13d), Double.valueOf(2.109280203059284E-7d)), new Pair(Double.valueOf(-3.3887170040804594E-13d), Double.valueOf(-3.823959650964669E-8d)), new Pair(Double.valueOf(-3.115728957795534E-13d), Double.valueOf(-5.743854162397619E-8d)), new Pair(Double.valueOf(-2.4097736762447976E-13d), Double.valueOf(6.961228845104142E-8d))};
        RedmiNote8Pro_Main16_S5KGW1_SC = new Pair[]{new Pair(Double.valueOf(3.8975112131786187E-7d), Double.valueOf(4.185976184018614E-6d)), new Pair(Double.valueOf(3.7211912719143133E-7d), Double.valueOf(1.3952790442030366E-5d)), new Pair(Double.valueOf(3.710511134877152E-7d), Double.valueOf(1.449376282708729E-5d)), new Pair(Double.valueOf(3.834267789775934E-7d), Double.valueOf(7.106086689535741E-6d))};
        Mi11Lite_S5KGW3_OFF = new Pair[]{new Pair(Double.valueOf(1.5446172423211628E-12d), Double.valueOf(2.04930751814974E-7d)), new Pair(Double.valueOf(1.072691275947257E-12d), Double.valueOf(3.250473191527957E-7d)), new Pair(Double.valueOf(7.364380508407056E-13d), Double.valueOf(5.368374018607038E-7d)), new Pair(Double.valueOf(1.356054106183772E-12d), Double.valueOf(2.2733197133988292E-7d))};
        Mi11Lite_S5KGW3_SC = new Pair[]{new Pair(Double.valueOf(6.870221990642322E-7d), Double.valueOf(1.3012317983842E-6d)), new Pair(Double.valueOf(7.63238293688764E-7d), Double.valueOf(2.9571660895643766E-5d)), new Pair(Double.valueOf(7.884682803973055E-7d), Double.valueOf(1.9055304109882448E-5d)), new Pair(Double.valueOf(6.953424828648244E-7d), Double.valueOf(-1.4954401052190345E-6d))};
        Mi11Ultra_IMX586_TELE_OFF = new Pair[]{new Pair(Double.valueOf(2.860159720554419E-14d), Double.valueOf(5.602956023242331E-7d)), new Pair(Double.valueOf(-3.1838746303449557E-12d), Double.valueOf(1.750470629882496E-8d)), new Pair(Double.valueOf(-1.7094295610650158E-12d), Double.valueOf(2.493932220342712E-7d)), new Pair(Double.valueOf(-6.02111743617186E-13d), Double.valueOf(4.2649421593324914E-7d))};
        Mi11Ultra_IMX586_TELE_SC = new Pair[]{new Pair(Double.valueOf(1.1277745145135217E-6d), Double.valueOf(-1.2265630119575384E-5d)), new Pair(Double.valueOf(1.2539363727977985E-6d), Double.valueOf(7.651445230984135E-6d)), new Pair(Double.valueOf(6.422211577250093E-7d), Double.valueOf(6.199845785587987E-6d)), new Pair(Double.valueOf(7.111411728593267E-7d), Double.valueOf(-5.828832025933354E-7d))};
        Mi11Ultra_IMX586_UW_OFF = new Pair[]{new Pair(Double.valueOf(3.3264582037381913E-12d), Double.valueOf(4.132847510345144E-7d)), new Pair(Double.valueOf(2.6164366774202063E-12d), Double.valueOf(1.5600523691049206E-7d)), new Pair(Double.valueOf(1.2934486313498188E-12d), Double.valueOf(3.1321943522029957E-7d)), new Pair(Double.valueOf(1.4641034299393347E-12d), Double.valueOf(3.4511359281175435E-7d))};
        Mi11Ultra_IMX586_UW_SC = new Pair[]{new Pair(Double.valueOf(1.1541073760030817E-6d), Double.valueOf(-1.474529920652588E-5d)), new Pair(Double.valueOf(1.2351069583180527E-6d), Double.valueOf(3.228606709416894E-6d)), new Pair(Double.valueOf(6.329863259007093E-7d), Double.valueOf(4.10288183418683E-6d)), new Pair(Double.valueOf(6.990107261921658E-7d), Double.valueOf(5.279468369804019E-7d))};
        Mi11Ultra_S5KGN2_OFF = new Pair[]{new Pair(Double.valueOf(1.183684702421326E-12d), Double.valueOf(3.3587313661344455E-7d)), new Pair(Double.valueOf(9.865073334310712E-13d), Double.valueOf(3.0681018551524126E-7d)), new Pair(Double.valueOf(1.01849387048785E-12d), Double.valueOf(2.929153768130966E-7d)), new Pair(Double.valueOf(1.4373690621265084E-12d), Double.valueOf(3.1392338228137734E-7d))};
        Mi11Ultra_S5KGN2_SC = new Pair[]{new Pair(Double.valueOf(6.583810665079091E-7d), Double.valueOf(-8.368472306483928E-7d)), new Pair(Double.valueOf(6.458050664376449E-7d), Double.valueOf(-8.553685926555313E-7d)), new Pair(Double.valueOf(6.45747862695993E-7d), Double.valueOf(-5.46455588665976E-7d)), new Pair(Double.valueOf(6.458083677325721E-7d), Double.valueOf(-3.4847058501334723E-7d))};
        RealmeX2PROTest_GW1_OFF = new Pair[]{new Pair(Double.valueOf(1.4430386334308791E-12d), Double.valueOf(4.123067853233886E-7d)), new Pair(Double.valueOf(1.6292354818096778E-12d), Double.valueOf(2.545926725605281E-7d)), new Pair(Double.valueOf(1.5175908405238919E-12d), Double.valueOf(2.5761193584997244E-7d)), new Pair(Double.valueOf(1.4512424113758001E-12d), Double.valueOf(3.1117542762307266E-7d))};
        RealmeX2PROTest_GW1_SC = new Pair[]{new Pair(Double.valueOf(8.053546812221963E-7d), Double.valueOf(-2.1736186298320857E-6d)), new Pair(Double.valueOf(7.417742702951591E-7d), Double.valueOf(9.6405265989941E-6d)), new Pair(Double.valueOf(7.438570979065307E-7d), Double.valueOf(9.026064927055951E-6d)), new Pair(Double.valueOf(7.79834469919903E-7d), Double.valueOf(-1.3552085623193108E-6d))};
        RealmeX2PRO_GW1_OFF = new Pair[]{new Pair(Double.valueOf(1.5100439046540729E-12d), Double.valueOf(3.5287122685284874E-7d)), new Pair(Double.valueOf(1.5598937275879653E-12d), Double.valueOf(1.762672009613356E-7d)), new Pair(Double.valueOf(1.5653323126899824E-12d), Double.valueOf(1.8720797154510407E-7d)), new Pair(Double.valueOf(1.4072175767395725E-12d), Double.valueOf(2.991289836647061E-7d))};
        RealmeX2PRO_GW1_SC = new Pair[]{new Pair(Double.valueOf(7.937561176552756E-7d), Double.valueOf(1.8224953006764382E-6d)), new Pair(Double.valueOf(7.357707563944635E-7d), Double.valueOf(1.3886849905227422E-5d)), new Pair(Double.valueOf(7.332512912668059E-7d), Double.valueOf(1.3715055230569548E-5d)), new Pair(Double.valueOf(7.75875480230506E-7d), Double.valueOf(6.0031177348066E-7d))};
        EdgeX30_OV60A_OFF = new Pair[]{new Pair(Double.valueOf(5.131293932374983E-12d), Double.valueOf(3.8450079558964484E-7d)), new Pair(Double.valueOf(5.690472561475229E-12d), Double.valueOf(2.864880282278774E-7d)), new Pair(Double.valueOf(5.784504216496244E-12d), Double.valueOf(2.8860237291542234E-7d)), new Pair(Double.valueOf(4.963077671548636E-12d), Double.valueOf(4.0394279214797953E-7d))};
        EdgeX30_OV60A_SC = new Pair[]{new Pair(Double.valueOf(9.152912288973421E-7d), Double.valueOf(1.3676105294844176E-5d)), new Pair(Double.valueOf(8.380499730242717E-7d), Double.valueOf(2.926799122668295E-5d)), new Pair(Double.valueOf(8.385442398296487E-7d), Double.valueOf(2.9253652485934477E-5d)), new Pair(Double.valueOf(9.372983195174246E-7d), Double.valueOf(1.0694100189341064E-5d))};
        EdgeX30_OV50A_OFF = new Pair[]{new Pair(Double.valueOf(1.5577581220527778E-12d), Double.valueOf(1.959159257446027E-7d)), new Pair(Double.valueOf(2.485295118575398E-12d), Double.valueOf(1.5744416476588227E-7d)), new Pair(Double.valueOf(2.457677392489737E-12d), Double.valueOf(1.577797640225482E-7d)), new Pair(Double.valueOf(1.514902385054361E-12d), Double.valueOf(2.0368534157158747E-7d))};
        EdgeX30_OV50A_SC = new Pair[]{new Pair(Double.valueOf(6.771798808457113E-7d), Double.valueOf(8.878823782791719E-6d)), new Pair(Double.valueOf(6.184531950082643E-7d), Double.valueOf(1.9745800481028767E-5d)), new Pair(Double.valueOf(6.177640050094961E-7d), Double.valueOf(1.987882058863307E-5d)), new Pair(Double.valueOf(6.795228781156541E-7d), Double.valueOf(8.2000531175546E-6d))};
        EdgeX30_JN1_OFF = new Pair[]{new Pair(Double.valueOf(2.4238411401404907E-13d), Double.valueOf(1.0984939360413206E-7d)), new Pair(Double.valueOf(2.6575322278617024E-13d), Double.valueOf(-6.16289354000185E-8d)), new Pair(Double.valueOf(2.1373311276482333E-13d), Double.valueOf(-3.206276646341042E-8d)), new Pair(Double.valueOf(2.1636318310033287E-13d), Double.valueOf(1.3689317865434827E-7d))};
        EdgeX30_JN1_SC = new Pair[]{new Pair(Double.valueOf(3.3103820631264725E-7d), Double.valueOf(5.362533310747106E-6d)), new Pair(Double.valueOf(3.506465900038276E-7d), Double.valueOf(8.971992172126385E-6d)), new Pair(Double.valueOf(3.529229548485046E-7d), Double.valueOf(7.295225688937042E-6d)), new Pair(Double.valueOf(3.3740653662381365E-7d), Double.valueOf(5.460547209670209E-6d))};
        Manual_Noise_Modeler_OFF = new Pair[]{new Pair(Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_a_0_key")))), Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_b_0_key"))))), new Pair(Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_a_1_key")))), Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_b_1_key"))))), new Pair(Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_a_2_key")))), Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_b_2_key"))))), new Pair(Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_a_3_key")))), Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_b_3_key")))))};
        Manual_Noise_Modeler = new Pair[]{new Pair(Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_c_0_key")))), Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_d_0_key"))))), new Pair(Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_c_1_key")))), Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_d_1_key"))))), new Pair(Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_c_2_key")))), Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_d_2_key"))))), new Pair(Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_c_3_key")))), Double.valueOf(Double.parseDouble(Pref.getStringValue(LensValue.SetLensValue1("pref_noise_modeler_manual_d_3_key")))))};
    }

    NoiseModels() {
    }

    public static int NoiseModelSelector() {
        if (Helper.sFront != 0) {
            return Pref.MenuValue("pref_noise_model_key_front");
        }
        switch (Pref.MenuValue("pref_aux_key")) {
            case 0:
            default:
                return Pref.MenuValue("pref_noise_model_key");
            case 1:
                return Pref.MenuValue("pref_noise_model_key_2");
            case 2:
                return Pref.MenuValue("pref_noise_model_key_3");
            case 3:
                return Pref.MenuValue("pref_noise_model_key_4");
            case 4:
                return Pref.MenuValue("pref_noise_model_key_5");
        }
    }

    static double a(int i, int i2, Pair[] pairArr) {
        double dDoubleValue = ((Double) pairArr[i].second).doubleValue() + (((Double) pairArr[i].first).doubleValue() * ((double) i2));
        if (dDoubleValue < 0.0d) {
            return 0.0d;
        }
        return dDoubleValue;
    }

    static double b(int i, int i2, int i3, Pair[] pairArr) {
        double dDoubleValue = ((Double) pairArr[i].first).doubleValue();
        double dDoubleValue2 = ((Double) pairArr[i].second).doubleValue();
        double d = ((double) i2) / ((double) i3) >= 1.0d ? ((double) i2) / ((double) i3) : 1.0d;
        double d2 = (d * dDoubleValue2 * d) + (dDoubleValue * ((double) i2) * ((double) i2));
        if (d2 < 0.0d) {
            return 0.0d;
        }
        return d2;
    }

    public static Object j(lvp lvpVar, lzr lzrVar) {
        Pair[] pairArr = new Pair[4];
        int iIntValue = ((Integer) lvpVar.n(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue();
        Helper.GetISOsystem = ((Integer) lzrVar.d(CaptureResult.SENSOR_SENSITIVITY)).intValue();
        int iSONm = Helper.getISONm(lzrVar);
        Helper.GetISO = iSONm;
        for (int i = 0; i < 4; i++) {
            pairArr[i] = new Pair(Double.valueOf(a(i, iSONm, NM_SC)), Double.valueOf(b(i, iSONm, iIntValue, NM_OFF)));
        }
        return pairArr;
    }

    public static void mode(int i) {
        Pair[] pairArrSecondPair;
        Pair[] pairArrFirstPair;
        Pair[] pairArr;
        Pair[] pairArr2;
        if (i == 0) {
            return;
        }
        if (i < 0) {
            String stringValue = Pref.getStringValue(LensValue.SetLensValue1("pref_load_noise_model_key"));
            if (stringValue.equalsIgnoreCase("Default") || stringValue.equalsIgnoreCase("0")) {
                pairArrSecondPair = IMX363_CSTARK_OFF;
                pairArrFirstPair = IMX363_CSTARK_SC;
            } else {
                pairArrSecondPair = Internal.SecondPair();
                pairArrFirstPair = Internal.FirstPair();
            }
            NM_OFF = pairArrSecondPair;
            NM_SC = pairArrFirstPair;
            return;
        }
        switch (i) {
            case 1:
            default:
                pairArr = IMX363_CSTARK_OFF;
                pairArr2 = IMX363_CSTARK_SC;
                break;
            case 2:
                pairArr = S5K3T2_SAVITAR_OFF;
                pairArr2 = S5K3T2_SAVITAR_SC;
                break;
            case 3:
                pairArr = S5KHMX1_SAVITAR_OFF;
                pairArr2 = S5KHMX1_SAVITAR_SC;
                break;
            case 4:
                pairArr = S5KHMX_SAVITAR_OFF;
                pairArr2 = S5KHMX_SAVITAR_SC;
                break;
            case 5:
                pairArr = S5KHMX_OFF;
                pairArr2 = S5KHMX_SC;
                break;
            case 6:
                pairArr = S5K3T2_OFF;
                pairArr2 = S5K3T2_SC;
                break;
            case 7:
                pairArr = S5K5E9_OFF;
                pairArr2 = S5K5E9_SC;
                break;
            case 8:
                pairArr = OV13B10_OFF;
                pairArr2 = OV13B10_SC;
                break;
            case 9:
                pairArr = IMX355_PX4A_CSTARK_OFF;
                pairArr2 = IMX355_PX4A_CSTARK_SC;
                break;
            case 10:
                pairArr = GC02M1_ARNOVA_OFF;
                pairArr2 = GC02M1_ARNOVA_SC;
                break;
            case 11:
                pairArr = IMX363_PX4A_CSTARK_OFF;
                pairArr2 = IMX363_PX4A_CSTARK_SC;
                break;
            case 12:
                pairArr = IMX363_PX4XL_CSTARK_OFF;
                pairArr2 = IMX363_PX4XL_CSTARK_SC;
                break;
            case 13:
                pairArr = IMX374_SONY_OFF;
                pairArr2 = IMX374_SONY_SC;
                break;
            case 14:
                pairArr = IMX376_ARNOVA_OFF;
                pairArr2 = IMX376_ARNOVA_SC;
                break;
            case 15:
                pairArr = IMX471_ARNOVA_OFF;
                pairArr2 = IMX471_ARNOVA_SC;
                break;
            case 16:
                pairArr = IMX481_SAP_OFF;
                pairArr2 = IMX481_SAP_SC;
                break;
            case 17:
                pairArr = IMX519_ARNOVA_OFF;
                pairArr2 = IMX519_ARNOVA_SC;
                break;
            case 18:
                pairArr = IMX520_PX4XL_CSTARK_OFF;
                pairArr2 = IMX520_PX4XL_CSTARK_SC;
                break;
            case 19:
                pairArr = IMX555_CSTARK_OFF;
                pairArr2 = IMX555_CSTARK_SC;
                break;
            case 20:
                pairArr = IMX563_OFF;
                pairArr2 = IMX563_SC;
                break;
            case 21:
                pairArr = IMX586_AVG_SAP_OFF;
                pairArr2 = IMX586_AVG_SAP_SC;
                break;
            case 22:
                pairArr = IMX586_OFILM_MEVLUT_OFF;
                pairArr2 = IMX586_OFILM_MEVLUT_SC;
                break;
            case 23:
                pairArr = IMX586_SAP2_OFF;
                pairArr2 = IMX586_SAP2_SC;
                break;
            case 24:
                pairArr = IMX586_SAP_OFF;
                pairArr2 = IMX586_SAP_SC;
                break;
            case 25:
                pairArr = IMX586_SEMCO_RAKIN_OFF;
                pairArr2 = IMX586_SEMCO_RAKIN_SC;
                break;
            case 26:
                pairArr = IMX586_VIOLET_ARCHESOLUS_OFF;
                pairArr2 = IMX586_VIOLET_ARCHESOLUS_SC;
                break;
            case 27:
                pairArr = IMX682_ARNOVA_OFF;
                pairArr2 = IMX682_ARNOVA_SC;
                break;
            case 28:
                pairArr = IMX686_ARNOVA_OFF;
                pairArr2 = IMX686_ARNOVA_SC;
                break;
            case 29:
                pairArr = IMX689_ARNOVA_OFF;
                pairArr2 = IMX689_ARNOVA_SC;
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                pairArr = LGV50_s5k3m5_3_OFF;
                pairArr2 = LGV50_s5k3m5_3_SC;
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                pairArr = LGV50_IMX363_0_OFF;
                pairArr2 = LGV50_IMX363_0_SC;
                break;
            case 32:
                pairArr = LGV50_IMX351_2_OFF;
                pairArr2 = LGV50_IMX351_2_SC;
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                pairArr = MI10U_2x_S5K2L7_OFF;
                pairArr2 = MI10U_2x_S5K2L7_SC;
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                pairArr = MI10U_5x_IMX586_OFF;
                pairArr2 = MI10U_5x_IMX586_SC;
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                pairArr = MI10U_Front_S5K3T2_OFF;
                pairArr2 = MI10U_Front_S5K3T2_SC;
                break;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                pairArr = MI10U_Main_OV48C_OFF;
                pairArr2 = MI10U_Main_OV48C_SC;
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                pairArr = MI10U_UW_IMX350_OFF;
                pairArr2 = MI10U_UW_IMX350_SC;
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                pairArr = OV13855_ARCHESOLUS_OFF;
                pairArr2 = OV13855_ARCHESOLUS_SC;
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                pairArr = OV8856_ARNOVA_OFF;
                pairArr2 = OV8856_ARNOVA_SC;
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                pairArr = Mi10U_new_IMX586_4_OFF;
                pairArr2 = Mi10U_new_IMX586_4_SC;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                pairArr = S5K2L4SX_OFF;
                pairArr2 = S5K2L4SX_SC;
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                pairArr = S5K3M5_OFF;
                pairArr2 = S5K3M5_SC;
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                pairArr = S5K3M5_SAP_OFF;
                pairArr2 = S5K3M5_SAP_SC;
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                pairArr = S5K3P9SN_OFF;
                pairArr2 = S5K3P9SN_SC;
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                pairArr = S5KGH1_OFF;
                pairArr2 = S5KGH1_SC;
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                pairArr = S5KGM2_CSTARK_OFF;
                pairArr2 = S5KGM2_CSTARK_SC;
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                pairArr = SAVITAR_Macro_OFF;
                pairArr2 = SAVITAR_Macro_SC;
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                pairArr = Samsung_S5KGW1_2_OFF;
                pairArr2 = Samsung_S5KGW1_2_SC;
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                pairArr = UWA_SAVITAR_OFF;
                pairArr2 = UWA_SAVITAR_SC;
                break;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                pairArr = RN9S_S5KGM2_0_OFF;
                pairArr2 = RN9S_S5KGM2_0_SC;
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                pairArr = RN9S_S5K5E9_22_OFF;
                pairArr2 = RN9S_S5K5E9_22_SC;
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                pairArr = RN9S_OV8856_21_OFF;
                pairArr2 = RN9S_OV8856_21_SC;
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                pairArr = RN9S_OV16A1Q_1_NOISE_fix_OFF;
                pairArr2 = RN9S_OV16A1Q_1_NOISE_fix_SC;
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                pairArr = RN9S_GC02M1_20_OFF;
                pairArr2 = RN9S_GC02M1_20_SC;
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                pairArr = Pocox3nfc_imx682_i_sony_661_OFF;
                pairArr2 = Pocox3nfc_imx682_i_sony_661_SC;
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                pairArr = PocoX3Pro_IMX582_new_0_OFF;
                pairArr2 = PocoX3Pro_IMX582_new_0_SC;
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                pairArr = PocoX3Pro_S5K3T2_new_1_OFF;
                pairArr2 = PocoX3Pro_S5K3T2_new_1_SC;
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                pairArr = PocoX3Pro_OV8856_3_OFF;
                pairArr2 = PocoX3Pro_OV8856_3_SC;
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                pairArr = PocoX3Pro_OV02B1B_4_OFF;
                pairArr2 = PocoX3Pro_OV02B1B_4_SC;
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                pairArr = LGV50_SL846_1_OFF;
                pairArr2 = LGV50_SL846_1_SC;
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                pairArr = LGV50_SL556_4_OFF;
                pairArr2 = LGV50_SL556_4_SC;
                break;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                pairArr = Oneplus8Pro_IMX689_0_Enzo_OFF;
                pairArr2 = Oneplus8Pro_IMX689_0_Enzo_SC;
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                pairArr = Oneplus8Pro_IMX689_0_OFF;
                pairArr2 = Oneplus8Pro_IMX689_0_SC;
                break;
            case 64:
                pairArr = Oneplus8pro_IMX471_1_OFF;
                pairArr2 = Oneplus8pro_IMX471_1_SC;
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                pairArr = Oneplus8pro_IMX586_2_OFF;
                pairArr2 = Oneplus8pro_IMX586_2_SC;
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                pairArr = Oneplus8pro_S5K3M5_3_OFF;
                pairArr2 = Oneplus8pro_S5K3M5_3_SC;
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                pairArr = RN7_s5kgm1_0_OFF;
                pairArr2 = RN7_s5kgm1_0_SC;
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                pairArr = Mi9_IMX586_0_OFF;
                pairArr2 = Mi9_IMX586_0_SC;
                break;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                pairArr = Mi9_S5K3M5_20_OFF;
                pairArr2 = Mi9_S5K3M5_20_SC;
                break;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                pairArr = Mi9_IMX481_21_OFF;
                pairArr2 = Mi9_IMX481_21_SC;
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                pairArr = RN9PRO_GC8034_21_OFF;
                pairArr2 = RN9PRO_GC8034_21_SC;
                break;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                pairArr = RN9PRO_GW1_0_OFF;
                pairArr2 = RN9PRO_GW1_0_SC;
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                pairArr = RN9PRO_SK5E9_22_OFF;
                pairArr2 = RN9PRO_SK5E9_22_SC;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                pairArr = RN10PRO_HM2_0_OFF;
                pairArr2 = RN10PRO_HM2_0_SC;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                pairArr = RN10PRO_IMX355_4_OFF;
                pairArr2 = RN10PRO_IMX355_4_SC;
                break;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                pairArr = RN10PRO_IMX471_1_OFF;
                pairArr2 = RN10PRO_IMX471_1_SC;
                break;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                pairArr = RN10PRO_OV5675_3_OFF;
                pairArr2 = RN10PRO_OV5675_3_SC;
                break;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                pairArr = Mi11Pro_fix_S5KGN2_0_OFF;
                pairArr2 = Mi11Pro_fix_S5KGN2_0_SC;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                pairArr = Mi11Pro_OV13B10_2_OFF;
                pairArr2 = Mi11Pro_OV13B10_2_SC;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                pairArr = Mi11Pro_fix_OV08A10_3_OFF;
                pairArr2 = Mi11Pro_fix_OV08A10_3_SC;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                pairArr = MI11X_IMX582_0_OFF;
                pairArr2 = MI11X_IMX582_0_SC;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                pairArr = MI11X_S5K3T2_1_OFF;
                pairArr2 = MI11X_S5K3T2_1_SC;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                pairArr = MI11X_IMX355_2_OFF;
                pairArr2 = MI11X_IMX355_2_SC;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                pairArr = OnePlus9Pro_imx789_0_OFF;
                pairArr2 = OnePlus9Pro_imx789_0_SC;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                pairArr = OnePlus9Pro_imx471_1_OFF;
                pairArr2 = OnePlus9Pro_imx471_1_SC;
                break;
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                pairArr = OnePlus9Pro_imx766_2_OFF;
                pairArr2 = OnePlus9Pro_imx766_2_SC;
                break;
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                pairArr = OnePlus9Pro_ov08a10_3_OFF;
                pairArr2 = OnePlus9Pro_ov08a10_3_SC;
                break;
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                pairArr = RN9S_fix_S5KGM2_0_OFF;
                pairArr2 = RN9S_fix_S5KGM2_0_SC;
                break;
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                pairArr = GalaxyM51_IMX682_0_OFF;
                pairArr2 = GalaxyM51_IMX682_0_SC;
                break;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                pairArr = GalaxyM51_IMX616_1_OFF;
                pairArr2 = GalaxyM51_IMX616_1_SC;
                break;
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                pairArr = GalaxyM51_S5K3L6_2_OFF;
                pairArr2 = GalaxyM51_S5K3L6_2_SC;
                break;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                pairArr = GalaxyM51_IMX616_3_OFF;
                pairArr2 = GalaxyM51_IMX616_3_SC;
                break;
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                pairArr = GalaxyM51_GC5035_54_OFF;
                pairArr2 = GalaxyM51_GC5035_54_SC;
                break;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                pairArr = MI11U_GN2_ID1_OFF;
                pairArr2 = MI11U_GN2_ID1_SC;
                break;
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                pairArr = Mi11U_GN2_ID1_Arnova_OFF;
                pairArr2 = Mi11U_GN2_ID1_Arnova_SC;
                break;
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                pairArr = PocoX3_imx682_0_DNF_OFF;
                pairArr2 = PocoX3_imx682_0_DNF_SC;
                break;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                pairArr = PocoX3_s5k3t2_1_DNF_OFF;
                pairArr2 = PocoX3_s5k3t2_1_DNF_SC;
                break;
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                pairArr = PocoX3_hi1337_21_DNF_OFF;
                pairArr2 = PocoX3_hi1337_21_DNF_SC;
                break;
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                pairArr = PocoX3_hi259_22_DNF_OFF;
                pairArr2 = PocoX3_hi259_22_DNF_SC;
                break;
            case R.styleable.AppCompatTheme_spinnerStyle /* 100 */:
                pairArr = IMX686_0_Necrys_OFF;
                pairArr2 = IMX686_0_Necrys_SC;
                break;
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                pairArr = OV8856_21_Necrys_OFF;
                pairArr2 = OV8856_21_Necrys_SC;
                break;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                pairArr = S20FE_S5K3L6_OFF;
                pairArr2 = S20FE_S5K3L6_SC;
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                pairArr = S20FE_IMX616_cropped_OFF;
                pairArr2 = S20FE_IMX616_cropped_SC;
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                pairArr = S20FE_IMX616_OFF;
                pairArr2 = S20FE_IMX616_SC;
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                pairArr = S20FE_IMX555_OFF;
                pairArr2 = S20FE_IMX555_SC;
                break;
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                pairArr = S20FE_HI847_OFF;
                pairArr2 = S20FE_HI847_SC;
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                pairArr = RedmiNote8Pro_Wide_ov8856_OFF;
                pairArr2 = RedmiNote8Pro_Wide_ov8856_SC;
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                pairArr = RedmiNote8Pro_Main16_S5KGW1_OFF;
                pairArr2 = RedmiNote8Pro_Main16_S5KGW1_SC;
                break;
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                pairArr = Mi11Lite_S5KGW3_OFF;
                pairArr2 = Mi11Lite_S5KGW3_SC;
                break;
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                pairArr = Mi11Ultra_IMX586_TELE_OFF;
                pairArr2 = Mi11Ultra_IMX586_TELE_SC;
                break;
            case 111:
                pairArr = Mi11Ultra_IMX586_UW_OFF;
                pairArr2 = Mi11Ultra_IMX586_UW_SC;
                break;
            case 112:
                pairArr = Mi11Ultra_S5KGN2_OFF;
                pairArr2 = Mi11Ultra_S5KGN2_SC;
                break;
            case 113:
                pairArr = RealmeX2PROTest_GW1_OFF;
                pairArr2 = RealmeX2PROTest_GW1_SC;
                break;
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                pairArr = RealmeX2PRO_GW1_OFF;
                pairArr2 = RealmeX2PRO_GW1_SC;
                break;
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                pairArr = EdgeX30_JN1_OFF;
                pairArr2 = EdgeX30_JN1_SC;
                break;
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                pairArr = EdgeX30_OV50A_OFF;
                pairArr2 = EdgeX30_OV50A_SC;
                break;
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                pairArr = EdgeX30_OV60A_OFF;
                pairArr2 = EdgeX30_OV60A_SC;
                break;
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                pairArr = Manual_Noise_Modeler_OFF;
                pairArr2 = Manual_Noise_Modeler;
                break;
        }
        NM_OFF = pairArr;
        NM_SC = pairArr2;
    }
}
