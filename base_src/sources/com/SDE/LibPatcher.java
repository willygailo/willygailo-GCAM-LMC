package com.SDE;

import android.app.AppGlobals;
import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.widget.Toast;
import com.Fix.Pref;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class LibPatcher {
    public static int A = 0;
    private static final int FILE_WRITE_BUFFER_SIZE = 32256;
    private static final int _AVGLDR = 43530508;
    private static final int _AppDiGainSet = 18770488;
    private static final int _BY = 3586320;
    private static final int _BayerNModHal1 = 42778372;
    private static final int _BetterColWiener = 47137192;
    private static final int _BlackLevel = 17953368;
    private static final int _BlurDenoise = 47154264;
    private static final int _BlurPreview = 18758480;
    private static final int _BrightN = 43065428;
    private static final int _Brightnessintensity = 43635564;
    private static final int _CContrast = 34546856;
    private static final int _CContrast2 = 33522756;
    private static final int _CG1 = 43498024;
    private static final int _CG10 = 43498072;
    private static final int _CG2 = 43498028;
    private static final int _CG3 = 43498052;
    private static final int _CG4 = 43498076;
    private static final int _CG5 = 43498108;
    private static final int _CG6 = 43498152;
    private static final int _CG9 = 43498048;
    private static final int _ChromaA = 33278288;
    private static final int _ChromaB = 33278292;
    private static final int _Clarity = 33290020;
    private static final int _CoefSabrTuNoise = 3552444;
    private static final int _ColProcessing = 33284368;
    private static final int _Contr = 45622244;
    private static final int _Contrast4 = 43535096;
    private static final int _Contrast5 = 43535108;
    private static final int _ContrastBlack = 3560676;
    private static final int _ContrastL1 = 3558880;
    private static final int _ContrastL2 = 3562224;
    private static final int _ContrastL3a = 45622200;
    private static final int _Darkenlight = 46802384;
    private static final int _Darker = 43799836;
    private static final int _DehazeBlack = 33519964;
    private static final int _DehazedExpo = 33278444;
    private static final int _Dehazedregulator2 = 33289044;
    private static final int _DenSmoothing1 = 47140088;
    private static final int _DenSmoothing2 = 47137000;
    private static final int _Denoise = 33277400;
    private static final int _Depth1 = 45712172;
    private static final int _Depth2 = 45712176;
    private static final int _DisableHigh = 43527124;
    private static final int _DiscardFramesWithTetMismatch = 32403372;
    private static final int _ExpoComp = 43548200;
    private static final int _ExpoCor = 43530364;
    private static final int _Exposition = 43490632;
    private static final int _Exposure = 43534008;
    private static final int _ExposureDarker = 46799444;
    private static final int _ExposureDarker2 = 46799632;
    private static final int _FixNoiseSabre = 42023136;
    private static final int _FixRaw16Merge = 42012800;
    private static final int _FixShastaMerge = 42022272;
    private static final int _GRO = 3586328;
    private static final int _GainLarge = 33287976;
    private static final int _GainMed = 33287932;
    private static final int _GainRad = 33287832;
    private static final int _GainSmall = 33287896;
    private static final int _GainThreshold = 33277012;
    private static final int _Green = 3560920;
    private static final int _HDR2 = 33522468;
    private static final int _HDRBrightness = 34546420;
    private static final int _HDREffect = 34523824;
    private static final int _HDREffectInt = 34533996;
    private static final int _HDRModel = 46825048;
    private static final int _HDROverLight = 34523436;
    private static final int _HDRRangeMinus = 43549868;
    private static final int _HDRRangePlus = 43549880;
    private static final int _HDRRatio2 = 43490460;
    private static final int _HDRRatio3 = 43543824;
    private static final int _HDRRaw2 = 43636492;
    private static final int _HDRSabreCalcVal1 = 47149516;
    private static final int _HDRSabreCalcVal2 = 47150092;
    private static final int _HardJPGQuality = 44571164;
    private static final int _HardMerge = 18788776;
    private static final int _HardUX = 18759596;
    private static final int _HdrPlusInterface = 32246024;
    private static final int _Hightlight2 = 43536428;
    private static final int _HightlightCompensation2 = 34529964;
    private static final int _Hotpixelsuppres = 33308380;
    private static final int _ISO = 43468032;
    private static final int _InitParams = 18785956;
    private static final int _InitParams2 = 18785976;
    private static final int _InitParams_1simultaneous_1merge_1and_1finish_1set = 18786004;
    private static final int _IsoExpoTun = 44422688;
    private static final int _LDR = 43634496;
    private static final int _LibSignature = 2174870;
    private static final int _Light = 34530080;
    private static final int _LightFix = 2018912;
    private static final int _LightFix2 = 43542248;
    private static final int _LightFix3 = 32300940;
    private static final int _Lighting = 41991144;
    private static final int _LiteLDRHighlight = 43536508;
    private static final int _LumaA = 33277820;
    private static final int _LumaB = 33277824;
    private static final int _LumaDHL1 = 11537011;
    private static final int _LumaDHL2 = 11537028;
    private static final int _LumaDHL3 = 11537045;
    private static final int _LumaDHL4 = 11537062;
    private static final int _LumaDHL5 = 11537079;
    private static final int _LumaDHSL1 = 11537299;
    private static final int _LumaDHSL2 = 11537284;
    private static final int _LumaDHSL3 = 11537333;
    private static final int _LumaDHSL4 = 11537350;
    private static final int _LumaDHSL5 = 11537367;
    private static final int _LumaDHSabreL1 = 11520963;
    private static final int _LumaDHSabreL1A = 11520968;
    private static final int _LumaDHSabreL1B = 11520973;
    private static final int _LumaDHSabreL2 = 11520980;
    private static final int _LumaDHSabreL2A = 11520985;
    private static final int _LumaDHSabreL2B = 11520990;
    private static final int _LumaDHSabreL3 = 11520997;
    private static final int _LumaDHSabreL3A = 11521002;
    private static final int _LumaDHSabreL3B = 11521007;
    private static final int _LumaDHSabreL4 = 11521014;
    private static final int _LumaDHSabreL4A = 11521019;
    private static final int _LumaDHSabreL4B = 11521024;
    private static final int _LumaDHSabreL5 = 11521031;
    private static final int _LumaDHSabreL5A = 11521036;
    private static final int _LumaDLL1 = 11537107;
    private static final int _LumaDLL2 = 11537124;
    private static final int _LumaDLL3 = 11537141;
    private static final int _LumaDLL4 = 11537158;
    private static final int _LumaDLL5 = 11537175;
    private static final int _LumaDLSL1 = 11537379;
    private static final int _LumaDLSL2 = 11537396;
    private static final int _LumaDLSL3 = 11537413;
    private static final int _LumaDLSL4 = 11537430;
    private static final int _LumaDLSL5 = 11537447;
    private static final int _LumaDLSabreL1 = 11521059;
    private static final int _LumaDLSabreL1A = 11521064;
    private static final int _LumaDLSabreL1B = 11521069;
    private static final int _LumaDLSabreL2 = 11521076;
    private static final int _LumaDLSabreL2A = 11521081;
    private static final int _LumaDLSabreL2B = 11521086;
    private static final int _LumaDLSabreL3 = 11521093;
    private static final int _LumaDLSabreL3A = 11521098;
    private static final int _LumaDLSabreL3B = 11521103;
    private static final int _LumaDLSabreL4 = 11521110;
    private static final int _LumaDLSabreL4A = 11521115;
    private static final int _LumaDLSabreL4B = 11521120;
    private static final int _LumaDLSabreL5 = 11521127;
    private static final int _LumaDLSabreL5A = 11521132;
    private static final int _LumaDML1 = 11537203;
    private static final int _LumaDML2 = 11537220;
    private static final int _LumaDML3 = 11537237;
    private static final int _LumaDML4 = 11537254;
    private static final int _LumaDML5 = 11537271;
    private static final int _LumaDMSL1 = 11537475;
    private static final int _LumaDMSL2 = 11537492;
    private static final int _LumaDMSL3 = 11537509;
    private static final int _LumaDMSL4 = 11537526;
    private static final int _LumaDMSL5 = 11537543;
    private static final int _LumaDMSabreL1 = 11521155;
    private static final int _LumaDMSabreL1A = 11521160;
    private static final int _LumaDMSabreL1B = 11521165;
    private static final int _LumaDMSabreL2 = 11521172;
    private static final int _LumaDMSabreL2A = 11521177;
    private static final int _LumaDMSabreL2B = 11521182;
    private static final int _LumaDMSabreL3 = 11521189;
    private static final int _LumaDMSabreL3A = 11521194;
    private static final int _LumaDMSabreL3B = 11521199;
    private static final int _LumaDMSabreL4 = 11521206;
    private static final int _LumaDMSabreL4A = 11521211;
    private static final int _LumaDMSabreL4B = 11521216;
    private static final int _LumaDMSabreL5 = 11521223;
    private static final int _LumaDMSabreL5A = 11521228;
    private static final int _LumaDNewA = 47154160;
    private static final int _LumaDNewB = 47154164;
    private static final int _LumaDenoise = 33516660;
    private static final int _LumaNew = 47154272;
    private static final int _LumaNoise = 47149120;
    private static final int _LumaNoise1 = 33279860;
    private static final int _LumaSmooth = 33299496;
    private static final int _LutNoiseFix = 46788292;
    private static final int _MaxRelativeTetFactor = 43458424;
    private static final int _NContrast1 = 33520400;
    private static final int _NROpacity = 33285276;
    private static final int _NRopacity2 = 33285220;
    private static final int _NightModeExposition = 43490624;
    private static final int _NightModeGain = 43468104;
    private static final int _NoiseModelShot = 47143108;
    private static final int _NoiseModelUnblock = 32306844;
    private static final int _NoiseReductA0 = 17949428;
    private static final int _NoiseReductA1 = 17949424;
    private static final int _NoiseReductA2 = 17949452;
    private static final int _NoiseReductSabre = 42021408;
    private static final int _NoiseReductSabre1 = 42021400;
    private static final int _Noisemodel = 33412664;
    private static final int _ORGB = 3586332;
    private static final int _RaisrZFTuning1 = 3588720;
    private static final int _RaisrZFTuning2 = 3588724;
    private static final int _RawCompress = 18788068;
    private static final int _RecomputeWBOnBaseFrame = 18787880;
    private static final int _Red = 3560924;
    private static final int _ResamplMethod = 32364828;
    private static final int _Robustness = 3276325;
    private static final int _SABRE1 = 42000752;
    private static final int _SABRE2 = 42000876;
    private static final int _SABRE3 = 42000880;
    private static final int _SabrBurMerge1 = 42020184;
    private static final int _SabrBurMerge2 = 42020192;
    private static final int _SabrBurMerge3 = 42020212;
    private static final int _SabreBM1 = 42022488;
    private static final int _SabreBM2 = 42022496;
    private static final int _SabreBM3 = 42022500;
    private static final int _SabreByRAWToYUV = 47141320;
    private static final int _SabreContrast = 43060188;
    private static final int _SabreContrastSharp = 43060172;
    private static final int _SabreLNewL1 = 11507060;
    private static final int _SabreLNewL2 = 11507072;
    private static final int _SabreLNewL3 = 11507084;
    private static final int _SabreLNewL4 = 11507096;
    private static final int _SabreLNewL5 = 11507108;
    private static final int _SabreLNewNL1 = 11507168;
    private static final int _SabreLNewNL2 = 11507180;
    private static final int _SabreLNewNL3 = 11507192;
    private static final int _SabreLNewNL4 = 11507204;
    private static final int _SabreLNewNL5 = 11507216;
    private static final int _SabreLNewNL6 = 11507228;
    private static final int _SabreLNewNL7 = 11507240;
    private static final int _SabreLNewNL8 = 11507252;
    private static final int _SabreLNewNL9 = 11507264;
    private static final int _SabreNoise = 43065520;
    private static final int _SabreNoiseArt = 42022472;
    private static final int _SabreNoiseEstimals = 42017652;
    private static final int _SabreSharp = 11507144;
    private static final int _SabreSharp2 = 32367972;
    private static final int _SabreSharp3 = 41993320;
    private static final int _Sat4 = 45622300;
    private static final int _Saturation = 33278592;
    private static final int _Saturation2 = 43497968;
    private static final int _Saturation3 = 33288308;
    private static final int _SavMergChrDen = 42045988;
    private static final int _SensorID = 32473244;
    private static final int _ShadowCompensation = 33282728;
    private static final int _ShadowTuning = 33424272;
    private static final int _SharpDRad1 = 33308096;
    private static final int _SharpDRad2 = 33308120;
    private static final int _SharpGain = 33276564;
    private static final int _SharpGainMacro = 33276860;
    private static final int _SharpGainMicro = 33276712;
    private static final int _SharpMacro = 11507156;
    private static final int _SharpMini = 11507132;
    private static final int _SharpShastaMotion = 43637620;
    private static final int _SharpenHighL1 = 11537715;
    private static final int _SharpenHighL2 = 11537727;
    private static final int _SharpenHighL3 = 11537739;
    private static final int _SharpenHighWL1 = 11537955;
    private static final int _SharpenHighWL2 = 11537967;
    private static final int _SharpenHighWL3 = 11537979;
    private static final int _SharpenLowL1 = 11537619;
    private static final int _SharpenLowL2 = 11537631;
    private static final int _SharpenLowL3 = 11537643;
    private static final int _SharpenLowWL1 = 11537859;
    private static final int _SharpenLowWL2 = 11537871;
    private static final int _SharpenLowWL3 = 11537883;
    private static final int _SharpenMediumL1 = 11537411;
    private static final int _SharpenMediumL2 = 11537423;
    private static final int _SharpenMediumL3 = 11537435;
    private static final int _SharpenMediumWL1 = 11537907;
    private static final int _SharpenMediumWL2 = 11537919;
    private static final int _SharpenMediumWL3 = 11537931;
    private static final int _SharpenVeryLowL1 = 11537571;
    private static final int _SharpenVeryLowL2 = 11537583;
    private static final int _SharpenVeryLowL3 = 11537595;
    private static final int _SharpenVeryLowWL1 = 11537811;
    private static final int _SharpenVeryLowWL2 = 11537823;
    private static final int _SharpenVeryLowWL3 = 11537835;
    private static final int _SharpeningEdge = 33287312;
    private static final int _SharpnessA = 33276408;
    private static final int _SharpnessB = 33276412;
    private static final int _SharpnessNoiseModel = 42189368;
    private static final int _ShastaFactor = 18789084;
    private static final int _ShastaForce = 18789064;
    private static final int _ShotNoiseFactor = 47142720;
    private static final int _ShotParams_1allow_1base_1frame_1reuse_1set = 18788700;
    private static final int _ShotParams_1allow_1temporal_1binning_1set = 18788652;
    private static final int _ShotParams_1device_1is_1on_1tripod_1set = 18788832;
    private static final int _ShotParams_1downsample_1by_12_1before_1merge_1set = 18789140;
    private static final int _SkipMetadataCheck = 32302932;
    private static final int _SkyBrightnessNight = 34706952;
    private static final int _Smoothing1 = 41939464;
    private static final int _Smoothing2 = 41939612;
    private static final int _SmoothingNew = 11507136;
    private static final int _SmoothingSabre = 11507120;
    private static final int _Smoothness = 19226580;
    private static final int _SoftContrast = 43529772;
    private static final int _SoftSharpA = 33287492;
    private static final int _SoftSharpB = 33287496;
    private static final int _SoftSharpC = 33287560;
    private static final int _SpatialA = 33278132;
    private static final int _SpatialB = 33278136;
    private static final int _SpatialDenMi1 = 11527764;
    private static final int _SpatialDenMi2 = 11527768;
    private static final int _SpatialDenMi3 = 11527772;
    private static final int _SpatialDenMi4 = 11527776;
    private static final int _StartGamma = 11536120;
    private static final int _StartSect = 11535928;
    private static final int _StartTone = 11535984;
    private static final int _TemporalA = 33277976;
    private static final int _TemporalB = 33277980;
    private static final int _TemporalBinning = 43389456;
    private static final int _TemporalDen = 18814344;
    private static final int _TemporalRadius = 42211236;
    private static final int _TunColSatPar1 = 3563912;
    private static final int _TunColSatPar2 = 3563916;
    private static final int _TunSupressHotPixel = 43468164;
    private static final int _Vignette = 43462568;
    private static final int _VignetteC = 46802400;
    private static final int _VolumeProcessing1 = 34539108;
    private static final int _VolumeProcessing2 = 34539112;
    private static final int _WaveletLumaDenoiseSabreLevels = 11520963;
    private static final int _WhiteLevel = 33507312;
    private static final int _YBP = 3617128;
    private static final int _ZSLBurstCountFix1 = 32404472;
    private static final int _ZSLBurstCountFix2 = 32403372;
    private static final int _ZSLBurstCountFix3 = 32420488;
    private static final int _Zipper1 = 3557400;
    private static final int _Zipper2 = 3557480;
    private static final int _Zipper3 = 3557484;
    public static String gammaPresetName;
    public static int sCamNum;
    public static String tonePresetName;
    private String libName = "libpatched_jni.so";
    private boolean showToast = false;
    private final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    private static boolean applyPatcher(String str) {
        LibPatcher libPatcher = new LibPatcher();
        if (!libPatcher.moveLibToDir(str).equals("OK")) {
            return false;
        }
        copySignature(libPatcher);
        boolean zCopyLib = copyLib(libPatcher);
        if (Pref.MenuValue("pref_save_patchedlib_key") != 0) {
            libPatcher.moveLibToDir2(str);
        }
        return zCopyLib;
    }

    private static boolean applyPatcherDisabled(String str) {
        if (GetMenuValues.getIntValue(LensValue.SetLensValue1("pref_libs")) >= 0) {
            return false;
        }
        LibPatcher libPatcher = new LibPatcher();
        if (!libPatcher.moveLibToDir(str).equals("OK")) {
            return false;
        }
        copySignature(libPatcher);
        boolean zCopyLibDisabled = copyLibDisabled(libPatcher);
        if (Pref.MenuValue("pref_save_patchedlib_key") != 0) {
            libPatcher.moveLibToDir2(str);
        }
        return zCopyLibDisabled;
    }

    private String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = this.HEX_ARRAY[i2 >>> 4];
            cArr[i3 + 1] = this.HEX_ARRAY[i2 & 15];
        }
        return new String(cArr);
    }

    private static boolean copyLib(LibPatcher libPatcher) {
        if (GetMenuValues.getIntValue(LensValue.SetLensValue("lib_curve_key")) != 0) {
            libPatcher.setToneCurve();
        }
        if (GetMenuValues.getIntValue(LensValue.SetLensValue("lib_gamma_key")) != 0) {
            libPatcher.setGammaCurve();
        }
        libPatcher.setValueHex(_SabreNoise, LensValue.SetLensValue("lib_sabrenoise_key"));
        libPatcher.setValueHex(_HardUX, LensValue.SetLensValue("lib_hardux_key"));
        libPatcher.setValueHex(_Contr, LensValue.SetLensValue("lib_contr_key"));
        libPatcher.setValueHex(_SkyBrightnessNight, LensValue.SetLensValue("lib_nightsky_key"));
        libPatcher.setValueHex(_Sat4, LensValue.SetLensValue("lib_sat4_key"));
        libPatcher.setValueHex(_HightlightCompensation2, LensValue.SetLensValue("lib_hightlight2_key"));
        libPatcher.setValueHex(_TunSupressHotPixel, LensValue.SetLensValue("lib_tunsupresshotpixel_key"));
        libPatcher.setValueHex(_ShotParams_1device_1is_1on_1tripod_1set, LensValue.SetLensValue("lib_tripod_key"));
        libPatcher.setValueHex(_ShotParams_1downsample_1by_12_1before_1merge_1set, LensValue.SetLensValue("lib_downsamplebybeforemerge_key"));
        libPatcher.setValueHex(_ShotParams_1allow_1temporal_1binning_1set, LensValue.SetLensValue("lib_allowtemporalbinning_key"));
        libPatcher.setValueHex(_ShotParams_1allow_1base_1frame_1reuse_1set, LensValue.SetLensValue("lib_allowbaseframereuse_key"));
        libPatcher.setValueHex(_InitParams_1simultaneous_1merge_1and_1finish_1set, LensValue.SetLensValue("lib_simultaneousmerge_key"));
        libPatcher.setValueHex(_NoiseReductSabre1, LensValue.SetLensValue("lib_noisereductsabre1_key"));
        libPatcher.setValueHex(_SabreNoiseEstimals, LensValue.SetLensValue("lib_sabrenoiseestimals_key"));
        libPatcher.setValueHex(_HDRRatio3, LensValue.SetLensValue("lib_hdrratio3_key"));
        libPatcher.setValueHex(_Contrast4, LensValue.SetLensValue("lib_contrast4_key"));
        libPatcher.setValueHex(_Contrast5, LensValue.SetLensValue("lib_contrast5_key"));
        libPatcher.setValueHex(_RecomputeWBOnBaseFrame, LensValue.SetLensValue("lib_wbbaseframe_key"));
        libPatcher.setValueHex(_LumaDenoise, LensValue.SetLensValue("lib_lumadenoise_key"));
        libPatcher.setValueHex(_BrightN, LensValue.SetLensValue("lib_brightn_key"));
        libPatcher.setValueHex(_Darker, LensValue.SetLensValue("lib_darker_key"));
        libPatcher.setValueHex(_LumaSmooth, LensValue.SetLensValue("lib_lumasmooth_key"));
        libPatcher.setValueHex(_NROpacity, LensValue.SetLensValue("lib_noisereductopacity_key"));
        libPatcher.setValueHex(_DenSmoothing1, LensValue.SetLensValue("lib_lumasmoothing_key"));
        libPatcher.setValueHex(_DenSmoothing2, LensValue.SetLensValue("lib_denoisesmoothing_key"));
        libPatcher.setValueHex(_DehazeBlack, LensValue.SetLensValue("lib_dehazedblack_key"));
        libPatcher.setValueHex(_NContrast1, LensValue.SetLensValue("lib_ncontrast1_key"));
        libPatcher.setValueHex(_LumaNoise1, LensValue.SetLensValue("lib_lumanoise1_key"));
        libPatcher.setValueHex(_LumaNew, LensValue.SetLensValue("lib_lumanew_key"));
        libPatcher.setValueHex(_HDRRaw2, LensValue.SetLensValue("lib_hdrraw2_key"));
        libPatcher.setValueHex(_HDRSabreCalcVal1, LensValue.SetLensValue("lib_hdrsabrecalcval1_key"));
        libPatcher.setValueHex(_HDRSabreCalcVal2, LensValue.SetLensValue("lib_hdrsabrecalcval2_key"));
        libPatcher.setValueHex(_Robustness, LensValue.SetLensValue("lib_robustness_key"));
        libPatcher.setValueHex(_NoiseModelUnblock, LensValue.SetLensValue("lib_noisemodelunblock_key"));
        libPatcher.setValueHex(_RawCompress, LensValue.SetLensValue("lib_raw_compress_key"));
        libPatcher.setValueHex(_NightModeGain, LensValue.SetLensValue("lib_night_mode_gain_key"));
        libPatcher.setValueHex(_HDRModel, LensValue.SetLensValue("lib_hdrmodel_key"));
        libPatcher.setValueHex(_BlurPreview, LensValue.SetLensValue("lib_blurpreview_key"));
        libPatcher.setValueHex(_FixRaw16Merge, LensValue.SetLensValue("lib_fixraw16merge_key"));
        libPatcher.setValueHex(_HardJPGQuality, LensValue.SetLensValue("lib_hardjpgquality_key"));
        libPatcher.setValueHex(_LutNoiseFix, LensValue.SetLensValue("lib_lutnoisefix_key"));
        libPatcher.setValueHex(_LightFix, LensValue.SetLensValue("lib_lightfix_key"));
        libPatcher.setValueHex(_LightFix2, LensValue.SetLensValue("lib_lightfix2_key"));
        libPatcher.setValueHex(_LightFix3, LensValue.SetLensValue("lib_lightfix3_key"));
        libPatcher.setValueHex(_SkipMetadataCheck, LensValue.SetLensValue("lib_skipmetadatacheck_key"));
        libPatcher.setValueHex(_ShastaForce, LensValue.SetLensValue("lib_shastaforce_key"));
        libPatcher.setValueHex(_ShastaFactor, LensValue.SetLensValue("lib_shastafactor_key"));
        libPatcher.setValueHex(_ResamplMethod, LensValue.SetLensValue("lib_resamplmethod_key"));
        libPatcher.setValueHex(_AppDiGainSet, LensValue.SetLensValue("lib_appdigainset_key"));
        libPatcher.setValueHex(_SharpnessA, LensValue.SetLensValue("lib_sharpnessa_key"));
        libPatcher.setValueHex(_DiscardFramesWithTetMismatch, LensValue.SetLensValue("lib_withtetmismatch_key"));
        libPatcher.setValueHex(_MaxRelativeTetFactor, LensValue.SetLensValue("lib_maxrelativetetfactor_key"));
        libPatcher.setValueHex(_SharpGain, LensValue.SetLensValue("lib_sharpgain_key"));
        libPatcher.setValueHex(_SharpGainMacro, LensValue.SetLensValue("lib_sharpgainmacro_key"));
        libPatcher.setValueHex(_SharpGainMicro, LensValue.SetLensValue("lib_sharpgainmicro_key"));
        libPatcher.setValueHex(_SharpnessB, LensValue.SetLensValue("lib_sharpnessb_key"));
        libPatcher.setValueHex(_Denoise, LensValue.SetLensValue("lib_denoise_key"));
        libPatcher.setValueHex(_SpatialA, LensValue.SetLensValue("lib_spatiala_key"));
        libPatcher.setValueHex(_SpatialB, LensValue.SetLensValue("lib_spatialb_key"));
        libPatcher.setValueHex(_ChromaA, LensValue.SetLensValue("lib_chromaa_key"));
        libPatcher.setValueHex(_ChromaB, LensValue.SetLensValue("lib_chromab_key"));
        libPatcher.setValueHex(_LumaA, LensValue.SetLensValue("lib_lumaa_key"));
        libPatcher.setValueHex(_LumaB, LensValue.SetLensValue("lib_lumab_key"));
        libPatcher.setValueHex(_TemporalA, LensValue.SetLensValue("lib_temporala_key"));
        libPatcher.setValueHex(_TemporalB, LensValue.SetLensValue("lib_temporalb_key"));
        libPatcher.setValueHex(_LumaNoise, LensValue.SetLensValue("lib_lumanoise_key"));
        libPatcher.setValueHex(_Saturation, LensValue.SetLensValue("lib_saturation_key"));
        libPatcher.setValueHex(_Saturation2, LensValue.SetLensValue("lib_saturation2_key"));
        libPatcher.setValueHex(_Saturation3, LensValue.SetLensValue("lib_saturation3_key"));
        libPatcher.setValueHex(_ISO, LensValue.SetLensValue("pref_lib_iso_option_available_key"));
        libPatcher.setValueHex(_SharpShastaMotion, LensValue.SetLensValue("lib_sharpshastamotion_key"));
        libPatcher.setValueHex(_Depth1, LensValue.SetLensValue("lib_depth1_key"));
        libPatcher.setValueHex(_Depth2, LensValue.SetLensValue("lib_depth2_key"));
        libPatcher.setValueHex(_SharpMini, LensValue.SetLensValue("lib_sharpmini_key"));
        libPatcher.setValueHex(_SharpMacro, LensValue.SetLensValue("lib_sharpmacro_key"));
        libPatcher.setValueHex(_SharpeningEdge, LensValue.SetLensValue("lib_sharpeningedge_key"));
        libPatcher.setValueHex(_SoftSharpA, LensValue.SetLensValue("lib_softsharpa_key"));
        libPatcher.setValueHex(_SoftSharpB, LensValue.SetLensValue("lib_softsharpb_key"));
        libPatcher.setValueHex(_SoftSharpC, LensValue.SetLensValue("lib_softsharpc_key"));
        libPatcher.setValueHex(_SharpnessNoiseModel, LensValue.SetLensValue("lib_sharpnessnoisemodel_key"));
        libPatcher.setValueHex(_RaisrZFTuning1, LensValue.SetLensValue("lib_raisrzftuning1_key"));
        libPatcher.setValueHex(_RaisrZFTuning2, LensValue.SetLensValue("lib_raisrzftuning2_key"));
        libPatcher.setValueHex(_Zipper1, LensValue.SetLensValue("lib_zipper1_key"));
        libPatcher.setValueHex(_Zipper2, LensValue.SetLensValue("lib_zipper2_key"));
        libPatcher.setValueHex(_Zipper3, LensValue.SetLensValue("lib_zipper3_key"));
        libPatcher.setValueHex(_SabreSharp, LensValue.SetLensValue("lib_sabresharp_key"));
        libPatcher.setValueHex(_SabreSharp, LensValue.SetLensValue("lib_sabresharp_key"));
        libPatcher.setValueHex(_SabreSharp2, LensValue.SetLensValue("lib_sabresharp2_key"));
        libPatcher.setValueHex(_SabreSharp3, LensValue.SetLensValue("lib_sabresharp3_key"));
        libPatcher.setValueHex(_SabreContrastSharp, LensValue.SetLensValue("lib_sabrecontrastsharp_key"));
        libPatcher.setValueHex(_Exposition, LensValue.SetLensValue("lib_exposition_key"));
        libPatcher.setValueHex(_Exposure, LensValue.SetLensValue("lib_exposure_key"));
        libPatcher.setValueHex(_Darkenlight, LensValue.SetLensValue("lib_darkenlight_key"));
        libPatcher.setValueHex(_ExpoComp, LensValue.SetLensValue("lib_expocomp_key"));
        libPatcher.setValueHex(_ExpoCor, LensValue.SetLensValue("lib_expocor_key"));
        libPatcher.setValueHex(_IsoExpoTun, LensValue.SetLensValue("lib_isoexpotun_key"));
        libPatcher.setValueHex(_ExposureDarker, LensValue.SetLensValue("lib_exposure_darker_key"));
        libPatcher.setValueHex(_ExposureDarker2, LensValue.SetLensValue("lib_exposure_darker2_key"));
        libPatcher.setValueHex(_HardMerge, LensValue.SetLensValue("lib_hardmerge_key"));
        libPatcher.setValueHex(_SABRE1, LensValue.SetLensValue("lib_sabre1_key"));
        libPatcher.setValueHex(_SABRE2, LensValue.SetLensValue("lib_sabre2_key"));
        libPatcher.setValueHex(_SABRE3, LensValue.SetLensValue("lib_sabre3_key"));
        libPatcher.setValueHex(_CoefSabrTuNoise, LensValue.SetLensValue("lib_coefsabrtunoise_key"));
        libPatcher.setValueHex(_SabrBurMerge1, LensValue.SetLensValue("lib_sabrburmerge1_key"));
        libPatcher.setValueHex(_SabrBurMerge2, LensValue.SetLensValue("lib_sabrburmerge2_key"));
        libPatcher.setValueHex(_SabrBurMerge3, LensValue.SetLensValue("lib_sabrburmerge3_key"));
        libPatcher.setValueHex(_SmoothingSabre, LensValue.SetLensValue("lib_smoothingsabre_key"));
        libPatcher.setValueHex(_NoiseReductSabre, LensValue.SetLensValue("lib_noisereductsabre_key"));
        libPatcher.setValueHex(_SabreNoiseArt, LensValue.SetLensValue("lib_sabrenoiseart_key"));
        libPatcher.setValueHex(_BetterColWiener, LensValue.SetLensValue("lib_bettercolwiener_key"));
        libPatcher.setValueHex(_SavMergChrDen, LensValue.SetLensValue("lib_savmergchrden_key"));
        libPatcher.setValueHex(_FixNoiseSabre, LensValue.SetLensValue("lib_fixnoisesabre_key"));
        libPatcher.setValueHex(_ColProcessing, LensValue.SetLensValue("lib_colprocessing_key"));
        libPatcher.setValueHex(_FixShastaMerge, LensValue.SetLensValue("lib_fixshastamerge_key"));
        libPatcher.setValueHex(_VolumeProcessing1, LensValue.SetLensValue("lib_volumeprocessing1_key"));
        libPatcher.setValueHex(_VolumeProcessing2, LensValue.SetLensValue("lib_volumeprocessing2_key"));
        libPatcher.setValueHex(_Hotpixelsuppres, LensValue.SetLensValue("lib_hotpixelsuppres_key"));
        libPatcher.setValueHex(_SensorID, LensValue.SetLensValue("lib_sensorid_key"));
        libPatcher.setValueHex(_Smoothness, LensValue.SetLensValue("lib_smoothness_key"));
        libPatcher.setValueHex(_SabreByRAWToYUV, LensValue.SetLensValue("lib_sabrebyrawtoyuv_key"));
        libPatcher.setValueHex(_Smoothing1, LensValue.SetLensValue("lib_smoothing1_key"));
        libPatcher.setValueHex(_Smoothing2, LensValue.SetLensValue("lib_smoothing2_key"));
        libPatcher.setValueHex(_SmoothingNew, LensValue.SetLensValue("lib_smoothingnew_key"));
        libPatcher.setValueHex(_Brightnessintensity, LensValue.SetLensValue("lib_brightnessintensity_key"));
        libPatcher.setValueHex(_HDRBrightness, LensValue.SetLensValue("lib_hdrbrightness_key"));
        libPatcher.setValueHex(_HDR2, LensValue.SetLensValue("lib_hdr2_key"));
        libPatcher.setValueHex(_Hightlight2, LensValue.SetLensValue("lib_highlight2_key"));
        libPatcher.setValueHex(_HDRRatio2, LensValue.SetLensValue("lib_hdrratio2_key"));
        libPatcher.setValueHex(_AVGLDR, LensValue.SetLensValue("lib_avgldr_key"));
        libPatcher.setValueHex(_CContrast, LensValue.SetLensValue("lib_ccontrast_key"));
        libPatcher.setValueHex(_CContrast2, LensValue.SetLensValue("lib_ccontrast2_key"));
        libPatcher.setValueHex(_Dehazedregulator2, LensValue.SetLensValue("lib_dehazedregulator2_key"));
        libPatcher.setValueHex(_TemporalBinning, LensValue.SetLensValue("lib_temporalbin_key"));
        libPatcher.setValueHex(_TemporalRadius, LensValue.SetLensValue("lib_temporal_radius_key"));
        libPatcher.setValueHex(_ShotNoiseFactor, LensValue.SetLensValue("lib_shotnoisefactor_key"));
        libPatcher.setValueHex(_TunColSatPar1, LensValue.SetLensValue("lib_tuncolsatpar1_key"));
        libPatcher.setValueHex(_TunColSatPar2, LensValue.SetLensValue("lib_tuncolsatpar2_key"));
        libPatcher.setValueHex(_CG1, LensValue.SetLensValue("lib_cg1_key"));
        libPatcher.setValueHex(_CG2, LensValue.SetLensValue("lib_cg2_key"));
        libPatcher.setValueHex(_CG3, LensValue.SetLensValue("lib_cg3_key"));
        libPatcher.setValueHex(_CG4, LensValue.SetLensValue("lib_cg4_key"));
        libPatcher.setValueHex(_CG5, LensValue.SetLensValue("lib_cg5_key"));
        libPatcher.setValueHex(_CG6, LensValue.SetLensValue("lib_cg6_key"));
        libPatcher.setValueHex(_CG9, LensValue.SetLensValue("lib_cg9_key"));
        libPatcher.setValueHex(_CG10, LensValue.SetLensValue("lib_cg10_key"));
        libPatcher.setValueHex(_Green, LensValue.SetLensValue("lib_green_key"));
        libPatcher.setValueHex(_Red, LensValue.SetLensValue("lib_red_key"));
        libPatcher.setValueHex(_BY, LensValue.SetLensValue("lib_by_key"));
        libPatcher.setValueHex(_YBP, LensValue.SetLensValue("lib_ybp_key"));
        libPatcher.setValueHex(_GRO, LensValue.SetLensValue("lib_gro_key"));
        libPatcher.setValueHex(_ORGB, LensValue.SetLensValue("lib_orgb_key"));
        libPatcher.setValueHex(_Vignette, LensValue.SetLensValue("lib_vignette_key"));
        libPatcher.setValueHex(_VignetteC, LensValue.SetLensValue("lib_vignettec_key"));
        libPatcher.setValueHex(_DehazedExpo, LensValue.SetLensValue("lib_dehazedexpo_key"));
        libPatcher.setValueHex(_Clarity, LensValue.SetLensValue("lib_clarity_key"));
        libPatcher.setValueHex(_ContrastL1, LensValue.SetLensValue("lib_contrast_1_key"));
        libPatcher.setValueHex(_ContrastL2, LensValue.SetLensValue("lib_contrast_2_key"));
        libPatcher.setValueHex(_Lighting, LensValue.SetLensValue("lib_lighting_key"));
        libPatcher.setValueHex(_HDRRangePlus, LensValue.SetLensValue("lib_hdrrangeplus_key"));
        libPatcher.setValueHex(_HDRRangeMinus, LensValue.SetLensValue("lib_hdrrangeminus_key"));
        libPatcher.setValueHex(_NightModeExposition, LensValue.SetLensValue("lib_nightmodeexposition_key"));
        libPatcher.setValueHex(_Light, LensValue.SetLensValue("lib_light_key"));
        libPatcher.setValueHex(_WhiteLevel, LensValue.SetLensValue("lib_whitelevel_key"));
        libPatcher.setValueHex(_HDROverLight, LensValue.SetLensValue("lib_hdroverlight_key"));
        libPatcher.setValueHex(_HDREffectInt, LensValue.SetLensValue("lib_hdreffectint_key"));
        libPatcher.setValueHex(_HDREffect, LensValue.SetLensValue("lib_hdreffect_key"));
        libPatcher.setValueHex(_SabreContrast, LensValue.SetLensValue("lib_sabrecontrast_key"));
        libPatcher.setValueHex(_ContrastBlack, LensValue.SetLensValue("lib_contrastblack_key"));
        libPatcher.setValueHex(_ShadowTuning, LensValue.SetLensValue("lib_shadowtuning_key"));
        libPatcher.setValueHex(_LumaDHSabreL1, LensValue.SetLensValue("lib_lumadhsabre_l1_key"));
        libPatcher.setValueHex(_LumaDHSabreL2, LensValue.SetLensValue("lib_lumadhsabre_l2_key"));
        libPatcher.setValueHex(_LumaDHSabreL3, LensValue.SetLensValue("lib_lumadhsabre_l3_key"));
        libPatcher.setValueHex(_LumaDHSabreL4, LensValue.SetLensValue("lib_lumadhsabre_l4_key"));
        libPatcher.setValueHex(_LumaDHSabreL5, LensValue.SetLensValue("lib_lumadhsabre_l5_key"));
        libPatcher.setValueHex(_LumaDLSabreL1, LensValue.SetLensValue("lib_lumadlsabre_l1_key"));
        libPatcher.setValueHex(_LumaDLSabreL2, LensValue.SetLensValue("lib_lumadlsabre_l2_key"));
        libPatcher.setValueHex(_LumaDLSabreL3, LensValue.SetLensValue("lib_lumadlsabre_l3_key"));
        libPatcher.setValueHex(_LumaDLSabreL4, LensValue.SetLensValue("lib_lumadlsabre_l4_key"));
        libPatcher.setValueHex(_LumaDLSabreL5, LensValue.SetLensValue("lib_lumadlsabre_l5_key"));
        libPatcher.setValueHex(_LumaDMSabreL1, LensValue.SetLensValue("lib_lumadmsabre_l1_key"));
        libPatcher.setValueHex(_LumaDMSabreL2, LensValue.SetLensValue("lib_lumadmsabre_l2_key"));
        libPatcher.setValueHex(_LumaDMSabreL3, LensValue.SetLensValue("lib_lumadmsabre_l3_key"));
        libPatcher.setValueHex(_LumaDMSabreL4, LensValue.SetLensValue("lib_lumadmsabre_l4_key"));
        libPatcher.setValueHex(_LumaDMSabreL5, LensValue.SetLensValue("lib_lumadmsabre_l5_key"));
        libPatcher.setValueHex(_SpatialDenMi1, LensValue.SetLensValue("lib_spatialdenmi1_key"));
        libPatcher.setValueHex(_SpatialDenMi2, LensValue.SetLensValue("lib_spatialdenmi2_key"));
        libPatcher.setValueHex(_SpatialDenMi3, LensValue.SetLensValue("lib_spatialdenmi3_key"));
        libPatcher.setValueHex(_SpatialDenMi4, LensValue.SetLensValue("lib_spatialdenmi4_key"));
        libPatcher.setValueHex(_LumaDHSabreL1A, LensValue.SetLensValue("lib_lumadhsabre_l1a_key"));
        libPatcher.setValueHex(_LumaDHSabreL1B, LensValue.SetLensValue("lib_lumadhsabre_l1b_key"));
        libPatcher.setValueHex(_LumaDHSabreL2A, LensValue.SetLensValue("lib_lumadhsabre_l2a_key"));
        libPatcher.setValueHex(_LumaDHSabreL2B, LensValue.SetLensValue("lib_lumadhsabre_l2b_key"));
        libPatcher.setValueHex(_LumaDHSabreL3A, LensValue.SetLensValue("lib_lumadhsabre_l3a_key"));
        libPatcher.setValueHex(_LumaDHSabreL3B, LensValue.SetLensValue("lib_lumadhsabre_l3b_key"));
        libPatcher.setValueHex(_LumaDHSabreL4A, LensValue.SetLensValue("lib_lumadhsabre_l4a_key"));
        libPatcher.setValueHex(_LumaDHSabreL4B, LensValue.SetLensValue("lib_lumadhsabre_l4b_key"));
        libPatcher.setValueHex(_LumaDHSabreL5A, LensValue.SetLensValue("lib_lumadhsabre_l5a_key"));
        libPatcher.setValueHex(_LumaDLSabreL1A, LensValue.SetLensValue("lib_lumadlsabre_l1a_key"));
        libPatcher.setValueHex(_LumaDLSabreL1B, LensValue.SetLensValue("lib_lumadlsabre_l1b_key"));
        libPatcher.setValueHex(_LumaDLSabreL2A, LensValue.SetLensValue("lib_lumadlsabre_l2a_key"));
        libPatcher.setValueHex(_LumaDLSabreL2B, LensValue.SetLensValue("lib_lumadlsabre_l2b_key"));
        libPatcher.setValueHex(_LumaDLSabreL3A, LensValue.SetLensValue("lib_lumadlsabre_l3a_key"));
        libPatcher.setValueHex(_LumaDLSabreL3B, LensValue.SetLensValue("lib_lumadlsabre_l3b_key"));
        libPatcher.setValueHex(_LumaDLSabreL4A, LensValue.SetLensValue("lib_lumadlsabre_l4a_key"));
        libPatcher.setValueHex(_LumaDLSabreL4B, LensValue.SetLensValue("lib_lumadlsabre_l4b_key"));
        libPatcher.setValueHex(_LumaDLSabreL5A, LensValue.SetLensValue("lib_lumadlsabre_l5a_key"));
        libPatcher.setValueHex(_LumaDMSabreL1A, LensValue.SetLensValue("lib_lumadmsabre_l1a_key"));
        libPatcher.setValueHex(_LumaDMSabreL1B, LensValue.SetLensValue("lib_lumadmsabre_l1b_key"));
        libPatcher.setValueHex(_LumaDMSabreL2A, LensValue.SetLensValue("lib_lumadmsabre_l2a_key"));
        libPatcher.setValueHex(_LumaDMSabreL2B, LensValue.SetLensValue("lib_lumadmsabre_l2b_key"));
        libPatcher.setValueHex(_LumaDMSabreL3A, LensValue.SetLensValue("lib_lumadmsabre_l3a_key"));
        libPatcher.setValueHex(_LumaDMSabreL3B, LensValue.SetLensValue("lib_lumadmsabre_l3b_key"));
        libPatcher.setValueHex(_LumaDMSabreL4A, LensValue.SetLensValue("lib_lumadmsabre_l4a_key"));
        libPatcher.setValueHex(_LumaDMSabreL4B, LensValue.SetLensValue("lib_lumadmsabre_l4b_key"));
        libPatcher.setValueHex(_LumaDMSabreL5A, LensValue.SetLensValue("lib_lumadmsabre_l5a_key"));
        libPatcher.setValueHex(_LumaDNewA, LensValue.SetLensValue("lib_lumadnewa_key"));
        libPatcher.setValueHex(_LumaDNewB, LensValue.SetLensValue("lib_lumadnewb_key"));
        libPatcher.setValueHex(_LumaDHL1, LensValue.SetLensValue("lib_lumadh_l1_key"));
        libPatcher.setValueHex(_LumaDHL2, LensValue.SetLensValue("lib_lumadh_l2_key"));
        libPatcher.setValueHex(_LumaDHL3, LensValue.SetLensValue("lib_lumadh_l3_key"));
        libPatcher.setValueHex(_LumaDHL4, LensValue.SetLensValue("lib_lumadh_l4_key"));
        libPatcher.setValueHex(_LumaDHL5, LensValue.SetLensValue("lib_lumadh_l5_key"));
        libPatcher.setValueHex(_LumaDLL1, LensValue.SetLensValue("lib_lumadl_l1_key"));
        libPatcher.setValueHex(_LumaDLL2, LensValue.SetLensValue("lib_lumadl_l2_key"));
        libPatcher.setValueHex(_LumaDLL3, LensValue.SetLensValue("lib_lumadl_l3_key"));
        libPatcher.setValueHex(_LumaDLL4, LensValue.SetLensValue("lib_lumadl_l4_key"));
        libPatcher.setValueHex(_LumaDLL5, LensValue.SetLensValue("lib_lumadl_l5_key"));
        libPatcher.setValueHex(_LumaDML1, LensValue.SetLensValue("lib_lumadm_l1_key"));
        libPatcher.setValueHex(_LumaDML2, LensValue.SetLensValue("lib_lumadm_l2_key"));
        libPatcher.setValueHex(_LumaDML3, LensValue.SetLensValue("lib_lumadm_l3_key"));
        libPatcher.setValueHex(_LumaDML4, LensValue.SetLensValue("lib_lumadm_l4_key"));
        libPatcher.setValueHex(_LumaDML5, LensValue.SetLensValue("lib_lumadm_l5_key"));
        libPatcher.setValueHex(_LumaDHSL1, LensValue.SetLensValue("lib_lumadhs_l1_key"));
        libPatcher.setValueHex(_LumaDHSL2, LensValue.SetLensValue("lib_lumadhs_l2_key"));
        libPatcher.setValueHex(_LumaDHSL3, LensValue.SetLensValue("lib_lumadhs_l3_key"));
        libPatcher.setValueHex(_LumaDHSL4, LensValue.SetLensValue("lib_lumadhs_l4_key"));
        libPatcher.setValueHex(_LumaDHSL5, LensValue.SetLensValue("lib_lumadhs_l5_key"));
        libPatcher.setValueHex(_LumaDLSL1, LensValue.SetLensValue("lib_lumadls_l1_key"));
        libPatcher.setValueHex(_LumaDLSL2, LensValue.SetLensValue("lib_lumadls_l2_key"));
        libPatcher.setValueHex(_LumaDLSL3, LensValue.SetLensValue("lib_lumadls_l3_key"));
        libPatcher.setValueHex(_LumaDLSL4, LensValue.SetLensValue("lib_lumadls_l4_key"));
        libPatcher.setValueHex(_LumaDLSL5, LensValue.SetLensValue("lib_lumadls_l5_key"));
        libPatcher.setValueHex(_LumaDMSL1, LensValue.SetLensValue("lib_lumadms_l1_key"));
        libPatcher.setValueHex(_LumaDMSL2, LensValue.SetLensValue("lib_lumadms_l2_key"));
        libPatcher.setValueHex(_LumaDMSL3, LensValue.SetLensValue("lib_lumadms_l3_key"));
        libPatcher.setValueHex(_LumaDMSL4, LensValue.SetLensValue("lib_lumadms_l4_key"));
        libPatcher.setValueHex(_LumaDMSL5, LensValue.SetLensValue("lib_lumadms_l5_key"));
        libPatcher.setValueHex(_SabreLNewL1, LensValue.SetLensValue("lib_sabrelnew_l1_key"));
        libPatcher.setValueHex(_SabreLNewL2, LensValue.SetLensValue("lib_sabrelnew_l2_key"));
        libPatcher.setValueHex(_SabreLNewL3, LensValue.SetLensValue("lib_sabrelnew_l3_key"));
        libPatcher.setValueHex(_SabreLNewL4, LensValue.SetLensValue("lib_sabrelnew_l4_key"));
        libPatcher.setValueHex(_SabreLNewL5, LensValue.SetLensValue("lib_sabrelnew_l5_key"));
        libPatcher.setValueHex(_SabreLNewNL1, LensValue.SetLensValue("lib_sabrelnewn_l1_key"));
        libPatcher.setValueHex(_SabreLNewNL2, LensValue.SetLensValue("lib_sabrelnewn_l2_key"));
        libPatcher.setValueHex(_SabreLNewNL3, LensValue.SetLensValue("lib_sabrelnewn_l3_key"));
        libPatcher.setValueHex(_SabreLNewNL4, LensValue.SetLensValue("lib_sabrelnewn_l4_key"));
        libPatcher.setValueHex(_SabreLNewNL5, LensValue.SetLensValue("lib_sabrelnewn_l5_key"));
        libPatcher.setValueHex(_SabreLNewNL6, LensValue.SetLensValue("lib_sabrelnewn_l6_key"));
        libPatcher.setValueHex(_SabreLNewNL7, LensValue.SetLensValue("lib_sabrelnewn_l7_key"));
        libPatcher.setValueHex(_SabreLNewNL8, LensValue.SetLensValue("lib_sabrelnewn_l8_key"));
        libPatcher.setValueHex(_SabreLNewNL9, LensValue.SetLensValue("lib_sabrelnewn_l9_key"));
        libPatcher.setValueHex(_WaveletLumaDenoiseSabreLevels, LensValue.SetLensValue("lib_lumalevel_preset_key"));
        libPatcher.setValueHex(_InitParams, LensValue.SetLensValue("lib_init_params_key"));
        libPatcher.setValueHex(_InitParams2, LensValue.SetLensValue("lib_init_params_key"));
        libPatcher.setValueHex(_BlurDenoise, LensValue.SetLensValue("lib_blurdenoise_key"));
        libPatcher.setValueHex(_DisableHigh, LensValue.SetLensValue("lib_preservinghigh_key"));
        libPatcher.setValueHex(_LiteLDRHighlight, LensValue.SetLensValue("lib_liteldrhigh_key"));
        libPatcher.setValueHex(_NRopacity2, LensValue.SetLensValue("lib_nropacity2_key"));
        libPatcher.setValueHex(_GainThreshold, LensValue.SetLensValue("lib_gainthreshold_key"));
        libPatcher.setValueHex(_GainRad, LensValue.SetLensValue("lib_gainrad_key"));
        libPatcher.setValueHex(_GainSmall, LensValue.SetLensValue("lib_gainsmall_key"));
        libPatcher.setValueHex(_GainMed, LensValue.SetLensValue("lib_gainmed_key"));
        libPatcher.setValueHex(_GainLarge, LensValue.SetLensValue("lib_gainlarge_key"));
        if (GetMenuValues.getIntValue("lib_user_key_1") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_1"), "lib_user_value_1");
        }
        if (GetMenuValues.getIntValue("lib_user_key_2") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_2"), "lib_user_value_2");
        }
        if (GetMenuValues.getIntValue("lib_user_key_3") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_3"), "lib_user_value_3");
        }
        if (GetMenuValues.getIntValue("lib_user_key_4") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_4"), "lib_user_value_4");
        }
        if (GetMenuValues.getIntValue("lib_user_key_5") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_5"), "lib_user_value_5");
        }
        if (GetMenuValues.getIntValue("lib_user_key_6") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_6"), "lib_user_value_6");
        }
        if (GetMenuValues.getIntValue("lib_user_key_7") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_7"), "lib_user_value_7");
        }
        if (GetMenuValues.getIntValue("lib_user_key_8") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_8"), "lib_user_value_8");
        }
        if (GetMenuValues.getIntValue("lib_user_key_9") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_9"), "lib_user_value_9");
        }
        if (GetMenuValues.getIntValue("lib_user_key_10") != 0) {
            libPatcher.setValueHex(GetMenuValues.getHexIntValue("lib_user_addr_10"), "lib_user_value_10");
        }
        if (Pref.MenuValue("pref_enable_ldr_key") != 0) {
            libPatcher.setValueHex(_DisableHigh, "lib_preservinghigh_ldr_key");
            libPatcher.setValueHex(_LiteLDRHighlight, "lib_liteldrhigh_ldr_key");
            libPatcher.setValueHex(_ExposureDarker, "lib_exposure_darker_ldr_key");
            libPatcher.setValueHex(_ExpoCor, "lib_expocor_ldr_key");
            libPatcher.setValueHex(_LDR, "lib_ldr_key");
            libPatcher.setValueHex(_StartGamma, "lib_gamma_ldr_key");
            libPatcher.setValueHex(_StartTone, "lib_tone_ldr_key");
            libPatcher.setValueHex(_BrightN, "lib_brightn_ldr_key");
            libPatcher.setValueHex(_CContrast2, "lib_ccontrast_ldr_key");
            libPatcher.setValueHex(_AVGLDR, "lib_avgldr_ldr_key");
            libPatcher.setValueHex(_HDRRatio2, "lib_hdrratio2_ldr_key");
            libPatcher.setValueHex(_DehazeBlack, "lib_dehazedblack_ldr_key");
            libPatcher.setValueHex(_NContrast1, "lib_ncontrast1_ldr_key");
            libPatcher.setValueHex(_HDRRaw2, "lib_hdrraw2_ldr_key");
            libPatcher.setValueHex(_ContrastL1, "lib_contrast_1_ldr_key");
            libPatcher.setValueHex(_ContrastL2, "lib_contrast_2_ldr_key");
            libPatcher.setValueHex(_DehazedExpo, "lib_dehazedexpo_ldr_key");
            libPatcher.setValueHex(_HDREffect, "lib_hdreffect_ldr_key");
            libPatcher.setValueHex(_HDREffectInt, "lib_hdreffectint_ldr_key");
            libPatcher.setValueHex(_HDROverLight, "lib_hdroverlight_ldr_key");
            libPatcher.setValueHex(_HDRRangeMinus, "lib_hdrrangeminus_ldr_key");
            libPatcher.setValueHex(_HDRRangePlus, "lib_hdrrangeplus_ldr_key");
            libPatcher.setValueHex(_Light, "lib_light_ldr_key");
            libPatcher.setValueHex(_ContrastBlack, "lib_contrastblack_ldr_key");
            libPatcher.setValueHex(_SabreContrast, "lib_sabrecontrast_ldr_key");
            libPatcher.setValueHex(_Clarity, "lib_clarity_ldr_key");
            libPatcher.setValueHex(_ISO, "pref_lib_iso_option_available_ldr_key");
            libPatcher.setValueHex(_Brightnessintensity, "lib_brightnessintensity_ldr_key");
            libPatcher.setValueHex(_ShadowTuning, "lib_shadowtuning_ldr_key");
            libPatcher.setValueHex(_ShadowCompensation, "lib_shadow_compensation_ldr_key");
            libPatcher.setValueHex(_Saturation, "lib_saturation_ldr_key");
            libPatcher.setValueHex(_Saturation2, "lib_saturation2_ldr_key");
            libPatcher.setValueHex(_Saturation3, "lib_saturation3_ldr_key");
            libPatcher.setValueHex(_Exposure, "lib_exposure_ldr_key");
            libPatcher.setValueHex(_Exposition, "lib_exposition_ldr_key");
            libPatcher.setValueHex(_Hightlight2, "lib_highlight2_ldr_key");
            libPatcher.setValueHex(_HDRRatio3, "lib_hdrratio3_ldr_key");
        }
        if (Pref.MenuValue("pref_enable_pro_key") != 0) {
            libPatcher.setValueHex(_BlurDenoise, "lib_blurdenoise_pro_key");
            libPatcher.setValueHex(_DisableHigh, "lib_preservinghigh_pro_key");
            libPatcher.setValueHex(_LiteLDRHighlight, "lib_liteldrhigh_pro_key");
            libPatcher.setValueHex(_NRopacity2, "lib_nropacity2_pro_key");
            libPatcher.setValueHex(_GainThreshold, "lib_gainthreshold_pro_key");
            libPatcher.setValueHex(_GainRad, "lib_gainrad_pro_key");
            libPatcher.setValueHex(_GainSmall, "lib_gainsmall_pro_key");
            libPatcher.setValueHex(_GainMed, "lib_gainmed_pro_key");
            libPatcher.setValueHex(_GainLarge, "lib_gainlarge_pro_key");
            libPatcher.setValueHex(_SkyBrightnessNight, "lib_nightsky_pro_key");
            libPatcher.setValueHex(_NoiseReductSabre1, "lib_noisereductsabre1_pro_key");
            libPatcher.setValueHex(_SabreNoiseEstimals, "lib_sabrenoiseestimals_pro_key");
            libPatcher.setValueHex(_HDRRatio3, "lib_hdrratio3_pro_key");
            libPatcher.setValueHex(_Contrast4, "lib_contrast4_pro_key");
            libPatcher.setValueHex(_Contrast5, "lib_contrast5_pro_key");
            libPatcher.setValueHex(_Darker, "lib_darker_pro_key");
            libPatcher.setValueHex(_LumaDenoise, "lib_lumadenoise_pro_key");
            libPatcher.setValueHex(_LumaSmooth, "lib_lumasmooth_pro_key");
            libPatcher.setValueHex(_NROpacity, "lib_noisereductopacity_pro_key");
            libPatcher.setValueHex(_DenSmoothing1, "lib_lumasmoothing_pro_key");
            libPatcher.setValueHex(_DenSmoothing2, "lib_denoisesmoothing_pro_key");
            libPatcher.setValueHex(_DehazeBlack, "lib_dehazedblack_pro_key");
            libPatcher.setValueHex(_NContrast1, "lib_ncontrast1_pro_key");
            libPatcher.setValueHex(_LumaNoise1, "lib_lumanoise1_pro_key");
            libPatcher.setValueHex(_LumaNew, "lib_lumanew_pro_key");
            libPatcher.setValueHex(_HDRRaw2, "lib_hdrraw2_pro_key");
            libPatcher.setValueHex(_HDRSabreCalcVal1, "lib_hdrsabrecalcval1_pro_key");
            libPatcher.setValueHex(_HDRSabreCalcVal2, "lib_hdrsabrecalcval2_pro_key");
            libPatcher.setValueHex(_Robustness, "lib_robustness_pro_key");
            libPatcher.setValueHex(_ShadowCompensation, "lib_shadow_compensation_pro_key");
            libPatcher.setValueHex(_NightModeGain, "lib_night_mode_gain_pro_key");
            libPatcher.setValueHex(_InitParams, "lib_init_params_pro_key");
            libPatcher.setValueHex(_InitParams2, "lib_init_params_pro_key");
            libPatcher.setValueHex(_RawCompress, "lib_raw_compress_pro_key");
            libPatcher.setValueHex(_HDRModel, "lib_hdrmodel_pro_key");
            libPatcher.setValueHex(_BlurPreview, "lib_blurpreview_pro_key");
            libPatcher.setValueHex(_FixRaw16Merge, "lib_fixraw16merge_pro_key");
            libPatcher.setValueHex(_HardJPGQuality, "lib_hardjpgquality_pro_key");
            libPatcher.setValueHex(_LutNoiseFix, "lib_lutnoisefix_pro_key");
            libPatcher.setValueHex(_LightFix, "lib_lightfix_pro_key");
            libPatcher.setValueHex(_LightFix2, "lib_lightfix2_pro_key");
            libPatcher.setValueHex(_LightFix3, "lib_lightfix3_pro_key");
            libPatcher.setValueHex(_SkipMetadataCheck, "lib_skipmetadatacheck_pro_key");
            libPatcher.setValueHex(_ShastaForce, "lib_shastaforce_pro_key");
            libPatcher.setValueHex(_ShastaFactor, "lib_shastafactor_pro_key");
            libPatcher.setValueHex(_HardUX, "lib_hardux_pro_key");
            libPatcher.setValueHex(_ResamplMethod, "lib_resamplmethod_pro_key");
            libPatcher.setValueHex(_AppDiGainSet, "lib_appdigainset_pro_key");
            libPatcher.setValueHex(_SharpnessA, "lib_sharpnessa_pro_key");
            libPatcher.setValueHex(_SharpnessB, "lib_sharpnessb_pro_key");
            libPatcher.setValueHex(_Denoise, "lib_denoise_pro_key");
            libPatcher.setValueHex(_SpatialA, "lib_spatiala_pro_key");
            libPatcher.setValueHex(_SpatialB, "lib_spatialb_pro_key");
            libPatcher.setValueHex(_ChromaA, "lib_chromaa_pro_key");
            libPatcher.setValueHex(_NightModeExposition, "lib_nightmodeexposition_pro_key");
            libPatcher.setValueHex(_BrightN, "lib_brightn_pro_key");
            libPatcher.setValueHex(_ChromaB, "lib_chromab_pro_key");
            libPatcher.setValueHex(_LumaA, "lib_lumaa_pro_key");
            libPatcher.setValueHex(_LumaB, "lib_lumab_pro_key");
            libPatcher.setValueHex(_SensorID, "lib_sensorid_pro_key");
            libPatcher.setValueHex(_TemporalA, "lib_temporala_pro_key");
            libPatcher.setValueHex(_TemporalB, "lib_temporalb_pro_key");
            libPatcher.setValueHex(_LumaNoise, "lib_lumanoise_pro_key");
            libPatcher.setValueHex(_Saturation, "lib_saturation_pro_key");
            libPatcher.setValueHex(_Saturation2, "lib_saturation2_pro_key");
            libPatcher.setValueHex(_Saturation3, "lib_saturation3_pro_key");
            libPatcher.setValueHex(_ISO, "pref_lib_iso_option_available_pro_key");
            libPatcher.setValueHex(_SharpShastaMotion, "lib_sharpshastamotion_pro_key");
            libPatcher.setValueHex(_HdrPlusInterface, "lib_hdrplusinterface_pro_key");
            libPatcher.setValueHex(_Depth1, "lib_depth1_pro_key");
            libPatcher.setValueHex(_Depth2, "lib_depth2_pro_key");
            libPatcher.setValueHex(_SharpMini, "lib_sharpmini_pro_key");
            libPatcher.setValueHex(_SharpMacro, "lib_sharpmacro_pro_key");
            libPatcher.setValueHex(_SharpeningEdge, "lib_sharpeningedge_pro_key");
            libPatcher.setValueHex(_SoftSharpA, "lib_softsharpa_pro_key");
            libPatcher.setValueHex(_SoftSharpB, "lib_softsharpb_pro_key");
            libPatcher.setValueHex(_SoftSharpC, "lib_softsharpc_pro_key");
            libPatcher.setValueHex(_SharpnessNoiseModel, "lib_sharpnessnoisemodel_pro_key");
            libPatcher.setValueHex(_SharpDRad1, "lib_sharpdrad1_pro_key");
            libPatcher.setValueHex(_SharpDRad2, "lib_sharpdrad1_pro_key");
            libPatcher.setValueHex(_RaisrZFTuning1, "lib_raisrzftuning1_pro_key");
            libPatcher.setValueHex(_RaisrZFTuning2, "lib_raisrzftuning2_pro_key");
            libPatcher.setValueHex(_Zipper1, "lib_zipper1_pro_key");
            libPatcher.setValueHex(_Zipper2, "lib_zipper2_pro_key");
            libPatcher.setValueHex(_Zipper3, "lib_zipper3_pro_key");
            libPatcher.setValueHex(_SabreSharp, "lib_sabresharp_pro_key");
            libPatcher.setValueHex(_SabreSharp, "lib_sabresharp_pro_key");
            libPatcher.setValueHex(_SabreSharp2, "lib_sabresharp2_pro_key");
            libPatcher.setValueHex(_SabreSharp3, "lib_sabresharp3_pro_key");
            libPatcher.setValueHex(_SabreContrastSharp, "lib_sabrecontrastsharp_pro_key");
            libPatcher.setValueHex(_Exposition, "lib_exposition_pro_key");
            libPatcher.setValueHex(_Exposure, "lib_exposure_pro_key");
            libPatcher.setValueHex(_Darkenlight, "lib_darkenlight_pro_key");
            libPatcher.setValueHex(_ExpoComp, "lib_expocomp_pro_key");
            libPatcher.setValueHex(_ExpoCor, "lib_expocor_pro_key");
            libPatcher.setValueHex(_IsoExpoTun, "lib_isoexpotun_pro_key");
            libPatcher.setValueHex(_ExposureDarker, "lib_exposure_darker_pro_key");
            libPatcher.setValueHex(_ExposureDarker2, "lib_exposure_darker2_pro_key");
            libPatcher.setValueHex(_HardMerge, "lib_hardmerge_pro_key");
            libPatcher.setValueHex(_SABRE1, "lib_sabre1_pro_key");
            libPatcher.setValueHex(_SABRE2, "lib_sabre2_pro_key");
            libPatcher.setValueHex(_SABRE3, "lib_sabre3_pro_key");
            libPatcher.setValueHex(_SabreByRAWToYUV, "lib_sabrebyrawtoyuv_pro_key");
            libPatcher.setValueHex(_Brightnessintensity, "lib_brightnessintensity_pro_key");
            libPatcher.setValueHex(_HDRBrightness, "lib_hdrbrightness_pro_key");
            libPatcher.setValueHex(_HDR2, "lib_hdr2_pro_key");
            libPatcher.setValueHex(_Hightlight2, "lib_highlight2_pro_key");
            libPatcher.setValueHex(_HDRRatio2, "lib_hdrratio2_pro_key");
            libPatcher.setValueHex(_AVGLDR, "lib_avgldr_pro_key");
            libPatcher.setValueHex(_Dehazedregulator2, "lib_dehazedregulator2_pro_key");
            libPatcher.setValueHex(_CoefSabrTuNoise, "lib_coefsabrtunoise_pro_key");
            libPatcher.setValueHex(_SabrBurMerge1, "lib_sabrburmerge1_pro_key");
            libPatcher.setValueHex(_SabrBurMerge2, "lib_sabrburmerge2_pro_key");
            libPatcher.setValueHex(_SabrBurMerge3, "lib_sabrburmerge3_pro_key");
            libPatcher.setValueHex(_SmoothingSabre, "lib_smoothingsabre_pro_key");
            libPatcher.setValueHex(_NoiseReductSabre, "lib_noisereductsabre_pro_key");
            libPatcher.setValueHex(_SabreNoiseArt, "lib_sabrenoiseart_pro_key");
            libPatcher.setValueHex(_BetterColWiener, "lib_bettercolwiener_pro_key");
            libPatcher.setValueHex(_SavMergChrDen, "lib_savmergchrden_pro_key");
            libPatcher.setValueHex(_FixNoiseSabre, "lib_fixnoisesabre_pro_key");
            libPatcher.setValueHex(_ColProcessing, "lib_colprocessing_pro_key");
            libPatcher.setValueHex(_FixShastaMerge, "lib_fixshastamerge_pro_key");
            libPatcher.setValueHex(_VolumeProcessing1, "lib_volumeprocessing1_pro_key");
            libPatcher.setValueHex(_VolumeProcessing2, "lib_volumeprocessing2_pro_key");
            libPatcher.setValueHex(_Hotpixelsuppres, "lib_hotpixelsuppres_pro_key");
            libPatcher.setValueHex(_Smoothness, "lib_smoothness_pro_key");
            libPatcher.setValueHex(_Smoothing1, "lib_smoothing1_pro_key");
            libPatcher.setValueHex(_Smoothing2, "lib_smoothing2_pro_key");
            libPatcher.setValueHex(_SmoothingNew, "lib_smoothingnew_pro_key");
            libPatcher.setValueHex(_TemporalBinning, "lib_temporalbin_pro_key");
            libPatcher.setValueHex(_TemporalRadius, "lib_temporal_radius_pro_key");
            libPatcher.setValueHex(_ShotNoiseFactor, "lib_shotnoisefactor_pro_key");
            libPatcher.setValueHex(_NoiseModelShot, "lib_noisemodelshot_pro_key");
            libPatcher.setValueHex(_TunColSatPar1, "lib_tuncolsatpar1_pro_key");
            libPatcher.setValueHex(_TunColSatPar2, "lib_tuncolsatpar2_pro_key");
            libPatcher.setValueHex(_DiscardFramesWithTetMismatch, "lib_withtetmismatch_pro_key");
            libPatcher.setValueHex(_MaxRelativeTetFactor, "lib_maxrelativetetfactor_pro_key");
            libPatcher.setValueHex(_SharpGain, "lib_sharpgain_pro_key");
            libPatcher.setValueHex(_SharpGainMacro, "lib_sharpgainmacro_pro_key");
            libPatcher.setValueHex(_SharpGainMicro, "lib_sharpgainmicro_pro_key");
            libPatcher.setValueHex(_Contr, "lib_contr_pro_key");
            libPatcher.setValueHex(_Sat4, "lib_sat4_pro_key");
            libPatcher.setValueHex(_HightlightCompensation2, "lib_hightlight2_pro_key");
            libPatcher.setValueHex(_TunSupressHotPixel, "lib_tunsupresshotpixel_pro_key");
            libPatcher.setValueHex(_ShotParams_1device_1is_1on_1tripod_1set, "lib_tripod_pro_key");
            libPatcher.setValueHex(_ShotParams_1downsample_1by_12_1before_1merge_1set, "lib_downsamplebybeforemerge_pro_key");
            libPatcher.setValueHex(_ShotParams_1allow_1temporal_1binning_1set, "lib_allowtemporalbinning_pro_key");
            libPatcher.setValueHex(_ShotParams_1allow_1base_1frame_1reuse_1set, "lib_allowbaseframereuse_pro_key");
            libPatcher.setValueHex(_InitParams_1simultaneous_1merge_1and_1finish_1set, "lib_simultaneousmerge_pro_key");
            libPatcher.setValueHex(_CG1, "lib_cg1_pro_key");
            libPatcher.setValueHex(_CG2, "lib_cg2_pro_key");
            libPatcher.setValueHex(_CG3, "lib_cg3_pro_key");
            libPatcher.setValueHex(_CG4, "lib_cg4_pro_key");
            libPatcher.setValueHex(_CG5, "lib_cg5_pro_key");
            libPatcher.setValueHex(_CG6, "lib_cg6_pro_key");
            libPatcher.setValueHex(_CG9, "lib_cg9_pro_key");
            libPatcher.setValueHex(_CG10, "lib_cg10_pro_key");
            libPatcher.setValueHex(_Green, "lib_green_pro_key");
            libPatcher.setValueHex(_Red, "lib_red_pro_key");
            libPatcher.setValueHex(_BY, "lib_by_pro_key");
            libPatcher.setValueHex(_YBP, "lib_ybp_pro_key");
            libPatcher.setValueHex(_GRO, "lib_gro_pro_key");
            libPatcher.setValueHex(_ORGB, "lib_orgb_pro_key");
            libPatcher.setValueHex(_Vignette, "lib_vignette_pro_key");
            libPatcher.setValueHex(_VignetteC, "lib_vignettec_pro_key");
            libPatcher.setValueHex(_DehazedExpo, "lib_dehazedexpo_pro_key");
            libPatcher.setValueHex(_Clarity, "lib_clarity_pro_key");
            libPatcher.setValueHex(_ContrastL1, "lib_contrast_1_pro_key");
            libPatcher.setValueHex(_ContrastL2, "lib_contrast_2_pro_key");
            libPatcher.setValueHex(_ContrastL3a, "lib_contrast_3a_pro_key");
            libPatcher.setValueHex(_Lighting, "lib_lighting_pro_key");
            libPatcher.setValueHex(_HDRRangePlus, "lib_hdrrangeplus_pro_key");
            libPatcher.setValueHex(_HDRRangeMinus, "lib_hdrrangeminus_pro_key");
            libPatcher.setValueHex(_Light, "lib_light_pro_key");
            libPatcher.setValueHex(_BlackLevel, "lib_blacklevel_pro_key");
            libPatcher.setValueHex(_WhiteLevel, "lib_whitelevel_pro_key");
            libPatcher.setValueHex(_HDROverLight, "lib_hdroverlight_pro_key");
            libPatcher.setValueHex(_HDREffectInt, "lib_hdreffectint_pro_key");
            libPatcher.setValueHex(_HDREffect, "lib_hdreffect_pro_key");
            libPatcher.setValueHex(_SabreContrast, "lib_sabrecontrast_pro_key");
            libPatcher.setValueHex(_ContrastBlack, "lib_contrastblack_pro_key");
            libPatcher.setValueHex(_ShadowTuning, "lib_shadowtuning_pro_key");
            libPatcher.setValueHex(_SoftContrast, "lib_softcontrast_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL1, "lib_lumadhsabre_l1_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL2, "lib_lumadhsabre_l2_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL3, "lib_lumadhsabre_l3_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL4, "lib_lumadhsabre_l4_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL5, "lib_lumadhsabre_l5_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL1, "lib_lumadlsabre_l1_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL2, "lib_lumadlsabre_l2_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL3, "lib_lumadlsabre_l3_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL4, "lib_lumadlsabre_l4_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL5, "lib_lumadlsabre_l5_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL1, "lib_lumadmsabre_l1_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL2, "lib_lumadmsabre_l2_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL3, "lib_lumadmsabre_l3_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL4, "lib_lumadmsabre_l4_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL5, "lib_lumadmsabre_l5_pro_key");
            libPatcher.setValueHex(_SpatialDenMi1, "lib_spatialdenmi1_pro_key");
            libPatcher.setValueHex(_SabreNoise, "lib_sabrenoise_pro_key");
            libPatcher.setValueHex(_SpatialDenMi2, "lib_spatialdenmi2_pro_key");
            libPatcher.setValueHex(_SpatialDenMi3, "lib_spatialdenmi3_pro_key");
            libPatcher.setValueHex(_SpatialDenMi4, "lib_spatialdenmi4_pro_key");
            libPatcher.setValueHex(_WaveletLumaDenoiseSabreLevels, "lib_lumalevel_preset_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL1A, "lib_lumadhsabre_l1a_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL1B, "lib_lumadhsabre_l1b_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL2A, "lib_lumadhsabre_l2a_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL2B, "lib_lumadhsabre_l2b_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL3A, "lib_lumadhsabre_l3a_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL3B, "lib_lumadhsabre_l3b_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL4A, "lib_lumadhsabre_l4a_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL4B, "lib_lumadhsabre_l4b_pro_key");
            libPatcher.setValueHex(_LumaDHSabreL5A, "lib_lumadhsabre_l5a_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL1A, "lib_lumadlsabre_l1a_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL1B, "lib_lumadlsabre_l1b_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL2A, "lib_lumadlsabre_l2a_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL2B, "lib_lumadlsabre_l2b_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL3A, "lib_lumadlsabre_l3a_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL3B, "lib_lumadlsabre_l3b_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL4A, "lib_lumadlsabre_l4a_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL4B, "lib_lumadlsabre_l4b_pro_key");
            libPatcher.setValueHex(_LumaDLSabreL5A, "lib_lumadlsabre_l5a_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL1A, "lib_lumadmsabre_l1a_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL1B, "lib_lumadmsabre_l1b_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL2A, "lib_lumadmsabre_l2a_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL2B, "lib_lumadmsabre_l2b_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL3A, "lib_lumadmsabre_l3a_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL3B, "lib_lumadmsabre_l3b_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL4A, "lib_lumadmsabre_l4a_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL4B, "lib_lumadmsabre_l4b_pro_key");
            libPatcher.setValueHex(_LumaDMSabreL5A, "lib_lumadmsabre_l5a_pro_key");
            libPatcher.setValueHex(_LumaDNewA, "lib_lumadnewa_pro_key");
            libPatcher.setValueHex(_LumaDNewB, "lib_lumadnewb_pro_key");
            libPatcher.setValueHex(_LumaDHL1, "lib_lumadh_l1_pro_key");
            libPatcher.setValueHex(_LumaDHL2, "lib_lumadh_l2_pro_key");
            libPatcher.setValueHex(_LumaDHL3, "lib_lumadh_l3_pro_key");
            libPatcher.setValueHex(_LumaDHL4, "lib_lumadh_l4_pro_key");
            libPatcher.setValueHex(_LumaDHL5, "lib_lumadh_l5_pro_key");
            libPatcher.setValueHex(_LumaDLL1, "lib_lumadl_l1_pro_key");
            libPatcher.setValueHex(_LumaDLL2, "lib_lumadl_l2_pro_key");
            libPatcher.setValueHex(_LumaDLL3, "lib_lumadl_l3_pro_key");
            libPatcher.setValueHex(_LumaDLL4, "lib_lumadl_l4_pro_key");
            libPatcher.setValueHex(_LumaDLL5, "lib_lumadl_l5_pro_key");
            libPatcher.setValueHex(_LumaDML1, "lib_lumadm_l1_pro_key");
            libPatcher.setValueHex(_LumaDML2, "lib_lumadm_l2_pro_key");
            libPatcher.setValueHex(_LumaDML3, "lib_lumadm_l3_pro_key");
            libPatcher.setValueHex(_LumaDML4, "lib_lumadm_l4_pro_key");
            libPatcher.setValueHex(_LumaDML5, "lib_lumadm_l5_pro_key");
            libPatcher.setValueHex(_LumaDHSL1, "lib_lumadhs_l1_pro_key");
            libPatcher.setValueHex(_LumaDHSL2, "lib_lumadhs_l2_pro_key");
            libPatcher.setValueHex(_LumaDHSL3, "lib_lumadhs_l3_pro_key");
            libPatcher.setValueHex(_LumaDHSL4, "lib_lumadhs_l4_pro_key");
            libPatcher.setValueHex(_LumaDHSL5, "lib_lumadhs_l5_pro_key");
            libPatcher.setValueHex(_LumaDLSL1, "lib_lumadls_l1_pro_key");
            libPatcher.setValueHex(_LumaDLSL2, "lib_lumadls_l2_pro_key");
            libPatcher.setValueHex(_LumaDLSL3, "lib_lumadls_l3_pro_key");
            libPatcher.setValueHex(_LumaDLSL4, "lib_lumadls_l4_pro_key");
            libPatcher.setValueHex(_LumaDLSL5, "lib_lumadls_l5_pro_key");
            libPatcher.setValueHex(_LumaDMSL1, "lib_lumadms_l1_pro_key");
            libPatcher.setValueHex(_LumaDMSL2, "lib_lumadms_l2_pro_key");
            libPatcher.setValueHex(_LumaDMSL3, "lib_lumadms_l3_pro_key");
            libPatcher.setValueHex(_LumaDMSL4, "lib_lumadms_l4_pro_key");
            libPatcher.setValueHex(_LumaDMSL5, "lib_lumadms_l5_pro_key");
            libPatcher.setValueHex(_SabreLNewL1, "lib_sabrelnew_l1_pro_key");
            libPatcher.setValueHex(_SabreLNewL2, "lib_sabrelnew_l2_pro_key");
            libPatcher.setValueHex(_SabreLNewL3, "lib_sabrelnew_l3_pro_key");
            libPatcher.setValueHex(_SabreLNewL4, "lib_sabrelnew_l4_pro_key");
            libPatcher.setValueHex(_SabreLNewL5, "lib_sabrelnew_l5_pro_key");
            libPatcher.setValueHex(_SabreLNewNL1, "lib_sabrelnewn_l1_pro_key");
            libPatcher.setValueHex(_SabreLNewNL2, "lib_sabrelnewn_l2_pro_key");
            libPatcher.setValueHex(_SabreLNewNL3, "lib_sabrelnewn_l3_pro_key");
            libPatcher.setValueHex(_SabreLNewNL4, "lib_sabrelnewn_l4_pro_key");
            libPatcher.setValueHex(_SabreLNewNL5, "lib_sabrelnewn_l5_pro_key");
            libPatcher.setValueHex(_SabreLNewNL6, "lib_sabrelnewn_l6_pro_key");
            libPatcher.setValueHex(_SabreLNewNL7, "lib_sabrelnewn_l7_pro_key");
            libPatcher.setValueHex(_SabreLNewNL8, "lib_sabrelnewn_l8_pro_key");
            libPatcher.setValueHex(_SabreLNewNL9, "lib_sabrelnewn_l9_pro_key");
            libPatcher.setValueHex(_CContrast, "lib_ccontrast_pro_key");
            libPatcher.setValueHex(_CContrast2, "lib_ccontrast2_pro_key");
            libPatcher.setValueHex(_RecomputeWBOnBaseFrame, "lib_wbbaseframe_pro_key");
            if (Pref.MenuValue(LensValue.SetLensValue("pref_zsl_burstfix_pro_key")) != 0) {
                libPatcher.setValueHexToo(_ZSLBurstCountFix1, "1F2003D5");
                libPatcher.setValueHexToo(_ZSLBurstCountFix2, "1F2003D5");
                libPatcher.setValueHexToo(_ZSLBurstCountFix3, "e903271e");
            }
        }
        if (Pref.MenuValue("pref_zsl_burstfix_key") != 0) {
            libPatcher.setValueHexToo(_ZSLBurstCountFix1, "1F2003D5");
            libPatcher.setValueHexToo(_ZSLBurstCountFix2, "1F2003D5");
            libPatcher.setValueHexToo(_ZSLBurstCountFix3, "e903271e");
        }
        Context appContext = libPatcher.getAppContext();
        boolean zLoadCustomLib = libPatcher.loadCustomLib(appContext);
        if (zLoadCustomLib) {
            return zLoadCustomLib;
        }
        Toast.makeText(appContext, "loadCustomLib ERROR", 1).show();
        return false;
    }

    private static boolean copyLibDisabled(LibPatcher libPatcher) {
        Context appContext = libPatcher.getAppContext();
        boolean zLoadCustomLib = libPatcher.loadCustomLib(appContext);
        if (zLoadCustomLib) {
            return zLoadCustomLib;
        }
        Toast.makeText(appContext, "loadCustomLib ERROR", 1).show();
        return false;
    }

    private static boolean copySignature(LibPatcher libPatcher) {
        String libSignature = getLibSignature();
        if (GetMenuValues.getIntValue("pref_save_patchedlib_key") == 0 || GetMenuValues.getIntValue("pref_sign_library_key") == 0) {
            return true;
        }
        Pref.setMenuValue("info_libsignature_key", libSignature);
        libPatcher.setValueHex(_LibSignature, "info_libsignature_key");
        return true;
    }

    private String doubleToHex(double d) {
        return d == 0.0d ? "0000000000000000" : reverseHex(String.format("%X", Long.valueOf(Double.doubleToLongBits(d))));
    }

    public static String getLibSignature() {
        String strTrim = Pref.getStringValue("pref_signtext_key").trim();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        for (char c : strTrim.toCharArray()) {
            sb.append(Integer.toHexString(c));
        }
        String strSubstring = sb.toString().concat("0000000000000000000000000000000000000000000000000000000000000000").substring(0, 64);
        Pref.setMenuValue("info_libsignature_key", strSubstring);
        return strSubstring;
    }

    private byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static void loadLibX(String str) {
        String stringValue;
        String strSetLensValue1 = LensValue.SetLensValue1("libs_key");
        String strSetLensValue2 = LensValue.SetLensValue1("pref_libs_fromdir_key");
        int iMenuValue = Pref.MenuValue(strSetLensValue1);
        if (iMenuValue >= 0) {
            switch (iMenuValue) {
                case 0:
                    stringValue = "libgcastartup.so";
                    break;
                case 1:
                    stringValue = "libgcastartup_1.so";
                    break;
                case 2:
                    stringValue = "libgcastartup_2.so";
                    break;
                case 3:
                    stringValue = "libgcastartup_3.so";
                    break;
                case 4:
                    stringValue = "libgcastartup_4.so";
                    break;
                case 5:
                    stringValue = "libgcastartup_5.so";
                    break;
                case 6:
                    stringValue = "libgcastartup_6.so";
                    break;
                case 7:
                    stringValue = "libgcastartup_7.so";
                    break;
                case 8:
                    stringValue = "libgcastartup_8.so";
                    break;
                case 9:
                    stringValue = "libgcastartup_9.so";
                    break;
                case 10:
                    stringValue = "libgcastartup_a.so";
                    break;
                case 11:
                    stringValue = "libgcastartup_b.so";
                    break;
                case 12:
                    stringValue = "libgcastartup_c.so";
                    break;
                case 13:
                    stringValue = "libgcastartup_d.so";
                    break;
                case 14:
                    stringValue = "libgcastartup_e.so";
                    break;
                case 15:
                    stringValue = "libgcastartup_f.so";
                    break;
                default:
                    stringValue = "libgcastartup.so";
                    break;
            }
        } else {
            stringValue = Pref.getStringValue(strSetLensValue2);
        }
        if (Pref.MenuValue("pref_enable_patcher_key") == 0) {
            if (applyPatcherDisabled(stringValue)) {
                return;
            }
            System.loadLibrary(str);
        } else {
            if (applyPatcher(stringValue)) {
                return;
            }
            System.loadLibrary(str);
        }
    }

    private String readBytes(long j, int i) {
        Context appContext = GetMenuValues.getAppContext();
        File filesDir = appContext.getFilesDir();
        if (filesDir == null) {
            if (!this.showToast) {
                return "";
            }
            Toast.makeText(appContext, "appContext.getFilesDir() == null", 1).show();
            return "";
        }
        File file = new File(filesDir, this.libName);
        if (!file.exists()) {
            if (!this.showToast) {
                return "";
            }
            Toast.makeText(appContext, "not patchedLib.exists()", 1).show();
            return "";
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            byte[] bArr = new byte[i];
            try {
                randomAccessFile.seek(j);
                randomAccessFile.read(bArr);
                randomAccessFile.close();
                String strBytesToHex = bytesToHex(bArr);
                if (this.showToast) {
                    Toast.makeText(appContext, strBytesToHex, 1).show();
                }
                return strBytesToHex;
            } catch (IOException e) {
                if (!this.showToast) {
                    return "";
                }
                Toast.makeText(appContext, "readBytes: IOException", 1).show();
                return "";
            }
        } catch (FileNotFoundException e2) {
            if (!this.showToast) {
                return "";
            }
            Toast.makeText(appContext, "readBytes: FileNotFoundException", 1).show();
            return "";
        }
    }

    private String reverseHex(String str) {
        int length = str.length() / 2;
        char[] cArr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            int i2 = ((length - 1) - i) * 2;
            int i3 = i * 2;
            cArr[i2] = str.charAt(i3);
            cArr[i2 + 1] = str.charAt(i3 + 1);
        }
        return new String(cArr);
    }

    private boolean streamToFile(InputStream inputStream, File file) throws IOException {
        byte[] bArr = new byte[FILE_WRITE_BUFFER_SIZE];
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                fileOutputStream.close();
                inputStream.close();
                return true;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    private String writeBytes(long j, String str, Integer num) {
        if (str.length() != num.intValue()) {
            return str + "HEX has wrong length";
        }
        File filesDir = GetMenuValues.getAppContext().getFilesDir();
        if (filesDir == null) {
            return "writeBytes: appContext.getFilesDir() == null";
        }
        File file = new File(filesDir, this.libName);
        if (!file.exists()) {
            return "writeBytes: not patchedLib.exists()";
        }
        if (!file.canWrite()) {
            return "writeBytes: readonly";
        }
        byte[] bArrHexStringToByteArray = hexStringToByteArray(str);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rws");
            try {
                randomAccessFile.seek(j);
                randomAccessFile.write(bArrHexStringToByteArray);
                randomAccessFile.close();
                return "OK";
            } catch (IOException e) {
                return "writeBytes: IOException: " + e.toString();
            }
        } catch (FileNotFoundException e2) {
            return "writeBytes: FileNotFoundException: " + e2.toString();
        }
    }

    public Context getAppContext() {
        Application initialApplication = AppGlobals.getInitialApplication();
        return initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
    }

    public boolean loadCustomLib(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return false;
        }
        File file = new File(filesDir, "libpatched_jni.so");
        if (!file.exists()) {
            return false;
        }
        if (file.length() != new File(context.getApplicationInfo().nativeLibraryDir + File.separator + "libgcastartup.so").length()) {
            return false;
        }
        try {
            System.load(file.getAbsolutePath());
            return true;
        } catch (Exception e) {
            Toast.makeText(context, e.toString(), 1).show();
            return false;
        } catch (UnsatisfiedLinkError e2) {
            Toast.makeText(context, e2.toString(), 1).show();
            return false;
        }
    }

    public String moveLibToDir(String str) {
        String strConcat;
        File file;
        int intValue = GetMenuValues.getIntValue(LensValue.SetLensValue1("libs_key"));
        Context appContext = GetMenuValues.getAppContext();
        File filesDir = appContext.getFilesDir();
        if (filesDir == null) {
            return "getFilesDir not found";
        }
        File file2 = new File(filesDir, "libpatched_jni.so");
        if (file2.exists() && !file2.delete()) {
            return "Error deleting patched lib";
        }
        if (intValue < 0) {
            strConcat = "/LMC8.4/libs/" + str;
            file = new File(Environment.getExternalStorageDirectory(), strConcat);
        } else {
            strConcat = String.valueOf(appContext.getApplicationInfo().nativeLibraryDir).concat("/" + str);
            file = new File(strConcat);
        }
        try {
            return !streamToFile(new BufferedInputStream(new FileInputStream(file), FILE_WRITE_BUFFER_SIZE), file2) ? "streamToFile error" : "OK";
        } catch (FileNotFoundException e) {
            return String.valueOf("moveLibToDir: FileNotFoundException ").concat(strConcat);
        } catch (IOException e2) {
            return "moveLibToDir: IOException";
        }
    }

    public String moveLibToDir2(String str) {
        File filesDir = GetMenuValues.getAppContext().getFilesDir();
        if (filesDir == null) {
            return "getFilesDir not found";
        }
        File file = new File(filesDir, "libpatched_jni.so");
        File file2 = new File(Environment.getExternalStorageDirectory(), "/LMC8.4/patchedlibs/libpatched_jni.so");
        if (file2.exists() && !file2.delete()) {
            return "Error deleting patched lib";
        }
        try {
            return !streamToFile(new BufferedInputStream(new FileInputStream(file), FILE_WRITE_BUFFER_SIZE), file2) ? "streamToFile error" : "OK";
        } catch (FileNotFoundException e) {
            return String.valueOf("moveLibToDir: FileNotFoundException ").concat(str);
        } catch (IOException e2) {
            return "moveLibToDir: IOException";
        }
    }

    public void setGammaCurve() {
        double[] gammaCurve = getGammaCurve.getGammaCurve(-1);
        long j = _StartGamma;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(gammaPresetName);
        sb.append("\n");
        sb.append("\n");
        for (int i = 0; i < 33; i++) {
            double d = gammaCurve[i];
            sb.append(Double.toString(d));
            sb.append("\n");
            writeBytes(j, doubleToHex(d), 16);
            j += 8;
        }
        sb.toString();
    }

    public void setToneCurve() {
        double[] toneCurve = getToneCurve.getToneCurve(-1);
        long j = _StartTone;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(tonePresetName);
        sb.append("\n");
        sb.append("\n");
        for (int i = 0; i < 17; i++) {
            double d = toneCurve[i];
            sb.append(Double.toString(d));
            sb.append("\n");
            writeBytes(j, doubleToHex(d), 16);
            j += 8;
        }
        sb.toString();
    }

    public void setValueHex(int i, String str) {
        String string = GetMenuValues.getString(str);
        int length = string.length();
        if (length >= 2) {
            writeBytes(i, string, Integer.valueOf(length));
        }
    }

    public void setValueHexToo(int i, String str) {
        int length = str.length();
        if (length >= 2) {
            writeBytes(i, str, Integer.valueOf(length));
        }
    }
}
