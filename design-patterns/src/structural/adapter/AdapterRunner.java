package structural.adapter;

public class AdapterRunner {

    public static void main(String[] args) {

        LegacyWriter legacyWriter = new LegacyWriter();
        WriterAdapter writerAdapter = new WriterAdapter(legacyWriter);
        writerAdapter.write();
    }
}
