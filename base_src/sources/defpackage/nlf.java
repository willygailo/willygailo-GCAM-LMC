package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum nlf implements ppg {
    UNKNOWN_TYPE(0),
    LANDMARK(1),
    PRODUCT_UPC(2),
    QR(3),
    RAW_BARCODE(4),
    ADDRESS(5),
    CALENDAR_ENTRY(6),
    CONTACT(7),
    EMAIL(8),
    PHONE(9),
    URL(10),
    FOREIGN_TEXT(11),
    FULL_RAW_TEXT(12),
    RAW_TEXT(13),
    IMAGE(14),
    PERSON_NAME(15),
    TEXT_BLOCK(16),
    UNSTRUCTURED_TEXT(17),
    TEST_TEXT_ORIENTATION(18),
    QR_WIFI(19),
    QR_TEXT(20),
    TEXT_WIFI(21),
    DOCUMENT_SCANNING(22),
    SCENE_CLASSIFICATION(23),
    LABELED_PRODUCT(24),
    SMS(25),
    TEXT_SELECTION(26),
    QR_GEO(27),
    APPAREL(28),
    EXTERNAL(29),
    TEXT_DETECTION_BOUNDING_BOX(30),
    RAW_OBJECT_DETECTION(31),
    PDP_SHOPPING(32),
    RAW_CLASSIFICATION(33);

    public final int I;

    nlf(int i) {
        this.I = i;
    }

    @Override // defpackage.ppg
    public final int a() {
        return this.I;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.I);
    }
}
