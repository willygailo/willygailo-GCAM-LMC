package j$.time.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class Ser implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private Object object;
    private byte type;

    public Ser() {
    }

    Ser(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }

    private static Object readInternal(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                return AbstractChronology.readExternal(objectInput);
            case 2:
                return ChronoLocalDateTimeImpl.readExternal(objectInput);
            case 3:
                return ChronoZonedDateTimeImpl.readExternal(objectInput);
            case 4:
                return JapaneseDate.readExternal(objectInput);
            case 5:
                return JapaneseEra.readExternal(objectInput);
            case 6:
                return HijrahDate.readExternal(objectInput);
            case 7:
                return MinguoDate.readExternal(objectInput);
            case 8:
                return ThaiBuddhistDate.readExternal(objectInput);
            case 9:
                return ChronoPeriodImpl.readExternal(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.object;
    }

    private static void writeInternal(byte b, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((AbstractChronology) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((ChronoLocalDateTimeImpl) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((ChronoZonedDateTimeImpl) obj).writeExternal(objectOutput);
                return;
            case 4:
                ((JapaneseDate) obj).writeExternal(objectOutput);
                return;
            case 5:
                ((JapaneseEra) obj).writeExternal(objectOutput);
                return;
            case 6:
                ((HijrahDate) obj).writeExternal(objectOutput);
                return;
            case 7:
                ((MinguoDate) obj).writeExternal(objectOutput);
                return;
            case 8:
                ((ThaiBuddhistDate) obj).writeExternal(objectOutput);
                return;
            case 9:
                ((ChronoPeriodImpl) obj).writeExternal(objectOutput);
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
