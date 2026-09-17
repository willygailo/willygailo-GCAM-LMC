package com.google.android.libraries.barhopper;

/* JADX INFO: loaded from: classes.dex */
public class OnedRecognitionOptions {
    private int ean13UpcaMinConsistentLines = 1;
    private int ean8MinConsistentLines = 3;
    private int upceMinConsistentLines = 3;
    private int code128MinConsistentLines = 1;
    private int code39MinConsistentLines = 2;
    private int code93MinConsistentLines = 2;
    private int itfMinConsistentLines = 3;
    private int codabarMinConsistentLines = 2;
    private int code128MinCodeLength = 2;
    private int code39MinCodeLength = 2;
    private int code93MinCodeLength = 2;
    private int itfMinCodeLength = 6;
    private int codabarMinCodeLength = 6;
    private boolean code39UseCheckDigit = false;
    private boolean code39UseExtendedMode = false;

    public int getCodabarMinCodeLength() {
        return this.codabarMinCodeLength;
    }

    public int getCodabarMinConsistentLines() {
        return this.codabarMinConsistentLines;
    }

    public int getCode128MinCodeLength() {
        return this.code128MinCodeLength;
    }

    public int getCode128MinConsistentLines() {
        return this.code128MinConsistentLines;
    }

    public int getCode39MinCodeLength() {
        return this.code39MinCodeLength;
    }

    public int getCode39MinConsistentLines() {
        return this.code39MinConsistentLines;
    }

    public boolean getCode39UseCheckDigit() {
        return this.code39UseCheckDigit;
    }

    public boolean getCode39UseExtendedMode() {
        return this.code39UseExtendedMode;
    }

    public int getCode93MinCodeLength() {
        return this.code93MinCodeLength;
    }

    public int getCode93MinConsistentLines() {
        return this.code93MinConsistentLines;
    }

    public int getEan13UpcaMinConsistentLines() {
        return this.ean13UpcaMinConsistentLines;
    }

    public int getEan8MinConsistentLines() {
        return this.ean8MinConsistentLines;
    }

    public int getItfMinCodeLength() {
        return this.itfMinCodeLength;
    }

    public int getItfMinConsistentLines() {
        return this.itfMinConsistentLines;
    }

    public int getUpceMinConsistentLines() {
        return this.upceMinConsistentLines;
    }

    public OnedRecognitionOptions setCodabarMinCodeLength(int i) {
        this.codabarMinCodeLength = i;
        return this;
    }

    public OnedRecognitionOptions setCodabarMinConsistentLines(int i) {
        this.codabarMinConsistentLines = i;
        return this;
    }

    public OnedRecognitionOptions setCode128MinCodeLength(int i) {
        this.code128MinCodeLength = i;
        return this;
    }

    public OnedRecognitionOptions setCode128MinConsistentLines(int i) {
        this.code128MinConsistentLines = i;
        return this;
    }

    public OnedRecognitionOptions setCode39MinCodeLength(int i) {
        this.code39MinCodeLength = i;
        return this;
    }

    public OnedRecognitionOptions setCode39MinConsistentLines(int i) {
        this.code39MinConsistentLines = i;
        return this;
    }

    public OnedRecognitionOptions setCode39UseCheckDigit(boolean z) {
        this.code39UseCheckDigit = z;
        return this;
    }

    public OnedRecognitionOptions setCode39UseExtendedMode(boolean z) {
        this.code39UseExtendedMode = z;
        return this;
    }

    public OnedRecognitionOptions setCode93MinCodeLength(int i) {
        this.code93MinCodeLength = i;
        return this;
    }

    public OnedRecognitionOptions setCode93MinConsistentLines(int i) {
        this.code93MinConsistentLines = i;
        return this;
    }

    public OnedRecognitionOptions setEan13UpcaMinConsistentLines(int i) {
        this.ean13UpcaMinConsistentLines = i;
        return this;
    }

    public OnedRecognitionOptions setEan8MinConsistentLines(int i) {
        this.ean8MinConsistentLines = i;
        return this;
    }

    public OnedRecognitionOptions setItfMinCodeLength(int i) {
        this.itfMinCodeLength = i;
        return this;
    }

    public OnedRecognitionOptions setItfMinConsistentLines(int i) {
        this.itfMinConsistentLines = i;
        return this;
    }

    public OnedRecognitionOptions setUpceMinConsistentLines(int i) {
        this.upceMinConsistentLines = i;
        return this;
    }
}
