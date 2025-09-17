package structural.adapter;

public class WriterAdapter implements Writer {

    public LegacyWriter legacyWriter;

    public WriterAdapter(LegacyWriter legacyWriter) {
        this.legacyWriter = legacyWriter;
    }

    @Override
    public void write() {
        this.legacyWriter.writeDocument();
    }
}
