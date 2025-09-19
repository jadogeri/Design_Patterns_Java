package structural.adapter;

public class PrinterAdapter implements ModernPrintable {

    public LegacyPrintable legacyPrintable ;

    public PrinterAdapter(LegacyPrintable legacyPrintable) {

        this.legacyPrintable = legacyPrintable;
    }


    @Override
    public void print(String content) {
        // Translate the new interface method call to the old interface method call
        legacyPrintable.printDocument(content);
    }

    @Override
    public void printPage(String pageContent) {
        // For simplicity, we can also just call the old method here.
        // In a real scenario, more complex logic might be needed to adapt.
        legacyPrintable.printDocument("Page: " + pageContent);
    }
}
