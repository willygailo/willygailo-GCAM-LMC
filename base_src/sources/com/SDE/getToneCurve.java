package com.SDE;

/* JADX INFO: loaded from: classes.dex */
public class getToneCurve {
    public static String tonePresetName;
    public static String tonePresetName_2;
    public static String tonePresetName_3;
    public static String tonePresetName_4;
    public static String tonePresetName_5;
    public static String tonePresetName_front;

    public getToneCurve() {
        tonePresetName = "Default";
        tonePresetName_front = "Default";
        tonePresetName_2 = "Default";
        tonePresetName_3 = "Default";
        tonePresetName_4 = "Default";
        tonePresetName_5 = "Default";
    }

    public static String SetLensValueForTone(String str, int i) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        switch (i) {
            case 0:
                str2 = "";
                break;
            case 1:
                str2 = "_front";
                break;
            case 2:
                str2 = "_2";
                break;
            case 3:
                str2 = "_3";
                break;
            case 4:
                str2 = "_4";
                break;
            case 5:
                str2 = "_5";
                break;
            default:
                str2 = "";
                break;
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void SetPresetToneName(String str, int i) {
        if (i < 0) {
            LibPatcher.tonePresetName = str;
        }
        switch (i) {
            case 0:
                tonePresetName = str;
                break;
            case 1:
                tonePresetName_front = str;
                break;
            case 2:
                tonePresetName_2 = str;
                break;
            case 3:
                tonePresetName_3 = str;
                break;
            case 4:
                tonePresetName_4 = str;
                break;
            case 5:
                tonePresetName_5 = str;
                break;
            default:
                tonePresetName = str;
                break;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessInstructionsVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Payload for fill-array not found at 0x1330
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.initJumps(ProcessInstructionsVisitor.java:112)
        	at jadx.core.dex.visitors.ProcessInstructionsVisitor.visit(ProcessInstructionsVisitor.java:41)
        */
    public static double[] getToneCurve(int r14) {
        /*
            Method dump skipped, instruction units count: 5428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.SDE.getToneCurve.getToneCurve(int):double[]");
    }
}
