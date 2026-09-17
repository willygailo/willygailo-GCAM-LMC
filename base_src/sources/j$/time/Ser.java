package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class Ser implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private Object object;
    private byte type;

    public Ser() {
    }

    Ser(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }

    static Object read(ObjectInput objectInput) {
        return readInternal(objectInput.readByte(), objectInput);
    }

    private static Object readInternal(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                return Duration.readExternal(objectInput);
            case 2:
                return Instant.readExternal(objectInput);
            case 3:
                return LocalDate.readExternal(objectInput);
            case 4:
                return LocalTime.readExternal(objectInput);
            case 5:
                return LocalDateTime.readExternal(objectInput);
            case 6:
                return ZonedDateTime.readExternal(objectInput);
            case 7:
                return ZoneRegion.readExternal(objectInput);
            case 8:
                return ZoneOffset.readExternal(objectInput);
            case 9:
                return OffsetTime.readExternal(objectInput);
            case 10:
                return OffsetDateTime.readExternal(objectInput);
            case 11:
                return Year.readExternal(objectInput);
            case 12:
                return YearMonth.readExternal(objectInput);
            case 13:
                return MonthDay.readExternal(objectInput);
            case 14:
                return Period.readExternal(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.object;
    }

    static void writeInternal(byte b, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).writeExternal(objectOutput);
                return;
            case 4:
                ((LocalTime) obj).writeExternal(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).writeExternal(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).writeExternal(objectOutput);
                return;
            case 7:
                ((ZoneRegion) obj).writeExternal(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).writeExternal(objectOutput);
                return;
            case 9:
                ((OffsetTime) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((Year) obj).writeExternal(objectOutput);
                return;
            case 12:
                ((YearMonth) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((MonthDay) obj).writeExternal(objectOutput);
                return;
            case 14:
                ((Period) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte b = objectInput.readByte();
        this.type = b;
        this.object = readInternal(b, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        writeInternal(this.type, this.object, objectOutput);
    }
}
